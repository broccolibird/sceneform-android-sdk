// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class SamplerInit extends Table
{
    public static SamplerInit getRootAsSamplerInit(final ByteBuffer _bb) {
        return getRootAsSamplerInit(_bb, new SamplerInit());
    }
    
    public static SamplerInit getRootAsSamplerInit(final ByteBuffer _bb, final SamplerInit obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public SamplerInit __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public String path() {
        final int o = this.__offset(4);
        return (o != 0) ? this.__string(o + this.bb_pos) : null;
    }
    
    public ByteBuffer pathAsByteBuffer() {
        return this.__vector_as_bytebuffer(4, 1);
    }
    
    public ByteBuffer pathInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 4, 1);
    }
    
    public int usage() {
        final int o = this.__offset(6);
        return (o != 0) ? this.bb.getInt(o + this.bb_pos) : 0;
    }
    
    public static int createSamplerInit(final FlatBufferBuilder builder, final int pathOffset, final int usage) {
        builder.startObject(2);
        addUsage(builder, usage);
        addPath(builder, pathOffset);
        return endSamplerInit(builder);
    }
    
    public static void startSamplerInit(final FlatBufferBuilder builder) {
        builder.startObject(2);
    }
    
    public static void addPath(final FlatBufferBuilder builder, final int pathOffset) {
        builder.addOffset(0, pathOffset, 0);
    }
    
    public static void addUsage(final FlatBufferBuilder builder, final int usage) {
        builder.addInt(1, usage, 0);
    }
    
    public static int endSamplerInit(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
