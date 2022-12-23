package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbn extends zzb implements zzbo {
    public zzbn() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    public static zzbo asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        if (queryLocalInterface instanceof zzbo) {
            return (zzbo) queryLocalInterface;
        }
        return new zzbm(iBinder);
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzbl newBarcodeScanner = newBarcodeScanner(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzbc) zzc.zza(parcel, zzbc.CREATOR));
        parcel2.writeNoException();
        zzc.zzb(parcel2, newBarcodeScanner);
        return true;
    }
}
