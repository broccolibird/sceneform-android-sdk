// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class BoolVec4Init extends Table
{
    public static BoolVec4Init getRootAsBoolVec4Init(final ByteBuffer _bb) {
        return getRootAsBoolVec4Init(_bb, new BoolVec4Init());
    }
    
    public static BoolVec4Init getRootAsBoolVec4Init(final ByteBuffer _bb, final BoolVec4Init obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public BoolVec4Init __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public boolean x() {
        final int o = this.__offset(4);
        return o != 0 && 0 != this.bb.get(o + this.bb_pos);
    }
    
    public boolean y() {
        final int o = this.__offset(6);
        return o != 0 && 0 != this.bb.get(o + this.bb_pos);
    }
    
    public boolean z() {
        final int o = this.__offset(8);
        return o != 0 && 0 != this.bb.get(o + this.bb_pos);
    }
    
    public boolean w() {
        final int o = this.__offset(10);
        return o != 0 && 0 != this.bb.get(o + this.bb_pos);
    }
    
    public static int createBoolVec4Init(final FlatBufferBuilder builder, final boolean x, final boolean y, final boolean z, final boolean w) {
        builder.startObject(4);
        addW(builder, w);
        addZ(builder, z);
        addY(builder, y);
        addX(builder, x);
        return endBoolVec4Init(builder);
    }
    
    public static void startBoolVec4Init(final FlatBufferBuilder builder) {
        builder.startObject(4);
    }
    
    public static void addX(final FlatBufferBuilder builder, final boolean x) {
        builder.addBoolean(0, x, false);
    }
    
    public static void addY(final FlatBufferBuilder builder, final boolean y) {
        builder.addBoolean(1, y, false);
    }
    
    public static void addZ(final FlatBufferBuilder builder, final boolean z) {
        builder.addBoolean(2, z, false);
    }
    
    public static void addW(final FlatBufferBuilder builder, final boolean w) {
        builder.addBoolean(3, w, false);
    }
    
    public static int endBoolVec4Init(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
