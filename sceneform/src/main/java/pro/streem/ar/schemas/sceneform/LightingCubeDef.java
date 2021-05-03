// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class LightingCubeDef extends Table
{
    public static LightingCubeDef getRootAsLightingCubeDef(final ByteBuffer _bb) {
        return getRootAsLightingCubeDef(_bb, new LightingCubeDef());
    }
    
    public static LightingCubeDef getRootAsLightingCubeDef(final ByteBuffer _bb, final LightingCubeDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public LightingCubeDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public pro.streem.ar.schemas.sceneform.LightingCubeFaceDef faces(final int j) {
        return this.faces(new pro.streem.ar.schemas.sceneform.LightingCubeFaceDef(), j);
    }
    
    public pro.streem.ar.schemas.sceneform.LightingCubeFaceDef faces(final LightingCubeFaceDef obj, final int j) {
        final int o = this.__offset(4);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int facesLength() {
        final int o = this.__offset(4);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public static int createLightingCubeDef(final FlatBufferBuilder builder, final int facesOffset) {
        builder.startObject(1);
        addFaces(builder, facesOffset);
        return endLightingCubeDef(builder);
    }
    
    public static void startLightingCubeDef(final FlatBufferBuilder builder) {
        builder.startObject(1);
    }
    
    public static void addFaces(final FlatBufferBuilder builder, final int facesOffset) {
        builder.addOffset(0, facesOffset, 0);
    }
    
    public static int createFacesVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startFacesVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static int endLightingCubeDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
