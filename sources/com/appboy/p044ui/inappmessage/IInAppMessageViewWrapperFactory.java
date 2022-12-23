package com.appboy.p044ui.inappmessage;

import android.view.View;
import android.view.animation.Animation;
import com.appboy.models.IInAppMessage;
import com.appboy.p044ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.braze.configuration.BrazeConfigurationProvider;
import java.util.List;

/* renamed from: com.appboy.ui.inappmessage.IInAppMessageViewWrapperFactory */
public interface IInAppMessageViewWrapperFactory {
    IInAppMessageViewWrapper createInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2);

    IInAppMessageViewWrapper createInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2, List<View> list, View view3);
}
