package zendesk.core;

import android.content.Context;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class ZendeskApplicationModule_ProvideDeviceInfoFactory implements C23588c<DeviceInfo> {
    private final C25292a<Context> contextProvider;

    public ZendeskApplicationModule_ProvideDeviceInfoFactory(C25292a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static ZendeskApplicationModule_ProvideDeviceInfoFactory create(C25292a<Context> aVar) {
        return new ZendeskApplicationModule_ProvideDeviceInfoFactory(aVar);
    }

    public static DeviceInfo provideDeviceInfo(Context context) {
        DeviceInfo provideDeviceInfo = ZendeskApplicationModule.provideDeviceInfo(context);
        C13641g.m34117e(provideDeviceInfo);
        return provideDeviceInfo;
    }

    public DeviceInfo get() {
        return provideDeviceInfo(this.contextProvider.get());
    }
}
