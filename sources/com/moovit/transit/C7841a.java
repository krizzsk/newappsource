package com.moovit.transit;

import a20.C13388b;
import android.util.SparseArray;
import android.util.SparseIntArray;
import c00.C13717b;
import c00.C13719c;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import c70.C13749c;
import com.facebook.appevents.C2342l;
import com.moovit.app.home.dashboard.C14948l;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.utils.Color;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.database.DbEntityRef;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.moovit.image.model.ImageSet;
import com.moovit.map.items.C16284b;
import com.moovit.metro.ReportCategoryType;
import com.moovit.network.model.LongServerId;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitType;
import com.moovit.util.ServerIdMap;
import com.moovit.util.time.C7923a;
import com.moovit.util.time.TimeFrequency;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithoutParamsSetEntry;
import com.tranzmate.moovit.protocol.common.MVRouteType;
import com.tranzmate.moovit.protocol.common.MVUserReportCategoryType;
import com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType;
import com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType;
import com.tranzmate.moovit.protocol.gtfs.MVLineGroupSummary;
import com.tranzmate.moovit.protocol.gtfs.MVLineSummary;
import com.tranzmate.moovit.protocol.gtfs.MVPathway;
import com.tranzmate.moovit.protocol.gtfs.MVPathwayType;
import com.tranzmate.moovit.protocol.gtfs.MVStopMetaData;
import com.tranzmate.moovit.protocol.gtfs.MVSubGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import p054d0.C4303q;
import p241s0.C6302b;
import p638lr.C18262i;
import p824tp.C19728f;
import p900wt.C20415e;
import p977zz.C20944i0;
import p977zz.C20952m0;
import q00.C19047a;
import q00.C19053d;
import u90.C13141d;

/* renamed from: com.moovit.transit.a */
public final class C7841a {

    /* renamed from: a */
    public static final C13719c f23766a = new C13719c(DbEntityRef.LINE_ID_TO_LINE_REF_CONVERTER, new C4303q(25));

    /* renamed from: b */
    public static final C20415e f23767b = new C20415e(18);

    /* renamed from: c */
    public static C14948l f23768c = new C14948l(2);

    /* renamed from: com.moovit.transit.a$a */
    public static /* synthetic */ class C7842a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23769a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f23770b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f23771c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f23772d;

        /* renamed from: e */
        public static final /* synthetic */ int[] f23773e;

        /* renamed from: f */
        public static final /* synthetic */ int[] f23774f;

        /* renamed from: g */
        public static final /* synthetic */ int[] f23775g;

        /* renamed from: h */
        public static final /* synthetic */ int[] f23776h;

        /* JADX WARNING: Can't wrap try/catch for region: R(140:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|(2:67|68)|69|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|(2:117|118)|119|121|122|(2:123|124)|125|127|128|129|130|(2:131|132)|133|135|136|137|138|(2:139|140)|141|143|144|145|146|147|148|149|150|151|152|153|154|155|156|(2:157|158)|159|161|162|163|164|165|166|167|168|169|170|171|172|173|174|(3:175|176|178)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(141:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|(2:67|68)|69|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|121|122|(2:123|124)|125|127|128|129|130|(2:131|132)|133|135|136|137|138|(2:139|140)|141|143|144|145|146|147|148|149|150|151|152|153|154|155|156|(2:157|158)|159|161|162|163|164|165|166|167|168|169|170|171|172|173|174|(3:175|176|178)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(142:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|(2:67|68)|69|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|121|122|(2:123|124)|125|127|128|129|130|(2:131|132)|133|135|136|137|138|(2:139|140)|141|143|144|145|146|147|148|149|150|151|152|153|154|155|156|(2:157|158)|159|161|162|163|164|165|166|167|168|169|170|171|172|173|174|(3:175|176|178)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(143:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|(2:67|68)|69|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|121|122|(2:123|124)|125|127|128|129|130|(2:131|132)|133|135|136|137|138|(2:139|140)|141|143|144|145|146|147|148|149|150|151|152|153|154|155|156|(2:157|158)|159|161|162|163|164|165|166|167|168|169|170|171|172|173|174|(3:175|176|178)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(145:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|(2:67|68)|69|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|121|122|(2:123|124)|125|127|128|129|130|(2:131|132)|133|135|136|137|138|139|140|141|143|144|145|146|147|148|149|150|151|152|153|154|155|156|(2:157|158)|159|161|162|163|164|165|166|167|168|169|170|171|172|173|174|(3:175|176|178)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(146:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|(2:67|68)|69|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|121|122|(2:123|124)|125|127|128|129|130|(2:131|132)|133|135|136|137|138|139|140|141|143|144|145|146|147|148|149|150|151|152|153|154|155|156|(2:157|158)|159|161|162|163|164|165|166|167|168|169|170|171|172|173|174|(3:175|176|178)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(147:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|(2:67|68)|69|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|121|122|(2:123|124)|125|127|128|129|130|(2:131|132)|133|135|136|137|138|139|140|141|143|144|145|146|147|148|149|150|151|152|153|154|155|156|(2:157|158)|159|161|162|163|164|165|166|167|168|169|170|171|172|173|174|(3:175|176|178)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(150:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|(2:67|68)|69|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|121|122|(2:123|124)|125|127|128|129|130|131|132|133|135|136|137|138|139|140|141|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|161|162|163|164|165|166|167|168|169|170|171|172|173|174|(3:175|176|178)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(151:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|(2:67|68)|69|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|121|122|(2:123|124)|125|127|128|129|130|131|132|133|135|136|137|138|139|140|141|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|161|162|163|164|165|166|167|168|169|170|171|172|173|174|(3:175|176|178)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(152:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|(2:67|68)|69|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|121|122|(2:123|124)|125|127|128|129|130|131|132|133|135|136|137|138|139|140|141|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|161|162|163|164|165|166|167|168|169|170|171|172|173|174|(3:175|176|178)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(153:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|(2:67|68)|69|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|121|122|(2:123|124)|125|127|128|129|130|131|132|133|135|136|137|138|139|140|141|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|161|162|163|164|165|166|167|168|169|170|171|172|173|174|(3:175|176|178)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(155:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|(2:67|68)|69|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|121|122|123|124|125|127|128|129|130|131|132|133|135|136|137|138|139|140|141|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|161|162|163|164|165|166|167|168|169|170|171|172|173|174|(3:175|176|178)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(157:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|(2:67|68)|69|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|121|122|123|124|125|127|128|129|130|131|132|133|135|136|137|138|139|140|141|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|178) */
        /* JADX WARNING: Can't wrap try/catch for region: R(159:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|(2:67|68)|69|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|121|122|123|124|125|127|128|129|130|131|132|133|135|136|137|138|139|140|141|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|178) */
        /* JADX WARNING: Can't wrap try/catch for region: R(160:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|121|122|123|124|125|127|128|129|130|131|132|133|135|136|137|138|139|140|141|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|178) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x01ae */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x01b8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x01c2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x01cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x01d6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x01e0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:113:0x01ea */
        /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x01f4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x01fe */
        /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x0219 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x0234 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x023e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:137:0x0259 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:139:0x0263 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x027e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x0288 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:149:0x0292 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:151:0x029c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:153:0x02a6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:155:0x02b0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:157:0x02ba */
        /* JADX WARNING: Missing exception handler attribute for start block: B:163:0x02d5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:165:0x02df */
        /* JADX WARNING: Missing exception handler attribute for start block: B:167:0x02e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:169:0x02f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:171:0x02fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:173:0x0307 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:175:0x0311 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x012f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0139 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0143 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x014d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0157 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0161 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x016b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0175 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x017f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0189 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x01a4 */
        static {
            /*
                com.moovit.metro.ReportCategoryType[] r0 = com.moovit.metro.ReportCategoryType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23776h = r0
                r1 = 1
                com.moovit.metro.ReportCategoryType r2 = com.moovit.metro.ReportCategoryType.STOP_CROWDEDNESS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f23776h     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.metro.ReportCategoryType r3 = com.moovit.metro.ReportCategoryType.STOP_FACILITY_CONDITION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f23776h     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.metro.ReportCategoryType r4 = com.moovit.metro.ReportCategoryType.STOP_INCIDENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f23776h     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.metro.ReportCategoryType r5 = com.moovit.metro.ReportCategoryType.STOP_CLEANLINESS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f23776h     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.metro.ReportCategoryType r6 = com.moovit.metro.ReportCategoryType.STOP_HAPPENING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f23776h     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.metro.ReportCategoryType r7 = com.moovit.metro.ReportCategoryType.STOP_OTHER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f23776h     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.moovit.metro.ReportCategoryType r8 = com.moovit.metro.ReportCategoryType.STOP_STATION_MOVED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f23776h     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.moovit.metro.ReportCategoryType r9 = com.moovit.metro.ReportCategoryType.STOP_STATION_CLOSED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f23776h     // Catch:{ NoSuchFieldError -> 0x006c }
                com.moovit.metro.ReportCategoryType r10 = com.moovit.metro.ReportCategoryType.STOP_INCORRECT_LOCATION     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                r9 = 10
                int[] r10 = f23776h     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.moovit.metro.ReportCategoryType r11 = com.moovit.metro.ReportCategoryType.STOP_MISSING_LINE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r10[r11] = r9     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                r10 = 11
                int[] r11 = f23776h     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.moovit.metro.ReportCategoryType r12 = com.moovit.metro.ReportCategoryType.STOP_DUPLICATE_LINE     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11[r12] = r10     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                r11 = 12
                int[] r12 = f23776h     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.moovit.metro.ReportCategoryType r13 = com.moovit.metro.ReportCategoryType.LINE_LATE_DELAY     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r12[r13] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r12 = f23776h     // Catch:{ NoSuchFieldError -> 0x009c }
                com.moovit.metro.ReportCategoryType r13 = com.moovit.metro.ReportCategoryType.LINE_LINE_DIDNT_STOP     // Catch:{ NoSuchFieldError -> 0x009c }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r14 = 13
                r12[r13] = r14     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r12 = f23776h     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.moovit.metro.ReportCategoryType r13 = com.moovit.metro.ReportCategoryType.LINE_OUT_OF_SERVICE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r14 = 14
                r12[r13] = r14     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r12 = f23776h     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.moovit.metro.ReportCategoryType r13 = com.moovit.metro.ReportCategoryType.LINE_CROWDEDNESS     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r14 = 15
                r12[r13] = r14     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r12 = f23776h     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.moovit.metro.ReportCategoryType r13 = com.moovit.metro.ReportCategoryType.LINE_INCIDENT     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r14 = 16
                r12[r13] = r14     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r12 = f23776h     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.moovit.metro.ReportCategoryType r13 = com.moovit.metro.ReportCategoryType.LINE_PLATFORM_CHANGE     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r14 = 17
                r12[r13] = r14     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r12 = f23776h     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.moovit.metro.ReportCategoryType r13 = com.moovit.metro.ReportCategoryType.LINE_DRIVERS_RANK     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r14 = 18
                r12[r13] = r14     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r12 = f23776h     // Catch:{ NoSuchFieldError -> 0x00e4 }
                com.moovit.metro.ReportCategoryType r13 = com.moovit.metro.ReportCategoryType.LINE_ROUTE_CHANGE     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r14 = 19
                r12[r13] = r14     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r12 = f23776h     // Catch:{ NoSuchFieldError -> 0x00f0 }
                com.moovit.metro.ReportCategoryType r13 = com.moovit.metro.ReportCategoryType.LINE_CLEANLINESS     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r14 = 20
                r12[r13] = r14     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r12 = f23776h     // Catch:{ NoSuchFieldError -> 0x00fc }
                com.moovit.metro.ReportCategoryType r13 = com.moovit.metro.ReportCategoryType.LINE_TEMPERATURE     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r14 = 21
                r12[r13] = r14     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r12 = f23776h     // Catch:{ NoSuchFieldError -> 0x0108 }
                com.moovit.metro.ReportCategoryType r13 = com.moovit.metro.ReportCategoryType.LINE_SHAPE_IS_BAD     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r14 = 22
                r12[r13] = r14     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r12 = f23776h     // Catch:{ NoSuchFieldError -> 0x0114 }
                com.moovit.metro.ReportCategoryType r13 = com.moovit.metro.ReportCategoryType.LINE_MISSING     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r14 = 23
                r12[r13] = r14     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType[] r12 = com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType.values()
                int r12 = r12.length
                int[] r12 = new int[r12]
                f23775g = r12
                com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType r13 = com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType.LateDelay     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r12[r13] = r1     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r12 = f23775g     // Catch:{ NoSuchFieldError -> 0x012f }
                com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType r13 = com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType.LineDidntStop     // Catch:{ NoSuchFieldError -> 0x012f }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r12[r13] = r0     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r12 = f23775g     // Catch:{ NoSuchFieldError -> 0x0139 }
                com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType r13 = com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType.LineUutOfService     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r12[r13] = r2     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                int[] r12 = f23775g     // Catch:{ NoSuchFieldError -> 0x0143 }
                com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType r13 = com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType.Crowdedness     // Catch:{ NoSuchFieldError -> 0x0143 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x0143 }
                r12[r13] = r3     // Catch:{ NoSuchFieldError -> 0x0143 }
            L_0x0143:
                int[] r12 = f23775g     // Catch:{ NoSuchFieldError -> 0x014d }
                com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType r13 = com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType.Incident     // Catch:{ NoSuchFieldError -> 0x014d }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x014d }
                r12[r13] = r4     // Catch:{ NoSuchFieldError -> 0x014d }
            L_0x014d:
                int[] r12 = f23775g     // Catch:{ NoSuchFieldError -> 0x0157 }
                com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType r13 = com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType.PlatformChange     // Catch:{ NoSuchFieldError -> 0x0157 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x0157 }
                r12[r13] = r5     // Catch:{ NoSuchFieldError -> 0x0157 }
            L_0x0157:
                int[] r12 = f23775g     // Catch:{ NoSuchFieldError -> 0x0161 }
                com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType r13 = com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType.DriversRank     // Catch:{ NoSuchFieldError -> 0x0161 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x0161 }
                r12[r13] = r6     // Catch:{ NoSuchFieldError -> 0x0161 }
            L_0x0161:
                int[] r12 = f23775g     // Catch:{ NoSuchFieldError -> 0x016b }
                com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType r13 = com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType.RouteChange     // Catch:{ NoSuchFieldError -> 0x016b }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x016b }
                r12[r13] = r7     // Catch:{ NoSuchFieldError -> 0x016b }
            L_0x016b:
                int[] r12 = f23775g     // Catch:{ NoSuchFieldError -> 0x0175 }
                com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType r13 = com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType.Cleanliness     // Catch:{ NoSuchFieldError -> 0x0175 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x0175 }
                r12[r13] = r8     // Catch:{ NoSuchFieldError -> 0x0175 }
            L_0x0175:
                int[] r12 = f23775g     // Catch:{ NoSuchFieldError -> 0x017f }
                com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType r13 = com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType.Tempreture     // Catch:{ NoSuchFieldError -> 0x017f }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x017f }
                r12[r13] = r9     // Catch:{ NoSuchFieldError -> 0x017f }
            L_0x017f:
                int[] r12 = f23775g     // Catch:{ NoSuchFieldError -> 0x0189 }
                com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType r13 = com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType.LineShapeIsBad     // Catch:{ NoSuchFieldError -> 0x0189 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x0189 }
                r12[r13] = r10     // Catch:{ NoSuchFieldError -> 0x0189 }
            L_0x0189:
                int[] r12 = f23775g     // Catch:{ NoSuchFieldError -> 0x0193 }
                com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType r13 = com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType.MissingLine     // Catch:{ NoSuchFieldError -> 0x0193 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x0193 }
                r12[r13] = r11     // Catch:{ NoSuchFieldError -> 0x0193 }
            L_0x0193:
                com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType[] r11 = com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType.values()
                int r11 = r11.length
                int[] r11 = new int[r11]
                f23774f = r11
                com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType r12 = com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType.Crowdedness     // Catch:{ NoSuchFieldError -> 0x01a4 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a4 }
                r11[r12] = r1     // Catch:{ NoSuchFieldError -> 0x01a4 }
            L_0x01a4:
                int[] r11 = f23774f     // Catch:{ NoSuchFieldError -> 0x01ae }
                com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType r12 = com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType.FacilityCondition     // Catch:{ NoSuchFieldError -> 0x01ae }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ae }
                r11[r12] = r0     // Catch:{ NoSuchFieldError -> 0x01ae }
            L_0x01ae:
                int[] r11 = f23774f     // Catch:{ NoSuchFieldError -> 0x01b8 }
                com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType r12 = com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType.Incident     // Catch:{ NoSuchFieldError -> 0x01b8 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b8 }
                r11[r12] = r2     // Catch:{ NoSuchFieldError -> 0x01b8 }
            L_0x01b8:
                int[] r11 = f23774f     // Catch:{ NoSuchFieldError -> 0x01c2 }
                com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType r12 = com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType.Cleanliness     // Catch:{ NoSuchFieldError -> 0x01c2 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c2 }
                r11[r12] = r3     // Catch:{ NoSuchFieldError -> 0x01c2 }
            L_0x01c2:
                int[] r11 = f23774f     // Catch:{ NoSuchFieldError -> 0x01cc }
                com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType r12 = com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType.Happening     // Catch:{ NoSuchFieldError -> 0x01cc }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x01cc }
                r11[r12] = r4     // Catch:{ NoSuchFieldError -> 0x01cc }
            L_0x01cc:
                int[] r11 = f23774f     // Catch:{ NoSuchFieldError -> 0x01d6 }
                com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType r12 = com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType.Other     // Catch:{ NoSuchFieldError -> 0x01d6 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d6 }
                r11[r12] = r5     // Catch:{ NoSuchFieldError -> 0x01d6 }
            L_0x01d6:
                int[] r11 = f23774f     // Catch:{ NoSuchFieldError -> 0x01e0 }
                com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType r12 = com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType.StationMoved     // Catch:{ NoSuchFieldError -> 0x01e0 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e0 }
                r11[r12] = r6     // Catch:{ NoSuchFieldError -> 0x01e0 }
            L_0x01e0:
                int[] r11 = f23774f     // Catch:{ NoSuchFieldError -> 0x01ea }
                com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType r12 = com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType.StationClosed     // Catch:{ NoSuchFieldError -> 0x01ea }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ea }
                r11[r12] = r7     // Catch:{ NoSuchFieldError -> 0x01ea }
            L_0x01ea:
                int[] r11 = f23774f     // Catch:{ NoSuchFieldError -> 0x01f4 }
                com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType r12 = com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType.IncorrectLocation     // Catch:{ NoSuchFieldError -> 0x01f4 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x01f4 }
                r11[r12] = r8     // Catch:{ NoSuchFieldError -> 0x01f4 }
            L_0x01f4:
                int[] r8 = f23774f     // Catch:{ NoSuchFieldError -> 0x01fe }
                com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType r11 = com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType.MissingLine     // Catch:{ NoSuchFieldError -> 0x01fe }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x01fe }
                r8[r11] = r9     // Catch:{ NoSuchFieldError -> 0x01fe }
            L_0x01fe:
                int[] r8 = f23774f     // Catch:{ NoSuchFieldError -> 0x0208 }
                com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType r9 = com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType.DuplicateLine     // Catch:{ NoSuchFieldError -> 0x0208 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0208 }
                r8[r9] = r10     // Catch:{ NoSuchFieldError -> 0x0208 }
            L_0x0208:
                com.tranzmate.moovit.protocol.gtfs.MVLineGroupSummaryType[] r8 = com.tranzmate.moovit.protocol.gtfs.MVLineGroupSummaryType.values()
                int r8 = r8.length
                int[] r8 = new int[r8]
                f23773e = r8
                com.tranzmate.moovit.protocol.gtfs.MVLineGroupSummaryType r9 = com.tranzmate.moovit.protocol.gtfs.MVLineGroupSummaryType.DIRECTIONAL     // Catch:{ NoSuchFieldError -> 0x0219 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0219 }
                r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x0219 }
            L_0x0219:
                int[] r8 = f23773e     // Catch:{ NoSuchFieldError -> 0x0223 }
                com.tranzmate.moovit.protocol.gtfs.MVLineGroupSummaryType r9 = com.tranzmate.moovit.protocol.gtfs.MVLineGroupSummaryType.REGULAR     // Catch:{ NoSuchFieldError -> 0x0223 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0223 }
                r8[r9] = r0     // Catch:{ NoSuchFieldError -> 0x0223 }
            L_0x0223:
                com.tranzmate.moovit.protocol.gtfs.MVPathwayType[] r8 = com.tranzmate.moovit.protocol.gtfs.MVPathwayType.values()
                int r8 = r8.length
                int[] r8 = new int[r8]
                f23772d = r8
                com.tranzmate.moovit.protocol.gtfs.MVPathwayType r9 = com.tranzmate.moovit.protocol.gtfs.MVPathwayType.ENTRANCE     // Catch:{ NoSuchFieldError -> 0x0234 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0234 }
                r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x0234 }
            L_0x0234:
                int[] r8 = f23772d     // Catch:{ NoSuchFieldError -> 0x023e }
                com.tranzmate.moovit.protocol.gtfs.MVPathwayType r9 = com.tranzmate.moovit.protocol.gtfs.MVPathwayType.EXIT     // Catch:{ NoSuchFieldError -> 0x023e }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x023e }
                r8[r9] = r0     // Catch:{ NoSuchFieldError -> 0x023e }
            L_0x023e:
                int[] r8 = f23772d     // Catch:{ NoSuchFieldError -> 0x0248 }
                com.tranzmate.moovit.protocol.gtfs.MVPathwayType r9 = com.tranzmate.moovit.protocol.gtfs.MVPathwayType.BOTH     // Catch:{ NoSuchFieldError -> 0x0248 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0248 }
                r8[r9] = r2     // Catch:{ NoSuchFieldError -> 0x0248 }
            L_0x0248:
                com.tranzmate.moovit.protocol.common.MVViewType[] r8 = com.tranzmate.moovit.protocol.common.MVViewType.values()
                int r8 = r8.length
                int[] r8 = new int[r8]
                f23771c = r8
                com.tranzmate.moovit.protocol.common.MVViewType r9 = com.tranzmate.moovit.protocol.common.MVViewType.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0259 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0259 }
                r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x0259 }
            L_0x0259:
                int[] r8 = f23771c     // Catch:{ NoSuchFieldError -> 0x0263 }
                com.tranzmate.moovit.protocol.common.MVViewType r9 = com.tranzmate.moovit.protocol.common.MVViewType.TRIPS     // Catch:{ NoSuchFieldError -> 0x0263 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0263 }
                r8[r9] = r0     // Catch:{ NoSuchFieldError -> 0x0263 }
            L_0x0263:
                int[] r8 = f23771c     // Catch:{ NoSuchFieldError -> 0x026d }
                com.tranzmate.moovit.protocol.common.MVViewType r9 = com.tranzmate.moovit.protocol.common.MVViewType.PLATFORMS     // Catch:{ NoSuchFieldError -> 0x026d }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x026d }
                r8[r9] = r2     // Catch:{ NoSuchFieldError -> 0x026d }
            L_0x026d:
                com.moovit.transit.TransitType$VehicleType[] r8 = com.moovit.transit.TransitType.VehicleType.values()
                int r8 = r8.length
                int[] r8 = new int[r8]
                f23770b = r8
                com.moovit.transit.TransitType$VehicleType r9 = com.moovit.transit.TransitType.VehicleType.TRAM     // Catch:{ NoSuchFieldError -> 0x027e }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x027e }
                r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x027e }
            L_0x027e:
                int[] r8 = f23770b     // Catch:{ NoSuchFieldError -> 0x0288 }
                com.moovit.transit.TransitType$VehicleType r9 = com.moovit.transit.TransitType.VehicleType.SUBWAY     // Catch:{ NoSuchFieldError -> 0x0288 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0288 }
                r8[r9] = r0     // Catch:{ NoSuchFieldError -> 0x0288 }
            L_0x0288:
                int[] r8 = f23770b     // Catch:{ NoSuchFieldError -> 0x0292 }
                com.moovit.transit.TransitType$VehicleType r9 = com.moovit.transit.TransitType.VehicleType.TRAIN     // Catch:{ NoSuchFieldError -> 0x0292 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0292 }
                r8[r9] = r2     // Catch:{ NoSuchFieldError -> 0x0292 }
            L_0x0292:
                int[] r8 = f23770b     // Catch:{ NoSuchFieldError -> 0x029c }
                com.moovit.transit.TransitType$VehicleType r9 = com.moovit.transit.TransitType.VehicleType.BUS     // Catch:{ NoSuchFieldError -> 0x029c }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x029c }
                r8[r9] = r3     // Catch:{ NoSuchFieldError -> 0x029c }
            L_0x029c:
                int[] r8 = f23770b     // Catch:{ NoSuchFieldError -> 0x02a6 }
                com.moovit.transit.TransitType$VehicleType r9 = com.moovit.transit.TransitType.VehicleType.FERRY     // Catch:{ NoSuchFieldError -> 0x02a6 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x02a6 }
                r8[r9] = r4     // Catch:{ NoSuchFieldError -> 0x02a6 }
            L_0x02a6:
                int[] r8 = f23770b     // Catch:{ NoSuchFieldError -> 0x02b0 }
                com.moovit.transit.TransitType$VehicleType r9 = com.moovit.transit.TransitType.VehicleType.CABLE     // Catch:{ NoSuchFieldError -> 0x02b0 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x02b0 }
                r8[r9] = r5     // Catch:{ NoSuchFieldError -> 0x02b0 }
            L_0x02b0:
                int[] r8 = f23770b     // Catch:{ NoSuchFieldError -> 0x02ba }
                com.moovit.transit.TransitType$VehicleType r9 = com.moovit.transit.TransitType.VehicleType.GONDOLA     // Catch:{ NoSuchFieldError -> 0x02ba }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x02ba }
                r8[r9] = r6     // Catch:{ NoSuchFieldError -> 0x02ba }
            L_0x02ba:
                int[] r8 = f23770b     // Catch:{ NoSuchFieldError -> 0x02c4 }
                com.moovit.transit.TransitType$VehicleType r9 = com.moovit.transit.TransitType.VehicleType.FUNICULAR     // Catch:{ NoSuchFieldError -> 0x02c4 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x02c4 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x02c4 }
            L_0x02c4:
                com.tranzmate.moovit.protocol.common.MVRouteType[] r8 = com.tranzmate.moovit.protocol.common.MVRouteType.values()
                int r8 = r8.length
                int[] r8 = new int[r8]
                f23769a = r8
                com.tranzmate.moovit.protocol.common.MVRouteType r9 = com.tranzmate.moovit.protocol.common.MVRouteType.Tram     // Catch:{ NoSuchFieldError -> 0x02d5 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x02d5 }
                r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x02d5 }
            L_0x02d5:
                int[] r1 = f23769a     // Catch:{ NoSuchFieldError -> 0x02df }
                com.tranzmate.moovit.protocol.common.MVRouteType r8 = com.tranzmate.moovit.protocol.common.MVRouteType.Subway     // Catch:{ NoSuchFieldError -> 0x02df }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x02df }
                r1[r8] = r0     // Catch:{ NoSuchFieldError -> 0x02df }
            L_0x02df:
                int[] r0 = f23769a     // Catch:{ NoSuchFieldError -> 0x02e9 }
                com.tranzmate.moovit.protocol.common.MVRouteType r1 = com.tranzmate.moovit.protocol.common.MVRouteType.Rail     // Catch:{ NoSuchFieldError -> 0x02e9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02e9 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02e9 }
            L_0x02e9:
                int[] r0 = f23769a     // Catch:{ NoSuchFieldError -> 0x02f3 }
                com.tranzmate.moovit.protocol.common.MVRouteType r1 = com.tranzmate.moovit.protocol.common.MVRouteType.Bus     // Catch:{ NoSuchFieldError -> 0x02f3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02f3 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x02f3 }
            L_0x02f3:
                int[] r0 = f23769a     // Catch:{ NoSuchFieldError -> 0x02fd }
                com.tranzmate.moovit.protocol.common.MVRouteType r1 = com.tranzmate.moovit.protocol.common.MVRouteType.Ferry     // Catch:{ NoSuchFieldError -> 0x02fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02fd }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x02fd }
            L_0x02fd:
                int[] r0 = f23769a     // Catch:{ NoSuchFieldError -> 0x0307 }
                com.tranzmate.moovit.protocol.common.MVRouteType r1 = com.tranzmate.moovit.protocol.common.MVRouteType.Cable     // Catch:{ NoSuchFieldError -> 0x0307 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0307 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0307 }
            L_0x0307:
                int[] r0 = f23769a     // Catch:{ NoSuchFieldError -> 0x0311 }
                com.tranzmate.moovit.protocol.common.MVRouteType r1 = com.tranzmate.moovit.protocol.common.MVRouteType.Gondola     // Catch:{ NoSuchFieldError -> 0x0311 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0311 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0311 }
            L_0x0311:
                int[] r0 = f23769a     // Catch:{ NoSuchFieldError -> 0x031b }
                com.tranzmate.moovit.protocol.common.MVRouteType r1 = com.tranzmate.moovit.protocol.common.MVRouteType.Funicular     // Catch:{ NoSuchFieldError -> 0x031b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x031b }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x031b }
            L_0x031b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.transit.C7841a.C7842a.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e3 A[LOOP:2: B:31:0x00dd->B:33:0x00e3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g30.C4776h m17863a(com.tranzmate.moovit.protocol.gtfs.MVMetroAreaData r24) {
        /*
            r0 = r24
            int r1 = r0.metroAreaId
            com.moovit.network.model.ServerId r3 = new com.moovit.network.model.ServerId
            r3.<init>(r1)
            long r4 = r0.revisionNumber
            boolean r1 = r24.mo27433s()
            r2 = 0
            if (r1 == 0) goto L_0x001c
            com.tranzmate.moovit.protocol.gtfs.MVMetroLanguage r1 = r0.metroLanguage
            boolean r6 = r1.isDefault
            if (r6 != 0) goto L_0x001c
            java.lang.String r1 = r1.key
            r6 = r1
            goto L_0x001d
        L_0x001c:
            r6 = r2
        L_0x001d:
            java.lang.String r7 = r0.metroAreaName
            java.lang.String r1 = r0.metroClass
            boolean r1 = p977zz.C20964s0.m49090h(r1)
            if (r1 != 0) goto L_0x002a
            java.lang.String r1 = r0.metroClass
            goto L_0x002c
        L_0x002a:
            java.lang.String r1 = "NA"
        L_0x002c:
            r8 = r1
            java.lang.String r1 = r0.timeZone
            java.util.TimeZone r9 = p988j$.util.DesugarTimeZone.getTimeZone(r1)
            java.lang.String r1 = r0.polygon
            com.moovit.commons.geo.Polylon r10 = com.moovit.commons.geo.Polylon.m40195m(r1)
            java.util.List<com.tranzmate.moovit.protocol.gtfs.MVMetroRouteType> r1 = r0.routeTypes
            e0.r0 r11 = new e0.r0
            r12 = 25
            r11.<init>(r12)
            java.util.ArrayList r11 = c00.C13720d.m34273c(r1, r2, r11)
            java.util.List<com.tranzmate.moovit.protocol.gtfs.MVAgency> r1 = r0.agencies
            hq.e r13 = new hq.e
            r14 = 22
            r13.<init>(r14)
            java.util.ArrayList r1 = c00.C13720d.m34273c(r1, r2, r13)
            java.util.List<com.tranzmate.moovit.protocol.gtfs.MVAgency> r13 = r0.agencies
            com.moovit.commons.utils.collections.CollectionHashMap$ArrayListHashMap r14 = new com.moovit.commons.utils.collections.CollectionHashMap$ArrayListHashMap
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x005e:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x00ca
            java.lang.Object r15 = r13.next()
            com.tranzmate.moovit.protocol.gtfs.MVAgency r15 = (com.tranzmate.moovit.protocol.gtfs.MVAgency) r15
            int r12 = r15.agencyId
            com.moovit.network.model.ServerId r2 = new com.moovit.network.model.ServerId
            r2.<init>(r12)
            java.util.List<com.tranzmate.moovit.protocol.presentation.MVPresentationLineTemplate> r12 = r15.presentationLineTemplates
            java.util.Iterator r12 = r12.iterator()
        L_0x0077:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L_0x00c6
            java.lang.Object r15 = r12.next()
            com.tranzmate.moovit.protocol.presentation.MVPresentationLineTemplate r15 = (com.tranzmate.moovit.protocol.presentation.MVPresentationLineTemplate) r15
            r16 = r12
            byte r12 = r15.imageIndex
            r18 = r13
            int r13 = r15.lineTemplateId
            r23 = r1
            com.moovit.network.model.ServerId r1 = new com.moovit.network.model.ServerId
            r1.<init>(r13)
            g20.b r13 = new g20.b
            r13.<init>(r2, r12, r1)
            com.tranzmate.moovit.protocol.presentation.MVPresentationType r1 = r15.presentationType
            int[] r12 = com.moovit.l10n.TemplateProtocol.C16174d.f42158c
            int r1 = r1.ordinal()
            r1 = r12[r1]
            switch(r1) {
                case 1: goto L_0x00b8;
                case 2: goto L_0x00b5;
                case 3: goto L_0x00b2;
                case 4: goto L_0x00af;
                case 5: goto L_0x00ac;
                case 6: goto L_0x00a9;
                case 7: goto L_0x00a6;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            r1 = 0
            goto L_0x00ba
        L_0x00a6:
            com.moovit.l10n.LinePresentationType r1 = com.moovit.l10n.LinePresentationType.LINE_SCHEDULE
            goto L_0x00ba
        L_0x00a9:
            com.moovit.l10n.LinePresentationType r1 = com.moovit.l10n.LinePresentationType.ITINERARY
            goto L_0x00ba
        L_0x00ac:
            com.moovit.l10n.LinePresentationType r1 = com.moovit.l10n.LinePresentationType.NEAR_ME
            goto L_0x00ba
        L_0x00af:
            com.moovit.l10n.LinePresentationType r1 = com.moovit.l10n.LinePresentationType.LINE_NEWS
            goto L_0x00ba
        L_0x00b2:
            com.moovit.l10n.LinePresentationType r1 = com.moovit.l10n.LinePresentationType.RIDE_MODE
            goto L_0x00ba
        L_0x00b5:
            com.moovit.l10n.LinePresentationType r1 = com.moovit.l10n.LinePresentationType.STOP_DETAIL
            goto L_0x00ba
        L_0x00b8:
            com.moovit.l10n.LinePresentationType r1 = com.moovit.l10n.LinePresentationType.LINE_DETAIL
        L_0x00ba:
            if (r1 == 0) goto L_0x00bf
            r14.mo47001a(r1, r13)
        L_0x00bf:
            r12 = r16
            r13 = r18
            r1 = r23
            goto L_0x0077
        L_0x00c6:
            r2 = 0
            r12 = 25
            goto L_0x005e
        L_0x00ca:
            r23 = r1
            java.util.ArrayList r13 = new java.util.ArrayList
            int r1 = r14.size()
            r13.<init>(r1)
            java.util.Set r1 = r14.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x00dd:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00fe
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r12 = r2.getKey()
            com.moovit.l10n.LinePresentationType r12 = (com.moovit.l10n.LinePresentationType) r12
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            g20.f r14 = new g20.f
            r14.<init>(r12, r2)
            r13.add(r14)
            goto L_0x00dd
        L_0x00fe:
            java.util.List<com.tranzmate.moovit.protocol.presentation.MVLineTemplate> r1 = r0.templates
            com.moovit.l10n.TemplateProtocol$a r2 = com.moovit.l10n.TemplateProtocol.f42153a
            r12 = 0
            java.util.ArrayList r14 = c00.C13720d.m34273c(r1, r12, r2)
            java.util.List<com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType> r1 = r0.stopsUserReportCategoryIds
            tt.a r2 = new tt.a
            r15 = 21
            r2.<init>(r15)
            java.util.ArrayList r16 = c00.C13720d.m34273c(r1, r12, r2)
            java.util.List<com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType> r1 = r0.linesUserReportCategoryIds
            vs.e r2 = new vs.e
            r15 = 25
            r2.<init>(r15)
            java.util.ArrayList r15 = c00.C13720d.m34273c(r1, r12, r2)
            com.tranzmate.moovit.protocol.common.MVLatLon r1 = r0.defaultLocation
            com.moovit.commons.geo.LatLonE6 r17 = c70.C13749c.m34322h(r1)
            int r1 = r0.countryId
            com.moovit.network.model.ServerId r2 = new com.moovit.network.model.ServerId
            r18 = r2
            r2.<init>(r1)
            java.lang.String r1 = r0.countryName
            r19 = r1
            java.lang.String r1 = r0.countryCode
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r20 = r1.toUpperCase(r2)
            int r1 = r0.localDayChangeTime
            r21 = r1
            java.util.List<com.tranzmate.moovit.protocol.gtfs.MVBicycleProvider> r0 = r0.bicycleProviders
            a8.l r1 = new a8.l
            r2 = 23
            r1.<init>(r2)
            r2 = 0
            java.util.ArrayList r22 = c00.C13720d.m34273c(r0, r2, r1)
            g30.h r0 = new g30.h
            r2 = r0
            r12 = r23
            r2.<init>(r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.transit.C7841a.m17863a(com.tranzmate.moovit.protocol.gtfs.MVMetroAreaData):g30.h");
    }

    /* renamed from: b */
    public static TransitLineGroup m17864b(MVLineGroupSummary mVLineGroupSummary) {
        int i;
        Color color;
        List<MVSubGroup> list;
        SparseArray sparseArray = new SparseArray();
        if (mVLineGroupSummary.mo27351q() && (list = mVLineGroupSummary.subGroups) != null) {
            for (MVSubGroup next : list) {
                sparseArray.put(next.subGroupId, next.name);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (MVLineSummary next2 : mVLineGroupSummary.lineSummaries) {
            arrayList.add(new TransitLine(new ServerId(next2.lineId), next2.origin, next2.destination, next2.routeLongName, (String) sparseArray.get(next2.subGroupId)));
        }
        ServerId serverId = new ServerId(mVLineGroupSummary.groupId);
        if (C7842a.f23773e[mVLineGroupSummary.type.ordinal()] != 1) {
            i = 1;
        } else {
            i = 2;
        }
        DbEntityRef<TransitAgency> newAgencyRef = DbEntityRef.newAgencyRef(new ServerId(mVLineGroupSummary.agencyId));
        String str = mVLineGroupSummary.lineNumber;
        String str2 = mVLineGroupSummary.caption1;
        String str3 = mVLineGroupSummary.caption2;
        if (mVLineGroupSummary.mo27344i()) {
            int i2 = mVLineGroupSummary.color;
            C20952m0<Integer> m0Var = C13749c.f33838a;
            color = new Color(i2);
        } else {
            color = null;
        }
        C13388b e = C16028g.m40827e(mVLineGroupSummary.imageRefSet);
        List<MVImageReferenceWithoutParamsSetEntry> list2 = mVLineGroupSummary.innerImageIds.images;
        SparseIntArray sparseIntArray = new SparseIntArray(list2.size());
        for (MVImageReferenceWithoutParamsSetEntry next3 : list2) {
            sparseIntArray.append(next3.index, next3.image);
        }
        return new TransitLineGroup(serverId, i, newAgencyRef, str, str2, str3, arrayList, color, e, sparseIntArray);
    }

    /* renamed from: c */
    public static ReportCategoryType m17865c(MVUserReportLineCategoryType mVUserReportLineCategoryType) {
        switch (C7842a.f23775g[mVUserReportLineCategoryType.ordinal()]) {
            case 1:
                return ReportCategoryType.LINE_LATE_DELAY;
            case 2:
                return ReportCategoryType.LINE_LINE_DIDNT_STOP;
            case 3:
                return ReportCategoryType.LINE_OUT_OF_SERVICE;
            case 4:
                return ReportCategoryType.LINE_CROWDEDNESS;
            case 5:
                return ReportCategoryType.LINE_INCIDENT;
            case 6:
                return ReportCategoryType.LINE_PLATFORM_CHANGE;
            case 7:
                return ReportCategoryType.LINE_DRIVERS_RANK;
            case 8:
                return ReportCategoryType.LINE_ROUTE_CHANGE;
            case 9:
                return ReportCategoryType.LINE_CLEANLINESS;
            case 10:
                return ReportCategoryType.LINE_TEMPERATURE;
            case 11:
                return ReportCategoryType.LINE_SHAPE_IS_BAD;
            case 12:
                return ReportCategoryType.LINE_MISSING;
            default:
                throw new IllegalStateException("Unknown line report type: " + mVUserReportLineCategoryType);
        }
    }

    /* renamed from: d */
    public static ArrayList m17866d(C19728f fVar, C19047a aVar, LinkedHashSet linkedHashSet, C6302b bVar, CollectionHashMap.ArrayListHashMap arrayListHashMap, CollectionHashMap.ArrayListHashMap arrayListHashMap2, CollectionHashMap.HashSetHashMap hashSetHashMap, C6302b bVar2, SparseArray sparseArray, CollectionHashMap.HashSetHashMap hashSetHashMap2, C6302b bVar3, C6302b bVar4, ServerIdMap serverIdMap) {
        TripId tripId;
        TimeFrequency timeFrequency;
        ServerId serverId;
        boolean z;
        TransitFrequency transitFrequency;
        CollectionHashMap.ArrayListHashMap arrayListHashMap3;
        TimeZone timeZone = fVar.f50165a.f16131f;
        boolean booleanValue = ((Boolean) aVar.mo51505b(C19053d.f48457I)).booleanValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            TransitPattern transitPattern = (TransitPattern) it.next();
            int i = transitPattern.f23708b.f15142b;
            int f = transitPattern.mo24389f();
            Set set = (Set) hashSetHashMap.get(Integer.valueOf(i));
            if (set == null) {
                set = Collections.emptySet();
            }
            Set set2 = set;
            Set set3 = (Set) hashSetHashMap2.get(Integer.valueOf(i));
            if (set3 == null) {
                set3 = Collections.emptySet();
            }
            Set set4 = set3;
            TreeMap treeMap = new TreeMap();
            HashMap hashMap = new HashMap();
            for (String str : (List) arrayListHashMap.get(Integer.valueOf(i))) {
                HashMap hashMap2 = hashMap;
                Iterator it2 = it;
                LongServerId longServerId = new LongServerId(((Long) bVar.getOrDefault(str, null)).longValue());
                if (booleanValue) {
                    serverId = (ServerId) bVar4.getOrDefault(str, null);
                } else {
                    C6302b bVar5 = bVar4;
                    serverId = null;
                }
                if (serverId != null) {
                    z = booleanValue;
                    transitFrequency = (TransitFrequency) serverIdMap.get(serverId);
                    arrayListHashMap3 = arrayListHashMap2;
                } else {
                    z = booleanValue;
                    ServerIdMap serverIdMap2 = serverIdMap;
                    arrayListHashMap3 = arrayListHashMap2;
                    transitFrequency = null;
                }
                List list = (List) arrayListHashMap3.get(str);
                TripId tripId2 = new TripId(longServerId, ((Long) ((C20944i0) list.get(0)).f52692a).longValue());
                treeMap.put(tripId2, list);
                HashMap hashMap3 = hashMap2;
                hashMap3.put(tripId2, transitFrequency);
                CollectionHashMap.ArrayListHashMap arrayListHashMap4 = arrayListHashMap;
                hashMap = hashMap3;
                booleanValue = z;
                it = it2;
            }
            C6302b bVar6 = bVar;
            boolean z2 = booleanValue;
            Iterator it3 = it;
            HashMap hashMap4 = hashMap;
            ArrayList arrayList2 = new ArrayList(treeMap.size());
            ArrayList arrayList3 = new ArrayList(treeMap.size());
            ArrayList arrayList4 = new ArrayList(treeMap.size());
            ArrayList arrayList5 = new ArrayList(treeMap.size());
            TripId tripId3 = (TripId) treeMap.lastKey();
            for (Map.Entry entry : treeMap.entrySet()) {
                TripId tripId4 = (TripId) entry.getKey();
                boolean equals = tripId4.equals(tripId3);
                DbEntityRef<TransitPattern> newTransitPatternRef = DbEntityRef.newTransitPatternRef(transitPattern);
                HashMap hashMap5 = hashMap4;
                TransitFrequency transitFrequency2 = (TransitFrequency) hashMap4.get(tripId4);
                if (transitFrequency2 != null) {
                    tripId = tripId3;
                    timeFrequency = C7923a.m18006f(timeZone, transitFrequency2, tripId4.f23765c);
                } else {
                    tripId = tripId3;
                    timeFrequency = null;
                }
                long j = tripId4.f23764b.f15137b;
                TimeZone timeZone2 = timeZone;
                ArrayList arrayList6 = arrayList5;
                SparseArray sparseArray2 = sparseArray;
                DbEntityRef dbEntityRef = (DbEntityRef) sparseArray2.get(((Integer) bVar2.getOrDefault(Long.valueOf(j), null)).intValue());
                ArrayList arrayList7 = arrayList;
                TripId tripId5 = tripId4;
                int i2 = f;
                int i3 = f;
                TransitPatternShape transitPatternShape = (TransitPatternShape) bVar3.getOrDefault(Long.valueOf(j), null);
                DbEntityRef<TransitPattern> dbEntityRef2 = newTransitPatternRef;
                HashMap hashMap6 = hashMap5;
                Set set5 = set2;
                ArrayList arrayList8 = arrayList6;
                Schedule schedule = new Schedule(C13720d.m34273c((List) entry.getValue(), (C13722f) null, new C13141d(i2, tripId5, dbEntityRef2, dbEntityRef, timeFrequency, equals)));
                arrayList2.add(tripId5);
                arrayList3.add(schedule);
                ArrayList arrayList9 = arrayList4;
                arrayList9.add(dbEntityRef);
                arrayList8.add(transitPatternShape);
                transitPattern = transitPattern;
                C6302b bVar7 = bVar;
                CollectionHashMap.HashSetHashMap hashSetHashMap3 = hashSetHashMap;
                CollectionHashMap.HashSetHashMap hashSetHashMap4 = hashSetHashMap2;
                arrayList4 = arrayList9;
                arrayList5 = arrayList8;
                hashMap4 = hashMap6;
                tripId3 = tripId;
                timeZone = timeZone2;
                arrayList = arrayList7;
                f = i3;
                set2 = set5;
            }
            TransitPattern transitPattern2 = transitPattern;
            Set set6 = set2;
            ArrayList arrayList10 = arrayList5;
            ArrayList arrayList11 = arrayList;
            arrayList11.add(new TransitPatternTrips(transitPattern, arrayList2, arrayList3, arrayList4, set6, arrayList5, set4));
            it = it3;
            arrayList = arrayList11;
            booleanValue = z2;
            timeZone = timeZone;
        }
        return arrayList;
    }

    /* renamed from: e */
    public static TransitStop m17867e(MVStopMetaData mVStopMetaData) {
        Amenities amenities;
        ServerId serverId = new ServerId(mVStopMetaData.stopId);
        String str = mVStopMetaData.stopName;
        LatLonE6 h = C13749c.m34322h(mVStopMetaData.stopLocation);
        String str2 = mVStopMetaData.stopCode;
        Image g = C16028g.m40829g(mVStopMetaData.image);
        ArrayList<O> c = C13720d.m34273c(mVStopMetaData.platformLines, (C13722f) null, f23767b);
        ArrayList arrayList = new ArrayList();
        C13717b.m34255b(c, arrayList);
        ArrayList<O> c2 = C13720d.m34273c(mVStopMetaData.keyLineIds, (C13722f) null, f23766a);
        ImageSet f = C16028g.m40828f(mVStopMetaData.imageRefSet);
        int size = f.f41813b.size();
        SparseArray sparseArray = new SparseArray(size + 2);
        for (int i = 0; i < size; i++) {
            sparseArray.append(f.f41813b.keyAt(i), f.f41813b.valueAt(i));
        }
        C16284b.m41532r(sparseArray);
        ImageSet imageSet = new ImageSet(sparseArray, false);
        ArrayList<O> c3 = C13720d.m34273c(mVStopMetaData.mvPathways, (C13722f) null, new C2342l(27));
        ArrayList<O> c4 = C13720d.m34273c(C13723g.m34282c(mVStopMetaData.platformLines, f23768c), (C13722f) null, new C18262i(28));
        MVRouteType mVRouteType = mVStopMetaData.routeType;
        if (mVRouteType == null) {
            mVRouteType = MVRouteType.Bus;
        }
        DbEntityRef<TransitType> newTransitTypeRef = DbEntityRef.newTransitTypeRef(new ServerId(mVRouteType.getValue()));
        if (mVStopMetaData.wheelchairAccessible) {
            amenities = new Amenities(1);
        } else {
            amenities = Amenities.m17753b();
        }
        return new TransitStop(serverId, str, h, str2, g, arrayList, c2, imageSet, c3, c4, newTransitTypeRef, amenities);
    }

    /* renamed from: f */
    public static TransitStopPathway m17868f(MVPathway mVPathway) {
        String str;
        ServerId serverId = new ServerId(mVPathway.pathwayId);
        int g = m17869g(mVPathway.type);
        if (mVPathway.mo27472g()) {
            str = mVPathway.name;
        } else {
            str = null;
        }
        return new TransitStopPathway(serverId, g, str, C13749c.m34322h(mVPathway.location));
    }

    /* renamed from: g */
    public static int m17869g(MVPathwayType mVPathwayType) {
        int i = C7842a.f23772d[mVPathwayType.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown transit stop pathway type: " + mVPathwayType);
            }
        }
        return i2;
    }

    /* renamed from: h */
    public static ReportCategoryType m17870h(MVUserReportStopCategoryType mVUserReportStopCategoryType) {
        switch (C7842a.f23774f[mVUserReportStopCategoryType.ordinal()]) {
            case 1:
                return ReportCategoryType.STOP_CROWDEDNESS;
            case 2:
                return ReportCategoryType.STOP_FACILITY_CONDITION;
            case 3:
                return ReportCategoryType.STOP_INCIDENT;
            case 4:
                return ReportCategoryType.STOP_CLEANLINESS;
            case 5:
                return ReportCategoryType.STOP_HAPPENING;
            case 6:
                return ReportCategoryType.STOP_OTHER;
            case 7:
                return ReportCategoryType.STOP_STATION_MOVED;
            case 8:
                return ReportCategoryType.STOP_STATION_CLOSED;
            case 9:
                return ReportCategoryType.STOP_INCORRECT_LOCATION;
            case 10:
                return ReportCategoryType.STOP_MISSING_LINE;
            case 11:
                return ReportCategoryType.STOP_DUPLICATE_LINE;
            default:
                throw new IllegalStateException("Unknown stop report type: " + mVUserReportStopCategoryType);
        }
    }

    /* renamed from: i */
    public static MVUserReportCategoryType m17871i(ReportCategoryType reportCategoryType) {
        switch (C7842a.f23776h[reportCategoryType.ordinal()]) {
            case 1:
                return MVUserReportCategoryType.m19935p(MVUserReportStopCategoryType.Crowdedness);
            case 2:
                return MVUserReportCategoryType.m19935p(MVUserReportStopCategoryType.FacilityCondition);
            case 3:
                return MVUserReportCategoryType.m19935p(MVUserReportStopCategoryType.Incident);
            case 4:
                return MVUserReportCategoryType.m19935p(MVUserReportStopCategoryType.Cleanliness);
            case 5:
                return MVUserReportCategoryType.m19935p(MVUserReportStopCategoryType.Happening);
            case 6:
                return MVUserReportCategoryType.m19935p(MVUserReportStopCategoryType.Other);
            case 7:
                return MVUserReportCategoryType.m19935p(MVUserReportStopCategoryType.StationMoved);
            case 8:
                return MVUserReportCategoryType.m19935p(MVUserReportStopCategoryType.StationClosed);
            case 9:
                return MVUserReportCategoryType.m19935p(MVUserReportStopCategoryType.IncorrectLocation);
            case 10:
                return MVUserReportCategoryType.m19935p(MVUserReportStopCategoryType.MissingLine);
            case 11:
                return MVUserReportCategoryType.m19935p(MVUserReportStopCategoryType.DuplicateLine);
            case 12:
                return MVUserReportCategoryType.m19934o(MVUserReportLineCategoryType.LateDelay);
            case 13:
                return MVUserReportCategoryType.m19934o(MVUserReportLineCategoryType.LineDidntStop);
            case 14:
                return MVUserReportCategoryType.m19934o(MVUserReportLineCategoryType.LineUutOfService);
            case 15:
                return MVUserReportCategoryType.m19934o(MVUserReportLineCategoryType.Crowdedness);
            case 16:
                return MVUserReportCategoryType.m19934o(MVUserReportLineCategoryType.Incident);
            case 17:
                return MVUserReportCategoryType.m19934o(MVUserReportLineCategoryType.PlatformChange);
            case 18:
                return MVUserReportCategoryType.m19934o(MVUserReportLineCategoryType.DriversRank);
            case 19:
                return MVUserReportCategoryType.m19934o(MVUserReportLineCategoryType.RouteChange);
            case 20:
                return MVUserReportCategoryType.m19934o(MVUserReportLineCategoryType.Cleanliness);
            case 21:
                return MVUserReportCategoryType.m19934o(MVUserReportLineCategoryType.Tempreture);
            case 22:
                return MVUserReportCategoryType.m19934o(MVUserReportLineCategoryType.LineShapeIsBad);
            case 23:
                return MVUserReportCategoryType.m19934o(MVUserReportLineCategoryType.MissingLine);
            default:
                throw new IllegalStateException("Unknown report type: " + reportCategoryType);
        }
    }

    /* renamed from: j */
    public static MVPathwayType m17872j(int i) {
        if (i == 1) {
            return MVPathwayType.ENTRANCE;
        }
        if (i == 2) {
            return MVPathwayType.EXIT;
        }
        if (i == 3) {
            return MVPathwayType.BOTH;
        }
        throw new IllegalArgumentException(C16759e.m42349e("Unknown transit stop pathway type: ", i));
    }

    /* renamed from: k */
    public static MVRouteType m17873k(TransitType.VehicleType vehicleType) {
        switch (C7842a.f23770b[vehicleType.ordinal()]) {
            case 1:
                return MVRouteType.Tram;
            case 2:
                return MVRouteType.Subway;
            case 3:
                return MVRouteType.Rail;
            case 4:
                return MVRouteType.Bus;
            case 5:
                return MVRouteType.Ferry;
            case 6:
                return MVRouteType.Cable;
            case 7:
                return MVRouteType.Gondola;
            case 8:
                return MVRouteType.Funicular;
            default:
                throw new BadResponseException("Unknown vehicle type: " + vehicleType);
        }
    }
}
