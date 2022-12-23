package com.moovit.ticketing.purchase.massabi;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.ticket.TicketAgency;
import java.io.IOException;
import java.util.List;
import l30.C5591t;
import p80.C12991b;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p853uu.C19996f;

public class PurchaseMasabiStep extends PurchaseStep {
    public static final Parcelable.Creator<PurchaseMasabiStep> CREATOR = new C7712a();

    /* renamed from: i */
    public static final C7713b f23411i = new C7713b(PurchaseMasabiStep.class);

    /* renamed from: e */
    public final TicketAgency f23412e;

    /* renamed from: f */
    public final List<String> f23413f;

    /* renamed from: g */
    public final int f23414g;

    /* renamed from: h */
    public final String f23415h;

    /* renamed from: com.moovit.ticketing.purchase.massabi.PurchaseMasabiStep$a */
    public class C7712a implements Parcelable.Creator<PurchaseMasabiStep> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseMasabiStep) C19612n.m46981v(parcel, PurchaseMasabiStep.f23411i);
        }

        public final Object[] newArray(int i) {
            return new PurchaseMasabiStep[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.massabi.PurchaseMasabiStep$b */
    public class C7713b extends C19619s<PurchaseMasabiStep> {
        public C7713b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PurchaseMasabiStep(pVar.mo51947p(), pVar.mo51947p(), (TicketAgency) TicketAgency.f23494g.read(pVar), pVar.mo51958f(C19584i.f49770b), pVar.mo51924l(), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseMasabiStep purchaseMasabiStep = (PurchaseMasabiStep) obj;
            qVar.mo51954p(purchaseMasabiStep.f23246b);
            qVar.mo51954p(purchaseMasabiStep.f23247c);
            TicketAgency ticketAgency = purchaseMasabiStep.f23412e;
            TicketAgency.C7744b bVar = TicketAgency.f23494g;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(ticketAgency, qVar);
            qVar.mo51964g(purchaseMasabiStep.f23413f, C19584i.f49770b);
            qVar.mo51939l(purchaseMasabiStep.f23414g);
            qVar.mo51954p(purchaseMasabiStep.f23415h);
        }
    }

    public PurchaseMasabiStep(String str, String str2, TicketAgency ticketAgency, List<String> list, int i, String str3) {
        super(str, str2, (String) null);
        C21100e.m49373x(ticketAgency, "agency");
        this.f23412e = ticketAgency;
        C21100e.m49373x(list, "selectionKeys");
        this.f23413f = list;
        this.f23414g = i;
        C21100e.m49373x(str3, "configuration");
        this.f23415h = str3;
    }

    /* renamed from: b */
    public final void mo24015b(PurchaseStep.C7645a aVar, String str) {
        PurchaseTicketActivity purchaseTicketActivity = (PurchaseTicketActivity) aVar;
        purchaseTicketActivity.f23251X.mo40059a((C12991b) purchaseTicketActivity.mo44537r1("TICKETING_CONFIGURATION"), new PurchaseMasabiStepResult(this)).addOnSuccessListener((Activity) purchaseTicketActivity, new C19996f(purchaseTicketActivity, 6)).addOnFailureListener((Activity) purchaseTicketActivity, (OnFailureListener) new C5591t(purchaseTicketActivity, 3));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23411i);
    }
}
