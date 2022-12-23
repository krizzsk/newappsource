package zendesk.core;

import java.util.Date;
import p384bg.C13622c;

public class CoreSettings implements Settings {
    private AuthenticationType authentication;
    @C13622c("brand_id")
    private String brandId;
    @C13622c("updated_at")
    private Date updatedAt;

    public CoreSettings(Date date, AuthenticationType authenticationType) {
        this.updatedAt = date;
        this.authentication = authenticationType;
    }

    public AuthenticationType getAuthentication() {
        return this.authentication;
    }
}
