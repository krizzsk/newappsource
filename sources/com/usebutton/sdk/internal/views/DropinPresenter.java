package com.usebutton.sdk.internal.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.DropinButton;
import com.usebutton.sdk.action.ButtonAction;
import com.usebutton.sdk.internal.ButtonPrivate;
import com.usebutton.sdk.internal.events.EventTracker;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.internal.models.AppAction;
import com.usebutton.sdk.internal.models.Asset;
import com.usebutton.sdk.internal.models.MetaInfo;
import com.usebutton.sdk.internal.models.Preview;
import com.usebutton.sdk.internal.models.Text;
import com.usebutton.sdk.internal.util.ButtonLog;

public class DropinPresenter {
    private static final String TAG = "DropinPresenter";
    private AppAction mAppAction;
    private final ButtonPrivate mButton;
    private Context mContext;
    private DropinButton mDropin;
    private final EventTracker mEventTracker;

    public DropinPresenter(Context context, DropinButton dropinButton) {
        this(context, dropinButton, ButtonPrivate.getButton());
    }

    @SuppressLint({"InflateParams"})
    public static PreviewView buttonWithText(Context context, Text text, Text text2, Asset asset) {
        PreviewView previewView = (PreviewView) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C12238R.layout.btn_preview_two_line, (ViewGroup) null);
        previewView.bind(text, text2, asset);
        return previewView;
    }

    private Context getContext() {
        return this.mContext;
    }

    public void onClicked(AppAction appAction) {
        this.mEventTracker.trackEventWithProperties(Events.BUTTON_TAPPED, Events.PROPERTY_SOURCE_TOKEN, appAction.getMeta().getSourceToken(), "type", Events.VALUE_TYPE_BUTTON);
        appAction.doInvokePreview(getContext(), 0);
    }

    public void onLoading() {
        PreviewView previewView = (PreviewView) ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C12238R.layout.btn_preview_two_line, (ViewGroup) null);
        previewView.setIsLoading(true);
        this.mDropin.addContentView(previewView);
    }

    public void onNoPromotion() {
        this.mDropin.removeAllViews();
        this.mAppAction = null;
    }

    public void onPromotion(AppAction appAction, Context context) {
        MetaInfo meta = appAction.getMeta();
        this.mAppAction = appAction;
        updateWithPromotion(appAction, context);
        ButtonLog.visibleFormat("Button visible to user (Action ID: %s)", meta.getId());
        this.mDropin.onContent();
    }

    public void onReportViewed() {
        AppAction appAction = this.mAppAction;
        if (appAction != null && appAction.getMeta() != null) {
            this.mEventTracker.trackEventWithPromotionSourceToken(Events.BUTTON_VIEWED, this.mAppAction.getMeta().getSourceToken());
            this.mDropin.onReportedView();
        }
    }

    public void prepareWithAction(DropinButton dropinButton, ButtonAction buttonAction) {
        if (buttonAction == null) {
            prepareWithAction(dropinButton, (AppAction) null);
        } else {
            prepareWithAction(dropinButton, buttonAction.getAppAction());
        }
    }

    public void test_setContext(Context context) {
        this.mContext = context;
    }

    public void updateWithPromotion(final AppAction appAction, Context context) {
        Preview preview = appAction.getPreview();
        PreviewView buttonWithText = buttonWithText(context, preview.getTitle(), preview.getText(), preview.getIcon());
        buttonWithText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                DropinPresenter.this.onClicked(appAction);
            }
        });
        this.mDropin.addContentView(buttonWithText);
    }

    public DropinPresenter(Context context, DropinButton dropinButton, ButtonPrivate buttonPrivate) {
        this.mContext = context;
        this.mDropin = dropinButton;
        this.mButton = buttonPrivate;
        this.mEventTracker = buttonPrivate.getEventTracker();
        onLoading();
    }

    public void prepareWithAction(DropinButton dropinButton, AppAction appAction) {
        if (!this.mButton.internalIsStarted()) {
            ButtonLog.visible("Button is not started, start with Button.getButton(context).start().");
            onNoPromotion();
        } else if (appAction == null) {
            onNoPromotion();
            onLoading();
        } else if (appAction.getPreview() == null) {
            ButtonLog.visible("AppAction does not contain a preview.");
            onNoPromotion();
            onLoading();
        } else {
            this.mDropin = dropinButton;
            onPromotion(appAction, getContext());
        }
    }
}
