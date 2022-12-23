package com.appboy.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.appboy.Constants;
import com.appboy.IAppboyNavigator;
import com.appboy.models.push.BrazeNotificationPayload;
import com.appboy.p044ui.AppboyNavigator;
import com.appboy.support.AppboyLogger;
import com.appboy.support.IntentUtils;
import com.braze.Braze;
import java.util.ArrayList;
import java.util.List;
import p067e1.C4495j0;
import p067e1.C4514t;
import p067e1.C4522y;

public class AppboyNotificationActionUtils {
    private static final String TAG = AppboyLogger.getBrazeLogTag(AppboyNotificationActionUtils.class);

    public static void addNotificationAction(C4522y yVar, BrazeNotificationPayload brazeNotificationPayload, BrazeNotificationPayload.ActionButton actionButton) {
        PendingIntent pendingIntent;
        C4495j0[] j0VarArr;
        C4495j0[] j0VarArr2;
        Context context = brazeNotificationPayload.getContext();
        if (context == null) {
            AppboyLogger.m5448d(TAG, "Cannot add notification action with null context from payload");
            return;
        }
        Bundle bundle = new Bundle(brazeNotificationPayload.getNotificationExtras());
        bundle.putInt(Constants.APPBOY_ACTION_INDEX_KEY, actionButton.getActionIndex());
        String type = actionButton.getType();
        bundle.putString(Constants.APPBOY_ACTION_TYPE_KEY, type);
        bundle.putString(Constants.APPBOY_ACTION_ID_KEY, actionButton.getActionId());
        bundle.putString(Constants.APPBOY_ACTION_URI_KEY, actionButton.getUri());
        bundle.putString(Constants.APPBOY_ACTION_USE_WEBVIEW_KEY, actionButton.getUseWebview());
        int defaultPendingIntentFlags = 134217728 | IntentUtils.getDefaultPendingIntentFlags();
        if (Constants.APPBOY_PUSH_ACTION_TYPE_NONE.equals(type)) {
            String str = TAG;
            StringBuilder l = C13555b.m33973l("Adding notification action with type: ", type, " . Setting intent class to notification receiver: ");
            l.append(AppboyNotificationUtils.getNotificationReceiverClass());
            AppboyLogger.m5457v(str, l.toString());
            Intent intent = new Intent(Constants.APPBOY_ACTION_CLICKED_ACTION).setClass(context, AppboyNotificationUtils.getNotificationReceiverClass());
            intent.putExtras(bundle);
            pendingIntent = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, defaultPendingIntentFlags);
        } else {
            AppboyLogger.m5457v(TAG, "Adding notification action with type: " + type + " Setting intent class to trampoline activity");
            Intent intent2 = new Intent(Constants.APPBOY_ACTION_CLICKED_ACTION).setClass(context, NotificationTrampolineActivity.class);
            intent2.setFlags(intent2.getFlags() | AppboyNavigator.getAppboyNavigator().getIntentFlags(IAppboyNavigator.IntentFlagPurpose.NOTIFICATION_ACTION_WITH_DEEPLINK));
            intent2.putExtras(bundle);
            pendingIntent = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent2, defaultPendingIntentFlags);
        }
        PendingIntent pendingIntent2 = pendingIntent;
        String text = actionButton.getText();
        Bundle bundle2 = new Bundle();
        CharSequence b = C4522y.m11766b(text);
        bundle2.putAll(new Bundle(bundle));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.isEmpty()) {
            j0VarArr = null;
        } else {
            j0VarArr = (C4495j0[]) arrayList.toArray(new C4495j0[arrayList.size()]);
        }
        if (arrayList2.isEmpty()) {
            j0VarArr2 = null;
        } else {
            j0VarArr2 = (C4495j0[]) arrayList2.toArray(new C4495j0[arrayList2.size()]);
        }
        yVar.f15621b.add(new C4514t((IconCompat) null, b, pendingIntent2, bundle2, j0VarArr2, j0VarArr, true, 0, true, false, false));
        AppboyLogger.m5457v(TAG, "Added action with bundle: " + bundle);
    }

    public static void addNotificationActions(C4522y yVar, BrazeNotificationPayload brazeNotificationPayload) {
        if (brazeNotificationPayload.getContext() == null) {
            AppboyLogger.m5448d(TAG, "Context cannot be null when adding notification buttons.");
            return;
        }
        List<BrazeNotificationPayload.ActionButton> actionButtons = brazeNotificationPayload.getActionButtons();
        if (actionButtons.isEmpty()) {
            AppboyLogger.m5448d(TAG, "No action buttons present. Not adding notification actions");
            return;
        }
        for (BrazeNotificationPayload.ActionButton next : actionButtons) {
            String str = TAG;
            AppboyLogger.m5457v(str, "Adding action button: " + next);
            addNotificationAction(yVar, brazeNotificationPayload, next);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0089 A[Catch:{ Exception -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void handleNotificationActionClicked(android.content.Context r6, android.content.Intent r7) {
        /*
            java.lang.String r0 = "appboy_action_use_webview"
            java.lang.String r1 = "appboy_action_uri"
            java.lang.String r2 = "ab_uri"
            java.lang.String r3 = "appboy_action_type"
            java.lang.String r3 = r7.getStringExtra(r3)     // Catch:{ Exception -> 0x008d }
            boolean r4 = com.appboy.support.StringUtils.isNullOrBlank(r3)     // Catch:{ Exception -> 0x008d }
            if (r4 == 0) goto L_0x001a
            java.lang.String r6 = TAG     // Catch:{ Exception -> 0x008d }
            java.lang.String r7 = "Notification action button type was blank or null. Doing nothing."
            com.appboy.support.AppboyLogger.m5459w((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ Exception -> 0x008d }
            return
        L_0x001a:
            java.lang.String r4 = "nid"
            r5 = -1
            int r4 = r7.getIntExtra(r4, r5)     // Catch:{ Exception -> 0x008d }
            logNotificationActionClicked(r6, r7, r3)     // Catch:{ Exception -> 0x008d }
            boolean r5 = r3.equals(r2)     // Catch:{ Exception -> 0x008d }
            if (r5 != 0) goto L_0x0047
            java.lang.String r5 = "ab_open"
            boolean r5 = r3.equals(r5)     // Catch:{ Exception -> 0x008d }
            if (r5 == 0) goto L_0x0033
            goto L_0x0047
        L_0x0033:
            java.lang.String r7 = "ab_none"
            boolean r7 = r3.equals(r7)     // Catch:{ Exception -> 0x008d }
            if (r7 == 0) goto L_0x003f
            com.appboy.push.AppboyNotificationUtils.cancelNotification(r6, r4)     // Catch:{ Exception -> 0x008d }
            goto L_0x0095
        L_0x003f:
            java.lang.String r6 = TAG     // Catch:{ Exception -> 0x008d }
            java.lang.String r7 = "Unknown notification action button clicked. Doing nothing."
            com.appboy.support.AppboyLogger.m5459w((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ Exception -> 0x008d }
            goto L_0x0095
        L_0x0047:
            com.appboy.push.AppboyNotificationUtils.cancelNotification(r6, r4)     // Catch:{ Exception -> 0x008d }
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x008d }
            java.lang.String r3 = "uri"
            if (r2 == 0) goto L_0x0078
            android.os.Bundle r2 = r7.getExtras()     // Catch:{ Exception -> 0x008d }
            boolean r2 = r2.containsKey(r1)     // Catch:{ Exception -> 0x008d }
            if (r2 == 0) goto L_0x0078
            java.lang.String r1 = r7.getStringExtra(r1)     // Catch:{ Exception -> 0x008d }
            r7.putExtra(r3, r1)     // Catch:{ Exception -> 0x008d }
            android.os.Bundle r1 = r7.getExtras()     // Catch:{ Exception -> 0x008d }
            boolean r1 = r1.containsKey(r0)     // Catch:{ Exception -> 0x008d }
            if (r1 == 0) goto L_0x007b
            java.lang.String r1 = "ab_use_webview"
            java.lang.String r0 = r7.getStringExtra(r0)     // Catch:{ Exception -> 0x008d }
            r7.putExtra(r1, r0)     // Catch:{ Exception -> 0x008d }
            goto L_0x007b
        L_0x0078:
            r7.removeExtra(r3)     // Catch:{ Exception -> 0x008d }
        L_0x007b:
            com.appboy.push.AppboyNotificationUtils.sendNotificationOpenedBroadcast(r6, r7)     // Catch:{ Exception -> 0x008d }
            com.braze.configuration.BrazeConfigurationProvider r0 = new com.braze.configuration.BrazeConfigurationProvider     // Catch:{ Exception -> 0x008d }
            r0.<init>(r6)     // Catch:{ Exception -> 0x008d }
            boolean r0 = r0.getHandlePushDeepLinksAutomatically()     // Catch:{ Exception -> 0x008d }
            if (r0 == 0) goto L_0x0095
            com.appboy.push.AppboyNotificationUtils.routeUserWithNotificationOpenedIntent(r6, r7)     // Catch:{ Exception -> 0x008d }
            goto L_0x0095
        L_0x008d:
            r6 = move-exception
            java.lang.String r7 = TAG
            java.lang.String r0 = "Caught exception while handling notification action button click."
            com.appboy.support.AppboyLogger.m5452e(r7, r0, r6)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appboy.push.AppboyNotificationActionUtils.handleNotificationActionClicked(android.content.Context, android.content.Intent):void");
    }

    public static void logNotificationActionClicked(Context context, Intent intent, String str) {
        Braze.getInstance(context).logPushNotificationActionClicked(intent.getStringExtra(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY), intent.getStringExtra(Constants.APPBOY_ACTION_ID_KEY), str);
    }
}
