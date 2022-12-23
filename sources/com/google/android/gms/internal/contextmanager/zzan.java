package com.google.android.gms.internal.contextmanager;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.ActivityRecognitionResult;

public final class zzan implements Parcelable.Creator<zzz> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ActivityRecognitionResult activityRecognitionResult = null;
        zzp zzp = null;
        zzr zzr = null;
        Location location = null;
        zzt zzt = null;
        DataHolder dataHolder = null;
        zzv zzv = null;
        zzx zzx = null;
        zzau zzau = null;
        zzar zzar = null;
        zzaw zzaw = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    activityRecognitionResult = (ActivityRecognitionResult) SafeParcelReader.createParcelable(parcel, readHeader, ActivityRecognitionResult.CREATOR);
                    break;
                case 3:
                    zzp = (zzp) SafeParcelReader.createParcelable(parcel, readHeader, zzp.CREATOR);
                    break;
                case 4:
                    zzr = (zzr) SafeParcelReader.createParcelable(parcel, readHeader, zzr.CREATOR);
                    break;
                case 5:
                    location = (Location) SafeParcelReader.createParcelable(parcel, readHeader, Location.CREATOR);
                    break;
                case 6:
                    zzt = (zzt) SafeParcelReader.createParcelable(parcel, readHeader, zzt.CREATOR);
                    break;
                case 7:
                    dataHolder = (DataHolder) SafeParcelReader.createParcelable(parcel, readHeader, DataHolder.CREATOR);
                    break;
                case 8:
                    zzv = (zzv) SafeParcelReader.createParcelable(parcel, readHeader, zzv.CREATOR);
                    break;
                case 9:
                    zzx = (zzx) SafeParcelReader.createParcelable(parcel, readHeader, zzx.CREATOR);
                    break;
                case 10:
                    zzau = (zzau) SafeParcelReader.createParcelable(parcel, readHeader, zzau.CREATOR);
                    break;
                case 11:
                    zzar = (zzar) SafeParcelReader.createParcelable(parcel, readHeader, zzar.CREATOR);
                    break;
                case 12:
                    zzaw = (zzaw) SafeParcelReader.createParcelable(parcel, readHeader, zzaw.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzz(activityRecognitionResult, zzp, zzr, location, zzt, dataHolder, zzv, zzx, zzau, zzar, zzaw);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzz[i];
    }
}
