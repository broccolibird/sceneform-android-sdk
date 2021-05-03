// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Struct;

public final class AabbDef extends Struct
{
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
    }
    
    public AabbDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public Vec3 min() {
        return this.min(new Vec3());
    }
    
    public Vec3 min(final Vec3 obj) {
        return obj.__assign(this.bb_pos + 0, this.bb);
    }
    
    public Vec3 max() {
        return this.max(new Vec3());
    }
    
    public Vec3 max(final Vec3 obj) {
        return obj.__assign(this.bb_pos + 12, this.bb);
    }
    
    public static int createAabbDef(final FlatBufferBuilder builder, final float min_x, final float min_y, final float min_z, final float max_x, final float max_y, final float max_z) {
        builder.prep(4, 24);
        builder.prep(4, 12);
        builder.putFloat(max_z);
        builder.putFloat(max_y);
        builder.putFloat(max_x);
        builder.prep(4, 12);
        builder.putFloat(min_z);
        builder.putFloat(min_y);
        builder.putFloat(min_x);
        return builder.offset();
    }
}
