package androidx.fragment.app;

import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.h0 */
public abstract class C0932h0 {

    /* renamed from: a */
    public ArrayList<C0933a> f3771a = new ArrayList<>();

    /* renamed from: b */
    public int f3772b;

    /* renamed from: c */
    public int f3773c;

    /* renamed from: d */
    public int f3774d;

    /* renamed from: e */
    public int f3775e;

    /* renamed from: f */
    public int f3776f;

    /* renamed from: g */
    public boolean f3777g;

    /* renamed from: h */
    public boolean f3778h = true;

    /* renamed from: i */
    public String f3779i;

    /* renamed from: j */
    public int f3780j;

    /* renamed from: k */
    public CharSequence f3781k;

    /* renamed from: l */
    public int f3782l;

    /* renamed from: m */
    public CharSequence f3783m;

    /* renamed from: n */
    public ArrayList<String> f3784n;

    /* renamed from: o */
    public ArrayList<String> f3785o;

    /* renamed from: p */
    public boolean f3786p = false;

    /* renamed from: q */
    public ArrayList<Runnable> f3787q;

    /* renamed from: androidx.fragment.app.h0$a */
    public static final class C0933a {

        /* renamed from: a */
        public int f3788a;

        /* renamed from: b */
        public Fragment f3789b;

        /* renamed from: c */
        public boolean f3790c;

        /* renamed from: d */
        public int f3791d;

        /* renamed from: e */
        public int f3792e;

        /* renamed from: f */
        public int f3793f;

        /* renamed from: g */
        public int f3794g;

        /* renamed from: h */
        public Lifecycle.State f3795h;

        /* renamed from: i */
        public Lifecycle.State f3796i;

        public C0933a() {
        }

        public C0933a(Fragment fragment, int i) {
            this.f3788a = i;
            this.f3789b = fragment;
            this.f3790c = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f3795h = state;
            this.f3796i = state;
        }

        public C0933a(int i, Fragment fragment) {
            this.f3788a = i;
            this.f3789b = fragment;
            this.f3790c = true;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f3795h = state;
            this.f3796i = state;
        }

        public C0933a(Fragment fragment, Lifecycle.State state) {
            this.f3788a = 10;
            this.f3789b = fragment;
            this.f3790c = false;
            this.f3795h = fragment.mMaxState;
            this.f3796i = state;
        }
    }

    /* renamed from: b */
    public final void mo4109b(C0933a aVar) {
        this.f3771a.add(aVar);
        aVar.f3791d = this.f3772b;
        aVar.f3792e = this.f3773c;
        aVar.f3793f = this.f3774d;
        aVar.f3794g = this.f3775e;
    }

    /* renamed from: c */
    public final void mo4110c(String str) {
        if (this.f3778h) {
            this.f3777g = true;
            this.f3779i = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* renamed from: d */
    public abstract int mo4040d();

    /* renamed from: e */
    public abstract void mo4041e(int i, Fragment fragment, String str, int i2);

    /* renamed from: f */
    public final void mo4111f(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo4041e(i, fragment, str, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: g */
    public final void mo4112g(int i, int i2, int i3, int i4) {
        this.f3772b = i;
        this.f3773c = i2;
        this.f3774d = i3;
        this.f3775e = i4;
    }
}
