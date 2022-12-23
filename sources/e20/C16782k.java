package e20;

import android.content.Context;
import android.content.res.Resources;
import c00.C13733n;
import com.moovit.itinerary.model.TurnInstruction;
import p824tp.C19746x;

/* renamed from: e20.k */
public final class C16782k implements C13733n<TurnInstruction, CharSequence> {

    /* renamed from: b */
    public final /* synthetic */ Context f43687b;

    public C16782k(Context context) {
        this.f43687b = context;
    }

    public final Object convert(Object obj) throws Exception {
        TurnInstruction turnInstruction = (TurnInstruction) obj;
        Context context = this.f43687b;
        turnInstruction.getClass();
        Resources resources = context.getResources();
        return resources.getString(C19746x.walk_direction_format, new Object[]{resources.getString(turnInstruction.f41935a.getResId()), turnInstruction.f41936b});
    }
}
