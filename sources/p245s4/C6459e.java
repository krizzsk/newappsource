package p245s4;

import java.util.ArrayList;
import java.util.HashMap;
import p043ch.qos.logback.core.pattern.parser.TokenStream;
import p043ch.qos.logback.core.spi.ScanException;
import p232r4.C6244d;
import p232r4.C6245e;
import p232r4.C6249i;
import p258t4.C6589c;
import p271u4.C6693d;
import p358af.C13437d;

/* renamed from: s4.e */
public final class C6459e<E> extends C6693d {

    /* renamed from: g */
    public static final HashMap f20174g;

    /* renamed from: e */
    public final ArrayList f20175e;

    /* renamed from: f */
    public int f20176f = 0;

    static {
        HashMap hashMap = new HashMap();
        f20174g = hashMap;
        hashMap.put("BARE", C6245e.class.getName());
        hashMap.put("replace", C6249i.class.getName());
    }

    public C6459e(String str) throws ScanException {
        C6589c cVar = new C6589c();
        try {
            this.f20175e = new TokenStream(str, cVar).mo6680b();
        } catch (IllegalArgumentException e) {
            throw new ScanException(e);
        }
    }

    /* renamed from: p */
    public static void m15348p(C6461g gVar, String str) {
        if (gVar == null) {
            throw new IllegalStateException(C25541a.m63881k("All tokens consumed but was expecting ", str));
        }
    }

    /* renamed from: m */
    public final C6460f mo22577m() throws ScanException {
        C6461g q = mo22580q();
        m15348p(q, "a LEFT_PARENTHESIS or KEYWORD");
        int i = q.f20181a;
        if (i == 1004) {
            C6460f fVar = new C6460f(mo22581r().f20182b);
            C6461g q2 = mo22580q();
            if (q2 != null && q2.f20181a == 1006) {
                fVar.f20177e = q2.f20183c;
                mo22579o();
            }
            return fVar;
        } else if (i == 1005) {
            mo22579o();
            C6456b bVar = new C6456b(q.f20182b.toString());
            bVar.f20169f = mo22578n();
            C6461g r = mo22581r();
            if (r == null || r.f20181a != 41) {
                String str = "Expecting RIGHT_PARENTHESIS token but got " + r;
                mo21722a(str);
                mo21722a("See also http://logback.qos.ch/codes.html#missingRightParenthesis");
                throw new ScanException(str);
            }
            C6461g q3 = mo22580q();
            if (q3 != null && q3.f20181a == 1006) {
                bVar.f20177e = q3.f20183c;
                mo22579o();
            }
            return bVar;
        } else {
            throw new IllegalStateException("Unexpected token " + q);
        }
    }

    /* renamed from: n */
    public final C6458d mo22578n() throws ScanException {
        C6458d dVar;
        C6460f fVar;
        String str;
        C6461g q = mo22580q();
        m15348p(q, "a LITERAL or '%'");
        int i = q.f20181a;
        C6458d dVar2 = null;
        if (i == 37) {
            mo22579o();
            C6461g q2 = mo22580q();
            m15348p(q2, "a FORMAT_MODIFIER, SIMPLE_KEYWORD or COMPOUND_KEYWORD");
            if (q2.f20181a == 1002) {
                String str2 = q2.f20182b;
                if (str2 != null) {
                    C6244d dVar3 = new C6244d();
                    int indexOf = str2.indexOf(46);
                    if (indexOf != -1) {
                        String substring = str2.substring(0, indexOf);
                        int i2 = indexOf + 1;
                        if (i2 != str2.length()) {
                            str = str2.substring(i2);
                            str2 = substring;
                        } else {
                            throw new IllegalArgumentException(C13437d.m33706k("Formatting string [", str2, "] should not end with '.'"));
                        }
                    } else {
                        str = null;
                    }
                    if (str2 != null && str2.length() > 0) {
                        int parseInt = Integer.parseInt(str2);
                        if (parseInt >= 0) {
                            dVar3.f19699a = parseInt;
                        } else {
                            dVar3.f19699a = -parseInt;
                            dVar3.f19701c = false;
                        }
                    }
                    if (str != null && str.length() > 0) {
                        int parseInt2 = Integer.parseInt(str);
                        if (parseInt2 >= 0) {
                            dVar3.f19700b = parseInt2;
                        } else {
                            dVar3.f19700b = -parseInt2;
                            dVar3.f19702d = false;
                        }
                    }
                    mo22579o();
                    fVar = mo22577m();
                    fVar.f20170d = dVar3;
                } else {
                    throw new NullPointerException("Argument cannot be null");
                }
            } else {
                fVar = mo22577m();
            }
            dVar = fVar;
        } else if (i != 1000) {
            dVar = null;
        } else {
            mo22579o();
            dVar = new C6458d(0, q.f20182b);
        }
        if (dVar == null) {
            return null;
        }
        if (mo22580q() != null) {
            dVar2 = mo22578n();
        }
        if (dVar2 != null) {
            dVar.f20173c = dVar2;
        }
        return dVar;
    }

    /* renamed from: o */
    public final void mo22579o() {
        this.f20176f++;
    }

    /* renamed from: q */
    public final C6461g mo22580q() {
        if (this.f20176f < this.f20175e.size()) {
            return (C6461g) this.f20175e.get(this.f20176f);
        }
        return null;
    }

    /* renamed from: r */
    public final C6461g mo22581r() {
        if (this.f20176f >= this.f20175e.size()) {
            return null;
        }
        ArrayList arrayList = this.f20175e;
        int i = this.f20176f;
        this.f20176f = i + 1;
        return (C6461g) arrayList.get(i);
    }
}
