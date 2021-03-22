// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class DataBool extends Table
{
    public static DataBool getRootAsDataBool(final ByteBuffer _bb) {
        return getRootAsDataBool(_bb, new DataBool());
    }
    
    public static DataBool getRootAsDataBool(final ByteBuffer _bb, final DataBool obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public DataBool __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public boolean value() {
        final int o = this.__offset(4);
        return o != 0 && 0 != this.bb.get(o + this.bb_pos);
    }
    
    public static int createDataBool(final FlatBufferBuilder builder, final boolean value) {
        builder.startObject(1);
        addValue(builder, value);
        return endDataBool(builder);
    }
    
    public static void startDataBool(final FlatBufferBuilder builder) {
        builder.startObject(1);
    }
    
    public static void addValue(final FlatBufferBuilder builder, final boolean value) {
        builder.addBoolean(0, value, false);
    }
    
    public static int endDataBool(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
