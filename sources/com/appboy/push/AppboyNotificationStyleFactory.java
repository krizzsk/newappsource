package com.appboy.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.appboy.Constants;
import com.appboy.IAppboyNavigator;
import com.appboy.models.push.BrazeNotificationPayload;
import com.appboy.p044ui.AppboyNavigator;
import com.appboy.p044ui.R$id;
import com.appboy.p044ui.R$layout;
import com.appboy.push.support.HtmlUtils;
import com.appboy.support.AppboyImageUtils;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.appboy.support.IntentUtils;
import com.appboy.support.StringUtils;
import com.braze.Braze;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeDateFormat;
import com.braze.enums.BrazeViewBounds;
import java.util.List;
import p067e1.C4471a0;
import p067e1.C4515u;
import p067e1.C4521x;
import p067e1.C4522y;
import p067e1.C4523z;

public class AppboyNotificationStyleFactory {
    private static final String TAG = AppboyLogger.getBrazeLogTag(AppboyNotificationStyleFactory.class);

    public static class NoOpSentinelStyle extends C4471a0 {
        private NoOpSentinelStyle() {
        }
    }

    private static PendingIntent createStoryPageClickedPendingIntent(Context context, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
        Intent intent = new Intent(Constants.APPBOY_STORY_CLICKED_ACTION).setClass(context, NotificationTrampolineActivity.class);
        intent.setFlags(intent.getFlags() | AppboyNavigator.getAppboyNavigator().getIntentFlags(IAppboyNavigator.IntentFlagPurpose.NOTIFICATION_PUSH_STORY_PAGE_CLICK));
        intent.putExtra(Constants.APPBOY_ACTION_URI_KEY, pushStoryPage.getDeeplink());
        intent.putExtra(Constants.APPBOY_ACTION_USE_WEBVIEW_KEY, pushStoryPage.getUseWebview());
        intent.putExtra(Constants.APPBOY_STORY_PAGE_ID, pushStoryPage.getStoryPageId());
        intent.putExtra(Constants.APPBOY_CAMPAIGN_ID, pushStoryPage.getCampaignId());
        return PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent, IntentUtils.getDefaultPendingIntentFlags());
    }

    private static PendingIntent createStoryTraversedPendingIntent(Context context, Bundle bundle, int i) {
        Intent intent = new Intent(Constants.APPBOY_STORY_TRAVERSE_CLICKED_ACTION).setClass(context, AppboyNotificationUtils.getNotificationReceiverClass());
        if (bundle != null) {
            bundle.putInt(Constants.APPBOY_STORY_INDEX_KEY, i);
            intent.putExtras(bundle);
        }
        return PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, 1073741824 | IntentUtils.getDefaultPendingIntentFlags());
    }

    public static C4515u getBigPictureNotificationStyle(BrazeNotificationPayload brazeNotificationPayload) {
        Context context = brazeNotificationPayload.getContext();
        if (context == null) {
            return null;
        }
        String bigImageUrl = brazeNotificationPayload.getBigImageUrl();
        if (StringUtils.isNullOrBlank(bigImageUrl)) {
            return null;
        }
        Bitmap pushBitmapFromUrl = Braze.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, brazeNotificationPayload.getNotificationExtras(), bigImageUrl, BrazeViewBounds.NOTIFICATION_EXPANDED_IMAGE);
        if (pushBitmapFromUrl == null) {
            String str = TAG;
            AppboyLogger.m5448d(str, "Failed to download image bitmap for big picture notification style. Url: " + bigImageUrl);
            return null;
        }
        try {
            if (pushBitmapFromUrl.getWidth() > pushBitmapFromUrl.getHeight()) {
                int pixelsFromDensityAndDp = AppboyImageUtils.getPixelsFromDensityAndDp(AppboyImageUtils.getDensityDpi(context), 192);
                int i = pixelsFromDensityAndDp * 2;
                int displayWidthPixels = AppboyImageUtils.getDisplayWidthPixels(context);
                if (i > displayWidthPixels) {
                    i = displayWidthPixels;
                }
                try {
                    pushBitmapFromUrl = Bitmap.createScaledBitmap(pushBitmapFromUrl, i, pixelsFromDensityAndDp, true);
                } catch (Exception e) {
                    AppboyLogger.m5452e(TAG, "Failed to scale image bitmap, using original.", e);
                }
            }
            if (pushBitmapFromUrl == null) {
                AppboyLogger.m5453i(TAG, "Bitmap download failed for push notification. No image will be included with the notification.");
                return null;
            }
            C4515u uVar = new C4515u();
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.f3345b = pushBitmapFromUrl;
            uVar.f15616a = iconCompat;
            setBigPictureSummaryAndTitle(uVar, brazeNotificationPayload);
            return uVar;
        } catch (Exception e2) {
            AppboyLogger.m5452e(TAG, "Failed to create Big Picture Style.", e2);
            return null;
        }
    }

    public static C4521x getBigTextNotificationStyle(BrazeNotificationPayload brazeNotificationPayload) {
        C4521x xVar = new C4521x();
        BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
        xVar.f15619a = C4522y.m11766b(HtmlUtils.getHtmlSpannedTextIfEnabled(configurationProvider, brazeNotificationPayload.getContentText()));
        if (brazeNotificationPayload.getBigSummaryText() != null) {
            xVar.mSummaryText = C4522y.m11766b(HtmlUtils.getHtmlSpannedTextIfEnabled(configurationProvider, brazeNotificationPayload.getBigSummaryText()));
            xVar.mSummaryTextSet = true;
        }
        if (brazeNotificationPayload.getBigTitleText() != null) {
            xVar.mBigContentTitle = C4522y.m11766b(HtmlUtils.getHtmlSpannedTextIfEnabled(configurationProvider, brazeNotificationPayload.getBigTitleText()));
        }
        return xVar;
    }

    public static C4471a0 getInlineImageStyle(BrazeNotificationPayload brazeNotificationPayload, C4522y yVar) {
        int i;
        Context context = brazeNotificationPayload.getContext();
        if (context == null) {
            AppboyLogger.m5448d(TAG, "Inline Image Push cannot render without a context");
            return null;
        }
        String bigImageUrl = brazeNotificationPayload.getBigImageUrl();
        if (StringUtils.isNullOrBlank(bigImageUrl)) {
            AppboyLogger.m5448d(TAG, "Inline Image Push image url invalid");
            return null;
        }
        Bundle notificationExtras = brazeNotificationPayload.getNotificationExtras();
        Bitmap pushBitmapFromUrl = Braze.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, notificationExtras, bigImageUrl, BrazeViewBounds.NOTIFICATION_INLINE_PUSH_IMAGE);
        if (pushBitmapFromUrl == null) {
            AppboyLogger.m5448d(TAG, "Inline Image Push failed to get image bitmap");
            return null;
        }
        boolean isRemoteViewNotificationAvailableSpaceConstrained = isRemoteViewNotificationAvailableSpaceConstrained(context);
        String packageName = context.getPackageName();
        if (isRemoteViewNotificationAvailableSpaceConstrained) {
            i = R$layout.com_appboy_notification_inline_image_constrained;
        } else {
            i = R$layout.com_appboy_notification_inline_image;
        }
        RemoteViews remoteViews = new RemoteViews(packageName, i);
        BrazeConfigurationProvider brazeConfigurationProvider = new BrazeConfigurationProvider(context);
        Icon createWithResource = Icon.createWithResource(context, brazeConfigurationProvider.getSmallNotificationIconResourceId());
        if (brazeNotificationPayload.getAccentColor() != null) {
            createWithResource.setTint(brazeNotificationPayload.getAccentColor().intValue());
        }
        remoteViews.setImageViewIcon(R$id.com_appboy_inline_image_push_app_icon, createWithResource);
        PackageManager packageManager = context.getPackageManager();
        try {
            remoteViews.setTextViewText(R$id.com_appboy_inline_image_push_app_name_text, HtmlUtils.getHtmlSpannedTextIfEnabled(brazeConfigurationProvider, (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 0))));
            remoteViews.setTextViewText(R$id.com_appboy_inline_image_push_time_text, DateTimeUtils.formatDateNow(BrazeDateFormat.CLOCK_12_HOUR));
            remoteViews.setTextViewText(R$id.com_appboy_inline_image_push_title_text, HtmlUtils.getHtmlSpannedTextIfEnabled(brazeConfigurationProvider, notificationExtras.getString(Constants.APPBOY_PUSH_TITLE_KEY)));
            remoteViews.setTextViewText(R$id.com_appboy_inline_image_push_content_text, HtmlUtils.getHtmlSpannedTextIfEnabled(brazeConfigurationProvider, notificationExtras.getString(Constants.APPBOY_PUSH_CONTENT_KEY)));
            yVar.f15639t = remoteViews;
            if (isRemoteViewNotificationAvailableSpaceConstrained) {
                yVar.mo20035g(pushBitmapFromUrl);
                return new C4523z();
            }
            remoteViews.setImageViewBitmap(R$id.com_appboy_inline_image_push_side_image, pushBitmapFromUrl);
            return new NoOpSentinelStyle();
        } catch (PackageManager.NameNotFoundException unused) {
            AppboyLogger.m5448d(TAG, "Inline Image Push application info was null");
            return null;
        }
    }

    public static C4471a0 getNotificationStyle(C4522y yVar, BrazeNotificationPayload brazeNotificationPayload) {
        C4471a0 a0Var;
        if (brazeNotificationPayload.isPushStory() && brazeNotificationPayload.getContext() != null) {
            AppboyLogger.m5448d(TAG, "Rendering push notification with DecoratedCustomViewStyle (Story)");
            a0Var = getStoryStyle(yVar, brazeNotificationPayload);
        } else if (brazeNotificationPayload.getBigImageUrl() == null) {
            a0Var = null;
        } else if (Build.VERSION.SDK_INT < 23 || !brazeNotificationPayload.isInlineImagePush()) {
            AppboyLogger.m5448d(TAG, "Rendering push notification with BigPictureStyle");
            a0Var = getBigPictureNotificationStyle(brazeNotificationPayload);
        } else {
            AppboyLogger.m5448d(TAG, "Rendering push notification with custom inline image style");
            a0Var = getInlineImageStyle(brazeNotificationPayload, yVar);
        }
        if (a0Var != null) {
            return a0Var;
        }
        AppboyLogger.m5448d(TAG, "Rendering push notification with BigTextStyle");
        return getBigTextNotificationStyle(brazeNotificationPayload);
    }

    public static C4523z getStoryStyle(C4522y yVar, BrazeNotificationPayload brazeNotificationPayload) {
        Context context = brazeNotificationPayload.getContext();
        if (context == null) {
            AppboyLogger.m5448d(TAG, "Push story page cannot render without a context");
            return null;
        }
        List<BrazeNotificationPayload.PushStoryPage> pushStoryPages = brazeNotificationPayload.getPushStoryPages();
        int pushStoryPageIndex = brazeNotificationPayload.getPushStoryPageIndex();
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R$layout.com_appboy_notification_story_one_image);
        if (!populatePushStoryPage(remoteViews, brazeNotificationPayload, pushStoryPages.get(pushStoryPageIndex))) {
            AppboyLogger.m5459w(TAG, "Push story page was not populated correctly. Not using DecoratedCustomViewStyle.");
            return null;
        }
        Bundle notificationExtras = brazeNotificationPayload.getNotificationExtras();
        C4523z zVar = new C4523z();
        int size = pushStoryPages.size();
        remoteViews.setOnClickPendingIntent(R$id.com_appboy_story_button_previous, createStoryTraversedPendingIntent(context, notificationExtras, ((pushStoryPageIndex - 1) + size) % size));
        remoteViews.setOnClickPendingIntent(R$id.com_appboy_story_button_next, createStoryTraversedPendingIntent(context, notificationExtras, (pushStoryPageIndex + 1) % size));
        yVar.f15640u = remoteViews;
        yVar.mo20034f(8, true);
        return zVar;
    }

    private static boolean isRemoteViewNotificationAvailableSpaceConstrained(Context context) {
        if ((Build.VERSION.CODENAME.equals("S") || Build.VERSION.SDK_INT > 30) && context.getApplicationContext().getApplicationInfo().targetSdkVersion > 30) {
            return true;
        }
        return false;
    }

    private static boolean populatePushStoryPage(RemoteViews remoteViews, BrazeNotificationPayload brazeNotificationPayload, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
        Context context = brazeNotificationPayload.getContext();
        if (context == null) {
            AppboyLogger.m5448d(TAG, "Push story page cannot render without a context");
            return false;
        }
        BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
        if (configurationProvider == null) {
            AppboyLogger.m5448d(TAG, "Push story page cannot render without a configuration provider");
            return false;
        }
        String bitmapUrl = pushStoryPage.getBitmapUrl();
        if (StringUtils.isNullOrBlank(bitmapUrl)) {
            AppboyLogger.m5448d(TAG, "Push story page image url invalid");
            return false;
        }
        Bitmap pushBitmapFromUrl = Braze.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, brazeNotificationPayload.getNotificationExtras(), bitmapUrl, BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY);
        if (pushBitmapFromUrl == null) {
            return false;
        }
        remoteViews.setImageViewBitmap(R$id.com_appboy_story_image_view, pushBitmapFromUrl);
        String title = pushStoryPage.getTitle();
        if (!StringUtils.isNullOrBlank(title)) {
            remoteViews.setTextViewText(R$id.com_appboy_story_text_view, HtmlUtils.getHtmlSpannedTextIfEnabled(configurationProvider, title));
            remoteViews.setInt(R$id.com_appboy_story_text_view_container, "setGravity", pushStoryPage.getTitleGravity());
        } else {
            remoteViews.setInt(R$id.com_appboy_story_text_view_container, "setVisibility", 8);
        }
        String subtitle = pushStoryPage.getSubtitle();
        if (!StringUtils.isNullOrBlank(subtitle)) {
            remoteViews.setTextViewText(R$id.com_appboy_story_text_view_small, HtmlUtils.getHtmlSpannedTextIfEnabled(configurationProvider, subtitle));
            remoteViews.setInt(R$id.com_appboy_story_text_view_small_container, "setGravity", pushStoryPage.getSubtitleGravity());
        } else {
            remoteViews.setInt(R$id.com_appboy_story_text_view_small_container, "setVisibility", 8);
        }
        remoteViews.setOnClickPendingIntent(R$id.com_appboy_story_relative_layout, createStoryPageClickedPendingIntent(context, pushStoryPage));
        return true;
    }

    public static void setBigPictureSummaryAndTitle(C4515u uVar, BrazeNotificationPayload brazeNotificationPayload) {
        BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
        if (brazeNotificationPayload.getBigSummaryText() != null) {
            CharSequence htmlSpannedTextIfEnabled = HtmlUtils.getHtmlSpannedTextIfEnabled(configurationProvider, brazeNotificationPayload.getBigSummaryText());
            uVar.getClass();
            uVar.mSummaryText = C4522y.m11766b(htmlSpannedTextIfEnabled);
            uVar.mSummaryTextSet = true;
        }
        if (brazeNotificationPayload.getBigTitleText() != null) {
            CharSequence htmlSpannedTextIfEnabled2 = HtmlUtils.getHtmlSpannedTextIfEnabled(configurationProvider, brazeNotificationPayload.getBigTitleText());
            uVar.getClass();
            uVar.mBigContentTitle = C4522y.m11766b(htmlSpannedTextIfEnabled2);
        }
        if (brazeNotificationPayload.getSummaryText() == null && brazeNotificationPayload.getBigSummaryText() == null) {
            CharSequence htmlSpannedTextIfEnabled3 = HtmlUtils.getHtmlSpannedTextIfEnabled(configurationProvider, brazeNotificationPayload.getContentText());
            uVar.getClass();
            uVar.mSummaryText = C4522y.m11766b(htmlSpannedTextIfEnabled3);
            uVar.mSummaryTextSet = true;
        }
    }

    public static void setStyleIfSupported(C4522y yVar, BrazeNotificationPayload brazeNotificationPayload) {
        AppboyLogger.m5448d(TAG, "Setting style for notification");
        C4471a0 notificationStyle = getNotificationStyle(yVar, brazeNotificationPayload);
        if (notificationStyle != null && !(notificationStyle instanceof NoOpSentinelStyle)) {
            yVar.mo20037i(notificationStyle);
        }
    }
}
