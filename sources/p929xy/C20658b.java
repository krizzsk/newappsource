package p929xy;

import android.content.Context;
import c70.C13752e;
import c70.C13772m;
import c70.C13777q;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.search.MVPOISearchItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import org.apache.thrift.TBase;
import p646lz.C18299a;
import p824tp.C19728f;
import p824tp.C19746x;
import q00.C19047a;
import q00.C19053d;
import s00.C19393f;

/* renamed from: xy.b */
public final class C20658b extends C20663f<Boolean> {

    /* renamed from: xy.b$a */
    public static class C20659a extends C13777q<C20659a, MVPOISearchItem, MVPOISearchItem> {
        public C20659a() {
            super(MVPOISearchItem.class);
        }

        /* renamed from: e */
        public final Object mo40535e(TBase tBase) throws BadResponseException {
            return (MVPOISearchItem) tBase;
        }
    }

    /* renamed from: b */
    public final HashSet mo20294b(Context context) {
        HashSet b = super.mo20294b(context);
        b.add("CONFIGURATION");
        return b;
    }

    /* renamed from: m */
    public final boolean mo20295m(Context context, C18299a aVar, ServerId serverId, long j) {
        SQLiteDatabase readableDatabase = DatabaseHelper.get(context).getReadableDatabase();
        return Boolean.TRUE.equals(C19393f.f49325q.f49329c.mo52326c(readableDatabase, serverId, j));
    }

    /* renamed from: n */
    public final Object mo6592n(Context context, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        if (!((Boolean) ((C19047a) aVar.mo50690c("CONFIGURATION")).mo51505b(C19053d.f48460L)).booleanValue()) {
            return Boolean.FALSE;
        }
        if (mo20295m(context, aVar, serverId, j)) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* renamed from: p */
    public final Object mo20296p(Context context, C18299a aVar, ServerId serverId, long j) throws AppDataPartLoadFailedException, IOException, ServerException {
        if (!((Boolean) ((C19047a) aVar.mo50690c("CONFIGURATION")).mo51505b(C19053d.f48460L)).booleanValue()) {
            return Boolean.FALSE;
        }
        return mo6593o(C20664g.m48584i(context, aVar), aVar, serverId, j);
    }

    /* renamed from: q */
    public final Boolean mo6593o(C13752e eVar, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        Context context = eVar.f33852a;
        C20659a aVar2 = (C20659a) new C13772m(eVar, C13772m.m34412M(context, C19746x.api_path_custom_poi_path, "0", eVar.f33853b, (C19728f) aVar.mo50690c("METRO_CONTEXT")), C20659a.class).mo52626J();
        ArrayList arrayList = aVar2.f33921g;
        if (aVar2.mo52635a() && arrayList != null) {
            new C20657a(context, serverId, j, arrayList).run();
        }
        return Boolean.TRUE;
    }
}
