package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

public final class zzeyj {
    public static void zza(AtomicReference atomicReference, zzeyi zzeyi) {
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                zzeyi.zza(obj);
            } catch (RemoteException e) {
                zzcfi.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                zzcfi.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
    }
}
