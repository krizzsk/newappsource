package com.veriff.sdk.views.camera;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Handler;
import com.appboy.support.AppboyFileUtils;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C21616ex;
import com.veriff.sdk.internal.C21636fm;
import com.veriff.sdk.internal.C21645fu;
import com.veriff.sdk.internal.C21667gf;
import com.veriff.sdk.internal.C21716gg;
import com.veriff.sdk.internal.C21719gi;
import com.veriff.sdk.internal.C21783is;
import com.veriff.sdk.internal.C21789ix;
import com.veriff.sdk.internal.C21791iy;
import com.veriff.sdk.internal.C21882jp;
import com.veriff.sdk.internal.C22061nh;
import com.veriff.sdk.internal.C22199oh;
import com.veriff.sdk.internal.C22201oj;
import com.veriff.sdk.internal.C22660wl;
import com.veriff.sdk.internal.C22661wm;
import com.veriff.sdk.views.C22822c;
import com.veriff.sdk.views.C22934e;
import com.veriff.sdk.views.camera.C22863d;
import com.veriff.sdk.views.camera.C22904r;
import com.veriff.sdk.views.camera.g$c;
import com.veriff.sdk.views.camera.p978ui.C22910a;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C23825c;
import mf0.C24362h;
import mobi.lab.veriff.R$color;
import mobi.lab.veriff.data.C24422b;
import mobi.lab.veriff.util.C24465j;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001^\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004Bu\u0012\u0006\u0010\u000b\u001a\u00020P\u0012\u0006\u0010Y\u001a\u00020X\u0012\u0006\u0010b\u001a\u00020a\u0012\u0006\u0010v\u001a\u00020u\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010s\u001a\u00020r\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u0010i\u001a\u00020h\u0012\u0006\u0010N\u001a\u00020M\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\u0006\u0010S\u001a\u00020R\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\u0006\u0010y\u001a\u00020x¢\u0006\u0006\b\u0001\u0010\u0001J\b\u0010\u0006\u001a\u00020\u0005H\u0017J\b\u0010\u0007\u001a\u00020\u0005H\u0017J\b\u0010\b\u001a\u00020\u0005H\u0017J\b\u0010\t\u001a\u00020\u0005H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\b\u0010\u001d\u001a\u00020\fH\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0016J\u0018\u0010'\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010&\u001a\u00020%H\u0016J\b\u0010(\u001a\u00020\u0005H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*H\u0016J\u0010\u0010.\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\fH\u0016J\b\u0010/\u001a\u00020\u0005H\u0016J\u0016\u00103\u001a\u00020\u00052\f\u00102\u001a\b\u0012\u0004\u0012\u00020100H\u0016J\u0018\u00108\u001a\u00020\u00052\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0016J\b\u00109\u001a\u00020\u0005H\u0016J\b\u0010:\u001a\u00020\u0005H\u0016J\u0010\u0010<\u001a\u00020\u00052\u0006\u00105\u001a\u00020;H\u0016J\u0018\u0010@\u001a\u00020\u00052\u0006\u0010=\u001a\u00020!2\u0006\u0010?\u001a\u00020>H\u0016R\u0016\u0010C\u001a\u0004\u0018\u00010\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020D8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u000b\u001a\u00020P8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010\\\u001a\u0004\u0018\u00010[8\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010g\u001a\u00020d8VX\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010i\u001a\u00020h8\u0002X\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u00105\u001a\u0002048\u0002@\u0002X.¢\u0006\u0006\n\u0004\b5\u0010qR\u0014\u0010s\u001a\u00020r8\u0002X\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010v\u001a\u00020u8\u0002X\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u001a\u0010|\u001a\u00020{8\u0016X\u0004¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010¨\u0006\u0001"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/CapturePhotoScreen;", "Lcom/veriff/sdk/views/LifecycleScreen;", "Lcom/veriff/sdk/views/camera/FlowActionScreen;", "Lcom/veriff/sdk/views/camera/CameraMVP$View;", "Lcom/veriff/sdk/views/camera/Camera$Listener;", "Lbf0/d;", "create", "resume", "pause", "bindCameraToLifecycle", "Lcom/veriff/sdk/internal/data/PhotoContext;", "context", "", "canCapture", "collapseInfoSheet", "", "reason", "endAuthentication", "", "x", "y", "focusImage", "num", "gotMultipleFaces", "gotNoFace", "gotOneFace", "handlePhotoCaptured", "isCameraFlashAvailable", "noCameraDeviceFound", "onBackButtonPressed", "onCameraBusy", "onCameraReady", "openInfoSheet", "Lmobi/lab/veriff/fragment/PhotoConf;", "photoConf", "photoCaptureFailed", "photoCaptureSuccess", "Ljava/io/File;", "file", "photoFileReady", "resetFaceFocus", "resetPhotoCapturing", "Lcom/veriff/sdk/views/camera/CameraMVP$View$ControlState;", "state", "setCameraControlState", "isVisible", "setOverlayVisibility", "showAudioRecordingPermissionsDeniedError", "", "Lcom/veriff/sdk/views/camera/ShutterBlockCondition;", "conditions", "showBlockConditions", "Lcom/veriff/sdk/internal/data/FlowStep;", "step", "Lcom/veriff/sdk/internal/analytics/EventSource;", "source", "showConfirmFlowCancellationDialog", "showPhotoCapturingFailedError", "showVideoRecordingPermissionsDeniedError", "Lmobi/lab/veriff/data/AuthenticationFlowStep;", "startAuthenticationFlowStep", "conf", "", "fileName", "takePhoto", "getStatusBarColor", "()Ljava/lang/Integer;", "statusBarColor", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "Lcom/veriff/sdk/views/camera/Camera;", "camera", "Lcom/veriff/sdk/views/camera/Camera;", "", "cameraClickedMillis", "J", "Lmobi/lab/veriff/util/Clock;", "clock", "Lmobi/lab/veriff/util/Clock;", "Landroid/content/Context;", "Landroid/content/Context;", "Lcom/veriff/sdk/views/autocapture/DetectorProvider;", "detectorProvider", "Lcom/veriff/sdk/views/autocapture/DetectorProvider;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "Lcom/veriff/sdk/views/ScreenHost;", "host", "Lcom/veriff/sdk/views/ScreenHost;", "Landroid/hardware/Sensor;", "lightSensor", "Landroid/hardware/Sensor;", "com/veriff/sdk/views/camera/CapturePhotoScreen$lightSensorListener$1", "lightSensorListener", "Lcom/veriff/sdk/views/camera/CapturePhotoScreen$lightSensorListener$1;", "Lcom/veriff/sdk/views/camera/CameraMVP$Model;", "model", "Lcom/veriff/sdk/views/camera/CameraMVP$Model;", "Lcom/veriff/sdk/internal/analytics/Page;", "getPage", "()Lcom/veriff/sdk/internal/analytics/Page;", "page", "Lcom/veriff/sdk/internal/upload/PictureStorage;", "pictureStorage", "Lcom/veriff/sdk/internal/upload/PictureStorage;", "Lcom/veriff/sdk/views/camera/CameraPresenter;", "presenter", "Lcom/veriff/sdk/views/camera/CameraPresenter;", "Landroid/hardware/SensorManager;", "sensorManager", "Landroid/hardware/SensorManager;", "Lcom/veriff/sdk/internal/data/FlowStep;", "Lcom/veriff/sdk/Strings;", "strings", "Lcom/veriff/sdk/Strings;", "Lcom/veriff/sdk/internal/Scheduler;", "uiScheduler", "Lcom/veriff/sdk/internal/Scheduler;", "Lcom/veriff/sdk/views/camera/Camera$VideoListener;", "videoListener", "Lcom/veriff/sdk/views/camera/Camera$VideoListener;", "Lcom/veriff/sdk/views/camera/ui/CameraView;", "view", "Lcom/veriff/sdk/views/camera/ui/CameraView;", "getView", "()Lcom/veriff/sdk/views/camera/ui/CameraView;", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "veriffResourcesProvider", "Lcom/veriff/sdk/views/camera/CameraProvider;", "cameraProvider", "<init>", "(Landroid/content/Context;Lcom/veriff/sdk/views/ScreenHost;Lcom/veriff/sdk/views/camera/CameraMVP$Model;Lcom/veriff/sdk/internal/Scheduler;Lcom/veriff/sdk/internal/analytics/Analytics;Lcom/veriff/sdk/Strings;Lcom/veriff/sdk/internal/data/FeatureFlags;Lcom/veriff/sdk/internal/upload/PictureStorage;Lmobi/lab/veriff/util/Clock;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;Lcom/veriff/sdk/views/autocapture/DetectorProvider;Lcom/veriff/sdk/views/camera/CameraProvider;Lcom/veriff/sdk/views/camera/Camera$VideoListener;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.n */
public final class C22896n extends C22822c implements C22863d.C22865b, g$c, C22904r {

    /* renamed from: b */
    private final C22897a f58137b = new C22897a(this);

    /* renamed from: d */
    private final C22910a f58138d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C22863d f58139e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C22872i f58140f;

    /* renamed from: g */
    private final SensorManager f58141g;

    /* renamed from: h */
    private final Sensor f58142h;

    /* renamed from: i */
    private final Context f58143i;

    /* renamed from: j */
    private final C22934e f58144j;

    /* renamed from: k */
    private final g$a f58145k;

    /* renamed from: l */
    private final C21636fm f58146l;

    /* renamed from: m */
    private final C21645fu f58147m;

    /* renamed from: n */
    private final C21616ex f58148n;

    /* renamed from: o */
    private final C21789ix f58149o;

    /* renamed from: p */
    private final C22061nh f58150p;

    /* renamed from: r */
    private final C22199oh f58151r;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, mo59060d2 = {"com/veriff/sdk/views/camera/CapturePhotoScreen$lightSensorListener$1", "Landroid/hardware/SensorEventListener;", "Landroid/hardware/SensorEvent;", "event", "Lbf0/d;", "onSensorChanged", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.n$a */
    public static final class C22897a implements SensorEventListener {

        /* renamed from: a */
        public final /* synthetic */ C22896n f58152a;

        public C22897a(C22896n nVar) {
            this.f58152a = nVar;
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
            C24362h.m61211f(sensor, "sensor");
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            boolean z;
            C24362h.m61211f(sensorEvent, "event");
            C22872i a = this.f58152a.f58140f;
            float[] fArr = sensorEvent.values;
            C24362h.m61210e(fArr, "event.values");
            if (fArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                a.mo57725a(fArr[0], sensorEvent.accuracy);
                return;
            }
            throw new NoSuchElementException("Array is empty.");
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016¨\u0006\f"}, mo59060d2 = {"com/veriff/sdk/views/camera/CapturePhotoScreen$listener$1", "Lcom/veriff/sdk/views/camera/ui/CameraView$Listener;", "Lbf0/d;", "clickedAwayFromSheet", "", "x", "y", "frameClicked", "onClosePressed", "onInfoPressed", "onSheetCollapsed", "onTakePicturePressed", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.n$b */
    public static final class C22898b implements C22910a.C22911a {

        /* renamed from: a */
        public final /* synthetic */ C22896n f58153a;

        public C22898b(C22896n nVar) {
            this.f58153a = nVar;
        }

        /* renamed from: a */
        public void mo57757a() {
            this.f58153a.f58140f.mo57739k();
        }

        /* renamed from: b */
        public void mo57759b() {
            this.f58153a.getClass();
            this.f58153a.f58140f.mo57733e();
        }

        /* renamed from: c */
        public void mo57760c() {
            this.f58153a.f58140f.mo57735g();
        }

        /* renamed from: d */
        public void mo57761d() {
            this.f58153a.f58140f.mo57737i();
        }

        /* renamed from: e */
        public void mo57762e() {
            this.f58153a.f58140f.mo57736h();
        }

        /* renamed from: a */
        public void mo57758a(float f, float f2) {
            this.f58153a.f58140f.mo57724a(f, f2);
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.n$c */
    public static final class C22899c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C22896n f58154a;

        /* renamed from: b */
        public final /* synthetic */ C22660wl f58155b;

        public C22899c(C22896n nVar, C22660wl wlVar) {
            this.f58154a = nVar;
            this.f58155b = wlVar;
        }

        public final void run() {
            this.f58154a.f58140f.mo57726a(this.f58155b);
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.n$d */
    public static final class C22900d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C22896n f58156a;

        /* renamed from: b */
        public final /* synthetic */ C22660wl f58157b;

        /* renamed from: c */
        public final /* synthetic */ File f58158c;

        public C22900d(C22896n nVar, C22660wl wlVar, File file) {
            this.f58156a = nVar;
            this.f58157b = wlVar;
            this.f58158c = file;
        }

        public final void run() {
            this.f58156a.f58140f.mo57727a(this.f58157b, this.f58158c);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: com.veriff.sdk.views.camera.ui.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: com.veriff.sdk.views.camera.ui.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: com.veriff.sdk.views.camera.ui.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.veriff.sdk.views.camera.ui.b} */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22896n(android.content.Context r17, com.veriff.sdk.views.C22934e r18, com.veriff.sdk.views.camera.g$a r19, com.veriff.sdk.internal.C21636fm r20, com.veriff.sdk.internal.C21645fu r21, com.veriff.sdk.internal.C21616ex r22, com.veriff.sdk.internal.C21789ix r23, com.veriff.sdk.internal.C22061nh r24, mobi.lab.veriff.util.C24446b r25, com.veriff.sdk.internal.C22700xq r26, com.veriff.sdk.internal.C22199oh r27, com.veriff.sdk.views.camera.C22875j r28, com.veriff.sdk.views.camera.C22863d.C22867d r29) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r0 = r18
            r4 = r19
            r3 = r20
            r5 = r21
            r10 = r22
            r11 = r23
            r1 = r24
            r12 = r26
            r2 = r27
            java.lang.String r6 = "context"
            mf0.C24362h.m61211f(r9, r6)
            java.lang.String r6 = "host"
            mf0.C24362h.m61211f(r0, r6)
            java.lang.String r6 = "model"
            mf0.C24362h.m61211f(r4, r6)
            java.lang.String r6 = "uiScheduler"
            mf0.C24362h.m61211f(r3, r6)
            java.lang.String r6 = "analytics"
            mf0.C24362h.m61211f(r5, r6)
            java.lang.String r6 = "strings"
            mf0.C24362h.m61211f(r10, r6)
            java.lang.String r6 = "featureFlags"
            mf0.C24362h.m61211f(r11, r6)
            java.lang.String r6 = "pictureStorage"
            mf0.C24362h.m61211f(r1, r6)
            java.lang.String r6 = "clock"
            r7 = r25
            mf0.C24362h.m61211f(r7, r6)
            java.lang.String r6 = "veriffResourcesProvider"
            mf0.C24362h.m61211f(r12, r6)
            java.lang.String r6 = "detectorProvider"
            mf0.C24362h.m61211f(r2, r6)
            java.lang.String r6 = "cameraProvider"
            r13 = r28
            mf0.C24362h.m61211f(r13, r6)
            java.lang.String r6 = "videoListener"
            r14 = r29
            mf0.C24362h.m61211f(r14, r6)
            r6 = 0
            r15 = 1
            r8.<init>(r6, r15, r6)
            r8.f58143i = r9
            r8.f58144j = r0
            r8.f58145k = r4
            r8.f58146l = r3
            r8.f58147m = r5
            r8.f58148n = r10
            r8.f58149o = r11
            r8.f58150p = r1
            r8.f58151r = r2
            com.veriff.sdk.views.camera.n$a r0 = new com.veriff.sdk.views.camera.n$a
            r0.<init>(r8)
            r8.f58137b = r0
            com.veriff.sdk.views.camera.i r15 = new com.veriff.sdk.views.camera.i
            r0 = r15
            r1 = r16
            r2 = r19
            r6 = r25
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f58140f = r15
            com.veriff.sdk.views.camera.n$b r5 = new com.veriff.sdk.views.camera.n$b
            r5.<init>(r8)
            boolean r0 = r23.mo55466r()
            if (r0 != 0) goto L_0x00a5
            com.veriff.sdk.views.camera.ui.b r6 = new com.veriff.sdk.views.camera.ui.b
            r0 = r6
            r1 = r17
            r2 = r26
            r3 = r22
            r4 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x00aa
        L_0x00a5:
            com.veriff.sdk.views.camera.ui.c r6 = new com.veriff.sdk.views.camera.ui.c
            r6.<init>(r9, r10, r12, r5)
        L_0x00aa:
            r8.f58138d = r6
            com.veriff.sdk.views.camera.ui.a r0 = r16.getView()
            android.view.ViewGroup r0 = r0.getPreviewContainer()
            com.veriff.sdk.views.a r1 = r16.mo57592k_()
            r2 = 0
            r18 = r28
            r19 = r0
            r20 = r1
            r21 = r16
            r22 = r29
            r23 = r2
            com.veriff.sdk.views.camera.d r0 = r18.createCamera(r19, r20, r21, r22, r23)
            r8.f58139e = r0
            java.lang.String r0 = "sensor"
            java.lang.Object r0 = r9.getSystemService(r0)
            if (r0 == 0) goto L_0x00e2
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0
            r8.f58141g = r0
            r1 = 5
            android.hardware.Sensor r0 = r0.getDefaultSensor(r1)
            r8.f58142h = r0
            r16.m56408n()
            return
        L_0x00e2:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type android.hardware.SensorManager"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.camera.C22896n.<init>(android.content.Context, com.veriff.sdk.views.e, com.veriff.sdk.views.camera.g$a, com.veriff.sdk.internal.fm, com.veriff.sdk.internal.fu, com.veriff.sdk.internal.ex, com.veriff.sdk.internal.ix, com.veriff.sdk.internal.nh, mobi.lab.veriff.util.b, com.veriff.sdk.internal.xq, com.veriff.sdk.internal.oh, com.veriff.sdk.views.camera.j, com.veriff.sdk.views.camera.d$d):void");
    }

    /* renamed from: n */
    private final void m56408n() {
        mo57590c().mo4224a(new CapturePhotoScreen$bindCameraToLifecycle$1(this));
    }

    /* renamed from: a_ */
    public void mo56060a_() {
        this.f58140f.mo57729b();
    }

    /* renamed from: b_ */
    public void mo56012b_() {
        this.f58140f.mo57734f();
    }

    public void create() {
        super.create();
        this.f58140f.mo56242a();
    }

    /* renamed from: f */
    public boolean mo56147f() {
        return this.f58140f.mo57738j();
    }

    /* renamed from: f_ */
    public void mo57715f_() {
        this.f58144j.mo57596a(26);
    }

    /* renamed from: g */
    public void mo57716g() {
        this.f58144j.mo57596a(22);
    }

    /* renamed from: g_ */
    public void mo57717g_() {
        this.f58144j.mo57596a(27);
    }

    public C21783is getPage() {
        C22661wm b = this.f58145k.mo57699b();
        C24362h.m61210e(b, "model.authenticationFlowSession");
        C24422b e = b.mo57021e();
        C24362h.m61210e(e, "model.authenticationFlowSession.activeStep");
        C21791iy a = e.mo60569a();
        C24362h.m61208c(a);
        return C22902p.m56442a(a);
    }

    public Integer getStatusBarColor() {
        return Integer.valueOf(this.f58143i.getResources().getColor(R$color.vrffBlack));
    }

    /* renamed from: h */
    public void mo57718h() {
        this.f58144j.mo57595a();
    }

    /* renamed from: i */
    public boolean mo57719i() {
        return this.f58139e.hasCurrentCameraFlashCapability();
    }

    /* renamed from: j */
    public void mo57720j() {
        getView().mo57792a();
    }

    /* renamed from: k */
    public void mo57721k() {
        getView().mo57794b();
    }

    /* renamed from: l */
    public void mo57722l() {
        this.f58139e.resetFaceFocus();
    }

    /* renamed from: m */
    public C22910a getView() {
        return this.f58138d;
    }

    public void pause() {
        super.pause();
        if (this.f58142h != null) {
            this.f58141g.unregisterListener(this.f58137b);
        }
    }

    public void resume() {
        super.resume();
        Sensor sensor = this.f58142h;
        if (sensor != null) {
            this.f58141g.registerListener(this.f58137b, sensor, 10000, new Handler());
        }
    }

    /* renamed from: b */
    public void mo56061b() {
        this.f58140f.mo57731c();
    }

    /* renamed from: a */
    public void mo56009a(List<? extends Uri> list) {
        C24362h.m61211f(list, "selectedUris");
        C22904r.C22905a.m56452a(this, list);
    }

    /* renamed from: b */
    public void mo56062b(C22660wl wlVar) {
        C24362h.m61211f(wlVar, "photoConf");
        this.f58140f.mo57730b(wlVar);
    }

    /* renamed from: a */
    public void mo57710a(C21791iy iyVar, C21719gi giVar) {
        C24362h.m61211f(iyVar, "step");
        C24362h.m61211f(giVar, "source");
        this.f58144j.mo57597a(C22902p.m56442a(iyVar), giVar);
    }

    /* renamed from: a */
    public void mo57709a(int i) {
        this.f58144j.mo57607a(false, i);
    }

    /* renamed from: a */
    public boolean mo56011a(C21882jp jpVar) {
        C24362h.m61211f(jpVar, AppActionRequest.KEY_CONTEXT);
        switch (C22901o.f58159a[jpVar.ordinal()]) {
            case 1:
                C22201oj b = this.f58151r.mo56109b();
                if (b instanceof C22201oj.C22202a) {
                    C21645fu fuVar = this.f58147m;
                    C21667gf a = C21716gg.m52898a(C21791iy.TAKE_PORTRAIT, this.f58149o, ((C22201oj.C22202a) b).mo56111a());
                    C24362h.m61210e(a, "EventFactory.autoCapture…                        )");
                    fuVar.mo54921a(a);
                } else if (this.f58149o.mo55467s()) {
                    return false;
                } else {
                    C21667gf a2 = C21716gg.m52898a(C21791iy.TAKE_PORTRAIT, this.f58149o, C21667gf.C21709b.flag_disabled);
                    C21645fu fuVar2 = this.f58147m;
                    C24362h.m61210e(a2, "event");
                    fuVar2.mo54921a(a2);
                }
                return true;
            case 2:
            case 3:
            case 4:
                return true;
            case 5:
            case 6:
            case 7:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    public void mo56010a(C24422b bVar) {
        C24362h.m61211f(bVar, "step");
        this.f58139e.selectCamera(C22902p.m56446b(bVar));
        getView().setTutorialText(bVar);
        this.f58140f.mo57728a(bVar);
        C24362h.m61210e(bVar.mo60569a(), "step.flowStep");
        C21645fu fuVar = this.f58147m;
        C21667gf b = C21716gg.m52920b(bVar.mo60569a());
        C24362h.m61210e(b, "EventFactory.stepCameraS…ShownEvent(step.flowStep)");
        fuVar.mo54921a(b);
    }

    /* renamed from: a */
    public void mo57711a(C22660wl wlVar, String str) {
        C24362h.m61211f(wlVar, "conf");
        C24362h.m61211f(str, "fileName");
        C24465j a = C22902p.f58161a;
        a.mo60705d("takePhoto() called with: conf = [" + wlVar + "], fileName = [" + str + ']');
        this.f58139e.takePhoto(wlVar, this.f58150p, str);
    }

    /* renamed from: a */
    public void mo57714a(boolean z) {
        getView().setOverlayVisibility(z);
    }

    /* renamed from: a */
    public void mo57708a(float f, float f2) {
        this.f58139e.focus(f, f2);
    }

    /* renamed from: a */
    public void mo57712a(g$c.C22870a aVar) {
        C24362h.m61211f(aVar, "state");
        int i = C22901o.f58160b[aVar.ordinal()];
        if (i == 1) {
            getView().mo57795c();
            getView().mo57796d();
        } else if (i == 2) {
            getView().mo57795c();
            getView().mo57797e();
        } else if (i == 3) {
            getView().mo57798f();
            getView().mo57797e();
        }
    }

    /* renamed from: a */
    public void mo57713a(Collection<? extends C22832ag> collection) {
        C24362h.m61211f(collection, "conditions");
        if (collection.isEmpty()) {
            getView().mo57799g();
        } else {
            getView().mo57793a((C22832ag) C23825c.m58512i0(collection));
        }
    }

    /* renamed from: a */
    public void mo56056a(C22660wl wlVar) {
        C24362h.m61211f(wlVar, "photoConf");
        this.f58146l.mo54894a(new C22899c(this, wlVar));
    }

    /* renamed from: a */
    public void mo56057a(C22660wl wlVar, File file) {
        C24362h.m61211f(wlVar, "photoConf");
        C24362h.m61211f(file, AppboyFileUtils.FILE_SCHEME);
        this.f58146l.mo54894a(new C22900d(this, wlVar, file));
    }

    /* renamed from: a */
    public void mo56054a() {
        this.f58140f.mo57732d();
    }
}
