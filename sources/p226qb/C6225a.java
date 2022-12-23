package p226qb;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.appboy.support.ValidationUtils;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import p126ib.C5332a;
import p126ib.C5334b;
import p126ib.C5336d;
import p277ub.C6774a0;
import p277ub.C6803r;
import p624ld.C18187b;

/* renamed from: qb.a */
public final class C6225a extends C5334b {

    /* renamed from: m */
    public final C6803r f19657m = new C6803r();

    /* renamed from: n */
    public final boolean f19658n;

    /* renamed from: o */
    public final int f19659o;

    /* renamed from: p */
    public final int f19660p;

    /* renamed from: q */
    public final String f19661q;

    /* renamed from: r */
    public final float f19662r;

    /* renamed from: s */
    public final int f19663s;

    public C6225a(List<byte[]> list) {
        boolean z = false;
        String str = "sans-serif";
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f19659o = bArr[24];
            this.f19660p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f19661q = "Serif".equals(C6774a0.m15951k(43, bArr.length - 43, bArr)) ? "serif" : str;
            int i = bArr[25] * 20;
            this.f19663s = i;
            z = (bArr[0] & 32) != 0 ? true : z;
            this.f19658n = z;
            if (z) {
                this.f19662r = C6774a0.m15946f(((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i), BitmapDescriptorFactory.HUE_RED, 0.95f);
            } else {
                this.f19662r = 0.85f;
            }
        } else {
            this.f19659o = 0;
            this.f19660p = -1;
            this.f19661q = str;
            this.f19658n = false;
            this.f19662r = 0.85f;
            this.f19663s = -1;
        }
    }

    /* renamed from: h */
    public static void m14806h(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z3 = true;
            if ((i & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z3 = false;
            }
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z3 && !z && !z2) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* renamed from: g */
    public final C5336d mo21119g(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        int i3;
        this.f19657m.mo23005x(i, bArr);
        C6803r rVar = this.f19657m;
        int i4 = 1;
        if (rVar.f21040c - rVar.f21039b >= 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int u = rVar.mo23002u();
            int i5 = 8;
            if (u == 0) {
                str = "";
            } else {
                int i6 = rVar.f21040c;
                int i7 = rVar.f21039b;
                if (i6 - i7 >= 2) {
                    byte[] bArr2 = rVar.f21038a;
                    char c = (char) ((bArr2[i7 + 1] & 255) | ((bArr2[i7] & 255) << 8));
                    if (c == 65279 || c == 65534) {
                        str = rVar.mo22995n(u, C18187b.f46431e);
                    }
                }
                str = rVar.mo22995n(u, C18187b.f46429c);
            }
            if (str.isEmpty()) {
                return C6226b.f19664c;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            m14806h(spannableStringBuilder, this.f19659o, 0, 0, spannableStringBuilder.length(), 16711680);
            int i8 = this.f19660p;
            int length = spannableStringBuilder.length();
            if (i8 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan((i8 >>> 8) | ((i8 & ValidationUtils.APPBOY_STRING_MAX_LENGTH) << 24)), 0, length, 16711713);
            }
            String str2 = this.f19661q;
            int length2 = spannableStringBuilder.length();
            if (str2 != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str2), 0, length2, 16711713);
            }
            float f = this.f19662r;
            while (true) {
                C6803r rVar2 = this.f19657m;
                int i9 = rVar2.f21040c;
                int i11 = rVar2.f21039b;
                if (i9 - i11 >= i5) {
                    int c2 = rVar2.mo22984c();
                    int c3 = this.f19657m.mo22984c();
                    if (c3 == 1937013100) {
                        C6803r rVar3 = this.f19657m;
                        if (rVar3.f21040c - rVar3.f21039b >= 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            int u2 = rVar3.mo23002u();
                            int i12 = 0;
                            while (i12 < u2) {
                                C6803r rVar4 = this.f19657m;
                                if (rVar4.f21040c - rVar4.f21039b >= 12) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    int u3 = rVar4.mo23002u();
                                    int u4 = rVar4.mo23002u();
                                    rVar4.mo22981A(2);
                                    int p = rVar4.mo22997p();
                                    rVar4.mo22981A(i4);
                                    int c4 = rVar4.mo22984c();
                                    if (u4 > spannableStringBuilder.length()) {
                                        spannableStringBuilder.length();
                                        u4 = spannableStringBuilder.length();
                                    }
                                    int i13 = u4;
                                    if (u3 >= i13) {
                                        i3 = i12;
                                        i2 = u2;
                                    } else {
                                        int i14 = c4;
                                        int i15 = p;
                                        int i16 = this.f19659o;
                                        int i17 = u3;
                                        i3 = i12;
                                        i2 = u2;
                                        m14806h(spannableStringBuilder, i15, i16, u3, i13, 0);
                                        if (i14 != this.f19660p) {
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan((i14 >>> 8) | ((i14 & ValidationUtils.APPBOY_STRING_MAX_LENGTH) << 24)), i17, i13, 33);
                                        }
                                    }
                                    i12 = i3 + 1;
                                    u2 = i2;
                                    i4 = 1;
                                } else {
                                    throw new SubtitleDecoderException("Unexpected subtitle format.");
                                }
                            }
                            continue;
                        } else {
                            throw new SubtitleDecoderException("Unexpected subtitle format.");
                        }
                    } else if (c3 == 1952608120 && this.f19658n) {
                        C6803r rVar5 = this.f19657m;
                        if (rVar5.f21040c - rVar5.f21039b >= 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            f = C6774a0.m15946f(((float) rVar5.mo23002u()) / ((float) this.f19663s), BitmapDescriptorFactory.HUE_RED, 0.95f);
                        } else {
                            throw new SubtitleDecoderException("Unexpected subtitle format.");
                        }
                    }
                    this.f19657m.mo23007z(i11 + c2);
                    i4 = 1;
                    i5 = 8;
                } else {
                    C5332a.C5333a aVar = new C5332a.C5333a();
                    aVar.f17606a = spannableStringBuilder;
                    aVar.f17610e = f;
                    aVar.f17611f = 0;
                    aVar.f17612g = 0;
                    return new C6226b(aVar.mo21116a());
                }
            }
        } else {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }
}
