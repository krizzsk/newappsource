package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;
import zendesk.core.ZendeskLocaleConverter;

public final class ServiceModule_ProvideZendeskHelpCenterServiceFactory implements C23588c<ZendeskHelpCenterService> {
    private final C25292a<HelpCenterService> helpCenterServiceProvider;
    private final C25292a<ZendeskLocaleConverter> localeConverterProvider;

    public ServiceModule_ProvideZendeskHelpCenterServiceFactory(C25292a<HelpCenterService> aVar, C25292a<ZendeskLocaleConverter> aVar2) {
        this.helpCenterServiceProvider = aVar;
        this.localeConverterProvider = aVar2;
    }

    public static ServiceModule_ProvideZendeskHelpCenterServiceFactory create(C25292a<HelpCenterService> aVar, C25292a<ZendeskLocaleConverter> aVar2) {
        return new ServiceModule_ProvideZendeskHelpCenterServiceFactory(aVar, aVar2);
    }

    public static ZendeskHelpCenterService provideZendeskHelpCenterService(Object obj, ZendeskLocaleConverter zendeskLocaleConverter) {
        ZendeskHelpCenterService provideZendeskHelpCenterService = ServiceModule.provideZendeskHelpCenterService((HelpCenterService) obj, zendeskLocaleConverter);
        C13641g.m34117e(provideZendeskHelpCenterService);
        return provideZendeskHelpCenterService;
    }

    public ZendeskHelpCenterService get() {
        return provideZendeskHelpCenterService(this.helpCenterServiceProvider.get(), this.localeConverterProvider.get());
    }
}
