// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;

import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

import pro.streem.ar.schemas.lull.Vec3;

public final class TransformDef extends Table
{
    public static TransformDef getRootAsTransformDef(final ByteBuffer _bb) {
        return getRootAsTransformDef(_bb, new TransformDef());
    }
    
    public static TransformDef getRootAsTransformDef(final ByteBuffer _bb, final TransformDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public TransformDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public float scale() {
        final int o = this.__offset(4);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public pro.streem.ar.schemas.lull.Vec3 offset() {
        return this.offset(new pro.streem.ar.schemas.lull.Vec3());
    }
    
    public pro.streem.ar.schemas.lull.Vec3 offset(final Vec3 obj) {
        final int o = this.__offset(6);
        return (o != 0) ? obj.__assign(o + this.bb_pos, this.bb) : null;
    }
    
    public static void startTransformDef(final FlatBufferBuilder builder) {
        builder.startObject(2);
    }
    
    public static void addScale(final FlatBufferBuilder builder, final float scale) {
        builder.addFloat(0, scale, 0.0);
    }
    
    public static void addOffset(final FlatBufferBuilder builder, final int offsetOffset) {
        builder.addStruct(1, offsetOffset, 0);
    }
    
    public static int endTransformDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
