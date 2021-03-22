// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Struct;

public final class Recti extends Struct
{
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
    }
    
    public Recti __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public int x() {
        return this.bb.getInt(this.bb_pos + 0);
    }
    
    public int y() {
        return this.bb.getInt(this.bb_pos + 4);
    }
    
    public int w() {
        return this.bb.getInt(this.bb_pos + 8);
    }
    
    public int h() {
        return this.bb.getInt(this.bb_pos + 12);
    }
    
    public static int createRecti(final FlatBufferBuilder builder, final int x, final int y, final int w, final int h) {
        builder.prep(4, 16);
        builder.putInt(h);
        builder.putInt(w);
        builder.putInt(y);
        builder.putInt(x);
        return builder.offset();
    }
}
