package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.C0262r;
import ce0.C21100e;
import com.appsflyer.ServerParameters;
import com.google.android.gms.tasks.Task;
import com.moovit.aws.kinesis.KinesisStreamRecorder;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.usebutton.sdk.internal.commands.GetBrowserSessionContextCommand;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import mf0.C24361g;
import p386bi.C13629b;
import p386bi.C13630c;
import p401bz.C13709c;
import p401bz.C13714h;
import p584jl.C17885a;
import p704om.C18789e;
import y90.C13271e;

/* renamed from: com.google.android.play.core.assetpacks.z0 */
public final /* synthetic */ class C14343z0 implements C14272h1 {

    /* renamed from: b */
    public final Object f36140b;

    /* renamed from: c */
    public Object f36141c;

    public /* synthetic */ C14343z0() {
        C13630c cVar = new C13630c();
        this.f36140b = cVar;
        this.f36141c = new C13629b(cVar);
    }

    public /* synthetic */ C14343z0(Object obj, Object obj2) {
        this.f36140b = obj;
        this.f36141c = obj2;
    }

    /* renamed from: a */
    public final KinesisStreamRecorder mo42912a(KinesisStreamRecorder kinesisStreamRecorder) {
        Context context = (Context) this.f36140b;
        String b = C13709c.m34226b(context);
        if (b == null) {
            StringBuilder k = C13555b.m33972k("no_user:");
            k.append(C13271e.m33393a(context));
            b = k.toString();
        }
        return new KinesisStreamRecorder((Context) this.f36140b, b, kinesisStreamRecorder);
    }

    /* renamed from: b */
    public final Task mo42913b(C13714h hVar, boolean z) {
        return mo42914c(Collections.singleton(hVar), z);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: c */
    public final synchronized com.google.android.gms.tasks.Task mo42914c(java.util.Collection r4, boolean r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            monitor-enter(r3)     // Catch:{ all -> 0x0024 }
            java.lang.Object r0 = r3.f36141c     // Catch:{ all -> 0x0021 }
            com.moovit.aws.kinesis.KinesisStreamRecorder r0 = (com.moovit.aws.kinesis.KinesisStreamRecorder) r0     // Catch:{ all -> 0x0021 }
            r1 = 0
            if (r0 != 0) goto L_0x000f
            com.moovit.aws.kinesis.KinesisStreamRecorder r0 = r3.mo42912a(r1)     // Catch:{ all -> 0x0021 }
            r3.f36141c = r0     // Catch:{ all -> 0x0021 }
        L_0x000f:
            java.lang.Object r0 = r3.f36141c     // Catch:{ all -> 0x0021 }
            com.moovit.aws.kinesis.KinesisStreamRecorder r0 = (com.moovit.aws.kinesis.KinesisStreamRecorder) r0     // Catch:{ all -> 0x0021 }
            monitor-exit(r3)     // Catch:{ all -> 0x0024 }
            java.util.concurrent.ExecutorService r1 = r0.f40785d     // Catch:{ all -> 0x0024 }
            com.moovit.aws.kinesis.KinesisStreamRecorder$a r2 = new com.moovit.aws.kinesis.KinesisStreamRecorder$a     // Catch:{ all -> 0x0024 }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x0024 }
            com.google.android.gms.tasks.Task r4 = com.google.android.gms.tasks.Tasks.call(r1, r2)     // Catch:{ all -> 0x0024 }
            monitor-exit(r3)
            return r4
        L_0x0021:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0024 }
            throw r4     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C14343z0.mo42914c(java.util.Collection, boolean):com.google.android.gms.tasks.Task");
    }

    public final Object zza() {
        C14268g1 g1Var;
        boolean z;
        C14276i1 i1Var = (C14276i1) this.f36140b;
        Bundle bundle = (Bundle) this.f36141c;
        i1Var.getClass();
        int i = bundle.getInt(GetBrowserSessionContextCommand.KEY_SESSION_ID);
        if (i == 0) {
            return Boolean.FALSE;
        }
        HashMap hashMap = i1Var.f35909e;
        Integer valueOf = Integer.valueOf(i);
        boolean z2 = false;
        if (hashMap.containsKey(valueOf)) {
            C14264f1 b = i1Var.mo42840b(i);
            int i2 = bundle.getInt(C24361g.m61192v0(ServerParameters.STATUS, b.f35864c.f35834a));
            C14260e1 e1Var = b.f35864c;
            int i3 = e1Var.f35837d;
            if (C17885a.m44419P0(i3, i2)) {
                C14276i1.f35904g.mo974a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(i3));
                C14260e1 e1Var2 = b.f35864c;
                String str = e1Var2.f35834a;
                int i4 = e1Var2.f35837d;
                if (i4 == 4) {
                    ((C14341y2) i1Var.f35906b.zza()).mo42872a(i, str);
                } else if (i4 == 5) {
                    ((C14341y2) i1Var.f35906b.zza()).zzi(i);
                } else if (i4 == 6) {
                    ((C14341y2) i1Var.f35906b.zza()).mo42873b(Arrays.asList(new String[]{str}));
                }
            } else {
                e1Var.f35837d = i2;
                if (i2 == 5 || i2 == 6 || i2 == 4) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i1Var.mo42841c(new C14339y0(i1Var, i));
                    i1Var.f35907c.mo42908a(b.f35864c.f35834a);
                } else {
                    for (C14268g1 g1Var2 : e1Var.f35839f) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C24361g.m61194w0("chunk_intents", b.f35864c.f35834a, g1Var2.f35873a));
                        if (parcelableArrayList != null) {
                            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                if (!(parcelableArrayList.get(i5) == null || ((Intent) parcelableArrayList.get(i5)).getData() == null)) {
                                    ((C14252c1) g1Var2.f35876d.get(i5)).f35814a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String d = C14276i1.m35524d(bundle);
            long j = bundle.getLong(C24361g.m61192v0("pack_version", d));
            String string = bundle.getString(C24361g.m61192v0("pack_version_tag", d), "");
            int i6 = bundle.getInt(C24361g.m61192v0(ServerParameters.STATUS, d));
            long j2 = bundle.getLong(C24361g.m61192v0("total_bytes_to_download", d));
            List<String> stringArrayList = bundle.getStringArrayList(C24361g.m61192v0("slice_ids", d));
            ArrayList arrayList = new ArrayList();
            if (stringArrayList == null) {
                stringArrayList = Collections.emptyList();
            }
            for (String str2 : stringArrayList) {
                List<Intent> parcelableArrayList2 = bundle.getParcelableArrayList(C24361g.m61194w0("chunk_intents", d, str2));
                ArrayList arrayList2 = new ArrayList();
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = Collections.emptyList();
                }
                for (Intent intent : parcelableArrayList2) {
                    if (intent != null) {
                        z2 = true;
                    }
                    arrayList2.add(new C14252c1(z2));
                    z2 = false;
                }
                String string2 = bundle.getString(C24361g.m61194w0("uncompressed_hash_sha256", d, str2));
                long j3 = bundle.getLong(C24361g.m61194w0("uncompressed_size", d, str2));
                int i7 = bundle.getInt(C24361g.m61194w0("patch_format", d, str2), 0);
                if (i7 != 0) {
                    g1Var = new C14268g1(str2, string2, j3, arrayList2, 0, i7);
                    z2 = false;
                } else {
                    z2 = false;
                    g1Var = new C14268g1(str2, string2, j3, arrayList2, bundle.getInt(C24361g.m61194w0("compression_format", d, str2), 0), 0);
                }
                arrayList.add(g1Var);
            }
            i1Var.f35909e.put(Integer.valueOf(i), new C14264f1(i, bundle.getInt(ServerParameters.APP_VERSION_CODE), new C14260e1(d, j, i6, j2, arrayList, string)));
        }
        return Boolean.TRUE;
    }

    public /* synthetic */ C14343z0(C18789e eVar, C0262r rVar) {
        this.f36140b = eVar;
        this.f36141c = rVar;
    }

    public /* synthetic */ C14343z0(Context context) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f36140b = context.getApplicationContext();
        this.f36141c = null;
    }
}
