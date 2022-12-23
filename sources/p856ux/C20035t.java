package p856ux;

import android.content.Context;
import c70.C13752e;
import com.moovit.app.general.settings.notifications.UserNotificationSetting;
import com.moovit.appdata.UserContextLoader;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import f10.C16935f;
import java.io.IOException;
import p734ps.C18977e;
import p824tp.C19722a0;
import x90.C13242b;
import y90.C13272f;

/* renamed from: ux.t */
public final class C20035t implements C13242b {
    /* renamed from: a */
    public final void mo40113a(C13752e eVar) throws BadResponseException, ServerException, IOException {
        C13272f m;
        Context context = eVar.f33852a;
        try {
            new C20034s(context).call();
            C19722a0 a0Var = null;
            if (UserContextLoader.m40004l(context) && (m = UserContextLoader.m40005m(context)) != null) {
                a0Var = new C19722a0(m);
            }
            if (a0Var != null) {
                C16935f.m42764g(context, Boolean.TRUE.equals(C18977e.m46090a(context).mo51488b().get(UserNotificationSetting.PushNotificationNewsAndUpdate)), a0Var);
            }
        } catch (Exception e) {
            throw new IOException("Failed to delete configurations from db!", e);
        }
    }

    public final String toString() {
        return "Upgrader338To339";
    }
}
