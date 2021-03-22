// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class KeyVariantPairDef extends Table
{
    public static KeyVariantPairDef getRootAsKeyVariantPairDef(final ByteBuffer _bb) {
        return getRootAsKeyVariantPairDef(_bb, new KeyVariantPairDef());
    }
    
    public static KeyVariantPairDef getRootAsKeyVariantPairDef(final ByteBuffer _bb, final KeyVariantPairDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public KeyVariantPairDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public String key() {
        final int o = this.__offset(4);
        return (o != 0) ? this.__string(o + this.bb_pos) : null;
    }
    
    public ByteBuffer keyAsByteBuffer() {
        return this.__vector_as_bytebuffer(4, 1);
    }
    
    public ByteBuffer keyInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 4, 1);
    }
    
    public long hashKey() {
        final int o = this.__offset(6);
        return (o != 0) ? ((long)this.bb.getInt(o + this.bb_pos) & 0xFFFFFFFFL) : 0L;
    }
    
    public byte valueType() {
        final int o = this.__offset(8);
        return (byte)((o != 0) ? this.bb.get(o + this.bb_pos) : 0);
    }
    
    public Table value(final Table obj) {
        final int o = this.__offset(10);
        return (o != 0) ? this.__union(obj, o) : null;
    }
    
    public static int createKeyVariantPairDef(final FlatBufferBuilder builder, final int keyOffset, final long hash_key, final byte value_type, final int valueOffset) {
        builder.startObject(4);
        addValue(builder, valueOffset);
        addHashKey(builder, hash_key);
        addKey(builder, keyOffset);
        addValueType(builder, value_type);
        return endKeyVariantPairDef(builder);
    }
    
    public static void startKeyVariantPairDef(final FlatBufferBuilder builder) {
        builder.startObject(4);
    }
    
    public static void addKey(final FlatBufferBuilder builder, final int keyOffset) {
        builder.addOffset(0, keyOffset, 0);
    }
    
    public static void addHashKey(final FlatBufferBuilder builder, final long hashKey) {
        builder.addInt(1, (int)hashKey, 0);
    }
    
    public static void addValueType(final FlatBufferBuilder builder, final byte valueType) {
        builder.addByte(2, valueType, 0);
    }
    
    public static void addValue(final FlatBufferBuilder builder, final int valueOffset) {
        builder.addOffset(3, valueOffset, 0);
    }
    
    public static int endKeyVariantPairDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
