package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.C0717a;
import androidx.constraintlayout.widget.C0738a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import p002a1.C0041c;
import p002a1.C0042d;
import p066e0.C4436j0;
import p279v0.C6821c;
import p316y.C7229u;
import p328z0.C7376a;
import p328z0.C7379d;
import p328z0.C7384g;
import p328z0.C7392l;
import p328z0.C7394n;
import p328z0.C7396p;
import p328z0.C7399s;

/* renamed from: androidx.constraintlayout.motion.widget.c */
public final class C0722c {

    /* renamed from: a */
    public int f2830a;

    /* renamed from: b */
    public int f2831b = -1;

    /* renamed from: c */
    public boolean f2832c = false;

    /* renamed from: d */
    public int f2833d = 0;

    /* renamed from: e */
    public int f2834e;

    /* renamed from: f */
    public C7384g f2835f;

    /* renamed from: g */
    public C0738a.C0739a f2836g;

    /* renamed from: h */
    public int f2837h = -1;

    /* renamed from: i */
    public int f2838i = -1;

    /* renamed from: j */
    public int f2839j;

    /* renamed from: k */
    public String f2840k;

    /* renamed from: l */
    public int f2841l = 0;

    /* renamed from: m */
    public String f2842m = null;

    /* renamed from: n */
    public int f2843n = -1;

    /* renamed from: o */
    public Context f2844o;

    /* renamed from: p */
    public int f2845p = -1;

    /* renamed from: q */
    public int f2846q = -1;

    /* renamed from: r */
    public int f2847r = -1;

    /* renamed from: s */
    public int f2848s = -1;

    /* renamed from: t */
    public int f2849t = -1;

    /* renamed from: u */
    public int f2850u = -1;

    /* renamed from: androidx.constraintlayout.motion.widget.c$a */
    public static class C0723a {

        /* renamed from: a */
        public final int f2851a;

        /* renamed from: b */
        public final int f2852b;

        /* renamed from: c */
        public C7394n f2853c;

        /* renamed from: d */
        public int f2854d;

        /* renamed from: e */
        public C4436j0 f2855e = new C4436j0(1);

        /* renamed from: f */
        public C0724d f2856f;

        /* renamed from: g */
        public Interpolator f2857g;

        /* renamed from: h */
        public boolean f2858h = false;

        /* renamed from: i */
        public float f2859i;

        /* renamed from: j */
        public float f2860j;

        /* renamed from: k */
        public long f2861k;

        /* renamed from: l */
        public Rect f2862l = new Rect();

        /* renamed from: m */
        public boolean f2863m = false;

        public C0723a(C0724d dVar, C7394n nVar, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            float f;
            this.f2856f = dVar;
            this.f2853c = nVar;
            this.f2854d = i2;
            this.f2861k = System.nanoTime();
            C0724d dVar2 = this.f2856f;
            if (dVar2.f2867d == null) {
                dVar2.f2867d = new ArrayList<>();
            }
            dVar2.f2867d.add(this);
            this.f2857g = interpolator;
            this.f2851a = i4;
            this.f2852b = i5;
            if (i3 == 3) {
                this.f2863m = true;
            }
            if (i == 0) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f / ((float) i);
            }
            this.f2860j = f;
            mo3027a();
        }

        /* renamed from: a */
        public final void mo3027a() {
            float f;
            float f2;
            if (this.f2858h) {
                long nanoTime = System.nanoTime();
                this.f2861k = nanoTime;
                float f3 = this.f2859i - (((float) (((double) (nanoTime - this.f2861k)) * 1.0E-6d)) * this.f2860j);
                this.f2859i = f3;
                if (f3 < BitmapDescriptorFactory.HUE_RED) {
                    this.f2859i = BitmapDescriptorFactory.HUE_RED;
                }
                Interpolator interpolator = this.f2857g;
                if (interpolator == null) {
                    f2 = this.f2859i;
                } else {
                    f2 = interpolator.getInterpolation(this.f2859i);
                }
                C7394n nVar = this.f2853c;
                boolean e = nVar.mo23623e(f2, nanoTime, nVar.f22726b, this.f2855e);
                if (this.f2859i <= BitmapDescriptorFactory.HUE_RED) {
                    int i = this.f2851a;
                    if (i != -1) {
                        this.f2853c.f22726b.setTag(i, Long.valueOf(System.nanoTime()));
                    }
                    int i2 = this.f2852b;
                    if (i2 != -1) {
                        this.f2853c.f22726b.setTag(i2, (Object) null);
                    }
                    this.f2856f.f2868e.add(this);
                }
                if (this.f2859i > BitmapDescriptorFactory.HUE_RED || e) {
                    this.f2856f.f2864a.invalidate();
                    return;
                }
                return;
            }
            long nanoTime2 = System.nanoTime();
            this.f2861k = nanoTime2;
            float f4 = (((float) (((double) (nanoTime2 - this.f2861k)) * 1.0E-6d)) * this.f2860j) + this.f2859i;
            this.f2859i = f4;
            if (f4 >= 1.0f) {
                this.f2859i = 1.0f;
            }
            Interpolator interpolator2 = this.f2857g;
            if (interpolator2 == null) {
                f = this.f2859i;
            } else {
                f = interpolator2.getInterpolation(this.f2859i);
            }
            float f5 = f;
            C7394n nVar2 = this.f2853c;
            boolean e2 = nVar2.mo23623e(f5, nanoTime2, nVar2.f22726b, this.f2855e);
            if (this.f2859i >= 1.0f) {
                int i3 = this.f2851a;
                if (i3 != -1) {
                    this.f2853c.f22726b.setTag(i3, Long.valueOf(System.nanoTime()));
                }
                int i4 = this.f2852b;
                if (i4 != -1) {
                    this.f2853c.f22726b.setTag(i4, (Object) null);
                }
                if (!this.f2863m) {
                    this.f2856f.f2868e.add(this);
                }
            }
            if (this.f2859i < 1.0f || e2) {
                this.f2856f.f2864a.invalidate();
            }
        }

        /* renamed from: b */
        public final void mo3028b() {
            float f;
            this.f2858h = true;
            int i = this.f2854d;
            if (i != -1) {
                if (i == 0) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f / ((float) i);
                }
                this.f2860j = f;
            }
            this.f2856f.f2864a.invalidate();
            this.f2861k = System.nanoTime();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0722c(android.content.Context r10, android.content.res.XmlResourceParser r11) {
        /*
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.f2831b = r0
            r1 = 0
            r9.f2832c = r1
            r9.f2833d = r1
            r9.f2837h = r0
            r9.f2838i = r0
            r9.f2841l = r1
            r2 = 0
            r9.f2842m = r2
            r9.f2843n = r0
            r9.f2845p = r0
            r9.f2846q = r0
            r9.f2847r = r0
            r9.f2848s = r0
            r9.f2849t = r0
            r9.f2850u = r0
            r9.f2844o = r10
            int r2 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
        L_0x0028:
            r3 = 1
            if (r2 == r3) goto L_0x00b8
            java.lang.String r4 = "ViewTransition"
            r5 = 2
            r6 = 3
            if (r2 == r5) goto L_0x0040
            if (r2 == r6) goto L_0x0035
            goto L_0x00a9
        L_0x0035:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            boolean r2 = r4.equals(r2)     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            if (r2 == 0) goto L_0x00a9
            return
        L_0x0040:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            int r7 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            r8 = 4
            switch(r7) {
                case -1962203927: goto L_0x0073;
                case -1239391468: goto L_0x0069;
                case 61998586: goto L_0x0061;
                case 366511058: goto L_0x0057;
                case 1791837707: goto L_0x004d;
                default: goto L_0x004c;
            }     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
        L_0x004c:
            goto L_0x007d
        L_0x004d:
            java.lang.String r4 = "CustomAttribute"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            if (r2 == 0) goto L_0x007d
            r2 = 3
            goto L_0x007e
        L_0x0057:
            java.lang.String r4 = "CustomMethod"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            if (r2 == 0) goto L_0x007d
            r2 = 4
            goto L_0x007e
        L_0x0061:
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            if (r2 == 0) goto L_0x007d
            r2 = 0
            goto L_0x007e
        L_0x0069:
            java.lang.String r4 = "KeyFrameSet"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            if (r2 == 0) goto L_0x007d
            r2 = 1
            goto L_0x007e
        L_0x0073:
            java.lang.String r4 = "ConstraintOverride"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            if (r2 == 0) goto L_0x007d
            r2 = 2
            goto L_0x007e
        L_0x007d:
            r2 = -1
        L_0x007e:
            if (r2 == 0) goto L_0x00a6
            if (r2 == r3) goto L_0x009e
            if (r2 == r5) goto L_0x0097
            if (r2 == r6) goto L_0x008f
            if (r2 == r8) goto L_0x008f
            p328z0.C7376a.m16986a()     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            goto L_0x00a9
        L_0x008f:
            androidx.constraintlayout.widget.a$a r2 = r9.f2836g     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r2.f3123g     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            androidx.constraintlayout.widget.ConstraintAttribute.m2206d(r10, r11, r2)     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            goto L_0x00a9
        L_0x0097:
            androidx.constraintlayout.widget.a$a r2 = androidx.constraintlayout.widget.C0738a.m2239d(r10, r11)     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            r9.f2836g = r2     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            goto L_0x00a9
        L_0x009e:
            z0.g r2 = new z0.g     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            r2.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            r9.f2835f = r2     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            goto L_0x00a9
        L_0x00a6:
            r9.mo3025d(r10, r11)     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
        L_0x00a9:
            int r2 = r11.next()     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00af }
            goto L_0x0028
        L_0x00af:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x00b8
        L_0x00b4:
            r10 = move-exception
            r10.printStackTrace()
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0722c.<init>(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    /* renamed from: a */
    public final void mo3022a(C0724d dVar, MotionLayout motionLayout, int i, C0738a aVar, View... viewArr) {
        C0738a aVar2;
        C7399s sVar;
        MotionLayout motionLayout2 = motionLayout;
        int i2 = i;
        C0738a aVar3 = aVar;
        View[] viewArr2 = viewArr;
        if (!this.f2832c) {
            int i3 = this.f2834e;
            Interpolator interpolator = null;
            if (i3 == 2) {
                View view = viewArr2[0];
                C7394n nVar = new C7394n(view);
                C7396p pVar = nVar.f22730f;
                pVar.f22754d = BitmapDescriptorFactory.HUE_RED;
                pVar.f22755e = BitmapDescriptorFactory.HUE_RED;
                nVar.f22724H = true;
                pVar.mo23630d(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
                nVar.f22731g.mo23630d(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
                C7392l lVar = nVar.f22732h;
                lVar.getClass();
                view.getX();
                view.getY();
                view.getWidth();
                view.getHeight();
                lVar.mo23615b(view);
                C7392l lVar2 = nVar.f22733i;
                lVar2.getClass();
                view.getX();
                view.getY();
                view.getWidth();
                view.getHeight();
                lVar2.mo23615b(view);
                ArrayList arrayList = this.f2835f.f22648a.get(-1);
                if (arrayList != null) {
                    nVar.f22747w.addAll(arrayList);
                }
                nVar.mo23625h(motionLayout.getWidth(), motionLayout.getHeight(), System.nanoTime());
                int i4 = this.f2837h;
                int i5 = this.f2838i;
                int i6 = this.f2831b;
                Context context = motionLayout.getContext();
                int i7 = this.f2841l;
                if (i7 == -2) {
                    interpolator = AnimationUtils.loadInterpolator(context, this.f2843n);
                } else if (i7 == -1) {
                    sVar = new C7399s(C6821c.m16106c(this.f2842m));
                    new C0723a(dVar, nVar, i4, i5, i6, sVar, this.f2845p, this.f2846q);
                    return;
                } else if (i7 == 0) {
                    interpolator = new AccelerateDecelerateInterpolator();
                } else if (i7 == 1) {
                    interpolator = new AccelerateInterpolator();
                } else if (i7 == 2) {
                    interpolator = new DecelerateInterpolator();
                } else if (i7 == 4) {
                    interpolator = new BounceInterpolator();
                } else if (i7 == 5) {
                    interpolator = new OvershootInterpolator();
                } else if (i7 == 6) {
                    interpolator = new AnticipateInterpolator();
                }
                sVar = interpolator;
                new C0723a(dVar, nVar, i4, i5, i6, sVar, this.f2845p, this.f2846q);
                return;
            }
            if (i3 == 1) {
                int[] constraintSetIds = motionLayout.getConstraintSetIds();
                for (int i8 : constraintSetIds) {
                    if (i8 != i2) {
                        C0717a aVar4 = motionLayout2.f2688h;
                        if (aVar4 == null) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar4.mo3001b(i8);
                        }
                        for (View id : viewArr2) {
                            C0738a.C0739a j = aVar2.mo3241j(id.getId());
                            C0738a.C0739a aVar5 = this.f2836g;
                            if (aVar5 != null) {
                                C0738a.C0739a.C0740a aVar6 = aVar5.f3124h;
                                if (aVar6 != null) {
                                    aVar6.mo3253e(j);
                                }
                                j.f3123g.putAll(this.f2836g.f3123g);
                            }
                        }
                    }
                }
            }
            C0738a aVar7 = new C0738a();
            aVar7.f3116f.clear();
            for (Integer next : aVar3.f3116f.keySet()) {
                C0738a.C0739a aVar8 = aVar3.f3116f.get(next);
                if (aVar8 != null) {
                    aVar7.f3116f.put(next, aVar8.clone());
                }
            }
            for (View id2 : viewArr2) {
                C0738a.C0739a j2 = aVar7.mo3241j(id2.getId());
                C0738a.C0739a aVar9 = this.f2836g;
                if (aVar9 != null) {
                    C0738a.C0739a.C0740a aVar10 = aVar9.f3124h;
                    if (aVar10 != null) {
                        aVar10.mo3253e(j2);
                    }
                    j2.f3123g.putAll(this.f2836g.f3123g);
                }
            }
            motionLayout2.mo2925C(i2, aVar7);
            int i9 = C0041c.view_transition;
            motionLayout2.mo2925C(i9, aVar3);
            motionLayout2.mo2982y(i9);
            C0717a.C0719b bVar = new C0717a.C0719b(motionLayout2.f2688h, i9, i2);
            for (View view2 : viewArr2) {
                int i11 = this.f2837h;
                if (i11 != -1) {
                    bVar.f2784h = Math.max(i11, 8);
                }
                bVar.f2792p = this.f2833d;
                int i12 = this.f2841l;
                String str = this.f2842m;
                int i13 = this.f2843n;
                bVar.f2781e = i12;
                bVar.f2782f = str;
                bVar.f2783g = i13;
                int id3 = view2.getId();
                C7384g gVar = this.f2835f;
                if (gVar != null) {
                    C7384g gVar2 = new C7384g();
                    Iterator it = gVar.f22648a.get(-1).iterator();
                    while (it.hasNext()) {
                        C7379d b = ((C7379d) it.next()).clone();
                        b.f22608b = id3;
                        gVar2.mo23610b(b);
                    }
                    bVar.f2787k.add(gVar2);
                }
            }
            motionLayout2.setTransition(bVar);
            C7229u uVar = new C7229u(4, this, viewArr2);
            motionLayout2.mo2927d(1.0f);
            motionLayout2.f2721z0 = uVar;
        }
    }

    /* renamed from: b */
    public final boolean mo3023b(View view) {
        boolean z;
        boolean z2;
        int i = this.f2847r;
        if (i != -1 && view.getTag(i) == null) {
            z = false;
        } else {
            z = true;
        }
        int i2 = this.f2848s;
        if (i2 == -1 || view.getTag(i2) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo3024c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f2839j == -1 && this.f2840k == null) || !mo3023b(view)) {
            return false;
        }
        if (view.getId() == this.f2839j) {
            return true;
        }
        if (this.f2840k != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).f3029Y) != null && str.matches(this.f2840k)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo3025d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C0042d.ViewTransition);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0042d.ViewTransition_android_id) {
                this.f2830a = obtainStyledAttributes.getResourceId(index, this.f2830a);
            } else if (index == C0042d.ViewTransition_motionTarget) {
                if (MotionLayout.f2657J0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f2839j);
                    this.f2839j = resourceId;
                    if (resourceId == -1) {
                        this.f2840k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.f2840k = obtainStyledAttributes.getString(index);
                } else {
                    this.f2839j = obtainStyledAttributes.getResourceId(index, this.f2839j);
                }
            } else if (index == C0042d.ViewTransition_onStateTransition) {
                this.f2831b = obtainStyledAttributes.getInt(index, this.f2831b);
            } else if (index == C0042d.ViewTransition_transitionDisable) {
                this.f2832c = obtainStyledAttributes.getBoolean(index, this.f2832c);
            } else if (index == C0042d.ViewTransition_pathMotionArc) {
                this.f2833d = obtainStyledAttributes.getInt(index, this.f2833d);
            } else if (index == C0042d.ViewTransition_duration) {
                this.f2837h = obtainStyledAttributes.getInt(index, this.f2837h);
            } else if (index == C0042d.ViewTransition_upDuration) {
                this.f2838i = obtainStyledAttributes.getInt(index, this.f2838i);
            } else if (index == C0042d.ViewTransition_viewTransitionMode) {
                this.f2834e = obtainStyledAttributes.getInt(index, this.f2834e);
            } else if (index == C0042d.ViewTransition_motionInterpolator) {
                int i2 = obtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.f2843n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f2841l = -2;
                    }
                } else if (i2 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2842m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f2841l = -1;
                    } else {
                        this.f2843n = obtainStyledAttributes.getResourceId(index, -1);
                        this.f2841l = -2;
                    }
                } else {
                    this.f2841l = obtainStyledAttributes.getInteger(index, this.f2841l);
                }
            } else if (index == C0042d.ViewTransition_setsTag) {
                this.f2845p = obtainStyledAttributes.getResourceId(index, this.f2845p);
            } else if (index == C0042d.ViewTransition_clearsTag) {
                this.f2846q = obtainStyledAttributes.getResourceId(index, this.f2846q);
            } else if (index == C0042d.ViewTransition_ifTagSet) {
                this.f2847r = obtainStyledAttributes.getResourceId(index, this.f2847r);
            } else if (index == C0042d.ViewTransition_ifTagNotSet) {
                this.f2848s = obtainStyledAttributes.getResourceId(index, this.f2848s);
            } else if (index == C0042d.ViewTransition_SharedValueId) {
                this.f2850u = obtainStyledAttributes.getResourceId(index, this.f2850u);
            } else if (index == C0042d.ViewTransition_SharedValue) {
                this.f2849t = obtainStyledAttributes.getInteger(index, this.f2849t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ViewTransition(");
        k.append(C7376a.m16988c(this.f2830a, this.f2844o));
        k.append(")");
        return k.toString();
    }
}
