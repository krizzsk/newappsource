package p217q2;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.room.RoomDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p001a0.C0017h;
import p214q.C6120b;
import p269u2.C6677a;
import p269u2.C6678b;
import p269u2.C6685f;

/* renamed from: q2.h */
public final class C6155h {

    /* renamed from: k */
    public static final String[] f19512k = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a */
    public final HashMap<String, Integer> f19513a;

    /* renamed from: b */
    public final String[] f19514b;

    /* renamed from: c */
    public Map<String, Set<String>> f19515c;

    /* renamed from: d */
    public final RoomDatabase f19516d;

    /* renamed from: e */
    public AtomicBoolean f19517e = new AtomicBoolean(false);

    /* renamed from: f */
    public volatile boolean f19518f = false;

    /* renamed from: g */
    public volatile C6685f f19519g;

    /* renamed from: h */
    public C6157b f19520h;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: i */
    public final C6120b<C6158c, C6159d> f19521i = new C6120b<>();

    /* renamed from: j */
    public C6156a f19522j = new C6156a();

    /* renamed from: q2.h$a */
    public class C6156a implements Runnable {
        public C6156a() {
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public final HashSet mo22133a() {
            HashSet hashSet = new HashSet();
            Cursor i = C6155h.this.f19516d.mo5193i(new C6677a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", (Object) null));
            while (i.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(i.getInt(0)));
                } catch (Throwable th) {
                    i.close();
                    throw th;
                }
            }
            i.close();
            if (!hashSet.isEmpty()) {
                C6155h.this.f19519g.executeUpdateDelete();
            }
            return hashSet;
        }

        public final void run() {
            C6678b writableDatabase;
            ReentrantReadWriteLock.ReadLock readLock = C6155h.this.f19516d.f4715h.readLock();
            readLock.lock();
            HashSet hashSet = null;
            try {
                if (C6155h.this.mo22130a()) {
                    if (C6155h.this.f19517e.compareAndSet(true, false)) {
                        if (!C6155h.this.f19516d.f4710c.getWritableDatabase().inTransaction()) {
                            RoomDatabase roomDatabase = C6155h.this.f19516d;
                            if (roomDatabase.f4713f) {
                                writableDatabase = roomDatabase.f4710c.getWritableDatabase();
                                writableDatabase.beginTransactionNonExclusive();
                                hashSet = mo22133a();
                                writableDatabase.setTransactionSuccessful();
                                writableDatabase.endTransaction();
                            } else {
                                hashSet = mo22133a();
                            }
                            readLock.unlock();
                            C6155h.this.getClass();
                            if (hashSet != null && !hashSet.isEmpty()) {
                                synchronized (C6155h.this.f19521i) {
                                    C6120b.C6125e eVar = (C6120b.C6125e) C6155h.this.f19521i.iterator();
                                    if (eVar.hasNext()) {
                                        ((C6159d) ((Map.Entry) eVar.next()).getValue()).getClass();
                                        throw null;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
                readLock.unlock();
                C6155h.this.getClass();
            } catch (SQLiteException | IllegalStateException unused) {
            } catch (Throwable th) {
                readLock.unlock();
                C6155h.this.getClass();
                throw th;
            }
        }
    }

    /* renamed from: q2.h$b */
    public static class C6157b {

        /* renamed from: a */
        public final long[] f19524a;

        /* renamed from: b */
        public final boolean[] f19525b;

        /* renamed from: c */
        public final int[] f19526c;

        /* renamed from: d */
        public boolean f19527d;

        /* renamed from: e */
        public boolean f19528e;

        public C6157b(int i) {
            long[] jArr = new long[i];
            this.f19524a = jArr;
            boolean[] zArr = new boolean[i];
            this.f19525b = zArr;
            this.f19526c = new int[i];
            Arrays.fill(jArr, 0);
            Arrays.fill(zArr, false);
        }

        /* renamed from: a */
        public final int[] mo22135a() {
            boolean z;
            synchronized (this) {
                if (this.f19527d) {
                    if (!this.f19528e) {
                        int length = this.f19524a.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                if (this.f19524a[i] > 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                boolean[] zArr = this.f19525b;
                                if (z != zArr[i]) {
                                    int[] iArr = this.f19526c;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.f19526c[i] = 0;
                                }
                                zArr[i] = z;
                                i++;
                            } else {
                                this.f19528e = true;
                                this.f19527d = false;
                                int[] iArr2 = this.f19526c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }
    }

    /* renamed from: q2.h$c */
    public static abstract class C6158c {
        /* renamed from: a */
        public abstract void mo22136a(Set<String> set);
    }

    /* renamed from: q2.h$d */
    public static class C6159d {
    }

    public C6155h(RoomDatabase roomDatabase, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.f19516d = roomDatabase;
        this.f19520h = new C6157b(strArr.length);
        this.f19513a = new HashMap<>();
        this.f19515c = hashMap2;
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f19514b = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f19513a.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) hashMap.get(strArr[i]);
            if (str2 != null) {
                this.f19514b[i] = str2.toLowerCase(locale);
            } else {
                this.f19514b[i] = lowerCase;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(locale2);
            if (this.f19513a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> hashMap3 = this.f19513a;
                hashMap3.put(lowerCase3, hashMap3.get(lowerCase2));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo22130a() {
        boolean z;
        RoomDatabase roomDatabase = this.f19516d;
        roomDatabase.getClass();
        C6678b bVar = roomDatabase.f4708a;
        if (bVar == null || !bVar.isOpen()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        if (!this.f19518f) {
            this.f19516d.f4710c.getWritableDatabase();
        }
        if (!this.f19518f) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo22131b(C6678b bVar, int i) {
        bVar.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f19514b[i];
        StringBuilder sb = new StringBuilder();
        String[] strArr = f19512k;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            C0017h.m61R(sb, str, "_", str2, "`");
            C0017h.m61R(sb, " AFTER ", str2, " ON `", str);
            C0017h.m61R(sb, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            C0017h.m61R(sb, " = 1", " WHERE ", "table_id", " = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.execSQL(sb.toString());
        }
    }

    /* renamed from: c */
    public final void mo22132c(C6678b bVar) {
        if (!bVar.inTransaction()) {
            while (true) {
                try {
                    ReentrantReadWriteLock.ReadLock readLock = this.f19516d.f4715h.readLock();
                    readLock.lock();
                    try {
                        int[] a = this.f19520h.mo22135a();
                        if (a == null) {
                            readLock.unlock();
                            return;
                        }
                        int length = a.length;
                        if (bVar.isWriteAheadLoggingEnabled()) {
                            bVar.beginTransactionNonExclusive();
                        } else {
                            bVar.beginTransaction();
                        }
                        for (int i = 0; i < length; i++) {
                            int i2 = a[i];
                            if (i2 == 1) {
                                mo22131b(bVar, i);
                            } else if (i2 == 2) {
                                String str = this.f19514b[i];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = f19512k;
                                for (int i3 = 0; i3 < 3; i3++) {
                                    String str2 = strArr[i3];
                                    sb.setLength(0);
                                    sb.append("DROP TRIGGER IF EXISTS ");
                                    sb.append("`");
                                    sb.append("room_table_modification_trigger_");
                                    sb.append(str);
                                    sb.append("_");
                                    sb.append(str2);
                                    sb.append("`");
                                    bVar.execSQL(sb.toString());
                                }
                            }
                        }
                        bVar.setTransactionSuccessful();
                        bVar.endTransaction();
                        C6157b bVar2 = this.f19520h;
                        synchronized (bVar2) {
                            bVar2.f19528e = false;
                        }
                        readLock.unlock();
                    } catch (Throwable th) {
                        readLock.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException unused) {
                    return;
                }
            }
            while (true) {
            }
        }
    }
}
