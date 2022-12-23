package com.moovit.commons.utils;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p583jk.C17884p;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20942h0;
import p977zz.C20944i0;
import p977zz.C20975x0;

public class LinkedText implements Parcelable {
    public static final Parcelable.Creator<LinkedText> CREATOR = new C15773a();

    /* renamed from: d */
    public static final C15774b f41026d = new C15774b(LinkedText.class);

    /* renamed from: b */
    public final String f41027b;

    /* renamed from: c */
    public final List<C20944i0<String, String>> f41028c;

    /* renamed from: com.moovit.commons.utils.LinkedText$a */
    public class C15773a implements Parcelable.Creator<LinkedText> {
        public final Object createFromParcel(Parcel parcel) {
            return (LinkedText) C19612n.m46981v(parcel, LinkedText.f41026d);
        }

        public final Object[] newArray(int i) {
            return new LinkedText[i];
        }
    }

    /* renamed from: com.moovit.commons.utils.LinkedText$b */
    public class C15774b extends C19619s<LinkedText> {

        /* renamed from: w */
        public final C20942h0 f41029w;

        public C15774b(Class cls) {
            super(0, cls);
            C19584i.C19588d dVar = C19584i.f49770b;
            this.f41029w = new C20942h0(dVar, dVar, dVar, dVar);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new LinkedText(pVar.mo51947p(), pVar.mo51959g(this.f41029w));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            LinkedText linkedText = (LinkedText) obj;
            qVar.mo51954p(linkedText.f41027b);
            qVar.mo51965h(linkedText.f41028c, this.f41029w);
        }
    }

    public LinkedText(String str, ArrayList arrayList) {
        C21100e.m49373x(str, "format");
        this.f41027b = str;
        C21100e.m49373x(arrayList, "links");
        this.f41028c = arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkedText)) {
            return false;
        }
        LinkedText linkedText = (LinkedText) obj;
        if (!C20975x0.m49118e(this.f41027b, linkedText.f41027b) || !C20975x0.m49118e(this.f41028c, linkedText.f41028c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f41027b), C17884p.m44335F(this.f41028c));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41026d);
    }
}
