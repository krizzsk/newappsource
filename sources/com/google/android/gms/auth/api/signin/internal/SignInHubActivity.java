package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1033p;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import p104h2.C5037a;
import p104h2.C5039b;
import p117i2.C5260b;

@KeepName
public class SignInHubActivity extends FragmentActivity {
    private static boolean zba = false;
    private boolean zbb = false;
    private SignInConfiguration zbc;
    private boolean zbd;
    /* access modifiers changed from: private */
    public int zbe;
    /* access modifiers changed from: private */
    public Intent zbf;

    private final void zbc() {
        C5037a supportLoaderManager = getSupportLoaderManager();
        zbw zbw = new zbw(this, (zbv) null);
        C5039b bVar = (C5039b) supportLoaderManager;
        if (bVar.f17014b.f17026c) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C5039b.C5040a aVar = (C5039b.C5040a) bVar.f17014b.f17025b.mo22434g(0, (Integer) null);
            if (aVar == null) {
                bVar.mo20764c(zbw, (C5260b) null);
            } else {
                C1033p pVar = bVar.f17013a;
                C5039b.C5041b<D> bVar2 = new C5039b.C5041b<>(aVar.f17017c, zbw);
                aVar.observe(pVar, bVar2);
                C5039b.C5041b<D> bVar3 = aVar.f17019e;
                if (bVar3 != null) {
                    aVar.removeObserver(bVar3);
                }
                aVar.f17018d = pVar;
                aVar.f17019e = bVar2;
            }
            zba = false;
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    private final void zbd(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        zba = false;
    }

    private final void zbe(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.zbc);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.zbb = true;
            zbd(17);
        }
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (!this.zbb) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
                    if (signInAccount != null && signInAccount.zba() != null) {
                        GoogleSignInAccount zba2 = signInAccount.zba();
                        zbn zbc2 = zbn.zbc(this);
                        GoogleSignInOptions zba3 = this.zbc.zba();
                        zba2.getClass();
                        zbc2.zbe(zba3, zba2);
                        intent.removeExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
                        intent.putExtra("googleSignInAccount", zba2);
                        this.zbd = true;
                        this.zbe = i2;
                        this.zbf = intent;
                        zbc();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = GoogleSignInStatusCodes.SIGN_IN_CANCELLED;
                        }
                        zbd(intExtra);
                        return;
                    }
                }
                zbd(8);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            zbd(GoogleSignInStatusCodes.SIGN_IN_FAILED);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle bundleExtra = intent.getBundleExtra("config");
            bundleExtra.getClass();
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                setResult(0);
                finish();
                return;
            }
            this.zbc = signInConfiguration;
            if (bundle != null) {
                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                this.zbd = z;
                if (z) {
                    this.zbe = bundle.getInt("signInResultCode");
                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                    intent2.getClass();
                    this.zbf = intent2;
                    zbc();
                }
            } else if (zba) {
                setResult(0);
                zbd(GoogleSignInStatusCodes.SIGN_IN_CURRENTLY_IN_PROGRESS);
            } else {
                zba = true;
                zbe(action);
            }
        } else {
            "Unknown action: ".concat(String.valueOf(intent.getAction()));
            finish();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        zba = false;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.zbd);
        if (this.zbd) {
            bundle.putInt("signInResultCode", this.zbe);
            bundle.putParcelable("signInResultData", this.zbf);
        }
    }
}
