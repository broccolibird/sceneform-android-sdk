// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class Vec2Init extends Table
{
    public static Vec2Init getRootAsVec2Init(final ByteBuffer _bb) {
        return getRootAsVec2Init(_bb, new Vec2Init());
    }
    
    public static Vec2Init getRootAsVec2Init(final ByteBuffer _bb, final Vec2Init obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public Vec2Init __assign(final int _i, final ByteBuffer _bb) {
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
    
    public static int createVec2Init(final FlatBufferBuilder builder, final float x, final float y) {
        builder.startObject(2);
        addY(builder, y);
        addX(builder, x);
        return endVec2Init(builder);
    }
    
    public static void startVec2Init(final FlatBufferBuilder builder) {
        builder.startObject(2);
    }
    
    public static void addX(final FlatBufferBuilder builder, final float x) {
        builder.addFloat(0, x, 0.0);
    }
    
    public static void addY(final FlatBufferBuilder builder, final float y) {
        builder.addFloat(1, y, 0.0);
    }
    
    public static int endVec2Init(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
