// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class NullInit extends Table
{
    public static NullInit getRootAsNullInit(final ByteBuffer _bb) {
        return getRootAsNullInit(_bb, new NullInit());
    }
    
    public static NullInit getRootAsNullInit(final ByteBuffer _bb, final NullInit obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public NullInit __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public static void startNullInit(final FlatBufferBuilder builder) {
        builder.startObject(0);
    }
    
    public static int endNullInit(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
