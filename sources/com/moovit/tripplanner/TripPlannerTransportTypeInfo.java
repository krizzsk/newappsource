package com.moovit.tripplanner;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import java.io.IOException;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TripPlannerTransportTypeInfo implements Parcelable {
    public static final Parcelable.Creator<TripPlannerTransportTypeInfo> CREATOR = new C7861a();

    /* renamed from: e */
    public static final C7862b f23801e = new C7862b(TripPlannerTransportTypeInfo.class);

    /* renamed from: b */
    public final TripPlannerTransportType f23802b;

    /* renamed from: c */
    public final String f23803c;

    /* renamed from: d */
    public final Image f23804d;

    /* renamed from: com.moovit.tripplanner.TripPlannerTransportTypeInfo$a */
    public class C7861a implements Parcelable.Creator<TripPlannerTransportTypeInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return (TripPlannerTransportTypeInfo) C19612n.m46981v(parcel, TripPlannerTransportTypeInfo.f23801e);
        }

        public final Object[] newArray(int i) {
            return new TripPlannerTransportTypeInfo[i];
        }
    }

    /* renamed from: com.moovit.tripplanner.TripPlannerTransportTypeInfo$b */
    public class C7862b extends C19619s<TripPlannerTransportTypeInfo> {
        public C7862b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19577c<TripPlannerTransportType> cVar = TripPlannerTransportType.CODER;
            pVar.getClass();
            cVar.getClass();
            return new TripPlannerTransportTypeInfo(cVar.mo51916a(pVar.mo51926r()), pVar.mo51947p(), (Image) C16019d.m40803a().f41718d.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TripPlannerTransportTypeInfo tripPlannerTransportTypeInfo = (TripPlannerTransportTypeInfo) obj;
            TripPlannerTransportType tripPlannerTransportType = tripPlannerTransportTypeInfo.f23802b;
            C19577c<TripPlannerTransportType> cVar = TripPlannerTransportType.CODER;
            qVar.getClass();
            cVar.write(tripPlannerTransportType, qVar);
            qVar.mo51954p(tripPlannerTransportTypeInfo.f23803c);
            C16019d.m40803a().f41718d.write(tripPlannerTransportTypeInfo.f23804d, qVar);
        }
    }

    public TripPlannerTransportTypeInfo(TripPlannerTransportType tripPlannerTransportType, String str, Image image) {
        C21100e.m49373x(tripPlannerTransportType, "type");
        this.f23802b = tripPlannerTransportType;
        C21100e.m49373x(str, "name");
        this.f23803c = str;
        C21100e.m49373x(image, "icon");
        this.f23804d = image;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23801e);
    }
}
