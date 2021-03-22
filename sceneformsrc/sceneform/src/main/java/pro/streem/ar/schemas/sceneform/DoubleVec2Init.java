// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class DoubleVec2Init extends Table
{
    public static DoubleVec2Init getRootAsDoubleVec2Init(final ByteBuffer _bb) {
        return getRootAsDoubleVec2Init(_bb, new DoubleVec2Init());
    }
    
    public static DoubleVec2Init getRootAsDoubleVec2Init(final ByteBuffer _bb, final DoubleVec2Init obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public DoubleVec2Init __assign(final int _i, final ByteBuffer _bb) {
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
    
    public static int createDoubleVec2Init(final FlatBufferBuilder builder, final double x, final double y) {
        builder.startObject(2);
        addY(builder, y);
        addX(builder, x);
        return endDoubleVec2Init(builder);
    }
    
    public static void startDoubleVec2Init(final FlatBufferBuilder builder) {
        builder.startObject(2);
    }
    
    public static void addX(final FlatBufferBuilder builder, final double x) {
        builder.addDouble(0, x, 0.0);
    }
    
    public static void addY(final FlatBufferBuilder builder, final double y) {
        builder.addDouble(1, y, 0.0);
    }
    
    public static int endDoubleVec2Init(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
