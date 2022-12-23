package androidx.appcompat.widget;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.FragmentActivity;
import com.appboy.Appboy;
import com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView;
import com.facebook.appevents.C2335g;
import com.facebook.appevents.FlushReason;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.firebase.messaging.FirebaseMessaging;
import com.moovit.app.home.HomeActivity;
import com.moovit.commons.utils.ApplicationBugException;
import gc0.C12724b;
import java.lang.reflect.Method;
import java.util.Iterator;
import mf0.C24362h;
import nc0.C12952c;
import p030bo.app.C1642n1;
import p054d0.C4304q0;
import p067e1.C4464a;
import p067e1.C4477c;
import p067e1.C4479d;
import p067e1.C4483f;
import p262t8.C6606a;
import p399bw.C13697b;
import p484ff.C16960b0;
import p613kq.C18116c;
import p684nq.C18584e;

/* renamed from: androidx.appcompat.widget.i1 */
public final /* synthetic */ class C0416i1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f1519b;

    /* renamed from: c */
    public final /* synthetic */ Object f1520c;

    public /* synthetic */ C0416i1(Object obj, int i) {
        this.f1519b = i;
        this.f1520c = obj;
    }

    public final void run() {
        ViewParent parent;
        ViewParent parent2;
        boolean z;
        Application application;
        C4483f.C4484a aVar;
        boolean z2;
        boolean z3 = true;
        C18116c.C18117a aVar2 = null;
        switch (this.f1519b) {
            case 0:
                ((Toolbar) this.f1520c).mo1954l();
                return;
            case 1:
                Camera2CameraImpl.C0497e.C0499b.m1398a((Camera2CameraImpl.C0497e.C0499b) this.f1520c);
                return;
            case 2:
                C4304q0 q0Var = (C4304q0) this.f1520c;
                synchronized (q0Var.f15232m) {
                    if (!q0Var.f15233n) {
                        q0Var.f15234o.close();
                        q0Var.f15235p.release();
                        q0Var.f15239t.mo2450a();
                        q0Var.f15233n = true;
                        return;
                    }
                    return;
                }
            case 3:
                Activity activity = (Activity) this.f1520c;
                int i = C4464a.f15531a;
                if (!activity.isFinishing()) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 28) {
                        Class<?> cls = C4483f.f15550a;
                        activity.recreate();
                    } else {
                        Class<?> cls2 = C4483f.f15550a;
                        if (i2 == 26 || i2 == 27) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if ((!z || C4483f.f15555f != null) && !(C4483f.f15554e == null && C4483f.f15553d == null)) {
                            try {
                                Object obj = C4483f.f15552c.get(activity);
                                if (obj != null) {
                                    Object obj2 = C4483f.f15551b.get(activity);
                                    if (obj2 != null) {
                                        application = activity.getApplication();
                                        aVar = new C4483f.C4484a(activity);
                                        application.registerActivityLifecycleCallbacks(aVar);
                                        Handler handler = C4483f.f15556g;
                                        handler.post(new C4477c(aVar, obj));
                                        if (i2 == 26 || i2 == 27) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            Method method = C4483f.f15555f;
                                            Boolean bool = Boolean.FALSE;
                                            method.invoke(obj2, new Object[]{obj, null, null, 0, bool, null, null, bool, bool});
                                        } else {
                                            activity.recreate();
                                        }
                                        handler.post(new C4479d(application, aVar));
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        z3 = false;
                    }
                    if (!z3) {
                        activity.recreate();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((C1642n1) this.f1520c).m4501f();
                return;
            case 5:
                ((Appboy) this.f1520c).m5419h();
                return;
            case 6:
                FlushReason flushReason = (FlushReason) this.f1520c;
                String str = C2335g.f8528a;
                Class<C2335g> cls3 = C2335g.class;
                if (!C6606a.m15601b(cls3)) {
                    try {
                        C24362h.m61211f(flushReason, "$reason");
                        C2335g.m6199d(flushReason);
                        return;
                    } catch (Throwable th) {
                        C6606a.m15600a(cls3, th);
                        return;
                    }
                } else {
                    return;
                }
            case 7:
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f8592a;
                ((FetchedAppSettingsManager.C2371a) this.f1520c).onError();
                return;
            case 8:
                ((FirebaseMessaging) this.f1520c).lambda$new$3();
                return;
            case 9:
                C16960b0 b0Var = (C16960b0) this.f1520c;
                synchronized (b0Var.f44024d) {
                    SharedPreferences.Editor edit = b0Var.f44021a.edit();
                    String str2 = b0Var.f44022b;
                    StringBuilder sb = new StringBuilder();
                    Iterator<String> it = b0Var.f44024d.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next());
                        sb.append(b0Var.f44023c);
                    }
                    edit.putString(str2, sb.toString()).commit();
                }
                return;
            case 10:
                C18116c cVar = (C18116c) this.f1520c;
                int[] iArr = C18116c.f46317q;
                FragmentActivity activity2 = cVar.getActivity();
                if (activity2 != null) {
                    int i3 = cVar.requireArguments().getInt("position", -1);
                    if (i3 != -1) {
                        if (i3 >= 0) {
                            int[] iArr2 = C18116c.f46317q;
                            if (i3 < 10) {
                                int i4 = iArr2[i3];
                                int i5 = C18116c.f46318r[i3];
                                Button button = (Button) activity2.findViewById(i4);
                                ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) activity2.findViewById(i5);
                                if (!(button == null || contentLoadingProgressBar == null)) {
                                    aVar2 = new C18116c.C18117a(button, contentLoadingProgressBar);
                                }
                                cVar.f46320o = aVar2;
                                cVar.mo50554p2(aVar2.f46322a);
                                cVar.mo50551m2();
                                return;
                            }
                        }
                        throw new ApplicationBugException("position must be between 0 - 9");
                    }
                    throw new IllegalStateException("Did you use ActionFragment.createArgs(...)?");
                }
                return;
            case 11:
                int i6 = C18584e.f47313w;
                ((C18584e) this.f1520c).mo50978z2();
                return;
            case 12:
                HomeActivity homeActivity = (HomeActivity) this.f1520c;
                int i7 = HomeActivity.f38149o0;
                homeActivity.mo45093A2(homeActivity.getIntent(), (Bundle) null);
                return;
            case 13:
                ((C13697b) this.f1520c).dismissAllowingStateLoss();
                return;
            case 14:
                UMOAdKitBannerView uMOAdKitBannerView = (UMOAdKitBannerView) this.f1520c;
                C24362h.m61211f(uMOAdKitBannerView, "$it");
                C12952c.m32797g(uMOAdKitBannerView);
                UMOAdKitBannerView.m5802h(uMOAdKitBannerView, true);
                return;
            default:
                C12724b bVar = (C12724b) this.f1520c;
                C24362h.m61211f(bVar, "this$0");
                RelativeLayout relativeLayout = bVar.f31434k;
                if (!(relativeLayout == null || (parent2 = relativeLayout.getParent()) == null)) {
                    ((ViewGroup) parent2).removeView(relativeLayout);
                }
                FrameLayout frameLayout = bVar.f31433j;
                if (frameLayout != null && (parent = frameLayout.getParent()) != null) {
                    ((ViewGroup) parent).removeView(frameLayout);
                    return;
                }
                return;
        }
    }
}
