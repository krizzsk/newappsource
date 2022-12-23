package u00;

import android.content.Context;
import android.database.Cursor;
import c00.C13717b;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.StatementHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.database.sqlite.SQLiteStatement;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitFrequency;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import p693nz.C18659h;
import p898wr.C20400b;
import p977zz.C20950l0;
import p977zz.C20964s0;
import u00.C19806a;

/* renamed from: u00.n */
public final class C19846n extends C19806a {

    /* renamed from: c */
    public static final StatementHelper f50438c = StatementHelper.newInsertHelper("transit_frequencies", 5, "metro_id", "revision", "transit_frequency_id", "min_interval_in_seconds", "max_interval_in_seconds", "min_window_in_seconds", "max_window_in_seconds");

    /* renamed from: d */
    public static final StatementHelper f50439d = StatementHelper.newDeleteHelper("transit_frequencies", "metro_id", "revision");

    /* renamed from: b */
    public final C18659h<ServerId, TransitFrequency> f50440b = new C18659h<>(50);

    /* renamed from: u00.n$a */
    public class C19847a extends C19806a.C19807a {

        /* renamed from: d */
        public final Collection<TransitFrequency> f50441d;

        public C19847a(Context context, ServerId serverId, long j, HashSet hashSet) {
            super(context, serverId, j);
            this.f50441d = hashSet;
        }

        /* renamed from: a */
        public final void mo52111a(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase) {
            int i = serverId.f15142b;
            SQLiteStatement prepare = C19846n.f50438c.prepare(sQLiteDatabase);
            for (TransitFrequency next : this.f50441d) {
                ServerId serverId2 = next.f23679b;
                C19846n.this.f50440b.put(serverId2, next);
                for (int i2 = 0; i2 < next.f23680c.size(); i2++) {
                    C20950l0 l0Var = next.f23680c.get(i2);
                    C20950l0 l0Var2 = next.f23681d.get(i2);
                    StatementHelper statementHelper = C19846n.f50438c;
                    statementHelper.bindValue(prepare, "metro_id", (long) i);
                    statementHelper.bindValue(prepare, "revision", j);
                    statementHelper.bindValue(prepare, "transit_frequency_id", (long) serverId2.f15142b);
                    statementHelper.bindValue(prepare, "min_interval_in_seconds", (long) ((Integer) l0Var2.f52695a).intValue());
                    statementHelper.bindValue(prepare, "max_interval_in_seconds", (long) ((Integer) l0Var2.f52696b).intValue());
                    statementHelper.bindValue(prepare, "min_window_in_seconds", (long) ((Integer) l0Var.f52695a).intValue());
                    statementHelper.bindValue(prepare, "max_window_in_seconds", (long) ((Integer) l0Var.f52696b).intValue());
                    prepare.executeInsert();
                }
            }
        }
    }

    public C19846n(C20400b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public final void mo6588a(Context context) {
        SQLiteDatabase writableDatabase = DatabaseHelper.get(context).getWritableDatabase();
        ServerId d = mo52107d();
        long f = mo52109f();
        StatementHelper statementHelper = f50439d;
        SQLiteStatement prepare = statementHelper.prepare(writableDatabase);
        statementHelper.bindWhereArg(prepare, "metro_id", d);
        statementHelper.bindWhereArg(prepare, "revision", f);
        prepare.executeUpdateDelete();
        Objects.toString(d);
    }

    /* renamed from: c */
    public final void mo51799c() {
        this.f50440b.onLowMemory();
    }

    /* renamed from: h */
    public final Set<TransitFrequency> mo52147h(Context context, Set<ServerId> set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        int size = set.size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        for (ServerId next : set) {
            TransitFrequency transitFrequency = this.f50440b.get(next);
            if (transitFrequency != null) {
                hashSet.add(transitFrequency);
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
            Cursor rawQuery = readableDatabase.rawQuery(String.format((Locale) null, "SELECT transit_frequency_id,min_interval_in_seconds,max_interval_in_seconds,min_window_in_seconds,max_window_in_seconds FROM transit_frequencies WHERE metro_id = ? AND revision = ? AND transit_frequency_id IN (%s) ORDER BY transit_frequency_id,min_window_in_seconds", objArr), createSelectionArgs);
            try {
                mo52148i(hashSet, rawQuery);
            } finally {
                rawQuery.close();
            }
        }
        hashSet2.size();
        return hashSet;
    }

    /* renamed from: i */
    public final void mo52148i(HashSet hashSet, Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("transit_frequency_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("min_interval_in_seconds");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("max_interval_in_seconds");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("min_window_in_seconds");
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("max_window_in_seconds");
        ServerId serverId = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (cursor.moveToNext()) {
            ServerId serverId2 = new ServerId(cursor.getInt(columnIndexOrThrow));
            if (!serverId2.equals(serverId)) {
                if (serverId != null) {
                    TransitFrequency transitFrequency = new TransitFrequency(serverId2, arrayList, arrayList2);
                    this.f50440b.put(serverId2, transitFrequency);
                    hashSet.add(transitFrequency);
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList2 = new ArrayList();
                arrayList = arrayList3;
            }
            arrayList.add(new C20950l0(Integer.valueOf(cursor.getInt(columnIndexOrThrow4)), Integer.valueOf(cursor.getInt(columnIndexOrThrow5))));
            arrayList2.add(new C20950l0(Integer.valueOf(cursor.getInt(columnIndexOrThrow2)), Integer.valueOf(cursor.getInt(columnIndexOrThrow3))));
            serverId = serverId2;
        }
        if (serverId != null) {
            TransitFrequency transitFrequency2 = new TransitFrequency(serverId, arrayList, arrayList2);
            this.f50440b.put(serverId, transitFrequency2);
            hashSet.add(transitFrequency2);
        }
    }
}
