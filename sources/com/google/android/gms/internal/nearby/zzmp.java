package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzmp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        IBinder iBinder = null;
        String[] strArr = null;
        zzmb zzmb = null;
        zznv zznv = null;
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    iBinder = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 2:
                    strArr = SafeParcelReader.createStringArray(parcel, readHeader);
                    break;
                case 3:
                    zzmb = (zzmb) SafeParcelReader.createParcelable(parcel, readHeader, zzmb.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 5:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 6:
                    zznv = (zznv) SafeParcelReader.createParcelable(parcel, readHeader, zznv.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzmo(iBinder, strArr, zzmb, z, i, zznv);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzmo[i];
    }
}
