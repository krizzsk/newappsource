package p929xy;

import android.content.Context;
import c70.C13752e;
import c70.C13772m;
import c70.C13777q;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseJobQueue;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.search.MVSearchLineGroupSection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.apache.thrift.TBase;
import p646lz.C18299a;
import p824tp.C19728f;
import p824tp.C19731i;
import p824tp.C19746x;
import p977zz.C20930c;
import q00.C19047a;
import q00.C19053d;
import s00.C19393f;
import u00.C19826h;

/* renamed from: xy.i */
public final class C20667i extends C20663f<Boolean> {

    /* renamed from: xy.i$a */
    public class C20668a extends DatabaseJobQueue.Job {

        /* renamed from: b */
        public final /* synthetic */ ServerId f52233b;

        /* renamed from: c */
        public final /* synthetic */ long f52234c;

        /* renamed from: d */
        public final /* synthetic */ List f52235d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20668a(Context context, ServerId serverId, long j, ArrayList arrayList) {
            super(context);
            this.f52233b = serverId;
            this.f52234c = j;
            this.f52235d = arrayList;
        }

        public final void work(Context context, SQLiteDatabase sQLiteDatabase) {
            C19826h g = C19731i.m47197a(context).mo52084b(this.f52233b, this.f52234c).mo51805g();
            Context context2 = context;
            new C19826h.C19831e(context2, g.mo52107d(), g.mo52109f(), this.f52235d).run();
            C19393f fVar = C19393f.f49325q;
            fVar.f49328b.mo52327f(sQLiteDatabase, this.f52233b, this.f52234c, Boolean.TRUE);
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            fVar.f49332f.mo52327f(sQLiteDatabase2, this.f52233b, this.f52234c, C20930c.m49020b(context));
        }
    }

    /* renamed from: xy.i$b */
    public static class C20669b extends C13777q<C20669b, MVSearchLineGroupSection, MVSearchLineGroupSection> {
        public C20669b() {
            super(MVSearchLineGroupSection.class);
        }

        /* renamed from: e */
        public final Object mo40535e(TBase tBase) throws BadResponseException {
            return (MVSearchLineGroupSection) tBase;
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
        return Boolean.TRUE.equals(C19393f.f49325q.f49328b.mo52326c(readableDatabase, serverId, j));
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
    public final Boolean mo6593o(C13752e eVar, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        int i;
        if (((Boolean) ((C19047a) aVar.mo50690c("CONFIGURATION")).mo51505b(C19053d.f48451C)).booleanValue()) {
            i = C19746x.api_path_metro_preloaded_specific_line_search_path;
        } else {
            i = C19746x.api_path_metro_preloaded_line_search_path;
        }
        C20669b bVar = (C20669b) new C13772m(eVar, C13772m.m34412M(eVar.f33852a, i, "0", eVar.f33853b, (C19728f) aVar.mo50690c("METRO_CONTEXT")), C20669b.class).mo52626J();
        ArrayList arrayList = bVar.f33921g;
        if (bVar.mo52635a() && arrayList != null) {
            arrayList.size();
            new C20668a(eVar.f33852a, serverId, j, arrayList).run();
        }
        return Boolean.TRUE;
    }
}
