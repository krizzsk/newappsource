package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import p001a0.C0016g;

@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C0901a();

    /* renamed from: b */
    public final String f3670b;

    /* renamed from: c */
    public final String f3671c;

    /* renamed from: d */
    public final boolean f3672d;

    /* renamed from: e */
    public final int f3673e;

    /* renamed from: f */
    public final int f3674f;

    /* renamed from: g */
    public final String f3675g;

    /* renamed from: h */
    public final boolean f3676h;

    /* renamed from: i */
    public final boolean f3677i;

    /* renamed from: j */
    public final boolean f3678j;

    /* renamed from: k */
    public final Bundle f3679k;

    /* renamed from: l */
    public final boolean f3680l;

    /* renamed from: m */
    public final int f3681m;

    /* renamed from: n */
    public Bundle f3682n;

    /* renamed from: androidx.fragment.app.FragmentState$a */
    public class C0901a implements Parcelable.Creator<FragmentState> {
        public final Object createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        public final Object[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(Fragment fragment) {
        this.f3670b = fragment.getClass().getName();
        this.f3671c = fragment.mWho;
        this.f3672d = fragment.mFromLayout;
        this.f3673e = fragment.mFragmentId;
        this.f3674f = fragment.mContainerId;
        this.f3675g = fragment.mTag;
        this.f3676h = fragment.mRetainInstance;
        this.f3677i = fragment.mRemoving;
        this.f3678j = fragment.mDetached;
        this.f3679k = fragment.mArguments;
        this.f3680l = fragment.mHidden;
        this.f3681m = fragment.mMaxState.ordinal();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder r = C0016g.m34r(RecyclerView.C1119a0.FLAG_IGNORE, "FragmentState{");
        r.append(this.f3670b);
        r.append(" (");
        r.append(this.f3671c);
        r.append(")}:");
        if (this.f3672d) {
            r.append(" fromLayout");
        }
        if (this.f3674f != 0) {
            r.append(" id=0x");
            r.append(Integer.toHexString(this.f3674f));
        }
        String str = this.f3675g;
        if (str != null && !str.isEmpty()) {
            r.append(" tag=");
            r.append(this.f3675g);
        }
        if (this.f3676h) {
            r.append(" retainInstance");
        }
        if (this.f3677i) {
            r.append(" removing");
        }
        if (this.f3678j) {
            r.append(" detached");
        }
        if (this.f3680l) {
            r.append(" hidden");
        }
        return r.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3670b);
        parcel.writeString(this.f3671c);
        parcel.writeInt(this.f3672d ? 1 : 0);
        parcel.writeInt(this.f3673e);
        parcel.writeInt(this.f3674f);
        parcel.writeString(this.f3675g);
        parcel.writeInt(this.f3676h ? 1 : 0);
        parcel.writeInt(this.f3677i ? 1 : 0);
        parcel.writeInt(this.f3678j ? 1 : 0);
        parcel.writeBundle(this.f3679k);
        parcel.writeInt(this.f3680l ? 1 : 0);
        parcel.writeBundle(this.f3682n);
        parcel.writeInt(this.f3681m);
    }

    public FragmentState(Parcel parcel) {
        this.f3670b = parcel.readString();
        this.f3671c = parcel.readString();
        boolean z = true;
        this.f3672d = parcel.readInt() != 0;
        this.f3673e = parcel.readInt();
        this.f3674f = parcel.readInt();
        this.f3675g = parcel.readString();
        this.f3676h = parcel.readInt() != 0;
        this.f3677i = parcel.readInt() != 0;
        this.f3678j = parcel.readInt() != 0;
        this.f3679k = parcel.readBundle();
        this.f3680l = parcel.readInt() == 0 ? false : z;
        this.f3682n = parcel.readBundle();
        this.f3681m = parcel.readInt();
    }
}
