package p784rx;

import android.content.Context;
import android.content.SharedPreferences;
import com.moovit.app.tracking.TrackingEvent;

@Deprecated
/* renamed from: rx.c */
public final class C19377c {
    /* renamed from: a */
    public static boolean m46656a(Context context, TrackingEvent trackingEvent, Runnable runnable) {
        boolean z;
        if (context.getSharedPreferences("events_tracker_store", 0).getInt(trackingEvent.getPrefsKey(), 0) >= trackingEvent.getMaxOccurrences()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        runnable.run();
        SharedPreferences sharedPreferences = context.getSharedPreferences("events_tracker_store", 0);
        sharedPreferences.edit().putInt(trackingEvent.getPrefsKey(), sharedPreferences.getInt(trackingEvent.getPrefsKey(), 0) + 1).apply();
        return true;
    }
}
