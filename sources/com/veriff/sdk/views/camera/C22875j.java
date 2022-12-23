package com.veriff.sdk.views.camera;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.C1033p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C21636fm;
import com.veriff.sdk.internal.C21639fp;
import com.veriff.sdk.internal.C21789ix;
import com.veriff.sdk.internal.C22047nb;
import com.veriff.sdk.views.camera.C22863d;
import kotlin.Metadata;
import lf0.C24225a;
import mf0.C24362h;
import mobi.lab.veriff.util.C24446b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0001\u0018\u00002\u00020\u0001:\u0002\u000e\u000fJ2\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¨\u0006\u0010"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/CameraProvider;", "", "Landroid/view/ViewGroup;", "previewContainer", "Landroidx/lifecycle/p;", "lifecycleOwner", "Lcom/veriff/sdk/views/camera/Camera$Listener;", "listener", "Lcom/veriff/sdk/views/camera/Camera$VideoListener;", "videoListener", "Lcom/veriff/sdk/views/camera/Camera$Detector;", "detector", "Lcom/veriff/sdk/views/camera/Camera;", "createCamera", "CameraXProvider", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.j */
public interface C22875j {

    /* renamed from: b */
    public static final C22877b f58068b = C22877b.f58079a;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\u0006\u0010&\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"¢\u0006\u0004\b'\u0010(J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0010R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0010¨\u0006)"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/CameraProvider$CameraXProvider;", "Lcom/veriff/sdk/views/camera/CameraProvider;", "Landroid/view/ViewGroup;", "previewContainer", "Landroidx/lifecycle/p;", "lifecycleOwner", "Lcom/veriff/sdk/views/camera/Camera$Listener;", "listener", "Lcom/veriff/sdk/views/camera/Camera$VideoListener;", "videoListener", "Lcom/veriff/sdk/views/camera/Camera$Detector;", "detector", "Lcom/veriff/sdk/views/camera/Camera;", "createCamera", "Lcom/veriff/sdk/internal/Scheduler;", "audioEncoderScheduler", "Lcom/veriff/sdk/internal/Scheduler;", "Lmobi/lab/veriff/util/Clock;", "clock", "Lmobi/lab/veriff/util/Clock;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "diskScheduler", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "mainScheduler", "Lcom/veriff/sdk/internal/upload/MediaStorage;", "mediaStorage", "Lcom/veriff/sdk/internal/upload/MediaStorage;", "Lcom/veriff/sdk/internal/SessionServices;", "sessionServices", "Lcom/veriff/sdk/internal/SessionServices;", "Lkotlin/Function0;", "Lcom/veriff/sdk/views/camera/VideoConfiguration;", "videoConfigurationProvider", "Llf0/a;", "videoEncoderScheduler", "<init>", "(Landroid/content/Context;Lmobi/lab/veriff/util/Clock;Lcom/veriff/sdk/internal/SessionServices;Lcom/veriff/sdk/internal/upload/MediaStorage;Lcom/veriff/sdk/internal/data/FeatureFlags;Lcom/veriff/sdk/internal/Scheduler;Lcom/veriff/sdk/internal/Scheduler;Lcom/veriff/sdk/internal/Scheduler;Lcom/veriff/sdk/internal/Scheduler;Llf0/a;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.j$a */
    public static final class C22876a implements C22875j {

        /* renamed from: a */
        private final Context f58069a;

        /* renamed from: c */
        private final C24446b f58070c;

        /* renamed from: d */
        private final C21639fp f58071d;

        /* renamed from: e */
        private final C22047nb f58072e;

        /* renamed from: f */
        private final C21789ix f58073f;

        /* renamed from: g */
        private final C21636fm f58074g;

        /* renamed from: h */
        private final C21636fm f58075h;

        /* renamed from: i */
        private final C21636fm f58076i;

        /* renamed from: j */
        private final C21636fm f58077j;

        /* renamed from: k */
        private final C24225a<C22833ah> f58078k;

        public C22876a(Context context, C24446b bVar, C21639fp fpVar, C22047nb nbVar, C21789ix ixVar, C21636fm fmVar, C21636fm fmVar2, C21636fm fmVar3, C21636fm fmVar4, C24225a<C22833ah> aVar) {
            C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
            C24362h.m61211f(bVar, "clock");
            C24362h.m61211f(fpVar, "sessionServices");
            C24362h.m61211f(nbVar, "mediaStorage");
            C24362h.m61211f(ixVar, "featureFlags");
            C24362h.m61211f(fmVar, "diskScheduler");
            C24362h.m61211f(fmVar2, "mainScheduler");
            C24362h.m61211f(fmVar3, "videoEncoderScheduler");
            C24362h.m61211f(fmVar4, "audioEncoderScheduler");
            C24362h.m61211f(aVar, "videoConfigurationProvider");
            this.f58069a = context;
            this.f58070c = bVar;
            this.f58071d = fpVar;
            this.f58072e = nbVar;
            this.f58073f = ixVar;
            this.f58074g = fmVar;
            this.f58075h = fmVar2;
            this.f58076i = fmVar3;
            this.f58077j = fmVar4;
            this.f58078k = aVar;
        }

        public C22863d createCamera(ViewGroup viewGroup, C1033p pVar, C22863d.C22865b bVar, C22863d.C22867d dVar, C22863d.C22864a aVar) {
            C1033p pVar2 = pVar;
            C22863d.C22865b bVar2 = bVar;
            C22863d.C22867d dVar2 = dVar;
            C22863d.C22864a aVar2 = aVar;
            C24362h.m61211f(viewGroup, "previewContainer");
            C24362h.m61211f(pVar, "lifecycleOwner");
            C24362h.m61211f(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            C24362h.m61211f(dVar, "videoListener");
            return new C22878k(this.f58069a, this.f58070c, aVar2, this.f58078k, this.f58073f, this.f58071d.mo54908b(), this.f58071d.mo54910d(), this.f58072e, pVar2, bVar2, dVar2, this.f58074g, this.f58075h, this.f58076i, this.f58077j, viewGroup);
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/CameraProvider$Companion;", "", "()V", "override", "Lcom/veriff/sdk/views/camera/CameraProvider;", "getOverride", "()Lcom/veriff/sdk/views/camera/CameraProvider;", "setOverride", "(Lcom/veriff/sdk/views/camera/CameraProvider;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.j$b */
    public static final class C22877b {

        /* renamed from: a */
        public static final /* synthetic */ C22877b f58079a = new C22877b();

        private C22877b() {
        }

        /* renamed from: a */
        public final C22875j mo57742a() {
            return null;
        }
    }

    C22863d createCamera(ViewGroup viewGroup, C1033p pVar, C22863d.C22865b bVar, C22863d.C22867d dVar, C22863d.C22864a aVar);
}
