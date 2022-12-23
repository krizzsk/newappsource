package zendesk.core;

import android.content.Context;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskStorageModule_ProvideSdkBaseStorageFactory implements C23588c<BaseStorage> {
    private final C25292a<Context> contextProvider;
    private final C25292a<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvideSdkBaseStorageFactory(C25292a<Context> aVar, C25292a<Serializer> aVar2) {
        this.contextProvider = aVar;
        this.serializerProvider = aVar2;
    }

    public static ZendeskStorageModule_ProvideSdkBaseStorageFactory create(C25292a<Context> aVar, C25292a<Serializer> aVar2) {
        return new ZendeskStorageModule_ProvideSdkBaseStorageFactory(aVar, aVar2);
    }

    public static BaseStorage provideSdkBaseStorage(Context context, Object obj) {
        BaseStorage provideSdkBaseStorage = ZendeskStorageModule.provideSdkBaseStorage(context, (Serializer) obj);
        C13641g.m34117e(provideSdkBaseStorage);
        return provideSdkBaseStorage;
    }

    public BaseStorage get() {
        return provideSdkBaseStorage(this.contextProvider.get(), this.serializerProvider.get());
    }
}
