package com.google.android.gms.internal.wallet;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.WalletConstants;
import java.lang.ref.WeakReference;

final class zzw extends zzx {
    private final WeakReference zza;
    private final int zzb;

    public zzw(Activity activity, int i) {
        this.zza = new WeakReference(activity);
        this.zzb = i;
    }

    public final void zzb(int i, FullWallet fullWallet, Bundle bundle) {
        PendingIntent pendingIntent;
        int i2;
        int i3;
        Activity activity = (Activity) this.zza.get();
        if (activity != null) {
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
            } else {
                pendingIntent = null;
            }
            ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
            if (connectionResult.hasResolution()) {
                try {
                    connectionResult.startResolutionForResult(activity, this.zzb);
                } catch (IntentSender.SendIntentException unused) {
                }
            } else {
                Intent intent = new Intent();
                if (connectionResult.isSuccess()) {
                    intent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", fullWallet);
                    i2 = -1;
                } else {
                    if (i == 408) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                    intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, i);
                    i2 = i3;
                }
                PendingIntent createPendingResult = activity.createPendingResult(this.zzb, intent, 1073741824);
                if (createPendingResult != null) {
                    try {
                        createPendingResult.send(i2);
                    } catch (PendingIntent.CanceledException unused2) {
                    }
                }
            }
        }
    }

    public final void zzd(int i, MaskedWallet maskedWallet, Bundle bundle) {
        PendingIntent pendingIntent;
        int i2;
        int i3;
        Activity activity = (Activity) this.zza.get();
        if (activity != null) {
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
            } else {
                pendingIntent = null;
            }
            ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
            if (connectionResult.hasResolution()) {
                try {
                    connectionResult.startResolutionForResult(activity, this.zzb);
                } catch (IntentSender.SendIntentException unused) {
                }
            } else {
                Intent intent = new Intent();
                if (connectionResult.isSuccess()) {
                    intent.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", maskedWallet);
                    i2 = -1;
                } else {
                    if (i == 408) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                    intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, i);
                    i2 = i3;
                }
                PendingIntent createPendingResult = activity.createPendingResult(this.zzb, intent, 1073741824);
                if (createPendingResult != null) {
                    try {
                        createPendingResult.send(i2);
                    } catch (PendingIntent.CanceledException unused2) {
                    }
                }
            }
        }
    }

    public final void zzg(int i, boolean z, Bundle bundle) {
        Activity activity = (Activity) this.zza.get();
        if (activity != null) {
            Intent intent = new Intent();
            intent.putExtra(WalletConstants.EXTRA_IS_USER_PREAUTHORIZED, z);
            PendingIntent createPendingResult = activity.createPendingResult(this.zzb, intent, 1073741824);
            if (createPendingResult != null) {
                try {
                    createPendingResult.send(-1);
                } catch (PendingIntent.CanceledException unused) {
                }
            }
        }
    }

    public final void zzh(int i, Bundle bundle) {
        Preconditions.checkNotNull(bundle, "Bundle should not be null");
        Activity activity = (Activity) this.zza.get();
        if (activity != null) {
            ConnectionResult connectionResult = new ConnectionResult(i, (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT"));
            if (connectionResult.hasResolution()) {
                try {
                    connectionResult.startResolutionForResult(activity, this.zzb);
                } catch (IntentSender.SendIntentException unused) {
                }
            } else {
                "Create Wallet Objects confirmation UI will not be shown connection result: ".concat(connectionResult.toString());
                Intent intent = new Intent();
                intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, WalletConstants.ERROR_CODE_UNKNOWN);
                PendingIntent createPendingResult = activity.createPendingResult(this.zzb, intent, 1073741824);
                if (createPendingResult != null) {
                    try {
                        createPendingResult.send(1);
                    } catch (PendingIntent.CanceledException unused2) {
                    }
                }
            }
        }
    }
}
