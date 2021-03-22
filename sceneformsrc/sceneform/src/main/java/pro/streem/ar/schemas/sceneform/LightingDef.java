// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;

import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

import pro.streem.ar.schemas.lull.Vec3;

public final class LightingDef extends Table
{
    public static LightingDef getRootAsLightingDef(final ByteBuffer _bb) {
        return getRootAsLightingDef(_bb, new LightingDef());
    }
    
    public static LightingDef getRootAsLightingDef(final ByteBuffer _bb, final LightingDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public LightingDef __assign(final int _i, final ByteBuffer _bb) {
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
    
    public float scale() {
        final int o = this.__offset(6);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public pro.streem.ar.schemas.sceneform.LightingCubeDef cubeLevels(final int j) {
        return this.cubeLevels(new pro.streem.ar.schemas.sceneform.LightingCubeDef(), j);
    }
    
    public pro.streem.ar.schemas.sceneform.LightingCubeDef cubeLevels(final LightingCubeDef obj, final int j) {
        final int o = this.__offset(8);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int cubeLevelsLength() {
        final int o = this.__offset(8);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public pro.streem.ar.schemas.lull.Vec3 shCoefficients(final int j) {
        return this.shCoefficients(new pro.streem.ar.schemas.lull.Vec3(), j);
    }
    
    public pro.streem.ar.schemas.lull.Vec3 shCoefficients(final Vec3 obj, final int j) {
        final int o = this.__offset(10);
        return (o != 0) ? obj.__assign(this.__vector(o) + j * 12, this.bb) : null;
    }
    
    public int shCoefficientsLength() {
        final int o = this.__offset(10);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public static int createLightingDef(final FlatBufferBuilder builder, final int nameOffset, final float scale, final int cube_levelsOffset, final int sh_coefficientsOffset) {
        builder.startObject(4);
        addShCoefficients(builder, sh_coefficientsOffset);
        addCubeLevels(builder, cube_levelsOffset);
        addScale(builder, scale);
        addName(builder, nameOffset);
        return endLightingDef(builder);
    }
    
    public static void startLightingDef(final FlatBufferBuilder builder) {
        builder.startObject(4);
    }
    
    public static void addName(final FlatBufferBuilder builder, final int nameOffset) {
        builder.addOffset(0, nameOffset, 0);
    }
    
    public static void addScale(final FlatBufferBuilder builder, final float scale) {
        builder.addFloat(1, scale, 0.0);
    }
    
    public static void addCubeLevels(final FlatBufferBuilder builder, final int cubeLevelsOffset) {
        builder.addOffset(2, cubeLevelsOffset, 0);
    }
    
    public static int createCubeLevelsVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startCubeLevelsVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static void addShCoefficients(final FlatBufferBuilder builder, final int shCoefficientsOffset) {
        builder.addOffset(3, shCoefficientsOffset, 0);
    }
    
    public static void startShCoefficientsVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(12, numElems, 4);
    }
    
    public static int endLightingDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
