package mobi.lab.veriff.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.veriff.sdk.internal.C22554tl;
import java.util.List;
import java.util.Objects;

/* renamed from: mobi.lab.veriff.data.c */
public class C24424c implements Parcelable, Comparable<C24424c> {
    public static final Parcelable.Creator<C24424c> CREATOR = new Parcelable.Creator<C24424c>() {
        /* renamed from: a */
        public C24424c createFromParcel(Parcel parcel) {
            return new C24424c(parcel);
        }

        /* renamed from: a */
        public C24424c[] newArray(int i) {
            return new C24424c[i];
        }
    };

    /* renamed from: a */
    private final String f61813a;

    /* renamed from: b */
    private final String f61814b;

    /* renamed from: c */
    private final List<String> f61815c;

    public C24424c(String str, String str2, List<String> list) {
        this.f61813a = str;
        this.f61814b = str2;
        this.f61815c = list;
    }

    /* renamed from: a */
    public String mo60581a() {
        return this.f61813a;
    }

    /* renamed from: b */
    public String mo60583b() {
        return this.f61814b;
    }

    /* renamed from: c */
    public List<String> mo60584c() {
        return this.f61815c;
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
        C24424c cVar = (C24424c) obj;
        if (!Objects.equals(this.f61813a, cVar.f61813a) || !Objects.equals(this.f61814b, cVar.f61814b) || !this.f61815c.equals(cVar.f61815c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.f61813a, this.f61814b};
        return this.f61815c.hashCode() + (Objects.hash(objArr) * 31);
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Country{code='");
        C25541a.m63890u(k, this.f61813a, '\'', ", name='");
        C25541a.m63890u(k, this.f61814b, '\'', ", docs=");
        return C13555b.m33970i(k, this.f61815c, '}');
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f61813a);
        parcel.writeString(this.f61814b);
        parcel.writeStringList(this.f61815c);
    }

    /* renamed from: a */
    public boolean mo60582a(String str) {
        for (String equalsIgnoreCase : this.f61815c) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public int compareTo(C24424c cVar) {
        return mo60583b().compareTo(cVar.mo60583b());
    }

    public C24424c(C22554tl.C22555a aVar) {
        this(aVar.mo56732a(), aVar.mo56733b(), aVar.mo56734c());
    }

    public C24424c(Parcel parcel) {
        this.f61813a = parcel.readString();
        this.f61814b = parcel.readString();
        this.f61815c = parcel.createStringArrayList();
    }
}
