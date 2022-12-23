package g30;

import ce0.C21100e;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polygon;
import com.moovit.l10n.TemplateProtocol;
import com.moovit.metro.ReportCategoryType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.BicycleProvider;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitType;
import g20.C17146f;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* renamed from: g30.h */
public final class C4776h {

    /* renamed from: a */
    public final ServerId f16126a;

    /* renamed from: b */
    public final long f16127b;

    /* renamed from: c */
    public final String f16128c;

    /* renamed from: d */
    public final String f16129d;

    /* renamed from: e */
    public final String f16130e;

    /* renamed from: f */
    public final TimeZone f16131f;

    /* renamed from: g */
    public final Polygon f16132g;

    /* renamed from: h */
    public final List<TransitType> f16133h;

    /* renamed from: i */
    public final Collection<TransitAgency> f16134i;

    /* renamed from: j */
    public final Collection<C17146f> f16135j;

    /* renamed from: k */
    public final Collection<TemplateProtocol.C16179g> f16136k;

    /* renamed from: l */
    public final List<ReportCategoryType> f16137l;

    /* renamed from: m */
    public final List<ReportCategoryType> f16138m;

    /* renamed from: n */
    public final LatLonE6 f16139n;

    /* renamed from: o */
    public final ServerId f16140o;

    /* renamed from: p */
    public final String f16141p;

    /* renamed from: q */
    public final String f16142q;

    /* renamed from: r */
    public int f16143r;

    /* renamed from: s */
    public final List<BicycleProvider> f16144s;

    public C4776h(ServerId serverId, long j, String str, String str2, String str3, TimeZone timeZone, Polygon polygon, List<TransitType> list, Collection<TransitAgency> collection, Collection<C17146f> collection2, Collection<TemplateProtocol.C16179g> collection3, List<ReportCategoryType> list2, List<ReportCategoryType> list3, LatLonE6 latLonE6, ServerId serverId2, String str4, String str5, int i, List<BicycleProvider> list4) {
        ServerId serverId3 = serverId;
        String str6 = str2;
        String str7 = str3;
        TimeZone timeZone2 = timeZone;
        Polygon polygon2 = polygon;
        List<TransitType> list5 = list;
        Collection<TransitAgency> collection4 = collection;
        Collection<C17146f> collection5 = collection2;
        Collection<TemplateProtocol.C16179g> collection6 = collection3;
        List<ReportCategoryType> list6 = list2;
        List<ReportCategoryType> list7 = list3;
        LatLonE6 latLonE62 = latLonE6;
        String str8 = str4;
        String str9 = str5;
        List<BicycleProvider> list8 = list4;
        C21100e.m49373x(serverId3, "metroId");
        this.f16126a = serverId3;
        this.f16127b = j;
        this.f16128c = str;
        C21100e.m49373x(str6, "metroName");
        this.f16129d = str6;
        C21100e.m49373x(str7, "metroClass");
        this.f16130e = str7;
        C21100e.m49373x(timeZone2, "timeZone");
        this.f16131f = timeZone2;
        C21100e.m49373x(polygon2, "bounds");
        this.f16132g = polygon2;
        C21100e.m49373x(list5, "transitTypes");
        this.f16133h = list5;
        C21100e.m49373x(collection4, "agencies");
        this.f16134i = collection4;
        C21100e.m49373x(collection5, "linePresentationConfs");
        this.f16135j = collection5;
        C21100e.m49373x(collection6, "lineTemplates");
        this.f16136k = collection6;
        C21100e.m49373x(list6, "lineReportCategories");
        this.f16137l = list6;
        C21100e.m49373x(list7, "stopReportCategories");
        this.f16138m = list7;
        C21100e.m49373x(latLonE62, "defaultLocation");
        this.f16139n = latLonE62;
        this.f16140o = serverId2;
        C21100e.m49373x(str8, "countryName");
        this.f16141p = str8;
        String str10 = str5;
        C21100e.m49373x(str10, "countryCode");
        this.f16142q = str10;
        this.f16143r = i;
        List<BicycleProvider> list9 = list4;
        C21100e.m49373x(list9, "bicycleProviders");
        this.f16144s = list9;
    }

    /* renamed from: a */
    public final List<TransitType> mo20299a() {
        return Collections.unmodifiableList(this.f16133h);
    }
}
