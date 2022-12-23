package zendesk.core;

import android.content.Context;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskStorageModule_ProvideIdentityBaseStorageFactory implements C23588c<BaseStorage> {
    private final C25292a<Context> contextProvider;
    private final C25292a<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvideIdentityBaseStorageFactory(C25292a<Context> aVar, C25292a<Serializer> aVar2) {
        this.contextProvider = aVar;
        this.serializerProvider = aVar2;
    }

    public static ZendeskStorageModule_ProvideIdentityBaseStorageFactory create(C25292a<Context> aVar, C25292a<Serializer> aVar2) {
        return new ZendeskStorageModule_ProvideIdentityBaseStorageFactory(aVar, aVar2);
    }

    public static BaseStorage provideIdentityBaseStorage(Context context, Object obj) {
        BaseStorage provideIdentityBaseStorage = ZendeskStorageModule.provideIdentityBaseStorage(context, (Serializer) obj);
        C13641g.m34117e(provideIdentityBaseStorage);
        return provideIdentityBaseStorage;
    }

    public BaseStorage get() {
        return provideIdentityBaseStorage(this.contextProvider.get(), this.serializerProvider.get());
    }
}
