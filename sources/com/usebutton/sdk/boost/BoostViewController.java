package com.usebutton.sdk.boost;

import com.usebutton.sdk.internal.base.BaseViewController;
import com.usebutton.sdk.internal.boost.BoostResponsePrivate;
import com.usebutton.sdk.internal.widget.WidgetRenderable;
import com.usebutton.sdk.internal.widget.WidgetView;

interface BoostViewController extends BaseViewController {
    void addImpressionView(BoostResponsePrivate boostResponsePrivate);

    void configureWidget(WidgetView.Listener listener);

    void removeImpressionView();

    void renderWidget(WidgetRenderable widgetRenderable);
}
