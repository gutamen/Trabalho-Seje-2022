package cg;

import estrutura.aresta;

public class face {
    String nomeFace;
    aresta arestaFace;

    public face(String nomeFace, aresta arestaFace) {
        this.nomeFace = nomeFace;
        this.arestaFace = arestaFace;
    }

    public String getNomeFace() {
        return nomeFace;
    }

    public void setNomeFace(String nomeFace) {
        this.nomeFace = nomeFace;
    }

    public aresta getArestaFace() {
        return arestaFace;
    }

    public void setArestaFace(aresta arestaFace) {
        this.arestaFace = arestaFace;
    }
}
