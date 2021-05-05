// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class ModelDef extends Table
{
    public static ModelDef getRootAsModelDef(final ByteBuffer _bb) {
        return getRootAsModelDef(_bb, new ModelDef());
    }
    
    public static ModelDef getRootAsModelDef(final ByteBuffer _bb, final ModelDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public ModelDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public int version() {
        final int o = this.__offset(4);
        return (o != 0) ? this.bb.getInt(o + this.bb_pos) : 1;
    }
    
    public ModelInstanceDef lods(final int j) {
        return this.lods(new ModelInstanceDef(), j);
    }
    
    public ModelInstanceDef lods(final ModelInstanceDef obj, final int j) {
        final int o = this.__offset(6);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int lodsLength() {
        final int o = this.__offset(6);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public SkeletonDef skeleton() {
        return this.skeleton(new SkeletonDef());
    }
    
    public SkeletonDef skeleton(final SkeletonDef obj) {
        final int o = this.__offset(8);
        return (o != 0) ? obj.__assign(this.__indirect(o + this.bb_pos), this.bb) : null;
    }
    
    public AabbDef boundingBox() {
        return this.boundingBox(new AabbDef());
    }
    
    public AabbDef boundingBox(final AabbDef obj) {
        final int o = this.__offset(10);
        return (o != 0) ? obj.__assign(o + this.bb_pos, this.bb) : null;
    }
    
    public TextureDef textures(final int j) {
        return this.textures(new TextureDef(), j);
    }
    
    public TextureDef textures(final TextureDef obj, final int j) {
        final int o = this.__offset(12);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int texturesLength() {
        final int o = this.__offset(12);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public static void startModelDef(final FlatBufferBuilder builder) {
        builder.startObject(5);
    }
    
    public static void addVersion(final FlatBufferBuilder builder, final int version) {
        builder.addInt(0, version, 1);
    }
    
    public static void addLods(final FlatBufferBuilder builder, final int lodsOffset) {
        builder.addOffset(1, lodsOffset, 0);
    }
    
    public static int createLodsVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startLodsVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static void addSkeleton(final FlatBufferBuilder builder, final int skeletonOffset) {
        builder.addOffset(2, skeletonOffset, 0);
    }
    
    public static void addBoundingBox(final FlatBufferBuilder builder, final int boundingBoxOffset) {
        builder.addStruct(3, boundingBoxOffset, 0);
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
    
    public static int endModelDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
    
    public static void finishModelDefBuffer(final FlatBufferBuilder builder, final int offset) {
        builder.finish(offset);
    }
    
    public static void finishSizePrefixedModelDefBuffer(final FlatBufferBuilder builder, final int offset) {
        builder.finishSizePrefixed(offset);
    }
}
