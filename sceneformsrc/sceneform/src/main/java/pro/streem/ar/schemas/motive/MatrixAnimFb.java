// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.motive;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class MatrixAnimFb extends Table
{
    public static MatrixAnimFb getRootAsMatrixAnimFb(final ByteBuffer _bb) {
        return getRootAsMatrixAnimFb(_bb, new MatrixAnimFb());
    }
    
    public static MatrixAnimFb getRootAsMatrixAnimFb(final ByteBuffer _bb, final MatrixAnimFb obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public MatrixAnimFb __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public MatrixOpFb ops(final int j) {
        return this.ops(new MatrixOpFb(), j);
    }
    
    public MatrixOpFb ops(final MatrixOpFb obj, final int j) {
        final int o = this.__offset(4);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int opsLength() {
        final int o = this.__offset(4);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public boolean sqtAnim() {
        final int o = this.__offset(6);
        return o != 0 && 0 != this.bb.get(o + this.bb_pos);
    }
    
    public static int createMatrixAnimFb(final FlatBufferBuilder builder, final int opsOffset, final boolean sqt_anim) {
        builder.startObject(2);
        addOps(builder, opsOffset);
        addSqtAnim(builder, sqt_anim);
        return endMatrixAnimFb(builder);
    }
    
    public static void startMatrixAnimFb(final FlatBufferBuilder builder) {
        builder.startObject(2);
    }
    
    public static void addOps(final FlatBufferBuilder builder, final int opsOffset) {
        builder.addOffset(0, opsOffset, 0);
    }
    
    public static int createOpsVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startOpsVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static void addSqtAnim(final FlatBufferBuilder builder, final boolean sqtAnim) {
        builder.addBoolean(1, sqtAnim, false);
    }
    
    public static int endMatrixAnimFb(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
