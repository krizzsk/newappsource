package zendesk.core;

import android.content.Context;
import android.net.ConnectivityManager;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskProvidersModule_ProviderNetworkInfoProviderFactory implements C23588c<NetworkInfoProvider> {
    private final C25292a<ConnectivityManager> connectivityManagerProvider;
    private final C25292a<Context> contextProvider;

    public ZendeskProvidersModule_ProviderNetworkInfoProviderFactory(C25292a<Context> aVar, C25292a<ConnectivityManager> aVar2) {
        this.contextProvider = aVar;
        this.connectivityManagerProvider = aVar2;
    }

    public static ZendeskProvidersModule_ProviderNetworkInfoProviderFactory create(C25292a<Context> aVar, C25292a<ConnectivityManager> aVar2) {
        return new ZendeskProvidersModule_ProviderNetworkInfoProviderFactory(aVar, aVar2);
    }

    public static NetworkInfoProvider providerNetworkInfoProvider(Context context, ConnectivityManager connectivityManager) {
        NetworkInfoProvider providerNetworkInfoProvider = ZendeskProvidersModule.providerNetworkInfoProvider(context, connectivityManager);
        C13641g.m34117e(providerNetworkInfoProvider);
        return providerNetworkInfoProvider;
    }

    public NetworkInfoProvider get() {
        return providerNetworkInfoProvider(this.contextProvider.get(), this.connectivityManagerProvider.get());
    }
}
