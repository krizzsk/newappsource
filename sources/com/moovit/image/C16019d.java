package com.moovit.image;

import a20.C13388b;
import android.content.Context;
import android.graphics.PointF;
import android.util.SparseArray;
import ce0.C21100e;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.image.model.ImageRefWithPartialParams;
import com.moovit.image.model.ImageSet;
import com.moovit.image.model.RemoteImage;
import com.moovit.image.model.RemoteImageRef;
import com.moovit.image.model.ResourceImage;
import com.moovit.image.model.ResourceImageRef;
import com.moovit.image.model.UriImage;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p810sz.C19617r;
import p977zz.C20952m0;

/* renamed from: com.moovit.image.d */
public abstract class C16019d {

    /* renamed from: i */
    public static final AtomicReference<C16019d> f41714i = new AtomicReference<>();

    /* renamed from: a */
    public final Context f41715a;

    /* renamed from: b */
    public final SparseArray<PointF> f41716b;

    /* renamed from: c */
    public final C20952m0<String> f41717c;

    /* renamed from: d */
    public final C19617r f41718d;

    /* renamed from: e */
    public final ImageSet.C16054b f41719e;

    /* renamed from: f */
    public final C19617r f41720f;

    /* renamed from: g */
    public final C13388b.C13389a f41721g;

    /* renamed from: h */
    public final C20952m0<Integer> f41722h;

    public C16019d(Context context) {
        List list;
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f41715a = context.getApplicationContext();
        C20952m0<String> m0Var = new C20952m0<>();
        this.f41717c = m0Var;
        SparseArray<PointF> sparseArray = new SparseArray<>();
        this.f41716b = sparseArray;
        Class<ResourceImage> cls = ResourceImage.class;
        Class<ResourceImageRef> cls2 = ResourceImageRef.class;
        C19617r.C19618a aVar = new C19617r.C19618a();
        ResourceImage.C16058a aVar2 = new ResourceImage.C16058a(m0Var);
        aVar.mo51969a(1, ResourceImage.class, aVar2, aVar2);
        RemoteImage.C16055a aVar3 = RemoteImage.f41817f;
        aVar.mo51969a(3, RemoteImage.class, aVar3, aVar3);
        UriImage.C16061a aVar4 = UriImage.f41823f;
        aVar.mo51969a(4, UriImage.class, aVar4, aVar4);
        C19617r b = aVar.mo51970b();
        this.f41718d = b;
        this.f41719e = new ImageSet.C16054b(b, b);
        C19617r.C19618a aVar5 = new C19617r.C19618a();
        ResourceImageRef.C16060b bVar = new ResourceImageRef.C16060b(m0Var);
        aVar5.mo51969a(1, ResourceImageRef.class, bVar, bVar);
        RemoteImageRef.C16057b bVar2 = RemoteImageRef.f41818c;
        aVar5.mo51969a(2, RemoteImageRef.class, bVar2, bVar2);
        ImageRefWithPartialParams.C16052b bVar3 = new ImageRefWithPartialParams.C16052b();
        aVar5.mo51969a(3, ImageRefWithPartialParams.class, bVar3, bVar3);
        C19617r b2 = aVar5.mo51970b();
        if (bVar3.f41812w == null) {
            bVar3.f41812w = b2;
            this.f41720f = b2;
            this.f41721g = new C13388b.C13389a(b2, b2);
            C20952m0<Integer> m0Var2 = new C20952m0<>();
            this.f41722h = m0Var2;
            mo48186b(m0Var);
            synchronized (m0Var) {
                m0Var.f52702c = true;
            }
            mo48187c(sparseArray);
            mo48188d(m0Var2);
            synchronized (m0Var2) {
                m0Var2.f52702c = true;
            }
            if (m0Var.f52700a.keySet().containsAll(m0Var2.f52701b.values())) {
                list = Collections.emptyList();
            } else {
                HashSet hashSet = new HashSet(m0Var2.f52701b.values());
                hashSet.removeAll(m0Var.f52700a.keySet());
                HashSet hashSet2 = new HashSet();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    hashSet2.add(m0Var2.mo53029c(((Integer) it.next()).intValue()));
                }
                list = hashSet2;
            }
            if (!list.isEmpty()) {
                throw new ApplicationBugException(getClass().getSimpleName() + " defines images that can't be externalized by " + C16019d.class.getSimpleName() + ": " + list);
            }
            return;
        }
        throw new ApplicationBugException("delegate coder may not be re-set");
    }

    /* renamed from: a */
    public static C16019d m40803a() {
        C16019d dVar = f41714i.get();
        if (dVar != null) {
            return dVar;
        }
        throw new ApplicationBugException("Have you initialized ImageCoders?");
    }

    /* renamed from: b */
    public abstract void mo48186b(C20952m0<String> m0Var);

    /* renamed from: c */
    public abstract void mo48187c(SparseArray<PointF> sparseArray);

    /* renamed from: d */
    public abstract void mo48188d(C20952m0<Integer> m0Var);
}
