package p896wp;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: wp.f */
public final /* synthetic */ class C20386f implements Continuation {

    /* renamed from: b */
    public final /* synthetic */ Task f51687b;

    /* renamed from: c */
    public final /* synthetic */ Task f51688c;

    /* renamed from: d */
    public final /* synthetic */ Context f51689d;

    public /* synthetic */ C20386f(Task task, Task task2, Context context) {
        this.f51687b = task;
        this.f51688c = task2;
        this.f51689d = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.google.android.gms.ads.identifier.AdvertisingIdClient$Info} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object then(com.google.android.gms.tasks.Task r5) {
        /*
            r4 = this;
            com.google.android.gms.tasks.Task r5 = r4.f51687b
            com.google.android.gms.tasks.Task r0 = r4.f51688c
            android.content.Context r1 = r4.f51689d
            boolean r2 = r5.isSuccessful()
            r3 = 0
            if (r2 == 0) goto L_0x0018
            java.lang.Object r5 = r5.getResult()
            com.google.android.gms.appset.AppSetIdInfo r5 = (com.google.android.gms.appset.AppSetIdInfo) r5
            java.lang.String r5 = r5.getId()
            goto L_0x0019
        L_0x0018:
            r5 = r3
        L_0x0019:
            boolean r2 = r0.isSuccessful()
            if (r2 == 0) goto L_0x0026
            java.lang.Object r2 = r0.getResult()
            r3 = r2
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r3 = (com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) r3
        L_0x0026:
            if (r3 == 0) goto L_0x004c
            com.appsflyer.AppsFlyerLib r0 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r0 = r0.getAppsFlyerUID(r1)
            boolean r1 = p977zz.C20964s0.m49090h(r0)
            if (r1 != 0) goto L_0x0044
            com.moovit.ads.AdvertisingInfo r1 = new com.moovit.ads.AdvertisingInfo
            java.lang.String r2 = r3.getId()
            boolean r3 = r3.isLimitAdTrackingEnabled()
            r1.<init>(r2, r0, r5, r3)
            return r1
        L_0x0044:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "Appsflyer id is empty!"
            r5.<init>(r0)
            throw r5
        L_0x004c:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.Exception r0 = r0.getException()
            java.lang.String r1 = "Advertising info task failed!"
            r5.<init>(r1, r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p896wp.C20386f.then(com.google.android.gms.tasks.Task):java.lang.Object");
    }
}
