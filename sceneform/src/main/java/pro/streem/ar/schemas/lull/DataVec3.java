// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class DataVec3 extends Table
{
    public static DataVec3 getRootAsDataVec3(final ByteBuffer _bb) {
        return getRootAsDataVec3(_bb, new DataVec3());
    }
    
    public static DataVec3 getRootAsDataVec3(final ByteBuffer _bb, final DataVec3 obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public DataVec3 __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public Vec3 value() {
        return this.value(new Vec3());
    }
    
    public Vec3 value(final Vec3 obj) {
        final int o = this.__offset(4);
        return (o != 0) ? obj.__assign(o + this.bb_pos, this.bb) : null;
    }
    
    public static void startDataVec3(final FlatBufferBuilder builder) {
        builder.startObject(1);
    }
    
    public static void addValue(final FlatBufferBuilder builder, final int valueOffset) {
        builder.addStruct(0, valueOffset, 0);
    }
    
    public static int endDataVec3(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
