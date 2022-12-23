package com.moovit.micromobility.ride;

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

public class MicroMobilityVehicleCondition implements Parcelable {
    public static final Parcelable.Creator<MicroMobilityVehicleCondition> CREATOR = new C4191a();

    /* renamed from: g */
    public static final C4192b f14999g = new C4192b(MicroMobilityVehicleCondition.class);

    /* renamed from: b */
    public final Image f15000b;

    /* renamed from: c */
    public final String f15001c;

    /* renamed from: d */
    public final String f15002d;

    /* renamed from: e */
    public final String f15003e;

    /* renamed from: f */
    public final String f15004f;

    /* renamed from: com.moovit.micromobility.ride.MicroMobilityVehicleCondition$a */
    public class C4191a implements Parcelable.Creator<MicroMobilityVehicleCondition> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityVehicleCondition) C19612n.m46981v(parcel, MicroMobilityVehicleCondition.f14999g);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityVehicleCondition[i];
        }
    }

    /* renamed from: com.moovit.micromobility.ride.MicroMobilityVehicleCondition$b */
    public class C4192b extends C19619s<MicroMobilityVehicleCondition> {
        public C4192b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityVehicleCondition((Image) pVar.mo51962q(C16019d.m40803a().f41718d), pVar.mo51947p(), pVar.mo51948t(), pVar.mo51948t(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MicroMobilityVehicleCondition microMobilityVehicleCondition = (MicroMobilityVehicleCondition) obj;
            qVar.mo51967q(microMobilityVehicleCondition.f15000b, C16019d.m40803a().f41718d);
            qVar.mo51954p(microMobilityVehicleCondition.f15001c);
            qVar.mo51955t(microMobilityVehicleCondition.f15002d);
            qVar.mo51955t(microMobilityVehicleCondition.f15003e);
            qVar.mo51955t(microMobilityVehicleCondition.f15004f);
        }
    }

    public MicroMobilityVehicleCondition(Image image, String str, String str2, String str3, String str4) {
        this.f15000b = image;
        C21100e.m49373x(str, "primaryActionText");
        this.f15001c = str;
        this.f15002d = str2;
        this.f15003e = str3;
        this.f15004f = str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14999g);
    }
}
