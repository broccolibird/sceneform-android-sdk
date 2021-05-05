package pro.streem.ar.sceneform.rendering;

import pro.streem.ar.sceneform.common.TransformProvider;
import pro.streem.ar.sceneform.math.Matrix;

/**
 * Required interface for a virtual camera.
 *
 * @hide
 */
public interface CameraProvider extends TransformProvider {
  boolean isActive();

  float getNearClipPlane();

  float getFarClipPlane();

  Matrix getViewMatrix();

  Matrix getProjectionMatrix();

  void updateTrackedPose(com.google.ar.core.Camera camera);
}
