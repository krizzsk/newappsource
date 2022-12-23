package com.airbnb.lottie.parser.moshi;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.appboy.support.StringUtils;
import java.io.EOFException;
import java.io.IOException;
import okio.ByteString;
import si0.C24898f;
import si0.C24902i;
import si0.C24918x;

/* renamed from: com.airbnb.lottie.parser.moshi.a */
public final class C1902a extends JsonReader {

    /* renamed from: m */
    public static final ByteString f6654m = ByteString.C24633a.m61918a("'\\");

    /* renamed from: n */
    public static final ByteString f6655n = ByteString.C24633a.m61918a("\"\\");

    /* renamed from: o */
    public static final ByteString f6656o = ByteString.C24633a.m61918a("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: g */
    public final C24902i f6657g;

    /* renamed from: h */
    public final C24898f f6658h;

    /* renamed from: i */
    public int f6659i = 0;

    /* renamed from: j */
    public long f6660j;

    /* renamed from: k */
    public int f6661k;

    /* renamed from: l */
    public String f6662l;

    static {
        ByteString byteString = ByteString.f62330d;
        ByteString.C24633a.m61918a("\n\r");
        ByteString.C24633a.m61918a("*/");
    }

    public C1902a(C24918x xVar) {
        this.f6657g = xVar;
        this.f6658h = xVar.f62987b;
        mo6825C(6);
    }

    /* renamed from: A */
    public final String mo6823A() throws IOException {
        String str;
        int i = this.f6659i;
        if (i == 0) {
            i = mo6840S();
        }
        if (i == 10) {
            str = mo6846Y();
        } else if (i == 9) {
            str = mo6845X(f6655n);
        } else if (i == 8) {
            str = mo6845X(f6654m);
        } else if (i == 11) {
            str = this.f6662l;
            this.f6662l = null;
        } else if (i == 16) {
            str = Long.toString(this.f6660j);
        } else if (i == 17) {
            str = this.f6658h.mo61381K((long) this.f6661k);
        } else {
            StringBuilder k = C13555b.m33972k("Expected a string but was ");
            k.append(mo6824B());
            k.append(" at path ");
            k.append(mo6834t());
            throw new JsonDataException(k.toString());
        }
        this.f6659i = 0;
        int[] iArr = this.f6651e;
        int i2 = this.f6648b - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: B */
    public final JsonReader.Token mo6824B() throws IOException {
        int i = this.f6659i;
        if (i == 0) {
            i = mo6840S();
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

    /* renamed from: H */
    public final int mo6826H(JsonReader.C1901a aVar) throws IOException {
        int i = this.f6659i;
        if (i == 0) {
            i = mo6840S();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return mo6841T(this.f6662l, aVar);
        }
        int R0 = this.f6657g.mo61389R0(aVar.f6653b);
        if (R0 != -1) {
            this.f6659i = 0;
            this.f6650d[this.f6648b - 1] = aVar.f6652a[R0];
            return R0;
        }
        String str = this.f6650d[this.f6648b - 1];
        String V = mo6843V();
        int T = mo6841T(V, aVar);
        if (T == -1) {
            this.f6659i = 15;
            this.f6662l = V;
            this.f6650d[this.f6648b - 1] = str;
        }
        return T;
    }

    /* renamed from: K */
    public final void mo6827K() throws IOException {
        int i = this.f6659i;
        if (i == 0) {
            i = mo6840S();
        }
        if (i == 14) {
            long s = this.f6657g.mo61424s(f6656o);
            C24898f fVar = this.f6658h;
            if (s == -1) {
                s = fVar.f62947c;
            }
            fVar.skip(s);
        } else if (i == 13) {
            mo6848a0(f6655n);
        } else if (i == 12) {
            mo6848a0(f6654m);
        } else if (i != 15) {
            StringBuilder k = C13555b.m33972k("Expected a name but was ");
            k.append(mo6824B());
            k.append(" at path ");
            k.append(mo6834t());
            throw new JsonDataException(k.toString());
        }
        this.f6659i = 0;
        this.f6650d[this.f6648b - 1] = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
    }

    /* renamed from: N */
    public final void mo6828N() throws IOException {
        int i = 0;
        do {
            int i2 = this.f6659i;
            if (i2 == 0) {
                i2 = mo6840S();
            }
            if (i2 == 3) {
                mo6825C(1);
            } else if (i2 == 1) {
                mo6825C(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i >= 0) {
                        this.f6648b--;
                    } else {
                        StringBuilder k = C13555b.m33972k("Expected a value but was ");
                        k.append(mo6824B());
                        k.append(" at path ");
                        k.append(mo6834t());
                        throw new JsonDataException(k.toString());
                    }
                } else if (i2 == 2) {
                    i--;
                    if (i >= 0) {
                        this.f6648b--;
                    } else {
                        StringBuilder k2 = C13555b.m33972k("Expected a value but was ");
                        k2.append(mo6824B());
                        k2.append(" at path ");
                        k2.append(mo6834t());
                        throw new JsonDataException(k2.toString());
                    }
                } else if (i2 == 14 || i2 == 10) {
                    long s = this.f6657g.mo61424s(f6656o);
                    C24898f fVar = this.f6658h;
                    if (s == -1) {
                        s = fVar.f62947c;
                    }
                    fVar.skip(s);
                } else if (i2 == 9 || i2 == 13) {
                    mo6848a0(f6655n);
                } else if (i2 == 8 || i2 == 12) {
                    mo6848a0(f6654m);
                } else if (i2 == 17) {
                    this.f6658h.skip((long) this.f6661k);
                } else if (i2 == 18) {
                    StringBuilder k3 = C13555b.m33972k("Expected a value but was ");
                    k3.append(mo6824B());
                    k3.append(" at path ");
                    k3.append(mo6834t());
                    throw new JsonDataException(k3.toString());
                }
                this.f6659i = 0;
            }
            i++;
            this.f6659i = 0;
        } while (i != 0);
        int[] iArr = this.f6651e;
        int i3 = this.f6648b;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f6650d[i3 - 1] = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
    }

    /* renamed from: R */
    public final void mo6839R() throws IOException {
        mo6829O("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01a2, code lost:
        if (mo6842U(r8) != false) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01a5, code lost:
        if (r2 != 2) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01a7, code lost:
        if (r3 == false) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01ad, code lost:
        if (r4 != Long.MIN_VALUE) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01af, code lost:
        if (r7 == false) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01b5, code lost:
        if (r4 != 0) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01b7, code lost:
        if (r7 != false) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01b9, code lost:
        if (r7 == false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01bc, code lost:
        r4 = -r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01bd, code lost:
        r0.f6660j = r4;
        r0.f6658h.skip((long) r1);
        r9 = 16;
        r0.f6659i = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01cb, code lost:
        if (r2 == 2) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01ce, code lost:
        if (r2 == 4) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01d1, code lost:
        if (r2 != 7) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01d3, code lost:
        r0.f6661k = r1;
        r9 = 17;
        r0.f6659i = 17;
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0120 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0121  */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo6840S() throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            int[] r1 = r0.f6649c
            int r2 = r0.f6648b
            int r3 = r2 + -1
            r3 = r1[r3]
            r5 = 7
            r6 = 3
            r7 = 6
            r8 = 4
            r9 = 0
            r10 = 5
            r11 = 1
            r12 = 2
            r13 = 0
            r15 = 93
            r4 = 59
            r14 = 44
            if (r3 != r11) goto L_0x001f
            int r2 = r2 - r11
            r1[r2] = r12
            goto L_0x007f
        L_0x001f:
            if (r3 != r12) goto L_0x003d
            int r1 = r0.mo6844W(r11)
            si0.f r2 = r0.f6658h
            r2.readByte()
            if (r1 == r14) goto L_0x007f
            if (r1 == r4) goto L_0x0039
            if (r1 != r15) goto L_0x0033
            r0.f6659i = r8
            return r8
        L_0x0033:
            java.lang.String r1 = "Unterminated array"
            r0.mo6829O(r1)
            throw r13
        L_0x0039:
            r16.mo6839R()
            throw r13
        L_0x003d:
            if (r3 == r6) goto L_0x0265
            if (r3 != r10) goto L_0x0043
            goto L_0x0265
        L_0x0043:
            if (r3 != r8) goto L_0x0063
            int r2 = r2 - r11
            r1[r2] = r10
            int r1 = r0.mo6844W(r11)
            si0.f r2 = r0.f6658h
            r2.readByte()
            r2 = 58
            if (r1 == r2) goto L_0x007f
            r2 = 61
            if (r1 == r2) goto L_0x005f
            java.lang.String r1 = "Expected ':'"
            r0.mo6829O(r1)
            throw r13
        L_0x005f:
            r16.mo6839R()
            throw r13
        L_0x0063:
            if (r3 != r7) goto L_0x0069
            int r2 = r2 - r11
            r1[r2] = r5
            goto L_0x007f
        L_0x0069:
            if (r3 != r5) goto L_0x007b
            int r1 = r0.mo6844W(r9)
            r2 = -1
            if (r1 != r2) goto L_0x0077
            r1 = 18
            r0.f6659i = r1
            return r1
        L_0x0077:
            r16.mo6839R()
            throw r13
        L_0x007b:
            r1 = 8
            if (r3 == r1) goto L_0x025d
        L_0x007f:
            int r1 = r0.mo6844W(r11)
            r2 = 34
            if (r1 == r2) goto L_0x0253
            r2 = 39
            if (r1 == r2) goto L_0x024e
            if (r1 == r14) goto L_0x023b
            if (r1 == r4) goto L_0x023b
            r2 = 91
            if (r1 == r2) goto L_0x0233
            if (r1 == r15) goto L_0x0227
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x021e
            si0.f r1 = r0.f6658h
            r2 = 0
            byte r1 = r1.mo61430v(r2)
            r4 = 116(0x74, float:1.63E-43)
            if (r1 == r4) goto L_0x00c7
            r4 = 84
            if (r1 != r4) goto L_0x00aa
            goto L_0x00c7
        L_0x00aa:
            r4 = 102(0x66, float:1.43E-43)
            if (r1 == r4) goto L_0x00c1
            r4 = 70
            if (r1 != r4) goto L_0x00b3
            goto L_0x00c1
        L_0x00b3:
            r4 = 110(0x6e, float:1.54E-43)
            if (r1 == r4) goto L_0x00bb
            r4 = 78
            if (r1 != r4) goto L_0x0114
        L_0x00bb:
            java.lang.String r1 = "null"
            java.lang.String r4 = "NULL"
            r14 = 7
            goto L_0x00cd
        L_0x00c1:
            java.lang.String r1 = "false"
            java.lang.String r4 = "FALSE"
            r14 = 6
            goto L_0x00cd
        L_0x00c7:
            java.lang.String r1 = "true"
            java.lang.String r4 = "TRUE"
            r14 = 5
        L_0x00cd:
            int r15 = r1.length()
            r9 = 1
        L_0x00d2:
            if (r9 >= r15) goto L_0x00fc
            si0.i r13 = r0.f6657g
            int r5 = r9 + 1
            long r7 = (long) r5
            boolean r7 = r13.mo61427t0(r7)
            if (r7 != 0) goto L_0x00e0
            goto L_0x0114
        L_0x00e0:
            si0.f r7 = r0.f6658h
            long r2 = (long) r9
            byte r2 = r7.mo61430v(r2)
            char r3 = r1.charAt(r9)
            if (r2 == r3) goto L_0x00f4
            char r3 = r4.charAt(r9)
            if (r2 == r3) goto L_0x00f4
            goto L_0x0114
        L_0x00f4:
            r9 = r5
            r2 = 0
            r5 = 7
            r7 = 6
            r8 = 4
            r13 = 0
            goto L_0x00d2
        L_0x00fc:
            si0.i r1 = r0.f6657g
            int r2 = r15 + 1
            long r2 = (long) r2
            boolean r1 = r1.mo61427t0(r2)
            if (r1 == 0) goto L_0x0116
            si0.f r1 = r0.f6658h
            long r2 = (long) r15
            byte r1 = r1.mo61430v(r2)
            boolean r1 = r0.mo6842U(r1)
            if (r1 == 0) goto L_0x0116
        L_0x0114:
            r14 = 0
            goto L_0x011e
        L_0x0116:
            si0.f r1 = r0.f6658h
            long r2 = (long) r15
            r1.skip(r2)
            r0.f6659i = r14
        L_0x011e:
            if (r14 == 0) goto L_0x0121
            return r14
        L_0x0121:
            r1 = 0
            r2 = 0
            r3 = 1
            r4 = 0
            r7 = 0
        L_0x0127:
            si0.i r8 = r0.f6657g
            int r9 = r1 + 1
            long r13 = (long) r9
            boolean r8 = r8.mo61427t0(r13)
            if (r8 != 0) goto L_0x0134
            goto L_0x01a4
        L_0x0134:
            si0.f r8 = r0.f6658h
            long r13 = (long) r1
            byte r8 = r8.mo61430v(r13)
            r13 = 43
            if (r8 == r13) goto L_0x01f6
            r13 = 69
            if (r8 == r13) goto L_0x01ec
            r13 = 101(0x65, float:1.42E-43)
            if (r8 == r13) goto L_0x01ec
            r13 = 45
            if (r8 == r13) goto L_0x01e1
            r13 = 46
            if (r8 == r13) goto L_0x01da
            r13 = 48
            if (r8 < r13) goto L_0x019e
            r13 = 57
            if (r8 <= r13) goto L_0x0158
            goto L_0x019e
        L_0x0158:
            if (r2 == r11) goto L_0x0195
            if (r2 != 0) goto L_0x015d
            goto L_0x0195
        L_0x015d:
            if (r2 != r12) goto L_0x0187
            r13 = 0
            int r1 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x0167
            goto L_0x0200
        L_0x0167:
            r13 = 10
            long r13 = r13 * r4
            int r8 = r8 + -48
            long r11 = (long) r8
            long r13 = r13 - r11
            r11 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r1 > 0) goto L_0x0181
            if (r1 != 0) goto L_0x017f
            int r1 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x017f
            goto L_0x0181
        L_0x017f:
            r1 = 0
            goto L_0x0182
        L_0x0181:
            r1 = 1
        L_0x0182:
            r1 = r1 & r3
            r3 = r1
            r4 = r13
            r11 = 6
            goto L_0x019c
        L_0x0187:
            if (r2 != r6) goto L_0x018e
            r2 = 4
            r8 = 7
            r11 = 6
            goto L_0x01fb
        L_0x018e:
            r11 = 6
            if (r2 == r10) goto L_0x0193
            if (r2 != r11) goto L_0x019c
        L_0x0193:
            r2 = 7
            goto L_0x019c
        L_0x0195:
            r11 = 6
            int r8 = r8 + -48
            int r1 = -r8
            long r1 = (long) r1
            r4 = r1
            r2 = 2
        L_0x019c:
            r8 = 7
            goto L_0x01fb
        L_0x019e:
            boolean r6 = r0.mo6842U(r8)
            if (r6 != 0) goto L_0x0200
        L_0x01a4:
            r6 = 2
            if (r2 != r6) goto L_0x01ca
            if (r3 == 0) goto L_0x01ca
            r8 = -9223372036854775808
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x01b1
            if (r7 == 0) goto L_0x01ca
        L_0x01b1:
            r8 = 0
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x01b9
            if (r7 != 0) goto L_0x01ca
        L_0x01b9:
            if (r7 == 0) goto L_0x01bc
            goto L_0x01bd
        L_0x01bc:
            long r4 = -r4
        L_0x01bd:
            r0.f6660j = r4
            si0.f r2 = r0.f6658h
            long r3 = (long) r1
            r2.skip(r3)
            r9 = 16
            r0.f6659i = r9
            goto L_0x0201
        L_0x01ca:
            r3 = 2
            if (r2 == r3) goto L_0x01d3
            r3 = 4
            if (r2 == r3) goto L_0x01d3
            r8 = 7
            if (r2 != r8) goto L_0x0200
        L_0x01d3:
            r0.f6661k = r1
            r9 = 17
            r0.f6659i = r9
            goto L_0x0201
        L_0x01da:
            r1 = 2
            r8 = 7
            r11 = 6
            if (r2 != r1) goto L_0x0200
            r2 = 3
            goto L_0x01fb
        L_0x01e1:
            r1 = 2
            r8 = 7
            r11 = 6
            if (r2 != 0) goto L_0x01e9
            r2 = 1
            r7 = 1
            goto L_0x01fb
        L_0x01e9:
            if (r2 != r10) goto L_0x0200
            goto L_0x01fa
        L_0x01ec:
            r1 = 2
            r8 = 7
            r11 = 6
            if (r2 == r1) goto L_0x01f4
            r1 = 4
            if (r2 != r1) goto L_0x0200
        L_0x01f4:
            r2 = 5
            goto L_0x01fb
        L_0x01f6:
            r8 = 7
            r11 = 6
            if (r2 != r10) goto L_0x0200
        L_0x01fa:
            r2 = 6
        L_0x01fb:
            r1 = r9
            r11 = 1
            r12 = 2
            goto L_0x0127
        L_0x0200:
            r9 = 0
        L_0x0201:
            if (r9 == 0) goto L_0x0204
            return r9
        L_0x0204:
            si0.f r1 = r0.f6658h
            r2 = 0
            byte r1 = r1.mo61430v(r2)
            boolean r1 = r0.mo6842U(r1)
            if (r1 != 0) goto L_0x0219
            java.lang.String r1 = "Expected value"
            r0.mo6829O(r1)
            r1 = 0
            throw r1
        L_0x0219:
            r1 = 0
            r16.mo6839R()
            throw r1
        L_0x021e:
            si0.f r1 = r0.f6658h
            r1.readByte()
            r1 = 1
            r0.f6659i = r1
            return r1
        L_0x0227:
            r1 = 1
            if (r3 != r1) goto L_0x023c
            si0.f r1 = r0.f6658h
            r1.readByte()
            r1 = 4
            r0.f6659i = r1
            return r1
        L_0x0233:
            si0.f r1 = r0.f6658h
            r1.readByte()
            r0.f6659i = r6
            return r6
        L_0x023b:
            r1 = 1
        L_0x023c:
            if (r3 == r1) goto L_0x0249
            r1 = 2
            if (r3 != r1) goto L_0x0242
            goto L_0x0249
        L_0x0242:
            java.lang.String r1 = "Unexpected value"
            r0.mo6829O(r1)
            r1 = 0
            throw r1
        L_0x0249:
            r1 = 0
            r16.mo6839R()
            throw r1
        L_0x024e:
            r1 = r13
            r16.mo6839R()
            throw r1
        L_0x0253:
            si0.f r1 = r0.f6658h
            r1.readByte()
            r1 = 9
            r0.f6659i = r1
            return r1
        L_0x025d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x0265:
            r5 = 1
            int r2 = r2 - r5
            r6 = 4
            r1[r2] = r6
            r1 = 125(0x7d, float:1.75E-43)
            if (r3 != r10) goto L_0x028d
            int r2 = r0.mo6844W(r5)
            si0.f r5 = r0.f6658h
            r5.readByte()
            if (r2 == r14) goto L_0x028d
            if (r2 == r4) goto L_0x0288
            if (r2 != r1) goto L_0x0281
            r1 = 2
            r0.f6659i = r1
            return r1
        L_0x0281:
            java.lang.String r1 = "Unterminated object"
            r0.mo6829O(r1)
            r1 = 0
            throw r1
        L_0x0288:
            r1 = 0
            r16.mo6839R()
            throw r1
        L_0x028d:
            r2 = 1
            int r2 = r0.mo6844W(r2)
            r4 = 34
            if (r2 == r4) goto L_0x02bd
            r4 = 39
            if (r2 == r4) goto L_0x02b3
            if (r2 != r1) goto L_0x02ae
            if (r3 == r10) goto L_0x02a7
            si0.f r1 = r0.f6658h
            r1.readByte()
            r1 = 2
            r0.f6659i = r1
            return r1
        L_0x02a7:
            java.lang.String r1 = "Expected name"
            r0.mo6829O(r1)
            r1 = 0
            throw r1
        L_0x02ae:
            r1 = 0
            r16.mo6839R()
            throw r1
        L_0x02b3:
            r1 = 0
            si0.f r2 = r0.f6658h
            r2.readByte()
            r16.mo6839R()
            throw r1
        L_0x02bd:
            si0.f r1 = r0.f6658h
            r1.readByte()
            r1 = 13
            r0.f6659i = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.C1902a.mo6840S():int");
    }

    /* renamed from: T */
    public final int mo6841T(String str, JsonReader.C1901a aVar) {
        int length = aVar.f6652a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f6652a[i])) {
                this.f6659i = 0;
                this.f6650d[this.f6648b - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: U */
    public final boolean mo6842U(int i) throws IOException {
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
        mo6839R();
        throw null;
    }

    /* renamed from: V */
    public final String mo6843V() throws IOException {
        String str;
        int i = this.f6659i;
        if (i == 0) {
            i = mo6840S();
        }
        if (i == 14) {
            str = mo6846Y();
        } else if (i == 13) {
            str = mo6845X(f6655n);
        } else if (i == 12) {
            str = mo6845X(f6654m);
        } else if (i == 15) {
            str = this.f6662l;
        } else {
            StringBuilder k = C13555b.m33972k("Expected a name but was ");
            k.append(mo6824B());
            k.append(" at path ");
            k.append(mo6834t());
            throw new JsonDataException(k.toString());
        }
        this.f6659i = 0;
        this.f6650d[this.f6648b - 1] = str;
        return str;
    }

    /* renamed from: W */
    public final int mo6844W(boolean z) throws IOException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (this.f6657g.mo61427t0((long) i2)) {
                byte v = this.f6658h.mo61430v((long) i);
                if (v == 10 || v == 32 || v == 13 || v == 9) {
                    i = i2;
                } else {
                    this.f6658h.skip((long) (i2 - 1));
                    if (v == 47) {
                        if (!this.f6657g.mo61427t0(2)) {
                            return v;
                        }
                        mo6839R();
                        throw null;
                    } else if (v != 35) {
                        return v;
                    } else {
                        mo6839R();
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

    /* renamed from: X */
    public final String mo6845X(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long s = this.f6657g.mo61424s(byteString);
            if (s == -1) {
                mo6829O("Unterminated string");
                throw null;
            } else if (this.f6658h.mo61430v(s) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f6658h.mo61381K(s));
                this.f6658h.readByte();
                sb.append(mo6847Z());
            } else if (sb == null) {
                String K = this.f6658h.mo61381K(s);
                this.f6658h.readByte();
                return K;
            } else {
                sb.append(this.f6658h.mo61381K(s));
                this.f6658h.readByte();
                return sb.toString();
            }
        }
    }

    /* renamed from: Y */
    public final String mo6846Y() throws IOException {
        long s = this.f6657g.mo61424s(f6656o);
        if (s != -1) {
            return this.f6658h.mo61381K(s);
        }
        return this.f6658h.mo61380H();
    }

    /* renamed from: Z */
    public final char mo6847Z() throws IOException {
        int i;
        int i2;
        if (this.f6657g.mo61427t0(1)) {
            byte readByte = this.f6658h.readByte();
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
                mo6829O(k.toString());
                throw null;
            } else if (this.f6657g.mo61427t0(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte v = this.f6658h.mo61430v((long) i3);
                    char c2 = (char) (c << 4);
                    if (v < 48 || v > 57) {
                        if (v >= 97 && v <= 102) {
                            i2 = v - 97;
                        } else if (v < 65 || v > 70) {
                            StringBuilder k2 = C13555b.m33972k("\\u");
                            k2.append(this.f6658h.mo61381K(4));
                            mo6829O(k2.toString());
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
                this.f6658h.skip(4);
                return c;
            } else {
                StringBuilder k3 = C13555b.m33972k("Unterminated escape sequence at path ");
                k3.append(mo6834t());
                throw new EOFException(k3.toString());
            }
        } else {
            mo6829O("Unterminated escape sequence");
            throw null;
        }
    }

    /* renamed from: a0 */
    public final void mo6848a0(ByteString byteString) throws IOException {
        while (true) {
            long s = this.f6657g.mo61424s(byteString);
            if (s == -1) {
                mo6829O("Unterminated string");
                throw null;
            } else if (this.f6658h.mo61430v(s) == 92) {
                this.f6658h.skip(s + 1);
                mo6847Z();
            } else {
                this.f6658h.skip(s + 1);
                return;
            }
        }
    }

    public final void close() throws IOException {
        this.f6659i = 0;
        this.f6649c[0] = 8;
        this.f6648b = 1;
        this.f6658h.mo61413i();
        this.f6657g.close();
    }

    /* renamed from: e */
    public final void mo6830e() throws IOException {
        int i = this.f6659i;
        if (i == 0) {
            i = mo6840S();
        }
        if (i == 3) {
            mo6825C(1);
            this.f6651e[this.f6648b - 1] = 0;
            this.f6659i = 0;
            return;
        }
        StringBuilder k = C13555b.m33972k("Expected BEGIN_ARRAY but was ");
        k.append(mo6824B());
        k.append(" at path ");
        k.append(mo6834t());
        throw new JsonDataException(k.toString());
    }

    /* renamed from: i */
    public final void mo6831i() throws IOException {
        int i = this.f6659i;
        if (i == 0) {
            i = mo6840S();
        }
        if (i == 1) {
            mo6825C(3);
            this.f6659i = 0;
            return;
        }
        StringBuilder k = C13555b.m33972k("Expected BEGIN_OBJECT but was ");
        k.append(mo6824B());
        k.append(" at path ");
        k.append(mo6834t());
        throw new JsonDataException(k.toString());
    }

    /* renamed from: q */
    public final void mo6832q() throws IOException {
        int i = this.f6659i;
        if (i == 0) {
            i = mo6840S();
        }
        if (i == 4) {
            int i2 = this.f6648b - 1;
            this.f6648b = i2;
            int[] iArr = this.f6651e;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f6659i = 0;
            return;
        }
        StringBuilder k = C13555b.m33972k("Expected END_ARRAY but was ");
        k.append(mo6824B());
        k.append(" at path ");
        k.append(mo6834t());
        throw new JsonDataException(k.toString());
    }

    /* renamed from: r */
    public final void mo6833r() throws IOException {
        int i = this.f6659i;
        if (i == 0) {
            i = mo6840S();
        }
        if (i == 2) {
            int i2 = this.f6648b - 1;
            this.f6648b = i2;
            this.f6650d[i2] = null;
            int[] iArr = this.f6651e;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f6659i = 0;
            return;
        }
        StringBuilder k = C13555b.m33972k("Expected END_OBJECT but was ");
        k.append(mo6824B());
        k.append(" at path ");
        k.append(mo6834t());
        throw new JsonDataException(k.toString());
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("JsonReader(");
        k.append(this.f6657g);
        k.append(")");
        return k.toString();
    }

    /* renamed from: v */
    public final boolean mo6835v() throws IOException {
        int i = this.f6659i;
        if (i == 0) {
            i = mo6840S();
        }
        if (i == 2 || i == 4 || i == 18) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public final boolean mo6836w() throws IOException {
        int i = this.f6659i;
        if (i == 0) {
            i = mo6840S();
        }
        if (i == 5) {
            this.f6659i = 0;
            int[] iArr = this.f6651e;
            int i2 = this.f6648b - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f6659i = 0;
            int[] iArr2 = this.f6651e;
            int i3 = this.f6648b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder k = C13555b.m33972k("Expected a boolean but was ");
            k.append(mo6824B());
            k.append(" at path ");
            k.append(mo6834t());
            throw new JsonDataException(k.toString());
        }
    }

    /* renamed from: x */
    public final double mo6837x() throws IOException {
        int i = this.f6659i;
        if (i == 0) {
            i = mo6840S();
        }
        if (i == 16) {
            this.f6659i = 0;
            int[] iArr = this.f6651e;
            int i2 = this.f6648b - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f6660j;
        }
        if (i == 17) {
            this.f6662l = this.f6658h.mo61381K((long) this.f6661k);
        } else if (i == 9) {
            this.f6662l = mo6845X(f6655n);
        } else if (i == 8) {
            this.f6662l = mo6845X(f6654m);
        } else if (i == 10) {
            this.f6662l = mo6846Y();
        } else if (i != 11) {
            StringBuilder k = C13555b.m33972k("Expected a double but was ");
            k.append(mo6824B());
            k.append(" at path ");
            k.append(mo6834t());
            throw new JsonDataException(k.toString());
        }
        this.f6659i = 11;
        try {
            double parseDouble = Double.parseDouble(this.f6662l);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + mo6834t());
            }
            this.f6662l = null;
            this.f6659i = 0;
            int[] iArr2 = this.f6651e;
            int i3 = this.f6648b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            StringBuilder k2 = C13555b.m33972k("Expected a double but was ");
            k2.append(this.f6662l);
            k2.append(" at path ");
            k2.append(mo6834t());
            throw new JsonDataException(k2.toString());
        }
    }

    /* renamed from: z */
    public final int mo6838z() throws IOException {
        String str;
        int i = this.f6659i;
        if (i == 0) {
            i = mo6840S();
        }
        if (i == 16) {
            long j = this.f6660j;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f6659i = 0;
                int[] iArr = this.f6651e;
                int i3 = this.f6648b - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder k = C13555b.m33972k("Expected an int but was ");
            k.append(this.f6660j);
            k.append(" at path ");
            k.append(mo6834t());
            throw new JsonDataException(k.toString());
        }
        if (i == 17) {
            this.f6662l = this.f6658h.mo61381K((long) this.f6661k);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = mo6845X(f6655n);
            } else {
                str = mo6845X(f6654m);
            }
            this.f6662l = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.f6659i = 0;
                int[] iArr2 = this.f6651e;
                int i4 = this.f6648b - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder k2 = C13555b.m33972k("Expected an int but was ");
            k2.append(mo6824B());
            k2.append(" at path ");
            k2.append(mo6834t());
            throw new JsonDataException(k2.toString());
        }
        this.f6659i = 11;
        try {
            double parseDouble = Double.parseDouble(this.f6662l);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f6662l = null;
                this.f6659i = 0;
                int[] iArr3 = this.f6651e;
                int i6 = this.f6648b - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            StringBuilder k3 = C13555b.m33972k("Expected an int but was ");
            k3.append(this.f6662l);
            k3.append(" at path ");
            k3.append(mo6834t());
            throw new JsonDataException(k3.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder k4 = C13555b.m33972k("Expected an int but was ");
            k4.append(this.f6662l);
            k4.append(" at path ");
            k4.append(mo6834t());
            throw new JsonDataException(k4.toString());
        }
    }
}
