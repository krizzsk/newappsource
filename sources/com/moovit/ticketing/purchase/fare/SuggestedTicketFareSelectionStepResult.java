package com.moovit.ticketing.purchase.fare;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.ticketing.purchase.PurchaseStepResult;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class SuggestedTicketFareSelectionStepResult extends PurchaseStepResult {
    public static final Parcelable.Creator<SuggestedTicketFareSelectionStepResult> CREATOR = new C7674a();

    /* renamed from: d */
    public static final C7675b f23323d = new C7675b(SuggestedTicketFareSelectionStepResult.class);

    /* renamed from: c */
    public final SuggestedTicketFare f23324c;

    /* renamed from: com.moovit.ticketing.purchase.fare.SuggestedTicketFareSelectionStepResult$a */
    public class C7674a implements Parcelable.Creator<SuggestedTicketFareSelectionStepResult> {
        public final Object createFromParcel(Parcel parcel) {
            return (SuggestedTicketFareSelectionStepResult) C19612n.m46981v(parcel, SuggestedTicketFareSelectionStepResult.f23323d);
        }

        public final Object[] newArray(int i) {
            return new SuggestedTicketFareSelectionStepResult[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.fare.SuggestedTicketFareSelectionStepResult$b */
    public class C7675b extends C19619s<SuggestedTicketFareSelectionStepResult> {
        public C7675b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new SuggestedTicketFareSelectionStepResult(pVar.mo51947p(), (SuggestedTicketFare) SuggestedTicketFare.f23312j.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            SuggestedTicketFareSelectionStepResult suggestedTicketFareSelectionStepResult = (SuggestedTicketFareSelectionStepResult) obj;
            qVar.mo51954p(suggestedTicketFareSelectionStepResult.f23249b);
            qVar.mo51967q(suggestedTicketFareSelectionStepResult.f23324c, SuggestedTicketFare.f23312j);
        }
    }

    public SuggestedTicketFareSelectionStepResult(String str, SuggestedTicketFare suggestedTicketFare) {
        super(str);
        this.f23324c = suggestedTicketFare;
    }

    /* renamed from: b */
    public final <R, E extends Exception> R mo24018b(PurchaseStepResult.C7646a<R, E> aVar) throws Exception {
        return aVar.mo24021e(this);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23323d);
    }
}
