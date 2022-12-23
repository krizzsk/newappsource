package p627lg;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.UUID;
import p404ce.C13784b;
import p404ce.C13800m;
import p603kg.C18039b;

@KeepForSdk
/* renamed from: lg.k */
public final class C18212k {
    @KeepForSdk

    /* renamed from: b */
    public static final C13784b<?> f46472b;

    /* renamed from: a */
    public final Context f46473a;

    static {
        C13784b.C13785a<C18212k> a = C13784b.m34444a(C18212k.class);
        a.mo40715a(new C13800m(1, 0, C18208g.class));
        a.mo40715a(new C13800m(1, 0, Context.class));
        a.f33944e = C18222u.f46496b;
        f46472b = a.mo40716b();
    }

    public C18212k(Context context) {
        this.f46473a = context;
    }

    @KeepForSdk
    /* renamed from: a */
    public final synchronized String mo50630a() {
        String string = this.f46473a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", (String) null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        this.f46473a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    @KeepForSdk
    /* renamed from: b */
    public final synchronized long mo50631b(C18039b bVar) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.f46473a.getSharedPreferences("com.google.mlkit.internal", 0);
        bVar.getClass();
        return sharedPreferences.getLong(String.format("downloading_begin_time_%s", new Object[]{C18039b.m44709a()}), 0);
    }
}
