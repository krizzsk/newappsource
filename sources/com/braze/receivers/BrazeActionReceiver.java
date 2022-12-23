package com.braze.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import androidx.annotation.Keep;
import com.appboy.AppboyInternal;
import com.appboy.Constants;
import com.appboy.models.outgoing.FacebookUser;
import com.appboy.support.AppboyLogger;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import p030bo.app.C1546c0;
import p030bo.app.C1602i2;
import p030bo.app.C1643n2;

@Keep
public class BrazeActionReceiver extends BroadcastReceiver {
    public static final String TAG = AppboyLogger.getBrazeLogTag(BrazeActionReceiver.class);

    /* renamed from: com.braze.receivers.BrazeActionReceiver$a */
    public static class C2113a implements Runnable {

        /* renamed from: b */
        public final String f6864b;

        /* renamed from: c */
        public final Context f6865c;

        /* renamed from: d */
        public final BroadcastReceiver.PendingResult f6866d;

        /* renamed from: e */
        public final Intent f6867e;

        public C2113a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f6865c = context;
            this.f6867e = intent;
            this.f6864b = intent.getAction();
            this.f6866d = pendingResult;
        }

        /* renamed from: a */
        public final void mo10819a() {
            if (this.f6864b == null) {
                AppboyLogger.m5448d(BrazeActionReceiver.TAG, "Received intent with null action. Doing nothing.");
                return;
            }
            String access$000 = BrazeActionReceiver.TAG;
            StringBuilder k = C13555b.m33972k("Received intent with action ");
            k.append(this.f6864b);
            AppboyLogger.m5448d(access$000, k.toString());
            String str = this.f6864b;
            str.getClass();
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -2132207887:
                    if (str.equals(Constants.APPBOY_ACTION_RECEIVER_GEOFENCE_UPDATE_INTENT_ACTION)) {
                        c = 0;
                        break;
                    }
                    break;
                case 94647129:
                    if (str.equals(Constants.APPBOY_ACTION_RECEIVER_SINGLE_LOCATION_UPDATE_INTENT_ACTION)) {
                        c = 1;
                        break;
                    }
                    break;
                case 886994795:
                    if (str.equals(Constants.APPBOY_ACTION_RECEIVER_GEOFENCE_LOCATION_UPDATE_INTENT_ACTION)) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    String access$0002 = BrazeActionReceiver.TAG;
                    StringBuilder k2 = C13555b.m33972k("AppboyActionReceiver received intent with geofence transition: ");
                    k2.append(this.f6864b);
                    AppboyLogger.m5448d(access$0002, k2.toString());
                    Context context = this.f6865c;
                    GeofencingEvent fromIntent = GeofencingEvent.fromIntent(this.f6867e);
                    if (fromIntent.hasError()) {
                        int errorCode = fromIntent.getErrorCode();
                        String access$0003 = BrazeActionReceiver.TAG;
                        AppboyLogger.m5459w(access$0003, "AppboyLocation Services error: " + errorCode);
                        return;
                    }
                    int geofenceTransition = fromIntent.getGeofenceTransition();
                    List<Geofence> triggeringGeofences = fromIntent.getTriggeringGeofences();
                    if (1 == geofenceTransition) {
                        for (Geofence requestId : triggeringGeofences) {
                            AppboyInternal.recordGeofenceTransition(context, requestId.getRequestId(), C1546c0.ENTER);
                        }
                        return;
                    } else if (2 == geofenceTransition) {
                        for (Geofence requestId2 : triggeringGeofences) {
                            AppboyInternal.recordGeofenceTransition(context, requestId2.getRequestId(), C1546c0.EXIT);
                        }
                        return;
                    } else {
                        String access$0004 = BrazeActionReceiver.TAG;
                        AppboyLogger.m5459w(access$0004, "Unsupported transition type received: " + geofenceTransition);
                        return;
                    }
                case 1:
                    String access$0005 = BrazeActionReceiver.TAG;
                    StringBuilder k3 = C13555b.m33972k("AppboyActionReceiver received intent with single location update: ");
                    k3.append(this.f6864b);
                    AppboyLogger.m5448d(access$0005, k3.toString());
                    Location location = (Location) this.f6867e.getExtras().get(FacebookUser.LOCATION_OUTER_OBJECT_KEY);
                    try {
                        AppboyInternal.logLocationRecordedEvent(this.f6865c, new C1643n2(location));
                        return;
                    } catch (Exception e) {
                        AppboyLogger.m5452e(BrazeActionReceiver.TAG, "Exception while processing single location update", e);
                        return;
                    }
                case 2:
                    if (LocationResult.hasResult(this.f6867e)) {
                        String access$0006 = BrazeActionReceiver.TAG;
                        StringBuilder k4 = C13555b.m33972k("AppboyActionReceiver received intent with location result: ");
                        k4.append(this.f6864b);
                        AppboyLogger.m5448d(access$0006, k4.toString());
                        try {
                            AppboyInternal.requestGeofenceRefresh(this.f6865c, (C1602i2) new C1643n2(LocationResult.extractResult(this.f6867e).getLastLocation()));
                            return;
                        } catch (Exception e2) {
                            AppboyLogger.m5452e(BrazeActionReceiver.TAG, "Exception while processing location result", e2);
                            return;
                        }
                    } else {
                        String access$0007 = BrazeActionReceiver.TAG;
                        StringBuilder k5 = C13555b.m33972k("AppboyActionReceiver received intent without location result: ");
                        k5.append(this.f6864b);
                        AppboyLogger.m5459w(access$0007, k5.toString());
                        return;
                    }
                default:
                    String access$0008 = BrazeActionReceiver.TAG;
                    StringBuilder k6 = C13555b.m33972k("Unknown intent received in AppboyActionReceiver with action: ");
                    k6.append(this.f6864b);
                    AppboyLogger.m5459w(access$0008, k6.toString());
                    return;
            }
        }

        public final void run() {
            try {
                mo10819a();
            } catch (Exception e) {
                String access$000 = BrazeActionReceiver.TAG;
                StringBuilder k = C13555b.m33972k("Caught exception while performing the AppboyActionReceiver work. Action: ");
                k.append(this.f6864b);
                k.append(" Intent: ");
                k.append(this.f6867e);
                AppboyLogger.m5452e(access$000, k.toString(), e);
            }
            this.f6866d.finish();
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            AppboyLogger.m5459w(TAG, "AppboyActionReceiver received null intent. Doing nothing.");
        } else {
            new Thread(new C2113a(context.getApplicationContext(), intent, goAsync())).start();
        }
    }
}
