// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

public final class LayoutVerticalAlignment
{
    public static final int Top = 0;
    public static final int Center = 1;
    public static final int Bottom = 2;
    public static final String[] names;
    
    private LayoutVerticalAlignment() {
    }
    
    public static String name(final int e) {
        return LayoutVerticalAlignment.names[e];
    }
    
    static {
        names = new String[] { "Top", "Center", "Bottom" };
    }
}
