package p736pu;

import c00.C13720d;
import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.app.mot.model.MotActivationPrice;
import com.moovit.app.mot.model.MotNearestStationInfo;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.image.C16028g;
import com.moovit.network.model.ServerId;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBFinishTrainEstimatedPrice;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBFinishTrainEstimatedPriceResponse;
import i30.C5268d;
import i30.C5269e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.apache.thrift.TBase;
import p638lr.C18262i;
import p712ou.C18830b;
import p988j$.util.Comparator$CC;

/* renamed from: pu.d */
public final class C18995d extends C13780t<C18992a, C18995d, MVPTBFinishTrainEstimatedPriceResponse> {

    /* renamed from: m */
    public C18830b f48340m;

    /* renamed from: n */
    public ArrayList f48341n;

    public C18995d() {
        super(MVPTBFinishTrainEstimatedPriceResponse.class);
    }

    /* renamed from: i */
    public final C5269e mo40708i(C13746a aVar, TBase tBase) {
        C18992a aVar2 = (C18992a) aVar;
        MVPTBFinishTrainEstimatedPriceResponse mVPTBFinishTrainEstimatedPriceResponse = (MVPTBFinishTrainEstimatedPriceResponse) tBase;
        if (mVPTBFinishTrainEstimatedPriceResponse.mo30976o()) {
            C5269e.C5270a aVar3 = new C5269e.C5270a();
            List<Integer> list = mVPTBFinishTrainEstimatedPriceResponse.mo30974m().stopIds;
            if (list != null) {
                aVar3.f17414a.addAll(list);
            }
            return aVar3.mo21074a();
        } else if (!mVPTBFinishTrainEstimatedPriceResponse.mo30975n()) {
            return null;
        } else {
            C5269e.C5270a aVar4 = new C5269e.C5270a();
            aVar4.mo21076c(mVPTBFinishTrainEstimatedPriceResponse.mo30973k().stopId);
            return aVar4.mo21074a();
        }
    }

    /* renamed from: p */
    public final void mo40712p(C13746a aVar, TBase tBase, C5268d dVar) throws IOException, BadResponseException, ServerException {
        C18830b bVar;
        boolean z;
        C18992a aVar2 = (C18992a) aVar;
        MVPTBFinishTrainEstimatedPriceResponse mVPTBFinishTrainEstimatedPriceResponse = (MVPTBFinishTrainEstimatedPriceResponse) tBase;
        ArrayList arrayList = null;
        if (mVPTBFinishTrainEstimatedPriceResponse.mo30975n()) {
            LatLonE6 O = aVar2.mo51490O();
            MVPTBFinishTrainEstimatedPrice k = mVPTBFinishTrainEstimatedPriceResponse.mo30973k();
            CurrencyAmount d = C13749c.m34318d(k.price);
            if (d != null) {
                CurrencyAmount d2 = C13749c.m34318d(k.fullPrice);
                if (d2 == null) {
                    d2 = d;
                }
                bVar = new C18830b(new MotActivationPrice(d, d2, Collections.emptyList()), new MotNearestStationInfo(dVar.mo21064c(new ServerId(k.stopId)), C16028g.m40829g(k.agencyImage)), O);
            } else {
                throw new BadResponseException("Price can not be null!");
            }
        } else {
            bVar = null;
        }
        this.f48340m = bVar;
        boolean z2 = false;
        if (mVPTBFinishTrainEstimatedPriceResponse.mo30976o() && mVPTBFinishTrainEstimatedPriceResponse.mo30974m().mo30981g() > 0) {
            List<Integer> f = mVPTBFinishTrainEstimatedPriceResponse.mo30974m().mo30980f();
            C18262i iVar = new C18262i(4);
            Objects.requireNonNull(dVar);
            arrayList = C13720d.m34272b(f, C13720d.m34271a(iVar, new C18993b(dVar, 0)));
        }
        this.f48341n = arrayList;
        if (arrayList != null) {
            Collections.sort(arrayList, Comparator$CC.comparing(new C18994c()));
        }
        if (this.f48340m == null) {
            z = true;
        } else {
            z = false;
        }
        if (this.f48341n == null) {
            z2 = true;
        }
        if (z == z2) {
            throw new BadResponseException("Only one of: motStationEstimatedPrice / stations must be set!");
        }
    }
}
