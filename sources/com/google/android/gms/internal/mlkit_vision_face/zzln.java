package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzln extends zzb implements zzlo {
    public static zzlo zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
        if (queryLocalInterface instanceof zzlo) {
            return (zzlo) queryLocalInterface;
        }
        return new zzlm(iBinder);
    }
}
