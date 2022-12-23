package p030bo.app;

import com.appboy.models.outgoing.AppboyProperties;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.appboy.support.JsonUtils;
import com.braze.enums.BrazeDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.g5 */
public class C1588g5 implements C1551c5 {

    /* renamed from: e */
    public static final String f5723e = AppboyLogger.getBrazeLogTag(C1588g5.class);

    /* renamed from: a */
    public final C1697t5 f5724a;

    /* renamed from: b */
    public final String f5725b;

    /* renamed from: c */
    public final int f5726c;

    /* renamed from: d */
    public Object f5727d;

    /* renamed from: bo.app.g5$a */
    public static /* synthetic */ class C1589a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5728a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                bo.app.t5[] r0 = p030bo.app.C1697t5.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5728a = r0
                bo.app.t5 r1 = p030bo.app.C1697t5.STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5728a     // Catch:{ NoSuchFieldError -> 0x001d }
                bo.app.t5 r1 = p030bo.app.C1697t5.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5728a     // Catch:{ NoSuchFieldError -> 0x0028 }
                bo.app.t5 r1 = p030bo.app.C1697t5.DATE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5728a     // Catch:{ NoSuchFieldError -> 0x0033 }
                bo.app.t5 r1 = p030bo.app.C1697t5.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1588g5.C1589a.<clinit>():void");
        }
    }

    public C1588g5(C1697t5 t5Var, String str, int i) {
        this.f5724a = t5Var;
        this.f5725b = str;
        this.f5726c = i;
    }

    /* renamed from: a */
    public boolean mo5898a(C1721w5 w5Var) {
        if (!(w5Var instanceof C1728x5)) {
            return false;
        }
        AppboyProperties b = ((C1728x5) w5Var).mo6053b();
        Object obj = null;
        if (b != null) {
            try {
                obj = b.forJsonPut().opt(this.f5725b);
            } catch (Exception e) {
                AppboyLogger.m5452e(f5723e, "Caught exception checking property filter condition.", e);
                return false;
            }
        }
        if (obj == null) {
            int i = this.f5726c;
            if (i == 12 || i == 17 || i == 2) {
                return true;
            }
            return false;
        }
        int i2 = this.f5726c;
        if (i2 == 11) {
            return true;
        }
        if (i2 == 12) {
            return false;
        }
        int i3 = C1589a.f5728a[this.f5724a.ordinal()];
        if (i3 == 1) {
            return mo6121c(obj);
        }
        if (i3 == 2) {
            return mo6118a(obj);
        }
        if (i3 == 3) {
            return mo6119a(obj, w5Var.mo6021c());
        }
        if (i3 != 4) {
            return false;
        }
        return mo6120b(obj);
    }

    /* renamed from: b */
    public final boolean mo6120b(Object obj) {
        if ((obj instanceof Integer) || (obj instanceof Double)) {
            double doubleValue = ((Number) obj).doubleValue();
            double doubleValue2 = ((Number) this.f5727d).doubleValue();
            int i = this.f5726c;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 5 && doubleValue < doubleValue2) {
                            return true;
                        }
                        return false;
                    } else if (doubleValue > doubleValue2) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (doubleValue != doubleValue2) {
                    return true;
                } else {
                    return false;
                }
            } else if (doubleValue == doubleValue2) {
                return true;
            } else {
                return false;
            }
        } else if (this.f5726c == 2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo6121c(Object obj) {
        if (!(obj instanceof String)) {
            int i = this.f5726c;
            if (i == 2 || i == 17) {
                return true;
            }
            return false;
        }
        int i2 = this.f5726c;
        if (i2 == 1) {
            return obj.equals(this.f5727d);
        }
        if (i2 == 2) {
            return !obj.equals(this.f5727d);
        }
        if (i2 == 10) {
            return m4264a((String) this.f5727d, (String) obj);
        }
        if (i2 != 17) {
            return false;
        }
        return !m4264a((String) this.f5727d, (String) obj);
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.f5724a.equals(C1697t5.UNKNOWN)) {
                jSONObject.put("property_type", this.f5724a.toString());
            }
            jSONObject.put("property_key", this.f5725b);
            jSONObject.put("comparator", this.f5726c);
            jSONObject.put("property_value", this.f5727d);
        } catch (JSONException e) {
            AppboyLogger.m5452e(f5723e, "Caught exception creating property filter Json.", e);
        }
        return jSONObject;
    }

    public C1588g5(JSONObject jSONObject) {
        this((C1697t5) JsonUtils.optEnum(jSONObject, "property_type", C1697t5.class, C1697t5.UNKNOWN), jSONObject.getString("property_key"), jSONObject.getInt("comparator"));
        if (!jSONObject.has("property_value")) {
            return;
        }
        if (this.f5724a.equals(C1697t5.STRING)) {
            this.f5727d = jSONObject.getString("property_value");
        } else if (this.f5724a.equals(C1697t5.BOOLEAN)) {
            this.f5727d = Boolean.valueOf(jSONObject.getBoolean("property_value"));
        } else if (this.f5724a.equals(C1697t5.NUMBER)) {
            this.f5727d = Double.valueOf(jSONObject.getDouble("property_value"));
        } else if (this.f5724a.equals(C1697t5.DATE)) {
            this.f5727d = Long.valueOf(jSONObject.getLong("property_value"));
        }
    }

    /* renamed from: a */
    public final boolean mo6119a(Object obj, long j) {
        Date parseDate = obj instanceof String ? DateTimeUtils.parseDate((String) obj, BrazeDateFormat.LONG) : null;
        if (parseDate != null) {
            long timeFromEpochInSeconds = DateTimeUtils.getTimeFromEpochInSeconds(parseDate);
            long longValue = ((Number) this.f5727d).longValue();
            int i = this.f5726c;
            if (i != 15) {
                if (i != 16) {
                    switch (i) {
                        case 1:
                            if (timeFromEpochInSeconds == longValue) {
                                return true;
                            }
                            return false;
                        case 2:
                            if (timeFromEpochInSeconds != longValue) {
                                return true;
                            }
                            return false;
                        case 3:
                            if (timeFromEpochInSeconds > longValue) {
                                return true;
                            }
                            return false;
                        case 4:
                            if (timeFromEpochInSeconds >= j - longValue) {
                                return true;
                            }
                            return false;
                        case 5:
                            if (timeFromEpochInSeconds < longValue) {
                                return true;
                            }
                            return false;
                        case 6:
                            if (timeFromEpochInSeconds <= j - longValue) {
                                return true;
                            }
                            return false;
                        default:
                            return false;
                    }
                } else if (timeFromEpochInSeconds > j + longValue) {
                    return true;
                } else {
                    return false;
                }
            } else if (timeFromEpochInSeconds < j + longValue) {
                return true;
            } else {
                return false;
            }
        } else if (this.f5726c == 2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo6118a(Object obj) {
        if (obj instanceof Boolean) {
            int i = this.f5726c;
            if (i == 1) {
                return obj.equals(this.f5727d);
            }
            if (i != 2) {
                return false;
            }
            return !obj.equals(this.f5727d);
        } else if (this.f5726c == 2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m4264a(String str, String str2) {
        return Pattern.compile(str, 2).matcher(str2).find();
    }
}
