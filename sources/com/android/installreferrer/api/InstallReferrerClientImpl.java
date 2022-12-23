package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.installreferrer.commons.InstallReferrerCommons;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p315xb.C7193a;

public final class InstallReferrerClientImpl extends InstallReferrerClient {

    /* renamed from: a */
    public int f6822a = 0;

    /* renamed from: b */
    public final Context f6823b;

    /* renamed from: c */
    public C7193a f6824c;

    /* renamed from: d */
    public C1973a f6825d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    /* renamed from: com.android.installreferrer.api.InstallReferrerClientImpl$a */
    public final class C1973a implements ServiceConnection {

        /* renamed from: b */
        public final InstallReferrerStateListener f6826b;

        public C1973a(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener != null) {
                this.f6826b = installReferrerStateListener;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
            /*
                r2 = this;
                java.lang.String r3 = "InstallReferrerClient"
                java.lang.String r0 = "Install Referrer service connected."
                com.android.installreferrer.commons.InstallReferrerCommons.logVerbose(r3, r0)
                com.android.installreferrer.api.InstallReferrerClientImpl r3 = com.android.installreferrer.api.InstallReferrerClientImpl.this
                int r0 = p315xb.C7193a.C7194a.f22322b
                if (r4 != 0) goto L_0x000f
                r4 = 0
                goto L_0x0023
            L_0x000f:
                java.lang.String r0 = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService"
                android.os.IInterface r0 = r4.queryLocalInterface(r0)
                boolean r1 = r0 instanceof p315xb.C7193a
                if (r1 == 0) goto L_0x001d
                r4 = r0
                xb.a r4 = (p315xb.C7193a) r4
                goto L_0x0023
            L_0x001d:
                xb.a$a$a r0 = new xb.a$a$a
                r0.<init>(r4)
                r4 = r0
            L_0x0023:
                r3.f6824c = r4
                com.android.installreferrer.api.InstallReferrerClientImpl r3 = com.android.installreferrer.api.InstallReferrerClientImpl.this
                r4 = 2
                r3.f6822a = r4
                com.android.installreferrer.api.InstallReferrerStateListener r3 = r2.f6826b
                r4 = 0
                r3.onInstallReferrerSetupFinished(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.installreferrer.api.InstallReferrerClientImpl.C1973a.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
            InstallReferrerClientImpl installReferrerClientImpl = InstallReferrerClientImpl.this;
            installReferrerClientImpl.f6824c = null;
            installReferrerClientImpl.f6822a = 0;
            this.f6826b.onInstallReferrerServiceDisconnected();
        }
    }

    public InstallReferrerClientImpl(Context context) {
        this.f6823b = context.getApplicationContext();
    }

    public final void endConnection() {
        this.f6822a = 3;
        if (this.f6825d != null) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
            this.f6823b.unbindService(this.f6825d);
            this.f6825d = null;
        }
        this.f6824c = null;
    }

    public final ReferrerDetails getInstallReferrer() throws RemoteException {
        if (isReady()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f6823b.getPackageName());
            try {
                return new ReferrerDetails(this.f6824c.mo23498d(bundle));
            } catch (RemoteException e) {
                InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
                this.f6822a = 0;
                throw e;
            }
        } else {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
    }

    public final boolean isReady() {
        return (this.f6822a != 2 || this.f6824c == null || this.f6825d == null) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void startConnection(com.android.installreferrer.api.InstallReferrerStateListener r9) {
        /*
            r8 = this;
            boolean r0 = r8.isReady()
            r1 = 0
            java.lang.String r2 = "InstallReferrerClient"
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = "Service connection is valid. No need to re-initialize."
            com.android.installreferrer.commons.InstallReferrerCommons.logVerbose(r2, r0)
            r9.onInstallReferrerSetupFinished(r1)
            return
        L_0x0012:
            int r0 = r8.f6822a
            r3 = 3
            r4 = 1
            if (r0 != r4) goto L_0x0021
            java.lang.String r0 = "Client is already in the process of connecting to the service."
            com.android.installreferrer.commons.InstallReferrerCommons.logWarn(r2, r0)
            r9.onInstallReferrerSetupFinished(r3)
            return
        L_0x0021:
            if (r0 != r3) goto L_0x002c
            java.lang.String r0 = "Client was already closed and can't be reused. Please create another instance."
            com.android.installreferrer.commons.InstallReferrerCommons.logWarn(r2, r0)
            r9.onInstallReferrerSetupFinished(r3)
            return
        L_0x002c:
            java.lang.String r0 = "Starting install referrer service setup."
            com.android.installreferrer.commons.InstallReferrerCommons.logVerbose(r2, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r3 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r3)
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r3.<init>(r5, r6)
            r0.setComponent(r3)
            android.content.Context r3 = r8.f6823b
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            java.util.List r3 = r3.queryIntentServices(r0, r1)
            r6 = 2
            if (r3 == 0) goto L_0x00c2
            boolean r7 = r3.isEmpty()
            if (r7 != 0) goto L_0x00c2
            java.lang.Object r3 = r3.get(r1)
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ServiceInfo r3 = r3.serviceInfo
            if (r3 == 0) goto L_0x00c2
            java.lang.String r7 = r3.packageName
            java.lang.String r3 = r3.name
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L_0x00b7
            if (r3 == 0) goto L_0x00b7
            android.content.Context r3 = r8.f6823b
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            r7 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r5, r7)     // Catch:{ NameNotFoundException -> 0x0082 }
            int r3 = r3.versionCode     // Catch:{ NameNotFoundException -> 0x0082 }
            r5 = 80837300(0x4d17ab4, float:4.924835E-36)
            if (r3 < r5) goto L_0x0083
            r3 = 1
            goto L_0x0084
        L_0x0082:
        L_0x0083:
            r3 = 0
        L_0x0084:
            if (r3 == 0) goto L_0x00b7
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0)
            com.android.installreferrer.api.InstallReferrerClientImpl$a r0 = new com.android.installreferrer.api.InstallReferrerClientImpl$a
            r0.<init>(r9)
            r8.f6825d = r0
            android.content.Context r5 = r8.f6823b     // Catch:{ SecurityException -> 0x00ab }
            boolean r0 = r5.bindService(r3, r0, r4)     // Catch:{ SecurityException -> 0x00ab }
            if (r0 == 0) goto L_0x00a0
            java.lang.String r9 = "Service was bonded successfully."
            com.android.installreferrer.commons.InstallReferrerCommons.logVerbose(r2, r9)
            return
        L_0x00a0:
            java.lang.String r0 = "Connection to service is blocked."
            com.android.installreferrer.commons.InstallReferrerCommons.logWarn(r2, r0)
            r8.f6822a = r1
            r9.onInstallReferrerSetupFinished(r4)
            return
        L_0x00ab:
            java.lang.String r0 = "No permission to connect to service."
            com.android.installreferrer.commons.InstallReferrerCommons.logWarn(r2, r0)
            r8.f6822a = r1
            r0 = 4
            r9.onInstallReferrerSetupFinished(r0)
            return
        L_0x00b7:
            java.lang.String r0 = "Play Store missing or incompatible. Version 8.3.73 or later required."
            com.android.installreferrer.commons.InstallReferrerCommons.logWarn(r2, r0)
            r8.f6822a = r1
            r9.onInstallReferrerSetupFinished(r6)
            return
        L_0x00c2:
            r8.f6822a = r1
            java.lang.String r0 = "Install Referrer service unavailable on device."
            com.android.installreferrer.commons.InstallReferrerCommons.logVerbose(r2, r0)
            r9.onInstallReferrerSetupFinished(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.installreferrer.api.InstallReferrerClientImpl.startConnection(com.android.installreferrer.api.InstallReferrerStateListener):void");
    }
}
