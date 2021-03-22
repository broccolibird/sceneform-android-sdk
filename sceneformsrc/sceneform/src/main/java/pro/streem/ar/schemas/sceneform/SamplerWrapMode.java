// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

public final class SamplerWrapMode
{
    public static final short ClampToEdge = 0;
    public static final short Repeat = 1;
    public static final short MirroredRepeat = 2;
    public static final String[] names;
    
    private SamplerWrapMode() {
    }
    
    public static String name(final int e) {
        return SamplerWrapMode.names[e];
    }
    
    static {
        names = new String[] { "ClampToEdge", "Repeat", "MirroredRepeat" };
    }
}
