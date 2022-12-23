package p320y3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p070e4.C4549d;
import p093g4.C4791a;

/* renamed from: y3.a */
public final class C7287a extends C7289c {

    /* renamed from: h */
    public int f22406h = 0;

    /* renamed from: i */
    public int f22407i = 5;

    /* renamed from: j */
    public ArrayList f22408j = null;

    /* renamed from: k */
    public final void mo23546k() {
        String str;
        StringBuilder sb;
        int i;
        int i2 = this.f22406h;
        if (i2 < 0 || (i = this.f22407i) < 0) {
            sb = C13555b.m33972k("Invalid depthStart/depthEnd range [");
            sb.append(this.f22406h);
            sb.append(", ");
            sb.append(this.f22407i);
            str = "] (negative values are not allowed)";
        } else if (i2 >= i) {
            sb = C13555b.m33972k("Invalid depthEnd range [");
            sb.append(this.f22406h);
            sb.append(", ");
            sb.append(this.f22407i);
            str = "] (start greater or equal to end)";
        } else {
            return;
        }
        sb.append(str);
        mo21722a(sb.toString());
    }

    public final void start() {
        C4791a aVar;
        String c = mo22242c();
        if (c != null) {
            try {
                if (c.contains("..")) {
                    String[] split = c.split(Pattern.quote(".."), 2);
                    if (split.length == 2) {
                        this.f22406h = Integer.parseInt(split[0]);
                        this.f22407i = Integer.parseInt(split[1]);
                        mo23546k();
                    } else {
                        mo21722a("Failed to parse depth option as range [" + c + "]");
                    }
                } else {
                    this.f22407i = Integer.parseInt(c);
                }
            } catch (NumberFormatException e) {
                mo21727f("Failed to parse depth option [" + c + "]", e);
            }
            List<String> list = this.f19697f;
            if (list != null && list.size() > 1) {
                int size = list.size();
                for (int i = 1; i < size; i++) {
                    String str = list.get(i);
                    C4549d dVar = this.f19696e.f20771c;
                    if (!(dVar == null || (aVar = (C4791a) ((Map) dVar.mo20059b("EVALUATOR_MAP")).get(str)) == null)) {
                        if (this.f22408j == null) {
                            this.f22408j = new ArrayList();
                        }
                        this.f22408j.add(aVar);
                    }
                }
            }
        }
    }
}
