package com.google.android.gms.internal.nearby;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;

@SafeParcelable.Class(creator = "ParcelByteArrayCreator")
@SafeParcelable.Reserved({1000})
public final class zzlx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlx> CREATOR = new zzlu();
    /* access modifiers changed from: private */
    public byte[] zza = new byte[0];
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getDataPfd", mo65739id = 1)
    public ParcelFileDescriptor zzb;

    private zzlx() {
    }

    @VisibleForTesting
    public static byte[] zzd(ParcelFileDescriptor parcelFileDescriptor) {
        DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
        try {
            byte[] bArr = new byte[dataInputStream.readInt()];
            dataInputStream.read(bArr);
            zze(dataInputStream);
            return bArr;
        } catch (IOException e) {
            throw new IllegalStateException("Could not read from parcel file descriptor", e);
        } catch (Throwable th) {
            zze(dataInputStream);
            throw th;
        }
    }

    private static void zze(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzlx) {
            return Arrays.equals(this.zza, ((zzlx) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007f, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0083, code lost:
        if (r4 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0090, code lost:
        zze(r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x0009] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d A[Catch:{ IOException -> 0x0063, IllegalStateException -> 0x007e, all -> 0x0074, FileNotFoundException -> 0x005a, IllegalStateException -> 0x007e, IOException -> 0x0076, all -> 0x0074, all -> 0x008c }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e A[Catch:{ IOException -> 0x0063, IllegalStateException -> 0x007e, all -> 0x0074, FileNotFoundException -> 0x005a, IllegalStateException -> 0x007e, IOException -> 0x0076, all -> 0x0074, all -> 0x008c }, ExcHandler: IllegalStateException (e java.lang.IllegalStateException), Splitter:B:4:0x0009] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r7, int r8) {
        /*
            r6 = this;
            byte[] r0 = r6.zza
            r1 = 0
            if (r0 == 0) goto L_0x0094
            android.os.ParcelFileDescriptor r2 = r6.zzb
            if (r2 != 0) goto L_0x0094
            java.io.File r2 = com.google.android.gms.internal.nearby.zzmd.zzb()     // Catch:{ IllegalStateException -> 0x007e, IOException -> 0x0076, all -> 0x0074 }
            if (r2 == 0) goto L_0x006c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0063, IllegalStateException -> 0x007e, all -> 0x0074 }
            java.lang.String r4 = "teleporter"
            r3.<init>(r4)     // Catch:{ IOException -> 0x0063, IllegalStateException -> 0x007e, all -> 0x0074 }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0063, IllegalStateException -> 0x007e, all -> 0x0074 }
            r3.append(r4)     // Catch:{ IOException -> 0x0063, IllegalStateException -> 0x007e, all -> 0x0074 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0063, IllegalStateException -> 0x007e, all -> 0x0074 }
            java.lang.String r4 = ".tmp"
            java.io.File r2 = java.io.File.createTempFile(r3, r4, r2)     // Catch:{ IOException -> 0x0063, IllegalStateException -> 0x007e, all -> 0x0074 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x005a }
            r3.<init>(r2)     // Catch:{ FileNotFoundException -> 0x005a }
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r4 = android.os.ParcelFileDescriptor.open(r2, r4)     // Catch:{ FileNotFoundException -> 0x005a }
            r2.delete()     // Catch:{ IllegalStateException -> 0x007e, IOException -> 0x0076, all -> 0x0074 }
            android.util.Pair r2 = android.util.Pair.create(r3, r4)     // Catch:{ IllegalStateException -> 0x007e, IOException -> 0x0076, all -> 0x0074 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IllegalStateException -> 0x007e, IOException -> 0x0076, all -> 0x0074 }
            java.lang.Object r4 = r2.first     // Catch:{ IllegalStateException -> 0x007e, IOException -> 0x0076, all -> 0x0074 }
            java.io.OutputStream r4 = (java.io.OutputStream) r4     // Catch:{ IllegalStateException -> 0x007e, IOException -> 0x0076, all -> 0x0074 }
            r3.<init>(r4)     // Catch:{ IllegalStateException -> 0x007e, IOException -> 0x0076, all -> 0x0074 }
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch:{ IllegalStateException -> 0x007e, IOException -> 0x0076, all -> 0x0074 }
            r4.<init>(r3)     // Catch:{ IllegalStateException -> 0x007e, IOException -> 0x0076, all -> 0x0074 }
            int r3 = r0.length     // Catch:{ IllegalStateException -> 0x0058, IOException -> 0x0056 }
            r4.writeInt(r3)     // Catch:{ IllegalStateException -> 0x0058, IOException -> 0x0056 }
            r4.write(r0)     // Catch:{ IllegalStateException -> 0x0058, IOException -> 0x0056 }
            java.lang.Object r0 = r2.second     // Catch:{ IllegalStateException -> 0x0058, IOException -> 0x0056 }
            android.os.ParcelFileDescriptor r0 = (android.os.ParcelFileDescriptor) r0     // Catch:{ IllegalStateException -> 0x0058, IOException -> 0x0056 }
            zze(r4)
            goto L_0x0089
        L_0x0056:
            r0 = move-exception
            goto L_0x0078
        L_0x0058:
            r0 = move-exception
            goto L_0x0080
        L_0x005a:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x007e, IOException -> 0x0076, all -> 0x0074 }
            java.lang.String r3 = "Temporary file is somehow already deleted"
            r2.<init>(r3, r0)     // Catch:{ IllegalStateException -> 0x007e, IOException -> 0x0076, all -> 0x0074 }
            throw r2     // Catch:{ IllegalStateException -> 0x007e, IOException -> 0x0076, all -> 0x0074 }
        L_0x0063:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x007e, IOException -> 0x0076, all -> 0x0074 }
            java.lang.String r3 = "Could not create temporary file"
            r2.<init>(r3, r0)     // Catch:{ IllegalStateException -> 0x007e, IOException -> 0x0076, all -> 0x0074 }
            throw r2     // Catch:{ IllegalStateException -> 0x007e, IOException -> 0x0076, all -> 0x0074 }
        L_0x006c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x007e, IOException -> 0x0076, all -> 0x0074 }
            java.lang.String r2 = "Must set temp dir before writing this object to a parcel"
            r0.<init>(r2)     // Catch:{ IllegalStateException -> 0x007e, IOException -> 0x0076, all -> 0x0074 }
            throw r0     // Catch:{ IllegalStateException -> 0x007e, IOException -> 0x0076, all -> 0x0074 }
        L_0x0074:
            r7 = move-exception
            goto L_0x008e
        L_0x0076:
            r0 = move-exception
            r4 = r1
        L_0x0078:
            r0.toString()     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x0088
            goto L_0x0085
        L_0x007e:
            r0 = move-exception
            r4 = r1
        L_0x0080:
            r0.toString()     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x0088
        L_0x0085:
            zze(r4)
        L_0x0088:
            r0 = r1
        L_0x0089:
            r6.zzb = r0
            goto L_0x0094
        L_0x008c:
            r7 = move-exception
            r1 = r4
        L_0x008e:
            if (r1 == 0) goto L_0x0093
            zze(r1)
        L_0x0093:
            throw r7
        L_0x0094:
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r7)
            android.os.ParcelFileDescriptor r2 = r6.zzb
            r3 = 1
            r8 = r8 | r3
            r4 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r7, r3, r2, r8, r4)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r7, r0)
            r6.zzb = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzlx.writeToParcel(android.os.Parcel, int):void");
    }

    public final byte[] zzc() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    public zzlx(@SafeParcelable.Param(mo65742id = 1) ParcelFileDescriptor parcelFileDescriptor) {
        this.zzb = parcelFileDescriptor;
    }

    public /* synthetic */ zzlx(zzlw zzlw) {
    }
}
