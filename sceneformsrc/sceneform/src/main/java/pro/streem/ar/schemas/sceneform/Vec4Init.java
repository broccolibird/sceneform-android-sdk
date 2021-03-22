// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class Vec4Init extends Table
{
    public static Vec4Init getRootAsVec4Init(final ByteBuffer _bb) {
        return getRootAsVec4Init(_bb, new Vec4Init());
    }
    
    public static Vec4Init getRootAsVec4Init(final ByteBuffer _bb, final Vec4Init obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public Vec4Init __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public float x() {
        final int o = this.__offset(4);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public float y() {
        final int o = this.__offset(6);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public float z() {
        final int o = this.__offset(8);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public float w() {
        final int o = this.__offset(10);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public static int createVec4Init(final FlatBufferBuilder builder, final float x, final float y, final float z, final float w) {
        builder.startObject(4);
        addW(builder, w);
        addZ(builder, z);
        addY(builder, y);
        addX(builder, x);
        return endVec4Init(builder);
    }
    
    public static void startVec4Init(final FlatBufferBuilder builder) {
        builder.startObject(4);
    }
    
    public static void addX(final FlatBufferBuilder builder, final float x) {
        builder.addFloat(0, x, 0.0);
    }
    
    public static void addY(final FlatBufferBuilder builder, final float y) {
        builder.addFloat(1, y, 0.0);
    }
    
    public static void addZ(final FlatBufferBuilder builder, final float z) {
        builder.addFloat(2, z, 0.0);
    }
    
    public static void addW(final FlatBufferBuilder builder, final float w) {
        builder.addFloat(3, w, 0.0);
    }
    
    public static int endVec4Init(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
