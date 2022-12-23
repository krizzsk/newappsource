package com.moovit.sdk.Locale;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public final class LocaleInfo implements Parcelable {
    public static final Parcelable.Creator<LocaleInfo> CREATOR = new C4262a();

    /* renamed from: e */
    public static final C4263b f15163e = new C4263b(LocaleInfo.class);

    /* renamed from: b */
    public final String f15164b;

    /* renamed from: c */
    public final String f15165c;

    /* renamed from: d */
    public final String f15166d;

    /* renamed from: com.moovit.sdk.Locale.LocaleInfo$a */
    public class C4262a implements Parcelable.Creator<LocaleInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return (LocaleInfo) C19612n.m46981v(parcel, LocaleInfo.f15163e);
        }

        public final Object[] newArray(int i) {
            return new LocaleInfo[i];
        }
    }

    /* renamed from: com.moovit.sdk.Locale.LocaleInfo$b */
    public class C4263b extends C19619s<LocaleInfo> {
        public C4263b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new LocaleInfo(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            LocaleInfo localeInfo = (LocaleInfo) obj;
            qVar.mo51954p(localeInfo.f15164b);
            qVar.mo51954p(localeInfo.f15165c);
            qVar.mo51954p(localeInfo.f15166d);
        }
    }

    public LocaleInfo(String str, String str2, String str3) {
        C21100e.m49371w(str);
        this.f15164b = str;
        C21100e.m49371w(str2);
        this.f15165c = str2;
        C21100e.m49371w(str3);
        this.f15166d = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocaleInfo)) {
            return false;
        }
        LocaleInfo localeInfo = (LocaleInfo) obj;
        if (!this.f15164b.equals(localeInfo.f15164b) || !this.f15165c.equals(localeInfo.f15165c) || !this.f15166d.equals(localeInfo.f15166d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f15164b), C17884p.m44335F(this.f15165c), C17884p.m44335F(this.f15166d));
    }

    public final String toString() {
        if (!this.f15166d.isEmpty()) {
            return this.f15164b + "_" + this.f15165c + "_" + this.f15166d;
        } else if (this.f15165c.isEmpty()) {
            return this.f15164b;
        } else {
            return this.f15164b + "_" + this.f15165c;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f15163e);
    }
}
