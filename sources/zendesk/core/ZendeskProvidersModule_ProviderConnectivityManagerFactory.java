package zendesk.core;

import android.content.Context;
import android.net.ConnectivityManager;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskProvidersModule_ProviderConnectivityManagerFactory implements C23588c<ConnectivityManager> {
    private final C25292a<Context> contextProvider;

    public ZendeskProvidersModule_ProviderConnectivityManagerFactory(C25292a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static ZendeskProvidersModule_ProviderConnectivityManagerFactory create(C25292a<Context> aVar) {
        return new ZendeskProvidersModule_ProviderConnectivityManagerFactory(aVar);
    }

    public static ConnectivityManager providerConnectivityManager(Context context) {
        ConnectivityManager providerConnectivityManager = ZendeskProvidersModule.providerConnectivityManager(context);
        C13641g.m34117e(providerConnectivityManager);
        return providerConnectivityManager;
    }

    public ConnectivityManager get() {
        return providerConnectivityManager(this.contextProvider.get());
    }
}
