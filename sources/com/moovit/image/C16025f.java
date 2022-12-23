package com.moovit.image;

import android.content.Context;
import android.os.Looper;
import b00.C13556a;
import c00.C13720d;
import c00.C13722f;
import ce0.C21100e;
import com.bumptech.glide.load.engine.GlideException;
import com.moovit.MoovitExecutors;
import com.moovit.image.model.Image;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p009a8.C0112l;
import p260t6.C6597c;
import p260t6.C6601f;
import p273u6.C6720j;
import p583jk.C17884p;
import p824tp.C19725d;
import r10.C19220d;
import r10.C19221e;
import v10.C20065a;

/* renamed from: com.moovit.image.f */
public abstract class C16025f<R> implements C13556a {

    /* renamed from: b */
    public final C16026a f41728b = new C16026a();

    /* renamed from: c */
    public final Context f41729c;

    /* renamed from: d */
    public final HashSet f41730d;

    /* renamed from: e */
    public final Class<R> f41731e;

    /* renamed from: f */
    public final ArrayList f41732f;

    /* renamed from: g */
    public int f41733g;

    /* renamed from: h */
    public final HashMap f41734h;

    /* renamed from: com.moovit.image.f$a */
    public class C16026a implements C19725d.C19726a {
        public C16026a() {
        }

        /* renamed from: b */
        public final void mo44844b(Context context) {
            ((C19725d) context.getSystemService("destruction_notifier")).mo52074c(this);
            C16025f.this.cancel(true);
        }
    }

    /* renamed from: com.moovit.image.f$b */
    public class C16027b implements C6601f<R> {
        public C16027b() {
        }

        /* renamed from: f */
        public final boolean mo22747f(GlideException glideException, Object obj) {
            C16025f fVar = C16025f.this;
            C16025f.m40813a(fVar, fVar.f41729c, (Image) obj, (Object) null);
            return false;
        }

        /* renamed from: g */
        public final void mo22748g(Object obj, Object obj2, C6720j jVar) {
            C16025f fVar = C16025f.this;
            C16025f.m40813a(fVar, fVar.f41729c, (Image) obj2, obj);
        }
    }

    public C16025f(Context context, Collection collection) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f41729c = context;
        C21100e.m49373x(collection, "images");
        HashSet g = C13720d.m34277g(collection, (C13722f) null, new C0112l(8));
        this.f41730d = g;
        this.f41731e = C20065a.class;
        this.f41733g = g.size();
        this.f41732f = new ArrayList(this.f41733g);
        this.f41734h = new HashMap(this.f41733g);
    }

    /* renamed from: a */
    public static void m40813a(C16025f fVar, Context context, Image image, Object obj) {
        synchronized (fVar) {
            fVar.f41734h.put(image, obj);
            int i = fVar.f41733g - 1;
            fVar.f41733g = i;
            if (i <= 0) {
                ((C19725d) context.getSystemService("destruction_notifier")).mo52074c(fVar.f41728b);
            }
            fVar.mo48193d();
        }
    }

    /* renamed from: b */
    public C19220d<R> mo48191b(Context context, Image image) {
        C19221e X = C17884p.m44353X(context);
        Class<R> cls = this.f41731e;
        X.getClass();
        return ((C19220d) new C19220d(X.f6938b, X, cls, X.f6939c).mo10859b0(image)).mo51628o0(image);
    }

    /* renamed from: c */
    public boolean mo48192c(Object obj) {
        return obj != null;
    }

    public final synchronized boolean cancel(boolean z) {
        this.f41733g = -1;
        Iterator it = this.f41732f.iterator();
        while (it.hasNext()) {
            ((C6597c) it.next()).cancel(false);
        }
        this.f41732f.clear();
        mo48194e();
        return true;
    }

    /* renamed from: d */
    public final synchronized void mo48193d() {
        boolean z;
        if (this.f41733g == 0) {
            boolean z2 = true;
            if (Looper.getMainLooper() == Looper.myLooper()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                MoovitExecutors.MAIN_THREAD.execute(new C16020e(this));
                return;
            }
            HashMap hashMap = this.f41734h;
            Iterator it = this.f41730d.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!mo48192c(hashMap.get((Image) it.next()))) {
                        z2 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            mo48195f(hashMap, z2);
        }
    }

    /* renamed from: e */
    public void mo48194e() {
    }

    /* renamed from: f */
    public abstract void mo48195f(HashMap hashMap, boolean z);

    /* renamed from: g */
    public final synchronized void mo48196g() {
        if (this.f41730d.isEmpty()) {
            mo48193d();
        } else if (this.f41732f.size() <= 0) {
            C19725d a = C19725d.m47191a(this.f41729c);
            a.f50162b.add(this.f41728b);
            C16027b bVar = new C16027b();
            Context applicationContext = this.f41729c.getApplicationContext();
            for (Image b : this.f41730d) {
                this.f41732f.add(mo48191b(applicationContext, b).mo10843M(bVar).mo10862d0());
            }
        }
    }
}
