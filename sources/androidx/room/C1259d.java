package androidx.room;

import android.database.Cursor;
import p269u2.C6677a;
import p269u2.C6679c;
import p281v2.C6846a;

/* renamed from: androidx.room.d */
public final class C1259d extends C6679c.C6680a {

    /* renamed from: b */
    public C1256a f4743b;

    /* renamed from: c */
    public final C1260a f4744c;

    /* renamed from: d */
    public final String f4745d;

    /* renamed from: e */
    public final String f4746e;

    /* renamed from: androidx.room.d$a */
    public static abstract class C1260a {

        /* renamed from: a */
        public final int f4747a;

        public C1260a(int i) {
            this.f4747a = i;
        }

        /* renamed from: a */
        public abstract void mo5207a(C6846a aVar);

        /* renamed from: b */
        public abstract void mo5208b(C6846a aVar);

        /* renamed from: c */
        public abstract void mo5209c();

        /* renamed from: d */
        public abstract void mo5210d(C6846a aVar);

        /* renamed from: e */
        public abstract void mo5211e();

        /* renamed from: f */
        public abstract void mo5212f(C6846a aVar);

        /* renamed from: g */
        public abstract C1261b mo5213g(C6846a aVar);
    }

    /* renamed from: androidx.room.d$b */
    public static class C1261b {

        /* renamed from: a */
        public final boolean f4748a;

        /* renamed from: b */
        public final String f4749b;

        public C1261b(boolean z, String str) {
            this.f4748a = z;
            this.f4749b = str;
        }
    }

    public C1259d(C1256a aVar, C1260a aVar2, String str, String str2) {
        super(aVar2.f4747a);
        this.f4743b = aVar;
        this.f4744c = aVar2;
        this.f4745d = str;
        this.f4746e = str2;
    }

    /* renamed from: b */
    public final void mo5201b() {
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final void mo5202c(C6846a aVar) {
        Cursor f = aVar.mo23088f("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (f.moveToFirst() && f.getInt(0) == 0) {
                z = true;
            }
            f.close();
            this.f4744c.mo5207a(aVar);
            if (!z) {
                C1261b g = this.f4744c.mo5213g(aVar);
                if (!g.f4748a) {
                    StringBuilder k = C13555b.m33972k("Pre-packaged database has an invalid schema: ");
                    k.append(g.f4749b);
                    throw new IllegalStateException(k.toString());
                }
            }
            mo5206g(aVar);
            this.f4744c.mo5209c();
        } catch (Throwable th) {
            f.close();
            throw th;
        }
    }

    /* renamed from: d */
    public final void mo5203d(C6846a aVar, int i, int i2) {
        mo5205f(aVar, i, i2);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public final void mo5204e(C6846a aVar) {
        boolean z;
        String str;
        Cursor f = aVar.mo23088f("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (!f.moveToFirst() || f.getInt(0) == 0) {
                z = false;
            } else {
                z = true;
            }
            f.close();
            if (z) {
                Cursor query = aVar.query(new C6677a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", (Object) null));
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(0);
                    } else {
                        str = null;
                    }
                    query.close();
                    if (!this.f4745d.equals(str) && !this.f4746e.equals(str)) {
                        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                    }
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            } else {
                C1261b g = this.f4744c.mo5213g(aVar);
                if (g.f4748a) {
                    this.f4744c.mo5211e();
                    mo5206g(aVar);
                } else {
                    StringBuilder k = C13555b.m33972k("Pre-packaged database has an invalid schema: ");
                    k.append(g.f4749b);
                    throw new IllegalStateException(k.toString());
                }
            }
            this.f4744c.mo5210d(aVar);
            this.f4743b = null;
        } catch (Throwable th2) {
            f.close();
            throw th2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        r0 = r3;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5205f(p281v2.C6846a r11, int r12, int r13) {
        /*
            r10 = this;
            androidx.room.a r0 = r10.f4743b
            r1 = 0
            if (r0 == 0) goto L_0x00c0
            androidx.room.RoomDatabase$c r0 = r0.f4736d
            r0.getClass()
            if (r12 != r13) goto L_0x0012
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x007c
        L_0x0012:
            if (r13 <= r12) goto L_0x0016
            r2 = 1
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = r12
        L_0x001d:
            if (r2 == 0) goto L_0x0022
            if (r4 >= r13) goto L_0x007b
            goto L_0x0024
        L_0x0022:
            if (r4 <= r13) goto L_0x007b
        L_0x0024:
            java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, r2.a>> r5 = r0.f4732a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r5.get(r6)
            java.util.TreeMap r5 = (java.util.TreeMap) r5
            r6 = 0
            if (r5 != 0) goto L_0x0034
            goto L_0x0077
        L_0x0034:
            if (r2 == 0) goto L_0x003b
            java.util.NavigableSet r7 = r5.descendingKeySet()
            goto L_0x003f
        L_0x003b:
            java.util.Set r7 = r5.keySet()
        L_0x003f:
            java.util.Iterator r7 = r7.iterator()
        L_0x0043:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0072
            java.lang.Object r8 = r7.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r2 == 0) goto L_0x005a
            if (r8 > r13) goto L_0x0060
            if (r8 <= r4) goto L_0x0060
            goto L_0x005e
        L_0x005a:
            if (r8 < r13) goto L_0x0060
            if (r8 >= r4) goto L_0x0060
        L_0x005e:
            r9 = 1
            goto L_0x0061
        L_0x0060:
            r9 = 0
        L_0x0061:
            if (r9 == 0) goto L_0x0043
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.lang.Object r4 = r5.get(r4)
            r2.a r4 = (p230r2.C6238a) r4
            r3.add(r4)
            r4 = 1
            goto L_0x0075
        L_0x0072:
            r5 = 0
            r8 = r4
            r4 = 0
        L_0x0075:
            if (r4 != 0) goto L_0x0079
        L_0x0077:
            r0 = r6
            goto L_0x007c
        L_0x0079:
            r4 = r8
            goto L_0x001d
        L_0x007b:
            r0 = r3
        L_0x007c:
            if (r0 == 0) goto L_0x00c0
            androidx.room.d$a r1 = r10.f4744c
            r1.mo5212f(r11)
            java.util.Iterator r0 = r0.iterator()
        L_0x0087:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0097
            java.lang.Object r1 = r0.next()
            r2.a r1 = (p230r2.C6238a) r1
            r1.mo5703a(r11)
            goto L_0x0087
        L_0x0097:
            androidx.room.d$a r0 = r10.f4744c
            androidx.room.d$b r0 = r0.mo5213g(r11)
            boolean r1 = r0.f4748a
            if (r1 == 0) goto L_0x00ab
            androidx.room.d$a r0 = r10.f4744c
            r0.mo5211e()
            r10.mo5206g(r11)
            r1 = 1
            goto L_0x00c0
        L_0x00ab:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Migration didn't properly handle: "
            java.lang.StringBuilder r12 = p379.C13555b.m33972k(r12)
            java.lang.String r13 = r0.f4749b
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x00c0:
            if (r1 != 0) goto L_0x00fb
            androidx.room.a r0 = r10.f4743b
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r0.mo5200a(r12, r13)
            if (r0 != 0) goto L_0x00d7
            androidx.room.d$a r12 = r10.f4744c
            r12.mo5208b(r11)
            androidx.room.d$a r12 = r10.f4744c
            r12.mo5207a(r11)
            goto L_0x00fb
        L_0x00d7:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "A migration from "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = " to "
            r0.append(r12)
            r0.append(r13)
            java.lang.String r12 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C1259d.mo5205f(v2.a, int, int):void");
    }

    /* renamed from: g */
    public final void mo5206g(C6846a aVar) {
        aVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.f4745d;
        aVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }
}
