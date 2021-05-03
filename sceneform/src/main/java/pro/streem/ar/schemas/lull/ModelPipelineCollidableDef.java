// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class ModelPipelineCollidableDef extends Table
{
    public static ModelPipelineCollidableDef getRootAsModelPipelineCollidableDef(final ByteBuffer _bb) {
        return getRootAsModelPipelineCollidableDef(_bb, new ModelPipelineCollidableDef());
    }
    
    public static ModelPipelineCollidableDef getRootAsModelPipelineCollidableDef(final ByteBuffer _bb, final ModelPipelineCollidableDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public ModelPipelineCollidableDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public String source() {
        final int o = this.__offset(4);
        return (o != 0) ? this.__string(o + this.bb_pos) : null;
    }
    
    public ByteBuffer sourceAsByteBuffer() {
        return this.__vector_as_bytebuffer(4, 1);
    }
    
    public ByteBuffer sourceInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 4, 1);
    }
    
    public static int createModelPipelineCollidableDef(final FlatBufferBuilder builder, final int sourceOffset) {
        builder.startObject(1);
        addSource(builder, sourceOffset);
        return endModelPipelineCollidableDef(builder);
    }
    
    public static void startModelPipelineCollidableDef(final FlatBufferBuilder builder) {
        builder.startObject(1);
    }
    
    public static void addSource(final FlatBufferBuilder builder, final int sourceOffset) {
        builder.addOffset(0, sourceOffset, 0);
    }
    
    public static int endModelPipelineCollidableDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
