// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class DataVec2 extends Table
{
    public static DataVec2 getRootAsDataVec2(final ByteBuffer _bb) {
        return getRootAsDataVec2(_bb, new DataVec2());
    }
    
    public static DataVec2 getRootAsDataVec2(final ByteBuffer _bb, final DataVec2 obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public DataVec2 __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public Vec2 value() {
        return this.value(new Vec2());
    }
    
    public Vec2 value(final Vec2 obj) {
        final int o = this.__offset(4);
        return (o != 0) ? obj.__assign(o + this.bb_pos, this.bb) : null;
    }
    
    public static void startDataVec2(final FlatBufferBuilder builder) {
        builder.startObject(1);
    }
    
    public static void addValue(final FlatBufferBuilder builder, final int valueOffset) {
        builder.addStruct(0, valueOffset, 0);
    }
    
    public static int endDataVec2(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
