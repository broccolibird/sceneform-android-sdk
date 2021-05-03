// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.motive;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class SplineParameters extends Table
{
    public static SplineParameters getRootAsSplineParameters(final ByteBuffer _bb) {
        return getRootAsSplineParameters(_bb, new SplineParameters());
    }
    
    public static SplineParameters getRootAsSplineParameters(final ByteBuffer _bb, final SplineParameters obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public SplineParameters __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public ModularParameters base() {
        return this.base(new ModularParameters());
    }
    
    public ModularParameters base(final ModularParameters obj) {
        final int o = this.__offset(4);
        return (o != 0) ? obj.__assign(this.__indirect(o + this.bb_pos), this.bb) : null;
    }
    
    public static int createSplineParameters(final FlatBufferBuilder builder, final int baseOffset) {
        builder.startObject(1);
        addBase(builder, baseOffset);
        return endSplineParameters(builder);
    }
    
    public static void startSplineParameters(final FlatBufferBuilder builder) {
        builder.startObject(1);
    }
    
    public static void addBase(final FlatBufferBuilder builder, final int baseOffset) {
        builder.addOffset(0, baseOffset, 0);
    }
    
    public static int endSplineParameters(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
