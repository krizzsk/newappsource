package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import p001a0.C0016g;
import p001a0.C0017h;

@SafeParcelable.Class(creator = "StrategyCreator")
public class Strategy extends AbstractSafeParcelable {
    @Deprecated
    public static final Strategy BLE_ONLY;
    public static final Parcelable.Creator<Strategy> CREATOR = new zzf();
    public static final Strategy DEFAULT = new Builder().build();
    public static final int DISCOVERY_MODE_BROADCAST = 1;
    public static final int DISCOVERY_MODE_DEFAULT = 3;
    public static final int DISCOVERY_MODE_SCAN = 2;
    public static final int DISTANCE_TYPE_DEFAULT = 0;
    public static final int DISTANCE_TYPE_EARSHOT = 1;
    public static final int TTL_SECONDS_DEFAULT = 300;
    public static final int TTL_SECONDS_INFINITE = Integer.MAX_VALUE;
    public static final int TTL_SECONDS_MAX = 86400;
    @ShowFirstParty
    @Deprecated
    public static final Strategy zza;
    @SafeParcelable.VersionField(mo65748id = 1000)
    public final int zzb;
    @SafeParcelable.Field(mo65739id = 1)
    @Deprecated
    public final int zzc;
    @SafeParcelable.Field(mo65739id = 2)
    public final int zzd;
    @SafeParcelable.Field(mo65739id = 3)
    public final int zze;
    @SafeParcelable.Field(mo65739id = 4)
    @Deprecated
    public final boolean zzf;
    @SafeParcelable.Field(getter = "getDiscoveryMedium", mo65739id = 5)
    public final int zzg;
    @SafeParcelable.Field(getter = "getDiscoveryMode", mo65739id = 6)
    public final int zzh;
    @SafeParcelable.Field(getter = "getBackgroundScanMode", mo65739id = 7)
    private final int zzi;

    public static class Builder {
        private int zza = 3;
        private int zzb = Strategy.TTL_SECONDS_DEFAULT;
        private int zzc = 0;
        private int zzd = -1;

        public Strategy build() {
            if (this.zzd != 2 || this.zzc != 1) {
                return new Strategy(2, 0, this.zzb, this.zzc, false, this.zzd, this.zza, 0);
            }
            throw new IllegalStateException("Cannot set EARSHOT with BLE only mode.");
        }

        public Builder setDiscoveryMode(int i) {
            this.zza = i;
            return this;
        }

        public Builder setDistanceType(int i) {
            this.zzc = i;
            return this;
        }

        public Builder setTtlSeconds(int i) {
            boolean z;
            if (i == Integer.MAX_VALUE || (i > 0 && i <= 86400)) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "mTtlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", Integer.valueOf(i), Integer.valueOf(Strategy.TTL_SECONDS_MAX));
            this.zzb = i;
            return this;
        }

        @ShowFirstParty
        public final Builder zza(int i) {
            this.zzd = 2;
            return this;
        }
    }

    static {
        Builder builder = new Builder();
        builder.zza(2);
        builder.setTtlSeconds(Integer.MAX_VALUE);
        Strategy build = builder.build();
        BLE_ONLY = build;
        zza = build;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Strategy(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 1000) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 1) int r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 2) int r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 3) int r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 4) boolean r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 5) int r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 6) int r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 7) int r9) {
        /*
            r1 = this;
            r1.<init>()
            r1.zzb = r2
            r1.zzc = r3
            r2 = 1
            r0 = 2
            if (r3 != 0) goto L_0x000e
        L_0x000b:
            r1.zzh = r8
            goto L_0x0019
        L_0x000e:
            if (r3 == r0) goto L_0x0017
            r8 = 3
            if (r3 == r8) goto L_0x0014
            goto L_0x000b
        L_0x0014:
            r1.zzh = r0
            goto L_0x0019
        L_0x0017:
            r1.zzh = r2
        L_0x0019:
            r1.zze = r5
            r1.zzf = r6
            if (r6 == 0) goto L_0x0027
            r1.zzg = r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.zzd = r2
            goto L_0x0038
        L_0x0027:
            r1.zzd = r4
            r3 = -1
            if (r7 == r3) goto L_0x0036
            if (r7 == 0) goto L_0x0036
            if (r7 == r2) goto L_0x0036
            r2 = 6
            if (r7 == r2) goto L_0x0036
            r1.zzg = r7
            goto L_0x0038
        L_0x0036:
            r1.zzg = r3
        L_0x0038:
            r1.zzi = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.messages.Strategy.<init>(int, int, int, int, boolean, int, int, int):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        if (this.zzb == strategy.zzb && this.zzh == strategy.zzh && this.zzd == strategy.zzd && this.zze == strategy.zze && this.zzg == strategy.zzg && this.zzi == strategy.zzi) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.zzb * 31) + this.zzh) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzg) * 31) + this.zzi;
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        int i = this.zzd;
        int i2 = this.zze;
        String str4 = "DEFAULT";
        if (i2 == 0) {
            str = str4;
        } else if (i2 != 1) {
            str = C16759e.m42349e("UNKNOWN:", i2);
        } else {
            str = "EARSHOT";
        }
        int i3 = this.zzg;
        if (i3 == -1) {
            str2 = str4;
        } else {
            ArrayList arrayList = new ArrayList();
            if ((i3 & 4) > 0) {
                arrayList.add("ULTRASOUND");
            }
            if ((i3 & 2) > 0) {
                arrayList.add("BLE");
            }
            if (arrayList.isEmpty()) {
                str2 = C16759e.m42349e("UNKNOWN:", i3);
            } else {
                str2 = arrayList.toString();
            }
        }
        int i4 = this.zzh;
        if (i4 == 3) {
            str3 = str4;
        } else {
            ArrayList arrayList2 = new ArrayList();
            if ((i4 & 1) > 0) {
                arrayList2.add("BROADCAST");
            }
            if ((i4 & 2) > 0) {
                arrayList2.add("SCAN");
            }
            if (arrayList2.isEmpty()) {
                str3 = C16759e.m42349e("UNKNOWN:", i4);
            } else {
                str3 = arrayList2.toString();
            }
        }
        int i5 = this.zzi;
        if (i5 != 0) {
            if (i5 != 1) {
                str4 = C16759e.m42349e("UNKNOWN: ", i5);
            } else {
                str4 = "ALWAYS_ON";
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Strategy{ttlSeconds=");
        sb.append(i);
        sb.append(", distanceType=");
        sb.append(str);
        sb.append(", discoveryMedium=");
        C0017h.m61R(sb, str2, ", discoveryMode=", str3, ", backgroundScanMode=");
        return C0016g.m31o(sb, str4, "}");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzc);
        SafeParcelWriter.writeInt(parcel, 2, this.zzd);
        SafeParcelWriter.writeInt(parcel, 3, this.zze);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzf);
        SafeParcelWriter.writeInt(parcel, 5, this.zzg);
        SafeParcelWriter.writeInt(parcel, 6, this.zzh);
        SafeParcelWriter.writeInt(parcel, 7, this.zzi);
        SafeParcelWriter.writeInt(parcel, 1000, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzi;
    }
}
