package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzbb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        zzat zzat = null;
        zzaw zzaw = null;
        zzax zzax = null;
        zzaz zzaz = null;
        zzay zzay = null;
        zzau zzau = null;
        zzaq zzaq = null;
        zzar zzar = null;
        zzas zzas = null;
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
                    zzat = (zzat) SafeParcelReader.createParcelable(parcel2, readHeader, zzat.CREATOR);
                    break;
                case 8:
                    zzaw = (zzaw) SafeParcelReader.createParcelable(parcel2, readHeader, zzaw.CREATOR);
                    break;
                case 9:
                    zzax = (zzax) SafeParcelReader.createParcelable(parcel2, readHeader, zzax.CREATOR);
                    break;
                case 10:
                    zzaz = (zzaz) SafeParcelReader.createParcelable(parcel2, readHeader, zzaz.CREATOR);
                    break;
                case 11:
                    zzay = (zzay) SafeParcelReader.createParcelable(parcel2, readHeader, zzay.CREATOR);
                    break;
                case 12:
                    zzau = (zzau) SafeParcelReader.createParcelable(parcel2, readHeader, zzau.CREATOR);
                    break;
                case 13:
                    zzaq = (zzaq) SafeParcelReader.createParcelable(parcel2, readHeader, zzaq.CREATOR);
                    break;
                case 14:
                    zzar = (zzar) SafeParcelReader.createParcelable(parcel2, readHeader, zzar.CREATOR);
                    break;
                case 15:
                    zzas = (zzas) SafeParcelReader.createParcelable(parcel2, readHeader, zzas.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new zzba(i, str, str2, bArr, pointArr, i2, zzat, zzaw, zzax, zzaz, zzay, zzau, zzaq, zzar, zzas);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzba[i];
    }
}
