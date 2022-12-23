package com.facebook.appevents.ondeviceprocessing;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.facebook.internal.C2424o;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import mf0.C24362h;
import p262t8.C6606a;

public final class RemoteServiceWrapper {

    /* renamed from: a */
    public static final RemoteServiceWrapper f8563a = new RemoteServiceWrapper();

    /* renamed from: b */
    public static Boolean f8564b;

    @Metadata(mo59059d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo59060d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;", "", "eventType", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "MOBILE_APP_INSTALL", "CUSTOM_APP_EVENTS", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1}, mo59064xi = 48)
    public enum EventType {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");
        
        private final String eventType;

        private EventType(String str) {
            this.eventType = str;
        }

        public String toString() {
            return this.eventType;
        }
    }

    @Metadata(mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo59060d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;", "", "(Ljava/lang/String;I)V", "OPERATION_SUCCESS", "SERVICE_NOT_AVAILABLE", "SERVICE_ERROR", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1}, mo59064xi = 48)
    public enum ServiceResult {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR
    }

    /* renamed from: com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$a */
    public static final class C2350a implements ServiceConnection {

        /* renamed from: b */
        public final CountDownLatch f8565b = new CountDownLatch(1);

        /* renamed from: c */
        public IBinder f8566c;

        public final void onNullBinding(ComponentName componentName) {
            C24362h.m61211f(componentName, "name");
            this.f8565b.countDown();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C24362h.m61211f(componentName, "name");
            C24362h.m61211f(iBinder, "serviceBinder");
            this.f8566c = iBinder;
            this.f8565b.countDown();
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            C24362h.m61211f(componentName, "name");
        }
    }

    /* renamed from: a */
    public final Intent mo12503a(Context context) {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && C2424o.m6376a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) == null || !C2424o.m6376a(context, "com.facebook.wakizashi")) {
                    return null;
                }
                return intent2;
            }
            return null;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult mo12504b(com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.EventType r9, java.lang.String r10, java.util.List<com.facebook.appevents.AppEvent> r11) {
        /*
            r8 = this;
            boolean r0 = p262t8.C6606a.m15601b(r8)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$ServiceResult r0 = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult.SERVICE_NOT_AVAILABLE     // Catch:{ all -> 0x006c }
            int r2 = p135j8.C5398d.f17731a     // Catch:{ all -> 0x006c }
            android.content.Context r2 = p009a8.C0115o.m210a()     // Catch:{ all -> 0x006c }
            android.content.Intent r3 = r8.mo12503a(r2)     // Catch:{ all -> 0x006c }
            if (r3 == 0) goto L_0x006b
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$a r4 = new com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$a     // Catch:{ all -> 0x006c }
            r4.<init>()     // Catch:{ all -> 0x006c }
            r5 = 1
            boolean r3 = r2.bindService(r3, r4, r5)     // Catch:{ all -> 0x006c }
            if (r3 == 0) goto L_0x0069
            java.util.concurrent.CountDownLatch r3 = r4.f8565b     // Catch:{ InterruptedException -> 0x0056, RemoteException -> 0x004e }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0056, RemoteException -> 0x004e }
            r6 = 5
            r3.await(r6, r5)     // Catch:{ InterruptedException -> 0x0056, RemoteException -> 0x004e }
            android.os.IBinder r3 = r4.f8566c     // Catch:{ InterruptedException -> 0x0056, RemoteException -> 0x004e }
            if (r3 == 0) goto L_0x0046
            y8.a r0 = p324y8.C7345a.C7346a.m16972G(r3)     // Catch:{ InterruptedException -> 0x0056, RemoteException -> 0x004e }
            android.os.Bundle r9 = p159l8.C5640b.m13921a(r9, r10, r11)     // Catch:{ InterruptedException -> 0x0056, RemoteException -> 0x004e }
            if (r9 == 0) goto L_0x0043
            r0.mo23562a(r9)     // Catch:{ InterruptedException -> 0x0056, RemoteException -> 0x004e }
            com.facebook.internal.f0 r10 = com.facebook.internal.C2397f0.f8630a     // Catch:{ InterruptedException -> 0x0056, RemoteException -> 0x004e }
            java.lang.String r10 = "Successfully sent events to the remote service: "
            mf0.C24362h.m61216k(r9, r10)     // Catch:{ InterruptedException -> 0x0056, RemoteException -> 0x004e }
        L_0x0043:
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$ServiceResult r9 = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult.OPERATION_SUCCESS     // Catch:{ InterruptedException -> 0x0056, RemoteException -> 0x004e }
            r0 = r9
        L_0x0046:
            r2.unbindService(r4)     // Catch:{ all -> 0x006c }
            com.facebook.internal.f0 r9 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x006c }
            goto L_0x006b
        L_0x004c:
            r9 = move-exception
            goto L_0x0061
        L_0x004e:
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$ServiceResult r9 = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult.SERVICE_ERROR     // Catch:{ all -> 0x004c }
            com.facebook.internal.f0 r10 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x004c }
            a8.o r10 = p009a8.C0115o.f331a     // Catch:{ all -> 0x004c }
        L_0x0054:
            r0 = r9
            goto L_0x005d
        L_0x0056:
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$ServiceResult r9 = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult.SERVICE_ERROR     // Catch:{ all -> 0x004c }
            com.facebook.internal.f0 r10 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x004c }
            a8.o r10 = p009a8.C0115o.f331a     // Catch:{ all -> 0x004c }
            goto L_0x0054
        L_0x005d:
            r2.unbindService(r4)     // Catch:{ all -> 0x006c }
            goto L_0x006b
        L_0x0061:
            r2.unbindService(r4)     // Catch:{ all -> 0x006c }
            com.facebook.internal.f0 r10 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x006c }
            a8.o r10 = p009a8.C0115o.f331a     // Catch:{ all -> 0x006c }
            throw r9     // Catch:{ all -> 0x006c }
        L_0x0069:
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$ServiceResult r0 = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult.SERVICE_ERROR     // Catch:{ all -> 0x006c }
        L_0x006b:
            return r0
        L_0x006c:
            r9 = move-exception
            p262t8.C6606a.m15600a(r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.mo12504b(com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$EventType, java.lang.String, java.util.List):com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$ServiceResult");
    }
}
