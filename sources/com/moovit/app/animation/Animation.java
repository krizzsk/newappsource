package com.moovit.app.animation;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class Animation implements Parcelable {
    public static final Parcelable.Creator<Animation> CREATOR = new C14767a();

    /* renamed from: d */
    public static final C14768b f37585d = new C14768b(Animation.class);

    /* renamed from: b */
    public final AnimationFormat f37586b;

    /* renamed from: c */
    public final String f37587c;

    /* renamed from: com.moovit.app.animation.Animation$a */
    public class C14767a implements Parcelable.Creator<Animation> {
        public final Object createFromParcel(Parcel parcel) {
            return (Animation) C19612n.m46981v(parcel, Animation.f37585d);
        }

        public final Object[] newArray(int i) {
            return new Animation[i];
        }
    }

    /* renamed from: com.moovit.app.animation.Animation$b */
    public class C14768b extends C19619s<Animation> {
        public C14768b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19577c<AnimationFormat> cVar = AnimationFormat.CODER;
            pVar.getClass();
            return new Animation((AnimationFormat) cVar.read(pVar), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            Animation animation = (Animation) obj;
            AnimationFormat animationFormat = animation.f37586b;
            C19577c<AnimationFormat> cVar = AnimationFormat.CODER;
            qVar.getClass();
            cVar.write(animationFormat, qVar);
            qVar.mo51954p(animation.f37587c);
        }
    }

    public Animation(AnimationFormat animationFormat, String str) {
        C21100e.m49373x(animationFormat, "format");
        this.f37586b = animationFormat;
        C21100e.m49373x(str, "fileName");
        this.f37587c = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Animation{format=");
        k.append(this.f37586b);
        k.append(", fileName='");
        k.append(this.f37587c);
        k.append('\'');
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f37585d);
    }
}
