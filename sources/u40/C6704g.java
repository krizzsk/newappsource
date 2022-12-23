package u40;

import c70.C13752e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p824tp.C19728f;
import p977zz.C20944i0;
import q00.C19047a;
import q40.C6177b;
import q40.C6178c;
import r40.C6252c;
import s40.C6462a;
import s40.C6463b;
import s40.C6464c;
import s40.C6465d;
import s40.C6467f;
import s40.C6469g;
import s40.C6471h;
import s40.C6472i;
import s40.C6473j;
import t40.C6590a;

/* renamed from: u40.g */
public final class C6704g extends C6703f {
    /* renamed from: a */
    public final void mo22871a(C6702e eVar) throws Exception {
        Task task;
        List<TransitLine> list = eVar.f20787h.f23700h;
        ArrayList arrayList = new ArrayList(list.size());
        for (TransitLine transitLine : list) {
            C6178c cVar = eVar.f20780a;
            C13752e eVar2 = eVar.f20782c;
            C19728f fVar = eVar.f20783d;
            C19047a aVar = eVar.f20784e;
            int i = eVar.f20785f;
            ServerId serverId = transitLine.f23687c;
            C6252c cVar2 = (C6252c) cVar.f19569b.f19564g.get(new C20944i0(Integer.valueOf(i), serverId));
            if (cVar2 != null) {
                task = Tasks.forResult(cVar2);
            } else {
                C6462a aVar2 = new C6462a(eVar2.f33852a, fVar, new C6465d(cVar.f19568a, cVar.f19569b, eVar2, fVar, aVar, i, serverId));
                task = Tasks.call(cVar.f19571d, aVar2).continueWith(cVar.f19571d, new C6473j()).continueWith(cVar.f19571d, new C6469g()).continueWith(cVar.f19571d, new C6467f()).continueWith(cVar.f19571d, new C6471h()).continueWith(cVar.f19571d, new C6472i()).continueWith(cVar.f19571d, new C6463b()).addOnCompleteListener((Executor) cVar.f19571d, aVar2).continueWith(cVar.f19571d, new C6464c());
            }
            arrayList.add(task);
        }
        Tasks.await(Tasks.whenAll((Collection<? extends Task<?>>) arrayList));
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((C6252c) ((Task) it.next()).getResult());
        }
        C6590a aVar3 = new C6590a(eVar.f20787h, arrayList2);
        eVar.f20788i = aVar3;
        C6177b bVar = eVar.f20781b;
        int i2 = eVar.f20785f;
        bVar.f19566i.put(new C20944i0(Integer.valueOf(i2), eVar.f20786g), aVar3);
    }
}
