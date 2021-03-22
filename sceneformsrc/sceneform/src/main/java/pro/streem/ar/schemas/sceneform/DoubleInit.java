// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class DoubleInit extends Table
{
    public static DoubleInit getRootAsDoubleInit(final ByteBuffer _bb) {
        return getRootAsDoubleInit(_bb, new DoubleInit());
    }
    
    public static DoubleInit getRootAsDoubleInit(final ByteBuffer _bb, final DoubleInit obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public DoubleInit __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public double value() {
        final int o = this.__offset(4);
        return (o != 0) ? this.bb.getDouble(o + this.bb_pos) : 0.0;
    }
    
    public static int createDoubleInit(final FlatBufferBuilder builder, final double value) {
        builder.startObject(1);
        addValue(builder, value);
        return endDoubleInit(builder);
    }
    
    public static void startDoubleInit(final FlatBufferBuilder builder) {
        builder.startObject(1);
    }
    
    public static void addValue(final FlatBufferBuilder builder, final double value) {
        builder.addDouble(0, value, 0.0);
    }
    
    public static int endDoubleInit(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
