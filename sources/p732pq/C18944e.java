package p732pq;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.app.navigation.MultiLegNavActivity;
import com.moovit.itinerary.model.Itinerary;

/* renamed from: pq.e */
public class C18944e extends C18939a<MultiLegNavActivity> {
    public C18944e() {
        super(MultiLegNavActivity.class);
    }

    /* renamed from: D2 */
    public final Itinerary mo51462D2() {
        return ((MultiLegNavActivity) this.f40822c).f38499X;
    }

    /* renamed from: q2 */
    public final Task<Boolean> mo50555q2() {
        return Tasks.forResult(Boolean.FALSE);
    }
}
