package p139k;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p004a3.C0051c;
import p139k.C5437b;
import p139k.C5443e;
import p141k1.C5455c;
import p152l.C5546a;
import p241s0.C6305e;
import p241s0.C6314i;

/* renamed from: k.a */
public final class C5430a extends C5443e implements C5455c {

    /* renamed from: q */
    public C5432b f17885q;

    /* renamed from: r */
    public C5436f f17886r;

    /* renamed from: s */
    public int f17887s;

    /* renamed from: t */
    public int f17888t;

    /* renamed from: u */
    public boolean f17889u;

    /* renamed from: k.a$a */
    public static class C5431a extends C5436f {

        /* renamed from: a */
        public final Animatable f17890a;

        public C5431a(Animatable animatable) {
            this.f17890a = animatable;
        }

        /* renamed from: c */
        public final void mo21214c() {
            this.f17890a.start();
        }

        /* renamed from: d */
        public final void mo21215d() {
            this.f17890a.stop();
        }
    }

    /* renamed from: k.a$b */
    public static class C5432b extends C5443e.C5444a {

        /* renamed from: I */
        public C6305e<Long> f17891I;

        /* renamed from: J */
        public C6314i<Integer> f17892J;

        public C5432b(C5432b bVar, C5430a aVar, Resources resources) {
            super(bVar, aVar, resources);
            if (bVar != null) {
                this.f17891I = bVar.f17891I;
                this.f17892J = bVar.f17892J;
                return;
            }
            this.f17891I = new C6305e<>();
            this.f17892J = new C6314i<>();
        }

        /* renamed from: e */
        public final void mo21216e() {
            this.f17891I = this.f17891I.clone();
            this.f17892J = this.f17892J.clone();
        }

        public final Drawable newDrawable() {
            return new C5430a(this, (Resources) null);
        }

        public final Drawable newDrawable(Resources resources) {
            return new C5430a(this, resources);
        }
    }

    /* renamed from: k.a$c */
    public static class C5433c extends C5436f {

        /* renamed from: a */
        public final C0051c f17893a;

        public C5433c(C0051c cVar) {
            this.f17893a = cVar;
        }

        /* renamed from: c */
        public final void mo21214c() {
            this.f17893a.start();
        }

        /* renamed from: d */
        public final void mo21215d() {
            this.f17893a.stop();
        }
    }

    /* renamed from: k.a$d */
    public static class C5434d extends C5436f {

        /* renamed from: a */
        public final ObjectAnimator f17894a;

        /* renamed from: b */
        public final boolean f17895b;

        public C5434d(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            int i;
            int i2;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z) {
                i = numberOfFrames - 1;
            } else {
                i = 0;
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = numberOfFrames - 1;
            }
            C5435e eVar = new C5435e(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            C5546a.m13760a(ofInt, true);
            ofInt.setDuration((long) eVar.f17898c);
            ofInt.setInterpolator(eVar);
            this.f17895b = z2;
            this.f17894a = ofInt;
        }

        /* renamed from: a */
        public final boolean mo21219a() {
            return this.f17895b;
        }

        /* renamed from: b */
        public final void mo21220b() {
            this.f17894a.reverse();
        }

        /* renamed from: c */
        public final void mo21214c() {
            this.f17894a.start();
        }

        /* renamed from: d */
        public final void mo21215d() {
            this.f17894a.cancel();
        }
    }

    /* renamed from: k.a$e */
    public static class C5435e implements TimeInterpolator {

        /* renamed from: a */
        public int[] f17896a;

        /* renamed from: b */
        public int f17897b;

        /* renamed from: c */
        public int f17898c;

        public C5435e(AnimationDrawable animationDrawable, boolean z) {
            int i;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f17897b = numberOfFrames;
            int[] iArr = this.f17896a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f17896a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f17896a;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                if (z) {
                    i = (numberOfFrames - i3) - 1;
                } else {
                    i = i3;
                }
                int duration = animationDrawable.getDuration(i);
                iArr2[i3] = duration;
                i2 += duration;
            }
            this.f17898c = i2;
        }

        public final float getInterpolation(float f) {
            float f2;
            int i = (int) ((f * ((float) this.f17898c)) + 0.5f);
            int i2 = this.f17897b;
            int[] iArr = this.f17896a;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            if (i3 < i2) {
                f2 = ((float) i) / ((float) this.f17898c);
            } else {
                f2 = BitmapDescriptorFactory.HUE_RED;
            }
            return (((float) i3) / ((float) i2)) + f2;
        }
    }

    /* renamed from: k.a$f */
    public static abstract class C5436f {
        /* renamed from: a */
        public boolean mo21219a() {
            return false;
        }

        /* renamed from: b */
        public void mo21220b() {
        }

        /* renamed from: c */
        public abstract void mo21214c();

        /* renamed from: d */
        public abstract void mo21215d();
    }

    static {
        Class<C5430a> cls = C5430a.class;
    }

    public C5430a() {
        this((C5432b) null, (Resources) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0266, code lost:
        throw new org.xmlpull.p982v1.XmlPullParserException(r25.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p139k.C5430a m13566g(android.content.Context r21, android.content.res.Resources.Theme r22, android.content.res.Resources r23, android.util.AttributeSet r24, android.content.res.XmlResourceParser r25) throws java.io.IOException, org.xmlpull.p982v1.XmlPullParserException {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            java.lang.String r4 = r25.getName()
            java.lang.String r5 = "animated-selector"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0298
            k.a r4 = new k.a
            r4.<init>()
            int[] r5 = p152l.C5549d.AnimatedStateListDrawableCompat
            android.content.res.TypedArray r5 = p116i1.C5256j.m13278f(r1, r0, r2, r5)
            int r6 = p152l.C5549d.AnimatedStateListDrawableCompat_android_visible
            r7 = 1
            boolean r6 = r5.getBoolean(r6, r7)
            r4.setVisible(r6, r7)
            k.a$b r6 = r4.f17885q
            int r8 = r6.f17924d
            int r9 = p152l.C5547b.m13762b(r5)
            r8 = r8 | r9
            r6.f17924d = r8
            int r8 = p152l.C5549d.AnimatedStateListDrawableCompat_android_variablePadding
            boolean r9 = r6.f17929i
            boolean r8 = r5.getBoolean(r8, r9)
            r6.f17929i = r8
            int r8 = p152l.C5549d.AnimatedStateListDrawableCompat_android_constantSize
            boolean r9 = r6.f17932l
            boolean r8 = r5.getBoolean(r8, r9)
            r6.f17932l = r8
            int r8 = p152l.C5549d.AnimatedStateListDrawableCompat_android_enterFadeDuration
            int r9 = r6.f17945y
            int r8 = r5.getInt(r8, r9)
            r6.f17945y = r8
            int r8 = p152l.C5549d.AnimatedStateListDrawableCompat_android_exitFadeDuration
            int r9 = r6.f17946z
            int r8 = r5.getInt(r8, r9)
            r6.f17946z = r8
            int r8 = p152l.C5549d.AnimatedStateListDrawableCompat_android_dither
            boolean r6 = r6.f17943w
            boolean r6 = r5.getBoolean(r8, r6)
            r4.setDither(r6)
            k.b$c r6 = r4.f17900b
            r8 = 0
            if (r1 == 0) goto L_0x0083
            r6.f17922b = r1
            android.util.DisplayMetrics r9 = r23.getDisplayMetrics()
            int r9 = r9.densityDpi
            if (r9 != 0) goto L_0x0078
            r9 = 160(0xa0, float:2.24E-43)
        L_0x0078:
            int r10 = r6.f17923c
            r6.f17923c = r9
            if (r10 == r9) goto L_0x0086
            r6.f17933m = r8
            r6.f17930j = r8
            goto L_0x0086
        L_0x0083:
            r6.getClass()
        L_0x0086:
            r5.recycle()
            int r5 = r25.getDepth()
            int r5 = r5 + r7
            r9 = r21
            r6 = r0
            r10 = r4
        L_0x0092:
            int r11 = r25.next()
            if (r11 == r7) goto L_0x0290
            int r12 = r25.getDepth()
            if (r12 >= r5) goto L_0x00a1
            r13 = 3
            if (r11 == r13) goto L_0x0290
        L_0x00a1:
            r13 = 2
            if (r11 == r13) goto L_0x00a5
            goto L_0x0092
        L_0x00a5:
            if (r12 <= r5) goto L_0x00a8
            goto L_0x0092
        L_0x00a8:
            java.lang.String r11 = r25.getName()
            java.lang.String r12 = "item"
            boolean r11 = r11.equals(r12)
            r12 = -1
            if (r11 == 0) goto L_0x0184
            int[] r11 = p152l.C5549d.AnimatedStateListDrawableItem
            android.content.res.TypedArray r11 = p116i1.C5256j.m13278f(r1, r6, r2, r11)
            int r7 = p152l.C5549d.AnimatedStateListDrawableItem_android_id
            int r7 = r11.getResourceId(r7, r8)
            int r15 = p152l.C5549d.AnimatedStateListDrawableItem_android_drawable
            int r12 = r11.getResourceId(r15, r12)
            if (r12 <= 0) goto L_0x00d2
            androidx.appcompat.widget.x0 r15 = androidx.appcompat.widget.C0478x0.m1313d()
            android.graphics.drawable.Drawable r15 = r15.mo2207f(r9, r12)
            goto L_0x00d3
        L_0x00d2:
            r15 = 0
        L_0x00d3:
            r11.recycle()
            int r11 = r24.getAttributeCount()
            int[] r12 = new int[r11]
            r13 = 0
            r14 = 0
        L_0x00de:
            if (r13 >= r11) goto L_0x0109
            int r8 = r2.getAttributeNameResource(r13)
            r18 = r5
            if (r8 == 0) goto L_0x0103
            r5 = 16842960(0x10100d0, float:2.369414E-38)
            if (r8 == r5) goto L_0x0103
            r5 = 16843161(0x1010199, float:2.3694704E-38)
            if (r8 == r5) goto L_0x0103
            int r5 = r14 + 1
            r16 = r5
            r5 = 0
            boolean r19 = r2.getAttributeBooleanValue(r13, r5)
            if (r19 == 0) goto L_0x00fe
            goto L_0x00ff
        L_0x00fe:
            int r8 = -r8
        L_0x00ff:
            r12[r14] = r8
            r14 = r16
        L_0x0103:
            int r13 = r13 + 1
            r5 = r18
            r8 = 0
            goto L_0x00de
        L_0x0109:
            r18 = r5
            int[] r5 = android.util.StateSet.trimStateSet(r12, r14)
            java.lang.String r8 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r15 != 0) goto L_0x0152
        L_0x0113:
            int r11 = r25.next()
            r12 = 4
            if (r11 != r12) goto L_0x011b
            goto L_0x0113
        L_0x011b:
            r12 = 2
            if (r11 != r12) goto L_0x0139
            java.lang.String r11 = r25.getName()
            java.lang.String r12 = "vector"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0134
            a3.g r15 = new a3.g
            r15.<init>()
            r15.inflate(r1, r3, r2, r6)
            goto L_0x0152
        L_0x0134:
            android.graphics.drawable.Drawable r15 = p152l.C5547b.m13761a(r1, r3, r2, r6)
            goto L_0x0152
        L_0x0139:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r25.getPositionDescription()
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0152:
            if (r15 == 0) goto L_0x016b
            k.a$b r8 = r10.f17885q
            int r11 = r8.mo21260a(r15)
            int[][] r12 = r8.f17963H
            r12[r11] = r5
            s0.i<java.lang.Integer> r5 = r8.f17892J
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.mo22435h(r11, r7)
            r13 = r21
            goto L_0x0286
        L_0x016b:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r25.getPositionDescription()
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0184:
            r18 = r5
            java.lang.String r5 = r25.getName()
            java.lang.String r7 = "transition"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x0280
            int[] r5 = p152l.C5549d.AnimatedStateListDrawableTransition
            android.content.res.TypedArray r5 = p116i1.C5256j.m13278f(r1, r6, r2, r5)
            int r7 = p152l.C5549d.AnimatedStateListDrawableTransition_android_fromId
            int r7 = r5.getResourceId(r7, r12)
            int r8 = p152l.C5549d.AnimatedStateListDrawableTransition_android_toId
            int r8 = r5.getResourceId(r8, r12)
            int r11 = p152l.C5549d.AnimatedStateListDrawableTransition_android_drawable
            int r11 = r5.getResourceId(r11, r12)
            if (r11 <= 0) goto L_0x01b6
            androidx.appcompat.widget.x0 r13 = androidx.appcompat.widget.C0478x0.m1313d()
            android.graphics.drawable.Drawable r15 = r13.mo2207f(r9, r11)
            goto L_0x01b7
        L_0x01b6:
            r15 = 0
        L_0x01b7:
            int r9 = p152l.C5549d.AnimatedStateListDrawableTransition_android_reversible
            r11 = 0
            boolean r9 = r5.getBoolean(r9, r11)
            r5.recycle()
            java.lang.String r5 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r15 != 0) goto L_0x0207
        L_0x01c5:
            int r13 = r25.next()
            r14 = 4
            if (r13 != r14) goto L_0x01cd
            goto L_0x01c5
        L_0x01cd:
            r15 = 2
            if (r13 != r15) goto L_0x01ee
            java.lang.String r13 = r25.getName()
            java.lang.String r14 = "animated-vector"
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x01e7
            a3.c r15 = new a3.c
            r13 = r21
            r15.<init>(r13)
            r15.inflate(r1, r3, r2, r0)
            goto L_0x0209
        L_0x01e7:
            r13 = r21
            android.graphics.drawable.Drawable r15 = p152l.C5547b.m13761a(r1, r3, r2, r6)
            goto L_0x0209
        L_0x01ee:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r25.getPositionDescription()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0207:
            r13 = r21
        L_0x0209:
            if (r15 == 0) goto L_0x0267
            if (r7 == r12) goto L_0x024c
            if (r8 == r12) goto L_0x024c
            k.a$b r5 = r10.f17885q
            int r6 = r5.mo21260a(r15)
            long r14 = (long) r7
            r7 = 32
            long r16 = r14 << r7
            long r11 = (long) r8
            long r7 = r11 | r16
            if (r9 == 0) goto L_0x0225
            r16 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x0227
        L_0x0225:
            r16 = 0
        L_0x0227:
            s0.e<java.lang.Long> r10 = r5.f17891I
            long r0 = (long) r6
            long r19 = r0 | r16
            java.lang.Long r6 = java.lang.Long.valueOf(r19)
            r10.mo22324a(r7, r6)
            if (r9 == 0) goto L_0x0282
            r6 = 32
            long r6 = r11 << r6
            long r6 = r6 | r14
            s0.e<java.lang.Long> r5 = r5.f17891I
            r8 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 | r8
            long r0 = r0 | r16
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.mo22324a(r6, r0)
            goto L_0x0282
        L_0x024c:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r25.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0267:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r25.getPositionDescription()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0280:
            r13 = r21
        L_0x0282:
            r6 = r22
            r10 = r4
            r9 = r13
        L_0x0286:
            r0 = r22
            r1 = r23
            r5 = r18
            r7 = 1
            r8 = 0
            goto L_0x0092
        L_0x0290:
            int[] r0 = r4.getState()
            r4.onStateChange(r0)
            return r4
        L_0x0298:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r25.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid animated-selector tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p139k.C5430a.m13566g(android.content.Context, android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, android.content.res.XmlResourceParser):k.a");
    }

    /* renamed from: b */
    public final C5437b.C5440c mo21207b() {
        return new C5432b(this.f17885q, this, (Resources) null);
    }

    /* renamed from: e */
    public final void mo21208e(C5437b.C5440c cVar) {
        super.mo21208e(cVar);
        if (cVar instanceof C5432b) {
            this.f17885q = (C5432b) cVar;
        }
    }

    /* renamed from: f */
    public final C5443e.C5444a mo21209f() {
        return new C5432b(this.f17885q, this, (Resources) null);
    }

    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        C5436f fVar = this.f17886r;
        if (fVar != null) {
            fVar.mo21215d();
            this.f17886r = null;
            mo21226d(this.f17887s);
            this.f17887s = -1;
            this.f17888t = -1;
        }
    }

    public final Drawable mutate() {
        if (!this.f17889u) {
            super.mutate();
            this.f17885q.mo21216e();
            this.f17889u = true;
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010b, code lost:
        if (mo21226d(r3) == false) goto L_0x010e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onStateChange(int[] r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            k.a$b r2 = r0.f17885q
            int r3 = r2.mo21300f(r1)
            if (r3 < 0) goto L_0x000d
            goto L_0x0013
        L_0x000d:
            int[] r3 = android.util.StateSet.WILD_CARD
            int r3 = r2.mo21300f(r3)
        L_0x0013:
            int r2 = r0.f17906h
            r4 = 1
            r5 = 0
            if (r3 == r2) goto L_0x010e
            k.a$f r6 = r0.f17886r
            if (r6 == 0) goto L_0x003d
            int r2 = r0.f17887s
            if (r3 != r2) goto L_0x0023
            goto L_0x0102
        L_0x0023:
            int r2 = r0.f17888t
            if (r3 != r2) goto L_0x0038
            boolean r2 = r6.mo21219a()
            if (r2 == 0) goto L_0x0038
            r6.mo21220b()
            int r2 = r0.f17888t
            r0.f17887s = r2
            r0.f17888t = r3
            goto L_0x0102
        L_0x0038:
            int r2 = r0.f17887s
            r6.mo21215d()
        L_0x003d:
            r6 = 0
            r0.f17886r = r6
            r6 = -1
            r0.f17888t = r6
            r0.f17887s = r6
            k.a$b r6 = r0.f17885q
            if (r2 >= 0) goto L_0x004e
            r6.getClass()
            r7 = 0
            goto L_0x005e
        L_0x004e:
            s0.i<java.lang.Integer> r7 = r6.f17892J
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            java.lang.Object r7 = r7.mo22434g(r2, r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
        L_0x005e:
            if (r3 >= 0) goto L_0x0062
            r8 = 0
            goto L_0x0072
        L_0x0062:
            s0.i<java.lang.Integer> r8 = r6.f17892J
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            java.lang.Object r8 = r8.mo22434g(r3, r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
        L_0x0072:
            if (r8 == 0) goto L_0x0104
            if (r7 != 0) goto L_0x0078
            goto L_0x0104
        L_0x0078:
            long r9 = (long) r7
            r7 = 32
            long r9 = r9 << r7
            long r7 = (long) r8
            long r7 = r7 | r9
            s0.e<java.lang.Long> r9 = r6.f17891I
            r10 = -1
            java.lang.Long r12 = java.lang.Long.valueOf(r10)
            java.lang.Object r9 = r9.mo22329i(r7, r12)
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            int r9 = (int) r12
            if (r9 >= 0) goto L_0x0095
            goto L_0x0104
        L_0x0095:
            s0.e<java.lang.Long> r12 = r6.f17891I
            java.lang.Long r13 = java.lang.Long.valueOf(r10)
            java.lang.Object r12 = r12.mo22329i(r7, r13)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            r14 = 8589934592(0x200000000, double:4.243991582E-314)
            long r12 = r12 & r14
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x00b3
            r12 = 1
            goto L_0x00b4
        L_0x00b3:
            r12 = 0
        L_0x00b4:
            r0.mo21226d(r9)
            android.graphics.drawable.Drawable r9 = r0.f17902d
            boolean r13 = r9 instanceof android.graphics.drawable.AnimationDrawable
            if (r13 == 0) goto L_0x00e2
            s0.e<java.lang.Long> r6 = r6.f17891I
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Object r6 = r6.mo22329i(r7, r10)
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            long r6 = r6 & r10
            int r8 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x00d9
            r6 = 1
            goto L_0x00da
        L_0x00d9:
            r6 = 0
        L_0x00da:
            k.a$d r7 = new k.a$d
            android.graphics.drawable.AnimationDrawable r9 = (android.graphics.drawable.AnimationDrawable) r9
            r7.<init>(r9, r6, r12)
            goto L_0x00f9
        L_0x00e2:
            boolean r6 = r9 instanceof p004a3.C0051c
            if (r6 == 0) goto L_0x00ee
            k.a$c r7 = new k.a$c
            a3.c r9 = (p004a3.C0051c) r9
            r7.<init>(r9)
            goto L_0x00f9
        L_0x00ee:
            boolean r6 = r9 instanceof android.graphics.drawable.Animatable
            if (r6 == 0) goto L_0x0104
            k.a$a r7 = new k.a$a
            android.graphics.drawable.Animatable r9 = (android.graphics.drawable.Animatable) r9
            r7.<init>(r9)
        L_0x00f9:
            r7.mo21214c()
            r0.f17886r = r7
            r0.f17888t = r2
            r0.f17887s = r3
        L_0x0102:
            r2 = 1
            goto L_0x0105
        L_0x0104:
            r2 = 0
        L_0x0105:
            if (r2 != 0) goto L_0x010f
            boolean r2 = r0.mo21226d(r3)
            if (r2 == 0) goto L_0x010e
            goto L_0x010f
        L_0x010e:
            r4 = 0
        L_0x010f:
            android.graphics.drawable.Drawable r2 = r0.f17902d
            if (r2 == 0) goto L_0x0118
            boolean r1 = r2.setState(r1)
            r4 = r4 | r1
        L_0x0118:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p139k.C5430a.onStateChange(int[]):boolean");
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        C5436f fVar = this.f17886r;
        if (fVar != null && (visible || z2)) {
            if (z) {
                fVar.mo21214c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public C5430a(C5432b bVar, Resources resources) {
        this.f17887s = -1;
        this.f17888t = -1;
        mo21208e(new C5432b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
