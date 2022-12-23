package com.moovit.micromobility.ride;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import x00.C20440a;

public class MicroMobilityRideMetric implements Parcelable {
    public static final Parcelable.Creator<MicroMobilityRideMetric> CREATOR = new C4189a();

    /* renamed from: f */
    public static final C4190b f14994f = new C4190b(MicroMobilityRideMetric.class);

    /* renamed from: b */
    public final Image f14995b;

    /* renamed from: c */
    public final String f14996c;

    /* renamed from: d */
    public final String f14997d;

    /* renamed from: e */
    public final C20440a f14998e;

    /* renamed from: com.moovit.micromobility.ride.MicroMobilityRideMetric$a */
    public class C4189a implements Parcelable.Creator<MicroMobilityRideMetric> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityRideMetric) C19612n.m46981v(parcel, MicroMobilityRideMetric.f14994f);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityRideMetric[i];
        }
    }

    /* renamed from: com.moovit.micromobility.ride.MicroMobilityRideMetric$b */
    public class C4190b extends C19619s<MicroMobilityRideMetric> {
        public C4190b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityRideMetric((Image) pVar.mo51962q(C16019d.m40803a().f41718d), pVar.mo51948t(), pVar.mo51948t(), (C20440a) pVar.mo51962q(C20440a.f51780d));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MicroMobilityRideMetric microMobilityRideMetric = (MicroMobilityRideMetric) obj;
            qVar.mo51967q(microMobilityRideMetric.f14995b, C16019d.m40803a().f41718d);
            qVar.mo51955t(microMobilityRideMetric.f14996c);
            qVar.mo51955t(microMobilityRideMetric.f14997d);
            qVar.mo51967q(microMobilityRideMetric.f14998e, C20440a.f51780d);
        }
    }

    public MicroMobilityRideMetric(Image image, String str, String str2, C20440a aVar) {
        this.f14995b = image;
        this.f14996c = str;
        this.f14997d = str2;
        this.f14998e = aVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14994f);
    }
}
