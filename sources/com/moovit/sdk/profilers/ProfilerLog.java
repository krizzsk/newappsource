package com.moovit.sdk.profilers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.JobIntentService;
import com.moovit.commons.request.ServerException;
import com.moovit.sdk.requests.UploadDataType;
import e70.C4586a;
import e70.C4591d;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.zip.GZIPOutputStream;
import p786rz.C19387a;
import v70.C13177m;

public final class ProfilerLog {
    @SuppressLint({"SimpleDateFormat"})

    /* renamed from: c */
    public static final SimpleDateFormat f43006c = new SimpleDateFormat("dd-MM HH:mm");

    /* renamed from: d */
    public static volatile ProfilerLog f43007d;

    /* renamed from: a */
    public final Context f43008a;

    /* renamed from: b */
    public BufferedWriter f43009b;

    public static class LogUploader extends JobIntentService {
        /* renamed from: d */
        public final void mo3360d(Intent intent) {
            Context applicationContext = getApplicationContext();
            C13177m mVar = new C13177m(applicationContext, C4591d.m11903a(applicationContext));
            try {
                File d = ProfilerLog.m41879c(applicationContext).mo49245d();
                File createTempFile = File.createTempFile("profiler_log", ".gzip");
                FileInputStream fileInputStream = new FileInputStream(d);
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(createTempFile));
                C19387a.m46671c(fileInputStream, gZIPOutputStream);
                gZIPOutputStream.close();
                C4586a.m11899a(createTempFile, mVar, UploadDataType.LOG);
                createTempFile.delete();
            } catch (ServerException | IOException unused) {
                SimpleDateFormat simpleDateFormat = ProfilerLog.f43006c;
            }
        }
    }

    public ProfilerLog(Context context) {
        BufferedWriter bufferedWriter;
        this.f43008a = context;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(mo49245d(), true));
        } catch (IOException unused) {
            bufferedWriter = null;
        }
        this.f43009b = bufferedWriter;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: c */
    public static synchronized com.moovit.sdk.profilers.ProfilerLog m41879c(android.content.Context r2) {
        /*
            java.lang.Class<com.moovit.sdk.profilers.ProfilerLog> r0 = com.moovit.sdk.profilers.ProfilerLog.class
            monitor-enter(r0)
            com.moovit.sdk.profilers.ProfilerLog r1 = f43007d     // Catch:{ all -> 0x0020 }
            if (r1 != 0) goto L_0x001c
            monitor-enter(r0)     // Catch:{ all -> 0x0020 }
            com.moovit.sdk.profilers.ProfilerLog r1 = f43007d     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0017
            com.moovit.sdk.profilers.ProfilerLog r1 = new com.moovit.sdk.profilers.ProfilerLog     // Catch:{ all -> 0x0019 }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0019 }
            r1.<init>(r2)     // Catch:{ all -> 0x0019 }
            f43007d = r1     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x0019:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r2     // Catch:{ all -> 0x0020 }
        L_0x001c:
            com.moovit.sdk.profilers.ProfilerLog r2 = f43007d     // Catch:{ all -> 0x0020 }
            monitor-exit(r0)
            return r2
        L_0x0020:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.sdk.profilers.ProfilerLog.m41879c(android.content.Context):com.moovit.sdk.profilers.ProfilerLog");
    }

    /* renamed from: a */
    public final synchronized void mo49243a(String str, Throwable th) {
        mo49244b(str, th.getMessage());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
        th.printStackTrace(printWriter);
        printWriter.flush();
        mo49244b(str, byteArrayOutputStream.toString());
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public final synchronized void mo49244b(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.io.BufferedWriter r0 = r7.f43009b     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r7)
            return
        L_0x0007:
            java.io.File r0 = r7.mo49245d()     // Catch:{ all -> 0x00b1 }
            long r0 = r0.length()     // Catch:{ all -> 0x00b1 }
            r2 = 2097152(0x200000, double:1.0361308E-317)
            r4 = 1
            r5 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 < 0) goto L_0x0047
            monitor-enter(r7)     // Catch:{ all -> 0x00b1 }
            java.io.File r0 = r7.mo49245d()     // Catch:{ all -> 0x0044 }
            r0.delete()     // Catch:{ all -> 0x0044 }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x002f }
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ IOException -> 0x002f }
            java.io.File r2 = r7.mo49245d()     // Catch:{ IOException -> 0x002f }
            r1.<init>(r2, r4)     // Catch:{ IOException -> 0x002f }
            r0.<init>(r1)     // Catch:{ IOException -> 0x002f }
            goto L_0x0030
        L_0x002f:
            r0 = r5
        L_0x0030:
            r7.f43009b = r0     // Catch:{ all -> 0x0044 }
            android.content.Context r0 = r7.f43008a     // Catch:{ all -> 0x0044 }
            j2.a r0 = p130j2.C5367a.m13473a(r0)     // Catch:{ all -> 0x0044 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = "com.moovit.profiler.profile_log_updated"
            r1.<init>(r2)     // Catch:{ all -> 0x0044 }
            r0.mo21147c(r1)     // Catch:{ all -> 0x0044 }
            monitor-exit(r7)     // Catch:{ all -> 0x00b1 }
            goto L_0x0047
        L_0x0044:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00b1 }
            throw r8     // Catch:{ all -> 0x00b1 }
        L_0x0047:
            java.text.SimpleDateFormat r0 = f43006c     // Catch:{ IOException -> 0x00af }
            java.util.Date r1 = new java.util.Date     // Catch:{ IOException -> 0x00af }
            r1.<init>()     // Catch:{ IOException -> 0x00af }
            java.lang.String r0 = r0.format(r1)     // Catch:{ IOException -> 0x00af }
            java.lang.String r1 = "%.1f%%"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x00af }
            r3 = 0
            android.content.Context r4 = r7.f43008a     // Catch:{ IOException -> 0x00af }
            float r4 = p977zz.C20975x0.m49120g(r4)     // Catch:{ IOException -> 0x00af }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ IOException -> 0x00af }
            r2[r3] = r4     // Catch:{ IOException -> 0x00af }
            java.lang.String r1 = java.lang.String.format(r5, r1, r2)     // Catch:{ IOException -> 0x00af }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00af }
            r2.<init>()     // Catch:{ IOException -> 0x00af }
            r2.append(r0)     // Catch:{ IOException -> 0x00af }
            java.lang.String r0 = " ["
            r2.append(r0)     // Catch:{ IOException -> 0x00af }
            r2.append(r1)     // Catch:{ IOException -> 0x00af }
            java.lang.String r0 = "] "
            r2.append(r0)     // Catch:{ IOException -> 0x00af }
            r2.append(r8)     // Catch:{ IOException -> 0x00af }
            java.lang.String r8 = ": "
            r2.append(r8)     // Catch:{ IOException -> 0x00af }
            r2.append(r9)     // Catch:{ IOException -> 0x00af }
            java.lang.String r8 = "\n"
            r2.append(r8)     // Catch:{ IOException -> 0x00af }
            java.lang.String r8 = r2.toString()     // Catch:{ IOException -> 0x00af }
            java.io.BufferedWriter r9 = r7.f43009b     // Catch:{ IOException -> 0x00af }
            r9.write(r8)     // Catch:{ IOException -> 0x00af }
            java.io.BufferedWriter r9 = r7.f43009b     // Catch:{ IOException -> 0x00af }
            r9.flush()     // Catch:{ IOException -> 0x00af }
            android.content.Intent r9 = new android.content.Intent     // Catch:{ IOException -> 0x00af }
            java.lang.String r0 = "com.moovit.profiler.profile_log_message_added"
            r9.<init>(r0)     // Catch:{ IOException -> 0x00af }
            java.lang.String r0 = "line"
            r9.putExtra(r0, r8)     // Catch:{ IOException -> 0x00af }
            android.content.Context r8 = r7.f43008a     // Catch:{ IOException -> 0x00af }
            j2.a r8 = p130j2.C5367a.m13473a(r8)     // Catch:{ IOException -> 0x00af }
            r8.mo21147c(r9)     // Catch:{ IOException -> 0x00af }
        L_0x00af:
            monitor-exit(r7)
            return
        L_0x00b1:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.sdk.profilers.ProfilerLog.mo49244b(java.lang.String, java.lang.String):void");
    }

    /* renamed from: d */
    public final File mo49245d() {
        File file = new File(this.f43008a.getFilesDir(), "moovit_sdk_profilers/");
        file.mkdirs();
        return new File(file, "profiling.log");
    }
}
