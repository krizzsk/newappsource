package zendesk.core;

import ie0.C23588c;
import java.util.concurrent.ScheduledExecutorService;
import p389bl.C13641g;

public final class ZendeskApplicationModule_ProvideExecutorFactory implements C23588c<ScheduledExecutorService> {
    private static final ZendeskApplicationModule_ProvideExecutorFactory INSTANCE = new ZendeskApplicationModule_ProvideExecutorFactory();

    public static ZendeskApplicationModule_ProvideExecutorFactory create() {
        return INSTANCE;
    }

    public static ScheduledExecutorService provideExecutor() {
        ScheduledExecutorService provideExecutor = ZendeskApplicationModule.provideExecutor();
        C13641g.m34117e(provideExecutor);
        return provideExecutor;
    }

    public ScheduledExecutorService get() {
        return provideExecutor();
    }
}
