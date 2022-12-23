package p085f8;

import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.lang.reflect.Method;
import mf0.C24362h;

/* renamed from: f8.c */
public final class C4713c {

    /* renamed from: a */
    public static final C4713c f15999a = new C4713c();

    /* renamed from: b */
    public static Class<?> f16000b;

    /* renamed from: a */
    public static final void m12011a(String str, String str2) {
        Class<String> cls = String.class;
        try {
            if (f16000b == null) {
                f15999a.getClass();
                f16000b = Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            }
            Class<?> cls2 = f16000b;
            if (cls2 != null) {
                Method method = cls2.getMethod("UnitySendMessage", new Class[]{cls, cls, cls});
                Class<?> cls3 = f16000b;
                if (cls3 != null) {
                    method.invoke(cls3, new Object[]{"UnityFacebookSDKPlugin", str, str2});
                    return;
                }
                C24362h.m61217l("unityPlayer");
                throw null;
            }
            C24362h.m61217l("unityPlayer");
            throw null;
        } catch (Exception unused) {
        }
    }
}
