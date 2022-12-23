package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;

public final class CoreModule_GetAuthenticationProviderFactory implements C23588c<AuthenticationProvider> {
    private final CoreModule module;

    public CoreModule_GetAuthenticationProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetAuthenticationProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetAuthenticationProviderFactory(coreModule);
    }

    public static AuthenticationProvider getAuthenticationProvider(CoreModule coreModule) {
        AuthenticationProvider authenticationProvider = coreModule.getAuthenticationProvider();
        C13641g.m34117e(authenticationProvider);
        return authenticationProvider;
    }

    public AuthenticationProvider get() {
        return getAuthenticationProvider(this.module);
    }
}
