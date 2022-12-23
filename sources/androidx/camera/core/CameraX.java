package androidx.camera.core;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import androidx.camera.core.C0551g;
import androidx.camera.core.impl.C0572a;
import androidx.camera.core.impl.C0590n;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import mf0.C24361g;
import p054d0.C4283h;
import p054d0.C4289j0;
import p054d0.C4294m;
import p066e0.C4437k;
import p066e0.C4440l;
import p066e0.C4445n;
import p078f0.C4637d;
import p102h0.C5023g;
import p177n1.C5807g;

public final class CameraX {

    /* renamed from: l */
    public static final Object f1826l = new Object();

    /* renamed from: m */
    public static final SparseArray<Integer> f1827m = new SparseArray<>();

    /* renamed from: a */
    public final C4445n f1828a = new C4445n();

    /* renamed from: b */
    public final Object f1829b = new Object();

    /* renamed from: c */
    public final C0551g f1830c;

    /* renamed from: d */
    public final Executor f1831d;

    /* renamed from: e */
    public final Handler f1832e;

    /* renamed from: f */
    public C4440l f1833f;

    /* renamed from: g */
    public C4437k f1834g;

    /* renamed from: h */
    public UseCaseConfigFactory f1835h;

    /* renamed from: i */
    public Context f1836i;

    /* renamed from: j */
    public final CallbackToFutureAdapter.C0675c f1837j;

    /* renamed from: k */
    public InternalInitState f1838k = InternalInitState.UNINITIALIZED;

    public enum InternalInitState {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public CameraX(Context context) {
        C0551g.C0553b bVar;
        Object obj;
        Object obj2;
        boolean z;
        CallbackToFutureAdapter.C0675c a;
        int i;
        String str;
        C5023g.m12857e((Object) null);
        Application b = C4637d.m11953b(context);
        if (b instanceof C0551g.C0553b) {
            bVar = (C0551g.C0553b) b;
        } else {
            try {
                Context a2 = C4637d.m11952a(context);
                Bundle bundle = a2.getPackageManager().getServiceInfo(new ComponentName(a2, MetadataHolderService.class), 640).metaData;
                if (bundle != null) {
                    str = bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER");
                } else {
                    str = null;
                }
                if (str == null) {
                    C4289j0.m11435b("CameraX");
                    bVar = null;
                } else {
                    bVar = (C0551g.C0553b) Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                }
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
                C4289j0.m11435b("CameraX");
            }
        }
        if (bVar != null) {
            C0551g cameraXConfig = bVar.getCameraXConfig();
            this.f1830c = cameraXConfig;
            C0590n nVar = cameraXConfig.f1907x;
            C0572a aVar = C0551g.f1901B;
            nVar.getClass();
            try {
                obj = nVar.mo2422a(aVar);
            } catch (IllegalArgumentException unused2) {
                obj = null;
            }
            Executor executor = (Executor) obj;
            C0590n nVar2 = this.f1830c.f1907x;
            C0572a aVar2 = C0551g.f1902C;
            nVar2.getClass();
            try {
                obj2 = nVar2.mo2422a(aVar2);
            } catch (IllegalArgumentException unused3) {
                obj2 = null;
            }
            Handler handler = (Handler) obj2;
            this.f1831d = executor == null ? new C4283h() : executor;
            if (handler == null) {
                HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
                handlerThread.start();
                this.f1832e = C5807g.m14238a(handlerThread.getLooper());
            } else {
                this.f1832e = handler;
            }
            C0551g gVar = this.f1830c;
            C0572a aVar3 = C0551g.f1903D;
            gVar.getClass();
            Integer num = (Integer) ((C0590n) gVar.getConfig()).mo2423b(aVar3, null);
            synchronized (f1826l) {
                z = true;
                if (num != null) {
                    C24361g.m61179p(num.intValue(), 3, "minLogLevel", 6);
                    SparseArray<Integer> sparseArray = f1827m;
                    if (sparseArray.get(num.intValue()) != null) {
                        i = sparseArray.get(num.intValue()).intValue() + 1;
                    } else {
                        i = 1;
                    }
                    sparseArray.put(num.intValue(), Integer.valueOf(i));
                    if (sparseArray.size() == 0) {
                        C4289j0.f15210a = 3;
                    } else if (sparseArray.get(3) != null) {
                        C4289j0.f15210a = 3;
                    } else if (sparseArray.get(4) != null) {
                        C4289j0.f15210a = 4;
                    } else if (sparseArray.get(5) != null) {
                        C4289j0.f15210a = 5;
                    } else if (sparseArray.get(6) != null) {
                        C4289j0.f15210a = 6;
                    }
                }
            }
            synchronized (this.f1829b) {
                if (this.f1838k != InternalInitState.UNINITIALIZED) {
                    z = false;
                }
                C24361g.m61193w("CameraX.initInternal() should only be called once per instance", z);
                this.f1838k = InternalInitState.INITIALIZING;
                a = CallbackToFutureAdapter.m1884a(new C4294m(0, this, context));
            }
            this.f1837j = a;
            return;
        }
        throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
    }

    /* renamed from: a */
    public final void mo2358a() {
        synchronized (this.f1829b) {
            this.f1838k = InternalInitState.INITIALIZED;
        }
    }
}
