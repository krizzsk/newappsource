package p784rx;

import android.content.SharedPreferences;
import p001a0.C0016g;

/* renamed from: rx.b */
public abstract class C19376b {

    /* renamed from: a */
    public final String f49300a;

    public C19376b(String str) {
        this.f49300a = str;
    }

    /* renamed from: c */
    public final String mo51786c(String str) {
        StringBuilder t = C0016g.m36t(str, ".");
        t.append(this.f49300a);
        return t.toString();
    }

    /* renamed from: d */
    public abstract boolean mo51787d(SharedPreferences sharedPreferences, String str);

    /* renamed from: e */
    public abstract void mo51788e(SharedPreferences sharedPreferences, SharedPreferences.Editor editor, String str);
}
