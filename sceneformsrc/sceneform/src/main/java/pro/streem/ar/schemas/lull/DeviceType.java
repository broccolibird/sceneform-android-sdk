// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

public final class DeviceType
{
    public static final int Hmd = 0;
    public static final int Mouse = 1;
    public static final int Keyboard = 2;
    public static final int Controller = 3;
    public static final int Controller2 = 4;
    public static final int Hand = 5;
    public static final String[] names;
    
    private DeviceType() {
    }
    
    public static String name(final int e) {
        return DeviceType.names[e];
    }
    
    static {
        names = new String[] { "Hmd", "Mouse", "Keyboard", "Controller", "Controller2", "Hand" };
    }
}
