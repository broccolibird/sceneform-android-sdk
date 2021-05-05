// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class ScalarInit extends Table
{
    public static ScalarInit getRootAsScalarInit(final ByteBuffer _bb) {
        return getRootAsScalarInit(_bb, new ScalarInit());
    }
    
    public static ScalarInit getRootAsScalarInit(final ByteBuffer _bb, final ScalarInit obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public ScalarInit __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public float value() {
        final int o = this.__offset(4);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public static int createScalarInit(final FlatBufferBuilder builder, final float value) {
        builder.startObject(1);
        addValue(builder, value);
        return endScalarInit(builder);
    }
    
    public static void startScalarInit(final FlatBufferBuilder builder) {
        builder.startObject(1);
    }
    
    public static void addValue(final FlatBufferBuilder builder, final float value) {
        builder.addFloat(0, value, 0.0);
    }
    
    public static int endScalarInit(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
