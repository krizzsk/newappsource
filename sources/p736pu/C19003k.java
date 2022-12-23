package p736pu;

import android.util.SparseArray;
import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.app.mot.purchase.model.MotQrCodeLinePrediction;
import com.moovit.app.mot.purchase.model.MotQrCodeScanResult;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBEstimatedLine;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBGetActivationPriceResponseV2;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBRegion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.thrift.TBase;
import p009a8.C0112l;
import p028ba.C1513g;
import p054d0.C4303q;

/* renamed from: pu.k */
public final class C19003k extends C13780t<C19002j, C19003k, MVPTBGetActivationPriceResponseV2> {

    /* renamed from: m */
    public MotQrCodeScanResult f48354m;

    public C19003k() {
        super(MVPTBGetActivationPriceResponseV2.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        SparseArray sparseArray;
        ServerId serverId;
        MotQrCodeLinePrediction motQrCodeLinePrediction;
        C19002j jVar = (C19002j) aVar;
        MVPTBGetActivationPriceResponseV2 mVPTBGetActivationPriceResponseV2 = (MVPTBGetActivationPriceResponseV2) tBase;
        List<MVPTBRegion> list = mVPTBGetActivationPriceResponseV2.regions;
        C0112l lVar = new C0112l(3);
        C4303q qVar = new C4303q(4);
        if (list == null) {
            sparseArray = new SparseArray(0);
        } else {
            SparseArray sparseArray2 = new SparseArray(list.size());
            for (T next : list) {
                sparseArray2.put(((Integer) lVar.convert(next)).intValue(), qVar.convert(next));
            }
            sparseArray = sparseArray2;
        }
        String str = mVPTBGetActivationPriceResponseV2.context;
        if (mVPTBGetActivationPriceResponseV2.mo30995f()) {
            serverId = new ServerId(mVPTBGetActivationPriceResponseV2.agencyId);
        } else {
            serverId = null;
        }
        long j = jVar.f48352x;
        LatLonE6 latLonE6 = jVar.f48353y;
        ArrayList<O> c = C13720d.m34273c(mVPTBGetActivationPriceResponseV2.fares, (C13722f) null, new C1513g(sparseArray, 1));
        if (mVPTBGetActivationPriceResponseV2.mo30997h()) {
            MVPTBEstimatedLine mVPTBEstimatedLine = mVPTBGetActivationPriceResponseV2.estimatedLine;
            motQrCodeLinePrediction = new MotQrCodeLinePrediction(new ServerId(mVPTBEstimatedLine.lineGroupId), new ServerId(mVPTBEstimatedLine.lineId), mVPTBEstimatedLine.confidenceLevel);
        } else {
            motQrCodeLinePrediction = null;
        }
        this.f48354m = new MotQrCodeScanResult(str, serverId, j, latLonE6, c, motQrCodeLinePrediction);
    }
}
