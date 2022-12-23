package p856ux;

import android.content.Context;
import c70.C13752e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import java.io.File;
import java.io.IOException;
import p584jl.C17885a;
import p786rz.C19387a;
import p977zz.C20943i;
import w40.C25761d;
import x90.C13242b;

/* renamed from: ux.b0 */
public final class C20009b0 implements C13242b {
    /* renamed from: a */
    public final void mo40113a(C13752e eVar) throws BadResponseException, ServerException, IOException {
        Context context = eVar.f33852a;
        context.getSharedPreferences("com.moovit.general.settings.privacy.PrivacySettingsPref", 0).edit().remove("PRIVACY_POLICY_AGREEMENT").apply();
        C17885a.m44449m0(context, C25761d.m64299a().mo83588c());
        context.getSharedPreferences("com.moovit.general.settings.notifications.NotificationsPrefs", 0).edit().remove(String.valueOf(5)).remove(String.valueOf(6)).remove(String.valueOf(7)).remove(String.valueOf(8)).apply();
        File file = new File(context.getFilesDir(), "stores");
        C19387a.m46676h(new File(file, "smart_lines_group_tracking"));
        C19387a.m46676h(new File(file, "smart_stops_group_tracking"));
        C20943i.m49049b(context, "smart_lines_stops");
        C20943i.m49049b(context, "coach_marks");
    }

    public final String toString() {
        return "Upgrader502To503";
    }
}
