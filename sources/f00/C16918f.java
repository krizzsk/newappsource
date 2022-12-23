package f00;

import android.content.SharedPreferences;
import ce0.C21100e;

/* renamed from: f00.f */
public final class C16918f<T> {

    /* renamed from: a */
    public final SharedPreferences f43933a;

    /* renamed from: b */
    public final C16919g<T> f43934b;

    public C16918f(SharedPreferences sharedPreferences, C16919g<T> gVar) {
        C21100e.m49373x(sharedPreferences, "prefs");
        this.f43933a = sharedPreferences;
        C21100e.m49373x(gVar, "uPref");
        this.f43934b = gVar;
    }

    /* renamed from: a */
    public final T mo49542a() {
        return this.f43934b.mo19759a(this.f43933a);
    }

    /* renamed from: b */
    public final void mo49543b() {
        C16919g<T> gVar = this.f43934b;
        SharedPreferences sharedPreferences = this.f43933a;
        gVar.getClass();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        gVar.mo49539b(edit);
        edit.apply();
    }

    /* renamed from: c */
    public final void mo49544c(T t) {
        this.f43934b.mo49545d(this.f43933a, t);
    }
}
