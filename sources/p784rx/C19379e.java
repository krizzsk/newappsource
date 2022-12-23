package p784rx;

import android.content.SharedPreferences;
import java.util.List;
import p784rx.C19376b;
import p784rx.C19379e.C19380a;

/* renamed from: rx.e */
public final class C19379e<C extends C19376b & C19380a> extends C19375a<C> {

    /* renamed from: c */
    public final int f49302c = 2;

    /* renamed from: rx.e$a */
    public interface C19380a {
        /* renamed from: a */
        void mo51789a(SharedPreferences sharedPreferences, SharedPreferences.Editor editor, String str);

        /* renamed from: b */
        void mo51790b();
    }

    public C19379e(List list) {
        super(list);
    }

    /* renamed from: d */
    public final boolean mo51787d(SharedPreferences sharedPreferences, String str) {
        return mo51784h(sharedPreferences, str, Math.max(0, sharedPreferences.getInt(mo51786c(str) + ".index", -1)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
        if (r8 > r7) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        if (r0 == -1) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        if (r8 >= r7) goto L_0x004b;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51788e(android.content.SharedPreferences r10, android.content.SharedPreferences.Editor r11, java.lang.String r12) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r9.mo51786c(r12)
            r0.append(r1)
            java.lang.String r1 = ".index"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2 = -1
            int r0 = r10.getInt(r0, r2)
            r3 = 0
            int r4 = java.lang.Math.max(r3, r0)
            boolean r5 = r9.mo51785i(r10, r11, r12, r4)
            r6 = 1
            r5 = r5 ^ r6
            rx.b r7 = r9.mo51782f(r4)
            if (r7 == 0) goto L_0x0033
            rx.e$a r7 = (p784rx.C19379e.C19380a) r7
            r7.mo51790b()
            if (r0 != r2) goto L_0x0033
            goto L_0x004b
        L_0x0033:
            int r0 = r9.f49302c
            java.util.List<C> r7 = r9.f49299b
            int r7 = r7.size()
            int r8 = r4 + 1
            if (r0 == r6) goto L_0x0047
            r6 = 2
            if (r0 == r6) goto L_0x0044
        L_0x0042:
            r3 = -1
            goto L_0x004b
        L_0x0044:
            if (r8 < r7) goto L_0x004a
            goto L_0x004b
        L_0x0047:
            if (r8 <= r7) goto L_0x004a
            goto L_0x0042
        L_0x004a:
            r3 = r8
        L_0x004b:
            if (r5 == 0) goto L_0x0077
            if (r3 == r2) goto L_0x0077
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r9.mo51786c(r12)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11.putInt(r0, r3)
            if (r4 == r3) goto L_0x0077
            rx.b r0 = r9.mo51782f(r3)
            if (r0 != 0) goto L_0x006e
            goto L_0x0077
        L_0x006e:
            java.lang.String r12 = r9.mo51783g(r3, r12)
            rx.e$a r0 = (p784rx.C19379e.C19380a) r0
            r0.mo51789a(r10, r11, r12)
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p784rx.C19379e.mo51788e(android.content.SharedPreferences, android.content.SharedPreferences$Editor, java.lang.String):void");
    }
}
