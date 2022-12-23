package zendesk.core;

import android.content.Context;
import ie0.C23588c;
import java.io.File;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskStorageModule_ProvidesDataDirFactory implements C23588c<File> {
    private final C25292a<Context> contextProvider;

    public ZendeskStorageModule_ProvidesDataDirFactory(C25292a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static ZendeskStorageModule_ProvidesDataDirFactory create(C25292a<Context> aVar) {
        return new ZendeskStorageModule_ProvidesDataDirFactory(aVar);
    }

    public static File providesDataDir(Context context) {
        File providesDataDir = ZendeskStorageModule.providesDataDir(context);
        C13641g.m34117e(providesDataDir);
        return providesDataDir;
    }

    public File get() {
        return providesDataDir(this.contextProvider.get());
    }
}
