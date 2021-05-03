// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class SubmeshAabb extends Table
{
    public static SubmeshAabb getRootAsSubmeshAabb(final ByteBuffer _bb) {
        return getRootAsSubmeshAabb(_bb, new SubmeshAabb());
    }
    
    public static SubmeshAabb getRootAsSubmeshAabb(final ByteBuffer _bb, final SubmeshAabb obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public SubmeshAabb __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public pro.streem.ar.schemas.lull.Vec3 minPosition() {
        return this.minPosition(new pro.streem.ar.schemas.lull.Vec3());
    }
    
    public pro.streem.ar.schemas.lull.Vec3 minPosition(final pro.streem.ar.schemas.lull.Vec3 obj) {
        final int o = this.__offset(4);
        return (o != 0) ? obj.__assign(o + this.bb_pos, this.bb) : null;
    }
    
    public pro.streem.ar.schemas.lull.Vec3 maxPosition() {
        return this.maxPosition(new pro.streem.ar.schemas.lull.Vec3());
    }
    
    public pro.streem.ar.schemas.lull.Vec3 maxPosition(final Vec3 obj) {
        final int o = this.__offset(6);
        return (o != 0) ? obj.__assign(o + this.bb_pos, this.bb) : null;
    }
    
    public static void startSubmeshAabb(final FlatBufferBuilder builder) {
        builder.startObject(2);
    }
    
    public static void addMinPosition(final FlatBufferBuilder builder, final int minPositionOffset) {
        builder.addStruct(0, minPositionOffset, 0);
    }
    
    public static void addMaxPosition(final FlatBufferBuilder builder, final int maxPositionOffset) {
        builder.addStruct(1, maxPositionOffset, 0);
    }
    
    public static int endSubmeshAabb(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
