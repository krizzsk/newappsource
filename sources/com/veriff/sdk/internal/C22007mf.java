package com.veriff.sdk.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.lifecycle.C1033p;
import bf0.C21050d;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.camera.core.Camera;
import com.veriff.sdk.camera.core.CameraSelector;
import com.veriff.sdk.camera.core.ImageAnalysis;
import com.veriff.sdk.camera.core.ImageProxy;
import com.veriff.sdk.camera.core.Preview;
import com.veriff.sdk.camera.core.internal.utils.ImageUtil;
import com.veriff.sdk.camera.lifecycle.ProcessCameraProvider;
import com.veriff.sdk.camera.view.PreviewView;
import com.veriff.sdk.internal.C21625ff;
import com.veriff.sdk.views.camera.C22868e;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import lf0.C24236l;
import mf0.C24362h;
import mobi.lab.veriff.util.C24446b;
import mobi.lab.veriff.util.C24465j;
import p090g1.C4732a;
import p695od.C18728c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00017BO\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u000201¢\u0006\u0004\b5\u00106J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u0002018\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00103¨\u00068"}, mo59060d2 = {"Lcom/veriff/sdk/internal/ui/barcode/BarcodeScanner;", "", "Lcom/veriff/sdk/camera/core/ImageProxy;", "image", "Lbf0/d;", "detect", "", "processFrame", "reset", "start", "Lcom/veriff/sdk/camera/core/Camera;", "camera", "Lcom/veriff/sdk/camera/core/Camera;", "Lod/c;", "Lcom/veriff/sdk/camera/lifecycle/ProcessCameraProvider;", "kotlin.jvm.PlatformType", "cameraProviderFuture", "Lod/c;", "Lmobi/lab/veriff/util/Clock;", "clock", "Lmobi/lab/veriff/util/Clock;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/veriff/sdk/internal/ui/barcode/Pdf417Detector;", "detector", "Lcom/veriff/sdk/internal/ui/barcode/Pdf417Detector;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isProcessing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isScanning", "Landroidx/lifecycle/p;", "lifecycleOwner", "Landroidx/lifecycle/p;", "Lcom/veriff/sdk/internal/ui/barcode/BarcodeScanner$Listener;", "listener", "Lcom/veriff/sdk/internal/ui/barcode/BarcodeScanner$Listener;", "Lcom/veriff/sdk/internal/data/Resolution;", "preferredResolution", "Lcom/veriff/sdk/internal/data/Resolution;", "Lcom/veriff/sdk/camera/view/PreviewView;", "previewView", "Lcom/veriff/sdk/camera/view/PreviewView;", "Lcom/veriff/sdk/internal/Idler$Handle;", "processingHandle", "Lcom/veriff/sdk/internal/Idler$Handle;", "", "rotateBuffer", "[B", "Lcom/veriff/sdk/internal/Scheduler;", "scannerThread", "Lcom/veriff/sdk/internal/Scheduler;", "uiThread", "<init>", "(Landroid/content/Context;Lcom/veriff/sdk/internal/ui/barcode/Pdf417Detector;Lcom/veriff/sdk/camera/view/PreviewView;Lcom/veriff/sdk/internal/data/Resolution;Landroidx/lifecycle/p;Lcom/veriff/sdk/internal/ui/barcode/BarcodeScanner$Listener;Lmobi/lab/veriff/util/Clock;Lcom/veriff/sdk/internal/Scheduler;Lcom/veriff/sdk/internal/Scheduler;)V", "Listener", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.mf */
public final class C22007mf {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C18728c<ProcessCameraProvider> f55527a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Camera f55528b;

    /* renamed from: c */
    private byte[] f55529c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C21625ff.C21626a f55530d;

    /* renamed from: e */
    private final AtomicBoolean f55531e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f55532f = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f55533g;

    /* renamed from: h */
    private final C22020mj f55534h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final PreviewView f55535i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C21886js f55536j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1033p f55537k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C22008a f55538l;

    /* renamed from: m */
    private final C24446b f55539m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C21636fm f55540n;

    /* renamed from: o */
    private final C21636fm f55541o;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J \u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¨\u0006\u000e"}, mo59060d2 = {"Lcom/veriff/sdk/internal/ui/barcode/BarcodeScanner$Listener;", "", "", "error", "Lbf0/d;", "onBarcodeScanFailed", "onBarcodeScanStarted", "", "data", "", "jpegPicture", "", "processingTime", "onBarcodeScanned", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.mf$a */
    public interface C22008a {
        /* renamed from: a */
        void mo55828a();

        /* renamed from: a */
        void mo55829a(String str, byte[] bArr, long j);

        /* renamed from: a */
        void mo55830a(Throwable th);
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.mf$b */
    public static final class C22009b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C22007mf f55542a;

        /* renamed from: b */
        public final /* synthetic */ Throwable f55543b;

        public C22009b(C22007mf mfVar, Throwable th) {
            this.f55542a = mfVar;
            this.f55543b = th;
        }

        public final void run() {
            this.f55542a.f55538l.mo55830a(this.f55543b);
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.mf$c */
    public static final class C22010c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C22007mf f55544a;

        /* renamed from: b */
        public final /* synthetic */ byte[] f55545b;

        /* renamed from: c */
        public final /* synthetic */ ImageProxy f55546c;

        /* renamed from: d */
        public final /* synthetic */ String f55547d;

        /* renamed from: e */
        public final /* synthetic */ long f55548e;

        /* renamed from: f */
        public final /* synthetic */ long f55549f;

        /* renamed from: g */
        public final /* synthetic */ C21625ff.C21626a f55550g;

        public C22010c(C22007mf mfVar, byte[] bArr, ImageProxy imageProxy, String str, long j, long j2, C21625ff.C21626a aVar) {
            this.f55544a = mfVar;
            this.f55545b = bArr;
            this.f55546c = imageProxy;
            this.f55547d = str;
            this.f55548e = j;
            this.f55549f = j2;
            this.f55550g = aVar;
        }

        public final void run() {
            if (this.f55545b == null) {
                C22008a g = this.f55544a.f55538l;
                StringBuilder k = C13555b.m33972k("Failed to save image to bytes, format=");
                k.append(this.f55546c.getFormat());
                g.mo55830a(new IllegalStateException(k.toString()));
            } else {
                this.f55544a.f55538l.mo55829a(this.f55547d, this.f55545b, this.f55548e - this.f55549f);
            }
            this.f55550g.mo54900a();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.mf$d */
    public static final class C22011d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C22007mf f55551a;

        /* renamed from: b */
        public final /* synthetic */ C21625ff.C21626a f55552b;

        public C22011d(C22007mf mfVar, C21625ff.C21626a aVar) {
            this.f55551a = mfVar;
            this.f55552b = aVar;
        }

        public final void run() {
            ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) this.f55551a.f55527a.get();
            CameraSelector build = new CameraSelector.Builder().requireLensFacing(1).build();
            C24362h.m61210e(build, "CameraSelector.Builder()…LENS_FACING_BACK).build()");
            try {
                Preview.Builder builder = new Preview.Builder();
                Resources resources = this.f55551a.f55533g.getResources();
                C24362h.m61210e(resources, "context.resources");
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                C24362h.m61210e(displayMetrics, "context.resources.displayMetrics");
                Preview build2 = builder.setTargetResolution(C22868e.m56289a(displayMetrics)).build();
                C24362h.m61210e(build2, "Preview.Builder()\n      …                 .build()");
                ImageAnalysis build3 = new ImageAnalysis.Builder().setBackpressureStrategy(0).setTargetResolution(this.f55551a.f55536j.mo55600a()).setTargetRotation(1).build();
                C24362h.m61210e(build3, "ImageAnalysis.Builder()\n…                 .build()");
                processCameraProvider.unbindAll();
                this.f55551a.f55530d = C21625ff.m52501a(C21625ff.f54627a, (C21625ff.C21628c) null, 1, (Object) null);
                build3.setAnalyzer(new Executor(this) {

                    /* renamed from: a */
                    public final /* synthetic */ C22011d f55553a;

                    {
                        this.f55553a = r1;
                    }

                    public final void execute(Runnable runnable) {
                        this.f55553a.f55551a.f55540n.mo54894a(runnable);
                    }
                }, new C22015mh(new C24236l<ImageProxy, C21050d>(this.f55551a) {
                    /* renamed from: a */
                    public final void mo55835a(ImageProxy imageProxy) {
                        C24362h.m61211f(imageProxy, "p1");
                        ((C22007mf) this.receiver).m53665a(imageProxy);
                    }

                    public /* synthetic */ Object invoke(Object obj) {
                        mo55835a((ImageProxy) obj);
                        return C21050d.f52856a;
                    }
                }));
                C22007mf mfVar = this.f55551a;
                mfVar.f55528b = processCameraProvider.bindToLifecycle(mfVar.f55537k, build, build2, build3);
                build2.setSurfaceProvider(this.f55551a.f55535i.getSurfaceProvider());
            } catch (Exception e) {
                C22014mg.f55554a.mo60712w("Barcode scanner init failed", e);
                this.f55551a.f55538l.mo55830a(e);
            } catch (Throwable th) {
                this.f55552b.mo54900a();
                throw th;
            }
            this.f55552b.mo54900a();
        }
    }

    public C22007mf(Context context, C22020mj mjVar, PreviewView previewView, C21886js jsVar, C1033p pVar, C22008a aVar, C24446b bVar, C21636fm fmVar, C21636fm fmVar2) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(mjVar, "detector");
        C24362h.m61211f(previewView, "previewView");
        C24362h.m61211f(jsVar, "preferredResolution");
        C24362h.m61211f(pVar, "lifecycleOwner");
        C24362h.m61211f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C24362h.m61211f(bVar, "clock");
        C24362h.m61211f(fmVar, "scannerThread");
        C24362h.m61211f(fmVar2, "uiThread");
        this.f55533g = context;
        this.f55534h = mjVar;
        this.f55535i = previewView;
        this.f55536j = jsVar;
        this.f55537k = pVar;
        this.f55538l = aVar;
        this.f55539m = bVar;
        this.f55540n = fmVar;
        this.f55541o = fmVar2;
        C18728c<ProcessCameraProvider> instance = ProcessCameraProvider.getInstance(context.getApplicationContext());
        C24362h.m61210e(instance, "ProcessCameraProvider.ge…ntext.applicationContext)");
        this.f55527a = instance;
        this.f55529c = new byte[(jsVar.mo55603d() * jsVar.mo55602c())];
    }

    /* renamed from: b */
    public final void mo55827b() {
        if (!this.f55532f.compareAndSet(true, false)) {
            C22014mg.f55554a.mo60711w("Already scanning before reset");
        } else {
            this.f55530d = C21625ff.m52501a(C21625ff.f54627a, (C21625ff.C21628c) null, 1, (Object) null);
        }
    }

    /* renamed from: b */
    private final boolean m53670b(ImageProxy imageProxy) {
        int height = imageProxy.getHeight() * imageProxy.getWidth();
        if (this.f55529c.length < height) {
            this.f55529c = new byte[height];
        }
        long a = this.f55539m.mo60661a();
        ImageProxy.PlaneProxy planeProxy = imageProxy.getPlanes()[0];
        C24362h.m61210e(planeProxy, "lum");
        ByteBuffer buffer = planeProxy.getBuffer();
        C24362h.m61210e(buffer, "lum.buffer");
        C22014mg.m53683a(buffer, imageProxy.getWidth(), imageProxy.getHeight(), planeProxy.getRowStride(), planeProxy.getPixelStride(), this.f55529c);
        String readPdf417 = this.f55534h.readPdf417(this.f55529c, imageProxy.getHeight(), imageProxy.getWidth());
        C21625ff.C21626a a2 = C21625ff.m52501a(C21625ff.f54627a, (C21625ff.C21628c) null, 1, (Object) null);
        if (readPdf417 == null) {
            return false;
        }
        long a3 = this.f55539m.mo60661a();
        C24465j a4 = C22014mg.f55554a;
        StringBuilder k = C13555b.m33972k("Processing frame done in ");
        k.append(a3 - a);
        k.append("ms");
        a4.mo60705d(k.toString());
        this.f55541o.mo54894a(new C22010c(this, ImageUtil.imageToJpegByteArray(imageProxy), imageProxy, readPdf417, a3, a, a2));
        return true;
    }

    /* renamed from: a */
    public final void mo55826a() {
        this.f55527a.addListener(new C22011d(this, C21625ff.m52501a(C21625ff.f54627a, (C21625ff.C21628c) null, 1, (Object) null)), C4732a.getMainExecutor(this.f55533g));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m53665a(ImageProxy imageProxy) {
        C21625ff.C21626a aVar;
        try {
            if (this.f55531e.compareAndSet(false, true)) {
                this.f55538l.mo55828a();
            }
            if (!this.f55532f.compareAndSet(false, true)) {
                imageProxy.close();
                C21625ff.C21626a aVar2 = this.f55530d;
                if (aVar2 != null) {
                    aVar2.mo54900a();
                    return;
                }
                return;
            }
            this.f55532f.set(m53670b(imageProxy));
            imageProxy.close();
            aVar = this.f55530d;
            if (aVar == null) {
                return;
            }
            aVar.mo54900a();
        } catch (Throwable th) {
            imageProxy.close();
            C21625ff.C21626a aVar3 = this.f55530d;
            if (aVar3 != null) {
                aVar3.mo54900a();
            }
            throw th;
        }
    }
}
