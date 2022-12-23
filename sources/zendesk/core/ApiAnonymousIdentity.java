package zendesk.core;

import com.zendesk.logger.Logger;
import ge0.C23410c;

class ApiAnonymousIdentity implements Identity {
    private static final transient String LOG_TAG = "ApiAnonymousIdentity";
    private String email;
    private String name;
    private String sdkGuid;

    public ApiAnonymousIdentity(AnonymousIdentity anonymousIdentity, String str) {
        if (C23410c.m57534b(str)) {
            this.sdkGuid = "";
            Logger.m57306e("SdkGuid cannot be null or empty.", new Object[0]);
        } else {
            this.sdkGuid = str;
        }
        if (anonymousIdentity == null) {
            Logger.m57306e("Identity is null.", new Object[0]);
            return;
        }
        this.email = anonymousIdentity.getEmail();
        this.name = anonymousIdentity.getName();
    }
}
