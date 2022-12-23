package com.moovit.micromobility.damage;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appboy.models.outgoing.TwitterUser;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MicroMobilityDamageReport implements Parcelable {
    public static final Parcelable.Creator<MicroMobilityDamageReport> CREATOR = new C4144a();

    /* renamed from: d */
    public static final C4145b f14855d = new C4145b(MicroMobilityDamageReport.class);

    /* renamed from: b */
    public final String f14856b;

    /* renamed from: c */
    public final long f14857c;

    /* renamed from: com.moovit.micromobility.damage.MicroMobilityDamageReport$a */
    public class C4144a implements Parcelable.Creator<MicroMobilityDamageReport> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityDamageReport) C19612n.m46981v(parcel, MicroMobilityDamageReport.f14855d);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityDamageReport[i];
        }
    }

    /* renamed from: com.moovit.micromobility.damage.MicroMobilityDamageReport$b */
    public class C4145b extends C19619s<MicroMobilityDamageReport> {
        public C4145b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityDamageReport(pVar.mo51947p(), pVar.mo51925m());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MicroMobilityDamageReport microMobilityDamageReport = (MicroMobilityDamageReport) obj;
            qVar.mo51954p(microMobilityDamageReport.f14856b);
            qVar.mo51940m(microMobilityDamageReport.f14857c);
        }
    }

    public MicroMobilityDamageReport(String str, long j) {
        C21100e.m49373x(str, TwitterUser.DESCRIPTION_KEY);
        this.f14856b = str;
        this.f14857c = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14855d);
    }
}
