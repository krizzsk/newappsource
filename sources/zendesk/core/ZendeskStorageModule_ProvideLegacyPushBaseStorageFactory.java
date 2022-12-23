package zendesk.core;

import android.content.Context;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory implements C23588c<SharedPreferencesStorage> {
    private final C25292a<Context> contextProvider;
    private final C25292a<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory(C25292a<Context> aVar, C25292a<Serializer> aVar2) {
        this.contextProvider = aVar;
        this.serializerProvider = aVar2;
    }

    public static ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory create(C25292a<Context> aVar, C25292a<Serializer> aVar2) {
        return new ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory(aVar, aVar2);
    }

    public static SharedPreferencesStorage provideLegacyPushBaseStorage(Context context, Object obj) {
        SharedPreferencesStorage provideLegacyPushBaseStorage = ZendeskStorageModule.provideLegacyPushBaseStorage(context, (Serializer) obj);
        C13641g.m34117e(provideLegacyPushBaseStorage);
        return provideLegacyPushBaseStorage;
    }

    public SharedPreferencesStorage get() {
        return provideLegacyPushBaseStorage(this.contextProvider.get(), this.serializerProvider.get());
    }
}
