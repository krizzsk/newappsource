package t30;

import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.moovit.image.model.UriImage;
import com.moovit.micromobility.MicroMobilityIntegrationItem;
import com.moovit.micromobility.nearby.MicroMobilityItemInfo;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
import com.tranzmate.moovit.protocol.micromobility.MVImageOption;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityItemInfo;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityItemInfoResponse;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.thrift.TBase;
import p543hq.C17478e;
import p828tt.C19759a;
import p875vs.C20228e;

/* renamed from: t30.i */
public final class C6568i extends C13780t<C6567h, C6568i, MVMicroMobilityItemInfoResponse> {

    /* renamed from: m */
    public MicroMobilityItemInfo f20382m;

    public C6568i() {
        super(MVMicroMobilityItemInfoResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        Image image;
        ArrayList<O> arrayList;
        AppDeepLink appDeepLink;
        boolean z;
        Image image2;
        C6567h hVar = (C6567h) aVar;
        MVMicroMobilityItemInfo mVMicroMobilityItemInfo = ((MVMicroMobilityItemInfoResponse) tBase).item;
        ServerId serverId = new ServerId(mVMicroMobilityItemInfo.typeId);
        String str = mVMicroMobilityItemInfo.typeName;
        if (mVMicroMobilityItemInfo.mo28711i()) {
            MVImageOption mVImageOption = mVMicroMobilityItemInfo.itemImage;
            F f = mVImageOption.setField_;
            F f2 = MVImageOption._Fields.IMAGE;
            boolean z2 = true;
            if (f == f2) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                F f3 = MVImageOption._Fields.REMOTE_IMAGE_URL;
                if (f != f3) {
                    z2 = false;
                }
                if (!z2) {
                    throw new BadResponseException("Unsupported MVImageOption: " + mVImageOption);
                } else if (f == f3) {
                    image2 = UriImage.m40912c((String) mVImageOption.value_, new String[0]);
                } else {
                    StringBuilder k = C13555b.m33972k("Cannot get field 'remoteImageUrl' because union is currently set to ");
                    k.append(MVImageOption.m22551k((MVImageOption._Fields) mVImageOption.setField_).f63355a);
                    throw new RuntimeException(k.toString());
                }
            } else if (f == f2) {
                image2 = C16028g.m40829g((MVImageReferenceWithParams) mVImageOption.value_);
            } else {
                StringBuilder k2 = C13555b.m33972k("Cannot get field 'image' because union is currently set to ");
                k2.append(MVImageOption.m22551k((MVImageOption._Fields) mVImageOption.setField_).f63355a);
                throw new RuntimeException(k2.toString());
            }
            image = image2;
        } else {
            image = null;
        }
        String str2 = mVMicroMobilityItemInfo.itemTitle;
        String str3 = mVMicroMobilityItemInfo.itemSubtitle;
        String str4 = mVMicroMobilityItemInfo.serviceName;
        if (mVMicroMobilityItemInfo.mo28716o()) {
            ArrayList<O> c = C13720d.m34273c(mVMicroMobilityItemInfo.primaryMetaData, (C13722f) null, new C17478e(14));
            C13717b.m34261h(c);
            arrayList = c;
        } else {
            arrayList = null;
        }
        if (mVMicroMobilityItemInfo.mo28707f()) {
            appDeepLink = C13749c.m34315a(mVMicroMobilityItemInfo.deepLinks);
        } else {
            appDeepLink = null;
        }
        MicroMobilityIntegrationItem microMobilityIntegrationItem = new MicroMobilityIntegrationItem(mVMicroMobilityItemInfo.serviceId, mVMicroMobilityItemInfo.itemId, C13720d.m34273c(mVMicroMobilityItemInfo.flows, (C13722f) null, new C19759a(14)), appDeepLink);
        ArrayList<O> c2 = C13720d.m34273c(mVMicroMobilityItemInfo.secondaryMetaData, (C13722f) null, new C20228e(17));
        C13717b.m34261h(c2);
        this.f20382m = new MicroMobilityItemInfo(serverId, str, C13749c.m34322h(mVMicroMobilityItemInfo.location), C16028g.m40829g(mVMicroMobilityItemInfo.mapImage), image, str2, str3, str4, arrayList, microMobilityIntegrationItem, c2);
    }
}
