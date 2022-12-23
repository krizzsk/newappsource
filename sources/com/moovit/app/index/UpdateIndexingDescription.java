package com.moovit.app.index;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p735pt.C18980a;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class UpdateIndexingDescription extends C18980a implements Parcelable {
    public static final Parcelable.Creator<UpdateIndexingDescription> CREATOR = new C15016a();

    /* renamed from: g */
    public static final C15017b f38436g = new C15017b();

    /* renamed from: h */
    public static final C15018c f38437h = new C15018c(UpdateIndexingDescription.class);

    /* renamed from: e */
    public final String f38438e;

    /* renamed from: f */
    public final String f38439f;

    /* renamed from: com.moovit.app.index.UpdateIndexingDescription$a */
    public class C15016a implements Parcelable.Creator<UpdateIndexingDescription> {
        public final Object createFromParcel(Parcel parcel) {
            return (UpdateIndexingDescription) C19612n.m46981v(parcel, UpdateIndexingDescription.f38437h);
        }

        public final Object[] newArray(int i) {
            return new UpdateIndexingDescription[i];
        }
    }

    /* renamed from: com.moovit.app.index.UpdateIndexingDescription$b */
    public class C15017b extends C19621u<UpdateIndexingDescription> {
        public C15017b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            UpdateIndexingDescription updateIndexingDescription = (UpdateIndexingDescription) obj;
            qVar.mo51954p(updateIndexingDescription.f48324b);
            qVar.mo51954p(updateIndexingDescription.f48325c);
            qVar.mo51955t(updateIndexingDescription.f38438e);
            qVar.mo51955t(updateIndexingDescription.f38439f);
            qVar.mo51934b(updateIndexingDescription.f48326d);
        }
    }

    /* renamed from: com.moovit.app.index.UpdateIndexingDescription$c */
    public class C15018c extends C19620t<UpdateIndexingDescription> {
        public C15018c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new UpdateIndexingDescription(pVar.mo51919b(), pVar.mo51947p(), pVar.mo51947p(), pVar.mo51948t(), pVar.mo51948t());
        }
    }

    public UpdateIndexingDescription(boolean z, String str, String str2, String str3, String str4) {
        super(str, str2, z);
        this.f38438e = str3;
        this.f38439f = str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateIndexingDescription)) {
            return false;
        }
        return this.f48325c.equals(((UpdateIndexingDescription) obj).f48325c);
    }

    public final int hashCode() {
        return this.f48325c.hashCode() + (this.f48324b.hashCode() * 31);
    }

    public final String toString() {
        return this.f48324b + " - " + this.f48325c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f38436g);
    }
}
