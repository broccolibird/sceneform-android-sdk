// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;

import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

import pro.streem.ar.schemas.lull.Vec3;

public final class SuggestedCollisionShapeDef extends Table
{
    public static SuggestedCollisionShapeDef getRootAsSuggestedCollisionShapeDef(final ByteBuffer _bb) {
        return getRootAsSuggestedCollisionShapeDef(_bb, new SuggestedCollisionShapeDef());
    }
    
    public static SuggestedCollisionShapeDef getRootAsSuggestedCollisionShapeDef(final ByteBuffer _bb, final SuggestedCollisionShapeDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public SuggestedCollisionShapeDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public int type() {
        final int o = this.__offset(4);
        return (o != 0) ? this.bb.getInt(o + this.bb_pos) : 0;
    }
    
    public pro.streem.ar.schemas.lull.Vec3 center() {
        return this.center(new pro.streem.ar.schemas.lull.Vec3());
    }
    
    public pro.streem.ar.schemas.lull.Vec3 center(final pro.streem.ar.schemas.lull.Vec3 obj) {
        final int o = this.__offset(6);
        return (o != 0) ? obj.__assign(o + this.bb_pos, this.bb) : null;
    }
    
    public pro.streem.ar.schemas.lull.Vec3 size() {
        return this.size(new pro.streem.ar.schemas.lull.Vec3());
    }
    
    public pro.streem.ar.schemas.lull.Vec3 size(final Vec3 obj) {
        final int o = this.__offset(8);
        return (o != 0) ? obj.__assign(o + this.bb_pos, this.bb) : null;
    }
    
    public static void startSuggestedCollisionShapeDef(final FlatBufferBuilder builder) {
        builder.startObject(3);
    }
    
    public static void addType(final FlatBufferBuilder builder, final int type) {
        builder.addInt(0, type, 0);
    }
    
    public static void addCenter(final FlatBufferBuilder builder, final int centerOffset) {
        builder.addStruct(1, centerOffset, 0);
    }
    
    public static void addSize(final FlatBufferBuilder builder, final int sizeOffset) {
        builder.addStruct(2, sizeOffset, 0);
    }
    
    public static int endSuggestedCollisionShapeDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
