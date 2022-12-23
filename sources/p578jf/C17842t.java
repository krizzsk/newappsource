package p578jf;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.camera.camera2.internal.C0509c;
import java.util.concurrent.ExecutorService;
import p626lf.C18200a;
import p743qd.C19107d;

/* renamed from: jf.t */
public final class C17842t {

    /* renamed from: c */
    public static final C18200a f45811c = C18200a.m44901d();

    /* renamed from: d */
    public static C17842t f45812d;

    /* renamed from: a */
    public volatile SharedPreferences f45813a;

    /* renamed from: b */
    public final ExecutorService f45814b;

    public C17842t(ExecutorService executorService) {
        this.f45814b = executorService;
    }

    /* renamed from: a */
    public static Context m44220a() {
        try {
            C19107d.m46265d();
            C19107d d = C19107d.m46265d();
            d.mo51535a();
            return d.f48568a;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final synchronized void mo50417b(Context context) {
        if (this.f45813a == null && context != null) {
            this.f45814b.execute(new C0509c(11, this, context));
        }
    }

    /* renamed from: c */
    public final void mo50418c(float f, String str) {
        if (this.f45813a == null) {
            mo50417b(m44220a());
            if (this.f45813a == null) {
                return;
            }
        }
        this.f45813a.edit().putFloat(str, f).apply();
    }

    /* renamed from: d */
    public final void mo50419d(long j, String str) {
        if (this.f45813a == null) {
            mo50417b(m44220a());
            if (this.f45813a == null) {
                return;
            }
        }
        this.f45813a.edit().putLong(str, j).apply();
    }

    /* renamed from: e */
    public final void mo50420e(String str, String str2) {
        if (this.f45813a == null) {
            mo50417b(m44220a());
            if (this.f45813a == null) {
                return;
            }
        }
        if (str2 == null) {
            this.f45813a.edit().remove(str).apply();
        } else {
            this.f45813a.edit().putString(str, str2).apply();
        }
    }

    /* renamed from: f */
    public final void mo50421f(String str, boolean z) {
        if (this.f45813a == null) {
            mo50417b(m44220a());
            if (this.f45813a == null) {
                return;
            }
        }
        this.f45813a.edit().putBoolean(str, z).apply();
    }
}
