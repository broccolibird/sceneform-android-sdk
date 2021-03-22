// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.motive;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class OvershootParameters extends Table
{
    public static OvershootParameters getRootAsOvershootParameters(final ByteBuffer _bb) {
        return getRootAsOvershootParameters(_bb, new OvershootParameters());
    }
    
    public static OvershootParameters getRootAsOvershootParameters(final ByteBuffer _bb, final OvershootParameters obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public OvershootParameters __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public pro.streem.ar.schemas.motive.ModularParameters base() {
        return this.base(new pro.streem.ar.schemas.motive.ModularParameters());
    }
    
    public pro.streem.ar.schemas.motive.ModularParameters base(final ModularParameters obj) {
        final int o = this.__offset(4);
        return (o != 0) ? obj.__assign(this.__indirect(o + this.bb_pos), this.bb) : null;
    }
    
    public float maxVelocity() {
        final int o = this.__offset(6);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public float maxDelta() {
        final int o = this.__offset(8);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public pro.streem.ar.schemas.motive.Settled1fParameters atTarget() {
        return this.atTarget(new pro.streem.ar.schemas.motive.Settled1fParameters());
    }
    
    public pro.streem.ar.schemas.motive.Settled1fParameters atTarget(final Settled1fParameters obj) {
        final int o = this.__offset(10);
        return (o != 0) ? obj.__assign(this.__indirect(o + this.bb_pos), this.bb) : null;
    }
    
    public float accelerationPerDifference() {
        final int o = this.__offset(12);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public float wrongDirectionAccelerationMultiplier() {
        final int o = this.__offset(14);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public short maxDeltaTime() {
        final int o = this.__offset(16);
        return (short)((o != 0) ? this.bb.getShort(o + this.bb_pos) : 32767);
    }
    
    public static int createOvershootParameters(final FlatBufferBuilder builder, final int baseOffset, final float max_velocity, final float max_delta, final int at_targetOffset, final float acceleration_per_difference, final float wrong_direction_acceleration_multiplier, final short max_delta_time) {
        builder.startObject(7);
        addWrongDirectionAccelerationMultiplier(builder, wrong_direction_acceleration_multiplier);
        addAccelerationPerDifference(builder, acceleration_per_difference);
        addAtTarget(builder, at_targetOffset);
        addMaxDelta(builder, max_delta);
        addMaxVelocity(builder, max_velocity);
        addBase(builder, baseOffset);
        addMaxDeltaTime(builder, max_delta_time);
        return endOvershootParameters(builder);
    }
    
    public static void startOvershootParameters(final FlatBufferBuilder builder) {
        builder.startObject(7);
    }
    
    public static void addBase(final FlatBufferBuilder builder, final int baseOffset) {
        builder.addOffset(0, baseOffset, 0);
    }
    
    public static void addMaxVelocity(final FlatBufferBuilder builder, final float maxVelocity) {
        builder.addFloat(1, maxVelocity, 0.0);
    }
    
    public static void addMaxDelta(final FlatBufferBuilder builder, final float maxDelta) {
        builder.addFloat(2, maxDelta, 0.0);
    }
    
    public static void addAtTarget(final FlatBufferBuilder builder, final int atTargetOffset) {
        builder.addOffset(3, atTargetOffset, 0);
    }
    
    public static void addAccelerationPerDifference(final FlatBufferBuilder builder, final float accelerationPerDifference) {
        builder.addFloat(4, accelerationPerDifference, 0.0);
    }
    
    public static void addWrongDirectionAccelerationMultiplier(final FlatBufferBuilder builder, final float wrongDirectionAccelerationMultiplier) {
        builder.addFloat(5, wrongDirectionAccelerationMultiplier, 0.0);
    }
    
    public static void addMaxDeltaTime(final FlatBufferBuilder builder, final short maxDeltaTime) {
        builder.addShort(6, maxDeltaTime, 32767);
    }
    
    public static int endOvershootParameters(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
