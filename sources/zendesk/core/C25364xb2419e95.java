package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

/* renamed from: zendesk.core.ZendeskProvidersModule_ProvidePushRegistrationProviderInternalFactory */
public final class C25364xb2419e95 implements C23588c<PushRegistrationProviderInternal> {
    private final C25292a<PushRegistrationProvider> pushRegistrationProvider;

    public C25364xb2419e95(C25292a<PushRegistrationProvider> aVar) {
        this.pushRegistrationProvider = aVar;
    }

    public static C25364xb2419e95 create(C25292a<PushRegistrationProvider> aVar) {
        return new C25364xb2419e95(aVar);
    }

    public static PushRegistrationProviderInternal providePushRegistrationProviderInternal(PushRegistrationProvider pushRegistrationProvider2) {
        PushRegistrationProviderInternal providePushRegistrationProviderInternal = ZendeskProvidersModule.providePushRegistrationProviderInternal(pushRegistrationProvider2);
        C13641g.m34117e(providePushRegistrationProviderInternal);
        return providePushRegistrationProviderInternal;
    }

    public PushRegistrationProviderInternal get() {
        return providePushRegistrationProviderInternal(this.pushRegistrationProvider.get());
    }
}
