package com.google.android.gms.nearby.messages.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.nearby.zznm;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.MessagesClient;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.PublishOptions;
import com.google.android.gms.nearby.messages.StatusCallback;
import com.google.android.gms.nearby.messages.SubscribeOptions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzbh extends GoogleApi implements MessagesClient {
    public static final /* synthetic */ int zza = 0;
    private static final Api.ClientKey zzb;
    private static final Api.AbstractClientBuilder zzc;
    private static final Api zzd;
    private final int zze;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zzb = clientKey;
        zzav zzav = new zzav();
        zzc = zzav;
        zzd = new Api("Nearby.MESSAGES_API", zzav, clientKey);
    }

    public zzbh(Activity activity, MessagesOptions messagesOptions) {
        super(activity, zzd, messagesOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zze = 1;
        activity.getApplication().registerActivityLifecycleCallbacks(new zzbb(activity, this, (zzba) null));
    }

    private final ListenerHolder zzh(Object obj) {
        if (obj == null) {
            return null;
        }
        return registerListener(obj, obj.getClass().getName());
    }

    private final ListenerHolder zzi(TaskCompletionSource taskCompletionSource) {
        return registerListener(new zzay(this, taskCompletionSource), Status.class.getName());
    }

    private final Task zzj(ListenerHolder listenerHolder, zzbc zzbc, zzbc zzbc2, int i) {
        return doRegisterEventListener(RegistrationMethods.builder().withHolder(listenerHolder).register(new zzaq(this, zzbc)).unregister(new zzar(this, zzbc2)).setMethodKey(i).build());
    }

    private final Task zzk(Object obj, int i) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        doUnregisterEventListener(ListenerHolders.createListenerKey(obj, obj.getClass().getName()), i).addOnCompleteListener(new zzaz(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* access modifiers changed from: private */
    public final Task zzl(zzbc zzbc, int i) {
        return doWrite(TaskApiCall.builder().setMethodKey(i).run(new zzam(this, zzbc)).build());
    }

    public final ClientSettings.Builder createClientSettingsBuilder() {
        ClientSettings.Builder createClientSettingsBuilder = super.createClientSettingsBuilder();
        if (getApiOptions() != null) {
            String str = ((MessagesOptions) getApiOptions()).zze;
        }
        return createClientSettingsBuilder;
    }

    public final void handleIntent(Intent intent, MessageListener messageListener) {
        zznm.zzb(intent, messageListener);
    }

    public final Task<Void> publish(Message message) {
        PublishOptions publishOptions = PublishOptions.DEFAULT;
        Preconditions.checkNotNull(message);
        Preconditions.checkNotNull(publishOptions);
        ListenerHolder zzh = zzh(message);
        return zzj(zzh, new zzau(this, message, new zzaw(this, zzh(publishOptions.getCallback()), zzh), publishOptions), new zzak(message), 1291);
    }

    public final Task<Void> registerStatusCallback(StatusCallback statusCallback) {
        Preconditions.checkNotNull(statusCallback);
        ListenerHolder zzh = zzh(statusCallback);
        return zzj(zzh, new zzan(zzh), new zzao(zzh), 1270);
    }

    public final Task<Void> subscribe(PendingIntent pendingIntent) {
        zzbg zzbg;
        SubscribeOptions subscribeOptions = SubscribeOptions.DEFAULT;
        Preconditions.checkNotNull(pendingIntent);
        Preconditions.checkNotNull(subscribeOptions);
        ListenerHolder zzh = zzh(subscribeOptions.getCallback());
        if (zzh == null) {
            zzbg = null;
        } else {
            zzbg = new zzbg(zzh);
        }
        return zzl(new zzaj(this, pendingIntent, zzbg, subscribeOptions), 1288);
    }

    public final Task<Void> unpublish(Message message) {
        Preconditions.checkNotNull(message);
        return zzk(message, 1290);
    }

    public final Task<Void> unregisterStatusCallback(StatusCallback statusCallback) {
        Preconditions.checkNotNull(statusCallback);
        return zzk(statusCallback, 1271);
    }

    public final Task<Void> unsubscribe(PendingIntent pendingIntent) {
        Preconditions.checkNotNull(pendingIntent);
        return zzl(new zzal(pendingIntent), 1287);
    }

    public final /* synthetic */ void zzb(Message message, zzbe zzbe, PublishOptions publishOptions, zzai zzai, ListenerHolder listenerHolder) throws RemoteException {
        zzai.zzs(listenerHolder, zzae.zza(message), zzbe, publishOptions, this.zze);
    }

    public final /* synthetic */ void zzc(zzbc zzbc, zzai zzai, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzbc.zza(zzai, zzi(taskCompletionSource));
    }

    public final /* synthetic */ void zzd(zzbc zzbc, zzai zzai, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzbc.zza(zzai, zzi(taskCompletionSource));
    }

    public final /* synthetic */ void zze(ListenerHolder listenerHolder, zzbg zzbg, SubscribeOptions subscribeOptions, zzai zzai, ListenerHolder listenerHolder2) throws RemoteException {
        zzai.zzx(listenerHolder2, listenerHolder, zzbg, subscribeOptions, (byte[]) null, this.zze);
    }

    public final /* synthetic */ void zzf(PendingIntent pendingIntent, zzbg zzbg, SubscribeOptions subscribeOptions, zzai zzai, ListenerHolder listenerHolder) throws RemoteException {
        zzai.zzv(listenerHolder, pendingIntent, zzbg, subscribeOptions, this.zze);
    }

    public final /* synthetic */ void zzg(zzbc zzbc, zzai zzai, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzbc.zza(zzai, zzi(taskCompletionSource));
    }

    public final Task<Void> unsubscribe(MessageListener messageListener) {
        Preconditions.checkNotNull(messageListener);
        return zzk(messageListener, 1286);
    }

    public zzbh(Context context, MessagesOptions messagesOptions) {
        super(context, zzd, messagesOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zze = zzai.zzp(context);
    }

    public final Task<Void> publish(Message message, PublishOptions publishOptions) {
        Preconditions.checkNotNull(message);
        Preconditions.checkNotNull(publishOptions);
        ListenerHolder zzh = zzh(message);
        return zzj(zzh, new zzau(this, message, new zzaw(this, zzh(publishOptions.getCallback()), zzh), publishOptions), new zzak(message), 1291);
    }

    public final Task<Void> subscribe(PendingIntent pendingIntent, SubscribeOptions subscribeOptions) {
        zzbg zzbg;
        Preconditions.checkNotNull(pendingIntent);
        Preconditions.checkNotNull(subscribeOptions);
        ListenerHolder zzh = zzh(subscribeOptions.getCallback());
        if (zzh == null) {
            zzbg = null;
        } else {
            zzbg = new zzbg(zzh);
        }
        return zzl(new zzaj(this, pendingIntent, zzbg, subscribeOptions), 1288);
    }

    public final Task<Void> subscribe(MessageListener messageListener) {
        SubscribeOptions subscribeOptions = SubscribeOptions.DEFAULT;
        Preconditions.checkNotNull(messageListener);
        Preconditions.checkNotNull(subscribeOptions);
        Preconditions.checkArgument(subscribeOptions.getStrategy().zza() == 0, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent).");
        ListenerHolder zzh = zzh(messageListener);
        ListenerHolder zzh2 = zzh(subscribeOptions.getCallback());
        return zzj(zzh, new zzas(this, zzh, new zzax(this, zzh2, zzh2), subscribeOptions), new zzat(zzh), 1289);
    }

    public final Task<Void> subscribe(MessageListener messageListener, SubscribeOptions subscribeOptions) {
        Preconditions.checkNotNull(messageListener);
        Preconditions.checkNotNull(subscribeOptions);
        Preconditions.checkArgument(subscribeOptions.getStrategy().zza() == 0, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent).");
        ListenerHolder zzh = zzh(messageListener);
        ListenerHolder zzh2 = zzh(subscribeOptions.getCallback());
        return zzj(zzh, new zzas(this, zzh, new zzax(this, zzh2, zzh2), subscribeOptions), new zzat(zzh), 1289);
    }
}
