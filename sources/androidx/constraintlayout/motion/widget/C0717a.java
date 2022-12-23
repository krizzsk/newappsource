package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C0738a;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.p982v1.XmlPullParserException;
import p001a0.C0016g;
import p002a1.C0042d;
import p002a1.C0043e;
import p279v0.C6821c;
import p328z0.C7376a;
import p328z0.C7384g;
import p328z0.C7394n;

/* renamed from: androidx.constraintlayout.motion.widget.a */
public final class C0717a {

    /* renamed from: a */
    public final MotionLayout f2757a;

    /* renamed from: b */
    public C0043e f2758b = null;

    /* renamed from: c */
    public C0719b f2759c = null;

    /* renamed from: d */
    public ArrayList<C0719b> f2760d = new ArrayList<>();

    /* renamed from: e */
    public C0719b f2761e = null;

    /* renamed from: f */
    public ArrayList<C0719b> f2762f = new ArrayList<>();

    /* renamed from: g */
    public SparseArray<C0738a> f2763g = new SparseArray<>();

    /* renamed from: h */
    public HashMap<String, Integer> f2764h = new HashMap<>();

    /* renamed from: i */
    public SparseIntArray f2765i = new SparseIntArray();

    /* renamed from: j */
    public int f2766j = 400;

    /* renamed from: k */
    public int f2767k = 0;

    /* renamed from: l */
    public MotionEvent f2768l;

    /* renamed from: m */
    public boolean f2769m = false;

    /* renamed from: n */
    public boolean f2770n = false;

    /* renamed from: o */
    public MotionLayout.C0714g f2771o;

    /* renamed from: p */
    public boolean f2772p;

    /* renamed from: q */
    public final C0724d f2773q;

    /* renamed from: r */
    public float f2774r;

    /* renamed from: s */
    public float f2775s;

    /* renamed from: androidx.constraintlayout.motion.widget.a$a */
    public class C0718a implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ C6821c f2776a;

        public C0718a(C6821c cVar) {
            this.f2776a = cVar;
        }

        public final float getInterpolation(float f) {
            return (float) this.f2776a.mo23049a((double) f);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0717a(android.content.Context r11, androidx.constraintlayout.motion.widget.MotionLayout r12, int r13) {
        /*
            r10 = this;
            r10.<init>()
            r0 = 0
            r10.f2758b = r0
            r10.f2759c = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.f2760d = r1
            r10.f2761e = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.f2762f = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r10.f2763g = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r10.f2764h = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r10.f2765i = r1
            r1 = 400(0x190, float:5.6E-43)
            r10.f2766j = r1
            r1 = 0
            r10.f2767k = r1
            r10.f2769m = r1
            r10.f2770n = r1
            r10.f2757a = r12
            androidx.constraintlayout.motion.widget.d r2 = new androidx.constraintlayout.motion.widget.d
            r2.<init>(r12)
            r10.f2773q = r2
            android.content.res.Resources r12 = r11.getResources()
            android.content.res.XmlResourceParser r12 = r12.getXml(r13)
            int r2 = r12.getEventType()     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r3 = r0
        L_0x004e:
            r4 = 1
            if (r2 == r4) goto L_0x0194
            if (r2 == 0) goto L_0x0182
            r5 = 2
            if (r2 == r5) goto L_0x0058
            goto L_0x0185
        L_0x0058:
            java.lang.String r2 = r12.getName()     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            int r6 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r7 = 4
            r8 = 5
            r9 = -1
            switch(r6) {
                case -1349929691: goto L_0x00c3;
                case -1239391468: goto L_0x00b8;
                case -687739768: goto L_0x00ae;
                case 61998586: goto L_0x00a3;
                case 269306229: goto L_0x009a;
                case 312750793: goto L_0x0090;
                case 327855227: goto L_0x0086;
                case 793277014: goto L_0x007c;
                case 1382829617: goto L_0x0072;
                case 1942574248: goto L_0x0068;
                default: goto L_0x0066;
            }     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
        L_0x0066:
            goto L_0x00cd
        L_0x0068:
            java.lang.String r4 = "include"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            if (r2 == 0) goto L_0x00cd
            r4 = 6
            goto L_0x00ce
        L_0x0072:
            java.lang.String r4 = "StateSet"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            if (r2 == 0) goto L_0x00cd
            r4 = 4
            goto L_0x00ce
        L_0x007c:
            java.lang.String r4 = "MotionScene"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            if (r2 == 0) goto L_0x00cd
            r4 = 0
            goto L_0x00ce
        L_0x0086:
            java.lang.String r4 = "OnSwipe"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            if (r2 == 0) goto L_0x00cd
            r4 = 2
            goto L_0x00ce
        L_0x0090:
            java.lang.String r4 = "OnClick"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            if (r2 == 0) goto L_0x00cd
            r4 = 3
            goto L_0x00ce
        L_0x009a:
            java.lang.String r5 = "Transition"
            boolean r2 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            if (r2 == 0) goto L_0x00cd
            goto L_0x00ce
        L_0x00a3:
            java.lang.String r4 = "ViewTransition"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            if (r2 == 0) goto L_0x00cd
            r4 = 9
            goto L_0x00ce
        L_0x00ae:
            java.lang.String r4 = "Include"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            if (r2 == 0) goto L_0x00cd
            r4 = 7
            goto L_0x00ce
        L_0x00b8:
            java.lang.String r4 = "KeyFrameSet"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            if (r2 == 0) goto L_0x00cd
            r4 = 8
            goto L_0x00ce
        L_0x00c3:
            java.lang.String r4 = "ConstraintSet"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            if (r2 == 0) goto L_0x00cd
            r4 = 5
            goto L_0x00ce
        L_0x00cd:
            r4 = -1
        L_0x00ce:
            switch(r4) {
                case 0: goto L_0x017e;
                case 1: goto L_0x014b;
                case 2: goto L_0x0133;
                case 3: goto L_0x0126;
                case 4: goto L_0x011e;
                case 5: goto L_0x011a;
                case 6: goto L_0x0115;
                case 7: goto L_0x0115;
                case 8: goto L_0x0107;
                case 9: goto L_0x00d3;
                default: goto L_0x00d1;
            }     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
        L_0x00d1:
            goto L_0x0185
        L_0x00d3:
            androidx.constraintlayout.motion.widget.c r2 = new androidx.constraintlayout.motion.widget.c     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r2.<init>(r11, r12)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            androidx.constraintlayout.motion.widget.d r4 = r10.f2773q     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            java.util.ArrayList<androidx.constraintlayout.motion.widget.c> r5 = r4.f2865b     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r5.add(r2)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r4.f2866c = r0     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            int r4 = r2.f2831b     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            if (r4 != r7) goto L_0x00f5
            androidx.constraintlayout.widget.b r4 = androidx.constraintlayout.widget.ConstraintLayout.getSharedValues()     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            int r2 = r2.f2850u     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            z0.t r5 = new z0.t     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r4.mo3261a(r2, r5)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            goto L_0x0185
        L_0x00f5:
            if (r4 != r8) goto L_0x0185
            androidx.constraintlayout.widget.b r4 = androidx.constraintlayout.widget.ConstraintLayout.getSharedValues()     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            int r2 = r2.f2850u     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            z0.t r5 = new z0.t     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r4.mo3261a(r2, r5)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            goto L_0x0185
        L_0x0107:
            z0.g r2 = new z0.g     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r2.<init>(r11, r12)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            if (r3 == 0) goto L_0x0185
            java.util.ArrayList<z0.g> r4 = r3.f2787k     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r4.add(r2)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            goto L_0x0185
        L_0x0115:
            r10.mo3010k(r11, r12)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            goto L_0x0185
        L_0x011a:
            r10.mo3008i(r11, r12)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            goto L_0x0185
        L_0x011e:
            a1.e r2 = new a1.e     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r2.<init>(r11, r12)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r10.f2758b = r2     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            goto L_0x0185
        L_0x0126:
            if (r3 == 0) goto L_0x0185
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b$a> r2 = r3.f2789m     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            androidx.constraintlayout.motion.widget.a$b$a r4 = new androidx.constraintlayout.motion.widget.a$b$a     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r4.<init>(r11, r3, r12)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r2.add(r4)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            goto L_0x0185
        L_0x0133:
            if (r3 != 0) goto L_0x013f
            android.content.res.Resources r2 = r11.getResources()     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r2.getResourceEntryName(r13)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r12.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
        L_0x013f:
            if (r3 == 0) goto L_0x0185
            androidx.constraintlayout.motion.widget.b r2 = new androidx.constraintlayout.motion.widget.b     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r10.f2757a     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r2.<init>(r11, r4, r12)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r3.f2788l = r2     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            goto L_0x0185
        L_0x014b:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r2 = r10.f2760d     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            androidx.constraintlayout.motion.widget.a$b r3 = new androidx.constraintlayout.motion.widget.a$b     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r3.<init>((androidx.constraintlayout.motion.widget.C0717a) r10, (android.content.Context) r11, (android.content.res.XmlResourceParser) r12)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r2.add(r3)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            androidx.constraintlayout.motion.widget.a$b r2 = r10.f2759c     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            if (r2 != 0) goto L_0x0168
            boolean r2 = r3.f2778b     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            if (r2 != 0) goto L_0x0168
            r10.f2759c = r3     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            androidx.constraintlayout.motion.widget.b r2 = r3.f2788l     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            if (r2 == 0) goto L_0x0168
            boolean r4 = r10.f2772p     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r2.mo3020c(r4)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
        L_0x0168:
            boolean r2 = r3.f2778b     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            if (r2 == 0) goto L_0x0185
            int r2 = r3.f2779c     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            if (r2 != r9) goto L_0x0173
            r10.f2761e = r3     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            goto L_0x0178
        L_0x0173:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r2 = r10.f2762f     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r2.add(r3)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
        L_0x0178:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r2 = r10.f2760d     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            r2.remove(r3)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            goto L_0x0185
        L_0x017e:
            r10.mo3011l(r11, r12)     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            goto L_0x0185
        L_0x0182:
            r12.getName()     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
        L_0x0185:
            int r2 = r12.next()     // Catch:{ XmlPullParserException -> 0x0190, IOException -> 0x018b }
            goto L_0x004e
        L_0x018b:
            r11 = move-exception
            r11.printStackTrace()
            goto L_0x0194
        L_0x0190:
            r11 = move-exception
            r11.printStackTrace()
        L_0x0194:
            android.util.SparseArray<androidx.constraintlayout.widget.a> r11 = r10.f2763g
            int r12 = p002a1.C0041c.motion_base
            androidx.constraintlayout.widget.a r13 = new androidx.constraintlayout.widget.a
            r13.<init>()
            r11.put(r12, r13)
            java.util.HashMap<java.lang.String, java.lang.Integer> r11 = r10.f2764h
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r13 = "motion_base"
            r11.put(r13, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0717a.<init>(android.content.Context, androidx.constraintlayout.motion.widget.MotionLayout, int):void");
    }

    /* renamed from: a */
    public final boolean mo3000a(int i, MotionLayout motionLayout) {
        boolean z;
        boolean z2;
        if (this.f2771o != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        Iterator<C0719b> it = this.f2760d.iterator();
        while (it.hasNext()) {
            C0719b next = it.next();
            int i2 = next.f2790n;
            if (i2 != 0) {
                C0719b bVar = this.f2759c;
                if (bVar == next) {
                    if ((bVar.f2794r & 2) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        continue;
                    }
                }
                if (i == next.f2780d && (i2 == 4 || i2 == 2)) {
                    MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(next);
                    if (next.f2790n == 4) {
                        motionLayout.mo2927d(1.0f);
                        motionLayout.f2721z0 = null;
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.mo2930f(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState);
                        motionLayout.mo2979v();
                    }
                    return true;
                } else if (i == next.f2779c && (i2 == 3 || i2 == 1)) {
                    MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState2);
                    motionLayout.setTransition(next);
                    if (next.f2790n == 3) {
                        motionLayout.mo2927d(BitmapDescriptorFactory.HUE_RED);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(BitmapDescriptorFactory.HUE_RED);
                        motionLayout.mo2930f(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState2);
                        motionLayout.mo2979v();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C0738a mo3001b(int i) {
        int a;
        C0043e eVar = this.f2758b;
        if (!(eVar == null || (a = eVar.mo21a(i)) == -1)) {
            i = a;
        }
        if (this.f2763g.get(i) != null) {
            return this.f2763g.get(i);
        }
        C7376a.m16988c(i, this.f2757a.getContext());
        SparseArray<C0738a> sparseArray = this.f2763g;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    /* renamed from: c */
    public final int mo3002c() {
        C0719b bVar = this.f2759c;
        if (bVar != null) {
            return bVar.f2784h;
        }
        return this.f2766j;
    }

    /* renamed from: d */
    public final int mo3003d(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            i = -1;
        }
        if (i != -1 || str.length() <= 1) {
            return i;
        }
        return Integer.parseInt(str.substring(1));
    }

    /* renamed from: e */
    public final Interpolator mo3004e() {
        C0719b bVar = this.f2759c;
        int i = bVar.f2781e;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.f2757a.getContext(), this.f2759c.f2783g);
        }
        if (i == -1) {
            return new C0718a(C6821c.m16106c(bVar.f2782f));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    /* renamed from: f */
    public final void mo3005f(C7394n nVar) {
        C0719b bVar = this.f2759c;
        if (bVar == null) {
            C0719b bVar2 = this.f2761e;
            if (bVar2 != null) {
                Iterator<C7384g> it = bVar2.f2787k.iterator();
                while (it.hasNext()) {
                    it.next().mo23609a(nVar);
                }
                return;
            }
            return;
        }
        Iterator<C7384g> it2 = bVar.f2787k.iterator();
        while (it2.hasNext()) {
            it2.next().mo23609a(nVar);
        }
    }

    /* renamed from: g */
    public final float mo3006g() {
        C0721b bVar;
        C0719b bVar2 = this.f2759c;
        if (bVar2 == null || (bVar = bVar2.f2788l) == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return bVar.f2823t;
    }

    /* renamed from: h */
    public final int mo3007h() {
        C0719b bVar = this.f2759c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f2780d;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e9  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo3008i(android.content.Context r14, android.content.res.XmlResourceParser r15) {
        /*
            r13 = this;
            androidx.constraintlayout.widget.a r0 = new androidx.constraintlayout.widget.a
            r0.<init>()
            r1 = 0
            r0.f3115e = r1
            int r2 = r15.getAttributeCount()
            r3 = -1
            r4 = 0
            r5 = -1
            r6 = -1
        L_0x0010:
            if (r4 >= r2) goto L_0x00f1
            java.lang.String r7 = r15.getAttributeName(r4)
            java.lang.String r8 = r15.getAttributeValue(r4)
            r7.getClass()
            int r9 = r7.hashCode()
            r10 = -1496482599(0xffffffffa6cd7cd9, float:-1.4258573E-15)
            r11 = 2
            r12 = 1
            if (r9 == r10) goto L_0x0048
            r10 = -1153153640(0xffffffffbb444598, float:-0.0029948708)
            if (r9 == r10) goto L_0x003d
            r10 = 3355(0xd1b, float:4.701E-42)
            if (r9 == r10) goto L_0x0032
            goto L_0x0050
        L_0x0032:
            java.lang.String r9 = "id"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x003b
            goto L_0x0050
        L_0x003b:
            r7 = 2
            goto L_0x0053
        L_0x003d:
            java.lang.String r9 = "constraintRotate"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x0046
            goto L_0x0050
        L_0x0046:
            r7 = 1
            goto L_0x0053
        L_0x0048:
            java.lang.String r9 = "deriveConstraintsFrom"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x0052
        L_0x0050:
            r7 = -1
            goto L_0x0053
        L_0x0052:
            r7 = 0
        L_0x0053:
            if (r7 == 0) goto L_0x00e9
            if (r7 == r12) goto L_0x007f
            if (r7 == r11) goto L_0x005b
            goto L_0x00ed
        L_0x005b:
            int r5 = r13.mo3003d(r14, r8)
            java.util.HashMap<java.lang.String, java.lang.Integer> r7 = r13.f2764h
            r9 = 47
            int r9 = r8.indexOf(r9)
            if (r9 >= 0) goto L_0x006a
            goto L_0x0070
        L_0x006a:
            int r9 = r9 + 1
            java.lang.String r8 = r8.substring(r9)
        L_0x0070:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.put(r8, r9)
            java.lang.String r7 = p328z0.C7376a.m16988c(r5, r14)
            r0.f3111a = r7
            goto L_0x00ed
        L_0x007f:
            int r7 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0087 }
            r0.f3113c = r7     // Catch:{ NumberFormatException -> 0x0087 }
            goto L_0x00ed
        L_0x0087:
            r8.getClass()
            int r7 = r8.hashCode()
            r9 = 3
            r10 = 4
            switch(r7) {
                case -768416914: goto L_0x00c2;
                case 3317767: goto L_0x00b7;
                case 3387192: goto L_0x00ac;
                case 108511772: goto L_0x00a1;
                case 1954540437: goto L_0x0095;
                default: goto L_0x0094;
            }
        L_0x0094:
            goto L_0x00ce
        L_0x0095:
            java.lang.String r7 = "x_right"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x009f
            goto L_0x00ce
        L_0x009f:
            r7 = 4
            goto L_0x00cf
        L_0x00a1:
            java.lang.String r7 = "right"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x00aa
            goto L_0x00ce
        L_0x00aa:
            r7 = 3
            goto L_0x00cf
        L_0x00ac:
            java.lang.String r7 = "none"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x00b5
            goto L_0x00ce
        L_0x00b5:
            r7 = 2
            goto L_0x00cf
        L_0x00b7:
            java.lang.String r7 = "left"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x00c0
            goto L_0x00ce
        L_0x00c0:
            r7 = 1
            goto L_0x00cf
        L_0x00c2:
            java.lang.String r7 = "x_left"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x00cc
            goto L_0x00ce
        L_0x00cc:
            r7 = 0
            goto L_0x00cf
        L_0x00ce:
            r7 = -1
        L_0x00cf:
            if (r7 == 0) goto L_0x00e6
            if (r7 == r12) goto L_0x00e3
            if (r7 == r11) goto L_0x00e0
            if (r7 == r9) goto L_0x00dd
            if (r7 == r10) goto L_0x00da
            goto L_0x00ed
        L_0x00da:
            r0.f3113c = r9
            goto L_0x00ed
        L_0x00dd:
            r0.f3113c = r12
            goto L_0x00ed
        L_0x00e0:
            r0.f3113c = r1
            goto L_0x00ed
        L_0x00e3:
            r0.f3113c = r11
            goto L_0x00ed
        L_0x00e6:
            r0.f3113c = r10
            goto L_0x00ed
        L_0x00e9:
            int r6 = r13.mo3003d(r14, r8)
        L_0x00ed:
            int r4 = r4 + 1
            goto L_0x0010
        L_0x00f1:
            if (r5 == r3) goto L_0x0106
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r13.f2757a
            int r1 = r1.f2660B
            r0.mo3243l(r14, r15)
            if (r6 == r3) goto L_0x0101
            android.util.SparseIntArray r14 = r13.f2765i
            r14.put(r5, r6)
        L_0x0101:
            android.util.SparseArray<androidx.constraintlayout.widget.a> r14 = r13.f2763g
            r14.put(r5, r0)
        L_0x0106:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0717a.mo3008i(android.content.Context, android.content.res.XmlResourceParser):int");
    }

    /* renamed from: j */
    public final int mo3009j(int i, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return mo3008i(context, xml);
                }
            }
            return -1;
        } catch (XmlPullParserException e) {
            e.printStackTrace();
            return -1;
        } catch (IOException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    /* renamed from: k */
    public final void mo3010k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C0042d.include);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0042d.include_constraintSet) {
                mo3009j(obtainStyledAttributes.getResourceId(index, -1), context);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: l */
    public final void mo3011l(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C0042d.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0042d.MotionScene_defaultDuration) {
                int i2 = obtainStyledAttributes.getInt(index, this.f2766j);
                this.f2766j = i2;
                if (i2 < 8) {
                    this.f2766j = 8;
                }
            } else if (index == C0042d.MotionScene_layoutDuringTransition) {
                this.f2767k = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: m */
    public final void mo3012m(int i, MotionLayout motionLayout) {
        C0738a aVar = this.f2763g.get(i);
        aVar.f3112b = aVar.f3111a;
        int i2 = this.f2765i.get(i);
        if (i2 > 0) {
            mo3012m(i2, motionLayout);
            C0738a aVar2 = this.f2763g.get(i2);
            if (aVar2 == null) {
                C7376a.m16988c(i2, this.f2757a.getContext());
                return;
            }
            aVar.f3112b += "/" + aVar2.f3112b;
            for (Integer next : aVar2.f3116f.keySet()) {
                int intValue = next.intValue();
                C0738a.C0739a aVar3 = aVar2.f3116f.get(next);
                if (!aVar.f3116f.containsKey(Integer.valueOf(intValue))) {
                    aVar.f3116f.put(Integer.valueOf(intValue), new C0738a.C0739a());
                }
                C0738a.C0739a aVar4 = aVar.f3116f.get(Integer.valueOf(intValue));
                if (aVar4 != null) {
                    C0738a.C0741b bVar = aVar4.f3121e;
                    if (!bVar.f3166b) {
                        bVar.mo3254a(aVar3.f3121e);
                    }
                    C0738a.C0743d dVar = aVar4.f3119c;
                    if (!dVar.f3220a) {
                        C0738a.C0743d dVar2 = aVar3.f3119c;
                        dVar.f3220a = dVar2.f3220a;
                        dVar.f3221b = dVar2.f3221b;
                        dVar.f3223d = dVar2.f3223d;
                        dVar.f3224e = dVar2.f3224e;
                        dVar.f3222c = dVar2.f3222c;
                    }
                    C0738a.C0744e eVar = aVar4.f3122f;
                    if (!eVar.f3226a) {
                        eVar.mo3259a(aVar3.f3122f);
                    }
                    C0738a.C0742c cVar = aVar4.f3120d;
                    if (!cVar.f3207a) {
                        cVar.mo3256a(aVar3.f3120d);
                    }
                    for (String next2 : aVar3.f3123g.keySet()) {
                        if (!aVar4.f3123g.containsKey(next2)) {
                            aVar4.f3123g.put(next2, aVar3.f3123g.get(next2));
                        }
                    }
                }
            }
        } else {
            aVar.f3112b = C0016g.m31o(new StringBuilder(), aVar.f3112b, "  layout");
            int childCount = motionLayout.getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = motionLayout.getChildAt(i3);
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                int id = childAt.getId();
                if (!aVar.f3115e || id != -1) {
                    if (!aVar.f3116f.containsKey(Integer.valueOf(id))) {
                        aVar.f3116f.put(Integer.valueOf(id), new C0738a.C0739a());
                    }
                    C0738a.C0739a aVar5 = aVar.f3116f.get(Integer.valueOf(id));
                    if (aVar5 != null) {
                        if (!aVar5.f3121e.f3166b) {
                            aVar5.mo3246c(id, layoutParams);
                            if (childAt instanceof ConstraintHelper) {
                                aVar5.f3121e.f3183j0 = ((ConstraintHelper) childAt).getReferencedIds();
                                if (childAt instanceof Barrier) {
                                    Barrier barrier = (Barrier) childAt;
                                    aVar5.f3121e.f3193o0 = barrier.getAllowsGoneWidget();
                                    aVar5.f3121e.f3177g0 = barrier.getType();
                                    aVar5.f3121e.f3179h0 = barrier.getMargin();
                                }
                            }
                            aVar5.f3121e.f3166b = true;
                        }
                        C0738a.C0743d dVar3 = aVar5.f3119c;
                        if (!dVar3.f3220a) {
                            dVar3.f3221b = childAt.getVisibility();
                            aVar5.f3119c.f3223d = childAt.getAlpha();
                            aVar5.f3119c.f3220a = true;
                        }
                        C0738a.C0744e eVar2 = aVar5.f3122f;
                        if (!eVar2.f3226a) {
                            eVar2.f3226a = true;
                            eVar2.f3227b = childAt.getRotation();
                            aVar5.f3122f.f3228c = childAt.getRotationX();
                            aVar5.f3122f.f3229d = childAt.getRotationY();
                            aVar5.f3122f.f3230e = childAt.getScaleX();
                            aVar5.f3122f.f3231f = childAt.getScaleY();
                            float pivotX = childAt.getPivotX();
                            float pivotY = childAt.getPivotY();
                            if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                                C0738a.C0744e eVar3 = aVar5.f3122f;
                                eVar3.f3232g = pivotX;
                                eVar3.f3233h = pivotY;
                            }
                            aVar5.f3122f.f3235j = childAt.getTranslationX();
                            aVar5.f3122f.f3236k = childAt.getTranslationY();
                            aVar5.f3122f.f3237l = childAt.getTranslationZ();
                            C0738a.C0744e eVar4 = aVar5.f3122f;
                            if (eVar4.f3238m) {
                                eVar4.f3239n = childAt.getElevation();
                            }
                        }
                    }
                    i3++;
                } else {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
            }
        }
        for (C0738a.C0739a next3 : aVar.f3116f.values()) {
            if (next3.f3124h != null) {
                if (next3.f3118b != null) {
                    for (Integer intValue2 : aVar.f3116f.keySet()) {
                        C0738a.C0739a j = aVar.mo3241j(intValue2.intValue());
                        String str = j.f3121e.f3187l0;
                        if (str != null && next3.f3118b.matches(str)) {
                            next3.f3124h.mo3253e(j);
                            j.f3123g.putAll((HashMap) next3.f3123g.clone());
                        }
                    }
                } else {
                    next3.f3124h.mo3253e(aVar.mo3241j(next3.f3117a));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r2 != -1) goto L_0x0018;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3013n(int r8, int r9) {
        /*
            r7 = this;
            a1.e r0 = r7.f2758b
            r1 = -1
            if (r0 == 0) goto L_0x0016
            int r0 = r0.mo21a(r8)
            if (r0 == r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r0 = r8
        L_0x000d:
            a1.e r2 = r7.f2758b
            int r2 = r2.mo21a(r9)
            if (r2 == r1) goto L_0x0017
            goto L_0x0018
        L_0x0016:
            r0 = r8
        L_0x0017:
            r2 = r9
        L_0x0018:
            androidx.constraintlayout.motion.widget.a$b r3 = r7.f2759c
            if (r3 == 0) goto L_0x0025
            int r4 = r3.f2779c
            if (r4 != r9) goto L_0x0025
            int r3 = r3.f2780d
            if (r3 != r8) goto L_0x0025
            return
        L_0x0025:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r3 = r7.f2760d
            java.util.Iterator r3 = r3.iterator()
        L_0x002b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0051
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.a$b r4 = (androidx.constraintlayout.motion.widget.C0717a.C0719b) r4
            int r5 = r4.f2779c
            if (r5 != r2) goto L_0x003f
            int r6 = r4.f2780d
            if (r6 == r0) goto L_0x0045
        L_0x003f:
            if (r5 != r9) goto L_0x002b
            int r5 = r4.f2780d
            if (r5 != r8) goto L_0x002b
        L_0x0045:
            r7.f2759c = r4
            androidx.constraintlayout.motion.widget.b r8 = r4.f2788l
            if (r8 == 0) goto L_0x0050
            boolean r9 = r7.f2772p
            r8.mo3020c(r9)
        L_0x0050:
            return
        L_0x0051:
            androidx.constraintlayout.motion.widget.a$b r8 = r7.f2761e
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r3 = r7.f2762f
            java.util.Iterator r3 = r3.iterator()
        L_0x0059:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x006b
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.a$b r4 = (androidx.constraintlayout.motion.widget.C0717a.C0719b) r4
            int r5 = r4.f2779c
            if (r5 != r9) goto L_0x0059
            r8 = r4
            goto L_0x0059
        L_0x006b:
            androidx.constraintlayout.motion.widget.a$b r9 = new androidx.constraintlayout.motion.widget.a$b
            r9.<init>(r7, r8)
            r9.f2780d = r0
            r9.f2779c = r2
            if (r0 == r1) goto L_0x007b
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r8 = r7.f2760d
            r8.add(r9)
        L_0x007b:
            r7.f2759c = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0717a.mo3013n(int, int):void");
    }

    /* renamed from: o */
    public final boolean mo3014o() {
        Iterator<C0719b> it = this.f2760d.iterator();
        while (it.hasNext()) {
            if (it.next().f2788l != null) {
                return true;
            }
        }
        C0719b bVar = this.f2759c;
        if (bVar == null || bVar.f2788l == null) {
            return false;
        }
        return true;
    }

    /* renamed from: androidx.constraintlayout.motion.widget.a$b */
    public static class C0719b {

        /* renamed from: a */
        public int f2777a;

        /* renamed from: b */
        public boolean f2778b;

        /* renamed from: c */
        public int f2779c;

        /* renamed from: d */
        public int f2780d;

        /* renamed from: e */
        public int f2781e;

        /* renamed from: f */
        public String f2782f;

        /* renamed from: g */
        public int f2783g;

        /* renamed from: h */
        public int f2784h;

        /* renamed from: i */
        public float f2785i;

        /* renamed from: j */
        public final C0717a f2786j;

        /* renamed from: k */
        public ArrayList<C7384g> f2787k;

        /* renamed from: l */
        public C0721b f2788l;

        /* renamed from: m */
        public ArrayList<C0720a> f2789m;

        /* renamed from: n */
        public int f2790n;

        /* renamed from: o */
        public boolean f2791o;

        /* renamed from: p */
        public int f2792p;

        /* renamed from: q */
        public int f2793q;

        /* renamed from: r */
        public int f2794r;

        /* renamed from: androidx.constraintlayout.motion.widget.a$b$a */
        public static class C0720a implements View.OnClickListener {

            /* renamed from: b */
            public final C0719b f2795b;

            /* renamed from: c */
            public int f2796c = -1;

            /* renamed from: d */
            public int f2797d = 17;

            public C0720a(Context context, C0719b bVar, XmlResourceParser xmlResourceParser) {
                this.f2795b = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C0042d.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == C0042d.OnClick_targetId) {
                        this.f2796c = obtainStyledAttributes.getResourceId(index, this.f2796c);
                    } else if (index == C0042d.OnClick_clickAction) {
                        this.f2797d = obtainStyledAttributes.getInt(index, this.f2797d);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* renamed from: a */
            public final void mo3016a(MotionLayout motionLayout, int i, C0719b bVar) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                int i2 = this.f2796c;
                View view = motionLayout;
                if (i2 != -1) {
                    view = motionLayout.findViewById(i2);
                }
                if (view != null) {
                    int i3 = bVar.f2780d;
                    int i4 = bVar.f2779c;
                    if (i3 == -1) {
                        view.setOnClickListener(this);
                        return;
                    }
                    int i5 = this.f2797d;
                    int i6 = i5 & 1;
                    boolean z5 = false;
                    if (i6 == 0 || i != i3) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if ((i5 & 256) == 0 || i != i3) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    boolean z6 = z | z2;
                    if (i6 == 0 || i != i3) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    boolean z7 = z3 | z6;
                    if ((i5 & 16) == 0 || i != i4) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    boolean z8 = z7 | z4;
                    if ((i5 & 4096) != 0 && i == i4) {
                        z5 = true;
                    }
                    if (z8 || z5) {
                        view.setOnClickListener(this);
                    }
                }
            }

            public final void onClick(View view) {
                boolean z;
                boolean z2;
                boolean z3;
                C0719b bVar = this.f2795b;
                C0717a aVar = bVar.f2786j;
                MotionLayout motionLayout = aVar.f2757a;
                if (motionLayout.f2702q) {
                    if (bVar.f2780d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            int i = this.f2795b.f2779c;
                            if (!motionLayout.isAttachedToWindow()) {
                                if (motionLayout.f2719y0 == null) {
                                    motionLayout.f2719y0 = new MotionLayout.C0715h();
                                }
                                motionLayout.f2719y0.f2755d = i;
                                return;
                            }
                            motionLayout.mo2924B(i, -1);
                            return;
                        }
                        C0719b bVar2 = this.f2795b;
                        C0719b bVar3 = new C0719b(bVar2.f2786j, bVar2);
                        bVar3.f2780d = currentState;
                        bVar3.f2779c = this.f2795b.f2779c;
                        motionLayout.setTransition(bVar3);
                        motionLayout.mo2927d(1.0f);
                        motionLayout.f2721z0 = null;
                        return;
                    }
                    C0719b bVar4 = aVar.f2759c;
                    int i2 = this.f2797d;
                    boolean z4 = false;
                    if ((i2 & 1) == 0 && (i2 & 256) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if ((i2 & 16) == 0 && (i2 & 4096) == 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z || !z2) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        if (bVar4 != bVar) {
                            motionLayout.setTransition(bVar);
                        }
                        if (motionLayout.getCurrentState() == motionLayout.getEndState() || motionLayout.getProgress() > 0.5f) {
                            z = false;
                        } else {
                            z2 = false;
                        }
                    }
                    C0719b bVar5 = this.f2795b;
                    if (bVar5 != bVar4) {
                        int i3 = bVar5.f2779c;
                        int i4 = bVar5.f2780d;
                        if (i4 != -1) {
                        }
                    }
                    z4 = true;
                    if (!z4) {
                        return;
                    }
                    if (z && (this.f2797d & 1) != 0) {
                        motionLayout.setTransition(bVar5);
                        motionLayout.mo2927d(1.0f);
                        motionLayout.f2721z0 = null;
                    } else if (z2 && (this.f2797d & 16) != 0) {
                        motionLayout.setTransition(bVar5);
                        motionLayout.mo2927d(BitmapDescriptorFactory.HUE_RED);
                    } else if (z && (this.f2797d & 256) != 0) {
                        motionLayout.setTransition(bVar5);
                        motionLayout.setProgress(1.0f);
                    } else if (z2 && (this.f2797d & 4096) != 0) {
                        motionLayout.setTransition(bVar5);
                        motionLayout.setProgress(BitmapDescriptorFactory.HUE_RED);
                    }
                }
            }
        }

        public C0719b(C0717a aVar, C0719b bVar) {
            this.f2777a = -1;
            this.f2778b = false;
            this.f2779c = -1;
            this.f2780d = -1;
            this.f2781e = 0;
            this.f2782f = null;
            this.f2783g = -1;
            this.f2784h = 400;
            this.f2785i = BitmapDescriptorFactory.HUE_RED;
            this.f2787k = new ArrayList<>();
            this.f2788l = null;
            this.f2789m = new ArrayList<>();
            this.f2790n = 0;
            this.f2791o = false;
            this.f2792p = -1;
            this.f2793q = 0;
            this.f2794r = 0;
            this.f2786j = aVar;
            this.f2784h = aVar.f2766j;
            if (bVar != null) {
                this.f2792p = bVar.f2792p;
                this.f2781e = bVar.f2781e;
                this.f2782f = bVar.f2782f;
                this.f2783g = bVar.f2783g;
                this.f2784h = bVar.f2784h;
                this.f2787k = bVar.f2787k;
                this.f2785i = bVar.f2785i;
                this.f2793q = bVar.f2793q;
            }
        }

        public C0719b(C0717a aVar, int i, int i2) {
            this.f2777a = -1;
            this.f2778b = false;
            this.f2779c = -1;
            this.f2780d = -1;
            this.f2781e = 0;
            this.f2782f = null;
            this.f2783g = -1;
            this.f2784h = 400;
            this.f2785i = BitmapDescriptorFactory.HUE_RED;
            this.f2787k = new ArrayList<>();
            this.f2788l = null;
            this.f2789m = new ArrayList<>();
            this.f2790n = 0;
            this.f2791o = false;
            this.f2792p = -1;
            this.f2793q = 0;
            this.f2794r = 0;
            this.f2777a = -1;
            this.f2786j = aVar;
            this.f2780d = i;
            this.f2779c = i2;
            this.f2784h = aVar.f2766j;
            this.f2793q = aVar.f2767k;
        }

        public C0719b(C0717a aVar, Context context, XmlResourceParser xmlResourceParser) {
            this.f2777a = -1;
            this.f2778b = false;
            this.f2779c = -1;
            this.f2780d = -1;
            this.f2781e = 0;
            this.f2782f = null;
            this.f2783g = -1;
            this.f2784h = 400;
            this.f2785i = BitmapDescriptorFactory.HUE_RED;
            this.f2787k = new ArrayList<>();
            this.f2788l = null;
            this.f2789m = new ArrayList<>();
            this.f2790n = 0;
            this.f2791o = false;
            this.f2792p = -1;
            this.f2793q = 0;
            this.f2794r = 0;
            this.f2784h = aVar.f2766j;
            this.f2793q = aVar.f2767k;
            this.f2786j = aVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C0042d.Transition);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.Transition_constraintSetEnd) {
                    this.f2779c = obtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2779c);
                    if ("layout".equals(resourceTypeName)) {
                        C0738a aVar2 = new C0738a();
                        aVar2.mo3242k(this.f2779c, context);
                        aVar.f2763g.append(this.f2779c, aVar2);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f2779c = aVar.mo3009j(this.f2779c, context);
                    }
                } else if (index == C0042d.Transition_constraintSetStart) {
                    this.f2780d = obtainStyledAttributes.getResourceId(index, this.f2780d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f2780d);
                    if ("layout".equals(resourceTypeName2)) {
                        C0738a aVar3 = new C0738a();
                        aVar3.mo3242k(this.f2780d, context);
                        aVar.f2763g.append(this.f2780d, aVar3);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f2780d = aVar.mo3009j(this.f2780d, context);
                    }
                } else if (index == C0042d.Transition_motionInterpolator) {
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        this.f2783g = resourceId;
                        if (resourceId != -1) {
                            this.f2781e = -2;
                        }
                    } else if (i2 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f2782f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f2783g = obtainStyledAttributes.getResourceId(index, -1);
                                this.f2781e = -2;
                            } else {
                                this.f2781e = -1;
                            }
                        }
                    } else {
                        this.f2781e = obtainStyledAttributes.getInteger(index, this.f2781e);
                    }
                } else if (index == C0042d.Transition_duration) {
                    int i3 = obtainStyledAttributes.getInt(index, this.f2784h);
                    this.f2784h = i3;
                    if (i3 < 8) {
                        this.f2784h = 8;
                    }
                } else if (index == C0042d.Transition_staggered) {
                    this.f2785i = obtainStyledAttributes.getFloat(index, this.f2785i);
                } else if (index == C0042d.Transition_autoTransition) {
                    this.f2790n = obtainStyledAttributes.getInteger(index, this.f2790n);
                } else if (index == C0042d.Transition_android_id) {
                    this.f2777a = obtainStyledAttributes.getResourceId(index, this.f2777a);
                } else if (index == C0042d.Transition_transitionDisable) {
                    this.f2791o = obtainStyledAttributes.getBoolean(index, this.f2791o);
                } else if (index == C0042d.Transition_pathMotionArc) {
                    this.f2792p = obtainStyledAttributes.getInteger(index, -1);
                } else if (index == C0042d.Transition_layoutDuringTransition) {
                    this.f2793q = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == C0042d.Transition_transitionFlags) {
                    this.f2794r = obtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.f2780d == -1) {
                this.f2778b = true;
            }
            obtainStyledAttributes.recycle();
        }
    }
}
