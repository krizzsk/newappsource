package com.moovit.sdk.utils;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;

public final class ServerId implements Parcelable {
    public static final Parcelable.Creator<ServerId> CREATOR = new C7594a();

    /* renamed from: c */
    public static final C7595b f23117c = new C7595b();

    /* renamed from: d */
    public static final C7596c f23118d = new C7596c();

    /* renamed from: b */
    public final int f23119b;

    /* renamed from: com.moovit.sdk.utils.ServerId$a */
    public class C7594a implements Parcelable.Creator<ServerId> {
        public final Object createFromParcel(Parcel parcel) {
            return (ServerId) C19612n.m46981v(parcel, ServerId.f23118d);
        }

        public final Object[] newArray(int i) {
            return new ServerId[i];
        }
    }

    /* renamed from: com.moovit.sdk.utils.ServerId$b */
    public class C7595b implements C19600l<ServerId> {
        public final void write(Object obj, C19616q qVar) throws IOException {
            qVar.mo51939l(((ServerId) obj).f23119b);
        }
    }

    /* renamed from: com.moovit.sdk.utils.ServerId$c */
    public class C7596c implements C19589j<ServerId> {
        public final Object read(C19615p pVar) throws IOException {
            return new ServerId(pVar.mo51924l());
        }
    }

    public ServerId(int i) {
        this.f23119b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ServerId) && this.f23119b == ((ServerId) obj).f23119b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23119b;
    }

    public final String toString() {
        return Integer.toString(this.f23119b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23117c);
    }
}
