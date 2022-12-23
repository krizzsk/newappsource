package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.nearby.zzb;
import com.google.android.gms.internal.nearby.zzc;
import java.util.ArrayList;

public abstract class zzn extends zzb implements zzo {
    public zzn() {
        super("com.google.android.gms.nearby.messages.internal.IMessageListener");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzae zzae = (zzae) zzc.zza(parcel, zzae.CREATOR);
            zzc.zzc(parcel);
        } else if (i == 2) {
            zzae zzae2 = (zzae) zzc.zza(parcel, zzae.CREATOR);
            zzc.zzc(parcel);
        } else if (i != 4) {
            return false;
        } else {
            ArrayList<Update> createTypedArrayList = parcel.createTypedArrayList(Update.CREATOR);
            zzc.zzc(parcel);
            zzd(createTypedArrayList);
        }
        return true;
    }
}
