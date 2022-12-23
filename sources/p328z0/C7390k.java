package p328z0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import p002a1.C0042d;
import p317y0.C7253d;

/* renamed from: z0.k */
public final class C7390k extends C7379d {

    /* renamed from: e */
    public String f22678e = null;

    /* renamed from: f */
    public int f22679f = -1;

    /* renamed from: g */
    public String f22680g = null;

    /* renamed from: h */
    public String f22681h = null;

    /* renamed from: i */
    public int f22682i = -1;

    /* renamed from: j */
    public int f22683j = -1;

    /* renamed from: k */
    public View f22684k = null;

    /* renamed from: l */
    public float f22685l = 0.1f;

    /* renamed from: m */
    public boolean f22686m = true;

    /* renamed from: n */
    public boolean f22687n = true;

    /* renamed from: o */
    public boolean f22688o = true;

    /* renamed from: p */
    public float f22689p = Float.NaN;

    /* renamed from: q */
    public float f22690q;

    /* renamed from: r */
    public boolean f22691r = false;

    /* renamed from: s */
    public int f22692s = -1;

    /* renamed from: t */
    public int f22693t = -1;

    /* renamed from: u */
    public int f22694u = -1;

    /* renamed from: v */
    public RectF f22695v = new RectF();

    /* renamed from: w */
    public RectF f22696w = new RectF();

    /* renamed from: x */
    public HashMap<String, Method> f22697x = new HashMap<>();

    /* renamed from: z0.k$a */
    public static class C7391a {

        /* renamed from: a */
        public static SparseIntArray f22698a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f22698a = sparseIntArray;
            sparseIntArray.append(C0042d.KeyTrigger_framePosition, 8);
            f22698a.append(C0042d.KeyTrigger_onCross, 4);
            f22698a.append(C0042d.KeyTrigger_onNegativeCross, 1);
            f22698a.append(C0042d.KeyTrigger_onPositiveCross, 2);
            f22698a.append(C0042d.KeyTrigger_motionTarget, 7);
            f22698a.append(C0042d.KeyTrigger_triggerId, 6);
            f22698a.append(C0042d.KeyTrigger_triggerSlack, 5);
            f22698a.append(C0042d.KeyTrigger_motion_triggerOnCollision, 9);
            f22698a.append(C0042d.KeyTrigger_motion_postLayoutCollision, 10);
            f22698a.append(C0042d.KeyTrigger_triggerReceiver, 11);
            f22698a.append(C0042d.KeyTrigger_viewTransitionOnCross, 12);
            f22698a.append(C0042d.KeyTrigger_viewTransitionOnNegativeCross, 13);
            f22698a.append(C0042d.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }
    }

    public C7390k() {
        this.f22610d = new HashMap<>();
    }

    /* renamed from: j */
    public static void m17022j(RectF rectF, View view, boolean z) {
        rectF.top = (float) view.getTop();
        rectF.bottom = (float) view.getBottom();
        rectF.left = (float) view.getLeft();
        rectF.right = (float) view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* renamed from: a */
    public final void mo23600a(HashMap<String, C7253d> hashMap) {
    }

    /* renamed from: b */
    public final C7379d clone() {
        C7390k kVar = new C7390k();
        super.mo23602c(this);
        kVar.f22678e = this.f22678e;
        kVar.f22679f = this.f22679f;
        kVar.f22680g = this.f22680g;
        kVar.f22681h = this.f22681h;
        kVar.f22682i = this.f22682i;
        kVar.f22683j = this.f22683j;
        kVar.f22684k = this.f22684k;
        kVar.f22685l = this.f22685l;
        kVar.f22686m = this.f22686m;
        kVar.f22687n = this.f22687n;
        kVar.f22688o = this.f22688o;
        kVar.f22689p = this.f22689p;
        kVar.f22690q = this.f22690q;
        kVar.f22691r = this.f22691r;
        kVar.f22695v = this.f22695v;
        kVar.f22696w = this.f22696w;
        kVar.f22697x = this.f22697x;
        return kVar;
    }

    /* renamed from: d */
    public final void mo23604d(HashSet<String> hashSet) {
    }

    /* renamed from: e */
    public final void mo23605e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0042d.KeyTrigger);
        SparseIntArray sparseIntArray = C7391a.f22698a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (C7391a.f22698a.get(index)) {
                case 1:
                    this.f22680g = obtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.f22681h = obtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f22678e = obtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.f22685l = obtainStyledAttributes.getFloat(index, this.f22685l);
                    break;
                case 6:
                    this.f22682i = obtainStyledAttributes.getResourceId(index, this.f22682i);
                    break;
                case 7:
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
                case 8:
                    int integer = obtainStyledAttributes.getInteger(index, this.f22607a);
                    this.f22607a = integer;
                    this.f22689p = (((float) integer) + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.f22683j = obtainStyledAttributes.getResourceId(index, this.f22683j);
                    break;
                case 10:
                    this.f22691r = obtainStyledAttributes.getBoolean(index, this.f22691r);
                    break;
                case 11:
                    this.f22679f = obtainStyledAttributes.getResourceId(index, this.f22679f);
                    break;
                case 12:
                    this.f22694u = obtainStyledAttributes.getResourceId(index, this.f22694u);
                    break;
                case 13:
                    this.f22692s = obtainStyledAttributes.getResourceId(index, this.f22692s);
                    break;
                case 14:
                    this.f22693t = obtainStyledAttributes.getResourceId(index, this.f22693t);
                    break;
                default:
                    Integer.toHexString(index);
                    C7391a.f22698a.get(index);
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23612h(android.view.View r10, float r11) {
        /*
            r9 = this;
            int r0 = r9.f22683j
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 == r3) goto L_0x0060
            android.view.View r0 = r9.f22684k
            if (r0 != 0) goto L_0x0019
            android.view.ViewParent r0 = r10.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r4 = r9.f22683j
            android.view.View r0 = r0.findViewById(r4)
            r9.f22684k = r0
        L_0x0019:
            android.graphics.RectF r0 = r9.f22695v
            android.view.View r4 = r9.f22684k
            boolean r5 = r9.f22691r
            m17022j(r0, r4, r5)
            android.graphics.RectF r0 = r9.f22696w
            boolean r4 = r9.f22691r
            m17022j(r0, r10, r4)
            android.graphics.RectF r0 = r9.f22695v
            android.graphics.RectF r4 = r9.f22696w
            boolean r0 = r0.intersect(r4)
            if (r0 == 0) goto L_0x004a
            boolean r0 = r9.f22686m
            if (r0 == 0) goto L_0x003b
            r9.f22686m = r2
            r0 = 1
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            boolean r4 = r9.f22688o
            if (r4 == 0) goto L_0x0044
            r9.f22688o = r2
            r4 = 1
            goto L_0x0045
        L_0x0044:
            r4 = 0
        L_0x0045:
            r9.f22687n = r1
            r5 = 0
            goto L_0x00dd
        L_0x004a:
            boolean r0 = r9.f22686m
            if (r0 != 0) goto L_0x0052
            r9.f22686m = r1
            r0 = 1
            goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            boolean r4 = r9.f22687n
            if (r4 == 0) goto L_0x005b
            r9.f22687n = r2
            r4 = 1
            goto L_0x005c
        L_0x005b:
            r4 = 0
        L_0x005c:
            r9.f22688o = r1
            goto L_0x00db
        L_0x0060:
            boolean r0 = r9.f22686m
            r4 = 0
            if (r0 == 0) goto L_0x0076
            float r0 = r9.f22689p
            float r5 = r11 - r0
            float r6 = r9.f22690q
            float r6 = r6 - r0
            float r6 = r6 * r5
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0086
            r9.f22686m = r2
            r0 = 1
            goto L_0x0087
        L_0x0076:
            float r0 = r9.f22689p
            float r0 = r11 - r0
            float r0 = java.lang.Math.abs(r0)
            float r5 = r9.f22685l
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0086
            r9.f22686m = r1
        L_0x0086:
            r0 = 0
        L_0x0087:
            boolean r5 = r9.f22687n
            if (r5 == 0) goto L_0x00a0
            float r5 = r9.f22689p
            float r6 = r11 - r5
            float r7 = r9.f22690q
            float r7 = r7 - r5
            float r7 = r7 * r6
            int r5 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x00b0
            int r5 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x00b0
            r9.f22687n = r2
            r5 = 1
            goto L_0x00b1
        L_0x00a0:
            float r5 = r9.f22689p
            float r5 = r11 - r5
            float r5 = java.lang.Math.abs(r5)
            float r6 = r9.f22685l
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x00b0
            r9.f22687n = r1
        L_0x00b0:
            r5 = 0
        L_0x00b1:
            boolean r6 = r9.f22688o
            if (r6 == 0) goto L_0x00ca
            float r6 = r9.f22689p
            float r7 = r11 - r6
            float r8 = r9.f22690q
            float r8 = r8 - r6
            float r8 = r8 * r7
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x00dc
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x00dc
            r9.f22688o = r2
            r4 = 1
            goto L_0x00dd
        L_0x00ca:
            float r4 = r9.f22689p
            float r4 = r11 - r4
            float r4 = java.lang.Math.abs(r4)
            float r6 = r9.f22685l
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x00da
            r9.f22688o = r1
        L_0x00da:
            r4 = r5
        L_0x00db:
            r5 = r4
        L_0x00dc:
            r4 = 0
        L_0x00dd:
            r9.f22690q = r11
            if (r5 != 0) goto L_0x00e5
            if (r0 != 0) goto L_0x00e5
            if (r4 == 0) goto L_0x010a
        L_0x00e5:
            android.view.ViewParent r11 = r10.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = (androidx.constraintlayout.motion.widget.MotionLayout) r11
            androidx.constraintlayout.motion.widget.MotionLayout$i r6 = r11.f2658A
            if (r6 == 0) goto L_0x00f2
            r6.mo2919b()
        L_0x00f2:
            java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout$i> r11 = r11.f2685S
            if (r11 == 0) goto L_0x010a
            java.util.Iterator r11 = r11.iterator()
        L_0x00fa:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x010a
            java.lang.Object r6 = r11.next()
            androidx.constraintlayout.motion.widget.MotionLayout$i r6 = (androidx.constraintlayout.motion.widget.MotionLayout.C0716i) r6
            r6.mo2919b()
            goto L_0x00fa
        L_0x010a:
            int r11 = r9.f22679f
            if (r11 != r3) goto L_0x0110
            r11 = r10
            goto L_0x011c
        L_0x0110:
            android.view.ViewParent r11 = r10.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = (androidx.constraintlayout.motion.widget.MotionLayout) r11
            int r6 = r9.f22679f
            android.view.View r11 = r11.findViewById(r6)
        L_0x011c:
            if (r5 == 0) goto L_0x0138
            java.lang.String r5 = r9.f22680g
            if (r5 == 0) goto L_0x0125
            r9.mo23613i(r11, r5)
        L_0x0125:
            int r5 = r9.f22692s
            if (r5 == r3) goto L_0x0138
            android.view.ViewParent r5 = r10.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r5 = (androidx.constraintlayout.motion.widget.MotionLayout) r5
            int r6 = r9.f22692s
            android.view.View[] r7 = new android.view.View[r1]
            r7[r2] = r11
            r5.mo2926D(r6, r7)
        L_0x0138:
            if (r4 == 0) goto L_0x0154
            java.lang.String r4 = r9.f22681h
            if (r4 == 0) goto L_0x0141
            r9.mo23613i(r11, r4)
        L_0x0141:
            int r4 = r9.f22693t
            if (r4 == r3) goto L_0x0154
            android.view.ViewParent r4 = r10.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r4 = (androidx.constraintlayout.motion.widget.MotionLayout) r4
            int r5 = r9.f22693t
            android.view.View[] r6 = new android.view.View[r1]
            r6[r2] = r11
            r4.mo2926D(r5, r6)
        L_0x0154:
            if (r0 == 0) goto L_0x0170
            java.lang.String r0 = r9.f22678e
            if (r0 == 0) goto L_0x015d
            r9.mo23613i(r11, r0)
        L_0x015d:
            int r0 = r9.f22694u
            if (r0 == r3) goto L_0x0170
            android.view.ViewParent r10 = r10.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = (androidx.constraintlayout.motion.widget.MotionLayout) r10
            int r0 = r9.f22694u
            android.view.View[] r1 = new android.view.View[r1]
            r1[r2] = r11
            r10.mo2926D(r0, r1)
        L_0x0170:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p328z0.C7390k.mo23612h(android.view.View, float):void");
    }

    /* renamed from: i */
    public final void mo23613i(View view, String str) {
        Method method;
        boolean z;
        ConstraintAttribute constraintAttribute;
        if (str != null) {
            if (str.startsWith(".")) {
                if (str.length() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    str = str.substring(1).toLowerCase(Locale.ROOT);
                }
                for (String next : this.f22610d.keySet()) {
                    String lowerCase = next.toLowerCase(Locale.ROOT);
                    if ((z || lowerCase.matches(str)) && (constraintAttribute = this.f22610d.get(next)) != null) {
                        Class<?> cls = view.getClass();
                        String str2 = constraintAttribute.f2989b;
                        if (!constraintAttribute.f2988a) {
                            str2 = C25541a.m63881k("set", str2);
                        }
                        try {
                            switch (ConstraintAttribute.C0734a.f2996a[constraintAttribute.f2990c.ordinal()]) {
                                case 1:
                                case 6:
                                    cls.getMethod(str2, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(constraintAttribute.f2991d)});
                                    break;
                                case 2:
                                    cls.getMethod(str2, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(constraintAttribute.f2994g)});
                                    break;
                                case 3:
                                    cls.getMethod(str2, new Class[]{CharSequence.class}).invoke(view, new Object[]{constraintAttribute.f2993f});
                                    break;
                                case 4:
                                    cls.getMethod(str2, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(constraintAttribute.f2995h)});
                                    break;
                                case 5:
                                    Method method2 = cls.getMethod(str2, new Class[]{Drawable.class});
                                    ColorDrawable colorDrawable = new ColorDrawable();
                                    colorDrawable.setColor(constraintAttribute.f2995h);
                                    method2.invoke(view, new Object[]{colorDrawable});
                                    break;
                                case 7:
                                    cls.getMethod(str2, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(constraintAttribute.f2992e)});
                                    break;
                                case 8:
                                    cls.getMethod(str2, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(constraintAttribute.f2992e)});
                                    break;
                            }
                        } catch (NoSuchMethodException e) {
                            e.getMessage();
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        } catch (InvocationTargetException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
                return;
            }
            if (this.f22697x.containsKey(str)) {
                method = this.f22697x.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, new Class[0]);
                    this.f22697x.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.f22697x.put(str, (Object) null);
                    view.getClass();
                    C7376a.m16989d(view);
                    return;
                }
            }
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused2) {
                view.getClass();
                C7376a.m16989d(view);
            }
        }
    }
}
