// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class VersionDef extends Table
{
    public static VersionDef getRootAsVersionDef(final ByteBuffer _bb) {
        return getRootAsVersionDef(_bb, new VersionDef());
    }
    
    public static VersionDef getRootAsVersionDef(final ByteBuffer _bb, final VersionDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public VersionDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public float majorVersion() {
        final int o = this.__offset(4);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public int minorVersion() {
        final int o = this.__offset(6);
        return (o != 0) ? this.bb.getInt(o + this.bb_pos) : 0;
    }
    
    public static int createVersionDef(final FlatBufferBuilder builder, final float major_version, final int minor_version) {
        builder.startObject(2);
        addMinorVersion(builder, minor_version);
        addMajorVersion(builder, major_version);
        return endVersionDef(builder);
    }
    
    public static void startVersionDef(final FlatBufferBuilder builder) {
        builder.startObject(2);
    }
    
    public static void addMajorVersion(final FlatBufferBuilder builder, final float majorVersion) {
        builder.addFloat(0, majorVersion, 0.0);
    }
    
    public static void addMinorVersion(final FlatBufferBuilder builder, final int minorVersion) {
        builder.addInt(1, minorVersion, 0);
    }
    
    public static int endVersionDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
