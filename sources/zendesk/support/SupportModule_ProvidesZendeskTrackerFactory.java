package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;

public final class SupportModule_ProvidesZendeskTrackerFactory implements C23588c<ZendeskTracker> {
    private final SupportModule module;

    public SupportModule_ProvidesZendeskTrackerFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesZendeskTrackerFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesZendeskTrackerFactory(supportModule);
    }

    public static ZendeskTracker providesZendeskTracker(SupportModule supportModule) {
        ZendeskTracker providesZendeskTracker = supportModule.providesZendeskTracker();
        C13641g.m34117e(providesZendeskTracker);
        return providesZendeskTracker;
    }

    public ZendeskTracker get() {
        return providesZendeskTracker(this.module);
    }
}
