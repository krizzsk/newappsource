package com.google.android.gms.internal.wallet;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentRequest;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.zzk;

public final class zzac extends GmsClient {
    private final Context zze;
    private final int zzf;
    private final String zzg;
    private final int zzh;
    private final boolean zzi;

    public zzac(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, int i, int i2, boolean z) {
        super(context, looper, 4, clientSettings, connectionCallbacks, onConnectionFailedListener);
        String str;
        this.zze = context;
        this.zzf = i;
        Account account = clientSettings.getAccount();
        if (account != null) {
            str = account.name;
        } else {
            str = null;
        }
        this.zzg = str;
        this.zzh = i2;
        this.zzi = z;
    }

    private final Bundle zzu() {
        int i = this.zzf;
        String packageName = this.zze.getPackageName();
        String str = this.zzg;
        int i2 = this.zzh;
        boolean z = this.zzi;
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", z);
        bundle.putString("androidPackageName", packageName);
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i2);
        return bundle;
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        if (queryLocalInterface instanceof zzs) {
            return (zzs) queryLocalInterface;
        }
        return new zzs(iBinder);
    }

    public final Feature[] getApiFeatures() {
        return zzk.zzh;
    }

    public final int getMinApkVersion() {
        return 12600000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    public final boolean requiresAccount() {
        return true;
    }

    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzp(CreateWalletObjectsRequest createWalletObjectsRequest, int i) {
        zzw zzw = new zzw((Activity) this.zze, i);
        try {
            ((zzs) getService()).zzc(createWalletObjectsRequest, zzu(), zzw);
        } catch (RemoteException unused) {
            zzw.zzh(8, Bundle.EMPTY);
        }
    }

    public final void zzq(CreateWalletObjectsRequest createWalletObjectsRequest, TaskCompletionSource taskCompletionSource) {
        Bundle zzu = zzu();
        zzu.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        zzz zzz = new zzz(taskCompletionSource);
        try {
            ((zzs) getService()).zzc(createWalletObjectsRequest, zzu, zzz);
        } catch (RemoteException unused) {
            zzz.zzh(8, Bundle.EMPTY);
        }
    }

    public final void zzr(PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest, TaskCompletionSource taskCompletionSource) {
        try {
            ((zzs) getService()).zzd(paymentCardRecognitionIntentRequest, zzu(), new zzaa(taskCompletionSource));
        } catch (RemoteException unused) {
            Status status = Status.RESULT_SUCCESS_CACHE;
        }
    }

    public final void zzs(IsReadyToPayRequest isReadyToPayRequest, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzy zzy = new zzy(taskCompletionSource);
        try {
            ((zzs) getService()).zze(isReadyToPayRequest, zzu(), zzy);
        } catch (RemoteException unused) {
            zzy.zzc(Status.RESULT_INTERNAL_ERROR, false, Bundle.EMPTY);
        }
    }

    public final void zzt(PaymentDataRequest paymentDataRequest, TaskCompletionSource taskCompletionSource) {
        Bundle zzu = zzu();
        zzu.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        zzab zzab = new zzab(taskCompletionSource);
        try {
            ((zzs) getService()).zzf(paymentDataRequest, zzu, zzab);
        } catch (RemoteException unused) {
            zzab.zzf(Status.RESULT_INTERNAL_ERROR, (PaymentData) null, Bundle.EMPTY);
        }
    }
}
