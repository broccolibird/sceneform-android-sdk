// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

public final class SamplerUsageType
{
    public static final short Color = 0;
    public static final short Normal = 1;
    public static final short Data = 2;
    public static final short Lookup = 3;
    public static final String[] names;
    
    private SamplerUsageType() {
    }
    
    public static String name(final int e) {
        return SamplerUsageType.names[e];
    }
    
    static {
        names = new String[] { "Color", "Normal", "Data", "Lookup" };
    }
}
