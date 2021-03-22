// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class BoolVec2Init extends Table
{
    public static BoolVec2Init getRootAsBoolVec2Init(final ByteBuffer _bb) {
        return getRootAsBoolVec2Init(_bb, new BoolVec2Init());
    }
    
    public static BoolVec2Init getRootAsBoolVec2Init(final ByteBuffer _bb, final BoolVec2Init obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public BoolVec2Init __assign(final int _i, final ByteBuffer _bb) {
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
    
    public static int createBoolVec2Init(final FlatBufferBuilder builder, final boolean x, final boolean y) {
        builder.startObject(2);
        addY(builder, y);
        addX(builder, x);
        return endBoolVec2Init(builder);
    }
    
    public static void startBoolVec2Init(final FlatBufferBuilder builder) {
        builder.startObject(2);
    }
    
    public static void addX(final FlatBufferBuilder builder, final boolean x) {
        builder.addBoolean(0, x, false);
    }
    
    public static void addY(final FlatBufferBuilder builder, final boolean y) {
        builder.addBoolean(1, y, false);
    }
    
    public static int endBoolVec2Init(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
