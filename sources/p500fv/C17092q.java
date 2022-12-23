package p500fv;

import android.content.Context;
import com.moovit.MoovitActivity;
import com.moovit.app.reports.service.C15222d;
import com.moovit.app.reports.service.C15229j;

/* renamed from: fv.q */
public abstract class C17092q implements C17091p {
    /* renamed from: j */
    public static C15229j m43026j(MoovitActivity moovitActivity, int i, int i2, int i3, C15222d.C15223a aVar) {
        return new C15229j(moovitActivity, i, i2, i3, aVar);
    }

    /* renamed from: d */
    public final String mo49677d(int i, Context context) {
        String[] stringArray = context.getResources().getStringArray(mo49686i());
        if (i < 0 || i >= stringArray.length) {
            return null;
        }
        return stringArray[i];
    }

    /* renamed from: i */
    public abstract int mo49686i();
}
