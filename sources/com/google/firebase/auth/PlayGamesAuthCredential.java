package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p357ae.C13422i;

@SafeParcelable.Class(creator = "PlayGamesAuthCredentialCreator")
public class PlayGamesAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<PlayGamesAuthCredential> CREATOR = new C13422i();
    @SafeParcelable.Field(getter = "getServerAuthCode", mo65739id = 1)

    /* renamed from: b */
    public final String f36409b;

    @SafeParcelable.Constructor
    public PlayGamesAuthCredential(@SafeParcelable.Param(mo65742id = 1) String str) {
        this.f36409b = Preconditions.checkNotEmpty(str);
    }

    /* renamed from: i2 */
    public final String mo43266i2() {
        return "playgames.google.com";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f36409b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
