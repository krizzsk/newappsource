package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.zze;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyu */
public final class zzyu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzzi zzzi = null;
        String str5 = null;
        String str6 = null;
        zze zze = null;
        ArrayList<zzze> arrayList = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 4:
                    z = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 5:
                    str3 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 6:
                    str4 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 7:
                    zzzi = (zzzi) SafeParcelReader.createParcelable(parcel2, readHeader, zzzi.CREATOR);
                    break;
                case 8:
                    str5 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 9:
                    str6 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 10:
                    j = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 11:
                    j2 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 12:
                    z2 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 13:
                    zze = (zze) SafeParcelReader.createParcelable(parcel2, readHeader, zze.CREATOR);
                    break;
                case 14:
                    arrayList = SafeParcelReader.createTypedList(parcel2, readHeader, zzze.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new zzyt(str, str2, z, str3, str4, zzzi, str5, str6, j, j2, z2, zze, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzyt[i];
    }
}
