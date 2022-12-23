package uh0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import lf0.C24240p;
import mf0.C24362h;
import nf0.C24497a;
import p584jl.C17885a;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;
import rf0.C24806h;
import th0.C25003h;

/* renamed from: uh0.b */
public final class C25073b implements C25003h<C24806h> {

    /* renamed from: a */
    public final CharSequence f63274a;

    /* renamed from: b */
    public final int f63275b;

    /* renamed from: c */
    public final int f63276c;

    /* renamed from: d */
    public final C24240p<CharSequence, Integer, Pair<Integer, Integer>> f63277d;

    /* renamed from: uh0.b$a */
    public static final class C25074a implements Iterator<C24806h>, C24497a, p988j$.util.Iterator {

        /* renamed from: b */
        public int f63278b = -1;

        /* renamed from: c */
        public int f63279c;

        /* renamed from: d */
        public int f63280d;

        /* renamed from: e */
        public C24806h f63281e;

        /* renamed from: f */
        public int f63282f;

        /* renamed from: g */
        public final /* synthetic */ C25073b f63283g;

        public C25074a(C25073b bVar) {
            this.f63283g = bVar;
            int u = C17885a.m44464u(bVar.f63275b, 0, bVar.f63274a.length());
            this.f63279c = u;
            this.f63280d = u;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r6 < r3) goto L_0x001b;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo61608b() {
            /*
                r7 = this;
                int r0 = r7.f63280d
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r7.f63278b = r1
                r0 = 0
                r7.f63281e = r0
                goto L_0x0086
            L_0x000c:
                uh0.b r2 = r7.f63283g
                int r3 = r2.f63276c
                r4 = -1
                r5 = 1
                if (r3 <= 0) goto L_0x001b
                int r6 = r7.f63282f
                int r6 = r6 + r5
                r7.f63282f = r6
                if (r6 >= r3) goto L_0x0023
            L_0x001b:
                java.lang.CharSequence r2 = r2.f63274a
                int r2 = r2.length()
                if (r0 <= r2) goto L_0x0037
            L_0x0023:
                rf0.h r0 = new rf0.h
                int r1 = r7.f63279c
                uh0.b r2 = r7.f63283g
                java.lang.CharSequence r2 = r2.f63274a
                int r2 = kotlin.text.C24179b.m60561I(r2)
                r0.<init>(r1, r2)
                r7.f63281e = r0
                r7.f63280d = r4
                goto L_0x0084
            L_0x0037:
                uh0.b r0 = r7.f63283g
                lf0.p<java.lang.CharSequence, java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> r2 = r0.f63277d
                java.lang.CharSequence r0 = r0.f63274a
                int r3 = r7.f63280d
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r0 = r2.invoke(r0, r3)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L_0x005f
                rf0.h r0 = new rf0.h
                int r1 = r7.f63279c
                uh0.b r2 = r7.f63283g
                java.lang.CharSequence r2 = r2.f63274a
                int r2 = kotlin.text.C24179b.m60561I(r2)
                r0.<init>(r1, r2)
                r7.f63281e = r0
                r7.f63280d = r4
                goto L_0x0084
            L_0x005f:
                java.lang.Object r2 = r0.mo59066a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo59067b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f63279c
                rf0.h r3 = p584jl.C17885a.m44393C0(r3, r2)
                r7.f63281e = r3
                int r2 = r2 + r0
                r7.f63279c = r2
                if (r0 != 0) goto L_0x0081
                r1 = 1
            L_0x0081:
                int r2 = r2 + r1
                r7.f63280d = r2
            L_0x0084:
                r7.f63278b = r5
            L_0x0086:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uh0.C25073b.C25074a.mo61608b():void");
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            if (this.f63278b == -1) {
                mo61608b();
            }
            if (this.f63278b == 1) {
                return true;
            }
            return false;
        }

        public final Object next() {
            if (this.f63278b == -1) {
                mo61608b();
            }
            if (this.f63278b != 0) {
                C24806h hVar = this.f63281e;
                C24362h.m61209d(hVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f63281e = null;
                this.f63278b = -1;
                return hVar;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C25073b(CharSequence charSequence, int i, int i2, C24240p<? super CharSequence, ? super Integer, Pair<Integer, Integer>> pVar) {
        C24362h.m61211f(charSequence, "input");
        this.f63274a = charSequence;
        this.f63275b = i;
        this.f63276c = i2;
        this.f63277d = pVar;
    }

    public final java.util.Iterator<C24806h> iterator() {
        return new C25074a(this);
    }
}
