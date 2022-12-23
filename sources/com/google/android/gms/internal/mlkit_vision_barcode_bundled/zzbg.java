package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzbg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzav zzav = null;
        String str = null;
        String str2 = null;
        zzaw[] zzawArr = null;
        zzat[] zzatArr = null;
        String[] strArr = null;
        zzao[] zzaoArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    zzav = (zzav) SafeParcelReader.createParcelable(parcel, readHeader, zzav.CREATOR);
                    break;
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    zzawArr = (zzaw[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzaw.CREATOR);
                    break;
                case 5:
                    zzatArr = (zzat[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzat.CREATOR);
                    break;
                case 6:
                    strArr = SafeParcelReader.createStringArray(parcel, readHeader);
                    break;
                case 7:
                    zzaoArr = (zzao[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzao.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzar(zzav, str, str2, zzawArr, zzatArr, strArr, zzaoArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzar[i];
    }
}
