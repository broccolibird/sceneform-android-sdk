// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

import pro.streem.flatbuffers.FlatBufferBuilder;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

public final class ModelPipelineImportDef extends Table
{
    public static ModelPipelineImportDef getRootAsModelPipelineImportDef(final ByteBuffer _bb) {
        return getRootAsModelPipelineImportDef(_bb, new ModelPipelineImportDef());
    }
    
    public static ModelPipelineImportDef getRootAsModelPipelineImportDef(final ByteBuffer _bb, final ModelPipelineImportDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public ModelPipelineImportDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public String name() {
        final int o = this.__offset(4);
        return (o != 0) ? this.__string(o + this.bb_pos) : null;
    }
    
    public ByteBuffer nameAsByteBuffer() {
        return this.__vector_as_bytebuffer(4, 1);
    }
    
    public ByteBuffer nameInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 4, 1);
    }
    
    public String file() {
        final int o = this.__offset(6);
        return (o != 0) ? this.__string(o + this.bb_pos) : null;
    }
    
    public ByteBuffer fileAsByteBuffer() {
        return this.__vector_as_bytebuffer(6, 1);
    }
    
    public ByteBuffer fileInByteBuffer(final ByteBuffer _bb) {
        return this.__vector_in_bytebuffer(_bb, 6, 1);
    }
    
    public boolean recenter() {
        final int o = this.__offset(8);
        return o != 0 && 0 != this.bb.get(o + this.bb_pos);
    }
    
    public float scale() {
        final int o = this.__offset(10);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 1.0f;
    }
    
    public int axisSystem() {
        final int o = this.__offset(12);
        return (o != 0) ? this.bb.getInt(o + this.bb_pos) : -1;
    }
    
    public float smoothingAngle() {
        final int o = this.__offset(14);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 45.0f;
    }
    
    public int maxBoneWeights() {
        final int o = this.__offset(16);
        return (o != 0) ? this.bb.getInt(o + this.bb_pos) : 4;
    }
    
    public boolean reportErrorsToStdout() {
        final int o = this.__offset(18);
        return o != 0 && 0 != this.bb.get(o + this.bb_pos);
    }
    
    public boolean flipTextureCoordinates() {
        final int o = this.__offset(20);
        return o != 0 && 0 != this.bb.get(o + this.bb_pos);
    }
    
    public boolean flattenHierarchyAndTransformVerticesToRootSpace() {
        final int o = this.__offset(22);
        return o != 0 && 0 != this.bb.get(o + this.bb_pos);
    }
    
    public boolean useSpecularGlossinessTexturesIfPresent() {
        final int o = this.__offset(24);
        return o != 0 && 0 != this.bb.get(o + this.bb_pos);
    }
    
    public boolean fixInfacingNormals() {
        final int o = this.__offset(26);
        return o == 0 || 0 != this.bb.get(o + this.bb_pos);
    }
    
    public boolean ensureVertexOrientationWNotZero() {
        final int o = this.__offset(28);
        return o != 0 && 0 != this.bb.get(o + this.bb_pos);
    }
    
    public float cmPerUnit() {
        final int o = this.__offset(30);
        return (o != 0) ? this.bb.getFloat(o + this.bb_pos) : 0.0f;
    }
    
    public String targetMeshes(final int j) {
        final int o = this.__offset(32);
        return (o != 0) ? this.__string(this.__vector(o) + j * 4) : null;
    }
    
    public int targetMeshesLength() {
        final int o = this.__offset(32);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public boolean mergeMaterials() {
        final int o = this.__offset(34);
        return o == 0 || 0 != this.bb.get(o + this.bb_pos);
    }
    
    public static int createModelPipelineImportDef(final FlatBufferBuilder builder, final int nameOffset, final int fileOffset, final boolean recenter, final float scale, final int axis_system, final float smoothing_angle, final int max_bone_weights, final boolean report_errors_to_stdout, final boolean flip_texture_coordinates, final boolean flatten_hierarchy_and_transform_vertices_to_root_space, final boolean use_specular_glossiness_textures_if_present, final boolean fix_infacing_normals, final boolean ensure_vertex_orientation_w_not_zero, final float cm_per_unit, final int target_meshesOffset, final boolean merge_materials) {
        builder.startObject(16);
        addTargetMeshes(builder, target_meshesOffset);
        addCmPerUnit(builder, cm_per_unit);
        addMaxBoneWeights(builder, max_bone_weights);
        addSmoothingAngle(builder, smoothing_angle);
        addAxisSystem(builder, axis_system);
        addScale(builder, scale);
        addFile(builder, fileOffset);
        addName(builder, nameOffset);
        addMergeMaterials(builder, merge_materials);
        addEnsureVertexOrientationWNotZero(builder, ensure_vertex_orientation_w_not_zero);
        addFixInfacingNormals(builder, fix_infacing_normals);
        addUseSpecularGlossinessTexturesIfPresent(builder, use_specular_glossiness_textures_if_present);
        addFlattenHierarchyAndTransformVerticesToRootSpace(builder, flatten_hierarchy_and_transform_vertices_to_root_space);
        addFlipTextureCoordinates(builder, flip_texture_coordinates);
        addReportErrorsToStdout(builder, report_errors_to_stdout);
        addRecenter(builder, recenter);
        return endModelPipelineImportDef(builder);
    }
    
    public static void startModelPipelineImportDef(final FlatBufferBuilder builder) {
        builder.startObject(16);
    }
    
    public static void addName(final FlatBufferBuilder builder, final int nameOffset) {
        builder.addOffset(0, nameOffset, 0);
    }
    
    public static void addFile(final FlatBufferBuilder builder, final int fileOffset) {
        builder.addOffset(1, fileOffset, 0);
    }
    
    public static void addRecenter(final FlatBufferBuilder builder, final boolean recenter) {
        builder.addBoolean(2, recenter, false);
    }
    
    public static void addScale(final FlatBufferBuilder builder, final float scale) {
        builder.addFloat(3, scale, 1.0);
    }
    
    public static void addAxisSystem(final FlatBufferBuilder builder, final int axisSystem) {
        builder.addInt(4, axisSystem, -1);
    }
    
    public static void addSmoothingAngle(final FlatBufferBuilder builder, final float smoothingAngle) {
        builder.addFloat(5, smoothingAngle, 45.0);
    }
    
    public static void addMaxBoneWeights(final FlatBufferBuilder builder, final int maxBoneWeights) {
        builder.addInt(6, maxBoneWeights, 4);
    }
    
    public static void addReportErrorsToStdout(final FlatBufferBuilder builder, final boolean reportErrorsToStdout) {
        builder.addBoolean(7, reportErrorsToStdout, false);
    }
    
    public static void addFlipTextureCoordinates(final FlatBufferBuilder builder, final boolean flipTextureCoordinates) {
        builder.addBoolean(8, flipTextureCoordinates, false);
    }
    
    public static void addFlattenHierarchyAndTransformVerticesToRootSpace(final FlatBufferBuilder builder, final boolean flattenHierarchyAndTransformVerticesToRootSpace) {
        builder.addBoolean(9, flattenHierarchyAndTransformVerticesToRootSpace, false);
    }
    
    public static void addUseSpecularGlossinessTexturesIfPresent(final FlatBufferBuilder builder, final boolean useSpecularGlossinessTexturesIfPresent) {
        builder.addBoolean(10, useSpecularGlossinessTexturesIfPresent, false);
    }
    
    public static void addFixInfacingNormals(final FlatBufferBuilder builder, final boolean fixInfacingNormals) {
        builder.addBoolean(11, fixInfacingNormals, true);
    }
    
    public static void addEnsureVertexOrientationWNotZero(final FlatBufferBuilder builder, final boolean ensureVertexOrientationWNotZero) {
        builder.addBoolean(12, ensureVertexOrientationWNotZero, false);
    }
    
    public static void addCmPerUnit(final FlatBufferBuilder builder, final float cmPerUnit) {
        builder.addFloat(13, cmPerUnit, 0.0);
    }
    
    public static void addTargetMeshes(final FlatBufferBuilder builder, final int targetMeshesOffset) {
        builder.addOffset(14, targetMeshesOffset, 0);
    }
    
    public static int createTargetMeshesVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startTargetMeshesVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static void addMergeMaterials(final FlatBufferBuilder builder, final boolean mergeMaterials) {
        builder.addBoolean(15, mergeMaterials, true);
    }
    
    public static int endModelPipelineImportDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
