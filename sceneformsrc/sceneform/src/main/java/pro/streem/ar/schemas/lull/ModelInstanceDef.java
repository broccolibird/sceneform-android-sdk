// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class ModelInstanceDef extends Table
{
    public static ModelInstanceDef getRootAsModelInstanceDef(final ByteBuffer _bb) {
        return getRootAsModelInstanceDef(_bb, new ModelInstanceDef());
    }
    
    public static ModelInstanceDef getRootAsModelInstanceDef(final ByteBuffer _bb, final ModelInstanceDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public ModelInstanceDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public int vertexData(final int j) {
        final int o = this.__offset(4);
        return (o != 0) ? (this.bb.get(this.__vector(o) + j * 1) & 0xFF) : 0;
    }
    
    public int vertexDataLength() {
        final int o = this.__offset(4);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public ByteBuffer vertexDataAsByteBuffer() {
        return this.__vector_as_bytebuffer(4, 1);
    }
    
    public ByteBuffer vertexDataInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 4, 1);
    }
    
    public int indices16(final int j) {
        final int o = this.__offset(6);
        return (o != 0) ? (this.bb.getShort(this.__vector(o) + j * 2) & 0xFFFF) : 0;
    }
    
    public int indices16Length() {
        final int o = this.__offset(6);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public ByteBuffer indices16AsByteBuffer() {
        return this.__vector_as_bytebuffer(6, 2);
    }
    
    public ByteBuffer indices16InByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 6, 2);
    }
    
    public long indices32(final int j) {
        final int o = this.__offset(8);
        return (o != 0) ? ((long)this.bb.getInt(this.__vector(o) + j * 4) & 0xFFFFFFFFL) : 0L;
    }
    
    public int indices32Length() {
        final int o = this.__offset(8);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public ByteBuffer indices32AsByteBuffer() {
        return this.__vector_as_bytebuffer(8, 4);
    }
    
    public ByteBuffer indices32InByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 8, 4);
    }
    
    public pro.streem.ar.schemas.lull.ModelIndexRange ranges(final int j) {
        return this.ranges(new pro.streem.ar.schemas.lull.ModelIndexRange(), j);
    }
    
    public pro.streem.ar.schemas.lull.ModelIndexRange ranges(final ModelIndexRange obj, final int j) {
        final int o = this.__offset(10);
        return (o != 0) ? obj.__assign(this.__vector(o) + j * 8, this.bb) : null;
    }
    
    public int rangesLength() {
        final int o = this.__offset(10);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public pro.streem.ar.schemas.lull.MaterialDef materials(final int j) {
        return this.materials(new pro.streem.ar.schemas.lull.MaterialDef(), j);
    }
    
    public pro.streem.ar.schemas.lull.MaterialDef materials(final MaterialDef obj, final int j) {
        final int o = this.__offset(12);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int materialsLength() {
        final int o = this.__offset(12);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public VertexAttribute vertexAttributes(final int j) {
        return this.vertexAttributes(new VertexAttribute(), j);
    }
    
    public VertexAttribute vertexAttributes(final VertexAttribute obj, final int j) {
        final int o = this.__offset(14);
        return (o != 0) ? obj.__assign(this.__vector(o) + j * 8, this.bb) : null;
    }
    
    public int vertexAttributesLength() {
        final int o = this.__offset(14);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public long numVertices() {
        final int o = this.__offset(16);
        return (o != 0) ? ((long)this.bb.getInt(o + this.bb_pos) & 0xFFFFFFFFL) : 0L;
    }
    
    public boolean interleaved() {
        final int o = this.__offset(18);
        return o == 0 || 0 != this.bb.get(o + this.bb_pos);
    }
    
    public int shaderToMeshBones(final int j) {
        final int o = this.__offset(20);
        return (o != 0) ? (this.bb.get(this.__vector(o) + j * 1) & 0xFF) : 0;
    }
    
    public int shaderToMeshBonesLength() {
        final int o = this.__offset(20);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public ByteBuffer shaderToMeshBonesAsByteBuffer() {
        return this.__vector_as_bytebuffer(20, 1);
    }
    
    public ByteBuffer shaderToMeshBonesInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 20, 1);
    }
    
    public pro.streem.ar.schemas.lull.BlendShape blendShapes(final int j) {
        return this.blendShapes(new pro.streem.ar.schemas.lull.BlendShape(), j);
    }
    
    public pro.streem.ar.schemas.lull.BlendShape blendShapes(final BlendShape obj, final int j) {
        final int o = this.__offset(22);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int blendShapesLength() {
        final int o = this.__offset(22);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public VertexAttribute blendAttributes(final int j) {
        return this.blendAttributes(new VertexAttribute(), j);
    }
    
    public VertexAttribute blendAttributes(final VertexAttribute obj, final int j) {
        final int o = this.__offset(24);
        return (o != 0) ? obj.__assign(this.__vector(o) + j * 8, this.bb) : null;
    }
    
    public int blendAttributesLength() {
        final int o = this.__offset(24);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public pro.streem.ar.schemas.lull.SubmeshAabb aabbs(final int j) {
        return this.aabbs(new pro.streem.ar.schemas.lull.SubmeshAabb(), j);
    }
    
    public pro.streem.ar.schemas.lull.SubmeshAabb aabbs(final SubmeshAabb obj, final int j) {
        final int o = this.__offset(26);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int aabbsLength() {
        final int o = this.__offset(26);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public static int createModelInstanceDef(final FlatBufferBuilder builder, final int vertex_dataOffset, final int indices16Offset, final int indices32Offset, final int rangesOffset, final int materialsOffset, final int vertex_attributesOffset, final long num_vertices, final boolean interleaved, final int shader_to_mesh_bonesOffset, final int blend_shapesOffset, final int blend_attributesOffset, final int aabbsOffset) {
        builder.startObject(12);
        addAabbs(builder, aabbsOffset);
        addBlendAttributes(builder, blend_attributesOffset);
        addBlendShapes(builder, blend_shapesOffset);
        addShaderToMeshBones(builder, shader_to_mesh_bonesOffset);
        addNumVertices(builder, num_vertices);
        addVertexAttributes(builder, vertex_attributesOffset);
        addMaterials(builder, materialsOffset);
        addRanges(builder, rangesOffset);
        addIndices32(builder, indices32Offset);
        addIndices16(builder, indices16Offset);
        addVertexData(builder, vertex_dataOffset);
        addInterleaved(builder, interleaved);
        return endModelInstanceDef(builder);
    }
    
    public static void startModelInstanceDef(final FlatBufferBuilder builder) {
        builder.startObject(12);
    }
    
    public static void addVertexData(final FlatBufferBuilder builder, final int vertexDataOffset) {
        builder.addOffset(0, vertexDataOffset, 0);
    }
    
    public static int createVertexDataVector(final FlatBufferBuilder builder, final byte[] data) {
        return builder.createByteVector(data);
    }
    
    public static int createVertexDataVector(final FlatBufferBuilder builder, final ByteBuffer data) {
        return builder.createByteVector(data);
    }
    
    public static void startVertexDataVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(1, numElems, 1);
    }
    
    public static void addIndices16(final FlatBufferBuilder builder, final int indices16Offset) {
        builder.addOffset(1, indices16Offset, 0);
    }
    
    public static int createIndices16Vector(final FlatBufferBuilder builder, final short[] data) {
        builder.startVector(2, data.length, 2);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addShort(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startIndices16Vector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(2, numElems, 2);
    }
    
    public static void addIndices32(final FlatBufferBuilder builder, final int indices32Offset) {
        builder.addOffset(2, indices32Offset, 0);
    }
    
    public static int createIndices32Vector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addInt(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startIndices32Vector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static void addRanges(final FlatBufferBuilder builder, final int rangesOffset) {
        builder.addOffset(3, rangesOffset, 0);
    }
    
    public static void startRangesVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(8, numElems, 4);
    }
    
    public static void addMaterials(final FlatBufferBuilder builder, final int materialsOffset) {
        builder.addOffset(4, materialsOffset, 0);
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
    
    public static void addVertexAttributes(final FlatBufferBuilder builder, final int vertexAttributesOffset) {
        builder.addOffset(5, vertexAttributesOffset, 0);
    }
    
    public static void startVertexAttributesVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(8, numElems, 4);
    }
    
    public static void addNumVertices(final FlatBufferBuilder builder, final long numVertices) {
        builder.addInt(6, (int)numVertices, 0);
    }
    
    public static void addInterleaved(final FlatBufferBuilder builder, final boolean interleaved) {
        builder.addBoolean(7, interleaved, true);
    }
    
    public static void addShaderToMeshBones(final FlatBufferBuilder builder, final int shaderToMeshBonesOffset) {
        builder.addOffset(8, shaderToMeshBonesOffset, 0);
    }
    
    public static int createShaderToMeshBonesVector(final FlatBufferBuilder builder, final byte[] data) {
        return builder.createByteVector(data);
    }
    
    public static int createShaderToMeshBonesVector(final FlatBufferBuilder builder, final ByteBuffer data) {
        return builder.createByteVector(data);
    }
    
    public static void startShaderToMeshBonesVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(1, numElems, 1);
    }
    
    public static void addBlendShapes(final FlatBufferBuilder builder, final int blendShapesOffset) {
        builder.addOffset(9, blendShapesOffset, 0);
    }
    
    public static int createBlendShapesVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startBlendShapesVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static void addBlendAttributes(final FlatBufferBuilder builder, final int blendAttributesOffset) {
        builder.addOffset(10, blendAttributesOffset, 0);
    }
    
    public static void startBlendAttributesVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(8, numElems, 4);
    }
    
    public static void addAabbs(final FlatBufferBuilder builder, final int aabbsOffset) {
        builder.addOffset(11, aabbsOffset, 0);
    }
    
    public static int createAabbsVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startAabbsVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static int endModelInstanceDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
