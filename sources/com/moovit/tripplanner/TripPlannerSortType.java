package com.moovit.tripplanner;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.itinerary.model.Itinerary;
import f20.C16941a;
import f20.C16942b;
import f20.C16943c;
import f20.C16944d;
import f20.C16945e;
import f20.C16946f;
import java.util.Comparator;
import p607kk.C18089e;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p824tp.C19739q;
import p824tp.C19746x;

public enum TripPlannerSortType implements Parcelable {
    NO_CLIENT_SORTING(C19739q.ic_trophy_24_on_surface, C19746x.tripplan_sort_recommended, (int) null),
    PRICE(C19739q.ic_ticket_full_24_on_surface, C19746x.tripplan_sort_cheapest, new C16946f()),
    DURATION(C19739q.ic_lightning_24_on_surface, C19746x.tripplan_sort_duration, new C16941a()),
    EMISSION(C19739q.ic_leaf_24_on_surface, C19746x.tripplan_sort_lowest_co2, new C16944d()),
    LEAST_WALKING(C19739q.ic_walk_24_on_surface, C19746x.tripplan_sort_least_walking, new C18089e(1)),
    LEAST_TRANSFERS(C19739q.ic_transfer_24_on_surface, C19746x.tripplan_sort_least_trasnfers, new C16945e()),
    EARLIEST_DEPARTURE(C19739q.ic_departure_time_24_on_surface, C19746x.tripplan_sort_earliest_departure, new C16943c(0)),
    EARLIEST_ARRIVAL(C19739q.ic_arrival_time_24_on_surface, C19746x.tripplan_sort_earliest_arrival, new C16942b());
    
    public static C19577c<TripPlannerSortType> CODER;
    public static final Parcelable.Creator<TripPlannerSortType> CREATOR = null;
    private final Comparator<Itinerary> comparator;
    private final int iconResId;
    private final int nameResId;

    /* renamed from: com.moovit.tripplanner.TripPlannerSortType$a */
    public class C7856a implements Parcelable.Creator<TripPlannerSortType> {
        public final Object createFromParcel(Parcel parcel) {
            return (TripPlannerSortType) C19612n.m46981v(parcel, TripPlannerSortType.CODER);
        }

        public final Object[] newArray(int i) {
            return new TripPlannerSortType[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        TripPlannerSortType tripPlannerSortType;
        TripPlannerSortType tripPlannerSortType2;
        TripPlannerSortType tripPlannerSortType3;
        TripPlannerSortType tripPlannerSortType4;
        TripPlannerSortType tripPlannerSortType5;
        TripPlannerSortType tripPlannerSortType6;
        TripPlannerSortType tripPlannerSortType7;
        TripPlannerSortType tripPlannerSortType8;
        CREATOR = new C7856a();
        CODER = new C19577c<>(TripPlannerSortType.class, tripPlannerSortType2, tripPlannerSortType3, tripPlannerSortType4, tripPlannerSortType5, tripPlannerSortType6, tripPlannerSortType7, tripPlannerSortType8, tripPlannerSortType);
    }

    private TripPlannerSortType(int i, int i2, Comparator<Itinerary> comparator2) {
        this.nameResId = i2;
        this.iconResId = i;
        this.comparator = comparator2;
    }

    public int describeContents() {
        return 0;
    }

    public Comparator<Itinerary> getComparator() {
        return this.comparator;
    }

    public int getIconResId() {
        return this.iconResId;
    }

    public int getNameResId() {
        return this.nameResId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
