package p329z1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import p718pc.C18900h;

/* renamed from: z1.d */
public final class C7419d extends C7407b<C7419d> {

    /* renamed from: r */
    public C7420e f22802r = null;

    /* renamed from: s */
    public float f22803s = Float.MAX_VALUE;

    /* renamed from: t */
    public boolean f22804t = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7419d(Object obj) {
        super(obj);
        C18900h.C18901a aVar = C18900h.f48107r;
    }

    /* renamed from: c */
    public final void mo23641c() {
        boolean z;
        if (this.f22802r.f22806b > 0.0d) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (this.f22793f) {
            this.f22804t = true;
        }
    }
}
