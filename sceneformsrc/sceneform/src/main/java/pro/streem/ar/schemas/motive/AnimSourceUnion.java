// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.motive;

public final class AnimSourceUnion
{
    public static final byte NONE = 0;
    public static final byte AnimSourceFileName = 1;
    public static final byte AnimSourceEmbedded = 2;
    public static final String[] names;
    
    private AnimSourceUnion() {
    }
    
    public static String name(final int e) {
        return AnimSourceUnion.names[e];
    }
    
    static {
        names = new String[] { "NONE", "AnimSourceFileName", "AnimSourceEmbedded" };
    }
}
