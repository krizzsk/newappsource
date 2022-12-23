package p929xy;

import android.content.Context;
import android.content.res.Configuration;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import p646lz.C18299a;
import p824tp.C19731i;
import p977zz.C20930c;
import p977zz.C20943i;
import p977zz.C20975x0;
import s00.C19393f;
import u00.C19826h;

/* renamed from: xy.j */
public final class C20670j extends C20663f<Boolean> {
    /* renamed from: b */
    public final HashSet mo20294b(Context context) {
        HashSet b = super.mo20294b(context);
        b.add("SEARCH_LINE_DATA");
        return b;
    }

    /* renamed from: l */
    public final Object mo40536l(Configuration configuration) {
        return C20943i.m49050c(configuration);
    }

    /* renamed from: m */
    public final boolean mo20295m(Context context, C18299a aVar, ServerId serverId, long j) {
        return C20975x0.m49118e(C20930c.m49020b(context), (Locale) C19393f.f49325q.f49332f.mo52326c(DatabaseHelper.get(context).getReadableDatabase(), serverId, j));
    }

    /* renamed from: p */
    public final Object mo20296p(Context context, C18299a aVar, ServerId serverId, long j) throws AppDataPartLoadFailedException, IOException, ServerException {
        return mo6592n(context, aVar, serverId, j);
    }

    /* renamed from: q */
    public final Boolean mo6592n(Context context, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        if (!mo20295m(context, aVar, serverId, j)) {
            SQLiteDatabase writableDatabase = DatabaseHelper.get(context).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                C19826h g = C19731i.m47197a(context).mo52084b(serverId, j).mo51805g();
                new C19826h.C19833g(context, g.mo52107d(), g.mo52109f()).run();
                C19393f fVar = C19393f.f49325q;
                fVar.f49332f.mo52327f(writableDatabase, serverId, j, C20930c.m49020b(context));
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        }
        return Boolean.TRUE;
    }
}
