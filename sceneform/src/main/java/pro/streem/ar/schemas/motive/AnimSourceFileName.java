// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.motive;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class AnimSourceFileName extends Table
{
    public static AnimSourceFileName getRootAsAnimSourceFileName(final ByteBuffer _bb) {
        return getRootAsAnimSourceFileName(_bb, new AnimSourceFileName());
    }
    
    public static AnimSourceFileName getRootAsAnimSourceFileName(final ByteBuffer _bb, final AnimSourceFileName obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public AnimSourceFileName __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public String fileName() {
        final int o = this.__offset(4);
        return (o != 0) ? this.__string(o + this.bb_pos) : null;
    }
    
    public ByteBuffer fileNameAsByteBuffer() {
        return this.__vector_as_bytebuffer(4, 1);
    }
    
    public ByteBuffer fileNameInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 4, 1);
    }
    
    public static int createAnimSourceFileName(final FlatBufferBuilder builder, final int file_nameOffset) {
        builder.startObject(1);
        addFileName(builder, file_nameOffset);
        return endAnimSourceFileName(builder);
    }
    
    public static void startAnimSourceFileName(final FlatBufferBuilder builder) {
        builder.startObject(1);
    }
    
    public static void addFileName(final FlatBufferBuilder builder, final int fileNameOffset) {
        builder.addOffset(0, fileNameOffset, 0);
    }
    
    public static int endAnimSourceFileName(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
