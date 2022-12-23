package com.moovit.ticketing.purchase.station;

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

public class PurchaseStation implements Parcelable {
    public static final Parcelable.Creator<PurchaseStation> CREATOR = new C7716a();

    /* renamed from: e */
    public static final C7717b f23418e = new C7717b(PurchaseStation.class);

    /* renamed from: b */
    public final String f23419b;

    /* renamed from: c */
    public final String f23420c;

    /* renamed from: d */
    public final Image f23421d;

    /* renamed from: com.moovit.ticketing.purchase.station.PurchaseStation$a */
    public class C7716a implements Parcelable.Creator<PurchaseStation> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseStation) C19612n.m46981v(parcel, PurchaseStation.f23418e);
        }

        public final Object[] newArray(int i) {
            return new PurchaseStation[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.station.PurchaseStation$b */
    public class C7717b extends C19619s<PurchaseStation> {
        public C7717b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PurchaseStation((Image) pVar.mo51962q(C16019d.m40803a().f41718d), pVar.mo51947p(), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseStation purchaseStation = (PurchaseStation) obj;
            qVar.mo51954p(purchaseStation.f23419b);
            qVar.mo51954p(purchaseStation.f23420c);
            qVar.mo51967q(purchaseStation.f23421d, C16019d.m40803a().f41718d);
        }
    }

    public PurchaseStation(Image image, String str, String str2) {
        C21100e.m49373x(str, "stationId");
        this.f23419b = str;
        C21100e.m49373x(str2, "name");
        this.f23420c = str2;
        this.f23421d = image;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23418e);
    }
}
