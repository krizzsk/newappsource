package p856ux;

import android.content.Context;
import c70.C13752e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import p977zz.C20943i;
import x90.C13242b;

/* renamed from: ux.d0 */
public final class C20013d0 implements C13242b {
    /* renamed from: a */
    public final void mo40113a(C13752e eVar) throws BadResponseException, ServerException, IOException {
        Context context = eVar.f33852a;
        context.getSharedPreferences("com.moovit.general.settings.privacy.PrivacySettingsPref", 0).edit().putBoolean("ALLOW_DATA_SHARING", context.getSharedPreferences("com.moovit.analytics.AppsFlyerManager", 0).getBoolean("ALLOW_DATA_SHARING", true)).apply();
        C20943i.m49049b(context, "com.moovit.analytics.AppsFlyerManager");
    }

    public final String toString() {
        return "Upgrader516To517";
    }
}
