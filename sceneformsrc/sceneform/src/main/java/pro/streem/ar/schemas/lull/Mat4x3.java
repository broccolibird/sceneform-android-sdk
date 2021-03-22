// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Struct;

public final class Mat4x3 extends Struct
{
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
    }
    
    public Mat4x3 __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public pro.streem.ar.schemas.lull.Vec4 c0() {
        return this.c0(new pro.streem.ar.schemas.lull.Vec4());
    }
    
    public pro.streem.ar.schemas.lull.Vec4 c0(final pro.streem.ar.schemas.lull.Vec4 obj) {
        return obj.__assign(this.bb_pos + 0, this.bb);
    }
    
    public pro.streem.ar.schemas.lull.Vec4 c1() {
        return this.c1(new pro.streem.ar.schemas.lull.Vec4());
    }
    
    public pro.streem.ar.schemas.lull.Vec4 c1(final pro.streem.ar.schemas.lull.Vec4 obj) {
        return obj.__assign(this.bb_pos + 16, this.bb);
    }
    
    public pro.streem.ar.schemas.lull.Vec4 c2() {
        return this.c2(new pro.streem.ar.schemas.lull.Vec4());
    }
    
    public pro.streem.ar.schemas.lull.Vec4 c2(final Vec4 obj) {
        return obj.__assign(this.bb_pos + 32, this.bb);
    }
    
    public static int createMat4x3(final FlatBufferBuilder builder, final float c0_x, final float c0_y, final float c0_z, final float c0_w, final float c1_x, final float c1_y, final float c1_z, final float c1_w, final float c2_x, final float c2_y, final float c2_z, final float c2_w) {
        builder.prep(4, 48);
        builder.prep(4, 16);
        builder.putFloat(c2_w);
        builder.putFloat(c2_z);
        builder.putFloat(c2_y);
        builder.putFloat(c2_x);
        builder.prep(4, 16);
        builder.putFloat(c1_w);
        builder.putFloat(c1_z);
        builder.putFloat(c1_y);
        builder.putFloat(c1_x);
        builder.prep(4, 16);
        builder.putFloat(c0_w);
        builder.putFloat(c0_z);
        builder.putFloat(c0_y);
        builder.putFloat(c0_x);
        return builder.offset();
    }
}
