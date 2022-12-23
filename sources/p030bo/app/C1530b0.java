package p030bo.app;

import com.appboy.Constants;
import com.appboy.models.IPutIntoJson;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bo.app.b0 */
public enum C1530b0 implements IPutIntoJson<String> {
    LOCATION_RECORDED("lr"),
    CUSTOM_EVENT("ce"),
    PURCHASE(Constants.APPBOY_PUSH_PRIORITY_KEY),
    PUSH_STORY_PAGE_CLICK("cic"),
    PUSH_CLICKED("pc"),
    PUSH_ACTION_BUTTON_CLICKED("ca"),
    INTERNAL("i"),
    INTERNAL_ERROR("ie"),
    NEWS_FEED_CARD_IMPRESSION("ci"),
    NEWS_FEED_CARD_CLICK("cc"),
    GEOFENCE("g"),
    CONTENT_CARDS_CLICK("ccc"),
    CONTENT_CARDS_IMPRESSION("cci"),
    CONTENT_CARDS_CONTROL_IMPRESSION("ccic"),
    CONTENT_CARDS_DISMISS("ccd"),
    INCREMENT("inc"),
    ADD_TO_CUSTOM_ATTRIBUTE_ARRAY(ProductAction.ACTION_ADD),
    REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY("rem"),
    SET_CUSTOM_ATTRIBUTE_ARRAY("set"),
    INAPP_MESSAGE_IMPRESSION("si"),
    INAPP_MESSAGE_CONTROL_IMPRESSION("iec"),
    INAPP_MESSAGE_CLICK("sc"),
    INAPP_MESSAGE_BUTTON_CLICK("sbc"),
    INAPP_MESSAGE_DISPLAY_FAILURE("sfe"),
    USER_ALIAS("uae"),
    SESSION_START("ss"),
    SESSION_END("se"),
    TEST_TYPE("tt"),
    LOCATION_CUSTOM_ATTRIBUTE_ADD("lcaa"),
    LOCATION_CUSTOM_ATTRIBUTE_REMOVE("lcar");
    

    /* renamed from: F */
    public static final Map<String, C1530b0> f5495F = null;

    /* renamed from: a */
    public final String f5522a;

    /* access modifiers changed from: public */
    static {
        int i;
        HashMap hashMap = new HashMap();
        for (C1530b0 b0Var : values()) {
            hashMap.put(b0Var.f5522a, b0Var);
        }
        f5495F = new HashMap(hashMap);
    }

    /* access modifiers changed from: public */
    C1530b0(String str) {
        this.f5522a = str;
    }

    /* renamed from: b */
    public static C1530b0 m3981b(String str) {
        Map<String, C1530b0> map = f5495F;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException(C25541a.m63881k("Unknown String Value: ", str));
    }

    /* renamed from: e */
    public String forJsonPut() {
        return this.f5522a;
    }
}
