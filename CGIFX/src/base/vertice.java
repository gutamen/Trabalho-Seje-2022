package base;
public class vertice {
	String nomeVertice;
	double x,y,z;
	aresta arestaVertice;

    public vertice(String nomeVertice, double x, double y, double z, aresta arestaVertice) {
        this.nomeVertice = nomeVertice;
        this.x = x;
        this.y = y;
        this.z = z;
        this.arestaVertice = arestaVertice;
    }

    public String getNomeVertice() {
        return nomeVertice;
    }

    public void setNomeVertice(String nomeVertice) {
        this.nomeVertice = nomeVertice;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public aresta getArestaVertice() {
        return arestaVertice;
    }

    public void setArestaVertice(aresta arestaVertice) {
        this.arestaVertice = arestaVertice;
    }
}
