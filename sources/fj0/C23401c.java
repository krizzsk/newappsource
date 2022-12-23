package fj0;

/* renamed from: fj0.c */
public final class C23401c {

    /* renamed from: a */
    public C23400b[] f59182a;

    /* renamed from: b */
    public boolean f59183b = false;

    public C23401c(int i) {
        this.f59182a = new C23400b[i];
    }

    /* renamed from: a */
    public final void mo58551a(int i) {
        C23400b[] bVarArr;
        int i2;
        double d = 0.0d;
        int i3 = 0;
        while (true) {
            bVarArr = this.f59182a;
            if (i3 >= bVarArr.length) {
                break;
            }
            int i4 = i3 + 1;
            C23400b bVar = bVarArr[i3];
            double d2 = bVar.f59179a;
            C23400b bVar2 = bVarArr[i4 % bVarArr.length];
            d += (d2 * bVar2.f59180b) - (bVar.f59180b * bVar2.f59179a);
            i3 = i4;
        }
        if (d > 0.0d) {
            i2 = 1;
        } else if (d < 0.0d) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if (i2 != 0 && i2 != i) {
            int length = bVarArr.length;
            C23400b[] bVarArr2 = new C23400b[length];
            for (int i5 = 0; i5 < length; i5++) {
                bVarArr2[i5] = this.f59182a[(length - i5) - 1];
            }
            this.f59182a = bVarArr2;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C23401c)) {
            return false;
        }
        C23401c cVar = (C23401c) obj;
        if (cVar.f59183b != this.f59183b || cVar.f59182a.length != this.f59182a.length) {
            return false;
        }
        int i = 0;
        while (true) {
            C23400b[] bVarArr = this.f59182a;
            if (i >= bVarArr.length) {
                return true;
            }
            if (!cVar.f59182a[i].equals(bVarArr[i])) {
                return false;
            }
            i++;
        }
    }

    public C23401c(C23400b[] bVarArr) {
        this.f59182a = (C23400b[]) bVarArr.clone();
    }
}
