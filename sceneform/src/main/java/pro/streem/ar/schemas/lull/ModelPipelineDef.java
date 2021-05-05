// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class ModelPipelineDef extends Table
{
    public static ModelPipelineDef getRootAsModelPipelineDef(final ByteBuffer _bb) {
        return getRootAsModelPipelineDef(_bb, new ModelPipelineDef());
    }
    
    public static ModelPipelineDef getRootAsModelPipelineDef(final ByteBuffer _bb, final ModelPipelineDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public ModelPipelineDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public ModelPipelineImportDef sources(final int j) {
        return this.sources(new ModelPipelineImportDef(), j);
    }
    
    public ModelPipelineImportDef sources(final ModelPipelineImportDef obj, final int j) {
        final int o = this.__offset(4);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int sourcesLength() {
        final int o = this.__offset(4);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public ModelPipelineRenderableDef renderables(final int j) {
        return this.renderables(new ModelPipelineRenderableDef(), j);
    }
    
    public ModelPipelineRenderableDef renderables(final ModelPipelineRenderableDef obj, final int j) {
        final int o = this.__offset(6);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int renderablesLength() {
        final int o = this.__offset(6);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public ModelPipelineCollidableDef collidable() {
        return this.collidable(new ModelPipelineCollidableDef());
    }
    
    public ModelPipelineCollidableDef collidable(final ModelPipelineCollidableDef obj) {
        final int o = this.__offset(8);
        return (o != 0) ? obj.__assign(this.__indirect(o + this.bb_pos), this.bb) : null;
    }
    
    public ModelPipelineSkeletonDef skeleton() {
        return this.skeleton(new ModelPipelineSkeletonDef());
    }
    
    public ModelPipelineSkeletonDef skeleton(final ModelPipelineSkeletonDef obj) {
        final int o = this.__offset(10);
        return (o != 0) ? obj.__assign(this.__indirect(o + this.bb_pos), this.bb) : null;
    }
    
    public pro.streem.ar.schemas.lull.TextureDef textures(final int j) {
        return this.textures(new pro.streem.ar.schemas.lull.TextureDef(), j);
    }
    
    public pro.streem.ar.schemas.lull.TextureDef textures(final TextureDef obj, final int j) {
        final int o = this.__offset(12);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int texturesLength() {
        final int o = this.__offset(12);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public static int createModelPipelineDef(final FlatBufferBuilder builder, final int sourcesOffset, final int renderablesOffset, final int collidableOffset, final int skeletonOffset, final int texturesOffset) {
        builder.startObject(5);
        addTextures(builder, texturesOffset);
        addSkeleton(builder, skeletonOffset);
        addCollidable(builder, collidableOffset);
        addRenderables(builder, renderablesOffset);
        addSources(builder, sourcesOffset);
        return endModelPipelineDef(builder);
    }
    
    public static void startModelPipelineDef(final FlatBufferBuilder builder) {
        builder.startObject(5);
    }
    
    public static void addSources(final FlatBufferBuilder builder, final int sourcesOffset) {
        builder.addOffset(0, sourcesOffset, 0);
    }
    
    public static int createSourcesVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startSourcesVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static void addRenderables(final FlatBufferBuilder builder, final int renderablesOffset) {
        builder.addOffset(1, renderablesOffset, 0);
    }
    
    public static int createRenderablesVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startRenderablesVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static void addCollidable(final FlatBufferBuilder builder, final int collidableOffset) {
        builder.addOffset(2, collidableOffset, 0);
    }
    
    public static void addSkeleton(final FlatBufferBuilder builder, final int skeletonOffset) {
        builder.addOffset(3, skeletonOffset, 0);
    }
    
    public static void addTextures(final FlatBufferBuilder builder, final int texturesOffset) {
        builder.addOffset(4, texturesOffset, 0);
    }
    
    public static int createTexturesVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startTexturesVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static int endModelPipelineDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
