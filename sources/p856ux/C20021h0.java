package p856ux;

import c70.C13752e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import x90.C13242b;

/* renamed from: ux.h0 */
public final class C20021h0 implements C13242b {
    /* renamed from: a */
    public final void mo40113a(C13752e eVar) throws BadResponseException, ServerException, IOException {
        eVar.f33852a.getSharedPreferences("user_onboarding", 0).edit().remove("user_group").apply();
    }

    public final String toString() {
        return "Upgrader533To534";
    }
}
