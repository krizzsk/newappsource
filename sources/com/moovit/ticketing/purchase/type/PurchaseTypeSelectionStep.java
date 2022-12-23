package com.moovit.ticketing.purchase.type;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import g90.C12693a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PurchaseTypeSelectionStep extends PurchaseStep {
    public static final Parcelable.Creator<PurchaseTypeSelectionStep> CREATOR = new C7736a();

    /* renamed from: g */
    public static final C7737b f23464g = new C7737b(PurchaseTypeSelectionStep.class);

    /* renamed from: e */
    public final List<PurchaseType> f23465e;

    /* renamed from: f */
    public final String f23466f;

    /* renamed from: com.moovit.ticketing.purchase.type.PurchaseTypeSelectionStep$a */
    public class C7736a implements Parcelable.Creator<PurchaseTypeSelectionStep> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseTypeSelectionStep) C19612n.m46981v(parcel, PurchaseTypeSelectionStep.f23464g);
        }

        public final Object[] newArray(int i) {
            return new PurchaseTypeSelectionStep[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.type.PurchaseTypeSelectionStep$b */
    public class C7737b extends C19619s<PurchaseTypeSelectionStep> {
        public C7737b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PurchaseTypeSelectionStep(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51948t(), pVar.mo51947p(), pVar.mo51959g(PurchaseType.f23459f));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseTypeSelectionStep purchaseTypeSelectionStep = (PurchaseTypeSelectionStep) obj;
            qVar.mo51954p(purchaseTypeSelectionStep.f23246b);
            qVar.mo51954p(purchaseTypeSelectionStep.f23247c);
            qVar.mo51955t(purchaseTypeSelectionStep.f23248d);
            qVar.mo51965h(purchaseTypeSelectionStep.f23465e, PurchaseType.f23459f);
            qVar.mo51954p(purchaseTypeSelectionStep.f23466f);
        }
    }

    public PurchaseTypeSelectionStep(String str, String str2, String str3, String str4, ArrayList arrayList) {
        super(str, str2, str3);
        C21100e.m49373x(arrayList, "types");
        this.f23465e = arrayList;
        C21100e.m49373x(str4, "agencyKey");
        this.f23466f = str4;
    }

    /* renamed from: b */
    public final void mo24015b(PurchaseStep.C7645a aVar, String str) {
        PurchaseTicketActivity purchaseTicketActivity = (PurchaseTicketActivity) aVar;
        purchaseTicketActivity.getClass();
        int i = C12693a.f31345r;
        Bundle b = C25541a.m63872b("stepId", str);
        C12693a aVar2 = new C12693a();
        aVar2.setArguments(b);
        purchaseTicketActivity.mo24030y2(aVar2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23464g);
    }
}
