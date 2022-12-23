package androidx.camera.core.impl;

import androidx.camera.core.UseCase;
import androidx.camera.core.impl.C0578e;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import p054d0.C4292l;
import p054d0.C4307s;
import p115i0.C5231g;
import p115i0.C5233i;

/* renamed from: androidx.camera.core.impl.r */
public interface C0595r<T extends UseCase> extends C5231g<T>, C5233i, C0586j {

    /* renamed from: m */
    public static final C0572a f2024m = Config.C0564a.m1591a(SessionConfig.class, "camerax.core.useCase.defaultSessionConfig");

    /* renamed from: n */
    public static final C0572a f2025n = Config.C0564a.m1591a(C0578e.class, "camerax.core.useCase.defaultCaptureConfig");

    /* renamed from: o */
    public static final C0572a f2026o = Config.C0564a.m1591a(SessionConfig.C0568d.class, "camerax.core.useCase.sessionConfigUnpacker");

    /* renamed from: p */
    public static final C0572a f2027p = Config.C0564a.m1591a(C0578e.C0580b.class, "camerax.core.useCase.captureConfigUnpacker");

    /* renamed from: q */
    public static final C0572a f2028q = Config.C0564a.m1591a(Integer.TYPE, "camerax.core.useCase.surfaceOccupancyPriority");

    /* renamed from: r */
    public static final C0572a f2029r;

    /* renamed from: androidx.camera.core.impl.r$a */
    public interface C0596a<T extends UseCase, C extends C0595r<T>, B> extends C4307s<T> {
        C getUseCaseConfig();
    }

    static {
        Class<C4292l> cls = C4292l.class;
        f2029r = Config.C0564a.m1591a(cls, "camerax.core.useCase.cameraSelector");
        Config.C0564a.m1591a(cls, "camerax.core.useCase.targetFrameRate");
    }

    /* renamed from: n */
    SessionConfig mo2495n();

    /* renamed from: o */
    int mo2496o();

    /* renamed from: p */
    SessionConfig.C0568d mo2497p();

    /* renamed from: q */
    C4292l mo2498q();
}
