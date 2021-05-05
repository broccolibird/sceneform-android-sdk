// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class IntInit extends Table
{
    public static IntInit getRootAsIntInit(final ByteBuffer _bb) {
        return getRootAsIntInit(_bb, new IntInit());
    }
    
    public static IntInit getRootAsIntInit(final ByteBuffer _bb, final IntInit obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public IntInit __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public int value() {
        final int o = this.__offset(4);
        return (o != 0) ? this.bb.getInt(o + this.bb_pos) : 0;
    }
    
    public static int createIntInit(final FlatBufferBuilder builder, final int value) {
        builder.startObject(1);
        addValue(builder, value);
        return endIntInit(builder);
    }
    
    public static void startIntInit(final FlatBufferBuilder builder) {
        builder.startObject(1);
    }
    
    public static void addValue(final FlatBufferBuilder builder, final int value) {
        builder.addInt(0, value, 0);
    }
    
    public static int endIntInit(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
