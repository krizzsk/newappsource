package p40;

import android.content.Context;
import c70.C13752e;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.offline.GtfsConfiguration;
import java.io.IOException;
import p646lz.C18299a;

/* renamed from: p40.p */
public final class C6090p extends C6066a<Boolean> {
    /* renamed from: n */
    public final Object mo6592n(Context context, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        if (((GtfsConfiguration) aVar.mo50690c("GTFS_CONFIGURATION")).mo19763c()) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* renamed from: o */
    public final Object mo6593o(C13752e eVar, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        boolean z = false;
        if (aVar.mo50695h("GTFS_DYNAMIC_DATA_DOWNLOADER", false) != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
