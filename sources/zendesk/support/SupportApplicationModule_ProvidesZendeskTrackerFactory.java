package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;

public final class SupportApplicationModule_ProvidesZendeskTrackerFactory implements C23588c<ZendeskTracker> {
    private final SupportApplicationModule module;

    public SupportApplicationModule_ProvidesZendeskTrackerFactory(SupportApplicationModule supportApplicationModule) {
        this.module = supportApplicationModule;
    }

    public static SupportApplicationModule_ProvidesZendeskTrackerFactory create(SupportApplicationModule supportApplicationModule) {
        return new SupportApplicationModule_ProvidesZendeskTrackerFactory(supportApplicationModule);
    }

    public static ZendeskTracker providesZendeskTracker(SupportApplicationModule supportApplicationModule) {
        ZendeskTracker providesZendeskTracker = supportApplicationModule.providesZendeskTracker();
        C13641g.m34117e(providesZendeskTracker);
        return providesZendeskTracker;
    }

    public ZendeskTracker get() {
        return providesZendeskTracker(this.module);
    }
}
