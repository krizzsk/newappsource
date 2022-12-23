package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.n1 */
public final /* synthetic */ class C0441n1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f1587b;

    /* renamed from: c */
    public final /* synthetic */ Object f1588c;

    public /* synthetic */ C0441n1(Object obj, int i) {
        this.f1587b = i;
        this.f1588c = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.f1587b
            r1 = 0
            r2 = 1
            r3 = 0
            java.lang.String r4 = "this$0"
            switch(r0) {
                case 0: goto L_0x02ae;
                case 1: goto L_0x02a2;
                case 2: goto L_0x0298;
                case 3: goto L_0x028c;
                case 4: goto L_0x0284;
                case 5: goto L_0x027c;
                case 6: goto L_0x0249;
                case 7: goto L_0x0241;
                case 8: goto L_0x0237;
                case 9: goto L_0x015a;
                case 10: goto L_0x0150;
                case 11: goto L_0x0146;
                case 12: goto L_0x0109;
                case 13: goto L_0x00b0;
                case 14: goto L_0x009e;
                case 15: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x02b6
        L_0x000d:
            java.lang.Object r0 = r10.f1588c
            com.umo.ads.o.zzc r0 = (com.umo.ads.p348o.zzc) r0
            mf0.C24362h.m61211f(r0, r4)
            jc0.b r2 = r0.f30867w
            if (r2 != 0) goto L_0x0019
            goto L_0x001c
        L_0x0019:
            r2.dismiss()
        L_0x001c:
            r0.mo35802J()
            android.widget.RelativeLayout r2 = r0.f30862r
            if (r2 != 0) goto L_0x0024
            goto L_0x0030
        L_0x0024:
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r4.removeView(r2)
        L_0x0030:
            android.widget.FrameLayout r2 = r0.f30861q
            if (r2 != 0) goto L_0x0035
            goto L_0x0041
        L_0x0035:
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x003c
            goto L_0x0041
        L_0x003c:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r4.removeView(r2)
        L_0x0041:
            boolean r2 = r0.f30869y
            if (r2 == 0) goto L_0x0078
            android.widget.RelativeLayout r2 = r0.f30833A
            if (r2 != 0) goto L_0x004a
            goto L_0x0056
        L_0x004a:
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r4.removeView(r2)
        L_0x0056:
            android.widget.FrameLayout r2 = r0.f30870z
            if (r2 != 0) goto L_0x005b
            goto L_0x0067
        L_0x005b:
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r4.removeView(r2)
        L_0x0067:
            android.widget.LinearLayout r2 = r0.f30835C
            if (r2 != 0) goto L_0x006c
            goto L_0x0078
        L_0x006c:
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x0073
            goto L_0x0078
        L_0x0073:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r4.removeView(r2)
        L_0x0078:
            ga.c1 r2 = r0.f30858n
            if (r2 != 0) goto L_0x007d
            goto L_0x0095
        L_0x007d:
            r2.mo20395m(r1)
            r2.mo20379Z()
            int r1 = r2.mo20393k()
            r4 = 0
            r2.mo20405x(r1, r4)
            r2.mo20373T()
            r2.mo20371Q()
            r2.mo20404w(r0)
        L_0x0095:
            com.google.android.exoplayer2.ui.PlayerView r0 = r0.f30857m
            if (r0 != 0) goto L_0x009a
            goto L_0x009d
        L_0x009a:
            r0.setPlayer(r3)
        L_0x009d:
            return
        L_0x009e:
            java.lang.Object r0 = r10.f1588c
            yw.b r0 = (p950yw.C20774b) r0
            android.widget.TextView r1 = r0.f52417b
            r2 = 4
            r1.setVisibility(r2)
            android.widget.TextView r0 = r0.f52417b
            java.lang.String r1 = ""
            r0.setText(r1)
            return
        L_0x00b0:
            java.lang.Object r0 = r10.f1588c
            iw.h r0 = (p572iw.C17666h) r0
            int r1 = p572iw.C17666h.f45402O
            r0.mo50117G2()
            e20.q r1 = r0.f45406D
            if (r1 != 0) goto L_0x00be
            goto L_0x0108
        L_0x00be:
            A r1 = r0.f40822c
            e20.o r3 = new e20.o
            c70.e r4 = r0.mo46783R1()
            tp.f r5 = p824tp.C19728f.m47195a(r1)
            q00.a$a r6 = q00.C19047a.f48441d
            java.lang.String r6 = "user_configuration"
            java.lang.Object r1 = r1.getSystemService(r6)
            q00.a r1 = (q00.C19047a) r1
            e20.q r6 = r0.f45406D
            r3.<init>(r4, r5, r1, r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class<e20.o> r4 = e20.C16790o.class
            java.lang.String r4 = r4.getName()
            r1.append(r4)
            java.lang.String r4 = "_"
            r1.append(r4)
            long r4 = java.lang.System.currentTimeMillis()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.moovit.request.RequestOptions r4 = r0.mo46777L1()
            r4.f42908e = r2
            r4.f42909f = r2
            iw.h$d r2 = r0.f45414L
            b00.a r1 = r0.mo46793f2(r1, r3, r4, r2)
            r0.f45405C = r1
        L_0x0108:
            return
        L_0x0109:
            java.lang.Object r0 = r10.f1588c
            com.moovit.app.navigation.MultiLegNavActivity r0 = (com.moovit.app.navigation.MultiLegNavActivity) r0
            int r1 = com.moovit.app.navigation.MultiLegNavActivity.f39101S0
            boolean r1 = r0.f37311x
            if (r1 == 0) goto L_0x0145
            com.moovit.design.dialog.AlertDialogFragment$a r1 = new com.moovit.design.dialog.AlertDialogFragment$a
            android.content.res.Resources r2 = r0.getResources()
            r1.<init>((android.content.res.Resources) r2)
            r2 = 2131889384(0x7f120ce8, float:1.941343E38)
            com.moovit.design.dialog.AlertDialogFragment$a r1 = r1.mo47683l(r2)
            r2 = 2131889383(0x7f120ce7, float:1.9413428E38)
            com.moovit.design.dialog.AlertDialogFragment$a r1 = r1.mo47678g(r2)
            r2 = 2131887456(0x7f120560, float:1.940952E38)
            android.content.res.Resources r3 = r1.f41327a
            java.lang.CharSequence r2 = r3.getText(r2)
            java.lang.String r3 = "neutralButton"
            r1.mo47672a(r2, r3)
            com.moovit.design.dialog.AlertDialogFragment r1 = r1.mo47673b()
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
            java.lang.String r2 = "navigation_notifications_dialog"
            r1.show((androidx.fragment.app.FragmentManager) r0, (java.lang.String) r2)
        L_0x0145:
            return
        L_0x0146:
            java.lang.Object r0 = r10.f1588c
            com.moovit.app.home.dashboard.f r0 = (com.moovit.app.home.dashboard.C14940f) r0
            int r1 = com.moovit.app.home.dashboard.C14940f.f38219G
            r0.mo45152y2()
            return
        L_0x0150:
            java.lang.Object r0 = r10.f1588c
            nq.e r0 = (p684nq.C18584e) r0
            int r1 = p684nq.C18584e.f47313w
            r0.mo50978z2()
            return
        L_0x015a:
            java.lang.Object r0 = r10.f1588c
            com.google.android.exoplayer2.ui.z r0 = (com.google.android.exoplayer2.p052ui.C4060z) r0
            android.view.ViewGroup r3 = r0.f14525f
            if (r3 == 0) goto L_0x0236
            android.view.ViewGroup r3 = r0.f14526g
            if (r3 != 0) goto L_0x0168
            goto L_0x0236
        L_0x0168:
            com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r0.f14520a
            int r3 = r3.getWidth()
            com.google.android.exoplayer2.ui.StyledPlayerControlView r4 = r0.f14520a
            int r4 = r4.getPaddingLeft()
            int r3 = r3 - r4
            com.google.android.exoplayer2.ui.StyledPlayerControlView r4 = r0.f14520a
            int r4 = r4.getPaddingRight()
            int r3 = r3 - r4
        L_0x017c:
            android.view.ViewGroup r4 = r0.f14526g
            int r4 = r4.getChildCount()
            if (r4 <= r2) goto L_0x019d
            android.view.ViewGroup r4 = r0.f14526g
            int r4 = r4.getChildCount()
            int r4 = r4 + -2
            android.view.ViewGroup r5 = r0.f14526g
            android.view.View r5 = r5.getChildAt(r4)
            android.view.ViewGroup r6 = r0.f14526g
            r6.removeViewAt(r4)
            android.view.ViewGroup r4 = r0.f14525f
            r4.addView(r5, r1)
            goto L_0x017c
        L_0x019d:
            android.view.View r4 = r0.f14530k
            if (r4 == 0) goto L_0x01a6
            r5 = 8
            r4.setVisibility(r5)
        L_0x01a6:
            android.view.ViewGroup r4 = r0.f14528i
            int r4 = com.google.android.exoplayer2.p052ui.C4060z.m10921d(r4)
            android.view.ViewGroup r5 = r0.f14525f
            int r5 = r5.getChildCount()
            int r5 = r5 - r2
            r6 = 0
        L_0x01b4:
            if (r6 >= r5) goto L_0x01c4
            android.view.ViewGroup r7 = r0.f14525f
            android.view.View r7 = r7.getChildAt(r6)
            int r7 = com.google.android.exoplayer2.p052ui.C4060z.m10921d(r7)
            int r4 = r4 + r7
            int r6 = r6 + 1
            goto L_0x01b4
        L_0x01c4:
            if (r4 <= r3) goto L_0x021a
            android.view.View r6 = r0.f14530k
            if (r6 == 0) goto L_0x01d4
            r6.setVisibility(r1)
            android.view.View r6 = r0.f14530k
            int r6 = com.google.android.exoplayer2.p052ui.C4060z.m10921d(r6)
            int r4 = r4 + r6
        L_0x01d4:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
        L_0x01da:
            if (r7 >= r5) goto L_0x01f0
            android.view.ViewGroup r8 = r0.f14525f
            android.view.View r8 = r8.getChildAt(r7)
            int r9 = com.google.android.exoplayer2.p052ui.C4060z.m10921d(r8)
            int r4 = r4 - r9
            r6.add(r8)
            if (r4 > r3) goto L_0x01ed
            goto L_0x01f0
        L_0x01ed:
            int r7 = r7 + 1
            goto L_0x01da
        L_0x01f0:
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L_0x0236
            android.view.ViewGroup r3 = r0.f14525f
            int r4 = r6.size()
            r3.removeViews(r1, r4)
        L_0x01ff:
            int r3 = r6.size()
            if (r1 >= r3) goto L_0x0236
            android.view.ViewGroup r3 = r0.f14526g
            int r3 = r3.getChildCount()
            int r3 = r3 - r2
            android.view.ViewGroup r4 = r0.f14526g
            java.lang.Object r5 = r6.get(r1)
            android.view.View r5 = (android.view.View) r5
            r4.addView(r5, r3)
            int r1 = r1 + 1
            goto L_0x01ff
        L_0x021a:
            android.view.ViewGroup r1 = r0.f14527h
            if (r1 == 0) goto L_0x0236
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0236
            android.animation.ValueAnimator r1 = r0.f14537r
            boolean r1 = r1.isStarted()
            if (r1 != 0) goto L_0x0236
            android.animation.ValueAnimator r1 = r0.f14536q
            r1.cancel()
            android.animation.ValueAnimator r0 = r0.f14537r
            r0.start()
        L_0x0236:
            return
        L_0x0237:
            java.lang.Object r0 = r10.f1588c
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = (com.google.android.exoplayer2.p052ui.StyledPlayerControlView) r0
            int r1 = com.google.android.exoplayer2.p052ui.StyledPlayerControlView.f14287O0
            r0.mo16539o()
            return
        L_0x0241:
            java.lang.Object r0 = r10.f1588c
            com.google.android.exoplayer2.drm.DefaultDrmSession r0 = (com.google.android.exoplayer2.drm.DefaultDrmSession) r0
            r0.mo15954c(r3)
            return
        L_0x0249:
            java.lang.Object r0 = r10.f1588c
            com.cubic.umo.ad.ext.interfaces.UMOAdKitBannerView r0 = (com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView) r0
            com.cubic.umo.ad.ext.interfaces.UMOAdKitBannerView$Companion r1 = com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView.f7241i
            mf0.C24362h.m61211f(r0, r4)
            android.widget.FrameLayout r1 = r0.f7245e
            if (r1 == 0) goto L_0x027b
            android.view.ViewParent r2 = r1.getParent()
            if (r2 == 0) goto L_0x0278
            android.view.ViewParent r2 = r1.getParent()
            boolean r2 = r2 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0278
            android.view.ViewParent r2 = r1.getParent()
            if (r2 == 0) goto L_0x0270
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r2.removeView(r1)
            goto L_0x0278
        L_0x0270:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup"
            r0.<init>(r1)
            throw r0
        L_0x0278:
            r0.addView(r1)
        L_0x027b:
            return
        L_0x027c:
            java.lang.Object r0 = r10.f1588c
            com.appboy.Appboy r0 = (com.appboy.Appboy) r0
            r0.m5421i()
            return
        L_0x0284:
            java.lang.Object r0 = r10.f1588c
            bo.app.e3 r0 = (p030bo.app.C1566e3) r0
            r0.m4139c()
            return
        L_0x028c:
            java.lang.Object r0 = r10.f1588c
            androidx.room.b r0 = (androidx.room.C1257b) r0
            r0.getClass()
            java.util.Collections.emptyList()
            r0 = 0
            throw r0
        L_0x0298:
            java.lang.Object r0 = r10.f1588c
            androidx.camera.core.impl.DeferrableSurface r0 = (androidx.camera.core.impl.DeferrableSurface) r0
            java.util.ArrayList r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.f1745o
            r1.remove(r0)
            return
        L_0x02a2:
            java.lang.Object r0 = r10.f1588c
            x.q r0 = (p304x.C7090q) r0
            c0.c r1 = r0.f22046m
            c0.b r1 = r1.f6152h
            r0.mo23326c(r1)
            return
        L_0x02ae:
            java.lang.Object r0 = r10.f1588c
            androidx.appcompat.widget.o1 r0 = (androidx.appcompat.widget.C0444o1) r0
            r0.mo2173a()
            return
        L_0x02b6:
            java.lang.Object r0 = r10.f1588c
            com.veriff.sdk.camera.core.impl.CameraStateRegistry$OnOpenAvailableListener r0 = (com.veriff.sdk.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener) r0
            r0.onOpenAvailable()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0441n1.run():void");
    }
}
