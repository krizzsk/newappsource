package com.moovit.search.specialactions;

import android.os.Parcel;
import android.os.Parcelable;
import c00.C13717b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchLocationSpecialActions implements Parcelable {
    public static final Parcelable.Creator<SearchLocationSpecialActions> CREATOR = new C7610a();

    /* renamed from: b */
    public final List<String> f23182b;

    /* renamed from: com.moovit.search.specialactions.SearchLocationSpecialActions$a */
    public class C7610a implements Parcelable.Creator<SearchLocationSpecialActions> {
        public final Object createFromParcel(Parcel parcel) {
            return new SearchLocationSpecialActions(parcel);
        }

        public final Object[] newArray(int i) {
            return new SearchLocationSpecialActions[i];
        }
    }

    public SearchLocationSpecialActions(String... strArr) {
        this.f23182b = Collections.unmodifiableList(Arrays.asList(strArr));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(C13717b.m34264k(this.f23182b));
    }

    public SearchLocationSpecialActions(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f23182b = Collections.unmodifiableList(arrayList);
    }
}
