// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

public final class SamplerMinFilter
{
    public static final short Nearest = 0;
    public static final short Linear = 1;
    public static final short NearestMipmapNearest = 2;
    public static final short LinearMipmapNearest = 3;
    public static final short NearestMipmapLinear = 4;
    public static final short LinearMipmapLinear = 5;
    public static final String[] names;
    
    private SamplerMinFilter() {
    }
    
    public static String name(final int e) {
        return SamplerMinFilter.names[e];
    }
    
    static {
        names = new String[] { "Nearest", "Linear", "NearestMipmapNearest", "LinearMipmapNearest", "NearestMipmapLinear", "LinearMipmapLinear" };
    }
}
