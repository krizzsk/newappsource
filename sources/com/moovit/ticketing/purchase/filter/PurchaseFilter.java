package com.moovit.ticketing.purchase.filter;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PurchaseFilter implements Parcelable {
    public static final Parcelable.Creator<PurchaseFilter> CREATOR = new C7678a();

    /* renamed from: g */
    public static final C7679b f23338g = new C7679b(PurchaseFilter.class);

    /* renamed from: b */
    public final String f23339b;

    /* renamed from: c */
    public final Image f23340c;

    /* renamed from: d */
    public final String f23341d;

    /* renamed from: e */
    public final String f23342e;

    /* renamed from: f */
    public final PurchaseFilterConfirmation f23343f;

    /* renamed from: com.moovit.ticketing.purchase.filter.PurchaseFilter$a */
    public class C7678a implements Parcelable.Creator<PurchaseFilter> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseFilter) C19612n.m46981v(parcel, PurchaseFilter.f23338g);
        }

        public final Object[] newArray(int i) {
            return new PurchaseFilter[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.filter.PurchaseFilter$b */
    public class C7679b extends C19619s<PurchaseFilter> {
        public C7679b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PurchaseFilter(pVar.mo51947p(), (Image) pVar.mo51962q(C16019d.m40803a().f41718d), pVar.mo51948t(), pVar.mo51948t(), (PurchaseFilterConfirmation) pVar.mo51962q(PurchaseFilterConfirmation.f23344f));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseFilter purchaseFilter = (PurchaseFilter) obj;
            qVar.mo51954p(purchaseFilter.f23339b);
            qVar.mo51955t(purchaseFilter.f23341d);
            qVar.mo51955t(purchaseFilter.f23342e);
            qVar.mo51967q(purchaseFilter.f23340c, C16019d.m40803a().f41718d);
            qVar.mo51967q(purchaseFilter.f23343f, PurchaseFilterConfirmation.f23344f);
        }
    }

    public PurchaseFilter(String str, Image image, String str2, String str3, PurchaseFilterConfirmation purchaseFilterConfirmation) {
        C21100e.m49373x(str, "filterId");
        this.f23339b = str;
        this.f23340c = image;
        this.f23341d = str2;
        this.f23342e = str3;
        this.f23343f = purchaseFilterConfirmation;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23338g);
    }
}
