package zendesk.support;

import android.content.Context;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class StorageModule_ProvideRequestMigratorFactory implements C23588c<RequestMigrator> {
    private final C25292a<Context> contextProvider;
    private final StorageModule module;

    public StorageModule_ProvideRequestMigratorFactory(StorageModule storageModule, C25292a<Context> aVar) {
        this.module = storageModule;
        this.contextProvider = aVar;
    }

    public static StorageModule_ProvideRequestMigratorFactory create(StorageModule storageModule, C25292a<Context> aVar) {
        return new StorageModule_ProvideRequestMigratorFactory(storageModule, aVar);
    }

    public static RequestMigrator provideRequestMigrator(StorageModule storageModule, Context context) {
        RequestMigrator provideRequestMigrator = storageModule.provideRequestMigrator(context);
        C13641g.m34117e(provideRequestMigrator);
        return provideRequestMigrator;
    }

    public RequestMigrator get() {
        return provideRequestMigrator(this.module, this.contextProvider.get());
    }
}
