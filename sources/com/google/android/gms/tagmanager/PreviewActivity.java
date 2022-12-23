package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public class PreviewActivity extends Activity {
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        try {
            super.onCreate(bundle);
            zzbg zzbg = zzdh.zzb;
            zzbg.zzb("Preview activity");
            Uri data = getIntent().getData();
            if (data == null) {
                zzdh.zza("data is null in PreviewActivity.onCreate");
                return;
            }
            if (!TagManager.getInstance(this).zzd(data)) {
                String valueOf = String.valueOf(data);
                StringBuilder sb = new StringBuilder(valueOf.length() + 73);
                sb.append("Cannot preview the app with the uri: ");
                sb.append(valueOf);
                sb.append(". Launching current version instead.");
                String sb2 = sb.toString();
                zzdh.zzc(sb2);
                AlertDialog create = new AlertDialog.Builder(this).create();
                create.setTitle("Preview failure");
                create.setMessage(sb2);
                create.setButton(-1, "Continue", new zzdz(this));
                create.show();
            }
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            if (launchIntentForPackage != null) {
                String valueOf2 = String.valueOf(getPackageName());
                if (valueOf2.length() != 0) {
                    str3 = "Invoke the launch activity for package name: ".concat(valueOf2);
                } else {
                    str3 = new String("Invoke the launch activity for package name: ");
                }
                zzbg.zzb(str3);
                startActivity(launchIntentForPackage);
                return;
            }
            String valueOf3 = String.valueOf(getPackageName());
            if (valueOf3.length() != 0) {
                str2 = "No launch activity found for package name: ".concat(valueOf3);
            } else {
                str2 = new String("No launch activity found for package name: ");
            }
            zzbg.zzb(str2);
        } catch (Exception e) {
            String valueOf4 = String.valueOf(e.getMessage());
            if (valueOf4.length() != 0) {
                str = "Calling preview threw an exception: ".concat(valueOf4);
            } else {
                str = new String("Calling preview threw an exception: ");
            }
            zzdh.zza(str);
        }
    }
}
