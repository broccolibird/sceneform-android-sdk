// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Struct;

public final class ArcDef extends Struct
{
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
    }
    
    public ArcDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public float startAngle() {
        return this.bb.getFloat(this.bb_pos + 0);
    }
    
    public float angleSize() {
        return this.bb.getFloat(this.bb_pos + 4);
    }
    
    public float innerRadius() {
        return this.bb.getFloat(this.bb_pos + 8);
    }
    
    public float outerRadius() {
        return this.bb.getFloat(this.bb_pos + 12);
    }
    
    public int numSamples() {
        return this.bb.getInt(this.bb_pos + 16);
    }
    
    public static int createArcDef(final FlatBufferBuilder builder, final float startAngle, final float angleSize, final float innerRadius, final float outerRadius, final int numSamples) {
        builder.prep(4, 20);
        builder.putInt(numSamples);
        builder.putFloat(outerRadius);
        builder.putFloat(innerRadius);
        builder.putFloat(angleSize);
        builder.putFloat(startAngle);
        return builder.offset();
    }
}
