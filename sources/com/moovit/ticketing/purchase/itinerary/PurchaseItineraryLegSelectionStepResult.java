package com.moovit.ticketing.purchase.itinerary;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.ticketing.purchase.PurchaseStepResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PurchaseItineraryLegSelectionStepResult extends PurchaseStepResult {
    public static final Parcelable.Creator<PurchaseItineraryLegSelectionStepResult> CREATOR = new C7698a();

    /* renamed from: d */
    public static final C7699b f23389d = new C7699b(PurchaseItineraryLegSelectionStepResult.class);

    /* renamed from: c */
    public final List<String> f23390c;

    /* renamed from: com.moovit.ticketing.purchase.itinerary.PurchaseItineraryLegSelectionStepResult$a */
    public class C7698a implements Parcelable.Creator<PurchaseItineraryLegSelectionStepResult> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseItineraryLegSelectionStepResult) C19612n.m46981v(parcel, PurchaseItineraryLegSelectionStepResult.f23389d);
        }

        public final Object[] newArray(int i) {
            return new PurchaseItineraryLegSelectionStepResult[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.itinerary.PurchaseItineraryLegSelectionStepResult$b */
    public class C7699b extends C19619s<PurchaseItineraryLegSelectionStepResult> {
        public C7699b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            ArrayList arrayList;
            String p = pVar.mo51947p();
            int l = pVar.mo51924l();
            if (l == -1) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(l);
                for (int i2 = 0; i2 < l; i2++) {
                    arrayList2.add(pVar.mo51948t());
                }
                arrayList = arrayList2;
            }
            return new PurchaseItineraryLegSelectionStepResult(p, arrayList);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseItineraryLegSelectionStepResult purchaseItineraryLegSelectionStepResult = (PurchaseItineraryLegSelectionStepResult) obj;
            qVar.mo51954p(purchaseItineraryLegSelectionStepResult.f23249b);
            List<String> list = purchaseItineraryLegSelectionStepResult.f23390c;
            if (list == null) {
                qVar.mo51939l(-1);
                return;
            }
            qVar.mo51939l(list.size());
            for (String t : list) {
                qVar.mo51955t(t);
            }
        }
    }

    public PurchaseItineraryLegSelectionStepResult(String str, ArrayList arrayList) {
        super(str);
        C21100e.m49373x(arrayList, "legIds");
        this.f23390c = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: b */
    public final <R, E extends Exception> R mo24018b(PurchaseStepResult.C7646a<R, E> aVar) throws Exception {
        return aVar.mo24023h(this);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23389d);
    }
}
