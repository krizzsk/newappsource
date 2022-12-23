package f00;

import android.content.SharedPreferences;
import f00.C16919g;

/* renamed from: f00.c */
public final class C16915c extends C16914b<Integer> {

    /* renamed from: b */
    public final int f43931b;

    public C16915c(C16919g.C16924e eVar, int i) {
        super(eVar);
        this.f43931b = i;
    }

    /* renamed from: a */
    public final boolean mo49541a(SharedPreferences sharedPreferences) {
        return ((Integer) this.f43930a.mo19759a(sharedPreferences)).intValue() > this.f43931b;
    }
}
