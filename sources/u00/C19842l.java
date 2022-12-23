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
import com.moovit.transit.Shape;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p693nz.C18659h;
import p898wr.C20400b;
import p977zz.C20964s0;
import u00.C19806a;

/* renamed from: u00.l */
public final class C19842l extends C19806a {

    /* renamed from: c */
    public static final StatementHelper f50429c = StatementHelper.newInsertHelper("shapes", 5, "metro_id", "revision", "shape_id", "shape_polyline");

    /* renamed from: d */
    public static final StatementHelper f50430d = StatementHelper.newDeleteHelper("shapes", "metro_id", "revision");

    /* renamed from: b */
    public final C18659h<ServerId, Shape> f50431b = new C18659h<>(10);

    /* renamed from: u00.l$a */
    public class C19843a extends C19806a.C19807a {

        /* renamed from: d */
        public final Collection<Shape> f50432d;

        public C19843a(Context context, ServerId serverId, long j, HashSet hashSet) {
            super(context, serverId, j);
            this.f50432d = hashSet;
        }

        /* renamed from: a */
        public final void mo52111a(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase) {
            int i = serverId.f15142b;
            SQLiteStatement prepare = C19842l.f50429c.prepare(sQLiteDatabase);
            for (Shape next : this.f50432d) {
                C19842l.this.f50431b.put(next.f23663b, next);
                StatementHelper statementHelper = C19842l.f50429c;
                statementHelper.bindValue(prepare, "metro_id", (long) i);
                statementHelper.bindValue(prepare, "revision", j);
                statementHelper.bindValue(prepare, "shape_id", (long) next.f23663b.f15142b);
                statementHelper.bindValue(prepare, "shape_polyline", Polylon.m40196n(next));
                prepare.executeInsert();
            }
        }
    }

    public C19842l(C20400b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public final void mo6588a(Context context) {
        SQLiteDatabase writableDatabase = DatabaseHelper.get(context).getWritableDatabase();
        ServerId d = mo52107d();
        long f = mo52109f();
        StatementHelper statementHelper = f50430d;
        SQLiteStatement prepare = statementHelper.prepare(writableDatabase);
        statementHelper.bindWhereArg(prepare, "metro_id", d);
        statementHelper.bindWhereArg(prepare, "revision", f);
        prepare.executeUpdateDelete();
    }

    /* renamed from: c */
    public final void mo51799c() {
        this.f50431b.onLowMemory();
    }

    /* renamed from: h */
    public final Set<Shape> mo52143h(Context context, Set<ServerId> set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        int size = set.size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        for (ServerId next : set) {
            Shape shape = this.f50431b.get(next);
            if (shape != null) {
                hashSet.add(shape);
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
            Cursor rawQuery = readableDatabase.rawQuery(String.format((Locale) null, "SELECT shape_id,shape_polyline FROM shapes WHERE metro_id = ? AND revision = ? AND shape_id IN (%s)", objArr), createSelectionArgs);
            try {
                mo52144i(hashSet, rawQuery);
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
    public final void mo52144i(HashSet hashSet, Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("shape_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("shape_polyline");
        while (cursor.moveToNext()) {
            ServerId serverId = new ServerId(cursor.getInt(columnIndexOrThrow));
            Shape shape = new Shape(serverId, Polylon.m40195m(cursor.getString(columnIndexOrThrow2)));
            this.f50431b.put(serverId, shape);
            hashSet.add(shape);
        }
    }
}
