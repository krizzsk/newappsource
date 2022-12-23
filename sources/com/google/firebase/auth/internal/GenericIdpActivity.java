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
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.p986firebaseauthapi.zzaaa;
import com.google.android.gms.internal.p986firebaseauthapi.zzf;
import com.google.android.gms.internal.p986firebaseauthapi.zzwg;
import com.google.android.gms.internal.p986firebaseauthapi.zzwh;
import com.google.android.gms.internal.p986firebaseauthapi.zzwi;
import com.google.android.gms.internal.p986firebaseauthapi.zzyb;
import com.usebutton.sdk.internal.WebViewActivity;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;
import p067e1.C4494j;
import p090g1.C4732a;
import p130j2.C5367a;
import p382be.C13588a0;
import p382be.C13597f;
import p382be.C13613u;
import p382be.C13614v;
import p382be.C13617y;
import p382be.C13618z;
import p743qd.C19107d;

@KeepName
public class GenericIdpActivity extends FragmentActivity implements zzwi {

    /* renamed from: A */
    public static final C13614v f36419A = C13614v.f33582b;

    /* renamed from: z */
    public static long f36420z;

    /* renamed from: x */
    public final ExecutorService f36421x = zzf.zza().zza(1);

    /* renamed from: y */
    public boolean f36422y = false;

    /* renamed from: b1 */
    public final Uri.Builder mo43305b1(Uri.Builder builder, Intent intent, String str, String str2) {
        String str3;
        String str4;
        String str5;
        Uri.Builder builder2 = builder;
        Intent intent2 = intent;
        String str6 = str;
        String stringExtra = intent2.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent2.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent2.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent2.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            str3 = null;
        } else {
            str3 = TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, stringArrayListExtra);
        }
        Bundle bundleExtra = intent2.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            str4 = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String next : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(next);
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject.put(next, string);
                    }
                }
            } catch (JSONException unused) {
            }
            str4 = jSONObject.toString();
        }
        String uuid = UUID.randomUUID().toString();
        String zza = zzwh.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent2.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        C13618z zVar = C13618z.f33590a;
        Context applicationContext = getApplicationContext();
        synchronized (zVar) {
            Preconditions.checkNotEmpty(str);
            Preconditions.checkNotEmpty(uuid);
            Preconditions.checkNotEmpty(zza);
            Preconditions.checkNotEmpty(stringExtra4);
            SharedPreferences b = C13618z.m34029b(applicationContext, str6);
            C13618z.m34028a(b);
            SharedPreferences.Editor edit = b.edit();
            str5 = str4;
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", new Object[]{uuid}), zza);
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{uuid}), action);
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", new Object[]{uuid}), stringExtra2);
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{uuid}), stringExtra4);
            edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", stringExtra3);
            edit.apply();
        }
        String c = C13588a0.m34012a(getApplicationContext(), C19107d.m46266e(stringExtra4).mo51538f()).mo40487c();
        if (TextUtils.isEmpty(c)) {
            mo43307e1(C13597f.m34015a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        } else if (zza == null) {
            return null;
        } else {
            builder2.appendQueryParameter("eid", Constants.APPBOY_PUSH_PRIORITY_KEY).appendQueryParameter("v", "X".concat(String.valueOf(stringExtra5))).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", zza).appendQueryParameter("eventId", uuid).appendQueryParameter("apn", str6).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", c);
            if (!TextUtils.isEmpty(str3)) {
                builder2.appendQueryParameter("scopes", str3);
            }
            if (!TextUtils.isEmpty(str5)) {
                builder2.appendQueryParameter("customParameters", str5);
            }
            if (!TextUtils.isEmpty(stringExtra3)) {
                builder2.appendQueryParameter("tid", stringExtra3);
            }
            return builder2;
        }
    }

    /* renamed from: d1 */
    public final void mo43306d1() {
        f36420z = 0;
        this.f36422y = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!C5367a.m13473a(this).mo21147c(intent)) {
            C13614v vVar = f36419A;
            Status a = C13597f.m34015a("WEB_CONTEXT_CANCELED");
            vVar.getClass();
            C13614v.m34025b(this, a);
        } else {
            f36419A.mo40508a(this);
        }
        finish();
    }

    /* renamed from: e1 */
    public final void mo43307e1(Status status) {
        f36420z = 0;
        this.f36422y = false;
        Intent intent = new Intent();
        HashMap hashMap = C13613u.f33581a;
        SafeParcelableSerializer.serializeToIntentExtra(status, intent, "com.google.firebase.auth.internal.STATUS");
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!C5367a.m13473a(this).mo21147c(intent)) {
            C13614v vVar = f36419A;
            Context applicationContext = getApplicationContext();
            vVar.getClass();
            C13614v.m34025b(applicationContext, status);
        } else {
            f36419A.mo40508a(this);
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long currentTimeMillis = DefaultClock.getInstance().currentTimeMillis();
            if (currentTimeMillis - f36420z >= 30000) {
                f36420z = currentTimeMillis;
                if (bundle != null) {
                    this.f36422y = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
                    return;
                }
                return;
            }
            return;
        }
        "Could not do operation - unknown action: ".concat(String.valueOf(action));
        mo43306d1();
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public final void onResume() {
        super.onResume();
        C13617y yVar = null;
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                mo43307e1(C13613u.m34024a(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra(WebViewActivity.EXTRA_LINK) || !intent.hasExtra("eventId")) {
                mo43306d1();
            } else {
                String stringExtra = intent.getStringExtra(WebViewActivity.EXTRA_LINK);
                String stringExtra2 = intent.getStringExtra("eventId");
                String packageName = getPackageName();
                boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
                synchronized (C13618z.f33590a) {
                    Preconditions.checkNotEmpty(packageName);
                    Preconditions.checkNotEmpty(stringExtra2);
                    SharedPreferences b = C13618z.m34029b(this, packageName);
                    String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", new Object[]{stringExtra2});
                    String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{stringExtra2});
                    String format3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", new Object[]{stringExtra2});
                    String format4 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{stringExtra2});
                    String string = b.getString(format, (String) null);
                    String string2 = b.getString(format2, (String) null);
                    String string3 = b.getString(format3, (String) null);
                    String string4 = b.getString("com.google.firebase.auth.api.gms.config.tenant.id", (String) null);
                    String string5 = b.getString(format4, (String) null);
                    SharedPreferences.Editor edit = b.edit();
                    edit.remove(format);
                    edit.remove(format2);
                    edit.remove(format3);
                    edit.remove(format4);
                    edit.apply();
                    if (!(string == null || string2 == null || string3 == null)) {
                        yVar = new C13617y(string, string2, string3, string4, string5);
                    }
                }
                if (yVar == null) {
                    mo43306d1();
                }
                if (booleanExtra) {
                    stringExtra = C13588a0.m34012a(getApplicationContext(), C19107d.m46266e(yVar.f33589e).mo51538f()).mo40486b(stringExtra);
                }
                zzaaa zzaaa = new zzaaa(yVar, stringExtra);
                String str = yVar.f33588d;
                String str2 = yVar.f33586b;
                zzaaa.zzf(str);
                if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str2) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str2) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str2)) {
                    f36420z = 0;
                    this.f36422y = false;
                    Intent intent2 = new Intent();
                    SafeParcelableSerializer.serializeToIntentExtra(zzaaa, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
                    intent2.putExtra("com.google.firebase.auth.internal.OPERATION", str2);
                    intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                    if (!C5367a.m13473a(this).mo21147c(intent2)) {
                        SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                        edit2.putString("verifyAssertionRequest", SafeParcelableSerializer.serializeToString(zzaaa));
                        edit2.putString("operation", str2);
                        edit2.putString("tenantId", str);
                        edit2.putLong("timestamp", DefaultClock.getInstance().currentTimeMillis());
                        edit2.commit();
                    } else {
                        f36419A.mo40508a(this);
                    }
                    finish();
                    return;
                }
                "unsupported operation: ".concat(str2);
                mo43306d1();
            }
        } else if (!this.f36422y) {
            String packageName2 = getPackageName();
            try {
                String lowerCase = Hex.bytesToStringUppercase(AndroidUtilsLight.getPackageCertificateHashBytes(this, packageName2)).toLowerCase(Locale.US);
                C19107d e = C19107d.m46266e(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                if (!zzyb.zzg(e)) {
                    new zzwg(packageName2, lowerCase, getIntent(), e, this).executeOnExecutor(this.f36421x, new Void[0]);
                } else {
                    e.mo51535a();
                    zzf(mo43305b1(Uri.parse(zzyb.zza(e.f48570c.f48581a)).buildUpon(), getIntent(), packageName2, lowerCase).build(), packageName2);
                }
            } catch (PackageManager.NameNotFoundException e2) {
                e2.toString();
                zze(packageName2, (Status) null);
            }
            this.f36422y = true;
        } else {
            mo43306d1();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f36422y);
    }

    public final Context zza() {
        return getApplicationContext();
    }

    public final Uri.Builder zzb(Intent intent, String str, String str2) {
        return mo43305b1(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    public final String zzc(String str) {
        return zzyb.zzb(str);
    }

    public final HttpURLConnection zzd(URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            return null;
        }
    }

    public final void zze(String str, Status status) {
        if (status == null) {
            mo43306d1();
        } else {
            mo43307e1(status);
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
            intent2.setData(uri);
            C4732a.startActivity(this, intent2, (Bundle) null);
            return;
        }
        zze(str, (Status) null);
    }
}
