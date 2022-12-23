package com.cubic.umo.auth.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/cubic/umo/auth/model/UserAccount;", "", "Landroid/os/Parcelable;", "auth_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class UserAccount implements Parcelable {
    public static final Parcelable.Creator<UserAccount> CREATOR = new C2236a();

    /* renamed from: b */
    public final String f7806b;

    /* renamed from: c */
    public final String f7807c;

    /* renamed from: d */
    public final Token f7808d;

    /* renamed from: e */
    public final Token f7809e;

    /* renamed from: f */
    public final boolean f7810f;

    /* renamed from: g */
    public final boolean f7811g;

    /* renamed from: h */
    public final String f7812h;

    /* renamed from: i */
    public final int f7813i;

    /* renamed from: j */
    public final String f7814j;

    /* renamed from: k */
    public final String f7815k;

    /* renamed from: com.cubic.umo.auth.model.UserAccount$a */
    public static final class C2236a implements Parcelable.Creator<UserAccount> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Token token = null;
            Token createFromParcel = parcel.readInt() == 0 ? null : Token.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                token = Token.CREATOR.createFromParcel(parcel);
            }
            Token token2 = token;
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new UserAccount(readString, readString2, createFromParcel, token2, z2, z, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new UserAccount[i];
        }
    }

    public UserAccount(String str, String str2, Token token, Token token2, boolean z, boolean z2, String str3, int i, String str4, String str5) {
        C24362h.m61211f(str, "cubicId");
        C24362h.m61211f(str2, "userName");
        C24362h.m61211f(str3, "cardNumber");
        C24362h.m61211f(str4, "mediaId");
        C24362h.m61211f(str5, "mobileNumber");
        this.f7806b = str;
        this.f7807c = str2;
        this.f7808d = token;
        this.f7809e = token2;
        this.f7810f = z;
        this.f7811g = z2;
        this.f7812h = str3;
        this.f7813i = i;
        this.f7814j = str4;
        this.f7815k = str5;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f7806b);
        parcel.writeString(this.f7807c);
        Token token = this.f7808d;
        if (token == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            token.writeToParcel(parcel, i);
        }
        Token token2 = this.f7809e;
        if (token2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            token2.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f7810f ? 1 : 0);
        parcel.writeInt(this.f7811g ? 1 : 0);
        parcel.writeString(this.f7812h);
        parcel.writeInt(this.f7813i);
        parcel.writeString(this.f7814j);
        parcel.writeString(this.f7815k);
    }
}
