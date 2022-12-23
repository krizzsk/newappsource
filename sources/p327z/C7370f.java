package p327z;

import android.os.Build;
import android.util.Size;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import mf0.C24361g;
import p054d0.C4289j0;
import p327z.C7363b;

/* renamed from: z.f */
public class C7370f implements C7363b.C7364a {

    /* renamed from: a */
    public final Object f22594a;

    /* renamed from: z.f$a */
    public static final class C7371a {

        /* renamed from: a */
        public final List<Surface> f22595a;

        /* renamed from: b */
        public final Size f22596b;

        /* renamed from: c */
        public final int f22597c;

        /* renamed from: d */
        public final int f22598d;

        /* renamed from: e */
        public String f22599e;

        public C7371a(Surface surface) {
            Size size;
            int i;
            int i2;
            C24361g.m61185s(surface, "Surface must not be null");
            this.f22595a = Collections.singletonList(surface);
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", new Class[]{Surface.class});
                declaredMethod.setAccessible(true);
                size = (Size) declaredMethod.invoke((Object) null, new Object[]{surface});
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                C4289j0.m11435b("OutputConfigCompat");
                size = null;
            }
            this.f22596b = size;
            try {
                Method declaredMethod2 = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", new Class[]{Surface.class});
                if (Build.VERSION.SDK_INT < 22) {
                    declaredMethod2.setAccessible(true);
                }
                i = ((Integer) declaredMethod2.invoke((Object) null, new Object[]{surface})).intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                C4289j0.m11435b("OutputConfigCompat");
                i = 0;
            }
            this.f22597c = i;
            try {
                i2 = ((Integer) Surface.class.getDeclaredMethod("getGenerationId", new Class[0]).invoke(surface, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused3) {
                C4289j0.m11435b("OutputConfigCompat");
                i2 = -1;
            }
            this.f22598d = i2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C7371a)) {
                return false;
            }
            C7371a aVar = (C7371a) obj;
            if (!this.f22596b.equals(aVar.f22596b) || this.f22597c != aVar.f22597c || this.f22598d != aVar.f22598d || !Objects.equals(this.f22599e, aVar.f22599e)) {
                return false;
            }
            int min = Math.min(this.f22595a.size(), aVar.f22595a.size());
            for (int i = 0; i < min; i++) {
                if (this.f22595a.get(i) != aVar.f22595a.get(i)) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            int hashCode = this.f22595a.hashCode() ^ 31;
            int i = this.f22598d ^ ((hashCode << 5) - hashCode);
            int hashCode2 = this.f22596b.hashCode() ^ ((i << 5) - i);
            int i2 = this.f22597c ^ ((hashCode2 << 5) - hashCode2);
            int i3 = (i2 << 5) - i2;
            int i4 = 0;
            int i5 = i3 ^ 0;
            int i6 = (i5 << 5) - i5;
            String str = this.f22599e;
            if (str != null) {
                i4 = str.hashCode();
            }
            return i4 ^ i6;
        }
    }

    public C7370f(Surface surface) {
        this.f22594a = new C7371a(surface);
    }

    /* renamed from: a */
    public void mo23575a(String str) {
        ((C7371a) this.f22594a).f22599e = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7370f)) {
            return false;
        }
        return Objects.equals(this.f22594a, ((C7370f) obj).f22594a);
    }

    public Object getOutputConfiguration() {
        return null;
    }

    public String getPhysicalCameraId() {
        return ((C7371a) this.f22594a).f22599e;
    }

    public Surface getSurface() {
        List<Surface> list = ((C7371a) this.f22594a).f22595a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    public final int hashCode() {
        return this.f22594a.hashCode();
    }

    public C7370f(Object obj) {
        this.f22594a = obj;
    }
}
