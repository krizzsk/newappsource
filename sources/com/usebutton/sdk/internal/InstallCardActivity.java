package com.usebutton.sdk.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.internal.functional.Pair;
import com.usebutton.sdk.internal.models.App;
import com.usebutton.sdk.internal.models.MetaInfo;
import com.usebutton.sdk.internal.models.PostInstallNotificationConfig;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.C12356Do;
import com.usebutton.sdk.internal.util.Receiver;
import java.util.Collections;
import java.util.List;
import p358af.C13437d;

public class InstallCardActivity extends BaseCardActivity {
    public static final String EXTRA_DEEP_LINK = "deep_link";
    private static final String TAG = "InstallCardActivity";
    /* access modifiers changed from: private */
    public AlertDialog noStoreDialog;

    public static class OnInstallationHandler implements Receiver<PackageInfo> {
        private static final String TAG = "OnInstallationHandler";
        private final String mPackageName;
        private PostInstaller mPerformer;

        public OnInstallationHandler(String str, PostInstaller postInstaller) {
            this.mPackageName = str;
            this.mPerformer = postInstaller;
        }

        private void onInstallation() {
            ButtonLog.info(TAG, "Application installed, open action.");
            ButtonPrivate.getButton().getPackageObserver().removeObserver(this);
            this.mPerformer.onInstalled();
        }

        public void receive(PackageInfo packageInfo) {
            if (this.mPackageName.equals(packageInfo.packageName)) {
                onInstallation();
            }
        }
    }

    private boolean canInstall(Intent intent) {
        return getPackageManager().resolveActivity(intent, SQLiteDatabase.OPEN_FULLMUTEX) != null;
    }

    private Uri getDeepLink() {
        return (Uri) getIntent().getParcelableExtra(EXTRA_DEEP_LINK);
    }

    private void installRecipientForAction(Uri uri, String str) {
        String storeId = getMetaInfo().getStoreId();
        if (TextUtils.isEmpty(storeId) && isFinishing()) {
            finish();
        }
        if (uri != null) {
            StringBuilder n = C13437d.m33708n("utm_source=Button", "&btn_ref=");
            n.append(getMetaInfo().getSourceToken());
            n.append("&btn_url=");
            n.append(uri.toString());
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details").buildUpon().appendQueryParameter("id", storeId).appendQueryParameter("url", uri.toString()).appendQueryParameter("referrer", n.toString()).build());
            intent.setPackage("com.android.vending");
            if (canInstall(intent)) {
                ButtonLog.visibleFormat("Store Install began (Action ID: %s)", str);
                getEventTracker().trackEventWithProperties(Events.APP_ATTENDED_INSTALL_BEGAN, BaseCardActivity.eventPropertiesSourceTokenAndAppId(getMetaInfo()));
                getEventTracker().trackEventWithProperties(Events.APP_INSTALL_APP_STORE_VIEW, BaseCardActivity.eventPropertiesSourceTokenAndAppId(getMetaInfo()));
                startActivityForResult(intent, 5);
                PostInstallNotificationConfig postInstallNotificationConfig = null;
                if (getApp() != null) {
                    postInstallNotificationConfig = getApp().getPostInstallNotificationConfig();
                }
                getPackageObserver().observePackage(storeId, new OnInstallationHandler(storeId, new PostInstaller(this, getMetaInfo(), postInstallNotificationConfig, intentFor(uri), getEventTracker())));
                return;
            }
            showNoStoreDialog();
        }
    }

    private Intent intentFor(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage(getMetaInfo().getStoreId());
        intent.setFlags(268435456);
        return intent;
    }

    public static Intent intentForPromotion(Context context, App app, MetaInfo metaInfo, Uri uri, int i) {
        Intent intent = new Intent(context, InstallCardActivity.class);
        if (app != null) {
            intent.putExtra("app", app);
        }
        intent.putExtra(BaseCardActivity.EXTRA_META_INFO, metaInfo);
        intent.putExtra(EXTRA_DEEP_LINK, uri);
        intent.putExtra("flags", i);
        return intent;
    }

    private void showNoStoreDialog() {
        AlertDialog create = new AlertDialog.Builder(this).setTitle(C12238R.string.btn_no_store_title).setMessage(getString(C12238R.string.btn_no_store_message, new Object[]{getMetaInfo().getStoreId()})).setCancelable(false).setNegativeButton(C12238R.string.btn_no_store_close, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                InstallCardActivity.this.finish();
            }
        }).create();
        this.noStoreDialog = create;
        create.show();
    }

    public void bind(MetaInfo metaInfo) {
    }

    public String getCardDismissedEvent() {
        return null;
    }

    public List<Pair<String, String>> getCardSpecificEventProperties() {
        return Collections.emptyList();
    }

    public String getCardViewedEvent() {
        return null;
    }

    public int getContentLayoutId() {
        return 0;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (5 == i) {
            ButtonLog.infoFormat(TAG, "Back from Play Store, data: %s", toString(intent));
            if (i2 != -1) {
                getEventTracker().trackEventWithPromotionSourceToken(Events.APP_INSTALL_APP_STORE_CANCELED, getSourceToken());
            }
            finish();
        }
    }

    public void onStop() {
        super.onStop();
        C12356Do.ifNotNull(this.noStoreDialog, new Runnable() {
            public void run() {
                InstallCardActivity.this.noStoreDialog.dismiss();
            }
        });
    }

    public boolean shouldBindAndShowContent(MetaInfo metaInfo) {
        installRecipientForAction(getDeepLink(), getPromotionId());
        return false;
    }
}
