package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p201p.C6019a;
import p217q2.C6145a;
import p217q2.C6148c;
import p217q2.C6155h;
import p217q2.C6163l;
import p230r2.C6238a;
import p269u2.C6678b;
import p269u2.C6679c;
import p269u2.C6684e;
import p281v2.C6846a;
import p281v2.C6851c;
import p988j$.util.DesugarCollections;

public abstract class RoomDatabase {
    @Deprecated

    /* renamed from: a */
    public volatile C6678b f4708a;

    /* renamed from: b */
    public Executor f4709b;

    /* renamed from: c */
    public C6679c f4710c;

    /* renamed from: d */
    public final C6155h f4711d = mo5188d();

    /* renamed from: e */
    public boolean f4712e;

    /* renamed from: f */
    public boolean f4713f;
    @Deprecated

    /* renamed from: g */
    public List<C1253b> f4714g;

    /* renamed from: h */
    public final ReentrantReadWriteLock f4715h = new ReentrantReadWriteLock();

    /* renamed from: i */
    public final ThreadLocal<Integer> f4716i = new ThreadLocal<>();

    /* renamed from: j */
    public final Map<String, Object> f4717j = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: k */
    public final HashMap f4718k = new HashMap();

    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean isLowRamDevice(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        @SuppressLint({"NewApi"})
        public JournalMode resolve(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || isLowRamDevice(activityManager)) {
                return TRUNCATE;
            }
            return WRITE_AHEAD_LOGGING;
        }
    }

    /* renamed from: androidx.room.RoomDatabase$a */
    public static class C1252a<T extends RoomDatabase> {

        /* renamed from: a */
        public final Class<T> f4719a;

        /* renamed from: b */
        public final String f4720b;

        /* renamed from: c */
        public final Context f4721c;

        /* renamed from: d */
        public ArrayList<C1253b> f4722d;

        /* renamed from: e */
        public Executor f4723e;

        /* renamed from: f */
        public Executor f4724f;

        /* renamed from: g */
        public C6679c.C6682c f4725g;

        /* renamed from: h */
        public boolean f4726h;

        /* renamed from: i */
        public JournalMode f4727i = JournalMode.AUTOMATIC;

        /* renamed from: j */
        public boolean f4728j = true;

        /* renamed from: k */
        public boolean f4729k;

        /* renamed from: l */
        public final C1254c f4730l = new C1254c();

        /* renamed from: m */
        public HashSet f4731m;

        public C1252a(Context context, Class<T> cls, String str) {
            this.f4721c = context;
            this.f4719a = cls;
            this.f4720b = str;
        }

        /* renamed from: a */
        public final void mo5196a(C6238a... aVarArr) {
            if (this.f4731m == null) {
                this.f4731m = new HashSet();
            }
            for (C6238a aVar : aVarArr) {
                this.f4731m.add(Integer.valueOf(aVar.f19686a));
                this.f4731m.add(Integer.valueOf(aVar.f19687b));
            }
            C1254c cVar = this.f4730l;
            cVar.getClass();
            for (C6238a aVar2 : aVarArr) {
                int i = aVar2.f19686a;
                int i2 = aVar2.f19687b;
                TreeMap treeMap = cVar.f4732a.get(Integer.valueOf(i));
                if (treeMap == null) {
                    treeMap = new TreeMap();
                    cVar.f4732a.put(Integer.valueOf(i), treeMap);
                }
                C6238a aVar3 = (C6238a) treeMap.get(Integer.valueOf(i2));
                if (aVar3 != null) {
                    aVar3.toString();
                    aVar2.toString();
                }
                treeMap.put(Integer.valueOf(i2), aVar2);
            }
        }

        @SuppressLint({"RestrictedApi"})
        /* renamed from: b */
        public final T mo5197b() {
            String str;
            boolean z;
            Executor executor;
            Context context = this.f4721c;
            if (context == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.f4719a != null) {
                Executor executor2 = this.f4723e;
                if (executor2 == null && this.f4724f == null) {
                    C6019a.C6021b bVar = C6019a.f19240e;
                    this.f4724f = bVar;
                    this.f4723e = bVar;
                } else if (executor2 != null && this.f4724f == null) {
                    this.f4724f = executor2;
                } else if (executor2 == null && (executor = this.f4724f) != null) {
                    this.f4723e = executor;
                }
                C6679c.C6682c cVar = this.f4725g;
                if (cVar == null) {
                    cVar = new C6851c();
                }
                String str2 = this.f4720b;
                C1254c cVar2 = this.f4730l;
                ArrayList<C1253b> arrayList = this.f4722d;
                boolean z2 = this.f4726h;
                JournalMode resolve = this.f4727i.resolve(context);
                Executor executor3 = this.f4723e;
                Executor executor4 = this.f4724f;
                boolean z3 = this.f4728j;
                Executor executor5 = executor3;
                boolean z4 = z2;
                Executor executor6 = executor3;
                boolean z5 = z3;
                Executor executor7 = executor6;
                JournalMode journalMode = resolve;
                C1256a aVar = new C1256a(context, str2, cVar, cVar2, arrayList, z2, resolve, executor5, executor4, z5, this.f4729k);
                Class<T> cls = this.f4719a;
                String name = cls.getPackage().getName();
                String canonicalName = cls.getCanonicalName();
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String str3 = canonicalName.replace('.', '_') + "_Impl";
                try {
                    if (name.isEmpty()) {
                        str = str3;
                    } else {
                        str = name + "." + str3;
                    }
                    T t = (RoomDatabase) Class.forName(str, true, cls.getClassLoader()).newInstance();
                    C6679c e = t.mo5189e(aVar);
                    t.f4710c = e;
                    C6163l lVar = (C6163l) RoomDatabase.m3389k(C6163l.class, e);
                    if (lVar != null) {
                        lVar.f19544b = aVar;
                    }
                    if (((C6145a) RoomDatabase.m3389k(C6145a.class, t.f4710c)) == null) {
                        if (journalMode == JournalMode.WRITE_AHEAD_LOGGING) {
                            z = true;
                        } else {
                            z = false;
                        }
                        t.f4710c.setWriteAheadLoggingEnabled(z);
                        t.f4714g = arrayList;
                        t.f4709b = executor7;
                        new ArrayDeque();
                        t.f4712e = z4;
                        t.f4713f = z;
                        Map<Class<?>, List<Class<?>>> f = t.mo5190f();
                        BitSet bitSet = new BitSet();
                        for (Map.Entry next : f.entrySet()) {
                            Class cls2 = (Class) next.getKey();
                            Iterator it = ((List) next.getValue()).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Class cls3 = (Class) it.next();
                                    int size = aVar.f4738f.size() - 1;
                                    while (true) {
                                        if (size < 0) {
                                            size = -1;
                                            break;
                                        } else if (cls3.isAssignableFrom(aVar.f4738f.get(size).getClass())) {
                                            bitSet.set(size);
                                            break;
                                        } else {
                                            size--;
                                        }
                                    }
                                    if (size >= 0) {
                                        t.f4718k.put(cls3, aVar.f4738f.get(size));
                                    } else {
                                        throw new IllegalArgumentException("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.");
                                    }
                                }
                            }
                        }
                        int size2 = aVar.f4738f.size() - 1;
                        while (size2 >= 0) {
                            if (bitSet.get(size2)) {
                                size2--;
                            } else {
                                throw new IllegalArgumentException("Unexpected type converter " + aVar.f4738f.get(size2) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                        }
                        return t;
                    }
                    t.f4711d.getClass();
                    throw null;
                } catch (ClassNotFoundException unused) {
                    StringBuilder k = C13555b.m33972k("cannot find implementation for ");
                    k.append(cls.getCanonicalName());
                    k.append(". ");
                    k.append(str3);
                    k.append(" does not exist");
                    throw new RuntimeException(k.toString());
                } catch (IllegalAccessException unused2) {
                    StringBuilder k2 = C13555b.m33972k("Cannot access the constructor");
                    k2.append(cls.getCanonicalName());
                    throw new RuntimeException(k2.toString());
                } catch (InstantiationException unused3) {
                    StringBuilder k3 = C13555b.m33972k("Failed to create an instance of ");
                    k3.append(cls.getCanonicalName());
                    throw new RuntimeException(k3.toString());
                }
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }
    }

    /* renamed from: androidx.room.RoomDatabase$b */
    public static abstract class C1253b {
        /* renamed from: a */
        public void mo5198a(C6846a aVar) {
        }
    }

    /* renamed from: androidx.room.RoomDatabase$c */
    public static class C1254c {

        /* renamed from: a */
        public HashMap<Integer, TreeMap<Integer, C6238a>> f4732a = new HashMap<>();
    }

    /* renamed from: androidx.room.RoomDatabase$d */
    public interface C1255d {
        /* renamed from: a */
        void mo5199a();
    }

    /* renamed from: k */
    public static Object m3389k(Class cls, C6679c cVar) {
        if (cls.isInstance(cVar)) {
            return cVar;
        }
        if (cVar instanceof C6148c) {
            return m3389k(cls, ((C6148c) cVar).mo22120e());
        }
        return null;
    }

    /* renamed from: a */
    public final void mo5185a() {
        boolean z;
        if (!this.f4712e) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
            }
        }
    }

    /* renamed from: b */
    public final void mo5186b() {
        if (!this.f4710c.getWritableDatabase().inTransaction() && this.f4716i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    /* renamed from: c */
    public final void mo5187c() {
        mo5185a();
        mo5185a();
        C6678b writableDatabase = this.f4710c.getWritableDatabase();
        this.f4711d.mo22132c(writableDatabase);
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    /* renamed from: d */
    public abstract C6155h mo5188d();

    /* renamed from: e */
    public abstract C6679c mo5189e(C1256a aVar);

    /* renamed from: f */
    public Map<Class<?>, List<Class<?>>> mo5190f() {
        return Collections.emptyMap();
    }

    /* renamed from: g */
    public final void mo5191g() {
        this.f4710c.getWritableDatabase().endTransaction();
        if (!this.f4710c.getWritableDatabase().inTransaction()) {
            C6155h hVar = this.f4711d;
            if (hVar.f19517e.compareAndSet(false, true)) {
                hVar.f19516d.f4709b.execute(hVar.f19522j);
            }
        }
    }

    /* renamed from: h */
    public final void mo5192h(C6846a aVar) {
        C6155h hVar = this.f4711d;
        synchronized (hVar) {
            if (!hVar.f19518f) {
                aVar.execSQL("PRAGMA temp_store = MEMORY;");
                aVar.execSQL("PRAGMA recursive_triggers='ON';");
                aVar.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                hVar.mo22132c(aVar);
                hVar.f19519g = aVar.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                hVar.f19518f = true;
            }
        }
    }

    /* renamed from: i */
    public final Cursor mo5193i(C6684e eVar) {
        mo5185a();
        mo5186b();
        return this.f4710c.getWritableDatabase().query(eVar);
    }

    @Deprecated
    /* renamed from: j */
    public final void mo5194j() {
        this.f4710c.getWritableDatabase().setTransactionSuccessful();
    }
}
