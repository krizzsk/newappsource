package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.appboy.Constants;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.p986firebaseauthapi.zzf;
import com.google.android.gms.internal.p986firebaseauthapi.zzwg;
import com.google.android.gms.internal.p986firebaseauthapi.zzwi;
import com.google.android.gms.internal.p986firebaseauthapi.zzwt;
import com.google.android.gms.internal.p986firebaseauthapi.zzyb;
import com.google.firebase.auth.FirebaseAuth;
import com.usebutton.sdk.internal.WebViewActivity;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import p067e1.C4494j;
import p090g1.C4732a;
import p130j2.C5367a;
import p382be.C13588a0;
import p382be.C13597f;
import p382be.C13613u;
import p382be.C13614v;
import p382be.C13618z;
import p743qd.C19107d;

public class RecaptchaActivity extends FragmentActivity implements zzwi {

    /* renamed from: A */
    public static final C13614v f36423A = C13614v.f33582b;

    /* renamed from: y */
    public static final ExecutorService f36424y = zzf.zza().zza(2);

    /* renamed from: z */
    public static long f36425z = 0;

    /* renamed from: x */
    public boolean f36426x = false;

    /* renamed from: b1 */
    public final void mo43314b1() {
        f36425z = 0;
        this.f36426x = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C5367a.m13473a(this).mo21147c(intent);
        f36423A.mo40508a(this);
        finish();
    }

    /* renamed from: d1 */
    public final void mo43315d1(Status status) {
        f36425z = 0;
        this.f36426x = false;
        Intent intent = new Intent();
        HashMap hashMap = C13613u.f33581a;
        SafeParcelableSerializer.serializeToIntentExtra(status, intent, "com.google.firebase.auth.internal.STATUS");
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C5367a.m13473a(this).mo21147c(intent);
        f36423A.mo40508a(this);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long currentTimeMillis = DefaultClock.getInstance().currentTimeMillis();
            if (currentTimeMillis - f36425z >= 30000) {
                f36425z = currentTimeMillis;
                if (bundle != null) {
                    this.f36426x = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
                    return;
                }
                return;
            }
            return;
        }
        "Could not do operation - unknown action: ".concat(String.valueOf(action));
        mo43314b1();
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public final void onResume() {
        String string;
        boolean isEmpty;
        super.onResume();
        String str = null;
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                mo43315d1(C13613u.m34024a(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra(WebViewActivity.EXTRA_LINK) || !intent.hasExtra("eventId")) {
                mo43314b1();
            } else {
                String stringExtra = intent.getStringExtra(WebViewActivity.EXTRA_LINK);
                C13618z zVar = C13618z.f33590a;
                Context applicationContext = getApplicationContext();
                String packageName = getPackageName();
                String stringExtra2 = intent.getStringExtra("eventId");
                synchronized (zVar) {
                    Preconditions.checkNotEmpty(packageName);
                    Preconditions.checkNotEmpty(stringExtra2);
                    SharedPreferences b = C13618z.m34029b(applicationContext, packageName);
                    String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{stringExtra2});
                    String string2 = b.getString(format, (String) null);
                    String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{stringExtra2});
                    string = b.getString(format2, (String) null);
                    SharedPreferences.Editor edit = b.edit();
                    edit.remove(format);
                    edit.remove(format2);
                    edit.apply();
                    isEmpty = TextUtils.isEmpty(string2);
                }
                if (!isEmpty) {
                    str = string;
                }
                if (TextUtils.isEmpty(str)) {
                    mo43315d1(C13597f.m34015a("Failed to find registration for this reCAPTCHA event"));
                }
                if (intent.getBooleanExtra("encryptionEnabled", true)) {
                    stringExtra = C13588a0.m34012a(getApplicationContext(), C19107d.m46266e(str).mo51538f()).mo40486b(stringExtra);
                }
                String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
                f36425z = 0;
                this.f36426x = false;
                Intent intent2 = new Intent();
                intent2.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                if (!C5367a.m13473a(this).mo21147c(intent2)) {
                    SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                    edit2.putString("recaptchaToken", queryParameter);
                    edit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                    edit2.putLong("timestamp", DefaultClock.getInstance().currentTimeMillis());
                    edit2.commit();
                } else {
                    f36423A.mo40508a(this);
                }
                finish();
            }
        } else if (!this.f36426x) {
            Intent intent3 = getIntent();
            String packageName2 = getPackageName();
            try {
                new zzwg(packageName2, Hex.bytesToStringUppercase(AndroidUtilsLight.getPackageCertificateHashBytes(this, packageName2)).toLowerCase(Locale.US), intent3, C19107d.m46266e(intent3.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME")), this).executeOnExecutor(f36424y, new Void[0]);
            } catch (PackageManager.NameNotFoundException e) {
                e.toString();
                zze(packageName2, (Status) null);
            }
            this.f36426x = true;
        } else {
            mo43314b1();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f36426x);
    }

    public final Context zza() {
        return getApplicationContext();
    }

    public final Uri.Builder zzb(Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        C19107d e = C19107d.m46266e(stringExtra3);
        FirebaseAuth instance = FirebaseAuth.getInstance(e);
        C13618z zVar = C13618z.f33590a;
        Context applicationContext = getApplicationContext();
        synchronized (zVar) {
            Preconditions.checkNotEmpty(str);
            Preconditions.checkNotEmpty(uuid);
            SharedPreferences b = C13618z.m34029b(applicationContext, str);
            C13618z.m34028a(b);
            SharedPreferences.Editor edit = b.edit();
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{uuid}), "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{uuid}), stringExtra3);
            edit.apply();
        }
        String c = C13588a0.m34012a(getApplicationContext(), e.mo51538f()).mo40487c();
        String str3 = null;
        if (TextUtils.isEmpty(c)) {
            mo43315d1(C13597f.m34015a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        synchronized (instance.f36387g) {
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            synchronized (instance.f36387g) {
            }
        } else {
            str3 = zzwt.zza();
        }
        return new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", str3).appendQueryParameter("eventId", uuid).appendQueryParameter("v", "X".concat(String.valueOf(stringExtra2))).appendQueryParameter("eid", Constants.APPBOY_PUSH_PRIORITY_KEY).appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", c);
    }

    public final String zzc(String str) {
        return zzyb.zzb(str);
    }

    public final HttpURLConnection zzd(URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            zzwi.zza.mo65852e("Error generating connection", new Object[0]);
            return null;
        }
    }

    public final void zze(String str, Status status) {
        if (status == null) {
            mo43314b1();
        } else {
            mo43315d1(status);
        }
    }

    public final void zzf(Uri uri, String str) {
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
            List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.putExtra("com.android.browser.application_id", str);
                intent.addFlags(1073741824);
                intent.addFlags(268435456);
                startActivity(intent);
                return;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW");
            if (!intent2.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                C4494j.m11720b(bundle, "android.support.customtabs.extra.SESSION", (IBinder) null);
                intent2.putExtras(bundle);
            }
            intent2.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
            intent2.putExtras(new Bundle());
            intent2.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            intent2.addFlags(1073741824);
            intent2.addFlags(268435456);
            intent2.setData(uri);
            C4732a.startActivity(this, intent2, (Bundle) null);
            return;
        }
        zze(str, (Status) null);
    }
}
