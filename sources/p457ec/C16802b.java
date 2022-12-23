package p457ec;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.C14083r;
import p129j1.C5349b;
import p242s1.C6396v0;

/* renamed from: ec.b */
public final class C16802b implements C14083r.C14085b {

    /* renamed from: a */
    public final /* synthetic */ boolean f43755a;

    /* renamed from: b */
    public final /* synthetic */ BottomSheetBehavior f43756b;

    public C16802b(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.f43756b = bottomSheetBehavior;
        this.f43755a = z;
    }

    /* renamed from: a */
    public final C6396v0 mo41034a(View view, C6396v0 v0Var, C14083r.C14086c cVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C5349b f = v0Var.f20044a.mo22517f(7);
        C5349b f2 = v0Var.f20044a.mo22517f(32);
        this.f43756b.f34398v = f.f17647b;
        boolean d = C14083r.m35068d(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        BottomSheetBehavior bottomSheetBehavior = this.f43756b;
        if (bottomSheetBehavior.f34390n) {
            bottomSheetBehavior.f34397u = v0Var.mo22503b();
            paddingBottom = cVar.f35119d + this.f43756b.f34397u;
        }
        BottomSheetBehavior bottomSheetBehavior2 = this.f43756b;
        if (bottomSheetBehavior2.f34391o) {
            if (d) {
                i5 = cVar.f35118c;
            } else {
                i5 = cVar.f35116a;
            }
            paddingLeft = i5 + f.f17646a;
        }
        if (bottomSheetBehavior2.f34392p) {
            if (d) {
                i4 = cVar.f35116a;
            } else {
                i4 = cVar.f35118c;
            }
            paddingRight = i4 + f.f17648c;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        BottomSheetBehavior bottomSheetBehavior3 = this.f43756b;
        boolean z2 = true;
        if (!bottomSheetBehavior3.f34394r || marginLayoutParams.leftMargin == (i3 = f.f17646a)) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i3;
            z = true;
        }
        if (bottomSheetBehavior3.f34395s && marginLayoutParams.rightMargin != (i2 = f.f17648c)) {
            marginLayoutParams.rightMargin = i2;
            z = true;
        }
        if (!bottomSheetBehavior3.f34396t || marginLayoutParams.topMargin == (i = f.f17647b)) {
            z2 = z;
        } else {
            marginLayoutParams.topMargin = i;
        }
        if (z2) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z3 = this.f43755a;
        if (z3) {
            this.f43756b.f34388l = f2.f17649d;
        }
        BottomSheetBehavior bottomSheetBehavior4 = this.f43756b;
        if (bottomSheetBehavior4.f34390n || z3) {
            bottomSheetBehavior4.mo41063n();
        }
        return v0Var;
    }
}
