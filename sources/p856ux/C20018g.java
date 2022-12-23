package p856ux;

import android.content.Context;
import c70.C13752e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import x90.C13242b;

/* renamed from: ux.g */
public final class C20018g implements C13242b {
    /* renamed from: a */
    public final void mo40113a(C13752e eVar) throws BadResponseException, ServerException, IOException {
        Context context = eVar.f33852a;
        context.getSharedPreferences("rate_us_prefs", 0).edit().clear().apply();
        context.deleteFile("popups.dat");
    }

    public final String toString() {
        return "Upgrader144To145";
    }
}
