package p929xy;

import android.content.Context;
import android.content.res.Configuration;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import com.moovit.database.DatabaseHelper;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import p646lz.C18299a;
import p977zz.C20930c;
import p977zz.C20943i;
import p977zz.C20975x0;
import s00.C19393f;

/* renamed from: xy.d */
public final class C20661d extends C20663f<Boolean> {
    /* renamed from: b */
    public final HashSet mo20294b(Context context) {
        HashSet b = super.mo20294b(context);
        b.add("SEARCH_CUSTOM_POI_DATA");
        return b;
    }

    /* renamed from: l */
    public final Object mo40536l(Configuration configuration) {
        return C20943i.m49050c(configuration);
    }

    /* renamed from: m */
    public final boolean mo20295m(Context context, C18299a aVar, ServerId serverId, long j) {
        return C20975x0.m49118e(C20930c.m49020b(context), (Locale) C19393f.f49325q.f49334h.mo52326c(DatabaseHelper.get(context).getReadableDatabase(), serverId, j));
    }

    /* renamed from: p */
    public final Object mo20296p(Context context, C18299a aVar, ServerId serverId, long j) throws AppDataPartLoadFailedException, IOException, ServerException {
        boolean z;
        if (!Boolean.TRUE.equals((Boolean) aVar.mo50690c("SEARCH_CUSTOM_POI_DATA")) || !mo6592n(context, aVar, serverId, j).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: q */
    public final Boolean mo6592n(Context context, C18299a aVar, ServerId serverId, long j) {
        Boolean bool = (Boolean) aVar.mo50690c("SEARCH_CUSTOM_POI_DATA");
        if (Boolean.TRUE.equals(bool) && !mo20295m(context, aVar, serverId, j)) {
            new C20660c(context, serverId, j).run();
        }
        return bool;
    }
}
