package p032c0;

/* renamed from: c0.a */
public final /* synthetic */ class C1751a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f6141b;

    /* renamed from: c */
    public final /* synthetic */ boolean f6142c;

    /* renamed from: d */
    public final /* synthetic */ Object f6143d;

    public /* synthetic */ C1751a(int i, Object obj, boolean z) {
        this.f6141b = i;
        this.f6143d = obj;
        this.f6142c = z;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:858)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.f6141b
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0011;
                case 1: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x0045
        L_0x0007:
            java.lang.Object r0 = r8.f6143d
            com.appboy.Appboy r0 = (com.appboy.Appboy) r0
            boolean r1 = r8.f6142c
            r0.m5395a((boolean) r1)
            return
        L_0x0011:
            java.lang.Object r0 = r8.f6143d
            c0.c r0 = (p032c0.C1753c) r0
            boolean r2 = r8.f6142c
            boolean r3 = r0.f6145a
            if (r3 != r2) goto L_0x001c
            goto L_0x0044
        L_0x001c:
            r0.f6145a = r2
            if (r2 == 0) goto L_0x0033
            boolean r2 = r0.f6146b
            if (r2 == 0) goto L_0x0044
            x.q r2 = r0.f6147c
            java.util.concurrent.Executor r3 = r2.f22036c
            x.m r4 = new x.m
            r4.<init>(r2, r1)
            r3.execute(r4)
            r0.f6146b = r1
            goto L_0x0044
        L_0x0033:
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.lang.Void> r1 = r0.f6151g
            if (r1 == 0) goto L_0x0044
            androidx.camera.core.CameraControl$OperationCanceledException r2 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r3 = "The camera control has became inactive."
            r2.<init>(r3)
            r1.mo2698c(r2)
            r1 = 0
            r0.f6151g = r1
        L_0x0044:
            return
        L_0x0045:
            java.lang.Object r0 = r8.f6143d
            com.google.firebase.installations.a r0 = (com.google.firebase.installations.C14459a) r0
            boolean r2 = r8.f6142c
            java.lang.Object r3 = com.google.firebase.installations.C14459a.f36530m
            r0.getClass()
            java.lang.Object r3 = com.google.firebase.installations.C14459a.f36530m
            monitor-enter(r3)
            qd.d r4 = r0.f36532a     // Catch:{ all -> 0x0141 }
            r4.mo51535a()     // Catch:{ all -> 0x0141 }
            android.content.Context r4 = r4.f48568a     // Catch:{ all -> 0x0141 }
            dd.c r4 = p434dd.C16545c.m42048a(r4)     // Catch:{ all -> 0x0141 }
            com.google.firebase.installations.local.PersistedInstallation r5 = r0.f36534c     // Catch:{ all -> 0x013a }
            com.google.firebase.installations.local.a r5 = r5.mo43375c()     // Catch:{ all -> 0x013a }
            if (r4 == 0) goto L_0x0069
            r4.mo49324b()     // Catch:{ all -> 0x0141 }
        L_0x0069:
            monitor-exit(r3)     // Catch:{ all -> 0x0141 }
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r4 = r5.mo43382f()     // Catch:{ FirebaseInstallationsException -> 0x0091 }
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r6 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.REGISTER_ERROR     // Catch:{ FirebaseInstallationsException -> 0x0091 }
            r7 = 1
            if (r4 != r6) goto L_0x0075
            r4 = 1
            goto L_0x0076
        L_0x0075:
            r4 = 0
        L_0x0076:
            if (r4 != 0) goto L_0x0099
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r4 = r5.mo43382f()     // Catch:{ FirebaseInstallationsException -> 0x0091 }
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r6 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.UNREGISTERED     // Catch:{ FirebaseInstallationsException -> 0x0091 }
            if (r4 != r6) goto L_0x0082
            r4 = 1
            goto L_0x0083
        L_0x0082:
            r4 = 0
        L_0x0083:
            if (r4 == 0) goto L_0x0086
            goto L_0x0099
        L_0x0086:
            if (r2 != 0) goto L_0x0094
            af.j r2 = r0.f36535d     // Catch:{ FirebaseInstallationsException -> 0x0091 }
            boolean r2 = r2.mo40319a(r5)     // Catch:{ FirebaseInstallationsException -> 0x0091 }
            if (r2 == 0) goto L_0x0139
            goto L_0x0094
        L_0x0091:
            r1 = move-exception
            goto L_0x0136
        L_0x0094:
            com.google.firebase.installations.local.a r2 = r0.mo43366b(r5)     // Catch:{ FirebaseInstallationsException -> 0x0091 }
            goto L_0x009d
        L_0x0099:
            com.google.firebase.installations.local.a r2 = r0.mo43369e(r5)     // Catch:{ FirebaseInstallationsException -> 0x0091 }
        L_0x009d:
            monitor-enter(r3)
            qd.d r4 = r0.f36532a     // Catch:{ all -> 0x0133 }
            r4.mo51535a()     // Catch:{ all -> 0x0133 }
            android.content.Context r4 = r4.f48568a     // Catch:{ all -> 0x0133 }
            dd.c r4 = p434dd.C16545c.m42048a(r4)     // Catch:{ all -> 0x0133 }
            com.google.firebase.installations.local.PersistedInstallation r6 = r0.f36534c     // Catch:{ all -> 0x012c }
            r6.mo43374b(r2)     // Catch:{ all -> 0x012c }
            if (r4 == 0) goto L_0x00b3
            r4.mo49324b()     // Catch:{ all -> 0x0133 }
        L_0x00b3:
            monitor-exit(r3)     // Catch:{ all -> 0x0133 }
            monitor-enter(r0)
            java.util.HashSet r3 = r0.f36542k     // Catch:{ all -> 0x0129 }
            int r3 = r3.size()     // Catch:{ all -> 0x0129 }
            if (r3 == 0) goto L_0x00dd
            java.lang.String r3 = r5.f36549b     // Catch:{ all -> 0x0129 }
            java.lang.String r4 = r2.f36549b     // Catch:{ all -> 0x0129 }
            boolean r3 = android.text.TextUtils.equals(r3, r4)     // Catch:{ all -> 0x0129 }
            if (r3 != 0) goto L_0x00dd
            java.util.HashSet r3 = r0.f36542k     // Catch:{ all -> 0x0129 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0129 }
        L_0x00cd:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0129 }
            if (r4 == 0) goto L_0x00dd
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0129 }
            bf.a r4 = (p383bf.C13619a) r4     // Catch:{ all -> 0x0129 }
            r4.mo40509a()     // Catch:{ all -> 0x0129 }
            goto L_0x00cd
        L_0x00dd:
            monitor-exit(r0)
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r3 = r2.mo43382f()
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r4 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.REGISTERED
            if (r3 != r4) goto L_0x00e8
            r3 = 1
            goto L_0x00e9
        L_0x00e8:
            r3 = 0
        L_0x00e9:
            if (r3 == 0) goto L_0x00f5
            java.lang.String r3 = r2.f36549b
            monitor-enter(r0)
            r0.f36541j = r3     // Catch:{ all -> 0x00f2 }
            monitor-exit(r0)
            goto L_0x00f5
        L_0x00f2:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00f5:
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r3 = r2.mo43382f()
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r4 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.REGISTER_ERROR
            if (r3 != r4) goto L_0x00ff
            r3 = 1
            goto L_0x0100
        L_0x00ff:
            r3 = 0
        L_0x0100:
            if (r3 == 0) goto L_0x010d
            com.google.firebase.installations.FirebaseInstallationsException r1 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r2 = com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG
            r1.<init>(r2)
            r0.mo43370f(r1)
            goto L_0x0139
        L_0x010d:
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r3 = r2.f36550c
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r4 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.NOT_GENERATED
            if (r3 == r4) goto L_0x0117
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r4 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION
            if (r3 != r4) goto L_0x0118
        L_0x0117:
            r1 = 1
        L_0x0118:
            if (r1 == 0) goto L_0x0125
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r2)
            r0.mo43370f(r1)
            goto L_0x0139
        L_0x0125:
            r0.mo43371g(r2)
            goto L_0x0139
        L_0x0129:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x012c:
            r0 = move-exception
            if (r4 == 0) goto L_0x0132
            r4.mo49324b()     // Catch:{ all -> 0x0133 }
        L_0x0132:
            throw r0     // Catch:{ all -> 0x0133 }
        L_0x0133:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0133 }
            throw r0
        L_0x0136:
            r0.mo43370f(r1)
        L_0x0139:
            return
        L_0x013a:
            r0 = move-exception
            if (r4 == 0) goto L_0x0140
            r4.mo49324b()     // Catch:{ all -> 0x0141 }
        L_0x0140:
            throw r0     // Catch:{ all -> 0x0141 }
        L_0x0141:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0141 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c0.C1751a.run():void");
    }
}
