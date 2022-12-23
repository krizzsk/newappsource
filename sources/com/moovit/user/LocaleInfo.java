package com.moovit.user;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import java.util.Locale;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20943i;

public final class LocaleInfo implements Parcelable {
    public static final Parcelable.Creator<LocaleInfo> CREATOR = new C7876a();

    /* renamed from: e */
    public static final C7877b f23834e = new C7877b(LocaleInfo.class);

    /* renamed from: b */
    public final String f23835b;

    /* renamed from: c */
    public final String f23836c;

    /* renamed from: d */
    public final String f23837d;

    /* renamed from: com.moovit.user.LocaleInfo$a */
    public class C7876a implements Parcelable.Creator<LocaleInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return (LocaleInfo) C19612n.m46981v(parcel, LocaleInfo.f23834e);
        }

        public final Object[] newArray(int i) {
            return new LocaleInfo[i];
        }
    }

    /* renamed from: com.moovit.user.LocaleInfo$b */
    public class C7877b extends C19619s<LocaleInfo> {
        public C7877b(Class cls) {
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
            qVar.mo51954p(localeInfo.f23835b);
            qVar.mo51954p(localeInfo.f23836c);
            qVar.mo51954p(localeInfo.f23837d);
        }
    }

    public LocaleInfo(String str, String str2, String str3) {
        C21100e.m49371w(str);
        this.f23835b = str;
        C21100e.m49371w(str2);
        this.f23836c = str2;
        C21100e.m49371w(str3);
        this.f23837d = str3;
    }

    /* renamed from: b */
    public static LocaleInfo m17919b(Context context) {
        Locale c = C20943i.m49050c(context.getResources().getConfiguration());
        if (c == null) {
            return null;
        }
        return new LocaleInfo(c);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocaleInfo)) {
            return false;
        }
        LocaleInfo localeInfo = (LocaleInfo) obj;
        if (!this.f23835b.equals(localeInfo.f23835b) || !this.f23836c.equals(localeInfo.f23836c) || !this.f23837d.equals(localeInfo.f23837d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f23835b), C17884p.m44335F(this.f23836c), C17884p.m44335F(this.f23837d));
    }

    public final String toString() {
        if (!this.f23837d.isEmpty()) {
            return this.f23835b + "-" + this.f23836c + "-" + this.f23837d;
        } else if (this.f23836c.isEmpty()) {
            return this.f23835b;
        } else {
            return this.f23835b + "-" + this.f23836c;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23834e);
    }

    public LocaleInfo(Locale locale) {
        this(locale.getLanguage(), locale.getCountry(), locale.getVariant());
    }
}
