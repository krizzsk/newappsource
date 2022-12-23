package p784rx;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;
import p784rx.C19379e;

/* renamed from: rx.d */
public final class C19378d extends C19376b implements C19379e.C19380a {

    /* renamed from: b */
    public final long f49301b;

    public C19378d(long j, TimeUnit timeUnit) {
        super("interval");
        this.f49301b = timeUnit.toMillis(j);
    }

    /* renamed from: a */
    public final void mo51789a(SharedPreferences sharedPreferences, SharedPreferences.Editor editor, String str) {
        mo51788e(sharedPreferences, editor, str);
    }

    /* renamed from: b */
    public final void mo51790b() {
    }

    /* renamed from: d */
    public final boolean mo51787d(SharedPreferences sharedPreferences, String str) {
        if (System.currentTimeMillis() - sharedPreferences.getLong(mo51786c(str), 0) >= this.f49301b) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo51788e(SharedPreferences sharedPreferences, SharedPreferences.Editor editor, String str) {
        editor.putLong(mo51786c(str), System.currentTimeMillis());
    }
}
