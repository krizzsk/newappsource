package p881vy;

import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.app.wondo.tickets.model.WondoRewards;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.wondo.MVWondoCampaign;
import com.tranzmate.moovit.protocol.wondo.MVWondoCode;
import com.tranzmate.moovit.protocol.wondo.MVWondoCodesResponse;
import com.tranzmate.moovit.protocol.wondo.MVWondoOffer;
import com.tranzmate.moovit.protocol.wondo.MVWondoOffersExplanation;
import com.tranzmate.moovit.protocol.wondo.MVWondoReward;
import com.tranzmate.moovit.protocol.wondo.MVWondoRewards;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.thrift.TBase;
import p009a8.C0112l;
import p054d0.C4303q;
import p241s0.C6302b;
import p638lr.C18262i;
import p714ow.C18848b;
import p785ry.C19381a;
import p900wt.C20415e;
import p977zz.C20944i0;

/* renamed from: vy.b */
public final class C20248b extends C13780t<C20247a, C20248b, MVWondoCodesResponse> {

    /* renamed from: m */
    public C19381a f51353m;

    public C20248b() {
        super(MVWondoCodesResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        int i;
        int i2;
        int i3;
        String str;
        String str2;
        String str3;
        MVWondoCodesResponse mVWondoCodesResponse = (MVWondoCodesResponse) tBase;
        ServerId serverId = ((C20247a) aVar).f33829q.f33853b.f50160a.f32927c;
        List<MVWondoOffer> list = mVWondoCodesResponse.offers;
        C0112l lVar = new C0112l(7);
        List<MVWondoOffer> list2 = mVWondoCodesResponse.offers;
        int i4 = 0;
        if (list2 == null) {
            i = 0;
        } else {
            i = list2.size();
        }
        ArrayList arrayList = new ArrayList(i);
        C20944i0 i0Var = null;
        C13720d.m34276f(list, (C13722f) null, lVar, arrayList);
        List<MVWondoCode> list3 = mVWondoCodesResponse.codes;
        C4303q qVar = new C4303q(11);
        List<MVWondoCode> list4 = mVWondoCodesResponse.codes;
        if (list4 == null) {
            i2 = 0;
        } else {
            i2 = list4.size();
        }
        ArrayList arrayList2 = new ArrayList(i2);
        C13720d.m34276f(list3, (C13722f) null, qVar, arrayList2);
        MVWondoRewards mVWondoRewards = mVWondoCodesResponse.rewards;
        List<MVWondoReward> list5 = mVWondoRewards.rewards;
        C18262i iVar = new C18262i(12);
        List<MVWondoReward> list6 = mVWondoRewards.rewards;
        if (list6 == null) {
            i3 = 0;
        } else {
            i3 = list6.size();
        }
        ArrayList arrayList3 = new ArrayList(i3);
        C13720d.m34276f(list5, (C13722f) null, iVar, arrayList3);
        if (mVWondoRewards.mo35772f()) {
            str = mVWondoRewards.rewardLink;
        } else {
            str = null;
        }
        WondoRewards wondoRewards = new WondoRewards(arrayList3, str);
        List<MVWondoCampaign> list7 = mVWondoCodesResponse.campaigns;
        C20415e eVar = new C20415e(6);
        List<MVWondoCampaign> list8 = mVWondoCodesResponse.campaigns;
        if (list8 != null) {
            i4 = list8.size();
        }
        ArrayList arrayList4 = new ArrayList(i4);
        C13720d.m34276f(list7, (C13722f) null, eVar, arrayList4);
        C6302b a = C13717b.m34254a(arrayList4, new C18848b(1));
        if (mVWondoCodesResponse.mo35635i()) {
            MVWondoOffersExplanation mVWondoOffersExplanation = mVWondoCodesResponse.offersExplantion;
            if (mVWondoOffersExplanation.mo35718g()) {
                str2 = mVWondoOffersExplanation.title;
            } else {
                str2 = null;
            }
            if (mVWondoOffersExplanation.mo35717f()) {
                str3 = mVWondoOffersExplanation.subtitle;
            } else {
                str3 = null;
            }
            if (!(str2 == null && str3 == null)) {
                i0Var = new C20944i0(str2, str3);
            }
        }
        this.f51353m = new C19381a(serverId, arrayList, arrayList2, wondoRewards, a, i0Var);
    }
}
