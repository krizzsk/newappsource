package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C1388b;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import p081f3.C4648b;
import p081f3.C4656h;
import p092g3.C4763k;
import p192o3.C5941g;
import p192o3.C5942h;
import p192o3.C5943i;
import p192o3.C5947k;
import p192o3.C5948l;
import p192o3.C5956p;
import p192o3.C5958q;
import p192o3.C5959r;
import p192o3.C5969t;
import p192o3.C5970u;
import p192o3.C5972v;
import p217q2.C6162k;
import p243s2.C6419b;

public class DiagnosticsWorker extends Worker {
    static {
        C4656h.m11961e("DiagnosticsWrkr");
    }

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static String m3808a(C5947k kVar, C5969t tVar, C5942h hVar, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (Build.VERSION.SDK_INT >= 23) {
            str = "Job Id";
        } else {
            str = "Alarm Id";
        }
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", new Object[]{str}));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C5956p pVar = (C5956p) it.next();
            C5941g a = ((C5943i) hVar).mo21929a(pVar.f19082a);
            Integer num = null;
            if (a != null) {
                num = Integer.valueOf(a.f19067b);
            }
            String str2 = pVar.f19082a;
            C5948l lVar = (C5948l) kVar;
            lVar.getClass();
            C6162k a2 = C6162k.m14718a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str2 == null) {
                a2.bindNull(1);
            } else {
                a2.bindString(1, str2);
            }
            lVar.f19073a.mo5186b();
            Cursor i = lVar.f19073a.mo5193i(a2);
            try {
                ArrayList arrayList2 = new ArrayList(i.getCount());
                while (i.moveToNext()) {
                    arrayList2.add(i.getString(0));
                }
                i.close();
                a2.release();
                ArrayList a3 = ((C5970u) tVar).mo21959a(pVar.f19082a);
                sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", new Object[]{pVar.f19082a, pVar.f19084c, num, pVar.f19083b.name(), TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, arrayList2), TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, a3)}));
            } catch (Throwable th) {
                i.close();
                a2.release();
                throw th;
            }
        }
        return sb.toString();
    }

    public final ListenableWorker.C1379a doWork() {
        C6162k kVar;
        ArrayList arrayList;
        C5942h hVar;
        C5969t tVar;
        C5947k kVar2;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        WorkDatabase workDatabase = C4763k.m12079g(getApplicationContext()).f16072c;
        C5958q q = workDatabase.mo5701q();
        C5947k o = workDatabase.mo5699o();
        C5969t r = workDatabase.mo5702r();
        C5942h n = workDatabase.mo5698n();
        C5959r rVar = (C5959r) q;
        rVar.getClass();
        C6162k a = C6162k.m14718a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        a.bindLong(1, System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
        rVar.f19102a.mo5186b();
        Cursor i2 = rVar.f19102a.mo5193i(a);
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
            C5942h hVar2 = n;
            int a13 = C6419b.m15327a(i2, "worker_class_name");
            C5947k kVar3 = o;
            int a14 = C6419b.m15327a(i2, "input_merger_class_name");
            C5969t tVar2 = r;
            int a15 = C6419b.m15327a(i2, "input");
            C5959r rVar2 = rVar;
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
                ArrayList arrayList2 = new ArrayList(i2.getCount());
                while (true) {
                    arrayList = arrayList2;
                    if (!i2.moveToNext()) {
                        break;
                    }
                    String string = i2.getString(a11);
                    String string2 = i2.getString(a13);
                    int i4 = a13;
                    C4648b bVar = new C4648b();
                    int i5 = a2;
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
                    int i6 = a3;
                    int i7 = a4;
                    bVar.f15882f = i2.getLong(a7);
                    bVar.f15883g = i2.getLong(a8);
                    bVar.f15884h = C5972v.m14454a(i2.getBlob(a9));
                    C5956p pVar = new C5956p(string, string2);
                    pVar.f19083b = C5972v.m14458e(i2.getInt(a12));
                    pVar.f19085d = i2.getString(a14);
                    pVar.f19086e = C1388b.m3715a(i2.getBlob(a15));
                    int i8 = i3;
                    pVar.f19087f = C1388b.m3715a(i2.getBlob(i8));
                    i3 = i8;
                    int i9 = a14;
                    int i11 = a17;
                    pVar.f19088g = i2.getLong(i11);
                    int i12 = a15;
                    int i13 = a18;
                    pVar.f19089h = i2.getLong(i13);
                    int i14 = i6;
                    int i15 = a12;
                    int i16 = a19;
                    pVar.f19090i = i2.getLong(i16);
                    int i17 = a21;
                    pVar.f19092k = i2.getInt(i17);
                    int i18 = a22;
                    int i19 = i13;
                    pVar.f19093l = C5972v.m14455b(i2.getInt(i18));
                    a19 = i16;
                    int i21 = i15;
                    int i22 = a23;
                    pVar.f19094m = i2.getLong(i22);
                    int i23 = i17;
                    int i24 = i18;
                    int i25 = a24;
                    pVar.f19095n = i2.getLong(i25);
                    int i26 = i22;
                    a24 = i25;
                    int i27 = a25;
                    pVar.f19096o = i2.getLong(i27);
                    int i28 = i23;
                    int i29 = a26;
                    pVar.f19097p = i2.getLong(i29);
                    int i31 = a27;
                    if (i2.getInt(i31) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    pVar.f19098q = z5;
                    int i32 = a28;
                    int i33 = i29;
                    pVar.f19099r = C5972v.m14457d(i2.getInt(i32));
                    pVar.f19091j = bVar;
                    ArrayList arrayList3 = arrayList;
                    arrayList3.add(pVar);
                    a28 = i32;
                    a15 = i12;
                    a3 = i14;
                    a18 = i19;
                    a21 = i28;
                    a26 = i33;
                    a27 = i31;
                    a25 = i27;
                    a17 = i11;
                    a14 = i9;
                    a4 = i7;
                    a2 = i5;
                    arrayList2 = arrayList3;
                    a13 = i4;
                    int i34 = i24;
                    a23 = i26;
                    a12 = i21;
                    a22 = i34;
                }
                ArrayList arrayList4 = arrayList;
                i2.close();
                kVar.release();
                ArrayList d = rVar2.mo21946d();
                ArrayList b = rVar2.mo21944b();
                if (!arrayList4.isEmpty()) {
                    i = 0;
                    C4656h.m11960c().mo20178d(new Throwable[0]);
                    C4656h c = C4656h.m11960c();
                    hVar = hVar2;
                    kVar2 = kVar3;
                    tVar = tVar2;
                    m3808a(kVar2, tVar, hVar, arrayList4);
                    c.mo20178d(new Throwable[0]);
                } else {
                    hVar = hVar2;
                    kVar2 = kVar3;
                    tVar = tVar2;
                    i = 0;
                }
                if (!d.isEmpty()) {
                    C4656h.m11960c().mo20178d(new Throwable[i]);
                    C4656h c2 = C4656h.m11960c();
                    m3808a(kVar2, tVar, hVar, d);
                    c2.mo20178d(new Throwable[i]);
                }
                if (!b.isEmpty()) {
                    C4656h.m11960c().mo20178d(new Throwable[i]);
                    C4656h c3 = C4656h.m11960c();
                    m3808a(kVar2, tVar, hVar, b);
                    c3.mo20178d(new Throwable[i]);
                }
                return new ListenableWorker.C1379a.C1382c();
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
}
