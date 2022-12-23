package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzrl;
import com.google.android.gms.internal.gtm.zzto;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

final class zzel implements Runnable {
    public final /* synthetic */ zzrl zza;
    public final /* synthetic */ zzem zzb;

    public zzel(zzem zzem, zzrl zzrl) {
        this.zzb = zzem;
        this.zza = zzrl;
    }

    public final void run() {
        zzem zzem = this.zzb;
        zzrl zzrl = this.zza;
        File zze = zzem.zze();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(zze);
            try {
                byte[] bArr = new byte[zzrl.zzX()];
                zzto zzF = zzto.zzF(bArr);
                zzrl.zzaq(zzF);
                zzF.zzG();
                fileOutputStream.write(bArr);
                try {
                    fileOutputStream.close();
                } catch (IOException unused) {
                    zzdh.zzc("error closing stream for writing resource to disk");
                }
            } catch (IOException e) {
                String name = zzrl.getClass().getName();
                StringBuilder sb = new StringBuilder(name.length() + 72);
                sb.append("Serializing ");
                sb.append(name);
                sb.append(" to a ");
                sb.append("byte array");
                sb.append(" threw an IOException (should never happen).");
                throw new RuntimeException(sb.toString(), e);
            } catch (IOException unused2) {
                try {
                    zzdh.zzc("Error writing resource to disk. Removing resource from disk.");
                    zze.delete();
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        zzdh.zzc("error closing stream for writing resource to disk");
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused4) {
                        zzdh.zzc("error closing stream for writing resource to disk");
                    }
                    throw th;
                }
            }
        } catch (FileNotFoundException unused5) {
            zzdh.zza("Error opening resource file for writing");
        }
    }
}
