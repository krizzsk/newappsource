package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.connection.ConnectionOptions;

public final class zzml implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        IBinder iBinder4 = null;
        byte[] bArr2 = null;
        ConnectionOptions connectionOptions = null;
        zznv zznv = null;
        byte[] bArr3 = null;
        String str3 = null;
        int i = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    iBinder = SafeParcelReader.readIBinder(parcel2, readHeader);
                    break;
                case 2:
                    iBinder2 = SafeParcelReader.readIBinder(parcel2, readHeader);
                    break;
                case 3:
                    iBinder3 = SafeParcelReader.readIBinder(parcel2, readHeader);
                    break;
                case 4:
                    str = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 5:
                    str2 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 6:
                    bArr = SafeParcelReader.createByteArray(parcel2, readHeader);
                    break;
                case 7:
                    iBinder4 = SafeParcelReader.readIBinder(parcel2, readHeader);
                    break;
                case 8:
                    bArr2 = SafeParcelReader.createByteArray(parcel2, readHeader);
                    break;
                case 9:
                    connectionOptions = (ConnectionOptions) SafeParcelReader.createParcelable(parcel2, readHeader, ConnectionOptions.CREATOR);
                    break;
                case 10:
                    i = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 11:
                    zznv = (zznv) SafeParcelReader.createParcelable(parcel2, readHeader, zznv.CREATOR);
                    break;
                case 12:
                    bArr3 = SafeParcelReader.createByteArray(parcel2, readHeader);
                    break;
                case 13:
                    str3 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new zzmk(iBinder, iBinder2, iBinder3, str, str2, bArr, iBinder4, bArr2, connectionOptions, i, zznv, bArr3, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzmk[i];
    }
}
