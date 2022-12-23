package p881vy;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.wondo.MVWondoRedeemRewardRequest;

/* renamed from: vy.g */
public final class C20253g extends C13778r<C20253g, C20254h, MVWondoRedeemRewardRequest> {

    /* renamed from: w */
    public final ServerId f51358w;

    /* renamed from: x */
    public final String f51359x;

    public C20253g(C13752e eVar, ServerId serverId, String str) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_wondo_redeem_rewards, C20254h.class);
        C21100e.m49373x(serverId, "rewardId");
        this.f51358w = serverId;
        this.f51359x = str;
        int i = serverId.f15142b;
        RO mVWondoRedeemRewardRequest = new MVWondoRedeemRewardRequest();
        mVWondoRedeemRewardRequest.rewardId = i;
        mVWondoRedeemRewardRequest.mo35738h();
        mVWondoRedeemRewardRequest.provider = str;
        this.f33922v = mVWondoRedeemRewardRequest;
    }
}
