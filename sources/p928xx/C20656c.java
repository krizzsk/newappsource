package p928xx;

import c70.C13746a;
import c70.C13780t;
import com.moovit.app.useraccount.campaigns.onboarding.OnBoardingCampaignScreenInfo;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.image.model.UriImage;
import com.tranzmate.moovit.protocol.screen.MVEXOnBoardingScreenResponse;
import java.io.IOException;
import org.apache.thrift.TBase;
import p583jk.C17884p;

/* renamed from: xx.c */
public final class C20656c extends C13780t<C20655b, C20656c, MVEXOnBoardingScreenResponse> {

    /* renamed from: m */
    public OnBoardingCampaignScreenInfo f52227m;

    public C20656c() {
        super(MVEXOnBoardingScreenResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C20655b bVar = (C20655b) aVar;
        MVEXOnBoardingScreenResponse mVEXOnBoardingScreenResponse = (MVEXOnBoardingScreenResponse) tBase;
        try {
            this.f52227m = new OnBoardingCampaignScreenInfo(UriImage.m40912c(mVEXOnBoardingScreenResponse.image, new String[0]), mVEXOnBoardingScreenResponse.title, mVEXOnBoardingScreenResponse.descriptionText, C17884p.m44379s(mVEXOnBoardingScreenResponse.cta), C17884p.m44379s(mVEXOnBoardingScreenResponse.secondaryCta));
        } catch (Exception e) {
            throw new BadResponseException("Unable to decode wondo full screen.", e);
        }
    }
}
