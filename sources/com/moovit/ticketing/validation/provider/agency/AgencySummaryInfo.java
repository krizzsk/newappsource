package com.moovit.ticketing.validation.provider.agency;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.ticketing.message.TicketAgencyMessage;
import com.moovit.ticketing.storedvalue.StoredValueStatus;
import com.moovit.ticketing.ticket.TicketAgency;
import com.moovit.util.CurrencyAmount;
import java.io.IOException;
import p810sz.C19577c;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20944i0;

public class AgencySummaryInfo implements Parcelable {
    public static final Parcelable.Creator<AgencySummaryInfo> CREATOR = new C7767a();

    /* renamed from: i */
    public static final C7768b f23572i = new C7768b(AgencySummaryInfo.class);

    /* renamed from: b */
    public final TicketAgency f23573b;

    /* renamed from: c */
    public final C20944i0<CurrencyAmount, StoredValueStatus> f23574c;

    /* renamed from: d */
    public final int f23575d;

    /* renamed from: e */
    public final int f23576e;

    /* renamed from: f */
    public final String f23577f;

    /* renamed from: g */
    public final int f23578g;

    /* renamed from: h */
    public final TicketAgencyMessage f23579h;

    /* renamed from: com.moovit.ticketing.validation.provider.agency.AgencySummaryInfo$a */
    public class C7767a implements Parcelable.Creator<AgencySummaryInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return (AgencySummaryInfo) C19612n.m46981v(parcel, AgencySummaryInfo.f23572i);
        }

        public final Object[] newArray(int i) {
            return new AgencySummaryInfo[i];
        }
    }

    /* renamed from: com.moovit.ticketing.validation.provider.agency.AgencySummaryInfo$b */
    public class C7768b extends C19619s<AgencySummaryInfo> {
        public C7768b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C20944i0 i0Var;
            int i2;
            TicketAgencyMessage ticketAgencyMessage;
            String str;
            TicketAgency.C7744b bVar = TicketAgency.f23494g;
            pVar.getClass();
            TicketAgency ticketAgency = (TicketAgency) bVar.read(pVar);
            CurrencyAmount.C7881b bVar2 = CurrencyAmount.f23843f;
            C19584i iVar = StoredValueStatus.CODER;
            C21100e.m49373x(bVar2, "firstReader");
            C21100e.m49373x(iVar, "secondReader");
            if (!pVar.mo51919b()) {
                i0Var = null;
            } else {
                i0Var = new C20944i0(pVar.mo51962q(bVar2), pVar.mo51962q(iVar));
            }
            int l = pVar.mo51924l();
            int l2 = pVar.mo51924l();
            if (i >= 1) {
                i2 = pVar.mo51924l();
            } else {
                i2 = 0;
            }
            if (i >= 1) {
                ticketAgencyMessage = (TicketAgencyMessage) pVar.mo51962q(TicketAgencyMessage.f23241e);
            } else {
                ticketAgencyMessage = null;
            }
            if (i >= 1) {
                str = pVar.mo51948t();
            } else {
                str = null;
            }
            return new AgencySummaryInfo(ticketAgency, i0Var, l2, l, str, i2, ticketAgencyMessage);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            AgencySummaryInfo agencySummaryInfo = (AgencySummaryInfo) obj;
            TicketAgency ticketAgency = agencySummaryInfo.f23573b;
            TicketAgency.C7744b bVar = TicketAgency.f23494g;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(ticketAgency, qVar);
            C20944i0<CurrencyAmount, StoredValueStatus> i0Var = agencySummaryInfo.f23574c;
            CurrencyAmount.C7881b bVar2 = CurrencyAmount.f23843f;
            C19577c<StoredValueStatus> cVar = StoredValueStatus.CODER;
            C21100e.m49373x(bVar2, "firstWriter");
            C21100e.m49373x(cVar, "secondWriter");
            if (i0Var == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51967q(i0Var.f52692a, bVar2);
                qVar.mo51967q(i0Var.f52693b, cVar);
            }
            qVar.mo51939l(agencySummaryInfo.f23576e);
            qVar.mo51939l(agencySummaryInfo.f23575d);
            qVar.mo51939l(agencySummaryInfo.f23578g);
            qVar.mo51967q(agencySummaryInfo.f23579h, TicketAgencyMessage.f23241e);
            qVar.mo51955t(agencySummaryInfo.f23577f);
        }
    }

    public AgencySummaryInfo(TicketAgency ticketAgency, C20944i0<CurrencyAmount, StoredValueStatus> i0Var, int i, int i2, String str, int i3, TicketAgencyMessage ticketAgencyMessage) {
        C21100e.m49373x(ticketAgency, "agency");
        this.f23573b = ticketAgency;
        this.f23574c = i0Var;
        this.f23575d = i;
        this.f23576e = i2;
        this.f23577f = str;
        this.f23578g = i3;
        this.f23579h = ticketAgencyMessage;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23572i);
    }
}
