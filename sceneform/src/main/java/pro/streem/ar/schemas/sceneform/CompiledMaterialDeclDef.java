// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class CompiledMaterialDeclDef extends Table
{
    public static CompiledMaterialDeclDef getRootAsCompiledMaterialDeclDef(final ByteBuffer _bb) {
        return getRootAsCompiledMaterialDeclDef(_bb, new CompiledMaterialDeclDef());
    }
    
    public static CompiledMaterialDeclDef getRootAsCompiledMaterialDeclDef(final ByteBuffer _bb, final CompiledMaterialDeclDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public CompiledMaterialDeclDef __assign(final int _i, final ByteBuffer _bb) {
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
    
    public String matSha1sum() {
        final int o = this.__offset(6);
        return (o != 0) ? this.__string(o + this.bb_pos) : null;
    }
    
    public ByteBuffer matSha1sumAsByteBuffer() {
        return this.__vector_as_bytebuffer(6, 1);
    }
    
    public ByteBuffer matSha1sumInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 6, 1);
    }
    
    public static int createCompiledMaterialDeclDef(final FlatBufferBuilder builder, final int sourceOffset, final int mat_sha1sumOffset) {
        builder.startObject(2);
        addMatSha1sum(builder, mat_sha1sumOffset);
        addSource(builder, sourceOffset);
        return endCompiledMaterialDeclDef(builder);
    }
    
    public static void startCompiledMaterialDeclDef(final FlatBufferBuilder builder) {
        builder.startObject(2);
    }
    
    public static void addSource(final FlatBufferBuilder builder, final int sourceOffset) {
        builder.addOffset(0, sourceOffset, 0);
    }
    
    public static void addMatSha1sum(final FlatBufferBuilder builder, final int matSha1sumOffset) {
        builder.addOffset(1, matSha1sumOffset, 0);
    }
    
    public static int endCompiledMaterialDeclDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
