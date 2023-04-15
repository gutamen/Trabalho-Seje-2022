package estrutura;

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
        this.ponto = this.ponto.add(x - this.ponto.getX(),0,0);
    }

    public double getY() {
        return this.ponto.getY();
    }

    public void setY(double y) {
        this.ponto = this.ponto.add(0,y - this.ponto.getY(),0);
    }

    public double getZ() {
        return this.ponto.getZ();
    }

    public void setZ(double z) {
        this.ponto = this.ponto.add(0,0,z - this.ponto.getZ());
    }

    public aresta getArestaVertice() {
        return arestaVertice;
    }

    public void setArestaVertice(aresta arestaVertice) {
        this.arestaVertice = arestaVertice;
    }
    
    public void setVertice(double x, double y, double z){
        this.ponto = new Point3D(x, y, z);
    }
}
