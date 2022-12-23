package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zzbx;
import com.google.android.gms.location.zzl;

public final class zzal extends zza implements zzam {
    public zzal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final Location zzd() throws RemoteException {
        Parcel zzA = zzA(7, zza());
        Location location = (Location) zzc.zza(zzA, Location.CREATOR);
        zzA.recycle();
        return location;
    }

    public final ICancelToken zze(CurrentLocationRequest currentLocationRequest, zzao zzao) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, currentLocationRequest);
        zzc.zzd(zza, zzao);
        Parcel zzA = zzA(87, zza);
        ICancelToken asInterface = ICancelToken.Stub.asInterface(zzA.readStrongBinder());
        zzA.recycle();
        return asInterface;
    }

    public final LocationAvailability zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzA = zzA(34, zza);
        LocationAvailability locationAvailability = (LocationAvailability) zzc.zza(zzA, LocationAvailability.CREATOR);
        zzA.recycle();
        return locationAvailability;
    }

    public final void zzg(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzak zzak) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, geofencingRequest);
        zzc.zzc(zza, pendingIntent);
        zzc.zzd(zza, zzak);
        zzB(57, zza);
    }

    public final void zzh(LocationSettingsRequest locationSettingsRequest, zzaq zzaq, String str) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, locationSettingsRequest);
        zzc.zzd(zza, zzaq);
        zza.writeString((String) null);
        zzB(63, zza);
    }

    public final void zzi(zzai zzai) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, zzai);
        zzB(67, zza);
    }

    public final void zzj(LastLocationRequest lastLocationRequest, zzao zzao) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, lastLocationRequest);
        zzc.zzd(zza, zzao);
        zzB(82, zza);
    }

    public final void zzk(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, pendingIntent);
        zzc.zzd(zza, iStatusCallback);
        zzB(73, zza);
    }

    public final void zzl(PendingIntent pendingIntent) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, pendingIntent);
        zzB(6, zza);
    }

    public final void zzm(zzbx zzbx, zzak zzak) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, zzbx);
        zzc.zzd(zza, zzak);
        zzB(74, zza);
    }

    public final void zzn(PendingIntent pendingIntent, zzak zzak, String str) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, pendingIntent);
        zzc.zzd(zza, zzak);
        zza.writeString(str);
        zzB(2, zza);
    }

    public final void zzo(String[] strArr, zzak zzak, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeStringArray(strArr);
        zzc.zzd(zza, zzak);
        zza.writeString(str);
        zzB(3, zza);
    }

    public final void zzp(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, pendingIntent);
        zzc.zzd(zza, iStatusCallback);
        zzB(69, zza);
    }

    public final void zzq(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, activityTransitionRequest);
        zzc.zzc(zza, pendingIntent);
        zzc.zzd(zza, iStatusCallback);
        zzB(72, zza);
    }

    public final void zzr(long j, boolean z, PendingIntent pendingIntent) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzc.zzb(zza, true);
        zzc.zzc(zza, pendingIntent);
        zzB(5, zza);
    }

    public final void zzs(zzl zzl, PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, zzl);
        zzc.zzc(zza, pendingIntent);
        zzc.zzd(zza, iStatusCallback);
        zzB(70, zza);
    }

    public final void zzt(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, pendingIntent);
        zzc.zzc(zza, sleepSegmentRequest);
        zzc.zzd(zza, iStatusCallback);
        zzB(79, zza);
    }

    public final void zzu(Location location) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, location);
        zzB(13, zza);
    }

    public final void zzv(Location location, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, location);
        zzc.zzd(zza, iStatusCallback);
        zzB(85, zza);
    }

    public final void zzw(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzc.zzb(zza, z);
        zzB(12, zza);
    }

    public final void zzx(boolean z, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel zza = zza();
        zzc.zzb(zza, z);
        zzc.zzd(zza, iStatusCallback);
        zzB(84, zza);
    }

    public final void zzy(zzj zzj) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, zzj);
        zzB(75, zza);
    }

    public final void zzz(zzbh zzbh) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, zzbh);
        zzB(59, zza);
    }
}
