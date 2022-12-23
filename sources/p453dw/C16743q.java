package p453dw;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import c70.C13753f;
import c70.C13774o;
import ce0.C21100e;
import com.moovit.app.stopdetail.C15340c;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.arrivals.ArrivalsResponseKey;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.network.model.ServerId;
import com.moovit.tracing.TraceEvent;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import k00.C17988b;
import p241s0.C6302b;
import p435de.C16596f;
import p952yy.C20785a;
import p952yy.C20786b;
import p952yy.C20787c;
import p952yy.C20792f;
import p952yy.C20793g;
import p977zz.C20944i0;
import p977zz.C20975x0;
import t90.C13120a;

/* renamed from: dw.q */
public abstract class C16743q extends C13774o {

    /* renamed from: g */
    public final ServerId f43603g;

    public C16743q(ServerId serverId, ArrayList arrayList) {
        super(arrayList);
        C21100e.m49373x(serverId, "stopId");
        this.f43603g = serverId;
    }

    /* renamed from: a */
    public final void mo40704a(CollectionHashMap.ArrayListHashMap arrayListHashMap, C6302b bVar) {
        C15340c cVar;
        RQ rq;
        C16596f a = C16596f.m42113a();
        StringBuilder k = C13555b.m33972k("TSRG: stopId=");
        k.append(this.f43603g);
        k.append(", requests=");
        k.append(this.f33912b.size());
        k.append(", responses=");
        k.append(arrayListHashMap.size());
        k.append(", errors=");
        k.append(bVar.f19969d);
        a.mo49363b(k.toString());
        if (bVar.isEmpty()) {
            HashMap hashMap = new HashMap(arrayListHashMap.size());
            HashMap hashMap2 = new HashMap(arrayListHashMap.size());
            CollectionHashMap.C15782a aVar = new CollectionHashMap.C15782a();
            ArrivalsResponseKey arrivalsResponseKey = null;
            while (aVar.hasNext()) {
                C20944i0 i0Var = (C20944i0) aVar.next();
                String str = (String) i0Var.f52692a;
                Iterator it = this.f33912b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        rq = null;
                        break;
                    }
                    C13753f fVar = (C13753f) it.next();
                    if (C20975x0.m49118e(str, fVar.f33855a)) {
                        rq = fVar.f33856b;
                        break;
                    }
                }
                C20792f fVar2 = (C20792f) rq;
                C20793g gVar = (C20793g) i0Var.f52693b;
                C20786b bVar2 = fVar2.f52479z;
                ArrivalsResponseKey keyType = ArrivalsResponseKey.getKeyType(bVar2.f52447a, bVar2.f52451e);
                hashMap.put(keyType, new C20944i0(fVar2, gVar));
                hashMap2.put(keyType, C20785a.m48772d(gVar.f52481n));
                if (arrivalsResponseKey == null && (bVar2.f52447a != null || bVar2.f52451e)) {
                    arrivalsResponseKey = ArrivalsResponseKey.TIME_BASED_RESPONSE;
                }
            }
            if (arrivalsResponseKey == null) {
                arrivalsResponseKey = ArrivalsResponseKey.NOW_BASED_RESPONSE;
            }
            C20786b bVar3 = ((C20792f) ((C20944i0) hashMap.get(arrivalsResponseKey)).f52692a).f52479z;
            if (this.f43603g.equals(((C20793g) ((C20944i0) hashMap.get(arrivalsResponseKey)).f52693b).f52480m)) {
                Time time = bVar3.f52447a;
                boolean z = bVar3.f52451e;
                StopDetailActivity stopDetailActivity = StopDetailActivity.this;
                int i = StopDetailActivity.f39653z0;
                stopDetailActivity.f39659m0 = hashMap2;
                stopDetailActivity.f39663q0.setRefreshing(false);
                stopDetailActivity.f39662p0.mo45924k(stopDetailActivity, time, z, stopDetailActivity.f39659m0);
                ((C13120a) stopDetailActivity.mo44551z1()).mo40025c(TraceEvent.STOP_DETAIL_ACTIVITY_LOADED);
            }
        } else {
            StopDetailActivity stopDetailActivity2 = StopDetailActivity.this;
            int i2 = StopDetailActivity.f39653z0;
            CharSequence text = stopDetailActivity2.getText(R.string.response_read_error_message);
            Drawable b = C17988b.m44611b(R.drawable.img_empty_error, stopDetailActivity2);
            stopDetailActivity2.f39663q0.setRefreshing(false);
            Map<ArrivalsResponseKey, Map<ServerId, C20787c>> map = stopDetailActivity2.f39659m0;
            if ((map == null || map.isEmpty()) && (cVar = stopDetailActivity2.f39662p0) != null) {
                cVar.f39713r = text;
                cVar.f39715t = b;
                cVar.notifyDataSetChanged();
            }
            ((C13120a) stopDetailActivity2.mo44551z1()).mo40025c(TraceEvent.STOP_DETAIL_ACTIVITY_LOADED);
        }
        StopDetailActivity stopDetailActivity3 = StopDetailActivity.this;
        stopDetailActivity3.f39669w0 = null;
        RecyclerView.Adapter adapter = stopDetailActivity3.f39667u0.getAdapter();
        C15340c cVar2 = stopDetailActivity3.f39662p0;
        if (adapter != cVar2) {
            stopDetailActivity3.f39667u0.mo4627l0(cVar2);
        }
    }
}
