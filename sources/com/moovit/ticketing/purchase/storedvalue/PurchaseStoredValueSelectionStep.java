package com.moovit.ticketing.purchase.storedvalue;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.util.CurrencyAmount;
import f90.C12642d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PurchaseStoredValueSelectionStep extends PurchaseStep {
    public static final Parcelable.Creator<PurchaseStoredValueSelectionStep> CREATOR = new C7728a();

    /* renamed from: l */
    public static final C7729b f23443l = new C7729b(PurchaseStoredValueSelectionStep.class);

    /* renamed from: e */
    public final String f23444e;

    /* renamed from: f */
    public final ServerId f23445f;

    /* renamed from: g */
    public final String f23446g;

    /* renamed from: h */
    public final List<PurchaseStoredValueAmount> f23447h;

    /* renamed from: i */
    public final CurrencyAmount f23448i;

    /* renamed from: j */
    public final PurchaseStoredValueOtherAmount f23449j;

    /* renamed from: k */
    public final PurchaseVerificationType f23450k;

    /* renamed from: com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueSelectionStep$a */
    public class C7728a implements Parcelable.Creator<PurchaseStoredValueSelectionStep> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseStoredValueSelectionStep) C19612n.m46981v(parcel, PurchaseStoredValueSelectionStep.f23443l);
        }

        public final Object[] newArray(int i) {
            return new PurchaseStoredValueSelectionStep[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueSelectionStep$b */
    public class C7729b extends C19619s<PurchaseStoredValueSelectionStep> {
        public C7729b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            String str;
            String p = pVar.mo51947p();
            String p2 = pVar.mo51947p();
            String t = pVar.mo51948t();
            ServerId serverId = new ServerId(pVar.mo51924l());
            String p3 = pVar.mo51947p();
            ArrayList g = pVar.mo51959g(PurchaseStoredValueAmount.f23429f);
            CurrencyAmount currencyAmount = (CurrencyAmount) pVar.mo51962q(CurrencyAmount.f23843f);
            PurchaseStoredValueOtherAmount purchaseStoredValueOtherAmount = (PurchaseStoredValueOtherAmount) pVar.mo51962q(PurchaseStoredValueOtherAmount.f23438f);
            PurchaseVerificationType read = PurchaseVerificationType.CODER.read(pVar);
            if (i >= 1) {
                str = pVar.mo51948t();
            } else {
                str = null;
            }
            return new PurchaseStoredValueSelectionStep(p, p2, t, str, serverId, p3, g, currencyAmount, purchaseStoredValueOtherAmount, read);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseStoredValueSelectionStep purchaseStoredValueSelectionStep = (PurchaseStoredValueSelectionStep) obj;
            qVar.mo51954p(purchaseStoredValueSelectionStep.f23246b);
            qVar.mo51954p(purchaseStoredValueSelectionStep.f23247c);
            qVar.mo51955t(purchaseStoredValueSelectionStep.f23248d);
            qVar.mo51939l(purchaseStoredValueSelectionStep.f23445f.f15142b);
            qVar.mo51954p(purchaseStoredValueSelectionStep.f23446g);
            qVar.mo51965h(purchaseStoredValueSelectionStep.f23447h, PurchaseStoredValueAmount.f23429f);
            qVar.mo51967q(purchaseStoredValueSelectionStep.f23448i, CurrencyAmount.f23843f);
            qVar.mo51967q(purchaseStoredValueSelectionStep.f23449j, PurchaseStoredValueOtherAmount.f23438f);
            PurchaseVerificationType.CODER.write(purchaseStoredValueSelectionStep.f23450k, qVar);
            qVar.mo51955t(purchaseStoredValueSelectionStep.f23444e);
        }
    }

    public PurchaseStoredValueSelectionStep(String str, String str2, String str3, String str4, ServerId serverId, String str5, ArrayList arrayList, CurrencyAmount currencyAmount, PurchaseStoredValueOtherAmount purchaseStoredValueOtherAmount, PurchaseVerificationType purchaseVerificationType) {
        super(str, str2, str3);
        this.f23444e = str4;
        this.f23445f = serverId;
        C21100e.m49373x(str5, "agencyKey");
        this.f23446g = str5;
        C21100e.m49373x(arrayList, "amounts");
        this.f23447h = arrayList;
        this.f23448i = currencyAmount;
        this.f23449j = purchaseStoredValueOtherAmount;
        C21100e.m49373x(purchaseVerificationType, "verificationType");
        this.f23450k = purchaseVerificationType;
    }

    /* renamed from: b */
    public final void mo24015b(PurchaseStep.C7645a aVar, String str) {
        PurchaseTicketActivity purchaseTicketActivity = (PurchaseTicketActivity) aVar;
        purchaseTicketActivity.getClass();
        int i = C12642d.f31246v;
        Bundle b = C25541a.m63872b("stepId", str);
        C12642d dVar = new C12642d();
        dVar.setArguments(b);
        purchaseTicketActivity.mo24030y2(dVar);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23443l);
    }
}
