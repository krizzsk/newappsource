package p673nf;

import com.google.firebase.perf.util.Constants$CounterNames;
import java.util.Locale;

/* renamed from: nf.e */
public abstract class C18547e {
    /* renamed from: b */
    public static void m45465b(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Attribute key must not be null or empty");
        } else if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        } else if (str.length() > 40) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute key length must not exceed %d characters", new Object[]{40}));
        } else if (str2.length() > 100) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute value length must not exceed %d characters", new Object[]{100}));
        } else if (!str.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
            throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }

    /* renamed from: c */
    public static String m45466c(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", new Object[]{100});
        } else if (!str.startsWith("_")) {
            return null;
        } else {
            for (Constants$CounterNames constants$CounterNames : Constants$CounterNames.values()) {
                if (constants$CounterNames.toString().equals(str)) {
                    return null;
                }
            }
            return "Metric name must not start with '_'";
        }
    }

    /* renamed from: a */
    public abstract boolean mo50952a();
}
