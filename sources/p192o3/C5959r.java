package p192o3;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.work.C1388b;
import androidx.work.WorkInfo$State;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p081f3.C4648b;
import p192o3.C5956p;
import p217q2.C6150e;
import p217q2.C6162k;
import p217q2.C6164m;
import p243s2.C6419b;
import p269u2.C6685f;

/* renamed from: o3.r */
public final class C5959r implements C5958q {

    /* renamed from: a */
    public final RoomDatabase f19102a;

    /* renamed from: b */
    public final C5960a f19103b;

    /* renamed from: c */
    public final C5961b f19104c;

    /* renamed from: d */
    public final C5962c f19105d;

    /* renamed from: e */
    public final C5963d f19106e;

    /* renamed from: f */
    public final C5964e f19107f;

    /* renamed from: g */
    public final C5965f f19108g;

    /* renamed from: h */
    public final C5966g f19109h;

    /* renamed from: i */
    public final C5967h f19110i;

    /* renamed from: o3.r$a */
    public class C5960a extends C6150e<C5956p> {
        public C5960a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo21491b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.io.ObjectOutputStream} */
        /* JADX WARNING: type inference failed for: r3v2 */
        /* JADX WARNING: type inference failed for: r3v8 */
        /* JADX WARNING: type inference failed for: r3v21 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01c2 A[SYNTHETIC, Splitter:B:74:0x01c2] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01d9  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01df  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x01e9 A[SYNTHETIC, Splitter:B:88:0x01e9] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo21492d(p269u2.C6685f r19, java.lang.Object r20) {
            /*
                r18 = this;
                r1 = r19
                r0 = r20
                o3.p r0 = (p192o3.C5956p) r0
                java.lang.String r2 = r0.f19082a
                r3 = 1
                if (r2 != 0) goto L_0x000f
                r1.bindNull(r3)
                goto L_0x0012
            L_0x000f:
                r1.bindString(r3, r2)
            L_0x0012:
                androidx.work.WorkInfo$State r2 = r0.f19083b
                int r2 = p192o3.C5972v.m14459f(r2)
                long r4 = (long) r2
                r2 = 2
                r1.bindLong(r2, r4)
                java.lang.String r4 = r0.f19084c
                r5 = 3
                if (r4 != 0) goto L_0x0026
                r1.bindNull(r5)
                goto L_0x0029
            L_0x0026:
                r1.bindString(r5, r4)
            L_0x0029:
                java.lang.String r4 = r0.f19085d
                r6 = 4
                if (r4 != 0) goto L_0x0032
                r1.bindNull(r6)
                goto L_0x0035
            L_0x0032:
                r1.bindString(r6, r4)
            L_0x0035:
                androidx.work.b r4 = r0.f19086e
                byte[] r4 = androidx.work.C1388b.m3716c(r4)
                r7 = 5
                if (r4 != 0) goto L_0x0042
                r1.bindNull(r7)
                goto L_0x0045
            L_0x0042:
                r1.bindBlob(r7, r4)
            L_0x0045:
                androidx.work.b r4 = r0.f19087f
                byte[] r4 = androidx.work.C1388b.m3716c(r4)
                r8 = 6
                if (r4 != 0) goto L_0x0052
                r1.bindNull(r8)
                goto L_0x0055
            L_0x0052:
                r1.bindBlob(r8, r4)
            L_0x0055:
                r4 = 7
                long r8 = r0.f19088g
                r1.bindLong(r4, r8)
                r4 = 8
                long r8 = r0.f19089h
                r1.bindLong(r4, r8)
                r4 = 9
                long r8 = r0.f19090i
                r1.bindLong(r4, r8)
                r4 = 10
                int r8 = r0.f19092k
                long r8 = (long) r8
                r1.bindLong(r4, r8)
                androidx.work.BackoffPolicy r4 = r0.f19093l
                int[] r8 = p192o3.C5972v.C5973a.f19116b
                int r9 = r4.ordinal()
                r8 = r8[r9]
                java.lang.String r9 = " to int"
                java.lang.String r10 = "Could not convert "
                if (r8 == r3) goto L_0x009d
                if (r8 != r2) goto L_0x0085
                r4 = 1
                goto L_0x009e
            L_0x0085:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r4)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x009d:
                r4 = 0
            L_0x009e:
                r8 = 11
                long r12 = (long) r4
                r1.bindLong(r8, r12)
                r4 = 12
                long r12 = r0.f19094m
                r1.bindLong(r4, r12)
                r4 = 13
                long r12 = r0.f19095n
                r1.bindLong(r4, r12)
                r4 = 14
                long r12 = r0.f19096o
                r1.bindLong(r4, r12)
                r4 = 15
                long r12 = r0.f19097p
                r1.bindLong(r4, r12)
                boolean r4 = r0.f19098q
                r8 = 16
                long r12 = (long) r4
                r1.bindLong(r8, r12)
                androidx.work.OutOfQuotaPolicy r4 = r0.f19099r
                int[] r8 = p192o3.C5972v.C5973a.f19118d
                int r12 = r4.ordinal()
                r8 = r8[r12]
                if (r8 == r3) goto L_0x00f0
                if (r8 != r2) goto L_0x00d8
                r4 = 1
                goto L_0x00f1
            L_0x00d8:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r4)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00f0:
                r4 = 0
            L_0x00f1:
                r8 = 17
                long r12 = (long) r4
                r1.bindLong(r8, r12)
                f3.b r0 = r0.f19091j
                r4 = 22
                r8 = 21
                r12 = 20
                r13 = 19
                r14 = 18
                if (r0 == 0) goto L_0x01fc
                androidx.work.NetworkType r15 = r0.f15877a
                int[] r16 = p192o3.C5972v.C5973a.f19117c
                int r17 = r15.ordinal()
                r11 = r16[r17]
                if (r11 == r3) goto L_0x0143
                if (r11 == r2) goto L_0x0144
                if (r11 == r5) goto L_0x0141
                if (r11 == r6) goto L_0x013f
                if (r11 == r7) goto L_0x013d
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r2 < r3) goto L_0x0125
                androidx.work.NetworkType r2 = androidx.work.NetworkType.TEMPORARILY_UNMETERED
                if (r15 != r2) goto L_0x0125
                r3 = 5
                goto L_0x0144
            L_0x0125:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r15)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x013d:
                r3 = 4
                goto L_0x0144
            L_0x013f:
                r3 = 3
                goto L_0x0144
            L_0x0141:
                r3 = 2
                goto L_0x0144
            L_0x0143:
                r3 = 0
            L_0x0144:
                long r2 = (long) r3
                r1.bindLong(r14, r2)
                boolean r2 = r0.f15878b
                long r2 = (long) r2
                r1.bindLong(r13, r2)
                boolean r2 = r0.f15879c
                long r2 = (long) r2
                r1.bindLong(r12, r2)
                boolean r2 = r0.f15880d
                long r2 = (long) r2
                r1.bindLong(r8, r2)
                boolean r2 = r0.f15881e
                long r2 = (long) r2
                r1.bindLong(r4, r2)
                long r2 = r0.f15882f
                r4 = 23
                r1.bindLong(r4, r2)
                long r2 = r0.f15883g
                r4 = 24
                r1.bindLong(r4, r2)
                f3.c r0 = r0.f15884h
                java.util.HashSet r2 = r0.f15892a
                int r2 = r2.size()
                r3 = 0
                if (r2 != 0) goto L_0x017a
                goto L_0x01d7
            L_0x017a:
                java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
                r2.<init>()
                java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x01bc }
                r4.<init>(r2)     // Catch:{ IOException -> 0x01bc }
                java.util.HashSet r3 = r0.f15892a     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                int r3 = r3.size()     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                r4.writeInt(r3)     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                java.util.HashSet r0 = r0.f15892a     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
            L_0x0193:
                boolean r3 = r0.hasNext()     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                if (r3 == 0) goto L_0x01ae
                java.lang.Object r3 = r0.next()     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                f3.c$a r3 = (p081f3.C4650c.C4651a) r3     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                android.net.Uri r5 = r3.f15893a     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                r4.writeUTF(r5)     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                boolean r3 = r3.f15894b     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                r4.writeBoolean(r3)     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                goto L_0x0193
            L_0x01ae:
                r4.close()     // Catch:{ IOException -> 0x01c6 }
                goto L_0x01ca
            L_0x01b2:
                r0 = move-exception
                goto L_0x01b6
            L_0x01b4:
                r0 = move-exception
                goto L_0x01b8
            L_0x01b6:
                r1 = r0
                goto L_0x01e7
            L_0x01b8:
                r3 = r4
                goto L_0x01bd
            L_0x01ba:
                r0 = move-exception
                goto L_0x01e5
            L_0x01bc:
                r0 = move-exception
            L_0x01bd:
                r0.printStackTrace()     // Catch:{ all -> 0x01ba }
                if (r3 == 0) goto L_0x01ca
                r3.close()     // Catch:{ IOException -> 0x01c6 }
                goto L_0x01ca
            L_0x01c6:
                r0 = move-exception
                r0.printStackTrace()
            L_0x01ca:
                r2.close()     // Catch:{ IOException -> 0x01ce }
                goto L_0x01d3
            L_0x01ce:
                r0 = move-exception
                r3 = r0
                r3.printStackTrace()
            L_0x01d3:
                byte[] r3 = r2.toByteArray()
            L_0x01d7:
                if (r3 != 0) goto L_0x01df
                r2 = 25
                r1.bindNull(r2)
                goto L_0x021a
            L_0x01df:
                r2 = 25
                r1.bindBlob(r2, r3)
                goto L_0x021a
            L_0x01e5:
                r1 = r0
                r4 = r3
            L_0x01e7:
                if (r4 == 0) goto L_0x01f2
                r4.close()     // Catch:{ IOException -> 0x01ed }
                goto L_0x01f2
            L_0x01ed:
                r0 = move-exception
                r3 = r0
                r3.printStackTrace()
            L_0x01f2:
                r2.close()     // Catch:{ IOException -> 0x01f6 }
                goto L_0x01fb
            L_0x01f6:
                r0 = move-exception
                r2 = r0
                r2.printStackTrace()
            L_0x01fb:
                throw r1
            L_0x01fc:
                r1.bindNull(r14)
                r1.bindNull(r13)
                r1.bindNull(r12)
                r1.bindNull(r8)
                r1.bindNull(r4)
                r0 = 23
                r1.bindNull(r0)
                r0 = 24
                r1.bindNull(r0)
                r2 = 25
                r1.bindNull(r2)
            L_0x021a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p192o3.C5959r.C5960a.mo21492d(u2.f, java.lang.Object):void");
        }
    }

    /* renamed from: o3.r$b */
    public class C5961b extends C6164m {
        public C5961b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo21491b() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: o3.r$c */
    public class C5962c extends C6164m {
        public C5962c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo21491b() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: o3.r$d */
    public class C5963d extends C6164m {
        public C5963d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo21491b() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* renamed from: o3.r$e */
    public class C5964e extends C6164m {
        public C5964e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo21491b() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: o3.r$f */
    public class C5965f extends C6164m {
        public C5965f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo21491b() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: o3.r$g */
    public class C5966g extends C6164m {
        public C5966g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo21491b() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: o3.r$h */
    public class C5967h extends C6164m {
        public C5967h(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo21491b() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public C5959r(RoomDatabase roomDatabase) {
        this.f19102a = roomDatabase;
        this.f19103b = new C5960a(roomDatabase);
        this.f19104c = new C5961b(roomDatabase);
        this.f19105d = new C5962c(roomDatabase);
        this.f19106e = new C5963d(roomDatabase);
        this.f19107f = new C5964e(roomDatabase);
        this.f19108g = new C5965f(roomDatabase);
        this.f19109h = new C5966g(roomDatabase);
        this.f19110i = new C5967h(roomDatabase);
        new AtomicBoolean(false);
    }

    /* renamed from: a */
    public final void mo21943a(String str) {
        this.f19102a.mo5186b();
        C6685f a = this.f19104c.mo22151a();
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f19102a.mo5187c();
        try {
            a.executeUpdateDelete();
            this.f19102a.mo5194j();
        } finally {
            this.f19102a.mo5191g();
            this.f19104c.mo22152c(a);
        }
    }

    /* renamed from: b */
    public final ArrayList mo21944b() {
        C6162k kVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C6162k a = C6162k.m14718a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        a.bindLong(1, (long) 200);
        this.f19102a.mo5186b();
        Cursor i = this.f19102a.mo5193i(a);
        try {
            int a2 = C6419b.m15327a(i, "required_network_type");
            int a3 = C6419b.m15327a(i, "requires_charging");
            int a4 = C6419b.m15327a(i, "requires_device_idle");
            int a5 = C6419b.m15327a(i, "requires_battery_not_low");
            int a6 = C6419b.m15327a(i, "requires_storage_not_low");
            int a7 = C6419b.m15327a(i, "trigger_content_update_delay");
            int a8 = C6419b.m15327a(i, "trigger_max_content_delay");
            int a9 = C6419b.m15327a(i, "content_uri_triggers");
            int a11 = C6419b.m15327a(i, "id");
            int a12 = C6419b.m15327a(i, "state");
            int a13 = C6419b.m15327a(i, "worker_class_name");
            int a14 = C6419b.m15327a(i, "input_merger_class_name");
            int a15 = C6419b.m15327a(i, "input");
            int a16 = C6419b.m15327a(i, "output");
            kVar = a;
            try {
                int a17 = C6419b.m15327a(i, "initial_delay");
                int a18 = C6419b.m15327a(i, "interval_duration");
                int a19 = C6419b.m15327a(i, "flex_duration");
                int a21 = C6419b.m15327a(i, "run_attempt_count");
                int a22 = C6419b.m15327a(i, "backoff_policy");
                int a23 = C6419b.m15327a(i, "backoff_delay_duration");
                int a24 = C6419b.m15327a(i, "period_start_time");
                int a25 = C6419b.m15327a(i, "minimum_retention_duration");
                int a26 = C6419b.m15327a(i, "schedule_requested_at");
                int a27 = C6419b.m15327a(i, "run_in_foreground");
                int a28 = C6419b.m15327a(i, "out_of_quota_policy");
                int i2 = a16;
                ArrayList arrayList = new ArrayList(i.getCount());
                while (i.moveToNext()) {
                    String string = i.getString(a11);
                    int i3 = a11;
                    String string2 = i.getString(a13);
                    int i4 = a13;
                    C4648b bVar = new C4648b();
                    int i5 = a2;
                    bVar.f15877a = C5972v.m14456c(i.getInt(a2));
                    if (i.getInt(a3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bVar.f15878b = z;
                    if (i.getInt(a4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    bVar.f15879c = z2;
                    if (i.getInt(a5) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    bVar.f15880d = z3;
                    if (i.getInt(a6) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    bVar.f15881e = z4;
                    int i6 = a3;
                    bVar.f15882f = i.getLong(a7);
                    bVar.f15883g = i.getLong(a8);
                    bVar.f15884h = C5972v.m14454a(i.getBlob(a9));
                    C5956p pVar = new C5956p(string, string2);
                    pVar.f19083b = C5972v.m14458e(i.getInt(a12));
                    pVar.f19085d = i.getString(a14);
                    pVar.f19086e = C1388b.m3715a(i.getBlob(a15));
                    int i7 = i2;
                    pVar.f19087f = C1388b.m3715a(i.getBlob(i7));
                    int i8 = a15;
                    i2 = i7;
                    int i9 = a17;
                    pVar.f19088g = i.getLong(i9);
                    a17 = i9;
                    int i11 = a18;
                    pVar.f19089h = i.getLong(i11);
                    a18 = i11;
                    int i12 = a19;
                    pVar.f19090i = i.getLong(i12);
                    int i13 = a21;
                    pVar.f19092k = i.getInt(i13);
                    int i14 = a22;
                    a21 = i13;
                    pVar.f19093l = C5972v.m14455b(i.getInt(i14));
                    a19 = i12;
                    int i15 = a4;
                    int i16 = a23;
                    pVar.f19094m = i.getLong(i16);
                    a23 = i16;
                    int i17 = a24;
                    pVar.f19095n = i.getLong(i17);
                    a24 = i17;
                    int i18 = a25;
                    pVar.f19096o = i.getLong(i18);
                    a25 = i18;
                    int i19 = i14;
                    int i21 = a26;
                    pVar.f19097p = i.getLong(i21);
                    int i22 = a27;
                    if (i.getInt(i22) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    pVar.f19098q = z5;
                    int i23 = a28;
                    a27 = i22;
                    pVar.f19099r = C5972v.m14457d(i.getInt(i23));
                    pVar.f19091j = bVar;
                    arrayList.add(pVar);
                    a28 = i23;
                    a26 = i21;
                    a15 = i8;
                    a11 = i3;
                    a13 = i4;
                    a2 = i5;
                    a3 = i6;
                    int i24 = i15;
                    a22 = i19;
                    a4 = i24;
                }
                i.close();
                kVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                i.close();
                kVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = a;
            i.close();
            kVar.release();
            throw th;
        }
    }

    /* renamed from: c */
    public final ArrayList mo21945c(int i) {
        C6162k kVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C6162k a = C6162k.m14718a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        a.bindLong(1, (long) i);
        this.f19102a.mo5186b();
        Cursor i2 = this.f19102a.mo5193i(a);
        try {
            int a2 = C6419b.m15327a(i2, "required_network_type");
            int a3 = C6419b.m15327a(i2, "requires_charging");
            int a4 = C6419b.m15327a(i2, "requires_device_idle");
            int a5 = C6419b.m15327a(i2, "requires_battery_not_low");
            int a6 = C6419b.m15327a(i2, "requires_storage_not_low");
            int a7 = C6419b.m15327a(i2, "trigger_content_update_delay");
            int a8 = C6419b.m15327a(i2, "trigger_max_content_delay");
            int a9 = C6419b.m15327a(i2, "content_uri_triggers");
            int a11 = C6419b.m15327a(i2, "id");
            int a12 = C6419b.m15327a(i2, "state");
            int a13 = C6419b.m15327a(i2, "worker_class_name");
            int a14 = C6419b.m15327a(i2, "input_merger_class_name");
            int a15 = C6419b.m15327a(i2, "input");
            int a16 = C6419b.m15327a(i2, "output");
            kVar = a;
            try {
                int a17 = C6419b.m15327a(i2, "initial_delay");
                int a18 = C6419b.m15327a(i2, "interval_duration");
                int a19 = C6419b.m15327a(i2, "flex_duration");
                int a21 = C6419b.m15327a(i2, "run_attempt_count");
                int a22 = C6419b.m15327a(i2, "backoff_policy");
                int a23 = C6419b.m15327a(i2, "backoff_delay_duration");
                int a24 = C6419b.m15327a(i2, "period_start_time");
                int a25 = C6419b.m15327a(i2, "minimum_retention_duration");
                int a26 = C6419b.m15327a(i2, "schedule_requested_at");
                int a27 = C6419b.m15327a(i2, "run_in_foreground");
                int a28 = C6419b.m15327a(i2, "out_of_quota_policy");
                int i3 = a16;
                ArrayList arrayList = new ArrayList(i2.getCount());
                while (i2.moveToNext()) {
                    String string = i2.getString(a11);
                    int i4 = a11;
                    String string2 = i2.getString(a13);
                    int i5 = a13;
                    C4648b bVar = new C4648b();
                    int i6 = a2;
                    bVar.f15877a = C5972v.m14456c(i2.getInt(a2));
                    if (i2.getInt(a3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bVar.f15878b = z;
                    if (i2.getInt(a4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    bVar.f15879c = z2;
                    if (i2.getInt(a5) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    bVar.f15880d = z3;
                    if (i2.getInt(a6) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    bVar.f15881e = z4;
                    int i7 = a3;
                    bVar.f15882f = i2.getLong(a7);
                    bVar.f15883g = i2.getLong(a8);
                    bVar.f15884h = C5972v.m14454a(i2.getBlob(a9));
                    C5956p pVar = new C5956p(string, string2);
                    pVar.f19083b = C5972v.m14458e(i2.getInt(a12));
                    pVar.f19085d = i2.getString(a14);
                    pVar.f19086e = C1388b.m3715a(i2.getBlob(a15));
                    int i8 = i3;
                    pVar.f19087f = C1388b.m3715a(i2.getBlob(i8));
                    int i9 = a17;
                    int i11 = a15;
                    i3 = i8;
                    pVar.f19088g = i2.getLong(i9);
                    int i12 = i9;
                    int i13 = a18;
                    pVar.f19089h = i2.getLong(i13);
                    a18 = i13;
                    int i14 = a19;
                    pVar.f19090i = i2.getLong(i14);
                    int i15 = a21;
                    pVar.f19092k = i2.getInt(i15);
                    int i16 = a22;
                    a21 = i15;
                    pVar.f19093l = C5972v.m14455b(i2.getInt(i16));
                    a19 = i14;
                    int i17 = a4;
                    int i18 = a23;
                    pVar.f19094m = i2.getLong(i18);
                    a23 = i18;
                    int i19 = a24;
                    pVar.f19095n = i2.getLong(i19);
                    a24 = i19;
                    int i21 = a25;
                    pVar.f19096o = i2.getLong(i21);
                    a25 = i21;
                    int i22 = i16;
                    int i23 = a26;
                    pVar.f19097p = i2.getLong(i23);
                    int i24 = a27;
                    if (i2.getInt(i24) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    pVar.f19098q = z5;
                    int i25 = a28;
                    a27 = i24;
                    pVar.f19099r = C5972v.m14457d(i2.getInt(i25));
                    pVar.f19091j = bVar;
                    arrayList.add(pVar);
                    a15 = i11;
                    a28 = i25;
                    a26 = i23;
                    a17 = i12;
                    a11 = i4;
                    a13 = i5;
                    a2 = i6;
                    a3 = i7;
                    int i26 = i17;
                    a22 = i22;
                    a4 = i26;
                }
                i2.close();
                kVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                i2.close();
                kVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = a;
            i2.close();
            kVar.release();
            throw th;
        }
    }

    /* renamed from: d */
    public final ArrayList mo21946d() {
        C6162k kVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C6162k a = C6162k.m14718a(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        this.f19102a.mo5186b();
        Cursor i = this.f19102a.mo5193i(a);
        try {
            int a2 = C6419b.m15327a(i, "required_network_type");
            int a3 = C6419b.m15327a(i, "requires_charging");
            int a4 = C6419b.m15327a(i, "requires_device_idle");
            int a5 = C6419b.m15327a(i, "requires_battery_not_low");
            int a6 = C6419b.m15327a(i, "requires_storage_not_low");
            int a7 = C6419b.m15327a(i, "trigger_content_update_delay");
            int a8 = C6419b.m15327a(i, "trigger_max_content_delay");
            int a9 = C6419b.m15327a(i, "content_uri_triggers");
            int a11 = C6419b.m15327a(i, "id");
            int a12 = C6419b.m15327a(i, "state");
            int a13 = C6419b.m15327a(i, "worker_class_name");
            int a14 = C6419b.m15327a(i, "input_merger_class_name");
            int a15 = C6419b.m15327a(i, "input");
            int a16 = C6419b.m15327a(i, "output");
            kVar = a;
            try {
                int a17 = C6419b.m15327a(i, "initial_delay");
                int a18 = C6419b.m15327a(i, "interval_duration");
                int a19 = C6419b.m15327a(i, "flex_duration");
                int a21 = C6419b.m15327a(i, "run_attempt_count");
                int a22 = C6419b.m15327a(i, "backoff_policy");
                int a23 = C6419b.m15327a(i, "backoff_delay_duration");
                int a24 = C6419b.m15327a(i, "period_start_time");
                int a25 = C6419b.m15327a(i, "minimum_retention_duration");
                int a26 = C6419b.m15327a(i, "schedule_requested_at");
                int a27 = C6419b.m15327a(i, "run_in_foreground");
                int a28 = C6419b.m15327a(i, "out_of_quota_policy");
                int i2 = a16;
                ArrayList arrayList = new ArrayList(i.getCount());
                while (i.moveToNext()) {
                    String string = i.getString(a11);
                    int i3 = a11;
                    String string2 = i.getString(a13);
                    int i4 = a13;
                    C4648b bVar = new C4648b();
                    int i5 = a2;
                    bVar.f15877a = C5972v.m14456c(i.getInt(a2));
                    if (i.getInt(a3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bVar.f15878b = z;
                    if (i.getInt(a4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    bVar.f15879c = z2;
                    if (i.getInt(a5) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    bVar.f15880d = z3;
                    if (i.getInt(a6) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    bVar.f15881e = z4;
                    int i6 = a3;
                    bVar.f15882f = i.getLong(a7);
                    bVar.f15883g = i.getLong(a8);
                    bVar.f15884h = C5972v.m14454a(i.getBlob(a9));
                    C5956p pVar = new C5956p(string, string2);
                    pVar.f19083b = C5972v.m14458e(i.getInt(a12));
                    pVar.f19085d = i.getString(a14);
                    pVar.f19086e = C1388b.m3715a(i.getBlob(a15));
                    int i7 = i2;
                    pVar.f19087f = C1388b.m3715a(i.getBlob(i7));
                    int i8 = a15;
                    i2 = i7;
                    int i9 = a17;
                    pVar.f19088g = i.getLong(i9);
                    a17 = i9;
                    int i11 = a18;
                    pVar.f19089h = i.getLong(i11);
                    a18 = i11;
                    int i12 = a19;
                    pVar.f19090i = i.getLong(i12);
                    int i13 = a21;
                    pVar.f19092k = i.getInt(i13);
                    int i14 = a22;
                    a21 = i13;
                    pVar.f19093l = C5972v.m14455b(i.getInt(i14));
                    a19 = i12;
                    int i15 = a4;
                    int i16 = a23;
                    pVar.f19094m = i.getLong(i16);
                    a23 = i16;
                    int i17 = a24;
                    pVar.f19095n = i.getLong(i17);
                    a24 = i17;
                    int i18 = a25;
                    pVar.f19096o = i.getLong(i18);
                    a25 = i18;
                    int i19 = i14;
                    int i21 = a26;
                    pVar.f19097p = i.getLong(i21);
                    int i22 = a27;
                    if (i.getInt(i22) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    pVar.f19098q = z5;
                    int i23 = a28;
                    a27 = i22;
                    pVar.f19099r = C5972v.m14457d(i.getInt(i23));
                    pVar.f19091j = bVar;
                    arrayList.add(pVar);
                    a28 = i23;
                    a26 = i21;
                    a15 = i8;
                    a11 = i3;
                    a13 = i4;
                    a2 = i5;
                    a3 = i6;
                    int i24 = i15;
                    a22 = i19;
                    a4 = i24;
                }
                i.close();
                kVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                i.close();
                kVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = a;
            i.close();
            kVar.release();
            throw th;
        }
    }

    /* renamed from: e */
    public final ArrayList mo21947e() {
        C6162k kVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C6162k a = C6162k.m14718a(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        this.f19102a.mo5186b();
        Cursor i = this.f19102a.mo5193i(a);
        try {
            int a2 = C6419b.m15327a(i, "required_network_type");
            int a3 = C6419b.m15327a(i, "requires_charging");
            int a4 = C6419b.m15327a(i, "requires_device_idle");
            int a5 = C6419b.m15327a(i, "requires_battery_not_low");
            int a6 = C6419b.m15327a(i, "requires_storage_not_low");
            int a7 = C6419b.m15327a(i, "trigger_content_update_delay");
            int a8 = C6419b.m15327a(i, "trigger_max_content_delay");
            int a9 = C6419b.m15327a(i, "content_uri_triggers");
            int a11 = C6419b.m15327a(i, "id");
            int a12 = C6419b.m15327a(i, "state");
            int a13 = C6419b.m15327a(i, "worker_class_name");
            int a14 = C6419b.m15327a(i, "input_merger_class_name");
            int a15 = C6419b.m15327a(i, "input");
            int a16 = C6419b.m15327a(i, "output");
            kVar = a;
            try {
                int a17 = C6419b.m15327a(i, "initial_delay");
                int a18 = C6419b.m15327a(i, "interval_duration");
                int a19 = C6419b.m15327a(i, "flex_duration");
                int a21 = C6419b.m15327a(i, "run_attempt_count");
                int a22 = C6419b.m15327a(i, "backoff_policy");
                int a23 = C6419b.m15327a(i, "backoff_delay_duration");
                int a24 = C6419b.m15327a(i, "period_start_time");
                int a25 = C6419b.m15327a(i, "minimum_retention_duration");
                int a26 = C6419b.m15327a(i, "schedule_requested_at");
                int a27 = C6419b.m15327a(i, "run_in_foreground");
                int a28 = C6419b.m15327a(i, "out_of_quota_policy");
                int i2 = a16;
                ArrayList arrayList = new ArrayList(i.getCount());
                while (i.moveToNext()) {
                    String string = i.getString(a11);
                    int i3 = a11;
                    String string2 = i.getString(a13);
                    int i4 = a13;
                    C4648b bVar = new C4648b();
                    int i5 = a2;
                    bVar.f15877a = C5972v.m14456c(i.getInt(a2));
                    if (i.getInt(a3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bVar.f15878b = z;
                    if (i.getInt(a4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    bVar.f15879c = z2;
                    if (i.getInt(a5) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    bVar.f15880d = z3;
                    if (i.getInt(a6) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    bVar.f15881e = z4;
                    int i6 = a3;
                    bVar.f15882f = i.getLong(a7);
                    bVar.f15883g = i.getLong(a8);
                    bVar.f15884h = C5972v.m14454a(i.getBlob(a9));
                    C5956p pVar = new C5956p(string, string2);
                    pVar.f19083b = C5972v.m14458e(i.getInt(a12));
                    pVar.f19085d = i.getString(a14);
                    pVar.f19086e = C1388b.m3715a(i.getBlob(a15));
                    int i7 = i2;
                    pVar.f19087f = C1388b.m3715a(i.getBlob(i7));
                    int i8 = a15;
                    i2 = i7;
                    int i9 = a17;
                    pVar.f19088g = i.getLong(i9);
                    a17 = i9;
                    int i11 = a18;
                    pVar.f19089h = i.getLong(i11);
                    a18 = i11;
                    int i12 = a19;
                    pVar.f19090i = i.getLong(i12);
                    int i13 = a21;
                    pVar.f19092k = i.getInt(i13);
                    int i14 = a22;
                    a21 = i13;
                    pVar.f19093l = C5972v.m14455b(i.getInt(i14));
                    a19 = i12;
                    int i15 = a4;
                    int i16 = a23;
                    pVar.f19094m = i.getLong(i16);
                    a23 = i16;
                    int i17 = a24;
                    pVar.f19095n = i.getLong(i17);
                    a24 = i17;
                    int i18 = a25;
                    pVar.f19096o = i.getLong(i18);
                    a25 = i18;
                    int i19 = i14;
                    int i21 = a26;
                    pVar.f19097p = i.getLong(i21);
                    int i22 = a27;
                    if (i.getInt(i22) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    pVar.f19098q = z5;
                    int i23 = a28;
                    a27 = i22;
                    pVar.f19099r = C5972v.m14457d(i.getInt(i23));
                    pVar.f19091j = bVar;
                    arrayList.add(pVar);
                    a28 = i23;
                    a26 = i21;
                    a15 = i8;
                    a11 = i3;
                    a13 = i4;
                    a2 = i5;
                    a3 = i6;
                    int i24 = i15;
                    a22 = i19;
                    a4 = i24;
                }
                i.close();
                kVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                i.close();
                kVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = a;
            i.close();
            kVar.release();
            throw th;
        }
    }

    /* renamed from: f */
    public final WorkInfo$State mo21948f(String str) {
        C6162k a = C6162k.m14718a(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f19102a.mo5186b();
        WorkInfo$State workInfo$State = null;
        Cursor i = this.f19102a.mo5193i(a);
        try {
            if (i.moveToFirst()) {
                workInfo$State = C5972v.m14458e(i.getInt(0));
            }
            return workInfo$State;
        } finally {
            i.close();
            a.release();
        }
    }

    /* renamed from: g */
    public final ArrayList mo21949g(String str) {
        C6162k a = C6162k.m14718a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f19102a.mo5186b();
        Cursor i = this.f19102a.mo5193i(a);
        try {
            ArrayList arrayList = new ArrayList(i.getCount());
            while (i.moveToNext()) {
                arrayList.add(i.getString(0));
            }
            return arrayList;
        } finally {
            i.close();
            a.release();
        }
    }

    /* renamed from: h */
    public final ArrayList mo21950h(String str) {
        C6162k a = C6162k.m14718a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f19102a.mo5186b();
        Cursor i = this.f19102a.mo5193i(a);
        try {
            ArrayList arrayList = new ArrayList(i.getCount());
            while (i.moveToNext()) {
                arrayList.add(i.getString(0));
            }
            return arrayList;
        } finally {
            i.close();
            a.release();
        }
    }

    /* renamed from: i */
    public final C5956p mo21951i(String str) {
        C6162k kVar;
        C5956p pVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str2 = str;
        C6162k a = C6162k.m14718a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str2 == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str2);
        }
        this.f19102a.mo5186b();
        Cursor i = this.f19102a.mo5193i(a);
        try {
            int a2 = C6419b.m15327a(i, "required_network_type");
            int a3 = C6419b.m15327a(i, "requires_charging");
            int a4 = C6419b.m15327a(i, "requires_device_idle");
            int a5 = C6419b.m15327a(i, "requires_battery_not_low");
            int a6 = C6419b.m15327a(i, "requires_storage_not_low");
            int a7 = C6419b.m15327a(i, "trigger_content_update_delay");
            int a8 = C6419b.m15327a(i, "trigger_max_content_delay");
            int a9 = C6419b.m15327a(i, "content_uri_triggers");
            int a11 = C6419b.m15327a(i, "id");
            int a12 = C6419b.m15327a(i, "state");
            int a13 = C6419b.m15327a(i, "worker_class_name");
            int a14 = C6419b.m15327a(i, "input_merger_class_name");
            int a15 = C6419b.m15327a(i, "input");
            int a16 = C6419b.m15327a(i, "output");
            kVar = a;
            try {
                int a17 = C6419b.m15327a(i, "initial_delay");
                int a18 = C6419b.m15327a(i, "interval_duration");
                int a19 = C6419b.m15327a(i, "flex_duration");
                int a21 = C6419b.m15327a(i, "run_attempt_count");
                int a22 = C6419b.m15327a(i, "backoff_policy");
                int a23 = C6419b.m15327a(i, "backoff_delay_duration");
                int a24 = C6419b.m15327a(i, "period_start_time");
                int a25 = C6419b.m15327a(i, "minimum_retention_duration");
                int a26 = C6419b.m15327a(i, "schedule_requested_at");
                int a27 = C6419b.m15327a(i, "run_in_foreground");
                int a28 = C6419b.m15327a(i, "out_of_quota_policy");
                if (i.moveToFirst()) {
                    String string = i.getString(a11);
                    String string2 = i.getString(a13);
                    int i2 = a28;
                    C4648b bVar = new C4648b();
                    bVar.f15877a = C5972v.m14456c(i.getInt(a2));
                    if (i.getInt(a3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bVar.f15878b = z;
                    if (i.getInt(a4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    bVar.f15879c = z2;
                    if (i.getInt(a5) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    bVar.f15880d = z3;
                    if (i.getInt(a6) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    bVar.f15881e = z4;
                    bVar.f15882f = i.getLong(a7);
                    bVar.f15883g = i.getLong(a8);
                    bVar.f15884h = C5972v.m14454a(i.getBlob(a9));
                    pVar = new C5956p(string, string2);
                    pVar.f19083b = C5972v.m14458e(i.getInt(a12));
                    pVar.f19085d = i.getString(a14);
                    pVar.f19086e = C1388b.m3715a(i.getBlob(a15));
                    pVar.f19087f = C1388b.m3715a(i.getBlob(a16));
                    pVar.f19088g = i.getLong(a17);
                    pVar.f19089h = i.getLong(a18);
                    pVar.f19090i = i.getLong(a19);
                    pVar.f19092k = i.getInt(a21);
                    pVar.f19093l = C5972v.m14455b(i.getInt(a22));
                    pVar.f19094m = i.getLong(a23);
                    pVar.f19095n = i.getLong(a24);
                    pVar.f19096o = i.getLong(a25);
                    pVar.f19097p = i.getLong(a26);
                    if (i.getInt(a27) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    pVar.f19098q = z5;
                    pVar.f19099r = C5972v.m14457d(i.getInt(i2));
                    pVar.f19091j = bVar;
                } else {
                    pVar = null;
                }
                i.close();
                kVar.release();
                return pVar;
            } catch (Throwable th) {
                th = th;
                i.close();
                kVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = a;
            i.close();
            kVar.release();
            throw th;
        }
    }

    /* renamed from: j */
    public final ArrayList mo21952j(String str) {
        C6162k a = C6162k.m14718a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f19102a.mo5186b();
        Cursor i = this.f19102a.mo5193i(a);
        try {
            int a2 = C6419b.m15327a(i, "id");
            int a3 = C6419b.m15327a(i, "state");
            ArrayList arrayList = new ArrayList(i.getCount());
            while (i.moveToNext()) {
                C5956p.C5957a aVar = new C5956p.C5957a();
                aVar.f19100a = i.getString(a2);
                aVar.f19101b = C5972v.m14458e(i.getInt(a3));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            i.close();
            a.release();
        }
    }

    /* renamed from: k */
    public final int mo21953k(String str) {
        this.f19102a.mo5186b();
        C6685f a = this.f19107f.mo22151a();
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f19102a.mo5187c();
        try {
            int executeUpdateDelete = a.executeUpdateDelete();
            this.f19102a.mo5194j();
            return executeUpdateDelete;
        } finally {
            this.f19102a.mo5191g();
            this.f19107f.mo22152c(a);
        }
    }

    /* renamed from: l */
    public final int mo21954l(long j, String str) {
        this.f19102a.mo5186b();
        C6685f a = this.f19109h.mo22151a();
        a.bindLong(1, j);
        if (str == null) {
            a.bindNull(2);
        } else {
            a.bindString(2, str);
        }
        this.f19102a.mo5187c();
        try {
            int executeUpdateDelete = a.executeUpdateDelete();
            this.f19102a.mo5194j();
            return executeUpdateDelete;
        } finally {
            this.f19102a.mo5191g();
            this.f19109h.mo22152c(a);
        }
    }

    /* renamed from: m */
    public final int mo21955m(String str) {
        this.f19102a.mo5186b();
        C6685f a = this.f19108g.mo22151a();
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f19102a.mo5187c();
        try {
            int executeUpdateDelete = a.executeUpdateDelete();
            this.f19102a.mo5194j();
            return executeUpdateDelete;
        } finally {
            this.f19102a.mo5191g();
            this.f19108g.mo22152c(a);
        }
    }

    /* renamed from: n */
    public final void mo21956n(String str, C1388b bVar) {
        this.f19102a.mo5186b();
        C6685f a = this.f19105d.mo22151a();
        byte[] c = C1388b.m3716c(bVar);
        if (c == null) {
            a.bindNull(1);
        } else {
            a.bindBlob(1, c);
        }
        if (str == null) {
            a.bindNull(2);
        } else {
            a.bindString(2, str);
        }
        this.f19102a.mo5187c();
        try {
            a.executeUpdateDelete();
            this.f19102a.mo5194j();
        } finally {
            this.f19102a.mo5191g();
            this.f19105d.mo22152c(a);
        }
    }

    /* renamed from: o */
    public final void mo21957o(long j, String str) {
        this.f19102a.mo5186b();
        C6685f a = this.f19106e.mo22151a();
        a.bindLong(1, j);
        if (str == null) {
            a.bindNull(2);
        } else {
            a.bindString(2, str);
        }
        this.f19102a.mo5187c();
        try {
            a.executeUpdateDelete();
            this.f19102a.mo5194j();
        } finally {
            this.f19102a.mo5191g();
            this.f19106e.mo22152c(a);
        }
    }

    /* renamed from: p */
    public final int mo21958p(WorkInfo$State workInfo$State, String... strArr) {
        this.f19102a.mo5186b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=");
        sb.append("?");
        sb.append(" WHERE id IN (");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append("?");
            if (i < length - 1) {
                sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            }
        }
        sb.append(")");
        String sb2 = sb.toString();
        RoomDatabase roomDatabase = this.f19102a;
        roomDatabase.mo5185a();
        roomDatabase.mo5186b();
        C6685f compileStatement = roomDatabase.f4710c.getWritableDatabase().compileStatement(sb2);
        compileStatement.bindLong(1, (long) C5972v.m14459f(workInfo$State));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.bindNull(i2);
            } else {
                compileStatement.bindString(i2, str);
            }
            i2++;
        }
        this.f19102a.mo5187c();
        try {
            int executeUpdateDelete = compileStatement.executeUpdateDelete();
            this.f19102a.mo5194j();
            return executeUpdateDelete;
        } finally {
            this.f19102a.mo5191g();
        }
    }
}
