// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.motive;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class ModularParameters extends Table
{
    public static ModularParameters getRootAsModularParameters(final ByteBuffer _bb) {
        return getRootAsModularParameters(_bb, new ModularParameters());
    }
    
    public static ModularParameters getRootAsModularParameters(final ByteBuffer _bb, final ModularParameters obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public ModularParameters __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public boolean modular() {
        final int o = this.__offset(4);
        return o != 0 && 0 != this.bb.get(o + this.bb_pos);
    }
    
    public float min() {
        final int o = this.__offset(6);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public float max() {
        final int o = this.__offset(8);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public static int createModularParameters(final FlatBufferBuilder builder, final boolean modular, final float min, final float max) {
        builder.startObject(3);
        addMax(builder, max);
        addMin(builder, min);
        addModular(builder, modular);
        return endModularParameters(builder);
    }
    
    public static void startModularParameters(final FlatBufferBuilder builder) {
        builder.startObject(3);
    }
    
    public static void addModular(final FlatBufferBuilder builder, final boolean modular) {
        builder.addBoolean(0, modular, false);
    }
    
    public static void addMin(final FlatBufferBuilder builder, final float min) {
        builder.addFloat(1, min, 0.0);
    }
    
    public static void addMax(final FlatBufferBuilder builder, final float max) {
        builder.addFloat(2, max, 0.0);
    }
    
    public static int endModularParameters(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
