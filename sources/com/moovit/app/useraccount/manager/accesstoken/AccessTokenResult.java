package com.moovit.app.useraccount.manager.accesstoken;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;

public class AccessTokenResult implements Parcelable {
    public static final Parcelable.Creator<AccessTokenResult> CREATOR = new C15599a();

    /* renamed from: e */
    public static C15600b f40587e = new C15600b();

    /* renamed from: b */
    public boolean f40588b;

    /* renamed from: c */
    public String f40589c;

    /* renamed from: d */
    public boolean f40590d;

    /* renamed from: com.moovit.app.useraccount.manager.accesstoken.AccessTokenResult$a */
    public class C15599a implements Parcelable.Creator<AccessTokenResult> {
        public final Object createFromParcel(Parcel parcel) {
            return (AccessTokenResult) C19612n.m46981v(parcel, AccessTokenResult.f40587e);
        }

        public final Object[] newArray(int i) {
            return new AccessTokenResult[i];
        }
    }

    /* renamed from: com.moovit.app.useraccount.manager.accesstoken.AccessTokenResult$b */
    public class C15600b implements C19584i<AccessTokenResult> {
        public final Object read(C19615p pVar) throws IOException {
            return new AccessTokenResult(pVar.mo51919b(), pVar.mo51919b(), pVar.mo51948t());
        }

        public final void write(Object obj, C19616q qVar) throws IOException {
            AccessTokenResult accessTokenResult = (AccessTokenResult) obj;
            qVar.mo51934b(accessTokenResult.f40588b);
            qVar.mo51934b(accessTokenResult.f40590d);
            qVar.mo51955t(accessTokenResult.f40589c);
        }
    }

    public AccessTokenResult(boolean z, boolean z2, String str) {
        this.f40588b = z;
        this.f40590d = z2;
        this.f40589c = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40587e);
    }

    public AccessTokenResult() {
    }
}
