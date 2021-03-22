// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class SamplerDef extends Table
{
    public static SamplerDef getRootAsSamplerDef(final ByteBuffer _bb) {
        return getRootAsSamplerDef(_bb, new SamplerDef());
    }
    
    public static SamplerDef getRootAsSamplerDef(final ByteBuffer _bb, final SamplerDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public SamplerDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public String name() {
        final int o = this.__offset(4);
        return (o != 0) ? this.__string(o + this.bb_pos) : null;
    }
    
    public ByteBuffer nameAsByteBuffer() {
        return this.__vector_as_bytebuffer(4, 1);
    }
    
    public ByteBuffer nameInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 4, 1);
    }
    
    public String file() {
        final int o = this.__offset(6);
        return (o != 0) ? this.__string(o + this.bb_pos) : null;
    }
    
    public ByteBuffer fileAsByteBuffer() {
        return this.__vector_as_bytebuffer(6, 1);
    }
    
    public ByteBuffer fileInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 6, 1);
    }
    
    public int data(final int j) {
        final int o = this.__offset(8);
        return (o != 0) ? (this.bb.get(this.__vector(o) + j * 1) & 0xFF) : 0;
    }
    
    public int dataLength() {
        final int o = this.__offset(8);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public ByteBuffer dataAsByteBuffer() {
        return this.__vector_as_bytebuffer(8, 1);
    }
    
    public ByteBuffer dataInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 8, 1);
    }
    
    public SamplerParamsDef params() {
        return this.params(new SamplerParamsDef());
    }
    
    public SamplerParamsDef params(final SamplerParamsDef obj) {
        final int o = this.__offset(10);
        return (o != 0) ? obj.__assign(this.__indirect(o + this.bb_pos), this.bb) : null;
    }
    
    public static int createSamplerDef(final FlatBufferBuilder builder, final int nameOffset, final int fileOffset, final int dataOffset, final int paramsOffset) {
        builder.startObject(4);
        addParams(builder, paramsOffset);
        addData(builder, dataOffset);
        addFile(builder, fileOffset);
        addName(builder, nameOffset);
        return endSamplerDef(builder);
    }
    
    public static void startSamplerDef(final FlatBufferBuilder builder) {
        builder.startObject(4);
    }
    
    public static void addName(final FlatBufferBuilder builder, final int nameOffset) {
        builder.addOffset(0, nameOffset, 0);
    }
    
    public static void addFile(final FlatBufferBuilder builder, final int fileOffset) {
        builder.addOffset(1, fileOffset, 0);
    }
    
    public static void addData(final FlatBufferBuilder builder, final int dataOffset) {
        builder.addOffset(2, dataOffset, 0);
    }
    
    public static int createDataVector(final FlatBufferBuilder builder, final byte[] data) {
        return builder.createByteVector(data);
    }
    
    public static int createDataVector(final FlatBufferBuilder builder, final ByteBuffer data) {
        return builder.createByteVector(data);
    }
    
    public static void startDataVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(1, numElems, 1);
    }
    
    public static void addParams(final FlatBufferBuilder builder, final int paramsOffset) {
        builder.addOffset(3, paramsOffset, 0);
    }
    
    public static int endSamplerDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
