// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.motive;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class AnimTableFb extends Table
{
    public static AnimTableFb getRootAsAnimTableFb(final ByteBuffer _bb) {
        return getRootAsAnimTableFb(_bb, new AnimTableFb());
    }
    
    public static AnimTableFb getRootAsAnimTableFb(final ByteBuffer _bb, final AnimTableFb obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public static boolean AnimTableFbBufferHasIdentifier(final ByteBuffer _bb) {
        return __has_identifier(_bb, "ATAB");
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public AnimTableFb __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public AnimListFb lists(final int j) {
        return this.lists(new AnimListFb(), j);
    }
    
    public AnimListFb lists(final AnimListFb obj, final int j) {
        final int o = this.__offset(4);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int listsLength() {
        final int o = this.__offset(4);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public static int createAnimTableFb(final FlatBufferBuilder builder, final int listsOffset) {
        builder.startObject(1);
        addLists(builder, listsOffset);
        return endAnimTableFb(builder);
    }
    
    public static void startAnimTableFb(final FlatBufferBuilder builder) {
        builder.startObject(1);
    }
    
    public static void addLists(final FlatBufferBuilder builder, final int listsOffset) {
        builder.addOffset(0, listsOffset, 0);
    }
    
    public static int createListsVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startListsVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static int endAnimTableFb(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
    
    public static void finishAnimTableFbBuffer(final FlatBufferBuilder builder, final int offset) {
        builder.finish(offset, "ATAB");
    }
    
    public static void finishSizePrefixedAnimTableFbBuffer(final FlatBufferBuilder builder, final int offset) {
        builder.finishSizePrefixed(offset, "ATAB");
    }
}
