package zendesk.core;

import com.google.gson.Gson;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskStorageModule_ProvideSerializerFactory implements C23588c<Serializer> {
    private final C25292a<Gson> gsonProvider;

    public ZendeskStorageModule_ProvideSerializerFactory(C25292a<Gson> aVar) {
        this.gsonProvider = aVar;
    }

    public static ZendeskStorageModule_ProvideSerializerFactory create(C25292a<Gson> aVar) {
        return new ZendeskStorageModule_ProvideSerializerFactory(aVar);
    }

    public static Serializer provideSerializer(Gson gson) {
        Serializer provideSerializer = ZendeskStorageModule.provideSerializer(gson);
        C13641g.m34117e(provideSerializer);
        return provideSerializer;
    }

    public Serializer get() {
        return provideSerializer(this.gsonProvider.get());
    }
}
