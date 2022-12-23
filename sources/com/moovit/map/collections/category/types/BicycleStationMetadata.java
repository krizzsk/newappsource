package com.moovit.map.collections.category.types;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.transit.LocationDescriptor;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class BicycleStationMetadata implements Parcelable {
    public static final Parcelable.Creator<BicycleStationMetadata> CREATOR = new C16256a();

    /* renamed from: j */
    public static final C16257b f42471j = new C16257b();

    /* renamed from: k */
    public static final C16258c f42472k = new C16258c(BicycleStationMetadata.class);

    /* renamed from: b */
    public final int f42473b;

    /* renamed from: c */
    public final int f42474c;

    /* renamed from: d */
    public final LocationDescriptor f42475d;

    /* renamed from: e */
    public final long f42476e;

    /* renamed from: f */
    public final String f42477f;

    /* renamed from: g */
    public final Image f42478g;

    /* renamed from: h */
    public final String f42479h;

    /* renamed from: i */
    public final boolean f42480i;

    /* renamed from: com.moovit.map.collections.category.types.BicycleStationMetadata$a */
    public class C16256a implements Parcelable.Creator<BicycleStationMetadata> {
        public final Object createFromParcel(Parcel parcel) {
            return (BicycleStationMetadata) C19612n.m46981v(parcel, BicycleStationMetadata.f42472k);
        }

        public final Object[] newArray(int i) {
            return new BicycleStationMetadata[i];
        }
    }

    /* renamed from: com.moovit.map.collections.category.types.BicycleStationMetadata$b */
    public class C16257b extends C19621u<BicycleStationMetadata> {
        public C16257b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            BicycleStationMetadata bicycleStationMetadata = (BicycleStationMetadata) obj;
            qVar.mo51939l(bicycleStationMetadata.f42473b);
            qVar.mo51939l(bicycleStationMetadata.f42474c);
            qVar.mo51967q(bicycleStationMetadata.f42475d, LocationDescriptor.f23645l);
            qVar.mo51940m(bicycleStationMetadata.f42476e);
            qVar.mo51955t(bicycleStationMetadata.f42477f);
            qVar.mo51967q(bicycleStationMetadata.f42478g, C16019d.m40803a().f41718d);
            qVar.mo51934b(bicycleStationMetadata.f42480i);
            qVar.mo51955t(bicycleStationMetadata.f42479h);
        }
    }

    /* renamed from: com.moovit.map.collections.category.types.BicycleStationMetadata$c */
    public class C16258c extends C19620t<BicycleStationMetadata> {
        public C16258c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            String str;
            int l = pVar.mo51924l();
            int l2 = pVar.mo51924l();
            LocationDescriptor locationDescriptor = (LocationDescriptor) pVar.mo51962q(LocationDescriptor.f23646m);
            long m = pVar.mo51925m();
            String t = pVar.mo51948t();
            Image image = (Image) pVar.mo51962q(C16019d.m40803a().f41718d);
            boolean b = pVar.mo51919b();
            if (i >= 1) {
                str = pVar.mo51948t();
            } else {
                str = null;
            }
            return new BicycleStationMetadata(l, l2, locationDescriptor, m, t, image, str, b);
        }
    }

    public BicycleStationMetadata(int i, int i2, LocationDescriptor locationDescriptor, long j, String str, Image image, String str2, boolean z) {
        this.f42473b = i;
        this.f42474c = i2;
        C21100e.m49373x(locationDescriptor, "locationDescriptor");
        this.f42475d = locationDescriptor;
        this.f42476e = j;
        this.f42477f = str;
        this.f42478g = image;
        this.f42479h = str2;
        this.f42480i = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42471j);
    }
}
