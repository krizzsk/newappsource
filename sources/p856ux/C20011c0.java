package p856ux;

import android.content.SharedPreferences;
import c70.C13752e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import x90.C13242b;

/* renamed from: ux.c0 */
public final class C20011c0 implements C13242b {
    /* renamed from: a */
    public final void mo40113a(C13752e eVar) throws BadResponseException, ServerException, IOException {
        SharedPreferences sharedPreferences = eVar.f33852a.getSharedPreferences("promotion_banner_view", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        long currentTimeMillis = System.currentTimeMillis();
        String[] strArr = {"ticketingSection", "walletWidgetJoinBanner", "motSection"};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            String k = C25541a.m63881k("dismiss_", str);
            if (sharedPreferences.getBoolean(k, false)) {
                edit.putLong("dismiss_time_" + str, currentTimeMillis);
            }
            edit.remove(k);
        }
        edit.apply();
    }

    public final String toString() {
        return "Upgrader503To504";
    }
}
