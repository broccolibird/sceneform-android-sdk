// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.motive;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class TwitchParameters extends Table
{
    public static TwitchParameters getRootAsTwitchParameters(final ByteBuffer _bb) {
        return getRootAsTwitchParameters(_bb, new TwitchParameters());
    }
    
    public static TwitchParameters getRootAsTwitchParameters(final ByteBuffer _bb, final TwitchParameters obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public TwitchParameters __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public pro.streem.ar.schemas.motive.Settled1fParameters settled() {
        return this.settled(new pro.streem.ar.schemas.motive.Settled1fParameters());
    }
    
    public pro.streem.ar.schemas.motive.Settled1fParameters settled(final Settled1fParameters obj) {
        final int o = this.__offset(4);
        return (o != 0) ? obj.__assign(this.__indirect(o + this.bb_pos), this.bb) : null;
    }
    
    public static int createTwitchParameters(final FlatBufferBuilder builder, final int settledOffset) {
        builder.startObject(1);
        addSettled(builder, settledOffset);
        return endTwitchParameters(builder);
    }
    
    public static void startTwitchParameters(final FlatBufferBuilder builder) {
        builder.startObject(1);
    }
    
    public static void addSettled(final FlatBufferBuilder builder, final int settledOffset) {
        builder.addOffset(0, settledOffset, 0);
    }
    
    public static int endTwitchParameters(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
