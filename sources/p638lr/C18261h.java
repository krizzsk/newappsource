package p638lr;

import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.carpool.CarpoolRideDetour;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.carpool.MVCarPoolDetourResponse;
import com.tranzmate.moovit.protocol.carpool.MVCarPoolRideDetour;
import com.tranzmate.moovit.protocol.carpool.MVCarPoolRideDetourDetails;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import vi0.C25111a;
import xi0.C25276a;

/* renamed from: lr.h */
public final class C18261h extends C13780t<C18260g, C18261h, MVCarPoolDetourResponse> {

    /* renamed from: m */
    public CarpoolRideDetour f46585m = null;

    public C18261h() {
        super(MVCarPoolDetourResponse.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        C18260g gVar = (C18260g) aVar;
        MVCarPoolRideDetour mVCarPoolRideDetour = ((MVCarPoolDetourResponse) tBase).detour;
        if (mVCarPoolRideDetour != null) {
            LocationDescriptor locationDescriptor = gVar.f46584x;
            MVCarPoolRideDetourDetails mVCarPoolRideDetourDetails = mVCarPoolRideDetour.detourDetails;
            CurrencyAmount c = C13749c.m34317c(mVCarPoolRideDetourDetails.additionalPrice);
            CurrencyAmount c2 = C13749c.m34317c(mVCarPoolRideDetourDetails.additionalFullPrice);
            int i = mVCarPoolRideDetourDetails.additionalDistanceMeters;
            int i2 = mVCarPoolRideDetourDetails.additionalTimeSeconds;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                mVCarPoolRideDetour.mo25202X0(new C25111a(new C25276a((OutputStream) byteArrayOutputStream)));
                this.f46585m = new CarpoolRideDetour(locationDescriptor, c, c2, i, i2, byteArrayOutputStream.toByteArray());
            } catch (TException e) {
                throw new ApplicationBugException((Exception) e);
            }
        }
    }
}
