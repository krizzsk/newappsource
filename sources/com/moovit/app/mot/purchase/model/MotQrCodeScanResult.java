package com.moovit.app.mot.purchase.model;

import android.os.Parcel;
import android.os.Parcelable;
import c00.C13723g;
import ce0.C21100e;
import com.moovit.app.mot.model.MotActivationRegionalFare;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p781ru.C19328a;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MotQrCodeScanResult implements Parcelable {
    public static final Parcelable.Creator<MotQrCodeScanResult> CREATOR = new C15167a();

    /* renamed from: h */
    public static final C15168b f39061h = new C15168b(MotQrCodeScanResult.class);

    /* renamed from: b */
    public final String f39062b;

    /* renamed from: c */
    public final ServerId f39063c;

    /* renamed from: d */
    public final long f39064d;

    /* renamed from: e */
    public final LatLonE6 f39065e;

    /* renamed from: f */
    public final List<MotActivationRegionalFare> f39066f;

    /* renamed from: g */
    public final MotQrCodeLinePrediction f39067g;

    /* renamed from: com.moovit.app.mot.purchase.model.MotQrCodeScanResult$a */
    public class C15167a implements Parcelable.Creator<MotQrCodeScanResult> {
        public final Object createFromParcel(Parcel parcel) {
            return (MotQrCodeScanResult) C19612n.m46981v(parcel, MotQrCodeScanResult.f39061h);
        }

        public final Object[] newArray(int i) {
            return new MotQrCodeScanResult[i];
        }
    }

    /* renamed from: com.moovit.app.mot.purchase.model.MotQrCodeScanResult$b */
    public class C15168b extends C19619s<MotQrCodeScanResult> {
        public C15168b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            ServerId serverId;
            String p = pVar.mo51947p();
            if (!pVar.mo51919b()) {
                serverId = null;
            } else {
                serverId = new ServerId(pVar.mo51924l());
            }
            return new MotQrCodeScanResult(p, serverId, pVar.mo51925m(), (LatLonE6) LatLonE6.f40979g.read(pVar), pVar.mo51959g(MotActivationRegionalFare.f39015f), (MotQrCodeLinePrediction) pVar.mo51962q(MotQrCodeLinePrediction.f39057e));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MotQrCodeScanResult motQrCodeScanResult = (MotQrCodeScanResult) obj;
            qVar.mo51954p(motQrCodeScanResult.f39062b);
            ServerId serverId = motQrCodeScanResult.f39063c;
            if (serverId == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51939l(serverId.f15142b);
            }
            qVar.mo51940m(motQrCodeScanResult.f39064d);
            LatLonE6.f40978f.write(motQrCodeScanResult.f39065e, qVar);
            qVar.mo51965h(motQrCodeScanResult.f39066f, MotActivationRegionalFare.f39015f);
            qVar.mo51967q(motQrCodeScanResult.f39067g, MotQrCodeLinePrediction.f39057e);
        }
    }

    public MotQrCodeScanResult(String str, ServerId serverId, long j, LatLonE6 latLonE6, ArrayList arrayList, MotQrCodeLinePrediction motQrCodeLinePrediction) {
        C21100e.m49373x(str, "activationContext");
        this.f39062b = str;
        this.f39063c = serverId;
        this.f39064d = j;
        C21100e.m49373x(latLonE6, "scanLocation");
        this.f39065e = latLonE6;
        C21100e.m49373x(arrayList, "activationFares");
        this.f39066f = Collections.unmodifiableList(arrayList);
        this.f39067g = motQrCodeLinePrediction;
    }

    /* renamed from: b */
    public final MotActivationRegionalFare mo45610b(float f) {
        MotActivationRegionalFare motActivationRegionalFare = (MotActivationRegionalFare) C13723g.m34286g(this.f39066f, new C19328a(f));
        if (motActivationRegionalFare != null) {
            return motActivationRegionalFare;
        }
        List<MotActivationRegionalFare> list = this.f39066f;
        return list.get(list.size() - 1);
    }

    /* renamed from: c */
    public final ServerId mo45611c() {
        MotQrCodeLinePrediction motQrCodeLinePrediction = this.f39067g;
        if (motQrCodeLinePrediction != null) {
            return motQrCodeLinePrediction.f39059c;
        }
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39061h);
    }
}
