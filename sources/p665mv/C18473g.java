package p665mv;

import android.content.Context;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import java.util.HashSet;
import p646lz.C18299a;
import p874vr.C20199a;
import p929xy.C20664g;
import q00.C19047a;

/* renamed from: mv.g */
public final class C18473g extends C20664g<Boolean> {
    /* renamed from: b */
    public final HashSet mo20294b(Context context) {
        HashSet b = super.mo20294b(context);
        b.add("CONFIGURATION");
        b.add("RIDE_SHARING_SUPPORT_VALIDATOR");
        return b;
    }

    /* renamed from: f */
    public final Object mo6591f(Context context, C18299a aVar, String str) throws IOException, AppDataPartLoadFailedException, ServerException {
        C19047a aVar2 = (C19047a) aVar.mo50690c("CONFIGURATION");
        if (aVar2 != null && ((Boolean) aVar2.mo51505b(C20199a.f51302t0)).booleanValue()) {
            return Boolean.TRUE;
        }
        throw new AppDataPartLoadFailedException("Ride sharing events not supported in the current metro configuration.", (String) null, (Throwable) null);
    }
}
