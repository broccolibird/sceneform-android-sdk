// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class BlendShape extends Table
{
    public static BlendShape getRootAsBlendShape(final ByteBuffer _bb) {
        return getRootAsBlendShape(_bb, new BlendShape());
    }
    
    public static BlendShape getRootAsBlendShape(final ByteBuffer _bb, final BlendShape obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public BlendShape __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public long name() {
        final int o = this.__offset(4);
        return (o != 0) ? ((long)this.bb.getInt(o + this.bb_pos) & 0xFFFFFFFFL) : 0L;
    }
    
    public int vertexData(final int j) {
        final int o = this.__offset(6);
        return (o != 0) ? (this.bb.get(this.__vector(o) + j * 1) & 0xFF) : 0;
    }
    
    public int vertexDataLength() {
        final int o = this.__offset(6);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public ByteBuffer vertexDataAsByteBuffer() {
        return this.__vector_as_bytebuffer(6, 1);
    }
    
    public ByteBuffer vertexDataInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 6, 1);
    }
    
    public long vertexIndices32(final int j) {
        final int o = this.__offset(8);
        return (o != 0) ? ((long)this.bb.getInt(this.__vector(o) + j * 4) & 0xFFFFFFFFL) : 0L;
    }
    
    public int vertexIndices32Length() {
        final int o = this.__offset(8);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public ByteBuffer vertexIndices32AsByteBuffer() {
        return this.__vector_as_bytebuffer(8, 4);
    }
    
    public ByteBuffer vertexIndices32InByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 8, 4);
    }
    
    public int vertexIndices16(final int j) {
        final int o = this.__offset(10);
        return (o != 0) ? (this.bb.getShort(this.__vector(o) + j * 2) & 0xFFFF) : 0;
    }
    
    public int vertexIndices16Length() {
        final int o = this.__offset(10);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public ByteBuffer vertexIndices16AsByteBuffer() {
        return this.__vector_as_bytebuffer(10, 2);
    }
    
    public ByteBuffer vertexIndices16InByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 10, 2);
    }
    
    public int tangentData(final int j) {
        final int o = this.__offset(12);
        return (o != 0) ? (this.bb.get(this.__vector(o) + j * 1) & 0xFF) : 0;
    }
    
    public int tangentDataLength() {
        final int o = this.__offset(12);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public ByteBuffer tangentDataAsByteBuffer() {
        return this.__vector_as_bytebuffer(12, 1);
    }
    
    public ByteBuffer tangentDataInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 12, 1);
    }
    
    public long tangentIndices32(final int j) {
        final int o = this.__offset(14);
        return (o != 0) ? ((long)this.bb.getInt(this.__vector(o) + j * 4) & 0xFFFFFFFFL) : 0L;
    }
    
    public int tangentIndices32Length() {
        final int o = this.__offset(14);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public ByteBuffer tangentIndices32AsByteBuffer() {
        return this.__vector_as_bytebuffer(14, 4);
    }
    
    public ByteBuffer tangentIndices32InByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 14, 4);
    }
    
    public int tangentIndices16(final int j) {
        final int o = this.__offset(16);
        return (o != 0) ? (this.bb.getShort(this.__vector(o) + j * 2) & 0xFFFF) : 0;
    }
    
    public int tangentIndices16Length() {
        final int o = this.__offset(16);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public ByteBuffer tangentIndices16AsByteBuffer() {
        return this.__vector_as_bytebuffer(16, 2);
    }
    
    public ByteBuffer tangentIndices16InByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 16, 2);
    }
    
    public static int createBlendShape(final FlatBufferBuilder builder, final long name, final int vertex_dataOffset, final int vertex_indices32Offset, final int vertex_indices16Offset, final int tangent_dataOffset, final int tangent_indices32Offset, final int tangent_indices16Offset) {
        builder.startObject(7);
        addTangentIndices16(builder, tangent_indices16Offset);
        addTangentIndices32(builder, tangent_indices32Offset);
        addTangentData(builder, tangent_dataOffset);
        addVertexIndices16(builder, vertex_indices16Offset);
        addVertexIndices32(builder, vertex_indices32Offset);
        addVertexData(builder, vertex_dataOffset);
        addName(builder, name);
        return endBlendShape(builder);
    }
    
    public static void startBlendShape(final FlatBufferBuilder builder) {
        builder.startObject(7);
    }
    
    public static void addName(final FlatBufferBuilder builder, final long name) {
        builder.addInt(0, (int)name, 0);
    }
    
    public static void addVertexData(final FlatBufferBuilder builder, final int vertexDataOffset) {
        builder.addOffset(1, vertexDataOffset, 0);
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
    
    public static void addVertexIndices32(final FlatBufferBuilder builder, final int vertexIndices32Offset) {
        builder.addOffset(2, vertexIndices32Offset, 0);
    }
    
    public static int createVertexIndices32Vector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addInt(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startVertexIndices32Vector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static void addVertexIndices16(final FlatBufferBuilder builder, final int vertexIndices16Offset) {
        builder.addOffset(3, vertexIndices16Offset, 0);
    }
    
    public static int createVertexIndices16Vector(final FlatBufferBuilder builder, final short[] data) {
        builder.startVector(2, data.length, 2);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addShort(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startVertexIndices16Vector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(2, numElems, 2);
    }
    
    public static void addTangentData(final FlatBufferBuilder builder, final int tangentDataOffset) {
        builder.addOffset(4, tangentDataOffset, 0);
    }
    
    public static int createTangentDataVector(final FlatBufferBuilder builder, final byte[] data) {
        return builder.createByteVector(data);
    }
    
    public static int createTangentDataVector(final FlatBufferBuilder builder, final ByteBuffer data) {
        return builder.createByteVector(data);
    }
    
    public static void startTangentDataVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(1, numElems, 1);
    }
    
    public static void addTangentIndices32(final FlatBufferBuilder builder, final int tangentIndices32Offset) {
        builder.addOffset(5, tangentIndices32Offset, 0);
    }
    
    public static int createTangentIndices32Vector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addInt(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startTangentIndices32Vector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static void addTangentIndices16(final FlatBufferBuilder builder, final int tangentIndices16Offset) {
        builder.addOffset(6, tangentIndices16Offset, 0);
    }
    
    public static int createTangentIndices16Vector(final FlatBufferBuilder builder, final short[] data) {
        builder.startVector(2, data.length, 2);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addShort(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startTangentIndices16Vector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(2, numElems, 2);
    }
    
    public static int endBlendShape(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
