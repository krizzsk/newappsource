package cb0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import cb0.C7583b;
import com.google.android.play.core.appupdate.C14226d;
import com.p341rd.C7981a;
import com.p341rd.animation.type.DropAnimation;
import com.p341rd.draw.data.Orientation;
import db0.C12611a;
import eb0.C12630g;
import eb0.C12631h;
import fb0.C12652a;
import fb0.C12653b;
import fb0.C12655c;
import fb0.C12657d;
import fb0.C12659e;
import fb0.C12661g;
import fb0.C12663i;
import fb0.C12664j;
import fb0.C12666k;
import ib0.C12770a;
import java.util.Iterator;

/* renamed from: cb0.a */
public final class C7581a {

    /* renamed from: a */
    public C7583b f23083a;

    /* renamed from: b */
    public C7583b.C7584a f23084b;

    /* renamed from: c */
    public C12652a f23085c;

    /* renamed from: d */
    public C12770a f23086d;

    /* renamed from: e */
    public float f23087e;

    /* renamed from: f */
    public boolean f23088f;

    /* renamed from: cb0.a$a */
    public static /* synthetic */ class C7582a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23089a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.rd.animation.type.AnimationType[] r0 = com.p341rd.animation.type.AnimationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23089a = r0
                com.rd.animation.type.AnimationType r1 = com.p341rd.animation.type.AnimationType.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23089a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.rd.animation.type.AnimationType r1 = com.p341rd.animation.type.AnimationType.COLOR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23089a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.rd.animation.type.AnimationType r1 = com.p341rd.animation.type.AnimationType.SCALE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23089a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.rd.animation.type.AnimationType r1 = com.p341rd.animation.type.AnimationType.WORM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f23089a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.rd.animation.type.AnimationType r1 = com.p341rd.animation.type.AnimationType.FILL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f23089a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.rd.animation.type.AnimationType r1 = com.p341rd.animation.type.AnimationType.SLIDE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f23089a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.rd.animation.type.AnimationType r1 = com.p341rd.animation.type.AnimationType.THIN_WORM     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f23089a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.rd.animation.type.AnimationType r1 = com.p341rd.animation.type.AnimationType.DROP     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f23089a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.rd.animation.type.AnimationType r1 = com.p341rd.animation.type.AnimationType.SWAP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f23089a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.rd.animation.type.AnimationType r1 = com.p341rd.animation.type.AnimationType.SCALE_DOWN     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cb0.C7581a.C7582a.<clinit>():void");
        }
    }

    public C7581a(C12770a aVar, C7583b.C7584a aVar2) {
        this.f23083a = new C7583b(aVar2);
        this.f23084b = aVar2;
        this.f23086d = aVar;
    }

    /* renamed from: a */
    public final void mo23843a() {
        boolean z;
        int i;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        boolean z5;
        int i5;
        int i6;
        boolean z6;
        boolean z7;
        int i7;
        int i8;
        long j;
        int i9;
        int i11;
        boolean z8;
        boolean z9 = false;
        switch (C7582a.f23089a[this.f23086d.mo39619a().ordinal()]) {
            case 1:
                ((C7981a) this.f23084b).mo24975b((C12611a) null);
                return;
            case 2:
                C12770a aVar = this.f23086d;
                int i12 = aVar.f31549l;
                int i13 = aVar.f31548k;
                long j2 = aVar.f31555r;
                C7583b bVar = this.f23083a;
                if (bVar.f23090a == null) {
                    bVar.f23090a = new C12653b(bVar.f23099j);
                }
                C12653b bVar2 = bVar.f23090a;
                if (bVar2.f31272c != null) {
                    if (bVar2.f31274e == i13 && bVar2.f31275f == i12) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        bVar2.f31274e = i13;
                        bVar2.f31275f = i12;
                        ((ValueAnimator) bVar2.f31272c).setValues(new PropertyValuesHolder[]{bVar2.mo39435e(false), bVar2.mo39435e(true)});
                    }
                }
                bVar2.mo39432b(j2);
                if (this.f23088f) {
                    bVar2.mo39436f(this.f23087e);
                } else {
                    bVar2.mo39433c();
                }
                this.f23085c = bVar2;
                return;
            case 3:
                C12770a aVar2 = this.f23086d;
                int i14 = aVar2.f31549l;
                int i15 = aVar2.f31548k;
                int i16 = aVar2.f31540c;
                float f = aVar2.f31547j;
                long j3 = aVar2.f31555r;
                C7583b bVar3 = this.f23083a;
                if (bVar3.f23091b == null) {
                    bVar3.f23091b = new C12657d(bVar3.f23099j);
                }
                C12657d dVar = bVar3.f23091b;
                dVar.mo39442h(i15, f, i14, i16);
                dVar.mo39432b(j3);
                if (this.f23088f) {
                    dVar.mo39436f(this.f23087e);
                } else {
                    dVar.mo39433c();
                }
                this.f23085c = dVar;
                return;
            case 4:
                C12770a aVar3 = this.f23086d;
                boolean z11 = aVar3.f31550m;
                if (z11) {
                    i = aVar3.f31557t;
                } else {
                    i = aVar3.f31559v;
                }
                if (z11) {
                    i2 = aVar3.f31558u;
                } else {
                    i2 = aVar3.f31557t;
                }
                int v0 = C14226d.m35355v0(aVar3, i);
                int v02 = C14226d.m35355v0(this.f23086d, i2);
                if (i2 > i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C12770a aVar4 = this.f23086d;
                int i17 = aVar4.f31540c;
                long j4 = aVar4.f31555r;
                C7583b bVar4 = this.f23083a;
                if (bVar4.f23092c == null) {
                    bVar4.f23092c = new C12666k(bVar4.f23099j);
                }
                C12666k kVar = bVar4.f23092c;
                if (kVar.f31295d == v0 && kVar.f31296e == v02 && kVar.f31297f == i17 && kVar.f31298g == z2) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    T animatorSet = new AnimatorSet();
                    animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                    kVar.f31272c = animatorSet;
                    kVar.f31295d = v0;
                    kVar.f31296e = v02;
                    kVar.f31297f = i17;
                    kVar.f31298g = z2;
                    int i18 = v0 - i17;
                    int i19 = v0 + i17;
                    C12631h hVar = kVar.f31299h;
                    hVar.f31226a = i18;
                    hVar.f31227b = i19;
                    C12666k.C12668b d = kVar.mo39450d(z2);
                    C12666k kVar2 = kVar;
                    long j5 = kVar.f31270a / 2;
                    ((AnimatorSet) kVar.f31272c).playSequentially(new Animator[]{kVar2.mo39451e(d.f31303a, d.f31304b, j5, false, kVar.f31299h), kVar2.mo39451e(d.f31305c, d.f31306d, j5, true, kVar.f31299h)});
                }
                kVar.mo39432b(j4);
                if (this.f23088f) {
                    kVar.mo39446f(this.f23087e);
                } else {
                    kVar.mo39433c();
                }
                this.f23085c = kVar;
                return;
            case 5:
                C12770a aVar5 = this.f23086d;
                int i21 = aVar5.f31549l;
                int i22 = aVar5.f31548k;
                int i23 = aVar5.f31540c;
                int i24 = aVar5.f31546i;
                long j6 = aVar5.f31555r;
                C7583b bVar5 = this.f23083a;
                if (bVar5.f23094e == null) {
                    bVar5.f23094e = new C12655c(bVar5.f23099j);
                }
                C12655c cVar = bVar5.f23094e;
                if (cVar.f31272c != null) {
                    if (cVar.f31274e == i22 && cVar.f31275f == i21 && cVar.f31278h == i23 && cVar.f31279i == i24) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        cVar.f31274e = i22;
                        cVar.f31275f = i21;
                        cVar.f31278h = i23;
                        cVar.f31279i = i24;
                        ((ValueAnimator) cVar.f31272c).setValues(new PropertyValuesHolder[]{cVar.mo39435e(false), cVar.mo39435e(true), cVar.mo39438g(false), cVar.mo39438g(true), cVar.mo39439h(false), cVar.mo39439h(true)});
                    }
                }
                cVar.mo39432b(j6);
                if (this.f23088f) {
                    cVar.mo39436f(this.f23087e);
                } else {
                    cVar.mo39433c();
                }
                this.f23085c = cVar;
                return;
            case 6:
                C12770a aVar6 = this.f23086d;
                boolean z12 = aVar6.f31550m;
                if (z12) {
                    i3 = aVar6.f31557t;
                } else {
                    i3 = aVar6.f31559v;
                }
                if (z12) {
                    i4 = aVar6.f31558u;
                } else {
                    i4 = aVar6.f31557t;
                }
                int v03 = C14226d.m35355v0(aVar6, i3);
                int v04 = C14226d.m35355v0(this.f23086d, i4);
                long j7 = this.f23086d.f31555r;
                C7583b bVar6 = this.f23083a;
                if (bVar6.f23093d == null) {
                    bVar6.f23093d = new C12661g(bVar6.f23099j);
                }
                C12661g gVar = bVar6.f23093d;
                if (gVar.f31272c != null) {
                    if (gVar.f31287e == v03 && gVar.f31288f == v04) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (z5) {
                        gVar.f31287e = v03;
                        gVar.f31288f = v04;
                        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", new int[]{v03, v04});
                        ofInt.setEvaluator(new IntEvaluator());
                        ((ValueAnimator) gVar.f31272c).setValues(new PropertyValuesHolder[]{ofInt});
                    }
                }
                gVar.mo39432b(j7);
                if (this.f23088f) {
                    float f2 = this.f23087e;
                    T t = gVar.f31272c;
                    if (t != null) {
                        long j8 = (long) (f2 * ((float) gVar.f31270a));
                        if (((ValueAnimator) t).getValues() != null && ((ValueAnimator) gVar.f31272c).getValues().length > 0) {
                            ((ValueAnimator) gVar.f31272c).setCurrentPlayTime(j8);
                        }
                    }
                } else {
                    gVar.mo39433c();
                }
                this.f23085c = gVar;
                return;
            case 7:
                C12770a aVar7 = this.f23086d;
                boolean z13 = aVar7.f31550m;
                if (z13) {
                    i5 = aVar7.f31557t;
                } else {
                    i5 = aVar7.f31559v;
                }
                if (z13) {
                    i6 = aVar7.f31558u;
                } else {
                    i6 = aVar7.f31557t;
                }
                int v05 = C14226d.m35355v0(aVar7, i5);
                int v06 = C14226d.m35355v0(this.f23086d, i6);
                if (i6 > i5) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                C12770a aVar8 = this.f23086d;
                int i25 = aVar8.f31540c;
                long j9 = aVar8.f31555r;
                C7583b bVar7 = this.f23083a;
                if (bVar7.f23095f == null) {
                    bVar7.f23095f = new C12664j(bVar7.f23099j);
                }
                C12664j jVar = bVar7.f23095f;
                if (jVar.f31295d == v05 && jVar.f31296e == v06 && jVar.f31297f == i25 && jVar.f31298g == z6) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (z7) {
                    T animatorSet2 = new AnimatorSet();
                    animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
                    jVar.f31272c = animatorSet2;
                    jVar.f31295d = v05;
                    jVar.f31296e = v06;
                    jVar.f31297f = i25;
                    jVar.f31298g = z6;
                    int i26 = i25 * 2;
                    C12630g gVar2 = jVar.f31293i;
                    gVar2.f31226a = v05 - i25;
                    gVar2.f31227b = v05 + i25;
                    gVar2.f31225c = i26;
                    C12666k.C12668b d2 = jVar.mo39450d(z6);
                    double d3 = (double) jVar.f31270a;
                    long j10 = (long) (d3 * 0.5d);
                    int i27 = d2.f31303a;
                    int i28 = i27;
                    long j11 = (long) (d3 * 0.8d);
                    ValueAnimator e = jVar.mo39451e(i28, d2.f31304b, j11, false, jVar.f31293i);
                    ValueAnimator e2 = jVar.mo39451e(d2.f31305c, d2.f31306d, j11, true, jVar.f31293i);
                    e2.setStartDelay((long) (d3 * 0.2d));
                    ValueAnimator g = jVar.mo39447g(i26, i25, j10);
                    ValueAnimator g2 = jVar.mo39447g(i25, i26, j10);
                    g2.setStartDelay(j10);
                    ((AnimatorSet) jVar.f31272c).playTogether(new Animator[]{e, e2, g, g2});
                }
                jVar.mo39432b(j9);
                if (this.f23088f) {
                    jVar.mo39448h(this.f23087e);
                } else {
                    jVar.mo39433c();
                }
                this.f23085c = jVar;
                return;
            case 8:
                C12770a aVar9 = this.f23086d;
                boolean z14 = aVar9.f31550m;
                if (z14) {
                    i7 = aVar9.f31557t;
                } else {
                    i7 = aVar9.f31559v;
                }
                if (z14) {
                    i8 = aVar9.f31558u;
                } else {
                    i8 = aVar9.f31557t;
                }
                int v07 = C14226d.m35355v0(aVar9, i7);
                int v08 = C14226d.m35355v0(this.f23086d, i8);
                C12770a aVar10 = this.f23086d;
                int i29 = aVar10.f31543f;
                int i31 = aVar10.f31542e;
                if (aVar10.mo39620b() != Orientation.HORIZONTAL) {
                    i29 = i31;
                }
                C12770a aVar11 = this.f23086d;
                int i32 = aVar11.f31540c;
                int i33 = (i32 * 3) + i29;
                int i34 = i32 + i29;
                long j12 = aVar11.f31555r;
                C7583b bVar8 = this.f23083a;
                if (bVar8.f23096g == null) {
                    bVar8.f23096g = new DropAnimation(bVar8.f23099j);
                }
                DropAnimation dropAnimation = bVar8.f23096g;
                dropAnimation.mo39432b(j12);
                dropAnimation.mo24978e(v07, v08, i33, i34, i32);
                if (this.f23088f) {
                    float f3 = this.f23087e;
                    T t2 = dropAnimation.f31272c;
                    if (t2 != null) {
                        long j13 = (long) (f3 * ((float) dropAnimation.f31270a));
                        Iterator<Animator> it = ((AnimatorSet) t2).getChildAnimations().iterator();
                        while (it.hasNext()) {
                            ValueAnimator valueAnimator = (ValueAnimator) it.next();
                            long duration = valueAnimator.getDuration();
                            if (z9) {
                                j = j13 - duration;
                            } else {
                                j = j13;
                            }
                            if (j >= 0) {
                                if (j >= duration) {
                                    j = duration;
                                }
                                if (valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                                    valueAnimator.setCurrentPlayTime(j);
                                }
                                if (!z9 && duration >= dropAnimation.f31270a) {
                                    z9 = true;
                                }
                            }
                        }
                    }
                } else {
                    dropAnimation.mo39433c();
                }
                this.f23085c = dropAnimation;
                return;
            case 9:
                C12770a aVar12 = this.f23086d;
                boolean z15 = aVar12.f31550m;
                if (z15) {
                    i9 = aVar12.f31557t;
                } else {
                    i9 = aVar12.f31559v;
                }
                if (z15) {
                    i11 = aVar12.f31558u;
                } else {
                    i11 = aVar12.f31557t;
                }
                int v09 = C14226d.m35355v0(aVar12, i9);
                int v010 = C14226d.m35355v0(this.f23086d, i11);
                long j14 = this.f23086d.f31555r;
                C7583b bVar9 = this.f23083a;
                if (bVar9.f23097h == null) {
                    bVar9.f23097h = new C12663i(bVar9.f23099j);
                }
                C12663i iVar = bVar9.f23097h;
                if (iVar.f31272c != null) {
                    if (iVar.f31290d == v09 && iVar.f31291e == v010) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if (z8) {
                        iVar.f31290d = v09;
                        iVar.f31291e = v010;
                        PropertyValuesHolder ofInt2 = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", new int[]{v09, v010});
                        ofInt2.setEvaluator(new IntEvaluator());
                        PropertyValuesHolder ofInt3 = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE_REVERSE", new int[]{v010, v09});
                        ofInt3.setEvaluator(new IntEvaluator());
                        ((ValueAnimator) iVar.f31272c).setValues(new PropertyValuesHolder[]{ofInt2, ofInt3});
                    }
                }
                iVar.mo39432b(j14);
                if (this.f23088f) {
                    float f4 = this.f23087e;
                    T t3 = iVar.f31272c;
                    if (t3 != null) {
                        long j15 = (long) (f4 * ((float) iVar.f31270a));
                        if (((ValueAnimator) t3).getValues() != null && ((ValueAnimator) iVar.f31272c).getValues().length > 0) {
                            ((ValueAnimator) iVar.f31272c).setCurrentPlayTime(j15);
                        }
                    }
                } else {
                    iVar.mo39433c();
                }
                this.f23085c = iVar;
                return;
            case 10:
                C12770a aVar13 = this.f23086d;
                int i35 = aVar13.f31549l;
                int i36 = aVar13.f31548k;
                int i37 = aVar13.f31540c;
                float f5 = aVar13.f31547j;
                long j16 = aVar13.f31555r;
                C7583b bVar10 = this.f23083a;
                if (bVar10.f23098i == null) {
                    bVar10.f23098i = new C12659e(bVar10.f23099j);
                }
                C12659e eVar = bVar10.f23098i;
                eVar.mo39442h(i36, f5, i35, i37);
                eVar.mo39432b(j16);
                if (this.f23088f) {
                    eVar.mo39436f(this.f23087e);
                } else {
                    eVar.mo39433c();
                }
                this.f23085c = eVar;
                return;
            default:
                return;
        }
    }
}
