package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

public final class zzfmu {
    @VisibleForTesting
    public final zzfmx zza;
    @VisibleForTesting
    public final boolean zzb;

    private zzfmu(zzfmx zzfmx) {
        this.zza = zzfmx;
        this.zzb = zzfmx != null;
    }

    public static zzfmu zzb(Context context, String str, String str2) {
        zzfmx zzfmx;
        try {
            IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
            if (instantiate == null) {
                zzfmx = null;
            } else {
                IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                if (queryLocalInterface instanceof zzfmx) {
                    zzfmx = (zzfmx) queryLocalInterface;
                } else {
                    zzfmx = new zzfmv(instantiate);
                }
            }
            try {
                zzfmx.zze(ObjectWrapper.wrap(context), str, (String) null);
                return new zzfmu(zzfmx);
            } catch (RemoteException | zzflw | NullPointerException | SecurityException unused) {
                return new zzfmu(new zzfmy());
            }
        } catch (Exception e) {
            throw new zzflw(e);
        } catch (Exception e2) {
            throw new zzflw(e2);
        }
    }

    public static zzfmu zzc() {
        return new zzfmu(new zzfmy());
    }

    public final zzfmt zza(byte[] bArr) {
        return new zzfmt(this, bArr, (zzfms) null);
    }
}
