package com.moovit.transit;

import android.os.Parcel;
import android.os.Parcelable;
import c00.C13717b;
import ce0.C21100e;
import com.moovit.util.time.Time;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p977zz.C20975x0;

public class Schedule implements Parcelable, Iterable<Time> {
    public static final Parcelable.Creator<Schedule> CREATOR = new C7796a();

    /* renamed from: c */
    public static final Schedule f23657c = new Schedule(Collections.emptyList(), true);

    /* renamed from: d */
    public static final C7797b f23658d = new C7797b();

    /* renamed from: e */
    public static final C7798c f23659e = new C7798c(Schedule.class);

    /* renamed from: b */
    public final List<Time> f23660b;

    /* renamed from: com.moovit.transit.Schedule$a */
    public class C7796a implements Parcelable.Creator<Schedule> {
        public final Object createFromParcel(Parcel parcel) {
            return (Schedule) C19612n.m46981v(parcel, Schedule.f23659e);
        }

        public final Object[] newArray(int i) {
            return new Schedule[i];
        }
    }

    /* renamed from: com.moovit.transit.Schedule$b */
    public class C7797b extends C19621u<Schedule> {
        public C7797b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            qVar.mo51965h(((Schedule) obj).f23660b, Time.f23899o);
        }
    }

    /* renamed from: com.moovit.transit.Schedule$c */
    public class C7798c extends C19620t<Schedule> {
        public C7798c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new Schedule(pVar.mo51959g(Time.f23900p), true);
        }
    }

    /* renamed from: com.moovit.transit.Schedule$d */
    public static class C7799d implements Comparator<Schedule> {

        /* renamed from: b */
        public final Time f23661b;

        public C7799d(Time time) {
            C21100e.m49373x(time, "baseTime");
            this.f23661b = time;
        }

        public final int compare(Object obj, Object obj2) {
            return C20975x0.m49116c(((Schedule) obj).mo24328s(this.f23661b), ((Schedule) obj2).mo24328s(this.f23661b));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Schedule(Collection<Time> collection) {
        this(new ArrayList(collection), false);
        C21100e.m49373x(collection, "times");
    }

    /* renamed from: C */
    public static Schedule m17781C(List<Schedule> list) {
        if (C13717b.m34258e(list)) {
            return f23657c;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        HashSet hashSet = new HashSet();
        for (Schedule schedule : list) {
            hashSet.addAll(schedule.f23660b);
        }
        return new Schedule(hashSet);
    }

    /* renamed from: D */
    public static C7799d m17782D() {
        return new C7799d(Time.m17980k());
    }

    /* renamed from: E */
    public static Schedule m17783E(Time time) {
        return new Schedule(Collections.singletonList(time), true);
    }

    /* renamed from: B */
    public final boolean mo24322B(Time time) {
        if (time == null) {
            time = Time.m17980k();
        }
        return mo24328s(time) != null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean isEmpty() {
        return this.f23660b.isEmpty();
    }

    public final Iterator<Time> iterator() {
        return this.f23660b.iterator();
    }

    /* renamed from: m */
    public final Time mo24326m() {
        return mo24328s(new Time(System.currentTimeMillis()));
    }

    /* renamed from: n */
    public final List<Time> mo24327n() {
        return mo24333x(Time.m17980k());
    }

    /* renamed from: s */
    public final Time mo24328s(Time time) {
        int z = mo24334z(time);
        if (z >= 0) {
            return mo24331u(z + 1);
        }
        return mo24331u((-z) - 1);
    }

    public final int size() {
        return this.f23660b.size();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Schedule");
        k.append(C13717b.m34269p(this.f23660b));
        return k.toString();
    }

    /* renamed from: u */
    public final Time mo24331u(int i) {
        if (i < 0 || i >= size()) {
            return null;
        }
        return this.f23660b.get(i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23658d);
    }

    /* renamed from: x */
    public final List<Time> mo24333x(Time time) {
        int z = mo24334z(time);
        if (z < 0) {
            z = (-z) - 1;
        }
        int size = this.f23660b.size();
        if (z >= size) {
            return Collections.emptyList();
        }
        return this.f23660b.subList(z, size);
    }

    /* renamed from: z */
    public final int mo24334z(Time time) {
        List<Time> list = this.f23660b;
        C21100e.m49373x(time, "time");
        return Collections.binarySearch(list, time);
    }

    public Schedule(List list, boolean z) {
        C21100e.m49373x(list, "times");
        if (!z) {
            Collections.sort(list);
        }
        this.f23660b = Collections.unmodifiableList(list);
    }
}
