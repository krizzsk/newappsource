package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.StaticLayout$Builder;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.appcompat.widget.e0 */
public final class C0396e0 {

    /* renamed from: l */
    public static final RectF f1479l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m */
    public static ConcurrentHashMap<String, Method> f1480m = new ConcurrentHashMap<>();

    /* renamed from: a */
    public int f1481a = 0;

    /* renamed from: b */
    public boolean f1482b = false;

    /* renamed from: c */
    public float f1483c = -1.0f;

    /* renamed from: d */
    public float f1484d = -1.0f;

    /* renamed from: e */
    public float f1485e = -1.0f;

    /* renamed from: f */
    public int[] f1486f = new int[0];

    /* renamed from: g */
    public boolean f1487g = false;

    /* renamed from: h */
    public TextPaint f1488h;

    /* renamed from: i */
    public final TextView f1489i;

    /* renamed from: j */
    public final Context f1490j;

    /* renamed from: k */
    public final C0402f f1491k;

    /* renamed from: androidx.appcompat.widget.e0$a */
    public static final class C0397a {
        /* renamed from: a */
        public static StaticLayout m1002a(CharSequence charSequence, Layout.Alignment alignment, int i, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        /* renamed from: b */
        public static int m1003b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$b */
    public static final class C0398b {
        /* renamed from: a */
        public static boolean m1004a(View view) {
            return view.isInLayout();
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$c */
    public static final class C0399c {
        /* renamed from: a */
        public static StaticLayout m1005a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, C0402f fVar) {
            StaticLayout$Builder obtain = StaticLayout$Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout$Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                fVar.mo2073a(obtain, textView);
            } catch (ClassCastException unused) {
            }
            return obtain.build();
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$d */
    public static class C0400d extends C0402f {
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2073a(android.text.StaticLayout$Builder r4, android.widget.TextView r5) {
            /*
                r3 = this;
                android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
                java.lang.String r1 = "getTextDirectionHeuristic"
                java.lang.reflect.Method r1 = androidx.appcompat.widget.C0396e0.m994d(r1)     // Catch:{ Exception -> 0x0012, all -> 0x0010 }
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0012, all -> 0x0010 }
                java.lang.Object r0 = r1.invoke(r5, r2)     // Catch:{ Exception -> 0x0012, all -> 0x0010 }
                goto L_0x0012
            L_0x0010:
                r4 = move-exception
                throw r4
            L_0x0012:
                android.text.TextDirectionHeuristic r0 = (android.text.TextDirectionHeuristic) r0
                r4.setTextDirection(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0396e0.C0400d.mo2073a(android.text.StaticLayout$Builder, android.widget.TextView):void");
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$e */
    public static class C0401e extends C0400d {
        /* renamed from: a */
        public void mo2073a(StaticLayout$Builder staticLayout$Builder, TextView textView) {
            staticLayout$Builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* renamed from: b */
        public boolean mo2074b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$f */
    public static class C0402f {
        /* renamed from: a */
        public void mo2073a(StaticLayout$Builder staticLayout$Builder, TextView textView) {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo2074b(android.widget.TextView r4) {
            /*
                r3 = this;
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                java.lang.String r1 = "getHorizontallyScrolling"
                java.lang.reflect.Method r1 = androidx.appcompat.widget.C0396e0.m994d(r1)     // Catch:{ Exception -> 0x0012, all -> 0x0010 }
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0012, all -> 0x0010 }
                java.lang.Object r0 = r1.invoke(r4, r2)     // Catch:{ Exception -> 0x0012, all -> 0x0010 }
                goto L_0x0012
            L_0x0010:
                r4 = move-exception
                throw r4
            L_0x0012:
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r4 = r0.booleanValue()
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0396e0.C0402f.mo2074b(android.widget.TextView):boolean");
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public C0396e0(TextView textView) {
        this.f1489i = textView;
        this.f1490j = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.f1491k = new C0401e();
        } else if (i >= 23) {
            this.f1491k = new C0400d();
        } else {
            this.f1491k = new C0402f();
        }
    }

    /* renamed from: b */
    public static int[] m993b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: d */
    public static Method m994d(String str) {
        try {
            Method method = f1480m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1480m.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo2066a() {
        boolean z;
        int i;
        if (!mo2071h() || this.f1481a == 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (this.f1482b) {
                if (this.f1489i.getMeasuredHeight() > 0 && this.f1489i.getMeasuredWidth() > 0) {
                    if (this.f1491k.mo2074b(this.f1489i)) {
                        i = 1048576;
                    } else {
                        i = (this.f1489i.getMeasuredWidth() - this.f1489i.getTotalPaddingLeft()) - this.f1489i.getTotalPaddingRight();
                    }
                    int height = (this.f1489i.getHeight() - this.f1489i.getCompoundPaddingBottom()) - this.f1489i.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        RectF rectF = f1479l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) i;
                            rectF.bottom = (float) height;
                            float c = (float) mo2067c(rectF);
                            if (c != this.f1489i.getTextSize()) {
                                mo2068e(c, 0);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1482b = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r10 = android.text.Layout.Alignment.ALIGN_NORMAL;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo2067c(android.graphics.RectF r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            int[] r2 = r1.f1486f
            int r2 = r2.length
            if (r2 == 0) goto L_0x00cf
            r3 = 1
            int r2 = r2 - r3
            r4 = 0
            r5 = 1
            r6 = 0
        L_0x000e:
            if (r5 > r2) goto L_0x00ca
            int r6 = r5 + r2
            int r6 = r6 / 2
            int[] r7 = r1.f1486f
            r7 = r7[r6]
            android.widget.TextView r8 = r1.f1489i
            java.lang.CharSequence r8 = r8.getText()
            android.widget.TextView r9 = r1.f1489i
            android.text.method.TransformationMethod r9 = r9.getTransformationMethod()
            if (r9 == 0) goto L_0x002f
            android.widget.TextView r10 = r1.f1489i
            java.lang.CharSequence r9 = r9.getTransformation(r8, r10)
            if (r9 == 0) goto L_0x002f
            r8 = r9
        L_0x002f:
            int r9 = android.os.Build.VERSION.SDK_INT
            android.widget.TextView r10 = r1.f1489i
            int r15 = androidx.appcompat.widget.C0396e0.C0397a.m1003b(r10)
            android.text.TextPaint r10 = r1.f1488h
            if (r10 != 0) goto L_0x0043
            android.text.TextPaint r10 = new android.text.TextPaint
            r10.<init>()
            r1.f1488h = r10
            goto L_0x0046
        L_0x0043:
            r10.reset()
        L_0x0046:
            android.text.TextPaint r10 = r1.f1488h
            android.widget.TextView r11 = r1.f1489i
            android.text.TextPaint r11 = r11.getPaint()
            r10.set(r11)
            android.text.TextPaint r10 = r1.f1488h
            float r7 = (float) r7
            r10.setTextSize(r7)
            android.widget.TextView r7 = r1.f1489i
            android.text.Layout$Alignment r10 = android.text.Layout.Alignment.ALIGN_NORMAL
            java.lang.String r11 = "getLayoutAlignment"
            java.lang.reflect.Method r11 = m994d(r11)     // Catch:{ Exception -> 0x006a, all -> 0x0068 }
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x006a, all -> 0x0068 }
            java.lang.Object r10 = r11.invoke(r7, r12)     // Catch:{ Exception -> 0x006a, all -> 0x0068 }
            goto L_0x006a
        L_0x0068:
            r0 = move-exception
            throw r0
        L_0x006a:
            r11 = r10
            android.text.Layout$Alignment r11 = (android.text.Layout.Alignment) r11
            float r7 = r0.right
            int r12 = java.lang.Math.round(r7)
            r7 = 23
            if (r9 < r7) goto L_0x0088
            android.widget.TextView r14 = r1.f1489i
            android.text.TextPaint r7 = r1.f1488h
            androidx.appcompat.widget.e0$f r9 = r1.f1491k
            r10 = r8
            r13 = r15
            r4 = r15
            r15 = r7
            r16 = r9
            android.text.StaticLayout r7 = androidx.appcompat.widget.C0396e0.C0399c.m1005a(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0091
        L_0x0088:
            r4 = r15
            android.widget.TextView r7 = r1.f1489i
            android.text.TextPaint r9 = r1.f1488h
            android.text.StaticLayout r7 = androidx.appcompat.widget.C0396e0.C0397a.m1002a(r8, r11, r12, r7, r9)
        L_0x0091:
            r9 = -1
            if (r4 == r9) goto L_0x00aa
            int r9 = r7.getLineCount()
            if (r9 > r4) goto L_0x00b5
            int r4 = r7.getLineCount()
            int r4 = r4 - r3
            int r4 = r7.getLineEnd(r4)
            int r8 = r8.length()
            if (r4 == r8) goto L_0x00aa
            goto L_0x00b5
        L_0x00aa:
            int r4 = r7.getHeight()
            float r4 = (float) r4
            float r7 = r0.bottom
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b7
        L_0x00b5:
            r4 = 0
            goto L_0x00b8
        L_0x00b7:
            r4 = 1
        L_0x00b8:
            if (r4 == 0) goto L_0x00c4
            int r6 = r6 + 1
            r4 = 0
            r17 = r6
            r6 = r5
            r5 = r17
            goto L_0x000e
        L_0x00c4:
            int r6 = r6 + -1
            r2 = r6
            r4 = 0
            goto L_0x000e
        L_0x00ca:
            int[] r0 = r1.f1486f
            r0 = r0[r6]
            return r0
        L_0x00cf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "No available text sizes to choose from."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0396e0.mo2067c(android.graphics.RectF):int");
    }

    /* renamed from: e */
    public final void mo2068e(float f, int i) {
        Resources resources;
        Context context = this.f1490j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        if (applyDimension != this.f1489i.getPaint().getTextSize()) {
            this.f1489i.getPaint().setTextSize(applyDimension);
            boolean a = C0398b.m1004a(this.f1489i);
            if (this.f1489i.getLayout() != null) {
                this.f1482b = false;
                try {
                    Method d = m994d("nullLayouts");
                    if (d != null) {
                        d.invoke(this.f1489i, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!a) {
                    this.f1489i.requestLayout();
                } else {
                    this.f1489i.forceLayout();
                }
                this.f1489i.invalidate();
            }
        }
    }

    /* renamed from: f */
    public final boolean mo2069f() {
        if (!mo2071h() || this.f1481a != 1) {
            this.f1482b = false;
        } else {
            if (!this.f1487g || this.f1486f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f1485e - this.f1484d) / this.f1483c))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((((float) i) * this.f1483c) + this.f1484d);
                }
                this.f1486f = m993b(iArr);
            }
            this.f1482b = true;
        }
        return this.f1482b;
    }

    /* renamed from: g */
    public final boolean mo2070g() {
        boolean z;
        int[] iArr = this.f1486f;
        int length = iArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f1487g = z;
        if (z) {
            this.f1481a = 1;
            this.f1484d = (float) iArr[0];
            this.f1485e = (float) iArr[length - 1];
            this.f1483c = -1.0f;
        }
        return z;
    }

    /* renamed from: h */
    public final boolean mo2071h() {
        return !(this.f1489i instanceof AppCompatEditText);
    }

    /* renamed from: i */
    public final void mo2072i(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > BitmapDescriptorFactory.HUE_RED) {
            this.f1481a = 1;
            this.f1484d = f;
            this.f1485e = f2;
            this.f1483c = f3;
            this.f1487g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }
}
