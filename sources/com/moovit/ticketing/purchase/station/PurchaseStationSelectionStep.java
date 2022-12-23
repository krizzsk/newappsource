package com.moovit.ticketing.purchase.station;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.database.DbEntityRef;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.transit.TransitAgency;
import e90.C12618b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PurchaseStationSelectionStep extends PurchaseStep {
    public static final Parcelable.Creator<PurchaseStationSelectionStep> CREATOR = new C7718a();

    /* renamed from: h */
    public static final C7719b f23422h = new C7719b(PurchaseStationSelectionStep.class);

    /* renamed from: e */
    public final String f23423e;

    /* renamed from: f */
    public final List<PurchaseStation> f23424f;

    /* renamed from: g */
    public final DbEntityRef<TransitAgency> f23425g;

    /* renamed from: com.moovit.ticketing.purchase.station.PurchaseStationSelectionStep$a */
    public class C7718a implements Parcelable.Creator<PurchaseStationSelectionStep> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseStationSelectionStep) C19612n.m46981v(parcel, PurchaseStationSelectionStep.f23422h);
        }

        public final Object[] newArray(int i) {
            return new PurchaseStationSelectionStep[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.station.PurchaseStationSelectionStep$b */
    public class C7719b extends C19619s<PurchaseStationSelectionStep> {
        public C7719b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PurchaseStationSelectionStep(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51948t(), pVar.mo51947p(), pVar.mo51959g(PurchaseStation.f23418e), (DbEntityRef) pVar.mo51962q(DbEntityRef.AGENCY_REF_CODER));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseStationSelectionStep purchaseStationSelectionStep = (PurchaseStationSelectionStep) obj;
            qVar.mo51954p(purchaseStationSelectionStep.f23246b);
            qVar.mo51954p(purchaseStationSelectionStep.f23247c);
            qVar.mo51955t(purchaseStationSelectionStep.f23248d);
            qVar.mo51954p(purchaseStationSelectionStep.f23423e);
            qVar.mo51965h(purchaseStationSelectionStep.f23424f, PurchaseStation.f23418e);
            qVar.mo51967q(purchaseStationSelectionStep.f23425g, DbEntityRef.AGENCY_REF_CODER);
        }
    }

    public PurchaseStationSelectionStep(String str, String str2, String str3, String str4, ArrayList arrayList, DbEntityRef dbEntityRef) {
        super(str, str2, str3);
        C21100e.m49373x(str4, "type");
        this.f23423e = str4;
        C21100e.m49373x(arrayList, "stations");
        this.f23424f = arrayList;
        this.f23425g = dbEntityRef;
    }

    /* renamed from: b */
    public final void mo24015b(PurchaseStep.C7645a aVar, String str) {
        PurchaseTicketActivity purchaseTicketActivity = (PurchaseTicketActivity) aVar;
        purchaseTicketActivity.getClass();
        int i = C12618b.f31181w;
        Bundle b = C25541a.m63872b("stepId", str);
        C12618b bVar = new C12618b();
        bVar.setArguments(b);
        purchaseTicketActivity.mo24030y2(bVar);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23422h);
    }
}
