package p856ux;

import android.content.Context;
import android.content.SharedPreferences;
import c70.C13752e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import x90.C13242b;

/* renamed from: ux.r */
public final class C20033r implements C13242b {
    /* renamed from: a */
    public final void mo40113a(C13752e eVar) throws BadResponseException, ServerException, IOException {
        Context context = eVar.f33852a;
        context.deleteDatabase("nutiteq.db");
        SharedPreferences sharedPreferences = context.getSharedPreferences("favorites_setup", 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().clear().apply();
        }
    }

    public final String toString() {
        return "Upgrader333To334";
    }
}
