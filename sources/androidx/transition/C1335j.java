package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.ArrayList;
import p330z2.C7434j;

/* renamed from: androidx.transition.j */
public final class C1335j extends C1327f {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f5031a;

    /* renamed from: b */
    public final /* synthetic */ View f5032b;

    /* renamed from: c */
    public final /* synthetic */ View f5033c;

    /* renamed from: d */
    public final /* synthetic */ Visibility f5034d;

    public C1335j(Visibility visibility, ViewGroup viewGroup, View view, View view2) {
        this.f5034d = visibility;
        this.f5031a = viewGroup;
        this.f5032b = view;
        this.f5033c = view2;
    }

    /* renamed from: a */
    public final void mo5374a() {
        this.f5031a.getOverlay().remove(this.f5032b);
    }

    /* renamed from: c */
    public final void mo5376c() {
        if (this.f5032b.getParent() == null) {
            this.f5031a.getOverlay().add(this.f5032b);
            return;
        }
        Visibility visibility = this.f5034d;
        int size = visibility.f4954n.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            visibility.f4954n.get(size).cancel();
        }
        ArrayList<Transition.C1315d> arrayList = visibility.f4958r;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) visibility.f4958r.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((Transition.C1315d) arrayList2.get(i)).mo5375b();
            }
        }
    }

    /* renamed from: d */
    public final void mo5377d(Transition transition) {
        this.f5033c.setTag(C7434j.save_overlay_view, (Object) null);
        this.f5031a.getOverlay().remove(this.f5032b);
        transition.mo5427w(this);
    }
}
