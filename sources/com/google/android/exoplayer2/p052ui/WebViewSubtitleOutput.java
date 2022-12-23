package com.google.android.exoplayer2.p052ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.p052ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p126ib.C5332a;
import p277ub.C6774a0;

/* renamed from: com.google.android.exoplayer2.ui.WebViewSubtitleOutput */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.C4022a {

    /* renamed from: b */
    public final CanvasSubtitleOutput f14436b;

    /* renamed from: c */
    public final C4025a f14437c;

    /* renamed from: d */
    public List<C5332a> f14438d = Collections.emptyList();

    /* renamed from: e */
    public C4027a f14439e = C4027a.f14444g;

    /* renamed from: f */
    public float f14440f = 0.0533f;

    /* renamed from: g */
    public int f14441g = 0;

    /* renamed from: h */
    public float f14442h = 0.08f;

    /* renamed from: com.google.android.exoplayer2.ui.WebViewSubtitleOutput$a */
    public class C4025a extends WebView {
        public C4025a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        public final boolean performClick() {
            super.performClick();
            return false;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.WebViewSubtitleOutput$b */
    public static /* synthetic */ class C4026b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14443a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14443a = r0
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14443a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14443a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p052ui.WebViewSubtitleOutput.C4026b.<clinit>():void");
        }
    }

    public WebViewSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.f14436b = canvasSubtitleOutput;
        C4025a aVar = new C4025a(context, attributeSet);
        this.f14437c = aVar;
        aVar.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(aVar);
    }

    /* renamed from: a */
    public final void mo16350a(List<C5332a> list, C4027a aVar, float f, int i, float f2) {
        this.f14439e = aVar;
        this.f14440f = f;
        this.f14441g = i;
        this.f14442h = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C5332a aVar2 = list.get(i2);
            if (aVar2.f17592d != null) {
                arrayList.add(aVar2);
            } else {
                arrayList2.add(aVar2);
            }
        }
        if (!this.f14438d.isEmpty() || !arrayList2.isEmpty()) {
            this.f14438d = arrayList2;
            mo16655c();
        }
        this.f14436b.mo16350a(arrayList, aVar, f, i, f2);
        invalidate();
    }

    /* renamed from: b */
    public final String mo16654b(float f, int i) {
        float b = C4030b0.m10909b(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (b == -3.4028235E38f) {
            return "unset";
        }
        return C6774a0.m15950j("%.2fpx", Float.valueOf(b / getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:201:0x04a0, code lost:
        if (((android.text.style.TypefaceSpan) r9).getFamily() != null) goto L_0x04e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ee, code lost:
        if (r13 != false) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f1, code lost:
        if (r13 != false) goto L_0x01f6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x04f5  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x05cf  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x063f  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x065f  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0681  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x06af  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0527 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0237  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16655c() {
        /*
            r41 = this;
            r0 = r41
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.google.android.exoplayer2.ui.a r4 = r0.f14439e
            int r4 = r4.f14445a
            java.lang.String r4 = ce0.C21100e.m49305E0(r4)
            r5 = 0
            r3[r5] = r4
            int r4 = r0.f14441g
            float r6 = r0.f14440f
            java.lang.String r4 = r0.mo16654b(r6, r4)
            r6 = 1
            r3[r6] = r4
            r4 = 1067030938(0x3f99999a, float:1.2)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r7 = 2
            r3[r7] = r4
            com.google.android.exoplayer2.ui.a r4 = r0.f14439e
            int r8 = r4.f14448d
            r9 = 3
            java.lang.String r10 = "unset"
            if (r8 == r6) goto L_0x006f
            if (r8 == r7) goto L_0x005e
            if (r8 == r9) goto L_0x004d
            if (r8 == r2) goto L_0x003c
            r2 = r10
            goto L_0x007f
        L_0x003c:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            int r4 = r4.f14449e
            java.lang.String r4 = ce0.C21100e.m49305E0(r4)
            r2[r5] = r4
            java.lang.String r4 = "-0.05em -0.05em 0.15em %s"
            java.lang.String r2 = p277ub.C6774a0.m15950j(r4, r2)
            goto L_0x007f
        L_0x004d:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            int r4 = r4.f14449e
            java.lang.String r4 = ce0.C21100e.m49305E0(r4)
            r2[r5] = r4
            java.lang.String r4 = "0.06em 0.08em 0.15em %s"
            java.lang.String r2 = p277ub.C6774a0.m15950j(r4, r2)
            goto L_0x007f
        L_0x005e:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            int r4 = r4.f14449e
            java.lang.String r4 = ce0.C21100e.m49305E0(r4)
            r2[r5] = r4
            java.lang.String r4 = "0.1em 0.12em 0.15em %s"
            java.lang.String r2 = p277ub.C6774a0.m15950j(r4, r2)
            goto L_0x007f
        L_0x006f:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            int r4 = r4.f14449e
            java.lang.String r4 = ce0.C21100e.m49305E0(r4)
            r2[r5] = r4
            java.lang.String r4 = "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s"
            java.lang.String r2 = p277ub.C6774a0.m15950j(r4, r2)
        L_0x007f:
            r3[r9] = r2
            java.lang.String r2 = "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>"
            java.lang.String r2 = p277ub.C6774a0.m15950j(r2, r3)
            r1.append(r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "default_bg"
            java.lang.String r4 = ce0.C21100e.m49318M(r3)
            java.lang.Object[] r8 = new java.lang.Object[r6]
            com.google.android.exoplayer2.ui.a r9 = r0.f14439e
            int r9 = r9.f14446b
            java.lang.String r9 = ce0.C21100e.m49305E0(r9)
            r8[r5] = r9
            java.lang.String r9 = "background-color:%s;"
            java.lang.String r8 = p277ub.C6774a0.m15950j(r9, r8)
            r2.put(r4, r8)
            r4 = 0
        L_0x00ab:
            java.util.List<ib.a> r8 = r0.f14438d
            int r8 = r8.size()
            if (r4 >= r8) goto L_0x06cb
            java.util.List<ib.a> r8 = r0.f14438d
            java.lang.Object r8 = r8.get(r4)
            ib.a r8 = (p126ib.C5332a) r8
            float r11 = r8.f17596h
            r12 = 1120403456(0x42c80000, float:100.0)
            r13 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r14 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r14 == 0) goto L_0x00c9
            float r11 = r11 * r12
            goto L_0x00cb
        L_0x00c9:
            r11 = 1112014848(0x42480000, float:50.0)
        L_0x00cb:
            int r14 = r8.f17597i
            r16 = -100
            if (r14 == r6) goto L_0x00d8
            if (r14 == r7) goto L_0x00d5
            r7 = 0
            goto L_0x00da
        L_0x00d5:
            r7 = -100
            goto L_0x00da
        L_0x00d8:
            r7 = -50
        L_0x00da:
            float r14 = r8.f17593e
            r17 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r15 = "%.2f%%"
            int r20 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r20 == 0) goto L_0x0152
            int r13 = r8.f17594f
            if (r13 == r6) goto L_0x011d
            java.lang.Object[] r13 = new java.lang.Object[r6]
            float r14 = r14 * r12
            java.lang.Float r12 = java.lang.Float.valueOf(r14)
            r13[r5] = r12
            java.lang.String r5 = p277ub.C6774a0.m15950j(r15, r13)
            int r12 = r8.f17604p
            if (r12 != r6) goto L_0x010c
            int r12 = r8.f17595g
            r13 = 2
            if (r12 == r6) goto L_0x0108
            if (r12 == r13) goto L_0x0105
            r12 = 0
            goto L_0x010a
        L_0x0105:
            r12 = -100
            goto L_0x010a
        L_0x0108:
            r12 = -50
        L_0x010a:
            int r12 = -r12
            goto L_0x011a
        L_0x010c:
            r12 = 2
            int r13 = r8.f17595g
            if (r13 == r6) goto L_0x0118
            if (r13 == r12) goto L_0x0115
            r12 = 0
            goto L_0x011a
        L_0x0115:
            r12 = -100
            goto L_0x011a
        L_0x0118:
            r12 = -50
        L_0x011a:
            r16 = r12
            goto L_0x0167
        L_0x011d:
            java.lang.String r12 = "%.2fem"
            int r13 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r13 < 0) goto L_0x0137
            java.lang.Object[] r13 = new java.lang.Object[r6]
            r16 = 1067030938(0x3f99999a, float:1.2)
            float r14 = r14 * r16
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            r13[r5] = r14
            java.lang.String r5 = p277ub.C6774a0.m15950j(r12, r13)
            r12 = 0
            r13 = 0
            goto L_0x014d
        L_0x0137:
            java.lang.Object[] r13 = new java.lang.Object[r6]
            float r14 = -r14
            float r14 = r14 - r18
            r16 = 1067030938(0x3f99999a, float:1.2)
            float r14 = r14 * r16
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            r13[r5] = r14
            java.lang.String r5 = p277ub.C6774a0.m15950j(r12, r13)
            r12 = 1
            r13 = 1
        L_0x014d:
            r12 = 1120403456(0x42c80000, float:100.0)
            r16 = 0
            goto L_0x016a
        L_0x0152:
            java.lang.Object[] r12 = new java.lang.Object[r6]
            float r13 = r0.f14442h
            float r18 = r18 - r13
            r13 = 1120403456(0x42c80000, float:100.0)
            float r18 = r18 * r13
            java.lang.Float r14 = java.lang.Float.valueOf(r18)
            r12[r5] = r14
            java.lang.String r5 = p277ub.C6774a0.m15950j(r15, r12)
            r12 = 0
        L_0x0167:
            r12 = 1120403456(0x42c80000, float:100.0)
            r13 = 0
        L_0x016a:
            float r14 = r8.f17598j
            r18 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r18 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r18 == 0) goto L_0x0185
            r18 = r7
            java.lang.Object[] r7 = new java.lang.Object[r6]
            float r14 = r14 * r12
            java.lang.Float r12 = java.lang.Float.valueOf(r14)
            r14 = 0
            r7[r14] = r12
            java.lang.String r7 = p277ub.C6774a0.m15950j(r15, r7)
            goto L_0x0189
        L_0x0185:
            r18 = r7
            java.lang.String r7 = "fit-content"
        L_0x0189:
            android.text.Layout$Alignment r12 = r8.f17590b
            java.lang.String r14 = "end"
            java.lang.String r15 = "start"
            java.lang.String r19 = "center"
            if (r12 != 0) goto L_0x0199
            r6 = 2
        L_0x0194:
            r20 = r14
            r12 = r19
            goto L_0x01af
        L_0x0199:
            int[] r20 = com.google.android.exoplayer2.p052ui.WebViewSubtitleOutput.C4026b.f14443a
            int r12 = r12.ordinal()
            r12 = r20[r12]
            if (r12 == r6) goto L_0x01ab
            r6 = 2
            if (r12 == r6) goto L_0x01a7
            goto L_0x0194
        L_0x01a7:
            r12 = r14
            r20 = r12
            goto L_0x01af
        L_0x01ab:
            r6 = 2
            r20 = r14
            r12 = r15
        L_0x01af:
            int r14 = r8.f17604p
            r21 = r15
            r15 = 1
            if (r14 == r15) goto L_0x01bf
            if (r14 == r6) goto L_0x01bb
            java.lang.String r6 = "horizontal-tb"
            goto L_0x01c2
        L_0x01bb:
            java.lang.String r6 = "vertical-lr"
            goto L_0x01c2
        L_0x01bf:
            java.lang.String r6 = "vertical-rl"
        L_0x01c2:
            int r14 = r8.f17602n
            float r15 = r8.f17603o
            java.lang.String r14 = r0.mo16654b(r15, r14)
            boolean r15 = r8.f17600l
            if (r15 == 0) goto L_0x01d1
            int r15 = r8.f17601m
            goto L_0x01d5
        L_0x01d1:
            com.google.android.exoplayer2.ui.a r15 = r0.f14439e
            int r15 = r15.f14447c
        L_0x01d5:
            java.lang.String r15 = ce0.C21100e.m49305E0(r15)
            int r0 = r8.f17604p
            java.lang.String r22 = "left"
            java.lang.String r23 = "top"
            r24 = r3
            r3 = 1
            if (r0 == r3) goto L_0x01f1
            r3 = 2
            if (r0 == r3) goto L_0x01ee
            if (r13 == 0) goto L_0x01ec
            java.lang.String r23 = "bottom"
        L_0x01ec:
            r3 = 2
            goto L_0x01fd
        L_0x01ee:
            if (r13 == 0) goto L_0x01f6
            goto L_0x01f4
        L_0x01f1:
            if (r13 == 0) goto L_0x01f4
            goto L_0x01f6
        L_0x01f4:
            java.lang.String r22 = "right"
        L_0x01f6:
            r3 = 2
            r40 = r23
            r23 = r22
            r22 = r40
        L_0x01fd:
            if (r0 == r3) goto L_0x020d
            r3 = 1
            if (r0 != r3) goto L_0x0203
            goto L_0x020d
        L_0x0203:
            java.lang.String r0 = "width"
            r40 = r18
            r18 = r16
            r16 = r40
            goto L_0x020f
        L_0x020d:
            java.lang.String r0 = "height"
        L_0x020f:
            java.lang.CharSequence r3 = r8.f17589a
            android.content.Context r13 = r41.getContext()
            android.content.res.Resources r13 = r13.getResources()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            java.util.regex.Pattern r25 = com.google.android.exoplayer2.p052ui.C4047p.f14489a
            r25 = r1
            java.lang.String r1 = ""
            r26 = r8
            java.lang.String r8 = "</span>"
            if (r3 != 0) goto L_0x0237
            com.google.android.exoplayer2.ui.p$a r3 = new com.google.android.exoplayer2.ui.p$a
            com.google.common.collect.ImmutableMap r13 = com.google.common.collect.ImmutableMap.m35707j()
            r3.<init>(r1, r13)
            r27 = r1
            goto L_0x024b
        L_0x0237:
            r27 = r1
            boolean r1 = r3 instanceof android.text.Spanned
            if (r1 != 0) goto L_0x025d
            com.google.android.exoplayer2.ui.p$a r1 = new com.google.android.exoplayer2.ui.p$a
            java.lang.String r3 = com.google.android.exoplayer2.p052ui.C4047p.m10919a(r3)
            com.google.common.collect.ImmutableMap r13 = com.google.common.collect.ImmutableMap.m35707j()
            r1.<init>(r3, r13)
            r3 = r1
        L_0x024b:
            r39 = r0
            r35 = r6
            r38 = r7
            r28 = r8
            r31 = r9
            r36 = r12
            r30 = r14
            r29 = r15
            goto L_0x05c1
        L_0x025d:
            android.text.Spanned r3 = (android.text.Spanned) r3
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r28 = r8
            int r8 = r3.length()
            r29 = r15
            java.lang.Class<android.text.style.BackgroundColorSpan> r15 = android.text.style.BackgroundColorSpan.class
            r30 = r14
            r14 = 0
            java.lang.Object[] r8 = r3.getSpans(r14, r8, r15)
            android.text.style.BackgroundColorSpan[] r8 = (android.text.style.BackgroundColorSpan[]) r8
            int r14 = r8.length
            r15 = 0
        L_0x0279:
            if (r15 >= r14) goto L_0x028f
            r31 = r8[r15]
            int r31 = r31.getBackgroundColor()
            r32 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r31)
            r1.add(r8)
            int r15 = r15 + 1
            r8 = r32
            goto L_0x0279
        L_0x028f:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0298:
            boolean r14 = r1.hasNext()
            if (r14 == 0) goto L_0x02d6
            java.lang.Object r14 = r1.next()
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r31 = r1
            r1 = 14
            r15.<init>(r1)
            java.lang.String r1 = "bg_"
            r15.append(r1)
            r15.append(r14)
            java.lang.String r1 = r15.toString()
            java.lang.String r1 = ce0.C21100e.m49318M(r1)
            r15 = 1
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.String r14 = ce0.C21100e.m49305E0(r14)
            r32 = 0
            r15[r32] = r14
            java.lang.String r14 = p277ub.C6774a0.m15950j(r9, r15)
            r8.put(r1, r14)
            r1 = r31
            goto L_0x0298
        L_0x02d6:
            r1 = 0
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            int r15 = r3.length()
            r31 = r9
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            java.lang.Object[] r1 = r3.getSpans(r1, r15, r9)
            int r9 = r1.length
            r15 = 0
        L_0x02ea:
            if (r15 >= r9) goto L_0x0539
            r32 = r9
            r9 = r1[r15]
            r33 = r1
            boolean r1 = r9 instanceof android.text.style.StrikethroughSpan
            r34 = 0
            if (r1 == 0) goto L_0x0308
            java.lang.String r35 = "<span style='text-decoration:line-through;'>"
            r39 = r0
            r38 = r7
            r36 = r12
            r37 = r13
            r0 = r35
            r35 = r6
            goto L_0x047a
        L_0x0308:
            r35 = r6
            boolean r6 = r9 instanceof android.text.style.ForegroundColorSpan
            if (r6 == 0) goto L_0x032a
            r6 = r9
            android.text.style.ForegroundColorSpan r6 = (android.text.style.ForegroundColorSpan) r6
            r36 = r12
            r12 = 1
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r6 = r6.getForegroundColor()
            java.lang.String r6 = ce0.C21100e.m49305E0(r6)
            r37 = 0
            r12[r37] = r6
            java.lang.String r6 = "<span style='color:%s;'>"
            java.lang.String r6 = p277ub.C6774a0.m15950j(r6, r12)
            goto L_0x0403
        L_0x032a:
            r36 = r12
            r6 = 1
            boolean r12 = r9 instanceof android.text.style.BackgroundColorSpan
            if (r12 == 0) goto L_0x034a
            r12 = r9
            android.text.style.BackgroundColorSpan r12 = (android.text.style.BackgroundColorSpan) r12
            java.lang.Object[] r6 = new java.lang.Object[r6]
            int r12 = r12.getBackgroundColor()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r37 = 0
            r6[r37] = r12
            java.lang.String r12 = "<span class='bg_%s'>"
            java.lang.String r6 = p277ub.C6774a0.m15950j(r12, r6)
            goto L_0x0403
        L_0x034a:
            boolean r6 = r9 instanceof p174mb.C5761a
            if (r6 == 0) goto L_0x0352
            java.lang.String r6 = "<span style='text-combine-upright:all;'>"
            goto L_0x0403
        L_0x0352:
            boolean r6 = r9 instanceof android.text.style.AbsoluteSizeSpan
            if (r6 == 0) goto L_0x037e
            r6 = r9
            android.text.style.AbsoluteSizeSpan r6 = (android.text.style.AbsoluteSizeSpan) r6
            boolean r12 = r6.getDip()
            if (r12 == 0) goto L_0x0365
            int r6 = r6.getSize()
            float r6 = (float) r6
            goto L_0x036b
        L_0x0365:
            int r6 = r6.getSize()
            float r6 = (float) r6
            float r6 = r6 / r13
        L_0x036b:
            r12 = 1
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r37 = 0
            r12[r37] = r6
            java.lang.String r6 = "<span style='font-size:%.2fpx;'>"
            java.lang.String r6 = p277ub.C6774a0.m15950j(r6, r12)
            goto L_0x0403
        L_0x037e:
            r6 = 1
            boolean r12 = r9 instanceof android.text.style.RelativeSizeSpan
            if (r12 == 0) goto L_0x03a0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r12 = r9
            android.text.style.RelativeSizeSpan r12 = (android.text.style.RelativeSizeSpan) r12
            float r12 = r12.getSizeChange()
            r38 = 1120403456(0x42c80000, float:100.0)
            float r12 = r12 * r38
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r37 = 0
            r6[r37] = r12
            java.lang.String r12 = "<span style='font-size:%.2f%%;'>"
            java.lang.String r6 = p277ub.C6774a0.m15950j(r12, r6)
            goto L_0x0403
        L_0x03a0:
            r37 = 0
            boolean r6 = r9 instanceof android.text.style.TypefaceSpan
            if (r6 == 0) goto L_0x03c3
            r6 = r9
            android.text.style.TypefaceSpan r6 = (android.text.style.TypefaceSpan) r6
            java.lang.String r6 = r6.getFamily()
            if (r6 == 0) goto L_0x03bb
            r12 = 1
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r37] = r6
            java.lang.String r6 = "<span style='font-family:\"%s\";'>"
            java.lang.String r6 = p277ub.C6774a0.m15950j(r6, r12)
            goto L_0x0403
        L_0x03bb:
            r39 = r0
            r38 = r7
            r37 = r13
            goto L_0x0478
        L_0x03c3:
            r6 = 1
            boolean r12 = r9 instanceof android.text.style.StyleSpan
            if (r12 == 0) goto L_0x03e1
            r12 = r9
            android.text.style.StyleSpan r12 = (android.text.style.StyleSpan) r12
            int r12 = r12.getStyle()
            if (r12 == r6) goto L_0x03de
            r6 = 2
            if (r12 == r6) goto L_0x03db
            r6 = 3
            if (r12 == r6) goto L_0x03d8
            goto L_0x03bb
        L_0x03d8:
            java.lang.String r6 = "<b><i>"
            goto L_0x0403
        L_0x03db:
            java.lang.String r6 = "<i>"
            goto L_0x0403
        L_0x03de:
            java.lang.String r6 = "<b>"
            goto L_0x0403
        L_0x03e1:
            boolean r6 = r9 instanceof p174mb.C5763c
            if (r6 == 0) goto L_0x03fd
            r6 = r9
            mb.c r6 = (p174mb.C5763c) r6
            int r6 = r6.f18650b
            r12 = -1
            if (r6 == r12) goto L_0x03fa
            r12 = 1
            if (r6 == r12) goto L_0x03f7
            r12 = 2
            if (r6 == r12) goto L_0x03f4
            goto L_0x03bb
        L_0x03f4:
            java.lang.String r6 = "<ruby style='ruby-position:under;'>"
            goto L_0x0403
        L_0x03f7:
            java.lang.String r6 = "<ruby style='ruby-position:over;'>"
            goto L_0x0403
        L_0x03fa:
            java.lang.String r6 = "<ruby style='ruby-position:unset;'>"
            goto L_0x0403
        L_0x03fd:
            boolean r6 = r9 instanceof android.text.style.UnderlineSpan
            if (r6 == 0) goto L_0x040c
            java.lang.String r6 = "<u>"
        L_0x0403:
            r39 = r0
            r0 = r6
            r38 = r7
            r37 = r13
            goto L_0x047a
        L_0x040c:
            boolean r6 = r9 instanceof p174mb.C5764d
            if (r6 == 0) goto L_0x03bb
            r6 = r9
            mb.d r6 = (p174mb.C5764d) r6
            int r12 = r6.f18651a
            r37 = r13
            int r13 = r6.f18652b
            r38 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r39 = r0
            r0 = 1
            if (r13 == r0) goto L_0x042f
            r0 = 2
            if (r13 == r0) goto L_0x0429
            goto L_0x0435
        L_0x0429:
            java.lang.String r13 = "open "
            r7.append(r13)
            goto L_0x0435
        L_0x042f:
            r0 = 2
            java.lang.String r13 = "filled "
            r7.append(r13)
        L_0x0435:
            if (r12 == 0) goto L_0x0455
            r13 = 1
            if (r12 == r13) goto L_0x044f
            if (r12 == r0) goto L_0x0449
            r0 = 3
            if (r12 == r0) goto L_0x0443
            r7.append(r10)
            goto L_0x045a
        L_0x0443:
            java.lang.String r0 = "sesame"
            r7.append(r0)
            goto L_0x045a
        L_0x0449:
            java.lang.String r0 = "dot"
            r7.append(r0)
            goto L_0x045a
        L_0x044f:
            java.lang.String r0 = "circle"
            r7.append(r0)
            goto L_0x045a
        L_0x0455:
            java.lang.String r0 = "none"
            r7.append(r0)
        L_0x045a:
            java.lang.String r0 = r7.toString()
            int r6 = r6.f18653c
            r7 = 2
            if (r6 == r7) goto L_0x0466
            java.lang.String r6 = "over right"
            goto L_0x0469
        L_0x0466:
            java.lang.String r6 = "under left"
        L_0x0469:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r12 = 0
            r7[r12] = r0
            r0 = 1
            r7[r0] = r6
            java.lang.String r0 = "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>"
            java.lang.String r0 = p277ub.C6774a0.m15950j(r0, r7)
            goto L_0x047a
        L_0x0478:
            r0 = r34
        L_0x047a:
            if (r1 != 0) goto L_0x04e9
            boolean r1 = r9 instanceof android.text.style.ForegroundColorSpan
            if (r1 != 0) goto L_0x04e9
            boolean r1 = r9 instanceof android.text.style.BackgroundColorSpan
            if (r1 != 0) goto L_0x04e9
            boolean r1 = r9 instanceof p174mb.C5761a
            if (r1 != 0) goto L_0x04e9
            boolean r1 = r9 instanceof android.text.style.AbsoluteSizeSpan
            if (r1 != 0) goto L_0x04e9
            boolean r1 = r9 instanceof android.text.style.RelativeSizeSpan
            if (r1 != 0) goto L_0x04e9
            boolean r1 = r9 instanceof p174mb.C5764d
            if (r1 == 0) goto L_0x0495
            goto L_0x04e9
        L_0x0495:
            boolean r1 = r9 instanceof android.text.style.TypefaceSpan
            if (r1 == 0) goto L_0x04a3
            r1 = r9
            android.text.style.TypefaceSpan r1 = (android.text.style.TypefaceSpan) r1
            java.lang.String r1 = r1.getFamily()
            if (r1 == 0) goto L_0x04e6
            goto L_0x04e9
        L_0x04a3:
            boolean r1 = r9 instanceof android.text.style.StyleSpan
            if (r1 == 0) goto L_0x04c1
            r1 = r9
            android.text.style.StyleSpan r1 = (android.text.style.StyleSpan) r1
            int r1 = r1.getStyle()
            r6 = 1
            if (r1 == r6) goto L_0x04be
            r6 = 2
            if (r1 == r6) goto L_0x04bb
            r6 = 3
            if (r1 == r6) goto L_0x04b8
            goto L_0x04e6
        L_0x04b8:
            java.lang.String r1 = "</i></b>"
            goto L_0x04dc
        L_0x04bb:
            java.lang.String r1 = "</i>"
            goto L_0x04dc
        L_0x04be:
            java.lang.String r1 = "</b>"
            goto L_0x04dc
        L_0x04c1:
            boolean r1 = r9 instanceof p174mb.C5763c
            if (r1 == 0) goto L_0x04df
            r1 = r9
            mb.c r1 = (p174mb.C5763c) r1
            java.lang.String r1 = r1.f18649a
            java.lang.String r1 = com.google.android.exoplayer2.p052ui.C4047p.m10919a(r1)
            r6 = 16
            int r6 = p001a0.C0016g.m25h(r1, r6)
            java.lang.String r7 = "<rt>"
            java.lang.String r12 = "</rt></ruby>"
            java.lang.String r1 = p379.C25541a.m63875e(r6, r7, r1, r12)
        L_0x04dc:
            r34 = r1
            goto L_0x04e6
        L_0x04df:
            boolean r1 = r9 instanceof android.text.style.UnderlineSpan
            if (r1 == 0) goto L_0x04e6
            java.lang.String r1 = "</u>"
            goto L_0x04dc
        L_0x04e6:
            r1 = r34
            goto L_0x04eb
        L_0x04e9:
            r1 = r28
        L_0x04eb:
            int r6 = r3.getSpanStart(r9)
            int r7 = r3.getSpanEnd(r9)
            if (r0 == 0) goto L_0x0527
            r1.getClass()
            com.google.android.exoplayer2.ui.p$b r9 = new com.google.android.exoplayer2.ui.p$b
            r9.<init>(r6, r7, r0, r1)
            java.lang.Object r0 = r14.get(r6)
            com.google.android.exoplayer2.ui.p$c r0 = (com.google.android.exoplayer2.p052ui.C4047p.C4050c) r0
            if (r0 != 0) goto L_0x050d
            com.google.android.exoplayer2.ui.p$c r0 = new com.google.android.exoplayer2.ui.p$c
            r0.<init>()
            r14.put(r6, r0)
        L_0x050d:
            java.util.ArrayList r0 = r0.f14498a
            r0.add(r9)
            java.lang.Object r0 = r14.get(r7)
            com.google.android.exoplayer2.ui.p$c r0 = (com.google.android.exoplayer2.p052ui.C4047p.C4050c) r0
            if (r0 != 0) goto L_0x0522
            com.google.android.exoplayer2.ui.p$c r0 = new com.google.android.exoplayer2.ui.p$c
            r0.<init>()
            r14.put(r7, r0)
        L_0x0522:
            java.util.ArrayList r0 = r0.f14499b
            r0.add(r9)
        L_0x0527:
            int r15 = r15 + 1
            r9 = r32
            r1 = r33
            r6 = r35
            r12 = r36
            r13 = r37
            r7 = r38
            r0 = r39
            goto L_0x02ea
        L_0x0539:
            r39 = r0
            r35 = r6
            r38 = r7
            r36 = r12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.length()
            r0.<init>(r1)
            r1 = 0
            r6 = 0
        L_0x054c:
            int r7 = r14.size()
            if (r1 >= r7) goto L_0x05a9
            int r7 = r14.keyAt(r1)
            java.lang.CharSequence r6 = r3.subSequence(r6, r7)
            java.lang.String r6 = com.google.android.exoplayer2.p052ui.C4047p.m10919a(r6)
            r0.append(r6)
            java.lang.Object r6 = r14.get(r7)
            com.google.android.exoplayer2.ui.p$c r6 = (com.google.android.exoplayer2.p052ui.C4047p.C4050c) r6
            java.util.ArrayList r9 = r6.f14499b
            q5.a r12 = com.google.android.exoplayer2.p052ui.C4047p.C4049b.f14493f
            java.util.Collections.sort(r9, r12)
            java.util.ArrayList r9 = r6.f14499b
            java.util.Iterator r9 = r9.iterator()
        L_0x0574:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x0586
            java.lang.Object r12 = r9.next()
            com.google.android.exoplayer2.ui.p$b r12 = (com.google.android.exoplayer2.p052ui.C4047p.C4049b) r12
            java.lang.String r12 = r12.f14497d
            r0.append(r12)
            goto L_0x0574
        L_0x0586:
            java.util.ArrayList r9 = r6.f14498a
            s3.u r12 = com.google.android.exoplayer2.p052ui.C4047p.C4049b.f14492e
            java.util.Collections.sort(r9, r12)
            java.util.ArrayList r6 = r6.f14498a
            java.util.Iterator r6 = r6.iterator()
        L_0x0593:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x05a5
            java.lang.Object r9 = r6.next()
            com.google.android.exoplayer2.ui.p$b r9 = (com.google.android.exoplayer2.p052ui.C4047p.C4049b) r9
            java.lang.String r9 = r9.f14496c
            r0.append(r9)
            goto L_0x0593
        L_0x05a5:
            int r1 = r1 + 1
            r6 = r7
            goto L_0x054c
        L_0x05a9:
            int r1 = r3.length()
            java.lang.CharSequence r1 = r3.subSequence(r6, r1)
            java.lang.String r1 = com.google.android.exoplayer2.p052ui.C4047p.m10919a(r1)
            r0.append(r1)
            com.google.android.exoplayer2.ui.p$a r3 = new com.google.android.exoplayer2.ui.p$a
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r8)
        L_0x05c1:
            java.util.Set r0 = r2.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x05c9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x05f5
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r6 = r2.get(r1)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r2.put(r1, r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x05f0
            java.lang.Object r1 = r2.get(r1)
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x05ee
            goto L_0x05f0
        L_0x05ee:
            r1 = 0
            goto L_0x05f1
        L_0x05f0:
            r1 = 1
        L_0x05f1:
            p583jk.C17875h.m44304o(r1)
            goto L_0x05c9
        L_0x05f5:
            r0 = 14
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r6 = 0
            r0[r6] = r1
            r1 = 1
            r0[r1] = r22
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            r6 = 2
            r0[r6] = r1
            r1 = 3
            r0[r1] = r23
            r1 = 4
            r0[r1] = r5
            r1 = 5
            r0[r1] = r39
            r1 = 6
            r0[r1] = r38
            r1 = 7
            r0[r1] = r36
            r1 = 8
            r0[r1] = r35
            r1 = 9
            r0[r1] = r30
            r1 = 10
            r0[r1] = r29
            r1 = 11
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)
            r0[r1] = r5
            r1 = 12
            java.lang.Integer r5 = java.lang.Integer.valueOf(r18)
            r0[r1] = r5
            r1 = 13
            r8 = r26
            float r5 = r8.f17605q
            int r6 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r6 == 0) goto L_0x065f
            int r6 = r8.f17604p
            r7 = 2
            r9 = 1
            if (r6 == r7) goto L_0x064b
            if (r6 != r9) goto L_0x0648
            goto L_0x064b
        L_0x0648:
            java.lang.String r6 = "skewX"
            goto L_0x064d
        L_0x064b:
            java.lang.String r6 = "skewY"
        L_0x064d:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r11 = 0
            r7[r11] = r6
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r7[r9] = r5
            java.lang.String r5 = "%s(%.2fdeg)"
            java.lang.String r5 = p277ub.C6774a0.m15950j(r5, r7)
            goto L_0x0662
        L_0x065f:
            r9 = 1
            r5 = r27
        L_0x0662:
            r0[r1] = r5
            java.lang.String r1 = "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>"
            java.lang.String r0 = p277ub.C6774a0.m15950j(r1, r0)
            r1 = r25
            r1.append(r0)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r5 = 0
            r0[r5] = r24
            java.lang.String r5 = "<span class='%s'>"
            java.lang.String r0 = p277ub.C6774a0.m15950j(r5, r0)
            r1.append(r0)
            android.text.Layout$Alignment r0 = r8.f17591c
            if (r0 == 0) goto L_0x06af
            java.lang.Object[] r5 = new java.lang.Object[r9]
            int[] r6 = com.google.android.exoplayer2.p052ui.WebViewSubtitleOutput.C4026b.f14443a
            int r0 = r0.ordinal()
            r0 = r6[r0]
            r6 = 2
            if (r0 == r9) goto L_0x0696
            if (r0 == r6) goto L_0x0693
            r14 = r19
            goto L_0x0698
        L_0x0693:
            r14 = r20
            goto L_0x0698
        L_0x0696:
            r14 = r21
        L_0x0698:
            r0 = 0
            r5[r0] = r14
            java.lang.String r0 = "<span style='display:inline-block; text-align:%s;'>"
            java.lang.String r0 = p277ub.C6774a0.m15950j(r0, r5)
            r1.append(r0)
            java.lang.String r0 = r3.f14490a
            r1.append(r0)
            r0 = r28
            r1.append(r0)
            goto L_0x06b6
        L_0x06af:
            r0 = r28
            java.lang.String r3 = r3.f14490a
            r1.append(r3)
        L_0x06b6:
            r1.append(r0)
            java.lang.String r0 = "</div>"
            r1.append(r0)
            int r4 = r4 + 1
            r5 = 0
            r6 = 1
            r7 = 2
            r0 = r41
            r3 = r24
            r9 = r31
            goto L_0x00ab
        L_0x06cb:
            java.lang.String r0 = "</div></body></html>"
            r1.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "<html><head><style>"
            r0.append(r3)
            java.util.Set r3 = r2.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x06e2:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0707
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r5 = "{"
            r0.append(r5)
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r4 = "}"
            r0.append(r4)
            goto L_0x06e2
        L_0x0707:
            java.lang.String r2 = "</style></head>"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 0
            r1.insert(r2, r0)
            r0 = r41
            com.google.android.exoplayer2.ui.WebViewSubtitleOutput$a r2 = r0.f14437c
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r3 = p624ld.C18187b.f46429c
            byte[] r1 = r1.getBytes(r3)
            r3 = 1
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r3)
            java.lang.String r3 = "text/html"
            java.lang.String r4 = "base64"
            r2.loadData(r1, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p052ui.WebViewSubtitleOutput.mo16655c():void");
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && !this.f14438d.isEmpty()) {
            mo16655c();
        }
    }
}
