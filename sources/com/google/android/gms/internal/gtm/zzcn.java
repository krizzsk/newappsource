package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class zzcn extends zzbs {
    private volatile String zza;
    private Future<String> zzb;

    public zzcn(zzbv zzbv) {
        super(zzbv);
    }

    /* access modifiers changed from: private */
    @VisibleForTesting
    public final String zzf() {
        FileOutputStream fileOutputStream;
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        try {
            Context zza2 = zzq().zza();
            Preconditions.checkNotEmpty(lowerCase);
            Preconditions.checkNotMainThread("ClientId should be saved from worker thread");
            fileOutputStream = null;
            try {
                zzP("Storing clientId", lowerCase);
                fileOutputStream = zza2.openFileOutput("gaClientId", 0);
                fileOutputStream.write(lowerCase.getBytes());
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    zzK("Failed to close clientId writing stream", e);
                }
                return lowerCase;
                zzK("Failed to close clientId writing stream", e);
                return "0";
            } catch (FileNotFoundException e2) {
                zzK("Error creating clientId file", e2);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e3) {
                        e = e3;
                    }
                }
                return "0";
            } catch (IOException e4) {
                zzK("Error writing to clientId file", e4);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e5) {
                        e = e5;
                    }
                }
                return "0";
            }
        } catch (Exception e6) {
            zzK("Error saving clientId file", e6);
            return "0";
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e7) {
                    zzK("Failed to close clientId writing stream", e7);
                }
            }
            throw th;
        }
    }

    public final String zzb() {
        String str;
        zzW();
        synchronized (this) {
            if (this.zza == null) {
                this.zzb = zzq().zzg(new zzcl(this));
            }
            Future<String> future = this.zzb;
            if (future != null) {
                try {
                    this.zza = future.get();
                } catch (InterruptedException e) {
                    zzS("ClientId loading or generation was interrupted", e);
                    this.zza = "0";
                } catch (ExecutionException e2) {
                    zzK("Failed to load or generate client id", e2);
                    this.zza = "0";
                }
                if (this.zza == null) {
                    this.zza = "0";
                }
                zzP("Loaded clientId", this.zza);
                this.zzb = null;
            }
            str = this.zza;
        }
        return str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070 A[SYNTHETIC, Splitter:B:33:0x0070] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0078 A[SYNTHETIC, Splitter:B:38:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085 A[SYNTHETIC, Splitter:B:46:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0094 A[RETURN] */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzc() {
        /*
            r9 = this;
            java.lang.String r0 = "gaClientId"
            java.lang.String r1 = "Failed to close client id reading stream"
            com.google.android.gms.analytics.zzr r2 = r9.zzq()
            android.content.Context r2 = r2.zza()
            java.lang.String r3 = "ClientId should be loaded from worker thread"
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r3)
            r3 = 0
            java.io.FileInputStream r4 = r2.openFileInput(r0)     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x0064, all -> 0x0062 }
            r5 = 36
            byte[] r6 = new byte[r5]     // Catch:{ FileNotFoundException -> 0x0060, IOException -> 0x005e }
            r7 = 0
            int r5 = r4.read(r6, r7, r5)     // Catch:{ FileNotFoundException -> 0x0060, IOException -> 0x005e }
            int r8 = r4.available()     // Catch:{ FileNotFoundException -> 0x0060, IOException -> 0x005e }
            if (r8 <= 0) goto L_0x0034
            java.lang.String r5 = "clientId file seems corrupted, deleting it."
            r9.zzR(r5)     // Catch:{ FileNotFoundException -> 0x0060, IOException -> 0x005e }
            r4.close()     // Catch:{ FileNotFoundException -> 0x0060, IOException -> 0x005e }
            r2.deleteFile(r0)     // Catch:{ FileNotFoundException -> 0x0060, IOException -> 0x005e }
            r4.close()     // Catch:{ IOException -> 0x0089 }
            goto L_0x008d
        L_0x0034:
            r8 = 14
            if (r5 >= r8) goto L_0x0047
            java.lang.String r5 = "clientId file is empty, deleting it."
            r9.zzR(r5)     // Catch:{ FileNotFoundException -> 0x0060, IOException -> 0x005e }
            r4.close()     // Catch:{ FileNotFoundException -> 0x0060, IOException -> 0x005e }
            r2.deleteFile(r0)     // Catch:{ FileNotFoundException -> 0x0060, IOException -> 0x005e }
            r4.close()     // Catch:{ IOException -> 0x0089 }
            goto L_0x008d
        L_0x0047:
            r4.close()     // Catch:{ FileNotFoundException -> 0x0060, IOException -> 0x005e }
            java.lang.String r8 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x0060, IOException -> 0x005e }
            r8.<init>(r6, r7, r5)     // Catch:{ FileNotFoundException -> 0x0060, IOException -> 0x005e }
            java.lang.String r5 = "Read client id from disk"
            r9.zzP(r5, r8)     // Catch:{ FileNotFoundException -> 0x0060, IOException -> 0x005e }
            r4.close()     // Catch:{ IOException -> 0x0058 }
            goto L_0x005c
        L_0x0058:
            r0 = move-exception
            r9.zzK(r1, r0)
        L_0x005c:
            r3 = r8
            goto L_0x008d
        L_0x005e:
            r5 = move-exception
            goto L_0x0066
        L_0x0060:
            goto L_0x0083
        L_0x0062:
            r0 = move-exception
            goto L_0x0076
        L_0x0064:
            r5 = move-exception
            r4 = r3
        L_0x0066:
            java.lang.String r6 = "Error reading client id file, deleting it"
            r9.zzK(r6, r5)     // Catch:{ all -> 0x0074 }
            r2.deleteFile(r0)     // Catch:{ all -> 0x0074 }
            if (r4 == 0) goto L_0x008d
            r4.close()     // Catch:{ IOException -> 0x0089 }
            goto L_0x008d
        L_0x0074:
            r0 = move-exception
            r3 = r4
        L_0x0076:
            if (r3 == 0) goto L_0x0080
            r3.close()     // Catch:{ IOException -> 0x007c }
            goto L_0x0080
        L_0x007c:
            r2 = move-exception
            r9.zzK(r1, r2)
        L_0x0080:
            throw r0
        L_0x0081:
            r4 = r3
        L_0x0083:
            if (r4 == 0) goto L_0x008d
            r4.close()     // Catch:{ IOException -> 0x0089 }
            goto L_0x008d
        L_0x0089:
            r0 = move-exception
            r9.zzK(r1, r0)
        L_0x008d:
            if (r3 != 0) goto L_0x0094
            java.lang.String r0 = r9.zzf()
            return r0
        L_0x0094:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcn.zzc():java.lang.String");
    }

    public final void zzd() {
    }

    public final String zze() {
        synchronized (this) {
            this.zza = null;
            this.zzb = zzq().zzg(new zzcm(this));
        }
        return zzb();
    }
}
