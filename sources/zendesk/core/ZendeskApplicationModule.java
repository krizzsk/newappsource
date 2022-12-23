package zendesk.core;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zendesk.logger.Logger;
import fe0.C23346d;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.logging.HttpLoggingInterceptor;

class ZendeskApplicationModule {
    private ApplicationConfiguration applicationConfiguration;
    private Context context;

    public ZendeskApplicationModule(Context context2, ApplicationConfiguration applicationConfiguration2) {
        this.context = context2.getApplicationContext();
        this.applicationConfiguration = applicationConfiguration2;
    }

    public static DeviceInfo provideDeviceInfo(Context context2) {
        return new DeviceInfo(context2);
    }

    public static ScheduledExecutorService provideExecutor() {
        return Executors.newScheduledThreadPool(5, new ThreadFactory() {
            public final AtomicInteger atomicInteger = new AtomicInteger(0);

            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, String.format(Locale.ENGLISH, "ZendeskThread-%d", new Object[]{Integer.valueOf(this.atomicInteger.getAndIncrement())}));
                thread.setPriority(10);
                return thread;
            }
        });
    }

    public static ExecutorService provideExecutorService(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService;
    }

    public static Gson provideGson() {
        return new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).excludeFieldsWithModifiers(RecyclerView.C1119a0.FLAG_IGNORE, 8).registerTypeAdapter(Date.class, new C23346d()).create();
    }

    public static HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        Logger.C23262c cVar = Logger.f59014a;
        HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.NONE;
        if (level != null) {
            httpLoggingInterceptor.f62328c = level;
            return httpLoggingInterceptor;
        }
        throw new NullPointerException("level == null. Use Level.NONE instead.");
    }

    public static ZendeskShadow provideZendesk(Storage storage, LegacyIdentityMigrator legacyIdentityMigrator, IdentityManager identityManager, BlipsCoreProvider blipsCoreProvider, PushRegistrationProvider pushRegistrationProvider, CoreModule coreModule, ProviderStore providerStore) {
        return new ZendeskShadow(storage, legacyIdentityMigrator, identityManager, blipsCoreProvider, pushRegistrationProvider, coreModule, providerStore);
    }

    public ApplicationConfiguration provideApplicationConfiguration() {
        return this.applicationConfiguration;
    }

    public Context provideApplicationContext() {
        return this.context;
    }

    public Serializer provideBase64Serializer(Serializer serializer) {
        return new ZendeskBase64Serializer(serializer);
    }

    public ZendeskLocaleConverter provideZendeskLocaleConverter() {
        return new ZendeskLocaleConverter();
    }
}
