package com.moovit.ticketing.purchase.filter;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.ticket.TicketAgency;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PurchaseFilterSelectionStep extends PurchaseStep {
    public static final Parcelable.Creator<PurchaseFilterSelectionStep> CREATOR = new C7682a();

    /* renamed from: l */
    public static final C7683b f23349l = new C7683b(PurchaseFilterSelectionStep.class);

    /* renamed from: e */
    public final Image f23350e;

    /* renamed from: f */
    public final String f23351f;

    /* renamed from: g */
    public final String f23352g;

    /* renamed from: h */
    public final String f23353h;

    /* renamed from: i */
    public final FilterPresentationType f23354i;

    /* renamed from: j */
    public final List<PurchaseFilter> f23355j;

    /* renamed from: k */
    public final TicketAgency f23356k;

    public enum FilterPresentationType {
        INDICATORS,
        CARDS;
        
        public static final C19577c<FilterPresentationType> CODER = null;

        /* access modifiers changed from: public */
        static {
            FilterPresentationType filterPresentationType;
            FilterPresentationType filterPresentationType2;
            CODER = new C19577c<>(FilterPresentationType.class, filterPresentationType, filterPresentationType2);
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStep$a */
    public class C7682a implements Parcelable.Creator<PurchaseFilterSelectionStep> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseFilterSelectionStep) C19612n.m46981v(parcel, PurchaseFilterSelectionStep.f23349l);
        }

        public final Object[] newArray(int i) {
            return new PurchaseFilterSelectionStep[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStep$b */
    public class C7683b extends C19619s<PurchaseFilterSelectionStep> {
        public C7683b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            String str;
            Image image;
            String str2;
            String p = pVar.mo51947p();
            String p2 = pVar.mo51947p();
            String t = pVar.mo51948t();
            String p3 = pVar.mo51947p();
            FilterPresentationType filterPresentationType = (FilterPresentationType) C13555b.m33968g(FilterPresentationType.CODER, pVar);
            ArrayList g = pVar.mo51959g(PurchaseFilter.f23338g);
            TicketAgency ticketAgency = (TicketAgency) pVar.mo51962q(TicketAgency.f23494g);
            if (i >= 1) {
                str = pVar.mo51948t();
            } else {
                str = null;
            }
            if (i >= 1) {
                image = (Image) pVar.mo51962q(C16019d.m40803a().f41718d);
            } else {
                image = null;
            }
            if (i >= 1) {
                str2 = pVar.mo51948t();
            } else {
                str2 = null;
            }
            return new PurchaseFilterSelectionStep(p, p2, t, str, image, str2, p3, filterPresentationType, g, ticketAgency);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseFilterSelectionStep purchaseFilterSelectionStep = (PurchaseFilterSelectionStep) obj;
            qVar.mo51954p(purchaseFilterSelectionStep.f23246b);
            qVar.mo51954p(purchaseFilterSelectionStep.f23247c);
            qVar.mo51955t(purchaseFilterSelectionStep.f23248d);
            qVar.mo51954p(purchaseFilterSelectionStep.f23353h);
            FilterPresentationType.CODER.write(purchaseFilterSelectionStep.f23354i, qVar);
            qVar.mo51965h(purchaseFilterSelectionStep.f23355j, PurchaseFilter.f23338g);
            qVar.mo51967q(purchaseFilterSelectionStep.f23356k, TicketAgency.f23494g);
            qVar.mo51955t(purchaseFilterSelectionStep.f23351f);
            qVar.mo51967q(purchaseFilterSelectionStep.f23350e, C16019d.m40803a().f41718d);
            qVar.mo51955t(purchaseFilterSelectionStep.f23352g);
        }
    }

    public PurchaseFilterSelectionStep(String str, String str2, String str3, String str4, Image image, String str5, String str6, FilterPresentationType filterPresentationType, ArrayList arrayList, TicketAgency ticketAgency) {
        super(str, str2, str3);
        this.f23351f = str4;
        this.f23350e = image;
        this.f23352g = str5;
        C21100e.m49373x(str6, "type");
        this.f23353h = str6;
        C21100e.m49373x(filterPresentationType, "presentationType");
        this.f23354i = filterPresentationType;
        C21100e.m49373x(arrayList, "filters");
        this.f23355j = arrayList;
        this.f23356k = ticketAgency;
    }

    /* renamed from: b */
    public final void mo24015b(PurchaseStep.C7645a aVar, String str) {
        PurchaseTicketActivity purchaseTicketActivity = (PurchaseTicketActivity) aVar;
        purchaseTicketActivity.getClass();
        int i = C7688a.f23363q;
        Bundle b = C25541a.m63872b("stepId", str);
        C7688a aVar2 = new C7688a();
        aVar2.setArguments(b);
        purchaseTicketActivity.mo24030y2(aVar2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23349l);
    }
}
