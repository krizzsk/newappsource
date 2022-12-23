package com.moovit.transit;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.database.DbEntityRef;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import j40.C5384a;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class TransitAgency implements C5384a, Parcelable {
    public static final Parcelable.Creator<TransitAgency> CREATOR = new C7804a();

    /* renamed from: f */
    public static final C7805b f23670f = new C7805b();

    /* renamed from: g */
    public static final C7806c f23671g = new C7806c(TransitAgency.class);

    /* renamed from: b */
    public final ServerId f23672b;

    /* renamed from: c */
    public final String f23673c;

    /* renamed from: d */
    public final DbEntityRef<TransitType> f23674d;

    /* renamed from: e */
    public final Image f23675e;

    /* renamed from: com.moovit.transit.TransitAgency$a */
    public class C7804a implements Parcelable.Creator<TransitAgency> {
        public final Object createFromParcel(Parcel parcel) {
            return (TransitAgency) C19612n.m46981v(parcel, TransitAgency.f23671g);
        }

        public final Object[] newArray(int i) {
            return new TransitAgency[i];
        }
    }

    /* renamed from: com.moovit.transit.TransitAgency$b */
    public class C7805b extends C19621u<TransitAgency> {
        public C7805b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TransitAgency transitAgency = (TransitAgency) obj;
            ServerId serverId = transitAgency.f23672b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51954p(transitAgency.f23673c);
            DbEntityRef.TRANSIT_TYPE_REF_CODER.write(transitAgency.f23674d, qVar);
            qVar.mo51967q(transitAgency.f23675e, C16019d.m40803a().f41718d);
        }
    }

    /* renamed from: com.moovit.transit.TransitAgency$c */
    public class C7806c extends C19620t<TransitAgency> {
        public C7806c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new TransitAgency(new ServerId(pVar.mo51924l()), pVar.mo51947p(), DbEntityRef.TRANSIT_TYPE_REF_CODER.read(pVar), (Image) pVar.mo51962q(C16019d.m40803a().f41718d));
        }
    }

    public TransitAgency(ServerId serverId, String str, DbEntityRef<TransitType> dbEntityRef, Image image) {
        this.f23672b = serverId;
        C21100e.m49373x(str, "name");
        this.f23673c = str;
        C21100e.m49373x(dbEntityRef, "transitTypeRef");
        this.f23674d = dbEntityRef;
        this.f23675e = image;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TransitAgency)) {
            return false;
        }
        return this.f23672b.equals(((TransitAgency) obj).f23672b);
    }

    public final ServerId getServerId() {
        return this.f23672b;
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f23672b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23670f);
    }
}
