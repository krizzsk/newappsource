package si0;

import androidx.recyclerview.widget.RecyclerView;
import cf0.C21132f;
import com.appboy.support.ValidationUtils;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import mf0.C24362h;
import okio.ByteString;
import okio.SegmentedByteString;
import p001a0.C0016g;
import p584jl.C17885a;
import ti0.C25014a;
import uh0.C25072a;

/* renamed from: si0.f */
public final class C24898f implements C24902i, C24901h, Cloneable, ByteChannel {

    /* renamed from: b */
    public C24920y f62946b;

    /* renamed from: c */
    public long f62947c;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r7 != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        r1.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        r3 = p379.C13555b.m33972k("Number too large: ");
        r3.append(r1.mo61380H());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        throw new java.lang.NumberFormatException(r3.toString());
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0093 A[EDGE_INSN: B:47:0x0093->B:29:0x0093 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo61374A() throws java.io.EOFException {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f62947c
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00b2
            r1 = -7
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x000f:
            si0.y r8 = r0.f62946b
            mf0.C24362h.m61208c(r8)
            byte[] r9 = r8.f62991a
            int r10 = r8.f62992b
            int r11 = r8.f62993c
        L_0x001a:
            if (r10 >= r11) goto L_0x0093
            byte r12 = r9[r10]
            r13 = 48
            byte r13 = (byte) r13
            if (r12 < r13) goto L_0x0068
            r14 = 57
            byte r14 = (byte) r14
            if (r12 > r14) goto L_0x0068
            int r13 = r13 - r12
            r14 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x0041
            if (r16 != 0) goto L_0x003a
            long r14 = (long) r13
            int r16 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r16 >= 0) goto L_0x003a
            goto L_0x0041
        L_0x003a:
            r14 = 10
            long r3 = r3 * r14
            long r12 = (long) r13
            long r3 = r3 + r12
            goto L_0x0073
        L_0x0041:
            si0.f r1 = new si0.f
            r1.<init>()
            r1.mo61397W(r3)
            r1.mo61395V(r12)
            if (r7 != 0) goto L_0x0051
            r1.readByte()
        L_0x0051:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r3 = "Number too large: "
            java.lang.StringBuilder r3 = p379.C13555b.m33972k(r3)
            java.lang.String r1 = r1.mo61380H()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0068:
            r13 = 45
            byte r13 = (byte) r13
            if (r12 != r13) goto L_0x0078
            if (r5 != 0) goto L_0x0078
            r12 = 1
            long r1 = r1 - r12
            r7 = 1
        L_0x0073:
            int r10 = r10 + 1
            int r5 = r5 + 1
            goto L_0x001a
        L_0x0078:
            if (r5 == 0) goto L_0x007c
            r6 = 1
            goto L_0x0093
        L_0x007c:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            java.lang.String r3 = p584jl.C17885a.m44391B0(r12)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0093:
            if (r10 != r11) goto L_0x009f
            si0.y r9 = r8.mo61475a()
            r0.f62946b = r9
            si0.C24921z.m62598a(r8)
            goto L_0x00a1
        L_0x009f:
            r8.f62992b = r10
        L_0x00a1:
            if (r6 != 0) goto L_0x00a7
            si0.y r8 = r0.f62946b
            if (r8 != 0) goto L_0x000f
        L_0x00a7:
            long r1 = r0.f62947c
            long r5 = (long) r5
            long r1 = r1 - r5
            r0.f62947c = r1
            if (r7 == 0) goto L_0x00b0
            goto L_0x00b1
        L_0x00b0:
            long r3 = -r3
        L_0x00b1:
            return r3
        L_0x00b2:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: si0.C24898f.mo61374A():long");
    }

    /* renamed from: A1 */
    public final String mo61375A1(Charset charset) {
        C24362h.m61211f(charset, "charset");
        return mo61376B(this.f62947c, charset);
    }

    /* renamed from: B */
    public final String mo61376B(long j, Charset charset) throws EOFException {
        boolean z;
        C24362h.m61211f(charset, "charset");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0 || j > ((long) Integer.MAX_VALUE)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(C0016g.m29l("byteCount: ", j).toString());
        } else if (this.f62947c < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            C24920y yVar = this.f62946b;
            C24362h.m61208c(yVar);
            int i2 = yVar.f62992b;
            if (((long) i2) + j > ((long) yVar.f62993c)) {
                return new String(mo61438y(j), charset);
            }
            int i3 = (int) j;
            String str = new String(yVar.f62991a, i2, i3, charset);
            int i4 = yVar.f62992b + i3;
            yVar.f62992b = i4;
            this.f62947c -= j;
            if (i4 == yVar.f62993c) {
                this.f62946b = yVar.mo61475a();
                C24921z.m62598a(yVar);
            }
            return str;
        }
    }

    /* renamed from: D */
    public final C24898f mo61377D() {
        return this;
    }

    /* renamed from: E */
    public final C24895d0 mo58974E() {
        return C24895d0.f62942d;
    }

    /* renamed from: E1 */
    public final /* bridge */ /* synthetic */ C24901h mo61378E1(long j) {
        mo61399X(j);
        return this;
    }

    /* renamed from: G1 */
    public final /* bridge */ /* synthetic */ C24901h mo61379G1(int i, int i2, String str) {
        mo61403b0(i, i2, str);
        return this;
    }

    /* renamed from: H */
    public final String mo61380H() {
        return mo61376B(this.f62947c, C25072a.f63272a);
    }

    /* renamed from: K */
    public final String mo61381K(long j) throws EOFException {
        return mo61376B(j, C25072a.f63272a);
    }

    /* renamed from: M */
    public final C24901h mo61382M() {
        return this;
    }

    /* renamed from: N */
    public final int mo61383N() throws EOFException {
        byte b;
        int i;
        byte b2;
        if (this.f62947c != 0) {
            byte v = mo61430v(0);
            int i2 = 1;
            if ((v & 128) == 0) {
                b2 = v & Byte.MAX_VALUE;
                i = 1;
                b = 0;
            } else if ((v & 224) == 192) {
                b2 = v & 31;
                i = 2;
                b = 128;
            } else if ((v & 240) == 224) {
                b2 = v & 15;
                i = 3;
                b = 2048;
            } else if ((v & 248) == 240) {
                b2 = v & 7;
                i = 4;
                b = 65536;
            } else {
                skip(1);
                return 65533;
            }
            long j = (long) i;
            if (this.f62947c >= j) {
                while (i2 < i) {
                    long j2 = (long) i2;
                    byte v2 = mo61430v(j2);
                    if ((v2 & 192) == 128) {
                        b2 = (b2 << 6) | (v2 & 63);
                        i2++;
                    } else {
                        skip(j2);
                        return 65533;
                    }
                }
                skip(j);
                if (b2 > 1114111) {
                    return 65533;
                }
                if ((55296 <= b2 && 57343 >= b2) || b2 < b) {
                    return 65533;
                }
                return b2;
            }
            StringBuilder r = C25541a.m63887r("size < ", i, ": ");
            r.append(this.f62947c);
            r.append(" (to read code point prefixed 0x");
            r.append(C17885a.m44391B0(v));
            r.append(')');
            throw new EOFException(r.toString());
        }
        throw new EOFException();
    }

    /* renamed from: N0 */
    public final void mo61384N0(long j) throws EOFException {
        if (this.f62947c < j) {
            throw new EOFException();
        }
    }

    /* renamed from: O */
    public final ByteString mo61385O() {
        boolean z;
        long j = this.f62947c;
        if (j <= ((long) Integer.MAX_VALUE)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return mo61388R((int) j);
        }
        StringBuilder k = C13555b.m33972k("size > Int.MAX_VALUE: ");
        k.append(this.f62947c);
        throw new IllegalStateException(k.toString().toString());
    }

    /* renamed from: O0 */
    public final /* bridge */ /* synthetic */ C24901h mo61386O0(long j) {
        mo61397W(j);
        return this;
    }

    /* renamed from: P */
    public final void mo58998P(C24898f fVar, long j) {
        boolean z;
        boolean z2;
        int i;
        C24920y yVar;
        boolean z3;
        C24920y yVar2;
        int i2;
        C24362h.m61211f(fVar, "source");
        if (fVar != this) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C17885a.m44460s(fVar.f62947c, 0, j);
            while (j > 0) {
                C24920y yVar3 = fVar.f62946b;
                C24362h.m61208c(yVar3);
                int i3 = yVar3.f62993c;
                C24920y yVar4 = fVar.f62946b;
                C24362h.m61208c(yVar4);
                if (j < ((long) (i3 - yVar4.f62992b))) {
                    C24920y yVar5 = this.f62946b;
                    if (yVar5 != null) {
                        yVar = yVar5.f62997g;
                    } else {
                        yVar = null;
                    }
                    if (yVar != null && yVar.f62995e) {
                        long j2 = ((long) yVar.f62993c) + j;
                        if (yVar.f62994d) {
                            i2 = 0;
                        } else {
                            i2 = yVar.f62992b;
                        }
                        if (j2 - ((long) i2) <= ((long) 8192)) {
                            C24920y yVar6 = fVar.f62946b;
                            C24362h.m61208c(yVar6);
                            yVar6.mo61478d(yVar, (int) j);
                            fVar.f62947c -= j;
                            this.f62947c += j;
                            return;
                        }
                    }
                    C24920y yVar7 = fVar.f62946b;
                    C24362h.m61208c(yVar7);
                    int i4 = (int) j;
                    if (i4 <= 0 || i4 > yVar7.f62993c - yVar7.f62992b) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        if (i4 >= 1024) {
                            yVar2 = yVar7.mo61477c();
                        } else {
                            yVar2 = C24921z.m62599b();
                            byte[] bArr = yVar7.f62991a;
                            byte[] bArr2 = yVar2.f62991a;
                            int i5 = yVar7.f62992b;
                            C21132f.m49429L0(0, bArr, i5, bArr2, i5 + i4);
                        }
                        yVar2.f62993c = yVar2.f62992b + i4;
                        yVar7.f62992b += i4;
                        C24920y yVar8 = yVar7.f62997g;
                        C24362h.m61208c(yVar8);
                        yVar8.mo61476b(yVar2);
                        fVar.f62946b = yVar2;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                C24920y yVar9 = fVar.f62946b;
                C24362h.m61208c(yVar9);
                long j3 = (long) (yVar9.f62993c - yVar9.f62992b);
                fVar.f62946b = yVar9.mo61475a();
                C24920y yVar10 = this.f62946b;
                if (yVar10 == null) {
                    this.f62946b = yVar9;
                    yVar9.f62997g = yVar9;
                    yVar9.f62996f = yVar9;
                } else {
                    C24920y yVar11 = yVar10.f62997g;
                    C24362h.m61208c(yVar11);
                    yVar11.mo61476b(yVar9);
                    C24920y yVar12 = yVar9.f62997g;
                    if (yVar12 != yVar9) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        C24362h.m61208c(yVar12);
                        if (yVar12.f62995e) {
                            int i6 = yVar9.f62993c - yVar9.f62992b;
                            C24920y yVar13 = yVar9.f62997g;
                            C24362h.m61208c(yVar13);
                            int i7 = 8192 - yVar13.f62993c;
                            C24920y yVar14 = yVar9.f62997g;
                            C24362h.m61208c(yVar14);
                            if (yVar14.f62994d) {
                                i = 0;
                            } else {
                                C24920y yVar15 = yVar9.f62997g;
                                C24362h.m61208c(yVar15);
                                i = yVar15.f62992b;
                            }
                            if (i6 <= i7 + i) {
                                C24920y yVar16 = yVar9.f62997g;
                                C24362h.m61208c(yVar16);
                                yVar9.mo61478d(yVar16, i6);
                                yVar9.mo61475a();
                                C24921z.m62598a(yVar9);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                fVar.f62947c -= j3;
                this.f62947c += j3;
                j -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    /* renamed from: Q */
    public final /* bridge */ /* synthetic */ C24901h mo61387Q(String str) {
        mo61404c0(str);
        return this;
    }

    /* renamed from: R */
    public final ByteString mo61388R(int i) {
        if (i == 0) {
            return ByteString.f62330d;
        }
        C17885a.m44460s(this.f62947c, 0, (long) i);
        C24920y yVar = this.f62946b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            C24362h.m61208c(yVar);
            int i5 = yVar.f62993c;
            int i6 = yVar.f62992b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                yVar = yVar.f62996f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[(i4 * 2)];
        C24920y yVar2 = this.f62946b;
        int i7 = 0;
        while (i2 < i) {
            C24362h.m61208c(yVar2);
            bArr[i7] = yVar2.f62991a;
            i2 += yVar2.f62993c - yVar2.f62992b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = yVar2.f62992b;
            yVar2.f62994d = true;
            i7++;
            yVar2 = yVar2.f62996f;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    /* renamed from: R0 */
    public final int mo61389R0(C24913t tVar) {
        C24362h.m61211f(tVar, "options");
        int b = C25014a.m62722b(this, tVar, false);
        if (b == -1) {
            return -1;
        }
        skip((long) tVar.f62974b[b].mo60873k());
        return b;
    }

    /* renamed from: R1 */
    public final /* bridge */ /* synthetic */ C24901h mo61390R1(ByteString byteString) {
        mo61393U(byteString);
        return this;
    }

    /* renamed from: S */
    public final C24920y mo61391S(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            C24920y yVar = this.f62946b;
            if (yVar == null) {
                C24920y b = C24921z.m62599b();
                this.f62946b = b;
                b.f62997g = b;
                b.f62996f = b;
                return b;
            }
            C24920y yVar2 = yVar.f62997g;
            C24362h.m61208c(yVar2);
            if (yVar2.f62993c + i <= 8192 && yVar2.f62995e) {
                return yVar2;
            }
            C24920y b2 = C24921z.m62599b();
            yVar2.mo61476b(b2);
            return b2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    /* renamed from: T */
    public final void mo61392T(int i, int i2, byte[] bArr) {
        C24362h.m61211f(bArr, "source");
        long j = (long) i2;
        C17885a.m44460s((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C24920y S = mo61391S(1);
            int min = Math.min(i3 - i, 8192 - S.f62993c);
            int i4 = i + min;
            C21132f.m49429L0(S.f62993c, bArr, i, S.f62991a, i4);
            S.f62993c += min;
            i = i4;
        }
        this.f62947c += j;
    }

    /* renamed from: U */
    public final void mo61393U(ByteString byteString) {
        C24362h.m61211f(byteString, "byteString");
        byteString.mo60883u(this, byteString.mo60873k());
    }

    /* renamed from: U1 */
    public final /* bridge */ /* synthetic */ C24901h mo61394U1(int i, int i2, byte[] bArr) {
        mo61392T(i, i2, bArr);
        return this;
    }

    /* renamed from: V */
    public final void mo61395V(int i) {
        C24920y S = mo61391S(1);
        byte[] bArr = S.f62991a;
        int i2 = S.f62993c;
        S.f62993c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f62947c++;
    }

    /* renamed from: V0 */
    public final ByteString mo61396V0(long j) throws EOFException {
        boolean z;
        if (j < 0 || j > ((long) Integer.MAX_VALUE)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(C0016g.m29l("byteCount: ", j).toString());
        } else if (this.f62947c < j) {
            throw new EOFException();
        } else if (j < ((long) 4096)) {
            return new ByteString(mo61438y(j));
        } else {
            ByteString R = mo61388R((int) j);
            skip(j);
            return R;
        }
    }

    /* renamed from: W */
    public final C24898f mo61397W(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            mo61395V(48);
        } else {
            boolean z = false;
            int i2 = 1;
            if (i < 0) {
                j = -j;
                if (j < 0) {
                    mo61404c0("-9223372036854775808");
                } else {
                    z = true;
                }
            }
            if (j < 100000000) {
                if (j < 10000) {
                    if (j < 100) {
                        if (j >= 10) {
                            i2 = 2;
                        }
                    } else if (j < 1000) {
                        i2 = 3;
                    } else {
                        i2 = 4;
                    }
                } else if (j < 1000000) {
                    if (j < 100000) {
                        i2 = 5;
                    } else {
                        i2 = 6;
                    }
                } else if (j < 10000000) {
                    i2 = 7;
                } else {
                    i2 = 8;
                }
            } else if (j < 1000000000000L) {
                if (j < 10000000000L) {
                    if (j < 1000000000) {
                        i2 = 9;
                    } else {
                        i2 = 10;
                    }
                } else if (j < 100000000000L) {
                    i2 = 11;
                } else {
                    i2 = 12;
                }
            } else if (j < 1000000000000000L) {
                if (j < 10000000000000L) {
                    i2 = 13;
                } else if (j < 100000000000000L) {
                    i2 = 14;
                } else {
                    i2 = 15;
                }
            } else if (j < 100000000000000000L) {
                if (j < 10000000000000000L) {
                    i2 = 16;
                } else {
                    i2 = 17;
                }
            } else if (j < 1000000000000000000L) {
                i2 = 18;
            } else {
                i2 = 19;
            }
            if (z) {
                i2++;
            }
            C24920y S = mo61391S(i2);
            byte[] bArr = S.f62991a;
            int i3 = S.f62993c + i2;
            while (j != 0) {
                long j2 = (long) 10;
                i3--;
                bArr[i3] = C25014a.f63182a[(int) (j % j2)];
                j /= j2;
            }
            if (z) {
                bArr[i3 - 1] = (byte) 45;
            }
            S.f62993c += i2;
            this.f62947c += (long) i2;
        }
        return this;
    }

    /* renamed from: W1 */
    public final long mo61398W1(C24898f fVar) throws IOException {
        long j = this.f62947c;
        if (j > 0) {
            fVar.mo58998P(this, j);
        }
        return j;
    }

    /* renamed from: X */
    public final C24898f mo61399X(long j) {
        if (j == 0) {
            mo61395V(48);
        } else {
            long j2 = (j >>> 1) | j;
            long j3 = j2 | (j2 >>> 2);
            long j4 = j3 | (j3 >>> 4);
            long j5 = j4 | (j4 >>> 8);
            long j6 = j5 | (j5 >>> 16);
            long j7 = j6 | (j6 >>> 32);
            long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
            long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
            long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
            long j11 = j10 + (j10 >>> 8);
            long j12 = j11 + (j11 >>> 16);
            int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            C24920y S = mo61391S(i);
            byte[] bArr = S.f62991a;
            int i2 = S.f62993c;
            for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
                bArr[i3] = C25014a.f63182a[(int) (15 & j)];
                j >>>= 4;
            }
            S.f62993c += i;
            this.f62947c += (long) i;
        }
        return this;
    }

    /* renamed from: Y */
    public final void mo61400Y(int i) {
        C24920y S = mo61391S(4);
        byte[] bArr = S.f62991a;
        int i2 = S.f62993c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        bArr[i5] = (byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        S.f62993c = i5 + 1;
        this.f62947c += 4;
    }

    /* renamed from: Z */
    public final void mo61401Z(int i) {
        C24920y S = mo61391S(2);
        byte[] bArr = S.f62991a;
        int i2 = S.f62993c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        bArr[i3] = (byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        S.f62993c = i3 + 1;
        this.f62947c += 2;
    }

    /* renamed from: a0 */
    public final C24898f mo61402a0(String str, int i, int i2, Charset charset) {
        boolean z;
        boolean z2;
        C24362h.m61211f(str, "string");
        C24362h.m61211f(charset, "charset");
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 > str.length()) {
                    z3 = false;
                }
                if (!z3) {
                    StringBuilder r = C25541a.m63887r("endIndex > string.length: ", i2, " > ");
                    r.append(str.length());
                    throw new IllegalArgumentException(r.toString().toString());
                } else if (C24362h.m61206a(charset, C25072a.f63272a)) {
                    mo61403b0(i, i2, str);
                    return this;
                } else {
                    String substring = str.substring(i, i2);
                    C24362h.m61210e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    byte[] bytes = substring.getBytes(charset);
                    C24362h.m61210e(bytes, "(this as java.lang.String).getBytes(charset)");
                    mo61392T(0, bytes.length, bytes);
                    return this;
                }
            } else {
                throw new IllegalArgumentException(C13715c.m34244j("endIndex < beginIndex: ", i2, " < ", i).toString());
            }
        } else {
            throw new IllegalArgumentException(C16759e.m42349e("beginIndex < 0: ", i).toString());
        }
    }

    /* renamed from: b0 */
    public final void mo61403b0(int i, int i2, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        char c;
        char charAt;
        C24362h.m61211f(str, "string");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= str.length()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            C24920y S = mo61391S(1);
                            byte[] bArr = S.f62991a;
                            int i3 = S.f62993c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                    int i5 = S.f62993c;
                                    int i6 = (i3 + i) - i5;
                                    S.f62993c = i5 + i6;
                                    this.f62947c += (long) i6;
                                } else {
                                    i4 = i + 1;
                                    bArr[i + i3] = (byte) charAt;
                                }
                            }
                            int i52 = S.f62993c;
                            int i62 = (i3 + i) - i52;
                            S.f62993c = i52 + i62;
                            this.f62947c += (long) i62;
                        } else {
                            if (charAt2 < 2048) {
                                C24920y S2 = mo61391S(2);
                                byte[] bArr2 = S2.f62991a;
                                int i7 = S2.f62993c;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                S2.f62993c = i7 + 2;
                                this.f62947c += 2;
                            } else if (charAt2 < 55296 || charAt2 > 57343) {
                                C24920y S3 = mo61391S(3);
                                byte[] bArr3 = S3.f62991a;
                                int i8 = S3.f62993c;
                                bArr3[i8] = (byte) ((charAt2 >> 12) | 224);
                                bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | RecyclerView.C1119a0.FLAG_IGNORE);
                                bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                                S3.f62993c = i8 + 3;
                                this.f62947c += 3;
                            } else {
                                int i9 = i + 1;
                                if (i9 < i2) {
                                    c = str.charAt(i9);
                                } else {
                                    c = 0;
                                }
                                if (charAt2 > 56319 || 56320 > c || 57343 < c) {
                                    mo61395V(63);
                                    i = i9;
                                } else {
                                    int i11 = (((charAt2 & 1023) << 10) | (c & 1023)) + SQLiteDatabase.OPEN_FULLMUTEX;
                                    C24920y S4 = mo61391S(4);
                                    byte[] bArr4 = S4.f62991a;
                                    int i12 = S4.f62993c;
                                    bArr4[i12] = (byte) ((i11 >> 18) | 240);
                                    bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
                                    bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
                                    bArr4[i12 + 3] = (byte) ((i11 & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
                                    S4.f62993c = i12 + 4;
                                    this.f62947c += 4;
                                    i += 2;
                                }
                            }
                            i++;
                        }
                    }
                    return;
                }
                StringBuilder r = C25541a.m63887r("endIndex > string.length: ", i2, " > ");
                r.append(str.length());
                throw new IllegalArgumentException(r.toString().toString());
            }
            throw new IllegalArgumentException(C13715c.m34244j("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        throw new IllegalArgumentException(C16759e.m42349e("beginIndex < 0: ", i).toString());
    }

    /* renamed from: c0 */
    public final void mo61404c0(String str) {
        C24362h.m61211f(str, "string");
        mo61403b0(0, str.length(), str);
    }

    public final void close() {
    }

    /* renamed from: d0 */
    public final void mo61406d0(int i) {
        String str;
        if (i < 128) {
            mo61395V(i);
        } else if (i < 2048) {
            C24920y S = mo61391S(2);
            byte[] bArr = S.f62991a;
            int i2 = S.f62993c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
            S.f62993c = i2 + 2;
            this.f62947c += 2;
        } else if (55296 <= i && 57343 >= i) {
            mo61395V(63);
        } else if (i < 65536) {
            C24920y S2 = mo61391S(3);
            byte[] bArr2 = S2.f62991a;
            int i3 = S2.f62993c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
            bArr2[i3 + 2] = (byte) ((i & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
            S2.f62993c = i3 + 3;
            this.f62947c += 3;
        } else if (i <= 1114111) {
            C24920y S3 = mo61391S(4);
            byte[] bArr3 = S3.f62991a;
            int i4 = S3.f62993c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
            bArr3[i4 + 3] = (byte) ((i & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
            S3.f62993c = i4 + 4;
            this.f62947c += 4;
        } else {
            StringBuilder k = C13555b.m33972k("Unexpected code point: 0x");
            if (i != 0) {
                char[] cArr = C14226d.f35757l;
                int i5 = 0;
                char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
                while (i5 < 8 && cArr2[i5] == '0') {
                    i5++;
                }
                str = new String(cArr2, i5, 8 - i5);
            } else {
                str = "0";
            }
            k.append(str);
            throw new IllegalArgumentException(k.toString());
        }
    }

    /* JADX WARNING: type inference failed for: r21v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x000b
        L_0x0008:
            r2 = 1
            goto L_0x0078
        L_0x000b:
            boolean r4 = r1 instanceof si0.C24898f
            if (r4 != 0) goto L_0x0011
            goto L_0x0078
        L_0x0011:
            long r4 = r0.f62947c
            si0.f r1 = (si0.C24898f) r1
            long r6 = r1.f62947c
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x001c
            goto L_0x0078
        L_0x001c:
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0023
            goto L_0x0008
        L_0x0023:
            si0.y r4 = r0.f62946b
            mf0.C24362h.m61208c(r4)
            si0.y r1 = r1.f62946b
            mf0.C24362h.m61208c(r1)
            int r5 = r4.f62992b
            int r8 = r1.f62992b
            r9 = r6
        L_0x0032:
            long r11 = r0.f62947c
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0008
            int r11 = r4.f62993c
            int r11 = r11 - r5
            int r12 = r1.f62993c
            int r12 = r12 - r8
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r6
        L_0x0044:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x0060
            byte[] r15 = r4.f62991a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f62991a
            int r17 = r8 + 1
            byte r8 = r15[r8]
            if (r5 == r8) goto L_0x0057
            goto L_0x0078
        L_0x0057:
            r18 = 1
            long r13 = r13 + r18
            r5 = r16
            r8 = r17
            goto L_0x0044
        L_0x0060:
            int r13 = r4.f62993c
            if (r5 != r13) goto L_0x006b
            si0.y r4 = r4.f62996f
            mf0.C24362h.m61208c(r4)
            int r5 = r4.f62992b
        L_0x006b:
            int r13 = r1.f62993c
            if (r8 != r13) goto L_0x0076
            si0.y r1 = r1.f62996f
            mf0.C24362h.m61208c(r1)
            int r8 = r1.f62992b
        L_0x0076:
            long r9 = r9 + r11
            goto L_0x0032
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: si0.C24898f.equals(java.lang.Object):boolean");
    }

    /* renamed from: f1 */
    public final byte[] mo61408f1() {
        return mo61438y(this.f62947c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        if (r8 != r9) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        r15.f62946b = r6.mo61475a();
        si0.C24921z.m62598a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        r6.f62992b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        if (r1 != false) goto L_0x00a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0076 A[SYNTHETIC] */
    /* renamed from: f2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo61409f2() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.f62947c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00a8
            r0 = 0
            r1 = 0
            r4 = r2
        L_0x000b:
            si0.y r6 = r15.f62946b
            mf0.C24362h.m61208c(r6)
            byte[] r7 = r6.f62991a
            int r8 = r6.f62992b
            int r9 = r6.f62993c
        L_0x0016:
            if (r8 >= r9) goto L_0x008d
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0027
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0027
            int r11 = r10 - r11
            goto L_0x0040
        L_0x0027:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0032
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0032
            goto L_0x003c
        L_0x0032:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0072
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0072
        L_0x003c:
            int r11 = r10 - r11
            int r11 = r11 + 10
        L_0x0040:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x0050
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0016
        L_0x0050:
            si0.f r0 = new si0.f
            r0.<init>()
            r0.mo61399X(r4)
            r0.mo61395V(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            java.lang.String r0 = r0.mo61380H()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0072:
            if (r0 == 0) goto L_0x0076
            r1 = 1
            goto L_0x008d
        L_0x0076:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            java.lang.String r2 = p584jl.C17885a.m44391B0(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008d:
            if (r8 != r9) goto L_0x0099
            si0.y r7 = r6.mo61475a()
            r15.f62946b = r7
            si0.C24921z.m62598a(r6)
            goto L_0x009b
        L_0x0099:
            r6.f62992b = r8
        L_0x009b:
            if (r1 != 0) goto L_0x00a1
            si0.y r6 = r15.f62946b
            if (r6 != 0) goto L_0x000b
        L_0x00a1:
            long r1 = r15.f62947c
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f62947c = r1
            return r4
        L_0x00a8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: si0.C24898f.mo61409f2():long");
    }

    public final void flush() {
    }

    public final C24898f getBuffer() {
        return this;
    }

    /* renamed from: h2 */
    public final InputStream mo61411h2() {
        return new C24899a(this);
    }

    public final int hashCode() {
        C24920y yVar = this.f62946b;
        if (yVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = yVar.f62993c;
            for (int i3 = yVar.f62992b; i3 < i2; i3++) {
                i = (i * 31) + yVar.f62991a[i3];
            }
            yVar = yVar.f62996f;
            C24362h.m61208c(yVar);
        } while (yVar != this.f62946b);
        return i;
    }

    /* renamed from: i */
    public final void mo61413i() {
        skip(this.f62947c);
    }

    public final boolean isOpen() {
        return true;
    }

    /* renamed from: l1 */
    public final boolean mo61415l1() {
        return this.f62947c == 0;
    }

    /* renamed from: m */
    public final long mo53601m(C24898f fVar, long j) {
        boolean z;
        C24362h.m61211f(fVar, "sink");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j2 = this.f62947c;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            fVar.mo58998P(this, j);
            return j;
        }
        throw new IllegalArgumentException(C0016g.m29l("byteCount < 0: ", j).toString());
    }

    /* renamed from: q */
    public final C24898f clone() {
        C24898f fVar = new C24898f();
        if (this.f62947c != 0) {
            C24920y yVar = this.f62946b;
            C24362h.m61208c(yVar);
            C24920y c = yVar.mo61477c();
            fVar.f62946b = c;
            c.f62997g = c;
            c.f62996f = c;
            for (C24920y yVar2 = yVar.f62996f; yVar2 != yVar; yVar2 = yVar2.f62996f) {
                C24920y yVar3 = c.f62997g;
                C24362h.m61208c(yVar3);
                C24362h.m61208c(yVar2);
                yVar3.mo61476b(yVar2.mo61477c());
            }
            fVar.f62947c = this.f62947c;
        }
        return fVar;
    }

    /* renamed from: q1 */
    public final long mo61417q1(C24893c0 c0Var) throws IOException {
        C24362h.m61211f(c0Var, "source");
        long j = 0;
        while (true) {
            long m = c0Var.mo53601m(this, (long) 8192);
            if (m == -1) {
                return j;
            }
            j += m;
        }
    }

    /* renamed from: r */
    public final long mo61418r() {
        long j = this.f62947c;
        if (j == 0) {
            return 0;
        }
        C24920y yVar = this.f62946b;
        C24362h.m61208c(yVar);
        C24920y yVar2 = yVar.f62997g;
        C24362h.m61208c(yVar2);
        int i = yVar2.f62993c;
        if (i < 8192 && yVar2.f62995e) {
            j -= (long) (i - yVar2.f62992b);
        }
        return j;
    }

    public final int read(ByteBuffer byteBuffer) throws IOException {
        C24362h.m61211f(byteBuffer, "sink");
        C24920y yVar = this.f62946b;
        if (yVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), yVar.f62993c - yVar.f62992b);
        byteBuffer.put(yVar.f62991a, yVar.f62992b, min);
        int i = yVar.f62992b + min;
        yVar.f62992b = i;
        this.f62947c -= (long) min;
        if (i == yVar.f62993c) {
            this.f62946b = yVar.mo61475a();
            C24921z.m62598a(yVar);
        }
        return min;
    }

    public final byte readByte() throws EOFException {
        if (this.f62947c != 0) {
            C24920y yVar = this.f62946b;
            C24362h.m61208c(yVar);
            int i = yVar.f62992b;
            int i2 = yVar.f62993c;
            int i3 = i + 1;
            byte b = yVar.f62991a[i];
            this.f62947c--;
            if (i3 == i2) {
                this.f62946b = yVar.mo61475a();
                C24921z.m62598a(yVar);
            } else {
                yVar.f62992b = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    public final int readInt() throws EOFException {
        if (this.f62947c >= 4) {
            C24920y yVar = this.f62946b;
            C24362h.m61208c(yVar);
            int i = yVar.f62992b;
            int i2 = yVar.f62993c;
            if (((long) (i2 - i)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = yVar.f62991a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            this.f62947c -= 4;
            if (i6 == i2) {
                this.f62946b = yVar.mo61475a();
                C24921z.m62598a(yVar);
            } else {
                yVar.f62992b = i6;
            }
            return b3;
        }
        throw new EOFException();
    }

    public final short readShort() throws EOFException {
        if (this.f62947c >= 2) {
            C24920y yVar = this.f62946b;
            C24362h.m61208c(yVar);
            int i = yVar.f62992b;
            int i2 = yVar.f62993c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = yVar.f62991a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f62947c -= 2;
            if (i4 == i2) {
                this.f62946b = yVar.mo61475a();
                C24921z.m62598a(yVar);
            } else {
                yVar.f62992b = i4;
            }
            return (short) b;
        }
        throw new EOFException();
    }

    /* renamed from: s */
    public final long mo61424s(ByteString byteString) {
        C24362h.m61211f(byteString, "targetBytes");
        return mo61437x(byteString, 0);
    }

    public final void skip(long j) throws EOFException {
        while (j > 0) {
            C24920y yVar = this.f62946b;
            if (yVar != null) {
                int min = (int) Math.min(j, (long) (yVar.f62993c - yVar.f62992b));
                long j2 = (long) min;
                this.f62947c -= j2;
                j -= j2;
                int i = yVar.f62992b + min;
                yVar.f62992b = i;
                if (i == yVar.f62993c) {
                    this.f62946b = yVar.mo61475a();
                    C24921z.m62598a(yVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: t */
    public final void mo61426t(C24898f fVar, long j, long j2) {
        C24362h.m61211f(fVar, "out");
        C17885a.m44460s(this.f62947c, j, j2);
        if (j2 != 0) {
            fVar.f62947c += j2;
            C24920y yVar = this.f62946b;
            while (true) {
                C24362h.m61208c(yVar);
                long j3 = (long) (yVar.f62993c - yVar.f62992b);
                if (j < j3) {
                    break;
                }
                j -= j3;
                yVar = yVar.f62996f;
            }
            while (j2 > 0) {
                C24362h.m61208c(yVar);
                C24920y c = yVar.mo61477c();
                int i = c.f62992b + ((int) j);
                c.f62992b = i;
                c.f62993c = Math.min(i + ((int) j2), c.f62993c);
                C24920y yVar2 = fVar.f62946b;
                if (yVar2 == null) {
                    c.f62997g = c;
                    c.f62996f = c;
                    fVar.f62946b = c;
                } else {
                    C24920y yVar3 = yVar2.f62997g;
                    C24362h.m61208c(yVar3);
                    yVar3.mo61476b(c);
                }
                j2 -= (long) (c.f62993c - c.f62992b);
                yVar = yVar.f62996f;
                j = 0;
            }
        }
    }

    /* renamed from: t0 */
    public final boolean mo61427t0(long j) {
        return this.f62947c >= j;
    }

    public final String toString() {
        return mo61385O().toString();
    }

    /* renamed from: u */
    public final String mo61429u(long j) throws EOFException {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long w = mo61431w(b, 0, j2);
            if (w != -1) {
                return C25014a.m62721a(this, w);
            }
            if (j2 < this.f62947c && mo61430v(j2 - 1) == ((byte) 13) && mo61430v(j2) == b) {
                return C25014a.m62721a(this, j2);
            }
            C24898f fVar = new C24898f();
            mo61426t(fVar, 0, Math.min((long) 32, this.f62947c));
            StringBuilder k = C13555b.m33972k("\\n not found: limit=");
            k.append(Math.min(this.f62947c, j));
            k.append(" content=");
            k.append(fVar.mo61439z().mo60874l());
            k.append(8230);
            throw new EOFException(k.toString());
        }
        throw new IllegalArgumentException(C0016g.m29l("limit < 0: ", j).toString());
    }

    /* renamed from: v */
    public final byte mo61430v(long j) {
        C17885a.m44460s(this.f62947c, j, 1);
        C24920y yVar = this.f62946b;
        if (yVar != null) {
            long j2 = this.f62947c;
            if (j2 - j < j) {
                while (j2 > j) {
                    yVar = yVar.f62997g;
                    C24362h.m61208c(yVar);
                    j2 -= (long) (yVar.f62993c - yVar.f62992b);
                }
                return yVar.f62991a[(int) ((((long) yVar.f62992b) + j) - j2)];
            }
            long j3 = 0;
            while (true) {
                int i = yVar.f62993c;
                int i2 = yVar.f62992b;
                long j4 = ((long) (i - i2)) + j3;
                if (j4 > j) {
                    return yVar.f62991a[(int) ((((long) i2) + j) - j3)];
                }
                yVar = yVar.f62996f;
                C24362h.m61208c(yVar);
                j3 = j4;
            }
        } else {
            C24362h.m61208c((Object) null);
            throw null;
        }
    }

    /* renamed from: w */
    public final long mo61431w(byte b, long j, long j2) {
        boolean z;
        C24920y yVar;
        long j3 = 0;
        if (0 <= j && j2 >= j) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j4 = this.f62947c;
            if (j2 > j4) {
                j2 = j4;
            }
            if (!(j == j2 || (yVar = this.f62946b) == null)) {
                if (j4 - j < j) {
                    while (j4 > j) {
                        yVar = yVar.f62997g;
                        C24362h.m61208c(yVar);
                        j4 -= (long) (yVar.f62993c - yVar.f62992b);
                    }
                    while (j4 < j2) {
                        byte[] bArr = yVar.f62991a;
                        int min = (int) Math.min((long) yVar.f62993c, (((long) yVar.f62992b) + j2) - j4);
                        for (int i = (int) ((((long) yVar.f62992b) + j) - j4); i < min; i++) {
                            if (bArr[i] == b) {
                                return ((long) (i - yVar.f62992b)) + j4;
                            }
                        }
                        j4 += (long) (yVar.f62993c - yVar.f62992b);
                        yVar = yVar.f62996f;
                        C24362h.m61208c(yVar);
                        j = j4;
                    }
                } else {
                    while (true) {
                        long j5 = ((long) (yVar.f62993c - yVar.f62992b)) + j3;
                        if (j5 > j) {
                            break;
                        }
                        yVar = yVar.f62996f;
                        C24362h.m61208c(yVar);
                        j3 = j5;
                    }
                    while (j3 < j2) {
                        byte[] bArr2 = yVar.f62991a;
                        int min2 = (int) Math.min((long) yVar.f62993c, (((long) yVar.f62992b) + j2) - j3);
                        for (int i2 = (int) ((((long) yVar.f62992b) + j) - j3); i2 < min2; i2++) {
                            if (bArr2[i2] == b) {
                                return ((long) (i2 - yVar.f62992b)) + j3;
                            }
                        }
                        j3 += (long) (yVar.f62993c - yVar.f62992b);
                        yVar = yVar.f62996f;
                        C24362h.m61208c(yVar);
                        j = j3;
                    }
                }
            }
            return -1;
        }
        StringBuilder k = C13555b.m33972k("size=");
        k.append(this.f62947c);
        k.append(" fromIndex=");
        k.append(j);
        k.append(" toIndex=");
        k.append(j2);
        throw new IllegalArgumentException(k.toString().toString());
    }

    public final C24901h write(byte[] bArr) {
        C24362h.m61211f(bArr, "source");
        mo61392T(0, bArr.length, bArr);
        return this;
    }

    public final /* bridge */ /* synthetic */ C24901h writeByte(int i) {
        mo61395V(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ C24901h writeInt(int i) {
        mo61400Y(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ C24901h writeShort(int i) {
        mo61401Z(i);
        return this;
    }

    /* renamed from: x */
    public final long mo61437x(ByteString byteString, long j) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        ByteString byteString2 = byteString;
        long j2 = j;
        C24362h.m61211f(byteString2, "targetBytes");
        long j3 = 0;
        if (j2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C24920y yVar = this.f62946b;
            if (yVar == null) {
                return -1;
            }
            long j4 = this.f62947c;
            if (j4 - j2 < j2) {
                while (j4 > j2) {
                    yVar = yVar.f62997g;
                    C24362h.m61208c(yVar);
                    j4 -= (long) (yVar.f62993c - yVar.f62992b);
                }
                if (byteString.mo60873k() == 2) {
                    byte n = byteString2.mo60876n(0);
                    byte n2 = byteString2.mo60876n(1);
                    while (j4 < this.f62947c) {
                        byte[] bArr = yVar.f62991a;
                        i3 = (int) ((((long) yVar.f62992b) + j2) - j4);
                        int i5 = yVar.f62993c;
                        while (i3 < i5) {
                            byte b = bArr[i3];
                            if (b == n || b == n2) {
                                i4 = yVar.f62992b;
                            } else {
                                i3++;
                            }
                        }
                        j4 += (long) (yVar.f62993c - yVar.f62992b);
                        yVar = yVar.f62996f;
                        C24362h.m61208c(yVar);
                        j2 = j4;
                    }
                    return -1;
                }
                byte[] m = byteString.mo60875m();
                while (j4 < this.f62947c) {
                    byte[] bArr2 = yVar.f62991a;
                    int i6 = (int) ((((long) yVar.f62992b) + j2) - j4);
                    int i7 = yVar.f62993c;
                    while (i3 < i7) {
                        byte b2 = bArr2[i3];
                        int length = m.length;
                        int i8 = 0;
                        while (i8 < length) {
                            if (b2 == m[i8]) {
                                i4 = yVar.f62992b;
                            } else {
                                i8++;
                            }
                        }
                        i6 = i3 + 1;
                    }
                    j4 += (long) (yVar.f62993c - yVar.f62992b);
                    yVar = yVar.f62996f;
                    C24362h.m61208c(yVar);
                    j2 = j4;
                }
                return -1;
                return ((long) (i3 - i4)) + j4;
            }
            while (true) {
                long j5 = ((long) (yVar.f62993c - yVar.f62992b)) + j3;
                if (j5 > j2) {
                    break;
                }
                yVar = yVar.f62996f;
                C24362h.m61208c(yVar);
                j3 = j5;
            }
            if (byteString.mo60873k() == 2) {
                byte n3 = byteString2.mo60876n(0);
                byte n4 = byteString2.mo60876n(1);
                while (j3 < this.f62947c) {
                    byte[] bArr3 = yVar.f62991a;
                    i = (int) ((((long) yVar.f62992b) + j2) - j3);
                    int i9 = yVar.f62993c;
                    while (i < i9) {
                        byte b3 = bArr3[i];
                        if (b3 == n3 || b3 == n4) {
                            i2 = yVar.f62992b;
                        } else {
                            i++;
                        }
                    }
                    j3 += (long) (yVar.f62993c - yVar.f62992b);
                    yVar = yVar.f62996f;
                    C24362h.m61208c(yVar);
                    j2 = j3;
                }
                return -1;
            }
            byte[] m2 = byteString.mo60875m();
            while (j3 < this.f62947c) {
                byte[] bArr4 = yVar.f62991a;
                int i11 = (int) ((((long) yVar.f62992b) + j2) - j3);
                int i12 = yVar.f62993c;
                while (i < i12) {
                    byte b4 = bArr4[i];
                    int length2 = m2.length;
                    int i13 = 0;
                    while (i13 < length2) {
                        if (b4 == m2[i13]) {
                            i2 = yVar.f62992b;
                        } else {
                            i13++;
                        }
                    }
                    i11 = i + 1;
                }
                j3 += (long) (yVar.f62993c - yVar.f62992b);
                yVar = yVar.f62996f;
                C24362h.m61208c(yVar);
                j2 = j3;
            }
            return -1;
            return ((long) (i - i2)) + j3;
        }
        throw new IllegalArgumentException(C0016g.m29l("fromIndex < 0: ", j2).toString());
    }

    /* renamed from: y */
    public final byte[] mo61438y(long j) throws EOFException {
        boolean z;
        int i = 0;
        if (j < 0 || j > ((long) Integer.MAX_VALUE)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(C0016g.m29l("byteCount: ", j).toString());
        } else if (this.f62947c >= j) {
            int i2 = (int) j;
            byte[] bArr = new byte[i2];
            while (i < i2) {
                int read = read(bArr, i, i2 - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: z */
    public final ByteString mo61439z() {
        return mo61396V0(this.f62947c);
    }

    /* renamed from: z0 */
    public final String mo61440z0() throws EOFException {
        return mo61429u(Long.MAX_VALUE);
    }

    /* renamed from: si0.f$a */
    public static final class C24899a extends InputStream {

        /* renamed from: b */
        public final /* synthetic */ C24898f f62948b;

        public C24899a(C24898f fVar) {
            this.f62948b = fVar;
        }

        public final int available() {
            return (int) Math.min(this.f62948b.f62947c, (long) Integer.MAX_VALUE);
        }

        public final void close() {
        }

        public final int read() {
            C24898f fVar = this.f62948b;
            if (fVar.f62947c > 0) {
                return fVar.readByte() & 255;
            }
            return -1;
        }

        public final String toString() {
            return this.f62948b + ".inputStream()";
        }

        public final int read(byte[] bArr, int i, int i2) {
            C24362h.m61211f(bArr, "sink");
            return this.f62948b.read(bArr, i, i2);
        }
    }

    public final int write(ByteBuffer byteBuffer) throws IOException {
        C24362h.m61211f(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C24920y S = mo61391S(1);
            int min = Math.min(i, 8192 - S.f62993c);
            byteBuffer.get(S.f62991a, S.f62993c, min);
            i -= min;
            S.f62993c += min;
        }
        this.f62947c += (long) remaining;
        return remaining;
    }

    public final int read(byte[] bArr, int i, int i2) {
        C24362h.m61211f(bArr, "sink");
        C17885a.m44460s((long) bArr.length, (long) i, (long) i2);
        C24920y yVar = this.f62946b;
        if (yVar == null) {
            return -1;
        }
        int min = Math.min(i2, yVar.f62993c - yVar.f62992b);
        byte[] bArr2 = yVar.f62991a;
        int i3 = yVar.f62992b;
        C21132f.m49429L0(i, bArr2, i3, bArr, i3 + min);
        int i4 = yVar.f62992b + min;
        yVar.f62992b = i4;
        this.f62947c -= (long) min;
        if (i4 != yVar.f62993c) {
            return min;
        }
        this.f62946b = yVar.mo61475a();
        C24921z.m62598a(yVar);
        return min;
    }
}
