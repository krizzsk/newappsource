package zendesk.core;

import ck0.C21226b;
import ek0.C23322f;
import ek0.C23325i;
import ek0.C23335s;
import java.util.Map;
import p359ag.C13450g;

interface SdkSettingsService {
    @C23322f("/api/private/mobile_sdk/settings/{applicationId}.json")
    C21226b<Map<String, C13450g>> getSettings(@C23325i("Accept-Language") String str, @C23335s("applicationId") String str2);
}
