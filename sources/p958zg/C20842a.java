package p958zg;

import p043ch.C13830a;

/* renamed from: zg.a */
public final class C20842a extends C20847f {

    /* renamed from: c */
    public final short f52562c;

    /* renamed from: d */
    public final short f52563d;

    public C20842a(C20847f fVar, int i, int i2) {
        super(fVar);
        this.f52562c = (short) i;
        this.f52563d = (short) i2;
    }

    /* renamed from: a */
    public final void mo52965a(C13830a aVar, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.f52563d;
            if (i < s) {
                if (i == 0 || (i == 31 && s <= 62)) {
                    aVar.mo40756b(31, 5);
                    short s2 = this.f52563d;
                    if (s2 > 62) {
                        aVar.mo40756b(s2 - 31, 16);
                    } else if (i == 0) {
                        aVar.mo40756b(Math.min(s2, 31), 5);
                    } else {
                        aVar.mo40756b(s2 - 31, 5);
                    }
                }
                aVar.mo40756b(bArr[this.f52562c + i], 8);
                i++;
            } else {
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.f52562c);
        sb.append("::");
        sb.append((this.f52562c + this.f52563d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
