package p277ub;

import java.util.ArrayList;
import java.util.Collections;
import p194o5.C5993d;
import p252sb.C6501a;

/* renamed from: ub.t */
public final class C6805t {

    /* renamed from: h */
    public static final C6501a f21045h = new C6501a(1);

    /* renamed from: i */
    public static final C5993d f21046i = new C5993d(2);

    /* renamed from: a */
    public final int f21047a;

    /* renamed from: b */
    public final ArrayList<C6806a> f21048b = new ArrayList<>();

    /* renamed from: c */
    public final C6806a[] f21049c = new C6806a[5];

    /* renamed from: d */
    public int f21050d = -1;

    /* renamed from: e */
    public int f21051e;

    /* renamed from: f */
    public int f21052f;

    /* renamed from: g */
    public int f21053g;

    /* renamed from: ub.t$a */
    public static class C6806a {

        /* renamed from: a */
        public int f21054a;

        /* renamed from: b */
        public int f21055b;

        /* renamed from: c */
        public float f21056c;
    }

    public C6805t(int i) {
        this.f21047a = i;
    }

    /* renamed from: a */
    public final void mo23018a(float f, int i) {
        C6806a aVar;
        if (this.f21050d != 1) {
            Collections.sort(this.f21048b, f21045h);
            this.f21050d = 1;
        }
        int i2 = this.f21053g;
        if (i2 > 0) {
            C6806a[] aVarArr = this.f21049c;
            int i3 = i2 - 1;
            this.f21053g = i3;
            aVar = aVarArr[i3];
        } else {
            aVar = new C6806a();
        }
        int i4 = this.f21051e;
        this.f21051e = i4 + 1;
        aVar.f21054a = i4;
        aVar.f21055b = i;
        aVar.f21056c = f;
        this.f21048b.add(aVar);
        this.f21052f += i;
        while (true) {
            int i5 = this.f21052f;
            int i6 = this.f21047a;
            if (i5 > i6) {
                int i7 = i5 - i6;
                C6806a aVar2 = this.f21048b.get(0);
                int i8 = aVar2.f21055b;
                if (i8 <= i7) {
                    this.f21052f -= i8;
                    this.f21048b.remove(0);
                    int i9 = this.f21053g;
                    if (i9 < 5) {
                        C6806a[] aVarArr2 = this.f21049c;
                        this.f21053g = i9 + 1;
                        aVarArr2[i9] = aVar2;
                    }
                } else {
                    aVar2.f21055b = i8 - i7;
                    this.f21052f -= i7;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final float mo23019b() {
        if (this.f21050d != 0) {
            Collections.sort(this.f21048b, f21046i);
            this.f21050d = 0;
        }
        float f = 0.5f * ((float) this.f21052f);
        int i = 0;
        for (int i2 = 0; i2 < this.f21048b.size(); i2++) {
            C6806a aVar = this.f21048b.get(i2);
            i += aVar.f21055b;
            if (((float) i) >= f) {
                return aVar.f21056c;
            }
        }
        if (this.f21048b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<C6806a> arrayList = this.f21048b;
        return arrayList.get(arrayList.size() - 1).f21056c;
    }
}
