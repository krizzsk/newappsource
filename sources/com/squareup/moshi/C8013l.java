package com.squareup.moshi;

import com.appboy.support.StringUtils;
import com.squareup.moshi.JsonReader;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import okio.ByteString;
import si0.C24898f;
import si0.C24902i;

/* renamed from: com.squareup.moshi.l */
public final class C8013l extends JsonReader {

    /* renamed from: l */
    public static final ByteString f24264l = ByteString.C24633a.m61918a("'\\");

    /* renamed from: m */
    public static final ByteString f24265m = ByteString.C24633a.m61918a("\"\\");

    /* renamed from: n */
    public static final ByteString f24266n = ByteString.C24633a.m61918a("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: f */
    public final C24902i f24267f;

    /* renamed from: g */
    public final C24898f f24268g;

    /* renamed from: h */
    public int f24269h = 0;

    /* renamed from: i */
    public long f24270i;

    /* renamed from: j */
    public int f24271j;

    /* renamed from: k */
    public String f24272k;

    static {
        ByteString byteString = ByteString.f62330d;
        ByteString.C24633a.m61918a("\n\r");
        ByteString.C24633a.m61918a("*/");
    }

    public C8013l(C24898f fVar) {
        this.f24267f = fVar;
        this.f24268g = fVar;
        mo24988N(6);
    }

    /* renamed from: A */
    public final long mo24983A() throws IOException {
        String str;
        int i = this.f24269h;
        if (i == 0) {
            i = mo25053W();
        }
        if (i == 16) {
            this.f24269h = 0;
            int[] iArr = this.f24205e;
            int i2 = this.f24202b - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f24270i;
        }
        if (i == 17) {
            this.f24272k = this.f24268g.mo61381K((long) this.f24271j);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = mo25059c0(f24265m);
            } else {
                str = mo25059c0(f24264l);
            }
            this.f24272k = str;
            try {
                long parseLong = Long.parseLong(str);
                this.f24269h = 0;
                int[] iArr2 = this.f24205e;
                int i3 = this.f24202b - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder k = C13555b.m33972k("Expected a long but was ");
            k.append(mo24986H());
            k.append(" at path ");
            k.append(mo24998t());
            throw new JsonDataException(k.toString());
        }
        this.f24269h = 11;
        try {
            long longValueExact = new BigDecimal(this.f24272k).longValueExact();
            this.f24272k = null;
            this.f24269h = 0;
            int[] iArr3 = this.f24205e;
            int i4 = this.f24202b - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            StringBuilder k2 = C13555b.m33972k("Expected a long but was ");
            k2.append(this.f24272k);
            k2.append(" at path ");
            k2.append(mo24998t());
            throw new JsonDataException(k2.toString());
        }
    }

    /* renamed from: B */
    public final void mo24984B() throws IOException {
        int i = this.f24269h;
        if (i == 0) {
            i = mo25053W();
        }
        if (i == 7) {
            this.f24269h = 0;
            int[] iArr = this.f24205e;
            int i2 = this.f24202b - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder k = C13555b.m33972k("Expected null but was ");
        k.append(mo24986H());
        k.append(" at path ");
        k.append(mo24998t());
        throw new JsonDataException(k.toString());
    }

    /* renamed from: C */
    public final String mo24985C() throws IOException {
        String str;
        int i = this.f24269h;
        if (i == 0) {
            i = mo25053W();
        }
        if (i == 10) {
            str = mo25061d0();
        } else if (i == 9) {
            str = mo25059c0(f24265m);
        } else if (i == 8) {
            str = mo25059c0(f24264l);
        } else if (i == 11) {
            str = this.f24272k;
            this.f24272k = null;
        } else if (i == 16) {
            str = Long.toString(this.f24270i);
        } else if (i == 17) {
            str = this.f24268g.mo61381K((long) this.f24271j);
        } else {
            StringBuilder k = C13555b.m33972k("Expected a string but was ");
            k.append(mo24986H());
            k.append(" at path ");
            k.append(mo24998t());
            throw new JsonDataException(k.toString());
        }
        this.f24269h = 0;
        int[] iArr = this.f24205e;
        int i2 = this.f24202b - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: H */
    public final JsonReader.Token mo24986H() throws IOException {
        int i = this.f24269h;
        if (i == 0) {
            i = mo25053W();
        }
        switch (i) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: K */
    public final void mo24987K() throws IOException {
        if (mo24999v()) {
            this.f24272k = mo25057a0();
            this.f24269h = 11;
        }
    }

    /* renamed from: O */
    public final int mo24989O(JsonReader.C7986a aVar) throws IOException {
        int i = this.f24269h;
        if (i == 0) {
            i = mo25053W();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return mo25054X(this.f24272k, aVar);
        }
        int R0 = this.f24267f.mo61389R0(aVar.f24207b);
        if (R0 != -1) {
            this.f24269h = 0;
            this.f24204d[this.f24202b - 1] = aVar.f24206a[R0];
            return R0;
        }
        String str = this.f24204d[this.f24202b - 1];
        String a0 = mo25057a0();
        int X = mo25054X(a0, aVar);
        if (X == -1) {
            this.f24269h = 15;
            this.f24272k = a0;
            this.f24204d[this.f24202b - 1] = str;
        }
        return X;
    }

    /* renamed from: R */
    public final int mo24990R(JsonReader.C7986a aVar) throws IOException {
        int i = this.f24269h;
        if (i == 0) {
            i = mo25053W();
        }
        if (i < 8 || i > 11) {
            return -1;
        }
        if (i == 11) {
            return mo25055Y(this.f24272k, aVar);
        }
        int R0 = this.f24267f.mo61389R0(aVar.f24207b);
        if (R0 != -1) {
            this.f24269h = 0;
            int[] iArr = this.f24205e;
            int i2 = this.f24202b - 1;
            iArr[i2] = iArr[i2] + 1;
            return R0;
        }
        String C = mo24985C();
        int Y = mo25055Y(C, aVar);
        if (Y == -1) {
            this.f24269h = 11;
            this.f24272k = C;
            int[] iArr2 = this.f24205e;
            int i3 = this.f24202b - 1;
            iArr2[i3] = iArr2[i3] - 1;
        }
        return Y;
    }

    /* renamed from: S */
    public final void mo24991S() throws IOException {
        int i = this.f24269h;
        if (i == 0) {
            i = mo25053W();
        }
        if (i == 14) {
            long s = this.f24267f.mo61424s(f24266n);
            C24898f fVar = this.f24268g;
            if (s == -1) {
                s = fVar.f62947c;
            }
            fVar.skip(s);
        } else if (i == 13) {
            mo25063f0(f24265m);
        } else if (i == 12) {
            mo25063f0(f24264l);
        } else if (i != 15) {
            StringBuilder k = C13555b.m33972k("Expected a name but was ");
            k.append(mo24986H());
            k.append(" at path ");
            k.append(mo24998t());
            throw new JsonDataException(k.toString());
        }
        this.f24269h = 0;
        this.f24204d[this.f24202b - 1] = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
    }

    /* renamed from: T */
    public final void mo24992T() throws IOException {
        int i = 0;
        do {
            int i2 = this.f24269h;
            if (i2 == 0) {
                i2 = mo25053W();
            }
            if (i2 == 3) {
                mo24988N(1);
            } else if (i2 == 1) {
                mo24988N(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i >= 0) {
                        this.f24202b--;
                    } else {
                        StringBuilder k = C13555b.m33972k("Expected a value but was ");
                        k.append(mo24986H());
                        k.append(" at path ");
                        k.append(mo24998t());
                        throw new JsonDataException(k.toString());
                    }
                } else if (i2 == 2) {
                    i--;
                    if (i >= 0) {
                        this.f24202b--;
                    } else {
                        StringBuilder k2 = C13555b.m33972k("Expected a value but was ");
                        k2.append(mo24986H());
                        k2.append(" at path ");
                        k2.append(mo24998t());
                        throw new JsonDataException(k2.toString());
                    }
                } else if (i2 == 14 || i2 == 10) {
                    long s = this.f24267f.mo61424s(f24266n);
                    C24898f fVar = this.f24268g;
                    if (s == -1) {
                        s = fVar.f62947c;
                    }
                    fVar.skip(s);
                } else if (i2 == 9 || i2 == 13) {
                    mo25063f0(f24265m);
                } else if (i2 == 8 || i2 == 12) {
                    mo25063f0(f24264l);
                } else if (i2 == 17) {
                    this.f24268g.skip((long) this.f24271j);
                } else if (i2 == 18) {
                    StringBuilder k3 = C13555b.m33972k("Expected a value but was ");
                    k3.append(mo24986H());
                    k3.append(" at path ");
                    k3.append(mo24998t());
                    throw new JsonDataException(k3.toString());
                }
                this.f24269h = 0;
            }
            i++;
            this.f24269h = 0;
        } while (i != 0);
        int[] iArr = this.f24205e;
        int i3 = this.f24202b;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f24204d[i3 - 1] = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
    }

    /* renamed from: V */
    public final void mo25052V() throws IOException {
        mo24993U("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01ac, code lost:
        if (mo25056Z(r9) != false) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01ae, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01af, code lost:
        if (r2 != r6) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01b1, code lost:
        if (r3 == false) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01b7, code lost:
        if (r4 != Long.MIN_VALUE) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01b9, code lost:
        if (r16 == false) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01bf, code lost:
        if (r4 != 0) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01c1, code lost:
        if (r16 != false) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01c3, code lost:
        if (r16 == false) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01c6, code lost:
        r4 = -r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01c7, code lost:
        r0.f24270i = r4;
        r0.f24268g.skip((long) r1);
        r11 = 16;
        r0.f24269h = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01d5, code lost:
        if (r2 == 2) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01d8, code lost:
        if (r2 == 4) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01db, code lost:
        if (r2 != 7) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01dd, code lost:
        r0.f24271j = r1;
        r11 = 17;
        r0.f24269h = 17;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0123 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0124  */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo25053W() throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            int[] r1 = r0.f24203c
            int r2 = r0.f24202b
            int r3 = r2 + -1
            r3 = r1[r3]
            r6 = 2
            r7 = 7
            r8 = 3
            r9 = 6
            r10 = 4
            r11 = 0
            r12 = 5
            r13 = 1
            r14 = 0
            r4 = 93
            r5 = 59
            r15 = 44
            if (r3 != r13) goto L_0x001f
            int r2 = r2 - r13
            r1[r2] = r6
            goto L_0x0083
        L_0x001f:
            if (r3 != r6) goto L_0x003d
            int r1 = r0.mo25058b0(r13)
            si0.f r2 = r0.f24268g
            r2.readByte()
            if (r1 == r15) goto L_0x0083
            if (r1 == r5) goto L_0x0039
            if (r1 != r4) goto L_0x0033
            r0.f24269h = r10
            return r10
        L_0x0033:
            java.lang.String r1 = "Unterminated array"
            r0.mo24993U(r1)
            throw r14
        L_0x0039:
            r17.mo25052V()
            throw r14
        L_0x003d:
            if (r3 == r8) goto L_0x0278
            if (r3 != r12) goto L_0x0043
            goto L_0x0278
        L_0x0043:
            if (r3 != r10) goto L_0x0063
            int r2 = r2 - r13
            r1[r2] = r12
            int r1 = r0.mo25058b0(r13)
            si0.f r2 = r0.f24268g
            r2.readByte()
            r2 = 58
            if (r1 == r2) goto L_0x0083
            r2 = 61
            if (r1 == r2) goto L_0x005f
            java.lang.String r1 = "Expected ':'"
            r0.mo24993U(r1)
            throw r14
        L_0x005f:
            r17.mo25052V()
            throw r14
        L_0x0063:
            if (r3 != r9) goto L_0x0069
            int r2 = r2 - r13
            r1[r2] = r7
            goto L_0x0083
        L_0x0069:
            if (r3 != r7) goto L_0x007b
            int r1 = r0.mo25058b0(r11)
            r2 = -1
            if (r1 != r2) goto L_0x0077
            r1 = 18
            r0.f24269h = r1
            return r1
        L_0x0077:
            r17.mo25052V()
            throw r14
        L_0x007b:
            r1 = 9
            if (r3 == r1) goto L_0x0276
            r1 = 8
            if (r3 == r1) goto L_0x026e
        L_0x0083:
            int r1 = r0.mo25058b0(r13)
            r2 = 34
            if (r1 == r2) goto L_0x0264
            r2 = 39
            if (r1 == r2) goto L_0x025f
            if (r1 == r15) goto L_0x024d
            if (r1 == r5) goto L_0x024d
            r2 = 91
            if (r1 == r2) goto L_0x0245
            if (r1 == r4) goto L_0x023a
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x0232
            si0.f r1 = r0.f24268g
            r2 = 0
            byte r1 = r1.mo61430v(r2)
            r4 = 116(0x74, float:1.63E-43)
            if (r1 == r4) goto L_0x00cb
            r4 = 84
            if (r1 != r4) goto L_0x00ae
            goto L_0x00cb
        L_0x00ae:
            r4 = 102(0x66, float:1.43E-43)
            if (r1 == r4) goto L_0x00c5
            r4 = 70
            if (r1 != r4) goto L_0x00b7
            goto L_0x00c5
        L_0x00b7:
            r4 = 110(0x6e, float:1.54E-43)
            if (r1 == r4) goto L_0x00bf
            r4 = 78
            if (r1 != r4) goto L_0x0117
        L_0x00bf:
            java.lang.String r1 = "null"
            java.lang.String r4 = "NULL"
            r5 = 7
            goto L_0x00d0
        L_0x00c5:
            java.lang.String r1 = "false"
            java.lang.String r4 = "FALSE"
            r5 = 6
            goto L_0x00d0
        L_0x00cb:
            java.lang.String r1 = "true"
            java.lang.String r4 = "TRUE"
            r5 = 5
        L_0x00d0:
            int r15 = r1.length()
            r11 = 1
        L_0x00d5:
            if (r11 >= r15) goto L_0x00ff
            si0.i r14 = r0.f24267f
            int r7 = r11 + 1
            long r9 = (long) r7
            boolean r9 = r14.mo61427t0(r9)
            if (r9 != 0) goto L_0x00e3
            goto L_0x0117
        L_0x00e3:
            si0.f r9 = r0.f24268g
            long r2 = (long) r11
            byte r2 = r9.mo61430v(r2)
            char r3 = r1.charAt(r11)
            if (r2 == r3) goto L_0x00f7
            char r3 = r4.charAt(r11)
            if (r2 == r3) goto L_0x00f7
            goto L_0x0117
        L_0x00f7:
            r11 = r7
            r2 = 0
            r7 = 7
            r9 = 6
            r10 = 4
            r14 = 0
            goto L_0x00d5
        L_0x00ff:
            si0.i r1 = r0.f24267f
            int r2 = r15 + 1
            long r2 = (long) r2
            boolean r1 = r1.mo61427t0(r2)
            if (r1 == 0) goto L_0x0119
            si0.f r1 = r0.f24268g
            long r2 = (long) r15
            byte r1 = r1.mo61430v(r2)
            boolean r1 = r0.mo25056Z(r1)
            if (r1 == 0) goto L_0x0119
        L_0x0117:
            r5 = 0
            goto L_0x0121
        L_0x0119:
            si0.f r1 = r0.f24268g
            long r2 = (long) r15
            r1.skip(r2)
            r0.f24269h = r5
        L_0x0121:
            if (r5 == 0) goto L_0x0124
            return r5
        L_0x0124:
            r1 = 0
            r2 = 0
            r3 = 1
            r4 = 0
            r7 = 0
        L_0x012a:
            si0.i r9 = r0.f24267f
            int r10 = r1 + 1
            long r14 = (long) r10
            boolean r9 = r9.mo61427t0(r14)
            if (r9 != 0) goto L_0x0139
            r16 = r7
            goto L_0x01af
        L_0x0139:
            si0.f r9 = r0.f24268g
            long r14 = (long) r1
            byte r9 = r9.mo61430v(r14)
            r11 = 43
            if (r9 == r11) goto L_0x0207
            r11 = 69
            if (r9 == r11) goto L_0x01fb
            r11 = 101(0x65, float:1.42E-43)
            if (r9 == r11) goto L_0x01fb
            r11 = 45
            if (r9 == r11) goto L_0x01ed
            r11 = 46
            if (r9 == r11) goto L_0x01e4
            r11 = 48
            if (r9 < r11) goto L_0x01a6
            r11 = 57
            if (r9 <= r11) goto L_0x015d
            goto L_0x01a6
        L_0x015d:
            if (r2 == r13) goto L_0x019a
            if (r2 != 0) goto L_0x0162
            goto L_0x019a
        L_0x0162:
            if (r2 != r6) goto L_0x018c
            r14 = 0
            int r1 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x016c
            goto L_0x0214
        L_0x016c:
            r14 = 10
            long r14 = r14 * r4
            int r9 = r9 + -48
            r16 = r7
            long r6 = (long) r9
            long r14 = r14 - r6
            r6 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x0188
            if (r1 != 0) goto L_0x0186
            int r1 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0186
            goto L_0x0188
        L_0x0186:
            r1 = 0
            goto L_0x0189
        L_0x0188:
            r1 = 1
        L_0x0189:
            r3 = r3 & r1
            r4 = r14
            goto L_0x0191
        L_0x018c:
            r16 = r7
            if (r2 != r8) goto L_0x0193
            r2 = 4
        L_0x0191:
            r6 = 6
            goto L_0x01a3
        L_0x0193:
            r6 = 6
            if (r2 == r12) goto L_0x0198
            if (r2 != r6) goto L_0x01a3
        L_0x0198:
            r2 = 7
            goto L_0x01a3
        L_0x019a:
            r16 = r7
            r6 = 6
            int r9 = r9 + -48
            int r1 = -r9
            long r1 = (long) r1
            r4 = r1
            r2 = 2
        L_0x01a3:
            r7 = 7
            goto L_0x020e
        L_0x01a6:
            r16 = r7
            boolean r6 = r0.mo25056Z(r9)
            if (r6 != 0) goto L_0x0214
            r6 = 2
        L_0x01af:
            if (r2 != r6) goto L_0x01d4
            if (r3 == 0) goto L_0x01d4
            r6 = -9223372036854775808
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x01bb
            if (r16 == 0) goto L_0x01d4
        L_0x01bb:
            r6 = 0
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x01c3
            if (r16 != 0) goto L_0x01d4
        L_0x01c3:
            if (r16 == 0) goto L_0x01c6
            goto L_0x01c7
        L_0x01c6:
            long r4 = -r4
        L_0x01c7:
            r0.f24270i = r4
            si0.f r2 = r0.f24268g
            long r3 = (long) r1
            r2.skip(r3)
            r11 = 16
            r0.f24269h = r11
            goto L_0x0215
        L_0x01d4:
            r3 = 2
            if (r2 == r3) goto L_0x01dd
            r3 = 4
            if (r2 == r3) goto L_0x01dd
            r7 = 7
            if (r2 != r7) goto L_0x0214
        L_0x01dd:
            r0.f24271j = r1
            r11 = 17
            r0.f24269h = r11
            goto L_0x0215
        L_0x01e4:
            r16 = r7
            r1 = 2
            r6 = 6
            r7 = 7
            if (r2 != r1) goto L_0x0214
            r2 = 3
            goto L_0x020e
        L_0x01ed:
            r16 = r7
            r1 = 2
            r6 = 6
            r7 = 7
            if (r2 != 0) goto L_0x01f8
            r2 = 1
            r16 = 1
            goto L_0x020e
        L_0x01f8:
            if (r2 != r12) goto L_0x0214
            goto L_0x020d
        L_0x01fb:
            r16 = r7
            r1 = 2
            r6 = 6
            r7 = 7
            if (r2 == r1) goto L_0x0205
            r1 = 4
            if (r2 != r1) goto L_0x0214
        L_0x0205:
            r2 = 5
            goto L_0x020e
        L_0x0207:
            r16 = r7
            r6 = 6
            r7 = 7
            if (r2 != r12) goto L_0x0214
        L_0x020d:
            r2 = 6
        L_0x020e:
            r1 = r10
            r7 = r16
            r6 = 2
            goto L_0x012a
        L_0x0214:
            r11 = 0
        L_0x0215:
            if (r11 == 0) goto L_0x0218
            return r11
        L_0x0218:
            si0.f r1 = r0.f24268g
            r2 = 0
            byte r1 = r1.mo61430v(r2)
            boolean r1 = r0.mo25056Z(r1)
            if (r1 != 0) goto L_0x022d
            java.lang.String r1 = "Expected value"
            r0.mo24993U(r1)
            r1 = 0
            throw r1
        L_0x022d:
            r1 = 0
            r17.mo25052V()
            throw r1
        L_0x0232:
            si0.f r1 = r0.f24268g
            r1.readByte()
            r0.f24269h = r13
            return r13
        L_0x023a:
            if (r3 != r13) goto L_0x024d
            si0.f r1 = r0.f24268g
            r1.readByte()
            r1 = 4
            r0.f24269h = r1
            return r1
        L_0x0245:
            si0.f r1 = r0.f24268g
            r1.readByte()
            r0.f24269h = r8
            return r8
        L_0x024d:
            if (r3 == r13) goto L_0x025a
            r1 = 2
            if (r3 != r1) goto L_0x0253
            goto L_0x025a
        L_0x0253:
            java.lang.String r1 = "Unexpected value"
            r0.mo24993U(r1)
            r1 = 0
            throw r1
        L_0x025a:
            r1 = 0
            r17.mo25052V()
            throw r1
        L_0x025f:
            r1 = r14
            r17.mo25052V()
            throw r1
        L_0x0264:
            si0.f r1 = r0.f24268g
            r1.readByte()
            r1 = 9
            r0.f24269h = r1
            return r1
        L_0x026e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x0276:
            r1 = r14
            throw r1
        L_0x0278:
            int r2 = r2 - r13
            r4 = 4
            r1[r2] = r4
            r1 = 125(0x7d, float:1.75E-43)
            if (r3 != r12) goto L_0x029f
            int r2 = r0.mo25058b0(r13)
            si0.f r4 = r0.f24268g
            r4.readByte()
            if (r2 == r15) goto L_0x029f
            if (r2 == r5) goto L_0x029a
            if (r2 != r1) goto L_0x0293
            r1 = 2
            r0.f24269h = r1
            return r1
        L_0x0293:
            java.lang.String r1 = "Unterminated object"
            r0.mo24993U(r1)
            r1 = 0
            throw r1
        L_0x029a:
            r1 = 0
            r17.mo25052V()
            throw r1
        L_0x029f:
            int r2 = r0.mo25058b0(r13)
            r4 = 34
            if (r2 == r4) goto L_0x02ce
            r4 = 39
            if (r2 == r4) goto L_0x02c4
            if (r2 != r1) goto L_0x02bf
            if (r3 == r12) goto L_0x02b8
            si0.f r1 = r0.f24268g
            r1.readByte()
            r1 = 2
            r0.f24269h = r1
            return r1
        L_0x02b8:
            java.lang.String r1 = "Expected name"
            r0.mo24993U(r1)
            r1 = 0
            throw r1
        L_0x02bf:
            r1 = 0
            r17.mo25052V()
            throw r1
        L_0x02c4:
            r1 = 0
            si0.f r2 = r0.f24268g
            r2.readByte()
            r17.mo25052V()
            throw r1
        L_0x02ce:
            si0.f r1 = r0.f24268g
            r1.readByte()
            r1 = 13
            r0.f24269h = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C8013l.mo25053W():int");
    }

    /* renamed from: X */
    public final int mo25054X(String str, JsonReader.C7986a aVar) {
        int length = aVar.f24206a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f24206a[i])) {
                this.f24269h = 0;
                this.f24204d[this.f24202b - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: Y */
    public final int mo25055Y(String str, JsonReader.C7986a aVar) {
        int length = aVar.f24206a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f24206a[i])) {
                this.f24269h = 0;
                int[] iArr = this.f24205e;
                int i2 = this.f24202b - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: Z */
    public final boolean mo25056Z(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        mo25052V();
        throw null;
    }

    /* renamed from: a0 */
    public final String mo25057a0() throws IOException {
        String str;
        int i = this.f24269h;
        if (i == 0) {
            i = mo25053W();
        }
        if (i == 14) {
            str = mo25061d0();
        } else if (i == 13) {
            str = mo25059c0(f24265m);
        } else if (i == 12) {
            str = mo25059c0(f24264l);
        } else if (i == 15) {
            str = this.f24272k;
            this.f24272k = null;
        } else {
            StringBuilder k = C13555b.m33972k("Expected a name but was ");
            k.append(mo24986H());
            k.append(" at path ");
            k.append(mo24998t());
            throw new JsonDataException(k.toString());
        }
        this.f24269h = 0;
        this.f24204d[this.f24202b - 1] = str;
        return str;
    }

    /* renamed from: b0 */
    public final int mo25058b0(boolean z) throws IOException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (this.f24267f.mo61427t0((long) i2)) {
                byte v = this.f24268g.mo61430v((long) i);
                if (v == 10 || v == 32 || v == 13 || v == 9) {
                    i = i2;
                } else {
                    this.f24268g.skip((long) (i2 - 1));
                    if (v == 47) {
                        if (!this.f24267f.mo61427t0(2)) {
                            return v;
                        }
                        mo25052V();
                        throw null;
                    } else if (v != 35) {
                        return v;
                    } else {
                        mo25052V();
                        throw null;
                    }
                }
            } else if (!z) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    /* renamed from: c0 */
    public final String mo25059c0(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long s = this.f24267f.mo61424s(byteString);
            if (s == -1) {
                mo24993U("Unterminated string");
                throw null;
            } else if (this.f24268g.mo61430v(s) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f24268g.mo61381K(s));
                this.f24268g.readByte();
                sb.append(mo25062e0());
            } else if (sb == null) {
                String K = this.f24268g.mo61381K(s);
                this.f24268g.readByte();
                return K;
            } else {
                sb.append(this.f24268g.mo61381K(s));
                this.f24268g.readByte();
                return sb.toString();
            }
        }
    }

    public final void close() throws IOException {
        this.f24269h = 0;
        this.f24203c[0] = 8;
        this.f24202b = 1;
        this.f24268g.mo61413i();
        this.f24267f.close();
    }

    /* renamed from: d0 */
    public final String mo25061d0() throws IOException {
        long s = this.f24267f.mo61424s(f24266n);
        if (s != -1) {
            return this.f24268g.mo61381K(s);
        }
        return this.f24268g.mo61380H();
    }

    /* renamed from: e */
    public final void mo24994e() throws IOException {
        int i = this.f24269h;
        if (i == 0) {
            i = mo25053W();
        }
        if (i == 3) {
            mo24988N(1);
            this.f24205e[this.f24202b - 1] = 0;
            this.f24269h = 0;
            return;
        }
        StringBuilder k = C13555b.m33972k("Expected BEGIN_ARRAY but was ");
        k.append(mo24986H());
        k.append(" at path ");
        k.append(mo24998t());
        throw new JsonDataException(k.toString());
    }

    /* renamed from: e0 */
    public final char mo25062e0() throws IOException {
        int i;
        int i2;
        if (this.f24267f.mo61427t0(1)) {
            byte readByte = this.f24268g.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                StringBuilder k = C13555b.m33972k("Invalid escape sequence: \\");
                k.append((char) readByte);
                mo24993U(k.toString());
                throw null;
            } else if (this.f24267f.mo61427t0(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte v = this.f24268g.mo61430v((long) i3);
                    char c2 = (char) (c << 4);
                    if (v < 48 || v > 57) {
                        if (v >= 97 && v <= 102) {
                            i2 = v - 97;
                        } else if (v < 65 || v > 70) {
                            StringBuilder k2 = C13555b.m33972k("\\u");
                            k2.append(this.f24268g.mo61381K(4));
                            mo24993U(k2.toString());
                            throw null;
                        } else {
                            i2 = v - 65;
                        }
                        i = i2 + 10;
                    } else {
                        i = v - 48;
                    }
                    c = (char) (i + c2);
                }
                this.f24268g.skip(4);
                return c;
            } else {
                StringBuilder k3 = C13555b.m33972k("Unterminated escape sequence at path ");
                k3.append(mo24998t());
                throw new EOFException(k3.toString());
            }
        } else {
            mo24993U("Unterminated escape sequence");
            throw null;
        }
    }

    /* renamed from: f0 */
    public final void mo25063f0(ByteString byteString) throws IOException {
        while (true) {
            long s = this.f24267f.mo61424s(byteString);
            if (s == -1) {
                mo24993U("Unterminated string");
                throw null;
            } else if (this.f24268g.mo61430v(s) == 92) {
                this.f24268g.skip(s + 1);
                mo25062e0();
            } else {
                this.f24268g.skip(s + 1);
                return;
            }
        }
    }

    /* renamed from: i */
    public final void mo24995i() throws IOException {
        int i = this.f24269h;
        if (i == 0) {
            i = mo25053W();
        }
        if (i == 1) {
            mo24988N(3);
            this.f24269h = 0;
            return;
        }
        StringBuilder k = C13555b.m33972k("Expected BEGIN_OBJECT but was ");
        k.append(mo24986H());
        k.append(" at path ");
        k.append(mo24998t());
        throw new JsonDataException(k.toString());
    }

    /* renamed from: q */
    public final void mo24996q() throws IOException {
        int i = this.f24269h;
        if (i == 0) {
            i = mo25053W();
        }
        if (i == 4) {
            int i2 = this.f24202b - 1;
            this.f24202b = i2;
            int[] iArr = this.f24205e;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f24269h = 0;
            return;
        }
        StringBuilder k = C13555b.m33972k("Expected END_ARRAY but was ");
        k.append(mo24986H());
        k.append(" at path ");
        k.append(mo24998t());
        throw new JsonDataException(k.toString());
    }

    /* renamed from: r */
    public final void mo24997r() throws IOException {
        int i = this.f24269h;
        if (i == 0) {
            i = mo25053W();
        }
        if (i == 2) {
            int i2 = this.f24202b - 1;
            this.f24202b = i2;
            this.f24204d[i2] = null;
            int[] iArr = this.f24205e;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f24269h = 0;
            return;
        }
        StringBuilder k = C13555b.m33972k("Expected END_OBJECT but was ");
        k.append(mo24986H());
        k.append(" at path ");
        k.append(mo24998t());
        throw new JsonDataException(k.toString());
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("JsonReader(");
        k.append(this.f24267f);
        k.append(")");
        return k.toString();
    }

    /* renamed from: v */
    public final boolean mo24999v() throws IOException {
        int i = this.f24269h;
        if (i == 0) {
            i = mo25053W();
        }
        if (i == 2 || i == 4 || i == 18) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public final boolean mo25000w() throws IOException {
        int i = this.f24269h;
        if (i == 0) {
            i = mo25053W();
        }
        if (i == 5) {
            this.f24269h = 0;
            int[] iArr = this.f24205e;
            int i2 = this.f24202b - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f24269h = 0;
            int[] iArr2 = this.f24205e;
            int i3 = this.f24202b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder k = C13555b.m33972k("Expected a boolean but was ");
            k.append(mo24986H());
            k.append(" at path ");
            k.append(mo24998t());
            throw new JsonDataException(k.toString());
        }
    }

    /* renamed from: x */
    public final double mo25001x() throws IOException {
        int i = this.f24269h;
        if (i == 0) {
            i = mo25053W();
        }
        if (i == 16) {
            this.f24269h = 0;
            int[] iArr = this.f24205e;
            int i2 = this.f24202b - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f24270i;
        }
        if (i == 17) {
            this.f24272k = this.f24268g.mo61381K((long) this.f24271j);
        } else if (i == 9) {
            this.f24272k = mo25059c0(f24265m);
        } else if (i == 8) {
            this.f24272k = mo25059c0(f24264l);
        } else if (i == 10) {
            this.f24272k = mo25061d0();
        } else if (i != 11) {
            StringBuilder k = C13555b.m33972k("Expected a double but was ");
            k.append(mo24986H());
            k.append(" at path ");
            k.append(mo24998t());
            throw new JsonDataException(k.toString());
        }
        this.f24269h = 11;
        try {
            double parseDouble = Double.parseDouble(this.f24272k);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + mo24998t());
            }
            this.f24272k = null;
            this.f24269h = 0;
            int[] iArr2 = this.f24205e;
            int i3 = this.f24202b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            StringBuilder k2 = C13555b.m33972k("Expected a double but was ");
            k2.append(this.f24272k);
            k2.append(" at path ");
            k2.append(mo24998t());
            throw new JsonDataException(k2.toString());
        }
    }

    /* renamed from: z */
    public final int mo25002z() throws IOException {
        String str;
        int i = this.f24269h;
        if (i == 0) {
            i = mo25053W();
        }
        if (i == 16) {
            long j = this.f24270i;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f24269h = 0;
                int[] iArr = this.f24205e;
                int i3 = this.f24202b - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder k = C13555b.m33972k("Expected an int but was ");
            k.append(this.f24270i);
            k.append(" at path ");
            k.append(mo24998t());
            throw new JsonDataException(k.toString());
        }
        if (i == 17) {
            this.f24272k = this.f24268g.mo61381K((long) this.f24271j);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = mo25059c0(f24265m);
            } else {
                str = mo25059c0(f24264l);
            }
            this.f24272k = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.f24269h = 0;
                int[] iArr2 = this.f24205e;
                int i4 = this.f24202b - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder k2 = C13555b.m33972k("Expected an int but was ");
            k2.append(mo24986H());
            k2.append(" at path ");
            k2.append(mo24998t());
            throw new JsonDataException(k2.toString());
        }
        this.f24269h = 11;
        try {
            double parseDouble = Double.parseDouble(this.f24272k);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f24272k = null;
                this.f24269h = 0;
                int[] iArr3 = this.f24205e;
                int i6 = this.f24202b - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            StringBuilder k3 = C13555b.m33972k("Expected an int but was ");
            k3.append(this.f24272k);
            k3.append(" at path ");
            k3.append(mo24998t());
            throw new JsonDataException(k3.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder k4 = C13555b.m33972k("Expected an int but was ");
            k4.append(this.f24272k);
            k4.append(" at path ");
            k4.append(mo24998t());
            throw new JsonDataException(k4.toString());
        }
    }
}
