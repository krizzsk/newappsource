package p929xy;

import android.content.Context;
import android.content.res.Configuration;
import c70.C13752e;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.util.HashSet;
import p435de.C16596f;
import p646lz.C18299a;
import p824tp.C19722a0;
import p977zz.C20944i0;
import s00.C19393f;

/* renamed from: xy.f */
public abstract class C20663f<T> extends C20664g<T> {
    /* renamed from: k */
    public static ServerId m48573k(C18299a aVar) {
        C19722a0 a0Var = (C19722a0) aVar.mo50690c("USER_CONTEXT");
        if (a0Var == null) {
            return null;
        }
        return a0Var.f50160a.f32927c;
    }

    /* renamed from: a */
    public final Object mo46174a(Context context, Configuration configuration, C18299a aVar) {
        return new C20944i0(m48573k(aVar), mo40536l(configuration));
    }

    /* renamed from: b */
    public HashSet mo20294b(Context context) {
        HashSet b = super.mo20294b(context);
        b.add("METRO_CONTEXT");
        return b;
    }

    /* renamed from: d */
    public Object mo22058d(Context context, C18299a aVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        long j;
        ServerId k = m48573k(aVar);
        ServerId k2 = m48573k(aVar);
        if (k2 == null) {
            j = -1;
        } else {
            SQLiteDatabase readableDatabase = DatabaseHelper.get(context).getReadableDatabase();
            C19393f.f49325q.getClass();
            j = C19393f.m46693c(readableDatabase, k2);
        }
        return mo6592n(context, aVar, k, j);
    }

    /* renamed from: h */
    public final T mo50712h(Context context, C18299a aVar) throws AppDataPartLoadFailedException, IOException, ServerException {
        ServerId k = m48573k(aVar);
        if (k == null) {
            C16596f.m42113a().mo49364c(new ApplicationBugException("Metro Specific Loader data update hint without metro id"));
            return null;
        }
        SQLiteDatabase readableDatabase = DatabaseHelper.get(context).getReadableDatabase();
        C19393f fVar = C19393f.f49325q;
        fVar.getClass();
        long c = C19393f.m46693c(readableDatabase, k);
        SQLiteDatabase readableDatabase2 = DatabaseHelper.get(context).getReadableDatabase();
        fVar.getClass();
        long d = C19393f.m46694d(readableDatabase2, k);
        if (c == d) {
            return null;
        }
        if (mo20295m(context, aVar, k, d)) {
            return mo6592n(context, aVar, k, d);
        }
        return mo20296p(context, aVar, k, d);
    }

    /* renamed from: j */
    public final Object mo23772j(C18299a aVar, C13752e eVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        long j;
        ServerId k = m48573k(aVar);
        Context context = eVar.f33852a;
        ServerId k2 = m48573k(aVar);
        if (k2 == null) {
            j = -1;
        } else {
            SQLiteDatabase readableDatabase = DatabaseHelper.get(context).getReadableDatabase();
            C19393f.f49325q.getClass();
            j = C19393f.m46693c(readableDatabase, k2);
        }
        return mo6593o(eVar, aVar, k, j);
    }

    /* renamed from: l */
    public Object mo40536l(Configuration configuration) {
        return null;
    }

    /* renamed from: m */
    public boolean mo20295m(Context context, C18299a aVar, ServerId serverId, long j) {
        return false;
    }

    /* renamed from: n */
    public T mo6592n(Context context, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        return null;
    }

    /* renamed from: o */
    public T mo6593o(C13752e eVar, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        return null;
    }

    /* renamed from: p */
    public T mo20296p(Context context, C18299a aVar, ServerId serverId, long j) throws AppDataPartLoadFailedException, IOException, ServerException {
        return null;
    }
}
