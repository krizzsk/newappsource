package com.moovit.app.animation;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.airbnb.lottie.LottieAnimationView;
import java.io.IOException;
import p370ar.C13506a;
import p370ar.C13507b;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

public class AnimationPlayer implements Parcelable {
    public static final Parcelable.Creator<AnimationPlayer> CREATOR = new C14770a();

    /* renamed from: c */
    public static final C14771b f37588c = new C14771b(AnimationPlayer.class);

    /* renamed from: d */
    public static final AnimationPlayer f37589d = new AnimationPlayer("https://static.moovitapp.com/lottie/v3");

    /* renamed from: b */
    public final String f37590b;

    /* renamed from: com.moovit.app.animation.AnimationPlayer$a */
    public class C14770a implements Parcelable.Creator<AnimationPlayer> {
        public final Object createFromParcel(Parcel parcel) {
            return (AnimationPlayer) C19612n.m46981v(parcel, AnimationPlayer.f37588c);
        }

        public final Object[] newArray(int i) {
            return new AnimationPlayer[i];
        }
    }

    /* renamed from: com.moovit.app.animation.AnimationPlayer$b */
    public class C14771b extends C19619s<AnimationPlayer> {
        public C14771b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new AnimationPlayer(pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((AnimationPlayer) obj).f37590b);
        }
    }

    /* renamed from: com.moovit.app.animation.AnimationPlayer$c */
    public static /* synthetic */ class C14772c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37591a;

        static {
            int[] iArr = new int[AnimationFormat.values().length];
            f37591a = iArr;
            try {
                iArr[AnimationFormat.LOTTIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public AnimationPlayer(String str) {
        C21100e.m49373x(str, "baseUrl");
        this.f37590b = str;
    }

    /* renamed from: b */
    public final String mo44767b(Animation animation) {
        return Uri.parse(this.f37590b).buildUpon().appendPath(animation.f37587c).build().toString();
    }

    /* renamed from: c */
    public final void mo44768c(LottieAnimationView lottieAnimationView, LocalAnimation localAnimation, C13506a aVar) {
        Animation animation = localAnimation.getAnimation();
        if (C14772c.f37591a[animation.f37586b.ordinal()] == 1) {
            if (!(lottieAnimationView instanceof LottieAnimationView)) {
                lottieAnimationView.getClass();
                return;
            }
            String b = mo44767b(animation);
            if (!C20975x0.m49118e((String) lottieAnimationView.getTag(), b)) {
                lottieAnimationView.setTag(b);
                lottieAnimationView.setRepeatCount(aVar.f33422b);
                lottieAnimationView.setAnimationFromUrl(b);
                lottieAnimationView.setFailureListener(new C13507b(lottieAnimationView));
                lottieAnimationView.setVisibility(0);
                lottieAnimationView.mo6697f();
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AnimationPlayer{baseUrl='");
        k.append(this.f37590b);
        k.append('\'');
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f37588c);
    }
}
