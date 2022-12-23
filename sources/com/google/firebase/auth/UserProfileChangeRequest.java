package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p357ae.C13424k;

@SafeParcelable.Class(creator = "UserProfileChangeRequestCreator")
@SafeParcelable.Reserved({1})
public class UserProfileChangeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UserProfileChangeRequest> CREATOR = new C13424k();
    @SafeParcelable.Field(getter = "getDisplayName", mo65739id = 2)

    /* renamed from: b */
    public String f36412b;
    @SafeParcelable.Field(getter = "getPhotoUrl", mo65739id = 3)

    /* renamed from: c */
    public String f36413c;
    @SafeParcelable.Field(getter = "shouldRemoveDisplayName", mo65739id = 4)

    /* renamed from: d */
    public boolean f36414d;
    @SafeParcelable.Field(getter = "shouldRemovePhotoUri", mo65739id = 5)

    /* renamed from: e */
    public boolean f36415e;

    /* renamed from: f */
    public Uri f36416f;

    @SafeParcelable.Constructor
    public UserProfileChangeRequest(@SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) String str2, @SafeParcelable.Param(mo65742id = 4) boolean z, @SafeParcelable.Param(mo65742id = 5) boolean z2) {
        Uri uri;
        this.f36412b = str;
        this.f36413c = str2;
        this.f36414d = z;
        this.f36415e = z2;
        if (TextUtils.isEmpty(str2)) {
            uri = null;
        } else {
            uri = Uri.parse(str2);
        }
        this.f36416f = uri;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f36412b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f36413c, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f36414d);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f36415e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
