package p552hz;

import ci0.C21211f;
import com.moovit.car.requests.CarDetails;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import p575iz.C17680a;
import p575iz.C17681b;
import p906wz.C20431c;
import p906wz.C20436g;

/* renamed from: hz.b */
public final class C17519b extends C21211f {

    /* renamed from: b */
    public final /* synthetic */ C17520c f45102b;

    public C17519b(C17520c cVar) {
        this.f45102b = cVar;
    }

    /* renamed from: c */
    public final boolean mo315c(C20431c cVar, ServerException serverException) {
        C17680a aVar = (C17680a) cVar;
        C17520c.m43641c2(this.f45102b, serverException);
        return true;
    }

    /* renamed from: d */
    public final boolean mo316d(C20431c cVar, IOException iOException) {
        C17680a aVar = (C17680a) cVar;
        C17520c.m43641c2(this.f45102b, iOException);
        return true;
    }

    /* renamed from: i */
    public final boolean mo319i(C20431c cVar, IOException iOException) {
        C17680a aVar = (C17680a) cVar;
        C17520c.m43641c2(this.f45102b, iOException);
        return true;
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        C17680a aVar = (C17680a) cVar;
        C17520c cVar2 = this.f45102b;
        CarDetails carDetails = ((C17681b) gVar).f45433m;
        cVar2.f45104u.f42486e = carDetails;
        cVar2.mo46752K1().putParcelable("extra_car_station_metadata", cVar2.f45104u);
        cVar2.mo49968d2(carDetails);
        cVar2.mo49972h2();
    }
}
