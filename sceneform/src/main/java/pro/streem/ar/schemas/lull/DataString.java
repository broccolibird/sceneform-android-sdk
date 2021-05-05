// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class DataString extends Table
{
    public static DataString getRootAsDataString(final ByteBuffer _bb) {
        return getRootAsDataString(_bb, new DataString());
    }
    
    public static DataString getRootAsDataString(final ByteBuffer _bb, final DataString obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public DataString __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public String value() {
        final int o = this.__offset(4);
        return (o != 0) ? this.__string(o + this.bb_pos) : null;
    }
    
    public ByteBuffer valueAsByteBuffer() {
        return this.__vector_as_bytebuffer(4, 1);
    }
    
    public ByteBuffer valueInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 4, 1);
    }
    
    public static int createDataString(final FlatBufferBuilder builder, final int valueOffset) {
        builder.startObject(1);
        addValue(builder, valueOffset);
        return endDataString(builder);
    }
    
    public static void startDataString(final FlatBufferBuilder builder) {
        builder.startObject(1);
    }
    
    public static void addValue(final FlatBufferBuilder builder, final int valueOffset) {
        builder.addOffset(0, valueOffset, 0);
    }
    
    public static int endDataString(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
