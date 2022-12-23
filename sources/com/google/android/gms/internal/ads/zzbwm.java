package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.amazonaws.http.HttpHeader;
import com.appboy.models.outgoing.FacebookUser;
import com.appboy.models.outgoing.TwitterUser;
import com.google.android.gms.ads.impl.C25559R;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

public final class zzbwm extends zzbwu {
    private final Map zza;
    /* access modifiers changed from: private */
    public final Context zzb;
    private final String zzc = zze(TwitterUser.DESCRIPTION_KEY);
    private final long zzd = zzd("start_ticks");
    private final long zze = zzd("end_ticks");
    private final String zzf = zze("summary");
    private final String zzg = zze(FacebookUser.LOCATION_OUTER_OBJECT_KEY);

    public zzbwm(zzcli zzcli, Map map) {
        super(zzcli, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcli.zzk();
    }

    private final long zzd(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private final String zze(String str) {
        return TextUtils.isEmpty((CharSequence) this.zza.get(str)) ? "" : (String) this.zza.get(str);
    }

    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra(TwitterUser.DESCRIPTION_KEY, this.zzf);
        long j = this.zzd;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.zze;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void zzc() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.zzb == null) {
            zzg("Activity context is not available.");
            return;
        }
        zzt.zzp();
        if (!new zzbhi(this.zzb).zzb()) {
            zzg("This feature is not available on the device.");
            return;
        }
        zzt.zzp();
        AlertDialog.Builder builder = new AlertDialog.Builder(this.zzb);
        Resources zzd2 = zzt.zzo().zzd();
        if (zzd2 != null) {
            str = zzd2.getString(C25559R.string.f63822s5);
        } else {
            str = "Create calendar event";
        }
        builder.setTitle(str);
        if (zzd2 != null) {
            str2 = zzd2.getString(C25559R.string.f63823s6);
        } else {
            str2 = "Allow Ad to create a calendar event?";
        }
        builder.setMessage(str2);
        if (zzd2 != null) {
            str3 = zzd2.getString(C25559R.string.f63820s3);
        } else {
            str3 = HttpHeader.ACCEPT;
        }
        builder.setPositiveButton(str3, new zzbwk(this));
        if (zzd2 != null) {
            str4 = zzd2.getString(C25559R.string.f63821s4);
        } else {
            str4 = "Decline";
        }
        builder.setNegativeButton(str4, new zzbwl(this));
        builder.create().show();
    }
}
