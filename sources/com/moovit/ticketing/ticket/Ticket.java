package com.moovit.ticketing.ticket;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appboy.models.InAppMessageBase;
import com.moovit.util.CurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import p066e0.C4436j0;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import y60.C20707c;

public final class Ticket implements C20707c {

    /* renamed from: b */
    public final TicketId f23473b;

    /* renamed from: c */
    public final String f23474c;

    /* renamed from: d */
    public final Status f23475d;

    /* renamed from: e */
    public final String f23476e;

    /* renamed from: f */
    public final String f23477f;

    /* renamed from: g */
    public final TicketAgency f23478g;

    /* renamed from: h */
    public final CurrencyAmount f23479h;

    /* renamed from: i */
    public final long f23480i;

    /* renamed from: j */
    public final long f23481j;

    /* renamed from: k */
    public final long f23482k;

    /* renamed from: l */
    public final long f23483l;

    /* renamed from: m */
    public final long f23484m;

    /* renamed from: n */
    public final String f23485n;

    /* renamed from: o */
    public final String f23486o;

    /* renamed from: p */
    public final C7755c f23487p;

    /* renamed from: q */
    public final Alert f23488q;

    /* renamed from: r */
    public final String f23489r;

    /* renamed from: s */
    public final String f23490s;

    /* renamed from: t */
    public final String f23491t;

    /* renamed from: u */
    public final String f23492u;

    /* renamed from: v */
    public final C4436j0 f23493v;

    public enum Alert implements Parcelable {
        EXPIRING,
        PASSBOOK_LOW_TRIP,
        PURCHASE_FAILURE;
        
        public static final C19577c<Alert> CODER = null;
        public static final Parcelable.Creator<Alert> CREATOR = null;

        /* renamed from: com.moovit.ticketing.ticket.Ticket$Alert$a */
        public class C7741a implements Parcelable.Creator<Alert> {
            public final Object createFromParcel(Parcel parcel) {
                return (Alert) C19612n.m46981v(parcel, Alert.CODER);
            }

            public final Object[] newArray(int i) {
                return new Alert[i];
            }
        }

        /* access modifiers changed from: public */
        static {
            Alert alert;
            Alert alert2;
            Alert alert3;
            CREATOR = new C7741a();
            CODER = new C19577c<>(Alert.class, alert, alert2, alert3);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, CODER);
        }
    }

    public enum Status implements Parcelable {
        ACTIVE(2000),
        VALID_AUTO_ACTIVATE(InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS),
        VALID(InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS),
        NOT_YET_VALID(6000),
        ISSUING_IN_PROGRESS(6000),
        EXPIRED(7000);
        
        public static final C19577c<Status> CODER = null;
        public static final Parcelable.Creator<Status> CREATOR = null;
        public final int priority;

        /* renamed from: com.moovit.ticketing.ticket.Ticket$Status$a */
        public class C7742a implements Parcelable.Creator<Status> {
            public final Object createFromParcel(Parcel parcel) {
                return (Status) C19612n.m46981v(parcel, Status.CODER);
            }

            public final Object[] newArray(int i) {
                return new Status[i];
            }
        }

        /* access modifiers changed from: public */
        static {
            Status status;
            Status status2;
            Status status3;
            Status status4;
            Status status5;
            Status status6;
            CREATOR = new C7742a();
            CODER = new C19577c<>(Status.class, status, status3, status4, status6, status2, status5);
        }

        private Status(int i) {
            this.priority = i;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, CODER);
        }
    }

    public Ticket(TicketId ticketId, String str, Status status, String str2, String str3, TicketAgency ticketAgency, CurrencyAmount currencyAmount, long j, long j2, long j3, long j4, long j5, String str4, String str5, C7755c cVar, Alert alert, C4436j0 j0Var, String str6, String str7, String str8, String str9) {
        C21100e.m49373x(ticketId, "id");
        this.f23473b = ticketId;
        C21100e.m49373x(str, "ticketId");
        this.f23474c = str;
        C21100e.m49373x(status, "ticketStatus");
        this.f23475d = status;
        C21100e.m49373x(str2, "name");
        this.f23476e = str2;
        this.f23477f = str3;
        C21100e.m49373x(ticketAgency, "agency");
        this.f23478g = ticketAgency;
        C21100e.m49373x(currencyAmount, InAppPurchaseMetaData.KEY_PRICE);
        this.f23479h = currencyAmount;
        this.f23480i = j;
        this.f23481j = j2;
        this.f23482k = j3;
        this.f23483l = j4;
        this.f23484m = j5;
        this.f23485n = str4;
        this.f23486o = str5;
        this.f23487p = cVar;
        this.f23488q = alert;
        this.f23493v = j0Var;
        this.f23489r = str6;
        this.f23490s = str7;
        this.f23491t = str8;
        this.f23492u = str9;
    }

    /* renamed from: T */
    public final long mo19565T() {
        return this.f23480i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ticket)) {
            return false;
        }
        return this.f23473b.equals(((Ticket) obj).f23473b);
    }

    public final int getPriority() {
        return this.f23475d.priority;
    }

    public final int hashCode() {
        return this.f23473b.hashCode();
    }

    /* renamed from: m1 */
    public final int compareTo(C20707c cVar) {
        int compare = Integer.compare(getPriority(), cVar.getPriority());
        if (compare == 0) {
            return -Long.compare(mo19565T(), cVar.mo19565T());
        }
        return compare;
    }
}
