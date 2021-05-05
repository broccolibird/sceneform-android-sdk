// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Struct;

public final class Vec4 extends Struct
{
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
    }
    
    public Vec4 __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public float x() {
        return this.bb.getFloat(this.bb_pos + 0);
    }
    
    public float y() {
        return this.bb.getFloat(this.bb_pos + 4);
    }
    
    public float z() {
        return this.bb.getFloat(this.bb_pos + 8);
    }
    
    public float w() {
        return this.bb.getFloat(this.bb_pos + 12);
    }
    
    public static int createVec4(final FlatBufferBuilder builder, final float x, final float y, final float z, final float w) {
        builder.prep(4, 16);
        builder.putFloat(w);
        builder.putFloat(z);
        builder.putFloat(y);
        builder.putFloat(x);
        return builder.offset();
    }
}
