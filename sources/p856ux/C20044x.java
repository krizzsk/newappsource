package p856ux;

import android.content.Context;
import android.content.SharedPreferences;
import c70.C13752e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import p977zz.C20943i;
import x90.C13242b;

/* renamed from: ux.x */
public final class C20044x implements C13242b {
    /* renamed from: a */
    public final void mo40113a(C13752e eVar) throws BadResponseException, ServerException, IOException {
        Context context = eVar.f33852a;
        boolean booleanValue = Boolean.valueOf(context.getSharedPreferences("mot_join_banner", 0).getBoolean("dismissed", false)).booleanValue();
        SharedPreferences sharedPreferences = context.getSharedPreferences("promotion_banner_view", 0);
        Boolean valueOf = Boolean.valueOf(booleanValue);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("dismiss_motSection", valueOf.booleanValue());
        edit.apply();
        C20943i.m49049b(context, "mot_join_banner");
        String string = context.getSharedPreferences("apps_flyer_manager", 0).getString("gacp", (String) null);
        if (string != null) {
            context.getSharedPreferences("dynamic_link_manager", 0).edit().putString("gacp", string).apply();
        }
        C20943i.m49049b(context, "apps_flyer_manager");
    }

    public final String toString() {
        return "Upgrader476To477";
    }
}
