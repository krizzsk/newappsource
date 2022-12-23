package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import p001a0.C0017h;

@SafeParcelable.Class(creator = "SubscribeRequestCreator")
public final class SubscribeRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SubscribeRequest> CREATOR = new zzcd();
    @SafeParcelable.VersionField(mo65748id = 1)
    public final int zza;
    @SafeParcelable.Field(getter = "getMessageListenerAsBinder", mo65739id = 2, type = "android.os.IBinder")
    public final zzo zzb;
    @SafeParcelable.Field(mo65739id = 3)
    public final Strategy zzc;
    @SafeParcelable.Field(getter = "getCallbackAsBinder", mo65739id = 4, type = "android.os.IBinder")
    public final zzr zzd;
    @SafeParcelable.Field(mo65739id = 5)
    public final MessageFilter zze;
    @SafeParcelable.Field(mo65739id = 6)
    public final PendingIntent zzf;
    @SafeParcelable.Field(mo65739id = 7)
    @Deprecated
    public final int zzg;
    @SafeParcelable.Field(mo65739id = 8)
    @Deprecated
    public final String zzh;
    @SafeParcelable.Field(mo65739id = 9)
    @Deprecated
    public final String zzi;
    @SafeParcelable.Field(mo65739id = 10)
    public final byte[] zzj;
    @SafeParcelable.Field(mo65739id = 11)
    @Deprecated
    public final boolean zzk;
    @SafeParcelable.Field(getter = "getSubscribeCallbackAsBinder", mo65739id = 12, type = "android.os.IBinder")
    public final zzab zzl;
    @SafeParcelable.Field(mo65739id = 13)
    @Deprecated
    public final boolean zzm;
    @SafeParcelable.Field(mo65739id = 14)
    @Deprecated
    public final ClientAppContext zzn;
    @SafeParcelable.Field(mo65739id = 15)
    public final boolean zzo;
    @SafeParcelable.Field(mo65739id = 16)
    public final int zzp;
    @SafeParcelable.Field(mo65739id = 17)
    public final int zzq;

    /* JADX WARNING: type inference failed for: r1v14, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SubscribeRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 1) int r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 2) android.os.IBinder r12, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 3) com.google.android.gms.nearby.messages.Strategy r13, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 4) android.os.IBinder r14, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 5) com.google.android.gms.nearby.messages.MessageFilter r15, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 6) android.app.PendingIntent r16, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 7) int r17, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 8) java.lang.String r18, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 9) java.lang.String r19, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 10) byte[] r20, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 11) boolean r21, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 12) android.os.IBinder r22, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 13) boolean r23, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 14) com.google.android.gms.nearby.messages.internal.ClientAppContext r24, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 15) boolean r25, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 16) int r26, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 17) int r27) {
        /*
            r10 = this;
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r10.<init>()
            r7 = r11
            r0.zza = r7
            r7 = 0
            if (r1 != 0) goto L_0x0016
            r8 = r7
            goto L_0x0028
        L_0x0016:
            java.lang.String r8 = "com.google.android.gms.nearby.messages.internal.IMessageListener"
            android.os.IInterface r8 = r12.queryLocalInterface(r8)
            boolean r9 = r8 instanceof com.google.android.gms.nearby.messages.internal.zzo
            if (r9 == 0) goto L_0x0023
            com.google.android.gms.nearby.messages.internal.zzo r8 = (com.google.android.gms.nearby.messages.internal.zzo) r8
            goto L_0x0028
        L_0x0023:
            com.google.android.gms.nearby.messages.internal.zzm r8 = new com.google.android.gms.nearby.messages.internal.zzm
            r8.<init>(r12)
        L_0x0028:
            r0.zzb = r8
            r1 = r13
            r0.zzc = r1
            if (r2 != 0) goto L_0x0031
            r1 = r7
            goto L_0x0043
        L_0x0031:
            java.lang.String r1 = "com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback"
            android.os.IInterface r1 = r14.queryLocalInterface(r1)
            boolean r8 = r1 instanceof com.google.android.gms.nearby.messages.internal.zzr
            if (r8 == 0) goto L_0x003e
            com.google.android.gms.nearby.messages.internal.zzr r1 = (com.google.android.gms.nearby.messages.internal.zzr) r1
            goto L_0x0043
        L_0x003e:
            com.google.android.gms.nearby.messages.internal.zzp r1 = new com.google.android.gms.nearby.messages.internal.zzp
            r1.<init>(r14)
        L_0x0043:
            r0.zzd = r1
            r1 = r15
            r0.zze = r1
            r1 = r16
            r0.zzf = r1
            r1 = r17
            r0.zzg = r1
            r0.zzh = r3
            r0.zzi = r4
            r1 = r20
            r0.zzj = r1
            r1 = r21
            r0.zzk = r1
            if (r5 != 0) goto L_0x005f
            goto L_0x0072
        L_0x005f:
            java.lang.String r1 = "com.google.android.gms.nearby.messages.internal.ISubscribeCallback"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.nearby.messages.internal.zzab
            if (r2 == 0) goto L_0x006d
            r7 = r1
            com.google.android.gms.nearby.messages.internal.zzab r7 = (com.google.android.gms.nearby.messages.internal.zzab) r7
            goto L_0x0072
        L_0x006d:
            com.google.android.gms.nearby.messages.internal.zzz r7 = new com.google.android.gms.nearby.messages.internal.zzz
            r7.<init>(r5)
        L_0x0072:
            r0.zzl = r7
            r0.zzm = r6
            r1 = r24
            com.google.android.gms.nearby.messages.internal.ClientAppContext r1 = com.google.android.gms.nearby.messages.internal.ClientAppContext.zza(r1, r4, r3, r6)
            r0.zzn = r1
            r1 = r25
            r0.zzo = r1
            r1 = r26
            r0.zzp = r1
            r1 = r27
            r0.zzq = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.messages.internal.SubscribeRequest.<init>(int, android.os.IBinder, com.google.android.gms.nearby.messages.Strategy, android.os.IBinder, com.google.android.gms.nearby.messages.MessageFilter, android.app.PendingIntent, int, java.lang.String, java.lang.String, byte[], boolean, android.os.IBinder, boolean, com.google.android.gms.nearby.messages.internal.ClientAppContext, boolean, int, int):void");
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        String valueOf3 = String.valueOf(this.zzd);
        String valueOf4 = String.valueOf(this.zze);
        String valueOf5 = String.valueOf(this.zzf);
        byte[] bArr = this.zzj;
        if (bArr == null) {
            str = null;
        } else {
            str = C25541a.m63878h("<", bArr.length, " bytes>");
        }
        String valueOf6 = String.valueOf(this.zzl);
        boolean z = this.zzm;
        String valueOf7 = String.valueOf(this.zzn);
        boolean z2 = this.zzo;
        String str2 = this.zzh;
        String str3 = this.zzi;
        boolean z3 = this.zzk;
        StringBuilder h = C16759e.m42352h("SubscribeRequest{messageListener=", valueOf, ", strategy=", valueOf2, ", callback=");
        C0017h.m61R(h, valueOf3, ", filter=", valueOf4, ", pendingIntent=");
        C0017h.m61R(h, valueOf5, ", hint=", str, ", subscribeCallback=");
        h.append(valueOf6);
        h.append(", useRealClientApiKey=");
        h.append(z);
        h.append(", clientAppContext=");
        h.append(valueOf7);
        h.append(", isDiscardPendingIntent=");
        h.append(z2);
        h.append(", zeroPartyPackageName=");
        C0017h.m61R(h, str2, ", realClientPackageName=", str3, ", isIgnoreNearbyPermission=");
        h.append(z3);
        h.append(", callingContext=");
        h.append(this.zzq);
        h.append("}");
        return h.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        zzo zzo2 = this.zzb;
        IBinder iBinder3 = null;
        if (zzo2 == null) {
            iBinder = null;
        } else {
            iBinder = zzo2.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, iBinder, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        zzr zzr = this.zzd;
        if (zzr == null) {
            iBinder2 = null;
        } else {
            iBinder2 = zzr.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 4, iBinder2, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.writeByteArray(parcel, 10, this.zzj, false);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzk);
        zzab zzab = this.zzl;
        if (zzab != null) {
            iBinder3 = zzab.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 12, iBinder3, false);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzm);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzn, i, false);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzo);
        SafeParcelWriter.writeInt(parcel, 16, this.zzp);
        SafeParcelWriter.writeInt(parcel, 17, this.zzq);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public SubscribeRequest(IBinder iBinder, Strategy strategy, IBinder iBinder2, MessageFilter messageFilter, PendingIntent pendingIntent, byte[] bArr, IBinder iBinder3, boolean z, int i, int i2) {
        this(3, iBinder, strategy, iBinder2, messageFilter, pendingIntent, 0, (String) null, (String) null, (byte[]) null, false, iBinder3, false, (ClientAppContext) null, false, 0, i2);
    }
}
