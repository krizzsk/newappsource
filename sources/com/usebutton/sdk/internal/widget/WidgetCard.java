package com.usebutton.sdk.internal.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.models.Widget;
import com.usebutton.sdk.internal.widget.WidgetExtension;
import com.usebutton.sdk.purchasepath.CallToAction;
import com.usebutton.sdk.purchasepath.Card;

class WidgetCard extends Card {
    private final Widget widget;
    private final WidgetExtension.WidgetCardHandler widgetCardHandler;

    public WidgetCard(CallToAction callToAction, Widget widget2, WidgetExtension.WidgetCardHandler widgetCardHandler2) {
        super(callToAction);
        this.widget = widget2;
        this.widgetCardHandler = widgetCardHandler2;
    }

    public void onBindView(View view) {
        WidgetView widgetView = (WidgetView) view.findViewById(C12238R.C12240id.widget_card_widget);
        widgetView.render(this.widget, this.widgetCardHandler);
        widgetView.setListener(this.widgetCardHandler);
        widgetView.setHeight(this.widget.getCardHeight());
    }

    public View onCreateView(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(C12238R.layout.btn_view_widget_card, viewGroup, false);
    }
}
