package tg0;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;

/* renamed from: tg0.a */
public final class C24982a {
    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equals(str);
    }

    /* renamed from: a */
    public static /* synthetic */ void m62682a(int i) {
        int i2 = i;
        String str = (i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) ? 2 : 3)];
        if (i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = "data";
        }
        if (i2 == 1) {
            objArr[1] = "encodeBytes";
        } else if (i2 == 3) {
            objArr[1] = "encode8to7";
        } else if (i2 == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i2 == 8) {
            objArr[1] = "decodeBytes";
        } else if (i2 == 10) {
            objArr[1] = "dropMarker";
        } else if (i2 == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i2 != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i2) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static byte[] m62683b(String[] strArr) {
        int i;
        if (strArr != null) {
            if (strArr.length > 0 && !strArr[0].isEmpty()) {
                char charAt = strArr[0].charAt(0);
                if (charAt == 0) {
                    String[] strArr2 = (String[]) strArr.clone();
                    strArr2[0] = strArr2[0].substring(1);
                    int length = strArr2.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        String str = strArr2[i2];
                        i2++;
                        i3 += str.length();
                    }
                    byte[] bArr = new byte[i3];
                    int length2 = strArr2.length;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < length2) {
                        String str2 = strArr2[i4];
                        i4++;
                        int length3 = str2.length() - 1;
                        if (length3 >= 0) {
                            int i6 = 0;
                            while (true) {
                                int i7 = i6 + 1;
                                i = i5 + 1;
                                bArr[i5] = (byte) str2.charAt(i6);
                                if (i6 == length3) {
                                    break;
                                }
                                i6 = i7;
                                i5 = i;
                            }
                            i5 = i;
                        }
                    }
                    return bArr;
                } else if (charAt == 65535) {
                    strArr = (String[]) strArr.clone();
                    strArr[0] = strArr[0].substring(1);
                }
            }
            int i8 = 0;
            for (String length4 : strArr) {
                i8 += length4.length();
            }
            byte[] bArr2 = new byte[i8];
            int i9 = 0;
            for (String str3 : strArr) {
                int length5 = str3.length();
                int i11 = 0;
                while (i11 < length5) {
                    bArr2[i9] = (byte) str3.charAt(i11);
                    i11++;
                    i9++;
                }
            }
            for (int i12 = 0; i12 < i8; i12++) {
                bArr2[i12] = (byte) ((bArr2[i12] + Byte.MAX_VALUE) & 127);
            }
            int i13 = (i8 * 7) / 8;
            byte[] bArr3 = new byte[i13];
            int i14 = 0;
            byte b = 0;
            for (int i15 = 0; i15 < i13; i15++) {
                i14++;
                int i16 = b + 1;
                bArr3[i15] = (byte) (((bArr2[i14] & 255) >>> b) + ((bArr2[i14] & ((1 << i16) - 1)) << (7 - b)));
                if (b == 6) {
                    i14++;
                    b = 0;
                } else {
                    b = i16;
                }
            }
            return bArr3;
        }
        m62682a(7);
        throw null;
    }
}
