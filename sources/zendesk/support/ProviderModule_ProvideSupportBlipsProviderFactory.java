package zendesk.support;

import ie0.C23588c;
import java.util.Locale;
import p389bl.C13641g;
import ye0.C25292a;
import zendesk.core.BlipsProvider;

public final class ProviderModule_ProvideSupportBlipsProviderFactory implements C23588c<SupportBlipsProvider> {
    private final C25292a<BlipsProvider> blipsProvider;
    private final C25292a<Locale> localeProvider;
    private final ProviderModule module;

    public ProviderModule_ProvideSupportBlipsProviderFactory(ProviderModule providerModule, C25292a<BlipsProvider> aVar, C25292a<Locale> aVar2) {
        this.module = providerModule;
        this.blipsProvider = aVar;
        this.localeProvider = aVar2;
    }

    public static ProviderModule_ProvideSupportBlipsProviderFactory create(ProviderModule providerModule, C25292a<BlipsProvider> aVar, C25292a<Locale> aVar2) {
        return new ProviderModule_ProvideSupportBlipsProviderFactory(providerModule, aVar, aVar2);
    }

    public static SupportBlipsProvider provideSupportBlipsProvider(ProviderModule providerModule, BlipsProvider blipsProvider2, Locale locale) {
        SupportBlipsProvider provideSupportBlipsProvider = providerModule.provideSupportBlipsProvider(blipsProvider2, locale);
        C13641g.m34117e(provideSupportBlipsProvider);
        return provideSupportBlipsProvider;
    }

    public SupportBlipsProvider get() {
        return provideSupportBlipsProvider(this.module, this.blipsProvider.get(), this.localeProvider.get());
    }
}
