// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class DataBytes extends Table
{
    public static DataBytes getRootAsDataBytes(final ByteBuffer _bb) {
        return getRootAsDataBytes(_bb, new DataBytes());
    }
    
    public static DataBytes getRootAsDataBytes(final ByteBuffer _bb, final DataBytes obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public DataBytes __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public int value(final int j) {
        final int o = this.__offset(4);
        return (o != 0) ? (this.bb.get(this.__vector(o) + j * 1) & 0xFF) : 0;
    }
    
    public int valueLength() {
        final int o = this.__offset(4);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public ByteBuffer valueAsByteBuffer() {
        return this.__vector_as_bytebuffer(4, 1);
    }
    
    public ByteBuffer valueInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 4, 1);
    }
    
    public static int createDataBytes(final FlatBufferBuilder builder, final int valueOffset) {
        builder.startObject(1);
        addValue(builder, valueOffset);
        return endDataBytes(builder);
    }
    
    public static void startDataBytes(final FlatBufferBuilder builder) {
        builder.startObject(1);
    }
    
    public static void addValue(final FlatBufferBuilder builder, final int valueOffset) {
        builder.addOffset(0, valueOffset, 0);
    }
    
    public static int createValueVector(final FlatBufferBuilder builder, final byte[] data) {
        return builder.createByteVector(data);
    }
    
    public static int createValueVector(final FlatBufferBuilder builder, final ByteBuffer data) {
        return builder.createByteVector(data);
    }
    
    public static void startValueVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(1, numElems, 1);
    }
    
    public static int endDataBytes(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
