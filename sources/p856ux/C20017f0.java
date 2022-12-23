package p856ux;

import aa0.C7537i;
import android.content.Context;
import android.content.SharedPreferences;
import c00.C13717b;
import c70.C13752e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.moovit.appdata.UserContextLoader;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p435de.C16596f;
import p810sz.C19617r;
import p824tp.C19722a0;
import p922xr.C20563b;
import x90.C13242b;
import y90.C13272f;

/* renamed from: ux.f0 */
public final class C20017f0 implements C13242b {
    /* renamed from: b */
    public static void m47507b(Context context) {
        C19722a0 a0Var;
        C13272f m;
        if (UserContextLoader.m40004l(context) && (m = UserContextLoader.m40005m(context)) != null) {
            a0Var = new C19722a0(m);
        } else {
            a0Var = null;
        }
        if (a0Var != null) {
            ServerId serverId = a0Var.f50160a.f32927c;
            C19617r rVar = C20563b.f52015c;
            C7537i iVar = new C7537i(context, "history", serverId, rVar, rVar);
            if (!iVar.mo51502e()) {
                iVar.mo51501d();
            }
            iVar.mo51499b();
            if (!C13717b.m34258e(iVar.f48432b)) {
                SharedPreferences.Editor edit = context.getSharedPreferences("history_dal", 0).edit();
                StringBuilder k = C13555b.m33972k("last_modified_");
                k.append(a0Var.f50160a.f32927c);
                edit.putLong(k.toString(), System.currentTimeMillis()).apply();
            }
        }
    }

    /* renamed from: a */
    public final void mo40113a(C13752e eVar) throws BadResponseException, ServerException, IOException {
        FirebaseAnalytics.getInstance(eVar.f33852a).mo43248b("has_subscription", "false");
        try {
            m47507b(eVar.f33852a);
        } catch (Exception e) {
            C16596f.m42113a().mo49364c(e);
        }
    }

    public final String toString() {
        return "Upgrader528To529";
    }
}
