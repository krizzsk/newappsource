package p739px;

import android.content.res.ColorStateList;
import android.util.SparseArray;
import com.google.android.material.slider.C14113a;
import com.google.android.material.slider.Slider;

/* renamed from: px.b */
public final /* synthetic */ class C19038b implements C14113a {

    /* renamed from: a */
    public final /* synthetic */ C19039c f48413a;

    /* renamed from: b */
    public final /* synthetic */ SparseArray f48414b;

    public /* synthetic */ C19038b(C19039c cVar, SparseArray sparseArray) {
        this.f48413a = cVar;
        this.f48414b = sparseArray;
    }

    /* renamed from: a */
    public final void mo42221a(Object obj, float f) {
        C19039c cVar = this.f48413a;
        SparseArray sparseArray = this.f48414b;
        int i = (int) f;
        cVar.mo51496S1(i, cVar.f48418j.isActivated());
        ((Slider) obj).setTrackActiveTintList((ColorStateList) sparseArray.get(i));
    }
}
