// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class ParameterDef extends Table
{
    public static ParameterDef getRootAsParameterDef(final ByteBuffer _bb) {
        return getRootAsParameterDef(_bb, new ParameterDef());
    }
    
    public static ParameterDef getRootAsParameterDef(final ByteBuffer _bb, final ParameterDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public ParameterDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public String id() {
        final int o = this.__offset(4);
        return (o != 0) ? this.__string(o + this.bb_pos) : null;
    }
    
    public ByteBuffer idAsByteBuffer() {
        return this.__vector_as_bytebuffer(4, 1);
    }
    
    public ByteBuffer idInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 4, 1);
    }
    
    public pro.streem.ar.schemas.sceneform.ParameterInitDef initialValue() {
        return this.initialValue(new pro.streem.ar.schemas.sceneform.ParameterInitDef());
    }
    
    public pro.streem.ar.schemas.sceneform.ParameterInitDef initialValue(final ParameterInitDef obj) {
        final int o = this.__offset(6);
        return (o != 0) ? obj.__assign(this.__indirect(o + this.bb_pos), this.bb) : null;
    }
    
    public static int createParameterDef(final FlatBufferBuilder builder, final int idOffset, final int initial_valueOffset) {
        builder.startObject(2);
        addInitialValue(builder, initial_valueOffset);
        addId(builder, idOffset);
        return endParameterDef(builder);
    }
    
    public static void startParameterDef(final FlatBufferBuilder builder) {
        builder.startObject(2);
    }
    
    public static void addId(final FlatBufferBuilder builder, final int idOffset) {
        builder.addOffset(0, idOffset, 0);
    }
    
    public static void addInitialValue(final FlatBufferBuilder builder, final int initialValueOffset) {
        builder.addOffset(1, initialValueOffset, 0);
    }
    
    public static int endParameterDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
