package androidx.camera.core.impl;

import android.util.Size;
import androidx.camera.core.C0612l;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.C0578e;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import java.util.List;
import java.util.Set;
import p001a0.C0016g;
import p001a0.C0017h;
import p032c0.C1754d;
import p054d0.C4285h0;
import p054d0.C4292l;
import p066e0.C4449p;
import p066e0.C4451q;
import p115i0.C5230f;
import p115i0.C5233i;
import p358af.C13437d;

/* renamed from: androidx.camera.core.impl.i */
public final class C0585i implements C0595r<C0612l>, C0587k, C5230f {

    /* renamed from: A */
    public static final C0572a f1992A = Config.C0564a.m1591a(C4449p.class, "camerax.core.imageCapture.captureBundle");

    /* renamed from: B */
    public static final C0572a f1993B = Config.C0564a.m1591a(C4451q.class, "camerax.core.imageCapture.captureProcessor");

    /* renamed from: C */
    public static final C0572a f1994C;

    /* renamed from: D */
    public static final C0572a f1995D;

    /* renamed from: E */
    public static final C0572a f1996E = Config.C0564a.m1591a(C4285h0.class, "camerax.core.imageCapture.imageReaderProxyProvider");

    /* renamed from: F */
    public static final C0572a f1997F;

    /* renamed from: G */
    public static final C0572a f1998G;

    /* renamed from: H */
    public static final C0572a f1999H;

    /* renamed from: I */
    public static final C0572a f2000I;

    /* renamed from: y */
    public static final C0572a f2001y;

    /* renamed from: z */
    public static final C0572a f2002z;

    /* renamed from: x */
    public final C0590n f2003x;

    static {
        Class<Integer> cls = Integer.class;
        Class cls2 = Integer.TYPE;
        f2001y = Config.C0564a.m1591a(cls2, "camerax.core.imageCapture.captureMode");
        f2002z = Config.C0564a.m1591a(cls2, "camerax.core.imageCapture.flashMode");
        f1994C = Config.C0564a.m1591a(cls, "camerax.core.imageCapture.bufferFormat");
        f1995D = Config.C0564a.m1591a(cls, "camerax.core.imageCapture.maxCaptureStages");
        Class cls3 = Boolean.TYPE;
        f1997F = Config.C0564a.m1591a(cls3, "camerax.core.imageCapture.useSoftwareJpegEncoder");
        f1998G = Config.C0564a.m1591a(cls2, "camerax.core.imageCapture.flashType");
        f1999H = Config.C0564a.m1591a(cls2, "camerax.core.imageCapture.jpegCompressionQuality");
        f2000I = Config.C0564a.m1591a(cls3, "camerax.core.imageCapture.sessionProcessorEnabled");
    }

    public C0585i(C0590n nVar) {
        this.f2003x = nVar;
    }

    /* renamed from: a */
    public final Object mo2422a(Config.C0564a aVar) {
        return ((C0590n) getConfig()).mo2422a(aVar);
    }

    /* renamed from: b */
    public final Object mo2423b(Config.C0564a aVar, Object obj) {
        return ((C0590n) getConfig()).mo2423b(aVar, obj);
    }

    /* renamed from: c */
    public final Config.OptionPriority mo2424c(Config.C0564a aVar) {
        return ((C0590n) getConfig()).mo2424c(aVar);
    }

    /* renamed from: d */
    public final List mo2486d() {
        return (List) mo2423b(C0587k.f2011l, (Object) null);
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo2425e(Config.C0564a aVar) {
        return C13437d.m33696a(this, (C0572a) aVar);
    }

    /* renamed from: f */
    public final Object mo2426f(Config.C0564a aVar, Config.OptionPriority optionPriority) {
        return ((C0590n) getConfig()).mo2426f(aVar, optionPriority);
    }

    /* renamed from: g */
    public final Size mo2487g() {
        return (Size) mo2423b(C0587k.f2009j, (Object) null);
    }

    public final Config getConfig() {
        return this.f2003x;
    }

    public final int getInputFormat() {
        return ((Integer) ((C0590n) getConfig()).mo2422a(C0586j.f2004e)).intValue();
    }

    public final /* synthetic */ int getTargetAspectRatio() {
        return C0017h.m68c(this);
    }

    public final /* synthetic */ String getTargetName(String str) {
        return C0016g.m18a(this, str);
    }

    /* renamed from: h */
    public final Set mo2429h(Config.C0564a aVar) {
        return ((C0590n) getConfig()).mo2429h(aVar);
    }

    public final boolean hasTargetAspectRatio() {
        return mo2425e(C0587k.f2005f);
    }

    /* renamed from: i */
    public final /* synthetic */ int mo2491i() {
        return C0017h.m69d(this);
    }

    /* renamed from: j */
    public final Size mo2492j() {
        return (Size) mo2423b(C0587k.f2008i, (Object) null);
    }

    /* renamed from: k */
    public final Size mo2493k() {
        return (Size) mo2423b(C0587k.f2010k, (Object) null);
    }

    /* renamed from: l */
    public final /* synthetic */ void mo2430l(C1754d dVar) {
        C13437d.m33697b(this, dVar);
    }

    public final Set listOptions() {
        return ((C0590n) getConfig()).listOptions();
    }

    /* renamed from: m */
    public final UseCase.C0539b mo2494m() {
        return (UseCase.C0539b) mo2423b(C5233i.f17326w, null);
    }

    /* renamed from: n */
    public final SessionConfig mo2495n() {
        return (SessionConfig) mo2423b(C0595r.f2024m, (Object) null);
    }

    /* renamed from: o */
    public final /* synthetic */ int mo2496o() {
        return C13555b.m33962a(this);
    }

    /* renamed from: p */
    public final SessionConfig.C0568d mo2497p() {
        return (SessionConfig.C0568d) mo2423b(C0595r.f2026o, (Object) null);
    }

    /* renamed from: q */
    public final C4292l mo2498q() {
        return (C4292l) mo2423b(C0595r.f2029r, (Object) null);
    }

    /* renamed from: r */
    public final /* synthetic */ int mo2499r() {
        return C0017h.m67b(this);
    }

    /* renamed from: s */
    public final C0578e.C0580b mo2500s() {
        return (C0578e.C0580b) mo2423b(C0595r.f2027p, (Object) null);
    }

    /* renamed from: t */
    public final C0578e mo2501t() {
        return (C0578e) mo2423b(C0595r.f2025n, (Object) null);
    }
}
