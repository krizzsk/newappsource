package com.usebutton.sdk.boost;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.usebutton.sdk.internal.boost.BoostResponsePrivate;
import com.usebutton.sdk.internal.widget.WidgetRenderable;
import com.usebutton.sdk.internal.widget.WidgetView;
import com.usebutton.sdk.purchasepath.PurchasePathRequest;

public class BoostView extends FrameLayout implements BoostViewController {
    private BoostImpressionView impressionView;
    /* access modifiers changed from: private */
    public BoostPresenter presenter;
    public WidgetView widgetView;

    public interface Listener {
        void onPurchasePathRequest(PurchasePathRequest purchasePathRequest, String str);
    }

    public interface RenderListener {
        void onComplete(Throwable th);
    }

    public BoostView(Context context) {
        super(context);
        init();
    }

    private void init() {
        WidgetView widgetView2 = new WidgetView(getContext());
        this.widgetView = widgetView2;
        addView(widgetView2, new FrameLayout.LayoutParams(-1, -1));
        this.presenter = new BoostPresenter();
    }

    public void addImpressionView(BoostResponsePrivate boostResponsePrivate) {
        BoostImpressionView boostImpressionView = new BoostImpressionView(getContext());
        this.impressionView = boostImpressionView;
        addView(boostImpressionView, new FrameLayout.LayoutParams(-1, -1));
        this.impressionView.setBoostResponse(boostResponsePrivate);
    }

    public void configureWidget(WidgetView.Listener listener) {
        this.widgetView.setListener(listener);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.attachView(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.detachView();
    }

    public void removeImpressionView() {
        removeView(this.impressionView);
    }

    public void render(BoostResponse boostResponse) {
        render(boostResponse, (RenderListener) null);
    }

    public void renderWidget(WidgetRenderable widgetRenderable) {
        this.widgetView.render(widgetRenderable, new WidgetView.RenderListener() {
            public void onComplete(Throwable th) {
                BoostView.this.presenter.onRenderComplete(th);
            }
        });
    }

    public void setListener(Listener listener) {
        this.presenter.setBoostViewListener(listener);
    }

    public void render(BoostResponse boostResponse, RenderListener renderListener) {
        this.presenter.onRender(boostResponse, renderListener);
    }

    public BoostView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public BoostView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    @TargetApi(21)
    public BoostView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }
}
