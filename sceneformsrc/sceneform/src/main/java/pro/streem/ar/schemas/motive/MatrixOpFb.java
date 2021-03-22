// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.motive;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class MatrixOpFb extends Table
{
    public static MatrixOpFb getRootAsMatrixOpFb(final ByteBuffer _bb) {
        return getRootAsMatrixOpFb(_bb, new MatrixOpFb());
    }
    
    public static MatrixOpFb getRootAsMatrixOpFb(final ByteBuffer _bb, final MatrixOpFb obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public MatrixOpFb __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public byte id() {
        final int o = this.__offset(4);
        return (byte)((o != 0) ? this.bb.get(o + this.bb_pos) : 0);
    }
    
    public byte type() {
        final int o = this.__offset(6);
        return (byte)((o != 0) ? this.bb.get(o + this.bb_pos) : 0);
    }
    
    public byte valueType() {
        final int o = this.__offset(8);
        return (byte)((o != 0) ? this.bb.get(o + this.bb_pos) : 0);
    }
    
    public Table value(final Table obj) {
        final int o = this.__offset(10);
        return (o != 0) ? this.__union(obj, o) : null;
    }
    
    public static int createMatrixOpFb(final FlatBufferBuilder builder, final byte id, final byte type, final byte value_type, final int valueOffset) {
        builder.startObject(4);
        addValue(builder, valueOffset);
        addValueType(builder, value_type);
        addType(builder, type);
        addId(builder, id);
        return endMatrixOpFb(builder);
    }
    
    public static void startMatrixOpFb(final FlatBufferBuilder builder) {
        builder.startObject(4);
    }
    
    public static void addId(final FlatBufferBuilder builder, final byte id) {
        builder.addByte(0, id, 0);
    }
    
    public static void addType(final FlatBufferBuilder builder, final byte type) {
        builder.addByte(1, type, 0);
    }
    
    public static void addValueType(final FlatBufferBuilder builder, final byte valueType) {
        builder.addByte(2, valueType, 0);
    }
    
    public static void addValue(final FlatBufferBuilder builder, final int valueOffset) {
        builder.addOffset(3, valueOffset, 0);
    }
    
    public static int endMatrixOpFb(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
