package com.appboy.p044ui.actions;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.appboy.IAppboyNavigator;
import com.appboy.enums.Channel;
import com.appboy.p044ui.AppboyNavigator;
import com.appboy.p044ui.AppboyWebViewActivity;
import com.appboy.p044ui.support.UriUtils;
import com.appboy.support.AppboyFileUtils;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.braze.configuration.BrazeConfigurationProvider;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.appboy.ui.actions.UriAction */
public class UriAction implements IAction {
    private static final String TAG = AppboyLogger.getBrazeLogTag(UriAction.class);
    private final Channel mChannel;
    private final Bundle mExtras;
    private Uri mUri;
    private boolean mUseWebView;

    public UriAction(Uri uri, Bundle bundle, boolean z, Channel channel) {
        this.mUri = uri;
        this.mExtras = bundle;
        this.mUseWebView = z;
        this.mChannel = channel;
    }

    public void execute(Context context) {
        if (AppboyFileUtils.isLocalUri(this.mUri)) {
            String str = TAG;
            StringBuilder k = C13555b.m33972k("Not executing local Uri: ");
            k.append(this.mUri);
            AppboyLogger.m5448d(str, k.toString());
            return;
        }
        String str2 = TAG;
        StringBuilder k2 = C13555b.m33972k("Executing Uri action from channel ");
        k2.append(this.mChannel);
        k2.append(": ");
        k2.append(this.mUri);
        k2.append(". UseWebView: ");
        k2.append(this.mUseWebView);
        k2.append(". Extras: ");
        k2.append(this.mExtras);
        AppboyLogger.m5448d(str2, k2.toString());
        if (!this.mUseWebView || !AppboyFileUtils.REMOTE_SCHEMES.contains(this.mUri.getScheme())) {
            if (this.mChannel.equals(Channel.PUSH)) {
                openUriWithActionViewFromPush(context, this.mUri, this.mExtras);
            } else {
                openUriWithActionView(context, this.mUri, this.mExtras);
            }
        } else if (this.mChannel.equals(Channel.PUSH)) {
            openUriWithWebViewActivityFromPush(context, this.mUri, this.mExtras);
        } else {
            openUriWithWebViewActivity(context, this.mUri, this.mExtras);
        }
    }

    public Intent getActionViewIntent(Context context, Uri uri, Bundle bundle) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities.size() > 1) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                if (next.activityInfo.packageName.equals(context.getPackageName())) {
                    String str = TAG;
                    StringBuilder k = C13555b.m33972k("Setting deep link intent package to ");
                    k.append(next.activityInfo.packageName);
                    k.append(".");
                    AppboyLogger.m5448d(str, k.toString());
                    intent.setPackage(next.activityInfo.packageName);
                    break;
                }
            }
        }
        return intent;
    }

    public Intent[] getIntentArrayWithConfiguredBackStack(Context context, Bundle bundle, Intent intent, BrazeConfigurationProvider brazeConfigurationProvider) {
        Intent intent2 = null;
        if (brazeConfigurationProvider.getIsPushDeepLinkBackStackActivityEnabled()) {
            String pushDeepLinkBackStackActivityClassName = brazeConfigurationProvider.getPushDeepLinkBackStackActivityClassName();
            if (StringUtils.isNullOrBlank(pushDeepLinkBackStackActivityClassName)) {
                AppboyLogger.m5453i(TAG, "Adding main activity intent to back stack while opening uri from push");
                intent2 = UriUtils.getMainActivityIntent(context, bundle);
            } else if (UriUtils.isActivityRegisteredInManifest(context, pushDeepLinkBackStackActivityClassName)) {
                String str = TAG;
                AppboyLogger.m5453i(str, "Adding custom back stack activity while opening uri from push: " + pushDeepLinkBackStackActivityClassName);
                intent2 = new Intent().setClassName(context, pushDeepLinkBackStackActivityClassName).setFlags(AppboyNavigator.getAppboyNavigator().getIntentFlags(IAppboyNavigator.IntentFlagPurpose.URI_ACTION_BACK_STACK_GET_ROOT_INTENT)).putExtras(bundle);
            } else {
                String str2 = TAG;
                AppboyLogger.m5453i(str2, "Not adding unregistered activity to the back stack while opening uri from push: " + pushDeepLinkBackStackActivityClassName);
            }
        } else {
            AppboyLogger.m5453i(TAG, "Not adding back stack activity while opening uri from push due to disabled configuration setting.");
        }
        if (intent2 == null) {
            intent.setFlags(AppboyNavigator.getAppboyNavigator().getIntentFlags(IAppboyNavigator.IntentFlagPurpose.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT));
            return new Intent[]{intent};
        }
        return new Intent[]{intent2, intent};
    }

    public Uri getUri() {
        return this.mUri;
    }

    public Intent getWebViewActivityIntent(Context context, Uri uri, Bundle bundle) {
        Intent intent;
        String customHtmlWebViewActivityClassName = new BrazeConfigurationProvider(context).getCustomHtmlWebViewActivityClassName();
        if (StringUtils.isNullOrBlank(customHtmlWebViewActivityClassName) || !UriUtils.isActivityRegisteredInManifest(context, customHtmlWebViewActivityClassName)) {
            intent = new Intent(context, AppboyWebViewActivity.class);
        } else {
            String str = TAG;
            AppboyLogger.m5448d(str, "Launching custom WebView Activity with class name: " + customHtmlWebViewActivityClassName);
            intent = new Intent().setClassName(context, customHtmlWebViewActivityClassName);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("url", uri.toString());
        return intent;
    }

    public void openUriWithActionView(Context context, Uri uri, Bundle bundle) {
        Intent actionViewIntent = getActionViewIntent(context, uri, bundle);
        actionViewIntent.setFlags(AppboyNavigator.getAppboyNavigator().getIntentFlags(IAppboyNavigator.IntentFlagPurpose.URI_ACTION_OPEN_WITH_ACTION_VIEW));
        try {
            context.startActivity(actionViewIntent);
        } catch (Exception e) {
            String str = TAG;
            AppboyLogger.m5452e(str, "Failed to handle uri " + uri + " with extras: " + bundle, e);
        }
    }

    public void openUriWithActionViewFromPush(Context context, Uri uri, Bundle bundle) {
        try {
            context.startActivities(getIntentArrayWithConfiguredBackStack(context, bundle, getActionViewIntent(context, uri, bundle), new BrazeConfigurationProvider(context)));
        } catch (ActivityNotFoundException e) {
            String str = TAG;
            AppboyLogger.m5460w(str, "Could not find appropriate activity to open for deep link " + uri, e);
        }
    }

    public void openUriWithWebViewActivity(Context context, Uri uri, Bundle bundle) {
        Intent webViewActivityIntent = getWebViewActivityIntent(context, uri, bundle);
        webViewActivityIntent.setFlags(AppboyNavigator.getAppboyNavigator().getIntentFlags(IAppboyNavigator.IntentFlagPurpose.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY));
        try {
            context.startActivity(webViewActivityIntent);
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Appboy AppboyWebViewActivity not opened successfully.", e);
        }
    }

    public void openUriWithWebViewActivityFromPush(Context context, Uri uri, Bundle bundle) {
        try {
            context.startActivities(getIntentArrayWithConfiguredBackStack(context, bundle, getWebViewActivityIntent(context, uri, bundle), new BrazeConfigurationProvider(context)));
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Braze WebView Activity not opened successfully.", e);
        }
    }
}
