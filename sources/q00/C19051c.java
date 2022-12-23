package q00;

import android.content.Context;
import android.content.SharedPreferences;
import c70.C13752e;
import c70.C13772m;
import c70.C13779s;
import com.moovit.MoovitExecutors;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.database.DatabaseHelper;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.conf.MVPropertiesConfiguration;
import f00.C16919g;
import java.io.IOException;
import org.apache.thrift.TBase;
import p217q2.C6160i;
import p401bz.C13707a;
import p646lz.C18299a;
import p824tp.C19722a0;
import p824tp.C19728f;
import p824tp.C19731i;
import p824tp.C19746x;
import p929xy.C20664g;
import t00.C19623b;

/* renamed from: q00.c */
public final class C19051c extends C20664g<C19047a> {

    /* renamed from: c */
    public static final C16919g.C16925f f48448c = new C16919g.C16925f("conf_last_modified", -1);

    /* renamed from: q00.c$a */
    public static class C19052a extends C13779s<C19052a, MVPropertiesConfiguration, C19047a> {
        public C19052a() {
            super(MVPropertiesConfiguration.class);
        }

        /* renamed from: e */
        public final Object mo23773e(TBase tBase) throws BadResponseException {
            MVPropertiesConfiguration mVPropertiesConfiguration = (MVPropertiesConfiguration) tBase;
            return new C19047a(mVPropertiesConfiguration.version, mVPropertiesConfiguration.properties);
        }
    }

    /* renamed from: k */
    public static C19047a m46170k(C13752e eVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        Context context = eVar.f33852a;
        Context context2 = context;
        C19052a aVar = (C19052a) new C13772m(eVar, C13772m.m34411L(context2, C19746x.server_path_cdn_server_url, C19746x.api_path_configuration_path, "", eVar.f33853b, (C19728f) null), C19052a.class).mo52626J();
        C19047a aVar2 = (C19047a) aVar.f33924g;
        if (aVar.mo52635a()) {
            f48448c.mo49545d(context.getSharedPreferences("configuration_loader_prefs", 0), Long.valueOf(aVar.f51776e));
            new C19050b(context, eVar.f33853b.f50160a.f32927c, aVar2).run();
        }
        return aVar2;
    }

    /* renamed from: d */
    public final Object mo22058d(Context context, C18299a aVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        ServerId serverId = ((C19722a0) aVar.mo50690c("USER_CONTEXT")).f50160a.f32927c;
        C19731i.m47197a(context).f50175e.mo51800c().getClass();
        C19047a e = C19623b.m47059e(DatabaseHelper.get(context).getReadableDatabase(), serverId);
        if (e != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("configuration_loader_prefs", 0);
            C16919g.C16925f fVar = f48448c;
            if (fVar.mo19759a(sharedPreferences).longValue() != -1) {
                C19731i.m47197a(context).f50172b.mo42913b(new C13707a(context, fVar.mo19759a(sharedPreferences).longValue(), System.currentTimeMillis()), false);
                fVar.getClass();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                fVar.mo49539b(edit);
                edit.apply();
            }
            MoovitExecutors.f37327IO.execute(new C6160i(5, this, C20664g.m48584i(context, aVar), aVar));
        }
        return e;
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Object mo23772j(C18299a aVar, C13752e eVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        return m46170k(eVar);
    }
}
