package androidx.camera.core.impl;

import android.util.Size;
import androidx.camera.core.impl.Config;
import java.util.List;
import p054d0.C4275d;

/* renamed from: androidx.camera.core.impl.k */
public interface C0587k extends C0592p {

    /* renamed from: f */
    public static final C0572a f2005f = Config.C0564a.m1591a(C4275d.class, "camerax.core.imageOutput.targetAspectRatio");

    /* renamed from: g */
    public static final C0572a f2006g;

    /* renamed from: h */
    public static final C0572a f2007h;

    /* renamed from: i */
    public static final C0572a f2008i = Config.C0564a.m1591a(Size.class, "camerax.core.imageOutput.targetResolution");

    /* renamed from: j */
    public static final C0572a f2009j = Config.C0564a.m1591a(Size.class, "camerax.core.imageOutput.defaultResolution");

    /* renamed from: k */
    public static final C0572a f2010k = Config.C0564a.m1591a(Size.class, "camerax.core.imageOutput.maxResolution");

    /* renamed from: l */
    public static final C0572a f2011l = Config.C0564a.m1591a(List.class, "camerax.core.imageOutput.supportedResolutions");

    static {
        Class cls = Integer.TYPE;
        f2006g = Config.C0564a.m1591a(cls, "camerax.core.imageOutput.targetRotation");
        f2007h = Config.C0564a.m1591a(cls, "camerax.core.imageOutput.appTargetRotation");
    }

    /* renamed from: d */
    List mo2486d();

    /* renamed from: g */
    Size mo2487g();

    int getTargetAspectRatio();

    boolean hasTargetAspectRatio();

    /* renamed from: i */
    int mo2491i();

    /* renamed from: j */
    Size mo2492j();

    /* renamed from: k */
    Size mo2493k();

    /* renamed from: r */
    int mo2499r();
}
