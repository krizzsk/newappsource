package com.appsflyer;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec$Builder;
import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;

class AFKeystoreWrapper {
    public KeyStore $$a;
    public int $$b;
    private Context AFDateFormat;
    public final Object valueOf = new Object();
    public String values;

    public AFKeystoreWrapper(Context context) {
        this.AFDateFormat = context;
        this.values = "";
        this.$$b = 0;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            KeyStore instance = KeyStore.getInstance(KeyProvider18.ANDROID_KEY_STORE_NAME);
            this.$$a = instance;
            instance.load((KeyStore.LoadStoreParameter) null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    private static boolean valueOf(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final String $$a() {
        String str;
        synchronized (this.valueOf) {
            str = this.values;
        }
        return str;
    }

    public final String $$b() {
        StringBuilder k = C13555b.m33972k("com.appsflyer,");
        synchronized (this.valueOf) {
            k.append("KSAppsFlyerId=");
            k.append(this.values);
            k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append("KSAppsFlyerRICounter=");
            k.append(this.$$b);
        }
        return k.toString();
    }

    public final int AFDateFormat() {
        int i;
        synchronized (this.valueOf) {
            i = this.$$b;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        r1 = r4.split(com.appboy.configuration.AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r1.length != 3) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        com.appsflyer.AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = r1[1].trim().split("=");
        r1 = r1[2].trim().split("=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r3.length != 2) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (r1.length != 2) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        r7.values = r3[1].trim();
        r7.$$b = java.lang.Integer.parseInt(r1[1].trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        r1 = th;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean values() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.valueOf
            monitor-enter(r0)
            java.security.KeyStore r1 = r7.$$a     // Catch:{ all -> 0x0089 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0086
            java.util.Enumeration r1 = r1.aliases()     // Catch:{ all -> 0x006a }
        L_0x000d:
            boolean r4 = r1.hasMoreElements()     // Catch:{ all -> 0x006a }
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r1.nextElement()     // Catch:{ all -> 0x006a }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x006a }
            if (r4 == 0) goto L_0x000d
            boolean r5 = valueOf(r4)     // Catch:{ all -> 0x006a }
            if (r5 == 0) goto L_0x000d
            java.lang.String r1 = ","
            java.lang.String[] r1 = r4.split(r1)     // Catch:{ all -> 0x006a }
            int r5 = r1.length     // Catch:{ all -> 0x006a }
            r6 = 3
            if (r5 != r6) goto L_0x0086
            java.lang.String r5 = "Found a matching AF key with alias:\n"
            java.lang.String r4 = r5.concat(r4)     // Catch:{ all -> 0x006a }
            com.appsflyer.AFLogger.afInfoLog(r4)     // Catch:{ all -> 0x006a }
            r3 = r1[r2]     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = r3.trim()     // Catch:{ all -> 0x0068 }
            java.lang.String r4 = "="
            java.lang.String[] r3 = r3.split(r4)     // Catch:{ all -> 0x0068 }
            r4 = 2
            r1 = r1[r4]     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x0068 }
            java.lang.String r5 = "="
            java.lang.String[] r1 = r1.split(r5)     // Catch:{ all -> 0x0068 }
            int r5 = r3.length     // Catch:{ all -> 0x0068 }
            if (r5 != r4) goto L_0x0087
            int r5 = r1.length     // Catch:{ all -> 0x0068 }
            if (r5 != r4) goto L_0x0087
            r3 = r3[r2]     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = r3.trim()     // Catch:{ all -> 0x0068 }
            r7.values = r3     // Catch:{ all -> 0x0068 }
            r1 = r1[r2]     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x0068 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0068 }
            r7.$$b = r1     // Catch:{ all -> 0x0068 }
            goto L_0x0087
        L_0x0068:
            r1 = move-exception
            goto L_0x006c
        L_0x006a:
            r1 = move-exception
            r2 = 0
        L_0x006c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            java.lang.String r4 = "Couldn't list KeyStore Aliases: "
            r3.<init>(r4)     // Catch:{ all -> 0x0089 }
            java.lang.Class r4 = r1.getClass()     // Catch:{ all -> 0x0089 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x0089 }
            r3.append(r4)     // Catch:{ all -> 0x0089 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0089 }
            com.appsflyer.AFLogger.afErrorLog(r3, r1)     // Catch:{ all -> 0x0089 }
            goto L_0x0087
        L_0x0086:
            r2 = 0
        L_0x0087:
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            return r2
        L_0x0089:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFKeystoreWrapper.values():boolean");
    }

    public final void $$b(String str) {
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(1, 5);
            AlgorithmParameterSpec algorithmParameterSpec = null;
            synchronized (this.valueOf) {
                if (!this.$$a.containsAlias(str)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        algorithmParameterSpec = new KeyGenParameterSpec$Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(instance.getTime()).setCertificateNotAfter(instance2.getTime()).build();
                    } else if (!AndroidUtils.$$a()) {
                        algorithmParameterSpec = new KeyPairGeneratorSpec.Builder(this.AFDateFormat).setAlias(str).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(instance.getTime()).setEndDate(instance2.getTime()).build();
                    }
                    KeyPairGenerator instance3 = KeyPairGenerator.getInstance(KeyProvider18.KEY_ALGORITHM_RSA, KeyProvider18.ANDROID_KEY_STORE_NAME);
                    instance3.initialize(algorithmParameterSpec);
                    instance3.generateKeyPair();
                } else {
                    AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                }
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Exception ");
            sb.append(th.getMessage());
            sb.append(" occurred");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }
}
