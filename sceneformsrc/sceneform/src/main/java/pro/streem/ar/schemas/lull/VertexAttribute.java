// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Struct;

public final class VertexAttribute extends Struct
{
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
    }
    
    public VertexAttribute __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public int usage() {
        return this.bb.getInt(this.bb_pos + 0);
    }
    
    public int type() {
        return this.bb.getInt(this.bb_pos + 4);
    }
    
    public static int createVertexAttribute(final FlatBufferBuilder builder, final int usage, final int type) {
        builder.prep(4, 8);
        builder.putInt(type);
        builder.putInt(usage);
        return builder.offset();
    }
}
