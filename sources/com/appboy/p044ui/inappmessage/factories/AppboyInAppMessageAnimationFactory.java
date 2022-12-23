package com.appboy.p044ui.inappmessage.factories;

import android.content.res.Resources;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.appboy.enums.inappmessage.SlideFrom;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageSlideup;
import com.appboy.p044ui.inappmessage.IInAppMessageAnimationFactory;
import com.appboy.p044ui.support.AnimationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.appboy.ui.inappmessage.factories.AppboyInAppMessageAnimationFactory */
public class AppboyInAppMessageAnimationFactory implements IInAppMessageAnimationFactory {
    private final int mShortAnimationDurationMillis = Resources.getSystem().getInteger(17694720);

    public Animation getClosingAnimation(IInAppMessage iInAppMessage) {
        if (!(iInAppMessage instanceof InAppMessageSlideup)) {
            return AnimationUtils.setAnimationParams(new AlphaAnimation(1.0f, BitmapDescriptorFactory.HUE_RED), (long) this.mShortAnimationDurationMillis, false);
        }
        if (((InAppMessageSlideup) iInAppMessage).getSlideFrom() == SlideFrom.TOP) {
            return AnimationUtils.createVerticalAnimation(BitmapDescriptorFactory.HUE_RED, -1.0f, (long) this.mShortAnimationDurationMillis, false);
        }
        return AnimationUtils.createVerticalAnimation(BitmapDescriptorFactory.HUE_RED, 1.0f, (long) this.mShortAnimationDurationMillis, false);
    }

    public Animation getOpeningAnimation(IInAppMessage iInAppMessage) {
        if (!(iInAppMessage instanceof InAppMessageSlideup)) {
            return AnimationUtils.setAnimationParams(new AlphaAnimation(BitmapDescriptorFactory.HUE_RED, 1.0f), (long) this.mShortAnimationDurationMillis, true);
        }
        if (((InAppMessageSlideup) iInAppMessage).getSlideFrom() == SlideFrom.TOP) {
            return AnimationUtils.createVerticalAnimation(-1.0f, BitmapDescriptorFactory.HUE_RED, (long) this.mShortAnimationDurationMillis, false);
        }
        return AnimationUtils.createVerticalAnimation(1.0f, BitmapDescriptorFactory.HUE_RED, (long) this.mShortAnimationDurationMillis, false);
    }
}
