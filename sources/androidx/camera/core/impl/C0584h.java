package androidx.camera.core.impl;

import android.util.Size;
import androidx.camera.core.C0556i;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import java.util.List;
import java.util.Set;
import p001a0.C0016g;
import p001a0.C0017h;
import p032c0.C1754d;
import p054d0.C4285h0;
import p054d0.C4292l;
import p115i0.C5232h;
import p115i0.C5233i;
import p358af.C13437d;

/* renamed from: androidx.camera.core.impl.h */
public final class C0584h implements C0595r<C0556i>, C0587k, C5232h {

    /* renamed from: A */
    public static final C0572a f1985A = Config.C0564a.m1591a(C4285h0.class, "camerax.core.imageAnalysis.imageReaderProxyProvider");

    /* renamed from: B */
    public static final C0572a f1986B = Config.C0564a.m1591a(C0556i.C0561e.class, "camerax.core.imageAnalysis.outputImageFormat");

    /* renamed from: C */
    public static final C0572a f1987C;

    /* renamed from: D */
    public static final C0572a f1988D;

    /* renamed from: y */
    public static final C0572a f1989y = Config.C0564a.m1591a(C0556i.C0558b.class, "camerax.core.imageAnalysis.backpressureStrategy");

    /* renamed from: z */
    public static final C0572a f1990z = Config.C0564a.m1591a(Integer.TYPE, "camerax.core.imageAnalysis.imageQueueDepth");

    /* renamed from: x */
    public final C0590n f1991x;

    static {
        Class<Boolean> cls = Boolean.class;
        f1987C = Config.C0564a.m1591a(cls, "camerax.core.imageAnalysis.onePixelShiftEnabled");
        f1988D = Config.C0564a.m1591a(cls, "camerax.core.imageAnalysis.outputImageRotationEnabled");
    }

    public C0584h(C0590n nVar) {
        this.f1991x = nVar;
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
        return this.f1991x;
    }

    public final int getInputFormat() {
        return 35;
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
}
