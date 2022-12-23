package p583jk;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: jk.b */
public final class C17867b {

    /* renamed from: a */
    public static final char[] f45854a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: b */
    public static final byte[] f45855b;

    /* renamed from: jk.b$a */
    public static class C17868a {
        /* renamed from: a */
        public static byte[] m44272a(String str) throws IllegalArgumentException {
            int i;
            char c;
            int length = str.length();
            if (length % 4 == 0) {
                while (length > 0) {
                    int i2 = length - 1;
                    if (str.charAt(i2) != '=') {
                        break;
                    }
                    length = i2;
                }
                int i3 = (length * 3) / 4;
                byte[] bArr = new byte[i3];
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Illegal character in Base64 encoded data.");
                int i4 = 0;
                for (int i5 = 0; i5 < length; i5 = i) {
                    int i6 = i5 + 1;
                    char charAt = str.charAt(i5);
                    i = i6 + 1;
                    char charAt2 = str.charAt(i6);
                    char c2 = 'A';
                    if (i < length) {
                        c = str.charAt(i);
                        i++;
                    } else {
                        c = 'A';
                    }
                    if (i < length) {
                        c2 = str.charAt(i);
                        i++;
                    }
                    if (charAt > 127 || charAt2 > 127 || c > 127 || c2 > 127) {
                        throw illegalArgumentException;
                    }
                    byte[] bArr2 = C17867b.f45855b;
                    byte b = bArr2[charAt];
                    byte b2 = bArr2[charAt2];
                    byte b3 = bArr2[c];
                    byte b4 = bArr2[c2];
                    if (b < 0 || b2 < 0 || b3 < 0 || b4 < 0) {
                        throw illegalArgumentException;
                    }
                    int i7 = (b << 2) | (b2 >>> 4);
                    int i8 = ((b2 & 15) << 4) | (b3 >>> 2);
                    byte b5 = b4 | ((b3 & 3) << 6);
                    int i9 = i4 + 1;
                    bArr[i4] = (byte) i7;
                    if (i9 < i3) {
                        bArr[i9] = (byte) i8;
                        i9++;
                    }
                    if (i9 < i3) {
                        bArr[i9] = (byte) b5;
                        i4 = i9 + 1;
                    } else {
                        i4 = i9;
                    }
                }
                return bArr;
            }
            StringBuilder k = C13555b.m33972k("Length of Base64 encoded input string ");
            k.append(str.length());
            k.append(" is not a multiple of 4.");
            throw new IllegalArgumentException(k.toString());
        }
    }

    /* renamed from: jk.b$b */
    public static class C17869b {
    }

    static {
        byte[] bArr = new byte[RecyclerView.C1119a0.FLAG_IGNORE];
        // fill-array-data instruction
        bArr[0] = -1;
        bArr[1] = -1;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = -1;
        bArr[5] = -1;
        bArr[6] = -1;
        bArr[7] = -1;
        bArr[8] = -1;
        bArr[9] = -1;
        bArr[10] = -1;
        bArr[11] = -1;
        bArr[12] = -1;
        bArr[13] = -1;
        bArr[14] = -1;
        bArr[15] = -1;
        bArr[16] = -1;
        bArr[17] = -1;
        bArr[18] = -1;
        bArr[19] = -1;
        bArr[20] = -1;
        bArr[21] = -1;
        bArr[22] = -1;
        bArr[23] = -1;
        bArr[24] = -1;
        bArr[25] = -1;
        bArr[26] = -1;
        bArr[27] = -1;
        bArr[28] = -1;
        bArr[29] = -1;
        bArr[30] = -1;
        bArr[31] = -1;
        bArr[32] = -1;
        bArr[33] = -1;
        bArr[34] = -1;
        bArr[35] = -1;
        bArr[36] = -1;
        bArr[37] = -1;
        bArr[38] = -1;
        bArr[39] = -1;
        bArr[40] = -1;
        bArr[41] = -1;
        bArr[42] = -1;
        bArr[43] = 62;
        bArr[44] = -1;
        bArr[45] = -1;
        bArr[46] = -1;
        bArr[47] = 63;
        bArr[48] = 52;
        bArr[49] = 53;
        bArr[50] = 54;
        bArr[51] = 55;
        bArr[52] = 56;
        bArr[53] = 57;
        bArr[54] = 58;
        bArr[55] = 59;
        bArr[56] = 60;
        bArr[57] = 61;
        bArr[58] = -1;
        bArr[59] = -1;
        bArr[60] = -1;
        bArr[61] = -1;
        bArr[62] = -1;
        bArr[63] = -1;
        bArr[64] = -1;
        bArr[65] = 0;
        bArr[66] = 1;
        bArr[67] = 2;
        bArr[68] = 3;
        bArr[69] = 4;
        bArr[70] = 5;
        bArr[71] = 6;
        bArr[72] = 7;
        bArr[73] = 8;
        bArr[74] = 9;
        bArr[75] = 10;
        bArr[76] = 11;
        bArr[77] = 12;
        bArr[78] = 13;
        bArr[79] = 14;
        bArr[80] = 15;
        bArr[81] = 16;
        bArr[82] = 17;
        bArr[83] = 18;
        bArr[84] = 19;
        bArr[85] = 20;
        bArr[86] = 21;
        bArr[87] = 22;
        bArr[88] = 23;
        bArr[89] = 24;
        bArr[90] = 25;
        bArr[91] = -1;
        bArr[92] = -1;
        bArr[93] = -1;
        bArr[94] = -1;
        bArr[95] = -1;
        bArr[96] = -1;
        bArr[97] = 26;
        bArr[98] = 27;
        bArr[99] = 28;
        bArr[100] = 29;
        bArr[101] = 30;
        bArr[102] = 31;
        bArr[103] = 32;
        bArr[104] = 33;
        bArr[105] = 34;
        bArr[106] = 35;
        bArr[107] = 36;
        bArr[108] = 37;
        bArr[109] = 38;
        bArr[110] = 39;
        bArr[111] = 40;
        bArr[112] = 41;
        bArr[113] = 42;
        bArr[114] = 43;
        bArr[115] = 44;
        bArr[116] = 45;
        bArr[117] = 46;
        bArr[118] = 47;
        bArr[119] = 48;
        bArr[120] = 49;
        bArr[121] = 50;
        bArr[122] = 51;
        bArr[123] = -1;
        bArr[124] = -1;
        bArr[125] = -1;
        bArr[126] = -1;
        bArr[127] = -1;
        f45855b = bArr;
    }
}
