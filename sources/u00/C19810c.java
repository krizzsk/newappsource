package u00;

import android.content.Context;
import android.database.Cursor;
import c00.C13717b;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.DbEntityRef;
import com.moovit.database.StatementHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.database.sqlite.SQLiteStatement;
import com.moovit.network.model.ServerId;
import com.moovit.transit.BicycleStop;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p693nz.C18659h;
import p898wr.C20400b;
import p977zz.C20964s0;
import u00.C19806a;

/* renamed from: u00.c */
public final class C19810c extends C19806a {

    /* renamed from: c */
    public static final StatementHelper f50344c = StatementHelper.newInsertHelper("bicycle_stops", 5, "metro_id", "revision", "stop_provider_id", "stop_id", "stop_name", "stop_address", "stop_lat", "stop_lon");

    /* renamed from: d */
    public static final StatementHelper f50345d = StatementHelper.newDeleteHelper("bicycle_stops", "metro_id", "revision");

    /* renamed from: b */
    public final C18659h<ServerId, BicycleStop> f50346b = new C18659h<>(50);

    /* renamed from: u00.c$a */
    public class C19811a extends C19806a.C19807a {

        /* renamed from: d */
        public final Collection<BicycleStop> f50347d;

        public C19811a(Context context, ServerId serverId, long j, HashSet hashSet) {
            super(context, serverId, j);
            this.f50347d = hashSet;
        }

        /* renamed from: a */
        public final void mo52111a(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase) {
            int i = serverId.f15142b;
            SQLiteStatement prepare = C19810c.f50344c.prepare(sQLiteDatabase);
            for (BicycleStop next : this.f50347d) {
                C19810c.this.f50346b.put(next.f23637c, next);
                StatementHelper statementHelper = C19810c.f50344c;
                statementHelper.bindValue(prepare, "metro_id", (long) i);
                statementHelper.bindValue(prepare, "revision", j);
                statementHelper.bindValue(prepare, "stop_provider_id", (long) next.f23636b.getServerId().f15142b);
                statementHelper.bindValue(prepare, "stop_id", (long) next.f23637c.f15142b);
                statementHelper.bindValue(prepare, "stop_name", next.f23638d);
                String str = next.f23639e;
                if (str != null) {
                    statementHelper.bindValue(prepare, "stop_address", str);
                } else {
                    statementHelper.bindNullValue(prepare, "stop_address");
                }
                statementHelper.bindValue(prepare, "stop_lat", (long) next.f23640f.f40980b);
                statementHelper.bindValue(prepare, "stop_lon", (long) next.f23640f.f40981c);
                prepare.executeInsert();
            }
        }
    }

    public C19810c(C20400b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public final void mo6588a(Context context) {
        SQLiteDatabase writableDatabase = DatabaseHelper.get(context).getWritableDatabase();
        ServerId d = mo52107d();
        long f = mo52109f();
        StatementHelper statementHelper = f50345d;
        SQLiteStatement prepare = statementHelper.prepare(writableDatabase);
        statementHelper.bindWhereArg(prepare, "metro_id", d);
        statementHelper.bindWhereArg(prepare, "revision", f);
        prepare.executeUpdateDelete();
    }

    /* renamed from: c */
    public final void mo51799c() {
        this.f50346b.onLowMemory();
    }

    /* renamed from: h */
    public final Set<BicycleStop> mo52114h(Context context, Set<ServerId> set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        int size = set.size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        for (ServerId next : set) {
            BicycleStop bicycleStop = this.f50346b.get(next);
            if (bicycleStop != null) {
                hashSet.add(bicycleStop);
            } else {
                hashSet2.add(next);
            }
        }
        hashSet.size();
        if (hashSet2.isEmpty()) {
            return hashSet;
        }
        SQLiteDatabase readableDatabase = DatabaseHelper.get(context).getReadableDatabase();
        for (Collection collection : C13717b.m34262i(hashSet2)) {
            String[] createSelectionArgs = DatabaseUtils.createSelectionArgs(mo52107d(), mo52109f(), DatabaseUtils.idsToString(collection));
            Object[] objArr = {DatabaseUtils.createInClausePlaceHolders(collection.size())};
            String str = C20964s0.f52718a;
            Cursor rawQuery = readableDatabase.rawQuery(String.format((Locale) null, "SELECT stop_provider_id,stop_id,stop_name,stop_address,stop_lat,stop_lon FROM bicycle_stops WHERE metro_id = ? AND revision = ? AND stop_id IN (%s)", objArr), createSelectionArgs);
            try {
                mo52115i(hashSet, rawQuery);
                rawQuery.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        hashSet2.size();
        return hashSet;
        throw th;
    }

    /* renamed from: i */
    public final void mo52115i(HashSet hashSet, Cursor cursor) {
        String str;
        Cursor cursor2 = cursor;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("stop_provider_id");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("stop_id");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("stop_name");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("stop_address");
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("stop_lat");
        int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow("stop_lon");
        while (cursor.moveToNext()) {
            ServerId serverId = new ServerId(cursor2.getInt(columnIndexOrThrow));
            ServerId serverId2 = new ServerId(cursor2.getInt(columnIndexOrThrow2));
            String string = cursor2.getString(columnIndexOrThrow3);
            if (cursor2.isNull(columnIndexOrThrow4)) {
                str = null;
            } else {
                str = cursor2.getString(columnIndexOrThrow4);
            }
            BicycleStop bicycleStop = new BicycleStop(DbEntityRef.newBicycleProviderRef(serverId), serverId2, string, str, new LatLonE6(cursor2.getInt(columnIndexOrThrow5), cursor2.getInt(columnIndexOrThrow6)));
            this.f50346b.put(serverId2, bicycleStop);
            hashSet.add(bicycleStop);
        }
    }
}
