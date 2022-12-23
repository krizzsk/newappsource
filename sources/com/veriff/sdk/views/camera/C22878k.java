package com.veriff.sdk.views.camera;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import androidx.lifecycle.C1033p;
import bf0.C21050d;
import com.appboy.support.AppboyFileUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.camera.core.Camera;
import com.veriff.sdk.camera.core.CameraControl;
import com.veriff.sdk.camera.core.CameraInfo;
import com.veriff.sdk.camera.core.CameraSelector;
import com.veriff.sdk.camera.core.FocusMeteringAction;
import com.veriff.sdk.camera.core.ImageAnalysis;
import com.veriff.sdk.camera.core.ImageCapture;
import com.veriff.sdk.camera.core.ImageCaptureException;
import com.veriff.sdk.camera.core.ImageProxy;
import com.veriff.sdk.camera.core.MeteringPoint;
import com.veriff.sdk.camera.core.MeteringPointFactory;
import com.veriff.sdk.camera.core.Preview;
import com.veriff.sdk.camera.core.UseCase;
import com.veriff.sdk.camera.lifecycle.ProcessCameraProvider;
import com.veriff.sdk.camera.view.PreviewView;
import com.veriff.sdk.detector.Size;
import com.veriff.sdk.internal.C21625ff;
import com.veriff.sdk.internal.C21636fm;
import com.veriff.sdk.internal.C21637fn;
import com.veriff.sdk.internal.C21645fu;
import com.veriff.sdk.internal.C21667gf;
import com.veriff.sdk.internal.C21716gg;
import com.veriff.sdk.internal.C21720gj;
import com.veriff.sdk.internal.C21789ix;
import com.veriff.sdk.internal.C21886js;
import com.veriff.sdk.internal.C21910kf;
import com.veriff.sdk.internal.C22047nb;
import com.veriff.sdk.internal.C22061nh;
import com.veriff.sdk.internal.C22660wl;
import com.veriff.sdk.views.camera.C22849ao;
import com.veriff.sdk.views.camera.C22863d;
import java.io.File;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import lf0.C24225a;
import lf0.C24236l;
import mf0.C24362h;
import mobi.lab.veriff.util.C24446b;
import mobi.lab.veriff.util.C24465j;
import p090g1.C4732a;
import p695od.C18728c;
import wh0.C25162c0;
import wh0.C25210r;
import wh0.C25213s;
import wh0.C25232y0;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010;\u001a\u00020:\u0012\b\u0010E\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0^\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u0010O\u001a\u00020N\u0012\u0006\u0010R\u001a\u00020Q\u0012\u0006\u0010c\u001a\u00020b\u0012\u0006\u0010G\u001a\u00020+\u0012\u0006\u0010T\u001a\u00020+\u0012\u0006\u0010a\u001a\u00020+\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010f\u001a\u00020e¢\u0006\u0004\bg\u0010hJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001c\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001a\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u0002H\u0002J \u0010$\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016J2\u0010'\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\u0002H\u0002R\u0014\u0010)\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\"\u00104\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010202018\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010%\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u0004\u0018\u00010\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010-R\u0014\u0010I\u001a\u00020H8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010T\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010-R\u0014\u0010V\u001a\u00020U8\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010]\u001a\u0004\u0018\u00010\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u001c\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0^8\u0002X\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010a\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\ba\u0010-R\u0014\u0010c\u001a\u00020b8\u0002X\u0004¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006i"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/CameraXCamera;", "Lcom/veriff/sdk/views/camera/Camera;", "", "hasCurrentCameraFlashCapability", "", "x", "y", "Lbf0/d;", "focus", "resetFaceFocus", "deselectCamera", "Lcom/veriff/sdk/views/camera/Camera$Detector;", "analyzer", "Lcom/veriff/sdk/camera/core/ImageAnalysis;", "createDetectorOnlyAnalysis", "Lcom/veriff/sdk/views/camera/VideoConfiguration;", "videoConfig", "Lcom/veriff/sdk/views/camera/Camera$Type;", "preferredCamera", "createImageAnalysis", "Lcom/veriff/sdk/camera/core/ImageCapture;", "createImageCapture", "Lcom/veriff/sdk/camera/core/Preview;", "createPreview", "Lcom/veriff/sdk/views/camera/Rotation;", "rotation", "createVideoRecorder", "selectCamera", "tryOtherCamera", "startCamera", "Lmobi/lab/veriff/fragment/PhotoConf;", "conf", "Lcom/veriff/sdk/internal/upload/PictureStorage;", "pictureStorage", "", "fileName", "takePhoto", "capture", "withTorch", "takePictureInternal", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "Lcom/veriff/sdk/internal/Scheduler;", "audioEncoderThread", "Lcom/veriff/sdk/internal/Scheduler;", "Lcom/veriff/sdk/camera/core/Camera;", "camera", "Lcom/veriff/sdk/camera/core/Camera;", "Lod/c;", "Lcom/veriff/sdk/camera/lifecycle/ProcessCameraProvider;", "kotlin.jvm.PlatformType", "cameraProviderFuture", "Lod/c;", "Lcom/veriff/sdk/camera/core/CameraSelector;", "cameraSelector", "Lcom/veriff/sdk/camera/core/CameraSelector;", "Lcom/veriff/sdk/camera/core/ImageCapture;", "Lmobi/lab/veriff/util/Clock;", "clock", "Lmobi/lab/veriff/util/Clock;", "Lcom/veriff/sdk/internal/Idler$Handle;", "closeVideoHandle", "Lcom/veriff/sdk/internal/Idler$Handle;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "currentOrientation", "Lcom/veriff/sdk/views/camera/Camera$Type;", "detector", "Lcom/veriff/sdk/views/camera/Camera$Detector;", "disk", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "Landroidx/lifecycle/p;", "lifecycleOwner", "Landroidx/lifecycle/p;", "Lcom/veriff/sdk/views/camera/Camera$Listener;", "listener", "Lcom/veriff/sdk/views/camera/Camera$Listener;", "main", "Lcom/veriff/sdk/internal/upload/MediaStorage;", "mediaStorage", "Lcom/veriff/sdk/internal/upload/MediaStorage;", "Lcom/veriff/sdk/camera/view/PreviewView;", "previewView", "Lcom/veriff/sdk/camera/view/PreviewView;", "getSelectedCamera", "()Lcom/veriff/sdk/views/camera/Camera$Type;", "selectedCamera", "Lkotlin/Function0;", "videoConfigurationProvider", "Llf0/a;", "videoEncoderThread", "Lcom/veriff/sdk/views/camera/Camera$VideoListener;", "videoListener", "Lcom/veriff/sdk/views/camera/Camera$VideoListener;", "Landroid/view/ViewGroup;", "previewContainer", "<init>", "(Landroid/content/Context;Lmobi/lab/veriff/util/Clock;Lcom/veriff/sdk/views/camera/Camera$Detector;Llf0/a;Lcom/veriff/sdk/internal/data/FeatureFlags;Lcom/veriff/sdk/internal/analytics/Analytics;Lcom/veriff/sdk/internal/errors/ErrorReporter;Lcom/veriff/sdk/internal/upload/MediaStorage;Landroidx/lifecycle/p;Lcom/veriff/sdk/views/camera/Camera$Listener;Lcom/veriff/sdk/views/camera/Camera$VideoListener;Lcom/veriff/sdk/internal/Scheduler;Lcom/veriff/sdk/internal/Scheduler;Lcom/veriff/sdk/internal/Scheduler;Lcom/veriff/sdk/internal/Scheduler;Landroid/view/ViewGroup;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.k */
public final class C22878k implements C22863d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C18728c<ProcessCameraProvider> f58080a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final PreviewView f58081b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Camera f58082d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ImageCapture f58083e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C21625ff.C21626a f58084f;

    /* renamed from: g */
    private C22863d.C22866c f58085g;

    /* renamed from: h */
    private final Context f58086h;

    /* renamed from: i */
    private final C24446b f58087i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C22863d.C22864a f58088j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C24225a<C22833ah> f58089k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C21789ix f58090l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C21645fu f58091m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C21910kf f58092n;

    /* renamed from: o */
    private final C22047nb f58093o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C1033p f58094p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C22863d.C22865b f58095q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C22863d.C22867d f58096r;

    /* renamed from: s */
    private final C21636fm f58097s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C21636fm f58098t;

    /* renamed from: u */
    private final C21636fm f58099u;

    /* renamed from: v */
    private final C21636fm f58100v;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo59060d2 = {"Lcom/veriff/sdk/camera/core/ImageProxy;", "it", "Lbf0/d;", "analyze", "(Lcom/veriff/sdk/camera/core/ImageProxy;)V", "com/veriff/sdk/views/camera/CameraXCamera$createDetectorOnlyAnalysis$1$2", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.k$a */
    public static final class C22879a implements ImageAnalysis.Analyzer {

        /* renamed from: a */
        public final /* synthetic */ C22878k f58101a;

        /* renamed from: b */
        public final /* synthetic */ C22863d.C22864a f58102b;

        public C22879a(C22878k kVar, C22863d.C22864a aVar) {
            this.f58101a = kVar;
            this.f58102b = aVar;
        }

        public final void analyze(ImageProxy imageProxy) {
            C24362h.m61211f(imageProxy, "it");
            this.f58102b.mo56097a(imageProxy, new Size((float) this.f58101a.f58081b.getWidth(), (float) this.f58101a.f58081b.getHeight()));
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "it", "Lbf0/d;", "execute", "(Ljava/lang/Runnable;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.k$b */
    public static final class C22880b implements Executor {

        /* renamed from: a */
        public static final C22880b f58103a = new C22880b();

        public final void execute(Runnable runnable) {
            C21637fn.m52525e().mo54894a(runnable);
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "it", "Lbf0/d;", "execute", "(Ljava/lang/Runnable;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.k$c */
    public static final class C22881c implements Executor {

        /* renamed from: a */
        public static final C22881c f58104a = new C22881c();

        public final void execute(Runnable runnable) {
            C21637fn.m52525e().mo54894a(runnable);
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Lcom/veriff/sdk/camera/core/ImageProxy;", "it", "Lbf0/d;", "analyze", "(Lcom/veriff/sdk/camera/core/ImageProxy;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.k$d */
    public static final class C22882d implements ImageAnalysis.Analyzer {

        /* renamed from: a */
        public final /* synthetic */ C22878k f58105a;

        /* renamed from: b */
        public final /* synthetic */ C22837al f58106b;

        public C22882d(C22878k kVar, C22837al alVar) {
            this.f58105a = kVar;
            this.f58106b = alVar;
        }

        public final void analyze(ImageProxy imageProxy) {
            C24362h.m61211f(imageProxy, "it");
            try {
                this.f58106b.mo57662a(imageProxy);
                C22863d.C22864a n = this.f58105a.f58088j;
                if (n != null) {
                    n.mo56097a(imageProxy, new Size((float) this.f58105a.f58081b.getWidth(), (float) this.f58105a.f58081b.getHeight()));
                }
            } finally {
                imageProxy.close();
            }
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo59060d2 = {"com/veriff/sdk/views/camera/CameraXCamera$createVideoRecorder$analysis$1", "Lcom/veriff/sdk/camera/core/UseCase$EventCallback;", "Lcom/veriff/sdk/camera/core/CameraInfo;", "cameraInfo", "Lbf0/d;", "onAttach", "onDetach", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.k$e */
    public static final class C22883e implements UseCase.EventCallback {

        /* renamed from: a */
        public final /* synthetic */ C22878k f58107a;

        /* renamed from: b */
        public final /* synthetic */ C22837al f58108b;

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.camera.k$e$a */
        public static final class C22884a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C22883e f58109a;

            public C22884a(C22883e eVar) {
                this.f58109a = eVar;
            }

            public final void run() {
                this.f58109a.f58108b.mo57661a();
            }
        }

        public C22883e(C22878k kVar, C22837al alVar) {
            this.f58107a = kVar;
            this.f58108b = alVar;
        }

        public void onAttach(CameraInfo cameraInfo) {
            C24362h.m61211f(cameraInfo, "cameraInfo");
        }

        public void onDetach() {
            this.f58107a.f58084f = C21625ff.m52501a(C21625ff.f54627a, (C21625ff.C21628c) null, 1, (Object) null);
            C22894l.f58135a.mo60705d("Analysis usecase unbound");
            C21637fn.m52525e().mo54894a(new C22884a(this));
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.k$g */
    public static final class C22886g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C22878k f58114a;

        /* renamed from: b */
        public final /* synthetic */ C21625ff.C21626a f58115b;

        public C22886g(C22878k kVar, C21625ff.C21626a aVar) {
            this.f58114a = kVar;
            this.f58115b = aVar;
        }

        public final void run() {
            ((ProcessCameraProvider) this.f58114a.f58080a.get()).unbindAll();
            this.f58115b.mo54900a();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.k$h */
    public static final class C22887h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C22878k f58116a;

        /* renamed from: b */
        public final /* synthetic */ C22863d.C22866c f58117b;

        /* renamed from: c */
        public final /* synthetic */ C21625ff.C21626a f58118c;

        /* renamed from: d */
        public final /* synthetic */ boolean f58119d;

        public C22887h(C22878k kVar, C22863d.C22866c cVar, C21625ff.C21626a aVar, boolean z) {
            this.f58116a = kVar;
            this.f58117b = cVar;
            this.f58118c = aVar;
            this.f58119d = z;
        }

        public final void run() {
            Camera camera;
            ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) this.f58116a.f58080a.get();
            CameraSelector build = new CameraSelector.Builder().requireLensFacing(C22868e.m56292c(this.f58117b)).build();
            C24362h.m61210e(build, "CameraSelector.Builder()…sFacingDirection).build()");
            this.f58116a.getClass();
            try {
                Preview b = this.f58116a.m56370a();
                C22878k kVar = this.f58116a;
                kVar.f58083e = kVar.m56382b();
                processCameraProvider.unbindAll();
                ImageAnalysis a = this.f58116a.m56367a((C22833ah) this.f58116a.f58089k.invoke(), this.f58117b);
                C22878k kVar2 = this.f58116a;
                if (a != null) {
                    camera = processCameraProvider.bindToLifecycle(kVar2.f58094p, build, b, this.f58116a.f58083e, a);
                } else {
                    camera = processCameraProvider.bindToLifecycle(kVar2.f58094p, build, b, this.f58116a.f58083e);
                }
                kVar2.f58082d = camera;
                C22894l.f58135a.mo60705d("Camera bound to lifecycle");
                b.setSurfaceProvider(this.f58116a.f58081b.getSurfaceProvider());
                this.f58116a.f58095q.mo56060a_();
                C22894l.f58135a.mo60705d("Camera is ready");
            } catch (Exception e) {
                C22894l.f58135a.mo60712w("Starting camera failed", e);
                this.f58116a.f58092n.mo55690a(e, "startCamera", C21720gj.camera);
                if (!(e instanceof IllegalArgumentException) || !this.f58119d) {
                    this.f58116a.f58095q.mo56054a();
                } else {
                    this.f58116a.m56373a(C22868e.m56291b(this.f58117b), false);
                }
            } catch (Throwable th) {
                this.f58118c.mo54900a();
                throw th;
            }
            this.f58118c.mo54900a();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.k$i */
    public static final class C22888i implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C22878k f58120a;

        /* renamed from: b */
        public final /* synthetic */ ImageCapture f58121b;

        /* renamed from: c */
        public final /* synthetic */ C22660wl f58122c;

        /* renamed from: d */
        public final /* synthetic */ C22061nh f58123d;

        /* renamed from: e */
        public final /* synthetic */ String f58124e;

        /* renamed from: f */
        public final /* synthetic */ C21625ff.C21626a f58125f;

        public C22888i(C22878k kVar, ImageCapture imageCapture, C22660wl wlVar, C22061nh nhVar, String str, C21625ff.C21626a aVar) {
            this.f58120a = kVar;
            this.f58121b = imageCapture;
            this.f58122c = wlVar;
            this.f58123d = nhVar;
            this.f58124e = str;
            this.f58125f = aVar;
        }

        public final void run() {
            this.f58120a.m56372a(this.f58121b, this.f58122c, this.f58123d, this.f58124e, true);
            this.f58125f.mo54900a();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Ljava/lang/Runnable;", "p1", "Lbf0/d;", "invoke", "(Ljava/lang/Runnable;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.k$j */
    public static final /* synthetic */ class C22889j extends FunctionReferenceImpl implements C24236l<Runnable, C21050d> {
        public C22889j(C21636fm fmVar) {
            super(1, fmVar, C21636fm.class, "post", "post(Ljava/lang/Runnable;)V", 0);
        }

        /* renamed from: a */
        public final void mo57749a(Runnable runnable) {
            C24362h.m61211f(runnable, "p1");
            ((C21636fm) this.receiver).mo54894a(runnable);
        }

        public /* synthetic */ Object invoke(Object obj) {
            mo57749a((Runnable) obj);
            return C21050d.f52856a;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Ljava/lang/Runnable;", "p1", "Lbf0/d;", "invoke", "(Ljava/lang/Runnable;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.k$k */
    public static final /* synthetic */ class C22890k extends FunctionReferenceImpl implements C24236l<Runnable, C21050d> {
        public C22890k(C21636fm fmVar) {
            super(1, fmVar, C21636fm.class, "post", "post(Ljava/lang/Runnable;)V", 0);
        }

        /* renamed from: a */
        public final void mo57750a(Runnable runnable) {
            C24362h.m61211f(runnable, "p1");
            ((C21636fm) this.receiver).mo54894a(runnable);
        }

        public /* synthetic */ Object invoke(Object obj) {
            mo57750a((Runnable) obj);
            return C21050d.f52856a;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, mo59060d2 = {"com/veriff/sdk/views/camera/CameraXCamera$takePictureInternal$2", "Lcom/veriff/sdk/camera/core/ImageCapture$OnImageCapturedCallback;", "Lcom/veriff/sdk/camera/core/ImageProxy;", "image", "Lbf0/d;", "onCaptureSuccess", "Lcom/veriff/sdk/camera/core/ImageCaptureException;", "exception", "onError", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.k$l */
    public static final class C22891l extends ImageCapture.OnImageCapturedCallback {

        /* renamed from: a */
        public final /* synthetic */ C22878k f58126a;

        /* renamed from: b */
        public final /* synthetic */ C22660wl f58127b;

        /* renamed from: c */
        public final /* synthetic */ boolean f58128c;

        /* renamed from: d */
        public final /* synthetic */ C21625ff.C21626a f58129d;

        /* renamed from: e */
        public final /* synthetic */ C22061nh f58130e;

        /* renamed from: f */
        public final /* synthetic */ String f58131f;

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.camera.k$l$a */
        public static final class C22892a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C22891l f58132a;

            /* renamed from: b */
            public final /* synthetic */ File f58133b;

            public C22892a(C22891l lVar, File file) {
                this.f58132a = lVar;
                this.f58133b = file;
            }

            public final void run() {
                this.f58132a.f58126a.f58095q.mo56057a(this.f58132a.f58127b, this.f58133b);
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.camera.k$l$b */
        public static final class C22893b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C22891l f58134a;

            public C22893b(C22891l lVar) {
                this.f58134a = lVar;
            }

            public final void run() {
                this.f58134a.f58126a.f58095q.mo56062b(this.f58134a.f58127b);
            }
        }

        public C22891l(C22878k kVar, C22660wl wlVar, boolean z, C21625ff.C21626a aVar, C22061nh nhVar, String str) {
            this.f58126a = kVar;
            this.f58127b = wlVar;
            this.f58128c = z;
            this.f58129d = aVar;
            this.f58130e = nhVar;
            this.f58131f = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x008c, code lost:
            if (r10.f58128c != false) goto L_0x00a3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x008f, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            com.veriff.sdk.views.camera.C22878k.m56397p(r10.f58126a).mo54894a(new com.veriff.sdk.views.camera.C22878k.C22891l.C22893b(r10));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bb, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00be, code lost:
            if (r10.f58128c != false) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c0, code lost:
            r2 = com.veriff.sdk.views.camera.C22878k.m56387f(r10.f58126a);
            mf0.C24362h.m61208c(r2);
            r2.getCameraControl().enableTorch(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d0, code lost:
            r10.f58129d.mo54900a();
            r11.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d8, code lost:
            throw r1;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0091 */
        @android.annotation.SuppressLint({"RestrictedApi"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onCaptureSuccess(com.veriff.sdk.camera.core.ImageProxy r11) {
            /*
                r10 = this;
                java.lang.String r0 = "image"
                mf0.C24362h.m61211f(r11, r0)
                r0 = 0
                com.veriff.sdk.views.camera.k r1 = r10.f58126a     // Catch:{ IOException -> 0x0091 }
                com.veriff.sdk.views.camera.d$b r1 = r1.f58095q     // Catch:{ IOException -> 0x0091 }
                com.veriff.sdk.internal.wl r2 = r10.f58127b     // Catch:{ IOException -> 0x0091 }
                r1.mo56056a(r2)     // Catch:{ IOException -> 0x0091 }
                byte[] r4 = com.veriff.sdk.camera.core.internal.utils.ImageUtil.imageToJpegByteArray(r11)     // Catch:{ IOException -> 0x0091 }
                if (r4 != 0) goto L_0x0066
                com.veriff.sdk.views.camera.k r1 = r10.f58126a     // Catch:{ IOException -> 0x0091 }
                com.veriff.sdk.internal.kf r1 = r1.f58092n     // Catch:{ IOException -> 0x0091 }
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0091 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0091 }
                r3.<init>()     // Catch:{ IOException -> 0x0091 }
                java.lang.String r4 = "Unknown image format "
                r3.append(r4)     // Catch:{ IOException -> 0x0091 }
                int r4 = r11.getFormat()     // Catch:{ IOException -> 0x0091 }
                r3.append(r4)     // Catch:{ IOException -> 0x0091 }
                java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0091 }
                r2.<init>(r3)     // Catch:{ IOException -> 0x0091 }
                java.lang.String r3 = "takePhoto"
                com.veriff.sdk.internal.gj r4 = com.veriff.sdk.internal.C21720gj.camera     // Catch:{ IOException -> 0x0091 }
                r1.mo55690a(r2, r3, r4)     // Catch:{ IOException -> 0x0091 }
                com.veriff.sdk.views.camera.k r1 = r10.f58126a     // Catch:{ IOException -> 0x0091 }
                com.veriff.sdk.views.camera.d$b r1 = r1.f58095q     // Catch:{ IOException -> 0x0091 }
                com.veriff.sdk.internal.wl r2 = r10.f58127b     // Catch:{ IOException -> 0x0091 }
                r1.mo56062b(r2)     // Catch:{ IOException -> 0x0091 }
                boolean r1 = r10.f58128c
                if (r1 == 0) goto L_0x005d
                com.veriff.sdk.views.camera.k r1 = r10.f58126a
                com.veriff.sdk.camera.core.Camera r1 = r1.f58082d
                mf0.C24362h.m61208c(r1)
                com.veriff.sdk.camera.core.CameraControl r1 = r1.getCameraControl()
                r1.enableTorch(r0)
            L_0x005d:
                com.veriff.sdk.internal.ff$a r0 = r10.f58129d
                r0.mo54900a()
                r11.close()
                return
            L_0x0066:
                com.veriff.sdk.internal.nh r3 = r10.f58130e     // Catch:{ IOException -> 0x0091 }
                java.lang.String r5 = r10.f58131f     // Catch:{ IOException -> 0x0091 }
                com.veriff.sdk.views.camera.k r1 = r10.f58126a     // Catch:{ IOException -> 0x0091 }
                com.veriff.sdk.internal.ix r1 = r1.f58090l     // Catch:{ IOException -> 0x0091 }
                boolean r6 = r1.mo55454g()     // Catch:{ IOException -> 0x0091 }
                r7 = 0
                r8 = 8
                r9 = 0
                java.io.File r1 = com.veriff.sdk.internal.C22061nh.m53800a(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ IOException -> 0x0091 }
                com.veriff.sdk.views.camera.k r2 = r10.f58126a     // Catch:{ IOException -> 0x0091 }
                com.veriff.sdk.internal.fm r2 = r2.f58098t     // Catch:{ IOException -> 0x0091 }
                com.veriff.sdk.views.camera.k$l$a r3 = new com.veriff.sdk.views.camera.k$l$a     // Catch:{ IOException -> 0x0091 }
                r3.<init>(r10, r1)     // Catch:{ IOException -> 0x0091 }
                r2.mo54894a(r3)     // Catch:{ IOException -> 0x0091 }
                boolean r1 = r10.f58128c
                if (r1 == 0) goto L_0x00b3
                goto L_0x00a3
            L_0x008f:
                r1 = move-exception
                goto L_0x00bc
            L_0x0091:
                com.veriff.sdk.views.camera.k r1 = r10.f58126a     // Catch:{ all -> 0x008f }
                com.veriff.sdk.internal.fm r1 = r1.f58098t     // Catch:{ all -> 0x008f }
                com.veriff.sdk.views.camera.k$l$b r2 = new com.veriff.sdk.views.camera.k$l$b     // Catch:{ all -> 0x008f }
                r2.<init>(r10)     // Catch:{ all -> 0x008f }
                r1.mo54894a(r2)     // Catch:{ all -> 0x008f }
                boolean r1 = r10.f58128c
                if (r1 == 0) goto L_0x00b3
            L_0x00a3:
                com.veriff.sdk.views.camera.k r1 = r10.f58126a
                com.veriff.sdk.camera.core.Camera r1 = r1.f58082d
                mf0.C24362h.m61208c(r1)
                com.veriff.sdk.camera.core.CameraControl r1 = r1.getCameraControl()
                r1.enableTorch(r0)
            L_0x00b3:
                com.veriff.sdk.internal.ff$a r0 = r10.f58129d
                r0.mo54900a()
                r11.close()
                return
            L_0x00bc:
                boolean r2 = r10.f58128c
                if (r2 == 0) goto L_0x00d0
                com.veriff.sdk.views.camera.k r2 = r10.f58126a
                com.veriff.sdk.camera.core.Camera r2 = r2.f58082d
                mf0.C24362h.m61208c(r2)
                com.veriff.sdk.camera.core.CameraControl r2 = r2.getCameraControl()
                r2.enableTorch(r0)
            L_0x00d0:
                com.veriff.sdk.internal.ff$a r0 = r10.f58129d
                r0.mo54900a()
                r11.close()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.camera.C22878k.C22891l.onCaptureSuccess(com.veriff.sdk.camera.core.ImageProxy):void");
        }

        public void onError(ImageCaptureException imageCaptureException) {
            C24362h.m61211f(imageCaptureException, "exception");
            this.f58126a.f58095q.mo56062b(this.f58127b);
            this.f58129d.mo54900a();
        }
    }

    public C22878k(Context context, C24446b bVar, C22863d.C22864a aVar, C24225a<C22833ah> aVar2, C21789ix ixVar, C21645fu fuVar, C21910kf kfVar, C22047nb nbVar, C1033p pVar, C22863d.C22865b bVar2, C22863d.C22867d dVar, C21636fm fmVar, C21636fm fmVar2, C21636fm fmVar3, C21636fm fmVar4, ViewGroup viewGroup) {
        Context context2 = context;
        C24446b bVar3 = bVar;
        C24225a<C22833ah> aVar3 = aVar2;
        C21789ix ixVar2 = ixVar;
        C21645fu fuVar2 = fuVar;
        C21910kf kfVar2 = kfVar;
        C22047nb nbVar2 = nbVar;
        C1033p pVar2 = pVar;
        C22863d.C22865b bVar4 = bVar2;
        C22863d.C22867d dVar2 = dVar;
        C21636fm fmVar5 = fmVar;
        C21636fm fmVar6 = fmVar2;
        C21636fm fmVar7 = fmVar3;
        C21636fm fmVar8 = fmVar4;
        ViewGroup viewGroup2 = viewGroup;
        C24362h.m61211f(context2, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(bVar3, "clock");
        C24362h.m61211f(aVar3, "videoConfigurationProvider");
        C24362h.m61211f(ixVar2, "featureFlags");
        C24362h.m61211f(fuVar2, "analytics");
        C24362h.m61211f(kfVar2, "errorReporter");
        C24362h.m61211f(nbVar2, "mediaStorage");
        C24362h.m61211f(pVar2, "lifecycleOwner");
        C24362h.m61211f(bVar4, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C24362h.m61211f(dVar2, "videoListener");
        C24362h.m61211f(fmVar5, "disk");
        C24362h.m61211f(fmVar6, "main");
        C24362h.m61211f(fmVar7, "videoEncoderThread");
        C24362h.m61211f(fmVar8, "audioEncoderThread");
        C24362h.m61211f(viewGroup2, "previewContainer");
        this.f58086h = context2;
        this.f58087i = bVar3;
        this.f58088j = aVar;
        this.f58089k = aVar3;
        this.f58090l = ixVar2;
        this.f58091m = fuVar2;
        this.f58092n = kfVar2;
        this.f58093o = nbVar2;
        this.f58094p = pVar2;
        this.f58095q = bVar4;
        this.f58096r = dVar2;
        this.f58097s = fmVar5;
        this.f58098t = fmVar6;
        this.f58099u = fmVar7;
        this.f58100v = fmVar8;
        C18728c<ProcessCameraProvider> instance = ProcessCameraProvider.getInstance(context.getApplicationContext());
        C24362h.m61210e(instance, "ProcessCameraProvider.ge…ntext.applicationContext)");
        this.f58080a = instance;
        PreviewView previewView = new PreviewView(context2);
        this.f58081b = previewView;
        viewGroup.removeAllViews();
        viewGroup2.addView(previewView, -1, -1);
    }

    public void deselectCamera() {
        this.f58085g = null;
        this.f58080a.addListener(new C22886g(this, C21625ff.m52501a(C21625ff.f54627a, (C21625ff.C21628c) null, 1, (Object) null)), C4732a.getMainExecutor(this.f58086h));
    }

    public void focus(float f, float f2) {
        CameraControl cameraControl;
        C24465j a = C22894l.f58135a;
        a.mo60705d("Focus x=" + f + " y=" + f2);
        Camera camera = this.f58082d;
        if (camera != null && (cameraControl = camera.getCameraControl()) != null) {
            MeteringPointFactory meteringPointFactory = this.f58081b.getMeteringPointFactory();
            C24362h.m61210e(meteringPointFactory, "previewView.meteringPointFactory");
            MeteringPoint createPoint = meteringPointFactory.createPoint(f, f2, 0.16666667f);
            C24362h.m61210e(createPoint, "meteringPointFactory.createPoint(x, y, AF_WIDTH)");
            MeteringPoint createPoint2 = meteringPointFactory.createPoint(f, f2, 0.25f);
            C24362h.m61210e(createPoint2, "meteringPointFactory.createPoint(x, y, AE_WIDTH)");
            FocusMeteringAction build = new FocusMeteringAction.Builder(createPoint, 1).addPoint(createPoint2, 2).build();
            C24362h.m61210e(build, "FocusMeteringAction.Buil…_AE)\n            .build()");
            cameraControl.startFocusAndMetering(build);
        }
    }

    public C22863d.C22866c getSelectedCamera() {
        return this.f58085g;
    }

    public boolean hasCurrentCameraFlashCapability() {
        CameraInfo cameraInfo;
        Camera camera = this.f58082d;
        if (camera != null && (cameraInfo = camera.getCameraInfo()) != null) {
            return cameraInfo.hasFlashUnit();
        }
        throw new IllegalStateException("Camera not available yet");
    }

    public void resetFaceFocus() {
    }

    public void selectCamera(C22863d.C22866c cVar) {
        C24362h.m61211f(cVar, "preferredCamera");
        if (this.f58085g != cVar) {
            C24465j a = C22894l.f58135a;
            a.mo60705d("Selecting camera preferred=" + cVar);
            m56381a(this, cVar, false, 2, (Object) null);
        }
    }

    public void takePhoto(C22660wl wlVar, C22061nh nhVar, String str) {
        C24362h.m61211f(wlVar, "conf");
        C24362h.m61211f(nhVar, "pictureStorage");
        C24362h.m61211f(str, "fileName");
        C24465j a = C22894l.f58135a;
        a.mo60705d("Take photo conf=" + wlVar + " file=" + str);
        ImageCapture imageCapture = this.f58083e;
        if (imageCapture == null) {
            this.f58092n.mo55690a(new IllegalStateException("capture not ready"), "takePhoto", C21720gj.camera);
        } else if (!hasCurrentCameraFlashCapability() || !wlVar.mo57006a()) {
            m56378a(this, imageCapture, wlVar, nhVar, str, false, 16, (Object) null);
        } else {
            C21625ff.C21626a a2 = C21625ff.m52501a(C21625ff.f54627a, (C21625ff.C21628c) null, 1, (Object) null);
            Camera camera = this.f58082d;
            C24362h.m61208c(camera);
            camera.getCameraControl().enableTorch(true).addListener(new C22888i(this, imageCapture, wlVar, nhVar, str, a2), new C22895m(new C22889j(this.f58098t)));
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J \u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¨\u0006\u0013"}, mo59060d2 = {"com/veriff/sdk/views/camera/CameraXCamera$createVideoRecorder$recorder$1", "Lcom/veriff/sdk/views/camera/VideoRecorderCallback;", "Lbf0/d;", "onAudioInitError", "Lcom/veriff/sdk/views/camera/VideoRecordingFailure;", "failure", "onError", "", "codecName", "", "width", "height", "onFirstVideoFrame", "Ljava/io/File;", "file", "", "timestamp", "duration", "onVideoSaved", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.k$f */
    public static final class C22885f implements C22847am {

        /* renamed from: a */
        public final /* synthetic */ C22878k f58110a;

        /* renamed from: b */
        public final /* synthetic */ C21625ff.C21626a f58111b;

        /* renamed from: c */
        public final /* synthetic */ C22833ah f58112c;

        /* renamed from: d */
        public final /* synthetic */ C25210r f58113d;

        public C22885f(C22878k kVar, C21625ff.C21626a aVar, C22833ah ahVar, C25210r rVar) {
            this.f58110a = kVar;
            this.f58111b = aVar;
            this.f58112c = ahVar;
            this.f58113d = rVar;
        }

        /* renamed from: a */
        public void mo57668a(String str, int i, int i2) {
            C24362h.m61211f(str, "codecName");
            this.f58111b.mo54901b();
            C21645fu k = this.f58110a.f58091m;
            C21667gf a = C21716gg.m52901a(str, i, i2);
            C24362h.m61210e(a, "EventFactory.firstVideoF…codecName, width, height)");
            k.mo54921a(a);
        }

        /* renamed from: a */
        public void mo57667a(File file, long j, long j2) {
            C24362h.m61211f(file, AppboyFileUtils.FILE_SCHEME);
            C24465j a = C22894l.f58135a;
            a.mo60705d("Video capture finished with " + j2 + " ms");
            C21645fu k = this.f58110a.f58091m;
            C21667gf a2 = C21716gg.m52884a(file.length(), j2);
            C24362h.m61210e(a2, "EventFactory.videoFileSa…(file.length(), duration)");
            k.mo54921a(a2);
            this.f58110a.f58096r.mo57601a(this.f58112c, file, j, j2);
            C21625ff.C21626a m = this.f58110a.f58084f;
            if (m != null) {
                m.mo54900a();
            }
            this.f58113d.complete(Boolean.TRUE);
        }

        /* renamed from: a */
        public void mo57666a(C22849ao aoVar) {
            C24362h.m61211f(aoVar, "failure");
            C24465j a = C22894l.f58135a;
            StringBuilder k = C13555b.m33972k("Video capture failed: ");
            k.append(aoVar.getMessage());
            a.mo60712w(k.toString(), aoVar);
            this.f58110a.f58092n.mo55690a(aoVar, "VideoRecorder", C21720gj.video);
            this.f58111b.mo54901b();
            C21625ff.C21626a m = this.f58110a.f58084f;
            if (m != null) {
                m.mo54900a();
            }
            if (aoVar.mo57677a() == C22849ao.C22850a.IMMEDIATE_TEARDOWN) {
                this.f58113d.complete(Boolean.TRUE);
                return;
            }
            this.f58110a.f58096r.mo57602a(aoVar);
            this.f58113d.complete(Boolean.FALSE);
        }

        /* renamed from: a */
        public void mo57663a() {
            this.f58110a.f58096r.mo57616i();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final ImageCapture m56382b() {
        ImageCapture.Builder builder = new ImageCapture.Builder();
        builder.setCaptureMode(1);
        builder.setFlashMode(2);
        if (this.f58090l.mo55454g()) {
            builder.setTargetResolution(C21886js.R720P.mo55601b());
        } else {
            builder.setTargetResolution(C21886js.R1440P.mo55601b());
        }
        ImageCapture build = builder.build();
        C24362h.m61210e(build, "ImageCapture.Builder().a…      }\n        }.build()");
        return build;
    }

    /* renamed from: a */
    private final ImageAnalysis m56366a(C22833ah ahVar, C22830ae aeVar) {
        C25213s sVar = new C25213s((C25232y0) null);
        C21625ff.C21626a a = C21625ff.m52501a(C21625ff.f54627a, (C21625ff.C21628c) null, 1, (Object) null);
        File a2 = this.f58093o.mo55863a(ahVar.mo57640b());
        C22837al alVar = new C22837al(ahVar, new C22829ad(), new C22827ab(), a2, aeVar, this.f58087i, this.f58099u, this.f58100v, this.f58098t, new C22885f(this, a, ahVar, sVar));
        ImageAnalysis build = new ImageAnalysis.Builder().setBackpressureStrategy(0).setDefaultResolution(C21886js.R360P.mo55600a()).setTargetResolution(ahVar.mo57641c().mo55600a()).setTargetRotation(1).setMaxResolution(ahVar.mo57643e().mo57657g()).setUseCaseEventCallback(new C22883e(this, alVar)).build();
        C24362h.m61210e(build, "ImageAnalysis.Builder()\n…  })\n            .build()");
        this.f58096r.mo57606a((C25162c0<Boolean>) sVar);
        build.setAnalyzer(C22881c.f58104a, new C22882d(this, alVar));
        return build;
    }

    /* renamed from: a */
    public static /* synthetic */ void m56381a(C22878k kVar, C22863d.C22866c cVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        kVar.m56373a(cVar, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m56373a(C22863d.C22866c cVar, boolean z) {
        C22894l.f58135a.mo60705d("Camera is busy");
        this.f58085g = cVar;
        this.f58095q.mo56061b();
        this.f58080a.addListener(new C22887h(this, cVar, C21625ff.m52501a(C21625ff.f54627a, (C21625ff.C21628c) null, 1, (Object) null), z), C4732a.getMainExecutor(this.f58086h));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final ImageAnalysis m56367a(C22833ah ahVar, C22863d.C22866c cVar) {
        if (ahVar != null) {
            return m56366a(ahVar, C22868e.m56290a(cVar));
        }
        C22863d.C22864a aVar = this.f58088j;
        if (aVar != null) {
            return m56368a(aVar);
        }
        return null;
    }

    /* renamed from: a */
    private final ImageAnalysis m56368a(C22863d.C22864a aVar) {
        ImageAnalysis.Builder backpressureStrategy = new ImageAnalysis.Builder().setBackpressureStrategy(0);
        C21886js jsVar = C21886js.R360P;
        ImageAnalysis build = backpressureStrategy.setDefaultResolution(jsVar.mo55600a()).setTargetResolution(jsVar.mo55600a()).setTargetRotation(1).setMaxResolution(C21886js.R720P.mo55600a()).build();
        C24362h.m61210e(build, "ImageAnalysis.Builder()\n…ize)\n            .build()");
        build.setAnalyzer(C22880b.f58103a, new C22879a(this, aVar));
        return build;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Preview m56370a() {
        Preview.Builder builder = new Preview.Builder();
        Resources resources = this.f58086h.getResources();
        C24362h.m61210e(resources, "context.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        C24362h.m61210e(displayMetrics, "context.resources.displayMetrics");
        Preview build = builder.setTargetResolution(C22868e.m56289a(displayMetrics)).build();
        C24362h.m61210e(build, "Preview.Builder()\n      …ize)\n            .build()");
        return build;
    }

    /* renamed from: a */
    public static /* synthetic */ void m56378a(C22878k kVar, ImageCapture imageCapture, C22660wl wlVar, C22061nh nhVar, String str, boolean z, int i, Object obj) {
        kVar.m56372a(imageCapture, wlVar, nhVar, str, (i & 16) != 0 ? false : z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m56372a(ImageCapture imageCapture, C22660wl wlVar, C22061nh nhVar, String str, boolean z) {
        imageCapture.lambda$takePicture$4(new C22895m(new C22890k(this.f58097s)), new C22891l(this, wlVar, z, C21625ff.m52501a(C21625ff.f54627a, (C21625ff.C21628c) null, 1, (Object) null), nhVar, str));
    }
}
