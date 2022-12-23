package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b */
public final class C3869b extends SchedulerConfig.C3866a {

    /* renamed from: a */
    public final long f13394a;

    /* renamed from: b */
    public final long f13395b;

    /* renamed from: c */
    public final Set<SchedulerConfig.Flag> f13396c;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b$a */
    public static final class C3870a extends SchedulerConfig.C3866a.C3867a {

        /* renamed from: a */
        public Long f13397a;

        /* renamed from: b */
        public Long f13398b;

        /* renamed from: c */
        public Set<SchedulerConfig.Flag> f13399c;

        /* renamed from: a */
        public final C3869b mo15792a() {
            String str;
            if (this.f13397a == null) {
                str = " delta";
            } else {
                str = "";
            }
            if (this.f13398b == null) {
                str = C25541a.m63881k(str, " maxAllowedDelay");
            }
            if (this.f13399c == null) {
                str = C25541a.m63881k(str, " flags");
            }
            if (str.isEmpty()) {
                return new C3869b(this.f13397a.longValue(), this.f13398b.longValue(), this.f13399c);
            }
            throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str));
        }
    }

    public C3869b(long j, long j2, Set set) {
        this.f13394a = j;
        this.f13395b = j2;
        this.f13396c = set;
    }

    /* renamed from: a */
    public final long mo15783a() {
        return this.f13394a;
    }

    /* renamed from: b */
    public final Set<SchedulerConfig.Flag> mo15784b() {
        return this.f13396c;
    }

    /* renamed from: c */
    public final long mo15785c() {
        return this.f13395b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.C3866a)) {
            return false;
        }
        SchedulerConfig.C3866a aVar = (SchedulerConfig.C3866a) obj;
        if (this.f13394a == aVar.mo15783a() && this.f13395b == aVar.mo15785c() && this.f13396c.equals(aVar.mo15784b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f13394a;
        long j2 = this.f13395b;
        return this.f13396c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ConfigValue{delta=");
        k.append(this.f13394a);
        k.append(", maxAllowedDelay=");
        k.append(this.f13395b);
        k.append(", flags=");
        k.append(this.f13396c);
        k.append("}");
        return k.toString();
    }
}
