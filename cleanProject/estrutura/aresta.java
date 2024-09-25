package estrutura;


public class aresta {
    String nomeAresta;
    vertice inicio, fim;
    face direita, esquerda;
    aresta arestaEsquerdaPred;
    aresta arestaDireitaPred;
    aresta arestaEsquerdaSuc;
    aresta arestaDireitaSuc;

    public aresta(String nomeAresta, vertice inicio, vertice fim, face direita, face esquerda, aresta arestaEsquerdaPred, aresta arestaDireitaPred, aresta arestaEsquerdaSuc, aresta arestaDireitaSuc) {
        this.nomeAresta = nomeAresta;
        this.inicio = inicio;
        this.fim = fim;
        this.direita = direita;
        this.esquerda = esquerda;
        this.arestaEsquerdaPred = arestaEsquerdaPred;
        this.arestaDireitaPred = arestaDireitaPred;
        this.arestaEsquerdaSuc = arestaEsquerdaSuc;
        this.arestaDireitaSuc = arestaDireitaSuc;
    }
    
    public aresta(String nomeAresta) {
        this.nomeAresta = nomeAresta;
    }

    public String getNomeAresta() {
        return nomeAresta;
    }

    public void setNomeAresta(String nomeAresta) {
        this.nomeAresta = nomeAresta;
    }

    public vertice getInicio() {
        return inicio;
    }

    public void setInicio(vertice inicio) {
        this.inicio = inicio;
    }

    public vertice getFim() {
        return fim;
    }

    public void setFim(vertice fim) {
        this.fim = fim;
    }

    public face getDireita() {
        return direita;
    }

    public void setDireita(face direita) {
        this.direita = direita;
    }

    public face getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(face esquerda) {
        this.esquerda = esquerda;
    }
    
    public void setFaces(face esquerda, face direita){
        this.direita = direita;
        this.esquerda = esquerda;
    }
    
    public void setFacesInvertido(face direita, face esquerda){
        this.direita = direita;
        this.esquerda = esquerda;
    }
    
    public void setArestasDireita(aresta pred, aresta suc){
        this.arestaDireitaPred = pred;
        this.arestaDireitaSuc = suc;
    }
    
    public void setArestasEsquerda(aresta pred, aresta suc){
        this.arestaEsquerdaPred = pred;
        this.arestaEsquerdaSuc = suc;
    }

    public aresta getArestaEsquerdaPred() {
        return arestaEsquerdaPred;
    }

    public void setArestaEsquerdaPred(aresta arestaEsquerdaPred) {
        this.arestaEsquerdaPred = arestaEsquerdaPred;
    }

    public aresta getArestaDireitaPred() {
        return arestaDireitaPred;
    }

    public void setArestaDireitaPred(aresta arestaDireitaPred) {
        this.arestaDireitaPred = arestaDireitaPred;
    }

    public aresta getArestaEsquerdaSuc() {
        return arestaEsquerdaSuc;
    }

    public void setArestaEsquerdaSuc(aresta arestaEsquerdaSuc) {
        this.arestaEsquerdaSuc = arestaEsquerdaSuc;
    }

    public aresta getArestaDireitaSuc() {
        return arestaDireitaSuc;
    }

    public void setArestaDireitaSuc(aresta arestaDireitaSuc) {
        this.arestaDireitaSuc = arestaDireitaSuc;
    }
}
