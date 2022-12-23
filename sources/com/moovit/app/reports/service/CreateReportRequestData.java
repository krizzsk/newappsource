package com.moovit.app.reports.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.metro.ReportCategoryType;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class CreateReportRequestData implements Parcelable {
    public static final Parcelable.Creator<CreateReportRequestData> CREATOR = new C15212a();

    /* renamed from: j */
    public static final C15213b f39210j = new C15213b();

    /* renamed from: k */
    public static final C15214c f39211k = new C15214c(CreateReportRequestData.class);

    /* renamed from: b */
    public ReportEntityType f39212b;

    /* renamed from: c */
    public ServerId f39213c;

    /* renamed from: d */
    public String f39214d;

    /* renamed from: e */
    public LatLonE6 f39215e;

    /* renamed from: f */
    public ReportCategoryType f39216f;

    /* renamed from: g */
    public String f39217g;

    /* renamed from: h */
    public Integer f39218h;

    /* renamed from: i */
    public long f39219i;

    /* renamed from: com.moovit.app.reports.service.CreateReportRequestData$a */
    public class C15212a implements Parcelable.Creator<CreateReportRequestData> {
        public final Object createFromParcel(Parcel parcel) {
            return (CreateReportRequestData) C19612n.m46981v(parcel, CreateReportRequestData.f39211k);
        }

        public final Object[] newArray(int i) {
            return new CreateReportRequestData[i];
        }
    }

    /* renamed from: com.moovit.app.reports.service.CreateReportRequestData$b */
    public class C15213b extends C19621u<CreateReportRequestData> {
        public C15213b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            CreateReportRequestData createReportRequestData = (CreateReportRequestData) obj;
            qVar.mo51967q(createReportRequestData.f39212b, ReportEntityType.CODER);
            ServerId serverId = createReportRequestData.f39213c;
            if (serverId == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51939l(serverId.f15142b);
            }
            qVar.mo51955t(createReportRequestData.f39214d);
            qVar.mo51967q(createReportRequestData.f39215e, LatLonE6.f40978f);
            qVar.mo51967q(createReportRequestData.f39216f, ReportCategoryType.CODER);
            qVar.mo51955t(createReportRequestData.f39217g);
            qVar.mo51939l(createReportRequestData.f39218h.intValue());
            qVar.mo51940m(createReportRequestData.f39219i);
        }
    }

    /* renamed from: com.moovit.app.reports.service.CreateReportRequestData$c */
    public class C15214c extends C19620t<CreateReportRequestData> {
        public C15214c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            ServerId serverId;
            C19577c<ReportEntityType> cVar = ReportEntityType.CODER;
            pVar.getClass();
            cVar.getClass();
            ReportEntityType a = cVar.mo51916a(pVar.mo51926r());
            if (!pVar.mo51919b()) {
                serverId = null;
            } else {
                serverId = new ServerId(pVar.mo51924l());
            }
            return new CreateReportRequestData(a, serverId, pVar.mo51948t(), (LatLonE6) pVar.mo51962q(LatLonE6.f40979g), (ReportCategoryType) pVar.mo51962q(ReportCategoryType.CODER), pVar.mo51948t(), Integer.valueOf(pVar.mo51924l()), pVar.mo51925m());
        }
    }

    /* renamed from: com.moovit.app.reports.service.CreateReportRequestData$d */
    public static /* synthetic */ class C15215d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39220a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.util.time.CongestionLevel[] r0 = com.moovit.util.time.CongestionLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39220a = r0
                com.moovit.util.time.CongestionLevel r1 = com.moovit.util.time.CongestionLevel.EMPTY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f39220a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.util.time.CongestionLevel r1 = com.moovit.util.time.CongestionLevel.FEW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f39220a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.util.time.CongestionLevel r1 = com.moovit.util.time.CongestionLevel.LOW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f39220a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.util.time.CongestionLevel r1 = com.moovit.util.time.CongestionLevel.MED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f39220a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.util.time.CongestionLevel r1 = com.moovit.util.time.CongestionLevel.HIGH     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f39220a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.util.time.CongestionLevel r1 = com.moovit.util.time.CongestionLevel.FULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f39220a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.moovit.util.time.CongestionLevel r1 = com.moovit.util.time.CongestionLevel.PACKED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.reports.service.CreateReportRequestData.C15215d.<clinit>():void");
        }
    }

    public CreateReportRequestData(ReportEntityType reportEntityType, ServerId serverId, String str, LatLonE6 latLonE6, ReportCategoryType reportCategoryType, String str2, Integer num, long j) {
        this.f39212b = reportEntityType;
        this.f39213c = serverId;
        this.f39214d = str;
        this.f39215e = latLonE6;
        this.f39216f = reportCategoryType;
        this.f39217g = str2;
        this.f39218h = num;
        this.f39219i = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39210j);
    }
}
