package nd0;

import android.text.TextUtils;
import com.vungle.warren.VungleApiClient;
import java.util.UUID;
import td0.C24933d;

/* renamed from: nd0.i */
public final class C24494i {

    /* renamed from: a */
    public final VungleApiClient f62004a;

    /* renamed from: b */
    public final C24933d f62005b;

    /* renamed from: c */
    public final String f62006c;

    /* renamed from: d */
    public int f62007d;

    public C24494i(VungleApiClient vungleApiClient, C24933d dVar) {
        this.f62004a = vungleApiClient;
        this.f62005b = dVar;
        String c = dVar.mo61494c("device_id", "");
        if (TextUtils.isEmpty(c)) {
            c = UUID.randomUUID().toString();
            dVar.mo61496e("device_id", c);
            dVar.mo61492a();
        }
        this.f62006c = c;
        int i = 0;
        Object obj = dVar.f63019c.get("batch_id");
        this.f62007d = obj instanceof Integer ? ((Integer) obj).intValue() : i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052 A[Catch:{ IOException -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056 A[Catch:{ IOException -> 0x0077 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60744a(java.io.File[] r9) {
        /*
            r8 = this;
            int r0 = r9.length
            r1 = 0
        L_0x0002:
            java.lang.String r2 = "batch_id"
            if (r1 >= r0) goto L_0x0095
            r3 = r9[r1]
            ag.i r4 = new ag.i
            r4.<init>()
            int r5 = r8.f62007d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.mo40348E(r2, r5)
            java.lang.String r2 = r8.f62006c
            java.lang.String r5 = "device_guid"
            r4.mo40349F(r5, r2)
            ag.d r2 = new ag.d     // Catch:{ IOException -> 0x0077 }
            r2.<init>()     // Catch:{ IOException -> 0x0077 }
            r5 = 0
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ Exception -> 0x004b, all -> 0x0046 }
            java.io.FileReader r7 = new java.io.FileReader     // Catch:{ Exception -> 0x004b, all -> 0x0046 }
            r7.<init>(r3)     // Catch:{ Exception -> 0x004b, all -> 0x0046 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x004b, all -> 0x0046 }
        L_0x002d:
            java.lang.String r7 = r6.readLine()     // Catch:{ Exception -> 0x004c, all -> 0x0043 }
            if (r7 == 0) goto L_0x003f
            ag.g r7 = p359ag.C13453j.m33762b(r7)     // Catch:{ Exception -> 0x004c, all -> 0x0043 }
            ag.i r7 = r7.mo40342u()     // Catch:{ Exception -> 0x004c, all -> 0x0043 }
            r2.mo40327C(r7)     // Catch:{ Exception -> 0x004c, all -> 0x0043 }
            goto L_0x002d
        L_0x003f:
            ce0.C21105j.m49396a(r6)     // Catch:{ IOException -> 0x0077 }
            goto L_0x0050
        L_0x0043:
            r2 = move-exception
            r5 = r6
            goto L_0x0047
        L_0x0046:
            r2 = move-exception
        L_0x0047:
            ce0.C21105j.m49396a(r5)     // Catch:{ IOException -> 0x0077 }
            throw r2     // Catch:{ IOException -> 0x0077 }
        L_0x004b:
            r6 = r5
        L_0x004c:
            ce0.C21105j.m49396a(r6)     // Catch:{ IOException -> 0x0077 }
            r2 = r5
        L_0x0050:
            if (r2 != 0) goto L_0x0056
            ce0.C21105j.m49397b(r3)     // Catch:{ IOException -> 0x0077 }
            goto L_0x0091
        L_0x0056:
            java.lang.String r5 = "payload"
            r4.mo40346C(r2, r5)     // Catch:{ IOException -> 0x0077 }
            com.vungle.warren.VungleApiClient r2 = r8.f62004a     // Catch:{ IOException -> 0x0077 }
            java.lang.String r5 = r2.f58572i     // Catch:{ IOException -> 0x0077 }
            if (r5 == 0) goto L_0x0079
            qd0.f r2 = r2.f58581r     // Catch:{ IOException -> 0x0077 }
            java.lang.String r6 = com.vungle.warren.VungleApiClient.f58560C     // Catch:{ IOException -> 0x0077 }
            qd0.d r2 = r2.mo61220b(r6, r5, r4)     // Catch:{ IOException -> 0x0077 }
            qd0.e r2 = r2.mo61216a()     // Catch:{ IOException -> 0x0077 }
            boolean r2 = r2.mo61217a()     // Catch:{ IOException -> 0x0077 }
            if (r2 == 0) goto L_0x0081
            ce0.C21105j.m49397b(r3)     // Catch:{ IOException -> 0x0077 }
            goto L_0x0081
        L_0x0077:
            goto L_0x0081
        L_0x0079:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0077 }
            java.lang.String r3 = "API Client not configured yet! Must call /config first."
            r2.<init>(r3)     // Catch:{ IOException -> 0x0077 }
            throw r2     // Catch:{ IOException -> 0x0077 }
        L_0x0081:
            int r2 = r8.f62007d
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 < r3) goto L_0x008b
            r2 = -1
            r8.f62007d = r2
        L_0x008b:
            int r2 = r8.f62007d
            int r2 = r2 + 1
            r8.f62007d = r2
        L_0x0091:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0095:
            td0.d r9 = r8.f62005b
            int r0 = r8.f62007d
            r9.mo61495d(r0, r2)
            td0.d r9 = r8.f62005b
            r9.mo61492a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nd0.C24494i.mo60744a(java.io.File[]):void");
    }
}
