package p613kq;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.C0416i1;
import androidx.core.widget.ContentLoadingProgressBar;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.button.MaterialButton;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.commons.utils.UiUtils;
import com.tranzmate.R;
import java.util.concurrent.atomic.AtomicBoolean;
import k00.C17992e;
import p259t5.C6593c;
import p584jl.C17885a;
import p977zz.C20941h;

/* renamed from: kq.c */
public abstract class C18116c<A extends MoovitActivity> extends C15682c<A> {

    /* renamed from: q */
    public static final int[] f46317q = {R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6, R.id.button7, R.id.button8, R.id.button9, R.id.button10};

    /* renamed from: r */
    public static final int[] f46318r = {R.id.progress1, R.id.progress2, R.id.progress3, R.id.progress4, R.id.progress5, R.id.progress6, R.id.progress7, R.id.progress8, R.id.progress9, R.id.progress10};

    /* renamed from: n */
    public final C6593c f46319n = new C6593c(this, 5);

    /* renamed from: o */
    public C18117a f46320o;

    /* renamed from: p */
    public boolean f46321p;

    /* renamed from: kq.c$a */
    public static class C18117a {

        /* renamed from: a */
        public final Button f46322a;

        /* renamed from: b */
        public final ContentLoadingProgressBar f46323b;

        /* renamed from: c */
        public final AtomicBoolean f46324c = new AtomicBoolean(false);

        public C18117a(Button button, ContentLoadingProgressBar contentLoadingProgressBar) {
            this.f46322a = button;
            this.f46323b = contentLoadingProgressBar;
            C20941h.m49044g(R.attr.colorPrimary, contentLoadingProgressBar.getContext());
        }
    }

    public C18116c(Class<A> cls) {
        super(cls);
    }

    /* renamed from: V1 */
    public void mo40555V1() {
        super.mo40555V1();
        mo50551m2();
    }

    /* renamed from: X1 */
    public final void mo46787X1(Object obj, String str) {
        mo50562x2();
    }

    /* renamed from: e2 */
    public final void mo46792e2(Bundle bundle) {
        super.mo46792e2(bundle);
        MoovitExecutors.MAIN_THREAD.execute(new C0416i1(this, 10));
    }

    /* renamed from: m2 */
    public final void mo50551m2() {
        A a = this.f40822c;
        if (this.f46320o != null && a != null && this.f40824e && mo46775H1()) {
            mo50555q2().addOnSuccessListener((Activity) a, new C18114a(this, 0)).addOnFailureListener((Activity) a, (OnFailureListener) new C18115b(this, 0));
        }
    }

    /* renamed from: n2 */
    public final void mo50552n2(boolean z) {
        if (!z) {
            mo50562x2();
            return;
        }
        A a = this.f40822c;
        if (this.f46320o != null && a != null && this.f40824e && mo46775H1()) {
            if (!this.f46321p) {
                this.f46321p = true;
                mo50558t2();
            }
            mo50563y2(this.f46320o.f46322a);
        }
    }

    /* renamed from: o2 */
    public final void mo50553o2() {
        C18117a aVar = this.f46320o;
        if (aVar != null && aVar.f46324c.compareAndSet(true, false)) {
            C17885a.m44465u0(aVar.f46322a, (Drawable) aVar.f46323b.getTag(R.id.view_tag_param1), 2);
            aVar.f46322a.setTextColor((ColorStateList) aVar.f46323b.getTag(R.id.view_tag_param2));
            aVar.f46323b.mo3435a();
        }
    }

    public final void onStart() {
        super.onStart();
        mo50551m2();
    }

    public final void onStop() {
        super.onStop();
        mo50562x2();
    }

    /* renamed from: p2 */
    public abstract void mo50554p2(Button button);

    /* renamed from: q2 */
    public Task<Boolean> mo50555q2() {
        return Tasks.forResult(Boolean.TRUE);
    }

    /* renamed from: r2 */
    public abstract void mo50556r2(View view);

    /* renamed from: s2 */
    public void mo50557s2(Button button) {
    }

    /* renamed from: t2 */
    public void mo50558t2() {
        this.f46320o.f46322a.setOnClickListener(this.f46319n);
        this.f46320o.f46322a.setVisibility(0);
    }

    /* renamed from: u2 */
    public void mo50559u2() {
        this.f46320o.f46322a.setOnClickListener((View.OnClickListener) null);
        C18117a aVar = this.f46320o;
        UiUtils.m40238F(8, aVar.f46322a, aVar.f46323b);
    }

    /* renamed from: v2 */
    public final void mo50560v2(boolean z) {
        C18117a aVar = this.f46320o;
        if (aVar != null) {
            aVar.f46322a.setActivated(z);
            mo50557s2(this.f46320o.f46322a);
        }
    }

    /* renamed from: w2 */
    public final void mo50561w2(boolean z) {
        C18117a aVar = this.f46320o;
        if (aVar != null && aVar.f46324c.compareAndSet(false, true)) {
            aVar.f46323b.setIndeterminateTintList(aVar.f46322a.getTextColors());
            Button button = aVar.f46322a;
            int U = C17885a.m44424U(2, button.getLayoutDirection());
            Drawable drawable = null;
            if (!(button instanceof MaterialButton)) {
                Drawable[] compoundDrawablesRelative = button.getCompoundDrawablesRelative();
                if (U != 1 && U != 2) {
                    if (U != 3 && U != 4) {
                        if (U != 16 && U != 32) {
                            switch (U) {
                                case 80:
                                case 81:
                                    if (button.getLayoutDirection() != 0) {
                                        drawable = compoundDrawablesRelative[3];
                                        break;
                                    } else {
                                        drawable = compoundDrawablesRelative[0];
                                        break;
                                    }
                                case 82:
                                case 83:
                                    if (button.getLayoutDirection() != 0) {
                                        drawable = compoundDrawablesRelative[0];
                                        break;
                                    } else {
                                        drawable = compoundDrawablesRelative[3];
                                        break;
                                    }
                            }
                        } else {
                            drawable = compoundDrawablesRelative[1];
                        }
                    } else {
                        drawable = compoundDrawablesRelative[3];
                    }
                } else {
                    drawable = compoundDrawablesRelative[0];
                }
            } else {
                MaterialButton materialButton = (MaterialButton) button;
                if (materialButton.getIconGravity() == U) {
                    drawable = materialButton.getIcon();
                }
            }
            aVar.f46323b.setTag(R.id.view_tag_param1, drawable);
            if (drawable != null) {
                C17885a.m44465u0(aVar.f46322a, new C17992e(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()), 2);
            }
            aVar.f46323b.setTag(R.id.view_tag_param2, aVar.f46322a.getTextColors());
            aVar.f46322a.setTextColor(0);
            aVar.f46323b.mo3436b();
        }
    }

    /* renamed from: x2 */
    public final void mo50562x2() {
        if (this.f46321p) {
            mo50559u2();
            this.f46321p = false;
        }
    }

    /* renamed from: y2 */
    public void mo50563y2(Button button) {
    }
}
