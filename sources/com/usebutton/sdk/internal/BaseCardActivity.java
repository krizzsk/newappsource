package com.usebutton.sdk.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.appboy.support.StringUtils;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.commands.LoadAssetsCommand;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.events.EventTracker;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.internal.functional.Pair;
import com.usebutton.sdk.internal.models.App;
import com.usebutton.sdk.internal.models.Asset;
import com.usebutton.sdk.internal.models.Header;
import com.usebutton.sdk.internal.models.MetaInfo;
import com.usebutton.sdk.internal.models.Text;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.JsonBuilder;
import com.usebutton.sdk.internal.util.PackageObserver;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseCardActivity extends Activity {
    public static final String EXTRA_APP = "app";
    public static final String EXTRA_FOOTER = "footer";
    public static final String EXTRA_INTENT_FLAGS = "flags";
    public static final String EXTRA_META_INFO = "meta_info";
    public static final int REQUEST_INSTALL = 5;
    private static final String STATE_KEY_DID_TRACK_VIEWED = (BaseCardActivity.class + ".did_track_viewed");
    private static final String TAG = "BaseCardActivity";
    private App mApp;
    public boolean mDidDismiss = false;
    public boolean mDidTrackViewed = false;
    private MetaInfo mMetaInfo;

    public static JSONObject eventPropertiesSourceTokenAndAppId(MetaInfo metaInfo) {
        return JsonBuilder.toJson(Events.PROPERTY_SOURCE_TOKEN, metaInfo.getSourceToken(), "app_id", metaInfo.getStoreId());
    }

    private boolean isOutOfBounds(MotionEvent motionEvent, View view) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int scaledWindowTouchSlop = ViewConfiguration.get(this).getScaledWindowTouchSlop();
        int i = -scaledWindowTouchSlop;
        if (x < i || y < i || x > view.getWidth() + scaledWindowTouchSlop || y > view.getHeight() + scaledWindowTouchSlop) {
            return true;
        }
        return false;
    }

    private void loadAssets() {
        List<Asset> collectAssets = collectAssets();
        if (collectAssets.isEmpty()) {
            onAssetsReady();
            return;
        }
        getButton().getCommandExecutor().dispatchFirst(new LoadAssetsCommand(getButton().getImageLoader(), collectAssets, new FailableReceiver<Void>() {
            public void onError() {
                BaseCardActivity.this.onAssetsFailed();
            }

            public void onResult(Void voidR) {
                BaseCardActivity.this.onAssetsReady();
            }
        }));
    }

    public abstract void bind(MetaInfo metaInfo);

    public List<Asset> collectAssets() {
        return new ArrayList();
    }

    public App getApp() {
        return this.mApp;
    }

    public ButtonPrivate getButton() {
        return ButtonPrivate.getButton();
    }

    public abstract String getCardDismissedEvent();

    public abstract List<Pair<String, String>> getCardSpecificEventProperties();

    public abstract String getCardViewedEvent();

    public abstract int getContentLayoutId();

    public EventTracker getEventTracker() {
        return getButton().getEventTracker();
    }

    public MetaInfo getMetaInfo() {
        return this.mMetaInfo;
    }

    public PackageObserver getPackageObserver() {
        return getButton().getPackageObserver();
    }

    public String getPromotionId() {
        return getMetaInfo().getId();
    }

    public String getSourceToken() {
        return getMetaInfo().getSourceToken();
    }

    public void initHeader(Header header) {
        if (header == null) {
            findViewById(C12238R.C12240id.promo_banner).setVisibility(8);
            return;
        }
        findViewById(C12238R.C12240id.promo_banner).setVisibility(0);
        setText(C12238R.C12240id.promo_title, header.getText());
        setText(C12238R.C12240id.promo_subtitle, header.getSubtitle());
        ((CardView) findViewById(C12238R.C12240id.promo_card)).setCardBackgroundColor(header.getBackgroundColor());
    }

    public void onAssetsFailed() {
    }

    public void onAssetsReady() {
    }

    public void onBackPressed() {
        this.mDidDismiss = true;
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mApp = (App) getIntent().getParcelableExtra("app");
        this.mMetaInfo = (MetaInfo) getIntent().getParcelableExtra(EXTRA_META_INFO);
        boolean z = false;
        if (bundle != null && bundle.getBoolean(STATE_KEY_DID_TRACK_VIEWED, false)) {
            z = true;
        }
        this.mDidTrackViewed = z;
        if (this.mMetaInfo == null) {
            ButtonLog.warn(TAG, "Could not find valid MetaInfo extra, make sure you use this class's factory method.");
            finish();
        }
        if (shouldBindAndShowContent(this.mMetaInfo)) {
            setContentView(getContentLayoutId());
            bind(this.mMetaInfo);
            loadAssets();
        }
    }

    public void onPause() {
        if (this.mDidDismiss) {
            trackCardEvent(getCardDismissedEvent(), new String[0]);
            this.mDidDismiss = false;
        }
        super.onPause();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(STATE_KEY_DID_TRACK_VIEWED, this.mDidTrackViewed);
    }

    public void onStart() {
        super.onStart();
        if (!this.mDidTrackViewed) {
            trackCardEvent(getCardViewedEvent(), new String[0]);
            this.mDidTrackViewed = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (willCloseOnTouch(motionEvent, getWindow().getDecorView())) {
            this.mDidDismiss = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setText(int i, Text text) {
        TextView textView = (TextView) findViewById(i);
        if (text != null) {
            textView.setText(text.getCopy());
            textView.setTextColor(text.getColor());
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    public void setTextColor(int i, int... iArr) {
        for (int findViewById : iArr) {
            ((TextView) findViewById(findViewById)).setTextColor(i);
        }
    }

    public void setVisibility(int i, int... iArr) {
        for (int findViewById : iArr) {
            findViewById(findViewById).setVisibility(i);
        }
    }

    public abstract boolean shouldBindAndShowContent(MetaInfo metaInfo);

    public String toString(Intent intent) {
        return intent == null ? StringUtils.NULL_USER_ID_SUBSTITUTE_STRING : intent.toString();
    }

    public void trackCardEvent(String str, String... strArr) {
        if (str != null) {
            int i = 0;
            JSONObject json = JsonBuilder.toJson(Events.PROPERTY_SOURCE_TOKEN, getMetaInfo().getSourceToken());
            while (i < strArr.length) {
                try {
                    json.putOpt(strArr[i], strArr[i + 1]);
                    i += 2;
                } catch (JSONException unused) {
                    ButtonLog.warnFormat(TAG, "Couldn't add key/value to property set: %s", strArr);
                }
            }
            for (Pair next : getCardSpecificEventProperties()) {
                json.putOpt((String) next.first(), next.second());
            }
            getEventTracker().trackEventWithProperties(str, json);
        }
    }

    public boolean willCloseOnTouch(MotionEvent motionEvent, View view) {
        return motionEvent.getAction() == 0 && isOutOfBounds(motionEvent, view);
    }

    public void setText(int i, String str) {
        View findViewById = findViewById(i);
        ((TextView) findViewById).setText(str);
        findViewById.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }
}
