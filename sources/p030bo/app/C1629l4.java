package p030bo.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import com.appboy.support.IntentUtils;
import com.appboy.support.StringUtils;
import com.braze.models.BrazeGeofence;
import com.braze.receivers.BrazeActionReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.l4 */
public final class C1629l4 {

    /* renamed from: a */
    public static final String f5817a = AppboyLogger.getBrazeLogTag(C1629l4.class);

    /* renamed from: a */
    public static PendingIntent m4451a(Context context) {
        return PendingIntent.getBroadcast(context, 0, new Intent(Constants.APPBOY_ACTION_RECEIVER_GEOFENCE_LOCATION_UPDATE_INTENT_ACTION).setClass(context, BrazeActionReceiver.class), IntentUtils.getDefaultPendingIntentFlags() | 134217728);
    }

    /* renamed from: b */
    public static PendingIntent m4455b(Context context) {
        return PendingIntent.getBroadcast(context, 0, new Intent(Constants.APPBOY_ACTION_RECEIVER_GEOFENCE_UPDATE_INTENT_ACTION).setClass(context, BrazeActionReceiver.class), IntentUtils.getDefaultPendingIntentFlags() | 134217728);
    }

    /* renamed from: a */
    public static boolean m4453a(C1558d4 d4Var) {
        if (!d4Var.mo6011g()) {
            AppboyLogger.m5453i(f5817a, "Geofences implicitly disabled via server configuration.");
            return false;
        } else if (d4Var.mo6010f()) {
            AppboyLogger.m5453i(f5817a, "Geofences enabled in server configuration.");
            return true;
        } else {
            AppboyLogger.m5453i(f5817a, "Geofences explicitly disabled via server configuration.");
            return false;
        }
    }

    /* renamed from: b */
    public static int m4454b(C1558d4 d4Var) {
        if (d4Var.mo6012h() > 0) {
            return d4Var.mo6012h();
        }
        return 20;
    }

    /* renamed from: a */
    public static List<BrazeGeofence> m4452a(SharedPreferences sharedPreferences) {
        ArrayList arrayList = new ArrayList();
        Map<String, ?> all = sharedPreferences.getAll();
        if (all == null || all.size() == 0) {
            AppboyLogger.m5448d(f5817a, "Did not find stored geofences.");
            return arrayList;
        }
        Set<String> keySet = all.keySet();
        if (keySet == null || keySet.size() == 0) {
            AppboyLogger.m5459w(f5817a, "Failed to find stored geofence keys.");
            return arrayList;
        }
        for (String next : keySet) {
            String string = sharedPreferences.getString(next, (String) null);
            try {
                if (StringUtils.isNullOrBlank(string)) {
                    String str = f5817a;
                    AppboyLogger.m5459w(str, "Received null or blank serialized  geofence string for geofence id " + next + " from shared preferences. Not parsing.");
                } else {
                    arrayList.add(new BrazeGeofence(new JSONObject(string)));
                }
            } catch (JSONException e) {
                String str2 = f5817a;
                AppboyLogger.m5452e(str2, "Encountered Json exception while parsing stored geofence: " + string, e);
            } catch (Exception e2) {
                String str3 = f5817a;
                AppboyLogger.m5452e(str3, "Encountered unexpected exception while parsing stored geofence: " + string, e2);
            }
        }
        return arrayList;
    }
}
