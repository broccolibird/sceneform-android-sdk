// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class SamplerParamsDef extends Table
{
    public static SamplerParamsDef getRootAsSamplerParamsDef(final ByteBuffer _bb) {
        return getRootAsSamplerParamsDef(_bb, new SamplerParamsDef());
    }
    
    public static SamplerParamsDef getRootAsSamplerParamsDef(final ByteBuffer _bb, final SamplerParamsDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public SamplerParamsDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public int usageType() {
        final int o = this.__offset(4);
        return (o != 0) ? (this.bb.getShort(o + this.bb_pos) & 0xFFFF) : 0;
    }
    
    public int magFilter() {
        final int o = this.__offset(6);
        return (o != 0) ? (this.bb.getShort(o + this.bb_pos) & 0xFFFF) : 0;
    }
    
    public int minFilter() {
        final int o = this.__offset(8);
        return (o != 0) ? (this.bb.getShort(o + this.bb_pos) & 0xFFFF) : 0;
    }
    
    public int wrapS() {
        final int o = this.__offset(10);
        return (o != 0) ? (this.bb.getShort(o + this.bb_pos) & 0xFFFF) : 0;
    }
    
    public int wrapT() {
        final int o = this.__offset(12);
        return (o != 0) ? (this.bb.getShort(o + this.bb_pos) & 0xFFFF) : 0;
    }
    
    public int wrapR() {
        final int o = this.__offset(14);
        return (o != 0) ? (this.bb.getShort(o + this.bb_pos) & 0xFFFF) : 0;
    }
    
    public int anisotropyLog2() {
        final int o = this.__offset(16);
        return (o != 0) ? (this.bb.get(o + this.bb_pos) & 0xFF) : 0;
    }
    
    public int compareMode() {
        final int o = this.__offset(18);
        return (o != 0) ? (this.bb.getShort(o + this.bb_pos) & 0xFFFF) : 0;
    }
    
    public int compareFunc() {
        final int o = this.__offset(20);
        return (o != 0) ? (this.bb.getShort(o + this.bb_pos) & 0xFFFF) : 0;
    }
    
    public static int createSamplerParamsDef(final FlatBufferBuilder builder, final int usage_type, final int mag_filter, final int min_filter, final int wrap_s, final int wrap_t, final int wrap_r, final int anisotropy_log2, final int compare_mode, final int compare_func) {
        builder.startObject(9);
        addCompareFunc(builder, compare_func);
        addCompareMode(builder, compare_mode);
        addWrapR(builder, wrap_r);
        addWrapT(builder, wrap_t);
        addWrapS(builder, wrap_s);
        addMinFilter(builder, min_filter);
        addMagFilter(builder, mag_filter);
        addUsageType(builder, usage_type);
        addAnisotropyLog2(builder, anisotropy_log2);
        return endSamplerParamsDef(builder);
    }
    
    public static void startSamplerParamsDef(final FlatBufferBuilder builder) {
        builder.startObject(9);
    }
    
    public static void addUsageType(final FlatBufferBuilder builder, final int usageType) {
        builder.addShort(0, (short)usageType, 0);
    }
    
    public static void addMagFilter(final FlatBufferBuilder builder, final int magFilter) {
        builder.addShort(1, (short)magFilter, 0);
    }
    
    public static void addMinFilter(final FlatBufferBuilder builder, final int minFilter) {
        builder.addShort(2, (short)minFilter, 0);
    }
    
    public static void addWrapS(final FlatBufferBuilder builder, final int wrapS) {
        builder.addShort(3, (short)wrapS, 0);
    }
    
    public static void addWrapT(final FlatBufferBuilder builder, final int wrapT) {
        builder.addShort(4, (short)wrapT, 0);
    }
    
    public static void addWrapR(final FlatBufferBuilder builder, final int wrapR) {
        builder.addShort(5, (short)wrapR, 0);
    }
    
    public static void addAnisotropyLog2(final FlatBufferBuilder builder, final int anisotropyLog2) {
        builder.addByte(6, (byte)anisotropyLog2, 0);
    }
    
    public static void addCompareMode(final FlatBufferBuilder builder, final int compareMode) {
        builder.addShort(7, (short)compareMode, 0);
    }
    
    public static void addCompareFunc(final FlatBufferBuilder builder, final int compareFunc) {
        builder.addShort(8, (short)compareFunc, 0);
    }
    
    public static int endSamplerParamsDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
