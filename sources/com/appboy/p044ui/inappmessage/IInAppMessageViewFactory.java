package com.appboy.p044ui.inappmessage;

import android.app.Activity;
import android.view.View;
import com.appboy.models.IInAppMessage;

/* renamed from: com.appboy.ui.inappmessage.IInAppMessageViewFactory */
public interface IInAppMessageViewFactory {
    View createInAppMessageView(Activity activity, IInAppMessage iInAppMessage);
}
