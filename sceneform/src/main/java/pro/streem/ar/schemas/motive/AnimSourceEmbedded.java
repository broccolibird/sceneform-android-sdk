// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.motive;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class AnimSourceEmbedded extends Table
{
    public static AnimSourceEmbedded getRootAsAnimSourceEmbedded(final ByteBuffer _bb) {
        return getRootAsAnimSourceEmbedded(_bb, new AnimSourceEmbedded());
    }
    
    public static AnimSourceEmbedded getRootAsAnimSourceEmbedded(final ByteBuffer _bb, final AnimSourceEmbedded obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public AnimSourceEmbedded __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public pro.streem.ar.schemas.motive.RigAnimFb embedded() {
        return this.embedded(new pro.streem.ar.schemas.motive.RigAnimFb());
    }
    
    public pro.streem.ar.schemas.motive.RigAnimFb embedded(final RigAnimFb obj) {
        final int o = this.__offset(4);
        return (o != 0) ? obj.__assign(this.__indirect(o + this.bb_pos), this.bb) : null;
    }
    
    public static int createAnimSourceEmbedded(final FlatBufferBuilder builder, final int embeddedOffset) {
        builder.startObject(1);
        addEmbedded(builder, embeddedOffset);
        return endAnimSourceEmbedded(builder);
    }
    
    public static void startAnimSourceEmbedded(final FlatBufferBuilder builder) {
        builder.startObject(1);
    }
    
    public static void addEmbedded(final FlatBufferBuilder builder, final int embeddedOffset) {
        builder.addOffset(0, embeddedOffset, 0);
    }
    
    public static int endAnimSourceEmbedded(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
