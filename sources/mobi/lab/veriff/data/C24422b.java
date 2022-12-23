package mobi.lab.veriff.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.veriff.sdk.internal.C21791iy;
import java.util.Objects;

/* renamed from: mobi.lab.veriff.data.b */
public class C24422b implements Parcelable {
    public static final Parcelable.Creator<C24422b> CREATOR = new Parcelable.Creator<C24422b>() {
        /* renamed from: a */
        public C24422b createFromParcel(Parcel parcel) {
            return new C24422b(parcel);
        }

        /* renamed from: a */
        public C24422b[] newArray(int i) {
            return new C24422b[i];
        }
    };

    /* renamed from: a */
    private final C21791iy f61811a;

    /* renamed from: b */
    private boolean f61812b = false;

    public C24422b(C21791iy iyVar) {
        this.f61811a = iyVar;
    }

    /* renamed from: a */
    public C21791iy mo60569a() {
        return this.f61811a;
    }

    /* renamed from: b */
    public boolean mo60570b() {
        return this.f61812b;
    }

    /* renamed from: c */
    public void mo60571c() {
        this.f61812b = true;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C24422b bVar = (C24422b) obj;
        if (this.f61812b == bVar.f61812b && this.f61811a == bVar.f61811a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f61811a, Boolean.valueOf(this.f61812b)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f61811a.name());
        parcel.writeByte(this.f61812b ? (byte) 1 : 0);
    }

    public C24422b(Parcel parcel) {
        boolean z = false;
        this.f61811a = C21791iy.valueOf(parcel.readString());
        this.f61812b = parcel.readByte() != 0 ? true : z;
    }
}
