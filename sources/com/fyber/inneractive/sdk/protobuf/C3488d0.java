package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.d0 */
public class C3488d0 {

    /* renamed from: a */
    public volatile C3564q0 f12413a;

    /* renamed from: b */
    public volatile C3508i f12414b;

    static {
        C3562q.m9406a();
    }

    /* renamed from: a */
    public C3508i mo14814a() {
        if (this.f12414b != null) {
            return this.f12414b;
        }
        synchronized (this) {
            if (this.f12414b != null) {
                C3508i iVar = this.f12414b;
                return iVar;
            }
            if (this.f12413a == null) {
                this.f12414b = C3508i.f12443b;
            } else {
                this.f12414b = this.f12413a.toByteString();
            }
            C3508i iVar2 = this.f12414b;
            return iVar2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3488d0)) {
            return false;
        }
        C3488d0 d0Var = (C3488d0) obj;
        C3564q0 q0Var = this.f12413a;
        C3564q0 q0Var2 = d0Var.f12413a;
        if (q0Var == null && q0Var2 == null) {
            return mo14814a().equals(d0Var.mo14814a());
        }
        if (q0Var != null && q0Var2 != null) {
            return q0Var.equals(q0Var2);
        }
        if (q0Var != null) {
            return q0Var.equals(d0Var.mo14815a(q0Var.getDefaultInstanceForType()));
        }
        return mo14815a(q0Var2.getDefaultInstanceForType()).equals(q0Var2);
    }

    public int hashCode() {
        return 1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fyber.inneractive.sdk.protobuf.C3564q0 mo14815a(com.fyber.inneractive.sdk.protobuf.C3564q0 r2) {
        /*
            r1 = this;
            com.fyber.inneractive.sdk.protobuf.q0 r0 = r1.f12413a
            if (r0 == 0) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            monitor-enter(r1)
            com.fyber.inneractive.sdk.protobuf.q0 r0 = r1.f12413a     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            goto L_0x001a
        L_0x000c:
            r1.f12413a = r2     // Catch:{ a0 -> 0x0013 }
            com.fyber.inneractive.sdk.protobuf.i r0 = com.fyber.inneractive.sdk.protobuf.C3508i.f12443b     // Catch:{ a0 -> 0x0013 }
            r1.f12414b = r0     // Catch:{ a0 -> 0x0013 }
            goto L_0x0019
        L_0x0013:
            r1.f12413a = r2     // Catch:{ all -> 0x001d }
            com.fyber.inneractive.sdk.protobuf.i r2 = com.fyber.inneractive.sdk.protobuf.C3508i.f12443b     // Catch:{ all -> 0x001d }
            r1.f12414b = r2     // Catch:{ all -> 0x001d }
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
        L_0x001a:
            com.fyber.inneractive.sdk.protobuf.q0 r2 = r1.f12413a
            return r2
        L_0x001d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3488d0.mo14815a(com.fyber.inneractive.sdk.protobuf.q0):com.fyber.inneractive.sdk.protobuf.q0");
    }
}
