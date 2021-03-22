// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class RuntimeAssetDef extends Table
{
    public static RuntimeAssetDef getRootAsRuntimeAssetDef(final ByteBuffer _bb) {
        return getRootAsRuntimeAssetDef(_bb, new RuntimeAssetDef());
    }
    
    public static RuntimeAssetDef getRootAsRuntimeAssetDef(final ByteBuffer _bb, final RuntimeAssetDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public RuntimeAssetDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public int renderFlags() {
        final int o = this.__offset(4);
        return (o != 0) ? (this.bb.get(o + this.bb_pos) & 0xFF) : 0;
    }
    
    public int renderPriority() {
        final int o = this.__offset(6);
        return (o != 0) ? (this.bb.get(o + this.bb_pos) & 0xFF) : 4;
    }
    
    public static int createRuntimeAssetDef(final FlatBufferBuilder builder, final int render_flags, final int render_priority) {
        builder.startObject(2);
        addRenderPriority(builder, render_priority);
        addRenderFlags(builder, render_flags);
        return endRuntimeAssetDef(builder);
    }
    
    public static void startRuntimeAssetDef(final FlatBufferBuilder builder) {
        builder.startObject(2);
    }
    
    public static void addRenderFlags(final FlatBufferBuilder builder, final int renderFlags) {
        builder.addByte(0, (byte)renderFlags, 0);
    }
    
    public static void addRenderPriority(final FlatBufferBuilder builder, final int renderPriority) {
        builder.addByte(1, (byte)renderPriority, 4);
    }
    
    public static int endRuntimeAssetDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
