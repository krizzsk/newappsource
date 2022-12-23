package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.C0210e;
import androidx.activity.result.C0213f;
import androidx.appcompat.widget.C0411h;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookException;
import com.facebook.share.model.ShareContent;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import mf0.C24362h;
import p009a8.C0107g;
import p262t8.C6606a;

/* renamed from: com.facebook.internal.j */
public abstract class C2408j<CONTENT, RESULT> {

    /* renamed from: f */
    public static final Object f8652f = new Object();

    /* renamed from: a */
    public final Activity f8653a;

    /* renamed from: b */
    public final C0411h f8654b;

    /* renamed from: c */
    public List<? extends C2408j<CONTENT, RESULT>.C25541a> f8655c;

    /* renamed from: d */
    public int f8656d;

    /* renamed from: e */
    public C0107g f8657e;

    /* renamed from: com.facebook.internal.j$a */
    public abstract class C2409a {

        /* renamed from: a */
        public Object f8658a = C2408j.f8652f;

        public C2409a(C2408j jVar) {
            C24362h.m61211f(jVar, "this$0");
        }

        /* renamed from: a */
        public abstract boolean mo297a(ShareContent shareContent, boolean z);

        /* renamed from: b */
        public abstract C2373a mo298b(ShareContent shareContent);

        /* renamed from: c */
        public Object mo12565c() {
            return this.f8658a;
        }
    }

    public C2408j(Activity activity, int i) {
        C24362h.m61211f(activity, "activity");
        this.f8653a = activity;
        this.f8654b = null;
        this.f8656d = i;
        this.f8657e = null;
    }

    /* renamed from: a */
    public abstract C2373a mo294a();

    /* renamed from: b */
    public final Activity mo12563b() {
        Activity activity = this.f8653a;
        if (activity != null) {
            return activity;
        }
        C0411h hVar = this.f8654b;
        if (hVar == null) {
            return null;
        }
        return hVar.mo2081c();
    }

    /* renamed from: c */
    public abstract List<C2408j<CONTENT, RESULT>.C25541a> mo295c();

    /* renamed from: d */
    public final void mo12564d(ShareContent shareContent, Object obj) {
        boolean z;
        Intent intent;
        C2373a aVar;
        if (obj == f8652f) {
            z = true;
        } else {
            z = false;
        }
        if (this.f8655c == null) {
            this.f8655c = mo295c();
        }
        List<? extends C2408j<CONTENT, RESULT>.C25541a> list = this.f8655c;
        if (list != null) {
            Iterator<? extends C2408j<CONTENT, RESULT>.C25541a> it = list.iterator();
            while (true) {
                intent = null;
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                C2409a aVar2 = (C2409a) it.next();
                if (!z) {
                    C2397f0 f0Var = C2397f0.f8630a;
                    if (!C2397f0.m6307a(aVar2.mo12565c(), obj)) {
                        continue;
                    }
                }
                if (aVar2.mo297a(shareContent, true)) {
                    try {
                        aVar = aVar2.mo298b(shareContent);
                        break;
                    } catch (FacebookException e) {
                        C2373a a = mo294a();
                        C2401h.m6346d(a, e);
                        aVar = a;
                    }
                }
            }
            if (aVar == null) {
                aVar = mo294a();
                C24362h.m61211f(aVar, "appCall");
                C2401h.m6346d(aVar, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
            }
            if (mo12563b() instanceof C0213f) {
                Activity b = mo12563b();
                if (b != null) {
                    C0210e activityResultRegistry = ((C0213f) b).getActivityResultRegistry();
                    C24362h.m61210e(activityResultRegistry, "registryOwner.activityResultRegistry");
                    C0107g gVar = this.f8657e;
                    if (!C6606a.m15601b(aVar)) {
                        try {
                            intent = aVar.f8602c;
                        } catch (Throwable th) {
                            C6606a.m15600a(aVar, th);
                        }
                    }
                    if (intent != null) {
                        int b2 = aVar.mo12537b();
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        T d = activityResultRegistry.mo776d(C24362h.m61216k(Integer.valueOf(b2), "facebook-dialog-request-"), new C2404i(), new C2399g(gVar, b2, ref$ObjectRef));
                        ref$ObjectRef.element = d;
                        d.mo772a(intent);
                        aVar.mo12538c();
                    }
                    aVar.mo12538c();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
            }
            C0411h hVar = this.f8654b;
            if (hVar != null) {
                if (!C6606a.m15601b(aVar)) {
                    try {
                        intent = aVar.f8602c;
                    } catch (Throwable th2) {
                        C6606a.m15600a(aVar, th2);
                    }
                }
                int b3 = aVar.mo12537b();
                Fragment fragment = (Fragment) hVar.f1512b;
                if (fragment == null) {
                    android.app.Fragment fragment2 = (android.app.Fragment) hVar.f1513c;
                    if (fragment2 != null) {
                        fragment2.startActivityForResult(intent, b3);
                    }
                } else if (fragment != null) {
                    fragment.startActivityForResult(intent, b3);
                }
                aVar.mo12538c();
                return;
            }
            Activity activity = this.f8653a;
            if (activity != null) {
                if (!C6606a.m15601b(aVar)) {
                    try {
                        intent = aVar.f8602c;
                    } catch (Throwable th3) {
                        C6606a.m15600a(aVar, th3);
                    }
                }
                activity.startActivityForResult(intent, aVar.mo12537b());
                aVar.mo12538c();
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase.ModeHandler<CONTENT of com.facebook.internal.FacebookDialogBase, RESULT of com.facebook.internal.FacebookDialogBase>>");
    }

    public C2408j(C0411h hVar, int i) {
        this.f8654b = hVar;
        this.f8653a = null;
        this.f8656d = i;
        if (hVar.mo2081c() == null) {
            throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity".toString());
        }
    }
}
