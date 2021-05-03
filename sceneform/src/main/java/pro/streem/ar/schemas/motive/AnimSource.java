// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.motive;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class AnimSource extends Table
{
    public static AnimSource getRootAsAnimSource(final ByteBuffer _bb) {
        return getRootAsAnimSource(_bb, new AnimSource());
    }
    
    public static AnimSource getRootAsAnimSource(final ByteBuffer _bb, final AnimSource obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public AnimSource __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public byte uType() {
        final int o = this.__offset(4);
        return (byte)((o != 0) ? this.bb.get(o + this.bb_pos) : 0);
    }
    
    public Table u(final Table obj) {
        final int o = this.__offset(6);
        return (o != 0) ? this.__union(obj, o) : null;
    }
    
    public static int createAnimSource(final FlatBufferBuilder builder, final byte u_type, final int uOffset) {
        builder.startObject(2);
        addU(builder, uOffset);
        addUType(builder, u_type);
        return endAnimSource(builder);
    }
    
    public static void startAnimSource(final FlatBufferBuilder builder) {
        builder.startObject(2);
    }
    
    public static void addUType(final FlatBufferBuilder builder, final byte uType) {
        builder.addByte(0, uType, 0);
    }
    
    public static void addU(final FlatBufferBuilder builder, final int uOffset) {
        builder.addOffset(1, uOffset, 0);
    }
    
    public static int endAnimSource(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
