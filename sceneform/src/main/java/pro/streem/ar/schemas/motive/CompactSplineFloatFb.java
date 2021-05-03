// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.motive;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class CompactSplineFloatFb extends Table
{
    public static CompactSplineFloatFb getRootAsCompactSplineFloatFb(final ByteBuffer _bb) {
        return getRootAsCompactSplineFloatFb(_bb, new CompactSplineFloatFb());
    }
    
    public static CompactSplineFloatFb getRootAsCompactSplineFloatFb(final ByteBuffer _bb, final CompactSplineFloatFb obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public CompactSplineFloatFb __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public float minValue() {
        final int o = this.__offset(4);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public float maxValue() {
        final int o = this.__offset(6);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public pro.streem.ar.schemas.motive.CompactSplineFloatNodeFb nodes(final int j) {
        return this.nodes(new pro.streem.ar.schemas.motive.CompactSplineFloatNodeFb(), j);
    }
    
    public pro.streem.ar.schemas.motive.CompactSplineFloatNodeFb nodes(final CompactSplineFloatNodeFb obj, final int j) {
        final int o = this.__offset(8);
        return (o != 0) ? obj.__assign(this.__vector(o) + j * 12, this.bb) : null;
    }
    
    public int nodesLength() {
        final int o = this.__offset(8);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public static int createCompactSplineFloatFb(final FlatBufferBuilder builder, final float min_value, final float max_value, final int nodesOffset) {
        builder.startObject(3);
        addNodes(builder, nodesOffset);
        addMaxValue(builder, max_value);
        addMinValue(builder, min_value);
        return endCompactSplineFloatFb(builder);
    }
    
    public static void startCompactSplineFloatFb(final FlatBufferBuilder builder) {
        builder.startObject(3);
    }
    
    public static void addMinValue(final FlatBufferBuilder builder, final float minValue) {
        builder.addFloat(0, minValue, 0.0);
    }
    
    public static void addMaxValue(final FlatBufferBuilder builder, final float maxValue) {
        builder.addFloat(1, maxValue, 0.0);
    }
    
    public static void addNodes(final FlatBufferBuilder builder, final int nodesOffset) {
        builder.addOffset(2, nodesOffset, 0);
    }
    
    public static void startNodesVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(12, numElems, 4);
    }
    
    public static int endCompactSplineFloatFb(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
