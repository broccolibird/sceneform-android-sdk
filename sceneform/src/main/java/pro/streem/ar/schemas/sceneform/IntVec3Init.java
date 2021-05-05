// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class IntVec3Init extends Table
{
    public static IntVec3Init getRootAsIntVec3Init(final ByteBuffer _bb) {
        return getRootAsIntVec3Init(_bb, new IntVec3Init());
    }
    
    public static IntVec3Init getRootAsIntVec3Init(final ByteBuffer _bb, final IntVec3Init obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public IntVec3Init __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public int x() {
        final int o = this.__offset(4);
        return (o != 0) ? this.bb.getInt(o + this.bb_pos) : 0;
    }
    
    public int y() {
        final int o = this.__offset(6);
        return (o != 0) ? this.bb.getInt(o + this.bb_pos) : 0;
    }
    
    public int z() {
        final int o = this.__offset(8);
        return (o != 0) ? this.bb.getInt(o + this.bb_pos) : 0;
    }
    
    public static int createIntVec3Init(final FlatBufferBuilder builder, final int x, final int y, final int z) {
        builder.startObject(3);
        addZ(builder, z);
        addY(builder, y);
        addX(builder, x);
        return endIntVec3Init(builder);
    }
    
    public static void startIntVec3Init(final FlatBufferBuilder builder) {
        builder.startObject(3);
    }
    
    public static void addX(final FlatBufferBuilder builder, final int x) {
        builder.addInt(0, x, 0);
    }
    
    public static void addY(final FlatBufferBuilder builder, final int y) {
        builder.addInt(1, y, 0);
    }
    
    public static void addZ(final FlatBufferBuilder builder, final int z) {
        builder.addInt(2, z, 0);
    }
    
    public static int endIntVec3Init(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
