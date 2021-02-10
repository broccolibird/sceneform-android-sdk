package pro.streem.ar.sceneform.rendering;

import pro.streem.ar.sceneform.resources.SharedReference;

abstract class MaterialInternalData extends SharedReference {
  abstract com.google.android.filament.Material getFilamentMaterial();
}
