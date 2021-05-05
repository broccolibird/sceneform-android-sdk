// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class DataVec4 extends Table
{
    public static DataVec4 getRootAsDataVec4(final ByteBuffer _bb) {
        return getRootAsDataVec4(_bb, new DataVec4());
    }
    
    public static DataVec4 getRootAsDataVec4(final ByteBuffer _bb, final DataVec4 obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public DataVec4 __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public Vec4 value() {
        return this.value(new Vec4());
    }
    
    public Vec4 value(final Vec4 obj) {
        final int o = this.__offset(4);
        return (o != 0) ? obj.__assign(o + this.bb_pos, this.bb) : null;
    }
    
    public static void startDataVec4(final FlatBufferBuilder builder) {
        builder.startObject(1);
    }
    
    public static void addValue(final FlatBufferBuilder builder, final int valueOffset) {
        builder.addStruct(0, valueOffset, 0);
    }
    
    public static int endDataVec4(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
