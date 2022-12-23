package com.usebutton.sdk.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class PackageObserver extends BroadcastReceiver {
    private static final String TAG = "PackageObserver";
    private final Context mContext;
    private boolean mIsRegistered = false;
    private final HashMap<String, HashSet<Receiver<PackageInfo>>> mObservers = new HashMap<>();
    private final PackageManager mPackageManager;

    public PackageObserver(Context context) {
        this.mContext = context.getApplicationContext();
        this.mPackageManager = context.getPackageManager();
        registerReceiver();
    }

    private void registerReceiver() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addDataScheme("package");
        this.mContext.registerReceiver(this, intentFilter);
        this.mIsRegistered = true;
    }

    public void finalize() throws Throwable {
        stop();
        super.finalize();
    }

    public PackageManager getPackageManager() {
        return this.mPackageManager;
    }

    public boolean isInstalled(String str) {
        try {
            this.mPackageManager.getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public void observePackage(String str, Receiver<PackageInfo> receiver) {
        if (receiver != null) {
            synchronized (this.mObservers) {
                HashSet hashSet = this.mObservers.get(str);
                if (hashSet == null) {
                    hashSet = new LinkedHashSet();
                    this.mObservers.put(str, hashSet);
                }
                hashSet.add(receiver);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r0.hasNext() == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        ((com.usebutton.sdk.internal.util.Receiver) r0.next()).receive(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r6 = "android.intent.extra.UID"
            r0 = 0
            int r6 = r7.getIntExtra(r6, r0)
            android.content.pm.PackageManager r1 = r5.mPackageManager
            java.lang.String[] r6 = r1.getPackagesForUid(r6)
            java.lang.String r1 = "PackageObserver"
            java.lang.String r2 = "%s package manager update for packages: %s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r7 = r7.getAction()
            r3[r0] = r7
            java.lang.String r7 = com.usebutton.sdk.internal.util.Arrays.toString(r6)
            r4 = 1
            r3[r4] = r7
            com.usebutton.sdk.internal.util.ButtonLog.infoFormat(r1, r2, r3)
            boolean r7 = com.usebutton.sdk.internal.util.Arrays.isEmpty(r6)
            if (r7 == 0) goto L_0x002b
            return
        L_0x002b:
            r6 = r6[r0]
            android.content.pm.PackageManager r7 = r5.mPackageManager     // Catch:{ NameNotFoundException -> 0x0061 }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r6, r0)     // Catch:{ NameNotFoundException -> 0x0061 }
            java.util.HashMap<java.lang.String, java.util.HashSet<com.usebutton.sdk.internal.util.Receiver<android.content.pm.PackageInfo>>> r0 = r5.mObservers     // Catch:{ NameNotFoundException -> 0x0061 }
            monitor-enter(r0)     // Catch:{ NameNotFoundException -> 0x0061 }
            java.util.HashMap<java.lang.String, java.util.HashSet<com.usebutton.sdk.internal.util.Receiver<android.content.pm.PackageInfo>>> r1 = r5.mObservers     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x005e }
            java.util.HashSet r1 = (java.util.HashSet) r1     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x0044
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0044:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x005e }
            r2.<init>(r1)     // Catch:{ all -> 0x005e }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            java.util.Iterator r0 = r2.iterator()     // Catch:{ NameNotFoundException -> 0x0061 }
        L_0x004e:
            boolean r1 = r0.hasNext()     // Catch:{ NameNotFoundException -> 0x0061 }
            if (r1 == 0) goto L_0x0078
            java.lang.Object r1 = r0.next()     // Catch:{ NameNotFoundException -> 0x0061 }
            com.usebutton.sdk.internal.util.Receiver r1 = (com.usebutton.sdk.internal.util.Receiver) r1     // Catch:{ NameNotFoundException -> 0x0061 }
            r1.receive(r7)     // Catch:{ NameNotFoundException -> 0x0061 }
            goto L_0x004e
        L_0x005e:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            throw r7     // Catch:{ NameNotFoundException -> 0x0061 }
        L_0x0061:
            r7 = move-exception
            java.lang.String r0 = "PackageObserver"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not find package info for: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.usebutton.sdk.internal.util.ButtonLog.warn(r0, r6, r7)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usebutton.sdk.internal.util.PackageObserver.onReceive(android.content.Context, android.content.Intent):void");
    }

    public void removeObserver(Receiver<PackageInfo> receiver) {
        if (receiver != null) {
            synchronized (this.mObservers) {
                for (String str : this.mObservers.keySet()) {
                    HashSet hashSet = this.mObservers.get(str);
                    if (hashSet != null) {
                        hashSet.remove(receiver);
                    }
                }
            }
        }
    }

    public void stop() {
        if (this.mIsRegistered) {
            this.mIsRegistered = false;
            this.mContext.unregisterReceiver(this);
        }
    }
}
