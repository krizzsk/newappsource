package p593ju;

import android.content.SharedPreferences;
import p977zz.C20935e;

/* renamed from: ju.d */
public final /* synthetic */ class C17928d implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C17929e f45992a;

    /* renamed from: b */
    public final /* synthetic */ C20935e f45993b;

    public /* synthetic */ C17928d(C17929e eVar, C17926b bVar) {
        this.f45992a = eVar;
        this.f45993b = bVar;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.f45993b.invoke(Integer.valueOf(this.f45992a.mo50470a()));
    }
}
