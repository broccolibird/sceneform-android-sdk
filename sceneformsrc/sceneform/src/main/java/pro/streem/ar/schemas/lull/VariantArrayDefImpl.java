// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class VariantArrayDefImpl extends Table
{
    public static VariantArrayDefImpl getRootAsVariantArrayDefImpl(final ByteBuffer _bb) {
        return getRootAsVariantArrayDefImpl(_bb, new VariantArrayDefImpl());
    }
    
    public static VariantArrayDefImpl getRootAsVariantArrayDefImpl(final ByteBuffer _bb, final VariantArrayDefImpl obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public VariantArrayDefImpl __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public byte valueType() {
        final int o = this.__offset(4);
        return (byte)((o != 0) ? this.bb.get(o + this.bb_pos) : 0);
    }
    
    public Table value(final Table obj) {
        final int o = this.__offset(6);
        return (o != 0) ? this.__union(obj, o) : null;
    }
    
    public static int createVariantArrayDefImpl(final FlatBufferBuilder builder, final byte value_type, final int valueOffset) {
        builder.startObject(2);
        addValue(builder, valueOffset);
        addValueType(builder, value_type);
        return endVariantArrayDefImpl(builder);
    }
    
    public static void startVariantArrayDefImpl(final FlatBufferBuilder builder) {
        builder.startObject(2);
    }
    
    public static void addValueType(final FlatBufferBuilder builder, final byte valueType) {
        builder.addByte(0, valueType, 0);
    }
    
    public static void addValue(final FlatBufferBuilder builder, final int valueOffset) {
        builder.addOffset(1, valueOffset, 0);
    }
    
    public static int endVariantArrayDefImpl(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
