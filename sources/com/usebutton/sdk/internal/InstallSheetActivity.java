package com.usebutton.sdk.internal;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.base.BaseActivity;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.internal.models.Asset;
import com.usebutton.sdk.internal.models.InstallSheet;
import com.usebutton.sdk.internal.views.ColorProgressBar;

public class InstallSheetActivity extends BaseActivity<InstallSheetPresenter> implements InstallSheetController {
    public static final String EXTRA_APP_ICON_URL = "app_icon_url";
    public static final String EXTRA_INSTALL_INTENT = "install_intent";
    public static final String EXTRA_INSTALL_SHEET = "install_sheet";
    public static final String EXTRA_PRIMARY_COLOR = "primary_color";
    public static final String EXTRA_SOURCE_TOKEN = "source_token";
    /* access modifiers changed from: private */
    public InstallSheetPresenter presenter;
    private ColorProgressBar progressBar;
    private String sourceToken;

    public static Intent createIntent(Context context, InstallSheet installSheet, Intent intent, int i, Asset asset, String str) {
        Intent intent2 = new Intent(context, InstallSheetActivity.class);
        intent2.putExtra(EXTRA_INSTALL_SHEET, installSheet);
        intent2.putExtra(EXTRA_INSTALL_INTENT, intent);
        intent2.putExtra(EXTRA_PRIMARY_COLOR, i);
        intent2.putExtra(EXTRA_APP_ICON_URL, asset.getUrl());
        intent2.putExtra("source_token", str);
        return intent2;
    }

    /* access modifiers changed from: private */
    public void setText(int i, int i2, String str) {
        TextView textView = (TextView) findViewById(i);
        textView.setText(str);
        textView.setTextColor(i2);
    }

    private void startLoadingAnimation() {
        View findViewById = findViewById(C12238R.C12240id.install_sheet_background);
        View findViewById2 = findViewById(C12238R.C12240id.install_sheet_loading);
        findViewById.startAnimation(AnimationUtils.loadAnimation(this, C12238R.anim.btn_fade_in));
        findViewById2.startAnimation(AnimationUtils.loadAnimation(this, C12238R.anim.btn_slide_up));
        styleProgressBar();
    }

    private void styleProgressBar() {
        this.progressBar = (ColorProgressBar) findViewById(C12238R.C12240id.install_sheet_progress_bar);
        this.progressBar.setColor(getIntent().getIntExtra(EXTRA_PRIMARY_COLOR, getResources().getColor(C12238R.color.btn_blue)));
    }

    public void initAppButton() {
        findViewById(C12238R.C12240id.install_sheet_button_app).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                InstallSheetActivity.this.presenter.onClickAppButton();
            }
        });
    }

    public void initBackground() {
        findViewById(C12238R.C12240id.install_sheet_background).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                InstallSheetActivity.this.presenter.onClickBackground();
            }
        });
    }

    public void initLoadingTimer(long j) {
        findViewById(C12238R.C12240id.install_sheet_button_web).postDelayed(new Runnable() {
            public void run() {
                InstallSheetActivity.this.presenter.onLoadingTimerComplete();
            }
        }, j);
    }

    public void initWebButton() {
        View findViewById = findViewById(C12238R.C12240id.install_sheet_button_web);
        findViewById.setEnabled(true);
        findViewById.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                InstallSheetActivity.this.presenter.onClickWebButton();
            }
        });
    }

    public void onBackPressed() {
        ButtonPrivate.getButton().getEventTracker().trackEventWithPromotionSourceToken(Events.INSTALL_SHEET_DISMISS, this.sourceToken);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C12238R.layout.btn_activity_install_sheet);
        startLoadingAnimation();
        InstallSheetPresenter installSheetPresenter = new InstallSheetPresenter((InstallSheet) getIntent().getParcelableExtra(EXTRA_INSTALL_SHEET), WebViewObserver.getInstance());
        this.presenter = installSheetPresenter;
        attachPresenterToLifecycle(installSheetPresenter, this);
        String stringExtra = getIntent().getStringExtra("source_token");
        this.sourceToken = stringExtra;
        if (stringExtra == null) {
            stringExtra = "unknown";
        }
        this.sourceToken = stringExtra;
        ButtonPrivate.getButton().getEventTracker().trackEventWithPromotionSourceToken(Events.INSTALL_SHEET_DISPLAY, this.sourceToken);
        ButtonPrivate.getButton().getImageLoader().load((Uri) getIntent().getParcelableExtra(EXTRA_APP_ICON_URL), (ImageView) findViewById(C12238R.C12240id.install_sheet_app_icon));
    }

    public void onStart() {
        super.onStart();
        this.presenter.onStart();
    }

    public void onStop() {
        super.onStop();
        this.presenter.onStop();
    }

    public void setAppAction(int i, String str) {
        setText(C12238R.C12240id.install_sheet_button_app, i, str);
    }

    public void setAppSubtitle(int i, String str) {
        setText(C12238R.C12240id.install_sheet_app_subtitle_text, i, str);
    }

    public void setAppTitle(int i, String str) {
        setText(C12238R.C12240id.install_sheet_app_title_text, i, str);
    }

    public void setTitle(int i, String str) {
        setText(C12238R.C12240id.install_sheet_title_text, i, str);
    }

    public void setWebAction(int i, final String str) {
        final Button button = (Button) findViewById(C12238R.C12240id.install_sheet_button_web);
        int color = getResources().getColor(C12238R.color.btn_disabled);
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(color), Integer.valueOf(i)});
        ofObject.setDuration(250);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                InstallSheetActivity.this.setText(C12238R.C12240id.install_sheet_button_web, ((Integer) valueAnimator.getAnimatedValue()).intValue(), str);
            }
        });
        ofObject.start();
        int color2 = ((ColorDrawable) button.getBackground()).getColor();
        int intExtra = getIntent().getIntExtra(EXTRA_PRIMARY_COLOR, getResources().getColor(C12238R.color.btn_blue));
        ValueAnimator ofObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(color2), Integer.valueOf(intExtra)});
        ofObject2.setDuration(250);
        ofObject2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                button.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ofObject2.start();
    }

    public void setWebViewProgress(int i) {
        this.progressBar.setProgress(i);
    }

    public void shutdown() {
        ButtonPrivate.getButton().getEventTracker().trackEventWithPromotionSourceToken(Events.INSTALL_SHEET_DISMISS, this.sourceToken);
        setResult(-1);
        finish();
    }

    public void startAttendedInstall() {
        startActivity((Intent) getIntent().getParcelableExtra(EXTRA_INSTALL_INTENT));
        setResult(0);
        finish();
    }

    private void setText(int i, String str) {
        ((TextView) findViewById(i)).setText(str);
    }

    public void setWebAction(String str) {
        setText(C12238R.C12240id.install_sheet_button_web, str);
    }
}
