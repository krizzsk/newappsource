package zendesk.core;

import android.content.Context;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory implements C23588c<SharedPreferencesStorage> {
    private final C25292a<Context> contextProvider;
    private final C25292a<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory(C25292a<Context> aVar, C25292a<Serializer> aVar2) {
        this.contextProvider = aVar;
        this.serializerProvider = aVar2;
    }

    public static ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory create(C25292a<Context> aVar, C25292a<Serializer> aVar2) {
        return new ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory(aVar, aVar2);
    }

    public static SharedPreferencesStorage provideLegacyIdentityBaseStorage(Context context, Object obj) {
        SharedPreferencesStorage provideLegacyIdentityBaseStorage = ZendeskStorageModule.provideLegacyIdentityBaseStorage(context, (Serializer) obj);
        C13641g.m34117e(provideLegacyIdentityBaseStorage);
        return provideLegacyIdentityBaseStorage;
    }

    public SharedPreferencesStorage get() {
        return provideLegacyIdentityBaseStorage(this.contextProvider.get(), this.serializerProvider.get());
    }
}
