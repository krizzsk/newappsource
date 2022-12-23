package com.moovit.itinerary.model.leg;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import ce0.C21100e;
import com.moovit.MoovitApplication;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polyline;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.image.model.Image;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.ridesharing.model.Event;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.Time;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p824tp.C19746x;
import x00.C20440a;

public class EventLeg implements Leg {
    public static final Parcelable.Creator<EventLeg> CREATOR = new C16142a();

    /* renamed from: c */
    public static C16143b f42082c = new C16143b(EventLeg.class);

    /* renamed from: b */
    public final Event f42083b;

    /* renamed from: com.moovit.itinerary.model.leg.EventLeg$a */
    public class C16142a implements Parcelable.Creator<EventLeg> {
        public final Object createFromParcel(Parcel parcel) {
            return (EventLeg) C19612n.m46981v(parcel, EventLeg.f42082c);
        }

        public final Object[] newArray(int i) {
            return new EventLeg[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.EventLeg$b */
    public class C16143b extends C19619s<EventLeg> {
        public C16143b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            Event.C16421b bVar = Event.f42910j;
            pVar.getClass();
            return new EventLeg((Event) bVar.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            Event event = ((EventLeg) obj).f42083b;
            Event.C16421b bVar = Event.f42910j;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(event, qVar);
        }
    }

    public EventLeg(Event event) {
        C21100e.m49373x(event, "event");
        this.f42083b = event;
    }

    /* renamed from: K1 */
    public final Time mo48331K1() {
        if (this.f42083b.mo49163b()) {
            return new Time(this.f42083b.f42918i);
        }
        return mo48339o1();
    }

    /* renamed from: W */
    public final LocationDescriptor mo48332W() {
        String str;
        Event event = this.f42083b;
        Parcelable.Creator<Event> creator = Event.CREATOR;
        MoovitApplication<?, ?, ?> moovitApplication = MoovitApplication.f37317k;
        if (event.mo49163b()) {
            long j = event.f42917h;
            long j2 = event.f42918i;
            SimpleDateFormat simpleDateFormat = C7925b.f23934a;
            str = DateUtils.formatDateRange(moovitApplication, j, j2, SQLiteDatabase.OPEN_FULLMUTEX);
        } else {
            str = C7925b.m18016d(moovitApplication, event.f42918i);
        }
        String string = moovitApplication.getString(C19746x.string_list_delimiter_dot);
        String str2 = event.f42915f;
        return new LocationDescriptor(LocationDescriptor.LocationType.EVENT, LocationDescriptor.SourceType.EXTERNAL, event.f42911b, (String) null, event.f42913d, Arrays.asList(new C20440a[]{new C20440a((CharSequence) str, (String) null), new C20440a((CharSequence) string, (String) null), new C20440a((CharSequence) str2, (String) null)}), event.f42916g, (LatLonE6) null, event.f42912c, (Image) null);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e2 */
    public final LocationDescriptor mo48334e2() {
        return mo48332W();
    }

    public final int getType() {
        return 13;
    }

    /* renamed from: i0 */
    public final <T> T mo48338i0(Leg.C16144a<T> aVar) {
        return aVar.mo39918j(this);
    }

    /* renamed from: o1 */
    public final Time mo48339o1() {
        return new Time(this.f42083b.f42917h);
    }

    /* renamed from: w1 */
    public final Polyline mo48340w1() {
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42082c);
    }
}
