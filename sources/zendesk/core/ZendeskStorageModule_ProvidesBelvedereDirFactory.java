package zendesk.core;

import android.content.Context;
import ie0.C23588c;
import java.io.File;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskStorageModule_ProvidesBelvedereDirFactory implements C23588c<File> {
    private final C25292a<Context> contextProvider;

    public ZendeskStorageModule_ProvidesBelvedereDirFactory(C25292a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static ZendeskStorageModule_ProvidesBelvedereDirFactory create(C25292a<Context> aVar) {
        return new ZendeskStorageModule_ProvidesBelvedereDirFactory(aVar);
    }

    public static File providesBelvedereDir(Context context) {
        File providesBelvedereDir = ZendeskStorageModule.providesBelvedereDir(context);
        C13641g.m34117e(providesBelvedereDir);
        return providesBelvedereDir;
    }

    public File get() {
        return providesBelvedereDir(this.contextProvider.get());
    }
}
