package com.usebutton.sdk.internal.widget;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.ButtonPrivate;
import com.usebutton.sdk.internal.base.BaseActivity;
import com.usebutton.sdk.internal.models.Widget;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.ButtonUtil;
import com.usebutton.sdk.internal.widget.WidgetView;

public class FullScreenWidgetActivity extends BaseActivity<FullScreenWidgetPresenter> implements FullScreenWidgetViewController {
    public static final String EXTRA_DISMISS = "dismiss";
    private static final String EXTRA_INSTALL_INTENT = "install_intent";
    public static final String EXTRA_TARGET = "target";
    public static final String EXTRA_URL = "url";
    private static final String EXTRA_WIDGET = "widget";
    private static final String TAG = "FullScreenWidgetActivity";
    private WidgetView widgetView;

    public static Intent createIntent(Context context, Widget widget, Intent intent) {
        Intent intent2 = new Intent(context, FullScreenWidgetActivity.class);
        intent2.putExtra(EXTRA_WIDGET, widget);
        intent2.putExtra("install_intent", intent);
        return intent2;
    }

    public void closeActivity() {
        finish();
    }

    public void dismissWebView() {
        Intent intent = new Intent();
        intent.putExtra(EXTRA_DISMISS, true);
        setResult(0, intent);
    }

    public void installApp(Intent intent) {
        startActivity(intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (ButtonPrivate.getButton() == null) {
            ButtonLog.warn(TAG, "Button SDK is not configured. Finishing activity.");
            finish();
            return;
        }
        setContentView(C12238R.layout.btn_activity_full_screen_widget);
        this.widgetView = (WidgetView) findViewById(C12238R.C12240id.fullscreen_widget_widget);
        Widget widget = (Widget) getIntent().getParcelableExtra(EXTRA_WIDGET);
        Intent intent = (Intent) getIntent().getParcelableExtra("install_intent");
        if (widget == null || intent == null) {
            ButtonLog.warn(TAG, String.format("Invalid parameters to FullScreenWidgetActivity: widget=%s, installIntent=%s", new Object[]{widget, intent}));
            if (!ButtonUtil.isDebugBuild(this)) {
                finish();
            } else {
                throw new IllegalStateException("Missing valid parameters.");
            }
        }
        attachPresenterToLifecycle(new FullScreenWidgetPresenter(widget, intent), this);
    }

    public void renderWidget(Widget widget, WidgetView.RenderListener renderListener) {
        this.widgetView.render(widget, renderListener);
    }

    public void setOpenUrlResult(String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("url", str);
        intent.putExtra("target", str2);
        setResult(-1, intent);
    }

    public void setWidgetListener(WidgetView.Listener listener) {
        this.widgetView.setListener(listener);
    }
}
