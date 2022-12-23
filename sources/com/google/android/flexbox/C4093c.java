package com.google.android.flexbox;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p242s1.C6362h;

/* renamed from: com.google.android.flexbox.c */
public final class C4093c {

    /* renamed from: a */
    public final C4091a f14777a;

    /* renamed from: b */
    public boolean[] f14778b;

    /* renamed from: c */
    public int[] f14779c;

    /* renamed from: d */
    public long[] f14780d;

    /* renamed from: e */
    public long[] f14781e;

    /* renamed from: com.google.android.flexbox.c$a */
    public static class C4094a {

        /* renamed from: a */
        public List<C4092b> f14782a;

        /* renamed from: b */
        public int f14783b;
    }

    /* renamed from: com.google.android.flexbox.c$b */
    public static class C4095b implements Comparable<C4095b> {

        /* renamed from: b */
        public int f14784b;

        /* renamed from: c */
        public int f14785c;

        public final int compareTo(Object obj) {
            C4095b bVar = (C4095b) obj;
            int i = this.f14785c;
            int i2 = bVar.f14785c;
            if (i != i2) {
                return i - i2;
            }
            return this.f14784b - bVar.f14784b;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("Order{order=");
            k.append(this.f14785c);
            k.append(", index=");
            return C16530d.m42014g(k, this.f14784b, '}');
        }
    }

    public C4093c(C4091a aVar) {
        this.f14777a = aVar;
    }

    /* renamed from: e */
    public static ArrayList m11048e(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        C4092b bVar = new C4092b();
        bVar.f14765g = (i - i2) / 2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 == 0) {
                arrayList.add(bVar);
            }
            arrayList.add((C4092b) list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* renamed from: r */
    public static int[] m11049r(int i, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C4095b bVar = (C4095b) it.next();
            int i3 = bVar.f14784b;
            iArr[i2] = i3;
            sparseIntArray.append(i3, bVar.f14785c);
            i2++;
        }
        return iArr;
    }

    /* renamed from: a */
    public final void mo16866a(List<C4092b> list, C4092b bVar, int i, int i2) {
        bVar.f14771m = i2;
        this.f14777a.mo16774f(bVar);
        bVar.f14774p = i;
        list.add(bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x024c, code lost:
        if (r2 < (r8 + r14)) goto L_0x024e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0408 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a1  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16867b(com.google.android.flexbox.C4093c.C4094a r28, int r29, int r30, int r31, int r32, int r33, java.util.List<com.google.android.flexbox.C4092b> r34) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r33
            com.google.android.flexbox.a r5 = r0.f14777a
            boolean r5 = r5.mo16795j()
            int r6 = android.view.View.MeasureSpec.getMode(r29)
            int r7 = android.view.View.MeasureSpec.getSize(r29)
            if (r34 != 0) goto L_0x0020
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            goto L_0x0022
        L_0x0020:
            r8 = r34
        L_0x0022:
            r1.f14782a = r8
            r9 = -1
            if (r4 != r9) goto L_0x0029
            r12 = 1
            goto L_0x002a
        L_0x0029:
            r12 = 0
        L_0x002a:
            if (r5 == 0) goto L_0x0033
            com.google.android.flexbox.a r13 = r0.f14777a
            int r13 = r13.getPaddingStart()
            goto L_0x0039
        L_0x0033:
            com.google.android.flexbox.a r13 = r0.f14777a
            int r13 = r13.getPaddingTop()
        L_0x0039:
            if (r5 == 0) goto L_0x0042
            com.google.android.flexbox.a r14 = r0.f14777a
            int r14 = r14.getPaddingEnd()
            goto L_0x0048
        L_0x0042:
            com.google.android.flexbox.a r14 = r0.f14777a
            int r14 = r14.getPaddingBottom()
        L_0x0048:
            if (r5 == 0) goto L_0x0051
            com.google.android.flexbox.a r15 = r0.f14777a
            int r15 = r15.getPaddingTop()
            goto L_0x0057
        L_0x0051:
            com.google.android.flexbox.a r15 = r0.f14777a
            int r15 = r15.getPaddingStart()
        L_0x0057:
            if (r5 == 0) goto L_0x0060
            com.google.android.flexbox.a r11 = r0.f14777a
            int r11 = r11.getPaddingBottom()
            goto L_0x0066
        L_0x0060:
            com.google.android.flexbox.a r11 = r0.f14777a
            int r11 = r11.getPaddingEnd()
        L_0x0066:
            com.google.android.flexbox.b r9 = new com.google.android.flexbox.b
            r9.<init>()
            r10 = r32
            r9.f14773o = r10
            int r13 = r13 + r14
            r9.f14763e = r13
            com.google.android.flexbox.a r14 = r0.f14777a
            int r14 = r14.getFlexItemCount()
            r17 = -2147483648(0xffffffff80000000, float:-0.0)
            r32 = r12
            r1 = 0
            r4 = 0
            r12 = 0
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0081:
            if (r10 >= r14) goto L_0x0428
            r19 = r12
            com.google.android.flexbox.a r12 = r0.f14777a
            android.view.View r12 = r12.mo16775g(r10)
            if (r12 != 0) goto L_0x00a5
            int r12 = r14 + -1
            if (r10 != r12) goto L_0x009c
            int r12 = r9.f14766h
            r20 = r1
            int r1 = r9.f14767i
            int r12 = r12 - r1
            if (r12 == 0) goto L_0x009e
            r1 = 1
            goto L_0x009f
        L_0x009c:
            r20 = r1
        L_0x009e:
            r1 = 0
        L_0x009f:
            if (r1 == 0) goto L_0x00c9
            r0.mo16866a(r8, r9, r10, r4)
            goto L_0x00c9
        L_0x00a5:
            r20 = r1
            int r1 = r12.getVisibility()
            r3 = 8
            if (r1 != r3) goto L_0x00de
            int r1 = r9.f14767i
            r3 = 1
            int r1 = r1 + r3
            r9.f14767i = r1
            int r12 = r9.f14766h
            int r12 = r12 + r3
            r9.f14766h = r12
            int r3 = r14 + -1
            if (r10 != r3) goto L_0x00c3
            int r12 = r12 - r1
            if (r12 == 0) goto L_0x00c3
            r1 = 1
            goto L_0x00c4
        L_0x00c3:
            r1 = 0
        L_0x00c4:
            if (r1 == 0) goto L_0x00c9
            r0.mo16866a(r8, r9, r10, r4)
        L_0x00c9:
            r1 = r33
            r24 = r6
            r2 = r7
            r26 = r11
            r21 = r14
            r25 = r20
            r12 = -1
            r6 = r30
            r14 = r31
            r11 = r8
            r8 = r32
            goto L_0x0413
        L_0x00de:
            boolean r1 = r12 instanceof android.widget.CompoundButton
            if (r1 == 0) goto L_0x0120
            r1 = r12
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            com.google.android.flexbox.FlexItem r3 = (com.google.android.flexbox.FlexItem) r3
            r21 = r14
            int r14 = r3.mo16754f0()
            r22 = r8
            int r8 = r3.mo16751T1()
            android.graphics.drawable.Drawable r1 = androidx.core.widget.C0786c.m2389a(r1)
            if (r1 != 0) goto L_0x0100
            r23 = 0
            goto L_0x0104
        L_0x0100:
            int r23 = r1.getMinimumWidth()
        L_0x0104:
            if (r1 != 0) goto L_0x010a
            r1 = -1
            r24 = 0
            goto L_0x0111
        L_0x010a:
            int r1 = r1.getMinimumHeight()
            r24 = r1
            r1 = -1
        L_0x0111:
            if (r14 != r1) goto L_0x0115
            r14 = r23
        L_0x0115:
            r3.setMinWidth(r14)
            if (r8 != r1) goto L_0x011c
            r8 = r24
        L_0x011c:
            r3.mo16761n0(r8)
            goto L_0x0124
        L_0x0120:
            r22 = r8
            r21 = r14
        L_0x0124:
            android.view.ViewGroup$LayoutParams r1 = r12.getLayoutParams()
            com.google.android.flexbox.FlexItem r1 = (com.google.android.flexbox.FlexItem) r1
            int r3 = r1.mo16752b0()
            r8 = 4
            if (r3 != r8) goto L_0x013a
            java.util.ArrayList r3 = r9.f14772n
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r3.add(r8)
        L_0x013a:
            if (r5 == 0) goto L_0x0141
            int r3 = r1.getWidth()
            goto L_0x0145
        L_0x0141:
            int r3 = r1.getHeight()
        L_0x0145:
            float r8 = r1.mo16766w0()
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x015e
            r8 = 1073741824(0x40000000, float:2.0)
            if (r6 != r8) goto L_0x015e
            float r3 = (float) r7
            float r8 = r1.mo16766w0()
            float r3 = r3 * r8
            int r3 = java.lang.Math.round(r3)
        L_0x015e:
            if (r5 == 0) goto L_0x0197
            com.google.android.flexbox.a r8 = r0.f14777a
            int r14 = r1.mo16765v1()
            int r14 = r14 + r13
            int r23 = r1.mo16750Q1()
            int r14 = r23 + r14
            int r3 = r8.mo16769b(r2, r14, r3)
            com.google.android.flexbox.a r8 = r0.f14777a
            int r14 = r15 + r11
            int r23 = r1.mo16760m0()
            int r23 = r23 + r14
            int r14 = r1.mo16763s1()
            int r14 = r14 + r23
            int r14 = r14 + r4
            r23 = r7
            int r7 = r1.getHeight()
            r24 = r6
            r6 = r30
            int r7 = r8.mo16772d(r6, r14, r7)
            r12.measure(r3, r7)
            r0.mo16885v(r12, r10, r3, r7)
            goto L_0x01cb
        L_0x0197:
            r24 = r6
            r23 = r7
            r6 = r30
            com.google.android.flexbox.a r7 = r0.f14777a
            int r8 = r15 + r11
            int r14 = r1.mo16765v1()
            int r14 = r14 + r8
            int r8 = r1.mo16750Q1()
            int r8 = r8 + r14
            int r8 = r8 + r4
            int r14 = r1.getWidth()
            int r7 = r7.mo16769b(r6, r8, r14)
            com.google.android.flexbox.a r8 = r0.f14777a
            int r14 = r1.mo16760m0()
            int r14 = r14 + r13
            int r25 = r1.mo16763s1()
            int r14 = r25 + r14
            int r3 = r8.mo16772d(r2, r14, r3)
            r12.measure(r7, r3)
            r0.mo16885v(r12, r10, r7, r3)
        L_0x01cb:
            com.google.android.flexbox.a r7 = r0.f14777a
            r7.mo16793h(r10, r12)
            r0.mo16868c(r10, r12)
            int r7 = r12.getMeasuredState()
            r8 = r20
            int r7 = android.view.View.combineMeasuredStates(r8, r7)
            int r8 = r9.f14763e
            if (r5 == 0) goto L_0x01e6
            int r14 = r12.getMeasuredWidth()
            goto L_0x01ea
        L_0x01e6:
            int r14 = r12.getMeasuredHeight()
        L_0x01ea:
            if (r5 == 0) goto L_0x01f1
            int r20 = r1.mo16765v1()
            goto L_0x01f5
        L_0x01f1:
            int r20 = r1.mo16760m0()
        L_0x01f5:
            int r20 = r20 + r14
            if (r5 == 0) goto L_0x01fe
            int r14 = r1.mo16750Q1()
            goto L_0x0202
        L_0x01fe:
            int r14 = r1.mo16763s1()
        L_0x0202:
            int r14 = r14 + r20
            int r20 = r22.size()
            com.google.android.flexbox.a r2 = r0.f14777a
            int r2 = r2.getFlexWrap()
            if (r2 != 0) goto L_0x0211
            goto L_0x0222
        L_0x0211:
            boolean r2 = r1.mo16749G0()
            if (r2 == 0) goto L_0x0220
            r25 = r7
            r26 = r11
            r7 = r19
            r2 = r23
            goto L_0x024e
        L_0x0220:
            if (r24 != 0) goto L_0x0227
        L_0x0222:
            r25 = r7
            r26 = r11
            goto L_0x0239
        L_0x0227:
            com.google.android.flexbox.a r2 = r0.f14777a
            int r2 = r2.getMaxLine()
            r25 = r7
            r7 = -1
            r26 = r11
            if (r2 == r7) goto L_0x023e
            r7 = 1
            int r11 = r20 + 1
            if (r2 > r11) goto L_0x023e
        L_0x0239:
            r7 = r19
            r2 = r23
            goto L_0x0250
        L_0x023e:
            com.google.android.flexbox.a r2 = r0.f14777a
            r7 = r19
            int r2 = r2.mo16794i(r12, r10, r7)
            if (r2 <= 0) goto L_0x0249
            int r14 = r14 + r2
        L_0x0249:
            int r8 = r8 + r14
            r2 = r23
            if (r2 >= r8) goto L_0x0250
        L_0x024e:
            r8 = 1
            goto L_0x0251
        L_0x0250:
            r8 = 0
        L_0x0251:
            if (r8 == 0) goto L_0x02da
            int r7 = r9.f14766h
            int r8 = r9.f14767i
            int r7 = r7 - r8
            if (r7 <= 0) goto L_0x026b
            if (r10 <= 0) goto L_0x0261
            int r7 = r10 + -1
            r11 = r22
            goto L_0x0264
        L_0x0261:
            r11 = r22
            r7 = 0
        L_0x0264:
            r0.mo16866a(r11, r9, r7, r4)
            int r7 = r9.f14765g
            int r4 = r4 + r7
            goto L_0x026d
        L_0x026b:
            r11 = r22
        L_0x026d:
            if (r5 == 0) goto L_0x029d
            int r7 = r1.getHeight()
            r8 = -1
            if (r7 != r8) goto L_0x02ca
            com.google.android.flexbox.a r7 = r0.f14777a
            int r8 = r7.getPaddingTop()
            com.google.android.flexbox.a r9 = r0.f14777a
            int r9 = r9.getPaddingBottom()
            int r9 = r9 + r8
            int r8 = r1.mo16760m0()
            int r9 = r9 + r8
            int r8 = r1.mo16763s1()
            int r9 = r9 + r8
            int r9 = r9 + r4
            int r8 = r1.getHeight()
            int r7 = r7.mo16772d(r6, r9, r8)
            r12.measure(r3, r7)
            r0.mo16868c(r10, r12)
            goto L_0x02ca
        L_0x029d:
            int r7 = r1.getWidth()
            r8 = -1
            if (r7 != r8) goto L_0x02ca
            com.google.android.flexbox.a r7 = r0.f14777a
            int r8 = r7.getPaddingLeft()
            com.google.android.flexbox.a r9 = r0.f14777a
            int r9 = r9.getPaddingRight()
            int r9 = r9 + r8
            int r8 = r1.mo16765v1()
            int r9 = r9 + r8
            int r8 = r1.mo16750Q1()
            int r9 = r9 + r8
            int r9 = r9 + r4
            int r8 = r1.getWidth()
            int r7 = r7.mo16769b(r6, r9, r8)
            r12.measure(r7, r3)
            r0.mo16868c(r10, r12)
        L_0x02ca:
            com.google.android.flexbox.b r9 = new com.google.android.flexbox.b
            r9.<init>()
            r3 = 1
            r9.f14766h = r3
            r9.f14763e = r13
            r9.f14773o = r10
            r7 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x02e6
        L_0x02da:
            r11 = r22
            r3 = 1
            int r8 = r9.f14766h
            int r8 = r8 + r3
            r9.f14766h = r8
            int r7 = r7 + 1
            r8 = r18
        L_0x02e6:
            boolean r14 = r9.f14775q
            float r16 = r1.mo16762p0()
            r18 = 0
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 == 0) goto L_0x02f5
            r16 = 1
            goto L_0x02f7
        L_0x02f5:
            r16 = 0
        L_0x02f7:
            r14 = r14 | r16
            r9.f14775q = r14
            boolean r14 = r9.f14776r
            float r16 = r1.mo16753c0()
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 == 0) goto L_0x0308
            r16 = 1
            goto L_0x030a
        L_0x0308:
            r16 = 0
        L_0x030a:
            r14 = r14 | r16
            r9.f14776r = r14
            int[] r14 = r0.f14779c
            if (r14 == 0) goto L_0x0318
            int r16 = r11.size()
            r14[r10] = r16
        L_0x0318:
            int r14 = r9.f14763e
            if (r5 == 0) goto L_0x0321
            int r16 = r12.getMeasuredWidth()
            goto L_0x0325
        L_0x0321:
            int r16 = r12.getMeasuredHeight()
        L_0x0325:
            if (r5 == 0) goto L_0x032c
            int r18 = r1.mo16765v1()
            goto L_0x0330
        L_0x032c:
            int r18 = r1.mo16760m0()
        L_0x0330:
            int r18 = r18 + r16
            if (r5 == 0) goto L_0x0339
            int r16 = r1.mo16750Q1()
            goto L_0x033d
        L_0x0339:
            int r16 = r1.mo16763s1()
        L_0x033d:
            int r16 = r16 + r18
            int r14 = r16 + r14
            r9.f14763e = r14
            float r14 = r9.f14768j
            float r16 = r1.mo16762p0()
            float r14 = r14 + r16
            r9.f14768j = r14
            float r14 = r9.f14769k
            float r16 = r1.mo16753c0()
            float r14 = r14 + r16
            r9.f14769k = r14
            com.google.android.flexbox.a r14 = r0.f14777a
            r14.mo16767a(r12, r10, r7, r9)
            if (r5 == 0) goto L_0x0363
            int r14 = r12.getMeasuredHeight()
            goto L_0x0367
        L_0x0363:
            int r14 = r12.getMeasuredWidth()
        L_0x0367:
            if (r5 == 0) goto L_0x036e
            int r16 = r1.mo16760m0()
            goto L_0x0372
        L_0x036e:
            int r16 = r1.mo16765v1()
        L_0x0372:
            int r16 = r16 + r14
            if (r5 == 0) goto L_0x037b
            int r14 = r1.mo16763s1()
            goto L_0x037f
        L_0x037b:
            int r14 = r1.mo16750Q1()
        L_0x037f:
            int r14 = r14 + r16
            com.google.android.flexbox.a r3 = r0.f14777a
            int r3 = r3.mo16773e(r12)
            int r3 = r3 + r14
            int r3 = java.lang.Math.max(r8, r3)
            int r8 = r9.f14765g
            int r8 = java.lang.Math.max(r8, r3)
            r9.f14765g = r8
            if (r5 == 0) goto L_0x03c7
            com.google.android.flexbox.a r8 = r0.f14777a
            int r8 = r8.getFlexWrap()
            r14 = 2
            if (r8 == r14) goto L_0x03b1
            int r8 = r9.f14770l
            int r12 = r12.getBaseline()
            int r1 = r1.mo16760m0()
            int r12 = r12 + r1
            int r1 = java.lang.Math.max(r8, r12)
            r9.f14770l = r1
            goto L_0x03c7
        L_0x03b1:
            int r8 = r9.f14770l
            int r14 = r12.getMeasuredHeight()
            int r12 = r12.getBaseline()
            int r14 = r14 - r12
            int r1 = r1.mo16763s1()
            int r14 = r14 + r1
            int r1 = java.lang.Math.max(r8, r14)
            r9.f14770l = r1
        L_0x03c7:
            int r14 = r21 + -1
            if (r10 != r14) goto L_0x03d4
            int r1 = r9.f14766h
            int r8 = r9.f14767i
            int r1 = r1 - r8
            if (r1 == 0) goto L_0x03d4
            r1 = 1
            goto L_0x03d5
        L_0x03d4:
            r1 = 0
        L_0x03d5:
            if (r1 == 0) goto L_0x03dd
            r0.mo16866a(r11, r9, r10, r4)
            int r1 = r9.f14765g
            int r4 = r4 + r1
        L_0x03dd:
            r1 = r33
            r12 = -1
            if (r1 == r12) goto L_0x0402
            int r8 = r11.size()
            if (r8 <= 0) goto L_0x0402
            int r8 = r11.size()
            int r8 = r8 + r12
            java.lang.Object r8 = r11.get(r8)
            com.google.android.flexbox.b r8 = (com.google.android.flexbox.C4092b) r8
            int r8 = r8.f14774p
            if (r8 < r1) goto L_0x0402
            if (r10 < r1) goto L_0x0402
            if (r32 != 0) goto L_0x0402
            int r4 = r9.f14765g
            int r4 = -r4
            r14 = r31
            r8 = 1
            goto L_0x0406
        L_0x0402:
            r14 = r31
            r8 = r32
        L_0x0406:
            if (r4 <= r14) goto L_0x040f
            if (r8 == 0) goto L_0x040f
            r2 = r28
            r1 = r25
            goto L_0x042b
        L_0x040f:
            r18 = r3
            r19 = r7
        L_0x0413:
            int r10 = r10 + 1
            r7 = r2
            r3 = r6
            r32 = r8
            r8 = r11
            r12 = r19
            r14 = r21
            r6 = r24
            r1 = r25
            r11 = r26
            r2 = r29
            goto L_0x0081
        L_0x0428:
            r8 = r1
            r2 = r28
        L_0x042b:
            r2.f14783b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.C4093c.mo16867b(com.google.android.flexbox.c$a, int, int, int, int, int, java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16868c(int r7, android.view.View r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r8.getMeasuredWidth()
            int r2 = r8.getMeasuredHeight()
            int r3 = r0.mo16754f0()
            r4 = 1
            if (r1 >= r3) goto L_0x001a
            int r1 = r0.mo16754f0()
            goto L_0x0024
        L_0x001a:
            int r3 = r0.getMaxWidth()
            if (r1 <= r3) goto L_0x0026
            int r1 = r0.getMaxWidth()
        L_0x0024:
            r3 = 1
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            int r5 = r0.mo16751T1()
            if (r2 >= r5) goto L_0x0032
            int r2 = r0.mo16751T1()
            goto L_0x003e
        L_0x0032:
            int r5 = r0.getMaxHeight()
            if (r2 <= r5) goto L_0x003d
            int r2 = r0.getMaxHeight()
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x0055
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r8.measure(r1, r0)
            r6.mo16885v(r8, r7, r1, r0)
            com.google.android.flexbox.a r0 = r6.f14777a
            r0.mo16793h(r7, r8)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.C4093c.mo16868c(int, android.view.View):void");
    }

    /* renamed from: d */
    public final void mo16869d(int i, List list) {
        int i2 = this.f14779c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.f14779c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.f14780d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0);
        } else {
            Arrays.fill(jArr, i, length2, 0);
        }
    }

    /* renamed from: f */
    public final ArrayList mo16870f(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            C4095b bVar = new C4095b();
            bVar.f14785c = ((FlexItem) this.f14777a.mo16770c(i2).getLayoutParams()).getOrder();
            bVar.f14784b = i2;
            arrayList.add(bVar);
        }
        return arrayList;
    }

    /* renamed from: g */
    public final void mo16871g(int i, int i2, int i3) {
        int i4;
        int i5;
        int flexDirection = this.f14777a.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        } else if (flexDirection == 2 || flexDirection == 3) {
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        } else {
            throw new IllegalArgumentException(C16759e.m42349e("Invalid flex direction: ", flexDirection));
        }
        List<C4092b> flexLinesInternal = this.f14777a.getFlexLinesInternal();
        if (i4 == 1073741824) {
            int sumOfCrossSize = this.f14777a.getSumOfCrossSize() + i3;
            int i6 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f14765g = i5 - i3;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f14777a.getAlignContent();
                if (alignContent == 1) {
                    int i7 = i5 - sumOfCrossSize;
                    C4092b bVar = new C4092b();
                    bVar.f14765g = i7;
                    flexLinesInternal.add(0, bVar);
                } else if (alignContent == 2) {
                    this.f14777a.setFlexLines(m11048e(i5, sumOfCrossSize, flexLinesInternal));
                } else if (alignContent != 3) {
                    if (alignContent != 4) {
                        if (alignContent == 5 && sumOfCrossSize < i5) {
                            float size2 = ((float) (i5 - sumOfCrossSize)) / ((float) flexLinesInternal.size());
                            int size3 = flexLinesInternal.size();
                            float f = BitmapDescriptorFactory.HUE_RED;
                            while (i6 < size3) {
                                C4092b bVar2 = flexLinesInternal.get(i6);
                                float f2 = ((float) bVar2.f14765g) + size2;
                                if (i6 == flexLinesInternal.size() - 1) {
                                    f2 += f;
                                    f = BitmapDescriptorFactory.HUE_RED;
                                }
                                int round = Math.round(f2);
                                float f3 = (f2 - ((float) round)) + f;
                                if (f3 > 1.0f) {
                                    round++;
                                    f3 -= 1.0f;
                                } else if (f3 < -1.0f) {
                                    round--;
                                    f3 += 1.0f;
                                }
                                f = f3;
                                bVar2.f14765g = round;
                                i6++;
                            }
                        }
                    } else if (sumOfCrossSize >= i5) {
                        this.f14777a.setFlexLines(m11048e(i5, sumOfCrossSize, flexLinesInternal));
                    } else {
                        int size4 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                        ArrayList arrayList = new ArrayList();
                        C4092b bVar3 = new C4092b();
                        bVar3.f14765g = size4;
                        for (C4092b add : flexLinesInternal) {
                            arrayList.add(bVar3);
                            arrayList.add(add);
                            arrayList.add(bVar3);
                        }
                        this.f14777a.setFlexLines(arrayList);
                    }
                } else if (sumOfCrossSize < i5) {
                    float size5 = ((float) (i5 - sumOfCrossSize)) / ((float) (flexLinesInternal.size() - 1));
                    ArrayList arrayList2 = new ArrayList();
                    int size6 = flexLinesInternal.size();
                    float f4 = BitmapDescriptorFactory.HUE_RED;
                    while (i6 < size6) {
                        arrayList2.add(flexLinesInternal.get(i6));
                        if (i6 != flexLinesInternal.size() - 1) {
                            C4092b bVar4 = new C4092b();
                            if (i6 == flexLinesInternal.size() - 2) {
                                bVar4.f14765g = Math.round(f4 + size5);
                                f4 = BitmapDescriptorFactory.HUE_RED;
                            } else {
                                bVar4.f14765g = Math.round(size5);
                            }
                            int i8 = bVar4.f14765g;
                            float f5 = (size5 - ((float) i8)) + f4;
                            if (f5 > 1.0f) {
                                bVar4.f14765g = i8 + 1;
                                f5 -= 1.0f;
                            } else if (f5 < -1.0f) {
                                bVar4.f14765g = i8 - 1;
                                f5 += 1.0f;
                            }
                            arrayList2.add(bVar4);
                            f4 = f5;
                        }
                        i6++;
                    }
                    this.f14777a.setFlexLines(arrayList2);
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo16872h(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int flexItemCount = this.f14777a.getFlexItemCount();
        boolean[] zArr = this.f14778b;
        int i7 = 0;
        if (zArr == null) {
            this.f14778b = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.f14778b = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 < this.f14777a.getFlexItemCount()) {
            int flexDirection = this.f14777a.getFlexDirection();
            int flexDirection2 = this.f14777a.getFlexDirection();
            if (flexDirection2 == 0 || flexDirection2 == 1) {
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                int largestMainSize = this.f14777a.getLargestMainSize();
                if (mode != 1073741824) {
                    size = Math.min(largestMainSize, size);
                }
                i6 = this.f14777a.getPaddingLeft();
                i4 = this.f14777a.getPaddingRight();
            } else if (flexDirection2 == 2 || flexDirection2 == 3) {
                int mode2 = View.MeasureSpec.getMode(i2);
                i5 = View.MeasureSpec.getSize(i2);
                if (mode2 != 1073741824) {
                    i5 = this.f14777a.getLargestMainSize();
                }
                i6 = this.f14777a.getPaddingTop();
                i4 = this.f14777a.getPaddingBottom();
            } else {
                throw new IllegalArgumentException(C16759e.m42349e("Invalid flex direction: ", flexDirection));
            }
            int i8 = i4 + i6;
            int[] iArr = this.f14779c;
            if (iArr != null) {
                i7 = iArr[i3];
            }
            List<C4092b> flexLinesInternal = this.f14777a.getFlexLinesInternal();
            int size2 = flexLinesInternal.size();
            while (i7 < size2) {
                C4092b bVar = flexLinesInternal.get(i7);
                int i9 = bVar.f14763e;
                if (i9 < i5 && bVar.f14775q) {
                    mo16876l(i, i2, bVar, i5, i8, false);
                } else if (i9 > i5 && bVar.f14776r) {
                    mo16881q(i, i2, bVar, i5, i8, false);
                }
                i7++;
            }
        }
    }

    /* renamed from: i */
    public final void mo16873i(int i) {
        int[] iArr = this.f14779c;
        if (iArr == null) {
            this.f14779c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.f14779c = Arrays.copyOf(this.f14779c, Math.max(iArr.length * 2, i));
        }
    }

    /* renamed from: j */
    public final void mo16874j(int i) {
        long[] jArr = this.f14780d;
        if (jArr == null) {
            this.f14780d = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f14780d = Arrays.copyOf(this.f14780d, Math.max(jArr.length * 2, i));
        }
    }

    /* renamed from: k */
    public final void mo16875k(int i) {
        long[] jArr = this.f14781e;
        if (jArr == null) {
            this.f14781e = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f14781e = Arrays.copyOf(this.f14781e, Math.max(jArr.length * 2, i));
        }
    }

    /* renamed from: l */
    public final void mo16876l(int i, int i2, C4092b bVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        double d;
        int i8;
        double d2;
        C4092b bVar2 = bVar;
        int i9 = i3;
        float f = bVar2.f14768j;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (f > BitmapDescriptorFactory.HUE_RED && i9 >= (i5 = bVar2.f14763e)) {
            float f3 = ((float) (i9 - i5)) / f;
            bVar2.f14763e = i4 + bVar2.f14764f;
            if (!z) {
                bVar2.f14765g = Integer.MIN_VALUE;
            }
            int i11 = 0;
            boolean z2 = false;
            int i12 = 0;
            float f4 = BitmapDescriptorFactory.HUE_RED;
            while (i11 < bVar2.f14766h) {
                int i13 = bVar2.f14773o + i11;
                View g = this.f14777a.mo16775g(i13);
                if (g == null || g.getVisibility() == 8) {
                    int i14 = i2;
                    i6 = i5;
                    int i15 = i;
                } else {
                    FlexItem flexItem = (FlexItem) g.getLayoutParams();
                    int flexDirection = this.f14777a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        int i16 = i5;
                        int i17 = i;
                        int measuredWidth = g.getMeasuredWidth();
                        long[] jArr = this.f14781e;
                        i6 = i16;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i13];
                        }
                        int measuredHeight = g.getMeasuredHeight();
                        long[] jArr2 = this.f14781e;
                        if (jArr2 != null) {
                            measuredHeight = (int) (jArr2[i13] >> 32);
                        }
                        if (this.f14778b[i13] || flexItem.mo16762p0() <= BitmapDescriptorFactory.HUE_RED) {
                            int i18 = i2;
                        } else {
                            float p0 = (flexItem.mo16762p0() * f3) + ((float) measuredWidth);
                            if (i11 == bVar2.f14766h - 1) {
                                p0 += f4;
                                f4 = BitmapDescriptorFactory.HUE_RED;
                            }
                            int round = Math.round(p0);
                            if (round > flexItem.getMaxWidth()) {
                                round = flexItem.getMaxWidth();
                                this.f14778b[i13] = true;
                                bVar2.f14768j -= flexItem.mo16762p0();
                                z2 = true;
                            } else {
                                float f5 = (p0 - ((float) round)) + f4;
                                double d3 = (double) f5;
                                if (d3 > 1.0d) {
                                    round++;
                                    d = d3 - 1.0d;
                                } else {
                                    if (d3 < -1.0d) {
                                        round--;
                                        d = d3 + 1.0d;
                                    }
                                    f4 = f5;
                                }
                                f5 = (float) d;
                                f4 = f5;
                            }
                            int m = mo16877m(i2, flexItem, bVar2.f14771m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            g.measure(makeMeasureSpec, m);
                            int measuredWidth2 = g.getMeasuredWidth();
                            int measuredHeight2 = g.getMeasuredHeight();
                            mo16885v(g, i13, makeMeasureSpec, m);
                            this.f14777a.mo16793h(i13, g);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i12, this.f14777a.mo16773e(g) + measuredHeight + flexItem.mo16760m0() + flexItem.mo16763s1());
                        bVar2.f14763e = measuredWidth + flexItem.mo16765v1() + flexItem.mo16750Q1() + bVar2.f14763e;
                        i7 = max;
                    } else {
                        int measuredHeight3 = g.getMeasuredHeight();
                        long[] jArr3 = this.f14781e;
                        if (jArr3 != null) {
                            measuredHeight3 = (int) (jArr3[i13] >> 32);
                        }
                        int measuredWidth3 = g.getMeasuredWidth();
                        long[] jArr4 = this.f14781e;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i13];
                        }
                        if (this.f14778b[i13] || flexItem.mo16762p0() <= f2) {
                            i8 = i5;
                            int i19 = i;
                        } else {
                            float p02 = (flexItem.mo16762p0() * f3) + ((float) measuredHeight3);
                            if (i11 == bVar2.f14766h - 1) {
                                p02 += f4;
                                f4 = BitmapDescriptorFactory.HUE_RED;
                            }
                            int round2 = Math.round(p02);
                            if (round2 > flexItem.getMaxHeight()) {
                                round2 = flexItem.getMaxHeight();
                                this.f14778b[i13] = true;
                                bVar2.f14768j -= flexItem.mo16762p0();
                                i8 = i5;
                                z2 = true;
                            } else {
                                float f6 = (p02 - ((float) round2)) + f4;
                                i8 = i5;
                                double d4 = (double) f6;
                                if (d4 > 1.0d) {
                                    round2++;
                                    d2 = d4 - 1.0d;
                                } else if (d4 < -1.0d) {
                                    round2--;
                                    d2 = d4 + 1.0d;
                                } else {
                                    f4 = f6;
                                }
                                f4 = (float) d2;
                            }
                            int n = mo16878n(i, flexItem, bVar2.f14771m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            g.measure(n, makeMeasureSpec2);
                            measuredWidth3 = g.getMeasuredWidth();
                            int measuredHeight4 = g.getMeasuredHeight();
                            mo16885v(g, i13, n, makeMeasureSpec2);
                            this.f14777a.mo16793h(i13, g);
                            measuredHeight3 = measuredHeight4;
                        }
                        i7 = Math.max(i12, this.f14777a.mo16773e(g) + measuredWidth3 + flexItem.mo16765v1() + flexItem.mo16750Q1());
                        bVar2.f14763e = measuredHeight3 + flexItem.mo16760m0() + flexItem.mo16763s1() + bVar2.f14763e;
                        int i21 = i2;
                        i6 = i8;
                    }
                    bVar2.f14765g = Math.max(bVar2.f14765g, i7);
                    i12 = i7;
                }
                i11++;
                i5 = i6;
                f2 = BitmapDescriptorFactory.HUE_RED;
            }
            int i22 = i2;
            int i23 = i5;
            int i24 = i;
            if (z2 && i23 != bVar2.f14763e) {
                mo16876l(i, i2, bVar, i3, i4, true);
            }
        }
    }

    /* renamed from: m */
    public final int mo16877m(int i, FlexItem flexItem, int i2) {
        C4091a aVar = this.f14777a;
        int d = aVar.mo16772d(i, this.f14777a.getPaddingBottom() + aVar.getPaddingTop() + flexItem.mo16760m0() + flexItem.mo16763s1() + i2, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(d);
        if (size > flexItem.getMaxHeight()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.getMaxHeight(), View.MeasureSpec.getMode(d));
        }
        if (size < flexItem.mo16751T1()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo16751T1(), View.MeasureSpec.getMode(d));
        }
        return d;
    }

    /* renamed from: n */
    public final int mo16878n(int i, FlexItem flexItem, int i2) {
        C4091a aVar = this.f14777a;
        int b = aVar.mo16769b(i, this.f14777a.getPaddingRight() + aVar.getPaddingLeft() + flexItem.mo16765v1() + flexItem.mo16750Q1() + i2, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(b);
        if (size > flexItem.getMaxWidth()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.getMaxWidth(), View.MeasureSpec.getMode(b));
        }
        if (size < flexItem.mo16754f0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo16754f0(), View.MeasureSpec.getMode(b));
        }
        return b;
    }

    /* renamed from: o */
    public final void mo16879o(View view, C4092b bVar, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f14777a.getAlignItems();
        if (flexItem.mo16752b0() != -1) {
            alignItems = flexItem.mo16752b0();
        }
        int i5 = bVar.f14765g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.mo16760m0()) - flexItem.mo16763s1()) / 2;
                    if (this.f14777a.getFlexWrap() != 2) {
                        int i6 = i2 + measuredHeight;
                        view.layout(i, i6, i3, view.getMeasuredHeight() + i6);
                        return;
                    }
                    int i7 = i2 - measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else if (alignItems != 3) {
                    if (alignItems != 4) {
                        return;
                    }
                } else if (this.f14777a.getFlexWrap() != 2) {
                    int max = Math.max(bVar.f14770l - view.getBaseline(), flexItem.mo16760m0());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max(view.getBaseline() + (bVar.f14770l - view.getMeasuredHeight()), flexItem.mo16763s1());
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            } else if (this.f14777a.getFlexWrap() != 2) {
                int i8 = i2 + i5;
                view.layout(i, (i8 - view.getMeasuredHeight()) - flexItem.mo16763s1(), i3, i8 - flexItem.mo16763s1());
                return;
            } else {
                view.layout(i, view.getMeasuredHeight() + (i2 - i5) + flexItem.mo16760m0(), i3, view.getMeasuredHeight() + (i4 - i5) + flexItem.mo16760m0());
                return;
            }
        }
        if (this.f14777a.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.mo16760m0(), i3, i4 + flexItem.mo16760m0());
        } else {
            view.layout(i, i2 - flexItem.mo16763s1(), i3, i4 - flexItem.mo16763s1());
        }
    }

    /* renamed from: p */
    public final void mo16880p(View view, C4092b bVar, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f14777a.getAlignItems();
        if (flexItem.mo16752b0() != -1) {
            alignItems = flexItem.mo16752b0();
        }
        int i5 = bVar.f14765g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int c = ((C6362h.m15167c(marginLayoutParams) + (i5 - view.getMeasuredWidth())) - C6362h.m15166b(marginLayoutParams)) / 2;
                    if (!z) {
                        view.layout(i + c, i2, i3 + c, i4);
                        return;
                    } else {
                        view.layout(i - c, i2, i3 - c, i4);
                        return;
                    }
                } else if (!(alignItems == 3 || alignItems == 4)) {
                    return;
                }
            } else if (!z) {
                view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.mo16750Q1(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.mo16750Q1(), i4);
                return;
            } else {
                view.layout(view.getMeasuredWidth() + (i - i5) + flexItem.mo16765v1(), i2, view.getMeasuredWidth() + (i3 - i5) + flexItem.mo16765v1(), i4);
                return;
            }
        }
        if (!z) {
            view.layout(i + flexItem.mo16765v1(), i2, i3 + flexItem.mo16765v1(), i4);
        } else {
            view.layout(i - flexItem.mo16750Q1(), i2, i3 - flexItem.mo16750Q1(), i4);
        }
    }

    /* renamed from: q */
    public final void mo16881q(int i, int i2, C4092b bVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8;
        C4092b bVar2 = bVar;
        int i9 = i3;
        int i11 = bVar2.f14763e;
        float f = bVar2.f14769k;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (f > BitmapDescriptorFactory.HUE_RED && i9 <= i11) {
            float f3 = ((float) (i11 - i9)) / f;
            bVar2.f14763e = i4 + bVar2.f14764f;
            if (!z) {
                bVar2.f14765g = Integer.MIN_VALUE;
            }
            int i12 = 0;
            boolean z2 = false;
            int i13 = 0;
            float f4 = BitmapDescriptorFactory.HUE_RED;
            while (i12 < bVar2.f14766h) {
                int i14 = bVar2.f14773o + i12;
                View g = this.f14777a.mo16775g(i14);
                if (g == null || g.getVisibility() == 8) {
                    int i15 = i2;
                    i6 = i11;
                    i5 = i12;
                } else {
                    FlexItem flexItem = (FlexItem) g.getLayoutParams();
                    int flexDirection = this.f14777a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        i6 = i11;
                        i5 = i12;
                        int i16 = i;
                        int measuredWidth = g.getMeasuredWidth();
                        long[] jArr = this.f14781e;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i14];
                        }
                        int measuredHeight = g.getMeasuredHeight();
                        long[] jArr2 = this.f14781e;
                        if (jArr2 != null) {
                            measuredHeight = (int) (jArr2[i14] >> 32);
                        }
                        if (this.f14778b[i14] || flexItem.mo16753c0() <= BitmapDescriptorFactory.HUE_RED) {
                            int i17 = i2;
                        } else {
                            float c0 = ((float) measuredWidth) - (flexItem.mo16753c0() * f3);
                            if (i5 == bVar2.f14766h - 1) {
                                c0 += f4;
                                f4 = BitmapDescriptorFactory.HUE_RED;
                            }
                            int round = Math.round(c0);
                            if (round < flexItem.mo16754f0()) {
                                i8 = flexItem.mo16754f0();
                                this.f14778b[i14] = true;
                                bVar2.f14769k -= flexItem.mo16753c0();
                                z2 = true;
                            } else {
                                float f5 = (c0 - ((float) round)) + f4;
                                double d = (double) f5;
                                if (d > 1.0d) {
                                    round++;
                                    f5 -= 1.0f;
                                } else if (d < -1.0d) {
                                    round--;
                                    f5 += 1.0f;
                                }
                                f4 = f5;
                                i8 = round;
                            }
                            int m = mo16877m(i2, flexItem, bVar2.f14771m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                            g.measure(makeMeasureSpec, m);
                            int measuredWidth2 = g.getMeasuredWidth();
                            int measuredHeight2 = g.getMeasuredHeight();
                            mo16885v(g, i14, makeMeasureSpec, m);
                            this.f14777a.mo16793h(i14, g);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i13, this.f14777a.mo16773e(g) + measuredHeight + flexItem.mo16760m0() + flexItem.mo16763s1());
                        bVar2.f14763e = measuredWidth + flexItem.mo16765v1() + flexItem.mo16750Q1() + bVar2.f14763e;
                        i7 = max;
                    } else {
                        int measuredHeight3 = g.getMeasuredHeight();
                        long[] jArr3 = this.f14781e;
                        if (jArr3 != null) {
                            measuredHeight3 = (int) (jArr3[i14] >> 32);
                        }
                        int measuredWidth3 = g.getMeasuredWidth();
                        long[] jArr4 = this.f14781e;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i14];
                        }
                        if (this.f14778b[i14] || flexItem.mo16753c0() <= f2) {
                            i6 = i11;
                            i5 = i12;
                            int i18 = i;
                        } else {
                            float c02 = ((float) measuredHeight3) - (flexItem.mo16753c0() * f3);
                            if (i12 == bVar2.f14766h - 1) {
                                c02 += f4;
                                f4 = BitmapDescriptorFactory.HUE_RED;
                            }
                            int round2 = Math.round(c02);
                            if (round2 < flexItem.mo16751T1()) {
                                int T1 = flexItem.mo16751T1();
                                this.f14778b[i14] = true;
                                bVar2.f14769k -= flexItem.mo16753c0();
                                i5 = i12;
                                round2 = T1;
                                z2 = true;
                                i6 = i11;
                            } else {
                                float f6 = (c02 - ((float) round2)) + f4;
                                i6 = i11;
                                i5 = i12;
                                double d2 = (double) f6;
                                if (d2 > 1.0d) {
                                    round2++;
                                    f6 -= 1.0f;
                                } else if (d2 < -1.0d) {
                                    round2--;
                                    f6 += 1.0f;
                                }
                                f4 = f6;
                            }
                            int n = mo16878n(i, flexItem, bVar2.f14771m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            g.measure(n, makeMeasureSpec2);
                            measuredWidth3 = g.getMeasuredWidth();
                            int measuredHeight4 = g.getMeasuredHeight();
                            mo16885v(g, i14, n, makeMeasureSpec2);
                            this.f14777a.mo16793h(i14, g);
                            measuredHeight3 = measuredHeight4;
                        }
                        i7 = Math.max(i13, this.f14777a.mo16773e(g) + measuredWidth3 + flexItem.mo16765v1() + flexItem.mo16750Q1());
                        bVar2.f14763e = measuredHeight3 + flexItem.mo16760m0() + flexItem.mo16763s1() + bVar2.f14763e;
                        int i19 = i2;
                    }
                    bVar2.f14765g = Math.max(bVar2.f14765g, i7);
                    i13 = i7;
                }
                i12 = i5 + 1;
                i11 = i6;
                f2 = BitmapDescriptorFactory.HUE_RED;
            }
            int i21 = i2;
            int i22 = i11;
            if (z2 && i22 != bVar2.f14763e) {
                mo16881q(i, i2, bVar, i3, i4, true);
            }
        }
    }

    /* renamed from: s */
    public final void mo16882s(View view, int i, int i2) {
        int i3;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.mo16765v1()) - flexItem.mo16750Q1()) - this.f14777a.mo16773e(view), flexItem.mo16754f0()), flexItem.getMaxWidth());
        long[] jArr = this.f14781e;
        if (jArr != null) {
            i3 = (int) (jArr[i2] >> 32);
        } else {
            i3 = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        mo16885v(view, i2, makeMeasureSpec2, makeMeasureSpec);
        this.f14777a.mo16793h(i2, view);
    }

    /* renamed from: t */
    public final void mo16883t(View view, int i, int i2) {
        int i3;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.mo16760m0()) - flexItem.mo16763s1()) - this.f14777a.mo16773e(view), flexItem.mo16751T1()), flexItem.getMaxHeight());
        long[] jArr = this.f14781e;
        if (jArr != null) {
            i3 = (int) jArr[i2];
        } else {
            i3 = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        mo16885v(view, i2, makeMeasureSpec, makeMeasureSpec2);
        this.f14777a.mo16793h(i2, view);
    }

    /* renamed from: u */
    public final void mo16884u(int i) {
        int i2;
        View g;
        if (i < this.f14777a.getFlexItemCount()) {
            int flexDirection = this.f14777a.getFlexDirection();
            if (this.f14777a.getAlignItems() == 4) {
                int[] iArr = this.f14779c;
                if (iArr != null) {
                    i2 = iArr[i];
                } else {
                    i2 = 0;
                }
                List<C4092b> flexLinesInternal = this.f14777a.getFlexLinesInternal();
                int size = flexLinesInternal.size();
                while (i2 < size) {
                    C4092b bVar = flexLinesInternal.get(i2);
                    int i3 = bVar.f14766h;
                    for (int i4 = 0; i4 < i3; i4++) {
                        int i5 = bVar.f14773o + i4;
                        if (!(i4 >= this.f14777a.getFlexItemCount() || (g = this.f14777a.mo16775g(i5)) == null || g.getVisibility() == 8)) {
                            FlexItem flexItem = (FlexItem) g.getLayoutParams();
                            if (flexItem.mo16752b0() == -1 || flexItem.mo16752b0() == 4) {
                                if (flexDirection == 0 || flexDirection == 1) {
                                    mo16883t(g, bVar.f14765g, i5);
                                } else if (flexDirection == 2 || flexDirection == 3) {
                                    mo16882s(g, bVar.f14765g, i5);
                                } else {
                                    throw new IllegalArgumentException(C16759e.m42349e("Invalid flex direction: ", flexDirection));
                                }
                            }
                        }
                    }
                    i2++;
                }
                return;
            }
            for (C4092b next : this.f14777a.getFlexLinesInternal()) {
                Iterator it = next.f14772n.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        View g2 = this.f14777a.mo16775g(num.intValue());
                        if (flexDirection == 0 || flexDirection == 1) {
                            mo16883t(g2, next.f14765g, num.intValue());
                        } else if (flexDirection == 2 || flexDirection == 3) {
                            mo16882s(g2, next.f14765g, num.intValue());
                        } else {
                            throw new IllegalArgumentException(C16759e.m42349e("Invalid flex direction: ", flexDirection));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: v */
    public final void mo16885v(View view, int i, int i2, int i3) {
        long[] jArr = this.f14780d;
        if (jArr != null) {
            jArr[i] = (((long) i2) & 4294967295L) | (((long) i3) << 32);
        }
        long[] jArr2 = this.f14781e;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredWidth()) & 4294967295L) | (((long) view.getMeasuredHeight()) << 32);
        }
    }
}
