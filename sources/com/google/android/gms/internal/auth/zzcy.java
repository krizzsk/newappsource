package com.google.android.gms.internal.auth;

import android.util.Base64;
import java.io.IOException;

final class zzcy extends zzdc {
    public final /* synthetic */ zzhu zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcy(zzcz zzcz, String str, Object obj, boolean z, zzhu zzhu, byte[] bArr) {
        super(zzcz, "getTokenRefactor__blocked_packages", obj, true, (zzdb) null);
        this.zza = zzhu;
    }

    public final Object zza(Object obj) {
        try {
            return zzhr.zzk(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            super.zzc();
            String str = (String) obj;
            return null;
        }
    }
}
