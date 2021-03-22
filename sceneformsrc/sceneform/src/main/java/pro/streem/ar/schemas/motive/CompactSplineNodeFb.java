// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.motive;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Struct;

public final class CompactSplineNodeFb extends Struct
{
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
    }
    
    public CompactSplineNodeFb __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public int x() {
        return this.bb.getShort(this.bb_pos + 0) & 0xFFFF;
    }
    
    public int y() {
        return this.bb.getShort(this.bb_pos + 2) & 0xFFFF;
    }
    
    public short angle() {
        return this.bb.getShort(this.bb_pos + 4);
    }
    
    public static int createCompactSplineNodeFb(final FlatBufferBuilder builder, final int x, final int y, final short angle) {
        builder.prep(2, 6);
        builder.putShort(angle);
        builder.putShort((short)y);
        builder.putShort((short)x);
        return builder.offset();
    }
}
