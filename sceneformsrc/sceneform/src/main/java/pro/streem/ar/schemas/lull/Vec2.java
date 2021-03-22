// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Struct;

public final class Vec2 extends Struct
{
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
    }
    
    public Vec2 __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public float x() {
        return this.bb.getFloat(this.bb_pos + 0);
    }
    
    public float y() {
        return this.bb.getFloat(this.bb_pos + 4);
    }
    
    public static int createVec2(final FlatBufferBuilder builder, final float x, final float y) {
        builder.prep(4, 8);
        builder.putFloat(y);
        builder.putFloat(x);
        return builder.offset();
    }
}
