// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

public final class RenderFlags
{
    public static final byte DoNotCastShadows = 1;
    public static final byte DoNotReceiveShadows = 2;
    public static final byte DisableFrustumCulling = 4;
    public static final String[] names;
    
    private RenderFlags() {
    }
    
    public static String name(final int e) {
        return RenderFlags.names[e - 1];
    }
    
    static {
        names = new String[] { "DoNotCastShadows", "DoNotReceiveShadows", "", "DisableFrustumCulling" };
    }
}
