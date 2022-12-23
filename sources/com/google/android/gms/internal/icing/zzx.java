package com.google.android.gms.internal.icing;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appindexing.AppIndexApi;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.zip.CRC32;

@ShowFirstParty
@SafeParcelable.Class(creator = "UsageInfoCreator")
@SafeParcelable.Reserved({1000})
public final class zzx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new zzy();
    @SafeParcelable.Field(mo65739id = 1)
    public final zzi zza;
    @SafeParcelable.Field(mo65739id = 2)
    public final long zzb;
    @SafeParcelable.Field(mo65739id = 3)
    public int zzc;
    @SafeParcelable.Field(mo65739id = 4)
    public final String zzd;
    @SafeParcelable.Field(mo65739id = 5)
    public final zzg zze;
    @SafeParcelable.Field(defaultValue = "false", mo65739id = 6)
    public final boolean zzf;
    @SafeParcelable.Field(defaultValue = "-1", mo65739id = 7)
    public int zzg;
    @SafeParcelable.Field(mo65739id = 8)
    public int zzh;
    @SafeParcelable.Field(mo65739id = 9)
    public final String zzi;

    @SafeParcelable.Constructor
    public zzx(@SafeParcelable.Param(mo65742id = 1) zzi zzi2, @SafeParcelable.Param(mo65742id = 2) long j, @SafeParcelable.Param(mo65742id = 3) int i, @SafeParcelable.Param(mo65742id = 4) String str, @SafeParcelable.Param(mo65742id = 5) zzg zzg2, @SafeParcelable.Param(mo65742id = 6) boolean z, @SafeParcelable.Param(mo65742id = 7) int i2, @SafeParcelable.Param(mo65742id = 8) int i3, @SafeParcelable.Param(mo65742id = 9) String str2) {
        this.zza = zzi2;
        this.zzb = j;
        this.zzc = i;
        this.zzd = str;
        this.zze = zzg2;
        this.zzf = z;
        this.zzg = i2;
        this.zzh = i3;
        this.zzi = str2;
    }

    public static zzi zza(String str, Intent intent) {
        return zzc(str, zze(intent));
    }

    @VisibleForTesting
    public static zzf zzb(Intent intent, String str, Uri uri, String str2, List<AppIndexApi.AppIndexingLink> list) {
        String string;
        zzf zzf2 = new zzf();
        if (str != null) {
            zzr zzr = new zzr("title");
            zzr.zzc(true);
            zzr.zzd("name");
            zzf2.zza(new zzk(str, zzr.zze(), zzq.zzb("text1"), (byte[]) null));
        }
        if (uri != null) {
            String uri2 = uri.toString();
            zzr zzr2 = new zzr("web_url");
            zzr2.zzb(true);
            zzr2.zzd("url");
            zzf2.zza(new zzk(uri2, zzr2.zze(), zzk.zza, (byte[]) null));
        }
        if (list != null) {
            zzan zza2 = zzaq.zza();
            int size = list.size();
            zzap[] zzapArr = new zzap[size];
            for (int i = 0; i < size; i++) {
                zzao zza3 = zzap.zza();
                AppIndexApi.AppIndexingLink appIndexingLink = list.get(i);
                zza3.zza(appIndexingLink.appIndexingUrl.toString());
                zza3.zzc(appIndexingLink.viewId);
                Uri uri3 = appIndexingLink.webUrl;
                if (uri3 != null) {
                    zza3.zzb(uri3.toString());
                }
                zzapArr[i] = (zzap) zza3.zzj();
            }
            zza2.zza(Arrays.asList(zzapArr));
            byte[] zzh2 = ((zzaq) zza2.zzj()).zzh();
            zzr zzr3 = new zzr("outlinks");
            zzr3.zzb(true);
            zzr3.zzd(".private:outLinks");
            zzr3.zza("blob");
            zzf2.zza(new zzk((String) null, zzr3.zze(), zzk.zza, zzh2));
        }
        String action = intent.getAction();
        if (action != null) {
            zzf2.zza(zzd("intent_action", action));
        }
        String dataString = intent.getDataString();
        if (dataString != null) {
            zzf2.zza(zzd("intent_data", dataString));
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            zzf2.zza(zzd("intent_activity", component.getClassName()));
        }
        Bundle extras = intent.getExtras();
        if (!(extras == null || (string = extras.getString("intent_extra_data_key")) == null)) {
            zzf2.zza(zzd("intent_extra_data", string));
        }
        if (str2 != null) {
            zzf2.zzb(str2);
        }
        zzf2.zzc(true);
        return zzf2;
    }

    private static zzi zzc(String str, String str2) {
        return new zzi(str, "", str2);
    }

    private static zzk zzd(String str, String str2) {
        zzr zzr = new zzr(str);
        zzr.zzb(true);
        return new zzk(str2, zzr.zze(), zzq.zzb(str), (byte[]) null);
    }

    private static String zze(Intent intent) {
        String uri = intent.toUri(1);
        CRC32 crc32 = new CRC32();
        try {
            crc32.update(uri.getBytes("UTF-8"));
            return Long.toHexString(crc32.getValue());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String toString() {
        return String.format(Locale.US, "UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", new Object[]{this.zza, Long.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzh)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    public zzx(String str, Intent intent, String str2, Uri uri, String str3, List<AppIndexApi.AppIndexingLink> list, int i) {
        this(zzc(str, zze(intent)), System.currentTimeMillis(), 0, (String) null, zzb(intent, str2, uri, (String) null, list).zze(), false, -1, 1, (String) null);
        String str4 = str;
        Intent intent2 = intent;
        String str5 = str2;
    }
}
