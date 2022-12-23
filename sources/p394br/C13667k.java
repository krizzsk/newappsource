package p394br;

import aa0.C7538j;
import android.content.Context;
import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13752e;
import c70.C13780t;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import com.moovit.offline.GtfsConfiguration;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.sync.MVOfflineLineGroups;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import org.apache.thrift.TBase;
import p009a8.C0112l;
import p567iq.C17635b;
import p646lz.C18299a;
import p898wr.C20400b;
import p929xy.C20663f;
import p945yr.C20755a;
import s00.C19393f;

/* renamed from: br.k */
public final class C13667k extends C20663f<List<ServerId>> {

    /* renamed from: br.k$a */
    public static class C13668a extends C13746a<C13668a, C13669b> {
        public C13668a(C13752e eVar, ServerId serverId, long j) {
            super(eVar, R.string.server_path_cdn_server_url, R.string.api_path_syncable_transit_line_group_ids_path, false, C13669b.class);
            mo52629r("metroId", serverId.mo19751c());
            mo52628q(j);
        }
    }

    /* renamed from: br.k$b */
    public static class C13669b extends C13780t<C13668a, C13669b, MVOfflineLineGroups> {

        /* renamed from: m */
        public ArrayList f33701m = null;

        public C13669b() {
            super(MVOfflineLineGroups.class);
        }

        /* renamed from: l */
        public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
            C13668a aVar2 = (C13668a) aVar;
            ArrayList<O> c = C13720d.m34273c(((MVOfflineLineGroups) tBase).lineGroupIds, (C13722f) null, new C0112l(0));
            this.f33701m = c;
            LinkedHashSet linkedHashSet = new LinkedHashSet(c);
            if (c.size() != linkedHashSet.size()) {
                c.clear();
                c.addAll(linkedHashSet);
            }
        }
    }

    /* renamed from: b */
    public final HashSet mo20294b(Context context) {
        HashSet b = super.mo20294b(context);
        b.add("GTFS_CONFIGURATION");
        return b;
    }

    /* renamed from: m */
    public final boolean mo20295m(Context context, C18299a aVar, ServerId serverId, long j) {
        boolean z;
        if ((((GtfsConfiguration) aVar.mo50690c("GTFS_CONFIGURATION")).f15147b & 1231) == 1231) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        SQLiteDatabase readableDatabase = DatabaseHelper.get(context).getReadableDatabase();
        return Boolean.TRUE.equals(C19393f.f49325q.f49331e.mo52326c(readableDatabase, serverId, j));
    }

    /* renamed from: n */
    public final Object mo6592n(Context context, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        if (!mo20295m(context, aVar, serverId, j)) {
            return null;
        }
        C7538j<ServerId> h = ((C20755a) ((C20400b) C17635b.m43779f(context).mo52084b(serverId, j)).mo51794a(C20755a.class)).mo52891h(context);
        h.mo51499b();
        return Collections.unmodifiableList(h.f48432b);
    }

    /* renamed from: o */
    public final Object mo6593o(C13752e eVar, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        ArrayList arrayList = ((C13669b) new C13668a(eVar, serverId, j).mo52626J()).f33701m;
        if (arrayList == null) {
            return null;
        }
        arrayList.size();
        new C13666j(eVar.f33852a, serverId, j, arrayList).run();
        return arrayList;
    }
}
