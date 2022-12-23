package p856ux;

import c70.C13752e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import x90.C13242b;

/* renamed from: ux.f */
public final class C20016f implements C13242b {
    /* renamed from: a */
    public final void mo40113a(C13752e eVar) throws BadResponseException, ServerException, IOException {
        eVar.f33852a.getSharedPreferences("trip_plan_prefs", 0).edit().clear().apply();
    }

    public final String toString() {
        return "Upgrader132To133";
    }
}
