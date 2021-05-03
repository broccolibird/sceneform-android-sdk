// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.sceneform;

public final class CollisionShapeType
{
    public static final int Box = 0;
    public static final int Sphere = 1;
    public static final String[] names;
    
    private CollisionShapeType() {
    }
    
    public static String name(final int e) {
        return CollisionShapeType.names[e];
    }
    
    static {
        names = new String[] { "Box", "Sphere" };
    }
}
