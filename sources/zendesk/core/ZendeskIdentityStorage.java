package zendesk.core;

import com.zendesk.logger.Logger;
import ge0.C23410c;
import java.util.UUID;

class ZendeskIdentityStorage implements IdentityStorage {
    private final BaseStorage identityStorage;

    /* renamed from: zendesk.core.ZendeskIdentityStorage$1 */
    public static /* synthetic */ class C253601 {
        public static final /* synthetic */ int[] $SwitchMap$zendesk$core$AuthenticationType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                zendesk.core.AuthenticationType[] r0 = zendesk.core.AuthenticationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$zendesk$core$AuthenticationType = r0
                zendesk.core.AuthenticationType r1 = zendesk.core.AuthenticationType.JWT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$zendesk$core$AuthenticationType     // Catch:{ NoSuchFieldError -> 0x001d }
                zendesk.core.AuthenticationType r1 = zendesk.core.AuthenticationType.ANONYMOUS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.core.ZendeskIdentityStorage.C253601.<clinit>():void");
        }
    }

    public ZendeskIdentityStorage(BaseStorage baseStorage) {
        this.identityStorage = baseStorage;
    }

    public void clear() {
        this.identityStorage.clear();
    }

    public String getBlipsUuid() {
        return this.identityStorage.get("blips_buid");
    }

    public Identity getIdentity() {
        AuthenticationType authType;
        String str = this.identityStorage.get("zendesk-identity-type");
        if (C23410c.m57533a(str) && (authType = AuthenticationType.getAuthType(str)) != null) {
            int i = C253601.$SwitchMap$zendesk$core$AuthenticationType[authType.ordinal()];
            if (i == 1) {
                Logger.m57302a("Loading Jwt identity", new Object[0]);
                return (Identity) this.identityStorage.get("zendesk-identity", JwtIdentity.class);
            } else if (i == 2) {
                Logger.m57302a("Loading Anonymous identity", new Object[0]);
                return (Identity) this.identityStorage.get("zendesk-identity", AnonymousIdentity.class);
            }
        }
        return null;
    }

    public AccessToken getStoredAccessToken() {
        return (AccessToken) this.identityStorage.get("stored_token", AccessToken.class);
    }

    public Long getUserId() {
        return (Long) this.identityStorage.get("user_id", Long.class);
    }

    public String getUuid() {
        Logger.m57302a("Fetching UUID from preferences store", new Object[0]);
        String str = this.identityStorage.get("uuid");
        if (C23410c.m57534b(str)) {
            return "";
        }
        return str;
    }

    public void storeAccessToken(AccessToken accessToken) {
        if (accessToken != null) {
            this.identityStorage.put("stored_token", (Object) accessToken);
        }
    }

    public void storeIdentity(Identity identity) {
        if (identity == null) {
            Logger.m57303b("identity is null, will not store the identity", new Object[0]);
            return;
        }
        String str = null;
        if (identity instanceof AnonymousIdentity) {
            Logger.m57302a("Storing anonymous identity", new Object[0]);
            str = AuthenticationType.ANONYMOUS.getAuthenticationType();
        } else if (identity instanceof JwtIdentity) {
            Logger.m57302a("Storing jwt identity", new Object[0]);
            str = AuthenticationType.JWT.getAuthenticationType();
        } else {
            Logger.m57303b("Unknown authentication type, identity will not be stored", new Object[0]);
        }
        if (str != null) {
            this.identityStorage.put("zendesk-identity", (Object) identity);
            this.identityStorage.put("zendesk-identity-type", str);
        }
    }

    public void storeSdkGuid(String str) {
        Logger.m57302a("Storing new UUID in preference store", new Object[0]);
        this.identityStorage.put("uuid", str);
    }

    public void storeUserId(Long l) {
        if (l != null) {
            this.identityStorage.put("user_id", (Object) l);
        }
    }

    public String updateBlipsUuid() {
        String uuid = UUID.randomUUID().toString();
        Logger.m57302a("Generate new Blips BUID", new Object[0]);
        this.identityStorage.put("blips_buid", uuid);
        return uuid;
    }

    public String updateSdkGuid() {
        String uuid = UUID.randomUUID().toString();
        storeSdkGuid(uuid);
        return uuid;
    }
}
