package com.moovit.metro;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;

public enum ReportCategoryType implements Parcelable {
    STOP_CROWDEDNESS,
    STOP_FACILITY_CONDITION,
    STOP_INCIDENT,
    STOP_CLEANLINESS,
    STOP_HAPPENING,
    STOP_OTHER,
    STOP_STATION_MOVED,
    STOP_STATION_CLOSED,
    STOP_INCORRECT_LOCATION,
    STOP_MISSING_LINE,
    STOP_DUPLICATE_LINE,
    LINE_LATE_DELAY,
    LINE_LINE_DIDNT_STOP,
    LINE_OUT_OF_SERVICE,
    LINE_CROWDEDNESS,
    LINE_INCIDENT,
    LINE_PLATFORM_CHANGE,
    LINE_DRIVERS_RANK,
    LINE_ROUTE_CHANGE,
    LINE_CLEANLINESS,
    LINE_TEMPERATURE,
    LINE_SHAPE_IS_BAD,
    LINE_MISSING;
    
    public static final C19584i<ReportCategoryType> CODER = null;
    public static final Parcelable.Creator<ReportCategoryType> CREATOR = null;

    /* renamed from: com.moovit.metro.ReportCategoryType$a */
    public class C4114a implements Parcelable.Creator<ReportCategoryType> {
        public final Object createFromParcel(Parcel parcel) {
            return (ReportCategoryType) C19612n.m46981v(parcel, ReportCategoryType.CODER);
        }

        public final Object[] newArray(int i) {
            return new ReportCategoryType[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        ReportCategoryType reportCategoryType;
        ReportCategoryType reportCategoryType2;
        ReportCategoryType reportCategoryType3;
        ReportCategoryType reportCategoryType4;
        ReportCategoryType reportCategoryType5;
        ReportCategoryType reportCategoryType6;
        ReportCategoryType reportCategoryType7;
        ReportCategoryType reportCategoryType8;
        ReportCategoryType reportCategoryType9;
        ReportCategoryType reportCategoryType10;
        ReportCategoryType reportCategoryType11;
        ReportCategoryType reportCategoryType12;
        ReportCategoryType reportCategoryType13;
        ReportCategoryType reportCategoryType14;
        ReportCategoryType reportCategoryType15;
        ReportCategoryType reportCategoryType16;
        ReportCategoryType reportCategoryType17;
        ReportCategoryType reportCategoryType18;
        ReportCategoryType reportCategoryType19;
        ReportCategoryType reportCategoryType20;
        ReportCategoryType reportCategoryType21;
        ReportCategoryType reportCategoryType22;
        ReportCategoryType reportCategoryType23;
        CODER = new C19577c(ReportCategoryType.class, reportCategoryType, reportCategoryType2, reportCategoryType3, reportCategoryType4, reportCategoryType5, reportCategoryType6, reportCategoryType7, reportCategoryType8, reportCategoryType9, reportCategoryType10, reportCategoryType11, reportCategoryType12, reportCategoryType13, reportCategoryType14, reportCategoryType15, reportCategoryType16, reportCategoryType17, reportCategoryType18, reportCategoryType19, reportCategoryType20, reportCategoryType21, reportCategoryType23, reportCategoryType22);
        CREATOR = new C4114a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
