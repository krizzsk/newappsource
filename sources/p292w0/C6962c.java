package p292w0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import p267u0.C6674a;

/* renamed from: w0.c */
public class C6962c extends ConstraintWidget {

    /* renamed from: w0 */
    public ArrayList<ConstraintWidget> f21718w0 = new ArrayList<>();

    /* renamed from: G */
    public void mo2779G() {
        this.f21718w0.clear();
        super.mo2779G();
    }

    /* renamed from: J */
    public final void mo2782J(C6674a aVar) {
        super.mo2782J(aVar);
        int size = this.f21718w0.size();
        for (int i = 0; i < size; i++) {
            this.f21718w0.get(i).mo2782J(aVar);
        }
    }

    /* renamed from: U */
    public void mo2833U() {
        ArrayList<ConstraintWidget> arrayList = this.f21718w0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = this.f21718w0.get(i);
                if (constraintWidget instanceof C6962c) {
                    ((C6962c) constraintWidget).mo2833U();
                }
            }
        }
    }
}
