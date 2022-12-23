package p281v2;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import p269u2.C6678b;
import p269u2.C6679c;

/* renamed from: v2.b */
public final class C6848b implements C6679c {

    /* renamed from: b */
    public final Context f21192b;

    /* renamed from: c */
    public final String f21193c;

    /* renamed from: d */
    public final C6679c.C6680a f21194d;

    /* renamed from: e */
    public final boolean f21195e;

    /* renamed from: f */
    public final Object f21196f = new Object();

    /* renamed from: g */
    public C6849a f21197g;

    /* renamed from: h */
    public boolean f21198h;

    /* renamed from: v2.b$a */
    public static class C6849a extends SQLiteOpenHelper {

        /* renamed from: b */
        public final C6846a[] f21199b;

        /* renamed from: c */
        public final C6679c.C6680a f21200c;

        /* renamed from: d */
        public boolean f21201d;

        /* renamed from: v2.b$a$a */
        public class C6850a implements DatabaseErrorHandler {

            /* renamed from: a */
            public final /* synthetic */ C6679c.C6680a f21202a;

            /* renamed from: b */
            public final /* synthetic */ C6846a[] f21203b;

            public C6850a(C6679c.C6680a aVar, C6846a[] aVarArr) {
                this.f21202a = aVar;
                this.f21203b = aVarArr;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
                if (r0 != null) goto L_0x003d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
                r5 = r0.iterator();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
                if (r5.hasNext() != false) goto L_0x0047;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
                p269u2.C6679c.C6680a.m15769a((java.lang.String) r5.next().second);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
                p269u2.C6679c.C6680a.m15769a(r5.mo23087e());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
                throw r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
                if (r3 == false) goto L_0x0012;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0037 */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x0035 A[ExcHandler: all (r1v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
              PHI: (r0v9 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v2 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:12:0x0030, B:15:0x0037, B:16:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:12:0x0030] */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x0060  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x0078  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onCorruption(android.database.sqlite.SQLiteDatabase r5) {
                /*
                    r4 = this;
                    u2.c$a r0 = r4.f21202a
                    v2.a[] r1 = r4.f21203b
                    r2 = 0
                    r3 = r1[r2]
                    if (r3 == 0) goto L_0x0012
                    android.database.sqlite.SQLiteDatabase r3 = r3.f21190b
                    if (r3 != r5) goto L_0x000f
                    r3 = 1
                    goto L_0x0010
                L_0x000f:
                    r3 = 0
                L_0x0010:
                    if (r3 != 0) goto L_0x0019
                L_0x0012:
                    v2.a r3 = new v2.a
                    r3.<init>(r5)
                    r1[r2] = r3
                L_0x0019:
                    r5 = r1[r2]
                    r0.getClass()
                    r5.mo23087e()
                    boolean r0 = r5.isOpen()
                    if (r0 != 0) goto L_0x002f
                    java.lang.String r5 = r5.mo23087e()
                    p269u2.C6679c.C6680a.m15769a(r5)
                    goto L_0x007f
                L_0x002f:
                    r0 = 0
                    java.util.List r0 = r5.getAttachedDbs()     // Catch:{ SQLiteException -> 0x0037, all -> 0x0035 }
                    goto L_0x0037
                L_0x0035:
                    r1 = move-exception
                    goto L_0x003b
                L_0x0037:
                    r5.close()     // Catch:{ IOException -> 0x005d, all -> 0x0035 }
                    goto L_0x005e
                L_0x003b:
                    if (r0 == 0) goto L_0x0055
                    java.util.Iterator r5 = r0.iterator()
                L_0x0041:
                    boolean r0 = r5.hasNext()
                    if (r0 == 0) goto L_0x005c
                    java.lang.Object r0 = r5.next()
                    android.util.Pair r0 = (android.util.Pair) r0
                    java.lang.Object r0 = r0.second
                    java.lang.String r0 = (java.lang.String) r0
                    p269u2.C6679c.C6680a.m15769a(r0)
                    goto L_0x0041
                L_0x0055:
                    java.lang.String r5 = r5.mo23087e()
                    p269u2.C6679c.C6680a.m15769a(r5)
                L_0x005c:
                    throw r1
                L_0x005d:
                L_0x005e:
                    if (r0 == 0) goto L_0x0078
                    java.util.Iterator r5 = r0.iterator()
                L_0x0064:
                    boolean r0 = r5.hasNext()
                    if (r0 == 0) goto L_0x007f
                    java.lang.Object r0 = r5.next()
                    android.util.Pair r0 = (android.util.Pair) r0
                    java.lang.Object r0 = r0.second
                    java.lang.String r0 = (java.lang.String) r0
                    p269u2.C6679c.C6680a.m15769a(r0)
                    goto L_0x0064
                L_0x0078:
                    java.lang.String r5 = r5.mo23087e()
                    p269u2.C6679c.C6680a.m15769a(r5)
                L_0x007f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p281v2.C6848b.C6849a.C6850a.onCorruption(android.database.sqlite.SQLiteDatabase):void");
            }
        }

        public C6849a(Context context, String str, C6846a[] aVarArr, C6679c.C6680a aVar) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f20760a, new C6850a(aVar, aVarArr));
            this.f21200c = aVar;
            this.f21199b = aVarArr;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
            if (r2 == false) goto L_0x0010;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p281v2.C6846a mo23091a(android.database.sqlite.SQLiteDatabase r4) {
            /*
                r3 = this;
                v2.a[] r0 = r3.f21199b
                r1 = 0
                r2 = r0[r1]
                if (r2 == 0) goto L_0x0010
                android.database.sqlite.SQLiteDatabase r2 = r2.f21190b
                if (r2 != r4) goto L_0x000d
                r2 = 1
                goto L_0x000e
            L_0x000d:
                r2 = 0
            L_0x000e:
                if (r2 != 0) goto L_0x0017
            L_0x0010:
                v2.a r2 = new v2.a
                r2.<init>(r4)
                r0[r1] = r2
            L_0x0017:
                r4 = r0[r1]
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p281v2.C6848b.C6849a.mo23091a(android.database.sqlite.SQLiteDatabase):v2.a");
        }

        public final synchronized void close() {
            super.close();
            this.f21199b[0] = null;
        }

        /* renamed from: e */
        public final synchronized C6678b mo23093e() {
            this.f21201d = false;
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (this.f21201d) {
                close();
                return mo23093e();
            }
            return mo23091a(writableDatabase);
        }

        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            C6679c.C6680a aVar = this.f21200c;
            mo23091a(sQLiteDatabase);
            aVar.mo5201b();
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f21200c.mo5202c(mo23091a(sQLiteDatabase));
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f21201d = true;
            this.f21200c.mo5203d(mo23091a(sQLiteDatabase), i, i2);
        }

        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f21201d) {
                this.f21200c.mo5204e(mo23091a(sQLiteDatabase));
            }
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f21201d = true;
            this.f21200c.mo5205f(mo23091a(sQLiteDatabase), i, i2);
        }
    }

    public C6848b(Context context, String str, C6679c.C6680a aVar, boolean z) {
        this.f21192b = context;
        this.f21193c = str;
        this.f21194d = aVar;
        this.f21195e = z;
    }

    public final void close() {
        mo23090e().close();
    }

    /* renamed from: e */
    public final C6849a mo23090e() {
        C6849a aVar;
        synchronized (this.f21196f) {
            if (this.f21197g == null) {
                C6846a[] aVarArr = new C6846a[1];
                if (Build.VERSION.SDK_INT < 23 || this.f21193c == null || !this.f21195e) {
                    this.f21197g = new C6849a(this.f21192b, this.f21193c, aVarArr, this.f21194d);
                } else {
                    this.f21197g = new C6849a(this.f21192b, new File(this.f21192b.getNoBackupFilesDir(), this.f21193c).getAbsolutePath(), aVarArr, this.f21194d);
                }
                this.f21197g.setWriteAheadLoggingEnabled(this.f21198h);
            }
            aVar = this.f21197g;
        }
        return aVar;
    }

    public final String getDatabaseName() {
        return this.f21193c;
    }

    public final C6678b getWritableDatabase() {
        return mo23090e().mo23093e();
    }

    public final void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f21196f) {
            C6849a aVar = this.f21197g;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.f21198h = z;
        }
    }
}
