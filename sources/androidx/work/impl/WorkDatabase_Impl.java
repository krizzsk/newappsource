package androidx.work.impl;

import android.content.Context;
import androidx.room.C1256a;
import androidx.room.C1259d;
import androidx.room.RoomDatabase;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p192o3.C5934b;
import p192o3.C5935c;
import p192o3.C5938e;
import p192o3.C5939f;
import p192o3.C5942h;
import p192o3.C5943i;
import p192o3.C5947k;
import p192o3.C5948l;
import p192o3.C5951n;
import p192o3.C5952o;
import p192o3.C5958q;
import p192o3.C5959r;
import p192o3.C5969t;
import p192o3.C5970u;
import p217q2.C6155h;
import p243s2.C6420c;
import p243s2.C6421d;
import p269u2.C6679c;
import p281v2.C6846a;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: u */
    public static final /* synthetic */ int f5156u = 0;

    /* renamed from: n */
    public volatile C5959r f5157n;

    /* renamed from: o */
    public volatile C5935c f5158o;

    /* renamed from: p */
    public volatile C5970u f5159p;

    /* renamed from: q */
    public volatile C5943i f5160q;

    /* renamed from: r */
    public volatile C5948l f5161r;

    /* renamed from: s */
    public volatile C5952o f5162s;

    /* renamed from: t */
    public volatile C5939f f5163t;

    /* renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    public class C1390a extends C1259d.C1260a {
        public C1390a() {
            super(12);
        }

        /* renamed from: a */
        public final void mo5207a(C6846a aVar) {
            aVar.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            aVar.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            aVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            aVar.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            aVar.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            aVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            aVar.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            aVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            aVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        /* renamed from: b */
        public final void mo5208b(C6846a aVar) {
            aVar.execSQL("DROP TABLE IF EXISTS `Dependency`");
            aVar.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
            aVar.execSQL("DROP TABLE IF EXISTS `WorkTag`");
            aVar.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
            aVar.execSQL("DROP TABLE IF EXISTS `WorkName`");
            aVar.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
            aVar.execSQL("DROP TABLE IF EXISTS `Preference`");
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i = WorkDatabase_Impl.f5156u;
            List<RoomDatabase.C1253b> list = workDatabase_Impl.f4714g;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    WorkDatabase_Impl.this.f4714g.get(i2).getClass();
                }
            }
        }

        /* renamed from: c */
        public final void mo5209c() {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i = WorkDatabase_Impl.f5156u;
            List<RoomDatabase.C1253b> list = workDatabase_Impl.f4714g;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    WorkDatabase_Impl.this.f4714g.get(i2).getClass();
                }
            }
        }

        /* renamed from: d */
        public final void mo5210d(C6846a aVar) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i = WorkDatabase_Impl.f5156u;
            workDatabase_Impl.f4708a = aVar;
            aVar.execSQL("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.mo5192h(aVar);
            List<RoomDatabase.C1253b> list = WorkDatabase_Impl.this.f4714g;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    WorkDatabase_Impl.this.f4714g.get(i2).mo5198a(aVar);
                }
            }
        }

        /* renamed from: e */
        public final void mo5211e() {
        }

        /* renamed from: f */
        public final void mo5212f(C6846a aVar) {
            C6420c.m15328a(aVar);
        }

        /* renamed from: g */
        public final C1259d.C1261b mo5213g(C6846a aVar) {
            C6846a aVar2 = aVar;
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new C6421d.C6422a(1, "work_spec_id", "TEXT", (String) null, true, 1));
            hashMap.put("prerequisite_id", new C6421d.C6422a(2, "prerequisite_id", "TEXT", (String) null, true, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C6421d.C6423b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            hashSet.add(new C6421d.C6423b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C6421d.C6425d(Arrays.asList(new String[]{"work_spec_id"}), "index_Dependency_work_spec_id", false));
            hashSet2.add(new C6421d.C6425d(Arrays.asList(new String[]{"prerequisite_id"}), "index_Dependency_prerequisite_id", false));
            C6421d dVar = new C6421d("Dependency", hashMap, hashSet, hashSet2);
            C6421d a = C6421d.m15329a(aVar2, "Dependency");
            if (!dVar.equals(a)) {
                return new C1259d.C1261b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + dVar + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new C6421d.C6422a(1, "id", "TEXT", (String) null, true, 1));
            hashMap2.put("state", new C6421d.C6422a(0, "state", "INTEGER", (String) null, true, 1));
            hashMap2.put("worker_class_name", new C6421d.C6422a(0, "worker_class_name", "TEXT", (String) null, true, 1));
            hashMap2.put("input_merger_class_name", new C6421d.C6422a(0, "input_merger_class_name", "TEXT", (String) null, false, 1));
            hashMap2.put("input", new C6421d.C6422a(0, "input", "BLOB", (String) null, true, 1));
            hashMap2.put("output", new C6421d.C6422a(0, "output", "BLOB", (String) null, true, 1));
            hashMap2.put("initial_delay", new C6421d.C6422a(0, "initial_delay", "INTEGER", (String) null, true, 1));
            hashMap2.put("interval_duration", new C6421d.C6422a(0, "interval_duration", "INTEGER", (String) null, true, 1));
            hashMap2.put("flex_duration", new C6421d.C6422a(0, "flex_duration", "INTEGER", (String) null, true, 1));
            hashMap2.put("run_attempt_count", new C6421d.C6422a(0, "run_attempt_count", "INTEGER", (String) null, true, 1));
            hashMap2.put("backoff_policy", new C6421d.C6422a(0, "backoff_policy", "INTEGER", (String) null, true, 1));
            hashMap2.put("backoff_delay_duration", new C6421d.C6422a(0, "backoff_delay_duration", "INTEGER", (String) null, true, 1));
            hashMap2.put("period_start_time", new C6421d.C6422a(0, "period_start_time", "INTEGER", (String) null, true, 1));
            hashMap2.put("minimum_retention_duration", new C6421d.C6422a(0, "minimum_retention_duration", "INTEGER", (String) null, true, 1));
            hashMap2.put("schedule_requested_at", new C6421d.C6422a(0, "schedule_requested_at", "INTEGER", (String) null, true, 1));
            hashMap2.put("run_in_foreground", new C6421d.C6422a(0, "run_in_foreground", "INTEGER", (String) null, true, 1));
            hashMap2.put("out_of_quota_policy", new C6421d.C6422a(0, "out_of_quota_policy", "INTEGER", (String) null, true, 1));
            hashMap2.put("required_network_type", new C6421d.C6422a(0, "required_network_type", "INTEGER", (String) null, false, 1));
            hashMap2.put("requires_charging", new C6421d.C6422a(0, "requires_charging", "INTEGER", (String) null, true, 1));
            hashMap2.put("requires_device_idle", new C6421d.C6422a(0, "requires_device_idle", "INTEGER", (String) null, true, 1));
            hashMap2.put("requires_battery_not_low", new C6421d.C6422a(0, "requires_battery_not_low", "INTEGER", (String) null, true, 1));
            hashMap2.put("requires_storage_not_low", new C6421d.C6422a(0, "requires_storage_not_low", "INTEGER", (String) null, true, 1));
            hashMap2.put("trigger_content_update_delay", new C6421d.C6422a(0, "trigger_content_update_delay", "INTEGER", (String) null, true, 1));
            hashMap2.put("trigger_max_content_delay", new C6421d.C6422a(0, "trigger_max_content_delay", "INTEGER", (String) null, true, 1));
            hashMap2.put("content_uri_triggers", new C6421d.C6422a(0, "content_uri_triggers", "BLOB", (String) null, false, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C6421d.C6425d(Arrays.asList(new String[]{"schedule_requested_at"}), "index_WorkSpec_schedule_requested_at", false));
            hashSet4.add(new C6421d.C6425d(Arrays.asList(new String[]{"period_start_time"}), "index_WorkSpec_period_start_time", false));
            C6421d dVar2 = new C6421d("WorkSpec", hashMap2, hashSet3, hashSet4);
            C6421d a2 = C6421d.m15329a(aVar2, "WorkSpec");
            if (!dVar2.equals(a2)) {
                return new C1259d.C1261b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + dVar2 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new C6421d.C6422a(1, "tag", "TEXT", (String) null, true, 1));
            hashMap3.put("work_spec_id", new C6421d.C6422a(2, "work_spec_id", "TEXT", (String) null, true, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C6421d.C6423b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C6421d.C6425d(Arrays.asList(new String[]{"work_spec_id"}), "index_WorkTag_work_spec_id", false));
            C6421d dVar3 = new C6421d("WorkTag", hashMap3, hashSet5, hashSet6);
            C6421d a3 = C6421d.m15329a(aVar2, "WorkTag");
            if (!dVar3.equals(a3)) {
                return new C1259d.C1261b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + dVar3 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new C6421d.C6422a(1, "work_spec_id", "TEXT", (String) null, true, 1));
            hashMap4.put("system_id", new C6421d.C6422a(0, "system_id", "INTEGER", (String) null, true, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C6421d.C6423b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            C6421d dVar4 = new C6421d("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            C6421d a4 = C6421d.m15329a(aVar2, "SystemIdInfo");
            if (!dVar4.equals(a4)) {
                return new C1259d.C1261b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + dVar4 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new C6421d.C6422a(1, "name", "TEXT", (String) null, true, 1));
            hashMap5.put("work_spec_id", new C6421d.C6422a(2, "work_spec_id", "TEXT", (String) null, true, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C6421d.C6423b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C6421d.C6425d(Arrays.asList(new String[]{"work_spec_id"}), "index_WorkName_work_spec_id", false));
            C6421d dVar5 = new C6421d("WorkName", hashMap5, hashSet8, hashSet9);
            C6421d a5 = C6421d.m15329a(aVar2, "WorkName");
            if (!dVar5.equals(a5)) {
                return new C1259d.C1261b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + dVar5 + "\n Found:\n" + a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new C6421d.C6422a(1, "work_spec_id", "TEXT", (String) null, true, 1));
            hashMap6.put("progress", new C6421d.C6422a(0, "progress", "BLOB", (String) null, true, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C6421d.C6423b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            C6421d dVar6 = new C6421d("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            C6421d a6 = C6421d.m15329a(aVar2, "WorkProgress");
            if (!dVar6.equals(a6)) {
                return new C1259d.C1261b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + dVar6 + "\n Found:\n" + a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put(LinksConfiguration.KEY_KEY, new C6421d.C6422a(1, LinksConfiguration.KEY_KEY, "TEXT", (String) null, true, 1));
            hashMap7.put("long_value", new C6421d.C6422a(0, "long_value", "INTEGER", (String) null, false, 1));
            C6421d dVar7 = new C6421d("Preference", hashMap7, new HashSet(0), new HashSet(0));
            C6421d a7 = C6421d.m15329a(aVar2, "Preference");
            if (dVar7.equals(a7)) {
                return new C1259d.C1261b(true, (String) null);
            }
            return new C1259d.C1261b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + dVar7 + "\n Found:\n" + a7);
        }
    }

    /* renamed from: d */
    public final C6155h mo5188d() {
        return new C6155h(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* renamed from: e */
    public final C6679c mo5189e(C1256a aVar) {
        C1259d dVar = new C1259d(aVar, new C1390a(), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        Context context = aVar.f4734b;
        String str = aVar.f4735c;
        if (context != null) {
            return aVar.f4733a.mo20274a(new C6679c.C6681b(context, str, dVar, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    /* renamed from: l */
    public final C5934b mo5696l() {
        C5935c cVar;
        if (this.f5158o != null) {
            return this.f5158o;
        }
        synchronized (this) {
            if (this.f5158o == null) {
                this.f5158o = new C5935c(this);
            }
            cVar = this.f5158o;
        }
        return cVar;
    }

    /* renamed from: m */
    public final C5938e mo5697m() {
        C5939f fVar;
        if (this.f5163t != null) {
            return this.f5163t;
        }
        synchronized (this) {
            if (this.f5163t == null) {
                this.f5163t = new C5939f(this);
            }
            fVar = this.f5163t;
        }
        return fVar;
    }

    /* renamed from: n */
    public final C5942h mo5698n() {
        C5943i iVar;
        if (this.f5160q != null) {
            return this.f5160q;
        }
        synchronized (this) {
            if (this.f5160q == null) {
                this.f5160q = new C5943i(this);
            }
            iVar = this.f5160q;
        }
        return iVar;
    }

    /* renamed from: o */
    public final C5947k mo5699o() {
        C5948l lVar;
        if (this.f5161r != null) {
            return this.f5161r;
        }
        synchronized (this) {
            if (this.f5161r == null) {
                this.f5161r = new C5948l(this);
            }
            lVar = this.f5161r;
        }
        return lVar;
    }

    /* renamed from: p */
    public final C5951n mo5700p() {
        C5952o oVar;
        if (this.f5162s != null) {
            return this.f5162s;
        }
        synchronized (this) {
            if (this.f5162s == null) {
                this.f5162s = new C5952o(this);
            }
            oVar = this.f5162s;
        }
        return oVar;
    }

    /* renamed from: q */
    public final C5958q mo5701q() {
        C5959r rVar;
        if (this.f5157n != null) {
            return this.f5157n;
        }
        synchronized (this) {
            if (this.f5157n == null) {
                this.f5157n = new C5959r(this);
            }
            rVar = this.f5157n;
        }
        return rVar;
    }

    /* renamed from: r */
    public final C5969t mo5702r() {
        C5970u uVar;
        if (this.f5159p != null) {
            return this.f5159p;
        }
        synchronized (this) {
            if (this.f5159p == null) {
                this.f5159p = new C5970u(this);
            }
            uVar = this.f5159p;
        }
        return uVar;
    }
}
