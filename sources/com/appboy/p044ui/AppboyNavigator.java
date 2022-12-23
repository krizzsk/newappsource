package com.appboy.p044ui;

import android.content.Context;
import com.appboy.IAppboyNavigator;
import com.appboy.p044ui.actions.NewsfeedAction;
import com.appboy.p044ui.actions.UriAction;
import com.appboy.support.AppboyLogger;

/* renamed from: com.appboy.ui.AppboyNavigator */
public class AppboyNavigator implements IAppboyNavigator {
    private static final String TAG = AppboyLogger.getBrazeLogTag(AppboyNavigator.class);
    private static final IAppboyNavigator sDefaultAppboyNavigator = new AppboyNavigator();

    /* renamed from: com.appboy.ui.AppboyNavigator$1 */
    public static /* synthetic */ class C19851 {
        public static final /* synthetic */ int[] $SwitchMap$com$appboy$IAppboyNavigator$IntentFlagPurpose;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.appboy.IAppboyNavigator$IntentFlagPurpose[] r0 = com.appboy.IAppboyNavigator.IntentFlagPurpose.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$appboy$IAppboyNavigator$IntentFlagPurpose = r0
                com.appboy.IAppboyNavigator$IntentFlagPurpose r1 = com.appboy.IAppboyNavigator.IntentFlagPurpose.NOTIFICATION_ACTION_WITH_DEEPLINK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$appboy$IAppboyNavigator$IntentFlagPurpose     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appboy.IAppboyNavigator$IntentFlagPurpose r1 = com.appboy.IAppboyNavigator.IntentFlagPurpose.NOTIFICATION_PUSH_STORY_PAGE_CLICK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$appboy$IAppboyNavigator$IntentFlagPurpose     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.appboy.IAppboyNavigator$IntentFlagPurpose r1 = com.appboy.IAppboyNavigator.IntentFlagPurpose.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$appboy$IAppboyNavigator$IntentFlagPurpose     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.appboy.IAppboyNavigator$IntentFlagPurpose r1 = com.appboy.IAppboyNavigator.IntentFlagPurpose.URI_ACTION_OPEN_WITH_ACTION_VIEW     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$appboy$IAppboyNavigator$IntentFlagPurpose     // Catch:{ NoSuchFieldError -> 0x003e }
                com.appboy.IAppboyNavigator$IntentFlagPurpose r1 = com.appboy.IAppboyNavigator.IntentFlagPurpose.URI_UTILS_GET_MAIN_ACTIVITY_INTENT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$appboy$IAppboyNavigator$IntentFlagPurpose     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.appboy.IAppboyNavigator$IntentFlagPurpose r1 = com.appboy.IAppboyNavigator.IntentFlagPurpose.URI_ACTION_BACK_STACK_GET_ROOT_INTENT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$appboy$IAppboyNavigator$IntentFlagPurpose     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.appboy.IAppboyNavigator$IntentFlagPurpose r1 = com.appboy.IAppboyNavigator.IntentFlagPurpose.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appboy.p044ui.AppboyNavigator.C19851.<clinit>():void");
        }
    }

    public static void executeNewsFeedAction(Context context, NewsfeedAction newsfeedAction) {
        if (newsfeedAction == null) {
            AppboyLogger.m5459w(TAG, "IAppboyNavigator cannot open News feed because the news feed action object was null.");
        } else {
            newsfeedAction.execute(context);
        }
    }

    public static void executeUriAction(Context context, UriAction uriAction) {
        if (uriAction == null) {
            AppboyLogger.m5459w(TAG, "IAppboyNavigator cannot open Uri because the Uri action object was null.");
        } else {
            uriAction.execute(context);
        }
    }

    public static IAppboyNavigator getAppboyNavigator() {
        return sDefaultAppboyNavigator;
    }

    public int getIntentFlags(IAppboyNavigator.IntentFlagPurpose intentFlagPurpose) {
        switch (C19851.$SwitchMap$com$appboy$IAppboyNavigator$IntentFlagPurpose[intentFlagPurpose.ordinal()]) {
            case 1:
            case 2:
                return 1073741824;
            case 3:
            case 4:
            case 5:
                return 872415232;
            case 6:
            case 7:
                return 268435456;
            default:
                return 0;
        }
    }

    public void gotoNewsFeed(Context context, NewsfeedAction newsfeedAction) {
        executeNewsFeedAction(context, newsfeedAction);
    }

    public void gotoUri(Context context, UriAction uriAction) {
        executeUriAction(context, uriAction);
    }
}
