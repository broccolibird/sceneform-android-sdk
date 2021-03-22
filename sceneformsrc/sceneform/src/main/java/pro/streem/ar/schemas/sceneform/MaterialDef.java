// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

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
    
    public ParameterDef parameters(final int j) {
        return this.parameters(new ParameterDef(), j);
    }
    
    public ParameterDef parameters(final ParameterDef obj, final int j) {
        final int o = this.__offset(4);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int parametersLength() {
        final int o = this.__offset(4);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public int compiledIndex() {
        final int o = this.__offset(6);
        return (o != 0) ? (this.bb.get(o + this.bb_pos) & 0xFF) : 0;
    }
    
    public String name() {
        final int o = this.__offset(8);
        return (o != 0) ? this.__string(o + this.bb_pos) : null;
    }
    
    public ByteBuffer nameAsByteBuffer() {
        return this.__vector_as_bytebuffer(8, 1);
    }
    
    public ByteBuffer nameInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 8, 1);
    }
    
    public static int createMaterialDef(final FlatBufferBuilder builder, final int parametersOffset, final int compiled_index, final int nameOffset) {
        builder.startObject(3);
        addName(builder, nameOffset);
        addParameters(builder, parametersOffset);
        addCompiledIndex(builder, compiled_index);
        return endMaterialDef(builder);
    }
    
    public static void startMaterialDef(final FlatBufferBuilder builder) {
        builder.startObject(3);
    }
    
    public static void addParameters(final FlatBufferBuilder builder, final int parametersOffset) {
        builder.addOffset(0, parametersOffset, 0);
    }
    
    public static int createParametersVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startParametersVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static void addCompiledIndex(final FlatBufferBuilder builder, final int compiledIndex) {
        builder.addByte(1, (byte)compiledIndex, 0);
    }
    
    public static void addName(final FlatBufferBuilder builder, final int nameOffset) {
        builder.addOffset(2, nameOffset, 0);
    }
    
    public static int endMaterialDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
