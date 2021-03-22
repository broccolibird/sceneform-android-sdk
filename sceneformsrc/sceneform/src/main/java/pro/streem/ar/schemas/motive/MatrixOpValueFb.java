// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.motive;

public final class MatrixOpValueFb
{
    public static final byte NONE = 0;
    public static final byte CompactSplineFb = 1;
    public static final byte ConstantOpFb = 2;
    public static final byte CompactSplineFloatFb = 3;
    public static final String[] names;
    
    private MatrixOpValueFb() {
    }
    
    public static String name(final int e) {
        return MatrixOpValueFb.names[e];
    }
    
    static {
        names = new String[] { "NONE", "CompactSplineFb", "ConstantOpFb", "CompactSplineFloatFb" };
    }
}
