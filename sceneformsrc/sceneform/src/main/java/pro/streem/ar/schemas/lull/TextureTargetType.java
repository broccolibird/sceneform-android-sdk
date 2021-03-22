// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

public final class TextureTargetType
{
    public static final short Standard2d = 0;
    public static final short CubeMap = 1;
    public static final String[] names;
    
    private TextureTargetType() {
    }
    
    public static String name(final int e) {
        return TextureTargetType.names[e];
    }
    
    static {
        names = new String[] { "Standard2d", "CubeMap" };
    }
}
