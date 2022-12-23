package com.veriff.sdk.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Rect;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import bf0.C21050d;
import com.appboy.support.AppboyFileUtils;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.camera.core.ImageProxy;
import com.veriff.sdk.detector.Face;
import com.veriff.sdk.detector.FaceDetector;
import com.veriff.sdk.detector.Rectangle;
import com.veriff.sdk.detector.Size;
import com.veriff.sdk.internal.C22192of;
import com.veriff.sdk.internal.oc$a;
import com.veriff.sdk.internal.oc$b;
import com.veriff.sdk.views.C22808a;
import com.veriff.sdk.views.C22822c;
import com.veriff.sdk.views.C22934e;
import com.veriff.sdk.views.camera.C22863d;
import com.veriff.sdk.views.camera.C22875j;
import com.veriff.sdk.views.camera.C22904r;
import ff0.C23349c;
import gf0.C23413c;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import lf0.C24240p;
import mf0.C24362h;
import mobi.lab.veriff.data.C24422b;
import mobi.lab.veriff.util.C24446b;
import mobi.lab.veriff.util.C24457h;
import mobi.lab.veriff.util.C24472p;
import p584jl.C17885a;
import wh0.C25177g;
import wh0.C25235z;
import yh0.C25308c;
import zh0.C25522c;
import zh0.C25523d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004Bo\u0012\u0006\u0010\u0010\u001a\u00020R\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010T\u001a\u00020S\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010V\u001a\u00020U¢\u0006\u0004\bW\u0010XJ\u001e\u0010\u000b\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016R\u0014\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010@\u001a\u00020?8\u0016X\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010N\u001a\u00020M8\u0016X\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q¨\u0006Y"}, mo59060d2 = {"Lcom/veriff/sdk/views/autocapture/AutoCaptureScreen;", "Lcom/veriff/sdk/views/LifecycleScreen;", "Lcom/veriff/sdk/views/camera/FlowActionScreen;", "Lcom/veriff/sdk/views/camera/Camera$Listener;", "Lcom/veriff/sdk/detector/FaceDetector$Callback;", "", "Lcom/veriff/sdk/detector/Face;", "facesList", "", "fps", "Lbf0/d;", "onDetectResult", "", "error", "onDetectFailed", "Lcom/veriff/sdk/internal/data/PhotoContext;", "context", "", "canCapture", "noCameraDeviceFound", "onCameraBusy", "onCameraReady", "Lmobi/lab/veriff/fragment/PhotoConf;", "photoConf", "photoCaptureFailed", "photoCaptureSuccess", "Ljava/io/File;", "file", "photoFileReady", "Lmobi/lab/veriff/data/AuthenticationFlowStep;", "step", "startAuthenticationFlowStep", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "Lcom/veriff/sdk/views/camera/Camera;", "camera", "Lcom/veriff/sdk/views/camera/Camera;", "Lmobi/lab/veriff/util/Clock;", "clock", "Lmobi/lab/veriff/util/Clock;", "Lcom/veriff/sdk/views/autocapture/AutoCaptureDebugView;", "debugView", "Lcom/veriff/sdk/views/autocapture/AutoCaptureDebugView;", "Lcom/veriff/sdk/detector/FaceDetector;", "detector", "Lcom/veriff/sdk/detector/FaceDetector;", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "Lcom/veriff/sdk/views/ScreenHost;", "host", "Lcom/veriff/sdk/views/ScreenHost;", "Lyh0/c;", "Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input;", "input", "Lyh0/c;", "Lmobi/lab/veriff/util/LanguageUtil;", "languageUtil", "Lmobi/lab/veriff/util/LanguageUtil;", "Lcom/veriff/sdk/internal/analytics/Page;", "page", "Lcom/veriff/sdk/internal/analytics/Page;", "getPage", "()Lcom/veriff/sdk/internal/analytics/Page;", "Lcom/veriff/sdk/internal/upload/PictureStorage;", "pictureStorage", "Lcom/veriff/sdk/internal/upload/PictureStorage;", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "session", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "uploadManager", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "Lcom/veriff/sdk/views/autocapture/AutoCaptureView;", "view", "Lcom/veriff/sdk/views/autocapture/AutoCaptureView;", "getView", "()Lcom/veriff/sdk/views/autocapture/AutoCaptureView;", "Landroid/app/Activity;", "Lcom/veriff/sdk/views/camera/CameraProvider;", "cameraProvider", "Lcom/veriff/sdk/views/camera/Camera$VideoListener;", "videoListener", "<init>", "(Landroid/app/Activity;Lcom/veriff/sdk/views/ScreenHost;Lcom/veriff/sdk/internal/analytics/Analytics;Lcom/veriff/sdk/internal/errors/ErrorReporter;Lcom/veriff/sdk/internal/data/FeatureFlags;Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;Lmobi/lab/veriff/util/LanguageUtil;Lmobi/lab/veriff/util/Clock;Lmobi/lab/veriff/model/AuthenticationFlowSession;Lcom/veriff/sdk/internal/upload/PictureStorage;Lcom/veriff/sdk/views/camera/CameraProvider;Lcom/veriff/sdk/detector/FaceDetector;Lcom/veriff/sdk/views/camera/Camera$VideoListener;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.od */
public final class C22181od extends C22822c implements FaceDetector.Callback, C22863d.C22865b, C22904r {

    /* renamed from: a */
    private final C21783is f55915a = C21783is.portrait;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C25308c<oc$a> f55916b = C17885a.m44433d(0, (BufferOverflow) null, 7);

    /* renamed from: c */
    private final C22192of f55917c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C22863d f55918d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C22151nz f55919e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C22934e f55920f;

    /* renamed from: g */
    private final C21645fu f55921g;

    /* renamed from: h */
    private final C21910kf f55922h;

    /* renamed from: i */
    private final C21789ix f55923i;

    /* renamed from: j */
    private final C22064nk f55924j;

    /* renamed from: k */
    private final C24457h f55925k;

    /* renamed from: l */
    private final C24446b f55926l;

    /* renamed from: m */
    private final C22661wm f55927m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C22061nh f55928n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final FaceDetector f55929o;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¨\u0006\b"}, mo59060d2 = {"com/veriff/sdk/views/autocapture/AutoCaptureScreen$camera$1", "Lcom/veriff/sdk/views/camera/Camera$Detector;", "Lcom/veriff/sdk/camera/core/ImageProxy;", "image", "Lcom/veriff/sdk/detector/Size;", "previewSize", "Lbf0/d;", "detect", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.od$a */
    public static final class C22182a implements C22863d.C22864a {

        /* renamed from: a */
        public final /* synthetic */ C22181od f55930a;

        public C22182a(C22181od odVar) {
            this.f55930a = odVar;
        }

        @SuppressLint({"UnsafeExperimentalUsageError"})
        /* renamed from: a */
        public void mo56097a(ImageProxy imageProxy, Size size) {
            C24362h.m61211f(imageProxy, "image");
            C24362h.m61211f(size, "previewSize");
            FaceDetector f = this.f55930a.f55929o;
            Rect cropRect = imageProxy.getCropRect();
            C24362h.m61210e(cropRect, "image.cropRect");
            f.detect(imageProxy, C22191oe.m54006b(cropRect), size, (FaceDetector.Callback) this.f55930a);
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.autocapture.AutoCaptureScreen$onDetectResult$1", mo58555f = "AutoCaptureScreen.kt", mo58556l = {180}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.od$b */
    public static final class C22183b extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55931a;

        /* renamed from: b */
        public final /* synthetic */ C22181od f55932b;

        /* renamed from: c */
        public final /* synthetic */ List f55933c;

        /* renamed from: d */
        public final /* synthetic */ float f55934d;

        /* renamed from: e */
        public final /* synthetic */ Rectangle f55935e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22183b(C22181od odVar, List list, float f, Rectangle rectangle, C23349c cVar) {
            super(2, cVar);
            this.f55932b = odVar;
            this.f55933c = list;
            this.f55934d = f;
            this.f55935e = rectangle;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22183b(this.f55932b, this.f55933c, this.f55934d, this.f55935e, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22183b) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f55931a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                oc$a.C22171b bVar = new oc$a.C22171b(this.f55933c, this.f55934d, this.f55935e);
                C22151nz e = this.f55932b.f55919e;
                if (e != null) {
                    e.setFaces(bVar);
                }
                C25308c a = this.f55932b.f55916b;
                this.f55931a = 1;
                if (a.mo60341A(bVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C17885a.m44475z0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C21050d.f52856a;
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.autocapture.AutoCaptureScreen$photoCaptureSuccess$1", mo58555f = "AutoCaptureScreen.kt", mo58556l = {156}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.od$c */
    public static final class C22184c extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55936a;

        /* renamed from: b */
        public final /* synthetic */ C22181od f55937b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22184c(C22181od odVar, C23349c cVar) {
            super(2, cVar);
            this.f55937b = odVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22184c(this.f55937b, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22184c) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f55936a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                C25308c a = this.f55937b.f55916b;
                oc$a.C22173d dVar = oc$a.C22173d.f55905a;
                this.f55936a = 1;
                if (a.mo60341A(dVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C17885a.m44475z0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C21050d.f52856a;
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.autocapture.AutoCaptureScreen$photoFileReady$1", mo58555f = "AutoCaptureScreen.kt", mo58556l = {162}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.od$d */
    public static final class C22185d extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55938a;

        /* renamed from: b */
        public final /* synthetic */ C22181od f55939b;

        /* renamed from: c */
        public final /* synthetic */ C22660wl f55940c;

        /* renamed from: d */
        public final /* synthetic */ File f55941d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22185d(C22181od odVar, C22660wl wlVar, File file, C23349c cVar) {
            super(2, cVar);
            this.f55939b = odVar;
            this.f55940c = wlVar;
            this.f55941d = file;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22185d(this.f55939b, this.f55940c, this.f55941d, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22185d) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f55938a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                C25308c a = this.f55939b.f55916b;
                oc$a.C22174e eVar = new oc$a.C22174e(this.f55940c, this.f55941d);
                this.f55938a = 1;
                if (a.mo60341A(eVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C17885a.m44475z0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C21050d.f52856a;
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.autocapture.AutoCaptureScreen$startAuthenticationFlowStep$1", mo58555f = "AutoCaptureScreen.kt", mo58556l = {208}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.od$e */
    public static final class C22186e extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55942a;

        /* renamed from: b */
        public final /* synthetic */ C22181od f55943b;

        /* renamed from: c */
        public final /* synthetic */ C22154ob f55944c;

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo59060d2 = {"com/veriff/sdk/internal/od$e$a", "Lzh0/d;", "value", "Lbf0/d;", "emit", "(Ljava/lang/Object;Lff0/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.od$e$a */
        public static final class C22187a implements C25523d<oc$b> {

            /* renamed from: a */
            public final /* synthetic */ C22186e f55945a;

            public C22187a(C22186e eVar) {
                this.f55945a = eVar;
            }

            public Object emit(Object obj, C23349c cVar) {
                oc$b oc_b = (oc$b) obj;
                if (C24362h.m61206a(oc_b, oc$b.C22177c.f55910a)) {
                    this.f55945a.f55943b.getView().setState(C22192of.C22196a.NORMAL);
                } else if (C24362h.m61206a(oc_b, oc$b.C22176b.f55909a)) {
                    this.f55945a.f55943b.getView().setState(C22192of.C22196a.SUCCESS);
                } else if (C24362h.m61206a(oc_b, oc$b.C22178d.f55911a)) {
                    this.f55945a.f55943b.getView().setState(C22192of.C22196a.FALLBACK_VISIBLE);
                } else if (C24362h.m61206a(oc_b, oc$b.C22179e.f55912a)) {
                    this.f55945a.f55943b.getView().setState(C22192of.C22196a.MANUAL_CAPTURE_ENABLED);
                } else if (oc_b instanceof oc$b.C22180f) {
                    oc$b.C22180f fVar = (oc$b.C22180f) oc_b;
                    this.f55945a.f55943b.f55918d.takePhoto(fVar.mo56091a(), this.f55945a.f55943b.f55928n, fVar.mo56092b());
                } else if (oc_b instanceof oc$b.C22175a) {
                    this.f55945a.f55943b.f55920f.mo57595a();
                }
                return C21050d.f52856a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22186e(C22181od odVar, C22154ob obVar, C23349c cVar) {
            super(2, cVar);
            this.f55943b = odVar;
            this.f55944c = obVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22186e(this.f55943b, this.f55944c, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22186e) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f55942a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                C25522c<oc$b> a = this.f55944c.mo56079a((C25308c<oc$a>) this.f55943b.f55916b);
                C22187a aVar = new C22187a(this);
                this.f55942a = 1;
                if (a.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C17885a.m44475z0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C21050d.f52856a;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo59060d2 = {"com/veriff/sdk/views/autocapture/AutoCaptureScreen$view$1", "Lcom/veriff/sdk/views/autocapture/AutoCaptureView$Listener;", "Lbf0/d;", "onCapturePressed", "onClosePressed", "onFallbackToManual", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.od$f */
    public static final class C22188f implements C22192of.C22197b {

        /* renamed from: a */
        public final /* synthetic */ C22181od f55946a;

        @C23413c(mo58554c = "com.veriff.sdk.views.autocapture.AutoCaptureScreen$view$1$onCapturePressed$1", mo58555f = "AutoCaptureScreen.kt", mo58556l = {85}, mo58557m = "invokeSuspend")
        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.od$f$a */
        public static final class C22189a extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

            /* renamed from: a */
            public int f55947a;

            /* renamed from: b */
            public final /* synthetic */ C22188f f55948b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22189a(C22188f fVar, C23349c cVar) {
                super(2, cVar);
                this.f55948b = fVar;
            }

            public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                C24362h.m61211f(cVar, "completion");
                return new C22189a(this.f55948b, cVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C22189a) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f55947a;
                if (i == 0) {
                    C17885a.m44475z0(obj);
                    C25308c a = this.f55948b.f55946a.f55916b;
                    oc$a.C22170a aVar = oc$a.C22170a.f55900a;
                    this.f55947a = 1;
                    if (a.mo60341A(aVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i == 1) {
                    C17885a.m44475z0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C21050d.f52856a;
            }
        }

        @C23413c(mo58554c = "com.veriff.sdk.views.autocapture.AutoCaptureScreen$view$1$onFallbackToManual$1", mo58555f = "AutoCaptureScreen.kt", mo58556l = {91}, mo58557m = "invokeSuspend")
        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.od$f$b */
        public static final class C22190b extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

            /* renamed from: a */
            public int f55949a;

            /* renamed from: b */
            public final /* synthetic */ C22188f f55950b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22190b(C22188f fVar, C23349c cVar) {
                super(2, cVar);
                this.f55950b = fVar;
            }

            public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                C24362h.m61211f(cVar, "completion");
                return new C22190b(this.f55950b, cVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C22190b) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f55949a;
                if (i == 0) {
                    C17885a.m44475z0(obj);
                    C25308c a = this.f55950b.f55946a.f55916b;
                    oc$a.C22172c cVar = oc$a.C22172c.f55904a;
                    this.f55949a = 1;
                    if (a.mo60341A(cVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i == 1) {
                    C17885a.m44475z0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C21050d.f52856a;
            }
        }

        public C22188f(C22181od odVar) {
            this.f55946a = odVar;
        }

        /* renamed from: a */
        public void mo56098a() {
            this.f55946a.f55920f.mo57597a(this.f55946a.getPage(), C21719gi.CLOSE_BUTTON);
        }

        /* renamed from: b */
        public void mo56099b() {
            C25177g.m63218b(this.f55946a.mo57591d(), (CoroutineContext) null, new C22189a(this, (C23349c) null), 3);
        }

        /* renamed from: c */
        public void mo56100c() {
            C25177g.m63218b(this.f55946a.mo57591d(), (CoroutineContext) null, new C22190b(this, (C23349c) null), 3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22181od(Activity activity, C22934e eVar, C21645fu fuVar, C21910kf kfVar, C21789ix ixVar, C22064nk nkVar, C24457h hVar, C24446b bVar, C22661wm wmVar, C22061nh nhVar, C22875j jVar, FaceDetector faceDetector, C22863d.C22867d dVar) {
        super((C22808a) null, 1, (DefaultConstructorMarker) null);
        C24362h.m61211f(activity, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(eVar, "host");
        C24362h.m61211f(fuVar, "analytics");
        C24362h.m61211f(kfVar, "errorReporter");
        C24362h.m61211f(ixVar, "featureFlags");
        C24362h.m61211f(nkVar, "uploadManager");
        C24362h.m61211f(hVar, "languageUtil");
        C24362h.m61211f(bVar, "clock");
        C24362h.m61211f(wmVar, "session");
        C24362h.m61211f(nhVar, "pictureStorage");
        C24362h.m61211f(jVar, "cameraProvider");
        C24362h.m61211f(faceDetector, "detector");
        C24362h.m61211f(dVar, "videoListener");
        this.f55920f = eVar;
        this.f55921g = fuVar;
        this.f55922h = kfVar;
        this.f55923i = ixVar;
        this.f55924j = nkVar;
        this.f55925k = hVar;
        this.f55926l = bVar;
        this.f55927m = wmVar;
        this.f55928n = nhVar;
        this.f55929o = faceDetector;
        this.f55917c = new C22192of(activity, hVar.mo60691a(), new C22188f(this));
        this.f55918d = jVar.createCamera(getView().getPreviewContainer(), mo57592k_(), this, dVar, new C22182a(this));
        if (ixVar.mo55468t()) {
            C22151nz nzVar = new C22151nz(activity, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            getView().mo56101a((View) nzVar);
            C21050d dVar2 = C21050d.f52856a;
            this.f55919e = nzVar;
        }
    }

    /* renamed from: a_ */
    public void mo56060a_() {
    }

    /* renamed from: b */
    public void mo56061b() {
    }

    /* renamed from: b_ */
    public void mo56012b_() {
        C22904r.C22905a.m56451a(this);
    }

    /* renamed from: g */
    public C22192of getView() {
        return this.f55917c;
    }

    public C21783is getPage() {
        return this.f55915a;
    }

    public void onDetectFailed(Throwable th) {
        C24362h.m61211f(th, "error");
        C22191oe.f55951a.mo60706d("Face detection failed", th);
        this.f55920f.mo57596a(22);
    }

    public void onDetectResult(List<Face> list, float f) {
        C24362h.m61211f(list, "facesList");
        Rectangle a = C24472p.m61577a((View) getView().getOverlayArea(), (View) getView().getPreviewContainer());
        if (a != null) {
            C25177g.m63218b(mo57591d(), (CoroutineContext) null, new C22183b(this, list, f, a, (C23349c) null), 3);
        }
    }

    /* renamed from: a */
    public void mo56009a(List<? extends Uri> list) {
        C24362h.m61211f(list, "selectedUris");
        C22904r.C22905a.m56452a(this, list);
    }

    /* renamed from: b */
    public void mo56062b(C22660wl wlVar) {
        C24362h.m61211f(wlVar, "photoConf");
        this.f55920f.mo57596a(22);
    }

    /* renamed from: a */
    public boolean mo56011a(C21882jp jpVar) {
        C24362h.m61211f(jpVar, AppActionRequest.KEY_CONTEXT);
        return jpVar == C21882jp.FACE;
    }

    /* renamed from: a */
    public void mo56010a(C24422b bVar) {
        C24362h.m61211f(bVar, "step");
        this.f55918d.selectCamera(C22863d.C22866c.FRONT);
        C21645fu fuVar = this.f55921g;
        C21667gf b = C21716gg.m52920b(bVar.mo60569a());
        C24362h.m61210e(b, "EventFactory.stepCameraS…ShownEvent(step.flowStep)");
        fuVar.mo54921a(b);
        C22661wm wmVar = this.f55927m;
        C21789ix ixVar = this.f55923i;
        C22064nk nkVar = this.f55924j;
        C21645fu fuVar2 = this.f55921g;
        C21910kf kfVar = this.f55922h;
        C24457h hVar = this.f55925k;
        C24446b bVar2 = this.f55926l;
        C22215on onVar = new C22215on(ixVar);
        C21791iy a = bVar.mo60569a();
        C24362h.m61210e(a, "step.flowStep");
        C25177g.m63218b(mo57591d(), (CoroutineContext) null, new C22186e(this, new C22154ob(wmVar, ixVar, nkVar, fuVar2, kfVar, hVar, bVar2, onVar, a), (C23349c) null), 3);
    }

    /* renamed from: a */
    public void mo56056a(C22660wl wlVar) {
        C24362h.m61211f(wlVar, "photoConf");
        C25177g.m63218b(mo57591d(), (CoroutineContext) null, new C22184c(this, (C23349c) null), 3);
    }

    /* renamed from: a */
    public void mo56057a(C22660wl wlVar, File file) {
        C24362h.m61211f(wlVar, "photoConf");
        C24362h.m61211f(file, AppboyFileUtils.FILE_SCHEME);
        C25177g.m63218b(mo57591d(), (CoroutineContext) null, new C22185d(this, wlVar, file, (C23349c) null), 3);
    }

    /* renamed from: a */
    public void mo56054a() {
        this.f55920f.mo57596a(26);
    }
}
