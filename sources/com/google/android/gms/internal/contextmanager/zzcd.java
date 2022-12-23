package com.google.android.gms.internal.contextmanager;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzcd implements Parcelable.Creator<zzcc> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        long j2 = 0;
        zzbh zzbh = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    i = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 3:
                    zzbh = (zzbh) SafeParcelReader.createParcelable(parcel2, readHeader, zzbh.CREATOR);
                    break;
                case 4:
                    iBinder = SafeParcelReader.readIBinder(parcel2, readHeader);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) SafeParcelReader.createParcelable(parcel2, readHeader, PendingIntent.CREATOR);
                    break;
                case 6:
                    str = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 7:
                    j = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 8:
                    j2 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new zzcc(i, zzbh, iBinder, pendingIntent, str, j, j2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzcc[i];
    }
}
