package p081f3;

import p001a0.C0016g;

/* renamed from: f3.h */
public abstract class C4656h {

    /* renamed from: a */
    public static C4656h f15899a;

    /* renamed from: f3.h$a */
    public static class C4657a extends C4656h {

        /* renamed from: b */
        public int f15900b;

        public C4657a(int i) {
            this.f15900b = i;
        }

        /* renamed from: a */
        public final void mo20176a(Throwable... thArr) {
            if (this.f15900b <= 3 && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        /* renamed from: b */
        public final void mo20177b(Throwable... thArr) {
            if (this.f15900b <= 6 && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        /* renamed from: d */
        public final void mo20178d(Throwable... thArr) {
            if (this.f15900b <= 4 && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        /* renamed from: f */
        public final void mo20179f(Throwable... thArr) {
            if (this.f15900b <= 5 && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }
    }

    /* renamed from: c */
    public static synchronized C4656h m11960c() {
        C4656h hVar;
        synchronized (C4656h.class) {
            if (f15899a == null) {
                f15899a = new C4657a(3);
            }
            hVar = f15899a;
        }
        return hVar;
    }

    /* renamed from: e */
    public static String m11961e(String str) {
        int length = str.length();
        StringBuilder r = C0016g.m34r(23, "WM-");
        if (length >= 20) {
            r.append(str.substring(0, 20));
        } else {
            r.append(str);
        }
        return r.toString();
    }

    /* renamed from: a */
    public abstract void mo20176a(Throwable... thArr);

    /* renamed from: b */
    public abstract void mo20177b(Throwable... thArr);

    /* renamed from: d */
    public abstract void mo20178d(Throwable... thArr);

    /* renamed from: f */
    public abstract void mo20179f(Throwable... thArr);
}
