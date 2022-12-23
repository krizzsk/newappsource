package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Strategy strategy = null;
        byte[] bArr = null;
        ParcelUuid parcelUuid = null;
        byte[] bArr2 = null;
        zzu[] zzuArr = null;
        int[] iArr = null;
        int[] iArr2 = null;
        byte[] bArr3 = null;
        long j = 0;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i = 0;
        int i2 = 0;
        boolean z13 = false;
        boolean z14 = true;
        boolean z15 = false;
        boolean z16 = true;
        boolean z17 = true;
        int i3 = 0;
        boolean z18 = true;
        int i4 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    strategy = (Strategy) SafeParcelReader.createParcelable(parcel2, readHeader, Strategy.CREATOR);
                    break;
                case 2:
                    z = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 3:
                    z2 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 4:
                    z3 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 5:
                    z4 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 6:
                    bArr = SafeParcelReader.createByteArray(parcel2, readHeader);
                    break;
                case 7:
                    z5 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 8:
                    parcelUuid = (ParcelUuid) SafeParcelReader.createParcelable(parcel2, readHeader, ParcelUuid.CREATOR);
                    break;
                case 9:
                    z6 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 10:
                    z7 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 11:
                    z8 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 12:
                    z9 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 13:
                    z11 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 14:
                    z12 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 15:
                    i = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 16:
                    i2 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 17:
                    bArr2 = SafeParcelReader.createByteArray(parcel2, readHeader);
                    break;
                case 18:
                    j = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 19:
                    zzuArr = (zzu[]) SafeParcelReader.createTypedArray(parcel2, readHeader, zzu.CREATOR);
                    break;
                case 20:
                    z13 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 21:
                    z14 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 22:
                    z15 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 23:
                    z16 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 24:
                    iArr = SafeParcelReader.createIntArray(parcel2, readHeader);
                    break;
                case 25:
                    iArr2 = SafeParcelReader.createIntArray(parcel2, readHeader);
                    break;
                case 26:
                    z17 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 27:
                    i3 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 28:
                    bArr3 = SafeParcelReader.createByteArray(parcel2, readHeader);
                    break;
                case 29:
                    z18 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 30:
                    i4 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new AdvertisingOptions(strategy, z, z2, z3, z4, bArr, z5, parcelUuid, z6, z7, z8, z9, z11, z12, i, i2, bArr2, j, zzuArr, z13, z14, z15, z16, iArr, iArr2, z17, i3, bArr3, z18, i4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdvertisingOptions[i];
    }
}
