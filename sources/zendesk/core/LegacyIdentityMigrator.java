package zendesk.core;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.gson.JsonSyntaxException;
import com.zendesk.logger.Logger;
import ge0.C23410c;
import p359ag.C13450g;
import p359ag.C13452i;
import p359ag.C13453j;
import zendesk.core.AnonymousIdentity;

class LegacyIdentityMigrator {
    private IdentityManager identityManager;
    private IdentityStorage identityStorage;
    private SharedPreferencesStorage legacyIdentityStorage;
    private SharedPreferencesStorage legacyPushStorage;
    private PushDeviceIdStorage pushDeviceIdStorage;

    /* renamed from: zendesk.core.LegacyIdentityMigrator$1 */
    public static /* synthetic */ class C253541 {
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
                zendesk.core.AuthenticationType r1 = zendesk.core.AuthenticationType.ANONYMOUS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$zendesk$core$AuthenticationType     // Catch:{ NoSuchFieldError -> 0x001d }
                zendesk.core.AuthenticationType r1 = zendesk.core.AuthenticationType.JWT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.core.LegacyIdentityMigrator.C253541.<clinit>():void");
        }
    }

    public LegacyIdentityMigrator(SharedPreferencesStorage sharedPreferencesStorage, SharedPreferencesStorage sharedPreferencesStorage2, IdentityStorage identityStorage2, IdentityManager identityManager2, PushDeviceIdStorage pushDeviceIdStorage2) {
        this.legacyIdentityStorage = sharedPreferencesStorage;
        this.legacyPushStorage = sharedPreferencesStorage2;
        this.identityStorage = identityStorage2;
        this.identityManager = identityManager2;
        this.pushDeviceIdStorage = pushDeviceIdStorage2;
    }

    private void clear() {
        this.legacyIdentityStorage.remove("zendesk-identity-type");
        this.legacyIdentityStorage.remove("zendesk-identity");
        this.legacyIdentityStorage.remove("stored_token");
        this.legacyIdentityStorage.remove("uuid");
        this.legacyIdentityStorage.remove("user_id");
        this.legacyPushStorage.remove("pushRegResponseIdentifier");
    }

    private AccessToken getLegacyAccessToken() {
        String str = this.legacyIdentityStorage.get("stored_token");
        if (C23410c.m57534b(str)) {
            return null;
        }
        try {
            C13450g b = C13453j.m33762b(str);
            if (!(b instanceof C13452i)) {
                return null;
            }
            C13452i u = b.mo40342u();
            C13450g I = u.mo40351I("access_token");
            C13450g I2 = u.mo40351I("user_id");
            if (I == null || I2 == null) {
                return null;
            }
            return new AccessToken(I.mo40326B(), I2.mo40326B());
        } catch (JsonSyntaxException unused) {
            Logger.m57307f("Unable to read legacy AccessToken.", new Object[0]);
            return null;
        }
    }

    private Identity getLegacyIdentity() {
        AuthenticationType legacyIdentityType = getLegacyIdentityType();
        if (legacyIdentityType == null) {
            return null;
        }
        int i = C253541.$SwitchMap$zendesk$core$AuthenticationType[legacyIdentityType.ordinal()];
        if (i == 1) {
            return readLegacyAnonymousIdentity();
        }
        if (i != 2) {
            return null;
        }
        return readLegacyJwtIdentity();
    }

    private AuthenticationType getLegacyIdentityType() {
        return AuthenticationType.getAuthType(this.legacyIdentityStorage.get("zendesk-identity-type"));
    }

    private String getLegacyPushId() {
        C13450g I;
        String str = this.legacyPushStorage.get("pushRegResponseIdentifier");
        if (C23410c.m57533a(str)) {
            try {
                C13450g b = C13453j.m33762b(str);
                if ((b instanceof C13452i) && (I = b.mo40342u().mo40351I("identifier")) != null) {
                    return I.mo40326B();
                }
            } catch (JsonSyntaxException unused) {
                Logger.m57307f("Unable to read legacy push device ID.", new Object[0]);
            }
        }
        return null;
    }

    private String getLegacySdkGuid() {
        return this.legacyIdentityStorage.get("uuid");
    }

    private long getLegacyUserId() {
        return this.legacyIdentityStorage.getLong("user_id");
    }

    private AnonymousIdentity readLegacyAnonymousIdentity() {
        String str = this.legacyIdentityStorage.get("zendesk-identity");
        if (C23410c.m57534b(str)) {
            return null;
        }
        try {
            C13450g b = C13453j.m33762b(str);
            if (!(b instanceof C13452i)) {
                return null;
            }
            C13452i u = b.mo40342u();
            AnonymousIdentity.Builder builder = new AnonymousIdentity.Builder();
            C13450g I = u.mo40351I("email");
            if (I != null) {
                builder.withEmailIdentifier(I.mo40326B());
            }
            C13450g I2 = u.mo40351I("name");
            if (I2 != null) {
                builder.withNameIdentifier(I2.mo40326B());
            }
            return (AnonymousIdentity) builder.build();
        } catch (JsonSyntaxException unused) {
            Logger.m57307f("Unable to read legacy AnonymousIdentity.", new Object[0]);
            return null;
        }
    }

    private JwtIdentity readLegacyJwtIdentity() {
        String str = this.legacyIdentityStorage.get("zendesk-identity");
        if (C23410c.m57534b(str)) {
            return null;
        }
        try {
            C13450g I = C13453j.m33762b(str).mo40342u().mo40351I(FirebaseMessagingService.EXTRA_TOKEN);
            if (I != null) {
                return new JwtIdentity(I.mo40326B());
            }
            return null;
        } catch (JsonSyntaxException unused) {
            Logger.m57307f("Unable to read legacy JwtIdentity.", new Object[0]);
            return null;
        }
    }

    public void checkAndMigrateIdentity() {
        Identity legacyIdentity = getLegacyIdentity();
        if (legacyIdentity != null) {
            this.identityStorage.storeIdentity(legacyIdentity);
            long legacyUserId = getLegacyUserId();
            if (legacyUserId != 0) {
                this.identityStorage.storeUserId(Long.valueOf(legacyUserId));
            }
            AccessToken legacyAccessToken = getLegacyAccessToken();
            if (legacyAccessToken != null) {
                this.identityManager.storeAccessToken(legacyAccessToken);
            }
            if (getLegacyIdentityType() == AuthenticationType.ANONYMOUS) {
                String legacySdkGuid = getLegacySdkGuid();
                if (C23410c.m57533a(legacySdkGuid)) {
                    this.identityStorage.storeSdkGuid(legacySdkGuid);
                }
            }
            String legacyPushId = getLegacyPushId();
            if (C23410c.m57533a(legacyPushId)) {
                this.pushDeviceIdStorage.storeRegisteredDeviceId(legacyPushId);
            }
            clear();
        }
    }
}
