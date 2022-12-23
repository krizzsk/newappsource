package com.moovit.micromobility.purchase.step.filter;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.micromobility.MicroMobilityConfirmationInfo;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MicroMobilityPurchaseFilter implements Parcelable {
    public static final Parcelable.Creator<MicroMobilityPurchaseFilter> CREATOR = new C4171a();

    /* renamed from: g */
    public static final C4172b f14950g = new C4172b(MicroMobilityPurchaseFilter.class);

    /* renamed from: b */
    public final String f14951b;

    /* renamed from: c */
    public final Image f14952c;

    /* renamed from: d */
    public final String f14953d;

    /* renamed from: e */
    public final String f14954e;

    /* renamed from: f */
    public final MicroMobilityConfirmationInfo f14955f;

    /* renamed from: com.moovit.micromobility.purchase.step.filter.MicroMobilityPurchaseFilter$a */
    public class C4171a implements Parcelable.Creator<MicroMobilityPurchaseFilter> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityPurchaseFilter) C19612n.m46981v(parcel, MicroMobilityPurchaseFilter.f14950g);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityPurchaseFilter[i];
        }
    }

    /* renamed from: com.moovit.micromobility.purchase.step.filter.MicroMobilityPurchaseFilter$b */
    public class C4172b extends C19619s<MicroMobilityPurchaseFilter> {
        public C4172b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityPurchaseFilter(pVar.mo51947p(), (Image) pVar.mo51962q(C16019d.m40803a().f41718d), pVar.mo51948t(), pVar.mo51948t(), (MicroMobilityConfirmationInfo) pVar.mo51962q(MicroMobilityConfirmationInfo.f14805g));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MicroMobilityPurchaseFilter microMobilityPurchaseFilter = (MicroMobilityPurchaseFilter) obj;
            qVar.mo51954p(microMobilityPurchaseFilter.f14951b);
            qVar.mo51967q(microMobilityPurchaseFilter.f14952c, C16019d.m40803a().f41718d);
            qVar.mo51955t(microMobilityPurchaseFilter.f14953d);
            qVar.mo51955t(microMobilityPurchaseFilter.f14954e);
            qVar.mo51967q(microMobilityPurchaseFilter.f14955f, MicroMobilityConfirmationInfo.f14805g);
        }
    }

    public MicroMobilityPurchaseFilter(String str, Image image, String str2, String str3, MicroMobilityConfirmationInfo microMobilityConfirmationInfo) {
        C21100e.m49373x(str, "filterId");
        this.f14951b = str;
        this.f14952c = image;
        this.f14953d = str2;
        this.f14954e = str3;
        this.f14955f = microMobilityConfirmationInfo;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14950g);
    }
}
