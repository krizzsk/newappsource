package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import p230r2.C6238a;
import p281v2.C6846a;

/* renamed from: androidx.work.impl.a */
public final class C1391a {

    /* renamed from: a */
    public static C1392a f5165a = new C1392a();

    /* renamed from: b */
    public static C1393b f5166b = new C1393b();

    /* renamed from: c */
    public static C1394c f5167c = new C1394c();

    /* renamed from: d */
    public static C1395d f5168d = new C1395d();

    /* renamed from: e */
    public static C1396e f5169e = new C1396e();

    /* renamed from: f */
    public static C1397f f5170f = new C1397f();

    /* renamed from: g */
    public static C1398g f5171g = new C1398g();

    /* renamed from: androidx.work.impl.a$a */
    public class C1392a extends C6238a {
        public C1392a() {
            super(1, 2);
        }

        /* renamed from: a */
        public final void mo5703a(C6846a aVar) {
            aVar.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.execSQL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            aVar.execSQL("DROP TABLE IF EXISTS alarmInfo");
            aVar.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* renamed from: androidx.work.impl.a$b */
    public class C1393b extends C6238a {
        public C1393b() {
            super(3, 4);
        }

        /* renamed from: a */
        public final void mo5703a(C6846a aVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                aVar.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* renamed from: androidx.work.impl.a$c */
    public class C1394c extends C6238a {
        public C1394c() {
            super(4, 5);
        }

        /* renamed from: a */
        public final void mo5703a(C6846a aVar) {
            aVar.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            aVar.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* renamed from: androidx.work.impl.a$d */
    public class C1395d extends C6238a {
        public C1395d() {
            super(6, 7);
        }

        /* renamed from: a */
        public final void mo5703a(C6846a aVar) {
            aVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* renamed from: androidx.work.impl.a$e */
    public class C1396e extends C6238a {
        public C1396e() {
            super(7, 8);
        }

        /* renamed from: a */
        public final void mo5703a(C6846a aVar) {
            aVar.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* renamed from: androidx.work.impl.a$f */
    public class C1397f extends C6238a {
        public C1397f() {
            super(8, 9);
        }

        /* renamed from: a */
        public final void mo5703a(C6846a aVar) {
            aVar.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.a$g */
    public class C1398g extends C6238a {
        public C1398g() {
            super(11, 12);
        }

        /* renamed from: a */
        public final void mo5703a(C6846a aVar) {
            aVar.execSQL("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.a$h */
    public static class C1399h extends C6238a {

        /* renamed from: c */
        public final Context f5172c;

        public C1399h(Context context, int i, int i2) {
            super(i, i2);
            this.f5172c = context;
        }

        /* renamed from: a */
        public final void mo5703a(C6846a aVar) {
            if (this.f19687b >= 10) {
                aVar.mo23085a("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                return;
            }
            this.f5172c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }

    /* renamed from: androidx.work.impl.a$i */
    public static class C1400i extends C6238a {

        /* renamed from: c */
        public final Context f5173c;

        public C1400i(Context context) {
            super(9, 10);
            this.f5173c = context;
        }

        /* renamed from: a */
        public final void mo5703a(C6846a aVar) {
            aVar.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            SharedPreferences sharedPreferences = this.f5173c.getSharedPreferences("androidx.work.util.preferences", 0);
            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j = 0;
                long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
                if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                    j = 1;
                }
                aVar.beginTransaction();
                try {
                    aVar.mo23085a("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                    aVar.mo23085a("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                    sharedPreferences.edit().clear().apply();
                    aVar.setTransactionSuccessful();
                } finally {
                    aVar.endTransaction();
                }
            }
            SharedPreferences sharedPreferences2 = this.f5173c.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                aVar.beginTransaction();
                try {
                    aVar.mo23085a("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                    aVar.mo23085a("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                    sharedPreferences2.edit().clear().apply();
                    aVar.setTransactionSuccessful();
                } finally {
                    aVar.endTransaction();
                }
            }
        }
    }
}
