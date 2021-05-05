// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.motive;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Struct;

public final class CompactSplineFloatNodeFb extends Struct
{
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
    }
    
    public CompactSplineFloatNodeFb __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public float value() {
        return this.bb.getFloat(this.bb_pos + 0);
    }
    
    public float time() {
        return this.bb.getFloat(this.bb_pos + 4);
    }
    
    public float derivative() {
        return this.bb.getFloat(this.bb_pos + 8);
    }
    
    public static int createCompactSplineFloatNodeFb(final FlatBufferBuilder builder, final float value, final float time, final float derivative) {
        builder.prep(4, 12);
        builder.putFloat(derivative);
        builder.putFloat(time);
        builder.putFloat(value);
        return builder.offset();
    }
}
