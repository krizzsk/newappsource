package zendesk.core;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskStorageModule_ProvidePushDeviceIdStorageFactory implements C23588c<PushDeviceIdStorage> {
    private final C25292a<BaseStorage> additionalSdkStorageProvider;

    public ZendeskStorageModule_ProvidePushDeviceIdStorageFactory(C25292a<BaseStorage> aVar) {
        this.additionalSdkStorageProvider = aVar;
    }

    public static ZendeskStorageModule_ProvidePushDeviceIdStorageFactory create(C25292a<BaseStorage> aVar) {
        return new ZendeskStorageModule_ProvidePushDeviceIdStorageFactory(aVar);
    }

    public static PushDeviceIdStorage providePushDeviceIdStorage(BaseStorage baseStorage) {
        PushDeviceIdStorage providePushDeviceIdStorage = ZendeskStorageModule.providePushDeviceIdStorage(baseStorage);
        C13641g.m34117e(providePushDeviceIdStorage);
        return providePushDeviceIdStorage;
    }

    public PushDeviceIdStorage get() {
        return providePushDeviceIdStorage(this.additionalSdkStorageProvider.get());
    }
}
