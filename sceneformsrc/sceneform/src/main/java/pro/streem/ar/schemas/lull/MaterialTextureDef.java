// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class MaterialTextureDef extends Table
{
    public static MaterialTextureDef getRootAsMaterialTextureDef(final ByteBuffer _bb) {
        return getRootAsMaterialTextureDef(_bb, new MaterialTextureDef());
    }
    
    public static MaterialTextureDef getRootAsMaterialTextureDef(final ByteBuffer _bb, final MaterialTextureDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public MaterialTextureDef __assign(final int _i, final ByteBuffer _bb) {
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
    
    public int usage() {
        final int o = this.__offset(6);
        return (o != 0) ? this.bb.getInt(o + this.bb_pos) : 0;
    }
    
    public int usagePerChannel(final int j) {
        final int o = this.__offset(8);
        return (o != 0) ? this.bb.getInt(this.__vector(o) + j * 4) : 0;
    }
    
    public int usagePerChannelLength() {
        final int o = this.__offset(8);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public ByteBuffer usagePerChannelAsByteBuffer() {
        return this.__vector_as_bytebuffer(8, 4);
    }
    
    public ByteBuffer usagePerChannelInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 8, 4);
    }
    
    public static int createMaterialTextureDef(final FlatBufferBuilder builder, final int nameOffset, final int usage, final int usage_per_channelOffset) {
        builder.startObject(3);
        addUsagePerChannel(builder, usage_per_channelOffset);
        addUsage(builder, usage);
        addName(builder, nameOffset);
        return endMaterialTextureDef(builder);
    }
    
    public static void startMaterialTextureDef(final FlatBufferBuilder builder) {
        builder.startObject(3);
    }
    
    public static void addName(final FlatBufferBuilder builder, final int nameOffset) {
        builder.addOffset(0, nameOffset, 0);
    }
    
    public static void addUsage(final FlatBufferBuilder builder, final int usage) {
        builder.addInt(1, usage, 0);
    }
    
    public static void addUsagePerChannel(final FlatBufferBuilder builder, final int usagePerChannelOffset) {
        builder.addOffset(2, usagePerChannelOffset, 0);
    }
    
    public static int createUsagePerChannelVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addInt(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startUsagePerChannelVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static int endMaterialTextureDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
