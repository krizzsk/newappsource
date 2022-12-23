package y00;

import android.animation.Animator;
import com.moovit.design.view.TextAnimationView;
import j00.C17682a;
import java.util.Objects;
import p304x.C7082o;

/* renamed from: y00.c */
public final class C20684c extends C17682a {

    /* renamed from: a */
    public final /* synthetic */ TextAnimationView f52256a;

    public C20684c(TextAnimationView textAnimationView) {
        this.f52256a = textAnimationView;
    }

    public final void onAnimationEnd(Animator animator) {
        TextAnimationView textAnimationView = this.f52256a;
        Objects.requireNonNull(textAnimationView);
        textAnimationView.postOnAnimation(new C7082o(textAnimationView, 17));
    }
}
