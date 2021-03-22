// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class ModelPipelineRenderableDef extends Table
{
    public static ModelPipelineRenderableDef getRootAsModelPipelineRenderableDef(final ByteBuffer _bb) {
        return getRootAsModelPipelineRenderableDef(_bb, new ModelPipelineRenderableDef());
    }
    
    public static ModelPipelineRenderableDef getRootAsModelPipelineRenderableDef(final ByteBuffer _bb, final ModelPipelineRenderableDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public ModelPipelineRenderableDef __assign(final int _i, final ByteBuffer _bb) {
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
    
    public ModelPipelineMaterialDef materials(final int j) {
        return this.materials(new ModelPipelineMaterialDef(), j);
    }
    
    public ModelPipelineMaterialDef materials(final ModelPipelineMaterialDef obj, final int j) {
        final int o = this.__offset(6);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int materialsLength() {
        final int o = this.__offset(6);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public int attributes(final int j) {
        final int o = this.__offset(8);
        return (o != 0) ? this.bb.getInt(this.__vector(o) + j * 4) : 0;
    }
    
    public int attributesLength() {
        final int o = this.__offset(8);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public ByteBuffer attributesAsByteBuffer() {
        return this.__vector_as_bytebuffer(8, 4);
    }
    
    public ByteBuffer attributesInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 8, 4);
    }
    
    public static int createModelPipelineRenderableDef(final FlatBufferBuilder builder, final int sourceOffset, final int materialsOffset, final int attributesOffset) {
        builder.startObject(3);
        addAttributes(builder, attributesOffset);
        addMaterials(builder, materialsOffset);
        addSource(builder, sourceOffset);
        return endModelPipelineRenderableDef(builder);
    }
    
    public static void startModelPipelineRenderableDef(final FlatBufferBuilder builder) {
        builder.startObject(3);
    }
    
    public static void addSource(final FlatBufferBuilder builder, final int sourceOffset) {
        builder.addOffset(0, sourceOffset, 0);
    }
    
    public static void addMaterials(final FlatBufferBuilder builder, final int materialsOffset) {
        builder.addOffset(1, materialsOffset, 0);
    }
    
    public static int createMaterialsVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startMaterialsVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static void addAttributes(final FlatBufferBuilder builder, final int attributesOffset) {
        builder.addOffset(2, attributesOffset, 0);
    }
    
    public static int createAttributesVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addInt(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startAttributesVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static int endModelPipelineRenderableDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
