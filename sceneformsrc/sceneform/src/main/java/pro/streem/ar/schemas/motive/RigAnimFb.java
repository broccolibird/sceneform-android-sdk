// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.motive;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class RigAnimFb extends Table
{
    public static RigAnimFb getRootAsRigAnimFb(final ByteBuffer _bb) {
        return getRootAsRigAnimFb(_bb, new RigAnimFb());
    }
    
    public static RigAnimFb getRootAsRigAnimFb(final ByteBuffer _bb, final RigAnimFb obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public static boolean RigAnimFbBufferHasIdentifier(final ByteBuffer _bb) {
        return __has_identifier(_bb, "ANIM");
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public RigAnimFb __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public MatrixAnimFb matrixAnims(final int j) {
        return this.matrixAnims(new MatrixAnimFb(), j);
    }
    
    public MatrixAnimFb matrixAnims(final MatrixAnimFb obj, final int j) {
        final int o = this.__offset(4);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int matrixAnimsLength() {
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
    
    public String boneNames(final int j) {
        final int o = this.__offset(8);
        return (o != 0) ? this.__string(this.__vector(o) + j * 4) : null;
    }
    
    public int boneNamesLength() {
        final int o = this.__offset(8);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public boolean repeat() {
        final int o = this.__offset(10);
        return o != 0 && 0 != this.bb.get(o + this.bb_pos);
    }
    
    public String name() {
        final int o = this.__offset(12);
        return (o != 0) ? this.__string(o + this.bb_pos) : null;
    }
    
    public ByteBuffer nameAsByteBuffer() {
        return this.__vector_as_bytebuffer(12, 1);
    }
    
    public ByteBuffer nameInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 12, 1);
    }
    
    public static int createRigAnimFb(final FlatBufferBuilder builder, final int matrix_animsOffset, final int bone_parentsOffset, final int bone_namesOffset, final boolean repeat, final int nameOffset) {
        builder.startObject(5);
        addName(builder, nameOffset);
        addBoneNames(builder, bone_namesOffset);
        addBoneParents(builder, bone_parentsOffset);
        addMatrixAnims(builder, matrix_animsOffset);
        addRepeat(builder, repeat);
        return endRigAnimFb(builder);
    }
    
    public static void startRigAnimFb(final FlatBufferBuilder builder) {
        builder.startObject(5);
    }
    
    public static void addMatrixAnims(final FlatBufferBuilder builder, final int matrixAnimsOffset) {
        builder.addOffset(0, matrixAnimsOffset, 0);
    }
    
    public static int createMatrixAnimsVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startMatrixAnimsVector(final FlatBufferBuilder builder, final int numElems) {
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
    
    public static void addBoneNames(final FlatBufferBuilder builder, final int boneNamesOffset) {
        builder.addOffset(2, boneNamesOffset, 0);
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
    
    public static void addRepeat(final FlatBufferBuilder builder, final boolean repeat) {
        builder.addBoolean(3, repeat, false);
    }
    
    public static void addName(final FlatBufferBuilder builder, final int nameOffset) {
        builder.addOffset(4, nameOffset, 0);
    }
    
    public static int endRigAnimFb(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
    
    public static void finishRigAnimFbBuffer(final FlatBufferBuilder builder, final int offset) {
        builder.finish(offset, "ANIM");
    }
    
    public static void finishSizePrefixedRigAnimFbBuffer(final FlatBufferBuilder builder, final int offset) {
        builder.finishSizePrefixed(offset, "ANIM");
    }
}
