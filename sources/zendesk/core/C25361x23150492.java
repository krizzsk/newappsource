package zendesk.core;

import android.content.Context;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

/* renamed from: zendesk.core.ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory */
public final class C25361x23150492 implements C23588c<AcceptLanguageHeaderInterceptor> {
    private final C25292a<Context> contextProvider;

    public C25361x23150492(C25292a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static C25361x23150492 create(C25292a<Context> aVar) {
        return new C25361x23150492(aVar);
    }

    public static AcceptLanguageHeaderInterceptor provideAcceptLanguageHeaderInterceptor(Context context) {
        AcceptLanguageHeaderInterceptor provideAcceptLanguageHeaderInterceptor = ZendeskNetworkModule.provideAcceptLanguageHeaderInterceptor(context);
        C13641g.m34117e(provideAcceptLanguageHeaderInterceptor);
        return provideAcceptLanguageHeaderInterceptor;
    }

    public AcceptLanguageHeaderInterceptor get() {
        return provideAcceptLanguageHeaderInterceptor(this.contextProvider.get());
    }
}
