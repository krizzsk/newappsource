package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.amazonaws.http.HttpHeader;
import com.google.android.gms.ads.impl.C25559R;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

public final class zzbwr extends zzbwu {
    private final Map zza;
    /* access modifiers changed from: private */
    public final Context zzb;

    public zzbwr(zzcli zzcli, Map map) {
        super(zzcli, "storePicture");
        this.zza = map;
        this.zzb = zzcli.zzk();
    }

    public final void zzb() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.zzb == null) {
            zzg("Activity context is not available");
            return;
        }
        zzt.zzp();
        if (!new zzbhi(this.zzb).zzc()) {
            zzg("Feature is not supported by the device.");
            return;
        }
        String str5 = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str5)) {
            zzg("Image url cannot be empty.");
        } else if (URLUtil.isValidUrl(str5)) {
            String lastPathSegment = Uri.parse(str5).getLastPathSegment();
            zzt.zzp();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources zzd = zzt.zzo().zzd();
                zzt.zzp();
                AlertDialog.Builder builder = new AlertDialog.Builder(this.zzb);
                if (zzd != null) {
                    str = zzd.getString(C25559R.string.f63818s1);
                } else {
                    str = "Save image";
                }
                builder.setTitle(str);
                if (zzd != null) {
                    str2 = zzd.getString(C25559R.string.f63819s2);
                } else {
                    str2 = "Allow Ad to store image in Picture gallery?";
                }
                builder.setMessage(str2);
                if (zzd != null) {
                    str3 = zzd.getString(C25559R.string.f63820s3);
                } else {
                    str3 = HttpHeader.ACCEPT;
                }
                builder.setPositiveButton(str3, new zzbwp(this, str5, lastPathSegment));
                if (zzd != null) {
                    str4 = zzd.getString(C25559R.string.f63821s4);
                } else {
                    str4 = "Decline";
                }
                builder.setNegativeButton(str4, new zzbwq(this));
                builder.create().show();
                return;
            }
            zzg("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
        } else {
            zzg("Invalid image url: ".concat(String.valueOf(str5)));
        }
    }
}
