package gd0;

import com.veriff.sdk.camera.core.internal.ThreadConfig;
import java.util.concurrent.Executor;

/* renamed from: gd0.c */
public final /* synthetic */ class C12733c {
    /* renamed from: a */
    public static Executor m32503a(ThreadConfig threadConfig, Executor executor) {
        return (Executor) threadConfig.retrieveOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
    }
}
