package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.ConnectionsOptions;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.zza;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import p241s0.C6304d;

public final class zzgy extends GmsClient {
    private final long zze = ((long) hashCode());
    private final Set zzf = new C6304d();
    private final Set zzg = new C6304d();
    private final Set zzh = new C6304d();
    private final Set zzi = new C6304d();
    private final Set zzj = new C6304d();
    private zzlt zzk;

    public zzgy(Context context, Looper looper, ClientSettings clientSettings, ConnectionsOptions connectionsOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 54, clientSettings, connectionCallbacks, onConnectionFailedListener);
        zzmd.zzc(context.getCacheDir());
    }

    /* access modifiers changed from: private */
    public static Status zzF(int i) {
        return new Status(i, ConnectionsStatusCodes.getStatusCodeString(i));
    }

    private final void zzG() {
        for (zzgg zze2 : this.zzf) {
            zze2.zze();
        }
        for (zzgk zzf2 : this.zzg) {
            zzf2.zzf();
        }
        for (zzgk zzf3 : this.zzh) {
            zzf3.zzf();
        }
        for (zzgk zzf4 : this.zzi) {
            zzf4.zzf();
        }
        for (zzgk zzf5 : this.zzj) {
            zzf5.zzf();
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzh.clear();
        this.zzi.clear();
        this.zzj.clear();
        zzlt zzlt = this.zzk;
        if (zzlt != null) {
            zzlt.zze();
            this.zzk = null;
        }
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        if (queryLocalInterface instanceof zzkd) {
            return (zzkd) queryLocalInterface;
        }
        return new zzkd(iBinder);
    }

    public final void disconnect() {
        if (isConnected()) {
            try {
                ((zzkd) getService()).zzf(new zzfp());
            } catch (RemoteException unused) {
            }
        }
        zzG();
        super.disconnect();
    }

    public final Feature[] getApiFeatures() {
        return new Feature[]{zza.zzf, zza.zzA, zza.zzD, zza.zzC, zza.zzE, zza.zzB, zza.zzg};
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putLong("clientId", this.zze);
        return bundle;
    }

    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    public final /* bridge */ /* synthetic */ void onConnectedLocked(IInterface iInterface) {
        super.onConnectedLocked((zzkd) iInterface);
        this.zzk = new zzlt();
    }

    public final void onConnectionSuspended(int i) {
        if (i == 1) {
            zzG();
            i = 1;
        }
        super.onConnectionSuspended(i);
    }

    public final boolean requiresGooglePlayServices() {
        return Nearby.zza(getContext());
    }

    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzA(BaseImplementation.ResultHolder resultHolder, byte[] bArr, String str, ListenerHolder listenerHolder, AdvertisingOptions advertisingOptions) throws RemoteException {
        zzfx zzfx = new zzfx(listenerHolder);
        this.zzi.add(zzfx);
        zzmq zzmq = new zzmq();
        zzmq.zzg(new zzgx(resultHolder));
        zzmq.zzd(bArr);
        zzmq.zzh(str);
        zzmq.zzf(advertisingOptions);
        zzmq.zzb(zzfx);
        ((zzkd) getService()).zzk(zzmq.zzi());
    }

    public final void zzB(BaseImplementation.ResultHolder resultHolder, String str, ListenerHolder listenerHolder, DiscoveryOptions discoveryOptions) throws RemoteException {
        zzgg zzgg = new zzgg(listenerHolder);
        this.zzf.add(zzgg);
        zzmu zzmu = new zzmu();
        zzmu.zzd(new zzgv(resultHolder));
        zzmu.zze(str);
        zzmu.zzc(discoveryOptions);
        zzmu.zza(zzgg);
        ((zzkd) getService()).zzl(zzmu.zzf());
    }

    public final void zzC() throws RemoteException {
        ((zzkd) getService()).zzm(new zzmy());
    }

    public final void zzD() throws RemoteException {
        ((zzkd) getService()).zzn(new zzna());
    }

    public final void zzE() throws RemoteException {
        ((zzkd) getService()).zzo(new zznc());
    }

    public final void zzq(BaseImplementation.ResultHolder resultHolder, String str, ListenerHolder listenerHolder) throws RemoteException {
        zzgu zzgu = new zzgu(getContext(), listenerHolder, this.zzk);
        this.zzg.add(zzgu);
        zzfh zzfh = new zzfh();
        zzfh.zze(new zzgv(resultHolder));
        zzfh.zzd(str);
        zzfh.zzc(zzgu);
        ((zzkd) getService()).zzd(zzfh.zzf());
    }

    public final void zzr(BaseImplementation.ResultHolder resultHolder, long j) throws RemoteException {
        zzfl zzfl = new zzfl();
        zzfl.zzb(new zzgv(resultHolder));
        zzfl.zza(j);
        ((zzkd) getService()).zze(zzfl.zzc());
    }

    public final void zzs(String str) throws RemoteException {
        zzjj zzjj = new zzjj();
        zzjj.zza(str);
        ((zzkd) getService()).zzg(zzjj.zzb());
    }

    public final void zzt(BaseImplementation.ResultHolder resultHolder, String str) throws RemoteException {
        zzme zzme = new zzme();
        zzme.zzb(new zzgv(resultHolder));
        zzme.zza(str);
        ((zzkd) getService()).zzh(zzme.zzc());
    }

    public final void zzu(BaseImplementation.ResultHolder resultHolder, String str, String str2, ListenerHolder listenerHolder) throws RemoteException {
        zzfx zzfx = new zzfx(listenerHolder);
        this.zzi.add(zzfx);
        zzmi zzmi = new zzmi();
        zzmi.zzi(new zzgv(resultHolder));
        zzmi.zzf(str);
        zzmi.zzh(str2);
        zzmi.zzb(zzfx);
        ((zzkd) getService()).zzi(zzmi.zzj());
    }

    public final void zzv(BaseImplementation.ResultHolder resultHolder, byte[] bArr, String str, ListenerHolder listenerHolder) throws RemoteException {
        zzfx zzfx = new zzfx(listenerHolder);
        this.zzi.add(zzfx);
        zzmi zzmi = new zzmi();
        zzmi.zzi(new zzgv(resultHolder));
        zzmi.zzd(bArr);
        zzmi.zzh(str);
        zzmi.zzb(zzfx);
        ((zzkd) getService()).zzi(zzmi.zzj());
    }

    public final void zzw(BaseImplementation.ResultHolder resultHolder, String str, String str2, ListenerHolder listenerHolder, ConnectionOptions connectionOptions) throws RemoteException {
        zzfx zzfx = new zzfx(listenerHolder);
        this.zzi.add(zzfx);
        zzmi zzmi = new zzmi();
        zzmi.zzi(new zzgv(resultHolder));
        zzmi.zzf(str);
        zzmi.zzh(str2);
        zzmi.zzb(zzfx);
        zzmi.zzg(connectionOptions);
        ((zzkd) getService()).zzi(zzmi.zzj());
    }

    public final void zzx(BaseImplementation.ResultHolder resultHolder, byte[] bArr, String str, ListenerHolder listenerHolder, ConnectionOptions connectionOptions) throws RemoteException {
        zzfx zzfx = new zzfx(listenerHolder);
        this.zzi.add(zzfx);
        zzmi zzmi = new zzmi();
        zzmi.zzi(new zzgv(resultHolder));
        zzmi.zzd(bArr);
        zzmi.zzh(str);
        zzmi.zzb(zzfx);
        zzmi.zzg(connectionOptions);
        ((zzkd) getService()).zzi(zzmi.zzj());
    }

    public final void zzy(BaseImplementation.ResultHolder resultHolder, String[] strArr, Payload payload, boolean z) throws RemoteException {
        Pair pair;
        String str;
        try {
            int type = payload.getType();
            if (type == 1) {
                zzlz zzlz = new zzlz();
                zzlz.zzd(payload.getId());
                zzlz.zzm(payload.getType());
                byte[] asBytes = payload.asBytes();
                if (asBytes == null || asBytes.length <= 32768) {
                    zzlz.zza(asBytes);
                } else {
                    zzlv zzlv = new zzlv();
                    zzlv.zza(asBytes);
                    zzlz.zzk(zzlv.zzb());
                    zzlz.zza(Arrays.copyOf(asBytes, 32768));
                }
                pair = Pair.create(zzlz.zzn(), zzsc.zzc());
            } else if (type == 2) {
                Payload.File asFile = payload.asFile();
                zzsg.zzc(asFile, "File cannot be null for Payload.Type.FILE");
                File asJavaFile = asFile.asJavaFile();
                if (asJavaFile == null) {
                    str = null;
                } else {
                    str = asJavaFile.getAbsolutePath();
                }
                zzlz zzlz2 = new zzlz();
                zzlz2.zzd(payload.getId());
                zzlz2.zzm(payload.getType());
                zzlz2.zzb(asFile.asParcelFileDescriptor());
                zzlz2.zzf(str);
                zzlz2.zzg(asFile.getSize());
                zzlz2.zzh(payload.getOffset());
                zzlz2.zze(payload.zzf());
                zzlz2.zzj(0);
                zzlz2.zzc(payload.zzd());
                zzlz2.zzi(payload.zze());
                pair = Pair.create(zzlz2.zzn(), zzsc.zzc());
            } else if (type == 3) {
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor[] createPipe2 = ParcelFileDescriptor.createPipe();
                zzlz zzlz3 = new zzlz();
                zzlz3.zzd(payload.getId());
                zzlz3.zzm(payload.getType());
                zzlz3.zzb(createPipe[0]);
                zzlz3.zzl(createPipe2[0]);
                zzlz3.zzh(payload.getOffset());
                zzlz3.zzj(0);
                pair = Pair.create(zzlz3.zzn(), zzsc.zzd(Pair.create(createPipe[1], createPipe2[1])));
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(String.format("Outgoing Payload %d has unknown type %d", new Object[]{Long.valueOf(payload.getId()), Integer.valueOf(payload.getType())}));
                Log.wtf("NearbyConnections", "Unknown payload type!", illegalArgumentException);
                throw illegalArgumentException;
            }
            zzmm zzmm = new zzmm();
            zzmm.zzc(new zzgv(resultHolder));
            zzmm.zzb(strArr);
            zzmm.zza((zzmb) pair.first);
            ((zzkd) getService()).zzj(zzmm.zzd());
            if (((zzsc) pair.second).zzb()) {
                Pair pair2 = (Pair) ((zzsc) pair.second).zza();
                this.zzk.zzd(payload.asStream().asInputStream(), new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair2.first), new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair2.second), (zzmb) pair.first, payload.getId());
            }
        } catch (IOException e) {
            String.format("Unable to create PFD pipe for streaming payload %d from client to service.", new Object[]{Long.valueOf(payload.getId())});
            throw e;
        } catch (IOException unused) {
            resultHolder.setResult(zzF(ConnectionsStatusCodes.STATUS_PAYLOAD_IO_ERROR));
        }
    }

    public final void zzz(BaseImplementation.ResultHolder resultHolder, String str, String str2, ListenerHolder listenerHolder, AdvertisingOptions advertisingOptions) throws RemoteException {
        zzfx zzfx = new zzfx(listenerHolder);
        this.zzi.add(zzfx);
        zzmq zzmq = new zzmq();
        zzmq.zzg(new zzgx(resultHolder));
        zzmq.zze(str);
        zzmq.zzh(str2);
        zzmq.zzf(advertisingOptions);
        zzmq.zzb(zzfx);
        ((zzkd) getService()).zzk(zzmq.zzi());
    }
}
