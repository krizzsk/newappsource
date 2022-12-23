package com.moovit.ticketing.message;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appboy.models.InAppMessageBase;
import java.io.IOException;
import m80.C12866b;
import m80.C12868d;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TicketAgencyMessage implements Parcelable {
    public static final Parcelable.Creator<TicketAgencyMessage> CREATOR = new C7640a();

    /* renamed from: e */
    public static final C7641b f23241e = new C7641b(TicketAgencyMessage.class);

    /* renamed from: b */
    public final Type f23242b;

    /* renamed from: c */
    public final String f23243c;

    /* renamed from: d */
    public final long f23244d;

    public enum Type implements Parcelable {
        INFO(C12866b.colorSurfaceInfo, C12868d.ic_ticket_message_info_24_info),
        POSITIVE(C12866b.colorSurfaceGood, C12868d.ic_ticket_message_positive_24_good),
        ALERT(C12866b.colorSurfaceProblem, C12868d.ic_ticket_message_alert_24_problem),
        CRITICAL(C12866b.colorSurfaceCritical, C12868d.ic_ticket_message_critical_24_critical);
        
        public static final C19577c<Type> CODER = null;
        public static final Parcelable.Creator<Type> CREATOR = null;
        private final int backgroundColorAttrResId;
        private final int iconResId;

        /* renamed from: com.moovit.ticketing.message.TicketAgencyMessage$Type$a */
        public class C7639a implements Parcelable.Creator<Type> {
            public final Object createFromParcel(Parcel parcel) {
                return (Type) C19612n.m46981v(parcel, Type.CODER);
            }

            public final Object[] newArray(int i) {
                return new Type[i];
            }
        }

        /* access modifiers changed from: public */
        static {
            Type type;
            Type type2;
            Type type3;
            Type type4;
            CREATOR = new C7639a();
            CODER = new C19577c<>(Type.class, type, type2, type3, type4);
        }

        private Type(int i, int i2) {
            this.backgroundColorAttrResId = i;
            this.iconResId = i2;
        }

        public int describeContents() {
            return 0;
        }

        public int getBackgroundColorAttr() {
            return this.backgroundColorAttrResId;
        }

        public int getIconResId() {
            return this.iconResId;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, CODER);
        }
    }

    /* renamed from: com.moovit.ticketing.message.TicketAgencyMessage$a */
    public class C7640a implements Parcelable.Creator<TicketAgencyMessage> {
        public final Object createFromParcel(Parcel parcel) {
            return (TicketAgencyMessage) C19612n.m46981v(parcel, TicketAgencyMessage.f23241e);
        }

        public final Object[] newArray(int i) {
            return new TicketAgencyMessage[i];
        }
    }

    /* renamed from: com.moovit.ticketing.message.TicketAgencyMessage$b */
    public class C7641b extends C19619s<TicketAgencyMessage> {
        public C7641b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new TicketAgencyMessage((Type) pVar.mo51962q(Type.CODER), pVar.mo51947p(), pVar.mo51925m());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TicketAgencyMessage ticketAgencyMessage = (TicketAgencyMessage) obj;
            qVar.mo51967q(ticketAgencyMessage.f23242b, Type.CODER);
            qVar.mo51954p(ticketAgencyMessage.f23243c);
            qVar.mo51940m(ticketAgencyMessage.f23244d);
        }
    }

    public TicketAgencyMessage(Type type, String str, long j) {
        C21100e.m49373x(type, "type");
        this.f23242b = type;
        C21100e.m49373x(str, InAppMessageBase.MESSAGE);
        this.f23243c = str;
        this.f23244d = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23241e);
    }
}
