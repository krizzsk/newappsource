package zendesk.core;

import android.content.Context;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory implements C23588c<BaseStorage> {
    private final C25292a<Context> contextProvider;
    private final C25292a<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory(C25292a<Context> aVar, C25292a<Serializer> aVar2) {
        this.contextProvider = aVar;
        this.serializerProvider = aVar2;
    }

    public static ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory create(C25292a<Context> aVar, C25292a<Serializer> aVar2) {
        return new ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory(aVar, aVar2);
    }

    public static BaseStorage provideAdditionalSdkBaseStorage(Context context, Object obj) {
        BaseStorage provideAdditionalSdkBaseStorage = ZendeskStorageModule.provideAdditionalSdkBaseStorage(context, (Serializer) obj);
        C13641g.m34117e(provideAdditionalSdkBaseStorage);
        return provideAdditionalSdkBaseStorage;
    }

    public BaseStorage get() {
        return provideAdditionalSdkBaseStorage(this.contextProvider.get(), this.serializerProvider.get());
    }
}
