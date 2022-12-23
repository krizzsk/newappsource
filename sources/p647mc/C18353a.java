package p647mc;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import p092g3.C4752a;
import p380bc.C13577a;
import p380bc.C13583g;
import p583jk.C17884p;

/* renamed from: mc.a */
public abstract class C18353a implements C18362g {

    /* renamed from: a */
    public final Context f46784a;

    /* renamed from: b */
    public final ExtendedFloatingActionButton f46785b;

    /* renamed from: c */
    public final ArrayList<Animator.AnimatorListener> f46786c = new ArrayList<>();

    /* renamed from: d */
    public final C4752a f46787d;

    /* renamed from: e */
    public C13583g f46788e;

    /* renamed from: f */
    public C13583g f46789f;

    /* renamed from: mc.a$a */
    public class C18354a extends Property<ExtendedFloatingActionButton, Float> {
        public C18354a() {
            super(Float.class, "LABEL_OPACITY_PROPERTY");
        }

        public final Object get(Object obj) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
            float alpha = (((float) Color.alpha(extendedFloatingActionButton.getCurrentTextColor())) / 255.0f) / ((float) Color.alpha(extendedFloatingActionButton.f34800D.getColorForState(extendedFloatingActionButton.getDrawableState(), C18353a.this.f46785b.f34800D.getDefaultColor())));
            LinearInterpolator linearInterpolator = C13577a.f33537a;
            return Float.valueOf((alpha * 1.0f) + BitmapDescriptorFactory.HUE_RED);
        }

        public final void set(Object obj, Object obj2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
            Float f = (Float) obj2;
            int colorForState = extendedFloatingActionButton.f34800D.getColorForState(extendedFloatingActionButton.getDrawableState(), C18353a.this.f46785b.f34800D.getDefaultColor());
            float floatValue = f.floatValue();
            LinearInterpolator linearInterpolator = C13577a.f33537a;
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (((((((float) Color.alpha(colorForState)) / 255.0f) - BitmapDescriptorFactory.HUE_RED) * floatValue) + BitmapDescriptorFactory.HUE_RED) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f.floatValue() == 1.0f) {
                extendedFloatingActionButton.mo41601f(extendedFloatingActionButton.f34800D);
            } else {
                extendedFloatingActionButton.mo41601f(valueOf);
            }
        }
    }

    public C18353a(ExtendedFloatingActionButton extendedFloatingActionButton, C4752a aVar) {
        this.f46785b = extendedFloatingActionButton;
        this.f46784a = extendedFloatingActionButton.getContext();
        this.f46787d = aVar;
    }

    /* renamed from: e */
    public void mo41644e() {
        this.f46787d.f16037a = null;
    }

    /* renamed from: g */
    public AnimatorSet mo41642g() {
        C13583g gVar = this.f46789f;
        if (gVar == null) {
            if (this.f46788e == null) {
                this.f46788e = C13583g.m33997b(mo41641f(), this.f46784a);
            }
            gVar = this.f46788e;
            gVar.getClass();
        }
        return mo50804h(gVar);
    }

    /* renamed from: h */
    public final AnimatorSet mo50804h(C13583g gVar) {
        ArrayList arrayList = new ArrayList();
        if (gVar.mo40468g("opacity")) {
            arrayList.add(gVar.mo40464d("opacity", this.f46785b, View.ALPHA));
        }
        if (gVar.mo40468g("scale")) {
            arrayList.add(gVar.mo40464d("scale", this.f46785b, View.SCALE_Y));
            arrayList.add(gVar.mo40464d("scale", this.f46785b, View.SCALE_X));
        }
        if (gVar.mo40468g("width")) {
            arrayList.add(gVar.mo40464d("width", this.f46785b, ExtendedFloatingActionButton.f34793F));
        }
        if (gVar.mo40468g("height")) {
            arrayList.add(gVar.mo40464d("height", this.f46785b, ExtendedFloatingActionButton.f34794G));
        }
        if (gVar.mo40468g("paddingStart")) {
            arrayList.add(gVar.mo40464d("paddingStart", this.f46785b, ExtendedFloatingActionButton.f34795H));
        }
        if (gVar.mo40468g("paddingEnd")) {
            arrayList.add(gVar.mo40464d("paddingEnd", this.f46785b, ExtendedFloatingActionButton.f34796I));
        }
        if (gVar.mo40468g("labelOpacity")) {
            arrayList.add(gVar.mo40464d("labelOpacity", this.f46785b, new C18354a()));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C17884p.m44345P(animatorSet, arrayList);
        return animatorSet;
    }
}
