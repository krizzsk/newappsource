package com.moovit.micromobility.purchase.step.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.util.ColorScheme;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MicroMobilityRideDisclaimer implements Parcelable {
    public static final Parcelable.Creator<MicroMobilityRideDisclaimer> CREATOR = new C4164a();

    /* renamed from: f */
    public static final C4165b f14933f = new C4165b(MicroMobilityRideDisclaimer.class);

    /* renamed from: b */
    public final Image f14934b;

    /* renamed from: c */
    public final String f14935c;

    /* renamed from: d */
    public final String f14936d;

    /* renamed from: e */
    public final ColorScheme f14937e;

    /* renamed from: com.moovit.micromobility.purchase.step.confirmation.MicroMobilityRideDisclaimer$a */
    public class C4164a implements Parcelable.Creator<MicroMobilityRideDisclaimer> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityRideDisclaimer) C19612n.m46981v(parcel, MicroMobilityRideDisclaimer.f14933f);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityRideDisclaimer[i];
        }
    }

    /* renamed from: com.moovit.micromobility.purchase.step.confirmation.MicroMobilityRideDisclaimer$b */
    public class C4165b extends C19619s<MicroMobilityRideDisclaimer> {
        public C4165b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityRideDisclaimer((Image) pVar.mo51962q(C16019d.m40803a().f41718d), (ColorScheme) C13555b.m33968g(ColorScheme.CODER, pVar), pVar.mo51948t(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MicroMobilityRideDisclaimer microMobilityRideDisclaimer = (MicroMobilityRideDisclaimer) obj;
            qVar.mo51967q(microMobilityRideDisclaimer.f14934b, C16019d.m40803a().f41718d);
            qVar.mo51955t(microMobilityRideDisclaimer.f14935c);
            qVar.mo51955t(microMobilityRideDisclaimer.f14936d);
            ColorScheme.CODER.write(microMobilityRideDisclaimer.f14937e, qVar);
        }
    }

    public MicroMobilityRideDisclaimer(Image image, ColorScheme colorScheme, String str, String str2) {
        this.f14934b = image;
        this.f14935c = str;
        this.f14936d = str2;
        C21100e.m49373x(colorScheme, "backgroundColor");
        this.f14937e = colorScheme;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14933f);
    }
}
