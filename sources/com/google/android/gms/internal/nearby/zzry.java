package com.google.android.gms.internal.nearby;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public final class zzry {
    public static final Uri zza = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri zzb = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern zzc = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern zzd = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static HashMap zze;
    public static final HashMap zzf = new HashMap();
    public static final HashMap zzg = new HashMap();
    public static final HashMap zzh = new HashMap();
    public static final HashMap zzi = new HashMap();
    public static final String[] zzj = new String[0];
    /* access modifiers changed from: private */
    public static final AtomicBoolean zzk = new AtomicBoolean();
    private static Object zzl;
    private static boolean zzm;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static boolean zzb(android.content.ContentResolver r16, java.lang.String r17, boolean r18) {
        /*
            java.lang.Class<com.google.android.gms.internal.nearby.zzry> r1 = com.google.android.gms.internal.nearby.zzry.class
            monitor-enter(r1)
            zzc(r16)     // Catch:{ all -> 0x00ca }
            java.lang.Object r0 = zzl     // Catch:{ all -> 0x00ca }
            monitor-exit(r1)     // Catch:{ all -> 0x00ca }
            java.util.HashMap r2 = zzf
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.String r4 = "gms:nearby:requires_gms_check"
            monitor-enter(r1)
            boolean r5 = r2.containsKey(r4)     // Catch:{ all -> 0x00c7 }
            r6 = 0
            if (r5 == 0) goto L_0x0020
            java.lang.Object r4 = r2.get(r4)     // Catch:{ all -> 0x00c7 }
            if (r4 != 0) goto L_0x001e
            r4 = r3
        L_0x001e:
            monitor-exit(r1)     // Catch:{ all -> 0x00c7 }
            goto L_0x0022
        L_0x0020:
            monitor-exit(r1)     // Catch:{ all -> 0x00c7 }
            r4 = r6
        L_0x0022:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L_0x002b
            boolean r0 = r4.booleanValue()
            return r0
        L_0x002b:
            java.lang.String r5 = "gms:nearby:requires_gms_check"
            monitor-enter(r1)
            zzc(r16)     // Catch:{ all -> 0x00c4 }
            java.lang.Object r7 = zzl     // Catch:{ all -> 0x00c4 }
            java.util.HashMap r8 = zze     // Catch:{ all -> 0x00c4 }
            boolean r8 = r8.containsKey(r5)     // Catch:{ all -> 0x00c4 }
            r9 = 1
            if (r8 == 0) goto L_0x004a
            java.util.HashMap r7 = zze     // Catch:{ all -> 0x00c4 }
            java.lang.Object r5 = r7.get(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00c4 }
            if (r5 != 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r6 = r5
        L_0x0048:
            monitor-exit(r1)     // Catch:{ all -> 0x00c4 }
            goto L_0x0082
        L_0x004a:
            java.lang.String[] r8 = zzj     // Catch:{ all -> 0x00c4 }
            int r8 = r8.length     // Catch:{ all -> 0x00c4 }
            monitor-exit(r1)     // Catch:{ all -> 0x00c4 }
            android.net.Uri r11 = zza
            java.lang.String[] r14 = new java.lang.String[]{r5}
            r12 = 0
            r13 = 0
            r15 = 0
            r10 = r16
            android.database.Cursor r8 = r10.query(r11, r12, r13, r14, r15)
            if (r8 != 0) goto L_0x0060
            goto L_0x0082
        L_0x0060:
            boolean r10 = r8.moveToFirst()     // Catch:{ all -> 0x00bf }
            if (r10 != 0) goto L_0x006d
            zzd(r7, r5, r6)     // Catch:{ all -> 0x00bf }
        L_0x0069:
            r8.close()
            goto L_0x0082
        L_0x006d:
            java.lang.String r10 = r8.getString(r9)     // Catch:{ all -> 0x00bf }
            if (r10 == 0) goto L_0x007a
            boolean r11 = r10.equals(r6)     // Catch:{ all -> 0x00bf }
            if (r11 == 0) goto L_0x007a
            r10 = r6
        L_0x007a:
            zzd(r7, r5, r10)     // Catch:{ all -> 0x00bf }
            if (r10 != 0) goto L_0x0080
            goto L_0x0069
        L_0x0080:
            r6 = r10
            goto L_0x0069
        L_0x0082:
            if (r6 == 0) goto L_0x00aa
            java.lang.String r5 = ""
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x008d
            goto L_0x00aa
        L_0x008d:
            java.util.regex.Pattern r5 = zzc
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r5 = r5.matches()
            if (r5 == 0) goto L_0x009a
            goto L_0x00ab
        L_0x009a:
            java.util.regex.Pattern r3 = zzd
            java.util.regex.Matcher r3 = r3.matcher(r6)
            boolean r3 = r3.matches()
            if (r3 == 0) goto L_0x00aa
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r9 = 0
            goto L_0x00ab
        L_0x00aa:
            r3 = r4
        L_0x00ab:
            java.lang.String r4 = "gms:nearby:requires_gms_check"
            monitor-enter(r1)
            java.lang.Object r5 = zzl     // Catch:{ all -> 0x00bc }
            if (r0 != r5) goto L_0x00ba
            r2.put(r4, r3)     // Catch:{ all -> 0x00bc }
            java.util.HashMap r0 = zze     // Catch:{ all -> 0x00bc }
            r0.remove(r4)     // Catch:{ all -> 0x00bc }
        L_0x00ba:
            monitor-exit(r1)     // Catch:{ all -> 0x00bc }
            return r9
        L_0x00bc:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00bc }
            throw r0
        L_0x00bf:
            r0 = move-exception
            r8.close()
            throw r0
        L_0x00c4:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c4 }
            throw r0
        L_0x00c7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c7 }
            throw r0
        L_0x00ca:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ca }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzry.zzb(android.content.ContentResolver, java.lang.String, boolean):boolean");
    }

    private static void zzc(ContentResolver contentResolver) {
        if (zze == null) {
            zzk.set(false);
            zze = new HashMap();
            zzl = new Object();
            zzm = false;
            contentResolver.registerContentObserver(zza, true, new zzrx((Handler) null));
        } else if (zzk.getAndSet(false)) {
            zze.clear();
            zzf.clear();
            zzg.clear();
            zzh.clear();
            zzi.clear();
            zzl = new Object();
            zzm = false;
        }
    }

    private static void zzd(Object obj, String str, String str2) {
        synchronized (zzry.class) {
            if (obj == zzl) {
                zze.put("gms:nearby:requires_gms_check", str2);
            }
        }
    }
}
