package com.vungle.warren;

import p359ag.C13450g;
import p359ag.C13452i;
import p359ag.C13454k;
import p384bg.C13622c;
import p389bl.C13641g;

/* renamed from: com.vungle.warren.s */
public final class C23220s {
    @C13622c("enabled")

    /* renamed from: a */
    private final boolean f58928a;
    @C13622c("clear_shared_cache_timestamp")

    /* renamed from: b */
    private final long f58929b;

    public C23220s(boolean z, long j) {
        this.f58928a = z;
        this.f58929b = j;
    }

    /* renamed from: a */
    public static C23220s m57253a(C13452i iVar) {
        if (!C13641g.m34129r(iVar, "clever_cache")) {
            return null;
        }
        long j = -1;
        boolean z = true;
        C13452i K = iVar.mo40353K("clever_cache");
        try {
            if (K.mo40354L("clear_shared_cache_timestamp")) {
                j = K.mo40351I("clear_shared_cache_timestamp").mo40339z();
            }
        } catch (NumberFormatException unused) {
        }
        if (K.mo40354L("enabled")) {
            C13450g I = K.mo40351I("enabled");
            I.getClass();
            if ((I instanceof C13454k) && "false".equalsIgnoreCase(I.mo40326B())) {
                z = false;
            }
        }
        return new C23220s(z, j);
    }

    /* renamed from: b */
    public final long mo58313b() {
        return this.f58929b;
    }

    /* renamed from: c */
    public final boolean mo58314c() {
        return this.f58928a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C23220s.class != obj.getClass()) {
            return false;
        }
        C23220s sVar = (C23220s) obj;
        if (this.f58928a == sVar.f58928a && this.f58929b == sVar.f58929b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f58929b;
        return ((this.f58928a ? 1 : 0) * true) + ((int) (j ^ (j >>> 32)));
    }
}
