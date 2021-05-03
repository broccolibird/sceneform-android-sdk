// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

public final class SamplerMagFilter
{
    public static final short Nearest = 0;
    public static final short Linear = 1;
    public static final String[] names;
    
    private SamplerMagFilter() {
    }
    
    public static String name(final int e) {
        return SamplerMagFilter.names[e];
    }
    
    static {
        names = new String[] { "Nearest", "Linear" };
    }
}
