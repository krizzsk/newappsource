package com.braze.models;

import androidx.annotation.Keep;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.JsonUtils;
import com.google.android.gms.location.Geofence;
import org.json.JSONObject;

@Keep
public class BrazeGeofence implements IPutIntoJson<JSONObject>, Comparable<BrazeGeofence> {
    public static final String ANALYTICS_ENABLED_ENTER = "analytics_enabled_enter";
    public static final String ANALYTICS_ENABLED_EXIT = "analytics_enabled_exit";
    public static final String COOLDOWN_ENTER_SECONDS = "cooldown_enter";
    public static final String COOLDOWN_EXIT_SECONDS = "cooldown_exit";
    public static final int DEFAULT_NOTIFICATION_RESPONSIVENESS_MS = 30000;
    public static final String ENTER_EVENTS = "enter_events";
    public static final String EXIT_EVENTS = "exit_events";

    /* renamed from: ID */
    public static final String f6863ID = "id";
    public static final String LATITUDE = "latitude";
    public static final String LONGITUDE = "longitude";
    public static final String NOTIFICATION_RESPONSIVENESS_MS = "notification_responsiveness";
    public static final String RADIUS_METERS = "radius";
    public final boolean mAnalyticsEnabledEnter;
    public final boolean mAnalyticsEnabledExit;
    public final int mCooldownEnterSeconds;
    public final int mCooldownExitSeconds;
    public double mDistanceFromGeofenceRefresh;
    public final boolean mEnterEvents;
    public final boolean mExitEvents;
    public final String mId;
    public final JSONObject mJsonObject;
    public final double mLatitude;
    public final double mLongitude;
    public final int mNotificationResponsivenessMs;
    public final int mRadiusMeters;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BrazeGeofence(org.json.JSONObject r17) {
        /*
            r16 = this;
            r1 = r17
            java.lang.String r0 = "id"
            java.lang.String r2 = r1.getString(r0)
            java.lang.String r0 = "latitude"
            double r3 = r1.getDouble(r0)
            java.lang.String r0 = "longitude"
            double r5 = r1.getDouble(r0)
            java.lang.String r0 = "radius"
            int r7 = r1.getInt(r0)
            java.lang.String r0 = "cooldown_enter"
            int r8 = r1.getInt(r0)
            java.lang.String r0 = "cooldown_exit"
            int r9 = r1.getInt(r0)
            java.lang.String r0 = "analytics_enabled_enter"
            boolean r10 = r1.getBoolean(r0)
            java.lang.String r0 = "analytics_enabled_exit"
            boolean r11 = r1.getBoolean(r0)
            java.lang.String r0 = "enter_events"
            r12 = 1
            boolean r13 = r1.optBoolean(r0, r12)
            java.lang.String r0 = "exit_events"
            boolean r14 = r1.optBoolean(r0, r12)
            java.lang.String r0 = "notification_responsiveness"
            r12 = 30000(0x7530, float:4.2039E-41)
            int r15 = r1.optInt(r0, r12)
            r0 = r16
            r12 = r13
            r13 = r14
            r14 = r15
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.models.BrazeGeofence.<init>(org.json.JSONObject):void");
    }

    public boolean equivalentServerData(BrazeGeofence brazeGeofence) {
        try {
            return JsonUtils.areJsonObjectsEqual(this.mJsonObject, brazeGeofence.forJsonPut());
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean getAnalyticsEnabledEnter() {
        return this.mAnalyticsEnabledEnter;
    }

    public boolean getAnalyticsEnabledExit() {
        return this.mAnalyticsEnabledExit;
    }

    public int getCooldownEnterSeconds() {
        return this.mCooldownEnterSeconds;
    }

    public int getCooldownExitSeconds() {
        return this.mCooldownExitSeconds;
    }

    public double getDistanceFromGeofenceRefresh() {
        return this.mDistanceFromGeofenceRefresh;
    }

    public String getId() {
        return this.mId;
    }

    public double getLatitude() {
        return this.mLatitude;
    }

    public double getLongitude() {
        return this.mLongitude;
    }

    public double getRadiusMeters() {
        return (double) this.mRadiusMeters;
    }

    public void setDistanceFromGeofenceRefresh(double d) {
        this.mDistanceFromGeofenceRefresh = d;
    }

    public Geofence toGeofence() {
        Geofence.Builder builder = new Geofence.Builder();
        builder.setRequestId(this.mId).setCircularRegion(this.mLatitude, this.mLongitude, (float) this.mRadiusMeters).setNotificationResponsiveness(this.mNotificationResponsivenessMs).setExpirationDuration(-1);
        boolean z = this.mEnterEvents;
        if (this.mExitEvents) {
            z |= true;
        }
        builder.setTransitionTypes(z ? 1 : 0);
        return builder.build();
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("AppboyGeofence{id=");
        k.append(this.mId);
        k.append(", latitude='");
        k.append(this.mLatitude);
        k.append(", longitude=");
        k.append(this.mLongitude);
        k.append(", radiusMeters=");
        k.append(this.mRadiusMeters);
        k.append(", cooldownEnterSeconds=");
        k.append(this.mCooldownEnterSeconds);
        k.append(", cooldownExitSeconds=");
        k.append(this.mCooldownExitSeconds);
        k.append(", analyticsEnabledEnter=");
        k.append(this.mAnalyticsEnabledEnter);
        k.append(", analyticsEnabledExit=");
        k.append(this.mAnalyticsEnabledExit);
        k.append(", enterEvents=");
        k.append(this.mEnterEvents);
        k.append(", exitEvents=");
        k.append(this.mExitEvents);
        k.append(", notificationResponsivenessMs=");
        k.append(this.mNotificationResponsivenessMs);
        k.append(", distanceFromGeofenceRefresh=");
        k.append(this.mDistanceFromGeofenceRefresh);
        k.append('}');
        return k.toString();
    }

    public int compareTo(BrazeGeofence brazeGeofence) {
        double d = this.mDistanceFromGeofenceRefresh;
        if (d != -1.0d && d < brazeGeofence.getDistanceFromGeofenceRefresh()) {
            return -1;
        }
        return 1;
    }

    public JSONObject forJsonPut() {
        return this.mJsonObject;
    }

    public BrazeGeofence(JSONObject jSONObject, String str, double d, double d2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, int i4) {
        this.mDistanceFromGeofenceRefresh = -1.0d;
        this.mJsonObject = jSONObject;
        this.mId = str;
        this.mLatitude = d;
        this.mLongitude = d2;
        this.mRadiusMeters = i;
        this.mCooldownEnterSeconds = i2;
        this.mCooldownExitSeconds = i3;
        this.mAnalyticsEnabledEnter = z;
        this.mAnalyticsEnabledExit = z2;
        this.mEnterEvents = z3;
        this.mExitEvents = z4;
        this.mNotificationResponsivenessMs = i4;
    }
}
