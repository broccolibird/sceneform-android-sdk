// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Struct;

public final class ModelIndexRange extends Struct
{
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
    }
    
    public ModelIndexRange __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public long start() {
        return (long)this.bb.getInt(this.bb_pos + 0) & 0xFFFFFFFFL;
    }
    
    public long end() {
        return (long)this.bb.getInt(this.bb_pos + 4) & 0xFFFFFFFFL;
    }
    
    public static int createModelIndexRange(final FlatBufferBuilder builder, final long start, final long end) {
        builder.prep(4, 8);
        builder.putInt((int)end);
        builder.putInt((int)start);
        return builder.offset();
    }
}
