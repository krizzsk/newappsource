package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.nearby.connection.Payload;
import java.io.File;
import java.io.FileNotFoundException;

public final class zzmd {
    private static File zza;

    public static Payload zza(Context context, zzmb zzmb) {
        byte[] bArr;
        long zzb = zzmb.zzb();
        int zza2 = zzmb.zza();
        if (zza2 == 1) {
            zzlx zzg = zzmb.zzg();
            if (zzg != null) {
                bArr = zzg.zzc();
            } else {
                bArr = zzmb.zzv();
            }
            return Payload.zza((byte[]) zzsg.zzc(bArr, "Payload bytes cannot be null if type is BYTES."), zzb);
        } else if (zza2 == 2) {
            String zzh = zzmb.zzh();
            Uri zzd = zzmb.zzd();
            if (zzh == null || zzd == null) {
                ParcelFileDescriptor zze = zzmb.zze();
                zzsg.zzc(zze, "Data ParcelFileDescriptor cannot be null for type FILE");
                return Payload.zzb(Payload.File.zzb(zze), zzb);
            }
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(zzd, "r");
                if (openFileDescriptor != null) {
                    return Payload.zzb(Payload.File.zza(new File(zzh), openFileDescriptor, zzmb.zzc(), zzd), zzb);
                }
                String.format("Failed to get ParcelFileDescriptor for %s", new Object[]{zzd});
                return null;
            } catch (SecurityException unused) {
                String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", new Object[]{zzd, zzh});
                return null;
            } catch (FileNotFoundException unused2) {
                String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", new Object[]{zzd, zzh});
                return null;
            }
        } else if (zza2 != 3) {
            String.format("Incoming ParcelablePayload %d has unknown type %d", new Object[]{Long.valueOf(zzmb.zzb()), Integer.valueOf(zzmb.zza())});
            return null;
        } else {
            ParcelFileDescriptor zze2 = zzmb.zze();
            zzsg.zzc(zze2, "Data ParcelFileDescriptor cannot be null for type STREAM");
            return Payload.zzc(Payload.Stream.zzb(zze2), zzb);
        }
    }

    public static File zzb() {
        return zza;
    }

    public static void zzc(File file) {
        if (file != null) {
            zza = file;
        }
    }
}
