package pro.streem.ar.sceneform.common;

import pro.streem.ar.sceneform.Node;
import pro.streem.ar.sceneform.math.Matrix;

/**
 * Interface for providing information about a 3D transformation. See {@link
 * Node}.
 *
 * @hide
 */
public interface TransformProvider {
  Matrix getWorldModelMatrix();
}
