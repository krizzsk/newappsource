package p370ar;

import android.os.Parcelable;
import com.airbnb.lottie.C1899o;
import com.airbnb.lottie.LottieAnimationView;
import com.moovit.app.animation.AnimationPlayer;

/* renamed from: ar.b */
public final /* synthetic */ class C13507b implements C1899o {

    /* renamed from: a */
    public final /* synthetic */ LottieAnimationView f33423a;

    public /* synthetic */ C13507b(LottieAnimationView lottieAnimationView) {
        this.f33423a = lottieAnimationView;
    }

    public final void onResult(Object obj) {
        LottieAnimationView lottieAnimationView = this.f33423a;
        Throwable th = (Throwable) obj;
        Parcelable.Creator<AnimationPlayer> creator = AnimationPlayer.CREATOR;
        lottieAnimationView.setTag((Object) null);
        lottieAnimationView.setVisibility(8);
    }
}
