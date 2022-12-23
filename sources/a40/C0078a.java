package a40;

import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.micromobility.action.MicroMobilityAction;
import com.moovit.micromobility.ride.MicroMobilityRideMetric;
import com.moovit.micromobility.ride.MicroMobilityVehicleCondition;
import com.moovit.transit.LocationDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p583jk.C17884p;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19617r;
import p810sz.C19619s;
import p977zz.C20975x0;

/* renamed from: a40.a */
public final class C0078a {

    /* renamed from: o */
    public static final C0079a f195o = new C0079a();

    /* renamed from: a */
    public final Image f196a;

    /* renamed from: b */
    public final Image f197b;

    /* renamed from: c */
    public final LocationDescriptor f198c;

    /* renamed from: d */
    public final LocationDescriptor f199d;

    /* renamed from: e */
    public final long f200e;

    /* renamed from: f */
    public final long f201f;

    /* renamed from: g */
    public final long f202g;

    /* renamed from: h */
    public final long f203h;

    /* renamed from: i */
    public final String f204i;

    /* renamed from: j */
    public final String f205j;

    /* renamed from: k */
    public final int f206k;

    /* renamed from: l */
    public final MicroMobilityVehicleCondition f207l;

    /* renamed from: m */
    public final List<MicroMobilityRideMetric> f208m;

    /* renamed from: n */
    public final List<MicroMobilityAction> f209n;

    /* renamed from: a40.a$a */
    public class C0079a extends C19619s<C0078a> {
        public C0079a() {
            super(0, C0078a.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19615p pVar2 = pVar;
            C19617r rVar = C16019d.m40803a().f41718d;
            pVar.getClass();
            LocationDescriptor.C7795c cVar = LocationDescriptor.f23646m;
            return new C0078a((Image) rVar.read(pVar2), (Image) C16019d.m40803a().f41718d.read(pVar2), (LocationDescriptor) cVar.read(pVar2), (LocationDescriptor) pVar2.mo51962q(cVar), pVar.mo51925m(), pVar.mo51925m(), pVar.mo51925m(), pVar.mo51925m(), pVar.mo51948t(), pVar.mo51948t(), pVar.mo51924l(), (MicroMobilityVehicleCondition) pVar2.mo51962q(MicroMobilityVehicleCondition.f14999g), pVar2.mo51958f(MicroMobilityRideMetric.f14994f), pVar2.mo51958f(MicroMobilityAction.f14843f));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            C0078a aVar = (C0078a) obj;
            Image image = aVar.f196a;
            C19617r rVar = C16019d.m40803a().f41718d;
            qVar.getClass();
            rVar.write(image, qVar);
            C16019d.m40803a().f41718d.write(aVar.f197b, qVar);
            LocationDescriptor locationDescriptor = aVar.f198c;
            LocationDescriptor.C7794b bVar = LocationDescriptor.f23645l;
            qVar.mo51939l(3);
            bVar.mo19622a(locationDescriptor, qVar);
            qVar.mo51967q(aVar.f199d, bVar);
            qVar.mo51940m(aVar.f200e);
            qVar.mo51940m(aVar.f201f);
            qVar.mo51940m(aVar.f202g);
            qVar.mo51940m(aVar.f203h);
            qVar.mo51955t(aVar.f204i);
            qVar.mo51955t(aVar.f205j);
            qVar.mo51939l(aVar.f206k);
            qVar.mo51967q(aVar.f207l, MicroMobilityVehicleCondition.f14999g);
            qVar.mo51964g(aVar.f208m, MicroMobilityRideMetric.f14994f);
            qVar.mo51964g(aVar.f209n, MicroMobilityAction.f14843f);
        }
    }

    public C0078a(Image image, Image image2, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, long j, long j2, long j3, long j4, String str, String str2, int i, MicroMobilityVehicleCondition microMobilityVehicleCondition, ArrayList arrayList, ArrayList arrayList2) {
        C21100e.m49373x(image, "image");
        this.f196a = image;
        C21100e.m49373x(image2, "mapImage");
        this.f197b = image2;
        C21100e.m49373x(locationDescriptor, "pickupLocation");
        this.f198c = locationDescriptor;
        this.f199d = locationDescriptor2;
        this.f200e = j;
        this.f201f = j2;
        this.f202g = j3;
        this.f203h = j4;
        this.f204i = str;
        this.f205j = str2;
        this.f206k = i;
        this.f207l = microMobilityVehicleCondition;
        this.f208m = arrayList;
        this.f209n = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0078a)) {
            return false;
        }
        C0078a aVar = (C0078a) obj;
        if (!C20975x0.m49118e(this.f196a, aVar.f196a) || !C20975x0.m49118e(this.f197b, aVar.f197b) || !C20975x0.m49118e(this.f198c, aVar.f198c) || !C20975x0.m49118e(this.f199d, aVar.f199d) || this.f200e != aVar.f200e || this.f201f != aVar.f201f || this.f202g != aVar.f202g || this.f203h != aVar.f203h || !C20975x0.m49118e(this.f204i, aVar.f204i) || !C20975x0.m49118e(this.f205j, aVar.f205j) || this.f206k != aVar.f206k || !C20975x0.m49118e(this.f207l, aVar.f207l) || !C20975x0.m49118e(this.f208m, aVar.f208m) || !C20975x0.m49118e(this.f209n, aVar.f209n)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f196a), C17884p.m44335F(this.f197b), C17884p.m44335F(this.f198c), C17884p.m44335F(this.f199d), C17884p.m44334E(this.f200e), C17884p.m44334E(this.f201f), C17884p.m44334E(this.f202g), C17884p.m44334E(this.f203h), C17884p.m44335F(this.f204i), C17884p.m44335F(this.f205j), this.f206k, C17884p.m44335F(this.f207l), C17884p.m44335F(this.f208m), C17884p.m44335F(this.f209n));
    }
}
