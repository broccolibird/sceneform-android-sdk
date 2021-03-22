// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

public final class LayoutHorizontalAlignment
{
    public static final int Left = 0;
    public static final int Center = 1;
    public static final int Right = 2;
    public static final String[] names;
    
    private LayoutHorizontalAlignment() {
    }
    
    public static String name(final int e) {
        return LayoutHorizontalAlignment.names[e];
    }
    
    static {
        names = new String[] { "Left", "Center", "Right" };
    }
}
