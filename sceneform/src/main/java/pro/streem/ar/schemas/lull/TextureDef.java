// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class TextureDef extends Table
{
    public static TextureDef getRootAsTextureDef(final ByteBuffer _bb) {
        return getRootAsTextureDef(_bb, new TextureDef());
    }
    
    public static TextureDef getRootAsTextureDef(final ByteBuffer _bb, final TextureDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public TextureDef __assign(final int _i, final ByteBuffer _bb) {
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
    
    public boolean generateMipmaps() {
        final int o = this.__offset(10);
        return o != 0 && 0 != this.bb.get(o + this.bb_pos);
    }
    
    public boolean premultiplyAlpha() {
        final int o = this.__offset(12);
        return o != 0 && 0 != this.bb.get(o + this.bb_pos);
    }
    
    public int minFilter() {
        final int o = this.__offset(14);
        return (o != 0) ? (this.bb.getShort(o + this.bb_pos) & 0xFFFF) : 4;
    }
    
    public int magFilter() {
        final int o = this.__offset(16);
        return (o != 0) ? (this.bb.getShort(o + this.bb_pos) & 0xFFFF) : 1;
    }
    
    public int wrapS() {
        final int o = this.__offset(18);
        return (o != 0) ? (this.bb.getShort(o + this.bb_pos) & 0xFFFF) : 4;
    }
    
    public int wrapT() {
        final int o = this.__offset(20);
        return (o != 0) ? (this.bb.getShort(o + this.bb_pos) & 0xFFFF) : 4;
    }
    
    public int wrapR() {
        final int o = this.__offset(22);
        return (o != 0) ? (this.bb.getShort(o + this.bb_pos) & 0xFFFF) : 4;
    }
    
    public int targetType() {
        final int o = this.__offset(24);
        return (o != 0) ? (this.bb.getShort(o + this.bb_pos) & 0xFFFF) : 0;
    }
    
    public boolean isRgbm() {
        final int o = this.__offset(26);
        return o != 0 && 0 != this.bb.get(o + this.bb_pos);
    }
    
    public static int createTextureDef(final FlatBufferBuilder builder, final int nameOffset, final int fileOffset, final int dataOffset, final boolean generate_mipmaps, final boolean premultiply_alpha, final int min_filter, final int mag_filter, final int wrap_s, final int wrap_t, final int wrap_r, final int target_type, final boolean is_rgbm) {
        builder.startObject(12);
        addData(builder, dataOffset);
        addFile(builder, fileOffset);
        addName(builder, nameOffset);
        addTargetType(builder, target_type);
        addWrapR(builder, wrap_r);
        addWrapT(builder, wrap_t);
        addWrapS(builder, wrap_s);
        addMagFilter(builder, mag_filter);
        addMinFilter(builder, min_filter);
        addIsRgbm(builder, is_rgbm);
        addPremultiplyAlpha(builder, premultiply_alpha);
        addGenerateMipmaps(builder, generate_mipmaps);
        return endTextureDef(builder);
    }
    
    public static void startTextureDef(final FlatBufferBuilder builder) {
        builder.startObject(12);
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
    
    public static void addGenerateMipmaps(final FlatBufferBuilder builder, final boolean generateMipmaps) {
        builder.addBoolean(3, generateMipmaps, false);
    }
    
    public static void addPremultiplyAlpha(final FlatBufferBuilder builder, final boolean premultiplyAlpha) {
        builder.addBoolean(4, premultiplyAlpha, false);
    }
    
    public static void addMinFilter(final FlatBufferBuilder builder, final int minFilter) {
        builder.addShort(5, (short)minFilter, 4);
    }
    
    public static void addMagFilter(final FlatBufferBuilder builder, final int magFilter) {
        builder.addShort(6, (short)magFilter, 1);
    }
    
    public static void addWrapS(final FlatBufferBuilder builder, final int wrapS) {
        builder.addShort(7, (short)wrapS, 4);
    }
    
    public static void addWrapT(final FlatBufferBuilder builder, final int wrapT) {
        builder.addShort(8, (short)wrapT, 4);
    }
    
    public static void addWrapR(final FlatBufferBuilder builder, final int wrapR) {
        builder.addShort(9, (short)wrapR, 4);
    }
    
    public static void addTargetType(final FlatBufferBuilder builder, final int targetType) {
        builder.addShort(10, (short)targetType, 0);
    }
    
    public static void addIsRgbm(final FlatBufferBuilder builder, final boolean isRgbm) {
        builder.addBoolean(11, isRgbm, false);
    }
    
    public static int endTextureDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
