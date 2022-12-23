package p265tb;

import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import p277ub.C6774a0;

/* renamed from: tb.j */
public final class C6658j {

    /* renamed from: a */
    public final boolean f20678a = true;

    /* renamed from: b */
    public final int f20679b = SQLiteDatabase.OPEN_FULLMUTEX;

    /* renamed from: c */
    public final C6645a[] f20680c = new C6645a[1];

    /* renamed from: d */
    public int f20681d;

    /* renamed from: e */
    public int f20682e;

    /* renamed from: f */
    public int f20683f = 0;

    /* renamed from: g */
    public C6645a[] f20684g = new C6645a[100];

    /* renamed from: a */
    public final synchronized void mo22831a(C6645a[] aVarArr) {
        int i = this.f20683f;
        int length = aVarArr.length + i;
        C6645a[] aVarArr2 = this.f20684g;
        if (length >= aVarArr2.length) {
            this.f20684g = (C6645a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i + aVarArr.length));
        }
        for (C6645a aVar : aVarArr) {
            C6645a[] aVarArr3 = this.f20684g;
            int i2 = this.f20683f;
            this.f20683f = i2 + 1;
            aVarArr3[i2] = aVar;
        }
        this.f20682e -= aVarArr.length;
        notifyAll();
    }

    /* renamed from: b */
    public final synchronized void mo22832b() {
        int i = this.f20681d;
        int i2 = this.f20679b;
        int i3 = C6774a0.f20959a;
        int max = Math.max(0, (((i + i2) - 1) / i2) - this.f20682e);
        int i4 = this.f20683f;
        if (max < i4) {
            Arrays.fill(this.f20684g, max, i4, (Object) null);
            this.f20683f = max;
        }
    }
}
