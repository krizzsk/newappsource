package com.fyber.inneractive.sdk.player.controller;

import android.animation.ObjectAnimator;
import android.app.Application;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.C2524R;
import com.fyber.inneractive.sdk.config.C2619a0;
import com.fyber.inneractive.sdk.config.C2628d0;
import com.fyber.inneractive.sdk.config.C2667h;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.config.global.features.C2641b;
import com.fyber.inneractive.sdk.config.global.features.C2649j;
import com.fyber.inneractive.sdk.measurement.C2823g;
import com.fyber.inneractive.sdk.model.vast.C2834a;
import com.fyber.inneractive.sdk.model.vast.C2836c;
import com.fyber.inneractive.sdk.model.vast.C2840g;
import com.fyber.inneractive.sdk.model.vast.C2850q;
import com.fyber.inneractive.sdk.p051ui.IAsmoothProgressBar;
import com.fyber.inneractive.sdk.player.C2948c;
import com.fyber.inneractive.sdk.player.C3423f;
import com.fyber.inneractive.sdk.player.controller.C2997g;
import com.fyber.inneractive.sdk.player.controller.C3020s;
import com.fyber.inneractive.sdk.player.enums.C3025b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.p050ui.C3449a;
import com.fyber.inneractive.sdk.player.p050ui.C3450b;
import com.fyber.inneractive.sdk.player.p050ui.C3453e;
import com.fyber.inneractive.sdk.player.p050ui.C3456h;
import com.fyber.inneractive.sdk.player.p050ui.C3457i;
import com.fyber.inneractive.sdk.player.p050ui.C3462j;
import com.fyber.inneractive.sdk.player.p050ui.C3463k;
import com.fyber.inneractive.sdk.response.C3652i;
import com.fyber.inneractive.sdk.util.C3670b;
import com.fyber.inneractive.sdk.util.C3674c;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.C3721p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.play.core.appupdate.C14226d;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.List;
import p723ph.C18923a;

/* renamed from: com.fyber.inneractive.sdk.player.controller.k */
public abstract class C3009k<ListenerT extends C3020s> implements C2989b<ListenerT>, C2997g.C3003f, C2997g.C3002e, C3456h {

    /* renamed from: a */
    public C2948c f10287a;

    /* renamed from: b */
    public C2703z f10288b;

    /* renamed from: c */
    public C2666s f10289c;

    /* renamed from: d */
    public C3457i f10290d;

    /* renamed from: e */
    public C2997g.C3004g f10291e;

    /* renamed from: f */
    public int f10292f;

    /* renamed from: g */
    public ListenerT f10293g;

    /* renamed from: h */
    public boolean f10294h;

    /* renamed from: i */
    public float f10295i;

    /* renamed from: j */
    public Runnable f10296j;

    /* renamed from: k */
    public boolean f10297k;

    /* renamed from: l */
    public boolean f10298l;

    /* renamed from: m */
    public Application.ActivityLifecycleCallbacks f10299m;

    /* renamed from: n */
    public boolean f10300n;

    /* renamed from: o */
    public boolean f10301o;

    /* renamed from: p */
    public Bitmap f10302p;

    /* renamed from: q */
    public AsyncTask<?, ?, ?> f10303q;

    /* renamed from: r */
    public boolean f10304r;

    /* renamed from: s */
    public boolean f10305s;

    /* renamed from: t */
    public boolean f10306t;

    /* renamed from: u */
    public boolean f10307u;

    /* renamed from: v */
    public boolean f10308v;

    /* renamed from: w */
    public C3453e f10309w;

    /* renamed from: x */
    public Skip f10310x;

    /* renamed from: com.fyber.inneractive.sdk.player.controller.k$a */
    public class C3010a extends GestureDetector.SimpleOnGestureListener {
        public C3010a(C3009k kVar) {
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.k$b */
    public class C3011b extends AsyncTask<Integer, Void, Bitmap> {
        public C3011b() {
        }

        public Object doInBackground(Object[] objArr) {
            Integer[] numArr = (Integer[]) objArr;
            int intValue = numArr[0].intValue();
            int intValue2 = numArr[1].intValue();
            C3009k.this.getClass();
            Application application = C3707l.f12893a;
            Bitmap bitmap = null;
            if (!(application == null || application.getResources() == null || application.getResources().getDisplayMetrics() == null)) {
                DisplayMetrics displayMetrics = application.getResources().getDisplayMetrics();
                try {
                    bitmap = Bitmap.createBitmap(intValue, intValue2, Bitmap.Config.ARGB_8888);
                    if (bitmap != null) {
                        bitmap.setDensity(displayMetrics.densityDpi);
                    }
                } catch (Throwable unused) {
                }
            }
            return bitmap;
        }

        public void onPostExecute(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            super.onPostExecute(bitmap);
            C3009k kVar = C3009k.this;
            kVar.f10302p = bitmap;
            kVar.f10303q = null;
        }
    }

    public C3009k(C2948c cVar, C3457i iVar, C2703z zVar, C2666s sVar, boolean z) {
        this(cVar, iVar, zVar, sVar, z, (Skip) null);
    }

    /* renamed from: a */
    public void mo13825a(ListenerT listenert) {
        this.f10293g = listenert;
    }

    /* renamed from: a */
    public abstract void mo13839a(C3721p0 p0Var);

    /* renamed from: a */
    public void mo13741a(Exception exc) {
    }

    /* renamed from: b */
    public void mo13841b() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        if ((r2 != null && r2.getVisibility() == 0 && r0.f12341o.isEnabled()) == false) goto L_0x002f;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo13828c() {
        /*
            r5 = this;
            com.fyber.inneractive.sdk.player.c r0 = r5.f10287a
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r2 = r5.f10294h
            r3 = 1
            if (r2 != 0) goto L_0x0050
            com.fyber.inneractive.sdk.player.controller.g r0 = r0.f10083b
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0050
            com.fyber.inneractive.sdk.player.ui.i r0 = r5.f10290d
            if (r0 == 0) goto L_0x002f
            android.widget.TextView r2 = r0.f12341o
            if (r2 == 0) goto L_0x002c
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x002c
            android.widget.TextView r0 = r0.f12341o
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x002c
            r0 = 1
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            if (r0 != 0) goto L_0x0050
        L_0x002f:
            com.fyber.inneractive.sdk.player.c r0 = r5.f10287a
            com.fyber.inneractive.sdk.player.controller.g r0 = r0.f10083b
            int r0 = r0.mo13814d()
            com.fyber.inneractive.sdk.player.c r2 = r5.f10287a
            r4 = r2
            com.fyber.inneractive.sdk.player.f r4 = (com.fyber.inneractive.sdk.player.C3423f) r4
            com.fyber.inneractive.sdk.config.z r4 = r4.f12237A
            int r2 = com.fyber.inneractive.sdk.player.C2948c.m7271a((com.fyber.inneractive.sdk.player.C2948c) r2)
            boolean r0 = com.fyber.inneractive.sdk.player.C2948c.m7273a((int) r0, (com.fyber.inneractive.sdk.config.C2703z) r4, (int) r2)
            if (r0 == 0) goto L_0x0051
            boolean r0 = r5.f10294h
            if (r0 != 0) goto L_0x0051
            int r0 = r5.f10292f
            if (r0 != 0) goto L_0x0051
        L_0x0050:
            r1 = 1
        L_0x0051:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C3009k.mo13828c():boolean");
    }

    /* renamed from: d */
    public void mo13829d(boolean z) {
        IAlog.m9902a("%sinitUI", IAlog.m9899a((Object) this));
        C2948c cVar = this.f10287a;
        if (cVar != null && cVar.f10083b != null) {
            this.f10290d.setUnitConfig(this.f10288b);
            C3457i iVar = this.f10290d;
            int h = this.f10287a.f10083b.mo13819h();
            int g = this.f10287a.f10083b.mo13818g();
            boolean z2 = this.f10300n;
            iVar.f12343q = h;
            iVar.f12344r = g;
            iVar.f12345s = z2;
            if (this.f10287a.f10083b.mo13819h() > 0 && this.f10287a.f10083b.mo13818g() > 0) {
                mo13882a(this.f10287a.f10083b.mo13819h(), this.f10287a.f10083b.mo13818g());
            }
            if (mo13849w()) {
                this.f10292f = mo13844n();
            } else {
                this.f10290d.mo14698d(false);
            }
            if (!z) {
                mo13863a(this.f10287a.f10083b.mo13813c());
                mo13884a(this.f10287a.f10083b.f10260e, false);
            }
            mo13898z();
        }
    }

    public void destroy() {
        C2997g gVar;
        Application application;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f10299m;
        if (!(activityLifecycleCallbacks == null || (application = C3707l.f12893a) == null)) {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        IAlog.m9902a("%sdestroy called", IAlog.m9899a((Object) this));
        C2948c cVar = this.f10287a;
        if (!(cVar == null || (gVar = cVar.f10083b) == null)) {
            List<C2997g.C3003f> list = gVar.f10257b;
            if (list != null) {
                list.remove(this);
            }
            List<C2997g.C3002e> list2 = this.f10287a.f10083b.f10258c;
            if (list2 != null) {
                list2.remove(this);
            }
        }
        mo13878j();
        mo13891h();
        AsyncTask<?, ?, ?> asyncTask = this.f10303q;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
        this.f10293g = null;
    }

    /* renamed from: e */
    public void mo13865e() {
        if (this.f10304r && !this.f10298l) {
            this.f10298l = true;
            this.f10290d.mo14695b(false);
        }
    }

    /* renamed from: e */
    public void mo13747e(boolean z) {
    }

    /* renamed from: f */
    public void mo13888f(boolean z) {
        C2997g gVar;
        C2948c cVar = this.f10287a;
        if (!(cVar == null || (gVar = cVar.f10083b) == null)) {
            gVar.mo13812b(z);
        }
        this.f10290d.setMuteButtonState(true);
    }

    /* renamed from: g */
    public void mo13890g() {
        C2997g gVar;
        C2948c cVar = this.f10287a;
        if (cVar != null && (gVar = cVar.f10083b) != null) {
            List<C2997g.C3003f> list = gVar.f10257b;
            if (list != null && !list.contains(this)) {
                gVar.f10257b.add(this);
            }
            C2997g gVar2 = this.f10287a.f10083b;
            List<C2997g.C3002e> list2 = gVar2.f10258c;
            if (list2 != null && !list2.contains(this)) {
                gVar2.f10258c.add(this);
            }
        }
    }

    /* renamed from: h */
    public void mo13877h(boolean z) {
        C2997g gVar;
        C2948c cVar = this.f10287a;
        if (cVar == null) {
            return;
        }
        if (!cVar.f10092k) {
            mo13850y();
        } else if (!z || (gVar = cVar.f10083b) == null) {
            cVar.mo13749g();
        } else {
            gVar.mo13806a(0, true);
        }
    }

    /* renamed from: i */
    public void mo13892i(boolean z) {
        C2997g gVar;
        C2948c cVar = this.f10287a;
        if (!(cVar == null || (gVar = cVar.f10083b) == null)) {
            gVar.mo13815d(z);
        }
        this.f10290d.setMuteButtonState(false);
    }

    /* renamed from: j */
    public void mo13878j() {
        boolean z;
        Bitmap g;
        if (this.f10309w != null) {
            IAlog.m9902a("%sdestroyTextureView", IAlog.m9899a((Object) this));
            if (this.f10302p != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && (g = mo13889g(false)) != null) {
                this.f10290d.setLastFrameBitmap(g);
                this.f10290d.mo14695b(true);
            }
        }
    }

    /* renamed from: k */
    public void mo13893k() {
        C2641b bVar;
        if (mo13849w()) {
            C2666s sVar = this.f10289c;
            String str = null;
            if (sVar != null) {
                bVar = (C2641b) sVar.mo13264a(C2641b.class);
            } else {
                bVar = null;
            }
            if (bVar != null) {
                bVar.mo13235e(IAConfigManager.f9202J.f9228p);
                C2834a aVar = bVar.f9301e;
                if (aVar != null && aVar.f9736d) {
                    str = aVar.f9734b;
                }
            }
            if (str != null) {
                this.f10290d.setSkipText(str);
            } else {
                C3457i iVar = this.f10290d;
                iVar.setSkipText(iVar.getContext().getString(C2524R.string.ia_video_skip_text));
            }
            TextView textView = this.f10290d.f12341o;
            if (textView != null) {
                textView.setEnabled(true);
            }
            this.f10292f = 0;
            ListenerT listenert = this.f10293g;
            if (listenert != null) {
                listenert.mo13944e();
            }
        }
    }

    /* renamed from: l */
    public abstract int mo13843l();

    /* renamed from: m */
    public final float mo13894m() {
        try {
            return (float) ((AudioManager) this.f10290d.getContext().getSystemService("audio")).getStreamVolume(3);
        } catch (Throwable unused) {
            return 1.0f;
        }
    }

    /* renamed from: n */
    public abstract int mo13844n();

    /* renamed from: o */
    public boolean mo13895o() {
        C2997g gVar;
        C2948c cVar = this.f10287a;
        if (cVar == null || (gVar = cVar.f10083b) == null) {
            return false;
        }
        if (!gVar.mo13820i() && mo13894m() != BitmapDescriptorFactory.HUE_RED) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public abstract void mo13845p();

    public void pauseVideo() {
        C2997g gVar;
        C2948c cVar = this.f10287a;
        if (cVar != null && (gVar = cVar.f10083b) != null) {
            if (gVar.f10260e != C3025b.Paused) {
                IAlog.m9902a("%spauseVideo %s", IAlog.m9899a((Object) this), this.f10290d);
                TextureView textureView = this.f10287a.f10083b.f10265j;
                if (textureView != null && textureView.getParent() != null && textureView.getParent().equals(this.f10290d.getTextureHost())) {
                    this.f10287a.f10083b.mo13821k();
                    return;
                }
                return;
            }
            IAlog.m9902a("%spauseVideo called in bad state! %s", IAlog.m9899a((Object) this), this.f10287a.f10083b.f10260e);
        }
    }

    /* renamed from: q */
    public void mo13896q() {
        if (!this.f10290d.mo14699d()) {
            this.f10290d.mo14693a(false);
            mo13891h();
            mo13850y();
            this.f10297k = false;
            this.f10294h = true;
        }
    }

    /* renamed from: r */
    public abstract void mo13846r();

    /* renamed from: s */
    public void mo13879s() {
        mo13891h();
        this.f10290d.mo14693a(false);
        mo13850y();
    }

    /* renamed from: t */
    public abstract void mo13847t();

    /* renamed from: u */
    public void mo13880u() {
    }

    /* renamed from: v */
    public void mo13848v() {
        C2997g gVar;
        this.f10290d.mo14693a(false);
        this.f10290d.mo14697c(false);
        C3457i iVar = this.f10290d;
        C3450b bVar = new C3450b();
        bVar.f12306b = false;
        iVar.mo14691a(new C3449a(bVar));
        IAsmoothProgressBar iAsmoothProgressBar = this.f10290d.f12348v;
        if (iAsmoothProgressBar != null) {
            iAsmoothProgressBar.setVisibility(0);
        }
        ImageView imageView = this.f10290d.f12346t;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        TextView textView = this.f10290d.f12340n;
        if (textView != null) {
            textView.setVisibility(0);
        }
        mo13891h();
        if (this.f10287a != null && mo13849w() && !this.f10294h) {
            int d = this.f10287a.f10083b.mo13814d();
            C2948c cVar = this.f10287a;
            if (C2948c.m7273a(d, ((C3423f) cVar).f12237A, C2948c.m7271a(cVar))) {
                if (this.f10292f <= 0) {
                    this.f10290d.mo14698d(true);
                    mo13893k();
                } else {
                    C2948c cVar2 = this.f10287a;
                    if (cVar2 != null && (gVar = cVar2.f10083b) != null && this.f10292f >= gVar.mo13814d() / 1000) {
                        this.f10290d.mo14698d(false);
                    } else if (!this.f10305s) {
                        this.f10290d.mo14698d(true);
                        mo13887c(this.f10292f);
                        this.f10305s = true;
                    }
                }
            }
        }
        ListenerT listenert = this.f10293g;
        if (listenert != null && !this.f10297k) {
            this.f10297k = true;
            listenert.mo13949l();
        }
        this.f10301o = false;
        this.f10306t = false;
    }

    /* renamed from: w */
    public abstract boolean mo13849w();

    /* renamed from: x */
    public void mo13897x() {
        C2649j jVar;
        C2641b bVar;
        boolean z;
        C2666s sVar = this.f10289c;
        String str = null;
        if (sVar != null) {
            jVar = (C2649j) sVar.mo13264a(C2649j.class);
        } else {
            jVar = null;
        }
        C2666s sVar2 = this.f10289c;
        if (sVar2 != null) {
            bVar = (C2641b) sVar2.mo13264a(C2641b.class);
        } else {
            bVar = null;
        }
        boolean z2 = true;
        if (jVar != null) {
            z2 = jVar.mo13239a("show_cta", true);
            z = jVar.mo13246c();
        } else {
            z = false;
        }
        if (bVar != null) {
            bVar.mo13235e(IAConfigManager.f9202J.f9228p);
            C2834a aVar = bVar.f9301e;
            if (aVar != null && aVar.f9736d) {
                str = aVar.f9733a;
            }
        }
        this.f10290d.mo14694a(z2, z, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [com.fyber.inneractive.sdk.config.global.features.e] */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13850y() {
        /*
            r13 = this;
            com.fyber.inneractive.sdk.player.c r0 = r13.f10287a
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x003e
            com.fyber.inneractive.sdk.player.controller.g r0 = r0.f10083b
            if (r0 == 0) goto L_0x0015
            com.fyber.inneractive.sdk.player.enums.b r0 = r0.f10260e
            com.fyber.inneractive.sdk.player.enums.b r4 = com.fyber.inneractive.sdk.player.enums.C3025b.Completed
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0019
        L_0x0015:
            boolean r0 = r13.f10306t
            if (r0 == 0) goto L_0x003e
        L_0x0019:
            com.fyber.inneractive.sdk.player.c r0 = r13.f10287a
            com.fyber.inneractive.sdk.measurement.g r0 = r0.f10090i
            if (r0 == 0) goto L_0x003e
            oh.b r4 = r0.f9690a
            if (r4 == 0) goto L_0x0038
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r5 = "OMVideo"
            r4[r3] = r5
            java.lang.String r5 = "%s destroy"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r5, r4)
            oh.b r4 = r0.f9690a     // Catch:{ all -> 0x0034 }
            r4.mo51250c()     // Catch:{ all -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r4 = move-exception
            r0.mo13612a((java.lang.Throwable) r4)
        L_0x0038:
            r0.f9691b = r2
            r0.f9690a = r2
            r0.f9692c = r2
        L_0x003e:
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.f9202J
            com.fyber.inneractive.sdk.config.i r4 = r0.f9234v
            com.fyber.inneractive.sdk.config.h r4 = r4.f9337b
            java.lang.String r5 = "endcard"
            com.fyber.inneractive.sdk.config.f r4 = r4.mo13272a((java.lang.String) r5)
            java.lang.String r5 = "dsos"
            boolean r4 = r4.mo13228a(r5, r3)
            com.fyber.inneractive.sdk.player.c r5 = r13.f10287a
            if (r5 == 0) goto L_0x0062
            com.fyber.inneractive.sdk.player.controller.g r5 = r5.f10083b
            if (r5 == 0) goto L_0x0062
            com.fyber.inneractive.sdk.player.enums.b r5 = r5.f10260e
            com.fyber.inneractive.sdk.player.enums.b r6 = com.fyber.inneractive.sdk.player.enums.C3025b.Completed
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x006c
        L_0x0062:
            boolean r5 = r13.f10306t
            if (r5 == 0) goto L_0x0068
            if (r4 == 0) goto L_0x006c
        L_0x0068:
            boolean r6 = r13.f10307u
            if (r6 == 0) goto L_0x02a0
        L_0x006c:
            com.fyber.inneractive.sdk.player.c r4 = r13.f10287a
            if (r4 == 0) goto L_0x0075
            android.view.View r4 = r4.mo13745c()
            goto L_0x0076
        L_0x0075:
            r4 = r2
        L_0x0076:
            com.fyber.inneractive.sdk.player.ui.i r5 = r13.f10290d
            r5.mo14698d(r3)
            android.widget.ImageView r6 = r5.f12346t
            r7 = 4
            if (r6 == 0) goto L_0x0083
            r6.setVisibility(r7)
        L_0x0083:
            com.fyber.inneractive.sdk.ui.IAsmoothProgressBar r6 = r5.f12348v
            if (r6 == 0) goto L_0x008a
            r6.setVisibility(r7)
        L_0x008a:
            android.widget.TextView r6 = r5.f12340n
            if (r6 == 0) goto L_0x0091
            r6.setVisibility(r7)
        L_0x0091:
            r5.mo14694a((boolean) r3, (boolean) r3, (java.lang.String) r2)
            android.widget.ImageView r5 = r5.f12347u
            if (r5 == 0) goto L_0x009b
            r5.setVisibility(r7)
        L_0x009b:
            com.fyber.inneractive.sdk.config.global.s r5 = r13.f10289c
            if (r5 == 0) goto L_0x00a8
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.j> r6 = com.fyber.inneractive.sdk.config.global.features.C2649j.class
            com.fyber.inneractive.sdk.config.global.features.e r5 = r5.mo13264a(r6)
            com.fyber.inneractive.sdk.config.global.features.j r5 = (com.fyber.inneractive.sdk.config.global.features.C2649j) r5
            goto L_0x00a9
        L_0x00a8:
            r5 = r2
        L_0x00a9:
            com.fyber.inneractive.sdk.config.global.s r6 = r13.f10289c
            if (r6 == 0) goto L_0x00b6
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.b> r8 = com.fyber.inneractive.sdk.config.global.features.C2641b.class
            com.fyber.inneractive.sdk.config.global.features.e r6 = r6.mo13264a(r8)
            com.fyber.inneractive.sdk.config.global.features.b r6 = (com.fyber.inneractive.sdk.config.global.features.C2641b) r6
            goto L_0x00b7
        L_0x00b6:
            r6 = r2
        L_0x00b7:
            r8 = 500(0x1f4, float:7.0E-43)
            r9 = 10
            java.lang.String r10 = "autoClickDelay"
            java.lang.String r11 = "shouldEnableEndCardAutoClick"
            r12 = 3
            if (r4 == 0) goto L_0x01c6
            boolean r0 = r4 instanceof com.fyber.inneractive.sdk.web.C3762c
            if (r0 == 0) goto L_0x010d
            com.fyber.inneractive.sdk.player.c r0 = r13.f10287a
            com.fyber.inneractive.sdk.player.controller.c r0 = r0.mo13746d()
            com.fyber.inneractive.sdk.player.controller.n r6 = new com.fyber.inneractive.sdk.player.controller.n
            r6.<init>(r13)
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r0 = r0.f10223a
            if (r0 == 0) goto L_0x00d8
            r0.setListener(r6)
        L_0x00d8:
            com.fyber.inneractive.sdk.player.c r0 = r13.f10287a
            com.fyber.inneractive.sdk.player.controller.c r0 = r0.mo13746d()
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r6 = r0.f10223a
            if (r6 == 0) goto L_0x00ea
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r0 = r0.f10225c
            com.fyber.inneractive.sdk.util.C3683e0.m9926a(r0)
            r6.mo15326m()
        L_0x00ea:
            com.fyber.inneractive.sdk.player.c r0 = r13.f10287a
            com.fyber.inneractive.sdk.player.controller.c r0 = r0.mo13746d()
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r0 = r0.f10223a
            if (r0 == 0) goto L_0x00fc
            boolean r0 = r0.mo15461h()
            if (r0 == 0) goto L_0x00fc
            r0 = 1
            goto L_0x00fd
        L_0x00fc:
            r0 = 0
        L_0x00fd:
            if (r0 == 0) goto L_0x0100
            return
        L_0x0100:
            com.fyber.inneractive.sdk.player.c r0 = r13.f10287a
            com.fyber.inneractive.sdk.player.controller.c r0 = r0.mo13746d()
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r0 = r0.f10223a
            if (r0 == 0) goto L_0x010d
            r0.mo15324e(r1)
        L_0x010d:
            r13.mo13878j()
            com.fyber.inneractive.sdk.player.ui.i r0 = r13.f10290d
            r0.mo14695b(r3)
            com.fyber.inneractive.sdk.player.ui.i r0 = r13.f10290d
            android.view.ViewGroup r0 = r0.f12336j
            if (r0 == 0) goto L_0x011e
            r0.setVisibility(r7)
        L_0x011e:
            com.fyber.inneractive.sdk.player.ui.i r0 = r13.f10290d
            r0.mo14697c(r3)
            com.fyber.inneractive.sdk.player.c r0 = r13.f10287a
            if (r0 == 0) goto L_0x012c
            com.fyber.inneractive.sdk.model.vast.c r0 = r0.mo13748f()
            goto L_0x012d
        L_0x012c:
            r0 = r2
        L_0x012d:
            com.fyber.inneractive.sdk.player.ui.i r6 = r13.f10290d
            if (r0 == 0) goto L_0x0134
            com.fyber.inneractive.sdk.model.vast.g r0 = r0.f9746a
            goto L_0x0135
        L_0x0134:
            r0 = r2
        L_0x0135:
            if (r5 == 0) goto L_0x013a
            r5.mo13246c()
        L_0x013a:
            if (r5 == 0) goto L_0x0144
            boolean r11 = r5.mo13239a((java.lang.String) r11, (boolean) r3)
            if (r11 == 0) goto L_0x0144
            r11 = 1
            goto L_0x0145
        L_0x0144:
            r11 = 0
        L_0x0145:
            if (r5 == 0) goto L_0x0159
            java.lang.Integer r10 = r5.mo13240b(r10)
            if (r10 == 0) goto L_0x0152
            int r10 = r10.intValue()
            goto L_0x0153
        L_0x0152:
            r10 = 3
        L_0x0153:
            if (r10 < 0) goto L_0x0159
            if (r10 <= r9) goto L_0x0158
            goto L_0x0159
        L_0x0158:
            r12 = r10
        L_0x0159:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            if (r11 == 0) goto L_0x0160
            r2 = r9
        L_0x0160:
            if (r5 == 0) goto L_0x0167
            com.fyber.inneractive.sdk.config.global.features.j$c r9 = r5.mo13250g()
            goto L_0x0169
        L_0x0167:
            com.fyber.inneractive.sdk.config.global.features.j$c r9 = com.fyber.inneractive.sdk.config.global.features.C2649j.C2652c.NONE
        L_0x0169:
            if (r5 == 0) goto L_0x016f
            int r8 = r5.mo13249f()
        L_0x016f:
            r6.getClass()
            r6.f12342p = r4
            android.view.ViewGroup r5 = r6.f12351y
            if (r5 == 0) goto L_0x01bc
            android.view.ViewParent r5 = r4.getParent()
            if (r5 == 0) goto L_0x0189
            boolean r10 = r5 instanceof android.view.ViewGroup
            if (r10 == 0) goto L_0x0189
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r10 = r6.f12342p
            r5.removeView(r10)
        L_0x0189:
            com.fyber.inneractive.sdk.model.vast.g r5 = com.fyber.inneractive.sdk.model.vast.C2840g.Static
            if (r5 != r0) goto L_0x019c
            com.fyber.inneractive.sdk.config.global.features.j$c r10 = com.fyber.inneractive.sdk.config.global.features.C2649j.C2652c.NONE
            boolean r10 = r10.equals(r9)
            r10 = r10 ^ r1
            if (r10 == 0) goto L_0x019c
            android.view.ViewGroup r10 = r6.f12351y
            r6.mo14690a((android.view.View) r10, (com.fyber.inneractive.sdk.config.global.features.C2649j.C2652c) r9, (int) r8)
            goto L_0x01a1
        L_0x019c:
            android.view.ViewGroup r8 = r6.f12351y
            r8.setVisibility(r3)
        L_0x01a1:
            android.view.ViewGroup r8 = r6.f12351y
            android.view.View r9 = r6.f12342p
            r8.addView(r9, r3)
            if (r5 != r0) goto L_0x01bc
            android.view.View r0 = r6.f12342p
            r6.mo14689a((android.view.View) r0, (int) r7)
            if (r2 == 0) goto L_0x01b2
            goto L_0x01b3
        L_0x01b2:
            r1 = 0
        L_0x01b3:
            if (r1 == 0) goto L_0x01bc
            int r0 = r2.intValue()
            r6.mo14687a((int) r7, (int) r0)
        L_0x01bc:
            com.fyber.inneractive.sdk.player.c r0 = r13.f10287a
            r0.mo13742a((boolean) r3)
            r4.requestFocus()
            goto L_0x02b4
        L_0x01c6:
            com.fyber.inneractive.sdk.player.ui.e r4 = r13.f10309w
            if (r4 == 0) goto L_0x01d6
            android.graphics.Bitmap r4 = r13.mo13889g(r1)
            if (r4 == 0) goto L_0x01e5
            com.fyber.inneractive.sdk.player.ui.i r7 = r13.f10290d
            r7.setLastFrameBitmap(r4)
            goto L_0x01e5
        L_0x01d6:
            com.fyber.inneractive.sdk.player.c r4 = r13.f10287a
            if (r4 == 0) goto L_0x01dd
            android.graphics.Bitmap r4 = r4.f10093l
            goto L_0x01de
        L_0x01dd:
            r4 = r2
        L_0x01de:
            if (r4 == 0) goto L_0x01e5
            com.fyber.inneractive.sdk.player.ui.i r7 = r13.f10290d
            r7.setLastFrameBitmap(r4)
        L_0x01e5:
            com.fyber.inneractive.sdk.player.ui.i r4 = r13.f10290d
            r4.mo14695b(r1)
            com.fyber.inneractive.sdk.player.ui.i r4 = r13.f10290d
            r4.mo14697c(r3)
            com.fyber.inneractive.sdk.player.ui.b r4 = new com.fyber.inneractive.sdk.player.ui.b
            r4.<init>()
            r4.f12306b = r1
            if (r5 == 0) goto L_0x0200
            boolean r7 = r5.mo13246c()
            if (r7 == 0) goto L_0x0200
            r7 = 1
            goto L_0x0201
        L_0x0200:
            r7 = 0
        L_0x0201:
            r4.f12307c = r7
            if (r6 == 0) goto L_0x0215
            java.lang.String r0 = r0.f9228p
            r6.mo13235e(r0)
            com.fyber.inneractive.sdk.model.vast.a r0 = r6.f9301e
            if (r0 == 0) goto L_0x0215
            boolean r6 = r0.f9736d
            if (r6 == 0) goto L_0x0215
            java.lang.String r0 = r0.f9733a
            goto L_0x0216
        L_0x0215:
            r0 = r2
        L_0x0216:
            r4.f12309e = r0
            if (r5 == 0) goto L_0x0222
            boolean r0 = r5.mo13239a((java.lang.String) r11, (boolean) r3)
            if (r0 == 0) goto L_0x0222
            r0 = 1
            goto L_0x0223
        L_0x0222:
            r0 = 0
        L_0x0223:
            if (r5 == 0) goto L_0x0237
            java.lang.Integer r6 = r5.mo13240b(r10)
            if (r6 == 0) goto L_0x0230
            int r6 = r6.intValue()
            goto L_0x0231
        L_0x0230:
            r6 = 3
        L_0x0231:
            if (r6 < 0) goto L_0x0237
            if (r6 <= r9) goto L_0x0236
            goto L_0x0237
        L_0x0236:
            r12 = r6
        L_0x0237:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            if (r0 == 0) goto L_0x023f
            r4.f12310f = r6
        L_0x023f:
            if (r5 == 0) goto L_0x0246
            com.fyber.inneractive.sdk.config.global.features.j$c r0 = r5.mo13250g()
            goto L_0x0248
        L_0x0246:
            com.fyber.inneractive.sdk.config.global.features.j$c r0 = com.fyber.inneractive.sdk.config.global.features.C2649j.C2652c.NONE
        L_0x0248:
            if (r5 == 0) goto L_0x024e
            int r8 = r5.mo13249f()
        L_0x024e:
            r4.f12313i = r0
            r4.f12314j = r8
            com.fyber.inneractive.sdk.config.global.s r0 = r13.f10289c
            if (r0 == 0) goto L_0x025f
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.f> r2 = com.fyber.inneractive.sdk.config.global.features.C2645f.class
            com.fyber.inneractive.sdk.config.global.features.e r0 = r0.mo13264a(r2)
            r2 = r0
            com.fyber.inneractive.sdk.config.global.features.f r2 = (com.fyber.inneractive.sdk.config.global.features.C2645f) r2
        L_0x025f:
            if (r2 == 0) goto L_0x028e
            java.lang.String r0 = "should_show_hand"
            boolean r0 = r2.mo13239a((java.lang.String) r0, (boolean) r3)
            r4.f12305a = r0
            r5 = 4608533498473480192(0x3ff4ccccc0000000, double:1.2999999523162842)
            java.lang.String r0 = "scale_up_to"
            java.lang.Double r0 = r2.mo13236a((java.lang.String) r0)
            if (r0 == 0) goto L_0x027a
            double r5 = r0.doubleValue()
        L_0x027a:
            float r0 = (float) r5
            r2 = 1071225242(0x3fd9999a, float:1.7)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0289
            r2 = 1066192077(0x3f8ccccd, float:1.1)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x028c
        L_0x0289:
            r0 = 1067869798(0x3fa66666, float:1.3)
        L_0x028c:
            r4.f12308d = r0
        L_0x028e:
            com.fyber.inneractive.sdk.player.ui.i r0 = r13.f10290d
            com.fyber.inneractive.sdk.player.ui.a r2 = new com.fyber.inneractive.sdk.player.ui.a
            r2.<init>(r4)
            r0.mo14691a((com.fyber.inneractive.sdk.player.p050ui.C3449a) r2)
            com.fyber.inneractive.sdk.player.c r0 = r13.f10287a
            if (r0 == 0) goto L_0x02b4
            r0.mo13742a((boolean) r1)
            goto L_0x02b4
        L_0x02a0:
            if (r5 == 0) goto L_0x02af
            if (r4 == 0) goto L_0x02af
            com.fyber.inneractive.sdk.player.ui.i r0 = r13.f10290d
            r0.mo14695b(r3)
            com.fyber.inneractive.sdk.player.ui.i r0 = r13.f10290d
            r0.mo14697c(r3)
            goto L_0x02b4
        L_0x02af:
            com.fyber.inneractive.sdk.player.ui.i r0 = r13.f10290d
            r0.mo14697c(r1)
        L_0x02b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C3009k.mo13850y():void");
    }

    /* renamed from: z */
    public void mo13898z() {
        C3457i iVar = this.f10290d;
        if (iVar.f12346t != null) {
            iVar.setMuteButtonState(mo13895o());
        }
    }

    public C3009k(C2948c cVar, C3457i iVar, C2703z zVar, C2666s sVar, boolean z, Skip skip) {
        this.f10292f = 0;
        this.f10294h = false;
        this.f10295i = -0.1f;
        this.f10298l = false;
        this.f10301o = false;
        this.f10302p = null;
        this.f10303q = null;
        this.f10304r = false;
        this.f10305s = false;
        this.f10306t = false;
        this.f10307u = false;
        this.f10308v = false;
        this.f10310x = skip;
        this.f10287a = cVar;
        this.f10288b = zVar;
        this.f10289c = sVar;
        this.f10290d = iVar;
        this.f10300n = z;
        iVar.setListener(this);
        mo13890g();
        new GestureDetector(iVar.getContext(), new C3010a(this));
    }

    /* renamed from: a */
    public final void mo13882a(int i, int i2) {
        Bitmap bitmap = this.f10302p;
        if (!(bitmap != null && bitmap.getWidth() == i && this.f10302p.getHeight() == i2) && i2 > 0 && i > 0) {
            AsyncTask<?, ?, ?> asyncTask = this.f10303q;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            this.f10302p = null;
            C3011b bVar = new C3011b();
            this.f10303q = bVar;
            bVar.executeOnExecutor(C3714n.f12901a, new Integer[]{Integer.valueOf(i), Integer.valueOf(i2)});
        }
    }

    /* renamed from: f */
    public void mo13831f() {
        C3453e eVar;
        C3457i iVar = this.f10290d;
        if (iVar != null) {
            iVar.mo14684g();
        }
        C2948c cVar = this.f10287a;
        if (!(cVar == null || cVar.f10083b == null || (eVar = this.f10309w) == null)) {
            eVar.invalidate();
            this.f10309w.requestLayout();
        }
        C3457i iVar2 = this.f10290d;
        if (iVar2 != null) {
            iVar2.invalidate();
            this.f10290d.requestLayout();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        r2 = r8.f10309w;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo13842i() {
        /*
            r8 = this;
            com.fyber.inneractive.sdk.player.ui.e r0 = r8.f10309w
            r1 = 0
            if (r0 != 0) goto L_0x0045
            com.fyber.inneractive.sdk.player.ui.e r0 = new com.fyber.inneractive.sdk.player.ui.e
            com.fyber.inneractive.sdk.player.ui.i r2 = r8.f10290d
            r0.<init>(r2)
            r8.f10309w = r0
            com.fyber.inneractive.sdk.player.c r2 = r8.f10287a
            if (r2 == 0) goto L_0x0045
            com.fyber.inneractive.sdk.measurement.g r2 = r2.f10090i
            if (r2 == 0) goto L_0x0045
            com.fyber.inneractive.sdk.player.ui.i r3 = r8.f10290d
            android.view.View[] r3 = r3.getTrackingFriendlyView()
            oh.b r4 = r2.f9690a
            if (r4 == 0) goto L_0x0028
            r4.mo51251d(r0)     // Catch:{ all -> 0x0024 }
            goto L_0x0028
        L_0x0024:
            r0 = move-exception
            r2.mo13612a((java.lang.Throwable) r0)
        L_0x0028:
            oh.b r0 = r2.f9690a
            if (r0 == 0) goto L_0x0045
            if (r3 == 0) goto L_0x0045
            int r0 = r3.length
            r4 = 0
        L_0x0030:
            if (r4 >= r0) goto L_0x0045
            r5 = r3[r4]
            if (r5 == 0) goto L_0x0042
            oh.b r6 = r2.f9690a     // Catch:{ all -> 0x003e }
            com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose r7 = com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose.VIDEO_CONTROLS     // Catch:{ all -> 0x003e }
            r6.mo51249a(r5, r7)     // Catch:{ all -> 0x003e }
            goto L_0x0042
        L_0x003e:
            r5 = move-exception
            r2.mo13612a((java.lang.Throwable) r5)
        L_0x0042:
            int r4 = r4 + 1
            goto L_0x0030
        L_0x0045:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = com.fyber.inneractive.sdk.util.IAlog.m9899a((java.lang.Object) r8)
            r0[r1] = r2
            com.fyber.inneractive.sdk.player.ui.i r2 = r8.f10290d
            android.view.ViewGroup r2 = r2.getTextureHost()
            r3 = 1
            r0[r3] = r2
            java.lang.String r2 = "%sconnectToTextureView called %s"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r2, r0)
            com.fyber.inneractive.sdk.player.ui.e r0 = r8.f10309w
            if (r0 == 0) goto L_0x0081
            com.fyber.inneractive.sdk.player.ui.i r0 = r8.f10290d
            android.view.ViewGroup r0 = r0.getTextureHost()
            com.fyber.inneractive.sdk.player.ui.e r2 = r8.f10309w
            android.view.ViewParent r2 = r2.getParent()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0081
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = com.fyber.inneractive.sdk.util.IAlog.m9899a((java.lang.Object) r8)
            r0[r1] = r2
            java.lang.String r1 = "%sconnectToTextureView called but already connected"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r1, r0)
            goto L_0x013b
        L_0x0081:
            com.fyber.inneractive.sdk.player.c r0 = r8.f10287a
            if (r0 == 0) goto L_0x00f2
            com.fyber.inneractive.sdk.player.controller.g r0 = r0.f10083b
            if (r0 == 0) goto L_0x00f2
            com.fyber.inneractive.sdk.player.ui.e r2 = r8.f10309w
            android.view.TextureView r4 = r0.f10265j
            if (r4 == r2) goto L_0x00f2
            if (r4 == 0) goto L_0x0095
            r5 = 0
            r4.setSurfaceTextureListener(r5)
        L_0x0095:
            r0.f10265j = r2
            android.view.TextureView$SurfaceTextureListener r4 = r0.f10268m
            if (r4 == 0) goto L_0x009c
            goto L_0x00a3
        L_0x009c:
            com.fyber.inneractive.sdk.player.controller.f r4 = new com.fyber.inneractive.sdk.player.controller.f
            r4.<init>(r0)
            r0.f10268m = r4
        L_0x00a3:
            android.view.TextureView$SurfaceTextureListener r4 = r0.f10268m
            r2.setSurfaceTextureListener(r4)
            android.graphics.SurfaceTexture r2 = r0.f10266k
            if (r2 == 0) goto L_0x00f2
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r4 = com.fyber.inneractive.sdk.util.IAlog.m9899a((java.lang.Object) r0)
            r2[r1] = r4
            java.lang.String r4 = "%scalling setSurfaceTexture with cached texture"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r4, r2)
            android.view.TextureView r2 = r0.f10265j
            android.graphics.SurfaceTexture r2 = r2.getSurfaceTexture()
            if (r2 == 0) goto L_0x00de
            android.view.TextureView r2 = r0.f10265j
            android.graphics.SurfaceTexture r2 = r2.getSurfaceTexture()
            android.graphics.SurfaceTexture r4 = r0.f10266k
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00d0
            goto L_0x00de
        L_0x00d0:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r0 = com.fyber.inneractive.sdk.util.IAlog.m9899a((java.lang.Object) r0)
            r2[r1] = r0
            java.lang.String r0 = "%scalling setSurfaceTexture with cached texture failed"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r0, r2)
            goto L_0x00f2
        L_0x00de:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r4 = com.fyber.inneractive.sdk.util.IAlog.m9899a((java.lang.Object) r0)
            r2[r1] = r4
            java.lang.String r4 = "%scalling setSurfaceTexture with cached texture success"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r4, r2)
            android.view.TextureView r2 = r0.f10265j
            android.graphics.SurfaceTexture r0 = r0.f10266k
            r2.setSurfaceTexture(r0)
        L_0x00f2:
            com.fyber.inneractive.sdk.player.ui.e r0 = r8.f10309w
            if (r0 == 0) goto L_0x00fb
            int r2 = com.fyber.inneractive.sdk.C2524R.C2526id.inn_texture_view
            r0.setId(r2)
        L_0x00fb:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = com.fyber.inneractive.sdk.util.IAlog.m9899a((java.lang.Object) r8)
            r0[r1] = r2
            java.lang.String r2 = "%supdateView adding texture to parent"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r2, r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r2 = -2
            r0.<init>(r2, r2)
            r0.setMargins(r1, r1, r1, r1)
            r2 = 17
            r0.gravity = r2
            com.fyber.inneractive.sdk.player.ui.e r2 = r8.f10309w
            android.view.ViewParent r2 = r2.getParent()
            if (r2 != 0) goto L_0x0128
            com.fyber.inneractive.sdk.player.ui.i r2 = r8.f10290d
            android.view.ViewGroup r2 = r2.getTextureHost()
            com.fyber.inneractive.sdk.player.ui.e r4 = r8.f10309w
            r2.addView(r4, r0)
        L_0x0128:
            r8.f10298l = r1
            com.fyber.inneractive.sdk.player.controller.p r0 = new com.fyber.inneractive.sdk.player.controller.p
            r0.<init>(r8)
            r8.f10291e = r0
            com.fyber.inneractive.sdk.player.c r1 = r8.f10287a
            if (r1 == 0) goto L_0x013b
            com.fyber.inneractive.sdk.player.controller.g r1 = r1.f10083b
            if (r1 == 0) goto L_0x013b
            r1.f10259d = r0
        L_0x013b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C3009k.mo13842i():boolean");
    }

    /* renamed from: h */
    public final void mo13891h() {
        Runnable runnable = this.f10296j;
        if (runnable != null) {
            this.f10290d.removeCallbacks(runnable);
            this.f10296j = null;
        }
    }

    /* renamed from: a */
    public final void mo13885a(String str) {
        C2619a0 a0Var;
        C2628d0 d0Var = IAConfigManager.f9202J.f9236x;
        C2703z zVar = this.f10288b;
        if (zVar != null && (a0Var = ((C2702y) zVar).f9427f) != null) {
            d0Var.mo13213a(a0Var.f9256j, "LAST_VAST_CLICKED_TYPE", str);
        }
    }

    /* renamed from: g */
    public Bitmap mo13889g(boolean z) {
        C2948c cVar;
        C2997g gVar;
        if (!(this.f10302p == null || (cVar = this.f10287a) == null || (gVar = cVar.f10083b) == null)) {
            if (this.f10301o) {
                return cVar.f10093l;
            }
            TextureView textureView = gVar.f10265j;
            Object[] objArr = new Object[3];
            objArr[0] = IAlog.m9899a((Object) this);
            objArr[1] = textureView;
            objArr[2] = Boolean.valueOf(textureView != null && textureView.isAvailable());
            IAlog.m9902a("%sSave snapshot entered: tv = %s avail = %s", objArr);
            if (textureView != null && textureView.isAvailable()) {
                try {
                    IAlog.m9905d("creating bitmap on object - %s", this.f10302p);
                    Bitmap bitmap = textureView.getBitmap(this.f10302p);
                    if (this.f10290d.getVideoWidth() > 0 && this.f10290d.getVideoHeight() > 0) {
                        this.f10302p = null;
                        mo13882a(this.f10290d.getVideoWidth(), this.f10290d.getVideoHeight());
                    }
                    if (z) {
                        C3674c cVar2 = new C3674c();
                        cVar2.f12831c = 20;
                        cVar2.f12832d = 1;
                        cVar2.f12829a = bitmap.getWidth();
                        cVar2.f12830b = bitmap.getHeight();
                        this.f10287a.mo13738a(C3670b.m9912a(this.f10290d.getContext(), bitmap, cVar2));
                        this.f10301o = true;
                    } else {
                        this.f10287a.mo13738a(bitmap);
                    }
                    IAlog.m9905d("%ssave snapshot succeeded", IAlog.m9899a((Object) this));
                    return this.f10287a.f10093l;
                } catch (Exception unused) {
                    IAlog.m9905d("%ssave snapshot failed with exception", IAlog.m9899a((Object) this));
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public void mo13827c(boolean z) {
        C2948c cVar;
        C2997g gVar;
        C2619a0 a0Var;
        ListenerT listenert;
        C2997g gVar2;
        C2703z zVar;
        C2619a0 a0Var2;
        this.f10306t = true;
        C2628d0 d0Var = IAConfigManager.f9202J.f9236x;
        if (!(!z || d0Var == null || (zVar = this.f10288b) == null || (a0Var2 = ((C2702y) zVar).f9427f) == null)) {
            d0Var.mo13213a(a0Var2.f9256j, "LAST_VAST_SKIPED", DiskLruCache.VERSION_1);
        }
        C2948c cVar2 = this.f10287a;
        if (!(cVar2 == null || (gVar2 = cVar2.f10083b) == null)) {
            gVar2.mo13859m();
            this.f10287a.f10083b.mo13821k();
            C2823g gVar3 = this.f10287a.f10090i;
            if (!(gVar3 == null || gVar3.f9692c == null)) {
                IAlog.m9902a("%s skipped", "OMVideo");
                try {
                    C18923a aVar = gVar3.f9692c;
                    C14226d.m35351r0(aVar.f48164a);
                    aVar.f48164a.f47714e.mo44187b("skipped");
                } catch (Throwable th) {
                    gVar3.mo13612a(th);
                }
            }
        }
        if (!this.f10290d.mo14699d()) {
            this.f10290d.mo14693a(false);
            mo13891h();
            mo13850y();
            this.f10297k = false;
            this.f10294h = true;
            C2703z zVar2 = this.f10288b;
            if (!(zVar2 == null || (a0Var = ((C2702y) zVar2).f9427f) == null || a0Var.f9256j != UnitDisplayType.REWARDED || (listenert = this.f10293g) == null)) {
                listenert.onCompleted();
            }
        }
        if (this.f10293g != null && (this.f10292f <= 0 || this.f10294h || !((cVar = this.f10287a) == null || (gVar = cVar.f10083b) == null || !gVar.f10260e.equals(C3025b.Completed)))) {
            this.f10293g.mo13942a(z);
        }
        mo13878j();
    }

    /* renamed from: a */
    public void mo13864a(C3025b bVar) {
        IAlog.m9902a("%sonPlayerStateChanged with %s", IAlog.m9899a((Object) this), bVar);
        mo13884a(bVar, true);
    }

    /* renamed from: a */
    public final void mo13884a(C3025b bVar, boolean z) {
        ListenerT listenert;
        int ordinal = bVar.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                switch (ordinal) {
                    case 6:
                        if (this.f10304r) {
                            mo13848v();
                            return;
                        }
                        return;
                    case 7:
                        mo13879s();
                        return;
                    case 8:
                        if (this.f10304r && !this.f10308v) {
                            this.f10308v = true;
                            mo13896q();
                            if (z && (listenert = this.f10293g) != null) {
                                listenert.onCompleted();
                                return;
                            }
                            return;
                        }
                        return;
                    case 9:
                        if (this.f10304r) {
                            mo13827c(false);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } else if (this.f10304r) {
                this.f10290d.mo14693a(true);
                this.f10290d.mo14697c(false);
                Runnable runnable = this.f10296j;
                if (runnable == null) {
                    if (runnable == null) {
                        this.f10296j = new C3012l(this);
                    }
                    int l = mo13843l();
                    IAlog.m9902a("%s Starting buffering timeout with %d", IAlog.m9899a((Object) this), Integer.valueOf(l));
                    this.f10290d.postDelayed(this.f10296j, (long) l);
                }
            }
        } else if (this.f10304r) {
            this.f10290d.mo14695b(true);
            mo13850y();
            mo13880u();
        }
    }

    /* renamed from: d */
    public void mo13876d() {
        IAlog.m9902a("%sonVideoViewDetachedFromWindow", IAlog.m9899a((Object) this));
        mo13878j();
    }

    /* renamed from: a */
    public void mo13863a(int i) {
        int i2;
        C2703z zVar;
        C2619a0 a0Var;
        C2997g gVar;
        C2948c cVar = this.f10287a;
        if (cVar != null && cVar.f10083b != null) {
            float m = mo13894m();
            C2948c cVar2 = this.f10287a;
            if (!(cVar2 == null || (gVar = cVar2.f10083b) == null || !gVar.mo13837j())) {
                float f = this.f10295i;
                if (m != f) {
                    int i3 = (m > BitmapDescriptorFactory.HUE_RED ? 1 : (m == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    if (i3 > 0 && f >= BitmapDescriptorFactory.HUE_RED && mo13895o()) {
                        mo13892i(true);
                    } else if (i3 == 0 && !mo13895o()) {
                        mo13888f(true);
                    }
                }
                mo13898z();
            }
            this.f10295i = m;
            int d = this.f10287a.f10083b.mo13814d();
            int c = this.f10287a.f10083b.mo13813c();
            int i4 = c / 1000;
            int i5 = d / 1000;
            int i6 = i5 - i4;
            if (i6 < 0 || (!this.f10287a.f10083b.mo13837j() && c == d)) {
                i6 = 0;
            }
            C3457i iVar = this.f10290d;
            if (iVar.f12340n != null || iVar.f12348v != null) {
                iVar.setRemainingTime(Integer.toString(i6));
                if (this.f10292f < i5) {
                    if (mo13849w()) {
                        int d2 = this.f10287a.f10083b.mo13814d();
                        C2948c cVar3 = this.f10287a;
                        if (C2948c.m7273a(d2, ((C3423f) cVar3).f12237A, C2948c.m7271a(cVar3)) && !this.f10294h) {
                            int i7 = this.f10292f;
                            if (i4 < i7) {
                                mo13887c(i7 - i4);
                            } else {
                                this.f10292f = 0;
                                mo13893k();
                            }
                            this.f10290d.mo14698d(true);
                        }
                    }
                    this.f10290d.mo14698d(false);
                } else {
                    this.f10290d.mo14698d(false);
                }
                if (this.f10287a.f10083b.f10260e != C3025b.Paused) {
                    C3457i iVar2 = this.f10290d;
                    if (iVar2.f12348v != null) {
                        Runnable runnable = iVar2.f12329E;
                        if (runnable != null) {
                            iVar2.removeCallbacks(runnable);
                            iVar2.f12329E = null;
                        }
                        int i8 = i5 * 1000;
                        iVar2.f12348v.setMax(i8);
                        int i9 = i8 - (i6 * 1000);
                        int i11 = i9 + 1000;
                        iVar2.f12328D = i11;
                        int i12 = i9 + 200;
                        if (i11 > 0 && i11 <= i8) {
                            int i13 = iVar2.f12327C;
                            if (i12 >= i13 || i13 <= 0) {
                                iVar2.f12327C = i12;
                                iVar2.f12348v.setProgress(i12);
                                C3463k kVar = new C3463k(iVar2);
                                iVar2.f12329E = kVar;
                                iVar2.postDelayed(kVar, 200);
                            } else {
                                iVar2.f12348v.setProgress(i11);
                            }
                        }
                    }
                    C2667h hVar = IAConfigManager.f9202J.f9234v.f9337b;
                    int i14 = 30;
                    String num = Integer.toString(30);
                    if (hVar.f9334a.containsKey("max_rv_tsec")) {
                        num = hVar.f9334a.get("max_rv_tsec");
                    }
                    try {
                        i2 = Integer.parseInt(num);
                    } catch (Throwable unused) {
                        i2 = 30;
                    }
                    if (i2 >= 1) {
                        i14 = i2;
                    }
                    if (i5 > i14 && i4 > i14 && (zVar = this.f10288b) != null && (a0Var = ((C2702y) zVar).f9427f) != null && a0Var.f9256j == UnitDisplayType.REWARDED) {
                        mo13893k();
                        this.f10290d.mo14698d(true);
                    }
                }
                ListenerT listenert = this.f10293g;
                if (listenert != null) {
                    listenert.onProgress(d, c);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo13887c(int i) {
        if (this.f10290d != null) {
            C2666s sVar = this.f10289c;
            String str = null;
            C2641b bVar = sVar != null ? (C2641b) sVar.mo13264a(C2641b.class) : null;
            if (bVar != null) {
                bVar.mo13235e(IAConfigManager.f9202J.f9228p);
                C2834a aVar = bVar.f9301e;
                if (aVar != null && aVar.f9736d) {
                    str = aVar.f9735c;
                }
            }
            if (str != null) {
                this.f10290d.setSkipText(str.replaceFirst("\\[TIME\\]", Integer.toString(i)));
                return;
            }
            C3457i iVar = this.f10290d;
            iVar.setSkipText(iVar.getContext().getString(C2524R.string.ia_video_before_skip_format, new Object[]{Integer.valueOf(i)}));
        }
    }

    /* renamed from: a */
    public void mo13840a(boolean z) {
        C2948c cVar;
        C2997g gVar;
        C3457i iVar;
        Application application;
        if (this.f10304r != z && (cVar = this.f10287a) != null && cVar.f10083b != null) {
            IAlog.m9902a("%sonVisibilityChanged: %s my video view is%s", IAlog.m9899a((Object) this), Boolean.valueOf(z), this.f10290d);
            if (z) {
                this.f10304r = true;
                C3025b bVar = this.f10287a.f10083b.f10260e;
                if (bVar.equals(C3025b.Completed) || this.f10290d.mo14699d()) {
                    if (!this.f10308v) {
                        this.f10308v = true;
                        mo13896q();
                        ListenerT listenert = this.f10293g;
                        if (listenert != null) {
                            listenert.onCompleted();
                        }
                    }
                    C3457i iVar2 = this.f10290d;
                    if (iVar2 != null && iVar2.f12330F != null) {
                        IAlog.m9902a("Autoclick resumed", new Object[0]);
                        iVar2.f12330F.mo15391b();
                        return;
                    }
                    return;
                }
                if (!bVar.equals(C3025b.Error)) {
                    if (bVar.equals(C3025b.Idle)) {
                        this.f10287a.getClass();
                    } else {
                        if (bVar == C3025b.Start_in_progress || bVar == C3025b.Playing) {
                            mo13848v();
                        }
                        C2948c cVar2 = this.f10287a;
                        if (!cVar2.f10098q) {
                            C3423f fVar = (C3423f) cVar2;
                            fVar.mo13740a(fVar.f12240x, VideoClickOrigin.InvalidOrigin, C2850q.EVENT_CREATIVE_VIEW);
                            cVar2.f10098q = true;
                        }
                        mo13842i();
                        if (this.f10299m == null && (application = C3707l.f12893a) != null) {
                            C3013m mVar = new C3013m(this);
                            this.f10299m = mVar;
                            application.registerActivityLifecycleCallbacks(mVar);
                            return;
                        }
                        return;
                    }
                }
                mo13827c(false);
                return;
            }
            this.f10304r = false;
            C2948c cVar3 = this.f10287a;
            if (!(cVar3 == null || (gVar = cVar3.f10083b) == null || !gVar.f10259d.equals(this.f10291e))) {
                IAlog.m9902a("%sonVisibilityChanged pausing video", IAlog.m9899a((Object) this));
                pauseVideo();
                if (this.f10287a.f10083b.f10260e == C3025b.Completed || ((iVar = this.f10290d) != null && iVar.mo14699d())) {
                    C3457i iVar3 = this.f10290d;
                    if (iVar3.f12330F != null) {
                        IAlog.m9902a("Autoclick paused", new Object[0]);
                        iVar3.f12330F.mo15389a();
                    }
                }
            }
            mo13878j();
        }
    }

    /* renamed from: a */
    public void mo13883a(int i, C3721p0 p0Var) {
        IAlog.m9902a("onClicked called with %d", Integer.valueOf(i));
        switch (i) {
            case 1:
                if (mo13895o()) {
                    mo13892i(true);
                    C2948c cVar = this.f10287a;
                    if (cVar != null) {
                        C3423f fVar = (C3423f) cVar;
                        fVar.mo13740a(fVar.f12240x, VideoClickOrigin.MUTE, C2850q.EVENT_UNMUTE);
                    }
                } else {
                    mo13888f(true);
                    C2948c cVar2 = this.f10287a;
                    if (cVar2 != null) {
                        C3423f fVar2 = (C3423f) cVar2;
                        fVar2.mo13740a(fVar2.f12240x, VideoClickOrigin.MUTE, C2850q.EVENT_MUTE);
                    }
                }
                mo13898z();
                return;
            case 2:
                mo13847t();
                return;
            case 3:
                mo13885a(DiskLruCache.VERSION_1);
                mo13886a(false, VideoClickOrigin.CTA, p0Var);
                return;
            case 4:
                mo13885a("2");
                C2948c cVar3 = this.f10287a;
                String str = null;
                C2836c f = cVar3 != null ? cVar3.mo13748f() : null;
                if (f != null && f.f9746a == C2840g.Static) {
                    str = f.f9752g;
                    C2948c cVar4 = this.f10287a;
                    if (cVar4 != null) {
                        cVar4.mo13740a((C3652i) f, VideoClickOrigin.COMPANION, C2850q.EVENT_CLICK);
                    }
                }
                C3457i iVar = this.f10290d;
                if (iVar != null) {
                    iVar.mo14700e();
                    iVar.f12331G = true;
                }
                ListenerT listenert = this.f10293g;
                if (listenert != null) {
                    listenert.mo13939a(str, p0Var);
                    return;
                }
                return;
            case 5:
                mo13846r();
                return;
            case 6:
                mo13827c(true);
                return;
            case 7:
                mo13839a(p0Var);
                return;
            case 8:
                mo13885a("2");
                mo13886a(true, VideoClickOrigin.COMPANION, p0Var);
                return;
            case 9:
                C2948c cVar5 = this.f10287a;
                if (cVar5 != null && !this.f10290d.f12322h) {
                    cVar5.f10092k = true;
                    mo13877h(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009f, code lost:
        if (r7.f12835a != com.fyber.inneractive.sdk.util.C3677d0.C3680c.FAILED) goto L_0x00a3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo13886a(boolean r7, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin r8, com.fyber.inneractive.sdk.util.C3721p0 r9) {
        /*
            r6 = this;
            com.fyber.inneractive.sdk.player.ui.i r0 = r6.f10290d
            r1 = 1
            if (r0 == 0) goto L_0x000a
            r0.mo14700e()
            r0.f12331G = r1
        L_0x000a:
            ListenerT r0 = r6.f10293g
            r2 = 0
            if (r0 == 0) goto L_0x00a2
            if (r7 == 0) goto L_0x0032
            com.fyber.inneractive.sdk.player.c r7 = r6.f10287a
            if (r7 == 0) goto L_0x00a2
            com.fyber.inneractive.sdk.player.f r7 = (com.fyber.inneractive.sdk.player.C3423f) r7
            com.fyber.inneractive.sdk.model.vast.b r7 = r7.f12240x
            if (r7 == 0) goto L_0x001e
            java.lang.String r7 = r7.f9738b
            goto L_0x001f
        L_0x001e:
            r7 = 0
        L_0x001f:
            r0.mo13939a((java.lang.String) r7, (com.fyber.inneractive.sdk.util.C3721p0) r9)
            com.fyber.inneractive.sdk.player.c r7 = r6.f10287a
            com.fyber.inneractive.sdk.model.vast.q[] r9 = new com.fyber.inneractive.sdk.model.vast.C2850q[r1]
            com.fyber.inneractive.sdk.model.vast.q r0 = com.fyber.inneractive.sdk.model.vast.C2850q.EVENT_CLICK
            r9[r2] = r0
            com.fyber.inneractive.sdk.player.f r7 = (com.fyber.inneractive.sdk.player.C3423f) r7
            com.fyber.inneractive.sdk.model.vast.b r0 = r7.f12240x
            r7.mo13740a(r0, r8, r9)
            goto L_0x00a2
        L_0x0032:
            com.fyber.inneractive.sdk.player.enums.VideoClickOrigin r7 = com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.VIDEO
            if (r8 != r7) goto L_0x0039
            com.fyber.inneractive.sdk.util.e r7 = com.fyber.inneractive.sdk.util.C3682e.VIDEO_CLICK
            goto L_0x003b
        L_0x0039:
            com.fyber.inneractive.sdk.util.e r7 = com.fyber.inneractive.sdk.util.C3682e.VIDEO_CTA
        L_0x003b:
            com.fyber.inneractive.sdk.util.d0$a r7 = r0.mo13938a((com.fyber.inneractive.sdk.util.C3721p0) r9, (com.fyber.inneractive.sdk.util.C3682e) r7)
            com.fyber.inneractive.sdk.player.c r9 = r6.f10287a
            if (r9 == 0) goto L_0x009b
            com.fyber.inneractive.sdk.model.vast.q[] r0 = new com.fyber.inneractive.sdk.model.vast.C2850q[r1]
            com.fyber.inneractive.sdk.model.vast.q r3 = com.fyber.inneractive.sdk.model.vast.C2850q.EVENT_CLICK
            r0[r2] = r3
            com.fyber.inneractive.sdk.player.f r9 = (com.fyber.inneractive.sdk.player.C3423f) r9
            com.fyber.inneractive.sdk.model.vast.b r3 = r9.f12240x
            r9.mo13740a(r3, r8, r0)
            com.fyber.inneractive.sdk.player.c r9 = r6.f10287a
            com.fyber.inneractive.sdk.measurement.g r9 = r9.f10090i
            if (r9 == 0) goto L_0x009b
            ph.a r0 = r9.f9692c
            if (r0 == 0) goto L_0x009b
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r3 = "OMVideo"
            r0[r2] = r3
            java.lang.String r3 = "%s click"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r3, r0)
            ph.a r0 = r9.f9692c     // Catch:{ all -> 0x0097 }
            com.iab.omid.library.fyber.adsession.media.InteractionType r3 = com.iab.omid.library.fyber.adsession.media.InteractionType.CLICK     // Catch:{ all -> 0x0097 }
            r0.getClass()     // Catch:{ all -> 0x0097 }
            java.lang.String r4 = "InteractionType is null"
            com.google.android.play.core.appupdate.C14226d.m35346l0(r3, r4)     // Catch:{ all -> 0x0097 }
            oh.g r4 = r0.f48164a     // Catch:{ all -> 0x0097 }
            com.google.android.play.core.appupdate.C14226d.m35351r0(r4)     // Catch:{ all -> 0x0097 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x0097 }
            r4.<init>()     // Catch:{ all -> 0x0097 }
            java.lang.String r5 = "interactionType"
            p792sh.C19461a.m46861c(r4, r5, r3)     // Catch:{ all -> 0x0097 }
            oh.g r0 = r0.f48164a     // Catch:{ all -> 0x0097 }
            com.iab.omid.library.fyber.publisher.AdSessionStatePublisher r0 = r0.f47714e     // Catch:{ all -> 0x0097 }
            java.lang.String r3 = "adUserInteraction"
            android.webkit.WebView r0 = r0.mo44193h()     // Catch:{ all -> 0x0097 }
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0097 }
            r5[r2] = r3     // Catch:{ all -> 0x0097 }
            r5[r1] = r4     // Catch:{ all -> 0x0097 }
            java.lang.String r3 = "publishMediaEvent"
            p389bl.C13637c.m34066c(r0, r3, r5)     // Catch:{ all -> 0x0097 }
            goto L_0x009b
        L_0x0097:
            r0 = move-exception
            r9.mo13612a((java.lang.Throwable) r0)
        L_0x009b:
            com.fyber.inneractive.sdk.util.d0$c r7 = r7.f12835a
            com.fyber.inneractive.sdk.util.d0$c r9 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.FAILED
            if (r7 == r9) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r1 = 0
        L_0x00a3:
            com.fyber.inneractive.sdk.player.enums.VideoClickOrigin r7 = com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.VIDEO
            if (r8 != r7) goto L_0x00ac
            java.lang.String r7 = "3"
            r6.mo13885a((java.lang.String) r7)
        L_0x00ac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C3009k.mo13886a(boolean, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin, com.fyber.inneractive.sdk.util.p0):boolean");
    }

    /* renamed from: a */
    public void mo13824a(Bitmap bitmap) {
        C2997g gVar;
        C2948c cVar = this.f10287a;
        if (cVar != null && (gVar = cVar.f10083b) != null && gVar.f10260e != C3025b.Completed) {
            this.f10290d.mo14693a(cVar.f10092k);
            this.f10290d.mo14695b(true);
            this.f10290d.setLastFrameBitmap(bitmap);
        }
    }

    /* renamed from: a */
    public void mo13823a(long j) {
        View view;
        C2948c cVar = this.f10287a;
        View c = cVar != null ? cVar.mo13745c() : null;
        C3457i iVar = this.f10290d;
        boolean z = c == null;
        ObjectAnimator objectAnimator = iVar.f12332H;
        if (objectAnimator != null) {
            if (objectAnimator.getDuration() <= j) {
                ViewGroup viewGroup = iVar.f12351y;
                if (viewGroup != null) {
                    iVar.mo14689a((View) viewGroup.getParent(), 4);
                }
                iVar.f12332H.start();
                iVar.f12332H.addListener(new C3462j(iVar));
            } else {
                iVar.f12333I = true;
                iVar.f12332H = null;
                ViewGroup viewGroup2 = iVar.f12351y;
                if (!(viewGroup2 == null || viewGroup2.getParent() == null)) {
                    ((View) iVar.f12351y.getParent()).setOnTouchListener((View.OnTouchListener) null);
                }
            }
            if (!z || (view = iVar.f12350x) == null) {
                ViewGroup viewGroup3 = iVar.f12351y;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    return;
                }
                return;
            }
            view.setVisibility(0);
        }
    }
}
