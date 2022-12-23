package com.cubic.umo.auth.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.FirebaseMessagingService;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/auth/model/Token;", "Landroid/os/Parcelable;", "auth_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class Token implements Parcelable {
    public static final Parcelable.Creator<Token> CREATOR = new C2235a();

    /* renamed from: b */
    public final String f7804b;

    /* renamed from: c */
    public final long f7805c;

    /* renamed from: com.cubic.umo.auth.model.Token$a */
    public static final class C2235a implements Parcelable.Creator<Token> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new Token(parcel.readString(), parcel.readLong());
        }

        public final Object[] newArray(int i) {
            return new Token[i];
        }
    }

    public Token(String str, long j) {
        C24362h.m61211f(str, FirebaseMessagingService.EXTRA_TOKEN);
        this.f7804b = str;
        this.f7805c = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Token)) {
            return false;
        }
        Token token = (Token) obj;
        return C24362h.m61206a(this.f7804b, token.f7804b) && this.f7805c == token.f7805c;
    }

    public final int hashCode() {
        long j = this.f7805c;
        return (this.f7804b.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Token(token=");
        k.append(this.f7804b);
        k.append(", expirationTime=");
        k.append(this.f7805c);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f7804b);
        parcel.writeLong(this.f7805c);
    }
}
