package base;


import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.geometry.Sphere;
import com.sun.j3d.utils.universe.SimpleUniverse;
import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.DirectionalLight;
import javax.media.j3d.GeometryStripArray;
import javax.media.j3d.LineArray;
import javax.media.j3d.LineStripArray;
import javax.media.j3d.Material;
import javax.media.j3d.PolygonAttributes;
import javax.media.j3d.QuadArray;
import javax.media.j3d.RenderingAttributes;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TransformGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3f;

public final class Graf3D extends JPanel {
    public Graf3D() {
        setLayout(new BorderLayout());
        GraphicsConfiguration gc=SimpleUniverse.getPreferredConfiguration();
        Canvas3D canvas3D = new Canvas3D(gc);
        add("Center", canvas3D);

        BranchGroup scene = createSceneGraph();
        scene.compile();

        // SimpleUniverse is a Convenience Utility class
        SimpleUniverse simpleU = new SimpleUniverse(canvas3D);


        // This moves the ViewPlatform back a bit so the
        // objects in the scene can be viewed.
        simpleU.getViewingPlatform().setNominalViewingTransform();

        simpleU.addBranchGraph(scene);
    }
    public BranchGroup createSceneGraph() {
        int tam = 96;
        letra_A3D lA = new letra_A3D();
        BranchGroup lineGroup = new BranchGroup();
        Appearance app = new Appearance();
        int[] vet = new int[tam];
        for(int i=0;i<tam;i++){
            vet[i] = 2;
        }
        LineStripArray lsa = new LineStripArray(tam*2, LineStripArray.COORDINATES|LineStripArray.NORMALS, vet);
        Vector3f [] normals=new Vector3f[tam];
        for(int i=0;i<tam;i++)normals[i]=new Vector3f();
        Point3f [] pts=new Point3f[tam];
        for(int i=0;i<tam;i++)pts[i]=new Point3f();
        Color3f [] clrs=new Color3f[tam];
        for(int i=0;i<tam;i++)clrs[i]=new Color3f(0.5f,0.5f,0.5f);
        //cube=6 quads 
        //first quad
        pts[0].x=lA.vA_A.getX();pts[0].y=lA.vA_A.getY();pts[0].z=lA.vA_A.getZ();
        pts[1].x=lA.vA_B.getX();pts[1].y=lA.vA_B.getY();pts[1].z=lA.vA_B.getZ();
        pts[2]=pts[1];
        pts[3].x=lA.vA_L.getX();pts[3].y=lA.vA_L.getY();pts[3].z=lA.vA_L.getZ();
        pts[4]=pts[3];
        pts[5].x=lA.vA_K.getX();pts[5].y=lA.vA_K.getY();pts[5].z=lA.vA_K.getZ();
        pts[6]=pts[5];
        pts[7].x=lA.vA_H.getX();pts[7].y=lA.vA_H.getY();pts[7].z=lA.vA_H.getZ();
        pts[8]=pts[7];
        pts[9].x=lA.vA_G.getX();pts[9].y=lA.vA_G.getY();pts[9].z=lA.vA_G.getZ();
        pts[10]=pts[9];
        pts[11].x=lA.vA_J.getX();pts[11].y=lA.vA_J.getY();pts[11].z=lA.vA_J.getZ();
        pts[12]=pts[11];
        pts[13].x=lA.vA_I.getX();pts[13].y=lA.vA_I.getY();pts[13].z=lA.vA_I.getZ();
        pts[14]=pts[13];
      
        pts[15]=pts[0];
        pts[16].x=lA.vA_C.getX();pts[16].y=lA.vA_C.getY();pts[16].z=lA.vA_C.getZ();
        pts[17].x=lA.vA_E.getX();pts[17].y=lA.vA_E.getY();pts[17].z=lA.vA_E.getZ();
        pts[18]=pts[17];
        pts[19].x=lA.vA_F.getX();pts[19].y=lA.vA_F.getY();pts[19].z=lA.vA_F.getZ();
        pts[20]=pts[19];
        pts[21].x=lA.vA_D.getX();pts[21].y=lA.vA_D.getY();pts[21].z=lA.vA_D.getZ();
        pts[22]=pts[21];
        pts[23]=pts[16];
        //AKI
        pts[24].x=lA.vA_A3D.getX();pts[24].y=lA.vA_A3D.getY();pts[24].z=lA.vA_A3D.getZ();
        pts[25].x=lA.vA_B3D.getX();pts[25].y=lA.vA_B3D.getY();pts[25].z=lA.vA_B3D.getZ();
        pts[26]=pts[25];
        pts[27].x=lA.vA_L3D.getX();pts[27].y=lA.vA_L3D.getY();pts[27].z=lA.vA_L3D.getZ();
        pts[28]=pts[27];
        pts[29].x=lA.vA_K3D.getX();pts[29].y=lA.vA_K3D.getY();pts[29].z=lA.vA_K3D.getZ();
        pts[30]=pts[29];
        pts[31].x=lA.vA_H3D.getX();pts[31].y=lA.vA_H3D.getY();pts[31].z=lA.vA_H3D.getZ();
        pts[32]=pts[31];
        pts[33].x=lA.vA_G3D.getX();pts[33].y=lA.vA_G3D.getY();pts[33].z=lA.vA_G3D.getZ();
        pts[34]=pts[33];
        pts[35].x=lA.vA_J3D.getX();pts[35].y=lA.vA_J3D.getY();pts[35].z=lA.vA_J3D.getZ();
        pts[36]=pts[35];
        pts[37].x=lA.vA_I3D.getX();pts[37].y=lA.vA_I3D.getY();pts[37].z=lA.vA_I3D.getZ();
        pts[38]=pts[37];  
        pts[39]=pts[24];
        
        pts[40].x=lA.vA_C3D.getX();pts[40].y=lA.vA_C3D.getY();pts[40].z=lA.vA_C3D.getZ();
        pts[41].x=lA.vA_E3D.getX();pts[41].y=lA.vA_E3D.getY();pts[41].z=lA.vA_E3D.getZ();
        pts[42]=pts[41];
        pts[43].x=lA.vA_F3D.getX();pts[43].y=lA.vA_F3D.getY();pts[43].z=lA.vA_F3D.getZ();
        pts[44]=pts[43];
        pts[45].x=lA.vA_D3D.getX();pts[45].y=lA.vA_D3D.getY();pts[45].z=lA.vA_D3D.getZ();
        pts[46]=pts[45];
        pts[47]=pts[40];
        
        pts[48]=pts[0];
        pts[49]=pts[24];
        pts[50]=pts[1];
        pts[51]=pts[25];
        pts[52]=pts[2];
        pts[53]=pts[26];
        pts[54]=pts[3];
        pts[55]=pts[27];
        pts[56]=pts[4];
        pts[57]=pts[28];
        pts[58]=pts[5];
        pts[59]=pts[29];
        pts[60]=pts[6];
        pts[61]=pts[30];
        pts[62]=pts[7];
        pts[63]=pts[31];
        pts[64]=pts[8];
        pts[65]=pts[32];
        pts[66]=pts[9];
        pts[67]=pts[33];
        pts[68]=pts[10];
        pts[69]=pts[34];
        pts[70]=pts[11];
        pts[71]=pts[35];
        pts[72]=pts[12];
        pts[73]=pts[36];
        pts[74]=pts[13];
        pts[75]=pts[37];
        pts[76]=pts[14];
        pts[77]=pts[38];
        pts[78]=pts[15];
        pts[79]=pts[39];
        pts[80]=pts[16];
        pts[81]=pts[40];
        pts[82]=pts[17];
        pts[83]=pts[41];
        pts[84]=pts[18];
        pts[85]=pts[42];
        pts[86]=pts[19];
        pts[87]=pts[43];
        pts[88]=pts[20];
        pts[89]=pts[44];
        pts[90]=pts[21];
        pts[91]=pts[45];
        pts[92]=pts[22];
        pts[93]=pts[46];
        pts[94]=pts[23];
        pts[95]=pts[47];
        float j = 2, k = 0;
        for(int i=0;i<tam;i++){
            if(j%2 == 0){
                if(k == 2)j++;
                normals[i].x=-1;
                k+=2;
            }else{
                normals[i].x=1;
                j+=0.5;
                k=0;
            }
        }
        
        for(int i=0;i<tam;i++)System.out.println(normals[i]);
        System.out.println(lsa.getVertexFormat());
        
        lsa.setNormals(0, normals);
        lsa.setCoordinates(0, pts);
        Shape3D sh=new Shape3D();
        PolygonAttributes pa=new PolygonAttributes();
        pa.setPolygonMode(PolygonAttributes.POLYGON_FILL);
        pa.setCullFace(PolygonAttributes.CULL_NONE);
        Material mat=new Material();
        mat.setEmissiveColor(new Color3f(0.5f,0.5f,0.5f));
        mat.setAmbientColor(new Color3f(0.1f,0.1f,0.1f));
        mat.setDiffuseColor(new Color3f(0.2f,0.3f,0.4f));
        mat.setSpecularColor(new Color3f(0.6f,0.3f,0.2f));
        mat.setLightingEnable(true);
        RenderingAttributes ra=new RenderingAttributes();
        ra.setIgnoreVertexColors(true);
        ColoringAttributes ca=new ColoringAttributes();
        ca.setShadeModel(ColoringAttributes.SHADE_GOURAUD);
        ca.setColor(new Color3f(1f,0f,0f));
        app.setColoringAttributes(ca);
        app.setRenderingAttributes(ra);   
        app.setMaterial(mat);
        app.setPolygonAttributes(pa);
        sh.setGeometry(lsa);
        sh.setAppearance(app);
        sh.setPickable(true); 
        TransformGroup objRotate = new TransformGroup();
        objRotate.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        objRotate.addChild(sh);

        DirectionalLight light1=new DirectionalLight();
        light1.setInfluencingBounds(new BoundingSphere(new Point3d(-5.0,0,0),10.0));
        light1.setColor(new Color3f(1f,1f,1f));
        light1.setDirection(new Vector3f(0,1,0));
        objRotate.addChild(light1);
        DirectionalLight light2=new DirectionalLight();
        light2.setInfluencingBounds(new BoundingSphere(new Point3d(5.0,0,0),10.0));
        light2.setColor(new Color3f(0.5f,1f,0.5f));
        light2.setDirection(new Vector3f(0,-1,0));
        objRotate.addChild(light2);
        MouseRotate f1=new MouseRotate();
        f1.setSchedulingBounds(new BoundingSphere());
        f1.setTransformGroup(objRotate);
        lineGroup.addChild(f1);
        //objRotate.addChild(new Sphere(0.60f,1,128));
        lineGroup.addChild(objRotate);
        return lineGroup;
    }
    
    public void run(){
        createSceneGraph();
        JFrame frame = new JFrame();
        frame.add(new JScrollPane(new Graf3D()));
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}