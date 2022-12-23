package p320y3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p093g4.C4791a;

/* renamed from: y3.x */
public class C7310x extends C7309w {

    /* renamed from: h */
    public ArrayList f22410h = null;

    /* renamed from: i */
    public ArrayList f22411i = null;

    public final void start() {
        String c = mo22242c();
        if (c != null) {
            String lowerCase = c.toLowerCase(Locale.US);
            if (!"full".equals(lowerCase) && !"short".equals(lowerCase)) {
                try {
                    Integer.parseInt(lowerCase);
                } catch (NumberFormatException unused) {
                    mo21722a("Could not parse [" + lowerCase + "] as an integer");
                }
            }
        }
        List<String> list = this.f19697f;
        if (list != null && list.size() > 1) {
            int size = list.size();
            for (int i = 1; i < size; i++) {
                String str = list.get(i);
                C4791a aVar = (C4791a) ((Map) this.f19696e.f20771c.mo20059b("EVALUATOR_MAP")).get(str);
                if (aVar != null) {
                    if (this.f22410h == null) {
                        this.f22410h = new ArrayList();
                    }
                    this.f22410h.add(aVar);
                } else {
                    if (this.f22411i == null) {
                        this.f22411i = new ArrayList();
                    }
                    this.f22411i.add(str);
                }
            }
        }
        this.f19698g = true;
    }

    public final void stop() {
        this.f22410h = null;
        this.f19698g = false;
    }
}
