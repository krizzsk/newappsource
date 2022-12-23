package com.moovit.ticketing.ticket;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import p241s0.C6302b;
import p583jk.C17884p;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TicketId implements Parcelable {
    public static final Parcelable.Creator<TicketId> CREATOR = new C7748a();

    /* renamed from: f */
    public static final C7749b f23510f = new C7749b(TicketId.class);

    /* renamed from: b */
    public final ServerId f23511b;

    /* renamed from: c */
    public final String f23512c;

    /* renamed from: d */
    public final String f23513d;

    /* renamed from: e */
    public final Map<String, String> f23514e;

    /* renamed from: com.moovit.ticketing.ticket.TicketId$a */
    public class C7748a implements Parcelable.Creator<TicketId> {
        public final Object createFromParcel(Parcel parcel) {
            return (TicketId) C19612n.m46981v(parcel, TicketId.f23510f);
        }

        public final Object[] newArray(int i) {
            return new TicketId[i];
        }
    }

    /* renamed from: com.moovit.ticketing.ticket.TicketId$b */
    public class C7749b extends C19619s<TicketId> {
        public C7749b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            ServerId serverId = new ServerId(pVar.mo51924l());
            String p = pVar.mo51947p();
            String p2 = pVar.mo51947p();
            C19589j.C19598i iVar = C19589j.f49779k;
            return new TicketId(serverId, p, p2, pVar.mo51961o(iVar, iVar, new C6302b()));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TicketId ticketId = (TicketId) obj;
            ServerId serverId = ticketId.f23511b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51954p(ticketId.f23512c);
            qVar.mo51954p(ticketId.f23513d);
            Map<String, String> map = ticketId.f23514e;
            C19600l.C19609i iVar = C19600l.f49790t;
            qVar.mo51966o(map, iVar, iVar);
        }
    }

    public TicketId(ServerId serverId, String str, String str2) {
        this(serverId, str, str2, Collections.emptyMap());
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketId)) {
            return false;
        }
        TicketId ticketId = (TicketId) obj;
        if (!this.f23511b.equals(ticketId.f23511b) || !this.f23513d.equals(ticketId.f23513d) || !this.f23512c.equals(ticketId.f23512c) || !this.f23514e.equals(ticketId.f23514e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f23511b), C17884p.m44335F(this.f23512c), C17884p.m44335F(this.f23513d), C17884p.m44335F(this.f23514e));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23510f);
    }

    public TicketId(ServerId serverId, String str, String str2, Map<String, String> map) {
        C21100e.m49373x(serverId, "providerId");
        this.f23511b = serverId;
        C21100e.m49373x(str2, "ticketId");
        this.f23513d = str2;
        C21100e.m49373x(str, "agencyKey");
        this.f23512c = str;
        C21100e.m49373x(map, "payload");
        this.f23514e = Collections.unmodifiableMap(map);
    }
}
