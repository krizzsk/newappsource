package com.appboy;

import android.content.Context;
import com.appboy.p044ui.actions.NewsfeedAction;
import com.appboy.p044ui.actions.UriAction;

public interface IAppboyNavigator {

    public enum IntentFlagPurpose {
        NOTIFICATION_ACTION_WITH_DEEPLINK,
        NOTIFICATION_PUSH_STORY_PAGE_CLICK,
        URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY,
        URI_ACTION_OPEN_WITH_ACTION_VIEW,
        URI_ACTION_BACK_STACK_GET_ROOT_INTENT,
        URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT,
        URI_UTILS_GET_MAIN_ACTIVITY_INTENT
    }

    int getIntentFlags(IntentFlagPurpose intentFlagPurpose);

    void gotoNewsFeed(Context context, NewsfeedAction newsfeedAction);

    void gotoUri(Context context, UriAction uriAction);
}
