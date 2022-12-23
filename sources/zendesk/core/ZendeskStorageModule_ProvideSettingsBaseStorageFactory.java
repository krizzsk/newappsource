package zendesk.core;

import android.content.Context;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskStorageModule_ProvideSettingsBaseStorageFactory implements C23588c<BaseStorage> {
    private final C25292a<Context> contextProvider;
    private final C25292a<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvideSettingsBaseStorageFactory(C25292a<Context> aVar, C25292a<Serializer> aVar2) {
        this.contextProvider = aVar;
        this.serializerProvider = aVar2;
    }

    public static ZendeskStorageModule_ProvideSettingsBaseStorageFactory create(C25292a<Context> aVar, C25292a<Serializer> aVar2) {
        return new ZendeskStorageModule_ProvideSettingsBaseStorageFactory(aVar, aVar2);
    }

    public static BaseStorage provideSettingsBaseStorage(Context context, Object obj) {
        BaseStorage provideSettingsBaseStorage = ZendeskStorageModule.provideSettingsBaseStorage(context, (Serializer) obj);
        C13641g.m34117e(provideSettingsBaseStorage);
        return provideSettingsBaseStorage;
    }

    public BaseStorage get() {
        return provideSettingsBaseStorage(this.contextProvider.get(), this.serializerProvider.get());
    }
}
