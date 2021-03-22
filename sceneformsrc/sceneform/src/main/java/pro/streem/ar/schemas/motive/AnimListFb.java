// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.motive;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class AnimListFb extends Table
{
    public static AnimListFb getRootAsAnimListFb(final ByteBuffer _bb) {
        return getRootAsAnimListFb(_bb, new AnimListFb());
    }
    
    public static AnimListFb getRootAsAnimListFb(final ByteBuffer _bb, final AnimListFb obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public static boolean AnimListFbBufferHasIdentifier(final ByteBuffer _bb) {
        return __has_identifier(_bb, "ALIS");
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public AnimListFb __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public String animFiles(final int j) {
        final int o = this.__offset(4);
        return (o != 0) ? this.__string(this.__vector(o) + j * 4) : null;
    }
    
    public int animFilesLength() {
        final int o = this.__offset(4);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public pro.streem.ar.schemas.motive.AnimSource anims(final int j) {
        return this.anims(new pro.streem.ar.schemas.motive.AnimSource(), j);
    }
    
    public pro.streem.ar.schemas.motive.AnimSource anims(final AnimSource obj, final int j) {
        final int o = this.__offset(6);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int animsLength() {
        final int o = this.__offset(6);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public static int createAnimListFb(final FlatBufferBuilder builder, final int anim_filesOffset, final int animsOffset) {
        builder.startObject(2);
        addAnims(builder, animsOffset);
        addAnimFiles(builder, anim_filesOffset);
        return endAnimListFb(builder);
    }
    
    public static void startAnimListFb(final FlatBufferBuilder builder) {
        builder.startObject(2);
    }
    
    public static void addAnimFiles(final FlatBufferBuilder builder, final int animFilesOffset) {
        builder.addOffset(0, animFilesOffset, 0);
    }
    
    public static int createAnimFilesVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startAnimFilesVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static void addAnims(final FlatBufferBuilder builder, final int animsOffset) {
        builder.addOffset(1, animsOffset, 0);
    }
    
    public static int createAnimsVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startAnimsVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static int endAnimListFb(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
    
    public static void finishAnimListFbBuffer(final FlatBufferBuilder builder, final int offset) {
        builder.finish(offset, "ALIS");
    }
    
    public static void finishSizePrefixedAnimListFbBuffer(final FlatBufferBuilder builder, final int offset) {
        builder.finishSizePrefixed(offset, "ALIS");
    }
}
