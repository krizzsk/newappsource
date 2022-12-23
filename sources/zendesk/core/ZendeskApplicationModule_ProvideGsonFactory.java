package zendesk.core;

import com.google.gson.Gson;
import ie0.C23588c;
import p389bl.C13641g;

public final class ZendeskApplicationModule_ProvideGsonFactory implements C23588c<Gson> {
    private static final ZendeskApplicationModule_ProvideGsonFactory INSTANCE = new ZendeskApplicationModule_ProvideGsonFactory();

    public static ZendeskApplicationModule_ProvideGsonFactory create() {
        return INSTANCE;
    }

    public static Gson provideGson() {
        Gson provideGson = ZendeskApplicationModule.provideGson();
        C13641g.m34117e(provideGson);
        return provideGson;
    }

    public Gson get() {
        return provideGson();
    }
}
