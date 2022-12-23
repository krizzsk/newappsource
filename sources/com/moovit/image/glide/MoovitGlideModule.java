package com.moovit.image.glide;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.net.Uri;
import com.bumptech.glide.C2116c;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.resource.bitmap.C2205a;
import com.bumptech.glide.load.resource.bitmap.C2212c;
import com.google.android.play.core.assetpacks.C14291m0;
import com.moovit.image.glide.data.ImageData;
import com.moovit.image.model.QrCodeImage;
import com.moovit.image.model.RemoteImage;
import com.moovit.image.model.ResourceImage;
import com.moovit.image.model.UriImage;
import com.moovit.image.model.ViewImage;
import java.io.File;
import java.io.InputStream;
import mf0.C24368m;
import p072e6.C4564b;
import p072e6.C4566d;
import p108h6.C5091f;
import p108h6.C5125u;
import p234r6.C6254a;
import p247s6.C6475a;
import p247s6.C6481e;
import p330z2.C7428f;
import u10.C19858a;
import u10.C19860b;
import u10.C19862c;
import u10.C19864d;
import u10.C19866e;
import u10.C19868f;
import u10.C19870g;
import u10.C19872h;
import v10.C20065a;
import v10.C20066b;
import v10.C20068d;
import v10.C20069e;
import v10.C20071f;
import v10.C20072g;
import v10.C20073h;
import v10.C20075i;
import v10.C20077j;
import v10.C20079k;
import v10.C20081l;
import w10.C20268a;
import w10.C20270c;
import w10.C20272e;
import x10.C20442a;
import x10.C20444b;
import x10.C20446c;
import z10.C20797b;
import z10.C20798c;
import z10.C20799d;
import z10.C20804h;

public class MoovitGlideModule extends C6254a {
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00fc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10823a(android.content.Context r19, com.bumptech.glide.C2118d r20) {
        /*
            r18 = this;
            r1 = r20
            br.f r2 = new br.f
            r0 = 9
            r2.<init>(r0)
            r3 = 0
            java.lang.Class<g6.a> r0 = p095g6.C4832a.class
            java.lang.Class[] r0 = r0.getDeclaredClasses()     // Catch:{ all -> 0x007f }
            int r4 = r0.length     // Catch:{ all -> 0x007f }
            r5 = 0
        L_0x0012:
            if (r5 >= r4) goto L_0x0022
            r6 = r0[r5]     // Catch:{ all -> 0x007f }
            java.lang.Class<java.util.concurrent.ThreadFactory> r7 = java.util.concurrent.ThreadFactory.class
            boolean r7 = r7.isAssignableFrom(r6)     // Catch:{ all -> 0x007f }
            if (r7 == 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            int r5 = r5 + 1
            goto L_0x0012
        L_0x0022:
            r6 = 0
        L_0x0023:
            if (r6 == 0) goto L_0x008e
            r0 = 3
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ all -> 0x007f }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r3] = r5     // Catch:{ all -> 0x007f }
            java.lang.Class<g6.a$c> r5 = p095g6.C4832a.C4837c.class
            r7 = 1
            r4[r7] = r5     // Catch:{ all -> 0x007f }
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x007f }
            r8 = 2
            r4[r8] = r5     // Catch:{ all -> 0x007f }
            java.lang.reflect.Constructor r4 = r6.getDeclaredConstructor(r4)     // Catch:{ all -> 0x007f }
            r4.setAccessible(r7)     // Catch:{ all -> 0x007f }
            java.lang.Class<g6.a> r5 = p095g6.C4832a.class
            java.lang.Class[] r6 = new java.lang.Class[r7]     // Catch:{ all -> 0x007f }
            java.lang.Class<java.util.concurrent.ExecutorService> r9 = java.util.concurrent.ExecutorService.class
            r6[r3] = r9     // Catch:{ all -> 0x007f }
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r6)     // Catch:{ all -> 0x007f }
            r5.setAccessible(r7)     // Catch:{ all -> 0x007f }
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ all -> 0x007f }
            java.util.concurrent.ThreadPoolExecutor r17 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x007f }
            r10 = 0
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = 10
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x007f }
            java.util.concurrent.SynchronousQueue r15 = new java.util.concurrent.SynchronousQueue     // Catch:{ all -> 0x007f }
            r15.<init>()     // Catch:{ all -> 0x007f }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x007f }
            java.lang.String r9 = "disk-cache-unlimited"
            r0[r3] = r9     // Catch:{ all -> 0x007f }
            r0[r7] = r2     // Catch:{ all -> 0x007f }
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x007f }
            r0[r8] = r7     // Catch:{ all -> 0x007f }
            java.lang.Object r0 = r4.newInstance(r0)     // Catch:{ all -> 0x007f }
            r16 = r0
            java.util.concurrent.ThreadFactory r16 = (java.util.concurrent.ThreadFactory) r16     // Catch:{ all -> 0x007f }
            r9 = r17
            r9.<init>(r10, r11, r12, r14, r15, r16)     // Catch:{ all -> 0x007f }
            r6[r3] = r17     // Catch:{ all -> 0x007f }
            java.lang.Object r0 = r5.newInstance(r6)     // Catch:{ all -> 0x007f }
            g6.a r0 = (p095g6.C4832a) r0     // Catch:{ all -> 0x007f }
            goto L_0x0092
        L_0x007f:
            r0 = move-exception
            de.f r4 = p435de.C16596f.m42113a()
            com.bumptech.glide.load.engine.GlideException r5 = new com.bumptech.glide.load.engine.GlideException
            java.lang.String r6 = "Failed to construct GlideExecutor for disk cache"
            r5.<init>((java.lang.String) r6, (java.lang.Throwable) r0)
            r4.mo49364c(r5)
        L_0x008e:
            g6.a r0 = p095g6.C4832a.m12161a()
        L_0x0092:
            r10.a r4 = r10.C19217a.f48815b
            android.content.res.Resources r5 = r19.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            r4.mo51619a(r5)
            r4 = 6
            r1.f6901l = r4
            t6.g r4 = new t6.g
            r4.<init>()
            r10.f r5 = new r10.f
            r5.<init>()
            t6.a r4 = r4.mo22726i(r5)
            t6.g r4 = (p260t6.C6602g) r4
            com.bumptech.glide.e r5 = new com.bumptech.glide.e
            r5.<init>(r4)
            r1.f6902m = r5
            r1.f6897h = r0
            int r0 = p095g6.C4832a.f16251d
            g6.a$a r0 = new g6.a$a
            r0.<init>()
            int r4 = p095g6.C4832a.f16251d
            if (r4 != 0) goto L_0x00d5
            r4 = 4
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()
            int r5 = r5.availableProcessors()
            int r4 = java.lang.Math.min(r4, r5)
            p095g6.C4832a.f16251d = r4
        L_0x00d5:
            int r7 = p095g6.C4832a.f16251d
            java.lang.String r4 = "source"
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x00fc
            java.util.concurrent.ThreadPoolExecutor r13 = new java.util.concurrent.ThreadPoolExecutor
            r8 = 0
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.PriorityBlockingQueue r11 = new java.util.concurrent.PriorityBlockingQueue
            r11.<init>()
            g6.a$b r12 = new g6.a$b
            r12.<init>(r0, r4, r2, r3)
            r5 = r13
            r6 = r7
            r5.<init>(r6, r7, r8, r10, r11, r12)
            g6.a r0 = new g6.a
            r0.<init>(r13)
            r1.f6896g = r0
            return
        L_0x00fc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Name must be non-null and non-empty, but given: "
            java.lang.String r1 = p379.C25541a.m63881k(r1, r4)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.image.glide.MoovitGlideModule.mo10823a(android.content.Context, com.bumptech.glide.d):void");
    }

    /* renamed from: b */
    public final void mo10824b(Context context, C2116c cVar, Registry registry) {
        Class<C20268a> cls = C20268a.class;
        Class<C20065a> cls2 = C20065a.class;
        Class<ImageData> cls3 = ImageData.class;
        Resources resources = context.getResources();
        C4566d dVar = cVar.f6882c;
        C4564b bVar = cVar.f6886g;
        C2205a aVar = new C2205a(registry.mo10830d(), resources.getDisplayMetrics(), dVar, bVar);
        C20798c cVar2 = new C20798c(bVar, aVar);
        C20804h hVar = new C20804h(resources, dVar, aVar);
        C20072g gVar = new C20072g(dVar);
        C20069e eVar = new C20069e(resources, aVar);
        C20071f fVar = new C20071f(dVar);
        registry.mo10833g(cls3, cls, new C20270c(hVar));
        registry.mo10833g(cls3, cls2, new C20073h(context, dVar, cVar2));
        registry.mo10833g(cls3, cls2, new C20066b(eVar));
        registry.mo10833g(cls3, Bitmap.class, eVar);
        registry.mo10833g(cls3, Bitmap.class, new C20075i(context, dVar, cVar2));
        registry.mo10833g(cls3, NinePatchDrawable.class, new C20272e(hVar));
        registry.mo10833g(ResourceImage.class, cls2, new C20077j(context, dVar, cVar2));
        registry.mo10833g(ResourceImage.class, Bitmap.class, new C20079k(context, dVar, cVar2));
        registry.mo10833g(ViewImage.class, Bitmap.class, gVar);
        registry.mo10833g(ViewImage.class, cls2, new C20068d(gVar));
        registry.mo10833g(InputStream.class, cls2, new C20081l(new C2212c(bVar, aVar)));
        registry.mo10833g(QrCodeImage.class, Bitmap.class, fVar);
        C14291m0 m0Var = new C14291m0(new C20797b(new C20799d(bVar)));
        C6481e eVar2 = registry.f6872d;
        synchronized (eVar2) {
            eVar2.f20221a.add(0, new C6481e.C6482a(cls2, m0Var));
        }
        registry.mo10834h(RemoteImage.class, cls3, new C19862c.C19863a(context));
        registry.mo10834h(ResourceImage.class, Uri.class, new C19864d.C19865a(resources));
        registry.mo10834h(UriImage.class, InputStream.class, new C19872h.C19873a());
        registry.mo10834h(ViewImage.class, ViewImage.class, new C19870g.C19871a());
        registry.mo10834h(ResourceImage.class, ResourceImage.class, new C19868f.C19869a(resources));
        registry.mo10834h(cls3, cls3, new C19866e.C19867a());
        registry.mo10834h(File.class, cls3, new C19858a.C19859a());
        registry.mo10834h(C5091f.class, InputStream.class, new C19860b.C19861a());
        registry.mo10834h(QrCodeImage.class, QrCodeImage.class, C5125u.C5126a.f17137a);
        C24368m mVar = new C24368m();
        C6475a aVar2 = registry.f6870b;
        synchronized (aVar2) {
            aVar2.f20208a.add(0, new C6475a.C6476a(cls3, mVar));
        }
        registry.mo10836j(Drawable.class, cls, new C24368m());
        registry.mo10836j(Drawable.class, cls2, new C7428f(dVar));
        registry.mo10836j(cls2, cls, new C20442a(resources));
        registry.mo10836j(cls2, BitmapDrawable.class, new C20444b(resources));
        registry.mo10836j(cls2, Bitmap.class, new C20446c());
    }
}
