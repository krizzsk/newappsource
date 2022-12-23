package u00;

import android.content.Context;
import android.database.Cursor;
import c00.C13717b;
import com.moovit.commons.geo.Polylon;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.StatementHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.database.sqlite.SQLiteStatement;
import com.moovit.network.model.ServerId;
import com.moovit.transit.ShapeSegment;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p693nz.C18659h;
import p898wr.C20400b;
import p977zz.C20964s0;
import u00.C19806a;

/* renamed from: u00.k */
public final class C19840k extends C19806a {

    /* renamed from: c */
    public static final StatementHelper f50424c = StatementHelper.newInsertHelper("shape_segments", 5, "metro_id", "revision", "segment_id", "from_stop_id", "to_stop_id", "segment_polyline");

    /* renamed from: d */
    public static final StatementHelper f50425d = StatementHelper.newDeleteHelper("shape_segments", "metro_id", "revision");

    /* renamed from: b */
    public final C18659h<ServerId, ShapeSegment> f50426b = new C18659h<>(1000);

    /* renamed from: u00.k$a */
    public class C19841a extends C19806a.C19807a {

        /* renamed from: d */
        public final Collection<ShapeSegment> f50427d;

        public C19841a(Context context, ServerId serverId, long j, HashSet hashSet) {
            super(context, serverId, j);
            this.f50427d = hashSet;
        }

        /* renamed from: a */
        public final void mo52111a(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase) {
            int i = serverId.f15142b;
            SQLiteStatement prepare = C19840k.f50424c.prepare(sQLiteDatabase);
            for (ShapeSegment next : this.f50427d) {
                C19840k.this.f50426b.put(next.f23666b, next);
                StatementHelper statementHelper = C19840k.f50424c;
                statementHelper.bindValue(prepare, "metro_id", (long) i);
                statementHelper.bindValue(prepare, "revision", j);
                statementHelper.bindValue(prepare, "segment_id", (long) next.f23666b.f15142b);
                statementHelper.bindValue(prepare, "from_stop_id", (long) next.f23667c.f15142b);
                statementHelper.bindValue(prepare, "to_stop_id", (long) next.f23668d.f15142b);
                statementHelper.bindValue(prepare, "segment_polyline", Polylon.m40196n(next));
                prepare.executeInsert();
            }
        }
    }

    public C19840k(C20400b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public final void mo6588a(Context context) {
        SQLiteDatabase writableDatabase = DatabaseHelper.get(context).getWritableDatabase();
        ServerId d = mo52107d();
        long f = mo52109f();
        StatementHelper statementHelper = f50425d;
        SQLiteStatement prepare = statementHelper.prepare(writableDatabase);
        statementHelper.bindWhereArg(prepare, "metro_id", d);
        statementHelper.bindWhereArg(prepare, "revision", f);
        prepare.executeUpdateDelete();
    }

    /* renamed from: c */
    public final void mo51799c() {
        this.f50426b.onLowMemory();
    }

    /* renamed from: h */
    public final Set<ShapeSegment> mo52141h(Context context, Set<ServerId> set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        int size = set.size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        for (ServerId next : set) {
            ShapeSegment shapeSegment = this.f50426b.get(next);
            if (shapeSegment != null) {
                hashSet.add(shapeSegment);
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
            Cursor rawQuery = readableDatabase.rawQuery(String.format((Locale) null, "SELECT segment_id,from_stop_id,to_stop_id,segment_polyline FROM shape_segments WHERE metro_id = ? AND revision = ? AND segment_id IN (%s)", objArr), createSelectionArgs);
            try {
                mo52142i(hashSet, rawQuery);
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
    public final void mo52142i(HashSet hashSet, Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("segment_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("from_stop_id");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("to_stop_id");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("segment_polyline");
        while (cursor.moveToNext()) {
            ServerId serverId = new ServerId(cursor.getInt(columnIndexOrThrow));
            ShapeSegment shapeSegment = new ShapeSegment(serverId, new ServerId(cursor.getInt(columnIndexOrThrow2)), new ServerId(cursor.getInt(columnIndexOrThrow3)), Polylon.m40195m(cursor.getString(columnIndexOrThrow4)));
            this.f50426b.put(serverId, shapeSegment);
            hashSet.add(shapeSegment);
        }
    }
}
