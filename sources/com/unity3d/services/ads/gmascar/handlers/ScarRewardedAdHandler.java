package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import pc0.C13008c;

public class ScarRewardedAdHandler extends ScarAdHandlerBase {
    private boolean _hasEarnedReward = false;

    public ScarRewardedAdHandler(C13008c cVar, EventSubject<GMAEvent> eventSubject) {
        super(cVar, eventSubject);
    }

    public void onAdClosed() {
        if (!this._hasEarnedReward) {
            super.onAdSkipped();
        }
        super.onAdClosed();
    }

    public void onAdFailedToShow(int i, String str) {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        GMAEvent gMAEvent = GMAEvent.REWARDED_SHOW_ERROR;
        C13008c cVar = this._scarAdMetadata;
        gMAEventSender.send(gMAEvent, cVar.f32193a, cVar.f32194b, str, Integer.valueOf(i));
    }

    public void onAdImpression() {
        this._gmaEventSender.send(GMAEvent.REWARDED_IMPRESSION_RECORDED, new Object[0]);
    }

    public void onUserEarnedReward() {
        this._hasEarnedReward = true;
        this._gmaEventSender.send(GMAEvent.AD_EARNED_REWARD, new Object[0]);
    }
}
