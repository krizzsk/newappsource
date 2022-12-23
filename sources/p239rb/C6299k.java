package p239rb;

import android.graphics.Bitmap;
import android.text.Layout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p126ib.C5332a;
import p126ib.C5336d;
import p277ub.C6774a0;
import p583jk.C17875h;

/* renamed from: rb.k */
public final class C6299k implements C5336d {

    /* renamed from: b */
    public final List<C6289e> f19927b;

    /* renamed from: c */
    public final long[] f19928c;

    /* renamed from: d */
    public final long[] f19929d;

    public C6299k(ArrayList arrayList) {
        this.f19927b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f19928c = new long[(arrayList.size() * 2)];
        for (int i = 0; i < arrayList.size(); i++) {
            C6289e eVar = (C6289e) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = this.f19928c;
            jArr[i2] = eVar.f19897b;
            jArr[i2 + 1] = eVar.f19898c;
        }
        long[] jArr2 = this.f19928c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f19929d = copyOf;
        Arrays.sort(copyOf);
    }

    /* renamed from: a */
    public final int mo21121a(long j) {
        int b = C6774a0.m15942b(this.f19929d, j, false);
        if (b < this.f19929d.length) {
            return b;
        }
        return -1;
    }

    /* renamed from: b */
    public final List<C5332a> mo21122b(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < this.f19927b.size(); i2++) {
            long[] jArr = this.f19928c;
            int i3 = i2 * 2;
            if (jArr[i3] <= j && j < jArr[i3 + 1]) {
                C6289e eVar = this.f19927b.get(i2);
                C5332a aVar = eVar.f19896a;
                if (aVar.f17593e == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        Collections.sort(arrayList2, new C6298j(0));
        while (i < arrayList2.size()) {
            C5332a aVar2 = ((C6289e) arrayList2.get(i)).f19896a;
            aVar2.getClass();
            CharSequence charSequence = aVar2.f17589a;
            Bitmap bitmap = aVar2.f17592d;
            Layout.Alignment alignment = aVar2.f17590b;
            Layout.Alignment alignment2 = aVar2.f17591c;
            int i4 = aVar2.f17595g;
            float f = aVar2.f17596h;
            int i5 = aVar2.f17597i;
            int i6 = aVar2.f17602n;
            float f2 = aVar2.f17603o;
            float f3 = aVar2.f17598j;
            float f4 = aVar2.f17599k;
            boolean z = aVar2.f17600l;
            int i7 = aVar2.f17601m;
            float f5 = f3;
            float f6 = (float) (-1 - i);
            C5332a aVar3 = r5;
            boolean z2 = z;
            C5332a aVar4 = new C5332a(charSequence, alignment, alignment2, bitmap, f6, 1, i4, f, i5, i6, f2, f5, f4, z2, i7, aVar2.f17604p, aVar2.f17605q);
            arrayList.add(aVar3);
            i++;
        }
        return arrayList;
    }

    /* renamed from: c */
    public final long mo21123c(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44301k(z);
        if (i >= this.f19929d.length) {
            z2 = false;
        }
        C17875h.m44301k(z2);
        return this.f19929d[i];
    }

    /* renamed from: f */
    public final int mo21124f() {
        return this.f19929d.length;
    }
}
