package p40;

import android.content.Context;
import c70.C13752e;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import com.moovit.offline.GtfsConfiguration;
import java.io.IOException;
import java.util.HashSet;
import l40.C5605d;
import p646lz.C18299a;
import p824tp.C19731i;
import p929xy.C20664g;
import s00.C19393f;
import v00.C20062a;

/* renamed from: p40.e */
public abstract class C6071e extends C6066a<Boolean> {

    /* renamed from: c */
    public final int f19325c;

    public C6071e(int i) {
        this.f19325c = i;
    }

    /* renamed from: b */
    public HashSet mo20294b(Context context) {
        HashSet b = super.mo20294b(context);
        b.add("GTFS_STATIC_DATA_DOWNLOADER");
        return b;
    }

    /* renamed from: m */
    public final boolean mo20295m(Context context, C18299a aVar, ServerId serverId, long j) {
        boolean z;
        int i = this.f19325c;
        if ((((GtfsConfiguration) aVar.mo50690c("GTFS_CONFIGURATION")).f15147b & i) == i) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        C19393f fVar = C19393f.f49325q;
        if (Boolean.TRUE.equals(mo22056q(fVar).mo52326c(DatabaseHelper.get(context).getReadableDatabase(), serverId, j))) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final Object mo6592n(Context context, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        boolean z;
        int i = this.f19325c;
        if ((((GtfsConfiguration) aVar.mo50690c("GTFS_CONFIGURATION")).f15147b & i) == i) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return Boolean.FALSE;
        }
        C19393f fVar = C19393f.f49325q;
        SQLiteDatabase readableDatabase = DatabaseHelper.get(context).getReadableDatabase();
        Boolean bool = Boolean.TRUE;
        if (bool.equals(mo22056q(fVar).mo52326c(readableDatabase, serverId, j))) {
            return bool;
        }
        return null;
    }

    /* renamed from: p */
    public final Object mo20296p(Context context, C18299a aVar, ServerId serverId, long j) throws AppDataPartLoadFailedException, IOException, ServerException {
        return mo6593o(C20664g.m48584i(context, aVar), aVar, serverId, j);
    }

    /* renamed from: q */
    public abstract C20062a mo22056q(C19393f fVar);

    /* renamed from: r */
    public final Boolean mo6593o(C13752e eVar, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException {
        Context context = eVar.f33852a;
        ServerId serverId2 = serverId;
        C5605d dVar = new C5605d(C19731i.m47197a(context).mo52084b(serverId, j).mo51802d().mo52118j(context, false));
        SQLiteDatabase writableDatabase = DatabaseHelper.get(context).getWritableDatabase();
        writableDatabase.beginTransactionNonExclusive();
        try {
            mo22057s(context, serverId, j, writableDatabase, dVar);
            try {
                C20062a q = mo22056q(C19393f.f49325q);
                Boolean bool = Boolean.TRUE;
                q.mo52327f(writableDatabase, serverId, j, bool);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return bool;
            } catch (Throwable th) {
                th = th;
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            writableDatabase.endTransaction();
            throw th;
        }
    }

    /* renamed from: s */
    public abstract void mo22057s(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase, C5605d dVar) throws IOException, AppDataPartLoadFailedException;
}
