package p784rx;

import android.content.SharedPreferences;
import ce0.C21100e;
import java.util.Collections;
import java.util.List;
import p784rx.C19376b;

/* renamed from: rx.a */
public abstract class C19375a<C extends C19376b> extends C19376b {

    /* renamed from: b */
    public final List<C> f49299b;

    public C19375a(List list) {
        super("sequence");
        C21100e.m49373x(list, "conditions");
        this.f49299b = Collections.unmodifiableList(list);
    }

    /* renamed from: f */
    public final C mo51782f(int i) {
        if (i < 0 || i >= this.f49299b.size()) {
            return null;
        }
        return (C19376b) this.f49299b.get(i);
    }

    /* renamed from: g */
    public final String mo51783g(int i, String str) {
        return mo51786c(str) + ".index." + i;
    }

    /* renamed from: h */
    public final boolean mo51784h(SharedPreferences sharedPreferences, String str, int i) {
        C19376b f = mo51782f(i);
        if (f == null) {
            return false;
        }
        return f.mo51787d(sharedPreferences, mo51783g(i, str));
    }

    /* renamed from: i */
    public final boolean mo51785i(SharedPreferences sharedPreferences, SharedPreferences.Editor editor, String str, int i) {
        C19376b f = mo51782f(i);
        if (f == null) {
            return false;
        }
        String g = mo51783g(i, str);
        f.mo51788e(sharedPreferences, editor, g);
        editor.apply();
        return f.mo51787d(sharedPreferences, g);
    }
}
