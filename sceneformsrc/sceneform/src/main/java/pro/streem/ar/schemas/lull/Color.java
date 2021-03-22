// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Struct;

public final class Color extends Struct
{
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
    }
    
    public Color __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public float r() {
        return this.bb.getFloat(this.bb_pos + 0);
    }
    
    public float g() {
        return this.bb.getFloat(this.bb_pos + 4);
    }
    
    public float b() {
        return this.bb.getFloat(this.bb_pos + 8);
    }
    
    public float a() {
        return this.bb.getFloat(this.bb_pos + 12);
    }
    
    public static int createColor(final FlatBufferBuilder builder, final float r, final float g, final float b, final float a) {
        builder.prep(4, 16);
        builder.putFloat(a);
        builder.putFloat(b);
        builder.putFloat(g);
        builder.putFloat(r);
        return builder.offset();
    }
}
