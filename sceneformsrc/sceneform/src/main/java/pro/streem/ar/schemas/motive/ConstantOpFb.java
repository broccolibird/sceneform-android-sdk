// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.motive;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class ConstantOpFb extends Table
{
    public static ConstantOpFb getRootAsConstantOpFb(final ByteBuffer _bb) {
        return getRootAsConstantOpFb(_bb, new ConstantOpFb());
    }
    
    public static ConstantOpFb getRootAsConstantOpFb(final ByteBuffer _bb, final ConstantOpFb obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public ConstantOpFb __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public float yConst() {
        final int o = this.__offset(4);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public static int createConstantOpFb(final FlatBufferBuilder builder, final float y_const) {
        builder.startObject(1);
        addYConst(builder, y_const);
        return endConstantOpFb(builder);
    }
    
    public static void startConstantOpFb(final FlatBufferBuilder builder) {
        builder.startObject(1);
    }
    
    public static void addYConst(final FlatBufferBuilder builder, final float yConst) {
        builder.addFloat(0, yConst, 0.0);
    }
    
    public static int endConstantOpFb(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
