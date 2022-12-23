package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p955zd.C20836u;

@SafeParcelable.Class(creator = "MetadataImplCreator")
@SafeParcelable.Reserved({1000})
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new C20836u();
    @SafeParcelable.Field(getter = "getEventStatus", mo65739id = 1)

    /* renamed from: b */
    public int f36344b;
    @SafeParcelable.Field(getter = "isUploadable", mo65739id = 2)

    /* renamed from: c */
    public final boolean f36345c;
    @SafeParcelable.Field(getter = "getCompletionToken", mo65739id = 3)

    /* renamed from: d */
    public final String f36346d;
    @SafeParcelable.Field(getter = "getAccountName", mo65739id = 4)

    /* renamed from: e */
    public final String f36347e;
    @SafeParcelable.Field(getter = "getSsbContext", mo65739id = 5)

    /* renamed from: f */
    public final byte[] f36348f;
    @SafeParcelable.Field(getter = "isContextOnly", mo65739id = 6)

    /* renamed from: g */
    public final boolean f36349g;

    @SafeParcelable.Constructor
    public zzb(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) boolean z, @SafeParcelable.Param(mo65742id = 3) String str, @SafeParcelable.Param(mo65742id = 4) String str2, @SafeParcelable.Param(mo65742id = 5) byte[] bArr, @SafeParcelable.Param(mo65742id = 6) boolean z2) {
        this.f36344b = i;
        this.f36345c = z;
        this.f36346d = str;
        this.f36347e = str2;
        this.f36348f = bArr;
        this.f36349g = z2;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("MetadataImpl { { eventStatus: '");
        k.append(this.f36344b);
        k.append("' } { uploadable: '");
        k.append(this.f36345c);
        k.append("' } ");
        if (this.f36346d != null) {
            k.append("{ completionToken: '");
            k.append(this.f36346d);
            k.append("' } ");
        }
        if (this.f36347e != null) {
            k.append("{ accountName: '");
            k.append(this.f36347e);
            k.append("' } ");
        }
        if (this.f36348f != null) {
            k.append("{ ssbContext: [ ");
            for (byte hexString : this.f36348f) {
                k.append("0x");
                k.append(Integer.toHexString(hexString));
                k.append(" ");
            }
            k.append("] } ");
        }
        k.append("{ contextOnly: '");
        return C25541a.m63885p(k, this.f36349g, "' } }");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f36344b);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f36345c);
        SafeParcelWriter.writeString(parcel, 3, this.f36346d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f36347e, false);
        SafeParcelWriter.writeByteArray(parcel, 5, this.f36348f, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f36349g);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzb(boolean z) {
        this.f36344b = 0;
        this.f36345c = z;
        this.f36346d = null;
        this.f36347e = null;
        this.f36348f = null;
        this.f36349g = false;
    }
}
