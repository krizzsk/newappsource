package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p357ae.C13425l;

@SafeParcelable.Class(creator = "ActionCodeSettingsCreator")
public class ActionCodeSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActionCodeSettings> CREATOR = new C13425l();
    @SafeParcelable.Field(getter = "getUrl", mo65739id = 1)

    /* renamed from: b */
    public final String f36365b;
    @SafeParcelable.Field(getter = "getIOSBundle", mo65739id = 2)

    /* renamed from: c */
    public final String f36366c;
    @SafeParcelable.Field(getter = "getIOSAppStoreId", mo65739id = 3)

    /* renamed from: d */
    public final String f36367d;
    @SafeParcelable.Field(getter = "getAndroidPackageName", mo65739id = 4)

    /* renamed from: e */
    public final String f36368e;
    @SafeParcelable.Field(getter = "getAndroidInstallApp", mo65739id = 5)

    /* renamed from: f */
    public final boolean f36369f;
    @SafeParcelable.Field(getter = "getAndroidMinimumVersion", mo65739id = 6)

    /* renamed from: g */
    public final String f36370g;
    @SafeParcelable.Field(getter = "canHandleCodeInApp", mo65739id = 7)

    /* renamed from: h */
    public final boolean f36371h;
    @SafeParcelable.Field(getter = "getLocaleHeader", mo65739id = 8)

    /* renamed from: i */
    public String f36372i;
    @SafeParcelable.Field(getter = "getRequestType", mo65739id = 9)

    /* renamed from: j */
    public int f36373j;
    @SafeParcelable.Field(getter = "getDynamicLinkDomain", mo65739id = 10)

    /* renamed from: k */
    public String f36374k;

    @SafeParcelable.Constructor
    public ActionCodeSettings(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) String str2, @SafeParcelable.Param(mo65742id = 3) String str3, @SafeParcelable.Param(mo65742id = 4) String str4, @SafeParcelable.Param(mo65742id = 5) boolean z, @SafeParcelable.Param(mo65742id = 6) String str5, @SafeParcelable.Param(mo65742id = 7) boolean z2, @SafeParcelable.Param(mo65742id = 8) String str6, @SafeParcelable.Param(mo65742id = 9) int i, @SafeParcelable.Param(mo65742id = 10) String str7) {
        this.f36365b = str;
        this.f36366c = str2;
        this.f36367d = str3;
        this.f36368e = str4;
        this.f36369f = z;
        this.f36370g = str5;
        this.f36371h = z2;
        this.f36372i = str6;
        this.f36373j = i;
        this.f36374k = str7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f36365b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f36366c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f36367d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f36368e, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f36369f);
        SafeParcelWriter.writeString(parcel, 6, this.f36370g, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f36371h);
        SafeParcelWriter.writeString(parcel, 8, this.f36372i, false);
        SafeParcelWriter.writeInt(parcel, 9, this.f36373j);
        SafeParcelWriter.writeString(parcel, 10, this.f36374k, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
