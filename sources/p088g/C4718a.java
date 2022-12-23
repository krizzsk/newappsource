package p088g;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;
import p101h.C5012a;

/* renamed from: g.a */
public final class C4718a {

    /* renamed from: a */
    public final Context f16006a;

    /* renamed from: b */
    public final C4719a f16007b;

    /* renamed from: c */
    public final String f16008c;

    /* renamed from: d */
    public final C5012a f16009d;

    /* renamed from: e */
    public final AtomicLong f16010e = new AtomicLong(0);

    /* renamed from: g.a$a */
    public class C4719a implements ServiceConnection {

        /* renamed from: b */
        public final LinkedBlockingQueue f16011b = new LinkedBlockingQueue();

        public C4719a() {
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f16011b.add(iBinder);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            C4718a aVar = C4718a.this;
            if (aVar.f16010e.getAndSet(Long.MIN_VALUE) >= 0) {
                aVar.f16006a.unbindService(aVar.f16007b);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0025 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4718a(android.content.Context r14) throws androidx.ads.identifier.AdvertisingIdNotAvailableException, java.io.IOException, java.util.concurrent.TimeoutException, java.lang.InterruptedException {
        /*
            r13 = this;
            r13.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            r13.f16010e = r0
            r13.f16006a = r14
            android.content.pm.PackageManager r14 = r14.getPackageManager()
            java.util.List r0 = p077f.C4630g.m11942a(r14)
            boolean r1 = r0.isEmpty()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0020
            goto L_0x008d
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
            r1 = r3
        L_0x0025:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x008d
            java.lang.Object r4 = r0.next()
            android.content.pm.ServiceInfo r4 = (android.content.pm.ServiceInfo) r4
            java.lang.String r5 = r4.packageName     // Catch:{ NameNotFoundException -> 0x008b }
            r6 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r5 = r14.getPackageInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x008b }
            if (r1 == 0) goto L_0x0088
            java.lang.String[] r6 = r5.requestedPermissions
            java.lang.String r7 = "androidx.ads.identifier.provider.HIGH_PRIORITY"
            r8 = 0
            if (r6 != 0) goto L_0x0044
        L_0x0042:
            r6 = 0
            goto L_0x0055
        L_0x0044:
            int r9 = r6.length
            r10 = 0
        L_0x0046:
            if (r10 >= r9) goto L_0x0042
            r11 = r6[r10]
            boolean r11 = r7.equals(r11)
            if (r11 == 0) goto L_0x0052
            r6 = 1
            goto L_0x0055
        L_0x0052:
            int r10 = r10 + 1
            goto L_0x0046
        L_0x0055:
            java.lang.String[] r9 = r1.requestedPermissions
            if (r9 != 0) goto L_0x005b
        L_0x0059:
            r7 = 0
            goto L_0x006c
        L_0x005b:
            int r10 = r9.length
            r11 = 0
        L_0x005d:
            if (r11 >= r10) goto L_0x0059
            r12 = r9[r11]
            boolean r12 = r7.equals(r12)
            if (r12 == 0) goto L_0x0069
            r7 = 1
            goto L_0x006c
        L_0x0069:
            int r11 = r11 + 1
            goto L_0x005d
        L_0x006c:
            if (r6 == r7) goto L_0x0070
            r8 = r6
            goto L_0x0086
        L_0x0070:
            long r6 = r5.firstInstallTime
            long r9 = r1.firstInstallTime
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x007b
            if (r11 >= 0) goto L_0x0086
            goto L_0x0085
        L_0x007b:
            java.lang.String r6 = r5.packageName
            java.lang.String r7 = r1.packageName
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L_0x0086
        L_0x0085:
            r8 = 1
        L_0x0086:
            if (r8 == 0) goto L_0x0025
        L_0x0088:
            r3 = r4
            r1 = r5
            goto L_0x0025
        L_0x008b:
            goto L_0x0025
        L_0x008d:
            if (r3 == 0) goto L_0x00ee
            android.content.ComponentName r14 = new android.content.ComponentName
            java.lang.String r0 = r3.packageName
            java.lang.String r1 = r3.name
            r14.<init>(r0, r1)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "androidx.ads.identifier.provider.GET_AD_ID"
            r0.<init>(r1)
            r0.setComponent(r14)
            g.a$a r1 = new g.a$a
            r1.<init>()
            android.content.Context r3 = r13.f16006a
            boolean r0 = r3.bindService(r0, r1, r2)
            if (r0 == 0) goto L_0x00e6
            r13.f16007b = r1
            java.util.concurrent.LinkedBlockingQueue r0 = r1.f16011b
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 10
            java.lang.Object r0 = r0.poll(r2, r1)
            android.os.IBinder r0 = (android.os.IBinder) r0
            if (r0 == 0) goto L_0x00de
            int r1 = p101h.C5012a.C5013a.f16978b
            java.lang.String r1 = "androidx.ads.identifier.provider.IAdvertisingIdService"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            if (r1 == 0) goto L_0x00d0
            boolean r2 = r1 instanceof p101h.C5012a
            if (r2 == 0) goto L_0x00d0
            h.a r1 = (p101h.C5012a) r1
            goto L_0x00d5
        L_0x00d0:
            h.a$a$a r1 = new h.a$a$a
            r1.<init>(r0)
        L_0x00d5:
            r13.f16009d = r1
            java.lang.String r14 = r14.getPackageName()
            r13.f16008c = r14
            return
        L_0x00de:
            java.util.concurrent.TimeoutException r14 = new java.util.concurrent.TimeoutException
            java.lang.String r0 = "Timed out waiting for the service connection"
            r14.<init>(r0)
            throw r14
        L_0x00e6:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r0 = "Connection failure"
            r14.<init>(r0)
            throw r14
        L_0x00ee:
            androidx.ads.identifier.AdvertisingIdNotAvailableException r14 = new androidx.ads.identifier.AdvertisingIdNotAvailableException
            java.lang.String r0 = "No compatible AndroidX Advertising ID Provider available."
            r14.<init>((java.lang.String) r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p088g.C4718a.<init>(android.content.Context):void");
    }
}
