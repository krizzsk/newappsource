package bc0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.umo.ads.p343d.zzb;
import hi0.C23529c0;
import hi0.C23560s;
import hi0.C23571x;
import java.io.IOException;
import li0.C24319f;

/* renamed from: bc0.a */
public final class C7570a implements C23560s {

    /* renamed from: a */
    public final Context f23064a;

    public C7570a(Context context) {
        this.f23064a = context;
    }

    public final C23529c0 intercept(C23560s.C23561a aVar) throws IOException {
        boolean z;
        Object systemService = this.f23064a.getSystemService("connectivity");
        if (systemService != null) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C24319f fVar = (C24319f) aVar;
                C23571x xVar = fVar.f61618e;
                xVar.getClass();
                return fVar.mo60464a(new C23571x.C23572a(xVar).mo58727a());
            }
            throw new zzb();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }
}
