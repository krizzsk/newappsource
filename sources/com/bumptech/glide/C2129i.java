package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.SingleRequest;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p060d6.C4385f;
import p169m6.C5710d;
import p221q6.C6198o;
import p260t6.C6595a;
import p260t6.C6597c;
import p260t6.C6598d;
import p260t6.C6599e;
import p260t6.C6601f;
import p260t6.C6602g;
import p273u6.C6709b;
import p273u6.C6714e;
import p273u6.C6720j;
import p311x6.C7166e;
import p311x6.C7176l;
import p497fs.C17066a;
import p584jl.C17885a;

/* renamed from: com.bumptech.glide.i */
public class C2129i<TranscodeType> extends C6595a<C2129i<TranscodeType>> {

    /* renamed from: B */
    public final Context f6921B;

    /* renamed from: C */
    public final C2131j f6922C;

    /* renamed from: D */
    public final Class<TranscodeType> f6923D;

    /* renamed from: E */
    public final C2125f f6924E;

    /* renamed from: F */
    public C2135k<?, ? super TranscodeType> f6925F;

    /* renamed from: G */
    public Object f6926G;

    /* renamed from: H */
    public ArrayList f6927H;

    /* renamed from: I */
    public C2129i<TranscodeType> f6928I;

    /* renamed from: J */
    public C2129i<TranscodeType> f6929J;

    /* renamed from: K */
    public Float f6930K;

    /* renamed from: L */
    public boolean f6931L = true;

    /* renamed from: M */
    public boolean f6932M;

    /* renamed from: N */
    public boolean f6933N;

    /* renamed from: com.bumptech.glide.i$a */
    public static /* synthetic */ class C2130a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6934a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f6935b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.bumptech.glide.Priority[] r0 = com.bumptech.glide.Priority.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6935b = r0
                r1 = 1
                com.bumptech.glide.Priority r2 = com.bumptech.glide.Priority.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f6935b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.Priority r3 = com.bumptech.glide.Priority.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f6935b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bumptech.glide.Priority r4 = com.bumptech.glide.Priority.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f6935b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bumptech.glide.Priority r5 = com.bumptech.glide.Priority.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f6934a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f6934a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f6934a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f6934a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f6934a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f6934a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f6934a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f6934a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C2129i.C2130a.<clinit>():void");
        }
    }

    static {
        C6602g gVar = (C6602g) ((C6602g) ((C6602g) new C6602g().mo22726i(C4385f.f15422c)).mo22740y(Priority.LOW)).mo22715F(true);
    }

    @SuppressLint({"CheckResult"})
    public C2129i(C2116c cVar, C2131j jVar, Class<TranscodeType> cls, Context context) {
        C6602g gVar;
        this.f6922C = jVar;
        this.f6923D = cls;
        this.f6921B = context;
        C2125f fVar = jVar.f6938b.f6884e;
        C2135k<?, ? super TranscodeType> kVar = fVar.f6913f.get(cls);
        if (kVar == null) {
            for (Map.Entry next : fVar.f6913f.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    kVar = (C2135k) next.getValue();
                }
            }
        }
        this.f6925F = kVar == null ? C2125f.f6907k : kVar;
        this.f6924E = cVar.f6884e;
        Iterator<C6601f<Object>> it = jVar.f6946j.iterator();
        while (it.hasNext()) {
            mo10843M(it.next());
        }
        synchronized (jVar) {
            gVar = jVar.f6947k;
        }
        mo10857a(gVar);
    }

    /* renamed from: M */
    public C2129i<TranscodeType> mo10843M(C6601f<TranscodeType> fVar) {
        if (this.f20438w) {
            return mo10865g().mo10843M(fVar);
        }
        if (fVar != null) {
            if (this.f6927H == null) {
                this.f6927H = new ArrayList();
            }
            this.f6927H.add(fVar);
        }
        mo22711A();
        return this;
    }

    /* renamed from: N */
    public C2129i<TranscodeType> mo10857a(C6595a<?> aVar) {
        C17885a.m44458r(aVar);
        return (C2129i) super.mo10857a(aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.bumptech.glide.request.RequestCoordinator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: com.bumptech.glide.request.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: com.bumptech.glide.request.SingleRequest} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: com.bumptech.glide.request.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.bumptech.glide.request.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: com.bumptech.glide.request.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: com.bumptech.glide.k<?, ? super TranscodeType>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: com.bumptech.glide.request.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.bumptech.glide.request.RequestCoordinator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.bumptech.glide.request.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p260t6.C6598d mo10845O(int r21, int r22, com.bumptech.glide.Priority r23, com.bumptech.glide.C2135k r24, p260t6.C6595a r25, com.bumptech.glide.request.RequestCoordinator r26, p260t6.C6599e r27, p273u6.C6720j r28, java.lang.Object r29, java.util.concurrent.Executor r30) {
        /*
            r20 = this;
            r11 = r20
            r12 = r23
            r13 = r25
            r14 = r29
            com.bumptech.glide.i<TranscodeType> r0 = r11.f6929J
            if (r0 == 0) goto L_0x0016
            com.bumptech.glide.request.a r0 = new com.bumptech.glide.request.a
            r1 = r26
            r0.<init>(r14, r1)
            r6 = r0
            r15 = r6
            goto L_0x001b
        L_0x0016:
            r1 = r26
            r0 = 0
            r15 = r0
            r6 = r1
        L_0x001b:
            com.bumptech.glide.i<TranscodeType> r0 = r11.f6928I
            if (r0 == 0) goto L_0x00ae
            boolean r1 = r11.f6933N
            if (r1 != 0) goto L_0x00a6
            com.bumptech.glide.k<?, ? super TranscodeType> r1 = r0.f6925F
            boolean r2 = r0.f6931L
            if (r2 == 0) goto L_0x002c
            r16 = r24
            goto L_0x002e
        L_0x002c:
            r16 = r1
        L_0x002e:
            r1 = 8
            int r0 = r0.f20417b
            boolean r0 = p260t6.C6595a.m15550o(r0, r1)
            if (r0 == 0) goto L_0x003d
            com.bumptech.glide.i<TranscodeType> r0 = r11.f6928I
            com.bumptech.glide.Priority r0 = r0.f20420e
            goto L_0x0041
        L_0x003d:
            com.bumptech.glide.Priority r0 = r11.mo10847Q(r12)
        L_0x0041:
            r17 = r0
            com.bumptech.glide.i<TranscodeType> r0 = r11.f6928I
            int r1 = r0.f20427l
            int r0 = r0.f20426k
            boolean r2 = p311x6.C7176l.m16789i(r21, r22)
            if (r2 == 0) goto L_0x0064
            com.bumptech.glide.i<TranscodeType> r2 = r11.f6928I
            int r3 = r2.f20427l
            int r2 = r2.f20426k
            boolean r2 = p311x6.C7176l.m16789i(r3, r2)
            if (r2 != 0) goto L_0x0064
            int r0 = r13.f20427l
            int r1 = r13.f20426k
            r18 = r0
            r19 = r1
            goto L_0x0068
        L_0x0064:
            r19 = r0
            r18 = r1
        L_0x0068:
            com.bumptech.glide.request.b r10 = new com.bumptech.glide.request.b
            r10.<init>(r14, r6)
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r10
            r7 = r27
            r8 = r28
            r9 = r29
            r12 = r10
            r10 = r30
            com.bumptech.glide.request.SingleRequest r10 = r0.mo10860c0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 1
            r11.f6933N = r0
            com.bumptech.glide.i<TranscodeType> r5 = r11.f6928I
            r0 = r5
            r1 = r18
            r2 = r19
            r3 = r17
            r4 = r16
            r6 = r12
            r13 = r10
            r10 = r30
            t6.d r0 = r0.mo10845O(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 0
            r11.f6933N = r1
            r12.f7231c = r13
            r12.f7232d = r0
            goto L_0x010c
        L_0x00a6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"
            r0.<init>(r1)
            throw r0
        L_0x00ae:
            java.lang.Float r0 = r11.f6930K
            if (r0 == 0) goto L_0x00f3
            com.bumptech.glide.request.b r13 = new com.bumptech.glide.request.b
            r13.<init>(r14, r6)
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r13
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            com.bumptech.glide.request.SingleRequest r10 = r0.mo10860c0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            t6.a r0 = r25.clone()
            java.lang.Float r1 = r11.f6930K
            float r1 = r1.floatValue()
            t6.a r5 = r0.mo22714E(r1)
            com.bumptech.glide.Priority r3 = r11.mo10847Q(r12)
            r0 = r20
            r1 = r21
            r12 = r10
            r10 = r30
            com.bumptech.glide.request.SingleRequest r0 = r0.mo10860c0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r13.f7231c = r12
            r13.f7232d = r0
            r12 = r13
            goto L_0x010c
        L_0x00f3:
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            com.bumptech.glide.request.SingleRequest r10 = r0.mo10860c0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12 = r10
        L_0x010c:
            if (r15 != 0) goto L_0x010f
            return r12
        L_0x010f:
            com.bumptech.glide.i<TranscodeType> r0 = r11.f6929J
            int r1 = r0.f20427l
            int r0 = r0.f20426k
            boolean r2 = p311x6.C7176l.m16789i(r21, r22)
            if (r2 == 0) goto L_0x0130
            com.bumptech.glide.i<TranscodeType> r2 = r11.f6929J
            int r3 = r2.f20427l
            int r2 = r2.f20426k
            boolean r2 = p311x6.C7176l.m16789i(r3, r2)
            if (r2 != 0) goto L_0x0130
            r2 = r25
            int r0 = r2.f20427l
            int r1 = r2.f20426k
            r2 = r1
            r1 = r0
            goto L_0x0131
        L_0x0130:
            r2 = r0
        L_0x0131:
            com.bumptech.glide.i<TranscodeType> r5 = r11.f6929J
            com.bumptech.glide.k<?, ? super TranscodeType> r4 = r5.f6925F
            com.bumptech.glide.Priority r3 = r5.f20420e
            r0 = r5
            r6 = r15
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            t6.d r0 = r0.mo10845O(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r15.f7225c = r12
            r15.f7226d = r0
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C2129i.mo10845O(int, int, com.bumptech.glide.Priority, com.bumptech.glide.k, t6.a, com.bumptech.glide.request.RequestCoordinator, t6.e, u6.j, java.lang.Object, java.util.concurrent.Executor):t6.d");
    }

    /* renamed from: P */
    public C2129i<TranscodeType> mo10865g() {
        C2129i<TranscodeType> iVar = (C2129i) super.clone();
        iVar.f6925F = iVar.f6925F.clone();
        if (iVar.f6927H != null) {
            iVar.f6927H = new ArrayList(iVar.f6927H);
        }
        C2129i<TranscodeType> iVar2 = iVar.f6928I;
        if (iVar2 != null) {
            iVar.f6928I = iVar2.mo10865g();
        }
        C2129i<TranscodeType> iVar3 = iVar.f6929J;
        if (iVar3 != null) {
            iVar.f6929J = iVar3.mo10865g();
        }
        return iVar;
    }

    /* renamed from: Q */
    public final Priority mo10847Q(Priority priority) {
        int i = C2130a.f6935b[priority.ordinal()];
        if (i == 1) {
            return Priority.NORMAL;
        }
        if (i == 2) {
            return Priority.HIGH;
        }
        if (i == 3 || i == 4) {
            return Priority.IMMEDIATE;
        }
        StringBuilder k = C13555b.m33972k("unknown priority: ");
        k.append(this.f20420e);
        throw new IllegalArgumentException(k.toString());
    }

    /* renamed from: R */
    public final <Y extends C6720j<TranscodeType>> Y mo10848R(Y y) {
        mo10849S(y, (C6599e) null, this, C7166e.f22251a);
        return y;
    }

    /* renamed from: S */
    public final C6720j mo10849S(C6720j jVar, C6599e eVar, C6595a aVar, Executor executor) {
        boolean z;
        C6720j jVar2 = jVar;
        C6595a aVar2 = aVar;
        C17885a.m44458r(jVar);
        if (this.f6932M) {
            Object obj = new Object();
            C2135k<?, ? super TranscodeType> kVar = this.f6925F;
            C6598d O = mo10845O(aVar2.f20427l, aVar2.f20426k, aVar2.f20420e, kVar, aVar, (RequestCoordinator) null, eVar, jVar, obj, executor);
            C6598d c = jVar.mo22744c();
            if (O.mo11028d(c)) {
                if (aVar2.f20425j || !c.mo11029e()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    C17885a.m44458r(c);
                    if (!c.isRunning()) {
                        c.mo11035j();
                    }
                    return jVar2;
                }
            }
            this.f6922C.mo10873o(jVar);
            jVar.mo22746e(O);
            C2131j jVar3 = this.f6922C;
            synchronized (jVar3) {
                jVar3.f6943g.f19625b.add(jVar);
                C6198o oVar = jVar3.f6941e;
                ((Set) oVar.f19597c).add(O);
                if (!oVar.f19596b) {
                    O.mo11035j();
                } else {
                    O.clear();
                    ((Set) oVar.f19598d).add(O);
                }
            }
            return jVar2;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: T */
    public final void mo10850T(ImageView imageView) {
        C6595a aVar;
        C6720j jVar;
        C7176l.m16781a();
        C17885a.m44458r(imageView);
        if (!C6595a.m15550o(this.f20417b, 2048) && this.f20430o && imageView.getScaleType() != null) {
            switch (C2130a.f6934a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = mo10865g().mo22733r();
                    break;
                case 2:
                    aVar = mo10865g().mo22734s();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = mo10865g().mo22735t();
                    break;
                case 6:
                    aVar = mo10865g().mo22734s();
                    break;
            }
        }
        aVar = this;
        C2125f fVar = this.f6924E;
        Class<TranscodeType> cls = this.f6923D;
        fVar.f6910c.getClass();
        if (Bitmap.class.equals(cls)) {
            jVar = new C6709b(imageView);
        } else if (Drawable.class.isAssignableFrom(cls)) {
            jVar = new C6714e(imageView);
        } else {
            throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
        }
        mo10849S(jVar, (C6599e) null, aVar, C7166e.f22251a);
    }

    /* renamed from: U */
    public C2129i mo10851U(C17066a.C17067a aVar) {
        if (this.f20438w) {
            return mo10865g().mo10851U(aVar);
        }
        this.f6927H = null;
        return mo10843M(aVar);
    }

    /* renamed from: V */
    public C2129i<TranscodeType> mo10852V(Drawable drawable) {
        return mo10859b0(drawable).mo10857a((C6602g) new C6602g().mo22726i(C4385f.f15421b));
    }

    /* renamed from: W */
    public C2129i<TranscodeType> mo10853W(Uri uri) {
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: b6.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bumptech.glide.C2129i<TranscodeType> mo10854X(java.lang.Integer r6) {
        /*
            r5 = this;
            com.bumptech.glide.i r6 = r5.mo10859b0(r6)
            android.content.Context r0 = r5.f6921B
            j$.util.concurrent.ConcurrentHashMap r1 = p298w6.C6998b.f21775a
            java.lang.String r1 = r0.getPackageName()
            j$.util.concurrent.ConcurrentHashMap r2 = p298w6.C6998b.f21775a
            java.lang.Object r2 = r2.get(r1)
            b6.b r2 = (p025b6.C1487b) r2
            if (r2 != 0) goto L_0x004a
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0024 }
            java.lang.String r3 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x0024 }
            r4 = 0
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r4)     // Catch:{ NameNotFoundException -> 0x0024 }
            goto L_0x0028
        L_0x0024:
            r0.getPackageName()
            r2 = 0
        L_0x0028:
            if (r2 == 0) goto L_0x0031
            int r2 = r2.versionCode
            java.lang.String r2 = java.lang.String.valueOf(r2)
            goto L_0x0039
        L_0x0031:
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
        L_0x0039:
            w6.d r3 = new w6.d
            r3.<init>(r2)
            j$.util.concurrent.ConcurrentHashMap r2 = p298w6.C6998b.f21775a
            java.lang.Object r1 = r2.putIfAbsent(r1, r3)
            r2 = r1
            b6.b r2 = (p025b6.C1487b) r2
            if (r2 != 0) goto L_0x004a
            r2 = r3
        L_0x004a:
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            w6.a r1 = new w6.a
            r1.<init>(r0, r2)
            t6.g r0 = new t6.g
            r0.<init>()
            t6.a r0 = r0.mo22713D(r1)
            t6.g r0 = (p260t6.C6602g) r0
            com.bumptech.glide.i r6 = r6.mo10857a(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C2129i.mo10854X(java.lang.Integer):com.bumptech.glide.i");
    }

    /* renamed from: Y */
    public C2129i<TranscodeType> mo10855Y(Object obj) {
        return mo10859b0(obj);
    }

    /* renamed from: Z */
    public C2129i<TranscodeType> mo10856Z(String str) {
        return mo10859b0(str);
    }

    /* renamed from: a0 */
    public C2129i<TranscodeType> mo10858a0(byte[] bArr) {
        C2129i<TranscodeType> b0 = mo10859b0(bArr);
        if (!C6595a.m15550o(b0.f20417b, 4)) {
            b0 = b0.mo10857a((C6602g) new C6602g().mo22726i(C4385f.f15421b));
        }
        if (C6595a.m15550o(b0.f20417b, 256)) {
            return b0;
        }
        if (C6602g.f20450B == null) {
            C6602g.f20450B = (C6602g) ((C6602g) new C6602g().mo22715F(true)).mo22723f();
        }
        return b0.mo10857a(C6602g.f20450B);
    }

    /* renamed from: b0 */
    public final C2129i<TranscodeType> mo10859b0(Object obj) {
        if (this.f20438w) {
            return mo10865g().mo10859b0(obj);
        }
        this.f6926G = obj;
        this.f6932M = true;
        mo22711A();
        return this;
    }

    /* renamed from: c0 */
    public final SingleRequest mo10860c0(int i, int i2, Priority priority, C2135k kVar, C6595a aVar, RequestCoordinator requestCoordinator, C6599e eVar, C6720j jVar, Object obj, Executor executor) {
        C6595a aVar2 = aVar;
        C6599e eVar2 = eVar;
        C6720j jVar2 = jVar;
        Object obj2 = obj;
        Context context = this.f6921B;
        C2125f fVar = this.f6924E;
        return new SingleRequest(context, fVar, obj2, this.f6926G, this.f6923D, aVar2, i, i2, priority, jVar2, eVar2, this.f6927H, requestCoordinator, fVar.f6914g, kVar.f6951b, executor);
    }

    /* renamed from: d0 */
    public final C6597c<TranscodeType> mo10862d0() {
        return mo10863e0(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: e0 */
    public final C6599e mo10863e0(int i, int i2) {
        C6599e eVar = new C6599e(i, i2);
        mo10849S(eVar, eVar, this, C7166e.f22252b);
        return eVar;
    }

    @Deprecated
    /* renamed from: f0 */
    public C2129i<TranscodeType> mo10864f0(float f) {
        if (this.f20438w) {
            return mo10865g().mo10864f0(f);
        }
        if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f6930K = Float.valueOf(f);
        mo22711A();
        return this;
    }

    /* renamed from: g0 */
    public C2129i mo10866g0(C5710d dVar) {
        if (this.f20438w) {
            return mo10865g().mo10866g0(dVar);
        }
        this.f6925F = dVar;
        this.f6931L = false;
        mo22711A();
        return this;
    }
}
