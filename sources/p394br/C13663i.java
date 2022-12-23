package p394br;

import android.content.Context;
import android.graphics.Point;
import c70.C13752e;
import c70.C13772m;
import c70.C13777q;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseJobQueue;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.map.items.C16284b;
import com.moovit.map.items.MapItem;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.mapitems.MVMapItemsResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.thrift.TBase;
import p567iq.C17635b;
import p646lz.C18299a;
import p824tp.C19728f;
import p874vr.C20199a;
import p929xy.C20663f;
import p929xy.C20664g;
import p977zz.C20944i0;
import q00.C19047a;
import s00.C19393f;
import t00.C19623b;
import u00.C19819f;

/* renamed from: br.i */
public final class C13663i extends C20663f<Boolean> {

    /* renamed from: br.i$a */
    public class C13664a extends DatabaseJobQueue.Job {

        /* renamed from: b */
        public final /* synthetic */ ServerId f33695b;

        /* renamed from: c */
        public final /* synthetic */ long f33696c;

        /* renamed from: d */
        public final /* synthetic */ List f33697d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13664a(Context context, ServerId serverId, long j, ArrayList arrayList) {
            super(context);
            this.f33695b = serverId;
            this.f33696c = j;
            this.f33697d = arrayList;
        }

        public final void work(Context context, SQLiteDatabase sQLiteDatabase) {
            C19819f fVar = (C19819f) C17635b.m43779f(context).mo52084b(this.f33695b, this.f33696c).mo51794a(C19819f.class);
            for (C20944i0 i0Var : this.f33697d) {
                fVar.mo52128i(context, MapItem.Type.STOP, (Point) i0Var.f52692a, (Collection) i0Var.f52693b);
            }
            C19393f.f49325q.f49330d.mo52327f(sQLiteDatabase, this.f33695b, this.f33696c, Boolean.TRUE);
        }
    }

    /* renamed from: br.i$b */
    public static class C13665b extends C13777q<C13665b, MVMapItemsResponse, C20944i0<Point, List<MapItem>>> {
        public C13665b() {
            super(MVMapItemsResponse.class);
        }

        /* renamed from: e */
        public final Object mo40535e(TBase tBase) throws BadResponseException {
            MVMapItemsResponse mVMapItemsResponse = (MVMapItemsResponse) tBase;
            return new C20944i0(new Point(mVMapItemsResponse.tileX, mVMapItemsResponse.tileY), C16284b.m41531q(MapItem.Type.STOP, mVMapItemsResponse));
        }
    }

    /* renamed from: m */
    public final boolean mo20295m(Context context, C18299a aVar, ServerId serverId, long j) {
        SQLiteDatabase readableDatabase = DatabaseHelper.get(context).getReadableDatabase();
        if (Boolean.TRUE.equals(C19393f.f49325q.f49330d.mo52326c(readableDatabase, serverId, j))) {
            return true;
        }
        C19047a aVar2 = (C19047a) aVar.mo50690c("CONFIGURATION");
        if (aVar2 == null) {
            C17635b.m43779f(context).f50175e.mo51800c().getClass();
            aVar2 = C19623b.m47059e(readableDatabase, serverId);
        }
        if (aVar2 == null || !((Boolean) aVar2.mo51505b(C20199a.f51280i0)).booleanValue()) {
            return true;
        }
        return false;
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
        return mo6593o(C20664g.m48584i(context, aVar), aVar, serverId, j);
    }

    /* renamed from: q */
    public final Boolean mo6593o(C13752e eVar, C18299a aVar, ServerId serverId, long j) throws IOException, ServerException {
        C13665b bVar = (C13665b) new C13772m(eVar, C13772m.m34412M(eVar.f33852a, R.string.api_path_metro_preloaded_stop_map_items_path, "0", eVar.f33853b, (C19728f) aVar.mo50690c("METRO_CONTEXT")), C13665b.class).mo52626J();
        if (bVar.mo52635a()) {
            ArrayList arrayList = bVar.f33921g;
            arrayList.size();
            new C13664a(eVar.f33852a, serverId, j, arrayList).run();
        }
        return Boolean.TRUE;
    }
}
