package com.moovit.ticketing.ticket;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.database.DbEntityRef;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.transit.TransitAgency;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TicketAgency implements Parcelable {
    public static final Parcelable.Creator<TicketAgency> CREATOR = new C7743a();

    /* renamed from: g */
    public static final C7744b f23494g = new C7744b(TicketAgency.class);

    /* renamed from: b */
    public final String f23495b;

    /* renamed from: c */
    public final String f23496c;

    /* renamed from: d */
    public final Image f23497d;

    /* renamed from: e */
    public final DbEntityRef<TransitAgency> f23498e;

    /* renamed from: f */
    public final Image f23499f;

    /* renamed from: com.moovit.ticketing.ticket.TicketAgency$a */
    public class C7743a implements Parcelable.Creator<TicketAgency> {
        public final Object createFromParcel(Parcel parcel) {
            return (TicketAgency) C19612n.m46981v(parcel, TicketAgency.f23494g);
        }

        public final Object[] newArray(int i) {
            return new TicketAgency[i];
        }
    }

    /* renamed from: com.moovit.ticketing.ticket.TicketAgency$b */
    public class C7744b extends C19619s<TicketAgency> {
        public C7744b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            Image image;
            String p = pVar.mo51947p();
            String p2 = pVar.mo51947p();
            DbEntityRef dbEntityRef = (DbEntityRef) pVar.mo51962q(DbEntityRef.AGENCY_REF_CODER);
            Image image2 = (Image) pVar.mo51962q(C16019d.m40803a().f41718d);
            if (i >= 1) {
                image = (Image) pVar.mo51962q(C16019d.m40803a().f41718d);
            } else {
                image = null;
            }
            return new TicketAgency(p, p2, image, dbEntityRef, image2);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TicketAgency ticketAgency = (TicketAgency) obj;
            qVar.mo51954p(ticketAgency.f23495b);
            qVar.mo51954p(ticketAgency.f23496c);
            qVar.mo51967q(ticketAgency.f23498e, DbEntityRef.AGENCY_REF_CODER);
            qVar.mo51967q(ticketAgency.f23499f, C16019d.m40803a().f41718d);
            qVar.mo51967q(ticketAgency.f23497d, C16019d.m40803a().f41718d);
        }
    }

    public TicketAgency(String str, String str2, Image image, DbEntityRef<TransitAgency> dbEntityRef, Image image2) {
        C21100e.m49373x(str, "agencyKey");
        this.f23495b = str;
        C21100e.m49373x(str2, "agencyName");
        this.f23496c = str2;
        this.f23497d = image;
        this.f23498e = dbEntityRef;
        this.f23499f = image2;
    }

    /* renamed from: b */
    public final Image mo24222b() {
        TransitAgency transitAgency;
        DbEntityRef<TransitAgency> dbEntityRef = this.f23498e;
        if (dbEntityRef != null) {
            transitAgency = dbEntityRef.get();
        } else {
            transitAgency = null;
        }
        if (transitAgency != null) {
            return transitAgency.f23675e;
        }
        return this.f23497d;
    }

    /* renamed from: c */
    public final String mo24223c() {
        TransitAgency transitAgency;
        DbEntityRef<TransitAgency> dbEntityRef = this.f23498e;
        if (dbEntityRef != null) {
            transitAgency = dbEntityRef.get();
        } else {
            transitAgency = null;
        }
        if (transitAgency != null) {
            return transitAgency.f23673c;
        }
        return this.f23496c;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TicketAgency)) {
            return false;
        }
        return this.f23495b.equals(((TicketAgency) obj).f23495b);
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f23495b);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TicketAgency{agencyKey='");
        C25541a.m63890u(k, this.f23495b, '\'', ", agencyName='");
        C25541a.m63890u(k, this.f23496c, '\'', ", agencyRef=");
        k.append(this.f23498e);
        k.append('\'');
        k.append(", backgroundImage=");
        k.append(this.f23499f);
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23494g);
    }
}
