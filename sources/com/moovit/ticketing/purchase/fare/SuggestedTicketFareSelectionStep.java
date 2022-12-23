package com.moovit.ticketing.purchase.fare;

import a90.C7523e;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class SuggestedTicketFareSelectionStep extends PurchaseStep {
    public static final Parcelable.Creator<SuggestedTicketFareSelectionStep> CREATOR = new C7672a();

    /* renamed from: f */
    public static final C7673b f23321f = new C7673b(SuggestedTicketFareSelectionStep.class);

    /* renamed from: e */
    public final List<SuggestedTicketFare> f23322e;

    /* renamed from: com.moovit.ticketing.purchase.fare.SuggestedTicketFareSelectionStep$a */
    public class C7672a implements Parcelable.Creator<SuggestedTicketFareSelectionStep> {
        public final Object createFromParcel(Parcel parcel) {
            return (SuggestedTicketFareSelectionStep) C19612n.m46981v(parcel, SuggestedTicketFareSelectionStep.f23321f);
        }

        public final Object[] newArray(int i) {
            return new SuggestedTicketFareSelectionStep[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.fare.SuggestedTicketFareSelectionStep$b */
    public class C7673b extends C19619s<SuggestedTicketFareSelectionStep> {
        public C7673b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new SuggestedTicketFareSelectionStep(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51948t(), pVar.mo51959g(SuggestedTicketFare.f23312j));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            SuggestedTicketFareSelectionStep suggestedTicketFareSelectionStep = (SuggestedTicketFareSelectionStep) obj;
            qVar.mo51954p(suggestedTicketFareSelectionStep.f23246b);
            qVar.mo51954p(suggestedTicketFareSelectionStep.f23247c);
            qVar.mo51955t(suggestedTicketFareSelectionStep.f23248d);
            qVar.mo51965h(suggestedTicketFareSelectionStep.f23322e, SuggestedTicketFare.f23312j);
        }
    }

    public SuggestedTicketFareSelectionStep(String str, String str2, String str3, ArrayList arrayList) {
        super(str, str2, str3);
        C21100e.m49373x(arrayList, "suggestedTicketFares");
        this.f23322e = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: b */
    public final void mo24015b(PurchaseStep.C7645a aVar, String str) {
        PurchaseTicketActivity purchaseTicketActivity = (PurchaseTicketActivity) aVar;
        purchaseTicketActivity.getClass();
        int i = C7523e.f22998q;
        Bundle b = C25541a.m63872b("stepId", str);
        C7523e eVar = new C7523e();
        eVar.setArguments(b);
        purchaseTicketActivity.mo24030y2(eVar);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23321f);
    }
}
