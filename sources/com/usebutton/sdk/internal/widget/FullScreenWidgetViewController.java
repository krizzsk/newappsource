package com.usebutton.sdk.internal.widget;

import android.content.Intent;
import com.usebutton.sdk.internal.base.BaseViewController;
import com.usebutton.sdk.internal.models.Widget;
import com.usebutton.sdk.internal.widget.WidgetView;

interface FullScreenWidgetViewController extends BaseViewController {
    void closeActivity();

    void dismissWebView();

    void installApp(Intent intent);

    void renderWidget(Widget widget, WidgetView.RenderListener renderListener);

    void setOpenUrlResult(String str, String str2);

    void setWidgetListener(WidgetView.Listener listener);
}
