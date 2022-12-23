package androidx.camera.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;
import androidx.camera.core.C0631r;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.lifecycle.C1043v;
import androidx.lifecycle.LiveData;
import com.google.android.play.core.appupdate.C14226d;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p054d0.C4274c1;
import p054d0.C4289j0;
import p054d0.C4293l0;
import p066e0.C4419c0;
import p066e0.C4421d0;
import p066e0.C4436j0;
import p066e0.C4443m;
import p090g1.C4732a;
import p176n0.C5782a;
import p176n0.C5787f;
import p176n0.C5788g;
import p176n0.C5789h;
import p176n0.C5790i;
import p176n0.C5791j;
import p176n0.C5798p;
import p189o0.C5903a;
import p189o0.C5904b;
import p189o0.C5905c;
import p202p0.C6024a;
import p242s1.C6333d0;
import p304x.C7103t;
import p304x.C7124z;
import p316y.C7218m;
import p583jk.C17884p;

public final class PreviewView extends FrameLayout {

    /* renamed from: m */
    public static final ImplementationMode f2234m = ImplementationMode.PERFORMANCE;

    /* renamed from: b */
    public ImplementationMode f2235b;

    /* renamed from: c */
    public C0658c f2236c;

    /* renamed from: d */
    public final C0656b f2237d;

    /* renamed from: e */
    public boolean f2238e;

    /* renamed from: f */
    public final C1043v<StreamState> f2239f;

    /* renamed from: g */
    public final AtomicReference<C0655a> f2240g;

    /* renamed from: h */
    public C5790i f2241h;

    /* renamed from: i */
    public C4443m f2242i;

    /* renamed from: j */
    public final C0653c f2243j;

    /* renamed from: k */
    public final C5787f f2244k;

    /* renamed from: l */
    public final C0651a f2245l;

    public enum ImplementationMode {
        PERFORMANCE(0),
        COMPATIBLE(1);
        
        private final int mId;

        private ImplementationMode(int i) {
            this.mId = i;
        }

        public static ImplementationMode fromId(int i) {
            for (ImplementationMode implementationMode : values()) {
                if (implementationMode.mId == i) {
                    return implementationMode;
                }
            }
            throw new IllegalArgumentException(C16759e.m42349e("Unknown implementation mode id ", i));
        }

        public int getId() {
            return this.mId;
        }
    }

    public enum ScaleType {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);
        
        private final int mId;

        private ScaleType(int i) {
            this.mId = i;
        }

        public static ScaleType fromId(int i) {
            for (ScaleType scaleType : values()) {
                if (scaleType.mId == i) {
                    return scaleType;
                }
            }
            throw new IllegalArgumentException(C16759e.m42349e("Unknown scale type id ", i));
        }

        public int getId() {
            return this.mId;
        }
    }

    public enum StreamState {
        IDLE,
        STREAMING
    }

    /* renamed from: androidx.camera.view.PreviewView$a */
    public class C0651a implements C0631r.C0635d {
        public C0651a() {
        }

        /* renamed from: a */
        public final void mo2576a(SurfaceRequest surfaceRequest) {
            SurfaceRequest.C0536f fVar;
            boolean z;
            C0658c cVar;
            int i;
            boolean z2 = true;
            if (!C17884p.m44340K()) {
                C4732a.getMainExecutor(PreviewView.this.getContext()).execute(new C7218m(1, this, surfaceRequest));
                return;
            }
            C4289j0.m11435b("PreviewView");
            CameraInternal cameraInternal = surfaceRequest.f1843d;
            PreviewView.this.f2242i = cameraInternal.getCameraInfoInternal();
            Executor mainExecutor = C4732a.getMainExecutor(PreviewView.this.getContext());
            C5788g gVar = new C5788g(this, cameraInternal, surfaceRequest);
            synchronized (surfaceRequest.f1840a) {
                surfaceRequest.f1850k = gVar;
                surfaceRequest.f1851l = mainExecutor;
                fVar = surfaceRequest.f1849j;
            }
            if (fVar != null) {
                mainExecutor.execute(new C7103t(2, gVar, fVar));
            }
            PreviewView previewView = PreviewView.this;
            ImplementationMode implementationMode = previewView.f2235b;
            boolean equals = surfaceRequest.f1843d.getCameraInfoInternal().mo23375c().equals("androidx.camera.camera2.legacy");
            C4436j0 j0Var = C5903a.f18977a;
            if (j0Var.mo19960g(C5905c.class) == null && j0Var.mo19960g(C5904b.class) == null) {
                z = false;
            } else {
                z = true;
            }
            if (!surfaceRequest.f1842c && Build.VERSION.SDK_INT > 24 && !equals && !z && (i = C0652b.f2248b[implementationMode.ordinal()]) != 1) {
                if (i == 2) {
                    z2 = false;
                } else {
                    throw new IllegalArgumentException("Invalid implementation mode: " + implementationMode);
                }
            }
            if (z2) {
                PreviewView previewView2 = PreviewView.this;
                cVar = new C0663e(previewView2, previewView2.f2237d);
            } else {
                PreviewView previewView3 = PreviewView.this;
                cVar = new C0660d(previewView3, previewView3.f2237d);
            }
            previewView.f2236c = cVar;
            C7124z cameraInfoInternal = cameraInternal.getCameraInfoInternal();
            PreviewView previewView4 = PreviewView.this;
            C0655a aVar = new C0655a(cameraInfoInternal, previewView4.f2239f, previewView4.f2236c);
            PreviewView.this.f2240g.set(aVar);
            C4421d0 cameraState = cameraInternal.getCameraState();
            Executor mainExecutor2 = C4732a.getMainExecutor(PreviewView.this.getContext());
            synchronized (cameraState.f15491b) {
                try {
                    C4421d0.C4422a aVar2 = (C4421d0.C4422a) cameraState.f15491b.get(aVar);
                    if (aVar2 != null) {
                        aVar2.f15492a.set(false);
                    }
                    C4421d0.C4422a aVar3 = new C4421d0.C4422a(mainExecutor2, aVar);
                    cameraState.f15491b.put(aVar, aVar3);
                    C14226d.m35358z0().execute(new C4419c0(0, cameraState, aVar2, aVar3));
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            PreviewView.this.f2236c.mo2646e(surfaceRequest, new C5789h(0, this, aVar, cameraInternal));
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$b */
    public static /* synthetic */ class C0652b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2247a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f2248b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0059 */
        static {
            /*
                androidx.camera.view.PreviewView$ImplementationMode[] r0 = androidx.camera.view.PreviewView.ImplementationMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2248b = r0
                r1 = 1
                androidx.camera.view.PreviewView$ImplementationMode r2 = androidx.camera.view.PreviewView.ImplementationMode.COMPATIBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f2248b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.view.PreviewView$ImplementationMode r3 = androidx.camera.view.PreviewView.ImplementationMode.PERFORMANCE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                androidx.camera.view.PreviewView$ScaleType[] r2 = androidx.camera.view.PreviewView.ScaleType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f2247a = r2
                androidx.camera.view.PreviewView$ScaleType r3 = androidx.camera.view.PreviewView.ScaleType.FILL_END     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f2247a     // Catch:{ NoSuchFieldError -> 0x0038 }
                androidx.camera.view.PreviewView$ScaleType r2 = androidx.camera.view.PreviewView.ScaleType.FILL_CENTER     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f2247a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FILL_START     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f2247a     // Catch:{ NoSuchFieldError -> 0x004e }
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f2247a     // Catch:{ NoSuchFieldError -> 0x0059 }
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f2247a     // Catch:{ NoSuchFieldError -> 0x0064 }
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.PreviewView.C0652b.<clinit>():void");
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$c */
    public class C0653c implements DisplayManager.DisplayListener {
        public C0653c() {
        }

        public final void onDisplayAdded(int i) {
        }

        public final void onDisplayChanged(int i) {
            Display display = PreviewView.this.getDisplay();
            if (display != null && display.getDisplayId() == i) {
                PreviewView.this.mo2612b();
                PreviewView.this.mo2611a();
            }
        }

        public final void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$d */
    public class C0654d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C0654d() {
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            PreviewView.this.getClass();
            return true;
        }
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private int getViewPortScaleType() {
        switch (C0652b.f2247a[getScaleType().ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 0;
            case 4:
            case 5:
            case 6:
                return 3;
            default:
                StringBuilder k = C13555b.m33972k("Unexpected scale type: ");
                k.append(getScaleType());
                throw new IllegalStateException(k.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2611a() {
        /*
            r4 = this;
            p583jk.C17884p.m44372k()
            androidx.camera.view.c r0 = r4.f2236c
            if (r0 == 0) goto L_0x000a
            r0.mo2647f()
        L_0x000a:
            n0.i r0 = r4.f2241h
            android.util.Size r1 = new android.util.Size
            int r2 = r4.getWidth()
            int r3 = r4.getHeight()
            r1.<init>(r2, r3)
            int r2 = r4.getLayoutDirection()
            r0.getClass()
            p583jk.C17884p.m44372k()
            monitor-enter(r0)
            int r3 = r1.getWidth()     // Catch:{ all -> 0x003a }
            if (r3 == 0) goto L_0x0038
            int r3 = r1.getHeight()     // Catch:{ all -> 0x003a }
            if (r3 != 0) goto L_0x0031
            goto L_0x0038
        L_0x0031:
            androidx.camera.view.b r3 = r0.f18739a     // Catch:{ all -> 0x003a }
            r3.mo2636a(r1, r2)     // Catch:{ all -> 0x003a }
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            goto L_0x0039
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
        L_0x0039:
            return
        L_0x003a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.PreviewView.mo2611a():void");
    }

    /* renamed from: b */
    public final void mo2612b() {
        Display display;
        C4443m mVar;
        if (this.f2238e && (display = getDisplay()) != null && (mVar = this.f2242i) != null) {
            C0656b bVar = this.f2237d;
            int sensorRotationDegrees = mVar.getSensorRotationDegrees(display.getRotation());
            int rotation = display.getRotation();
            bVar.f2260c = sensorRotationDegrees;
            bVar.f2261d = rotation;
        }
    }

    public Bitmap getBitmap() {
        Bitmap b;
        C17884p.m44372k();
        C0658c cVar = this.f2236c;
        if (cVar == null || (b = cVar.mo2643b()) == null) {
            return null;
        }
        C0656b bVar = cVar.f2267c;
        Size size = new Size(cVar.f2266b.getWidth(), cVar.f2266b.getHeight());
        int layoutDirection = cVar.f2266b.getLayoutDirection();
        if (!bVar.mo2641f()) {
            return b;
        }
        Matrix d = bVar.mo2639d();
        RectF e = bVar.mo2640e(size, layoutDirection);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), b.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(d);
        matrix.postScale(e.width() / ((float) bVar.f2258a.getWidth()), e.height() / ((float) bVar.f2258a.getHeight()));
        matrix.postTranslate(e.left, e.top);
        canvas.drawBitmap(b, matrix, new Paint(7));
        return createBitmap;
    }

    public C5782a getController() {
        C17884p.m44372k();
        return null;
    }

    public ImplementationMode getImplementationMode() {
        C17884p.m44372k();
        return this.f2235b;
    }

    public C4293l0 getMeteringPointFactory() {
        C17884p.m44372k();
        return this.f2241h;
    }

    public C6024a getOutputTransform() {
        Matrix matrix;
        C17884p.m44372k();
        try {
            matrix = this.f2237d.mo2638c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect rect = this.f2237d.f2259b;
        if (matrix == null || rect == null) {
            C4289j0.m11435b("PreviewView");
            return null;
        }
        RectF rectF = C5798p.f18752a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(C5798p.f18752a, rectF2, Matrix.ScaleToFit.FILL);
        matrix.preConcat(matrix2);
        if (this.f2236c instanceof C0663e) {
            matrix.postConcat(getMatrix());
        } else {
            C4289j0.m11435b("PreviewView");
        }
        new Size(rect.width(), rect.height());
        return new C6024a();
    }

    public LiveData<StreamState> getPreviewStreamState() {
        return this.f2239f;
    }

    public ScaleType getScaleType() {
        C17884p.m44372k();
        return this.f2237d.f2263f;
    }

    public C0631r.C0635d getSurfaceProvider() {
        C17884p.m44372k();
        return this.f2245l;
    }

    public C4274c1 getViewPort() {
        C17884p.m44372k();
        if (getDisplay() == null) {
            return null;
        }
        int rotation = getDisplay().getRotation();
        C17884p.m44372k();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new C4274c1(getViewPortScaleType(), new Rational(getWidth(), getHeight()), rotation, getLayoutDirection());
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo2612b();
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.f2243j, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.f2244k);
        C0658c cVar = this.f2236c;
        if (cVar != null) {
            cVar.mo2644c();
        }
        C17884p.m44372k();
        getDisplay();
        getViewPort();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f2244k);
        C0658c cVar = this.f2236c;
        if (cVar != null) {
            cVar.mo2645d();
        }
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.f2243j);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final boolean performClick() {
        return super.performClick();
    }

    public void setController(C5782a aVar) {
        C17884p.m44372k();
        C17884p.m44372k();
        getDisplay();
        getViewPort();
    }

    public void setImplementationMode(ImplementationMode implementationMode) {
        C17884p.m44372k();
        this.f2235b = implementationMode;
    }

    public void setScaleType(ScaleType scaleType) {
        C17884p.m44372k();
        this.f2237d.f2263f = scaleType;
        mo2611a();
        C17884p.m44372k();
        getDisplay();
        getViewPort();
    }

    /* JADX INFO: finally extract failed */
    public PreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        ImplementationMode implementationMode = f2234m;
        this.f2235b = implementationMode;
        C0656b bVar = new C0656b();
        this.f2237d = bVar;
        this.f2238e = true;
        this.f2239f = new C1043v<>(StreamState.IDLE);
        this.f2240g = new AtomicReference<>();
        this.f2241h = new C5790i(bVar);
        this.f2243j = new C0653c();
        this.f2244k = new C5787f(this);
        this.f2245l = new C0651a();
        C17884p.m44372k();
        Resources.Theme theme = context.getTheme();
        int[] iArr = C5791j.PreviewView;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C6333d0.m15028p(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        try {
            setScaleType(ScaleType.fromId(obtainStyledAttributes.getInteger(C5791j.PreviewView_scaleType, bVar.f2263f.getId())));
            setImplementationMode(ImplementationMode.fromId(obtainStyledAttributes.getInteger(C5791j.PreviewView_implementationMode, implementationMode.getId())));
            obtainStyledAttributes.recycle();
            new ScaleGestureDetector(context, new C0654d());
            if (getBackground() == null) {
                setBackgroundColor(C4732a.getColor(getContext(), 17170444));
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
