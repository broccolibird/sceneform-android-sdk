// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.motive;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class CompactSplineAnimFloatFb extends Table
{
    public static CompactSplineAnimFloatFb getRootAsCompactSplineAnimFloatFb(final ByteBuffer _bb) {
        return getRootAsCompactSplineAnimFloatFb(_bb, new CompactSplineAnimFloatFb());
    }
    
    public static CompactSplineAnimFloatFb getRootAsCompactSplineAnimFloatFb(final ByteBuffer _bb, final CompactSplineAnimFloatFb obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public static boolean CompactSplineAnimFloatFbBufferHasIdentifier(final ByteBuffer _bb) {
        return __has_identifier(_bb, "SPLN");
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public CompactSplineAnimFloatFb __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public pro.streem.ar.schemas.motive.CompactSplineFloatFb splines(final int j) {
        return this.splines(new pro.streem.ar.schemas.motive.CompactSplineFloatFb(), j);
    }
    
    public pro.streem.ar.schemas.motive.CompactSplineFloatFb splines(final CompactSplineFloatFb obj, final int j) {
        final int o = this.__offset(4);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int splinesLength() {
        final int o = this.__offset(4);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public static int createCompactSplineAnimFloatFb(final FlatBufferBuilder builder, final int splinesOffset) {
        builder.startObject(1);
        addSplines(builder, splinesOffset);
        return endCompactSplineAnimFloatFb(builder);
    }
    
    public static void startCompactSplineAnimFloatFb(final FlatBufferBuilder builder) {
        builder.startObject(1);
    }
    
    public static void addSplines(final FlatBufferBuilder builder, final int splinesOffset) {
        builder.addOffset(0, splinesOffset, 0);
    }
    
    public static int createSplinesVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startSplinesVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static int endCompactSplineAnimFloatFb(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
    
    public static void finishCompactSplineAnimFloatFbBuffer(final FlatBufferBuilder builder, final int offset) {
        builder.finish(offset, "SPLN");
    }
    
    public static void finishSizePrefixedCompactSplineAnimFloatFbBuffer(final FlatBufferBuilder builder, final int offset) {
        builder.finishSizePrefixed(offset, "SPLN");
    }
}
