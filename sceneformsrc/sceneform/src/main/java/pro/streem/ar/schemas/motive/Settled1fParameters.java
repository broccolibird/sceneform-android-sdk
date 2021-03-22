// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.motive;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class Settled1fParameters extends Table
{
    public static Settled1fParameters getRootAsSettled1fParameters(final ByteBuffer _bb) {
        return getRootAsSettled1fParameters(_bb, new Settled1fParameters());
    }
    
    public static Settled1fParameters getRootAsSettled1fParameters(final ByteBuffer _bb, final Settled1fParameters obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public Settled1fParameters __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public float maxDifference() {
        final int o = this.__offset(4);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public float maxVelocity() {
        final int o = this.__offset(6);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public static int createSettled1fParameters(final FlatBufferBuilder builder, final float max_difference, final float max_velocity) {
        builder.startObject(2);
        addMaxVelocity(builder, max_velocity);
        addMaxDifference(builder, max_difference);
        return endSettled1fParameters(builder);
    }
    
    public static void startSettled1fParameters(final FlatBufferBuilder builder) {
        builder.startObject(2);
    }
    
    public static void addMaxDifference(final FlatBufferBuilder builder, final float maxDifference) {
        builder.addFloat(0, maxDifference, 0.0);
    }
    
    public static void addMaxVelocity(final FlatBufferBuilder builder, final float maxVelocity) {
        builder.addFloat(1, maxVelocity, 0.0);
    }
    
    public static int endSettled1fParameters(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
