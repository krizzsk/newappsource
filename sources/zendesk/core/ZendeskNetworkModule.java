package zendesk.core;

import android.content.Context;
import ck0.C21268s;
import com.google.gson.Gson;
import dk0.C23282a;
import hi0.C23522c;
import hi0.C23548l;
import hi0.C23566v;
import ii0.C23610d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.logging.HttpLoggingInterceptor;

class ZendeskNetworkModule {
    public static AcceptLanguageHeaderInterceptor provideAcceptLanguageHeaderInterceptor(Context context) {
        return new AcceptLanguageHeaderInterceptor(context);
    }

    public static ZendeskAccessInterceptor provideAccessInterceptor(IdentityManager identityManager, AccessProvider accessProvider, Storage storage, CoreSettingsStorage coreSettingsStorage) {
        return new ZendeskAccessInterceptor(identityManager, accessProvider, storage, coreSettingsStorage);
    }

    public static ZendeskAuthHeaderInterceptor provideAuthHeaderInterceptor(IdentityManager identityManager) {
        return new ZendeskAuthHeaderInterceptor(identityManager);
    }

    public static CachingInterceptor provideCachingInterceptor(BaseStorage baseStorage) {
        return new CachingInterceptor(baseStorage);
    }

    public static C21268s provideCoreRetrofit(ApplicationConfiguration applicationConfiguration, Gson gson, C23566v vVar) {
        C21268s.C21270b bVar = new C21268s.C21270b();
        bVar.mo53623a(applicationConfiguration.getZendeskUrl());
        if (gson != null) {
            bVar.f53244d.add(new C23282a(gson));
            bVar.mo53625c(vVar);
            return bVar.mo53624b();
        }
        throw new NullPointerException("gson == null");
    }

    public static ZendeskPushInterceptor providePushInterceptor(PushRegistrationProviderInternal pushRegistrationProviderInternal, PushDeviceIdStorage pushDeviceIdStorage) {
        return new ZendeskPushInterceptor(pushRegistrationProviderInternal, pushDeviceIdStorage);
    }

    public static C21268s providePushProviderRetrofit(ApplicationConfiguration applicationConfiguration, Gson gson, C23566v vVar, ZendeskAuthHeaderInterceptor zendeskAuthHeaderInterceptor) {
        C21268s.C21270b bVar = new C21268s.C21270b();
        bVar.mo53623a(applicationConfiguration.getZendeskUrl());
        if (gson != null) {
            bVar.f53244d.add(new C23282a(gson));
            vVar.getClass();
            C23566v.C23568b bVar2 = new C23566v.C23568b(vVar);
            bVar2.mo58715a(zendeskAuthHeaderInterceptor);
            bVar.mo53625c(new C23566v(bVar2));
            return bVar.mo53624b();
        }
        throw new NullPointerException("gson == null");
    }

    public static C21268s provideRetrofit(ApplicationConfiguration applicationConfiguration, Gson gson, C23566v vVar) {
        C21268s.C21270b bVar = new C21268s.C21270b();
        bVar.mo53623a(applicationConfiguration.getZendeskUrl());
        if (gson != null) {
            bVar.f53244d.add(new C23282a(gson));
            bVar.mo53625c(vVar);
            return bVar.mo53624b();
        }
        throw new NullPointerException("gson == null");
    }

    public static ZendeskSettingsInterceptor provideSettingsInterceptor(SdkSettingsProviderInternal sdkSettingsProviderInternal, SettingsStorage settingsStorage) {
        return new ZendeskSettingsInterceptor(sdkSettingsProviderInternal, settingsStorage);
    }

    public static ZendeskUnauthorizedInterceptor provideZendeskUnauthorizedInterceptor(SessionStorage sessionStorage) {
        return new ZendeskUnauthorizedInterceptor(sessionStorage);
    }

    public static AcceptHeaderInterceptor providesAcceptHeaderInterceptor() {
        return new AcceptHeaderInterceptor();
    }

    public C23566v provideBaseOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor, ZendeskOauthIdHeaderInterceptor zendeskOauthIdHeaderInterceptor, UserAgentAndClientHeadersInterceptor userAgentAndClientHeadersInterceptor, ExecutorService executorService) {
        C23566v.C23568b enableTls12OnPreLollipop = Tls12SocketFactory.enableTls12OnPreLollipop(new C23566v.C23568b());
        enableTls12OnPreLollipop.mo58715a(zendeskOauthIdHeaderInterceptor);
        enableTls12OnPreLollipop.mo58715a(httpLoggingInterceptor);
        enableTls12OnPreLollipop.mo58715a(userAgentAndClientHeadersInterceptor);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        enableTls12OnPreLollipop.mo58716b(30, timeUnit);
        enableTls12OnPreLollipop.mo58717c(30, timeUnit);
        enableTls12OnPreLollipop.f59600A = C23610d.m57795c(30, timeUnit);
        enableTls12OnPreLollipop.f59602a = new C23548l(executorService);
        return new C23566v(enableTls12OnPreLollipop);
    }

    public C23566v provideCoreOkHttpClient(C23566v vVar, AcceptLanguageHeaderInterceptor acceptLanguageHeaderInterceptor, AcceptHeaderInterceptor acceptHeaderInterceptor) {
        vVar.getClass();
        C23566v.C23568b bVar = new C23566v.C23568b(vVar);
        bVar.mo58715a(acceptLanguageHeaderInterceptor);
        bVar.mo58715a(acceptHeaderInterceptor);
        return new C23566v(bVar);
    }

    public C23566v provideMediaOkHttpClient(C23566v vVar, ZendeskAccessInterceptor zendeskAccessInterceptor, ZendeskAuthHeaderInterceptor zendeskAuthHeaderInterceptor, ZendeskSettingsInterceptor zendeskSettingsInterceptor, CachingInterceptor cachingInterceptor, ZendeskUnauthorizedInterceptor zendeskUnauthorizedInterceptor) {
        vVar.getClass();
        C23566v.C23568b bVar = new C23566v.C23568b(vVar);
        bVar.mo58715a(zendeskSettingsInterceptor);
        bVar.mo58715a(cachingInterceptor);
        bVar.mo58715a(zendeskAccessInterceptor);
        bVar.mo58715a(zendeskAuthHeaderInterceptor);
        bVar.mo58715a(zendeskUnauthorizedInterceptor);
        return new C23566v(bVar);
    }

    public C23566v provideOkHttpClient(C23566v vVar, ZendeskAccessInterceptor zendeskAccessInterceptor, ZendeskUnauthorizedInterceptor zendeskUnauthorizedInterceptor, ZendeskAuthHeaderInterceptor zendeskAuthHeaderInterceptor, ZendeskSettingsInterceptor zendeskSettingsInterceptor, AcceptHeaderInterceptor acceptHeaderInterceptor, ZendeskPushInterceptor zendeskPushInterceptor, C23522c cVar) {
        vVar.getClass();
        C23566v.C23568b bVar = new C23566v.C23568b(vVar);
        bVar.mo58715a(zendeskSettingsInterceptor);
        bVar.mo58715a(zendeskAccessInterceptor);
        bVar.mo58715a(zendeskAuthHeaderInterceptor);
        bVar.mo58715a(zendeskUnauthorizedInterceptor);
        bVar.mo58715a(acceptHeaderInterceptor);
        bVar.mo58715a(zendeskPushInterceptor);
        bVar.f59611j = cVar;
        bVar.f59612k = null;
        return new C23566v(bVar);
    }

    public RestServiceProvider provideRestServiceProvider(C21268s sVar, C23566v vVar, C23566v vVar2, C23566v vVar3) {
        return new ZendeskRestServiceProvider(sVar, vVar, vVar2, vVar3);
    }

    public ZendeskOauthIdHeaderInterceptor provideZendeskBasicHeadersInterceptor(ApplicationConfiguration applicationConfiguration) {
        return new ZendeskOauthIdHeaderInterceptor(applicationConfiguration.getOauthClientId());
    }

    public UserAgentAndClientHeadersInterceptor providesUserAgentHeaderInterceptor() {
        return new UserAgentAndClientHeadersInterceptor("3.0.3", "Core");
    }
}
