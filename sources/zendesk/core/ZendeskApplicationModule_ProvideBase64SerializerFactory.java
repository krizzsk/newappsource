package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskApplicationModule_ProvideBase64SerializerFactory implements C23588c<Serializer> {
    private final C25292a<Serializer> gsonSerializerProvider;
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideBase64SerializerFactory(ZendeskApplicationModule zendeskApplicationModule, C25292a<Serializer> aVar) {
        this.module = zendeskApplicationModule;
        this.gsonSerializerProvider = aVar;
    }

    public static ZendeskApplicationModule_ProvideBase64SerializerFactory create(ZendeskApplicationModule zendeskApplicationModule, C25292a<Serializer> aVar) {
        return new ZendeskApplicationModule_ProvideBase64SerializerFactory(zendeskApplicationModule, aVar);
    }

    public static Serializer provideBase64Serializer(ZendeskApplicationModule zendeskApplicationModule, Object obj) {
        Serializer provideBase64Serializer = zendeskApplicationModule.provideBase64Serializer((Serializer) obj);
        C13641g.m34117e(provideBase64Serializer);
        return provideBase64Serializer;
    }

    public Serializer get() {
        return provideBase64Serializer(this.module, this.gsonSerializerProvider.get());
    }
}
