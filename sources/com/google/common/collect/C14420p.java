package com.google.common.collect;

/* renamed from: com.google.common.collect.p */
public abstract class C14420p {

    /* renamed from: a */
    public static final C14421a f36310a = new C14421a();

    /* renamed from: b */
    public static final C14422b f36311b = new C14422b(-1);

    /* renamed from: c */
    public static final C14422b f36312c = new C14422b(1);

    /* renamed from: com.google.common.collect.p$a */
    public class C14421a extends C14420p {
        /* renamed from: f */
        public static C14420p m35883f(int i) {
            return i < 0 ? C14420p.f36311b : i > 0 ? C14420p.f36312c : C14420p.f36310a;
        }

        /* renamed from: a */
        public final C14420p mo43226a(int i, int i2) {
            return m35883f(i < i2 ? -1 : i > i2 ? 1 : 0);
        }

        /* renamed from: b */
        public final C14420p mo43227b(Object obj, Object obj2, C14414n0 n0Var) {
            return m35883f(n0Var.compare(obj, obj2));
        }

        /* renamed from: c */
        public final C14420p mo43228c(boolean z, boolean z2) {
            return m35883f(z == z2 ? 0 : z ? 1 : -1);
        }

        /* renamed from: d */
        public final C14420p mo43229d(boolean z, boolean z2) {
            return m35883f(z2 == z ? 0 : z2 ? 1 : -1);
        }

        /* renamed from: e */
        public final int mo43230e() {
            return 0;
        }
    }

    /* renamed from: com.google.common.collect.p$b */
    public static final class C14422b extends C14420p {

        /* renamed from: d */
        public final int f36313d;

        public C14422b(int i) {
            this.f36313d = i;
        }

        /* renamed from: a */
        public final C14420p mo43226a(int i, int i2) {
            return this;
        }

        /* renamed from: b */
        public final C14420p mo43227b(Object obj, Object obj2, C14414n0 n0Var) {
            return this;
        }

        /* renamed from: c */
        public final C14420p mo43228c(boolean z, boolean z2) {
            return this;
        }

        /* renamed from: d */
        public final C14420p mo43229d(boolean z, boolean z2) {
            return this;
        }

        /* renamed from: e */
        public final int mo43230e() {
            return this.f36313d;
        }
    }

    /* renamed from: a */
    public abstract C14420p mo43226a(int i, int i2);

    /* renamed from: b */
    public abstract C14420p mo43227b(Object obj, Object obj2, C14414n0 n0Var);

    /* renamed from: c */
    public abstract C14420p mo43228c(boolean z, boolean z2);

    /* renamed from: d */
    public abstract C14420p mo43229d(boolean z, boolean z2);

    /* renamed from: e */
    public abstract int mo43230e();
}
