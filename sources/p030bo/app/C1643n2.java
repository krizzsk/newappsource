package p030bo.app;

import android.location.Location;
import com.appboy.support.AppboyLogger;
import com.appboy.support.ValidationUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.n2 */
public final class C1643n2 implements C1602i2 {

    /* renamed from: e */
    public static final String f5858e = AppboyLogger.getBrazeLogTag(C1643n2.class);

    /* renamed from: a */
    public final double f5859a;

    /* renamed from: b */
    public final double f5860b;

    /* renamed from: c */
    public final Double f5861c;

    /* renamed from: d */
    public final Double f5862d;

    public C1643n2(Location location) {
        this(location.getLatitude(), location.getLongitude(), Double.valueOf(location.getAltitude()), Double.valueOf((double) location.getAccuracy()));
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("latitude", this.f5859a);
            jSONObject.put("longitude", this.f5860b);
            if (mo6252w()) {
                jSONObject.put("altitude", this.f5861c);
            }
            if (mo6251v()) {
                jSONObject.put("ll_accuracy", this.f5862d);
            }
        } catch (JSONException e) {
            AppboyLogger.m5452e(f5858e, "Caught exception creating location Json.", e);
        }
        return jSONObject;
    }

    public double getLatitude() {
        return this.f5859a;
    }

    public double getLongitude() {
        return this.f5860b;
    }

    /* renamed from: v */
    public boolean mo6251v() {
        return this.f5862d != null;
    }

    /* renamed from: w */
    public boolean mo6252w() {
        return this.f5861c != null;
    }

    public C1643n2(double d, double d2) {
        this(d, d2, (Double) null, (Double) null);
    }

    public C1643n2(double d, double d2, Double d3, Double d4) {
        if (ValidationUtils.isValidLocation(d, d2)) {
            this.f5859a = d;
            this.f5860b = d2;
            this.f5861c = d3;
            this.f5862d = d4;
            return;
        }
        throw new IllegalArgumentException("Unable to create AppboyLocation. Latitude and longitude values are bounded by ±90 and ±180 respectively");
    }
}
