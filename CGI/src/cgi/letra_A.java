package cgi;

public class letra_A {
    face fA = new face("A", null);

    vertice vA_A = new vertice("A", -0.5f, 2f, 0f, null);
    vertice vA_B = new vertice("B", 0.5f, 2f, 0f, null);
    vertice vA_C = new vertice("C", -0.25f, 1.5f, 0f, null);
    vertice vA_D = new vertice("D", 0.25f, 1.5f, 0f, null);
    vertice vA_E = new vertice("E", -0.75f, 0f, 0f, null);
    vertice vA_F = new vertice("F", 0.75f, 0f, 0f, null);
    vertice vA_G = new vertice("G", -0.9375f, -0.5f, 0f, null);
    vertice vA_H = new vertice("H", 0.9375f, -0.5f, 0f, null);
    vertice vA_I = new vertice("I", -2f, -2f, 0f, null);
    vertice vA_J = new vertice("J", -1.5f, -2f, 0f, null);
    vertice vA_K = new vertice("K", 1.5f, -2.0f, 0f, null);
    vertice vA_L = new vertice("L", 2f, -2f, 0f, null);

    aresta A_B = new aresta("A_B", vA_A, vA_B, fA, null, null, null, null, null);
    aresta B_L = new aresta("B_L", vA_B, vA_L, fA, null, null, A_B, null, null);
    aresta L_K = new aresta("L_K", vA_L, vA_K, fA, null, null, B_L, null, null);
    aresta K_H = new aresta("K_H", vA_K, vA_H, fA, null, null, L_K, null, null);
    aresta H_G = new aresta("H_G", vA_H, vA_G, fA, null, null, K_H, null, null);
    aresta G_J = new aresta("H_J", vA_H, vA_J, fA, null, null, H_G, null, null);
    aresta J_I = new aresta("J_I", vA_J, vA_I, fA, null, null, G_J, null, null);
    aresta I_A = new aresta("I_A", vA_I, vA_A, fA, null, null, J_I, null, A_B);

    aresta C_E = new aresta("C_E", vA_C, vA_E, fA, null, null, null, null, null);      
    aresta E_F = new aresta("E_F", vA_E, vA_F, fA, null, null, C_E, null, null);
    aresta F_D = new aresta("F_D", vA_F, vA_D, fA, null, null, E_F, null, null);
    aresta D_C = new aresta("D_C", vA_D, vA_C, fA, null, null, F_D, null, C_E);
    
    public letra_A(){
        A_B.setArestaDireitaPred(I_A);
        A_B.setArestaDireitaSuc(B_L);
        B_L.setArestaDireitaSuc(L_K);
        L_K.setArestaDireitaSuc(K_H);
        K_H.setArestaDireitaSuc(H_G);
        H_G.setArestaDireitaSuc(G_J);
        J_I.setArestaDireitaSuc(I_A);

        C_E.setArestaDireitaPred(D_C);
        C_E.setArestaDireitaSuc(E_F);
        E_F.setArestaDireitaSuc(F_D);
        F_D.setArestaDireitaSuc(D_C);
        
        vA_A.setArestaVertice(A_B);
        vA_B.setArestaVertice(B_L);
        vA_C.setArestaVertice(C_E);
        vA_D.setArestaVertice(D_C);
        vA_E.setArestaVertice(E_F);
        vA_F.setArestaVertice(F_D);
        vA_G.setArestaVertice(G_J);
        vA_H.setArestaVertice(H_G);
        vA_I.setArestaVertice(I_A);
        vA_J.setArestaVertice(J_I);
        vA_K.setArestaVertice(K_H);
        vA_L.setArestaVertice(L_K);
        
        fA.setArestaFace(A_B);
    }
    
}


