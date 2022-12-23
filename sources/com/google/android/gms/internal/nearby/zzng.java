package com.google.android.gms.internal.nearby;

import android.os.ParcelUuid;
import android.util.SparseArray;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p001a0.C0017h;

public final class zzng {
    private static final ParcelUuid zza = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
    private final int zzb;
    private final List zzc;
    private final SparseArray zzd;
    private final Map zze;
    private final int zzf;
    private final String zzg;
    private final byte[] zzh;

    private zzng(List list, SparseArray sparseArray, Map map, int i, int i2, String str, byte[] bArr) {
        this.zzc = list;
        this.zzd = sparseArray;
        this.zze = map;
        this.zzg = str;
        this.zzb = i;
        this.zzf = i2;
        this.zzh = bArr;
    }

    @VisibleForTesting
    public static zzng zza(byte[] bArr) {
        ArrayList arrayList;
        if (bArr == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        HashMap hashMap = new HashMap();
        int i = 0;
        byte b = -1;
        String str = null;
        byte b2 = -2147483648;
        while (true) {
            try {
                if (i < bArr.length) {
                    int i2 = i + 1;
                    byte b3 = bArr[i] & 255;
                    if (b3 != 0) {
                        int i3 = b3 - 1;
                        int i4 = i2 + 1;
                        byte b4 = bArr[i2] & 255;
                        if (b4 == 22) {
                            hashMap.put(zzc(zzd(bArr, i4, 2)), zzd(bArr, i4 + 2, i3 - 2));
                        } else if (b4 != 255) {
                            switch (b4) {
                                case 1:
                                    b = bArr[i4] & 255;
                                    break;
                                case 2:
                                case 3:
                                    zzb(bArr, i4, i3, 2, arrayList2);
                                    break;
                                case 4:
                                case 5:
                                    zzb(bArr, i4, i3, 4, arrayList2);
                                    break;
                                case 6:
                                case 7:
                                    zzb(bArr, i4, i3, 16, arrayList2);
                                    break;
                                case 8:
                                case 9:
                                    str = new String(zzd(bArr, i4, i3));
                                    break;
                                case 10:
                                    b2 = bArr[i4];
                                    break;
                            }
                        } else {
                            sparseArray.put(((bArr[i4 + 1] & 255) << 8) + (255 & bArr[i4]), zzd(bArr, i4 + 2, i3 - 2));
                        }
                        i = i3 + i4;
                    }
                }
            } catch (Exception unused) {
                "Unable to parse scan record: ".concat(String.valueOf(Arrays.toString(bArr)));
                return null;
            }
        }
        if (true != arrayList2.isEmpty()) {
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new zzng(arrayList, sparseArray, hashMap, b, b2, str, bArr);
    }

    private static int zzb(byte[] bArr, int i, int i2, int i3, List list) {
        while (i2 > 0) {
            list.add(zzc(zzd(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    private static ParcelUuid zzc(byte[] bArr) {
        long j;
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            throw new IllegalArgumentException(C16759e.m42349e("uuidBytes length invalid - ", length));
        } else if (length == 16) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            return new ParcelUuid(new UUID(order.getLong(8), order.getLong(0)));
        } else {
            if (length == 2) {
                j = ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8));
            } else {
                j = ((long) ((bArr[3] & 255) << 24)) + ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8)) + ((long) ((bArr[2] & 255) << 16));
            }
            ParcelUuid parcelUuid = zza;
            return new ParcelUuid(new UUID(parcelUuid.getUuid().getMostSignificantBits() + (j << 32), parcelUuid.getUuid().getLeastSignificantBits()));
        }
    }

    private static byte[] zzd(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzng)) {
            return false;
        }
        return Arrays.equals(this.zzh, ((zzng) obj).zzh);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        int i = this.zzb;
        String valueOf = String.valueOf(this.zzc);
        SparseArray sparseArray = this.zzd;
        StringBuilder sb = new StringBuilder();
        String str4 = "{}";
        int i2 = 0;
        if (sparseArray.size() <= 0) {
            str = str4;
        } else {
            sb.append('{');
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                int keyAt = sparseArray.keyAt(i3);
                byte[] bArr = (byte[]) sparseArray.valueAt(i3);
                sb.append(keyAt);
                sb.append('=');
                if (bArr == null) {
                    str3 = null;
                } else {
                    str3 = Hex.bytesToStringUppercase(bArr);
                }
                sb.append(str3);
            }
            sb.append('}');
            str = sb.toString();
        }
        Map map = this.zze;
        StringBuilder sb2 = new StringBuilder();
        if (!map.keySet().isEmpty()) {
            sb2.append('{');
            for (Map.Entry entry : map.entrySet()) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append('=');
                byte[] bArr2 = (byte[]) entry.getValue();
                if (bArr2 == null) {
                    str2 = null;
                } else {
                    str2 = Hex.bytesToStringUppercase(bArr2);
                }
                sb2.append(str2);
                i2++;
            }
            sb2.append('}');
            str4 = sb2.toString();
        }
        int i4 = this.zzf;
        String str5 = this.zzg;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("BleRecord [mAdvertiseFlags=");
        sb3.append(i);
        sb3.append(", mServiceUuids=");
        sb3.append(valueOf);
        sb3.append(", mManufacturerSpecificData=");
        C0017h.m61R(sb3, str, ", mServiceData=", str4, ", mTxPowerLevel=");
        sb3.append(i4);
        sb3.append(", mDeviceName=");
        sb3.append(str5);
        sb3.append("]");
        return sb3.toString();
    }
}
