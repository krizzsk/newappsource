package p043ch.qos.logback.classic;

import com.appboy.models.InAppMessageBase;
import com.braze.models.BrazeGeofence;
import java.io.Serializable;

/* renamed from: ch.qos.logback.classic.Level */
public final class Level implements Serializable {

    /* renamed from: b */
    public static final Level f6369b = new Level(Integer.MAX_VALUE, "OFF");

    /* renamed from: c */
    public static final Level f6370c = new Level(40000, "ERROR");

    /* renamed from: d */
    public static final Level f6371d = new Level(BrazeGeofence.DEFAULT_NOTIFICATION_RESPONSIVENESS_MS, "WARN");

    /* renamed from: e */
    public static final Level f6372e = new Level(20000, "INFO");

    /* renamed from: f */
    public static final Level f6373f = new Level(10000, "DEBUG");

    /* renamed from: g */
    public static final Level f6374g = new Level(InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS, "TRACE");

    /* renamed from: h */
    public static final Level f6375h = new Level(Integer.MIN_VALUE, "ALL");
    private static final long serialVersionUID = -814092767334282137L;
    public final int levelInt;
    public final String levelStr;

    public Level(int i, String str) {
        this.levelInt = i;
        this.levelStr = str;
    }

    /* renamed from: a */
    public static Level m5203a(int i) {
        Level level = f6373f;
        return i != Integer.MIN_VALUE ? i != 5000 ? i != 10000 ? i != 20000 ? i != 30000 ? i != 40000 ? i != Integer.MAX_VALUE ? level : f6369b : f6370c : f6371d : f6372e : level : f6374g : f6375h;
    }

    /* renamed from: b */
    public static Level m5204b(String str) {
        Level level = f6373f;
        if (str == null) {
            return level;
        }
        String trim = str.trim();
        return trim.equalsIgnoreCase("ALL") ? f6375h : trim.equalsIgnoreCase("TRACE") ? f6374g : trim.equalsIgnoreCase("DEBUG") ? level : trim.equalsIgnoreCase("INFO") ? f6372e : trim.equalsIgnoreCase("WARN") ? f6371d : trim.equalsIgnoreCase("ERROR") ? f6370c : trim.equalsIgnoreCase("OFF") ? f6369b : level;
    }

    private Object readResolve() {
        return m5203a(this.levelInt);
    }

    public final String toString() {
        return this.levelStr;
    }
}
