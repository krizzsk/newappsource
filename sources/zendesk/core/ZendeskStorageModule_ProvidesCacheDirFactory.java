package zendesk.core;

import android.content.Context;
import ie0.C23588c;
import java.io.File;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskStorageModule_ProvidesCacheDirFactory implements C23588c<File> {
    private final C25292a<Context> contextProvider;

    public ZendeskStorageModule_ProvidesCacheDirFactory(C25292a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static ZendeskStorageModule_ProvidesCacheDirFactory create(C25292a<Context> aVar) {
        return new ZendeskStorageModule_ProvidesCacheDirFactory(aVar);
    }

    public static File providesCacheDir(Context context) {
        File providesCacheDir = ZendeskStorageModule.providesCacheDir(context);
        C13641g.m34117e(providesCacheDir);
        return providesCacheDir;
    }

    public File get() {
        return providesCacheDir(this.contextProvider.get());
    }
}
