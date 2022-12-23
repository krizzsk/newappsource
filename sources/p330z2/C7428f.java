package p330z2;

import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import je0.C23709b;
import ke0.C23761a;
import ke0.C23763b;
import ki0.C23800f;
import oe0.C24577a;
import p072e6.C4566d;
import p090g1.C4745d;
import p208p6.C6095c;
import p565io.reactivex.internal.observers.LambdaObserver;
import p565io.reactivex.internal.operators.observable.ObservableObserveOn;
import p565io.reactivex.subjects.PublishSubject;
import p870vn.C20163c;
import p870vn.C20164d;
import p870vn.C20165e;
import p870vn.C20166f;
import re0.C24795b;
import re0.C24797c;

/* renamed from: z2.f */
public final class C7428f implements C7426d, C6095c {

    /* renamed from: c */
    public static Class f22823c;

    /* renamed from: d */
    public static boolean f22824d;

    /* renamed from: e */
    public static Method f22825e;

    /* renamed from: f */
    public static boolean f22826f;

    /* renamed from: g */
    public static Method f22827g;

    /* renamed from: h */
    public static boolean f22828h;

    /* renamed from: b */
    public final Object f22829b;

    public /* synthetic */ C7428f(Object obj) {
        this.f22829b = obj;
    }

    /* renamed from: a */
    public final void mo23647a(ViewGroup viewGroup, View view) {
    }

    /* renamed from: b */
    public final C4745d mo23651b(Class cls, C20165e eVar) {
        PublishSubject<C20163c> publishSubject = ((C20164d) this.f22829b).f51174a;
        publishSubject.getClass();
        C24797c cVar = new C24797c(new C24795b(publishSubject, new C24577a.C24579b(cls)), new C24577a.C24578a(cls));
        C23763b bVar = C23761a.f60029a;
        if (bVar != null) {
            int i = C23709b.f59920a;
            if (i > 0) {
                ObservableObserveOn observableObserveOn = new ObservableObserveOn(cVar, bVar, i);
                LambdaObserver lambdaObserver = new LambdaObserver(new C20166f(eVar));
                observableObserveOn.mo53555u(lambdaObserver);
                return new C4745d((Object) lambdaObserver);
            }
            throw new IllegalArgumentException(C16759e.m42350f("bufferSize", " > 0 required but it was ", i));
        }
        throw new NullPointerException("scheduler == null");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p060d6.C4397l mo20049h(p060d6.C4397l r10, p025b6.C1492e r11) {
        /*
            r9 = this;
            b6.d<com.moovit.image.model.Image> r0 = r10.C19218b.f48818b
            java.lang.Object r11 = r11.mo5848c(r0)
            com.moovit.image.model.Image r11 = (com.moovit.image.model.Image) r11
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L_0x0018
            java.lang.String r2 = r11.f41803b
            java.lang.String r3 = "DrawableResourceImage"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0018
            r2 = 1
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            r3 = 0
            if (r2 != 0) goto L_0x001d
            return r3
        L_0x001d:
            java.lang.Object r10 = r10.get()
            android.graphics.drawable.Drawable r10 = (android.graphics.drawable.Drawable) r10
            java.lang.Object r2 = r9.f22829b
            e6.d r2 = (p072e6.C4566d) r2
            android.graphics.drawable.Drawable r10 = r10.getCurrent()
            boolean r4 = r10 instanceof android.graphics.drawable.BitmapDrawable
            if (r4 == 0) goto L_0x0036
            android.graphics.drawable.BitmapDrawable r10 = (android.graphics.drawable.BitmapDrawable) r10
            android.graphics.Bitmap r3 = r10.getBitmap()
            goto L_0x008a
        L_0x0036:
            boolean r4 = r10 instanceof android.graphics.drawable.Animatable
            if (r4 != 0) goto L_0x008a
            int r4 = r10.getIntrinsicWidth()
            if (r4 > 0) goto L_0x0044
            r10.toString()
            goto L_0x008b
        L_0x0044:
            int r4 = r10.getIntrinsicHeight()
            if (r4 > 0) goto L_0x004e
            r10.toString()
            goto L_0x008b
        L_0x004e:
            int r4 = r10.getIntrinsicWidth()
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 <= 0) goto L_0x005b
            int r4 = r10.getIntrinsicWidth()
            goto L_0x005d
        L_0x005b:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x005d:
            int r6 = r10.getIntrinsicHeight()
            if (r6 <= 0) goto L_0x0067
            int r5 = r10.getIntrinsicHeight()
        L_0x0067:
            java.util.concurrent.locks.Lock r6 = p146k6.C5516u.f18075d
            r6.lock()
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = r2.mo20087e(r4, r5, r7)
            android.graphics.Canvas r8 = new android.graphics.Canvas     // Catch:{ all -> 0x0085 }
            r8.<init>(r7)     // Catch:{ all -> 0x0085 }
            r10.setBounds(r1, r1, r4, r5)     // Catch:{ all -> 0x0085 }
            r10.draw(r8)     // Catch:{ all -> 0x0085 }
            r8.setBitmap(r3)     // Catch:{ all -> 0x0085 }
            r6.unlock()
            r3 = r7
            goto L_0x008b
        L_0x0085:
            r10 = move-exception
            r6.unlock()
            throw r10
        L_0x008a:
            r0 = 0
        L_0x008b:
            if (r0 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            z10.e$a r2 = z10.C20800e.f52497a
        L_0x0090:
            k6.d r10 = p146k6.C5498d.m13681c(r3, r2)
            java.lang.Object r11 = r11.f41804c
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            com.moovit.image.d r0 = com.moovit.image.C16019d.m40803a()
            android.util.SparseArray<android.graphics.PointF> r0 = r0.f41716b
            java.lang.Object r11 = r0.get(r11)
            android.graphics.PointF r11 = (android.graphics.PointF) r11
            v10.c r10 = v10.C20067c.m47570c(r10, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p330z2.C7428f.mo20049h(d6.l, b6.e):d6.l");
    }

    public final void setVisibility(int i) {
        ((View) this.f22829b).setVisibility(i);
    }

    public /* synthetic */ C7428f() {
        this.f22829b = new C23800f(TimeUnit.MINUTES);
    }

    public /* synthetic */ C7428f(C4566d dVar) {
        this.f22829b = dVar;
    }
}
