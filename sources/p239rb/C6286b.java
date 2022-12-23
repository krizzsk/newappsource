package p239rb;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import p126ib.C5332a;
import p126ib.C5334b;
import p126ib.C5336d;
import p239rb.C6291g;
import p277ub.C6774a0;
import p277ub.C6803r;

/* renamed from: rb.b */
public final class C6286b extends C5334b {

    /* renamed from: m */
    public final C6803r f19878m = new C6803r();

    /* renamed from: g */
    public final C5336d mo21119g(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        C5332a aVar;
        this.f19878m.mo23005x(i, bArr);
        ArrayList arrayList = new ArrayList();
        while (true) {
            C6803r rVar = this.f19878m;
            int i2 = rVar.f21040c - rVar.f21039b;
            if (i2 <= 0) {
                return new C6287c(arrayList);
            }
            if (i2 >= 8) {
                int c = rVar.mo22984c();
                if (this.f19878m.mo22984c() == 1987343459) {
                    C6803r rVar2 = this.f19878m;
                    int i3 = c - 8;
                    CharSequence charSequence = null;
                    C5332a.C5333a aVar2 = null;
                    while (i3 > 0) {
                        if (i3 >= 8) {
                            int c2 = rVar2.mo22984c();
                            int c3 = rVar2.mo22984c();
                            int i4 = c2 - 8;
                            String k = C6774a0.m15951k(rVar2.f21039b, i4, rVar2.f21038a);
                            rVar2.mo22981A(i4);
                            i3 = (i3 - 8) - i4;
                            if (c3 == 1937011815) {
                                C6291g.C6295d dVar = new C6291g.C6295d();
                                C6291g.m14896e(k, dVar);
                                aVar2 = dVar.mo22276a();
                            } else if (c3 == 1885436268) {
                                charSequence = C6291g.m14897f((String) null, k.trim(), Collections.emptyList());
                            }
                        } else {
                            throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
                        }
                    }
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    if (aVar2 != null) {
                        aVar2.f17606a = charSequence;
                        aVar = aVar2.mo21116a();
                    } else {
                        Pattern pattern = C6291g.f19900a;
                        C6291g.C6295d dVar2 = new C6291g.C6295d();
                        dVar2.f19915c = charSequence;
                        aVar = dVar2.mo22276a().mo21116a();
                    }
                    arrayList.add(aVar);
                } else {
                    this.f19878m.mo22981A(c - 8);
                }
            } else {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
    }
}
