package f10;

import android.content.Context;
import com.moovit.MoovitActivity;
import com.moovit.gcm.GcmNotificationActivity;
import com.moovit.gcm.notification.GcmNotification;
import com.moovit.gcm.payload.GcmPayload;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: f10.a */
public class C16930a {

    /* renamed from: a */
    public static final AtomicReference<C16930a> f43941a = new AtomicReference<>(new C16930a());

    /* renamed from: a */
    public static C16930a m42749a() {
        return f43941a.get();
    }

    /* renamed from: b */
    public GcmPayload.C15923a<Void> mo49551b(MoovitActivity moovitActivity) {
        return null;
    }

    /* renamed from: c */
    public GcmPayload.C15923a mo49552c(MoovitActivity moovitActivity) {
        return null;
    }

    /* renamed from: d */
    public GcmPayload.C15923a mo49553d(GcmNotificationActivity gcmNotificationActivity) {
        return null;
    }

    /* renamed from: e */
    public GcmPayload.C15923a<Void> mo49554e(MoovitActivity moovitActivity) {
        return null;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: f */
    public void mo49555f(android.content.Context r3, java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            r2 = this;
            r4.hashCode()
            r3 = 3
            r0 = -1
            int r1 = r4.hashCode()
            switch(r1) {
                case -760094020: goto L_0x0039;
                case -368232074: goto L_0x002e;
                case 3441010: goto L_0x0023;
                case 917588655: goto L_0x0018;
                case 1064765741: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0043
        L_0x000d:
            java.lang.String r1 = "upload_logs"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0016
            goto L_0x0043
        L_0x0016:
            r0 = 4
            goto L_0x0043
        L_0x0018:
            java.lang.String r1 = "metro_update"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0021
            goto L_0x0043
        L_0x0021:
            r0 = 3
            goto L_0x0043
        L_0x0023:
            java.lang.String r1 = "ping"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            r0 = 2
            goto L_0x0043
        L_0x002e:
            java.lang.String r1 = "invalidate_firebase_config"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0037
            goto L_0x0043
        L_0x0037:
            r0 = 1
            goto L_0x0043
        L_0x0039:
            java.lang.String r1 = "upload_navigation_logs"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            switch(r0) {
                case 0: goto L_0x0096;
                case 1: goto L_0x0083;
                case 2: goto L_0x0098;
                case 3: goto L_0x0065;
                case 4: goto L_0x0059;
                default: goto L_0x0046;
            }
        L_0x0046:
            de.f r3 = p435de.C16596f.m42113a()
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Received a GCM command message with unrecognized command: "
            java.lang.String r4 = p379.C25541a.m63881k(r0, r4)
            r5.<init>(r4)
            r3.mo49364c(r5)
            goto L_0x0098
        L_0x0059:
            l20.a r3 = l20.C18169a.f46402a
            monitor-enter(r3)
            monitor-enter(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            monitor-exit(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            monitor-exit(r3)
            goto L_0x0098
        L_0x0060:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0063:
            monitor-exit(r3)
            goto L_0x0098
        L_0x0065:
            java.lang.String r3 = "metro_id"
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            com.moovit.network.model.ServerId r3 = com.moovit.network.model.ServerId.m11392b(r3)
            java.lang.String r4 = "metro_revision"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            long r4 = java.lang.Long.parseLong(r4)
            java.lang.String r0 = "push"
            g30.C4789q.m12122d(r0, r3, r4)
            goto L_0x0098
        L_0x0083:
            vf.b r4 = p862vf.C20118b.m47697e()     // Catch:{ Exception -> 0x0098 }
            java.util.concurrent.Executor r5 = r4.f51040b     // Catch:{ Exception -> 0x0098 }
            s3.w r0 = new s3.w     // Catch:{ Exception -> 0x0098 }
            r0.<init>(r4, r3)     // Catch:{ Exception -> 0x0098 }
            com.google.android.gms.tasks.Task r3 = com.google.android.gms.tasks.Tasks.call(r5, r0)     // Catch:{ Exception -> 0x0098 }
            com.google.android.gms.tasks.Tasks.await(r3)     // Catch:{ Exception -> 0x0098 }
            goto L_0x0098
        L_0x0096:
            int r3 = f40.C4681a.f15949a
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f10.C16930a.mo49555f(android.content.Context, java.lang.String, java.util.Map):void");
    }

    /* renamed from: g */
    public void mo49556g(Context context, GcmNotification gcmNotification) {
    }

    /* renamed from: h */
    public void mo49557h(GcmNotificationActivity gcmNotificationActivity, GcmNotification gcmNotification) {
    }
}
