package com.moovit.ticketing.purchase.type;

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

public class PurchaseType implements Parcelable {
    public static final Parcelable.Creator<PurchaseType> CREATOR = new C7734a();

    /* renamed from: f */
    public static final C7735b f23459f = new C7735b(PurchaseType.class);

    /* renamed from: b */
    public final String f23460b;

    /* renamed from: c */
    public final Image f23461c;

    /* renamed from: d */
    public final String f23462d;

    /* renamed from: e */
    public final String f23463e;

    /* renamed from: com.moovit.ticketing.purchase.type.PurchaseType$a */
    public class C7734a implements Parcelable.Creator<PurchaseType> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseType) C19612n.m46981v(parcel, PurchaseType.f23459f);
        }

        public final Object[] newArray(int i) {
            return new PurchaseType[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.type.PurchaseType$b */
    public class C7735b extends C19619s<PurchaseType> {
        public C7735b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PurchaseType(pVar.mo51947p(), (Image) C16019d.m40803a().f41718d.read(pVar), pVar.mo51947p(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseType purchaseType = (PurchaseType) obj;
            qVar.mo51954p(purchaseType.f23460b);
            C16019d.m40803a().f41718d.write(purchaseType.f23461c, qVar);
            qVar.mo51954p(purchaseType.f23462d);
            qVar.mo51955t(purchaseType.f23463e);
        }
    }

    public PurchaseType(String str, Image image, String str2, String str3) {
        C21100e.m49373x(str, "typeId");
        this.f23460b = str;
        C21100e.m49373x(image, "image");
        this.f23461c = image;
        C21100e.m49373x(str2, "name");
        this.f23462d = str2;
        this.f23463e = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23459f);
    }
}
