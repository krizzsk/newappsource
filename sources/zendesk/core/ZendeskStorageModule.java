package zendesk.core;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.ServerParameters;
import com.google.gson.Gson;
import hi0.C23522c;
import java.io.File;
import java.util.Locale;

class ZendeskStorageModule {
    private static final String STORAGE_BELVEDERE_CACHE;

    static {
        StringBuilder k = C13555b.m33972k("belvedere-data-v2");
        String str = File.separator;
        STORAGE_BELVEDERE_CACHE = C13715c.m34246l(k, str, "user", str, "zendesk");
    }

    private static SharedPreferences getSharedPrefs(Context context, String str) {
        return context.getSharedPreferences(str, 0);
    }

    public static BaseStorage provideAdditionalSdkBaseStorage(Context context, Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, storageName("additional_sdk")), serializer);
    }

    public static AuthenticationProvider provideAuthProvider(IdentityManager identityManager) {
        return new ZendeskAuthenticationProvider(identityManager);
    }

    public static C23522c provideCache(File file) {
        return new C23522c(new File(file, storageName("response_cache")));
    }

    public static CoreSettingsStorage provideCoreSettingsStorage(SettingsStorage settingsStorage) {
        return new ZendeskCoreSettingsStorage(settingsStorage);
    }

    public static BaseStorage provideIdentityBaseStorage(Context context, Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, storageName("identity")), serializer);
    }

    public static IdentityManager provideIdentityManager(IdentityStorage identityStorage) {
        return new ZendeskIdentityManager(identityStorage);
    }

    public static IdentityStorage provideIdentityStorage(BaseStorage baseStorage) {
        return new ZendeskIdentityStorage(baseStorage);
    }

    public static SharedPreferencesStorage provideLegacyIdentityBaseStorage(Context context, Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, "zendesk-token"), serializer);
    }

    public static LegacyIdentityMigrator provideLegacyIdentityStorage(SharedPreferencesStorage sharedPreferencesStorage, SharedPreferencesStorage sharedPreferencesStorage2, IdentityStorage identityStorage, IdentityManager identityManager, PushDeviceIdStorage pushDeviceIdStorage) {
        return new LegacyIdentityMigrator(sharedPreferencesStorage, sharedPreferencesStorage2, identityStorage, identityManager, pushDeviceIdStorage);
    }

    public static SharedPreferencesStorage provideLegacyPushBaseStorage(Context context, Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, "zendesk-push-token"), serializer);
    }

    public static MemoryCache provideMemoryCache() {
        return new ZendeskLruMemoryCache();
    }

    public static PushDeviceIdStorage providePushDeviceIdStorage(BaseStorage baseStorage) {
        return new ZendeskPushDeviceIdStorage(baseStorage);
    }

    public static BaseStorage provideSdkBaseStorage(Context context, Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, storageName(ServerParameters.ANDROID_SDK_INT)), serializer);
    }

    public static Storage provideSdkStorage(SettingsStorage settingsStorage, SessionStorage sessionStorage, BaseStorage baseStorage, MemoryCache memoryCache) {
        return new ZendeskStorage(sessionStorage, settingsStorage, baseStorage, memoryCache);
    }

    public static Serializer provideSerializer(Gson gson) {
        return new GsonSerializer(gson);
    }

    public static SessionStorage provideSessionStorage(IdentityStorage identityStorage, BaseStorage baseStorage, BaseStorage baseStorage2, C23522c cVar, File file, File file2, File file3) {
        return new ZendeskSessionStorage(identityStorage, baseStorage, cVar, baseStorage2, file, file2, file3);
    }

    public static BaseStorage provideSettingsBaseStorage(Context context, Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, storageName("settings")), serializer);
    }

    public static SettingsStorage provideSettingsStorage(BaseStorage baseStorage) {
        return new ZendeskSettingsStorage(baseStorage);
    }

    public static File providesBelvedereDir(Context context) {
        return new File(context.getCacheDir(), STORAGE_BELVEDERE_CACHE);
    }

    public static File providesCacheDir(Context context) {
        return new File(context.getCacheDir(), "zendesk");
    }

    public static File providesDataDir(Context context) {
        return new File(context.getFilesDir(), "zendesk");
    }

    public static BaseStorage providesDiskLruStorage(File file, Serializer serializer) {
        return new ZendeskDiskLruCache(new File(file, storageName("media_cache")), serializer, 20971520);
    }

    private static String storageName(String str) {
        return String.format(Locale.US, "zendesk_%s", new Object[]{str});
    }
}
