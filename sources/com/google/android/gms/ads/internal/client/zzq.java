package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AdSizeParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    @SafeParcelable.Field(mo65739id = 2)
    public final String zza;
    @SafeParcelable.Field(mo65739id = 3)
    public final int zzb;
    @SafeParcelable.Field(mo65739id = 4)
    public final int zzc;
    @SafeParcelable.Field(mo65739id = 5)
    public final boolean zzd;
    @SafeParcelable.Field(mo65739id = 6)
    public final int zze;
    @SafeParcelable.Field(mo65739id = 7)
    public final int zzf;
    @SafeParcelable.Field(mo65739id = 8)
    public final zzq[] zzg;
    @SafeParcelable.Field(mo65739id = 9)
    public final boolean zzh;
    @SafeParcelable.Field(mo65739id = 10)
    public final boolean zzi;
    @SafeParcelable.Field(mo65739id = 11)
    public boolean zzj;
    @SafeParcelable.Field(mo65739id = 12)
    public boolean zzk;
    @SafeParcelable.Field(mo65739id = 13)
    public boolean zzl;
    @SafeParcelable.Field(mo65739id = 14)
    public boolean zzm;
    @SafeParcelable.Field(mo65739id = 15)
    public boolean zzn;
    @SafeParcelable.Field(mo65739id = 16)
    public boolean zzo;

    public zzq() {
        this("interstitial_mb", 0, 0, true, 0, 0, (zzq[]) null, false, false, false, false, false, false, false, false);
    }

    public static int zza(DisplayMetrics displayMetrics) {
        return (int) (((float) zzf(displayMetrics)) * displayMetrics.density);
    }

    public static zzq zzb() {
        return new zzq("interstitial_mb", 0, 0, false, 0, 0, (zzq[]) null, false, false, false, false, true, false, false, false);
    }

    public static zzq zzc() {
        return new zzq("320x50_mb", 0, 0, false, 0, 0, (zzq[]) null, true, false, false, false, false, false, false, false);
    }

    public static zzq zzd() {
        return new zzq("reward_mb", 0, 0, true, 0, 0, (zzq[]) null, false, false, false, false, false, false, false, false);
    }

    public static zzq zze() {
        return new zzq("invalid", 0, 0, false, 0, 0, (zzq[]) null, false, false, false, true, false, false, false, false);
    }

    private static int zzf(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzn);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzq(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzq(android.content.Context r14, com.google.android.gms.ads.AdSize[] r15) {
        /*
            r13 = this;
            r13.<init>()
            r0 = 0
            r1 = r15[r0]
            r13.zzd = r0
            boolean r2 = r1.isFluid()
            r13.zzi = r2
            boolean r3 = com.google.android.gms.ads.zzb.zzf(r1)
            r13.zzm = r3
            boolean r3 = com.google.android.gms.ads.zzb.zzg(r1)
            r13.zzn = r3
            boolean r3 = com.google.android.gms.ads.zzb.zzh(r1)
            r13.zzo = r3
            if (r2 == 0) goto L_0x0031
            com.google.android.gms.ads.AdSize r3 = com.google.android.gms.ads.AdSize.BANNER
            int r4 = r3.getWidth()
            r13.zze = r4
            int r3 = r3.getHeight()
            r13.zzb = r3
            goto L_0x005d
        L_0x0031:
            boolean r4 = r13.zzn
            if (r4 == 0) goto L_0x0042
            int r3 = r1.getWidth()
            r13.zze = r3
            int r3 = com.google.android.gms.ads.zzb.zza(r1)
            r13.zzb = r3
            goto L_0x005d
        L_0x0042:
            if (r3 == 0) goto L_0x0051
            int r3 = r1.getWidth()
            r13.zze = r3
            int r3 = com.google.android.gms.ads.zzb.zzb(r1)
            r13.zzb = r3
            goto L_0x005d
        L_0x0051:
            int r3 = r1.getWidth()
            r13.zze = r3
            int r3 = r1.getHeight()
            r13.zzb = r3
        L_0x005d:
            int r4 = r13.zze
            android.content.res.Resources r5 = r14.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            r6 = -1
            if (r4 != r6) goto L_0x00f4
            com.google.android.gms.ads.internal.client.zzaw.zzb()
            android.content.res.Resources r7 = r14.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.orientation
            r8 = 2
            if (r7 == r8) goto L_0x007b
            goto L_0x00dc
        L_0x007b:
            android.content.res.Resources r7 = r14.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r8 = r7.heightPixels
            float r8 = (float) r8
            float r7 = r7.density
            float r8 = r8 / r7
            int r7 = (int) r8
            r8 = 600(0x258, float:8.41E-43)
            if (r7 >= r8) goto L_0x00dc
            com.google.android.gms.ads.internal.client.zzaw.zzb()
            android.content.res.Resources r7 = r14.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            java.lang.String r8 = "window"
            java.lang.Object r8 = r14.getSystemService(r8)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            if (r8 == 0) goto L_0x00dc
            android.view.Display r8 = r8.getDefaultDisplay()
            r8.getRealMetrics(r7)
            int r9 = r7.heightPixels
            int r10 = r7.widthPixels
            r8.getMetrics(r7)
            int r8 = r7.heightPixels
            int r7 = r7.widthPixels
            if (r8 != r9) goto L_0x00dc
            if (r7 != r10) goto L_0x00dc
            int r7 = r5.widthPixels
            com.google.android.gms.ads.internal.client.zzaw.zzb()
            android.content.res.Resources r8 = r14.getResources()
            java.lang.String r9 = "navigation_bar_width"
            java.lang.String r10 = "dimen"
            java.lang.String r11 = "android"
            int r8 = r8.getIdentifier(r9, r10, r11)
            if (r8 <= 0) goto L_0x00d7
            android.content.res.Resources r9 = r14.getResources()
            int r8 = r9.getDimensionPixelSize(r8)
            goto L_0x00d8
        L_0x00d7:
            r8 = 0
        L_0x00d8:
            int r7 = r7 - r8
            r13.zzf = r7
            goto L_0x00e0
        L_0x00dc:
            int r7 = r5.widthPixels
            r13.zzf = r7
        L_0x00e0:
            float r7 = (float) r7
            float r8 = r5.density
            float r7 = r7 / r8
            double r7 = (double) r7
            int r9 = (int) r7
            double r10 = (double) r9
            double r7 = r7 - r10
            r10 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0101
            int r9 = r9 + 1
            goto L_0x0101
        L_0x00f4:
            int r9 = r13.zze
            com.google.android.gms.ads.internal.client.zzaw.zzb()
            int r7 = r13.zze
            int r7 = com.google.android.gms.internal.ads.zzcfb.zzn(r5, r7)
            r13.zzf = r7
        L_0x0101:
            r7 = -2
            if (r3 != r7) goto L_0x0109
            int r8 = zzf(r5)
            goto L_0x010b
        L_0x0109:
            int r8 = r13.zzb
        L_0x010b:
            com.google.android.gms.ads.internal.client.zzaw.zzb()
            int r5 = com.google.android.gms.internal.ads.zzcfb.zzn(r5, r8)
            r13.zzc = r5
            java.lang.String r5 = "_as"
            java.lang.String r10 = "x"
            if (r4 == r6) goto L_0x014e
            if (r3 != r7) goto L_0x011d
            goto L_0x014e
        L_0x011d:
            boolean r3 = r13.zzn
            if (r3 != 0) goto L_0x0132
            boolean r3 = r13.zzo
            if (r3 == 0) goto L_0x0126
            goto L_0x0132
        L_0x0126:
            if (r2 == 0) goto L_0x012b
            java.lang.String r1 = "320x50_mb"
            goto L_0x014b
        L_0x012b:
            java.lang.String r1 = r1.toString()
            r13.zza = r1
            goto L_0x0165
        L_0x0132:
            int r1 = r13.zze
            int r2 = r13.zzb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r10)
            r3.append(r2)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
        L_0x014b:
            r13.zza = r1
            goto L_0x0165
        L_0x014e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r10)
            r1.append(r8)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r13.zza = r1
        L_0x0165:
            int r1 = r15.length
            r2 = 1
            if (r1 <= r2) goto L_0x017f
            com.google.android.gms.ads.internal.client.zzq[] r1 = new com.google.android.gms.ads.internal.client.zzq[r1]
            r13.zzg = r1
            r1 = 0
        L_0x016e:
            int r2 = r15.length
            if (r1 >= r2) goto L_0x0182
            com.google.android.gms.ads.internal.client.zzq[] r2 = r13.zzg
            com.google.android.gms.ads.internal.client.zzq r3 = new com.google.android.gms.ads.internal.client.zzq
            r4 = r15[r1]
            r3.<init>((android.content.Context) r14, (com.google.android.gms.ads.AdSize) r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x016e
        L_0x017f:
            r14 = 0
            r13.zzg = r14
        L_0x0182:
            r13.zzh = r0
            r13.zzj = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzq.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) int i, @SafeParcelable.Param(mo65742id = 4) int i2, @SafeParcelable.Param(mo65742id = 5) boolean z, @SafeParcelable.Param(mo65742id = 6) int i3, @SafeParcelable.Param(mo65742id = 7) int i4, @SafeParcelable.Param(mo65742id = 8) zzq[] zzqArr, @SafeParcelable.Param(mo65742id = 9) boolean z2, @SafeParcelable.Param(mo65742id = 10) boolean z3, @SafeParcelable.Param(mo65742id = 11) boolean z4, @SafeParcelable.Param(mo65742id = 12) boolean z5, @SafeParcelable.Param(mo65742id = 13) boolean z6, @SafeParcelable.Param(mo65742id = 14) boolean z7, @SafeParcelable.Param(mo65742id = 15) boolean z8, @SafeParcelable.Param(mo65742id = 16) boolean z9) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = zzqArr;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = z4;
        this.zzk = z5;
        this.zzl = z6;
        this.zzm = z7;
        this.zzn = z8;
        this.zzo = z9;
    }
}
