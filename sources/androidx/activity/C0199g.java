package androidx.activity;

/* renamed from: androidx.activity.g */
public final /* synthetic */ class C0199g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f522b;

    /* renamed from: c */
    public final /* synthetic */ Object f523c;

    public /* synthetic */ C0199g(Object obj, int i) {
        this.f522b = i;
        this.f523c = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x026d, code lost:
        if (r1 == null) goto L_0x026f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.f522b
            r1 = 0
            r2 = 1
            r3 = 2
            r4 = -1
            switch(r0) {
                case 0: goto L_0x03fd;
                case 1: goto L_0x03f3;
                case 2: goto L_0x03eb;
                case 3: goto L_0x03b9;
                case 4: goto L_0x03ad;
                case 5: goto L_0x03a5;
                case 6: goto L_0x039d;
                case 7: goto L_0x0393;
                case 8: goto L_0x038b;
                case 9: goto L_0x02b6;
                case 10: goto L_0x016d;
                case 11: goto L_0x0165;
                case 12: goto L_0x015b;
                case 13: goto L_0x012e;
                case 14: goto L_0x00e9;
                case 15: goto L_0x000a;
                case 16: goto L_0x00df;
                case 17: goto L_0x00d5;
                case 18: goto L_0x00c1;
                case 19: goto L_0x0024;
                case 20: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0405
        L_0x000c:
            java.lang.Object r0 = r14.f523c
            lc0.c r0 = (lc0.C12860c) r0
            java.lang.String r1 = "$it"
            mf0.C24362h.m61211f(r0, r1)
            r0.stopLoading()
            java.lang.String r1 = ""
            r0.loadUrl(r1)
            r0.clearView()
            r0.clearHistory()
            return
        L_0x0024:
            java.lang.Object r0 = r14.f523c
            yb0.i r0 = (yb0.C13308i) r0
            java.lang.String r2 = "this$0"
            mf0.C24362h.m61211f(r0, r2)
            android.view.View r2 = r0.f33046m
            if (r2 != 0) goto L_0x0033
            goto L_0x0042
        L_0x0033:
            android.graphics.Rect r3 = new android.graphics.Rect
            int r4 = r2.getWidth()
            int r2 = r2.getHeight()
            r3.<init>(r1, r1, r4, r2)
            r0.f33042i = r3
        L_0x0042:
            java.util.Timer r2 = r0.f33043j
            if (r2 == 0) goto L_0x0064
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.f33036c
            r2.append(r3)
            java.lang.String r3 = "_VIEWABILITY: Timer already running"
            r2.append(r3)
            java.lang.String r0 = r0.f33047n
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.mo6666c(r0)
            goto L_0x00c0
        L_0x0064:
            java.lang.String r2 = "AKViewabilityTimer["
            java.lang.StringBuilder r2 = ce0.C21100e.m49315J0(r2)
            java.lang.String r3 = r0.f33034a
            r2.append(r3)
            java.lang.String r3 = "]_"
            r2.append(r3)
            java.lang.String r3 = r0.f33036c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.util.Timer r3 = new java.util.Timer
            r3.<init>(r2, r1)
            r0.f33043j = r3
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.f33036c
            r2.append(r3)
            java.lang.String r3 = "_VIEWABILITY: Starting Repeating Timer"
            r2.append(r3)
            java.lang.String r3 = r0.f33047n
            r2.append(r3)
            java.lang.String r3 = ": ["
            r2.append(r3)
            long r3 = r0.f33044k
            r2.append(r3)
            java.lang.String r3 = " milliseconds]..."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.mo6672i(r2)
            java.util.Timer r3 = r0.f33043j
            if (r3 != 0) goto L_0x00b5
            goto L_0x00c0
        L_0x00b5:
            long r7 = r0.f33044k
            yb0.j r4 = new yb0.j
            r4.<init>(r0)
            r5 = r7
            r3.schedule(r4, r5, r7)
        L_0x00c0:
            return
        L_0x00c1:
            java.lang.Object r0 = r14.f523c
            xa0.f r0 = (xa0.C13250f) r0
            android.view.View r1 = r0.f32878b
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L_0x00d4
            android.view.ViewGroup r1 = r0.f32893q
            android.view.View r0 = r0.f32878b
            r1.removeView(r0)
        L_0x00d4:
            return
        L_0x00d5:
            java.lang.Object r0 = r14.f523c
            r60.a r0 = (r60.C19229a) r0
            android.widget.EditText r0 = r0.f48837y
            com.moovit.commons.utils.UiUtils.m40239G(r0)
            return
        L_0x00df:
            java.lang.Object r0 = r14.f523c
            com.moovit.map.MapFragmentView r0 = (com.moovit.map.MapFragmentView) r0
            int r1 = com.moovit.map.MapFragmentView.f42425q
            r0.mo48687c()
            return
        L_0x00e9:
            java.lang.Object r0 = r14.f523c
            com.moovit.app.linedetail.ui.SelectFavoriteLineStopsActivity r0 = (com.moovit.app.linedetail.p416ui.SelectFavoriteLineStopsActivity) r0
            int r2 = com.moovit.app.linedetail.p416ui.SelectFavoriteLineStopsActivity.f38796p0
            r0.getClass()
            com.moovit.design.dialog.AlertDialogFragment$a r2 = new com.moovit.design.dialog.AlertDialogFragment$a
            r2.<init>((android.content.Context) r0)
            r3 = 2131231769(0x7f080419, float:1.8079628E38)
            r2.mo47676e(r3, r1)
            r1 = 2131887309(0x7f1204cd, float:1.9409221E38)
            com.moovit.design.dialog.AlertDialogFragment$a r1 = r2.mo47683l(r1)
            r2 = 2131887308(0x7f1204cc, float:1.940922E38)
            com.moovit.design.dialog.AlertDialogFragment$a r1 = r1.mo47678g(r2)
            r2 = 2131887002(0x7f12039a, float:1.9408599E38)
            com.moovit.design.dialog.AlertDialogFragment$a r1 = r1.mo47681j(r2)
            com.moovit.design.dialog.AlertDialogFragment r1 = r1.mo47673b()
            androidx.fragment.app.FragmentManager r2 = r0.getSupportFragmentManager()
            java.lang.String r3 = "favorite_line_added_pop_up_tag"
            r1.show((androidx.fragment.app.FragmentManager) r2, (java.lang.String) r3)
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.EDUCATIONAL_POPUP_SHOWN
            r1.<init>(r2)
            hq.b r1 = r1.mo49933a()
            r0.mo44545v2(r1)
            return
        L_0x012e:
            java.lang.Object r0 = r14.f523c
            com.moovit.app.intro.onboarding.OnboardingFragment r0 = (com.moovit.app.intro.onboarding.OnboardingFragment) r0
            com.moovit.commons.view.pager.ViewPager r1 = r0.f38464q
            if (r1 != 0) goto L_0x0137
            goto L_0x015a
        L_0x0137:
            androidx.viewpager.widget.PagerAdapter r1 = r1.getAdapter()
            if (r1 != 0) goto L_0x013e
            goto L_0x015a
        L_0x013e:
            com.moovit.commons.view.pager.ViewPager r3 = r0.f38464q
            int r3 = r3.getCurrentItem()
            int r3 = r3 + r2
            int r1 = r1.getCount()
            if (r3 != r1) goto L_0x014c
            goto L_0x015a
        L_0x014c:
            com.moovit.commons.view.pager.ViewPager r1 = r0.f38464q
            r1.setCurrentItem(r3, r2)
            com.moovit.commons.view.pager.ViewPager r1 = r0.f38464q
            androidx.activity.g r0 = r0.f38461n
            r2 = 5500(0x157c, double:2.7174E-320)
            r1.postDelayed(r0, r2)
        L_0x015a:
            return
        L_0x015b:
            java.lang.Object r0 = r14.f523c
            nt.e r0 = (p687nt.C18595e) r0
            android.view.View r0 = r0.f47356g
            r0.setVisibility(r1)
            return
        L_0x0165:
            java.lang.Object r0 = r14.f523c
            js.d r0 = (p591js.C17923d) r0
            r0.dismissAllowingStateLoss()
            return
        L_0x016d:
            java.lang.Object r0 = r14.f523c
            rf.d r0 = (p766rf.C19260d) r0
            qd.d r3 = r0.f48938e
            r3.mo51535a()
            android.content.Context r3 = r3.f48568a
            r0.f48944k = r3
            java.lang.String r3 = r3.getPackageName()
            r0.f48949p = r3
            jf.a r3 = p578jf.C17823a.m44161e()
            r0.f48945l = r3
            rf.c r3 = new rf.c
            android.content.Context r6 = r0.f48944k
            sf.c r13 = new sf.c
            r9 = 100
            r11 = 1
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MINUTES
            r7 = r13
            r7.<init>(r8, r9, r11)
            r3.<init>(r6, r13)
            r0.f48946m = r3
            if.a r3 = p556if.C17592a.m43719a()
            r0.f48947n = r3
            rf.a r3 = new rf.a
            ze.b<r9.f> r6 = r0.f48941h
            jf.a r7 = r0.f48945l
            r7.getClass()
            com.google.firebase.perf.config.ConfigurationConstants$LogSourceName r8 = com.google.firebase.perf.config.ConfigurationConstants$LogSourceName.f36618b
            java.lang.Class<com.google.firebase.perf.config.ConfigurationConstants$LogSourceName> r8 = com.google.firebase.perf.config.ConfigurationConstants$LogSourceName.class
            monitor-enter(r8)
            com.google.firebase.perf.config.ConfigurationConstants$LogSourceName r9 = com.google.firebase.perf.config.ConfigurationConstants$LogSourceName.f36618b     // Catch:{ all -> 0x02b3 }
            if (r9 != 0) goto L_0x01ba
            com.google.firebase.perf.config.ConfigurationConstants$LogSourceName r9 = new com.google.firebase.perf.config.ConfigurationConstants$LogSourceName     // Catch:{ all -> 0x02b3 }
            r9.<init>()     // Catch:{ all -> 0x02b3 }
            com.google.firebase.perf.config.ConfigurationConstants$LogSourceName.f36618b = r9     // Catch:{ all -> 0x02b3 }
        L_0x01ba:
            com.google.firebase.perf.config.ConfigurationConstants$LogSourceName r9 = com.google.firebase.perf.config.ConfigurationConstants$LogSourceName.f36618b     // Catch:{ all -> 0x02b3 }
            monitor-exit(r8)
            java.lang.Boolean r8 = p532hf.C17426a.f44884a
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x01cb
            r9.getClass()
            java.lang.String r4 = "FIREPERF"
            goto L_0x0213
        L_0x01cb:
            r9.getClass()
            java.lang.String r8 = "fpr_log_source"
            com.google.firebase.perf.config.RemoteConfigManager r10 = r7.f45790a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r4 = r10.getRemoteConfigValueOrDefault(r8, r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            java.lang.String r8 = "com.google.firebase.perf.LogSourceName"
            java.util.Map<java.lang.Long, java.lang.String> r10 = com.google.firebase.perf.config.ConfigurationConstants$LogSourceName.f36619c
            java.lang.Long r11 = java.lang.Long.valueOf(r4)
            boolean r11 = r10.containsKey(r11)
            if (r11 == 0) goto L_0x0200
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r4 = r10.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0200
            jf.t r5 = r7.f45792c
            r5.mo50420e(r8, r4)
            goto L_0x0213
        L_0x0200:
            sf.b r4 = r7.mo50407d(r9)
            boolean r5 = r4.mo51862b()
            if (r5 == 0) goto L_0x0211
            java.lang.Object r4 = r4.mo51861a()
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0213
        L_0x0211:
            java.lang.String r4 = "FIREPERF"
        L_0x0213:
            r3.<init>(r6, r4)
            r0.f48942i = r3
            if.a r3 = r0.f48947n
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            rf.d r5 = p766rf.C19260d.f48934t
            r4.<init>(r5)
            java.util.HashSet r5 = r3.f45250g
            monitor-enter(r5)
            java.util.HashSet r3 = r3.f45250g     // Catch:{ all -> 0x02b0 }
            r3.add(r4)     // Catch:{ all -> 0x02b0 }
            monitor-exit(r5)     // Catch:{ all -> 0x02b0 }
            com.google.firebase.perf.v1.c$b r3 = com.google.firebase.perf.p414v1.C14510c.m36144E()
            r0.f48948o = r3
            qd.d r4 = r0.f48938e
            r4.mo51535a()
            qd.f r4 = r4.f48570c
            java.lang.String r4 = r4.f48582b
            r3.mo43956p()
            MessageType r5 = r3.f36809c
            com.google.firebase.perf.v1.c r5 = (com.google.firebase.perf.p414v1.C14510c) r5
            com.google.firebase.perf.p414v1.C14510c.m36146t(r5, r4)
            com.google.firebase.perf.v1.a$b r4 = com.google.firebase.perf.p414v1.C14504a.m36135z()
            java.lang.String r5 = r0.f48949p
            r4.mo43956p()
            MessageType r6 = r4.f36809c
            com.google.firebase.perf.v1.a r6 = (com.google.firebase.perf.p414v1.C14504a) r6
            com.google.firebase.perf.p414v1.C14504a.m36131t(r6, r5)
            r4.mo43956p()
            MessageType r5 = r4.f36809c
            com.google.firebase.perf.v1.a r5 = (com.google.firebase.perf.p414v1.C14504a) r5
            com.google.firebase.perf.p414v1.C14504a.m36132u(r5)
            android.content.Context r5 = r0.f48944k
            android.content.pm.PackageManager r6 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x026f }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x026f }
            android.content.pm.PackageInfo r1 = r6.getPackageInfo(r5, r1)     // Catch:{ NameNotFoundException -> 0x026f }
            java.lang.String r1 = r1.versionName     // Catch:{ NameNotFoundException -> 0x026f }
            if (r1 != 0) goto L_0x0271
        L_0x026f:
            java.lang.String r1 = ""
        L_0x0271:
            r4.mo43956p()
            MessageType r5 = r4.f36809c
            com.google.firebase.perf.v1.a r5 = (com.google.firebase.perf.p414v1.C14504a) r5
            com.google.firebase.perf.p414v1.C14504a.m36133v(r5, r1)
            r3.mo43956p()
            MessageType r1 = r3.f36809c
            com.google.firebase.perf.v1.c r1 = (com.google.firebase.perf.p414v1.C14510c) r1
            com.google.protobuf.GeneratedMessageLite r3 = r4.mo43954m()
            com.google.firebase.perf.v1.a r3 = (com.google.firebase.perf.p414v1.C14504a) r3
            com.google.firebase.perf.p414v1.C14510c.m36150x(r1, r3)
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f48937d
            r1.set(r2)
        L_0x0290:
            java.util.concurrent.ConcurrentLinkedQueue<rf.b> r1 = r0.f48936c
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x02af
            java.util.concurrent.ConcurrentLinkedQueue<rf.b> r1 = r0.f48936c
            java.lang.Object r1 = r1.poll()
            rf.b r1 = (p766rf.C19257b) r1
            if (r1 == 0) goto L_0x0290
            java.util.concurrent.ThreadPoolExecutor r2 = r0.f48943j
            x.r r3 = new x.r
            r4 = 15
            r3.<init>(r4, r0, r1)
            r2.execute(r3)
            goto L_0x0290
        L_0x02af:
            return
        L_0x02b0:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x02b0 }
            throw r0
        L_0x02b3:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x02b6:
            java.lang.Object r0 = r14.f523c
            com.google.firebase.perf.metrics.AppStartTrace r0 = (com.google.firebase.perf.metrics.AppStartTrace) r0
            com.google.firebase.perf.metrics.AppStartTrace r1 = com.google.firebase.perf.metrics.AppStartTrace.f36621n
            r0.getClass()
            com.google.firebase.perf.v1.i$b r1 = com.google.firebase.perf.p414v1.C14530i.m36217M()
            com.google.firebase.perf.util.Constants$TraceNames r2 = com.google.firebase.perf.util.Constants$TraceNames.APP_START_TRACE_NAME
            java.lang.String r2 = r2.toString()
            r1.mo43581t(r2)
            com.google.firebase.perf.util.Timer r2 = r0.f36628g
            long r2 = r2.f36654b
            r1.mo43579r(r2)
            com.google.firebase.perf.util.Timer r2 = r0.f36628g
            com.google.firebase.perf.util.Timer r3 = r0.f36631j
            long r2 = r2.mo43520c(r3)
            r1.mo43580s(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 3
            r2.<init>(r3)
            com.google.firebase.perf.v1.i$b r4 = com.google.firebase.perf.p414v1.C14530i.m36217M()
            com.google.firebase.perf.util.Constants$TraceNames r5 = com.google.firebase.perf.util.Constants$TraceNames.ON_CREATE_TRACE_NAME
            java.lang.String r5 = r5.toString()
            r4.mo43581t(r5)
            com.google.firebase.perf.util.Timer r5 = r0.f36628g
            long r5 = r5.f36654b
            r4.mo43579r(r5)
            com.google.firebase.perf.util.Timer r5 = r0.f36628g
            com.google.firebase.perf.util.Timer r6 = r0.f36629h
            long r5 = r5.mo43520c(r6)
            r4.mo43580s(r5)
            com.google.protobuf.GeneratedMessageLite r4 = r4.mo43954m()
            com.google.firebase.perf.v1.i r4 = (com.google.firebase.perf.p414v1.C14530i) r4
            r2.add(r4)
            com.google.firebase.perf.v1.i$b r4 = com.google.firebase.perf.p414v1.C14530i.m36217M()
            com.google.firebase.perf.util.Constants$TraceNames r5 = com.google.firebase.perf.util.Constants$TraceNames.ON_START_TRACE_NAME
            java.lang.String r5 = r5.toString()
            r4.mo43581t(r5)
            com.google.firebase.perf.util.Timer r5 = r0.f36629h
            long r5 = r5.f36654b
            r4.mo43579r(r5)
            com.google.firebase.perf.util.Timer r5 = r0.f36629h
            com.google.firebase.perf.util.Timer r6 = r0.f36630i
            long r5 = r5.mo43520c(r6)
            r4.mo43580s(r5)
            com.google.protobuf.GeneratedMessageLite r4 = r4.mo43954m()
            com.google.firebase.perf.v1.i r4 = (com.google.firebase.perf.p414v1.C14530i) r4
            r2.add(r4)
            com.google.firebase.perf.v1.i$b r4 = com.google.firebase.perf.p414v1.C14530i.m36217M()
            com.google.firebase.perf.util.Constants$TraceNames r5 = com.google.firebase.perf.util.Constants$TraceNames.ON_RESUME_TRACE_NAME
            java.lang.String r5 = r5.toString()
            r4.mo43581t(r5)
            com.google.firebase.perf.util.Timer r5 = r0.f36630i
            long r5 = r5.f36654b
            r4.mo43579r(r5)
            com.google.firebase.perf.util.Timer r5 = r0.f36630i
            com.google.firebase.perf.util.Timer r6 = r0.f36631j
            long r5 = r5.mo43520c(r6)
            r4.mo43580s(r5)
            com.google.protobuf.GeneratedMessageLite r4 = r4.mo43954m()
            com.google.firebase.perf.v1.i r4 = (com.google.firebase.perf.p414v1.C14530i) r4
            r2.add(r4)
            r1.mo43956p()
            MessageType r4 = r1.f36809c
            com.google.firebase.perf.v1.i r4 = (com.google.firebase.perf.p414v1.C14530i) r4
            com.google.firebase.perf.p414v1.C14530i.m36222w(r4, r2)
            com.google.firebase.perf.session.PerfSession r2 = r0.f36632k
            com.google.firebase.perf.v1.h r2 = r2.mo43491b()
            r1.mo43956p()
            MessageType r4 = r1.f36809c
            com.google.firebase.perf.v1.i r4 = (com.google.firebase.perf.p414v1.C14530i) r4
            com.google.firebase.perf.p414v1.C14530i.m36224y(r4, r2)
            rf.d r0 = r0.f36624c
            com.google.protobuf.GeneratedMessageLite r1 = r1.mo43954m()
            com.google.firebase.perf.v1.i r1 = (com.google.firebase.perf.p414v1.C14530i) r1
            com.google.firebase.perf.v1.ApplicationProcessState r2 = com.google.firebase.perf.p414v1.ApplicationProcessState.FOREGROUND_BACKGROUND
            java.util.concurrent.ThreadPoolExecutor r4 = r0.f48943j
            k5.d r5 = new k5.d
            r5.<init>(r3, r0, r1, r2)
            r4.execute(r5)
            return
        L_0x038b:
            java.lang.Object r0 = r14.f523c
            com.google.android.exoplayer2.ui.z r0 = (com.google.android.exoplayer2.p052ui.C4060z) r0
            r0.mo16679i(r3)
            return
        L_0x0393:
            java.lang.Object r0 = r14.f523c
            com.facebook.internal.r$a r0 = (com.facebook.internal.C2427r.C2428a) r0
            com.facebook.internal.r r1 = com.facebook.internal.C2427r.f8702a
            r0.onCompleted()
            return
        L_0x039d:
            java.lang.Object r0 = r14.f523c
            com.appboy.ui.AppboyFeedFragment r0 = (com.appboy.p044ui.AppboyFeedFragment) r0
            r0.lambda$onRefresh$5()
            return
        L_0x03a5:
            java.lang.Object r0 = r14.f523c
            com.appboy.Appboy r0 = (com.appboy.Appboy) r0
            r0.m5410d()
            return
        L_0x03ad:
            java.lang.Object r0 = r14.f523c
            androidx.room.b r0 = (androidx.room.C1257b) r0
            r0.getClass()
            java.util.Collections.emptyList()
            r0 = 0
            throw r0
        L_0x03b9:
            java.lang.Object r0 = r14.f523c
            androidx.core.widget.ContentLoadingProgressBar r0 = (androidx.core.widget.ContentLoadingProgressBar) r0
            r0.f3357e = r2
            x.m r3 = r0.f3359g
            r0.removeCallbacks(r3)
            r0.f3356d = r1
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r0.f3354b
            long r6 = r6 - r8
            r10 = 500(0x1f4, double:2.47E-321)
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r1 >= 0) goto L_0x03e5
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x03d8
            goto L_0x03e5
        L_0x03d8:
            boolean r1 = r0.f3355c
            if (r1 != 0) goto L_0x03ea
            d0.a1 r1 = r0.f3358f
            long r10 = r10 - r6
            r0.postDelayed(r1, r10)
            r0.f3355c = r2
            goto L_0x03ea
        L_0x03e5:
            r1 = 8
            r0.setVisibility(r1)
        L_0x03ea:
            return
        L_0x03eb:
            java.lang.Object r0 = r14.f523c
            androidx.camera.camera2.internal.m r0 = (androidx.camera.camera2.internal.C0522m) r0
            r0.mo2301k(r0)
            return
        L_0x03f3:
            java.lang.Object r0 = r14.f523c
            x.f0$c r0 = (p304x.C7045f0.C7048c) r0
            x.f0$c$a r0 = r0.f21931h
            r0.mo23305c()
            return
        L_0x03fd:
            java.lang.Object r0 = r14.f523c
            androidx.activity.h r0 = (androidx.activity.C0200h) r0
            androidx.activity.C0200h.m336a(r0)
            return
        L_0x0405:
            java.lang.Object r0 = r14.f523c
            kc0.i r0 = (kc0.C12844i) r0
            int r4 = kc0.C12844i.f31735I
            java.lang.String r4 = "this$0"
            mf0.C24362h.m61211f(r0, r4)
            android.content.Context r4 = r0.getContext()
            r5 = 0
            if (r4 != 0) goto L_0x0419
            goto L_0x041e
        L_0x0419:
            boolean r6 = r4 instanceof android.app.Activity
            if (r6 == 0) goto L_0x041e
            goto L_0x041f
        L_0x041e:
            r4 = r5
        L_0x041f:
            android.app.Activity r4 = (android.app.Activity) r4
            if (r4 != 0) goto L_0x0432
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a
            java.lang.String r0 = r0.f31743H
            java.lang.String r2 = "Cannot force MRAID Orientation as Activity is null"
            java.lang.String r0 = mf0.C24362h.m61216k(r0, r2)
            r1.mo6667d(r0)
            goto L_0x0511
        L_0x0432:
            fc0.a r6 = r0.f31755m
            if (r6 != 0) goto L_0x0437
            goto L_0x043c
        L_0x0437:
            fc0.c r6 = r6.f31312f
            if (r6 == 0) goto L_0x0512
            r5 = r6
        L_0x043c:
            if (r5 != 0) goto L_0x044d
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a
            java.lang.String r0 = r0.f31743H
            java.lang.String r2 = "Cannot force MRAID Orientation as Orientation properties looks Invalid"
            java.lang.String r0 = mf0.C24362h.m61216k(r0, r2)
            r1.mo6667d(r0)
            goto L_0x0511
        L_0x044d:
            com.umo.ads.u.zzp r6 = r5.f31320b
            java.lang.String r7 = "forceOrientation"
            mf0.C24362h.m61211f(r6, r7)
            android.content.pm.PackageManager r7 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x04a6 }
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x04a6 }
            java.lang.Class r9 = r4.getClass()     // Catch:{ NameNotFoundException -> 0x04a6 }
            r8.<init>(r4, r9)     // Catch:{ NameNotFoundException -> 0x04a6 }
            android.content.pm.ActivityInfo r7 = r7.getActivityInfo(r8, r1)     // Catch:{ NameNotFoundException -> 0x04a6 }
            java.lang.String r8 = "{\n            activity.p….javaClass), 0)\n        }"
            mf0.C24362h.m61210e(r7, r8)     // Catch:{ NameNotFoundException -> 0x04a6 }
            int r8 = r7.screenOrientation
            r9 = -1
            if (r8 == r9) goto L_0x0476
            int r6 = r6.zza
            if (r8 != r6) goto L_0x04a6
            r6 = 1
            goto L_0x04a7
        L_0x0476:
            int r6 = r7.configChanges
            r7 = r6 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x047e
            r7 = 1
            goto L_0x047f
        L_0x047e:
            r7 = 0
        L_0x047f:
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x0485
            r6 = 1
            goto L_0x0486
        L_0x0485:
            r6 = 0
        L_0x0486:
            ch.qos.logback.classic.Logger r8 = ac0.C7557a.f23040a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "canForceOrientation(): isOrientationPresent: "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r10 = ", isScreenSizePresent: "
            r9.append(r10)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            r8.mo6666c(r9)
            r6 = r6 & r7
            goto L_0x04a7
        L_0x04a6:
            r6 = 0
        L_0x04a7:
            if (r6 != 0) goto L_0x04b7
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a
            java.lang.String r0 = r0.f31743H
            java.lang.String r2 = "Cannot force MRAID Orientation as Forcing Orientation on Activity is not Possible"
            java.lang.String r0 = mf0.C24362h.m61216k(r0, r2)
            r1.mo6667d(r0)
            goto L_0x0511
        L_0x04b7:
            ch.qos.logback.classic.Logger r6 = ac0.C7557a.f23040a
            java.lang.String r7 = "Forcing MRAID Orientation"
            java.lang.StringBuilder r7 = ce0.C21100e.m49315J0(r7)
            java.lang.String r8 = r0.f31743H
            r7.append(r8)
            java.lang.String r8 = ": "
            r7.append(r8)
            com.umo.ads.u.zzp r8 = r5.f31320b
            java.lang.String r8 = r8.name()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.mo6672i(r7)
            int r6 = r0.f31767y
            int r7 = r0.f31766x
            if (r6 != r7) goto L_0x04e5
            int r6 = r4.getRequestedOrientation()
            r0.f31767y = r6
        L_0x04e5:
            com.umo.ads.u.zzp r0 = r5.f31320b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x04f4
            if (r0 == r2) goto L_0x04f0
            goto L_0x04f7
        L_0x04f0:
            r4.setRequestedOrientation(r1)
            goto L_0x04f7
        L_0x04f4:
            r4.setRequestedOrientation(r2)
        L_0x04f7:
            boolean r0 = r5.f31319a
            if (r0 != r2) goto L_0x04fd
            r1 = 4
            goto L_0x050e
        L_0x04fd:
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            if (r0 == r2) goto L_0x050d
            if (r0 == r3) goto L_0x050e
            r1 = 5
            goto L_0x050e
        L_0x050d:
            r1 = 1
        L_0x050e:
            r4.setRequestedOrientation(r1)
        L_0x0511:
            return
        L_0x0512:
            java.lang.String r0 = "orientationProps"
            mf0.C24362h.m61217l(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.C0199g.run():void");
    }
}
