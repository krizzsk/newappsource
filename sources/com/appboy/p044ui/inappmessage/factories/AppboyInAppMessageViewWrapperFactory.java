package com.appboy.p044ui.inappmessage.factories;

import android.view.View;
import android.view.animation.Animation;
import com.appboy.models.IInAppMessage;
import com.appboy.p044ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.appboy.p044ui.inappmessage.IInAppMessageViewWrapper;
import com.appboy.p044ui.inappmessage.IInAppMessageViewWrapperFactory;
import com.appboy.p044ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.braze.configuration.BrazeConfigurationProvider;
import java.util.List;

/* renamed from: com.appboy.ui.inappmessage.factories.AppboyInAppMessageViewWrapperFactory */
public class AppboyInAppMessageViewWrapperFactory implements IInAppMessageViewWrapperFactory {
    public IInAppMessageViewWrapper createInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2) {
        return new DefaultInAppMessageViewWrapper(view, iInAppMessage, iInAppMessageViewLifecycleListener, brazeConfigurationProvider, animation, animation2, view2);
    }

    public IInAppMessageViewWrapper createInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2, List<View> list, View view3) {
        return new DefaultInAppMessageViewWrapper(view, iInAppMessage, iInAppMessageViewLifecycleListener, brazeConfigurationProvider, animation, animation2, view2, list, view3);
    }
}
