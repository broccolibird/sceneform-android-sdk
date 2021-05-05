// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

public final class OptionalBool
{
    public static final int Unset = 0;
    public static final int True = 1;
    public static final int False = 2;
    public static final String[] names;
    
    private OptionalBool() {
    }
    
    public static String name(final int e) {
        return OptionalBool.names[e];
    }
    
    static {
        names = new String[] { "Unset", "True", "False" };
    }
}
