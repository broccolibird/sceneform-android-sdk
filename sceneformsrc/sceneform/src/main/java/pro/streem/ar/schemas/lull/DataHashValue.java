// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class DataHashValue extends Table
{
    public static DataHashValue getRootAsDataHashValue(final ByteBuffer _bb) {
        return getRootAsDataHashValue(_bb, new DataHashValue());
    }
    
    public static DataHashValue getRootAsDataHashValue(final ByteBuffer _bb, final DataHashValue obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public DataHashValue __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public long value() {
        final int o = this.__offset(4);
        return (o != 0) ? ((long)this.bb.getInt(o + this.bb_pos) & 0xFFFFFFFFL) : 0L;
    }
    
    public static int createDataHashValue(final FlatBufferBuilder builder, final long value) {
        builder.startObject(1);
        addValue(builder, value);
        return endDataHashValue(builder);
    }
    
    public static void startDataHashValue(final FlatBufferBuilder builder) {
        builder.startObject(1);
    }
    
    public static void addValue(final FlatBufferBuilder builder, final long value) {
        builder.addInt(0, (int)value, 0);
    }
    
    public static int endDataHashValue(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
