// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

public final class LightingCubeFaceType
{
    public static final int nx = 0;
    public static final int ny = 1;
    public static final int nz = 2;
    public static final int px = 3;
    public static final int py = 4;
    public static final int pz = 5;
    public static final String[] names;
    
    private LightingCubeFaceType() {
    }
    
    public static String name(final int e) {
        return LightingCubeFaceType.names[e];
    }
    
    static {
        names = new String[] { "nx", "ny", "nz", "px", "py", "pz" };
    }
}
