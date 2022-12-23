package p030bo.app;

import com.appboy.enums.inappmessage.InAppMessageFailureType;
import com.appboy.enums.inappmessage.MessageType;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageBase;
import com.appboy.models.InAppMessageControl;
import com.appboy.models.InAppMessageFull;
import com.appboy.models.InAppMessageHtml;
import com.appboy.models.InAppMessageHtmlFull;
import com.appboy.models.InAppMessageImmersiveBase;
import com.appboy.models.InAppMessageModal;
import com.appboy.models.InAppMessageSlideup;
import com.appboy.support.AppboyLogger;
import com.appboy.support.JsonUtils;
import com.appboy.support.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.p4 */
public final class C1665p4 {

    /* renamed from: a */
    public static final String f5941a = AppboyLogger.getBrazeLogTag(C1665p4.class);

    /* renamed from: bo.app.p4$a */
    public static /* synthetic */ class C1666a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5942a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.appboy.enums.inappmessage.MessageType[] r0 = com.appboy.enums.inappmessage.MessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5942a = r0
                com.appboy.enums.inappmessage.MessageType r1 = com.appboy.enums.inappmessage.MessageType.FULL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5942a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appboy.enums.inappmessage.MessageType r1 = com.appboy.enums.inappmessage.MessageType.MODAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5942a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.appboy.enums.inappmessage.MessageType r1 = com.appboy.enums.inappmessage.MessageType.SLIDEUP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5942a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.appboy.enums.inappmessage.MessageType r1 = com.appboy.enums.inappmessage.MessageType.HTML_FULL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5942a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.appboy.enums.inappmessage.MessageType r1 = com.appboy.enums.inappmessage.MessageType.HTML     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1665p4.C1666a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static IInAppMessage m4607a(String str, C1707v1 v1Var) {
        try {
            if (!StringUtils.isNullOrBlank(str)) {
                return m4608a(new JSONObject(str), v1Var);
            }
            AppboyLogger.m5453i(f5941a, "In-app message string was null or blank. Not de-serializing message.");
            return null;
        } catch (JSONException e) {
            String str2 = f5941a;
            AppboyLogger.m5460w(str2, "Encountered JSONException processing in-app message string: " + str, e);
            return null;
        } catch (Exception e2) {
            String str3 = f5941a;
            AppboyLogger.m5452e(str3, "Failed to deserialize the in-app message string." + str, e2);
            return null;
        }
    }

    /* renamed from: b */
    public static JSONArray m4609b(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("themes");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("dark")) == null) {
            return null;
        }
        return optJSONObject.optJSONArray(InAppMessageImmersiveBase.BUTTONS);
    }

    /* renamed from: c */
    public static boolean m4611c(JSONObject jSONObject) {
        return jSONObject.optBoolean(InAppMessageBase.IS_CONTROL, false);
    }

    /* renamed from: b */
    public static void m4610b(JSONObject jSONObject, C1707v1 v1Var) {
        String optString = jSONObject.optString(InAppMessageBase.TRIGGER_ID);
        if (!StringUtils.isNullOrEmpty(optString)) {
            v1Var.mo6243b((C1594h2) C1687s2.m4693a(optString, InAppMessageFailureType.UNKNOWN_MESSAGE_TYPE));
        }
    }

    /* renamed from: a */
    public static IInAppMessage m4608a(JSONObject jSONObject, C1707v1 v1Var) {
        if (jSONObject == null) {
            try {
                AppboyLogger.m5448d(f5941a, "In-app message Json was null. Not deserializing message.");
                return null;
            } catch (JSONException e) {
                String str = f5941a;
                StringBuilder k = C13555b.m33972k("Encountered JSONException processing in-app message: ");
                k.append(JsonUtils.getPrettyPrintedString(jSONObject));
                AppboyLogger.m5460w(str, k.toString(), e);
                return null;
            } catch (Exception e2) {
                String str2 = f5941a;
                StringBuilder k2 = C13555b.m33972k("Failed to deserialize the in-app message: ");
                k2.append(JsonUtils.getPrettyPrintedString(jSONObject));
                AppboyLogger.m5452e(str2, k2.toString(), e2);
                return null;
            }
        } else if (m4611c(jSONObject)) {
            AppboyLogger.m5448d(f5941a, "Deserializing control in-app message.");
            return new InAppMessageControl(jSONObject, v1Var);
        } else {
            MessageType messageType = (MessageType) JsonUtils.optEnum(jSONObject, "type", MessageType.class, null);
            if (messageType == null) {
                String str3 = f5941a;
                AppboyLogger.m5453i(str3, "In-app message type was unknown. Not deserializing message: " + JsonUtils.getPrettyPrintedString(jSONObject));
                m4610b(jSONObject, v1Var);
                return null;
            }
            int i = C1666a.f5942a[messageType.ordinal()];
            if (i == 1) {
                return new InAppMessageFull(jSONObject, v1Var);
            }
            if (i == 2) {
                return new InAppMessageModal(jSONObject, v1Var);
            }
            if (i == 3) {
                return new InAppMessageSlideup(jSONObject, v1Var);
            }
            if (i == 4) {
                return new InAppMessageHtmlFull(jSONObject, v1Var);
            }
            if (i == 5) {
                return new InAppMessageHtml(jSONObject, v1Var);
            }
            String str4 = f5941a;
            AppboyLogger.m5459w(str4, "Unknown in-app message type. Not deserializing message: " + JsonUtils.getPrettyPrintedString(jSONObject));
            m4610b(jSONObject, v1Var);
            return null;
        }
    }

    /* renamed from: a */
    public static C1536b3 m4606a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("themes");
        if (optJSONObject == null) {
            return null;
        }
        AppboyLogger.m5448d(f5941a, "In-App Message contains themes object. Returning dark theme object");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("dark");
        if (optJSONObject2 != null) {
            return new C1536b3(optJSONObject2);
        }
        return null;
    }
}
