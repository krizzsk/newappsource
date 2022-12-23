package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new C13959c();

    /* renamed from: d */
    public static final C13957a f34633d = new C13957a();

    /* renamed from: e */
    public static final C13958b f34634e = new C13958b();

    /* renamed from: b */
    public final C13960d f34635b;

    /* renamed from: c */
    public final List<CalendarConstraints.DateValidator> f34636c;

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$a */
    public class C13957a implements C13960d {
        /* renamed from: a */
        public final boolean mo41495a(long j, List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && dateValidator.mo41488v0(j)) {
                    return true;
                }
            }
            return false;
        }

        public final int getId() {
            return 1;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$b */
    public class C13958b implements C13960d {
        /* renamed from: a */
        public final boolean mo41495a(long j, List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && !dateValidator.mo41488v0(j)) {
                    return false;
                }
            }
            return true;
        }

        public final int getId() {
            return 2;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$c */
    public class C13959c implements Parcelable.Creator<CompositeDateValidator> {
        public final Object createFromParcel(Parcel parcel) {
            C13960d dVar;
            ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int readInt = parcel.readInt();
            if (readInt == 2) {
                dVar = CompositeDateValidator.f34634e;
            } else if (readInt == 1) {
                dVar = CompositeDateValidator.f34633d;
            } else {
                dVar = CompositeDateValidator.f34634e;
            }
            readArrayList.getClass();
            return new CompositeDateValidator(readArrayList, dVar);
        }

        public final Object[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$d */
    public interface C13960d {
        /* renamed from: a */
        boolean mo41495a(long j, List list);

        int getId();
    }

    public CompositeDateValidator() {
        throw null;
    }

    public CompositeDateValidator(ArrayList arrayList, C13960d dVar) {
        this.f34636c = arrayList;
        this.f34635b = dVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        if (!this.f34636c.equals(compositeDateValidator.f34636c) || this.f34635b.getId() != compositeDateValidator.f34635b.getId()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f34636c.hashCode();
    }

    /* renamed from: v0 */
    public final boolean mo41488v0(long j) {
        return this.f34635b.mo41495a(j, this.f34636c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f34636c);
        parcel.writeInt(this.f34635b.getId());
    }
}
