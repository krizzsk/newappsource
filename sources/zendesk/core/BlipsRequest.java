package zendesk.core;

import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.Map;
import p384bg.C13622c;

class BlipsRequest {
    @C13622c("appId")
    private String appId;
    @C13622c("pageView")
    private ApiPageView pageView;
    @C13622c("schemaVersion")
    private String schemaVersion = DiskLruCache.VERSION_1;
    @C13622c("userAction")
    private ApiUserAction userAction;
    @C13622c("userId")
    private Long userId;

    public static class ApiPageView {
        @C13622c("navigatorLanguage")
        private String navigatorLanguage;
        @C13622c("pageTitle")
        private String pageTitle;
        private Map<String, Object> value;

        public ApiPageView(String str, String str2, Map<String, Object> map) {
            this.navigatorLanguage = str;
            this.pageTitle = str2;
            this.value = map;
        }
    }

    public static class ApiUserAction {
        private Map<String, Object> value;

        public ApiUserAction(String str, String str2, String str3, Map<String, Object> map) {
            this.value = map;
        }
    }

    private BlipsRequest() {
    }

    public static BlipsRequest buildPageView(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, Object> map) {
        BlipsRequest blipsRequest = new BlipsRequest();
        blipsRequest.userId = l;
        blipsRequest.appId = str3;
        blipsRequest.pageView = new ApiPageView(str7, str8, map);
        return blipsRequest;
    }

    public static BlipsRequest buildUserAction(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, Object> map) {
        BlipsRequest blipsRequest = new BlipsRequest();
        blipsRequest.userId = l;
        blipsRequest.appId = str3;
        blipsRequest.userAction = new ApiUserAction(str6, str7, str8, map);
        return blipsRequest;
    }
}
