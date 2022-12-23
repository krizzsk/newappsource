package com.appboy.p044ui.inappmessage;

import android.content.Context;
import android.os.Handler;
import com.appboy.enums.inappmessage.InAppMessageFailureType;
import com.appboy.models.IInAppMessage;
import com.appboy.models.IInAppMessageWithImage;
import com.appboy.models.IInAppMessageZippedAssetHtml;
import com.appboy.models.InAppMessageFull;
import com.appboy.models.InAppMessageHtml;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.braze.Braze;
import com.braze.enums.BrazeViewBounds;
import com.braze.images.IBrazeImageLoader;
import com.braze.support.WebContentUtils;
import java.io.File;

/* renamed from: com.appboy.ui.inappmessage.BackgroundInAppMessagePreparer */
public class BackgroundInAppMessagePreparer {
    /* access modifiers changed from: private */
    public static final String TAG = AppboyLogger.getBrazeLogTag(BackgroundInAppMessagePreparer.class);

    /* renamed from: com.appboy.ui.inappmessage.BackgroundInAppMessagePreparer$1 */
    public static /* synthetic */ class C19931 {
        public static final /* synthetic */ int[] $SwitchMap$com$appboy$enums$inappmessage$MessageType;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.appboy.enums.inappmessage.MessageType[] r0 = com.appboy.enums.inappmessage.MessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$appboy$enums$inappmessage$MessageType = r0
                com.appboy.enums.inappmessage.MessageType r1 = com.appboy.enums.inappmessage.MessageType.HTML_FULL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$appboy$enums$inappmessage$MessageType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appboy.enums.inappmessage.MessageType r1 = com.appboy.enums.inappmessage.MessageType.HTML     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$appboy$enums$inappmessage$MessageType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.appboy.enums.inappmessage.MessageType r1 = com.appboy.enums.inappmessage.MessageType.SLIDEUP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$appboy$enums$inappmessage$MessageType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.appboy.enums.inappmessage.MessageType r1 = com.appboy.enums.inappmessage.MessageType.MODAL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appboy.p044ui.inappmessage.BackgroundInAppMessagePreparer.C19931.<clinit>():void");
        }
    }

    /* renamed from: com.appboy.ui.inappmessage.BackgroundInAppMessagePreparer$BackgroundPreparationRunnable */
    public static class BackgroundPreparationRunnable implements Runnable {
        private final IInAppMessage mInAppMessageToPrepare;
        private final Handler mMainLooperHandler;

        public /* synthetic */ BackgroundPreparationRunnable(Handler handler, IInAppMessage iInAppMessage, C19931 r3) {
            this(handler, iInAppMessage);
        }

        private void displayPreparedInAppMessage(IInAppMessage iInAppMessage) {
            this.mMainLooperHandler.post(new C2000a(iInAppMessage));
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$displayPreparedInAppMessage$0(IInAppMessage iInAppMessage) {
            AppboyLogger.m5448d(BackgroundInAppMessagePreparer.TAG, "Displaying in-app message.");
            AppboyInAppMessageManager.getInstance().displayInAppMessage(iInAppMessage, false);
        }

        public void run() {
            try {
                IInAppMessage access$100 = BackgroundInAppMessagePreparer.prepareInAppMessage(this.mInAppMessageToPrepare);
                if (access$100 == null) {
                    AppboyLogger.m5459w(BackgroundInAppMessagePreparer.TAG, "Cannot display the in-app message because the in-app message was null.");
                } else {
                    displayPreparedInAppMessage(access$100);
                }
            } catch (Exception e) {
                AppboyLogger.m5452e(BackgroundInAppMessagePreparer.TAG, "Caught error while preparing in app message in background", e);
            }
        }

        private BackgroundPreparationRunnable(Handler handler, IInAppMessage iInAppMessage) {
            this.mMainLooperHandler = handler;
            this.mInAppMessageToPrepare = iInAppMessage;
        }
    }

    private static BrazeViewBounds getViewBoundsByType(IInAppMessage iInAppMessage) {
        int i = C19931.$SwitchMap$com$appboy$enums$inappmessage$MessageType[iInAppMessage.getMessageType().ordinal()];
        if (i == 3) {
            return BrazeViewBounds.IN_APP_MESSAGE_SLIDEUP;
        }
        if (i != 4) {
            return BrazeViewBounds.NO_BOUNDS;
        }
        return BrazeViewBounds.IN_APP_MESSAGE_MODAL;
    }

    /* access modifiers changed from: private */
    public static IInAppMessage prepareInAppMessage(IInAppMessage iInAppMessage) {
        if (iInAppMessage.isControl()) {
            AppboyLogger.m5448d(TAG, "Skipping in-app message preparation for control in-app message.");
            return iInAppMessage;
        }
        String str = TAG;
        AppboyLogger.m5448d(str, "Starting asynchronous in-app message preparation for message.");
        int i = C19931.$SwitchMap$com$appboy$enums$inappmessage$MessageType[iInAppMessage.getMessageType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                prepareInAppMessageWithHtml((InAppMessageHtml) iInAppMessage);
            } else if (!prepareInAppMessageWithBitmapDownload(iInAppMessage)) {
                AppboyLogger.m5459w(str, "Logging in-app message image download failure");
                iInAppMessage.logDisplayFailure(InAppMessageFailureType.IMAGE_DOWNLOAD);
                return null;
            }
        } else if (!prepareInAppMessageWithZippedAssetHtml((IInAppMessageZippedAssetHtml) iInAppMessage)) {
            AppboyLogger.m5459w(str, "Logging html in-app message zip asset download failure");
            iInAppMessage.logDisplayFailure(InAppMessageFailureType.ZIP_ASSET_DOWNLOAD);
            return null;
        }
        return iInAppMessage;
    }

    public static void prepareInAppMessageForDisplay(Handler handler, IInAppMessage iInAppMessage) {
        new Thread(new BackgroundPreparationRunnable(handler, iInAppMessage, (C19931) null)).start();
    }

    public static boolean prepareInAppMessageWithBitmapDownload(IInAppMessage iInAppMessage) {
        if (!(iInAppMessage instanceof IInAppMessageWithImage)) {
            AppboyLogger.m5448d(TAG, "Cannot prepare non IInAppMessageWithImage object with bitmap download.");
            return false;
        }
        IInAppMessageWithImage iInAppMessageWithImage = (IInAppMessageWithImage) iInAppMessage;
        if (iInAppMessageWithImage.getBitmap() != null) {
            AppboyLogger.m5453i(TAG, "In-app message already contains image bitmap. Not downloading image from URL.");
            iInAppMessageWithImage.setImageDownloadSuccessful(true);
            return true;
        }
        BrazeViewBounds viewBoundsByType = getViewBoundsByType(iInAppMessage);
        Context applicationContext = AppboyInAppMessageManager.getInstance().getApplicationContext();
        IBrazeImageLoader imageLoader = Braze.getInstance(applicationContext).getImageLoader();
        String localImageUrl = iInAppMessageWithImage.getLocalImageUrl();
        if (!StringUtils.isNullOrBlank(localImageUrl)) {
            String str = TAG;
            AppboyLogger.m5453i(str, "Passing in-app message local image url to image loader: " + localImageUrl);
            iInAppMessageWithImage.setBitmap(imageLoader.getInAppMessageBitmapFromUrl(applicationContext, iInAppMessage, localImageUrl, viewBoundsByType));
            if (iInAppMessageWithImage.getBitmap() != null) {
                iInAppMessageWithImage.setImageDownloadSuccessful(true);
                return true;
            }
            AppboyLogger.m5448d(str, "Removing local image url from IAM since it could not be loaded. URL: " + localImageUrl);
            iInAppMessageWithImage.setLocalImageUrl((String) null);
        }
        String remoteImageUrl = iInAppMessageWithImage.getRemoteImageUrl();
        if (!StringUtils.isNullOrBlank(remoteImageUrl)) {
            String str2 = TAG;
            AppboyLogger.m5453i(str2, "In-app message has remote image url. Downloading image at url: " + remoteImageUrl);
            iInAppMessageWithImage.setBitmap(imageLoader.getInAppMessageBitmapFromUrl(applicationContext, iInAppMessage, remoteImageUrl, viewBoundsByType));
            if (iInAppMessageWithImage.getBitmap() == null) {
                return false;
            }
            iInAppMessageWithImage.setImageDownloadSuccessful(true);
            return true;
        }
        String str3 = TAG;
        AppboyLogger.m5459w(str3, "In-app message has no remote image url. Not downloading image.");
        if (!(iInAppMessageWithImage instanceof InAppMessageFull)) {
            return true;
        }
        AppboyLogger.m5459w(str3, "In-app message full has no remote image url yet is required to have an image. Failing message display.");
        return false;
    }

    public static void prepareInAppMessageWithHtml(InAppMessageHtml inAppMessageHtml) {
        if (inAppMessageHtml.getLocalPrefetchedAssetPaths().isEmpty()) {
            AppboyLogger.m5448d(TAG, "HTML in-app message does not have prefetched assets. Not performing any substitutions.");
        } else {
            inAppMessageHtml.setMessage(WebContentUtils.replacePrefetchedUrlsWithLocalAssets(inAppMessageHtml.getMessage(), inAppMessageHtml.getLocalPrefetchedAssetPaths()));
        }
    }

    public static boolean prepareInAppMessageWithZippedAssetHtml(IInAppMessageZippedAssetHtml iInAppMessageZippedAssetHtml) {
        String localAssetsDirectoryUrl = iInAppMessageZippedAssetHtml.getLocalAssetsDirectoryUrl();
        if (!StringUtils.isNullOrBlank(localAssetsDirectoryUrl) && new File(localAssetsDirectoryUrl).exists()) {
            AppboyLogger.m5453i(TAG, "Local assets for html in-app message are already populated. Not downloading assets.");
            return true;
        } else if (StringUtils.isNullOrBlank(iInAppMessageZippedAssetHtml.getAssetsZipRemoteUrl())) {
            AppboyLogger.m5453i(TAG, "Html in-app message has no remote asset zip. Continuing with in-app message preparation.");
            return true;
        } else {
            String localHtmlUrlFromRemoteUrl = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(AppboyInAppMessageManager.getInstance().getApplicationContext()), iInAppMessageZippedAssetHtml.getAssetsZipRemoteUrl());
            if (!StringUtils.isNullOrBlank(localHtmlUrlFromRemoteUrl)) {
                String str = TAG;
                AppboyLogger.m5448d(str, "Local url for html in-app message assets is " + localHtmlUrlFromRemoteUrl);
                iInAppMessageZippedAssetHtml.setLocalAssetsDirectoryUrl(localHtmlUrlFromRemoteUrl);
                return true;
            }
            String str2 = TAG;
            StringBuilder k = C13555b.m33972k("Download of html content to local directory failed for remote url: ");
            k.append(iInAppMessageZippedAssetHtml.getAssetsZipRemoteUrl());
            k.append(" . Returned local url is: ");
            k.append(localHtmlUrlFromRemoteUrl);
            AppboyLogger.m5459w(str2, k.toString());
            return false;
        }
    }
}
