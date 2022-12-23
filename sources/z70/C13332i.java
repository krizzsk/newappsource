package z70;

import android.text.style.StyleSpan;
import ce0.C21100e;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.search.C7604a;
import com.moovit.search.C7606b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: z70.i */
public final /* synthetic */ class C13332i implements SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ C7606b f33095b;

    /* renamed from: c */
    public final /* synthetic */ String f33096c;

    /* renamed from: d */
    public final /* synthetic */ String f33097d;

    /* renamed from: e */
    public final /* synthetic */ boolean f33098e;

    public /* synthetic */ C13332i(C7606b bVar, String str, String str2, boolean z) {
        this.f33095b = bVar;
        this.f33096c = str;
        this.f33097d = str2;
        this.f33098e = z;
    }

    public final Task then(Object obj) {
        boolean z;
        C13327e eVar;
        C13327e eVar2;
        C7606b bVar = this.f33095b;
        String str = this.f33096c;
        String str2 = this.f33097d;
        boolean z2 = this.f33098e;
        List<C7604a.C7605a> list = (List) obj;
        bVar.getClass();
        if (list == null) {
            list = Collections.emptyList();
        }
        C21100e.m49355o();
        ArrayList arrayList = new ArrayList(list.size());
        for (C7604a.C7605a aVar : list) {
            if (!(aVar == null || (eVar2 = aVar.f23155a) == null)) {
                arrayList.add(eVar2);
            }
        }
        StyleSpan styleSpan = C13329g.f33089a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!"special_actions".equals(((C13327e) it.next()).f33086d)) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if ((str2.isEmpty() || z2) && z) {
            arrayList.add(bVar.f23166k);
        } else if (!z && (eVar = bVar.f23167l) != null) {
            arrayList.add(eVar);
        }
        return Tasks.forResult(new C7606b.C7608b(str, str2, arrayList));
    }
}
