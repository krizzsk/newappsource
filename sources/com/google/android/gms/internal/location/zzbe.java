package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzy;
import com.google.android.gms.tasks.CancellationToken;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbe extends GmsClient {
    public static final /* synthetic */ int zze = 0;
    private final Map zzf = new HashMap();
    private final Map zzg = new HashMap();
    private final Map zzh = new HashMap();
    private final String zzi;
    private boolean zzj;

    public zzbe(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str) {
        super(context, looper, 23, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzi = str;
    }

    private final boolean zzG(Feature feature) {
        Feature feature2;
        Feature[] availableFeatures = getAvailableFeatures();
        if (availableFeatures == null) {
            return false;
        }
        int length = availableFeatures.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                feature2 = null;
                break;
            }
            feature2 = availableFeatures[i];
            if (feature.getName().equals(feature2.getName())) {
                break;
            }
            i++;
        }
        if (feature2 != null && feature2.getVersion() >= feature.getVersion()) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof zzam) {
            return (zzam) queryLocalInterface;
        }
        return new zzal(iBinder);
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
    public final void disconnect() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.isConnected()     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x00a8
            java.util.Map r0 = r7.zzf     // Catch:{ Exception -> 0x00a8 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x00a8 }
            java.util.Map r1 = r7.zzf     // Catch:{ all -> 0x00a5 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x00a5 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00a5 }
        L_0x0014:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00a5 }
            r3 = 0
            if (r2 == 0) goto L_0x002f
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00a5 }
            com.google.android.gms.internal.location.zzbc r2 = (com.google.android.gms.internal.location.zzbc) r2     // Catch:{ all -> 0x00a5 }
            android.os.IInterface r4 = r7.getService()     // Catch:{ all -> 0x00a5 }
            com.google.android.gms.internal.location.zzam r4 = (com.google.android.gms.internal.location.zzam) r4     // Catch:{ all -> 0x00a5 }
            com.google.android.gms.internal.location.zzbh r2 = com.google.android.gms.internal.location.zzbh.zzb(r2, r3)     // Catch:{ all -> 0x00a5 }
            r4.zzz(r2)     // Catch:{ all -> 0x00a5 }
            goto L_0x0014
        L_0x002f:
            java.util.Map r1 = r7.zzf     // Catch:{ all -> 0x00a5 }
            r1.clear()     // Catch:{ all -> 0x00a5 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a5 }
            java.util.Map r0 = r7.zzg     // Catch:{ Exception -> 0x00a8 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x00a8 }
            java.util.Map r1 = r7.zzg     // Catch:{ all -> 0x00a2 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x00a2 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00a2 }
        L_0x0042:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00a2 }
            if (r2 == 0) goto L_0x005c
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.internal.location.zzay r2 = (com.google.android.gms.internal.location.zzay) r2     // Catch:{ all -> 0x00a2 }
            android.os.IInterface r4 = r7.getService()     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.internal.location.zzam r4 = (com.google.android.gms.internal.location.zzam) r4     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.internal.location.zzbh r2 = com.google.android.gms.internal.location.zzbh.zza(r2, r3)     // Catch:{ all -> 0x00a2 }
            r4.zzz(r2)     // Catch:{ all -> 0x00a2 }
            goto L_0x0042
        L_0x005c:
            java.util.Map r1 = r7.zzg     // Catch:{ all -> 0x00a2 }
            r1.clear()     // Catch:{ all -> 0x00a2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a2 }
            java.util.Map r0 = r7.zzh     // Catch:{ Exception -> 0x00a8 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x00a8 }
            java.util.Map r1 = r7.zzh     // Catch:{ all -> 0x009f }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x009f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x009f }
        L_0x006f:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x009f }
            if (r2 == 0) goto L_0x008b
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x009f }
            com.google.android.gms.internal.location.zzaz r2 = (com.google.android.gms.internal.location.zzaz) r2     // Catch:{ all -> 0x009f }
            android.os.IInterface r4 = r7.getService()     // Catch:{ all -> 0x009f }
            com.google.android.gms.internal.location.zzam r4 = (com.google.android.gms.internal.location.zzam) r4     // Catch:{ all -> 0x009f }
            com.google.android.gms.internal.location.zzj r5 = new com.google.android.gms.internal.location.zzj     // Catch:{ all -> 0x009f }
            r6 = 2
            r5.<init>(r6, r3, r2, r3)     // Catch:{ all -> 0x009f }
            r4.zzy(r5)     // Catch:{ all -> 0x009f }
            goto L_0x006f
        L_0x008b:
            java.util.Map r1 = r7.zzh     // Catch:{ all -> 0x009f }
            r1.clear()     // Catch:{ all -> 0x009f }
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            boolean r0 = r7.zzj     // Catch:{ Exception -> 0x00a8 }
            if (r0 == 0) goto L_0x00a8
            com.google.android.gms.internal.location.zzat r0 = new com.google.android.gms.internal.location.zzat     // Catch:{ Exception -> 0x00a8 }
            r0.<init>(r7)     // Catch:{ Exception -> 0x00a8 }
            r1 = 0
            r7.zzF(r1, r0)     // Catch:{ Exception -> 0x00a8 }
            goto L_0x00a8
        L_0x009f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            throw r1     // Catch:{ Exception -> 0x00a8 }
        L_0x00a2:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a2 }
            throw r1     // Catch:{ Exception -> 0x00a8 }
        L_0x00a5:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a5 }
            throw r1     // Catch:{ Exception -> 0x00a8 }
        L_0x00a8:
            super.disconnect()     // Catch:{ all -> 0x00ad }
            monitor-exit(r7)     // Catch:{ all -> 0x00ad }
            return
        L_0x00ad:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00ad }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbe.disconnect():void");
    }

    public final Feature[] getApiFeatures() {
        return zzy.zzj;
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.zzi);
        return bundle;
    }

    public final int getMinApkVersion() {
        return 11717000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public final boolean usesClientTelemetry() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzA(android.app.PendingIntent r11, com.google.android.gms.internal.location.zzai r12) throws android.os.RemoteException {
        /*
            r10 = this;
            android.os.IInterface r0 = r10.getService()
            com.google.android.gms.internal.location.zzam r0 = (com.google.android.gms.internal.location.zzam) r0
            com.google.android.gms.internal.location.zzbh r9 = new com.google.android.gms.internal.location.zzbh
            r2 = 2
            r3 = 0
            r4 = 0
            r5 = 0
            r8 = 0
            r1 = r9
            r6 = r11
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.zzz(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbe.zzA(android.app.PendingIntent, com.google.android.gms.internal.location.zzai):void");
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzB(com.google.android.gms.internal.location.zzbf r11, com.google.android.gms.common.api.internal.ListenerHolder r12, com.google.android.gms.internal.location.zzai r13) throws android.os.RemoteException {
        /*
            r10 = this;
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r12.getListenerKey()
            if (r0 != 0) goto L_0x000c
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            r11.<init>()
            return
        L_0x000c:
            r10.getContext()
            monitor-enter(r10)
            java.util.Map r1 = r10.zzg     // Catch:{ all -> 0x0046 }
            monitor-enter(r1)     // Catch:{ all -> 0x0046 }
            java.util.Map r2 = r10.zzg     // Catch:{ all -> 0x0043 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.location.zzay r2 = (com.google.android.gms.internal.location.zzay) r2     // Catch:{ all -> 0x0043 }
            if (r2 != 0) goto L_0x0027
            com.google.android.gms.internal.location.zzay r2 = new com.google.android.gms.internal.location.zzay     // Catch:{ all -> 0x0043 }
            r2.<init>(r12)     // Catch:{ all -> 0x0043 }
            java.util.Map r12 = r10.zzg     // Catch:{ all -> 0x0043 }
            r12.put(r0, r2)     // Catch:{ all -> 0x0043 }
        L_0x0027:
            r6 = r2
            monitor-exit(r1)     // Catch:{ all -> 0x0043 }
            android.os.IInterface r12 = r10.getService()     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.location.zzam r12 = (com.google.android.gms.internal.location.zzam) r12     // Catch:{ all -> 0x0046 }
            java.lang.String r9 = r0.toIdString()     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.location.zzbh r0 = new com.google.android.gms.internal.location.zzbh     // Catch:{ all -> 0x0046 }
            r3 = 1
            r5 = 0
            r7 = 0
            r2 = r0
            r4 = r11
            r8 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0046 }
            r12.zzz(r0)     // Catch:{ all -> 0x0046 }
            monitor-exit(r10)     // Catch:{ all -> 0x0046 }
            return
        L_0x0043:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0043 }
            throw r11     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0046 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbe.zzB(com.google.android.gms.internal.location.zzbf, com.google.android.gms.common.api.internal.ListenerHolder, com.google.android.gms.internal.location.zzai):void");
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzC(com.google.android.gms.internal.location.zzbf r11, com.google.android.gms.common.api.internal.ListenerHolder r12, com.google.android.gms.internal.location.zzai r13) throws android.os.RemoteException {
        /*
            r10 = this;
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r12.getListenerKey()
            if (r0 != 0) goto L_0x000c
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            r11.<init>()
            return
        L_0x000c:
            r10.getContext()
            monitor-enter(r10)
            java.util.Map r1 = r10.zzf     // Catch:{ all -> 0x0046 }
            monitor-enter(r1)     // Catch:{ all -> 0x0046 }
            java.util.Map r2 = r10.zzf     // Catch:{ all -> 0x0043 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.location.zzbc r2 = (com.google.android.gms.internal.location.zzbc) r2     // Catch:{ all -> 0x0043 }
            if (r2 != 0) goto L_0x0027
            com.google.android.gms.internal.location.zzbc r2 = new com.google.android.gms.internal.location.zzbc     // Catch:{ all -> 0x0043 }
            r2.<init>(r12)     // Catch:{ all -> 0x0043 }
            java.util.Map r12 = r10.zzf     // Catch:{ all -> 0x0043 }
            r12.put(r0, r2)     // Catch:{ all -> 0x0043 }
        L_0x0027:
            r5 = r2
            monitor-exit(r1)     // Catch:{ all -> 0x0043 }
            android.os.IInterface r12 = r10.getService()     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.location.zzam r12 = (com.google.android.gms.internal.location.zzam) r12     // Catch:{ all -> 0x0046 }
            java.lang.String r9 = r0.toIdString()     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.location.zzbh r0 = new com.google.android.gms.internal.location.zzbh     // Catch:{ all -> 0x0046 }
            r3 = 1
            r6 = 0
            r7 = 0
            r2 = r0
            r4 = r11
            r8 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0046 }
            r12.zzz(r0)     // Catch:{ all -> 0x0046 }
            monitor-exit(r10)     // Catch:{ all -> 0x0046 }
            return
        L_0x0043:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0043 }
            throw r11     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0046 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbe.zzC(com.google.android.gms.internal.location.zzbf, com.google.android.gms.common.api.internal.ListenerHolder, com.google.android.gms.internal.location.zzai):void");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzD(com.google.android.gms.internal.location.zzbf r11, android.app.PendingIntent r12, com.google.android.gms.internal.location.zzai r13) throws android.os.RemoteException {
        /*
            r10 = this;
            r10.getContext()
            android.os.IInterface r0 = r10.getService()
            com.google.android.gms.internal.location.zzam r0 = (com.google.android.gms.internal.location.zzam) r0
            com.google.android.gms.internal.location.zzbh r9 = new com.google.android.gms.internal.location.zzbh
            int r1 = r12.hashCode()
            r2 = 25
            java.lang.String r3 = "PendingIntent@"
            java.lang.String r8 = p379.C13715c.m34241g(r2, r3, r1)
            r2 = 1
            r4 = 0
            r5 = 0
            r1 = r9
            r3 = r11
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.zzz(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbe.zzD(com.google.android.gms.internal.location.zzbf, android.app.PendingIntent, com.google.android.gms.internal.location.zzai):void");
    }

    public final void zzE(Location location, IStatusCallback iStatusCallback) throws RemoteException {
        if (zzG(zzy.zzh)) {
            ((zzam) getService()).zzv(location, iStatusCallback);
            return;
        }
        ((zzam) getService()).zzu(location);
        iStatusCallback.onResult(Status.RESULT_SUCCESS);
    }

    public final void zzF(boolean z, IStatusCallback iStatusCallback) throws RemoteException {
        if (zzG(zzy.zzg)) {
            ((zzam) getService()).zzx(z, iStatusCallback);
        } else {
            ((zzam) getService()).zzw(z);
            iStatusCallback.onResult(Status.RESULT_SUCCESS);
        }
        this.zzj = z;
    }

    public final LocationAvailability zzp() throws RemoteException {
        return ((zzam) getService()).zzf(getContext().getPackageName());
    }

    public final void zzq(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, BaseImplementation.ResultHolder resultHolder) throws RemoteException {
        Preconditions.checkNotNull(geofencingRequest, "geofencingRequest can't be null.");
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((zzam) getService()).zzg(geofencingRequest, pendingIntent, new zzba(resultHolder));
    }

    public final void zzr(LocationSettingsRequest locationSettingsRequest, BaseImplementation.ResultHolder resultHolder, String str) throws RemoteException {
        boolean z;
        boolean z2 = true;
        if (locationSettingsRequest != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "locationSettingsRequest can't be null nor empty.");
        if (resultHolder == null) {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "listener can't be null.");
        ((zzam) getService()).zzh(locationSettingsRequest, new zzbd(resultHolder), (String) null);
    }

    public final void zzs(zzai zzai) throws RemoteException {
        ((zzam) getService()).zzi(zzai);
    }

    public final void zzt(CurrentLocationRequest currentLocationRequest, CancellationToken cancellationToken, zzao zzao) throws RemoteException {
        if (zzG(zzy.zze)) {
            ICancelToken zze2 = ((zzam) getService()).zze(currentLocationRequest, zzao);
            if (cancellationToken != null) {
                cancellationToken.onCanceledRequested(new zzar(zze2));
                return;
            }
            return;
        }
        AtomicReference atomicReference = new AtomicReference();
        zzas zzas = new zzas(this, atomicReference);
        ListenerHolder createListenerHolder = ListenerHolders.createListenerHolder(new zzau(this, zzao, zzas), zzbn.zza(Looper.getMainLooper()), "LocationCallback");
        atomicReference.set(createListenerHolder);
        if (cancellationToken != null) {
            cancellationToken.onCanceledRequested(zzas);
        }
        LocationRequest create = LocationRequest.create();
        create.setPriority(currentLocationRequest.getPriority());
        create.setInterval(0);
        create.setFastestInterval(0);
        create.setExpirationDuration(currentLocationRequest.getDurationMillis());
        zzbf zzc = zzbf.zzc((String) null, create);
        zzc.zzj = true;
        zzc.zze(currentLocationRequest.getMaxUpdateAgeMillis());
        zzB(zzc, createListenerHolder, new zzav(this, zzao));
    }

    public final void zzu(LastLocationRequest lastLocationRequest, zzao zzao) throws RemoteException {
        if (zzG(zzy.zzf)) {
            ((zzam) getService()).zzj(lastLocationRequest, zzao);
        } else {
            zzao.zzb(Status.RESULT_SUCCESS, ((zzam) getService()).zzd());
        }
    }

    public final void zzv(PendingIntent pendingIntent) throws RemoteException {
        Preconditions.checkNotNull(pendingIntent);
        ((zzam) getService()).zzl(pendingIntent);
    }

    public final void zzw(PendingIntent pendingIntent, BaseImplementation.ResultHolder resultHolder) throws RemoteException {
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((zzam) getService()).zzn(pendingIntent, new zzba(resultHolder), getContext().getPackageName());
    }

    public final void zzx(List list, BaseImplementation.ResultHolder resultHolder) throws RemoteException {
        boolean z;
        if (list == null || list.size() <= 0) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkArgument(z, "geofenceRequestIds can't be null nor empty.");
        Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        zzba zzba = new zzba(resultHolder);
        ((zzam) getService()).zzo((String[]) list.toArray(new String[0]), zzba, getContext().getPackageName());
    }

    public final void zzy(ListenerHolder.ListenerKey listenerKey, zzai zzai) throws RemoteException {
        Preconditions.checkNotNull(listenerKey, "Invalid null listener key");
        synchronized (this.zzg) {
            zzay zzay = (zzay) this.zzg.remove(listenerKey);
            if (zzay != null) {
                zzay.zzc();
                ((zzam) getService()).zzz(zzbh.zza(zzay, zzai));
            }
        }
    }

    public final void zzz(ListenerHolder.ListenerKey listenerKey, zzai zzai) throws RemoteException {
        Preconditions.checkNotNull(listenerKey, "Invalid null listener key");
        synchronized (this.zzf) {
            zzbc zzbc = (zzbc) this.zzf.remove(listenerKey);
            if (zzbc != null) {
                zzbc.zzc();
                ((zzam) getService()).zzz(zzbh.zzb(zzbc, zzai));
            }
        }
    }
}
