package p856ux;

import android.content.SharedPreferences;
import c70.C13752e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import p977zz.C20964s0;
import x90.C13242b;

/* renamed from: ux.w */
public final class C20043w implements C13242b {
    /* renamed from: a */
    public final void mo40113a(C13752e eVar) throws BadResponseException, ServerException, IOException {
        SharedPreferences sharedPreferences = eVar.f33852a.getSharedPreferences("payment_account_manager", 0);
        String string = sharedPreferences.getString("phone_number", (String) null);
        if (!C20964s0.m49090h(string)) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("account_id", string);
            edit.putInt("account_auth_type", 0);
            edit.remove("phone_number");
            edit.apply();
        }
    }

    public final String toString() {
        return "Upgrader460To461";
    }
}
