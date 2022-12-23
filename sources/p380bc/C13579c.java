package p380bc;

import android.util.Property;
import android.view.ViewGroup;
import p355ac.C13405f;

/* renamed from: bc.c */
public final class C13579c extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final C13579c f33543a = new C13579c();

    public C13579c() {
        super(Float.class, "childrenAlpha");
    }

    public final Object get(Object obj) {
        Float f = (Float) ((ViewGroup) obj).getTag(C13405f.mtrl_internal_children_alpha_tag);
        if (f != null) {
            return f;
        }
        return Float.valueOf(1.0f);
    }

    public final void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        float floatValue = ((Float) obj2).floatValue();
        viewGroup.setTag(C13405f.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
