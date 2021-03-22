// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class VariantArrayDef extends Table
{
    public static VariantArrayDef getRootAsVariantArrayDef(final ByteBuffer _bb) {
        return getRootAsVariantArrayDef(_bb, new VariantArrayDef());
    }
    
    public static VariantArrayDef getRootAsVariantArrayDef(final ByteBuffer _bb, final VariantArrayDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public VariantArrayDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public VariantArrayDefImpl values(final int j) {
        return this.values(new VariantArrayDefImpl(), j);
    }
    
    public VariantArrayDefImpl values(final VariantArrayDefImpl obj, final int j) {
        final int o = this.__offset(4);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int valuesLength() {
        final int o = this.__offset(4);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public static int createVariantArrayDef(final FlatBufferBuilder builder, final int valuesOffset) {
        builder.startObject(1);
        addValues(builder, valuesOffset);
        return endVariantArrayDef(builder);
    }
    
    public static void startVariantArrayDef(final FlatBufferBuilder builder) {
        builder.startObject(1);
    }
    
    public static void addValues(final FlatBufferBuilder builder, final int valuesOffset) {
        builder.addOffset(0, valuesOffset, 0);
    }
    
    public static int createValuesVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startValuesVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static int endVariantArrayDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
