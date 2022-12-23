package p593ju;

import android.content.Context;
import android.content.SharedPreferences;
import f00.C16919g;
import java.util.IdentityHashMap;
import p977zz.C20935e;

/* renamed from: ju.e */
public final class C17929e {

    /* renamed from: a */
    public final SharedPreferences f45994a;

    /* renamed from: b */
    public final C16919g.C16924e f45995b = new C16919g.C16924e("user_map_layers", -1);

    /* renamed from: c */
    public final IdentityHashMap<C20935e<Integer>, SharedPreferences.OnSharedPreferenceChangeListener> f45996c = new IdentityHashMap<>(1);

    public C17929e(Context context) {
        this.f45994a = context.getSharedPreferences("map_settings", 0);
    }

    /* renamed from: a */
    public final int mo50470a() {
        return this.f45995b.mo19759a(this.f45994a).intValue();
    }
}
