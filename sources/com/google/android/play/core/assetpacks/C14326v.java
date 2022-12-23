package com.google.android.play.core.assetpacks;

import android.app.NotificationManager;
import android.content.Context;
import androidx.appcompat.app.C0262r;
import p434dd.C16586w0;

/* renamed from: com.google.android.play.core.assetpacks.v */
public final class C14326v extends C16586w0 {

    /* renamed from: b */
    public final C0262r f36075b = new C0262r("AssetPackExtractionService");

    /* renamed from: c */
    public final Context f36076c;

    /* renamed from: d */
    public final C14243a0 f36077d;

    /* renamed from: e */
    public final C14313r2 f36078e;

    /* renamed from: f */
    public final C14315s0 f36079f;

    /* renamed from: g */
    public final NotificationManager f36080g;

    public C14326v(Context context, C14243a0 a0Var, C14313r2 r2Var, C14315s0 s0Var) {
        this.f36076c = context;
        this.f36077d = a0Var;
        this.f36078e = r2Var;
        this.f36079f = s0Var;
        this.f36080g = (NotificationManager) context.getSystemService("notification");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: H */
    public final void mo42901H(android.os.Bundle r11, p434dd.C16588x0 r12) throws android.os.RemoteException {
        /*
            r10 = this;
            monitor-enter(r10)
            androidx.appcompat.app.r r0 = r10.f36075b     // Catch:{ all -> 0x012f }
            java.lang.String r1 = "updateServiceState AIDL call"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x012f }
            r0.mo974a(r1, r3)     // Catch:{ all -> 0x012f }
            android.content.Context r0 = r10.f36076c     // Catch:{ all -> 0x012f }
            boolean r0 = p434dd.C16589y.m42106b(r0)     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x0125
            android.content.Context r0 = r10.f36076c     // Catch:{ all -> 0x012f }
            boolean r0 = p434dd.C16589y.m42105a(r0)     // Catch:{ all -> 0x012f }
            if (r0 != 0) goto L_0x001d
            goto L_0x0125
        L_0x001d:
            java.lang.String r0 = "action_type"
            int r0 = r11.getInt(r0)     // Catch:{ all -> 0x012f }
            com.google.android.play.core.assetpacks.s0 r1 = r10.f36079f     // Catch:{ all -> 0x012f }
            java.util.ArrayList r3 = r1.f36027c     // Catch:{ all -> 0x012f }
            monitor-enter(r3)     // Catch:{ all -> 0x012f }
            java.util.ArrayList r1 = r1.f36027c     // Catch:{ all -> 0x0122 }
            r1.add(r12)     // Catch:{ all -> 0x0122 }
            monitor-exit(r3)     // Catch:{ all -> 0x0122 }
            r1 = 2
            r3 = 1
            if (r0 != r3) goto L_0x00dd
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x012f }
            r0 = 26
            if (r12 < r0) goto L_0x0054
            java.lang.String r4 = "notification_channel_name"
            java.lang.String r4 = r11.getString(r4)     // Catch:{ all -> 0x012f }
            monitor-enter(r10)     // Catch:{ all -> 0x012f }
            if (r4 != 0) goto L_0x0043
            java.lang.String r4 = "File downloads by Play"
        L_0x0043:
            android.app.NotificationChannel r5 = new android.app.NotificationChannel     // Catch:{ all -> 0x0051 }
            java.lang.String r6 = "playcore-assetpacks-service-notification-channel"
            r5.<init>(r6, r4, r1)     // Catch:{ all -> 0x0051 }
            android.app.NotificationManager r1 = r10.f36080g     // Catch:{ all -> 0x0051 }
            r1.createNotificationChannel(r5)     // Catch:{ all -> 0x0051 }
            monitor-exit(r10)     // Catch:{ all -> 0x012f }
            goto L_0x0054
        L_0x0051:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x012f }
            throw r11     // Catch:{ all -> 0x012f }
        L_0x0054:
            com.google.android.play.core.assetpacks.r2 r1 = r10.f36078e     // Catch:{ all -> 0x012f }
            r1.mo42888a(r3)     // Catch:{ all -> 0x012f }
            com.google.android.play.core.assetpacks.s0 r1 = r10.f36079f     // Catch:{ all -> 0x012f }
            java.lang.String r4 = "notification_title"
            java.lang.String r4 = r11.getString(r4)     // Catch:{ all -> 0x012f }
            java.lang.String r5 = "notification_subtext"
            java.lang.String r5 = r11.getString(r5)     // Catch:{ all -> 0x012f }
            java.lang.String r6 = "notification_timeout"
            r7 = 600000(0x927c0, double:2.964394E-318)
            long r6 = r11.getLong(r6, r7)     // Catch:{ all -> 0x012f }
            java.lang.String r8 = "notification_on_click_intent"
            android.os.Parcelable r8 = r11.getParcelable(r8)     // Catch:{ all -> 0x012f }
            if (r12 < r0) goto L_0x0086
            android.app.Notification$Builder r12 = new android.app.Notification$Builder     // Catch:{ all -> 0x012f }
            android.content.Context r0 = r10.f36076c     // Catch:{ all -> 0x012f }
            java.lang.String r9 = "playcore-assetpacks-service-notification-channel"
            r12.<init>(r0, r9)     // Catch:{ all -> 0x012f }
            android.app.Notification$Builder r12 = r12.setTimeoutAfter(r6)     // Catch:{ all -> 0x012f }
            goto L_0x0092
        L_0x0086:
            android.app.Notification$Builder r12 = new android.app.Notification$Builder     // Catch:{ all -> 0x012f }
            android.content.Context r0 = r10.f36076c     // Catch:{ all -> 0x012f }
            r12.<init>(r0)     // Catch:{ all -> 0x012f }
            r0 = -2
            android.app.Notification$Builder r12 = r12.setPriority(r0)     // Catch:{ all -> 0x012f }
        L_0x0092:
            boolean r0 = r8 instanceof android.app.PendingIntent     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x009b
            android.app.PendingIntent r8 = (android.app.PendingIntent) r8     // Catch:{ all -> 0x012f }
            r12.setContentIntent(r8)     // Catch:{ all -> 0x012f }
        L_0x009b:
            r0 = 17301633(0x1080081, float:2.4979616E-38)
            android.app.Notification$Builder r0 = r12.setSmallIcon(r0)     // Catch:{ all -> 0x012f }
            android.app.Notification$Builder r0 = r0.setOngoing(r2)     // Catch:{ all -> 0x012f }
            if (r4 != 0) goto L_0x00aa
            java.lang.String r4 = "Downloading additional file"
        L_0x00aa:
            android.app.Notification$Builder r0 = r0.setContentTitle(r4)     // Catch:{ all -> 0x012f }
            if (r5 != 0) goto L_0x00b2
            java.lang.String r5 = "Transferring"
        L_0x00b2:
            r0.setSubText(r5)     // Catch:{ all -> 0x012f }
            java.lang.String r0 = "notification_color"
            int r11 = r11.getInt(r0)     // Catch:{ all -> 0x012f }
            if (r11 == 0) goto L_0x00c5
            android.app.Notification$Builder r11 = r12.setColor(r11)     // Catch:{ all -> 0x012f }
            r0 = -1
            r11.setVisibility(r0)     // Catch:{ all -> 0x012f }
        L_0x00c5:
            android.app.Notification r11 = r12.build()     // Catch:{ all -> 0x012f }
            r1.f36030f = r11     // Catch:{ all -> 0x012f }
            android.content.Intent r11 = new android.content.Intent     // Catch:{ all -> 0x012f }
            android.content.Context r12 = r10.f36076c     // Catch:{ all -> 0x012f }
            java.lang.Class<com.google.android.play.core.assetpacks.ExtractionForegroundService> r0 = com.google.android.play.core.assetpacks.ExtractionForegroundService.class
            r11.<init>(r12, r0)     // Catch:{ all -> 0x012f }
            android.content.Context r12 = r10.f36076c     // Catch:{ all -> 0x012f }
            com.google.android.play.core.assetpacks.s0 r0 = r10.f36079f     // Catch:{ all -> 0x012f }
            r12.bindService(r11, r0, r3)     // Catch:{ all -> 0x012f }
            monitor-exit(r10)
            goto L_0x012e
        L_0x00dd:
            if (r0 != r1) goto L_0x0109
            com.google.android.play.core.assetpacks.r2 r11 = r10.f36078e     // Catch:{ all -> 0x012f }
            r11.mo42888a(r2)     // Catch:{ all -> 0x012f }
            com.google.android.play.core.assetpacks.s0 r11 = r10.f36079f     // Catch:{ all -> 0x012f }
            androidx.appcompat.app.r r12 = r11.f36026b     // Catch:{ all -> 0x012f }
            java.lang.String r0 = "Stopping foreground installation service."
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x012f }
            r12.mo974a(r0, r1)     // Catch:{ all -> 0x012f }
            android.content.Context r12 = r11.f36028d     // Catch:{ all -> 0x012f }
            r12.unbindService(r11)     // Catch:{ all -> 0x012f }
            com.google.android.play.core.assetpacks.ExtractionForegroundService r12 = r11.f36029e     // Catch:{ all -> 0x012f }
            if (r12 == 0) goto L_0x0104
            monitor-enter(r12)     // Catch:{ all -> 0x012f }
            r12.stopForeground(r3)     // Catch:{ all -> 0x0101 }
            r12.stopSelf()     // Catch:{ all -> 0x0101 }
            monitor-exit(r12)     // Catch:{ all -> 0x012f }
            goto L_0x0104
        L_0x0101:
            r11 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x012f }
            throw r11     // Catch:{ all -> 0x012f }
        L_0x0104:
            r11.mo42889a()     // Catch:{ all -> 0x012f }
            monitor-exit(r10)
            goto L_0x012e
        L_0x0109:
            androidx.appcompat.app.r r11 = r10.f36075b     // Catch:{ all -> 0x012f }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x012f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x012f }
            r1[r2] = r0     // Catch:{ all -> 0x012f }
            java.lang.String r0 = "Unknown action type received: %d"
            r11.mo975b(r0, r1)     // Catch:{ all -> 0x012f }
            android.os.Bundle r11 = new android.os.Bundle     // Catch:{ all -> 0x012f }
            r11.<init>()     // Catch:{ all -> 0x012f }
            r12.zzd(r11)     // Catch:{ all -> 0x012f }
            monitor-exit(r10)
            goto L_0x012e
        L_0x0122:
            r11 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0122 }
            throw r11     // Catch:{ all -> 0x012f }
        L_0x0125:
            android.os.Bundle r11 = new android.os.Bundle     // Catch:{ all -> 0x012f }
            r11.<init>()     // Catch:{ all -> 0x012f }
            r12.zzd(r11)     // Catch:{ all -> 0x012f }
            monitor-exit(r10)
        L_0x012e:
            return
        L_0x012f:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C14326v.mo42901H(android.os.Bundle, dd.x0):void");
    }
}
