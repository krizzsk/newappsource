package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.C2607a;
import com.fyber.inneractive.sdk.cache.session.enums.C2608b;

/* renamed from: com.fyber.inneractive.sdk.cache.session.c */
public class C2603c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2607a f9172a;

    /* renamed from: b */
    public final /* synthetic */ C2608b f9173b;

    /* renamed from: c */
    public final /* synthetic */ C2604d f9174c;

    public C2603c(C2604d dVar, C2607a aVar, C2608b bVar) {
        this.f9174c = dVar;
        this.f9172a = aVar;
        this.f9173b = bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:2|3|(2:5|(2:7|(1:(2:10|(1:12)(1:13))(1:14))(1:15)))(1:16)|17|18|19|20|21|22|(1:24)|25) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005c */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r7 = this;
            com.fyber.inneractive.sdk.cache.session.d r0 = r7.f9174c
            java.lang.Object r0 = r0.f9177c
            monitor-enter(r0)
            com.fyber.inneractive.sdk.cache.session.enums.a r1 = r7.f9172a     // Catch:{ all -> 0x0067 }
            com.fyber.inneractive.sdk.cache.session.enums.a r2 = com.fyber.inneractive.sdk.cache.session.enums.C2607a.NEW_SESSION     // Catch:{ all -> 0x0067 }
            if (r1 == r2) goto L_0x003a
            com.fyber.inneractive.sdk.cache.session.d r2 = r7.f9174c     // Catch:{ all -> 0x0067 }
            com.fyber.inneractive.sdk.cache.session.f r2 = r2.f9175a     // Catch:{ all -> 0x0067 }
            com.fyber.inneractive.sdk.cache.session.enums.b r3 = r7.f9173b     // Catch:{ all -> 0x0067 }
            java.util.HashMap<com.fyber.inneractive.sdk.cache.session.enums.b, com.fyber.inneractive.sdk.cache.session.e> r2 = r2.f9200a     // Catch:{ all -> 0x0067 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0067 }
            com.fyber.inneractive.sdk.cache.session.e r2 = (com.fyber.inneractive.sdk.cache.session.C2606e) r2     // Catch:{ all -> 0x0067 }
            if (r2 == 0) goto L_0x0043
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0067 }
            r3 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 == r3) goto L_0x002e
            r4 = 2
            if (r1 == r4) goto L_0x0028
            goto L_0x0043
        L_0x0028:
            int r1 = r2.f9182c     // Catch:{ all -> 0x0067 }
            int r1 = r1 + r3
            r2.f9182c = r1     // Catch:{ all -> 0x0067 }
            goto L_0x0043
        L_0x002e:
            int r1 = r2.f9181b     // Catch:{ all -> 0x0067 }
            int r1 = r1 + r3
            r2.f9181b = r1     // Catch:{ all -> 0x0067 }
            goto L_0x0043
        L_0x0034:
            int r1 = r2.f9180a     // Catch:{ all -> 0x0067 }
            int r1 = r1 + r3
            r2.f9180a = r1     // Catch:{ all -> 0x0067 }
            goto L_0x0043
        L_0x003a:
            com.fyber.inneractive.sdk.cache.session.d r1 = r7.f9174c     // Catch:{ all -> 0x0067 }
            com.fyber.inneractive.sdk.cache.session.f r2 = new com.fyber.inneractive.sdk.cache.session.f     // Catch:{ all -> 0x0067 }
            r2.<init>()     // Catch:{ all -> 0x0067 }
            r1.f9175a = r2     // Catch:{ all -> 0x0067 }
        L_0x0043:
            com.fyber.inneractive.sdk.cache.session.d r1 = r7.f9174c     // Catch:{ all -> 0x0067 }
            org.json.JSONObject r1 = com.fyber.inneractive.sdk.cache.session.C2604d.m6621a((com.fyber.inneractive.sdk.cache.session.C2604d) r1)     // Catch:{ all -> 0x0067 }
            r2 = 0
            java.lang.String r3 = "session_details.json"
            android.app.Application r4 = com.fyber.inneractive.sdk.util.C3707l.f12893a     // Catch:{ UnsupportedEncodingException -> 0x005c }
            java.lang.String r5 = r1.toString()     // Catch:{ UnsupportedEncodingException -> 0x005c }
            java.lang.String r6 = "UTF-8"
            byte[] r5 = r5.getBytes(r6)     // Catch:{ UnsupportedEncodingException -> 0x005c }
            boolean r2 = com.fyber.inneractive.sdk.util.C3707l.m9961a(r3, r4, r5)     // Catch:{ UnsupportedEncodingException -> 0x005c }
        L_0x005c:
            com.fyber.inneractive.sdk.cache.session.d r3 = r7.f9174c     // Catch:{ all -> 0x0067 }
            com.fyber.inneractive.sdk.cache.session.d$a r4 = r3.f9179e     // Catch:{ all -> 0x0067 }
            if (r4 == 0) goto L_0x0065
            r4.mo13179a(r3, r2, r1)     // Catch:{ all -> 0x0067 }
        L_0x0065:
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            return
        L_0x0067:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.cache.session.C2603c.run():void");
    }
}
