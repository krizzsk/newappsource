package j00;

import android.animation.Animator;
import android.widget.TextView;

/* renamed from: j00.e */
public final class C17686e extends C17682a {

    /* renamed from: a */
    public final /* synthetic */ TextView f45438a;

    /* renamed from: b */
    public final /* synthetic */ String f45439b;

    public C17686e(TextView textView, String str) {
        this.f45438a = textView;
        this.f45439b = str;
    }

    public final void onAnimationStart(Animator animator) {
        this.f45438a.setText(this.f45439b);
    }
}
