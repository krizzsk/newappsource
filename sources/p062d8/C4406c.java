package p062d8;

import com.facebook.appevents.cloudbridge.C2329a;
import java.util.List;
import kotlin.collections.C23825c;
import mf0.C24362h;

/* renamed from: d8.c */
public final /* synthetic */ class C4406c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Integer f15469b;

    /* renamed from: c */
    public final /* synthetic */ List f15470c;

    public /* synthetic */ C4406c(Integer num, List list) {
        this.f15469b = num;
        this.f15470c = list;
    }

    public final void run() {
        Integer num = this.f15469b;
        List list = this.f15470c;
        C24362h.m61211f(list, "$processedEvents");
        if (!C23825c.m58507d0(C2329a.f8501a, num) && C23825c.m58507d0(C2329a.f8502b, num)) {
            if (C2329a.f8505e >= 5) {
                C2329a.m6193c().clear();
                C2329a.f8505e = 0;
                return;
            }
            C2329a.m6193c().addAll(0, list);
            C2329a.f8505e++;
        }
    }
}
