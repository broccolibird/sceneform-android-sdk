// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

public final class SamplerCompareMode
{
    public static final short None = 0;
    public static final short CompareToTexture = 1;
    public static final String[] names;
    
    private SamplerCompareMode() {
    }
    
    public static String name(final int e) {
        return SamplerCompareMode.names[e];
    }
    
    static {
        names = new String[] { "None", "CompareToTexture" };
    }
}
