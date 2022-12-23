package com.google.protobuf;

import p911xg.C20494d;

/* renamed from: com.google.protobuf.m */
public class C14619m {

    /* renamed from: a */
    public volatile C14629t f36865a;

    /* renamed from: b */
    public volatile ByteString f36866b;

    static {
        C20494d.m48117a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.protobuf.C14629t mo44103a(com.google.protobuf.C14629t r2) {
        /*
            r1 = this;
            com.google.protobuf.t r0 = r1.f36865a
            if (r0 == 0) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            monitor-enter(r1)
            com.google.protobuf.t r0 = r1.f36865a     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            goto L_0x001a
        L_0x000c:
            r1.f36865a = r2     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            com.google.protobuf.ByteString r0 = com.google.protobuf.ByteString.f36798b     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            r1.f36866b = r0     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            goto L_0x0019
        L_0x0013:
            r1.f36865a = r2     // Catch:{ all -> 0x001d }
            com.google.protobuf.ByteString r2 = com.google.protobuf.ByteString.f36798b     // Catch:{ all -> 0x001d }
            r1.f36866b = r2     // Catch:{ all -> 0x001d }
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
        L_0x001a:
            com.google.protobuf.t r2 = r1.f36865a
            return r2
        L_0x001d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C14619m.mo44103a(com.google.protobuf.t):com.google.protobuf.t");
    }

    /* renamed from: b */
    public final ByteString mo44104b() {
        if (this.f36866b != null) {
            return this.f36866b;
        }
        synchronized (this) {
            if (this.f36866b != null) {
                ByteString byteString = this.f36866b;
                return byteString;
            }
            if (this.f36865a == null) {
                this.f36866b = ByteString.f36798b;
            } else {
                this.f36866b = this.f36865a.toByteString();
            }
            ByteString byteString2 = this.f36866b;
            return byteString2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14619m)) {
            return false;
        }
        C14619m mVar = (C14619m) obj;
        C14629t tVar = this.f36865a;
        C14629t tVar2 = mVar.f36865a;
        if (tVar == null && tVar2 == null) {
            return mo44104b().equals(mVar.mo44104b());
        }
        if (tVar != null && tVar2 != null) {
            return tVar.equals(tVar2);
        }
        if (tVar != null) {
            return tVar.equals(mVar.mo44103a(tVar.mo43949j()));
        }
        return mo44103a(tVar2.mo43949j()).equals(tVar2);
    }

    public int hashCode() {
        return 1;
    }
}
