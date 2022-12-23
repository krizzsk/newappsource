package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;
import zendesk.core.ZendeskLocaleConverter;

public final class ProviderModule_ProvideZendeskLocaleConverterFactory implements C23588c<ZendeskLocaleConverter> {
    private final ProviderModule module;

    public ProviderModule_ProvideZendeskLocaleConverterFactory(ProviderModule providerModule) {
        this.module = providerModule;
    }

    public static ProviderModule_ProvideZendeskLocaleConverterFactory create(ProviderModule providerModule) {
        return new ProviderModule_ProvideZendeskLocaleConverterFactory(providerModule);
    }

    public static ZendeskLocaleConverter provideZendeskLocaleConverter(ProviderModule providerModule) {
        ZendeskLocaleConverter provideZendeskLocaleConverter = providerModule.provideZendeskLocaleConverter();
        C13641g.m34117e(provideZendeskLocaleConverter);
        return provideZendeskLocaleConverter;
    }

    public ZendeskLocaleConverter get() {
        return provideZendeskLocaleConverter(this.module);
    }
}
