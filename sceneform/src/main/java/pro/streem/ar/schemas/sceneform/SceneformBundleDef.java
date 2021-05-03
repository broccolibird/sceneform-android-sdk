// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

import pro.streem.flatbuffers.FlatBufferBuilder;

import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import pro.streem.flatbuffers.Table;

import pro.streem.ar.schemas.lull.ModelDef;

public final class SceneformBundleDef extends Table
{
    public static SceneformBundleDef getRootAsSceneformBundleDef(final ByteBuffer _bb) {
        return getRootAsSceneformBundleDef(_bb, new SceneformBundleDef());
    }
    
    public static SceneformBundleDef getRootAsSceneformBundleDef(final ByteBuffer _bb, final SceneformBundleDef obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }
    
    public static boolean SceneformBundleDefBufferHasIdentifier(final ByteBuffer _bb) {
        return __has_identifier(_bb, "RBUN");
    }
    
    public void __init(final int _i, final ByteBuffer _bb) {
        this.bb_pos = _i;
        this.bb = _bb;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
    }
    
    public SceneformBundleDef __assign(final int _i, final ByteBuffer _bb) {
        this.__init(_i, _bb);
        return this;
    }
    
    public VersionDef version() {
        return this.version(new VersionDef());
    }
    
    public VersionDef version(final VersionDef obj) {
        final int o = this.__offset(4);
        return (o != 0) ? obj.__assign(this.__indirect(o + this.bb_pos), this.bb) : null;
    }
    
    public pro.streem.ar.schemas.lull.ModelDef model() {
        return this.model(new pro.streem.ar.schemas.lull.ModelDef());
    }
    
    public pro.streem.ar.schemas.lull.ModelDef model(final ModelDef obj) {
        final int o = this.__offset(6);
        return (o != 0) ? obj.__assign(this.__indirect(o + this.bb_pos), this.bb) : null;
    }
    
    public pro.streem.ar.schemas.sceneform.MaterialDef materials(final int j) {
        return this.materials(new pro.streem.ar.schemas.sceneform.MaterialDef(), j);
    }
    
    public pro.streem.ar.schemas.sceneform.MaterialDef materials(final MaterialDef obj, final int j) {
        final int o = this.__offset(8);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int materialsLength() {
        final int o = this.__offset(8);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public pro.streem.ar.schemas.sceneform.CompiledMaterialDef compiledMaterials(final int j) {
        return this.compiledMaterials(new pro.streem.ar.schemas.sceneform.CompiledMaterialDef(), j);
    }
    
    public pro.streem.ar.schemas.sceneform.CompiledMaterialDef compiledMaterials(final CompiledMaterialDef obj, final int j) {
        final int o = this.__offset(10);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int compiledMaterialsLength() {
        final int o = this.__offset(10);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public SuggestedCollisionShapeDef suggestedCollisionShape() {
        return this.suggestedCollisionShape(new SuggestedCollisionShapeDef());
    }
    
    public SuggestedCollisionShapeDef suggestedCollisionShape(final SuggestedCollisionShapeDef obj) {
        final int o = this.__offset(12);
        return (o != 0) ? obj.__assign(this.__indirect(o + this.bb_pos), this.bb) : null;
    }
    
    public pro.streem.ar.schemas.sceneform.SamplerDef samplers(final int j) {
        return this.samplers(new pro.streem.ar.schemas.sceneform.SamplerDef(), j);
    }
    
    public pro.streem.ar.schemas.sceneform.SamplerDef samplers(final SamplerDef obj, final int j) {
        final int o = this.__offset(14);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int samplersLength() {
        final int o = this.__offset(14);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public pro.streem.ar.schemas.sceneform.InputDef inputs(final int j) {
        return this.inputs(new pro.streem.ar.schemas.sceneform.InputDef(), j);
    }
    
    public pro.streem.ar.schemas.sceneform.InputDef inputs(final InputDef obj, final int j) {
        final int o = this.__offset(16);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int inputsLength() {
        final int o = this.__offset(16);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public LightingDef lightingDefs(final int j) {
        return this.lightingDefs(new LightingDef(), j);
    }
    
    public LightingDef lightingDefs(final LightingDef obj, final int j) {
        final int o = this.__offset(18);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int lightingDefsLength() {
        final int o = this.__offset(18);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public AnimationDef animations(final int j) {
        return this.animations(new AnimationDef(), j);
    }
    
    public AnimationDef animations(final AnimationDef obj, final int j) {
        final int o = this.__offset(20);
        return (o != 0) ? obj.__assign(this.__indirect(this.__vector(o) + j * 4), this.bb) : null;
    }
    
    public int animationsLength() {
        final int o = this.__offset(20);
        return (o != 0) ? this.__vector_len(o) : 0;
    }
    
    public TransformDef transform() {
        return this.transform(new TransformDef());
    }
    
    public TransformDef transform(final TransformDef obj) {
        final int o = this.__offset(22);
        return (o != 0) ? obj.__assign(this.__indirect(o + this.bb_pos), this.bb) : null;
    }
    
    public pro.streem.ar.schemas.sceneform.RuntimeAssetDef runtime() {
        return this.runtime(new pro.streem.ar.schemas.sceneform.RuntimeAssetDef());
    }
    
    public pro.streem.ar.schemas.sceneform.RuntimeAssetDef runtime(final RuntimeAssetDef obj) {
        final int o = this.__offset(24);
        return (o != 0) ? obj.__assign(this.__indirect(o + this.bb_pos), this.bb) : null;
    }
    
    public static int createSceneformBundleDef(final FlatBufferBuilder builder, final int versionOffset, final int modelOffset, final int materialsOffset, final int compiled_materialsOffset, final int suggested_collision_shapeOffset, final int samplersOffset, final int inputsOffset, final int lighting_defsOffset, final int animationsOffset, final int transformOffset, final int runtimeOffset) {
        builder.startObject(11);
        addRuntime(builder, runtimeOffset);
        addTransform(builder, transformOffset);
        addAnimations(builder, animationsOffset);
        addLightingDefs(builder, lighting_defsOffset);
        addInputs(builder, inputsOffset);
        addSamplers(builder, samplersOffset);
        addSuggestedCollisionShape(builder, suggested_collision_shapeOffset);
        addCompiledMaterials(builder, compiled_materialsOffset);
        addMaterials(builder, materialsOffset);
        addModel(builder, modelOffset);
        addVersion(builder, versionOffset);
        return endSceneformBundleDef(builder);
    }
    
    public static void startSceneformBundleDef(final FlatBufferBuilder builder) {
        builder.startObject(11);
    }
    
    public static void addVersion(final FlatBufferBuilder builder, final int versionOffset) {
        builder.addOffset(0, versionOffset, 0);
    }
    
    public static void addModel(final FlatBufferBuilder builder, final int modelOffset) {
        builder.addOffset(1, modelOffset, 0);
    }
    
    public static void addMaterials(final FlatBufferBuilder builder, final int materialsOffset) {
        builder.addOffset(2, materialsOffset, 0);
    }
    
    public static int createMaterialsVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startMaterialsVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static void addCompiledMaterials(final FlatBufferBuilder builder, final int compiledMaterialsOffset) {
        builder.addOffset(3, compiledMaterialsOffset, 0);
    }
    
    public static int createCompiledMaterialsVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startCompiledMaterialsVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static void addSuggestedCollisionShape(final FlatBufferBuilder builder, final int suggestedCollisionShapeOffset) {
        builder.addOffset(4, suggestedCollisionShapeOffset, 0);
    }
    
    public static void addSamplers(final FlatBufferBuilder builder, final int samplersOffset) {
        builder.addOffset(5, samplersOffset, 0);
    }
    
    public static int createSamplersVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startSamplersVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static void addInputs(final FlatBufferBuilder builder, final int inputsOffset) {
        builder.addOffset(6, inputsOffset, 0);
    }
    
    public static int createInputsVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startInputsVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static void addLightingDefs(final FlatBufferBuilder builder, final int lightingDefsOffset) {
        builder.addOffset(7, lightingDefsOffset, 0);
    }
    
    public static int createLightingDefsVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startLightingDefsVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static void addAnimations(final FlatBufferBuilder builder, final int animationsOffset) {
        builder.addOffset(8, animationsOffset, 0);
    }
    
    public static int createAnimationsVector(final FlatBufferBuilder builder, final int[] data) {
        builder.startVector(4, data.length, 4);
        for (int i = data.length - 1; i >= 0; --i) {
            builder.addOffset(data[i]);
        }
        return builder.endVector();
    }
    
    public static void startAnimationsVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(4, numElems, 4);
    }
    
    public static void addTransform(final FlatBufferBuilder builder, final int transformOffset) {
        builder.addOffset(9, transformOffset, 0);
    }
    
    public static void addRuntime(final FlatBufferBuilder builder, final int runtimeOffset) {
        builder.addOffset(10, runtimeOffset, 0);
    }
    
    public static int endSceneformBundleDef(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
    
    public static void finishSceneformBundleDefBuffer(final FlatBufferBuilder builder, final int offset) {
        builder.finish(offset, "RBUN");
    }
    
    public static void finishSizePrefixedSceneformBundleDefBuffer(final FlatBufferBuilder builder, final int offset) {
        builder.finishSizePrefixed(offset, "RBUN");
    }
}
