package com.usebutton.sdk.boost;

import android.content.Context;
import com.usebutton.sdk.internal.ButtonPrivate;
import com.usebutton.sdk.internal.boost.BoostResponsePrivate;
import com.usebutton.sdk.internal.impression.BaseImpressionPresenter;
import com.usebutton.sdk.internal.impression.BaseImpressionView;

class BoostImpressionView extends BaseImpressionView<BoostImpressionPresenter> implements BoostImpressionViewController {
    public BoostImpressionView(Context context) {
        super(context);
    }

    public void setBoostResponse(BoostResponsePrivate boostResponsePrivate) {
        ((BoostImpressionPresenter) this.presenter).setBoostResponse(boostResponsePrivate);
    }

    public BoostImpressionPresenter createPresenter() {
        return new BoostImpressionPresenter(BaseImpressionPresenter.TIME_PROVIDER, ButtonPrivate.getButton().getConfiguration(), ButtonPrivate.getButton().getEventTracker());
    }
}
