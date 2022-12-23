package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;

public final class ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory implements C23588c<ZendeskLocaleConverter> {
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory(ZendeskApplicationModule zendeskApplicationModule) {
        this.module = zendeskApplicationModule;
    }

    public static ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory create(ZendeskApplicationModule zendeskApplicationModule) {
        return new ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory(zendeskApplicationModule);
    }

    public static ZendeskLocaleConverter provideZendeskLocaleConverter(ZendeskApplicationModule zendeskApplicationModule) {
        ZendeskLocaleConverter provideZendeskLocaleConverter = zendeskApplicationModule.provideZendeskLocaleConverter();
        C13641g.m34117e(provideZendeskLocaleConverter);
        return provideZendeskLocaleConverter;
    }

    public ZendeskLocaleConverter get() {
        return provideZendeskLocaleConverter(this.module);
    }
}
