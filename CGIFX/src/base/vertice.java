package base;
public class vertice {
	String nomeVertice;
	float x,y,z;
	aresta arestaVertice;

    public vertice(String nomeVertice, float x, float y, float z, aresta arestaVertice) {
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

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public aresta getArestaVertice() {
        return arestaVertice;
    }

    public void setArestaVertice(aresta arestaVertice) {
        this.arestaVertice = arestaVertice;
    }
}
