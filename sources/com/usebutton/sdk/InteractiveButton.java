package com.usebutton.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.usebutton.sdk.action.ButtonAction;
import com.usebutton.sdk.internal.ActionPerformer;
import com.usebutton.sdk.internal.ButtonPrivate;
import com.usebutton.sdk.internal.events.EventTracker;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.internal.models.AppAction;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.JsonBuilder;
import com.usebutton.sdk.internal.util.Receiver;
import com.usebutton.sdk.internal.views.BaseButton;
import com.usebutton.sdk.internal.views.interactive.ActionBinder;
import com.usebutton.sdk.internal.views.interactive.BaseBinder;
import com.usebutton.sdk.internal.views.interactive.LoadingViewBinder;
import com.usebutton.sdk.models.Link;
import org.json.JSONException;
import org.json.JSONObject;

public class InteractiveButton extends BaseButton {
    private static final String TAG = "InteractiveButton";
    /* access modifiers changed from: private */
    public AppAction mAction;
    private final Receiver<Link> mOnInvokeAction;
    private InteractiveStyle mStyle;
    private BaseBinder mViewBinder;

    public static class InteractiveStyle extends BaseButton.Style {
        public Integer inventoryLeftPadding;
    }

    public InteractiveButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private EventTracker getEventTracker() {
        return ButtonPrivate.getButton().getEventTracker();
    }

    private void refreshPager() {
        BaseBinder viewBinderForAction = viewBinderForAction(this.mAction);
        this.mViewBinder = viewBinderForAction;
        viewBinderForAction.bind(this.mAction, this.mOnInvokeAction, ButtonPrivate.getButton().getConfiguration());
    }

    private void reportEvent(String str, String... strArr) {
        AppAction appAction = this.mAction;
        if (appAction == null || appAction.getMeta() == null) {
            ButtonLog.warnFormat(TAG, "Report event without action object, missing required meta object.", new Object[0]);
            return;
        }
        JSONObject json = JsonBuilder.toJson(strArr);
        try {
            json.put(Events.PROPERTY_SOURCE_TOKEN, this.mAction.getMeta().getSourceToken());
        } catch (JSONException e) {
            ButtonLog.warnFormat(TAG, "Exception while forming event property object", e);
        }
        getEventTracker().trackEventWithProperties(str, json);
    }

    private BaseBinder viewBinderForAction(AppAction appAction) {
        if (appAction == null) {
            return new LoadingViewBinder(this);
        }
        return new ActionBinder(this, ButtonPrivate.getButton().getImageLoader());
    }

    public void applyStylingAttributes(ViewGroup viewGroup) {
        viewBinderForAction(this.mAction).applyStyling(getStyle());
    }

    public int getDefaultStyleResource() {
        return C12238R.style.BtnInteractiveButton;
    }

    public void inflateContentView() {
        LayoutInflater.from(getContext()).inflate(C12238R.layout.btn_preview_interactive, this);
        applyStylingAttributes(this);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mAction == null) {
            prepareWithAction((AppAction) null);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            refreshPager();
        }
    }

    public void prepareWithAction(ButtonAction buttonAction) {
        if (buttonAction == null) {
            prepareWithAction((AppAction) null);
        } else {
            prepareWithAction(buttonAction.getAppAction());
        }
    }

    public void readAttributes(AttributeSet attributeSet) {
        super.readAttributes(attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C12238R.styleable.com_usebutton_sdk_InteractiveButton, 0, getDefaultStyleResource());
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C12238R.styleable.com_usebutton_sdk_InteractiveButton_btn_inventoryLeftPadding) {
                getStyle().inventoryLeftPadding = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, 0));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public void reportViewed() {
        if (this.mAction != null) {
            reportEvent(Events.INTERACTIVE_BUTTON_VIEWED, new String[0]);
            onReportedView();
        }
    }

    public void setInventoryLeftPadding_Button(int i) {
        getStyle().inventoryLeftPadding = Integer.valueOf(i);
        invalidateStyling();
    }

    public ViewPager test_getPager() {
        BaseBinder baseBinder = this.mViewBinder;
        if (baseBinder == null) {
            return null;
        }
        return baseBinder.getPager();
    }

    public InteractiveButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InteractiveStyle getStyle() {
        if (this.mStyle == null) {
            this.mStyle = new InteractiveStyle();
        }
        return this.mStyle;
    }

    public InteractiveButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mOnInvokeAction = new Receiver<Link>() {
            public void receive(Link link) {
                if (InteractiveButton.this.mAction == null) {
                    ButtonLog.warnFormat(InteractiveButton.TAG, "Button tapped without action object, should not happen. url=%s", link);
                    return;
                }
                new ActionPerformer(InteractiveButton.this.mAction.getApp(), InteractiveButton.this.mAction.getMeta(), link).withEvent(Events.INTERACTIVE_BUTTON_ITEM_SELECTED).execute(InteractiveButton.this.getContext());
            }
        };
        inflateContentView();
    }

    public void prepareWithAction(AppAction appAction) {
        AppAction appAction2 = this.mAction;
        if (appAction2 == null || !appAction2.equals(appAction)) {
            if (appAction == null || appAction.hasGroups()) {
                this.mAction = appAction;
            } else {
                this.mAction = null;
            }
            refreshPager();
            onContent();
        }
    }

    @TargetApi(21)
    public InteractiveButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mOnInvokeAction = new Receiver<Link>() {
            public void receive(Link link) {
                if (InteractiveButton.this.mAction == null) {
                    ButtonLog.warnFormat(InteractiveButton.TAG, "Button tapped without action object, should not happen. url=%s", link);
                    return;
                }
                new ActionPerformer(InteractiveButton.this.mAction.getApp(), InteractiveButton.this.mAction.getMeta(), link).withEvent(Events.INTERACTIVE_BUTTON_ITEM_SELECTED).execute(InteractiveButton.this.getContext());
            }
        };
        inflateContentView();
    }
}
