package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C3994a;
import com.google.android.exoplayer2.trackselection.C3997b;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.common.collect.C14414n0;
import com.google.common.collect.C14420p;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p099ga.C4887g0;
import p194o5.C5993d;
import p252sb.C6506f;
import p277ub.C6774a0;
import p277ub.C6809w;
import p304x.C7072l1;
import p988j$.util.Spliterator;

public final class DefaultTrackSelector extends C4000c {

    /* renamed from: f */
    public static final int[] f14029f = new int[0];

    /* renamed from: g */
    public static final C14414n0<Integer> f14030g = C14414n0.m35872a(new C5993d(1));

    /* renamed from: h */
    public static final C14414n0<Integer> f14031h = C14414n0.m35872a(new C7072l1(2));

    /* renamed from: d */
    public final C3997b.C3999b f14032d;

    /* renamed from: e */
    public final AtomicReference<Parameters> f14033e;

    /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$a */
    public static final class C3987a implements Comparable<C3987a> {

        /* renamed from: b */
        public final boolean f14067b;

        /* renamed from: c */
        public final String f14068c;

        /* renamed from: d */
        public final Parameters f14069d;

        /* renamed from: e */
        public final boolean f14070e;

        /* renamed from: f */
        public final int f14071f;

        /* renamed from: g */
        public final int f14072g;

        /* renamed from: h */
        public final int f14073h;

        /* renamed from: i */
        public final int f14074i;

        /* renamed from: j */
        public final int f14075j;

        /* renamed from: k */
        public final boolean f14076k;

        /* renamed from: l */
        public final int f14077l;

        /* renamed from: m */
        public final int f14078m;

        /* renamed from: n */
        public final int f14079n;

        /* renamed from: o */
        public final int f14080o;

        public C3987a(Format format, Parameters parameters, int i) {
            int i2;
            int i3;
            boolean z;
            int i4;
            this.f14069d = parameters;
            this.f14068c = DefaultTrackSelector.m10672h(format.f13409d);
            int i5 = 0;
            this.f14070e = DefaultTrackSelector.m10670f(i, false);
            int i6 = 0;
            while (true) {
                i2 = Integer.MAX_VALUE;
                if (i6 >= parameters.f14128b.size()) {
                    i6 = Integer.MAX_VALUE;
                    i3 = 0;
                    break;
                }
                i3 = DefaultTrackSelector.m10668c(format, parameters.f14128b.get(i6), false);
                if (i3 > 0) {
                    break;
                }
                i6++;
            }
            this.f14072g = i6;
            this.f14071f = i3;
            this.f14073h = Integer.bitCount(format.f13411f & parameters.f14129c);
            boolean z2 = true;
            if ((format.f13410e & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f14076k = z;
            int i7 = format.f13431z;
            this.f14077l = i7;
            this.f14078m = format.f13400A;
            int i8 = format.f13414i;
            this.f14079n = i8;
            if ((i8 != -1 && i8 > parameters.f14061x) || (i7 != -1 && i7 > parameters.f14060w)) {
                z2 = false;
            }
            this.f14067b = z2;
            String[] s = C6774a0.m15959s();
            int i9 = 0;
            while (true) {
                if (i9 >= s.length) {
                    i9 = Integer.MAX_VALUE;
                    i4 = 0;
                    break;
                }
                i4 = DefaultTrackSelector.m10668c(format, s[i9], false);
                if (i4 > 0) {
                    break;
                }
                i9++;
            }
            this.f14074i = i9;
            this.f14075j = i4;
            while (true) {
                if (i5 < parameters.f14037C.size()) {
                    String str = format.f13418m;
                    if (str != null && str.equals(parameters.f14037C.get(i5))) {
                        i2 = i5;
                        break;
                    }
                    i5++;
                } else {
                    break;
                }
            }
            this.f14080o = i2;
        }

        /* renamed from: a */
        public final int compareTo(C3987a aVar) {
            C14414n0<Integer> n0Var;
            C14414n0<Integer> n0Var2;
            if (!this.f14067b || !this.f14070e) {
                n0Var = DefaultTrackSelector.f14030g.mo43171c();
            } else {
                n0Var = DefaultTrackSelector.f14030g;
            }
            C14420p b = C14420p.f36310a.mo43228c(this.f14070e, aVar.f14070e).mo43227b(Integer.valueOf(this.f14072g), Integer.valueOf(aVar.f14072g), C14414n0.m35873b().mo43171c()).mo43226a(this.f14071f, aVar.f14071f).mo43226a(this.f14073h, aVar.f14073h).mo43228c(this.f14067b, aVar.f14067b).mo43227b(Integer.valueOf(this.f14080o), Integer.valueOf(aVar.f14080o), C14414n0.m35873b().mo43171c());
            Integer valueOf = Integer.valueOf(this.f14079n);
            Integer valueOf2 = Integer.valueOf(aVar.f14079n);
            if (this.f14069d.f14038D) {
                n0Var2 = DefaultTrackSelector.f14030g.mo43171c();
            } else {
                n0Var2 = DefaultTrackSelector.f14031h;
            }
            C14420p b2 = b.mo43227b(valueOf, valueOf2, n0Var2).mo43228c(this.f14076k, aVar.f14076k).mo43227b(Integer.valueOf(this.f14074i), Integer.valueOf(aVar.f14074i), C14414n0.m35873b().mo43171c()).mo43226a(this.f14075j, aVar.f14075j).mo43227b(Integer.valueOf(this.f14077l), Integer.valueOf(aVar.f14077l), n0Var).mo43227b(Integer.valueOf(this.f14078m), Integer.valueOf(aVar.f14078m), n0Var);
            Integer valueOf3 = Integer.valueOf(this.f14079n);
            Integer valueOf4 = Integer.valueOf(aVar.f14079n);
            if (!C6774a0.m15941a(this.f14068c, aVar.f14068c)) {
                n0Var = DefaultTrackSelector.f14031h;
            }
            return b2.mo43227b(valueOf3, valueOf4, n0Var).mo43230e();
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$b */
    public static final class C3988b implements Comparable<C3988b> {

        /* renamed from: b */
        public final boolean f14081b;

        /* renamed from: c */
        public final boolean f14082c;

        public C3988b(Format format, int i) {
            this.f14081b = (format.f13410e & 1) == 0 ? false : true;
            this.f14082c = DefaultTrackSelector.m10670f(i, false);
        }

        public final int compareTo(Object obj) {
            C3988b bVar = (C3988b) obj;
            return C14420p.f36310a.mo43228c(this.f14082c, bVar.f14082c).mo43228c(this.f14081b, bVar.f14081b).mo43230e();
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$d */
    public static final class C3990d implements Comparable<C3990d> {

        /* renamed from: b */
        public final boolean f14112b;

        /* renamed from: c */
        public final boolean f14113c;

        /* renamed from: d */
        public final boolean f14114d;

        /* renamed from: e */
        public final boolean f14115e;

        /* renamed from: f */
        public final int f14116f;

        /* renamed from: g */
        public final int f14117g;

        /* renamed from: h */
        public final int f14118h;

        /* renamed from: i */
        public final int f14119i;

        /* renamed from: j */
        public final boolean f14120j;

        public C3990d(Format format, Parameters parameters, int i, String str) {
            boolean z;
            boolean z2;
            ImmutableList<String> immutableList;
            int i2;
            boolean z3;
            boolean z4;
            boolean z5 = false;
            this.f14113c = DefaultTrackSelector.m10670f(i, false);
            int i3 = format.f13410e & (~parameters.f14133g);
            if ((i3 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f14114d = z;
            if ((i3 & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f14115e = z2;
            int i4 = Integer.MAX_VALUE;
            if (parameters.f14130d.isEmpty()) {
                immutableList = ImmutableList.m35688E("");
            } else {
                immutableList = parameters.f14130d;
            }
            int i5 = 0;
            while (true) {
                if (i5 >= immutableList.size()) {
                    i2 = 0;
                    break;
                }
                i2 = DefaultTrackSelector.m10668c(format, immutableList.get(i5), parameters.f14132f);
                if (i2 > 0) {
                    i4 = i5;
                    break;
                }
                i5++;
            }
            this.f14116f = i4;
            this.f14117g = i2;
            int bitCount = Integer.bitCount(format.f13411f & parameters.f14131e);
            this.f14118h = bitCount;
            if ((format.f13411f & 1088) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f14120j = z3;
            if (DefaultTrackSelector.m10672h(str) == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int c = DefaultTrackSelector.m10668c(format, str, z4);
            this.f14119i = c;
            if (i2 > 0 || ((parameters.f14130d.isEmpty() && bitCount > 0) || this.f14114d || (this.f14115e && c > 0))) {
                z5 = true;
            }
            this.f14112b = z5;
        }

        /* renamed from: a */
        public final int compareTo(C3990d dVar) {
            C14414n0 n0Var;
            C14420p c = C14420p.f36310a.mo43228c(this.f14113c, dVar.f14113c).mo43227b(Integer.valueOf(this.f14116f), Integer.valueOf(dVar.f14116f), C14414n0.m35873b().mo43171c()).mo43226a(this.f14117g, dVar.f14117g).mo43226a(this.f14118h, dVar.f14118h).mo43228c(this.f14114d, dVar.f14114d);
            Boolean valueOf = Boolean.valueOf(this.f14115e);
            Boolean valueOf2 = Boolean.valueOf(dVar.f14115e);
            if (this.f14117g == 0) {
                n0Var = C14414n0.m35873b();
            } else {
                n0Var = C14414n0.m35873b().mo43171c();
            }
            C14420p a = c.mo43227b(valueOf, valueOf2, n0Var).mo43226a(this.f14119i, dVar.f14119i);
            if (this.f14118h == 0) {
                a = a.mo43229d(this.f14120j, dVar.f14120j);
            }
            return a.mo43230e();
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$e */
    public static final class C3991e implements Comparable<C3991e> {

        /* renamed from: b */
        public final boolean f14121b;

        /* renamed from: c */
        public final Parameters f14122c;

        /* renamed from: d */
        public final boolean f14123d;

        /* renamed from: e */
        public final boolean f14124e;

        /* renamed from: f */
        public final int f14125f;

        /* renamed from: g */
        public final int f14126g;

        /* renamed from: h */
        public final int f14127h;

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0053, code lost:
            if (r10 < ((float) r8.f14051n)) goto L_0x005e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x005b, code lost:
            if (r10 < r8.f14052o) goto L_0x005e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0083  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0098 A[EDGE_INSN: B:55:0x0098->B:53:0x0098 ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C3991e(com.google.android.exoplayer2.Format r7, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r8, int r9, boolean r10) {
            /*
                r6 = this;
                r6.<init>()
                r6.f14122c = r8
                r0 = -1
                r1 = 0
                r2 = 1
                r3 = -1082130432(0xffffffffbf800000, float:-1.0)
                if (r10 == 0) goto L_0x0033
                int r4 = r7.f13423r
                if (r4 == r0) goto L_0x0014
                int r5 = r8.f14045h
                if (r4 > r5) goto L_0x0033
            L_0x0014:
                int r4 = r7.f13424s
                if (r4 == r0) goto L_0x001c
                int r5 = r8.f14046i
                if (r4 > r5) goto L_0x0033
            L_0x001c:
                float r4 = r7.f13425t
                int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r5 == 0) goto L_0x0029
                int r5 = r8.f14047j
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 > 0) goto L_0x0033
            L_0x0029:
                int r4 = r7.f13414i
                if (r4 == r0) goto L_0x0031
                int r5 = r8.f14048k
                if (r4 > r5) goto L_0x0033
            L_0x0031:
                r4 = 1
                goto L_0x0034
            L_0x0033:
                r4 = 0
            L_0x0034:
                r6.f14121b = r4
                if (r10 == 0) goto L_0x005e
                int r10 = r7.f13423r
                if (r10 == r0) goto L_0x0040
                int r4 = r8.f14049l
                if (r10 < r4) goto L_0x005e
            L_0x0040:
                int r10 = r7.f13424s
                if (r10 == r0) goto L_0x0048
                int r4 = r8.f14050m
                if (r10 < r4) goto L_0x005e
            L_0x0048:
                float r10 = r7.f13425t
                int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r3 == 0) goto L_0x0055
                int r3 = r8.f14051n
                float r3 = (float) r3
                int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r10 < 0) goto L_0x005e
            L_0x0055:
                int r10 = r7.f13414i
                if (r10 == r0) goto L_0x005f
                int r3 = r8.f14052o
                if (r10 < r3) goto L_0x005e
                goto L_0x005f
            L_0x005e:
                r2 = 0
            L_0x005f:
                r6.f14123d = r2
                boolean r9 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m10670f(r9, r1)
                r6.f14124e = r9
                int r9 = r7.f13414i
                r6.f14125f = r9
                int r9 = r7.f13423r
                if (r9 == r0) goto L_0x0076
                int r10 = r7.f13424s
                if (r10 != r0) goto L_0x0074
                goto L_0x0076
            L_0x0074:
                int r0 = r9 * r10
            L_0x0076:
                r6.f14126g = r0
                r9 = 2147483647(0x7fffffff, float:NaN)
            L_0x007b:
                com.google.common.collect.ImmutableList<java.lang.String> r10 = r8.f14059v
                int r10 = r10.size()
                if (r1 >= r10) goto L_0x0098
                java.lang.String r10 = r7.f13418m
                if (r10 == 0) goto L_0x0095
                com.google.common.collect.ImmutableList<java.lang.String> r0 = r8.f14059v
                java.lang.Object r0 = r0.get(r1)
                boolean r10 = r10.equals(r0)
                if (r10 == 0) goto L_0x0095
                r9 = r1
                goto L_0x0098
            L_0x0095:
                int r1 = r1 + 1
                goto L_0x007b
            L_0x0098:
                r6.f14127h = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.C3991e.<init>(com.google.android.exoplayer2.Format, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters, int, boolean):void");
        }

        /* renamed from: a */
        public final int compareTo(C3991e eVar) {
            C14414n0<Integer> n0Var;
            C14414n0<Integer> n0Var2;
            if (!this.f14121b || !this.f14124e) {
                n0Var = DefaultTrackSelector.f14030g.mo43171c();
            } else {
                n0Var = DefaultTrackSelector.f14030g;
            }
            C14420p b = C14420p.f36310a.mo43228c(this.f14124e, eVar.f14124e).mo43228c(this.f14121b, eVar.f14121b).mo43228c(this.f14123d, eVar.f14123d).mo43227b(Integer.valueOf(this.f14127h), Integer.valueOf(eVar.f14127h), C14414n0.m35873b().mo43171c());
            Integer valueOf = Integer.valueOf(this.f14125f);
            Integer valueOf2 = Integer.valueOf(eVar.f14125f);
            if (this.f14122c.f14038D) {
                n0Var2 = DefaultTrackSelector.f14030g.mo43171c();
            } else {
                n0Var2 = DefaultTrackSelector.f14031h;
            }
            return b.mo43227b(valueOf, valueOf2, n0Var2).mo43227b(Integer.valueOf(this.f14126g), Integer.valueOf(eVar.f14126g), n0Var).mo43227b(Integer.valueOf(this.f14125f), Integer.valueOf(eVar.f14125f), n0Var).mo43230e();
        }
    }

    @Deprecated
    public DefaultTrackSelector() {
        this(Parameters.f14034K, new C3994a.C3996b());
    }

    /* renamed from: c */
    public static int m10668c(Format format, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(format.f13409d)) {
            return 4;
        }
        String h = m10672h(str);
        String h2 = m10672h(format.f13409d);
        if (h2 == null || h == null) {
            if (!z || h2 != null) {
                return 0;
            }
            return 1;
        } else if (h2.startsWith(h) || h.startsWith(h2)) {
            return 3;
        } else {
            int i = C6774a0.f20959a;
            if (h2.split("-", 2)[0].equals(h.split("-", 2)[0])) {
                return 2;
            }
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList m10669e(com.google.android.exoplayer2.source.TrackGroup r16, int r17, int r18, boolean r19) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0.f14008b
            r3.<init>(r4)
            r4 = 0
            r5 = 0
        L_0x000f:
            int r6 = r0.f14008b
            if (r5 >= r6) goto L_0x001d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3.add(r6)
            int r5 = r5 + 1
            goto L_0x000f
        L_0x001d:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r5) goto L_0x00b7
            if (r2 != r5) goto L_0x0026
            goto L_0x00b7
        L_0x0026:
            r6 = 0
            r7 = 2147483647(0x7fffffff, float:NaN)
        L_0x002a:
            int r8 = r0.f14008b
            r9 = -1
            r10 = 1
            if (r6 >= r8) goto L_0x0089
            com.google.android.exoplayer2.Format[] r8 = r0.f14009c
            r8 = r8[r6]
            int r11 = r8.f13423r
            if (r11 <= 0) goto L_0x0086
            int r12 = r8.f13424s
            if (r12 <= 0) goto L_0x0086
            if (r19 == 0) goto L_0x004c
            if (r11 <= r12) goto L_0x0042
            r13 = 1
            goto L_0x0043
        L_0x0042:
            r13 = 0
        L_0x0043:
            if (r1 <= r2) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r10 = 0
        L_0x0047:
            if (r13 == r10) goto L_0x004c
            r10 = r1
            r13 = r2
            goto L_0x004e
        L_0x004c:
            r13 = r1
            r10 = r2
        L_0x004e:
            int r14 = r11 * r10
            int r15 = r12 * r13
            if (r14 < r15) goto L_0x005f
            android.graphics.Point r10 = new android.graphics.Point
            int r12 = p277ub.C6774a0.f20959a
            int r15 = r15 + r11
            int r15 = r15 + r9
            int r15 = r15 / r11
            r10.<init>(r13, r15)
            goto L_0x006a
        L_0x005f:
            android.graphics.Point r11 = new android.graphics.Point
            int r13 = p277ub.C6774a0.f20959a
            int r14 = r14 + r12
            int r14 = r14 + r9
            int r14 = r14 / r12
            r11.<init>(r14, r10)
            r10 = r11
        L_0x006a:
            int r9 = r8.f13423r
            int r8 = r8.f13424s
            int r11 = r9 * r8
            int r12 = r10.x
            float r12 = (float) r12
            r13 = 1065017672(0x3f7ae148, float:0.98)
            float r12 = r12 * r13
            int r12 = (int) r12
            if (r9 < r12) goto L_0x0086
            int r9 = r10.y
            float r9 = (float) r9
            float r9 = r9 * r13
            int r9 = (int) r9
            if (r8 < r9) goto L_0x0086
            if (r11 >= r7) goto L_0x0086
            r7 = r11
        L_0x0086:
            int r6 = r6 + 1
            goto L_0x002a
        L_0x0089:
            if (r7 == r5) goto L_0x00b7
            int r1 = r3.size()
            int r1 = r1 - r10
        L_0x0090:
            if (r1 < 0) goto L_0x00b7
            java.lang.Object r2 = r3.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.google.android.exoplayer2.Format[] r4 = r0.f14009c
            r2 = r4[r2]
            int r4 = r2.f13423r
            if (r4 == r9) goto L_0x00ac
            int r2 = r2.f13424s
            if (r2 != r9) goto L_0x00a9
            goto L_0x00ac
        L_0x00a9:
            int r4 = r4 * r2
            goto L_0x00ad
        L_0x00ac:
            r4 = -1
        L_0x00ad:
            if (r4 == r9) goto L_0x00b1
            if (r4 <= r7) goto L_0x00b4
        L_0x00b1:
            r3.remove(r1)
        L_0x00b4:
            int r1 = r1 + -1
            goto L_0x0090
        L_0x00b7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m10669e(com.google.android.exoplayer2.source.TrackGroup, int, int, boolean):java.util.ArrayList");
    }

    /* renamed from: f */
    public static boolean m10670f(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    /* renamed from: g */
    public static boolean m10671g(Format format, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i11) {
        int i12;
        if ((format.f13411f & Spliterator.SUBSIZED) != 0 || !m10670f(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !C6774a0.m15941a(format.f13418m, str)) {
            return false;
        }
        int i13 = format.f13423r;
        if (i13 != -1 && (i7 > i13 || i13 > i3)) {
            return false;
        }
        int i14 = format.f13424s;
        if (i14 != -1 && (i8 > i14 || i14 > i4)) {
            return false;
        }
        float f = format.f13425t;
        if ((f == -1.0f || (((float) i9) <= f && f <= ((float) i5))) && (i12 = format.f13414i) != -1 && i11 <= i12 && i12 <= i6) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static String m10672h(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: d */
    public final Parameters mo16302d() {
        return this.f14033e.get();
    }

    /* renamed from: i */
    public final void mo16303i(C3989c cVar) {
        C6506f.C6507a aVar;
        Parameters a = cVar.mo16320a();
        if (!this.f14033e.getAndSet(a).equals(a) && (aVar = this.f20297a) != null) {
            ((C6809w) ((C4887g0) aVar).f16468h).mo23022c(10);
        }
    }

    public DefaultTrackSelector(Parameters parameters, C3994a.C3996b bVar) {
        this.f14032d = bVar;
        this.f14033e = new AtomicReference<>(parameters);
    }

    public static final class SelectionOverride implements Parcelable {
        public static final Parcelable.Creator<SelectionOverride> CREATOR = new C3986a();

        /* renamed from: b */
        public final int f14064b;

        /* renamed from: c */
        public final int[] f14065c;

        /* renamed from: d */
        public final int f14066d;

        /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride$a */
        public class C3986a implements Parcelable.Creator<SelectionOverride> {
            public final Object createFromParcel(Parcel parcel) {
                return new SelectionOverride(parcel);
            }

            public final Object[] newArray(int i) {
                return new SelectionOverride[i];
            }
        }

        public SelectionOverride(int i, int... iArr) {
            this.f14064b = i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f14065c = copyOf;
            this.f14066d = 0;
            Arrays.sort(copyOf);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SelectionOverride.class != obj.getClass()) {
                return false;
            }
            SelectionOverride selectionOverride = (SelectionOverride) obj;
            if (this.f14064b == selectionOverride.f14064b && Arrays.equals(this.f14065c, selectionOverride.f14065c) && this.f14066d == selectionOverride.f14066d) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return ((Arrays.hashCode(this.f14065c) + (this.f14064b * 31)) * 31) + this.f14066d;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f14064b);
            parcel.writeInt(this.f14065c.length);
            parcel.writeIntArray(this.f14065c);
            parcel.writeInt(this.f14066d);
        }

        public SelectionOverride(Parcel parcel) {
            this.f14064b = parcel.readInt();
            int[] iArr = new int[parcel.readByte()];
            this.f14065c = iArr;
            parcel.readIntArray(iArr);
            this.f14066d = parcel.readInt();
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$c */
    public static final class C3989c extends TrackSelectionParameters.C3993b {

        /* renamed from: A */
        public boolean f14083A;

        /* renamed from: B */
        public ImmutableList<String> f14084B;

        /* renamed from: C */
        public boolean f14085C;

        /* renamed from: D */
        public boolean f14086D;

        /* renamed from: E */
        public boolean f14087E;

        /* renamed from: F */
        public boolean f14088F;

        /* renamed from: G */
        public boolean f14089G;

        /* renamed from: H */
        public final SparseArray<Map<TrackGroupArray, SelectionOverride>> f14090H;

        /* renamed from: I */
        public final SparseBooleanArray f14091I;

        /* renamed from: g */
        public int f14092g;

        /* renamed from: h */
        public int f14093h;

        /* renamed from: i */
        public int f14094i;

        /* renamed from: j */
        public int f14095j;

        /* renamed from: k */
        public int f14096k;

        /* renamed from: l */
        public int f14097l;

        /* renamed from: m */
        public int f14098m;

        /* renamed from: n */
        public int f14099n;

        /* renamed from: o */
        public boolean f14100o;

        /* renamed from: p */
        public boolean f14101p;

        /* renamed from: q */
        public boolean f14102q;

        /* renamed from: r */
        public int f14103r;

        /* renamed from: s */
        public int f14104s;

        /* renamed from: t */
        public boolean f14105t;

        /* renamed from: u */
        public ImmutableList<String> f14106u;

        /* renamed from: v */
        public int f14107v;

        /* renamed from: w */
        public int f14108w;

        /* renamed from: x */
        public boolean f14109x;

        /* renamed from: y */
        public boolean f14110y;

        /* renamed from: z */
        public boolean f14111z;

        public C3989c(Context context) {
            mo16323d(context);
            mo16322c();
            this.f14090H = new SparseArray<>();
            this.f14091I = new SparseBooleanArray();
            Point m = C6774a0.m15953m(context);
            int i = m.x;
            int i2 = m.y;
            this.f14103r = i;
            this.f14104s = i2;
            this.f14105t = true;
        }

        /* renamed from: a */
        public final Parameters mo16320a() {
            return new Parameters(this.f14092g, this.f14093h, this.f14094i, this.f14095j, this.f14096k, this.f14097l, this.f14098m, this.f14099n, this.f14100o, this.f14101p, this.f14102q, this.f14103r, this.f14104s, this.f14105t, this.f14106u, this.f14134a, this.f14135b, this.f14107v, this.f14108w, this.f14109x, this.f14110y, this.f14111z, this.f14083A, this.f14084B, this.f14136c, this.f14137d, this.f14138e, this.f14139f, this.f14085C, this.f14086D, this.f14087E, this.f14088F, this.f14089G, this.f14090H, this.f14091I);
        }

        /* renamed from: b */
        public final void mo16321b(int i) {
            Map map = this.f14090H.get(i);
            if (map != null && !map.isEmpty()) {
                this.f14090H.remove(i);
            }
        }

        /* renamed from: c */
        public final void mo16322c() {
            this.f14092g = Integer.MAX_VALUE;
            this.f14093h = Integer.MAX_VALUE;
            this.f14094i = Integer.MAX_VALUE;
            this.f14095j = Integer.MAX_VALUE;
            this.f14100o = true;
            this.f14101p = false;
            this.f14102q = true;
            this.f14103r = Integer.MAX_VALUE;
            this.f14104s = Integer.MAX_VALUE;
            this.f14105t = true;
            this.f14106u = ImmutableList.m35687D();
            this.f14107v = Integer.MAX_VALUE;
            this.f14108w = Integer.MAX_VALUE;
            this.f14109x = true;
            this.f14110y = false;
            this.f14111z = false;
            this.f14083A = false;
            this.f14084B = ImmutableList.m35687D();
            this.f14085C = false;
            this.f14086D = false;
            this.f14087E = true;
            this.f14088F = false;
            this.f14089G = true;
        }

        /* renamed from: d */
        public final void mo16323d(Context context) {
            CaptioningManager captioningManager;
            String str;
            int i = C6774a0.f20959a;
            if (i < 19) {
                return;
            }
            if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f14137d = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    if (i >= 21) {
                        str = locale.toLanguageTag();
                    } else {
                        str = locale.toString();
                    }
                    this.f14136c = ImmutableList.m35688E(str);
                }
            }
        }

        /* renamed from: e */
        public final void mo16324e(int i, boolean z) {
            if (this.f14091I.get(i) != z) {
                if (z) {
                    this.f14091I.put(i, true);
                } else {
                    this.f14091I.delete(i);
                }
            }
        }

        @Deprecated
        public C3989c() {
            mo16322c();
            this.f14090H = new SparseArray<>();
            this.f14091I = new SparseBooleanArray();
        }

        public C3989c(Parameters parameters) {
            super(parameters);
            this.f14092g = parameters.f14045h;
            this.f14093h = parameters.f14046i;
            this.f14094i = parameters.f14047j;
            this.f14095j = parameters.f14048k;
            this.f14096k = parameters.f14049l;
            this.f14097l = parameters.f14050m;
            this.f14098m = parameters.f14051n;
            this.f14099n = parameters.f14052o;
            this.f14100o = parameters.f14053p;
            this.f14101p = parameters.f14054q;
            this.f14102q = parameters.f14055r;
            this.f14103r = parameters.f14056s;
            this.f14104s = parameters.f14057t;
            this.f14105t = parameters.f14058u;
            this.f14106u = parameters.f14059v;
            this.f14107v = parameters.f14060w;
            this.f14108w = parameters.f14061x;
            this.f14109x = parameters.f14062y;
            this.f14110y = parameters.f14063z;
            this.f14111z = parameters.f14035A;
            this.f14083A = parameters.f14036B;
            this.f14084B = parameters.f14037C;
            this.f14085C = parameters.f14038D;
            this.f14086D = parameters.f14039E;
            this.f14087E = parameters.f14040F;
            this.f14088F = parameters.f14041G;
            this.f14089G = parameters.f14042H;
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = parameters.f14043I;
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2 = new SparseArray<>();
            for (int i = 0; i < sparseArray.size(); i++) {
                sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
            }
            this.f14090H = sparseArray2;
            this.f14091I = parameters.f14044J.clone();
        }
    }

    public static final class Parameters extends TrackSelectionParameters {
        public static final Parcelable.Creator<Parameters> CREATOR = new C3985a();

        /* renamed from: K */
        public static final Parameters f14034K = new C3989c().mo16320a();

        /* renamed from: A */
        public final boolean f14035A;

        /* renamed from: B */
        public final boolean f14036B;

        /* renamed from: C */
        public final ImmutableList<String> f14037C;

        /* renamed from: D */
        public final boolean f14038D;

        /* renamed from: E */
        public final boolean f14039E;

        /* renamed from: F */
        public final boolean f14040F;

        /* renamed from: G */
        public final boolean f14041G;

        /* renamed from: H */
        public final boolean f14042H;

        /* renamed from: I */
        public final SparseArray<Map<TrackGroupArray, SelectionOverride>> f14043I;

        /* renamed from: J */
        public final SparseBooleanArray f14044J;

        /* renamed from: h */
        public final int f14045h;

        /* renamed from: i */
        public final int f14046i;

        /* renamed from: j */
        public final int f14047j;

        /* renamed from: k */
        public final int f14048k;

        /* renamed from: l */
        public final int f14049l;

        /* renamed from: m */
        public final int f14050m;

        /* renamed from: n */
        public final int f14051n;

        /* renamed from: o */
        public final int f14052o;

        /* renamed from: p */
        public final boolean f14053p;

        /* renamed from: q */
        public final boolean f14054q;

        /* renamed from: r */
        public final boolean f14055r;

        /* renamed from: s */
        public final int f14056s;

        /* renamed from: t */
        public final int f14057t;

        /* renamed from: u */
        public final boolean f14058u;

        /* renamed from: v */
        public final ImmutableList<String> f14059v;

        /* renamed from: w */
        public final int f14060w;

        /* renamed from: x */
        public final int f14061x;

        /* renamed from: y */
        public final boolean f14062y;

        /* renamed from: z */
        public final boolean f14063z;

        /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$a */
        public class C3985a implements Parcelable.Creator<Parameters> {
            public final Object createFromParcel(Parcel parcel) {
                return new Parameters(parcel);
            }

            public final Object[] newArray(int i) {
                return new Parameters[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Parameters(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3, int i9, int i11, boolean z4, ImmutableList<String> immutableList, ImmutableList<String> immutableList2, int i12, int i13, int i14, boolean z5, boolean z6, boolean z7, boolean z8, ImmutableList<String> immutableList3, ImmutableList<String> immutableList4, int i15, boolean z9, int i16, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray) {
            super(immutableList2, i12, immutableList4, i15, z9, i16);
            this.f14045h = i;
            this.f14046i = i2;
            this.f14047j = i3;
            this.f14048k = i4;
            this.f14049l = i5;
            this.f14050m = i6;
            this.f14051n = i7;
            this.f14052o = i8;
            this.f14053p = z;
            this.f14054q = z2;
            this.f14055r = z3;
            this.f14056s = i9;
            this.f14057t = i11;
            this.f14058u = z4;
            this.f14059v = immutableList;
            this.f14060w = i13;
            this.f14061x = i14;
            this.f14062y = z5;
            this.f14063z = z6;
            this.f14035A = z7;
            this.f14036B = z8;
            this.f14037C = immutableList3;
            this.f14038D = z11;
            this.f14039E = z12;
            this.f14040F = z13;
            this.f14041G = z14;
            this.f14042H = z15;
            this.f14043I = sparseArray;
            this.f14044J = sparseBooleanArray;
        }

        /* renamed from: b */
        public final boolean mo16304b(int i, TrackGroupArray trackGroupArray) {
            Map map = this.f14043I.get(i);
            if (map == null || !map.containsKey(trackGroupArray)) {
                return false;
            }
            return true;
        }

        public final int describeContents() {
            return 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r11) {
            /*
                r10 = this;
                r0 = 1
                if (r10 != r11) goto L_0x0004
                return r0
            L_0x0004:
                r1 = 0
                if (r11 == 0) goto L_0x0159
                java.lang.Class<com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters> r2 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.class
                java.lang.Class r3 = r11.getClass()
                if (r2 == r3) goto L_0x0011
                goto L_0x0159
            L_0x0011:
                r2 = r11
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r2 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters) r2
                boolean r11 = super.equals(r11)
                if (r11 == 0) goto L_0x0157
                int r11 = r10.f14045h
                int r3 = r2.f14045h
                if (r11 != r3) goto L_0x0157
                int r11 = r10.f14046i
                int r3 = r2.f14046i
                if (r11 != r3) goto L_0x0157
                int r11 = r10.f14047j
                int r3 = r2.f14047j
                if (r11 != r3) goto L_0x0157
                int r11 = r10.f14048k
                int r3 = r2.f14048k
                if (r11 != r3) goto L_0x0157
                int r11 = r10.f14049l
                int r3 = r2.f14049l
                if (r11 != r3) goto L_0x0157
                int r11 = r10.f14050m
                int r3 = r2.f14050m
                if (r11 != r3) goto L_0x0157
                int r11 = r10.f14051n
                int r3 = r2.f14051n
                if (r11 != r3) goto L_0x0157
                int r11 = r10.f14052o
                int r3 = r2.f14052o
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.f14053p
                boolean r3 = r2.f14053p
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.f14054q
                boolean r3 = r2.f14054q
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.f14055r
                boolean r3 = r2.f14055r
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.f14058u
                boolean r3 = r2.f14058u
                if (r11 != r3) goto L_0x0157
                int r11 = r10.f14056s
                int r3 = r2.f14056s
                if (r11 != r3) goto L_0x0157
                int r11 = r10.f14057t
                int r3 = r2.f14057t
                if (r11 != r3) goto L_0x0157
                com.google.common.collect.ImmutableList<java.lang.String> r11 = r10.f14059v
                com.google.common.collect.ImmutableList<java.lang.String> r3 = r2.f14059v
                boolean r11 = r11.equals(r3)
                if (r11 == 0) goto L_0x0157
                int r11 = r10.f14060w
                int r3 = r2.f14060w
                if (r11 != r3) goto L_0x0157
                int r11 = r10.f14061x
                int r3 = r2.f14061x
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.f14062y
                boolean r3 = r2.f14062y
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.f14063z
                boolean r3 = r2.f14063z
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.f14035A
                boolean r3 = r2.f14035A
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.f14036B
                boolean r3 = r2.f14036B
                if (r11 != r3) goto L_0x0157
                com.google.common.collect.ImmutableList<java.lang.String> r11 = r10.f14037C
                com.google.common.collect.ImmutableList<java.lang.String> r3 = r2.f14037C
                boolean r11 = r11.equals(r3)
                if (r11 == 0) goto L_0x0157
                boolean r11 = r10.f14038D
                boolean r3 = r2.f14038D
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.f14039E
                boolean r3 = r2.f14039E
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.f14040F
                boolean r3 = r2.f14040F
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.f14041G
                boolean r3 = r2.f14041G
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.f14042H
                boolean r3 = r2.f14042H
                if (r11 != r3) goto L_0x0157
                android.util.SparseBooleanArray r11 = r10.f14044J
                android.util.SparseBooleanArray r3 = r2.f14044J
                int r4 = r11.size()
                int r5 = r3.size()
                if (r5 == r4) goto L_0x00d4
            L_0x00d2:
                r11 = 0
                goto L_0x00e6
            L_0x00d4:
                r5 = 0
            L_0x00d5:
                if (r5 >= r4) goto L_0x00e5
                int r6 = r11.keyAt(r5)
                int r6 = r3.indexOfKey(r6)
                if (r6 >= 0) goto L_0x00e2
                goto L_0x00d2
            L_0x00e2:
                int r5 = r5 + 1
                goto L_0x00d5
            L_0x00e5:
                r11 = 1
            L_0x00e6:
                if (r11 == 0) goto L_0x0157
                android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride>> r11 = r10.f14043I
                android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride>> r2 = r2.f14043I
                int r3 = r11.size()
                int r4 = r2.size()
                if (r4 == r3) goto L_0x00f8
            L_0x00f6:
                r11 = 0
                goto L_0x0154
            L_0x00f8:
                r4 = 0
            L_0x00f9:
                if (r4 >= r3) goto L_0x0153
                int r5 = r11.keyAt(r4)
                int r5 = r2.indexOfKey(r5)
                if (r5 < 0) goto L_0x00f6
                java.lang.Object r6 = r11.valueAt(r4)
                java.util.Map r6 = (java.util.Map) r6
                java.lang.Object r5 = r2.valueAt(r5)
                java.util.Map r5 = (java.util.Map) r5
                int r7 = r6.size()
                int r8 = r5.size()
                if (r8 == r7) goto L_0x011c
                goto L_0x014a
            L_0x011c:
                java.util.Set r6 = r6.entrySet()
                java.util.Iterator r6 = r6.iterator()
            L_0x0124:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x014c
                java.lang.Object r7 = r6.next()
                java.util.Map$Entry r7 = (java.util.Map.Entry) r7
                java.lang.Object r8 = r7.getKey()
                com.google.android.exoplayer2.source.TrackGroupArray r8 = (com.google.android.exoplayer2.source.TrackGroupArray) r8
                boolean r9 = r5.containsKey(r8)
                if (r9 == 0) goto L_0x014a
                java.lang.Object r7 = r7.getValue()
                java.lang.Object r8 = r5.get(r8)
                boolean r7 = p277ub.C6774a0.m15941a(r7, r8)
                if (r7 != 0) goto L_0x0124
            L_0x014a:
                r5 = 0
                goto L_0x014d
            L_0x014c:
                r5 = 1
            L_0x014d:
                if (r5 != 0) goto L_0x0150
                goto L_0x00f6
            L_0x0150:
                int r4 = r4 + 1
                goto L_0x00f9
            L_0x0153:
                r11 = 1
            L_0x0154:
                if (r11 == 0) goto L_0x0157
                goto L_0x0158
            L_0x0157:
                r0 = 0
            L_0x0158:
                return r0
            L_0x0159:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            int hashCode = this.f14059v.hashCode();
            return ((((((((((this.f14037C.hashCode() + ((((((((((((((hashCode + (((((((((((((((((((((((((((((super.hashCode() * 31) + this.f14045h) * 31) + this.f14046i) * 31) + this.f14047j) * 31) + this.f14048k) * 31) + this.f14049l) * 31) + this.f14050m) * 31) + this.f14051n) * 31) + this.f14052o) * 31) + (this.f14053p ? 1 : 0)) * 31) + (this.f14054q ? 1 : 0)) * 31) + (this.f14055r ? 1 : 0)) * 31) + (this.f14058u ? 1 : 0)) * 31) + this.f14056s) * 31) + this.f14057t) * 31)) * 31) + this.f14060w) * 31) + this.f14061x) * 31) + (this.f14062y ? 1 : 0)) * 31) + (this.f14063z ? 1 : 0)) * 31) + (this.f14035A ? 1 : 0)) * 31) + (this.f14036B ? 1 : 0)) * 31)) * 31) + (this.f14038D ? 1 : 0)) * 31) + (this.f14039E ? 1 : 0)) * 31) + (this.f14040F ? 1 : 0)) * 31) + (this.f14041G ? 1 : 0)) * 31) + (this.f14042H ? 1 : 0);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f14045h);
            parcel.writeInt(this.f14046i);
            parcel.writeInt(this.f14047j);
            parcel.writeInt(this.f14048k);
            parcel.writeInt(this.f14049l);
            parcel.writeInt(this.f14050m);
            parcel.writeInt(this.f14051n);
            parcel.writeInt(this.f14052o);
            boolean z = this.f14053p;
            int i2 = C6774a0.f20959a;
            parcel.writeInt(z ? 1 : 0);
            parcel.writeInt(this.f14054q ? 1 : 0);
            parcel.writeInt(this.f14055r ? 1 : 0);
            parcel.writeInt(this.f14056s);
            parcel.writeInt(this.f14057t);
            parcel.writeInt(this.f14058u ? 1 : 0);
            parcel.writeList(this.f14059v);
            parcel.writeInt(this.f14060w);
            parcel.writeInt(this.f14061x);
            parcel.writeInt(this.f14062y ? 1 : 0);
            parcel.writeInt(this.f14063z ? 1 : 0);
            parcel.writeInt(this.f14035A ? 1 : 0);
            parcel.writeInt(this.f14036B ? 1 : 0);
            parcel.writeList(this.f14037C);
            parcel.writeInt(this.f14038D ? 1 : 0);
            parcel.writeInt(this.f14039E ? 1 : 0);
            parcel.writeInt(this.f14040F ? 1 : 0);
            parcel.writeInt(this.f14041G ? 1 : 0);
            parcel.writeInt(this.f14042H ? 1 : 0);
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = this.f14043I;
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = sparseArray.keyAt(i3);
                Map valueAt = sparseArray.valueAt(i3);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry entry : valueAt.entrySet()) {
                    parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                    parcel.writeParcelable((Parcelable) entry.getValue(), 0);
                }
            }
            parcel.writeSparseBooleanArray(this.f14044J);
        }

        public Parameters(Parcel parcel) {
            super(parcel);
            this.f14045h = parcel.readInt();
            this.f14046i = parcel.readInt();
            this.f14047j = parcel.readInt();
            this.f14048k = parcel.readInt();
            this.f14049l = parcel.readInt();
            this.f14050m = parcel.readInt();
            this.f14051n = parcel.readInt();
            this.f14052o = parcel.readInt();
            int i = C6774a0.f20959a;
            boolean z = true;
            this.f14053p = parcel.readInt() != 0;
            this.f14054q = parcel.readInt() != 0;
            this.f14055r = parcel.readInt() != 0;
            this.f14056s = parcel.readInt();
            this.f14057t = parcel.readInt();
            this.f14058u = parcel.readInt() != 0;
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, (ClassLoader) null);
            this.f14059v = ImmutableList.m35691z(arrayList);
            this.f14060w = parcel.readInt();
            this.f14061x = parcel.readInt();
            this.f14062y = parcel.readInt() != 0;
            this.f14063z = parcel.readInt() != 0;
            this.f14035A = parcel.readInt() != 0;
            this.f14036B = parcel.readInt() != 0;
            ArrayList arrayList2 = new ArrayList();
            parcel.readList(arrayList2, (ClassLoader) null);
            this.f14037C = ImmutableList.m35691z(arrayList2);
            this.f14038D = parcel.readInt() != 0;
            this.f14039E = parcel.readInt() != 0;
            this.f14040F = parcel.readInt() != 0;
            this.f14041G = parcel.readInt() != 0;
            this.f14042H = parcel.readInt() == 0 ? false : z;
            int readInt = parcel.readInt();
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = new SparseArray<>(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i3 = 0; i3 < readInt3; i3++) {
                    TrackGroupArray trackGroupArray = (TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader());
                    trackGroupArray.getClass();
                    hashMap.put(trackGroupArray, (SelectionOverride) parcel.readParcelable(SelectionOverride.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            this.f14043I = sparseArray;
            this.f14044J = parcel.readSparseBooleanArray();
        }
    }
}
