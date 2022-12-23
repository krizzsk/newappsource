package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.C0932h0;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new C0867a();

    /* renamed from: b */
    public final int[] f3552b;

    /* renamed from: c */
    public final ArrayList<String> f3553c;

    /* renamed from: d */
    public final int[] f3554d;

    /* renamed from: e */
    public final int[] f3555e;

    /* renamed from: f */
    public final int f3556f;

    /* renamed from: g */
    public final String f3557g;

    /* renamed from: h */
    public final int f3558h;

    /* renamed from: i */
    public final int f3559i;

    /* renamed from: j */
    public final CharSequence f3560j;

    /* renamed from: k */
    public final int f3561k;

    /* renamed from: l */
    public final CharSequence f3562l;

    /* renamed from: m */
    public final ArrayList<String> f3563m;

    /* renamed from: n */
    public final ArrayList<String> f3564n;

    /* renamed from: o */
    public final boolean f3565o;

    /* renamed from: androidx.fragment.app.BackStackRecordState$a */
    public class C0867a implements Parcelable.Creator<BackStackRecordState> {
        public final Object createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        public final Object[] newArray(int i) {
            return new BackStackRecordState[i];
        }
    }

    public BackStackRecordState(C0909a aVar) {
        int size = aVar.f3771a.size();
        this.f3552b = new int[(size * 6)];
        if (aVar.f3777g) {
            this.f3553c = new ArrayList<>(size);
            this.f3554d = new int[size];
            this.f3555e = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0932h0.C0933a aVar2 = aVar.f3771a.get(i);
                int i3 = i2 + 1;
                this.f3552b[i2] = aVar2.f3788a;
                ArrayList<String> arrayList = this.f3553c;
                Fragment fragment = aVar2.f3789b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f3552b;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f3790c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f3791d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f3792e;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f3793f;
                iArr[i7] = aVar2.f3794g;
                this.f3554d[i] = aVar2.f3795h.ordinal();
                this.f3555e[i] = aVar2.f3796i.ordinal();
                i++;
                i2 = i7 + 1;
            }
            this.f3556f = aVar.f3776f;
            this.f3557g = aVar.f3779i;
            this.f3558h = aVar.f3709t;
            this.f3559i = aVar.f3780j;
            this.f3560j = aVar.f3781k;
            this.f3561k = aVar.f3782l;
            this.f3562l = aVar.f3783m;
            this.f3563m = aVar.f3784n;
            this.f3564n = aVar.f3785o;
            this.f3565o = aVar.f3786p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f3552b);
        parcel.writeStringList(this.f3553c);
        parcel.writeIntArray(this.f3554d);
        parcel.writeIntArray(this.f3555e);
        parcel.writeInt(this.f3556f);
        parcel.writeString(this.f3557g);
        parcel.writeInt(this.f3558h);
        parcel.writeInt(this.f3559i);
        TextUtils.writeToParcel(this.f3560j, parcel, 0);
        parcel.writeInt(this.f3561k);
        TextUtils.writeToParcel(this.f3562l, parcel, 0);
        parcel.writeStringList(this.f3563m);
        parcel.writeStringList(this.f3564n);
        parcel.writeInt(this.f3565o ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f3552b = parcel.createIntArray();
        this.f3553c = parcel.createStringArrayList();
        this.f3554d = parcel.createIntArray();
        this.f3555e = parcel.createIntArray();
        this.f3556f = parcel.readInt();
        this.f3557g = parcel.readString();
        this.f3558h = parcel.readInt();
        this.f3559i = parcel.readInt();
        this.f3560j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3561k = parcel.readInt();
        this.f3562l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3563m = parcel.createStringArrayList();
        this.f3564n = parcel.createStringArrayList();
        this.f3565o = parcel.readInt() != 0;
    }
}
