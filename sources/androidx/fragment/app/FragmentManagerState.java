package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C0900a();

    /* renamed from: b */
    public ArrayList<String> f3662b;

    /* renamed from: c */
    public ArrayList<String> f3663c;

    /* renamed from: d */
    public BackStackRecordState[] f3664d;

    /* renamed from: e */
    public int f3665e;

    /* renamed from: f */
    public String f3666f = null;

    /* renamed from: g */
    public ArrayList<String> f3667g = new ArrayList<>();

    /* renamed from: h */
    public ArrayList<BackStackState> f3668h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f3669i;

    /* renamed from: androidx.fragment.app.FragmentManagerState$a */
    public class C0900a implements Parcelable.Creator<FragmentManagerState> {
        public final Object createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        public final Object[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f3662b);
        parcel.writeStringList(this.f3663c);
        parcel.writeTypedArray(this.f3664d, i);
        parcel.writeInt(this.f3665e);
        parcel.writeString(this.f3666f);
        parcel.writeStringList(this.f3667g);
        parcel.writeTypedList(this.f3668h);
        parcel.writeTypedList(this.f3669i);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f3662b = parcel.createStringArrayList();
        this.f3663c = parcel.createStringArrayList();
        this.f3664d = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f3665e = parcel.readInt();
        this.f3666f = parcel.readString();
        this.f3667g = parcel.createStringArrayList();
        this.f3668h = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f3669i = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
