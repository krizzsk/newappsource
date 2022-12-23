package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

public final class zzll extends zza {
    public zzll(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.face.aidls.IFaceDetector");
    }

    public final void zzd() throws RemoteException {
        zzc(1, zza());
    }

    public final void zze() throws RemoteException {
        zzc(2, zza());
    }

    public final List<zzlj> zzf(IObjectWrapper iObjectWrapper, zzld zzld) throws RemoteException {
        Parcel zza = zza();
        zzc.zzb(zza, iObjectWrapper);
        zzc.zza(zza, zzld);
        Parcel zzb = zzb(3, zza);
        ArrayList<zzlj> createTypedArrayList = zzb.createTypedArrayList(zzlj.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }
}
