package com.moovit.payment.clearance;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import com.usebutton.sdk.internal.events.Events;

public class CreditCardRequest implements Parcelable {
    public static final Parcelable.Creator<CreditCardRequest> CREATOR = new C16297a();

    /* renamed from: b */
    public final CreditCardInstructions f42590b;

    /* renamed from: c */
    public final int f42591c;

    /* renamed from: d */
    public final int f42592d;

    /* renamed from: e */
    public final boolean f42593e;

    /* renamed from: f */
    public final Action f42594f;

    public enum Action implements Parcelable {
        ADD,
        CHANGE;
        
        public static final Parcelable.Creator<Action> CREATOR = null;

        /* renamed from: com.moovit.payment.clearance.CreditCardRequest$Action$a */
        public class C16296a implements Parcelable.Creator<Action> {
            public final Object createFromParcel(Parcel parcel) {
                return Action.valueOf(parcel.readString());
            }

            public final Object[] newArray(int i) {
                return new Action[i];
            }
        }

        /* access modifiers changed from: public */
        static {
            CREATOR = new C16296a();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* renamed from: com.moovit.payment.clearance.CreditCardRequest$a */
    public class C16297a implements Parcelable.Creator<CreditCardRequest> {
        public final Object createFromParcel(Parcel parcel) {
            return new CreditCardRequest(parcel);
        }

        public final Object[] newArray(int i) {
            return new CreditCardRequest[i];
        }
    }

    public CreditCardRequest(CreditCardInstructions creditCardInstructions, Action action, boolean z, int i, int i2) {
        C21100e.m49373x(creditCardInstructions, "instructions");
        this.f42590b = creditCardInstructions;
        C21100e.m49373x(action, Events.PROPERTY_ACTION);
        this.f42594f = action;
        this.f42593e = z;
        this.f42591c = i;
        this.f42592d = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f42590b, i);
        parcel.writeParcelable(this.f42594f, i);
        parcel.writeByte(this.f42593e ? (byte) 1 : 0);
        parcel.writeInt(this.f42591c);
        parcel.writeInt(this.f42592d);
    }

    public CreditCardRequest(Parcel parcel) {
        this.f42590b = (CreditCardInstructions) parcel.readParcelable(CreditCardInstructions.class.getClassLoader());
        this.f42594f = (Action) parcel.readParcelable(Action.class.getClassLoader());
        this.f42593e = parcel.readByte() != 1 ? false : true;
        this.f42591c = parcel.readInt();
        this.f42592d = parcel.readInt();
    }
}
