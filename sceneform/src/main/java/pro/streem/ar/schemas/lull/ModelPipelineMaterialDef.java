// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class ModelPipelineMaterialDef extends Table
{
    public static ModelPipelineMaterialDef getRootAsModelPipelineMaterialDef(final ByteBuffer _bb) {
        return getRootAsModelPipelineMaterialDef(_bb, new ModelPipelineMaterialDef());
    }
    
    public static ModelPipelineMaterialDef getRootAsModelPipelineMaterialDef(final ByteBuffer _bb, final ModelPipelineMaterialDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public ModelPipelineMaterialDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public pro.streem.ar.schemas.lull.MaterialDef material() {
        return this.material(new pro.streem.ar.schemas.lull.MaterialDef());
    }
    
    public pro.streem.ar.schemas.lull.MaterialDef material(final MaterialDef obj) {
        final int o = this.__offset(4);
        return (o != 0) ? obj.__assign(this.__indirect(o + this.bb_pos), this.bb) : null;
    }
    
    public String nameOverride() {
        final int o = this.__offset(6);
        return (o != 0) ? this.__string(o + this.bb_pos) : null;
    }
    
    public ByteBuffer nameOverrideAsByteBuffer() {
        return this.__vector_as_bytebuffer(6, 1);
    }
    
    public ByteBuffer nameOverrideInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 6, 1);
    }
    
    public static int createModelPipelineMaterialDef(final FlatBufferBuilder builder, final int materialOffset, final int name_overrideOffset) {
        builder.startObject(2);
        addNameOverride(builder, name_overrideOffset);
        addMaterial(builder, materialOffset);
        return endModelPipelineMaterialDef(builder);
    }
    
    public static void startModelPipelineMaterialDef(final FlatBufferBuilder builder) {
        builder.startObject(2);
    }
    
    public static void addMaterial(final FlatBufferBuilder builder, final int materialOffset) {
        builder.addOffset(0, materialOffset, 0);
    }
    
    public static void addNameOverride(final FlatBufferBuilder builder, final int nameOverrideOffset) {
        builder.addOffset(1, nameOverrideOffset, 0);
    }
    
    public static int endModelPipelineMaterialDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
