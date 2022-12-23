package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.appboy.support.StringUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Comparator;
import p001a0.C0016g;
import p358af.C13437d;

@SafeParcelable.Class(creator = "FlagCreator")
@SafeParcelable.Reserved({1})
public final class zzi extends AbstractSafeParcelable implements Comparable<zzi> {
    public static final Parcelable.Creator<zzi> CREATOR = new zzk();
    private static final Comparator<zzi> zzai = new zzj();
    @SafeParcelable.Field(mo65739id = 2)
    public final String name;
    @SafeParcelable.Field(mo65739id = 3)
    private final long zzab;
    @SafeParcelable.Field(mo65739id = 4)
    private final boolean zzac;
    @SafeParcelable.Field(mo65739id = 5)
    private final double zzad;
    @SafeParcelable.Field(mo65739id = 6)
    private final String zzae;
    @SafeParcelable.Field(mo65739id = 7)
    private final byte[] zzaf;
    @SafeParcelable.Field(mo65739id = 8)
    private final int zzag;
    @SafeParcelable.Field(mo65739id = 9)
    public final int zzah;

    @SafeParcelable.Constructor
    public zzi(@SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) long j, @SafeParcelable.Param(mo65742id = 4) boolean z, @SafeParcelable.Param(mo65742id = 5) double d, @SafeParcelable.Param(mo65742id = 6) String str2, @SafeParcelable.Param(mo65742id = 7) byte[] bArr, @SafeParcelable.Param(mo65742id = 8) int i, @SafeParcelable.Param(mo65742id = 9) int i2) {
        this.name = str;
        this.zzab = j;
        this.zzac = z;
        this.zzad = d;
        this.zzae = str2;
        this.zzaf = bArr;
        this.zzag = i;
        this.zzah = i2;
    }

    private static int compare(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        zzi zzi = (zzi) obj;
        int compareTo = this.name.compareTo(zzi.name);
        if (compareTo != 0) {
            return compareTo;
        }
        int compare = compare(this.zzag, zzi.zzag);
        if (compare != 0) {
            return compare;
        }
        int i = this.zzag;
        if (i == 1) {
            int i2 = (this.zzab > zzi.zzab ? 1 : (this.zzab == zzi.zzab ? 0 : -1));
            if (i2 < 0) {
                return -1;
            }
            if (i2 == 0) {
                return 0;
            }
            return 1;
        } else if (i == 2) {
            boolean z = this.zzac;
            if (z == zzi.zzac) {
                return 0;
            }
            if (z) {
                return 1;
            }
            return -1;
        } else if (i == 3) {
            return Double.compare(this.zzad, zzi.zzad);
        } else {
            if (i == 4) {
                String str = this.zzae;
                String str2 = zzi.zzae;
                if (str == str2) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
            } else if (i == 5) {
                byte[] bArr = this.zzaf;
                byte[] bArr2 = zzi.zzaf;
                if (bArr == bArr2) {
                    return 0;
                }
                if (bArr == null) {
                    return -1;
                }
                if (bArr2 == null) {
                    return 1;
                }
                for (int i3 = 0; i3 < Math.min(this.zzaf.length, zzi.zzaf.length); i3++) {
                    int i4 = this.zzaf[i3] - zzi.zzaf[i3];
                    if (i4 != 0) {
                        return i4;
                    }
                }
                return compare(this.zzaf.length, zzi.zzaf.length);
            } else {
                throw new AssertionError(C13715c.m34241g(31, "Invalid enum value: ", this.zzag));
            }
        }
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj instanceof zzi) {
            zzi zzi = (zzi) obj;
            if (zzn.equals(this.name, zzi.name) && (i = this.zzag) == zzi.zzag && this.zzah == zzi.zzah) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                return zzn.equals(this.zzae, zzi.zzae);
                            }
                            if (i == 5) {
                                return Arrays.equals(this.zzaf, zzi.zzaf);
                            }
                            throw new AssertionError(C13715c.m34241g(31, "Invalid enum value: ", this.zzag));
                        } else if (this.zzad == zzi.zzad) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (this.zzac == zzi.zzac) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (this.zzab == zzi.zzab) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder k = C13555b.m33972k("Flag(");
        k.append(this.name);
        k.append(", ");
        int i = this.zzag;
        if (i == 1) {
            k.append(this.zzab);
        } else if (i == 2) {
            k.append(this.zzac);
        } else if (i != 3) {
            if (i == 4) {
                k.append("'");
                str = this.zzae;
            } else if (i != 5) {
                String str2 = this.name;
                int i2 = this.zzag;
                StringBuilder sb = new StringBuilder(C0016g.m25h(str2, 27));
                sb.append("Invalid type: ");
                sb.append(str2);
                sb.append(", ");
                sb.append(i2);
                throw new AssertionError(sb.toString());
            } else if (this.zzaf == null) {
                k.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                k.append("'");
                str = Base64.encodeToString(this.zzaf, 3);
            }
            k.append(str);
            k.append("'");
        } else {
            k.append(this.zzad);
        }
        k.append(", ");
        k.append(this.zzag);
        k.append(", ");
        return C13437d.m33707l(k, this.zzah, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.name, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzab);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzac);
        SafeParcelWriter.writeDouble(parcel, 5, this.zzad);
        SafeParcelWriter.writeString(parcel, 6, this.zzae, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.zzaf, false);
        SafeParcelWriter.writeInt(parcel, 8, this.zzag);
        SafeParcelWriter.writeInt(parcel, 9, this.zzah);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
