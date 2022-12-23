package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Map;
import p075ea.C4614a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.a */
public final class C3868a extends SchedulerConfig {

    /* renamed from: a */
    public final C4614a f13392a;

    /* renamed from: b */
    public final Map<Priority, SchedulerConfig.C3866a> f13393b;

    public C3868a(C4614a aVar, Map<Priority, SchedulerConfig.C3866a> map) {
        if (aVar != null) {
            this.f13392a = aVar;
            if (map != null) {
                this.f13393b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    /* renamed from: a */
    public final C4614a mo15780a() {
        return this.f13392a;
    }

    /* renamed from: c */
    public final Map<Priority, SchedulerConfig.C3866a> mo15782c() {
        return this.f13393b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        if (!this.f13392a.equals(schedulerConfig.mo15780a()) || !this.f13393b.equals(schedulerConfig.mo15782c())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f13392a.hashCode() ^ 1000003) * 1000003) ^ this.f13393b.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("SchedulerConfig{clock=");
        k.append(this.f13392a);
        k.append(", values=");
        k.append(this.f13393b);
        k.append("}");
        return k.toString();
    }
}
