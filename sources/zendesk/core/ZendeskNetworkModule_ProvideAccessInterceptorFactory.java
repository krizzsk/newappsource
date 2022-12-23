package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskNetworkModule_ProvideAccessInterceptorFactory implements C23588c<ZendeskAccessInterceptor> {
    private final C25292a<AccessProvider> accessProvider;
    private final C25292a<CoreSettingsStorage> coreSettingsStorageProvider;
    private final C25292a<IdentityManager> identityManagerProvider;
    private final C25292a<Storage> storageProvider;

    public ZendeskNetworkModule_ProvideAccessInterceptorFactory(C25292a<IdentityManager> aVar, C25292a<AccessProvider> aVar2, C25292a<Storage> aVar3, C25292a<CoreSettingsStorage> aVar4) {
        this.identityManagerProvider = aVar;
        this.accessProvider = aVar2;
        this.storageProvider = aVar3;
        this.coreSettingsStorageProvider = aVar4;
    }

    public static ZendeskNetworkModule_ProvideAccessInterceptorFactory create(C25292a<IdentityManager> aVar, C25292a<AccessProvider> aVar2, C25292a<Storage> aVar3, C25292a<CoreSettingsStorage> aVar4) {
        return new ZendeskNetworkModule_ProvideAccessInterceptorFactory(aVar, aVar2, aVar3, aVar4);
    }

    public static ZendeskAccessInterceptor provideAccessInterceptor(Object obj, Object obj2, Object obj3, Object obj4) {
        ZendeskAccessInterceptor provideAccessInterceptor = ZendeskNetworkModule.provideAccessInterceptor((IdentityManager) obj, (AccessProvider) obj2, (Storage) obj3, (CoreSettingsStorage) obj4);
        C13641g.m34117e(provideAccessInterceptor);
        return provideAccessInterceptor;
    }

    public ZendeskAccessInterceptor get() {
        return provideAccessInterceptor(this.identityManagerProvider.get(), this.accessProvider.get(), this.storageProvider.get(), this.coreSettingsStorageProvider.get());
    }
}
