package zendesk.support;

import ie0.C23588c;
import java.util.Locale;
import p389bl.C13641g;

public final class SupportApplicationModule_ProvideLocaleFactory implements C23588c<Locale> {
    private final SupportApplicationModule module;

    public SupportApplicationModule_ProvideLocaleFactory(SupportApplicationModule supportApplicationModule) {
        this.module = supportApplicationModule;
    }

    public static SupportApplicationModule_ProvideLocaleFactory create(SupportApplicationModule supportApplicationModule) {
        return new SupportApplicationModule_ProvideLocaleFactory(supportApplicationModule);
    }

    public static Locale provideLocale(SupportApplicationModule supportApplicationModule) {
        Locale provideLocale = supportApplicationModule.provideLocale();
        C13641g.m34117e(provideLocale);
        return provideLocale;
    }

    public Locale get() {
        return provideLocale(this.module);
    }
}
