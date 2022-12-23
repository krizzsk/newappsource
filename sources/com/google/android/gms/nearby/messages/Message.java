package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.nearby.zznh;
import java.util.Arrays;
import p358af.C13437d;

@SafeParcelable.Class(creator = "MessageCreator")
public class Message extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Message> CREATOR = new zza();
    public static final int MAX_CONTENT_SIZE_BYTES = 102400;
    public static final int MAX_TYPE_LENGTH = 32;
    public static final String MESSAGE_NAMESPACE_RESERVED = "__reserved_namespace";
    @Deprecated
    public static final String MESSAGE_TYPE_AUDIO_BYTES = "__audio_bytes";
    public static final String MESSAGE_TYPE_EDDYSTONE_UID = "__eddystone_uid";
    public static final String MESSAGE_TYPE_I_BEACON_ID = "__i_beacon_id";
    private static final zznh[] zzc = {zznh.zza};
    @SafeParcelable.VersionField(mo65748id = 1000)
    public final int zza;
    @SafeParcelable.Field(mo65739id = 4)
    @Deprecated
    public final zznh[] zzb;
    @SafeParcelable.Field(getter = "getContent", mo65739id = 1)
    private final byte[] zzd;
    @SafeParcelable.Field(getter = "getType", mo65739id = 2)
    private final String zze;
    @SafeParcelable.Field(getter = "getNamespace", mo65739id = 3)
    private final String zzf;
    @SafeParcelable.Field(getter = "getProjectId", mo65739id = 5)
    private final long zzg;

    @SafeParcelable.Constructor
    public Message(@SafeParcelable.Param(mo65742id = 1000) int i, @SafeParcelable.Param(mo65742id = 1) byte[] bArr, @SafeParcelable.Param(mo65742id = 3) String str, @SafeParcelable.Param(mo65742id = 2) String str2, @SafeParcelable.Param(mo65742id = 4) zznh[] zznhArr, @SafeParcelable.Param(mo65742id = 5) long j) {
        this.zza = i;
        this.zze = (String) Preconditions.checkNotNull(str2);
        this.zzf = str == null ? "" : str;
        this.zzg = j;
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        Preconditions.checkArgument(length <= 102400, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", Integer.valueOf(length), Integer.valueOf(MAX_CONTENT_SIZE_BYTES));
        this.zzd = bArr;
        this.zzb = (zznhArr == null || zznhArr.length == 0) ? zzc : zznhArr;
        Preconditions.checkArgument(str2.length() <= 32, "Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)", Integer.valueOf(str2.length()), 32);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        if (!TextUtils.equals(this.zzf, message.zzf) || !TextUtils.equals(this.zze, message.zze) || !Arrays.equals(this.zzd, message.zzd) || this.zzg != message.zzg) {
            return false;
        }
        return true;
    }

    public byte[] getContent() {
        return this.zzd;
    }

    public String getNamespace() {
        return this.zzf;
    }

    public String getType() {
        return this.zze;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzf, this.zze, Integer.valueOf(Arrays.hashCode(this.zzd)), Long.valueOf(this.zzg));
    }

    public String toString() {
        int i;
        String str = this.zzf;
        String str2 = this.zze;
        byte[] bArr = this.zzd;
        if (bArr == null) {
            i = 0;
        } else {
            i = bArr.length;
        }
        return C13437d.m33707l(C16759e.m42352h("Message{namespace='", str, "', type='", str2, "', content=["), i, " bytes]}");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, getContent(), false);
        SafeParcelWriter.writeString(parcel, 2, getType(), false);
        SafeParcelWriter.writeString(parcel, 3, getNamespace(), false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.zzb, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzg);
        SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean zza(String str) {
        if (!MESSAGE_NAMESPACE_RESERVED.equals(getNamespace()) || !str.equals(getType())) {
            return false;
        }
        return true;
    }

    public Message(byte[] bArr) {
        this(bArr, "", "", zzc, 0);
    }

    public Message(byte[] bArr, String str) {
        this(bArr, "", str, zzc, 0);
    }

    public Message(byte[] bArr, String str, String str2) {
        this(bArr, MESSAGE_NAMESPACE_RESERVED, MESSAGE_TYPE_AUDIO_BYTES, zzc, 0);
    }

    public Message(byte[] bArr, String str, String str2, zznh[] zznhArr, long j) {
        this(2, bArr, str, str2, zznhArr, 0);
    }
}
