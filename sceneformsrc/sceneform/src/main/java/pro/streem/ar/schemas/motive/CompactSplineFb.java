// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.motive;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class CompactSplineFb extends Table
{
    public static CompactSplineFb getRootAsCompactSplineFb(final ByteBuffer _bb) {
        return getRootAsCompactSplineFb(_bb, new CompactSplineFb());
    }
    
    public static CompactSplineFb getRootAsCompactSplineFb(final ByteBuffer _bb, final CompactSplineFb obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public CompactSplineFb __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public float yRangeStart() {
        final int o = this.__offset(4);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public float yRangeEnd() {
        final int o = this.__offset(6);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public float xGranularity() {
        final int o = this.__offset(8);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public CompactSplineNodeFb nodes(final int j) {
        return this.nodes(new CompactSplineNodeFb(), j);
    }
    
    public CompactSplineNodeFb nodes(final CompactSplineNodeFb obj, final int j) {
        final int o = this.__offset(10);
        return (o != 0) ? obj.__assign(this.__vector(o) + j * 6, this.bb) : null;
    }
    
    public int nodesLength() {
        final int o = this.__offset(10);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public static int createCompactSplineFb(final FlatBufferBuilder builder, final float y_range_start, final float y_range_end, final float x_granularity, final int nodesOffset) {
        builder.startObject(4);
        addNodes(builder, nodesOffset);
        addXGranularity(builder, x_granularity);
        addYRangeEnd(builder, y_range_end);
        addYRangeStart(builder, y_range_start);
        return endCompactSplineFb(builder);
    }
    
    public static void startCompactSplineFb(final FlatBufferBuilder builder) {
        builder.startObject(4);
    }
    
    public static void addYRangeStart(final FlatBufferBuilder builder, final float yRangeStart) {
        builder.addFloat(0, yRangeStart, 0.0);
    }
    
    public static void addYRangeEnd(final FlatBufferBuilder builder, final float yRangeEnd) {
        builder.addFloat(1, yRangeEnd, 0.0);
    }
    
    public static void addXGranularity(final FlatBufferBuilder builder, final float xGranularity) {
        builder.addFloat(2, xGranularity, 0.0);
    }
    
    public static void addNodes(final FlatBufferBuilder builder, final int nodesOffset) {
        builder.addOffset(3, nodesOffset, 0);
    }
    
    public static void startNodesVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(6, numElems, 2);
    }
    
    public static int endCompactSplineFb(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
