package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzbf;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

public class FusedLocationProviderClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    public static final String KEY_MOCK_LOCATION = "mockLocation";
    public static final String KEY_VERTICAL_ACCURACY = "verticalAccuracy";

    public FusedLocationProviderClient(Activity activity) {
        super(activity, LocationServices.API, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    private final Task zza(zzbf zzbf, ListenerHolder listenerHolder) {
        zzaq zzaq = new zzaq(this, listenerHolder);
        return doRegisterEventListener(RegistrationMethods.builder().register(new zzan(this, zzaq, listenerHolder, zzbf)).unregister(zzaq).withHolder(listenerHolder).setMethodKey(2436).build());
    }

    public Task<Void> flushLocations() {
        return doWrite(TaskApiCall.builder().run(zzad.zza).setMethodKey(2422).build());
    }

    public Task<Location> getCurrentLocation(int i, CancellationToken cancellationToken) {
        LocationRequest create = LocationRequest.create();
        create.setPriority(i);
        create.setInterval(0);
        create.setFastestInterval(0);
        create.setExpirationDuration(30000);
        zzbf zzc = zzbf.zzc((String) null, create);
        zzc.zzd(true);
        zzc.zze(30000);
        if (cancellationToken != null) {
            Preconditions.checkArgument(true ^ cancellationToken.isCancellationRequested(), "cancellationToken may not be already canceled");
        }
        Task<Location> doRead = doRead(TaskApiCall.builder().run(new zzaa(this, zzc, cancellationToken)).setMethodKey(2415).build());
        if (cancellationToken == null) {
            return doRead;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
        doRead.continueWith(new zzag(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public Task<Location> getLastLocation() {
        return doRead(TaskApiCall.builder().run(new zzak(this)).setMethodKey(2414).build());
    }

    public Task<LocationAvailability> getLocationAvailability() {
        return doRead(TaskApiCall.builder().run(zzae.zza).setMethodKey(2416).build());
    }

    public Task<Void> removeLocationUpdates(PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new zzz(pendingIntent)).setMethodKey(2418).build());
    }

    public Task<Void> requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new zzac(zzbf.zzc((String) null, locationRequest), pendingIntent)).setMethodKey(2417).build());
    }

    public Task<Void> setMockLocation(Location location) {
        boolean z;
        if (location != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        return doWrite(TaskApiCall.builder().run(new zzal(this, location)).setMethodKey(2421).build());
    }

    public Task<Void> setMockMode(boolean z) {
        return doWrite(TaskApiCall.builder().run(new zzab(this, z)).setMethodKey(2420).build());
    }

    public FusedLocationProviderClient(Context context) {
        super(context, LocationServices.API, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public Task<Location> getLastLocation(LastLocationRequest lastLocationRequest) {
        return doRead(TaskApiCall.builder().run(new zzao(this, lastLocationRequest)).setMethodKey(2414).setFeatures(zzy.zzf).build());
    }

    public Task<Void> removeLocationUpdates(LocationCallback locationCallback) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(locationCallback, "LocationCallback"), 2418).continueWith(zzaj.zza, zzai.zza);
    }

    public Task<Void> requestLocationUpdates(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        zzbf zzc = zzbf.zzc((String) null, locationRequest);
        if (looper != null || (looper = Looper.myLooper()) != null) {
            return zza(zzc, ListenerHolders.createListenerHolder(locationCallback, looper, "LocationCallback"));
        }
        throw new IllegalStateException();
    }

    public Task<Void> requestLocationUpdates(LocationRequest locationRequest, Executor executor, LocationCallback locationCallback) {
        return zza(zzbf.zzc((String) null, locationRequest), ListenerHolders.createListenerHolder(locationCallback, executor, "LocationCallback"));
    }

    public Task<Location> getCurrentLocation(CurrentLocationRequest currentLocationRequest, CancellationToken cancellationToken) {
        if (cancellationToken != null) {
            Preconditions.checkArgument(!cancellationToken.isCancellationRequested(), "cancellationToken may not be already canceled");
        }
        Task<Location> doRead = doRead(TaskApiCall.builder().run(new zzam(this, currentLocationRequest, cancellationToken)).setFeatures(zzy.zze).setMethodKey(2415).build());
        if (cancellationToken == null) {
            return doRead;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
        doRead.continueWith(new zzah(taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
