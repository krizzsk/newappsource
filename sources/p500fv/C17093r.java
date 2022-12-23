package p500fv;

import android.content.Context;
import com.moovit.MoovitActivity;
import com.moovit.app.reports.service.C15222d;
import com.moovit.app.reports.service.C15230k;

/* renamed from: fv.r */
public abstract class C17093r implements C17091p {
    /* renamed from: j */
    public static C15230k m43029j(MoovitActivity moovitActivity, int i, int i2, int i3, int i4, C15222d.C15223a aVar) {
        return new C15230k(moovitActivity, i, i2, i3, i4, aVar);
    }

    /* renamed from: d */
    public final String mo49677d(int i, Context context) {
        String[] stringArray = context.getResources().getStringArray(mo49685i());
        if (i < 0 || i >= stringArray.length) {
            return null;
        }
        return stringArray[i];
    }

    /* renamed from: i */
    public abstract int mo49685i();
}
