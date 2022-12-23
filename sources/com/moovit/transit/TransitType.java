package com.moovit.transit;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import c70.C13749c;
import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import j40.C5384a;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p824tp.C19739q;

public class TransitType implements Parcelable, C5384a {
    public static final Parcelable.Creator<TransitType> CREATOR = new C7836a();

    /* renamed from: g */
    public static C7837b f23756g = new C7837b(TransitType.class);

    /* renamed from: b */
    public final ServerId f23757b;

    /* renamed from: c */
    public final int f23758c;

    /* renamed from: d */
    public final Image f23759d;

    /* renamed from: e */
    public final VehicleType f23760e;

    /* renamed from: f */
    public final ViewType f23761f;

    public enum VehicleType implements Parcelable {
        TRAM(C19739q.ic_transit_type_tram_16_on_surface, C19739q.ic_transit_type_tram_24_on_surface),
        SUBWAY(C19739q.ic_transit_type_subway_16_on_surface, C19739q.ic_transit_type_subway_24_on_surface),
        TRAIN(C19739q.ic_transit_type_rail_16_on_surface, C19739q.ic_transit_type_rail_24_on_surface),
        BUS(C19739q.ic_transit_type_bus_16_on_surface, C19739q.ic_transit_type_bus_24_on_surface),
        FERRY(C19739q.ic_transit_type_ferry_16_on_surface, C19739q.ic_transit_type_ferry_24_on_surface),
        CABLE(r9, r9),
        GONDOLA(r11, r11),
        FUNICULAR(C19739q.ic_transit_type_funicular_16_on_surface, C19739q.ic_transit_type_funicular_24_on_surface);
        
        public static C19577c<VehicleType> CODER;
        public static final Parcelable.Creator<VehicleType> CREATOR = null;
        public final int iconResId;
        public final int smallIconResId;

        /* renamed from: com.moovit.transit.TransitType$VehicleType$a */
        public class C7835a implements Parcelable.Creator<VehicleType> {
            public final Object createFromParcel(Parcel parcel) {
                return (VehicleType) C19612n.m46981v(parcel, VehicleType.CODER);
            }

            public final Object[] newArray(int i) {
                return new VehicleType[i];
            }
        }

        /* access modifiers changed from: public */
        static {
            VehicleType vehicleType;
            VehicleType vehicleType2;
            VehicleType vehicleType3;
            VehicleType vehicleType4;
            VehicleType vehicleType5;
            VehicleType vehicleType6;
            VehicleType vehicleType7;
            VehicleType vehicleType8;
            CREATOR = new C7835a();
            CODER = new C19577c<>(VehicleType.class, vehicleType, vehicleType2, vehicleType3, vehicleType4, vehicleType5, vehicleType6, vehicleType7, vehicleType8);
        }

        private VehicleType(int i, int i2) {
            this.smallIconResId = i;
            this.iconResId = i2;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, CODER);
        }
    }

    public enum ViewType {
        DEFAULT,
        TRIPS,
        PLATFORMS;
        
        public static C19577c<ViewType> CODER;

        /* access modifiers changed from: public */
        static {
            ViewType viewType;
            ViewType viewType2;
            ViewType viewType3;
            CODER = new C19577c<>(ViewType.class, viewType, viewType2, viewType3);
        }
    }

    /* renamed from: com.moovit.transit.TransitType$a */
    public class C7836a implements Parcelable.Creator<TransitType> {
        public final Object createFromParcel(Parcel parcel) {
            return (TransitType) C19612n.m46981v(parcel, TransitType.f23756g);
        }

        public final Object[] newArray(int i) {
            return new TransitType[i];
        }
    }

    /* renamed from: com.moovit.transit.TransitType$b */
    public class C7837b extends C19619s<TransitType> {
        public C7837b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 1 || i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            ViewType viewType;
            if (i == 1) {
                pVar.getClass();
                return new TransitType(new ServerId(pVar.mo51924l()), C13749c.f33838a.mo53030d(Integer.valueOf(pVar.mo51924l())), (Image) C16019d.m40803a().f41718d.read(pVar), (VehicleType) C13555b.m33968g(VehicleType.CODER, pVar), (ViewType) C13555b.m33968g(ViewType.CODER, pVar));
            }
            pVar.getClass();
            int l = pVar.mo51924l();
            ServerId serverId = new ServerId(l);
            int d = C13749c.f33838a.mo53030d(Integer.valueOf(pVar.mo51924l()));
            Image image = (Image) C16019d.m40803a().f41718d.read(pVar);
            VehicleType vehicleType = VehicleType.BUS;
            if (l == 0) {
                vehicleType = VehicleType.TRAM;
            } else if (l == 1) {
                vehicleType = VehicleType.SUBWAY;
            } else if (l == 2) {
                vehicleType = VehicleType.TRAIN;
            } else if (l == 4) {
                vehicleType = VehicleType.FERRY;
            } else if (l == 5) {
                vehicleType = VehicleType.CABLE;
            } else if (l == 6) {
                vehicleType = VehicleType.GONDOLA;
            } else if (l == 7) {
                vehicleType = VehicleType.FUNICULAR;
            }
            VehicleType vehicleType2 = vehicleType;
            int i2 = C7838c.f23762a[vehicleType2.ordinal()];
            if (i2 == 1) {
                viewType = ViewType.TRIPS;
            } else if (i2 != 2) {
                viewType = ViewType.DEFAULT;
            } else {
                viewType = ViewType.PLATFORMS;
            }
            return new TransitType(serverId, d, image, vehicleType2, viewType);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TransitType transitType = (TransitType) obj;
            ServerId serverId = transitType.f23757b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51939l(C13749c.f33838a.mo53029c(transitType.f23758c).intValue());
            C16019d.m40803a().f41718d.write(transitType.f23759d, qVar);
            VehicleType.CODER.write(transitType.f23760e, qVar);
            ViewType.CODER.write(transitType.f23761f, qVar);
        }
    }

    /* renamed from: com.moovit.transit.TransitType$c */
    public static /* synthetic */ class C7838c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23762a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.moovit.transit.TransitType$VehicleType[] r0 = com.moovit.transit.TransitType.VehicleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23762a = r0
                com.moovit.transit.TransitType$VehicleType r1 = com.moovit.transit.TransitType.VehicleType.TRAIN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23762a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.transit.TransitType$VehicleType r1 = com.moovit.transit.TransitType.VehicleType.SUBWAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.transit.TransitType.C7838c.<clinit>():void");
        }
    }

    public TransitType(ServerId serverId, int i, Image image, VehicleType vehicleType, ViewType viewType) {
        this.f23757b = serverId;
        this.f23758c = i;
        C21100e.m49373x(image, "icon");
        this.f23759d = image;
        C21100e.m49373x(vehicleType, "vehicleType");
        this.f23760e = vehicleType;
        C21100e.m49373x(viewType, "viewType");
        this.f23761f = viewType;
    }

    /* renamed from: b */
    public final String mo24433b(Context context) {
        return context.getString(this.f23758c);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TransitType)) {
            return false;
        }
        return this.f23757b.equals(((TransitType) obj).f23757b);
    }

    public final ServerId getServerId() {
        return this.f23757b;
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f23757b);
    }

    public final String toString() {
        return this.f23760e + " (id=" + this.f23757b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23756g);
    }
}
