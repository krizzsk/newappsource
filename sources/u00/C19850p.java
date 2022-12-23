package u00;

import android.content.Context;
import android.database.Cursor;
import c00.C13717b;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseJobQueue;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.DbEntityRef;
import com.moovit.database.StatementHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.database.sqlite.SQLiteStatement;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitPattern;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p001a0.C0017h;
import p693nz.C18659h;
import p898wr.C20400b;
import p977zz.C20964s0;
import u00.C19806a;

/* renamed from: u00.p */
public final class C19850p extends C19806a {

    /* renamed from: c */
    public static final StatementHelper f50453c = StatementHelper.newInsertHelper("patterns", 5, "metro_id", "revision", "pattern_id", "pattern_stop_id", "pattern_stop_name", "pattern_stop_order_index");

    /* renamed from: d */
    public static final StatementHelper f50454d = StatementHelper.newDeleteHelper("patterns", "metro_id", "revision");

    /* renamed from: e */
    public static final String f50455e;

    /* renamed from: b */
    public final C18659h<ServerId, TransitPattern> f50456b = new C18659h<>(200);

    /* renamed from: u00.p$a */
    public class C19851a extends C19806a.C19807a {

        /* renamed from: d */
        public final Collection<TransitPattern> f50457d;

        /* renamed from: u00.p$a$a */
        public class C19852a extends DatabaseJobQueue.Job {

            /* renamed from: b */
            public final /* synthetic */ TransitPattern f50459b;

            /* renamed from: c */
            public final /* synthetic */ SQLiteStatement f50460c;

            /* renamed from: d */
            public final /* synthetic */ int f50461d;

            /* renamed from: e */
            public final /* synthetic */ long f50462e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19852a(Context context, TransitPattern transitPattern, SQLiteStatement sQLiteStatement, int i, long j) {
                super(context);
                this.f50459b = transitPattern;
                this.f50460c = sQLiteStatement;
                this.f50461d = i;
                this.f50462e = j;
            }

            public final void work(Context context, SQLiteDatabase sQLiteDatabase) {
                String str;
                for (int i = 0; i < this.f50459b.mo24389f(); i++) {
                    SQLiteStatement sQLiteStatement = this.f50460c;
                    int i2 = this.f50461d;
                    long j = this.f50462e;
                    TransitPattern transitPattern = this.f50459b;
                    StatementHelper statementHelper = C19850p.f50453c;
                    statementHelper.bindValue(sQLiteStatement, "metro_id", (long) i2);
                    statementHelper.bindValue(sQLiteStatement, "revision", j);
                    statementHelper.bindValue(sQLiteStatement, "pattern_id", transitPattern.f23708b);
                    statementHelper.bindValue(sQLiteStatement, "pattern_stop_id", transitPattern.mo24385c(i));
                    if (i < 0 || i >= transitPattern.f23710d.size()) {
                        str = null;
                    } else {
                        str = transitPattern.f23710d.get(i);
                    }
                    statementHelper.bindValue(sQLiteStatement, "pattern_stop_name", str);
                    statementHelper.bindValue(sQLiteStatement, "pattern_stop_order_index", (long) i);
                    this.f50460c.executeInsert();
                }
            }
        }

        public C19851a(Context context, ServerId serverId, long j, HashSet hashSet) {
            super(context, serverId, j);
            this.f50457d = hashSet;
        }

        /* renamed from: a */
        public final void mo52111a(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase) {
            int i = serverId.f15142b;
            SQLiteStatement prepare = C19850p.f50453c.prepare(sQLiteDatabase);
            for (TransitPattern next : this.f50457d) {
                C19850p.this.f50456b.put(next.f23708b, next);
                new C19852a(context, next, prepare, i, j).run();
            }
        }
    }

    static {
        StringBuilder k = C13555b.m33972k("INSERT ");
        k.append(DatabaseUtils.getConflictAlgorithm(4));
        k.append(" INTO ");
        k.append("patterns");
        k.append(" (");
        k.append("metro_id");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "revision", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "pattern_id");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "pattern_stop_id", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "pattern_stop_name");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "pattern_stop_order_index", ") SELECT ", "metro_id");
        C0017h.m61R(k, ",? ,", "pattern_id", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "pattern_stop_id");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "pattern_stop_name", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "pattern_stop_order_index");
        C0017h.m61R(k, " FROM ", "patterns", " WHERE ", "metro_id");
        f50455e = C13715c.m34245k(k, " = ? AND ", "revision", " = ?");
    }

    public C19850p(C20400b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public final void mo6588a(Context context) {
        SQLiteDatabase writableDatabase = DatabaseHelper.get(context).getWritableDatabase();
        ServerId d = mo52107d();
        long f = mo52109f();
        StatementHelper statementHelper = f50454d;
        SQLiteStatement prepare = statementHelper.prepare(writableDatabase);
        statementHelper.bindWhereArg(prepare, "metro_id", d);
        statementHelper.bindWhereArg(prepare, "revision", f);
        prepare.executeUpdateDelete();
    }

    /* renamed from: c */
    public final void mo51799c() {
        this.f50456b.onLowMemory();
    }

    /* renamed from: h */
    public final Set<TransitPattern> mo52151h(Context context, Set<ServerId> set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        int size = set.size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        for (ServerId next : set) {
            TransitPattern transitPattern = this.f50456b.get(next);
            if (transitPattern != null) {
                hashSet.add(transitPattern);
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
            Object[] objArr = {DatabaseUtils.createInClausePlaceHolders(collection.size())};
            String str = C20964s0.f52718a;
            Cursor rawQuery = readableDatabase.rawQuery(String.format((Locale) null, "SELECT pattern_id,pattern_stop_id,pattern_stop_name FROM patterns WHERE metro_id = ? AND revision = ? AND pattern_id IN (%s) ORDER BY pattern_id,pattern_stop_order_index ASC", objArr), DatabaseUtils.createSelectionArgs(mo52107d(), mo52109f(), DatabaseUtils.idsToString(collection)));
            if (rawQuery.moveToFirst()) {
                int columnIndex = rawQuery.getColumnIndex("pattern_id");
                int columnIndex2 = rawQuery.getColumnIndex("pattern_stop_id");
                int columnIndex3 = rawQuery.getColumnIndex("pattern_stop_name");
                int i = rawQuery.getInt(columnIndex);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                do {
                    int i2 = rawQuery.getInt(columnIndex);
                    if (i2 != i) {
                        ServerId serverId = new ServerId(i);
                        TransitPattern transitPattern2 = new TransitPattern(serverId, arrayList, arrayList2);
                        this.f50456b.put(serverId, transitPattern2);
                        hashSet.add(transitPattern2);
                        arrayList.clear();
                        arrayList2.clear();
                        i = i2;
                    }
                    arrayList.add(DbEntityRef.newTransitStopRef(new ServerId(rawQuery.getInt(columnIndex2))));
                    arrayList2.add(rawQuery.getString(columnIndex3));
                } while (rawQuery.moveToNext());
                ServerId serverId2 = new ServerId(i);
                TransitPattern transitPattern3 = new TransitPattern(serverId2, arrayList, arrayList2);
                this.f50456b.put(serverId2, transitPattern3);
                hashSet.add(transitPattern3);
            }
            rawQuery.close();
        }
        hashSet2.size();
        return hashSet;
    }
}
