package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import androidx.transition.ChangeTransform;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p330z2.C7434j;
import p330z2.C7444t;

/* renamed from: androidx.transition.a */
public final class C1320a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f4989a;

    /* renamed from: b */
    public Matrix f4990b = new Matrix();

    /* renamed from: c */
    public final /* synthetic */ boolean f4991c;

    /* renamed from: d */
    public final /* synthetic */ Matrix f4992d;

    /* renamed from: e */
    public final /* synthetic */ View f4993e;

    /* renamed from: f */
    public final /* synthetic */ ChangeTransform.C1301e f4994f;

    /* renamed from: g */
    public final /* synthetic */ ChangeTransform.C1300d f4995g;

    /* renamed from: h */
    public final /* synthetic */ ChangeTransform f4996h;

    public C1320a(ChangeTransform changeTransform, boolean z, Matrix matrix, View view, ChangeTransform.C1301e eVar, ChangeTransform.C1300d dVar) {
        this.f4996h = changeTransform;
        this.f4991c = z;
        this.f4992d = matrix;
        this.f4993e = view;
        this.f4994f = eVar;
        this.f4995g = dVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f4989a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f4989a) {
            if (!this.f4991c || !this.f4996h.f4907z) {
                this.f4993e.setTag(C7434j.transition_transform, (Object) null);
                this.f4993e.setTag(C7434j.parent_matrix, (Object) null);
            } else {
                this.f4990b.set(this.f4992d);
                this.f4993e.setTag(C7434j.transition_transform, this.f4990b);
                ChangeTransform.C1301e eVar = this.f4994f;
                View view = this.f4993e;
                float f = eVar.f4915a;
                float f2 = eVar.f4916b;
                float f3 = eVar.f4917c;
                float f4 = eVar.f4918d;
                float f5 = eVar.f4919e;
                float f6 = eVar.f4920f;
                float f7 = eVar.f4921g;
                float f8 = eVar.f4922h;
                String[] strArr = ChangeTransform.f4901C;
                view.setTranslationX(f);
                view.setTranslationY(f2);
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6342i.m15106w(view, f3);
                view.setScaleX(f4);
                view.setScaleY(f5);
                view.setRotationX(f6);
                view.setRotationY(f7);
                view.setRotation(f8);
            }
        }
        C7444t.f22865a.mo23702i(this.f4993e, (Matrix) null);
        ChangeTransform.C1301e eVar2 = this.f4994f;
        View view2 = this.f4993e;
        float f9 = eVar2.f4915a;
        float f11 = eVar2.f4916b;
        float f12 = eVar2.f4917c;
        float f13 = eVar2.f4918d;
        float f14 = eVar2.f4919e;
        float f15 = eVar2.f4920f;
        float f16 = eVar2.f4921g;
        float f17 = eVar2.f4922h;
        String[] strArr2 = ChangeTransform.f4901C;
        view2.setTranslationX(f9);
        view2.setTranslationY(f11);
        WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
        C6333d0.C6342i.m15106w(view2, f12);
        view2.setScaleX(f13);
        view2.setScaleY(f14);
        view2.setRotationX(f15);
        view2.setRotationY(f16);
        view2.setRotation(f17);
    }

    public final void onAnimationPause(Animator animator) {
        this.f4990b.set(this.f4995g.f4910a);
        this.f4993e.setTag(C7434j.transition_transform, this.f4990b);
        ChangeTransform.C1301e eVar = this.f4994f;
        View view = this.f4993e;
        float f = eVar.f4915a;
        float f2 = eVar.f4916b;
        float f3 = eVar.f4917c;
        float f4 = eVar.f4918d;
        float f5 = eVar.f4919e;
        float f6 = eVar.f4920f;
        float f7 = eVar.f4921g;
        float f8 = eVar.f4922h;
        String[] strArr = ChangeTransform.f4901C;
        view.setTranslationX(f);
        view.setTranslationY(f2);
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6342i.m15106w(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    public final void onAnimationResume(Animator animator) {
        View view = this.f4993e;
        String[] strArr = ChangeTransform.f4901C;
        view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6342i.m15106w(view, BitmapDescriptorFactory.HUE_RED);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotationX(BitmapDescriptorFactory.HUE_RED);
        view.setRotationY(BitmapDescriptorFactory.HUE_RED);
        view.setRotation(BitmapDescriptorFactory.HUE_RED);
    }
}
