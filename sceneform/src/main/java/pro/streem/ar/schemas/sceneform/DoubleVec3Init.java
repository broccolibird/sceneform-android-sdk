// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class DoubleVec3Init extends Table
{
    public static DoubleVec3Init getRootAsDoubleVec3Init(final ByteBuffer _bb) {
        return getRootAsDoubleVec3Init(_bb, new DoubleVec3Init());
    }
    
    public static DoubleVec3Init getRootAsDoubleVec3Init(final ByteBuffer _bb, final DoubleVec3Init obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public DoubleVec3Init __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public double x() {
        final int o = this.__offset(4);
        return (o != 0) ? this.bb.getDouble(o + this.bb_pos) : 0.0;
    }
    
    public double y() {
        final int o = this.__offset(6);
        return (o != 0) ? this.bb.getDouble(o + this.bb_pos) : 0.0;
    }
    
    public double z() {
        final int o = this.__offset(8);
        return (o != 0) ? this.bb.getDouble(o + this.bb_pos) : 0.0;
    }
    
    public static int createDoubleVec3Init(final FlatBufferBuilder builder, final double x, final double y, final double z) {
        builder.startObject(3);
        addZ(builder, z);
        addY(builder, y);
        addX(builder, x);
        return endDoubleVec3Init(builder);
    }
    
    public static void startDoubleVec3Init(final FlatBufferBuilder builder) {
        builder.startObject(3);
    }
    
    public static void addX(final FlatBufferBuilder builder, final double x) {
        builder.addDouble(0, x, 0.0);
    }
    
    public static void addY(final FlatBufferBuilder builder, final double y) {
        builder.addDouble(1, y, 0.0);
    }
    
    public static void addZ(final FlatBufferBuilder builder, final double z) {
        builder.addDouble(2, z, 0.0);
    }
    
    public static int endDoubleVec3Init(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
