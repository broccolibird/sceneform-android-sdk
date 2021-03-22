// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class SkeletonDef extends Table
{
    public static SkeletonDef getRootAsSkeletonDef(final ByteBuffer _bb) {
        return getRootAsSkeletonDef(_bb, new SkeletonDef());
    }
    
    public static SkeletonDef getRootAsSkeletonDef(final ByteBuffer _bb, final SkeletonDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public SkeletonDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public String boneNames(final int j) {
        final int o = this.__offset(4);
        return (o != 0) ? this.__string(this.__vector(o) + j * 4) : null;
    }
    
    public int boneNamesLength() {
        final int o = this.__offset(4);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public int boneParents(final int j) {
        final int o = this.__offset(6);
        return (o != 0) ? (this.bb.get(this.__vector(o) + j * 1) & 0xFF) : 0;
    }
    
    public int boneParentsLength() {
        final int o = this.__offset(6);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public ByteBuffer boneParentsAsByteBuffer() {
        return this.__vector_as_bytebuffer(6, 1);
    }
    
    public ByteBuffer boneParentsInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 6, 1);
    }
    
    public Mat4x3 boneTransforms(final int j) {
        return this.boneTransforms(new Mat4x3(), j);
    }
    
    public Mat4x3 boneTransforms(final Mat4x3 obj, final int j) {
        final int o = this.__offset(8);
        return (o != 0) ? obj.__assign(this.__vector(o) + j * 48, this.bb) : null;
    }
    
    public int boneTransformsLength() {
        final int o = this.__offset(8);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public static int createSkeletonDef(final FlatBufferBuilder builder, final int bone_namesOffset, final int bone_parentsOffset, final int bone_transformsOffset) {
        builder.startObject(5);
        addBoneTransforms(builder, bone_transformsOffset);
        addBoneParents(builder, bone_parentsOffset);
        addBoneNames(builder, bone_namesOffset);
        return endSkeletonDef(builder);
    }
    
    public static void startSkeletonDef(final FlatBufferBuilder builder) {
        builder.startObject(5);
    }
    
    public static void addBoneNames(final FlatBufferBuilder builder, final int boneNamesOffset) {
        builder.addOffset(0, boneNamesOffset, 0);
    }
    
    public static int createBoneNamesVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startBoneNamesVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static void addBoneParents(final FlatBufferBuilder builder, final int boneParentsOffset) {
        builder.addOffset(1, boneParentsOffset, 0);
    }
    
    public static int createBoneParentsVector(final FlatBufferBuilder builder, final byte[] data) {
        return builder.createByteVector(data);
    }
    
    public static int createBoneParentsVector(final FlatBufferBuilder builder, final ByteBuffer data) {
        return builder.createByteVector(data);
    }
    
    public static void startBoneParentsVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(1, numElems, 1);
    }
    
    public static void addBoneTransforms(final FlatBufferBuilder builder, final int boneTransformsOffset) {
        builder.addOffset(2, boneTransformsOffset, 0);
    }
    
    public static void startBoneTransformsVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(48, numElems, 4);
    }
    
    public static int endSkeletonDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
