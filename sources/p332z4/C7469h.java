package p332z4;

import com.airbnb.lottie.model.content.Mask;
import com.google.android.play.core.assetpacks.C14248b1;
import java.util.ArrayList;
import java.util.List;
import p583jk.C17873f;
import p728pm.C18933a;

/* renamed from: z4.h */
public final class C7469h {

    /* renamed from: a */
    public final Object f22900a;

    /* renamed from: b */
    public final Object f22901b;

    /* renamed from: c */
    public final Object f22902c;

    public C7469h(List list) {
        this.f22902c = list;
        this.f22900a = new ArrayList(list.size());
        this.f22901b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((List) this.f22900a).add(((Mask) list.get(i)).f6540b.mo6602i());
            ((List) this.f22901b).add(((Mask) list.get(i)).f6541c.mo6602i());
        }
    }

    public /* synthetic */ C7469h(C17873f fVar, C14248b1 b1Var, C18933a aVar) {
        this.f22900a = fVar;
        this.f22901b = b1Var;
        this.f22902c = aVar;
    }
}
