package p041ca;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import p028ba.C1510d;
import p028ba.C1513g;
import p032c0.C1754d;
import p063da.C4407a;
import p066e0.C4452q0;
import p075ea.C4614a;
import p086fa.C4715a;
import p237r9.C6269b;
import p275u9.C6743n;
import p275u9.C6751s;
import p301w9.C7003a;
import p325y9.C7348a;
import p337z9.C7506a;

/* renamed from: ca.u */
public final class C1835u implements C1815d, C4407a, C1813c {

    /* renamed from: g */
    public static final C6269b f6351g = new C6269b("proto");

    /* renamed from: b */
    public final C1811b0 f6352b;

    /* renamed from: c */
    public final C4614a f6353c;

    /* renamed from: d */
    public final C4614a f6354d;

    /* renamed from: e */
    public final C1816e f6355e;

    /* renamed from: f */
    public final C7003a<String> f6356f;

    /* renamed from: ca.u$a */
    public interface C1836a<T, U> {
        U apply(T t);
    }

    /* renamed from: ca.u$b */
    public static class C1837b {

        /* renamed from: a */
        public final String f6357a;

        /* renamed from: b */
        public final String f6358b;

        public C1837b(String str, String str2) {
            this.f6357a = str;
            this.f6358b = str2;
        }
    }

    public C1835u(C4614a aVar, C4614a aVar2, C1816e eVar, C1811b0 b0Var, C7003a<String> aVar3) {
        this.f6352b = b0Var;
        this.f6353c = aVar;
        this.f6354d = aVar2;
        this.f6355e = eVar;
        this.f6356f = aVar3;
    }

    /* renamed from: r */
    public static Long m5158r(SQLiteDatabase sQLiteDatabase, C6751s sVar) {
        Long l;
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{sVar.mo22910b(), String.valueOf(C4715a.m12025a(sVar.mo22912d()))}));
        if (sVar.mo22911c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(sVar.mo22911c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null);
        try {
            if (!query.moveToNext()) {
                l = null;
            } else {
                l = Long.valueOf(query.getLong(0));
            }
            return l;
        } finally {
            query.close();
        }
    }

    /* renamed from: v */
    public static String m5159v(Iterable<C1824j> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<C1824j> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo6632b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: w */
    public static <T> T m5160w(Cursor cursor, C1836a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: F */
    public final int mo6645F() {
        return ((Integer) mo6661t(new C1826l(this, this.f6353c.mo20139V() - this.f6355e.mo6623b()))).intValue();
    }

    /* renamed from: G */
    public final void mo6646G(Iterable<C1824j> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder k = C13555b.m33972k("DELETE FROM events WHERE _id in ");
            k.append(m5159v(iterable));
            mo6660q().compileStatement(k.toString()).execute();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: I */
    public final long mo6647I(C6751s sVar) {
        Long l;
        Cursor rawQuery = mo6660q().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{sVar.mo22910b(), String.valueOf(C4715a.m12025a(sVar.mo22912d()))});
        try {
            if (rawQuery.moveToNext()) {
                l = Long.valueOf(rawQuery.getLong(0));
            } else {
                l = 0L;
            }
            rawQuery.close();
            return l.longValue();
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    /* renamed from: J */
    public final boolean mo6648J(C6751s sVar) {
        return ((Boolean) mo6661t(new C1510d(1, this, sVar))).booleanValue();
    }

    /* renamed from: L */
    public final Iterable<C6751s> mo6649L() {
        return (Iterable) mo6661t(new C4452q0(2));
    }

    /* renamed from: L1 */
    public final C1810b mo6650L1(C6751s sVar, C6743n nVar) {
        Object[] objArr = {sVar.mo22912d(), nVar.mo22895g(), sVar.mo22910b()};
        if (Log.isLoggable(C7506a.m17227b("SQLiteEventStore"), 3)) {
            String.format("Storing event with priority=%s, name=%s for destination %s", objArr);
        }
        long longValue = ((Long) mo6661t(new C1825k(this, nVar, sVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return new C1810b(longValue, sVar, nVar);
    }

    /* renamed from: M0 */
    public final void mo6651M0(Iterable<C1824j> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder k = C13555b.m33972k("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            k.append(m5159v(iterable));
            mo6661t(new C1829o(0, this, k.toString(), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    /* renamed from: a */
    public final <T> T mo6658a(C4407a.C4408a<T> aVar) {
        SQLiteDatabase q = mo6660q();
        long V = this.f6354d.mo20139V();
        while (true) {
            try {
                q.beginTransaction();
                try {
                    T C = aVar.mo309C();
                    q.setTransactionSuccessful();
                    return C;
                } finally {
                    q.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f6354d.mo20139V() < ((long) this.f6355e.mo6622a()) + V) {
                    SystemClock.sleep(50);
                } else {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
            }
        }
    }

    /* renamed from: a2 */
    public final Iterable<C1824j> mo6652a2(C6751s sVar) {
        return (Iterable) mo6661t(new C1754d(2, this, sVar));
    }

    public final void close() {
        this.f6352b.close();
    }

    /* renamed from: d */
    public final void mo6653d(long j, C6751s sVar) {
        mo6661t(new C1828n(j, sVar));
    }

    /* renamed from: e */
    public final void mo6642e() {
        mo6661t(new C1513g(this, 2));
    }

    /* renamed from: i */
    public final C7348a mo6643i() {
        int i = C7348a.f22568e;
        C7348a.C7349a aVar = new C7348a.C7349a();
        HashMap hashMap = new HashMap();
        SQLiteDatabase q = mo6660q();
        q.beginTransaction();
        try {
            C7348a aVar2 = (C7348a) m5160w(q.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C1833s(this, hashMap, aVar));
            q.setTransactionSuccessful();
            return aVar2;
        } finally {
            q.endTransaction();
        }
    }

    /* renamed from: j */
    public final void mo6644j(long j, LogEventDropped.Reason reason, String str) {
        mo6661t(new C1827m(j, reason, str));
    }

    /* renamed from: q */
    public final SQLiteDatabase mo6660q() {
        C1811b0 b0Var = this.f6352b;
        Objects.requireNonNull(b0Var);
        long V = this.f6354d.mo20139V();
        while (true) {
            try {
                SQLiteDatabase writableDatabase = b0Var.getWritableDatabase();
                SQLiteDatabase sQLiteDatabase = writableDatabase;
                return writableDatabase;
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f6354d.mo20139V() < ((long) this.f6355e.mo6622a()) + V) {
                    SystemClock.sleep(50);
                } else {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
            }
        }
    }

    /* renamed from: t */
    public final <T> T mo6661t(C1836a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase q = mo6660q();
        q.beginTransaction();
        try {
            T apply = aVar.apply(q);
            q.setTransactionSuccessful();
            return apply;
        } finally {
            q.endTransaction();
        }
    }
}
