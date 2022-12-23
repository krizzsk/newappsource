package com.veriff.sdk.camera.core;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.CameraXConfig;
import com.veriff.sdk.camera.core.impl.CameraDeviceSurfaceManager;
import com.veriff.sdk.camera.core.impl.CameraFactory;
import com.veriff.sdk.camera.core.impl.CameraRepository;
import com.veriff.sdk.camera.core.impl.CameraThreadConfig;
import com.veriff.sdk.camera.core.impl.CameraValidator;
import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.MetadataHolderService;
import com.veriff.sdk.camera.core.impl.UseCaseConfigFactory;
import com.veriff.sdk.camera.core.impl.utils.ContextUtil;
import com.veriff.sdk.camera.core.impl.utils.executor.CameraXExecutors;
import com.veriff.sdk.camera.core.impl.utils.futures.FutureCallback;
import com.veriff.sdk.camera.core.impl.utils.futures.FutureChain;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import fd0.C12690k;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import mf0.C24361g;
import p054d0.C4294m;
import p112ha.C5182f0;
import p177n1.C5807g;
import p373au.C13533e;
import p695od.C18728c;

public final class CameraX {
    public static final Object INSTANCE_LOCK = new Object();
    private static CameraXConfig.Provider sConfigProvider;
    private static C18728c<Void> sInitializeFuture = Futures.immediateFailedFuture(new IllegalStateException("CameraX is not initialized."));
    public static CameraX sInstance;
    private static C18728c<Void> sShutdownFuture = Futures.immediateFuture(null);
    private Context mAppContext;
    private final Executor mCameraExecutor;
    private CameraFactory mCameraFactory;
    public final CameraRepository mCameraRepository = new CameraRepository();
    private final CameraXConfig mCameraXConfig;
    private UseCaseConfigFactory mDefaultConfigFactory;
    private InternalInitState mInitState = InternalInitState.UNINITIALIZED;
    private final Object mInitializeLock = new Object();
    private final Handler mSchedulerHandler;
    private final HandlerThread mSchedulerThread;
    private C18728c<Void> mShutdownInternalFuture = Futures.immediateFuture(null);
    private CameraDeviceSurfaceManager mSurfaceManager;

    /* renamed from: com.veriff.sdk.camera.core.CameraX$2 */
    public static /* synthetic */ class C124842 {
        public static final /* synthetic */ int[] $SwitchMap$com$veriff$sdk$camera$core$CameraX$InternalInitState;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.veriff.sdk.camera.core.CameraX$InternalInitState[] r0 = com.veriff.sdk.camera.core.CameraX.InternalInitState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$veriff$sdk$camera$core$CameraX$InternalInitState = r0
                com.veriff.sdk.camera.core.CameraX$InternalInitState r1 = com.veriff.sdk.camera.core.CameraX.InternalInitState.UNINITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$veriff$sdk$camera$core$CameraX$InternalInitState     // Catch:{ NoSuchFieldError -> 0x001d }
                com.veriff.sdk.camera.core.CameraX$InternalInitState r1 = com.veriff.sdk.camera.core.CameraX.InternalInitState.INITIALIZING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$veriff$sdk$camera$core$CameraX$InternalInitState     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.veriff.sdk.camera.core.CameraX$InternalInitState r1 = com.veriff.sdk.camera.core.CameraX.InternalInitState.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$veriff$sdk$camera$core$CameraX$InternalInitState     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.veriff.sdk.camera.core.CameraX$InternalInitState r1 = com.veriff.sdk.camera.core.CameraX.InternalInitState.SHUTDOWN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.core.CameraX.C124842.<clinit>():void");
        }
    }

    public enum InternalInitState {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZED,
        SHUTDOWN
    }

    public CameraX(CameraXConfig cameraXConfig) {
        cameraXConfig.getClass();
        this.mCameraXConfig = cameraXConfig;
        Executor cameraExecutor = cameraXConfig.getCameraExecutor((Executor) null);
        Handler schedulerHandler = cameraXConfig.getSchedulerHandler((Handler) null);
        this.mCameraExecutor = cameraExecutor == null ? new CameraExecutor() : cameraExecutor;
        if (schedulerHandler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.mSchedulerThread = handlerThread;
            handlerThread.start();
            this.mSchedulerHandler = C5807g.m14238a(handlerThread.getLooper());
            return;
        }
        this.mSchedulerThread = null;
        this.mSchedulerHandler = schedulerHandler;
    }

    private static void configureInstanceLocked(CameraXConfig.Provider provider) {
        boolean z;
        provider.getClass();
        if (sConfigProvider == null) {
            z = true;
        } else {
            z = false;
        }
        C24361g.m61193w("CameraX has already been configured. To use a different configuration, shutdown() must be called.", z);
        sConfigProvider = provider;
        CameraXConfig cameraXConfig = provider.getCameraXConfig();
        Config.Option<Integer> option = CameraXConfig.OPTION_MIN_LOGGING_LEVEL;
        cameraXConfig.getClass();
        Integer num = (Integer) C12690k.m32424g(cameraXConfig, option, (Object) null);
        if (num != null) {
            Logger.setMinLogLevel(num.intValue());
        }
    }

    private static Application getApplicationFromContext(Context context) {
        for (Context applicationContext = ContextUtil.getApplicationContext(context); applicationContext instanceof ContextWrapper; applicationContext = ContextUtil.getBaseContext((ContextWrapper) applicationContext)) {
            if (applicationContext instanceof Application) {
                return (Application) applicationContext;
            }
        }
        return null;
    }

    private static CameraXConfig.Provider getConfigProvider(Context context) {
        String str;
        Application applicationFromContext = getApplicationFromContext(context);
        if (applicationFromContext instanceof CameraXConfig.Provider) {
            return (CameraXConfig.Provider) applicationFromContext;
        }
        try {
            Context applicationContext = ContextUtil.getApplicationContext(context);
            Bundle bundle = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, MetadataHolderService.class), 640).metaData;
            if (bundle != null) {
                str = bundle.getString("com.veriff.sdk.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER");
            } else {
                str = null;
            }
            if (str != null) {
                return (CameraXConfig.Provider) Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            Logger.m32241e("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            Logger.m32242e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    private static C18728c<CameraX> getInstanceLocked() {
        CameraX cameraX = sInstance;
        if (cameraX == null) {
            return Futures.immediateFailedFuture(new IllegalStateException("Must call CameraX.initialize() first"));
        }
        return Futures.transform(sInitializeFuture, new C12518f(cameraX), CameraXExecutors.directExecutor());
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p695od.C18728c<com.veriff.sdk.camera.core.CameraX> getOrCreateInstance(android.content.Context r4) {
        /*
            java.lang.String r0 = "Context must not be null."
            mf0.C24361g.m61185s(r4, r0)
            java.lang.Object r0 = INSTANCE_LOCK
            monitor-enter(r0)
            com.veriff.sdk.camera.core.CameraXConfig$Provider r1 = sConfigProvider     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x000e
            r1 = 1
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            od.c r2 = getInstanceLocked()     // Catch:{ all -> 0x004a }
            boolean r3 = r2.isDone()     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x002b
            r2.get()     // Catch:{ InterruptedException -> 0x0022, ExecutionException -> 0x001d }
            goto L_0x002b
        L_0x001d:
            shutdownLocked()     // Catch:{ all -> 0x004a }
            r2 = 0
            goto L_0x002b
        L_0x0022:
            r4 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x004a }
            java.lang.String r2 = "Unexpected thread interrupt. Should not be possible since future is already complete."
            r1.<init>(r2, r4)     // Catch:{ all -> 0x004a }
            throw r1     // Catch:{ all -> 0x004a }
        L_0x002b:
            if (r2 != 0) goto L_0x0048
            if (r1 != 0) goto L_0x0041
            com.veriff.sdk.camera.core.CameraXConfig$Provider r1 = getConfigProvider(r4)     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0039
            configureInstanceLocked(r1)     // Catch:{ all -> 0x004a }
            goto L_0x0041
        L_0x0039:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004a }
            java.lang.String r1 = "CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'."
            r4.<init>(r1)     // Catch:{ all -> 0x004a }
            throw r4     // Catch:{ all -> 0x004a }
        L_0x0041:
            initializeInstanceLocked(r4)     // Catch:{ all -> 0x004a }
            od.c r2 = getInstanceLocked()     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r2
        L_0x004a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.core.CameraX.getOrCreateInstance(android.content.Context):od.c");
    }

    private void initAndRetryRecursively(Executor executor, long j, Context context, CallbackToFutureAdapter.C0673a<Void> aVar) {
        executor.execute(new C12524i(this, context, executor, aVar, j));
    }

    /* access modifiers changed from: private */
    public C18728c<Void> initInternal(Context context) {
        boolean z;
        CallbackToFutureAdapter.C0675c a;
        synchronized (this.mInitializeLock) {
            if (this.mInitState == InternalInitState.UNINITIALIZED) {
                z = true;
            } else {
                z = false;
            }
            C24361g.m61193w("CameraX.initInternal() should only be called once per instance", z);
            this.mInitState = InternalInitState.INITIALIZING;
            a = CallbackToFutureAdapter.m1884a(new C4294m(5, this, context));
        }
        return a;
    }

    private static void initializeInstanceLocked(Context context) {
        boolean z;
        context.getClass();
        if (sInstance == null) {
            z = true;
        } else {
            z = false;
        }
        C24361g.m61193w("CameraX already initialized.", z);
        sConfigProvider.getClass();
        CameraX cameraX = new CameraX(sConfigProvider.getCameraXConfig());
        sInstance = cameraX;
        sInitializeFuture = CallbackToFutureAdapter.m1884a(new C5182f0(5, cameraX, context));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CameraX lambda$getInstanceLocked$6(CameraX cameraX, Void voidR) {
        return cameraX;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$initAndRetryRecursively$8(Executor executor, long j, CallbackToFutureAdapter.C0673a aVar) {
        initAndRetryRecursively(executor, j, this.mAppContext, aVar);
    }

    /* access modifiers changed from: private */
    public void lambda$initAndRetryRecursively$9(Context context, Executor executor, CallbackToFutureAdapter.C0673a aVar, long j) {
        try {
            Application applicationFromContext = getApplicationFromContext(context);
            this.mAppContext = applicationFromContext;
            if (applicationFromContext == null) {
                this.mAppContext = ContextUtil.getApplicationContext(context);
            }
            CameraFactory.Provider cameraFactoryProvider = this.mCameraXConfig.getCameraFactoryProvider((CameraFactory.Provider) null);
            if (cameraFactoryProvider != null) {
                CameraThreadConfig create = CameraThreadConfig.create(this.mCameraExecutor, this.mSchedulerHandler);
                CameraSelector availableCamerasLimiter = this.mCameraXConfig.getAvailableCamerasLimiter((CameraSelector) null);
                this.mCameraFactory = cameraFactoryProvider.newInstance(this.mAppContext, create, availableCamerasLimiter);
                CameraDeviceSurfaceManager.Provider deviceSurfaceManagerProvider = this.mCameraXConfig.getDeviceSurfaceManagerProvider((CameraDeviceSurfaceManager.Provider) null);
                if (deviceSurfaceManagerProvider != null) {
                    this.mSurfaceManager = deviceSurfaceManagerProvider.newInstance(this.mAppContext, this.mCameraFactory.getCameraManager(), this.mCameraFactory.getAvailableCameraIds());
                    UseCaseConfigFactory.Provider useCaseConfigFactoryProvider = this.mCameraXConfig.getUseCaseConfigFactoryProvider((UseCaseConfigFactory.Provider) null);
                    if (useCaseConfigFactoryProvider != null) {
                        this.mDefaultConfigFactory = useCaseConfigFactoryProvider.newInstance(this.mAppContext);
                        if (executor instanceof CameraExecutor) {
                            ((CameraExecutor) executor).init(this.mCameraFactory);
                        }
                        this.mCameraRepository.init(this.mCameraFactory);
                        CameraValidator.validateCameras(this.mAppContext, this.mCameraRepository, availableCamerasLimiter);
                        setStateToInitialized();
                        aVar.mo2697b(null);
                        return;
                    }
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
            }
            throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
        } catch (InitializationException | CameraValidator.CameraIdListIncorrectException | RuntimeException e) {
            if (SystemClock.elapsedRealtime() - j < 2500) {
                StringBuilder g = C16759e.m42351g("Retry init. Start time ", j, " current time ");
                g.append(SystemClock.elapsedRealtime());
                Logger.m32246w("CameraX", g.toString(), e);
                Handler handler = this.mSchedulerHandler;
                C12557j jVar = new C12557j(this, executor, j, aVar);
                if (Build.VERSION.SDK_INT >= 28) {
                    boolean unused = handler.postDelayed(jVar, "retry_token", 500);
                    return;
                }
                Message obtain = Message.obtain(handler, jVar);
                obtain.obj = "retry_token";
                handler.sendMessageDelayed(obtain, 500);
                return;
            }
            setStateToInitialized();
            if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                Logger.m32241e("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                aVar.mo2697b(null);
            } else if (e instanceof InitializationException) {
                aVar.mo2698c(e);
            } else {
                aVar.mo2698c(new InitializationException(e));
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$initInternal$7(Context context, CallbackToFutureAdapter.C0673a aVar) throws Exception {
        initAndRetryRecursively(this.mCameraExecutor, SystemClock.elapsedRealtime(), context, aVar);
        return "CameraX initInternal";
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object lambda$initializeInstanceLocked$3(final CameraX cameraX, Context context, final CallbackToFutureAdapter.C0673a aVar) throws Exception {
        synchronized (INSTANCE_LOCK) {
            Futures.addCallback(FutureChain.from(sShutdownFuture).transformAsync(new C12520g(context, cameraX), CameraXExecutors.directExecutor()), new FutureCallback<Void>() {
                public void onFailure(Throwable th) {
                    Logger.m32246w("CameraX", "CameraX initialize() failed", th);
                    synchronized (CameraX.INSTANCE_LOCK) {
                        if (CameraX.sInstance == cameraX) {
                            CameraX.shutdownLocked();
                        }
                    }
                    CallbackToFutureAdapter.C0673a.this.mo2698c(th);
                }

                public void onSuccess(Void voidR) {
                    CallbackToFutureAdapter.C0673a.this.mo2697b(null);
                }
            }, CameraXExecutors.directExecutor());
        }
        return "CameraX-initialize";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$shutdownInternal$10(CallbackToFutureAdapter.C0673a aVar) {
        if (this.mSchedulerThread != null) {
            Executor executor = this.mCameraExecutor;
            if (executor instanceof CameraExecutor) {
                ((CameraExecutor) executor).deinit();
            }
            this.mSchedulerThread.quit();
            aVar.mo2697b(null);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$shutdownInternal$11(CallbackToFutureAdapter.C0673a aVar) throws Exception {
        this.mCameraRepository.deinit().addListener(new C12569s(2, this, aVar), this.mCameraExecutor);
        return "CameraX shutdownInternal";
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object lambda$shutdownLocked$5(CameraX cameraX, CallbackToFutureAdapter.C0673a aVar) throws Exception {
        synchronized (INSTANCE_LOCK) {
            sInitializeFuture.addListener(new C12522h(0, cameraX, aVar), CameraXExecutors.directExecutor());
        }
        return "CameraX shutdown";
    }

    private void setStateToInitialized() {
        synchronized (this.mInitializeLock) {
            this.mInitState = InternalInitState.INITIALIZED;
        }
    }

    private C18728c<Void> shutdownInternal() {
        synchronized (this.mInitializeLock) {
            this.mSchedulerHandler.removeCallbacksAndMessages("retry_token");
            int i = C124842.$SwitchMap$com$veriff$sdk$camera$core$CameraX$InternalInitState[this.mInitState.ordinal()];
            if (i == 1) {
                this.mInitState = InternalInitState.SHUTDOWN;
                C18728c<Void> immediateFuture = Futures.immediateFuture(null);
                return immediateFuture;
            } else if (i != 2) {
                if (i == 3) {
                    this.mInitState = InternalInitState.SHUTDOWN;
                    this.mShutdownInternalFuture = CallbackToFutureAdapter.m1884a(new C13533e(this, 18));
                }
                C18728c<Void> cVar = this.mShutdownInternalFuture;
                return cVar;
            } else {
                throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
            }
        }
    }

    public static C18728c<Void> shutdownLocked() {
        CameraX cameraX = sInstance;
        if (cameraX == null) {
            return sShutdownFuture;
        }
        sInstance = null;
        C18728c<Void> nonCancellationPropagating = Futures.nonCancellationPropagating(CallbackToFutureAdapter.m1884a(new C12516e(cameraX)));
        sShutdownFuture = nonCancellationPropagating;
        return nonCancellationPropagating;
    }

    public CameraDeviceSurfaceManager getCameraDeviceSurfaceManager() {
        CameraDeviceSurfaceManager cameraDeviceSurfaceManager = this.mSurfaceManager;
        if (cameraDeviceSurfaceManager != null) {
            return cameraDeviceSurfaceManager;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public CameraRepository getCameraRepository() {
        return this.mCameraRepository;
    }

    public UseCaseConfigFactory getDefaultConfigFactory() {
        UseCaseConfigFactory useCaseConfigFactory = this.mDefaultConfigFactory;
        if (useCaseConfigFactory != null) {
            return useCaseConfigFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }
}
