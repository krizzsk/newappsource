package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzqb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzpu zzpu = null;
        zzpu zzpu2 = null;
        zzpu zzpu3 = null;
        long j = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                zzpu = (zzpu) SafeParcelReader.createParcelable(parcel, readHeader, zzpu.CREATOR);
            } else if (fieldId == 2) {
                zzpu2 = (zzpu) SafeParcelReader.createParcelable(parcel, readHeader, zzpu.CREATOR);
            } else if (fieldId == 3) {
                zzpu3 = (zzpu) SafeParcelReader.createParcelable(parcel, readHeader, zzpu.CREATOR);
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                j = SafeParcelReader.readLong(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzqa(zzpu, zzpu2, zzpu3, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzqa[i];
    }
}
