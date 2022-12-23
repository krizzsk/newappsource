package zendesk.support;

import he0.C23455b;
import ye0.C25292a;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.AuthenticationProvider;

public final class Support_MembersInjector implements C23455b<Support> {
    private final C25292a<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final C25292a<AuthenticationProvider> authenticationProvider;
    private final C25292a<SupportBlipsProvider> blipsProvider;
    private final C25292a<ProviderStore> providerStoreProvider;
    private final C25292a<RequestMigrator> requestMigratorProvider;
    private final C25292a<RequestProvider> requestProvider;
    private final C25292a<SupportModule> supportModuleProvider;

    public Support_MembersInjector(C25292a<ProviderStore> aVar, C25292a<SupportModule> aVar2, C25292a<RequestMigrator> aVar3, C25292a<SupportBlipsProvider> aVar4, C25292a<ActionHandlerRegistry> aVar5, C25292a<RequestProvider> aVar6, C25292a<AuthenticationProvider> aVar7) {
        this.providerStoreProvider = aVar;
        this.supportModuleProvider = aVar2;
        this.requestMigratorProvider = aVar3;
        this.blipsProvider = aVar4;
        this.actionHandlerRegistryProvider = aVar5;
        this.requestProvider = aVar6;
        this.authenticationProvider = aVar7;
    }

    public static C23455b<Support> create(C25292a<ProviderStore> aVar, C25292a<SupportModule> aVar2, C25292a<RequestMigrator> aVar3, C25292a<SupportBlipsProvider> aVar4, C25292a<ActionHandlerRegistry> aVar5, C25292a<RequestProvider> aVar6, C25292a<AuthenticationProvider> aVar7) {
        return new Support_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static void injectActionHandlerRegistry(Support support, ActionHandlerRegistry actionHandlerRegistry) {
        support.actionHandlerRegistry = actionHandlerRegistry;
    }

    public static void injectAuthenticationProvider(Support support, AuthenticationProvider authenticationProvider2) {
        support.authenticationProvider = authenticationProvider2;
    }

    public static void injectBlipsProvider(Support support, SupportBlipsProvider supportBlipsProvider) {
        support.blipsProvider = supportBlipsProvider;
    }

    public static void injectProviderStore(Support support, ProviderStore providerStore) {
        support.providerStore = providerStore;
    }

    public static void injectRequestMigrator(Support support, Object obj) {
        support.requestMigrator = (RequestMigrator) obj;
    }

    public static void injectRequestProvider(Support support, RequestProvider requestProvider2) {
        support.requestProvider = requestProvider2;
    }

    public static void injectSupportModule(Support support, SupportModule supportModule) {
        support.supportModule = supportModule;
    }

    public void injectMembers(Support support) {
        injectProviderStore(support, this.providerStoreProvider.get());
        injectSupportModule(support, this.supportModuleProvider.get());
        injectRequestMigrator(support, this.requestMigratorProvider.get());
        injectBlipsProvider(support, this.blipsProvider.get());
        injectActionHandlerRegistry(support, this.actionHandlerRegistryProvider.get());
        injectRequestProvider(support, this.requestProvider.get());
        injectAuthenticationProvider(support, this.authenticationProvider.get());
    }
}
