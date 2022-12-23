package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzot implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzoi zzoi = null;
        String str = null;
        String str2 = null;
        zzoj[] zzojArr = null;
        zzog[] zzogArr = null;
        String[] strArr = null;
        zzob[] zzobArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    zzoi = (zzoi) SafeParcelReader.createParcelable(parcel, readHeader, zzoi.CREATOR);
                    break;
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    zzojArr = (zzoj[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzoj.CREATOR);
                    break;
                case 5:
                    zzogArr = (zzog[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzog.CREATOR);
                    break;
                case 6:
                    strArr = SafeParcelReader.createStringArray(parcel, readHeader);
                    break;
                case 7:
                    zzobArr = (zzob[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzob.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzoe(zzoi, str, str2, zzojArr, zzogArr, strArr, zzobArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzoe[i];
    }
}
