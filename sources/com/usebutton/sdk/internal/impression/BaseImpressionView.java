package com.usebutton.sdk.internal.impression;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.usebutton.sdk.internal.impression.BaseImpressionPresenter;

public abstract class BaseImpressionView<P extends BaseImpressionPresenter> extends View implements BaseImpressionViewController, ViewTreeObserver.OnScrollChangedListener {
    /* access modifiers changed from: private */
    public final Rect clipRect = new Rect();
    private ViewTreeObserver.OnGlobalLayoutListener layoutListener = new ViewTreeObserver.OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            BaseImpressionView baseImpressionView = BaseImpressionView.this;
            baseImpressionView.presenter.onViewReady(baseImpressionView.getGlobalVisibleRect(baseImpressionView.clipRect));
        }
    };
    public P presenter;

    public BaseImpressionView(Context context) {
        super(context);
        init();
    }

    private void init() {
        this.presenter = createPresenter();
    }

    public void addLayoutListener() {
        getViewTreeObserver().addOnGlobalLayoutListener(this.layoutListener);
    }

    public void checkVisibility() {
        this.presenter.onCheckVisibility(getVisibility(), getRootView().getParent() != null);
    }

    public abstract P createPresenter();

    public void measureView() {
        this.presenter.onMeasureView((long) getWidth(), (long) getHeight(), (long) this.clipRect.width(), (long) this.clipRect.height(), getGlobalVisibleRect(this.clipRect));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this);
        this.presenter.attachView(this);
        checkVisibility();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this);
        this.presenter.detachView();
    }

    public void onScrollChanged() {
        checkVisibility();
    }

    public void postVisibilityCheck() {
        postDelayed(new Runnable() {
            public void run() {
                BaseImpressionView.this.checkVisibility();
            }
        }, 1000);
    }

    public void removeLayoutListener() {
        getViewTreeObserver().removeOnGlobalLayoutListener(this.layoutListener);
    }

    public BaseImpressionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public BaseImpressionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    @TargetApi(21)
    public BaseImpressionView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }
}
