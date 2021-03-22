// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class ParameterInitDef extends Table
{
    public static ParameterInitDef getRootAsParameterInitDef(final ByteBuffer _bb) {
        return getRootAsParameterInitDef(_bb, new ParameterInitDef());
    }
    
    public static ParameterInitDef getRootAsParameterInitDef(final ByteBuffer _bb, final ParameterInitDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public ParameterInitDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public byte initType() {
        final int o = this.__offset(4);
        return (byte)((o != 0) ? this.bb.get(o + this.bb_pos) : 0);
    }
    
    public Table init(final Table obj) {
        final int o = this.__offset(6);
        return (o != 0) ? this.__union(obj, o) : null;
    }
    
    public static int createParameterInitDef(final FlatBufferBuilder builder, final byte init_type, final int initOffset) {
        builder.startObject(2);
        addInit(builder, initOffset);
        addInitType(builder, init_type);
        return endParameterInitDef(builder);
    }
    
    public static void startParameterInitDef(final FlatBufferBuilder builder) {
        builder.startObject(2);
    }
    
    public static void addInitType(final FlatBufferBuilder builder, final byte initType) {
        builder.addByte(0, initType, 0);
    }
    
    public static void addInit(final FlatBufferBuilder builder, final int initOffset) {
        builder.addOffset(1, initOffset, 0);
    }
    
    public static int endParameterInitDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
