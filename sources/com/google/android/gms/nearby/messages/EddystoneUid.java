package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.messages.internal.zzc;
import com.google.android.gms.nearby.messages.internal.zzg;
import java.util.Arrays;
import p358af.C13437d;

public class EddystoneUid {
    public static final int INSTANCE_LENGTH = 6;
    public static final int LENGTH = 16;
    public static final int NAMESPACE_LENGTH = 10;
    private final zzg zza;

    public EddystoneUid(String str) {
        this(zzc.zzd(str));
    }

    public static EddystoneUid from(Message message) {
        boolean zza2 = message.zza(Message.MESSAGE_TYPE_EDDYSTONE_UID);
        String type = message.getType();
        Preconditions.checkArgument(zza2, "Message type '" + type + "' is not Message.MESSAGE_TYPE_EDDYSTONE_UID.");
        return new EddystoneUid(message.getContent());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EddystoneUid)) {
            return false;
        }
        return Objects.equal(this.zza, ((EddystoneUid) obj).zza);
    }

    public String getHex() {
        return this.zza.zza();
    }

    public String getInstance() {
        byte[] zzc = this.zza.zzc();
        if (zzc.length < 16) {
            return null;
        }
        return zzc.zzb(Arrays.copyOfRange(zzc, 10, 16));
    }

    public String getNamespace() {
        return zzc.zzb(Arrays.copyOfRange(this.zza.zzc(), 0, 10));
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    public String toString() {
        return C13437d.m33706k("EddystoneUid{id=", getHex(), "}");
    }

    public EddystoneUid(String str, String str2) {
        this.zza = new zzg(str, str2);
    }

    public EddystoneUid(byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 16, "Bytes must be a namespace plus instance (16 bytes).");
        this.zza = new zzg(bArr);
    }
}
