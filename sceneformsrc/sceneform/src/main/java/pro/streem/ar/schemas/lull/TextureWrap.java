// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

public final class TextureWrap
{
    public static final short ClampToBorder = 0;
    public static final short ClampToEdge = 1;
    public static final short MirroredRepeat = 2;
    public static final short MirrorClampToEdge = 3;
    public static final short Repeat = 4;
    public static final String[] names;
    
    private TextureWrap() {
    }
    
    public static String name(final int e) {
        return TextureWrap.names[e];
    }
    
    static {
        names = new String[] { "ClampToBorder", "ClampToEdge", "MirroredRepeat", "MirrorClampToEdge", "Repeat" };
    }
}
