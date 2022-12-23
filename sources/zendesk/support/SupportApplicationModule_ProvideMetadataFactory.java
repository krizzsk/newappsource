package zendesk.support;

import android.content.Context;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

public final class SupportApplicationModule_ProvideMetadataFactory implements C23588c<SupportSdkMetadata> {
    private final C25292a<Context> contextProvider;
    private final SupportApplicationModule module;

    public SupportApplicationModule_ProvideMetadataFactory(SupportApplicationModule supportApplicationModule, C25292a<Context> aVar) {
        this.module = supportApplicationModule;
        this.contextProvider = aVar;
    }

    public static SupportApplicationModule_ProvideMetadataFactory create(SupportApplicationModule supportApplicationModule, C25292a<Context> aVar) {
        return new SupportApplicationModule_ProvideMetadataFactory(supportApplicationModule, aVar);
    }

    public static SupportSdkMetadata provideMetadata(SupportApplicationModule supportApplicationModule, Context context) {
        SupportSdkMetadata provideMetadata = supportApplicationModule.provideMetadata(context);
        C13641g.m34117e(provideMetadata);
        return provideMetadata;
    }

    public SupportSdkMetadata get() {
        return provideMetadata(this.module, this.contextProvider.get());
    }
}
