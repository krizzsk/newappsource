package p40;

import android.content.Context;
import c70.C13752e;
import com.moovit.MoovitApplication;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.offline.GtfsConfiguration;
import java.io.IOException;
import l40.C5603c;
import p646lz.C18299a;
import p824tp.C19728f;
import p824tp.C19731i;
import p929xy.C20664g;
import p977zz.C20947k;

/* renamed from: p40.d */
public final class C6070d extends C6066a<Boolean> {
    /* renamed from: m */
    public final boolean mo20295m(Context context, C18299a aVar, ServerId serverId, long j) {
        boolean z;
        GtfsConfiguration gtfsConfiguration = (GtfsConfiguration) aVar.mo50690c("GTFS_CONFIGURATION");
        if (gtfsConfiguration.f15147b == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return C19731i.m47197a(context).mo52084b(serverId, j).mo51802d().mo52120l(gtfsConfiguration.f15147b & 192, context);
    }

    /* renamed from: n */
    public final Object mo6592n(Context context, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        if (mo20295m(context, aVar, serverId, j)) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* renamed from: p */
    public final Object mo20296p(Context context, C18299a aVar, ServerId serverId, long j) throws AppDataPartLoadFailedException, IOException, ServerException {
        MoovitApplication.f37317k.getClass();
        if (MoovitApplication.m36934n() || C20947k.m49057b(context)) {
            return null;
        }
        return mo6593o(C20664g.m48584i(context, aVar), aVar, serverId, j);
    }

    /* renamed from: q */
    public final Boolean mo6593o(C13752e eVar, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        try {
            return Boolean.valueOf(new C5603c(eVar.f33852a, serverId, j, ((C19728f) aVar.mo50690c("METRO_CONTEXT")).f50165a.f16128c, ((GtfsConfiguration) aVar.mo50690c("GTFS_CONFIGURATION")).f15147b & 192, true).call().booleanValue());
        } catch (Exception e) {
            throw new IOException("Failed to download dynamic GTFS files!", e);
        }
    }
}
