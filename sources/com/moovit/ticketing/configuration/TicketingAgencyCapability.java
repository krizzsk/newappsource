package com.moovit.ticketing.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;

public enum TicketingAgencyCapability implements Parcelable {
    TICKETS,
    STORED_VALUE,
    JOURNEY_TICKETS,
    SPLIT_FARE_PAYMENTS,
    PROVIDER_LEVEL_VALIDATION_INFO,
    OFFLINE_MODE,
    PURCHASE_PAYMENT_ACCOUNT_SENSITIVE,
    STORED_VALUE_AUTO_LOAD;
    
    public static final C19584i<TicketingAgencyCapability> CODER = null;
    public static final Parcelable.Creator<TicketingAgencyCapability> CREATOR = null;

    /* renamed from: com.moovit.ticketing.configuration.TicketingAgencyCapability$a */
    public class C7638a implements Parcelable.Creator<TicketingAgencyCapability> {
        public final Object createFromParcel(Parcel parcel) {
            return (TicketingAgencyCapability) C19612n.m46981v(parcel, TicketingAgencyCapability.CODER);
        }

        public final Object[] newArray(int i) {
            return new TicketingAgencyCapability[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        TicketingAgencyCapability ticketingAgencyCapability;
        TicketingAgencyCapability ticketingAgencyCapability2;
        TicketingAgencyCapability ticketingAgencyCapability3;
        TicketingAgencyCapability ticketingAgencyCapability4;
        TicketingAgencyCapability ticketingAgencyCapability5;
        TicketingAgencyCapability ticketingAgencyCapability6;
        TicketingAgencyCapability ticketingAgencyCapability7;
        TicketingAgencyCapability ticketingAgencyCapability8;
        CREATOR = new C7638a();
        CODER = new C19577c(TicketingAgencyCapability.class, ticketingAgencyCapability, ticketingAgencyCapability2, ticketingAgencyCapability4, ticketingAgencyCapability5, ticketingAgencyCapability6, ticketingAgencyCapability7, ticketingAgencyCapability3, ticketingAgencyCapability8);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
