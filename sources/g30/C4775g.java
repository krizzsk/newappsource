package g30;

import android.content.Context;
import ce0.C21100e;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import java.util.UUID;
import p435de.C16596f;
import p646lz.C18299a;
import p929xy.C20663f;
import s00.C19393f;

/* renamed from: g30.g */
public final class C4775g extends C20663f<Boolean> {

    /* renamed from: c */
    public final UUID f16125c;

    public C4775g(UUID uuid) {
        C21100e.m49373x(uuid, "appDataManagerId");
        this.f16125c = uuid;
    }

    /* renamed from: f */
    public final Object mo6591f(Context context, C18299a aVar, String str) throws IOException, AppDataPartLoadFailedException, ServerException {
        try {
            Boolean bool = Boolean.FALSE;
            if (!this.f16125c.equals(aVar.f46663b)) {
                return bool;
            }
            C19393f.f49325q.getClass();
            C19393f.m46692b(context);
            return Boolean.TRUE;
        } catch (Throwable th) {
            C16596f.m42113a().mo49364c(new AppDataPartLoadFailedException("Failed to perform cleanup!", (String) null, th));
            throw new AppDataPartLoadFailedException(th, (String) null, th);
        }
    }
}
