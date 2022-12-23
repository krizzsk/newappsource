package com.moovit.ticketing.purchase.storedvalue;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueAmount;
import f90.C12640b;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PurchaseStoredValueStep extends PurchaseStep {
    public static final Parcelable.Creator<PurchaseStoredValueStep> CREATOR = new C7732a();

    /* renamed from: j */
    public static final C7733b f23453j = new C7733b(PurchaseStoredValueStep.class);

    /* renamed from: e */
    public final ServerId f23454e;

    /* renamed from: f */
    public final String f23455f;

    /* renamed from: g */
    public final PurchaseStoredValueAmount f23456g;

    /* renamed from: h */
    public final PurchaseVerificationType f23457h;

    /* renamed from: i */
    public final String f23458i;

    /* renamed from: com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueStep$a */
    public class C7732a implements Parcelable.Creator<PurchaseStoredValueStep> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseStoredValueStep) C19612n.m46981v(parcel, PurchaseStoredValueStep.f23453j);
        }

        public final Object[] newArray(int i) {
            return new PurchaseStoredValueStep[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueStep$b */
    public class C7733b extends C19619s<PurchaseStoredValueStep> {
        public C7733b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PurchaseStoredValueStep(pVar.mo51947p(), pVar.mo51947p(), new ServerId(pVar.mo51924l()), pVar.mo51947p(), (PurchaseStoredValueAmount) PurchaseStoredValueAmount.f23429f.read(pVar), PurchaseVerificationType.CODER.read(pVar), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseStoredValueStep purchaseStoredValueStep = (PurchaseStoredValueStep) obj;
            qVar.mo51954p(purchaseStoredValueStep.f23246b);
            qVar.mo51954p(purchaseStoredValueStep.f23247c);
            qVar.mo51939l(purchaseStoredValueStep.f23454e.f15142b);
            qVar.mo51954p(purchaseStoredValueStep.f23455f);
            PurchaseStoredValueAmount purchaseStoredValueAmount = purchaseStoredValueStep.f23456g;
            PurchaseStoredValueAmount.C7723b bVar = PurchaseStoredValueAmount.f23429f;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(purchaseStoredValueAmount, qVar);
            PurchaseVerificationType.CODER.write(purchaseStoredValueStep.f23457h, qVar);
            qVar.mo51955t(purchaseStoredValueStep.f23458i);
        }
    }

    public PurchaseStoredValueStep(String str, String str2, ServerId serverId, String str3, PurchaseStoredValueAmount purchaseStoredValueAmount, PurchaseVerificationType purchaseVerificationType, String str4) {
        super(str, str2, (String) null);
        this.f23454e = serverId;
        C21100e.m49373x(str3, "agencyKey");
        this.f23455f = str3;
        C21100e.m49373x(purchaseStoredValueAmount, "storedValueAmount");
        this.f23456g = purchaseStoredValueAmount;
        C21100e.m49373x(purchaseVerificationType, "verificationType");
        this.f23457h = purchaseVerificationType;
        this.f23458i = str4;
    }

    /* renamed from: b */
    public final void mo24015b(PurchaseStep.C7645a aVar, String str) {
        PurchaseTicketActivity purchaseTicketActivity = (PurchaseTicketActivity) aVar;
        purchaseTicketActivity.getClass();
        int i = C12640b.f31237s;
        Bundle b = C25541a.m63872b("stepId", str);
        C12640b bVar = new C12640b();
        bVar.setArguments(b);
        purchaseTicketActivity.mo24030y2(bVar);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23453j);
    }
}
