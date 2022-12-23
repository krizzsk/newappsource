package p556if;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import p067e1.C4497k;
import p626lf.C18200a;
import p649mf.C18366a;
import p790sf.C19454b;

/* renamed from: if.d */
public final class C17597d {

    /* renamed from: e */
    public static final C18200a f45268e = C18200a.m44901d();

    /* renamed from: a */
    public final Activity f45269a;

    /* renamed from: b */
    public final C4497k f45270b;

    /* renamed from: c */
    public final Map<Fragment, C18366a> f45271c;

    /* renamed from: d */
    public boolean f45272d;

    @VisibleForTesting
    public C17597d() {
        throw null;
    }

    public C17597d(Activity activity) {
        C4497k kVar = new C4497k();
        HashMap hashMap = new HashMap();
        this.f45272d = false;
        this.f45269a = activity;
        this.f45270b = kVar;
        this.f45271c = hashMap;
    }

    /* renamed from: a */
    public final C19454b<C18366a> mo50071a() {
        if (!this.f45272d) {
            f45268e.mo50610a();
            return new C19454b<>();
        }
        SparseIntArray[] b = this.f45270b.f15576a.mo20017b();
        if (b == null) {
            f45268e.mo50610a();
            return new C19454b<>();
        }
        SparseIntArray sparseIntArray = b[0];
        if (sparseIntArray == null) {
            f45268e.mo50610a();
            return new C19454b<>();
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
            int keyAt = sparseIntArray.keyAt(i4);
            int valueAt = sparseIntArray.valueAt(i4);
            i += valueAt;
            if (keyAt > 700) {
                i3 += valueAt;
            }
            if (keyAt > 16) {
                i2 += valueAt;
            }
        }
        return new C19454b<>(new C18366a(i, i2, i3));
    }
}
