package com.moovit.matrolanguage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

public class MetroLanguage implements Parcelable {
    public static final Parcelable.Creator<MetroLanguage> CREATOR = new C4110a();

    /* renamed from: d */
    public static final C4111b f14787d = new C4111b(MetroLanguage.class);

    /* renamed from: b */
    public final String f14788b;

    /* renamed from: c */
    public final String f14789c;

    /* renamed from: com.moovit.matrolanguage.MetroLanguage$a */
    public class C4110a implements Parcelable.Creator<MetroLanguage> {
        public final Object createFromParcel(Parcel parcel) {
            return (MetroLanguage) C19612n.m46981v(parcel, MetroLanguage.f14787d);
        }

        public final Object[] newArray(int i) {
            return new MetroLanguage[i];
        }
    }

    /* renamed from: com.moovit.matrolanguage.MetroLanguage$b */
    public class C4111b extends C19619s<MetroLanguage> {
        public C4111b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MetroLanguage(pVar.mo51947p(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MetroLanguage metroLanguage = (MetroLanguage) obj;
            qVar.mo51954p(metroLanguage.f14788b);
            qVar.mo51955t(metroLanguage.f14789c);
        }
    }

    public MetroLanguage(String str, String str2) {
        this.f14788b = str;
        this.f14789c = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MetroLanguage)) {
            return false;
        }
        MetroLanguage metroLanguage = (MetroLanguage) obj;
        if (!this.f14788b.equals(metroLanguage.f14788b) || !C20975x0.m49118e(this.f14789c, metroLanguage.f14789c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f14788b), C17884p.m44335F(this.f14789c));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14787d);
    }
}
