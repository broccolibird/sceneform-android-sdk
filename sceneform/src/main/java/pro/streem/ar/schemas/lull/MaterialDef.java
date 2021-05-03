// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class MaterialDef extends Table
{
    public static MaterialDef getRootAsMaterialDef(final ByteBuffer _bb) {
        return getRootAsMaterialDef(_bb, new MaterialDef());
    }
    
    public static MaterialDef getRootAsMaterialDef(final ByteBuffer _bb, final MaterialDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public MaterialDef __assign(final int _i, final ByteBuffer _bb) {
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
    
    public VariantMapDef properties() {
        return this.properties(new VariantMapDef());
    }
    
    public VariantMapDef properties(final VariantMapDef obj) {
        final int o = this.__offset(6);
        return (o != 0) ? obj.__assign(this.__indirect(o + this.bb_pos), this.bb) : null;
    }
    
    public MaterialTextureDef textures(final int j) {
        return this.textures(new MaterialTextureDef(), j);
    }
    
    public MaterialTextureDef textures(final MaterialTextureDef obj, final int j) {
        final int o = this.__offset(8);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int texturesLength() {
        final int o = this.__offset(8);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public static int createMaterialDef(final FlatBufferBuilder builder, final int nameOffset, final int propertiesOffset, final int texturesOffset) {
        builder.startObject(3);
        addTextures(builder, texturesOffset);
        addProperties(builder, propertiesOffset);
        addName(builder, nameOffset);
        return endMaterialDef(builder);
    }
    
    public static void startMaterialDef(final FlatBufferBuilder builder) {
        builder.startObject(3);
    }
    
    public static void addName(final FlatBufferBuilder builder, final int nameOffset) {
        builder.addOffset(0, nameOffset, 0);
    }
    
    public static void addProperties(final FlatBufferBuilder builder, final int propertiesOffset) {
        builder.addOffset(1, propertiesOffset, 0);
    }
    
    public static void addTextures(final FlatBufferBuilder builder, final int texturesOffset) {
        builder.addOffset(2, texturesOffset, 0);
    }
    
    public static int createTexturesVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startTexturesVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static int endMaterialDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
