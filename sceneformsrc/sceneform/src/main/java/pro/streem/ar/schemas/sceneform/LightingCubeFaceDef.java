// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class LightingCubeFaceDef extends Table
{
    public static LightingCubeFaceDef getRootAsLightingCubeFaceDef(final ByteBuffer _bb) {
        return getRootAsLightingCubeFaceDef(_bb, new LightingCubeFaceDef());
    }
    
    public static LightingCubeFaceDef getRootAsLightingCubeFaceDef(final ByteBuffer _bb, final LightingCubeFaceDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public LightingCubeFaceDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public int data(final int j) {
        final int o = this.__offset(4);
        return (o != 0) ? (this.bb.get(this.__vector(o) + j * 1) & 0xFF) : 0;
    }
    
    public int dataLength() {
        final int o = this.__offset(4);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public ByteBuffer dataAsByteBuffer() {
        return this.__vector_as_bytebuffer(4, 1);
    }
    
    public ByteBuffer dataInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 4, 1);
    }
    
    public static int createLightingCubeFaceDef(final FlatBufferBuilder builder, final int dataOffset) {
        builder.startObject(1);
        addData(builder, dataOffset);
        return endLightingCubeFaceDef(builder);
    }
    
    public static void startLightingCubeFaceDef(final FlatBufferBuilder builder) {
        builder.startObject(1);
    }
    
    public static void addData(final FlatBufferBuilder builder, final int dataOffset) {
        builder.addOffset(0, dataOffset, 0);
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
    
    public static int endLightingCubeFaceDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
