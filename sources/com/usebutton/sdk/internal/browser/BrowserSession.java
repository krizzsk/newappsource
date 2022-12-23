package com.usebutton.sdk.internal.browser;

import com.usebutton.sdk.internal.api.burly.Burly;
import com.usebutton.sdk.internal.widget.FullScreenWidgetActivity;
import java.util.HashMap;
import java.util.Map;

public class BrowserSession {
    public static final Event DEFAULT_EVENT = Event.UNKNOWN;
    public static final String KEY_ORDERS = "orders";
    public static final String KEY_PAGE_VIEWS = "pageviews";
    public static final String KEY_PRODUCT_VIEW = "product_views";
    private Event event = DEFAULT_EVENT;
    private int orders = 0;
    private int pageViews = 0;
    private int productViews = 0;
    private int showCount = 0;
    private String url;

    /* renamed from: com.usebutton.sdk.internal.browser.BrowserSession$1 */
    public static /* synthetic */ class C123081 {

        /* renamed from: $SwitchMap$com$usebutton$sdk$internal$browser$BrowserSession$Event */
        public static final /* synthetic */ int[] f30926x32f73a6f;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.usebutton.sdk.internal.browser.BrowserSession$Event[] r0 = com.usebutton.sdk.internal.browser.BrowserSession.Event.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30926x32f73a6f = r0
                com.usebutton.sdk.internal.browser.BrowserSession$Event r1 = com.usebutton.sdk.internal.browser.BrowserSession.Event.PAGE_VIEW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30926x32f73a6f     // Catch:{ NoSuchFieldError -> 0x001d }
                com.usebutton.sdk.internal.browser.BrowserSession$Event r1 = com.usebutton.sdk.internal.browser.BrowserSession.Event.PRODUCT_VIEW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30926x32f73a6f     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.usebutton.sdk.internal.browser.BrowserSession$Event r1 = com.usebutton.sdk.internal.browser.BrowserSession.Event.ORDER_CHECKOUT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30926x32f73a6f     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.usebutton.sdk.internal.browser.BrowserSession$Event r1 = com.usebutton.sdk.internal.browser.BrowserSession.Event.DISMISS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30926x32f73a6f     // Catch:{ NoSuchFieldError -> 0x003e }
                com.usebutton.sdk.internal.browser.BrowserSession$Event r1 = com.usebutton.sdk.internal.browser.BrowserSession.Event.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30926x32f73a6f     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.usebutton.sdk.internal.browser.BrowserSession$Event r1 = com.usebutton.sdk.internal.browser.BrowserSession.Event.LAUNCH     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.usebutton.sdk.internal.browser.BrowserSession.C123081.<clinit>():void");
        }
    }

    public enum Event {
        LAUNCH("launch"),
        PAGE_VIEW("pageview"),
        PRODUCT_VIEW("product-view"),
        ORDER_CHECKOUT("order-checkout"),
        DISMISS(FullScreenWidgetActivity.EXTRA_DISMISS),
        UNKNOWN("unknown");
        
        public final String value;

        private Event(String str) {
            this.value = str;
        }

        public static Event getType(String str) {
            for (Event event : values()) {
                if (event.value.equals(str)) {
                    return event;
                }
            }
            return UNKNOWN;
        }

        public String getValue() {
            return this.value;
        }
    }

    private void insertToMap(Map<String, Object> map, String str, Object obj) {
        if (obj != null) {
            map.put(str, obj);
        }
    }

    public void reset() {
        this.event = DEFAULT_EVENT;
        this.url = null;
        this.showCount = 0;
        this.pageViews = 0;
        this.productViews = 0;
        this.orders = 0;
    }

    public void setShowCount(int i) {
        this.showCount = i;
    }

    public HashMap<String, Object> toMap() {
        HashMap<String, Object> hashMap = new HashMap<>();
        insertToMap(hashMap, "event", this.event.getValue());
        insertToMap(hashMap, "url", this.url);
        insertToMap(hashMap, Burly.KEY_SHOW_COUNT, Integer.valueOf(this.showCount));
        insertToMap(hashMap, KEY_PAGE_VIEWS, Integer.valueOf(this.pageViews));
        insertToMap(hashMap, KEY_PRODUCT_VIEW, Integer.valueOf(this.productViews));
        insertToMap(hashMap, KEY_ORDERS, Integer.valueOf(this.orders));
        return hashMap;
    }

    public void update(Event event2) {
        update(event2, (String) null);
    }

    public void update(Event event2, String str) {
        this.event = event2;
        this.url = str;
        int i = C123081.f30926x32f73a6f[event2.ordinal()];
        if (i == 1) {
            this.pageViews++;
        } else if (i == 2) {
            this.pageViews++;
            this.productViews++;
        } else if (i == 3) {
            this.pageViews++;
            this.orders++;
        }
    }
}
