package cg;

import javafx.geometry.Point3D;

public class vertice {
	String nomeVertice;
	Point3D ponto;
	aresta arestaVertice;

    public vertice(String nomeVertice, double x, double y, double z, aresta arestaVertice) {
        this.nomeVertice = nomeVertice;
        this.ponto = new Point3D(x,y,z);
        
        this.arestaVertice = arestaVertice;
    }

    public String getNomeVertice() {
        return nomeVertice;
    }

    public void setNomeVertice(String nomeVertice) {
        this.nomeVertice = nomeVertice;
    }

    public double getX() {
        return ponto.getX();
    }

    public void setX(double x) {
        this.ponto.add(x,ponto.getY(),ponto.getZ());
    }

    public double getY() {
        return this.ponto.getY();
    }

    public void setY(double y) {
        this.ponto.add(this.ponto.getX(),y,ponto.getZ());
    }

    public double getZ() {
        return this.ponto.getZ();
    }

    public void setZ(double z) {
        this.ponto.add(this.ponto.getX(),ponto.getY(),z);
    }

    public aresta getArestaVertice() {
        return arestaVertice;
    }

    public void setArestaVertice(aresta arestaVertice) {
        this.arestaVertice = arestaVertice;
    }
}
