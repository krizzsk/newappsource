package com.moovit.payment.invoices.model;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum InvoicePeriod implements Parcelable {
    DAY,
    MONTH;
    
    public static final C19577c<InvoicePeriod> CODER = null;
    public static final Parcelable.Creator<InvoicePeriod> CREATOR = null;

    /* renamed from: com.moovit.payment.invoices.model.InvoicePeriod$a */
    public class C16356a implements Parcelable.Creator<InvoicePeriod> {
        public final Object createFromParcel(Parcel parcel) {
            return (InvoicePeriod) C19612n.m46981v(parcel, InvoicePeriod.CODER);
        }

        public final Object[] newArray(int i) {
            return new InvoicePeriod[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        InvoicePeriod invoicePeriod;
        InvoicePeriod invoicePeriod2;
        CREATOR = new C16356a();
        CODER = new C19577c<>(InvoicePeriod.class, invoicePeriod, invoicePeriod2);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
