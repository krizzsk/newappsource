package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzoo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        zzog zzog = null;
        zzoj zzoj = null;
        zzok zzok = null;
        zzom zzom = null;
        zzol zzol = null;
        zzoh zzoh = null;
        zzod zzod = null;
        zzoe zzoe = null;
        zzof zzof = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 2:
                    str = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 4:
                    bArr = SafeParcelReader.createByteArray(parcel2, readHeader);
                    break;
                case 5:
                    pointArr = (Point[]) SafeParcelReader.createTypedArray(parcel2, readHeader, Point.CREATOR);
                    break;
                case 6:
                    i2 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 7:
                    zzog = (zzog) SafeParcelReader.createParcelable(parcel2, readHeader, zzog.CREATOR);
                    break;
                case 8:
                    zzoj = (zzoj) SafeParcelReader.createParcelable(parcel2, readHeader, zzoj.CREATOR);
                    break;
                case 9:
                    zzok = (zzok) SafeParcelReader.createParcelable(parcel2, readHeader, zzok.CREATOR);
                    break;
                case 10:
                    zzom = (zzom) SafeParcelReader.createParcelable(parcel2, readHeader, zzom.CREATOR);
                    break;
                case 11:
                    zzol = (zzol) SafeParcelReader.createParcelable(parcel2, readHeader, zzol.CREATOR);
                    break;
                case 12:
                    zzoh = (zzoh) SafeParcelReader.createParcelable(parcel2, readHeader, zzoh.CREATOR);
                    break;
                case 13:
                    zzod = (zzod) SafeParcelReader.createParcelable(parcel2, readHeader, zzod.CREATOR);
                    break;
                case 14:
                    zzoe = (zzoe) SafeParcelReader.createParcelable(parcel2, readHeader, zzoe.CREATOR);
                    break;
                case 15:
                    zzof = (zzof) SafeParcelReader.createParcelable(parcel2, readHeader, zzof.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new zzon(i, str, str2, bArr, pointArr, i2, zzog, zzoj, zzok, zzom, zzol, zzoh, zzod, zzoe, zzof);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzon[i];
    }
}
