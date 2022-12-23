package gd0;

import com.veriff.sdk.camera.core.UseCase;
import com.veriff.sdk.camera.core.internal.UseCaseEventConfig;

/* renamed from: gd0.d */
public final /* synthetic */ class C12734d {
    /* renamed from: a */
    public static UseCase.EventCallback m32504a(UseCaseEventConfig useCaseEventConfig, UseCase.EventCallback eventCallback) {
        return (UseCase.EventCallback) useCaseEventConfig.retrieveOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK, eventCallback);
    }
}
