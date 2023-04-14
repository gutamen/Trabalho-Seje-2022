/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javafx.geometry.Point3D;

/**
 *
 * @author macedo
 */
public class ctrlCam {
    public Point3D P;
    public Point3D Y;
    public Point3D VRP;
    public Point3D Nzao;
    public Point3D nzin;
    public Point3D Vzao;
    public Point3D vzin;
    public Point3D uzin;
    public double[][] MProj;
    public double[][] MJp;
    public double[][] VRP_SRC;
    public double[][] VP_SRC;
    public double[][] VRP_PP;
    public double[][] VP_PP;
    public double[][] M_SRU2SRC;
    public double[][] R;
    public double[][] T;
    public double[][] Pipeline_SRU2SRT;
    public double INI;
    public double YN;
    public double IVI;
    public double Dp;
    public Point4P Viewport;
    public Point4P Window;

    public Point4P getViewport() {
        return Viewport;
    }

    public void setViewport(double x, double y, double z, double k) {
        this.Viewport = new Point4P(x, y, z, k);
    }

    public Point4P getWindow() {
        return Window;
    }

    public void setWindow(double x, double y, double z, double k) {
        this.Window = new Point4P(x, y, z, k);
    }
    
    public double getDp() {
        return Dp;
    }

    public void setDp(double Dp) {
        this.Dp = Dp;
    }
    
    public Point3D getP() {
        return P;
    }
    
    public void setP(double x, double y, double z) {
        this.P = new Point3D(x, y, z);
    }

    public Point3D getYc() {
        return Y;
    }

    public void setYc(double x, double y, double z) {
        this.Y = new Point3D(x, y, z);
    }

    public Point3D getVRP() {
        return VRP;
    }

    public void setVRP(double x, double y, double z) {
        this.VRP = new Point3D(x, y, z);
    }

    public Point3D getNzao() {
        return Nzao = new Point3D(getVRP().getX()-getP().getX(), getVRP().getY()-getP().getY(), getVRP().getZ()-getP().getZ());
    }

    public Point3D getNzin() {
        return nzin = new Point3D(getNzao().getX()/getINI(), getNzao().getY()/getINI(), getNzao().getZ()/getINI());
    }

    public double getINI() {
        return INI = Math.sqrt(Math.pow(getNzao().getX(), 2)+Math.pow(getNzao().getY(), 2)+Math.pow(getNzao().getZ(), 2));
    }

    public double getYN() {
        return YN = (getYc().getX()*getNzin().getX())+(getYc().getY()*getNzin().getY())+(getYc().getZ()*getNzin().getZ());
    }
    
    //Y-(Y, n). n-Y
    public Point3D getVzao() {
        return Vzao = new Point3D(getYc().getX()-getNzin().getX()*getYN(),
                                  getYc().getY()-getNzin().getY()*getYN(),
                                  getYc().getZ()-getNzin().getZ()*getYN());
    }

    public double getIVI(){
        return IVI = Math.sqrt(Math.pow(getVzao().getX(), 2)+Math.pow(getVzao().getY(), 2)+Math.pow(getVzao().getZ(), 2));
    }
    
    public Point3D getVzin() {
        return vzin = new Point3D(getVzao().getX()/getIVI(), getVzao().getY()/getIVI(), getVzao().getZ()/getIVI());
    }

    public Point3D getUzin(){
        return uzin = new Point3D(getVzin().getY()*getNzin().getZ()-getNzin().getY()*getVzin().getZ(),
                                  getVzin().getZ()*getNzin().getX()-getVzin().getX()*getNzin().getZ(),
                                  getVzin().getX()*getNzin().getY()-getNzin().getX()*getVzin().getY());
    }

    public double[][] getR() {
        return R = new double[][]{{getUzin().getX(), getUzin().getY(), getUzin().getZ(), 0},
                                  {getVzin().getX(), getVzin().getY(), getVzin().getZ(), 0},
                                  {getNzin().getX(), getNzin().getY(), getNzin().getZ(), 0},
                                  {0, 0, 0, 1}};
    }
    
    public double[][] getT() {
        return T = new double[][]{{1, 0, 0, -getVRP().getX()},
                                  {0, 1, 0, -getVRP().getY()},
                                  {0, 0, 1, -getVRP().getZ()},
                                  {0, 0, 0, 1}};
    }

    public double[][] getM_SRU2SRC() {
        return M_SRU2SRC = mulM1M2(getR(), getT());
    }

    public double[][] getVRP_PP() {
        return VRP_PP = new double[][]{{getVRP().getX()},
                                       {getVRP().getY()},
                                       {getVRP().getZ()},
                                       {1}};
    }

    public double[][] getVP_PP() {
        return VP_PP = new double[][]{{getVRP().getX()+getDp()*(-getNzin().getX())},
                                   {getVRP().getY()+getDp()*(-getNzin().getY())},
                                   {getVRP().getZ()+getDp()*(-getNzin().getZ())},
                                   {1}};
    }

    public double[][] getVRP_SRC() {
        return VRP_SRC = mulM1M2(getM_SRU2SRC(), getVRP_PP());
    }

    public double[][] getVP_SRC() {
        return VP_SRC = mulM1M2(getM_SRU2SRC(), getVP_PP());
    }

    public double[][] getMProj() {
        return MProj = new double[][]{{1, 0, 0, 0},
                                      {0, 1, 0, 0},
                                      {0, 0, -getVP_SRC()[2][0]/getDp(), 0},
                                      {0, 0, -1/getDp(), getVRP_SRC()[2][0]/getDp(), 0}};
    }

    public double[][] getMJp() {
        System.out.println((getViewport().getZ()-getViewport().getX())/(getWindow().getZ()-getWindow().getX()));
        return MJp = new double[][]{
            {(getViewport().getZ()-getViewport().getX())/(getWindow().getZ()-getWindow().getX()), 
                0, 0, getWindow().getX()*((getViewport().getZ()-getViewport().getX())/(getWindow().getZ()-getWindow().getX()))+getViewport().getX()},
            {0, (getViewport().getY()-getViewport().getK())/(getWindow().getK()-getWindow().getY()),
                0, getWindow().getX()*((getViewport().getK()-getViewport().getY())/(getWindow().getK()-getWindow().getY()))+getViewport().getX()},
            {0, 0, 1, 0},
            {0, 0, 0, 1}};
    }

    public double[][] getPipeline_SRU2SRT() {
        return Pipeline_SRU2SRT = mulM1M2(getMJp(), mulM1M2(getMProj(), getM_SRU2SRC()));
    }
    
    public static double[][] mulM1M2(double[][] matriz, double[][] matriz1){
        double[][] matrizR = new double[matriz.length][matriz1[0].length];
        for(int i = 0; i < matriz.length; i++){
            for(int k = 0; k < matriz1[0].length; k++){
                for(int l = 0; l < matriz1.length; l++){
                    matrizR[i][k] += (matriz[i][l])*(matriz1[l][k]);
                }
            }
        }
        return matrizR;
    }
}
