package com.appboy.support;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import androidx.annotation.Keep;
import java.util.List;
import java.util.Random;

@Keep
public final class IntentUtils {
    public static final String TAG = AppboyLogger.getBrazeLogTag(IntentUtils.class);
    public static final Random mRandom = new Random();

    public static void addComponentAndSendBroadcast(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null) {
            String str = TAG;
            StringBuilder k = C13555b.m33972k("No components found for the following intent: ");
            k.append(intent.getAction());
            AppboyLogger.m5448d(str, k.toString());
            return;
        }
        for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            context.sendBroadcast(intent2);
        }
    }

    public static int getDefaultPendingIntentFlags() {
        return Build.VERSION.SDK_INT >= 23 ? 67108864 : 0;
    }

    public static int getRequestCode() {
        return mRandom.nextInt();
    }
}
