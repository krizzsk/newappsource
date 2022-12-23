package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import java.util.Map;
import java.util.Set;
import p075ea.C4614a;

public abstract class SchedulerConfig {

    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$a */
    public static abstract class C3866a {

        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$a$a */
        public static abstract class C3867a {
        }

        /* renamed from: a */
        public abstract long mo15783a();

        /* renamed from: b */
        public abstract Set<Flag> mo15784b();

        /* renamed from: c */
        public abstract long mo15785c();
    }

    /* renamed from: a */
    public abstract C4614a mo15780a();

    /* renamed from: b */
    public final long mo15781b(Priority priority, long j, int i) {
        long j2;
        long V = j - mo15780a().mo20139V();
        C3866a aVar = mo15782c().get(priority);
        long a = aVar.mo15783a();
        int i2 = i - 1;
        if (a > 1) {
            j2 = a;
        } else {
            j2 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, (double) i2) * ((double) a) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) (j2 * ((long) i2))))), V), aVar.mo15785c());
    }

    /* renamed from: c */
    public abstract Map<Priority, C3866a> mo15782c();
}
