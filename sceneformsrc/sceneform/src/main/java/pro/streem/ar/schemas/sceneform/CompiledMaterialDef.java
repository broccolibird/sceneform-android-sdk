// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class CompiledMaterialDef extends Table
{
    public static CompiledMaterialDef getRootAsCompiledMaterialDef(final ByteBuffer _bb) {
        return getRootAsCompiledMaterialDef(_bb, new CompiledMaterialDef());
    }
    
    public static CompiledMaterialDef getRootAsCompiledMaterialDef(final ByteBuffer _bb, final CompiledMaterialDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public CompiledMaterialDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public int compiledMaterial(final int j) {
        final int o = this.__offset(4);
        return (o != 0) ? (this.bb.get(this.__vector(o) + j * 1) & 0xFF) : 0;
    }
    
    public int compiledMaterialLength() {
        final int o = this.__offset(4);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public ByteBuffer compiledMaterialAsByteBuffer() {
        return this.__vector_as_bytebuffer(4, 1);
    }
    
    public ByteBuffer compiledMaterialInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 4, 1);
    }
    
    public String sha1sum() {
        final int o = this.__offset(6);
        return (o != 0) ? this.__string(o + this.bb_pos) : null;
    }
    
    public ByteBuffer sha1sumAsByteBuffer() {
        return this.__vector_as_bytebuffer(6, 1);
    }
    
    public ByteBuffer sha1sumInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 6, 1);
    }
    
    public CompiledMaterialDeclDef decl() {
        return this.decl(new CompiledMaterialDeclDef());
    }
    
    public CompiledMaterialDeclDef decl(final CompiledMaterialDeclDef obj) {
        final int o = this.__offset(8);
        return (o != 0) ? obj.__assign(this.__indirect(o + this.bb_pos), this.bb) : null;
    }
    
    public String compressedMaterial() {
        final int o = this.__offset(10);
        return (o != 0) ? this.__string(o + this.bb_pos) : null;
    }
    
    public ByteBuffer compressedMaterialAsByteBuffer() {
        return this.__vector_as_bytebuffer(10, 1);
    }
    
    public ByteBuffer compressedMaterialInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 10, 1);
    }
    
    public static int createCompiledMaterialDef(final FlatBufferBuilder builder, final int compiled_materialOffset, final int sha1sumOffset, final int declOffset, final int compressed_materialOffset) {
        builder.startObject(4);
        addCompressedMaterial(builder, compressed_materialOffset);
        addDecl(builder, declOffset);
        addSha1sum(builder, sha1sumOffset);
        addCompiledMaterial(builder, compiled_materialOffset);
        return endCompiledMaterialDef(builder);
    }
    
    public static void startCompiledMaterialDef(final FlatBufferBuilder builder) {
        builder.startObject(4);
    }
    
    public static void addCompiledMaterial(final FlatBufferBuilder builder, final int compiledMaterialOffset) {
        builder.addOffset(0, compiledMaterialOffset, 0);
    }
    
    public static int createCompiledMaterialVector(final FlatBufferBuilder builder, final byte[] data) {
        return builder.createByteVector(data);
    }
    
    public static int createCompiledMaterialVector(final FlatBufferBuilder builder, final ByteBuffer data) {
        return builder.createByteVector(data);
    }
    
    public static void startCompiledMaterialVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(1, numElems, 1);
    }
    
    public static void addSha1sum(final FlatBufferBuilder builder, final int sha1sumOffset) {
        builder.addOffset(1, sha1sumOffset, 0);
    }
    
    public static void addDecl(final FlatBufferBuilder builder, final int declOffset) {
        builder.addOffset(2, declOffset, 0);
    }
    
    public static void addCompressedMaterial(final FlatBufferBuilder builder, final int compressedMaterialOffset) {
        builder.addOffset(3, compressedMaterialOffset, 0);
    }
    
    public static int endCompiledMaterialDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
