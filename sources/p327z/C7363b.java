package p327z;

import android.os.Build;
import android.view.Surface;

/* renamed from: z.b */
public final class C7363b {

    /* renamed from: a */
    public final C7364a f22589a;

    /* renamed from: z.b$a */
    public interface C7364a {
        /* renamed from: a */
        void mo23575a(String str);

        Object getOutputConfiguration();

        String getPhysicalCameraId();

        Surface getSurface();
    }

    public C7363b(Surface surface) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f22589a = new C7369e(surface);
        } else if (i >= 26) {
            this.f22589a = new C7367d(surface);
        } else if (i >= 24) {
            this.f22589a = new C7365c(surface);
        } else {
            this.f22589a = new C7370f(surface);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7363b)) {
            return false;
        }
        return this.f22589a.equals(((C7363b) obj).f22589a);
    }

    public final int hashCode() {
        return this.f22589a.hashCode();
    }

    public C7363b(C7365c cVar) {
        this.f22589a = cVar;
    }
}
