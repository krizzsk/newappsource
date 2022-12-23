package com.google.android.exoplayer2.p052ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.exoplayer2.p052ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p126ib.C5332a;

/* renamed from: com.google.android.exoplayer2.ui.CanvasSubtitleOutput */
final class CanvasSubtitleOutput extends View implements SubtitleView.C4022a {

    /* renamed from: b */
    public final ArrayList f14155b;

    /* renamed from: c */
    public List<C5332a> f14156c;

    /* renamed from: d */
    public int f14157d;

    /* renamed from: e */
    public float f14158e;

    /* renamed from: f */
    public C4027a f14159f;

    /* renamed from: g */
    public float f14160g;

    public CanvasSubtitleOutput() {
        throw null;
    }

    public CanvasSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14155b = new ArrayList();
        this.f14156c = Collections.emptyList();
        this.f14157d = 0;
        this.f14158e = 0.0533f;
        this.f14159f = C4027a.f14444g;
        this.f14160g = 0.08f;
    }

    /* renamed from: a */
    public final void mo16350a(List<C5332a> list, C4027a aVar, float f, int i, float f2) {
        this.f14156c = list;
        this.f14159f = aVar;
        this.f14158e = f;
        this.f14157d = i;
        this.f14160g = f2;
        while (this.f14155b.size() < list.size()) {
            this.f14155b.add(new C4028a0(getContext()));
        }
        invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:170:0x043f, code lost:
        if (r8 < r9) goto L_0x0450;
     */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0500  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0502  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispatchDraw(android.graphics.Canvas r45) {
        /*
            r44 = this;
            r0 = r44
            java.util.List<ib.a> r1 = r0.f14156c
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            int r2 = r44.getHeight()
            int r3 = r44.getPaddingLeft()
            int r4 = r44.getPaddingTop()
            int r5 = r44.getWidth()
            int r6 = r44.getPaddingRight()
            int r5 = r5 - r6
            int r6 = r44.getPaddingBottom()
            int r6 = r2 - r6
            if (r6 <= r4) goto L_0x0534
            if (r5 > r3) goto L_0x002c
            goto L_0x0534
        L_0x002c:
            int r7 = r6 - r4
            int r8 = r0.f14157d
            float r9 = r0.f14158e
            float r8 = com.google.android.exoplayer2.p052ui.C4030b0.m10909b(r8, r9, r2, r7)
            r9 = 0
            int r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r10 > 0) goto L_0x003c
            return
        L_0x003c:
            int r10 = r1.size()
            r13 = r45
            r12 = 0
        L_0x0043:
            if (r12 >= r10) goto L_0x0534
            java.lang.Object r14 = r1.get(r12)
            ib.a r14 = (p126ib.C5332a) r14
            int r15 = r14.f17604p
            r16 = 1065353216(0x3f800000, float:1.0)
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 == r11) goto L_0x00cb
            java.lang.CharSequence r15 = r14.f17589a
            android.graphics.Bitmap r11 = r14.f17592d
            android.text.Layout$Alignment r9 = r14.f17591c
            r35 = r1
            int r1 = r14.f17595g
            r17 = r1
            int r1 = r14.f17602n
            r36 = r10
            float r10 = r14.f17603o
            r37 = r13
            float r13 = r14.f17598j
            r38 = r6
            float r6 = r14.f17599k
            r39 = r5
            boolean r5 = r14.f17600l
            r40 = r4
            int r4 = r14.f17601m
            r41 = r3
            int r3 = r14.f17604p
            r42 = r8
            float r8 = r14.f17605q
            r25 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r19 = 0
            r43 = r12
            int r12 = r14.f17594f
            if (r12 != 0) goto L_0x0091
            float r12 = r14.f17593e
            float r12 = r16 - r12
            r22 = r12
            r23 = 0
            goto L_0x009a
        L_0x0091:
            float r12 = r14.f17593e
            float r12 = -r12
            float r12 = r12 - r16
            r22 = r12
            r23 = 1
        L_0x009a:
            int r12 = r14.f17595g
            if (r12 == 0) goto L_0x00a7
            r14 = 2
            if (r12 == r14) goto L_0x00a4
            r24 = r17
            goto L_0x00a9
        L_0x00a4:
            r24 = 0
            goto L_0x00a9
        L_0x00a7:
            r24 = 2
        L_0x00a9:
            ib.a r14 = new ib.a
            r17 = r14
            r18 = r15
            r20 = r9
            r21 = r11
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r26 = r9
            r27 = r1
            r28 = r10
            r29 = r13
            r30 = r6
            r31 = r5
            r32 = r4
            r33 = r3
            r34 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x00dd
        L_0x00cb:
            r35 = r1
            r41 = r3
            r40 = r4
            r39 = r5
            r38 = r6
            r42 = r8
            r36 = r10
            r43 = r12
            r37 = r13
        L_0x00dd:
            int r1 = r14.f17602n
            float r3 = r14.f17603o
            float r1 = com.google.android.exoplayer2.p052ui.C4030b0.m10909b(r1, r3, r2, r7)
            java.util.ArrayList r3 = r0.f14155b
            r11 = r43
            java.lang.Object r3 = r3.get(r11)
            com.google.android.exoplayer2.ui.a0 r3 = (com.google.android.exoplayer2.p052ui.C4028a0) r3
            com.google.android.exoplayer2.ui.a r4 = r0.f14159f
            float r5 = r0.f14160g
            r3.getClass()
            android.graphics.Bitmap r6 = r14.f17592d
            if (r6 != 0) goto L_0x00fc
            r6 = 1
            goto L_0x00fd
        L_0x00fc:
            r6 = 0
        L_0x00fd:
            if (r6 == 0) goto L_0x011d
            java.lang.CharSequence r8 = r14.f17589a
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L_0x0113
            r9 = r37
            r15 = r38
            r13 = r39
            r12 = r40
            r10 = r41
            goto L_0x01e6
        L_0x0113:
            boolean r8 = r14.f17600l
            if (r8 == 0) goto L_0x011a
            int r8 = r14.f17601m
            goto L_0x011f
        L_0x011a:
            int r8 = r4.f14447c
            goto L_0x011f
        L_0x011d:
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x011f:
            java.lang.CharSequence r9 = r3.f14469i
            java.lang.CharSequence r10 = r14.f17589a
            if (r9 == r10) goto L_0x0130
            if (r9 == 0) goto L_0x012e
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x012e
            goto L_0x0130
        L_0x012e:
            r9 = 0
            goto L_0x0131
        L_0x0130:
            r9 = 1
        L_0x0131:
            if (r9 == 0) goto L_0x020f
            android.text.Layout$Alignment r9 = r3.f14470j
            android.text.Layout$Alignment r10 = r14.f17590b
            boolean r9 = p277ub.C6774a0.m15941a(r9, r10)
            if (r9 == 0) goto L_0x020f
            android.graphics.Bitmap r9 = r3.f14471k
            android.graphics.Bitmap r10 = r14.f17592d
            if (r9 != r10) goto L_0x020f
            float r9 = r3.f14472l
            float r10 = r14.f17593e
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x020f
            int r9 = r3.f14473m
            int r10 = r14.f17594f
            if (r9 != r10) goto L_0x020f
            int r9 = r3.f14474n
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r10 = r14.f17595g
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            boolean r9 = p277ub.C6774a0.m15941a(r9, r10)
            if (r9 == 0) goto L_0x020f
            float r9 = r3.f14475o
            float r10 = r14.f17596h
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x020f
            int r9 = r3.f14476p
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r10 = r14.f17597i
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            boolean r9 = p277ub.C6774a0.m15941a(r9, r10)
            if (r9 == 0) goto L_0x020f
            float r9 = r3.f14477q
            float r10 = r14.f17598j
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x020f
            float r9 = r3.f14478r
            float r10 = r14.f17599k
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x020f
            int r9 = r3.f14479s
            int r10 = r4.f14445a
            if (r9 != r10) goto L_0x020f
            int r9 = r3.f14480t
            int r10 = r4.f14446b
            if (r9 != r10) goto L_0x020f
            int r9 = r3.f14481u
            if (r9 != r8) goto L_0x020f
            int r9 = r3.f14483w
            int r10 = r4.f14448d
            if (r9 != r10) goto L_0x020f
            int r9 = r3.f14482v
            int r10 = r4.f14449e
            if (r9 != r10) goto L_0x020f
            android.text.TextPaint r9 = r3.f14466f
            android.graphics.Typeface r9 = r9.getTypeface()
            android.graphics.Typeface r10 = r4.f14450f
            boolean r9 = p277ub.C6774a0.m15941a(r9, r10)
            if (r9 == 0) goto L_0x020f
            float r9 = r3.f14484x
            int r9 = (r9 > r42 ? 1 : (r9 == r42 ? 0 : -1))
            if (r9 != 0) goto L_0x020f
            float r9 = r3.f14485y
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 != 0) goto L_0x020f
            float r9 = r3.f14486z
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x020f
            int r9 = r3.f14451A
            r10 = r41
            if (r9 != r10) goto L_0x0206
            int r9 = r3.f14452B
            r12 = r40
            if (r9 != r12) goto L_0x01ff
            int r9 = r3.f14453C
            r13 = r39
            if (r9 != r13) goto L_0x01fa
            int r9 = r3.f14454D
            r15 = r38
            if (r9 != r15) goto L_0x01f7
            r9 = r37
            r3.mo16659a(r9, r6)
        L_0x01e6:
            r26 = r2
            r27 = r7
            r41 = r10
            r43 = r11
            r40 = r12
            r39 = r13
            r10 = 0
            r12 = 0
            r13 = r9
            goto L_0x051b
        L_0x01f7:
            r9 = r37
            goto L_0x0219
        L_0x01fa:
            r9 = r37
            r15 = r38
            goto L_0x0219
        L_0x01ff:
            r9 = r37
            r15 = r38
            r13 = r39
            goto L_0x0219
        L_0x0206:
            r9 = r37
            r15 = r38
            r13 = r39
            r12 = r40
            goto L_0x0219
        L_0x020f:
            r9 = r37
            r15 = r38
            r13 = r39
            r12 = r40
            r10 = r41
        L_0x0219:
            java.lang.CharSequence r0 = r14.f17589a
            r3.f14469i = r0
            android.text.Layout$Alignment r0 = r14.f17590b
            r3.f14470j = r0
            android.graphics.Bitmap r0 = r14.f17592d
            r3.f14471k = r0
            float r0 = r14.f17593e
            r3.f14472l = r0
            int r0 = r14.f17594f
            r3.f14473m = r0
            int r0 = r14.f17595g
            r3.f14474n = r0
            float r0 = r14.f17596h
            r3.f14475o = r0
            int r0 = r14.f17597i
            r3.f14476p = r0
            float r0 = r14.f17598j
            r3.f14477q = r0
            float r0 = r14.f17599k
            r3.f14478r = r0
            int r0 = r4.f14445a
            r3.f14479s = r0
            int r0 = r4.f14446b
            r3.f14480t = r0
            r3.f14481u = r8
            int r0 = r4.f14448d
            r3.f14483w = r0
            int r0 = r4.f14449e
            r3.f14482v = r0
            android.text.TextPaint r0 = r3.f14466f
            android.graphics.Typeface r4 = r4.f14450f
            r0.setTypeface(r4)
            r0 = r42
            r3.f14484x = r0
            r3.f14485y = r1
            r3.f14486z = r5
            r3.f14451A = r10
            r3.f14452B = r12
            r3.f14453C = r13
            r3.f14454D = r15
            if (r6 == 0) goto L_0x0490
            java.lang.CharSequence r4 = r3.f14469i
            r4.getClass()
            java.lang.CharSequence r4 = r3.f14469i
            boolean r5 = r4 instanceof android.text.SpannableStringBuilder
            if (r5 == 0) goto L_0x027a
            android.text.SpannableStringBuilder r4 = (android.text.SpannableStringBuilder) r4
            goto L_0x0281
        L_0x027a:
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r5 = r3.f14469i
            r4.<init>(r5)
        L_0x0281:
            int r5 = r3.f14453C
            int r8 = r3.f14451A
            int r5 = r5 - r8
            int r8 = r3.f14454D
            int r14 = r3.f14452B
            int r8 = r8 - r14
            android.text.TextPaint r14 = r3.f14466f
            float r1 = r3.f14484x
            r14.setTextSize(r1)
            float r1 = r3.f14484x
            r14 = 1040187392(0x3e000000, float:0.125)
            float r1 = r1 * r14
            r14 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r14
            int r1 = (int) r1
            int r14 = r1 * 2
            r42 = r0
            int r0 = r5 - r14
            r26 = r2
            float r2 = r3.f14477q
            r17 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r18 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r18 == 0) goto L_0x02b1
            float r0 = (float) r0
            float r0 = r0 * r2
            int r0 = (int) r0
        L_0x02b1:
            if (r0 > 0) goto L_0x02c2
            r27 = r7
            r41 = r10
            r43 = r11
            r40 = r12
            r39 = r13
            r10 = 0
            r12 = 0
            r13 = r9
            goto L_0x0518
        L_0x02c2:
            float r2 = r3.f14485y
            r17 = 0
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r2 <= 0) goto L_0x02e1
            android.text.style.AbsoluteSizeSpan r2 = new android.text.style.AbsoluteSizeSpan
            float r9 = r3.f14485y
            int r9 = (int) r9
            r2.<init>(r9)
            int r9 = r4.length()
            r27 = r7
            r41 = r10
            r7 = 16711680(0xff0000, float:2.3418052E-38)
            r10 = 0
            r4.setSpan(r2, r10, r9, r7)
            goto L_0x02e6
        L_0x02e1:
            r27 = r7
            r41 = r10
            r10 = 0
        L_0x02e6:
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>(r4)
            int r7 = r3.f14483w
            r9 = 1
            if (r7 != r9) goto L_0x030c
            int r7 = r2.length()
            java.lang.Class<android.text.style.ForegroundColorSpan> r9 = android.text.style.ForegroundColorSpan.class
            java.lang.Object[] r7 = r2.getSpans(r10, r7, r9)
            android.text.style.ForegroundColorSpan[] r7 = (android.text.style.ForegroundColorSpan[]) r7
            int r9 = r7.length
            r10 = 0
        L_0x02fe:
            if (r10 >= r9) goto L_0x030c
            r18 = r9
            r9 = r7[r10]
            r2.removeSpan(r9)
            int r10 = r10 + 1
            r9 = r18
            goto L_0x02fe
        L_0x030c:
            int r7 = r3.f14480t
            int r7 = android.graphics.Color.alpha(r7)
            if (r7 <= 0) goto L_0x0344
            int r7 = r3.f14483w
            if (r7 == 0) goto L_0x0330
            r9 = 2
            if (r7 != r9) goto L_0x031c
            goto L_0x0330
        L_0x031c:
            android.text.style.BackgroundColorSpan r7 = new android.text.style.BackgroundColorSpan
            int r9 = r3.f14480t
            r7.<init>(r9)
            int r9 = r2.length()
            r40 = r12
            r10 = 16711680(0xff0000, float:2.3418052E-38)
            r12 = 0
            r2.setSpan(r7, r12, r9, r10)
            goto L_0x0346
        L_0x0330:
            r40 = r12
            r10 = 16711680(0xff0000, float:2.3418052E-38)
            r12 = 0
            android.text.style.BackgroundColorSpan r7 = new android.text.style.BackgroundColorSpan
            int r9 = r3.f14480t
            r7.<init>(r9)
            int r9 = r4.length()
            r4.setSpan(r7, r12, r9, r10)
            goto L_0x0346
        L_0x0344:
            r40 = r12
        L_0x0346:
            android.text.Layout$Alignment r7 = r3.f14470j
            if (r7 != 0) goto L_0x034c
            android.text.Layout$Alignment r7 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x034c:
            android.text.StaticLayout r9 = new android.text.StaticLayout
            android.text.TextPaint r10 = r3.f14466f
            float r12 = r3.f14464d
            r39 = r13
            float r13 = r3.f14465e
            r24 = 1
            r17 = r9
            r18 = r4
            r19 = r10
            r20 = r0
            r21 = r7
            r22 = r12
            r23 = r13
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r3.f14455E = r9
            int r9 = r9.getHeight()
            android.text.StaticLayout r10 = r3.f14455E
            int r10 = r10.getLineCount()
            r12 = 0
            r13 = 0
        L_0x0377:
            if (r12 >= r10) goto L_0x0394
            r17 = r10
            android.text.StaticLayout r10 = r3.f14455E
            float r10 = r10.getLineWidth(r12)
            r43 = r11
            double r10 = (double) r10
            double r10 = java.lang.Math.ceil(r10)
            int r10 = (int) r10
            int r13 = java.lang.Math.max(r10, r13)
            int r12 = r12 + 1
            r10 = r17
            r11 = r43
            goto L_0x0377
        L_0x0394:
            r43 = r11
            float r10 = r3.f14477q
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x03a2
            if (r13 >= r0) goto L_0x03a2
            goto L_0x03a3
        L_0x03a2:
            r0 = r13
        L_0x03a3:
            int r0 = r0 + r14
            float r10 = r3.f14475o
            int r12 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r12 == 0) goto L_0x03d0
            float r5 = (float) r5
            float r5 = r5 * r10
            int r5 = java.lang.Math.round(r5)
            int r10 = r3.f14451A
            int r5 = r5 + r10
            int r11 = r3.f14476p
            r12 = 1
            if (r11 == r12) goto L_0x03bf
            r12 = 2
            if (r11 == r12) goto L_0x03bd
            goto L_0x03c4
        L_0x03bd:
            int r5 = r5 - r0
            goto L_0x03c4
        L_0x03bf:
            r12 = 2
            int r5 = r5 * 2
            int r5 = r5 - r0
            int r5 = r5 / r12
        L_0x03c4:
            int r5 = java.lang.Math.max(r5, r10)
            int r0 = r0 + r5
            int r10 = r3.f14453C
            int r0 = java.lang.Math.min(r0, r10)
            goto L_0x03d7
        L_0x03d0:
            r12 = 2
            int r5 = r5 - r0
            int r5 = r5 / r12
            int r10 = r3.f14451A
            int r5 = r5 + r10
            int r0 = r0 + r5
        L_0x03d7:
            int r0 = r0 - r5
            if (r0 > 0) goto L_0x03de
            r10 = 0
            r12 = 0
            goto L_0x0516
        L_0x03de:
            float r10 = r3.f14472l
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x0442
            int r11 = r3.f14473m
            if (r11 != 0) goto L_0x0407
            float r8 = (float) r8
            float r8 = r8 * r10
            int r8 = java.lang.Math.round(r8)
            int r10 = r3.f14452B
            int r8 = r8 + r10
            int r10 = r3.f14474n
            r11 = 2
            if (r10 != r11) goto L_0x03fd
            r10 = 0
            r12 = 0
            goto L_0x0433
        L_0x03fd:
            r12 = 1
            if (r10 != r12) goto L_0x0404
            int r8 = r8 * 2
            int r8 = r8 - r9
            int r8 = r8 / r11
        L_0x0404:
            r10 = 0
            r12 = 0
            goto L_0x0434
        L_0x0407:
            android.text.StaticLayout r8 = r3.f14455E
            r10 = 0
            int r8 = r8.getLineBottom(r10)
            android.text.StaticLayout r11 = r3.f14455E
            int r11 = r11.getLineTop(r10)
            int r8 = r8 - r11
            float r11 = r3.f14472l
            r12 = 0
            int r13 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r13 < 0) goto L_0x0427
            float r8 = (float) r8
            float r11 = r11 * r8
            int r8 = java.lang.Math.round(r11)
            int r11 = r3.f14452B
            int r8 = r8 + r11
            goto L_0x0434
        L_0x0427:
            float r11 = r11 + r16
            float r8 = (float) r8
            float r11 = r11 * r8
            int r8 = java.lang.Math.round(r11)
            int r11 = r3.f14454D
            int r8 = r8 + r11
        L_0x0433:
            int r8 = r8 - r9
        L_0x0434:
            int r11 = r8 + r9
            int r13 = r3.f14454D
            if (r11 <= r13) goto L_0x043d
            int r8 = r13 - r9
            goto L_0x044f
        L_0x043d:
            int r9 = r3.f14452B
            if (r8 >= r9) goto L_0x044f
            goto L_0x0450
        L_0x0442:
            r10 = 0
            r12 = 0
            int r11 = r3.f14454D
            int r11 = r11 - r9
            float r8 = (float) r8
            float r9 = r3.f14486z
            float r8 = r8 * r9
            int r8 = (int) r8
            int r8 = r11 - r8
        L_0x044f:
            r9 = r8
        L_0x0450:
            android.text.StaticLayout r8 = new android.text.StaticLayout
            android.text.TextPaint r11 = r3.f14466f
            float r13 = r3.f14464d
            float r14 = r3.f14465e
            r16 = 1
            r24 = 1
            r17 = r8
            r18 = r4
            r19 = r11
            r20 = r0
            r21 = r7
            r22 = r13
            r23 = r14
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r3.f14455E = r8
            android.text.StaticLayout r4 = new android.text.StaticLayout
            android.text.TextPaint r8 = r3.f14466f
            float r11 = r3.f14464d
            float r13 = r3.f14465e
            r17 = r4
            r18 = r2
            r19 = r8
            r22 = r11
            r23 = r13
            r24 = r16
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r3.f14456F = r4
            r3.f14457G = r5
            r3.f14458H = r9
            r3.f14459I = r1
            goto L_0x0516
        L_0x0490:
            r42 = r0
            r26 = r2
            r27 = r7
            r41 = r10
            r43 = r11
            r40 = r12
            r39 = r13
            r10 = 0
            r12 = 0
            android.graphics.Bitmap r0 = r3.f14471k
            r0.getClass()
            android.graphics.Bitmap r0 = r3.f14471k
            int r1 = r3.f14453C
            int r2 = r3.f14451A
            int r1 = r1 - r2
            int r4 = r3.f14454D
            int r5 = r3.f14452B
            int r4 = r4 - r5
            float r2 = (float) r2
            float r1 = (float) r1
            float r7 = r3.f14475o
            float r7 = r7 * r1
            float r7 = r7 + r2
            float r2 = (float) r5
            float r4 = (float) r4
            float r5 = r3.f14472l
            float r5 = r5 * r4
            float r5 = r5 + r2
            float r2 = r3.f14477q
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            float r2 = r3.f14478r
            r8 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x04d7
            float r4 = r4 * r2
            int r0 = java.lang.Math.round(r4)
            goto L_0x04e9
        L_0x04d7:
            float r2 = (float) r1
            int r4 = r0.getHeight()
            float r4 = (float) r4
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r4 = r4 / r0
            float r4 = r4 * r2
            int r0 = java.lang.Math.round(r4)
        L_0x04e9:
            int r2 = r3.f14476p
            r4 = 2
            if (r2 != r4) goto L_0x04f0
            float r2 = (float) r1
            goto L_0x04f6
        L_0x04f0:
            r4 = 1
            if (r2 != r4) goto L_0x04f7
            int r2 = r1 / 2
            float r2 = (float) r2
        L_0x04f6:
            float r7 = r7 - r2
        L_0x04f7:
            int r2 = java.lang.Math.round(r7)
            int r4 = r3.f14474n
            r7 = 2
            if (r4 != r7) goto L_0x0502
            float r4 = (float) r0
            goto L_0x0508
        L_0x0502:
            r7 = 1
            if (r4 != r7) goto L_0x0509
            int r4 = r0 / 2
            float r4 = (float) r4
        L_0x0508:
            float r5 = r5 - r4
        L_0x0509:
            int r4 = java.lang.Math.round(r5)
            android.graphics.Rect r5 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r4
            r5.<init>(r2, r4, r1, r0)
            r3.f14460J = r5
        L_0x0516:
            r13 = r45
        L_0x0518:
            r3.mo16659a(r13, r6)
        L_0x051b:
            int r0 = r43 + 1
            r12 = r0
            r6 = r15
            r2 = r26
            r7 = r27
            r1 = r35
            r10 = r36
            r5 = r39
            r4 = r40
            r3 = r41
            r8 = r42
            r9 = 0
            r0 = r44
            goto L_0x0043
        L_0x0534:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p052ui.CanvasSubtitleOutput.dispatchDraw(android.graphics.Canvas):void");
    }
}
