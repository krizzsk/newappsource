package zendesk.core;

import ie0.C23588c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskApplicationModule_ProvideExecutorServiceFactory implements C23588c<ExecutorService> {
    private final C25292a<ScheduledExecutorService> scheduledExecutorServiceProvider;

    public ZendeskApplicationModule_ProvideExecutorServiceFactory(C25292a<ScheduledExecutorService> aVar) {
        this.scheduledExecutorServiceProvider = aVar;
    }

    public static ZendeskApplicationModule_ProvideExecutorServiceFactory create(C25292a<ScheduledExecutorService> aVar) {
        return new ZendeskApplicationModule_ProvideExecutorServiceFactory(aVar);
    }

    public static ExecutorService provideExecutorService(ScheduledExecutorService scheduledExecutorService) {
        ExecutorService provideExecutorService = ZendeskApplicationModule.provideExecutorService(scheduledExecutorService);
        C13641g.m34117e(provideExecutorService);
        return provideExecutorService;
    }

    public ExecutorService get() {
        return provideExecutorService(this.scheduledExecutorServiceProvider.get());
    }
}
