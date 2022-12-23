package p328z0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.HashSet;
import p002a1.C0042d;
import p279v0.C6831j;
import p317y0.C7253d;

/* renamed from: z0.f */
public final class C7382f extends C7379d {

    /* renamed from: e */
    public int f22627e = 0;

    /* renamed from: f */
    public int f22628f = -1;

    /* renamed from: g */
    public String f22629g = null;

    /* renamed from: h */
    public float f22630h = Float.NaN;

    /* renamed from: i */
    public float f22631i = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: j */
    public float f22632j = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: k */
    public float f22633k = Float.NaN;

    /* renamed from: l */
    public int f22634l = -1;

    /* renamed from: m */
    public float f22635m = Float.NaN;

    /* renamed from: n */
    public float f22636n = Float.NaN;

    /* renamed from: o */
    public float f22637o = Float.NaN;

    /* renamed from: p */
    public float f22638p = Float.NaN;

    /* renamed from: q */
    public float f22639q = Float.NaN;

    /* renamed from: r */
    public float f22640r = Float.NaN;

    /* renamed from: s */
    public float f22641s = Float.NaN;

    /* renamed from: t */
    public float f22642t = Float.NaN;

    /* renamed from: u */
    public float f22643u = Float.NaN;

    /* renamed from: v */
    public float f22644v = Float.NaN;

    /* renamed from: w */
    public float f22645w = Float.NaN;

    /* renamed from: z0.f$a */
    public static class C7383a {

        /* renamed from: a */
        public static SparseIntArray f22646a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f22646a = sparseIntArray;
            sparseIntArray.append(C0042d.KeyCycle_motionTarget, 1);
            f22646a.append(C0042d.KeyCycle_framePosition, 2);
            f22646a.append(C0042d.KeyCycle_transitionEasing, 3);
            f22646a.append(C0042d.KeyCycle_curveFit, 4);
            f22646a.append(C0042d.KeyCycle_waveShape, 5);
            f22646a.append(C0042d.KeyCycle_wavePeriod, 6);
            f22646a.append(C0042d.KeyCycle_waveOffset, 7);
            f22646a.append(C0042d.KeyCycle_waveVariesBy, 8);
            f22646a.append(C0042d.KeyCycle_android_alpha, 9);
            f22646a.append(C0042d.KeyCycle_android_elevation, 10);
            f22646a.append(C0042d.KeyCycle_android_rotation, 11);
            f22646a.append(C0042d.KeyCycle_android_rotationX, 12);
            f22646a.append(C0042d.KeyCycle_android_rotationY, 13);
            f22646a.append(C0042d.KeyCycle_transitionPathRotate, 14);
            f22646a.append(C0042d.KeyCycle_android_scaleX, 15);
            f22646a.append(C0042d.KeyCycle_android_scaleY, 16);
            f22646a.append(C0042d.KeyCycle_android_translationX, 17);
            f22646a.append(C0042d.KeyCycle_android_translationY, 18);
            f22646a.append(C0042d.KeyCycle_android_translationZ, 19);
            f22646a.append(C0042d.KeyCycle_motionProgress, 20);
            f22646a.append(C0042d.KeyCycle_wavePhase, 21);
        }
    }

    public C7382f() {
        this.f22610d = new HashMap<>();
    }

    /* renamed from: a */
    public final void mo23600a(HashMap<String, C7253d> hashMap) {
        hashMap.size();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(2, stackTrace.length - 1);
        String str = " ";
        for (int i = 1; i <= min; i++) {
            stackTrace[i].getFileName();
            stackTrace[i].getLineNumber();
            stackTrace[i].getMethodName();
            str = str + " ";
        }
        for (String next : hashMap.keySet()) {
            C6831j jVar = hashMap.get(next);
            if (jVar != null) {
                next.getClass();
                char c = 65535;
                switch (next.hashCode()) {
                    case -1249320806:
                        if (next.equals("rotationX")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (next.equals("rotationY")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (next.equals("translationX")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (next.equals("translationY")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (next.equals("translationZ")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (next.equals("progress")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (next.equals("scaleX")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (next.equals("scaleY")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -40300674:
                        if (next.equals("rotation")) {
                            c = 8;
                            break;
                        }
                        break;
                    case -4379043:
                        if (next.equals("elevation")) {
                            c = 9;
                            break;
                        }
                        break;
                    case 37232917:
                        if (next.equals("transitionPathRotate")) {
                            c = 10;
                            break;
                        }
                        break;
                    case 92909918:
                        if (next.equals("alpha")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 156108012:
                        if (next.equals("waveOffset")) {
                            c = 12;
                            break;
                        }
                        break;
                    case 1530034690:
                        if (next.equals("wavePhase")) {
                            c = 13;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        jVar.mo23065b(this.f22639q, this.f22607a);
                        break;
                    case 1:
                        jVar.mo23065b(this.f22640r, this.f22607a);
                        break;
                    case 2:
                        jVar.mo23065b(this.f22643u, this.f22607a);
                        break;
                    case 3:
                        jVar.mo23065b(this.f22644v, this.f22607a);
                        break;
                    case 4:
                        jVar.mo23065b(this.f22645w, this.f22607a);
                        break;
                    case 5:
                        jVar.mo23065b(this.f22633k, this.f22607a);
                        break;
                    case 6:
                        jVar.mo23065b(this.f22641s, this.f22607a);
                        break;
                    case 7:
                        jVar.mo23065b(this.f22642t, this.f22607a);
                        break;
                    case 8:
                        jVar.mo23065b(this.f22637o, this.f22607a);
                        break;
                    case 9:
                        jVar.mo23065b(this.f22636n, this.f22607a);
                        break;
                    case 10:
                        jVar.mo23065b(this.f22638p, this.f22607a);
                        break;
                    case 11:
                        jVar.mo23065b(this.f22635m, this.f22607a);
                        break;
                    case 12:
                        jVar.mo23065b(this.f22631i, this.f22607a);
                        break;
                    case 13:
                        jVar.mo23065b(this.f22632j, this.f22607a);
                        break;
                    default:
                        next.startsWith("CUSTOM");
                        break;
                }
            }
        }
    }

    /* renamed from: b */
    public final C7379d clone() {
        C7382f fVar = new C7382f();
        super.mo23602c(this);
        fVar.f22627e = this.f22627e;
        fVar.f22628f = this.f22628f;
        fVar.f22629g = this.f22629g;
        fVar.f22630h = this.f22630h;
        fVar.f22631i = this.f22631i;
        fVar.f22632j = this.f22632j;
        fVar.f22633k = this.f22633k;
        fVar.f22634l = this.f22634l;
        fVar.f22635m = this.f22635m;
        fVar.f22636n = this.f22636n;
        fVar.f22637o = this.f22637o;
        fVar.f22638p = this.f22638p;
        fVar.f22639q = this.f22639q;
        fVar.f22640r = this.f22640r;
        fVar.f22641s = this.f22641s;
        fVar.f22642t = this.f22642t;
        fVar.f22643u = this.f22643u;
        fVar.f22644v = this.f22644v;
        fVar.f22645w = this.f22645w;
        return fVar;
    }

    /* renamed from: d */
    public final void mo23604d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f22635m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f22636n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f22637o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f22639q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f22640r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f22641s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f22642t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f22638p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f22643u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f22644v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f22645w)) {
            hashSet.add("translationZ");
        }
        if (this.f22610d.size() > 0) {
            for (String str : this.f22610d.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    /* renamed from: e */
    public final void mo23605e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0042d.KeyCycle);
        SparseIntArray sparseIntArray = C7383a.f22646a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (C7383a.f22646a.get(index)) {
                case 1:
                    if (!MotionLayout.f2657J0) {
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f22608b = obtainStyledAttributes.getResourceId(index, this.f22608b);
                            break;
                        } else {
                            this.f22609c = obtainStyledAttributes.getString(index);
                            break;
                        }
                    } else {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f22608b);
                        this.f22608b = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f22609c = obtainStyledAttributes.getString(index);
                            break;
                        }
                    }
                case 2:
                    this.f22607a = obtainStyledAttributes.getInt(index, this.f22607a);
                    break;
                case 3:
                    obtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f22627e = obtainStyledAttributes.getInteger(index, this.f22627e);
                    break;
                case 5:
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        this.f22628f = obtainStyledAttributes.getInt(index, this.f22628f);
                        break;
                    } else {
                        this.f22629g = obtainStyledAttributes.getString(index);
                        this.f22628f = 7;
                        break;
                    }
                case 6:
                    this.f22630h = obtainStyledAttributes.getFloat(index, this.f22630h);
                    break;
                case 7:
                    if (obtainStyledAttributes.peekValue(index).type != 5) {
                        this.f22631i = obtainStyledAttributes.getFloat(index, this.f22631i);
                        break;
                    } else {
                        this.f22631i = obtainStyledAttributes.getDimension(index, this.f22631i);
                        break;
                    }
                case 8:
                    this.f22634l = obtainStyledAttributes.getInt(index, this.f22634l);
                    break;
                case 9:
                    this.f22635m = obtainStyledAttributes.getFloat(index, this.f22635m);
                    break;
                case 10:
                    this.f22636n = obtainStyledAttributes.getDimension(index, this.f22636n);
                    break;
                case 11:
                    this.f22637o = obtainStyledAttributes.getFloat(index, this.f22637o);
                    break;
                case 12:
                    this.f22639q = obtainStyledAttributes.getFloat(index, this.f22639q);
                    break;
                case 13:
                    this.f22640r = obtainStyledAttributes.getFloat(index, this.f22640r);
                    break;
                case 14:
                    this.f22638p = obtainStyledAttributes.getFloat(index, this.f22638p);
                    break;
                case 15:
                    this.f22641s = obtainStyledAttributes.getFloat(index, this.f22641s);
                    break;
                case 16:
                    this.f22642t = obtainStyledAttributes.getFloat(index, this.f22642t);
                    break;
                case 17:
                    this.f22643u = obtainStyledAttributes.getDimension(index, this.f22643u);
                    break;
                case 18:
                    this.f22644v = obtainStyledAttributes.getDimension(index, this.f22644v);
                    break;
                case 19:
                    this.f22645w = obtainStyledAttributes.getDimension(index, this.f22645w);
                    break;
                case 20:
                    this.f22633k = obtainStyledAttributes.getFloat(index, this.f22633k);
                    break;
                case 21:
                    this.f22632j = obtainStyledAttributes.getFloat(index, this.f22632j) / 360.0f;
                    break;
                default:
                    Integer.toHexString(index);
                    C7383a.f22646a.get(index);
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d0, code lost:
        if (r3.equals("scaleY") == false) goto L_0x0123;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23608h(java.util.HashMap<java.lang.String, p317y0.C7239c> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.Set r2 = r18.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x000c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x018e
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "CUSTOM"
            boolean r5 = r3.startsWith(r4)
            r6 = 7
            r7 = -1
            if (r5 == 0) goto L_0x006a
            java.lang.String r4 = r3.substring(r6)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r5 = r0.f22610d
            java.lang.Object r4 = r5.get(r4)
            androidx.constraintlayout.widget.ConstraintAttribute r4 = (androidx.constraintlayout.widget.ConstraintAttribute) r4
            if (r4 == 0) goto L_0x000c
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r5 = r4.f2990c
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r6 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE
            if (r5 == r6) goto L_0x0037
            goto L_0x000c
        L_0x0037:
            java.lang.Object r3 = r1.get(r3)
            y0.c r3 = (p317y0.C7239c) r3
            if (r3 != 0) goto L_0x0040
            goto L_0x000c
        L_0x0040:
            int r13 = r0.f22607a
            int r5 = r0.f22628f
            java.lang.String r6 = r0.f22629g
            int r14 = r0.f22634l
            float r9 = r0.f22630h
            float r10 = r0.f22631i
            float r11 = r0.f22632j
            float r12 = r4.mo3150a()
            java.util.ArrayList<v0.e$b> r15 = r3.f21108f
            v0.e$b r8 = new v0.e$b
            r16 = r8
            r8.<init>(r9, r10, r11, r12, r13)
            r15.add(r8)
            if (r14 == r7) goto L_0x0062
            r3.f21107e = r14
        L_0x0062:
            r3.f21105c = r5
            r3.mo23057c(r4)
            r3.f21106d = r6
            goto L_0x000c
        L_0x006a:
            int r5 = r3.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x0118;
                case -1249320805: goto L_0x010d;
                case -1225497657: goto L_0x0101;
                case -1225497656: goto L_0x00f5;
                case -1225497655: goto L_0x00e9;
                case -1001078227: goto L_0x00de;
                case -908189618: goto L_0x00d3;
                case -908189617: goto L_0x00ca;
                case -40300674: goto L_0x00bc;
                case -4379043: goto L_0x00ae;
                case 37232917: goto L_0x009f;
                case 92909918: goto L_0x0091;
                case 156108012: goto L_0x0082;
                case 1530034690: goto L_0x0073;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x0123
        L_0x0073:
            java.lang.String r5 = "wavePhase"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x007e
            goto L_0x0123
        L_0x007e:
            r6 = 13
            goto L_0x0124
        L_0x0082:
            java.lang.String r5 = "waveOffset"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x008d
            goto L_0x0123
        L_0x008d:
            r6 = 12
            goto L_0x0124
        L_0x0091:
            java.lang.String r5 = "alpha"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x009b
            goto L_0x0123
        L_0x009b:
            r6 = 11
            goto L_0x0124
        L_0x009f:
            java.lang.String r5 = "transitionPathRotate"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x00aa
            goto L_0x0123
        L_0x00aa:
            r6 = 10
            goto L_0x0124
        L_0x00ae:
            java.lang.String r5 = "elevation"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x00b8
            goto L_0x0123
        L_0x00b8:
            r6 = 9
            goto L_0x0124
        L_0x00bc:
            java.lang.String r5 = "rotation"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x00c6
            goto L_0x0123
        L_0x00c6:
            r6 = 8
            goto L_0x0124
        L_0x00ca:
            java.lang.String r5 = "scaleY"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0124
            goto L_0x0123
        L_0x00d3:
            java.lang.String r5 = "scaleX"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x00dc
            goto L_0x0123
        L_0x00dc:
            r6 = 6
            goto L_0x0124
        L_0x00de:
            java.lang.String r5 = "progress"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x00e7
            goto L_0x0123
        L_0x00e7:
            r6 = 5
            goto L_0x0124
        L_0x00e9:
            java.lang.String r5 = "translationZ"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x00f3
            goto L_0x0123
        L_0x00f3:
            r6 = 4
            goto L_0x0124
        L_0x00f5:
            java.lang.String r5 = "translationY"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x00ff
            goto L_0x0123
        L_0x00ff:
            r6 = 3
            goto L_0x0124
        L_0x0101:
            java.lang.String r5 = "translationX"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x010b
            goto L_0x0123
        L_0x010b:
            r6 = 2
            goto L_0x0124
        L_0x010d:
            java.lang.String r5 = "rotationY"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0116
            goto L_0x0123
        L_0x0116:
            r6 = 1
            goto L_0x0124
        L_0x0118:
            java.lang.String r5 = "rotationX"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0121
            goto L_0x0123
        L_0x0121:
            r6 = 0
            goto L_0x0124
        L_0x0123:
            r6 = -1
        L_0x0124:
            switch(r6) {
                case 0: goto L_0x0156;
                case 1: goto L_0x0153;
                case 2: goto L_0x0150;
                case 3: goto L_0x014d;
                case 4: goto L_0x014a;
                case 5: goto L_0x0147;
                case 6: goto L_0x0144;
                case 7: goto L_0x0141;
                case 8: goto L_0x013e;
                case 9: goto L_0x013b;
                case 10: goto L_0x0138;
                case 11: goto L_0x0135;
                case 12: goto L_0x0132;
                case 13: goto L_0x012f;
                default: goto L_0x0127;
            }
        L_0x0127:
            r3.startsWith(r4)
            r4 = 2143289344(0x7fc00000, float:NaN)
            r12 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x0159
        L_0x012f:
            float r4 = r0.f22632j
            goto L_0x0158
        L_0x0132:
            float r4 = r0.f22631i
            goto L_0x0158
        L_0x0135:
            float r4 = r0.f22635m
            goto L_0x0158
        L_0x0138:
            float r4 = r0.f22638p
            goto L_0x0158
        L_0x013b:
            float r4 = r0.f22636n
            goto L_0x0158
        L_0x013e:
            float r4 = r0.f22637o
            goto L_0x0158
        L_0x0141:
            float r4 = r0.f22642t
            goto L_0x0158
        L_0x0144:
            float r4 = r0.f22641s
            goto L_0x0158
        L_0x0147:
            float r4 = r0.f22633k
            goto L_0x0158
        L_0x014a:
            float r4 = r0.f22645w
            goto L_0x0158
        L_0x014d:
            float r4 = r0.f22644v
            goto L_0x0158
        L_0x0150:
            float r4 = r0.f22643u
            goto L_0x0158
        L_0x0153:
            float r4 = r0.f22640r
            goto L_0x0158
        L_0x0156:
            float r4 = r0.f22639q
        L_0x0158:
            r12 = r4
        L_0x0159:
            boolean r4 = java.lang.Float.isNaN(r12)
            if (r4 == 0) goto L_0x0161
            goto L_0x000c
        L_0x0161:
            java.lang.Object r3 = r1.get(r3)
            y0.c r3 = (p317y0.C7239c) r3
            if (r3 != 0) goto L_0x016b
            goto L_0x000c
        L_0x016b:
            int r13 = r0.f22607a
            int r4 = r0.f22628f
            java.lang.String r5 = r0.f22629g
            int r6 = r0.f22634l
            float r9 = r0.f22630h
            float r10 = r0.f22631i
            float r11 = r0.f22632j
            java.util.ArrayList<v0.e$b> r14 = r3.f21108f
            v0.e$b r15 = new v0.e$b
            r8 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            r14.add(r15)
            if (r6 == r7) goto L_0x0188
            r3.f21107e = r6
        L_0x0188:
            r3.f21105c = r4
            r3.f21106d = r5
            goto L_0x000c
        L_0x018e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p328z0.C7382f.mo23608h(java.util.HashMap):void");
    }
}
