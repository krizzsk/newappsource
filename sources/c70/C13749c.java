package c70;

import android.content.Context;
import android.content.res.Resources;
import android.location.Location;
import android.net.Uri;
import android.util.DisplayMetrics;
import c00.C13720d;
import c00.C13722f;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.Color;
import com.moovit.commons.utils.LinkedText;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.moovit.inputfields.InputField;
import com.moovit.inputfields.InputFieldType;
import com.moovit.inputfields.InputFieldValue;
import com.moovit.metro.selection.MetroArea;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.user.LocaleInfo;
import com.moovit.util.ColorScheme;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.InfoBoxData;
import com.moovit.util.PriceInfo;
import com.moovit.util.StyledText;
import com.moovit.view.address.Address;
import com.tranzmate.moovit.protocol.carpool.MVCarPoolPrice;
import com.tranzmate.moovit.protocol.clienttexts.MVClientText;
import com.tranzmate.moovit.protocol.common.MVAccessory;
import com.tranzmate.moovit.protocol.common.MVClientColorScheme;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.common.MVExternalAppData;
import com.tranzmate.moovit.protocol.common.MVGpsLocation;
import com.tranzmate.moovit.protocol.common.MVInfoBoxData;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.tranzmate.moovit.protocol.common.MVLinkedText;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
import com.tranzmate.moovit.protocol.common.MVLocationType;
import com.tranzmate.moovit.protocol.common.MVPriceInfo;
import com.tranzmate.moovit.protocol.common.MVSiteSource;
import com.tranzmate.moovit.protocol.common.MVTextOrImage;
import com.tranzmate.moovit.protocol.common.MVUserAddress;
import com.tranzmate.moovit.protocol.payments.MVInputField;
import com.tranzmate.moovit.protocol.payments.MVInputFieldType;
import com.tranzmate.moovit.protocol.payments.MVInputFieldValue;
import com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType;
import com.tranzmate.moovit.protocol.users.MVClientResolution;
import com.tranzmate.moovit.protocol.users.MVLocale;
import com.tranzmate.moovit.protocol.users.MVMetroArea;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p001a0.C0016g;
import p066e0.C4454r0;
import p435de.C16596f;
import p622kz.C18163e;
import p824tp.C19746x;
import p977zz.C20950l0;
import p977zz.C20952m0;
import p977zz.C20964s0;
import x00.C20440a;

/* renamed from: c70.c */
public final class C13749c {

    /* renamed from: a */
    public static final C20952m0<Integer> f33838a;

    /* renamed from: c70.c$a */
    public static /* synthetic */ class C13750a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33839a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f33840b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f33841c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f33842d;

        /* renamed from: e */
        public static final /* synthetic */ int[] f33843e;

        /* renamed from: f */
        public static final /* synthetic */ int[] f33844f;

        /* renamed from: g */
        public static final /* synthetic */ int[] f33845g;

        /* renamed from: h */
        public static final /* synthetic */ int[] f33846h;

        /* renamed from: i */
        public static final /* synthetic */ int[] f33847i;

        /* renamed from: j */
        public static final /* synthetic */ int[] f33848j;

        /* renamed from: k */
        public static final /* synthetic */ int[] f33849k;

        /* renamed from: l */
        public static final /* synthetic */ int[] f33850l;

        /* JADX WARNING: Can't wrap try/catch for region: R(160:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|(2:53|54)|55|57|58|59|60|61|62|63|64|65|66|67|68|(2:69|70)|71|73|74|75|76|77|78|79|80|81|82|83|84|85|86|(2:87|88)|89|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|(2:105|106)|107|109|110|111|112|113|114|115|116|(2:117|118)|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|(2:135|136)|137|139|140|(2:141|142)|143|145|146|147|148|149|150|151|152|153|154|155|156|157|158|(2:159|160)|161|163|164|165|166|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|191|192|193|194|(3:195|196|198)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(162:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|(2:53|54)|55|57|58|59|60|61|62|63|64|65|66|67|68|(2:69|70)|71|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|(2:105|106)|107|109|110|111|112|113|114|115|116|(2:117|118)|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|(2:135|136)|137|139|140|141|142|143|145|146|147|148|149|150|151|152|153|154|155|156|157|158|(2:159|160)|161|163|164|165|166|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|191|192|193|194|(3:195|196|198)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(163:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|(2:53|54)|55|57|58|59|60|61|62|63|64|65|66|67|68|(2:69|70)|71|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|(2:105|106)|107|109|110|111|112|113|114|115|116|(2:117|118)|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|139|140|141|142|143|145|146|147|148|149|150|151|152|153|154|155|156|157|158|(2:159|160)|161|163|164|165|166|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|191|192|193|194|(3:195|196|198)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(166:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|(2:69|70)|71|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|109|110|111|112|113|114|115|116|(2:117|118)|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|139|140|141|142|143|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|163|164|165|166|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|191|192|193|194|(3:195|196|198)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(167:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|(2:69|70)|71|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|109|110|111|112|113|114|115|116|(2:117|118)|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|139|140|141|142|143|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|163|164|165|166|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|191|192|193|194|(3:195|196|198)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(168:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|(2:69|70)|71|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|109|110|111|112|113|114|115|116|(2:117|118)|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|139|140|141|142|143|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|163|164|165|166|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|191|192|193|194|(3:195|196|198)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(169:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|(2:69|70)|71|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|109|110|111|112|113|114|115|116|(2:117|118)|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|139|140|141|142|143|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|163|164|165|166|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|191|192|193|194|(3:195|196|198)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(171:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|(2:69|70)|71|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|109|110|111|112|113|114|115|116|(2:117|118)|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|139|140|141|142|143|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|181|182|183|184|185|186|187|188|189|190|191|192|193|194|(3:195|196|198)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(174:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|91|92|93|94|95|97|98|99|100|101|102|103|104|105|106|107|109|110|111|112|113|114|115|116|(2:117|118)|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|139|140|141|142|143|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|181|182|183|184|185|186|187|188|189|190|191|192|193|194|(3:195|196|198)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(175:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|91|92|93|94|95|97|98|99|100|101|102|103|104|105|106|107|109|110|111|112|113|114|115|116|(2:117|118)|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|139|140|141|142|143|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|181|182|183|184|185|186|187|188|189|190|191|192|193|194|(3:195|196|198)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(176:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|91|92|93|94|95|97|98|99|100|101|102|103|104|105|106|107|109|110|111|112|113|114|115|116|(2:117|118)|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|139|140|141|142|143|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|181|182|183|184|185|186|187|188|189|190|191|192|193|194|(3:195|196|198)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(178:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|91|92|93|94|95|97|98|99|100|101|102|103|104|105|106|107|109|110|111|112|113|114|115|116|117|118|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|139|140|141|142|143|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|181|182|183|184|185|186|187|188|189|190|191|192|193|194|(3:195|196|198)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(180:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|91|92|93|94|95|97|98|99|100|101|102|103|104|105|106|107|109|110|111|112|113|114|115|116|117|118|119|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|139|140|141|142|143|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|181|182|183|184|185|186|187|188|189|190|191|192|193|194|195|196|198) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x01bd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x01c7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x01d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x01ec */
        /* JADX WARNING: Missing exception handler attribute for start block: B:113:0x01f6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x0200 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x020a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x0225 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:125:0x022f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:127:0x0239 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x0243 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x024d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x0257 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:135:0x0261 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:141:0x027c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x0297 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:149:0x02a1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:151:0x02ab */
        /* JADX WARNING: Missing exception handler attribute for start block: B:153:0x02b5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:155:0x02bf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:157:0x02c9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:159:0x02d3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:165:0x02ee */
        /* JADX WARNING: Missing exception handler attribute for start block: B:167:0x02f8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:169:0x0302 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:171:0x030c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:173:0x0316 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:175:0x0320 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:177:0x032a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:183:0x0345 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:185:0x034f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:187:0x0359 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:189:0x0363 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:191:0x036d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:193:0x0377 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:195:0x0381 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0097 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00bc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00c6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00d0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00eb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00f5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x00ff */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0109 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0113 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x011d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0133 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x013f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x014b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0157 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0163 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x016f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x017b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0198 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x01b3 */
        static {
            /*
                j$.time.DayOfWeek[] r0 = p988j$.time.DayOfWeek.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33850l = r0
                r1 = 1
                j$.time.DayOfWeek r2 = p988j$.time.DayOfWeek.SUNDAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f33850l     // Catch:{ NoSuchFieldError -> 0x001d }
                j$.time.DayOfWeek r3 = p988j$.time.DayOfWeek.MONDAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f33850l     // Catch:{ NoSuchFieldError -> 0x0028 }
                j$.time.DayOfWeek r4 = p988j$.time.DayOfWeek.TUESDAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f33850l     // Catch:{ NoSuchFieldError -> 0x0033 }
                j$.time.DayOfWeek r5 = p988j$.time.DayOfWeek.WEDNESDAY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f33850l     // Catch:{ NoSuchFieldError -> 0x003e }
                j$.time.DayOfWeek r6 = p988j$.time.DayOfWeek.THURSDAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f33850l     // Catch:{ NoSuchFieldError -> 0x0049 }
                j$.time.DayOfWeek r7 = p988j$.time.DayOfWeek.FRIDAY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f33850l     // Catch:{ NoSuchFieldError -> 0x0054 }
                j$.time.DayOfWeek r8 = p988j$.time.DayOfWeek.SATURDAY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                com.tranzmate.moovit.protocol.common.MVDayOfWeek[] r7 = com.tranzmate.moovit.protocol.common.MVDayOfWeek.values()
                int r7 = r7.length
                int[] r7 = new int[r7]
                f33849k = r7
                com.tranzmate.moovit.protocol.common.MVDayOfWeek r8 = com.tranzmate.moovit.protocol.common.MVDayOfWeek.SUNDAY     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r7[r8] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                int[] r7 = f33849k     // Catch:{ NoSuchFieldError -> 0x006f }
                com.tranzmate.moovit.protocol.common.MVDayOfWeek r8 = com.tranzmate.moovit.protocol.common.MVDayOfWeek.MONDAY     // Catch:{ NoSuchFieldError -> 0x006f }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r7[r8] = r0     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r7 = f33849k     // Catch:{ NoSuchFieldError -> 0x0079 }
                com.tranzmate.moovit.protocol.common.MVDayOfWeek r8 = com.tranzmate.moovit.protocol.common.MVDayOfWeek.TUESDAY     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r7[r8] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r7 = f33849k     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.tranzmate.moovit.protocol.common.MVDayOfWeek r8 = com.tranzmate.moovit.protocol.common.MVDayOfWeek.WEDNESDAY     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r7[r8] = r3     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r7 = f33849k     // Catch:{ NoSuchFieldError -> 0x008d }
                com.tranzmate.moovit.protocol.common.MVDayOfWeek r8 = com.tranzmate.moovit.protocol.common.MVDayOfWeek.THURSDAY     // Catch:{ NoSuchFieldError -> 0x008d }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r7[r8] = r4     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                int[] r7 = f33849k     // Catch:{ NoSuchFieldError -> 0x0097 }
                com.tranzmate.moovit.protocol.common.MVDayOfWeek r8 = com.tranzmate.moovit.protocol.common.MVDayOfWeek.FRIDAY     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r7[r8] = r5     // Catch:{ NoSuchFieldError -> 0x0097 }
            L_0x0097:
                int[] r7 = f33849k     // Catch:{ NoSuchFieldError -> 0x00a1 }
                com.tranzmate.moovit.protocol.common.MVDayOfWeek r8 = com.tranzmate.moovit.protocol.common.MVDayOfWeek.SATURDAY     // Catch:{ NoSuchFieldError -> 0x00a1 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a1 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x00a1 }
            L_0x00a1:
                com.tranzmate.moovit.protocol.payments.MVInputFieldType[] r7 = com.tranzmate.moovit.protocol.payments.MVInputFieldType.values()
                int r7 = r7.length
                int[] r7 = new int[r7]
                f33848j = r7
                com.tranzmate.moovit.protocol.payments.MVInputFieldType r8 = com.tranzmate.moovit.protocol.payments.MVInputFieldType.USERNAME     // Catch:{ NoSuchFieldError -> 0x00b2 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b2 }
                r7[r8] = r1     // Catch:{ NoSuchFieldError -> 0x00b2 }
            L_0x00b2:
                int[] r7 = f33848j     // Catch:{ NoSuchFieldError -> 0x00bc }
                com.tranzmate.moovit.protocol.payments.MVInputFieldType r8 = com.tranzmate.moovit.protocol.payments.MVInputFieldType.EMAIL     // Catch:{ NoSuchFieldError -> 0x00bc }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bc }
                r7[r8] = r0     // Catch:{ NoSuchFieldError -> 0x00bc }
            L_0x00bc:
                int[] r7 = f33848j     // Catch:{ NoSuchFieldError -> 0x00c6 }
                com.tranzmate.moovit.protocol.payments.MVInputFieldType r8 = com.tranzmate.moovit.protocol.payments.MVInputFieldType.PASSWORD     // Catch:{ NoSuchFieldError -> 0x00c6 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c6 }
                r7[r8] = r2     // Catch:{ NoSuchFieldError -> 0x00c6 }
            L_0x00c6:
                int[] r7 = f33848j     // Catch:{ NoSuchFieldError -> 0x00d0 }
                com.tranzmate.moovit.protocol.payments.MVInputFieldType r8 = com.tranzmate.moovit.protocol.payments.MVInputFieldType.TEXT     // Catch:{ NoSuchFieldError -> 0x00d0 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d0 }
                r7[r8] = r3     // Catch:{ NoSuchFieldError -> 0x00d0 }
            L_0x00d0:
                int[] r7 = f33848j     // Catch:{ NoSuchFieldError -> 0x00da }
                com.tranzmate.moovit.protocol.payments.MVInputFieldType r8 = com.tranzmate.moovit.protocol.payments.MVInputFieldType.NUMBER     // Catch:{ NoSuchFieldError -> 0x00da }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00da }
                r7[r8] = r4     // Catch:{ NoSuchFieldError -> 0x00da }
            L_0x00da:
                com.tranzmate.moovit.protocol.common.MVClientColorScheme[] r7 = com.tranzmate.moovit.protocol.common.MVClientColorScheme.values()
                int r7 = r7.length
                int[] r7 = new int[r7]
                f33847i = r7
                com.tranzmate.moovit.protocol.common.MVClientColorScheme r8 = com.tranzmate.moovit.protocol.common.MVClientColorScheme.PRIMARY     // Catch:{ NoSuchFieldError -> 0x00eb }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00eb }
                r7[r8] = r1     // Catch:{ NoSuchFieldError -> 0x00eb }
            L_0x00eb:
                int[] r7 = f33847i     // Catch:{ NoSuchFieldError -> 0x00f5 }
                com.tranzmate.moovit.protocol.common.MVClientColorScheme r8 = com.tranzmate.moovit.protocol.common.MVClientColorScheme.SECONDARY     // Catch:{ NoSuchFieldError -> 0x00f5 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f5 }
                r7[r8] = r0     // Catch:{ NoSuchFieldError -> 0x00f5 }
            L_0x00f5:
                int[] r7 = f33847i     // Catch:{ NoSuchFieldError -> 0x00ff }
                com.tranzmate.moovit.protocol.common.MVClientColorScheme r8 = com.tranzmate.moovit.protocol.common.MVClientColorScheme.TERTIARY     // Catch:{ NoSuchFieldError -> 0x00ff }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ff }
                r7[r8] = r2     // Catch:{ NoSuchFieldError -> 0x00ff }
            L_0x00ff:
                int[] r7 = f33847i     // Catch:{ NoSuchFieldError -> 0x0109 }
                com.tranzmate.moovit.protocol.common.MVClientColorScheme r8 = com.tranzmate.moovit.protocol.common.MVClientColorScheme.GOOD     // Catch:{ NoSuchFieldError -> 0x0109 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0109 }
                r7[r8] = r3     // Catch:{ NoSuchFieldError -> 0x0109 }
            L_0x0109:
                int[] r7 = f33847i     // Catch:{ NoSuchFieldError -> 0x0113 }
                com.tranzmate.moovit.protocol.common.MVClientColorScheme r8 = com.tranzmate.moovit.protocol.common.MVClientColorScheme.PROBLEM     // Catch:{ NoSuchFieldError -> 0x0113 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0113 }
                r7[r8] = r4     // Catch:{ NoSuchFieldError -> 0x0113 }
            L_0x0113:
                int[] r7 = f33847i     // Catch:{ NoSuchFieldError -> 0x011d }
                com.tranzmate.moovit.protocol.common.MVClientColorScheme r8 = com.tranzmate.moovit.protocol.common.MVClientColorScheme.CRITICAL     // Catch:{ NoSuchFieldError -> 0x011d }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x011d }
                r7[r8] = r5     // Catch:{ NoSuchFieldError -> 0x011d }
            L_0x011d:
                int[] r7 = f33847i     // Catch:{ NoSuchFieldError -> 0x0127 }
                com.tranzmate.moovit.protocol.common.MVClientColorScheme r8 = com.tranzmate.moovit.protocol.common.MVClientColorScheme.INFO     // Catch:{ NoSuchFieldError -> 0x0127 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0127 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0127 }
            L_0x0127:
                r7 = 8
                int[] r8 = f33847i     // Catch:{ NoSuchFieldError -> 0x0133 }
                com.tranzmate.moovit.protocol.common.MVClientColorScheme r9 = com.tranzmate.moovit.protocol.common.MVClientColorScheme.ON_SURFACE_EMPHASIS_HIGH     // Catch:{ NoSuchFieldError -> 0x0133 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0133 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0133 }
            L_0x0133:
                int[] r8 = f33847i     // Catch:{ NoSuchFieldError -> 0x013f }
                com.tranzmate.moovit.protocol.common.MVClientColorScheme r9 = com.tranzmate.moovit.protocol.common.MVClientColorScheme.ON_SURFACE_EMPHASIS_MEDIUM     // Catch:{ NoSuchFieldError -> 0x013f }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x013f }
                r10 = 9
                r8[r9] = r10     // Catch:{ NoSuchFieldError -> 0x013f }
            L_0x013f:
                int[] r8 = f33847i     // Catch:{ NoSuchFieldError -> 0x014b }
                com.tranzmate.moovit.protocol.common.MVClientColorScheme r9 = com.tranzmate.moovit.protocol.common.MVClientColorScheme.ON_SURFACE_EMPHASIS_LOW     // Catch:{ NoSuchFieldError -> 0x014b }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x014b }
                r10 = 10
                r8[r9] = r10     // Catch:{ NoSuchFieldError -> 0x014b }
            L_0x014b:
                int[] r8 = f33847i     // Catch:{ NoSuchFieldError -> 0x0157 }
                com.tranzmate.moovit.protocol.common.MVClientColorScheme r9 = com.tranzmate.moovit.protocol.common.MVClientColorScheme.SURFACE_GOOD     // Catch:{ NoSuchFieldError -> 0x0157 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0157 }
                r10 = 11
                r8[r9] = r10     // Catch:{ NoSuchFieldError -> 0x0157 }
            L_0x0157:
                int[] r8 = f33847i     // Catch:{ NoSuchFieldError -> 0x0163 }
                com.tranzmate.moovit.protocol.common.MVClientColorScheme r9 = com.tranzmate.moovit.protocol.common.MVClientColorScheme.SURFACE_PROBLEM     // Catch:{ NoSuchFieldError -> 0x0163 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0163 }
                r10 = 12
                r8[r9] = r10     // Catch:{ NoSuchFieldError -> 0x0163 }
            L_0x0163:
                int[] r8 = f33847i     // Catch:{ NoSuchFieldError -> 0x016f }
                com.tranzmate.moovit.protocol.common.MVClientColorScheme r9 = com.tranzmate.moovit.protocol.common.MVClientColorScheme.SURFACE_CRITICAL     // Catch:{ NoSuchFieldError -> 0x016f }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x016f }
                r10 = 13
                r8[r9] = r10     // Catch:{ NoSuchFieldError -> 0x016f }
            L_0x016f:
                int[] r8 = f33847i     // Catch:{ NoSuchFieldError -> 0x017b }
                com.tranzmate.moovit.protocol.common.MVClientColorScheme r9 = com.tranzmate.moovit.protocol.common.MVClientColorScheme.SURFACE_INFO     // Catch:{ NoSuchFieldError -> 0x017b }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x017b }
                r10 = 14
                r8[r9] = r10     // Catch:{ NoSuchFieldError -> 0x017b }
            L_0x017b:
                int[] r8 = f33847i     // Catch:{ NoSuchFieldError -> 0x0187 }
                com.tranzmate.moovit.protocol.common.MVClientColorScheme r9 = com.tranzmate.moovit.protocol.common.MVClientColorScheme.ON_SURFACE     // Catch:{ NoSuchFieldError -> 0x0187 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0187 }
                r10 = 15
                r8[r9] = r10     // Catch:{ NoSuchFieldError -> 0x0187 }
            L_0x0187:
                com.tranzmate.moovit.protocol.common.MVTextFormat[] r8 = com.tranzmate.moovit.protocol.common.MVTextFormat.values()
                int r8 = r8.length
                int[] r8 = new int[r8]
                f33846h = r8
                com.tranzmate.moovit.protocol.common.MVTextFormat r9 = com.tranzmate.moovit.protocol.common.MVTextFormat.PLAIN     // Catch:{ NoSuchFieldError -> 0x0198 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0198 }
                r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x0198 }
            L_0x0198:
                int[] r8 = f33846h     // Catch:{ NoSuchFieldError -> 0x01a2 }
                com.tranzmate.moovit.protocol.common.MVTextFormat r9 = com.tranzmate.moovit.protocol.common.MVTextFormat.HTML     // Catch:{ NoSuchFieldError -> 0x01a2 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a2 }
                r8[r9] = r0     // Catch:{ NoSuchFieldError -> 0x01a2 }
            L_0x01a2:
                com.moovit.transit.LocationDescriptor$SourceType[] r8 = com.moovit.transit.LocationDescriptor.SourceType.values()
                int r8 = r8.length
                int[] r8 = new int[r8]
                f33845g = r8
                com.moovit.transit.LocationDescriptor$SourceType r9 = com.moovit.transit.LocationDescriptor.SourceType.LOCATION_SEARCH     // Catch:{ NoSuchFieldError -> 0x01b3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b3 }
                r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x01b3 }
            L_0x01b3:
                int[] r8 = f33845g     // Catch:{ NoSuchFieldError -> 0x01bd }
                com.moovit.transit.LocationDescriptor$SourceType r9 = com.moovit.transit.LocationDescriptor.SourceType.TAP_ON_MAP     // Catch:{ NoSuchFieldError -> 0x01bd }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x01bd }
                r8[r9] = r0     // Catch:{ NoSuchFieldError -> 0x01bd }
            L_0x01bd:
                int[] r8 = f33845g     // Catch:{ NoSuchFieldError -> 0x01c7 }
                com.moovit.transit.LocationDescriptor$SourceType r9 = com.moovit.transit.LocationDescriptor.SourceType.EXTERNAL     // Catch:{ NoSuchFieldError -> 0x01c7 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c7 }
                r8[r9] = r2     // Catch:{ NoSuchFieldError -> 0x01c7 }
            L_0x01c7:
                int[] r8 = f33845g     // Catch:{ NoSuchFieldError -> 0x01d1 }
                com.moovit.transit.LocationDescriptor$SourceType r9 = com.moovit.transit.LocationDescriptor.SourceType.GEOCODER     // Catch:{ NoSuchFieldError -> 0x01d1 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d1 }
                r8[r9] = r3     // Catch:{ NoSuchFieldError -> 0x01d1 }
            L_0x01d1:
                int[] r8 = f33845g     // Catch:{ NoSuchFieldError -> 0x01db }
                com.moovit.transit.LocationDescriptor$SourceType r9 = com.moovit.transit.LocationDescriptor.SourceType.USER_LOCATION     // Catch:{ NoSuchFieldError -> 0x01db }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x01db }
                r8[r9] = r4     // Catch:{ NoSuchFieldError -> 0x01db }
            L_0x01db:
                com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType[] r8 = com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType.values()
                int r8 = r8.length
                int[] r8 = new int[r8]
                f33844f = r8
                com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType r9 = com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType.LocationSearch     // Catch:{ NoSuchFieldError -> 0x01ec }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ec }
                r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x01ec }
            L_0x01ec:
                int[] r8 = f33844f     // Catch:{ NoSuchFieldError -> 0x01f6 }
                com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType r9 = com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType.TapOnMap     // Catch:{ NoSuchFieldError -> 0x01f6 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x01f6 }
                r8[r9] = r0     // Catch:{ NoSuchFieldError -> 0x01f6 }
            L_0x01f6:
                int[] r8 = f33844f     // Catch:{ NoSuchFieldError -> 0x0200 }
                com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType r9 = com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType.ExternalRequest     // Catch:{ NoSuchFieldError -> 0x0200 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0200 }
                r8[r9] = r2     // Catch:{ NoSuchFieldError -> 0x0200 }
            L_0x0200:
                int[] r8 = f33844f     // Catch:{ NoSuchFieldError -> 0x020a }
                com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType r9 = com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType.Geocoder     // Catch:{ NoSuchFieldError -> 0x020a }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x020a }
                r8[r9] = r3     // Catch:{ NoSuchFieldError -> 0x020a }
            L_0x020a:
                int[] r8 = f33844f     // Catch:{ NoSuchFieldError -> 0x0214 }
                com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType r9 = com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType.UserLocation     // Catch:{ NoSuchFieldError -> 0x0214 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0214 }
                r8[r9] = r4     // Catch:{ NoSuchFieldError -> 0x0214 }
            L_0x0214:
                com.moovit.transit.LocationDescriptor$LocationType[] r8 = com.moovit.transit.LocationDescriptor.LocationType.values()
                int r8 = r8.length
                int[] r8 = new int[r8]
                f33843e = r8
                com.moovit.transit.LocationDescriptor$LocationType r9 = com.moovit.transit.LocationDescriptor.LocationType.CITY     // Catch:{ NoSuchFieldError -> 0x0225 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0225 }
                r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x0225 }
            L_0x0225:
                int[] r8 = f33843e     // Catch:{ NoSuchFieldError -> 0x022f }
                com.moovit.transit.LocationDescriptor$LocationType r9 = com.moovit.transit.LocationDescriptor.LocationType.STREET     // Catch:{ NoSuchFieldError -> 0x022f }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x022f }
                r8[r9] = r0     // Catch:{ NoSuchFieldError -> 0x022f }
            L_0x022f:
                int[] r8 = f33843e     // Catch:{ NoSuchFieldError -> 0x0239 }
                com.moovit.transit.LocationDescriptor$LocationType r9 = com.moovit.transit.LocationDescriptor.LocationType.POI     // Catch:{ NoSuchFieldError -> 0x0239 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0239 }
                r8[r9] = r2     // Catch:{ NoSuchFieldError -> 0x0239 }
            L_0x0239:
                int[] r8 = f33843e     // Catch:{ NoSuchFieldError -> 0x0243 }
                com.moovit.transit.LocationDescriptor$LocationType r9 = com.moovit.transit.LocationDescriptor.LocationType.EVENT     // Catch:{ NoSuchFieldError -> 0x0243 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0243 }
                r8[r9] = r3     // Catch:{ NoSuchFieldError -> 0x0243 }
            L_0x0243:
                int[] r8 = f33843e     // Catch:{ NoSuchFieldError -> 0x024d }
                com.moovit.transit.LocationDescriptor$LocationType r9 = com.moovit.transit.LocationDescriptor.LocationType.STOP     // Catch:{ NoSuchFieldError -> 0x024d }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x024d }
                r8[r9] = r4     // Catch:{ NoSuchFieldError -> 0x024d }
            L_0x024d:
                int[] r8 = f33843e     // Catch:{ NoSuchFieldError -> 0x0257 }
                com.moovit.transit.LocationDescriptor$LocationType r9 = com.moovit.transit.LocationDescriptor.LocationType.BICYCLE_STOP     // Catch:{ NoSuchFieldError -> 0x0257 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0257 }
                r8[r9] = r5     // Catch:{ NoSuchFieldError -> 0x0257 }
            L_0x0257:
                int[] r8 = f33843e     // Catch:{ NoSuchFieldError -> 0x0261 }
                com.moovit.transit.LocationDescriptor$LocationType r9 = com.moovit.transit.LocationDescriptor.LocationType.COORDINATE     // Catch:{ NoSuchFieldError -> 0x0261 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0261 }
                r8[r9] = r6     // Catch:{ NoSuchFieldError -> 0x0261 }
            L_0x0261:
                int[] r8 = f33843e     // Catch:{ NoSuchFieldError -> 0x026b }
                com.moovit.transit.LocationDescriptor$LocationType r9 = com.moovit.transit.LocationDescriptor.LocationType.CURRENT     // Catch:{ NoSuchFieldError -> 0x026b }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x026b }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x026b }
            L_0x026b:
                com.tranzmate.moovit.protocol.common.MVSiteSource[] r8 = com.tranzmate.moovit.protocol.common.MVSiteSource.values()
                int r8 = r8.length
                int[] r8 = new int[r8]
                f33842d = r8
                com.tranzmate.moovit.protocol.common.MVSiteSource r9 = com.tranzmate.moovit.protocol.common.MVSiteSource.EVENT     // Catch:{ NoSuchFieldError -> 0x027c }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x027c }
                r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x027c }
            L_0x027c:
                int[] r8 = f33842d     // Catch:{ NoSuchFieldError -> 0x0286 }
                com.tranzmate.moovit.protocol.common.MVSiteSource r9 = com.tranzmate.moovit.protocol.common.MVSiteSource.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0286 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0286 }
                r8[r9] = r0     // Catch:{ NoSuchFieldError -> 0x0286 }
            L_0x0286:
                com.tranzmate.moovit.protocol.common.MVLocationType[] r8 = com.tranzmate.moovit.protocol.common.MVLocationType.values()
                int r8 = r8.length
                int[] r8 = new int[r8]
                f33841c = r8
                com.tranzmate.moovit.protocol.common.MVLocationType r9 = com.tranzmate.moovit.protocol.common.MVLocationType.City     // Catch:{ NoSuchFieldError -> 0x0297 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0297 }
                r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x0297 }
            L_0x0297:
                int[] r8 = f33841c     // Catch:{ NoSuchFieldError -> 0x02a1 }
                com.tranzmate.moovit.protocol.common.MVLocationType r9 = com.tranzmate.moovit.protocol.common.MVLocationType.Street     // Catch:{ NoSuchFieldError -> 0x02a1 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x02a1 }
                r8[r9] = r0     // Catch:{ NoSuchFieldError -> 0x02a1 }
            L_0x02a1:
                int[] r8 = f33841c     // Catch:{ NoSuchFieldError -> 0x02ab }
                com.tranzmate.moovit.protocol.common.MVLocationType r9 = com.tranzmate.moovit.protocol.common.MVLocationType.Site     // Catch:{ NoSuchFieldError -> 0x02ab }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x02ab }
                r8[r9] = r2     // Catch:{ NoSuchFieldError -> 0x02ab }
            L_0x02ab:
                int[] r8 = f33841c     // Catch:{ NoSuchFieldError -> 0x02b5 }
                com.tranzmate.moovit.protocol.common.MVLocationType r9 = com.tranzmate.moovit.protocol.common.MVLocationType.Stop     // Catch:{ NoSuchFieldError -> 0x02b5 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x02b5 }
                r8[r9] = r3     // Catch:{ NoSuchFieldError -> 0x02b5 }
            L_0x02b5:
                int[] r8 = f33841c     // Catch:{ NoSuchFieldError -> 0x02bf }
                com.tranzmate.moovit.protocol.common.MVLocationType r9 = com.tranzmate.moovit.protocol.common.MVLocationType.BicycleStop     // Catch:{ NoSuchFieldError -> 0x02bf }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x02bf }
                r8[r9] = r4     // Catch:{ NoSuchFieldError -> 0x02bf }
            L_0x02bf:
                int[] r8 = f33841c     // Catch:{ NoSuchFieldError -> 0x02c9 }
                com.tranzmate.moovit.protocol.common.MVLocationType r9 = com.tranzmate.moovit.protocol.common.MVLocationType.Geocoder     // Catch:{ NoSuchFieldError -> 0x02c9 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x02c9 }
                r8[r9] = r5     // Catch:{ NoSuchFieldError -> 0x02c9 }
            L_0x02c9:
                int[] r8 = f33841c     // Catch:{ NoSuchFieldError -> 0x02d3 }
                com.tranzmate.moovit.protocol.common.MVLocationType r9 = com.tranzmate.moovit.protocol.common.MVLocationType.LatLon     // Catch:{ NoSuchFieldError -> 0x02d3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x02d3 }
                r8[r9] = r6     // Catch:{ NoSuchFieldError -> 0x02d3 }
            L_0x02d3:
                int[] r8 = f33841c     // Catch:{ NoSuchFieldError -> 0x02dd }
                com.tranzmate.moovit.protocol.common.MVLocationType r9 = com.tranzmate.moovit.protocol.common.MVLocationType.UserLocation     // Catch:{ NoSuchFieldError -> 0x02dd }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x02dd }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x02dd }
            L_0x02dd:
                com.tranzmate.moovit.protocol.sync.MVSyncEntityType[] r8 = com.tranzmate.moovit.protocol.sync.MVSyncEntityType.values()
                int r8 = r8.length
                int[] r8 = new int[r8]
                f33840b = r8
                com.tranzmate.moovit.protocol.sync.MVSyncEntityType r9 = com.tranzmate.moovit.protocol.sync.MVSyncEntityType.StopGeographicObjects     // Catch:{ NoSuchFieldError -> 0x02ee }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x02ee }
                r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x02ee }
            L_0x02ee:
                int[] r8 = f33840b     // Catch:{ NoSuchFieldError -> 0x02f8 }
                com.tranzmate.moovit.protocol.sync.MVSyncEntityType r9 = com.tranzmate.moovit.protocol.sync.MVSyncEntityType.BicycleStop     // Catch:{ NoSuchFieldError -> 0x02f8 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x02f8 }
                r8[r9] = r0     // Catch:{ NoSuchFieldError -> 0x02f8 }
            L_0x02f8:
                int[] r8 = f33840b     // Catch:{ NoSuchFieldError -> 0x0302 }
                com.tranzmate.moovit.protocol.sync.MVSyncEntityType r9 = com.tranzmate.moovit.protocol.sync.MVSyncEntityType.LineSummaries     // Catch:{ NoSuchFieldError -> 0x0302 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0302 }
                r8[r9] = r2     // Catch:{ NoSuchFieldError -> 0x0302 }
            L_0x0302:
                int[] r8 = f33840b     // Catch:{ NoSuchFieldError -> 0x030c }
                com.tranzmate.moovit.protocol.sync.MVSyncEntityType r9 = com.tranzmate.moovit.protocol.sync.MVSyncEntityType.LineGroup     // Catch:{ NoSuchFieldError -> 0x030c }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x030c }
                r8[r9] = r3     // Catch:{ NoSuchFieldError -> 0x030c }
            L_0x030c:
                int[] r8 = f33840b     // Catch:{ NoSuchFieldError -> 0x0316 }
                com.tranzmate.moovit.protocol.sync.MVSyncEntityType r9 = com.tranzmate.moovit.protocol.sync.MVSyncEntityType.TripPattern     // Catch:{ NoSuchFieldError -> 0x0316 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0316 }
                r8[r9] = r4     // Catch:{ NoSuchFieldError -> 0x0316 }
            L_0x0316:
                int[] r8 = f33840b     // Catch:{ NoSuchFieldError -> 0x0320 }
                com.tranzmate.moovit.protocol.sync.MVSyncEntityType r9 = com.tranzmate.moovit.protocol.sync.MVSyncEntityType.TripShape     // Catch:{ NoSuchFieldError -> 0x0320 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0320 }
                r8[r9] = r5     // Catch:{ NoSuchFieldError -> 0x0320 }
            L_0x0320:
                int[] r8 = f33840b     // Catch:{ NoSuchFieldError -> 0x032a }
                com.tranzmate.moovit.protocol.sync.MVSyncEntityType r9 = com.tranzmate.moovit.protocol.sync.MVSyncEntityType.LineShapeSegment     // Catch:{ NoSuchFieldError -> 0x032a }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x032a }
                r8[r9] = r6     // Catch:{ NoSuchFieldError -> 0x032a }
            L_0x032a:
                int[] r8 = f33840b     // Catch:{ NoSuchFieldError -> 0x0334 }
                com.tranzmate.moovit.protocol.sync.MVSyncEntityType r9 = com.tranzmate.moovit.protocol.sync.MVSyncEntityType.TripFrequency     // Catch:{ NoSuchFieldError -> 0x0334 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0334 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0334 }
            L_0x0334:
                com.moovit.metroentities.MetroEntityType[] r8 = com.moovit.metroentities.MetroEntityType.values()
                int r8 = r8.length
                int[] r8 = new int[r8]
                f33839a = r8
                com.moovit.metroentities.MetroEntityType r9 = com.moovit.metroentities.MetroEntityType.TRANSIT_STOP     // Catch:{ NoSuchFieldError -> 0x0345 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0345 }
                r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x0345 }
            L_0x0345:
                int[] r1 = f33839a     // Catch:{ NoSuchFieldError -> 0x034f }
                com.moovit.metroentities.MetroEntityType r8 = com.moovit.metroentities.MetroEntityType.BICYCLE_STOP     // Catch:{ NoSuchFieldError -> 0x034f }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x034f }
                r1[r8] = r0     // Catch:{ NoSuchFieldError -> 0x034f }
            L_0x034f:
                int[] r0 = f33839a     // Catch:{ NoSuchFieldError -> 0x0359 }
                com.moovit.metroentities.MetroEntityType r1 = com.moovit.metroentities.MetroEntityType.TRANSIT_LINE     // Catch:{ NoSuchFieldError -> 0x0359 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0359 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0359 }
            L_0x0359:
                int[] r0 = f33839a     // Catch:{ NoSuchFieldError -> 0x0363 }
                com.moovit.metroentities.MetroEntityType r1 = com.moovit.metroentities.MetroEntityType.TRANSIT_LINE_GROUP     // Catch:{ NoSuchFieldError -> 0x0363 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0363 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0363 }
            L_0x0363:
                int[] r0 = f33839a     // Catch:{ NoSuchFieldError -> 0x036d }
                com.moovit.metroentities.MetroEntityType r1 = com.moovit.metroentities.MetroEntityType.TRANSIT_PATTERN     // Catch:{ NoSuchFieldError -> 0x036d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x036d }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x036d }
            L_0x036d:
                int[] r0 = f33839a     // Catch:{ NoSuchFieldError -> 0x0377 }
                com.moovit.metroentities.MetroEntityType r1 = com.moovit.metroentities.MetroEntityType.SHAPE     // Catch:{ NoSuchFieldError -> 0x0377 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0377 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0377 }
            L_0x0377:
                int[] r0 = f33839a     // Catch:{ NoSuchFieldError -> 0x0381 }
                com.moovit.metroentities.MetroEntityType r1 = com.moovit.metroentities.MetroEntityType.SHAPE_SEGMENT     // Catch:{ NoSuchFieldError -> 0x0381 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0381 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0381 }
            L_0x0381:
                int[] r0 = f33839a     // Catch:{ NoSuchFieldError -> 0x038b }
                com.moovit.metroentities.MetroEntityType r1 = com.moovit.metroentities.MetroEntityType.TRANSIT_FREQUENCIES     // Catch:{ NoSuchFieldError -> 0x038b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x038b }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x038b }
            L_0x038b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c70.C13749c.C13750a.<clinit>():void");
        }
    }

    static {
        C20952m0<Integer> m0Var = new C20952m0<>();
        f33838a = m0Var;
        C0016g.m40x(MVClientText.DEFAULT_TRANSIT_TYPE_TRAM, m0Var, C19746x.transit_type_default_tram);
        C0016g.m40x(MVClientText.DEFAULT_TRANSIT_TYPE_SUBWAY, m0Var, C19746x.transit_type_default_subway);
        C0016g.m40x(MVClientText.DEFAULT_TRANSIT_TYPE_RAIL, m0Var, C19746x.transit_type_default_rail);
        C0016g.m40x(MVClientText.DEFAULT_TRANSIT_TYPE_BUS, m0Var, C19746x.transit_type_default_bus);
        C0016g.m40x(MVClientText.DEFAULT_TRANSIT_TYPE_FERRY, m0Var, C19746x.transit_type_default_ferry);
        C0016g.m40x(MVClientText.DEFAULT_TRANSIT_TYPE_CABLE, m0Var, C19746x.transit_type_default_cable);
        C0016g.m40x(MVClientText.DEFAULT_TRANSIT_TYPE_GONDOLA, m0Var, C19746x.transit_type_default_gondola);
        C0016g.m40x(MVClientText.DEFAULT_TRANSIT_TYPE_FUNICULAR, m0Var, C19746x.transit_type_default_funicular);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_SITP, m0Var, C19746x.transit_type_sitp);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_AIR_LINE, m0Var, C19746x.transit_type_air_line);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_AQUABUS, m0Var, C19746x.transit_type_aquabus);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_BART, m0Var, C19746x.transit_type_bart);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_CARMELIT, m0Var, C19746x.transit_type_carmelit);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_CHICAGO_L, m0Var, C19746x.transit_type_chicago_l);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_COLECTIVO, m0Var, C19746x.transit_type_colectivo);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_DLR, m0Var, C19746x.transit_type_dlr);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_LIGHT_TRAIN, m0Var, C19746x.transit_type_light_train);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_LOTACAO, m0Var, C19746x.transit_type_lotacao);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_METRA, m0Var, C19746x.transit_type_metra);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_METRO, m0Var, C19746x.transit_type_metro);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_METRO_VALENCIA, m0Var, C19746x.transit_type_metro_valencia);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_METROCABLE, m0Var, C19746x.transit_type_metrocable);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_NATIONAL_RAIL, m0Var, C19746x.transit_type_national_rail);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_OMNIBUS, m0Var, C19746x.transit_type_omnibus);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_RER, m0Var, C19746x.transit_type_rer);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_RIVER_BUS, m0Var, C19746x.transit_type_river_bus);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_S_BAHN, m0Var, C19746x.transit_type_s_bahn);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_STREETCAR, m0Var, C19746x.transit_type_streetcar);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_SUBTE, m0Var, C19746x.transit_type_subte);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_TRAIN, m0Var, C19746x.transit_type_train);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_TRAMLINK, m0Var, C19746x.transit_type_tramlink);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_TRAMVIA, m0Var, C19746x.transit_type_tramvia);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_TRANSMILENIO, m0Var, C19746x.transit_type_transmilenio);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_TROLEBUS, m0Var, C19746x.transit_type_trolebus);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_TROLLEYBUS, m0Var, C19746x.transit_type_trolleybus);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_TUBE, m0Var, C19746x.transit_type_tube);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_MICRO, m0Var, C19746x.transit_type_micro);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_METRORREY, m0Var, C19746x.transit_type_metrorrey);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_ECOVIA, m0Var, C19746x.transit_type_ecovia);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_BOAT, m0Var, C19746x.transit_type_boat);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_NAVEBUS, m0Var, C19746x.transit_type_navebus);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_MAGLEV, m0Var, C19746x.transit_type_maglev);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_STRASENBAHN, m0Var, C19746x.transit_type_strasenbahn);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_EXECUTIVO, m0Var, C19746x.transit_type_executivo);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_MINIBUS, m0Var, C19746x.transit_type_minibus);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_HIGHSPEED_TRAIN, m0Var, C19746x.transit_type_highspeed_train);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_BRT, m0Var, C19746x.transit_type_brt);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_EXECUTIVE_COACH, m0Var, C19746x.transit_type_executive_coach);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_VAN, m0Var, C19746x.transit_type_van);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_TOURIST_BUS, m0Var, C19746x.transit_type_tourist_bus);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_CATAMARA, m0Var, C19746x.transit_type_catamara);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_MONORAIL, m0Var, C19746x.transit_type_monorail);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_BALSA, m0Var, C19746x.transit_type_balsa);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_VERTICAL_ELEVATOR, m0Var, C19746x.transit_type_vertical_elevator);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_PEOPLE_MOVER, m0Var, C19746x.transit_type_people_mover);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_METROBUS, m0Var, C19746x.transit_type_metrobus);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_DOLMUS_AND_MINIBUS, m0Var, C19746x.transit_type_dolmus_and_minibus);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_SHARE_TAXI, m0Var, C19746x.transit_type_share_taxi);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_SHUTTLE, m0Var, C19746x.transit_type_shuttle);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_MARSHRUTKA, m0Var, C19746x.transit_type_marshrutka);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_MICROBUSES, m0Var, C19746x.transit_type_microbuses);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_ALIMENTADORES, m0Var, C19746x.transit_type_alimentadores);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_SCHNELLBUS, m0Var, C19746x.transit_type_schnellbus);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_SHUTTLE_BUS, m0Var, C19746x.transit_type_shuttle_bus);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_AUTORICKSHAWS, m0Var, C19746x.transit_type_autorickshaws);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_RUFTAXIS, m0Var, C19746x.transit_type_ruftaxis);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_GREEN_MINIBUS, m0Var, C19746x.transit_type_green_minibus);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_RED_MINIBUS, m0Var, C19746x.transit_type_red_minibus);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_MONIT_SHERUT, m0Var, C19746x.transit_type_monit_sherut);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_MRT, m0Var, C19746x.transit_type_mrt);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_ANGKOT, m0Var, C19746x.transit_type_angkot);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_MRT_LRT, m0Var, C19746x.transit_type_mrt_lrt);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_MCD, m0Var, C19746x.transit_type_mcd);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_P2P, m0Var, C19746x.transit_type_p2p);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_UVX, m0Var, C19746x.transit_type_uvx);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_JEEPNEY, m0Var, C19746x.transit_type_jeepney);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_LRT, m0Var, C19746x.transit_type_lrt);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_SONGTHAEW, m0Var, C19746x.transit_type_songthaew);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_MAGLEV_MAGLEV, m0Var, C19746x.transit_type_maglev_maglev);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_ISRAEL_RAILWAYS, m0Var, C19746x.transit_type_israel_railways);
        C0016g.m40x(MVClientText.TRANSIT_TYPE_SKYRAIL, m0Var, C19746x.transit_type_skyrail);
        synchronized (m0Var) {
            m0Var.f52702c = true;
        }
    }

    /* renamed from: a */
    public static AppDeepLink m34315a(MVExternalAppData mVExternalAppData) {
        String str;
        Uri uri = null;
        if (mVExternalAppData.mo26161g()) {
            str = mVExternalAppData.androidApplicationId;
        } else {
            str = null;
        }
        if (C20964s0.m49092j(str)) {
            return null;
        }
        if (!C20964s0.m49090h(mVExternalAppData.androidDeepLink)) {
            uri = Uri.parse(mVExternalAppData.androidDeepLink);
        }
        return new AppDeepLink(str, uri);
    }

    /* renamed from: b */
    public static ColorScheme m34316b(MVClientColorScheme mVClientColorScheme) {
        switch (C13750a.f33847i[mVClientColorScheme.ordinal()]) {
            case 1:
                return ColorScheme.PRIMARY;
            case 2:
                return ColorScheme.SECONDARY;
            case 3:
                return ColorScheme.TERTIARY;
            case 4:
                return ColorScheme.GOOD;
            case 5:
                return ColorScheme.PROBLEM;
            case 6:
                return ColorScheme.CRITICAL;
            case 7:
                return ColorScheme.INFO;
            case 8:
                return ColorScheme.ON_SURFACE_EMPHASIS_HIGH;
            case 9:
                return ColorScheme.ON_SURFACE_EMPHASIS_MEDIUM;
            case 10:
                return ColorScheme.ON_SURFACE_EMPHASIS_LOW;
            case 11:
                return ColorScheme.SURFACE_GOOD;
            case 12:
                return ColorScheme.SURFACE_PROBLEM;
            case 13:
                return ColorScheme.SURFACE_CRITICAL;
            case 14:
                return ColorScheme.SURFACE_INFO;
            default:
                return ColorScheme.ON_SURFACE;
        }
    }

    /* renamed from: c */
    public static CurrencyAmount m34317c(MVCarPoolPrice mVCarPoolPrice) {
        if (mVCarPoolPrice == null) {
            return null;
        }
        return new CurrencyAmount(mVCarPoolPrice.currencyCode, new BigDecimal(mVCarPoolPrice.price).movePointLeft(2));
    }

    /* renamed from: d */
    public static CurrencyAmount m34318d(MVCurrencyAmount mVCurrencyAmount) {
        if (mVCurrencyAmount == null) {
            return null;
        }
        return new CurrencyAmount(mVCurrencyAmount.currencyCode, new BigDecimal(mVCurrencyAmount.balance).movePointLeft(2));
    }

    /* renamed from: e */
    public static C20440a m34319e(MVTextOrImage mVTextOrImage) {
        if (mVTextOrImage.mo26415f()) {
            return new C20440a(C16028g.m40829g(mVTextOrImage.image), (String) null);
        }
        return new C20440a((CharSequence) mVTextOrImage.text, (String) null);
    }

    /* renamed from: f */
    public static InfoBoxData m34320f(MVInfoBoxData mVInfoBoxData) {
        Image image;
        String str;
        String str2 = null;
        if (mVInfoBoxData.mo26284g()) {
            image = C16028g.m40829g(mVInfoBoxData.icon);
        } else {
            image = null;
        }
        if (mVInfoBoxData.mo26287i()) {
            str = mVInfoBoxData.title;
        } else {
            str = null;
        }
        if (mVInfoBoxData.mo26285h()) {
            str2 = mVInfoBoxData.subtitle;
        }
        return new InfoBoxData(image, m34316b(mVInfoBoxData.backgroundColor), str, str2);
    }

    /* renamed from: g */
    public static InputField m34321g(MVInputField mVInputField) {
        InputFieldType inputFieldType;
        String str;
        String str2;
        int i;
        String str3 = mVInputField.f27327id;
        MVInputFieldType mVInputFieldType = mVInputField.type;
        int i2 = C13750a.f33848j[mVInputFieldType.ordinal()];
        if (i2 == 1) {
            inputFieldType = InputFieldType.USERNAME;
        } else if (i2 == 2) {
            inputFieldType = InputFieldType.EMAIL;
        } else if (i2 == 3) {
            inputFieldType = InputFieldType.PASSWORD;
        } else if (i2 == 4) {
            inputFieldType = InputFieldType.TEXT;
        } else if (i2 == 5) {
            inputFieldType = InputFieldType.NUMBER;
        } else {
            throw new IllegalStateException("Unknown input field type: " + mVInputFieldType);
        }
        InputFieldType inputFieldType2 = inputFieldType;
        String str4 = mVInputField.hint;
        String str5 = mVInputField.error;
        if (mVInputField.mo29970k()) {
            str = mVInputField.placeholderText;
        } else {
            str = null;
        }
        if (mVInputField.mo29964f()) {
            str2 = mVInputField.accessibilityText;
        } else {
            str2 = null;
        }
        if (mVInputField.mo29969j()) {
            i = mVInputField.maxCharacters;
        } else {
            i = -1;
        }
        return new InputField(str3, inputFieldType2, str4, str5, str, str2, i);
    }

    /* renamed from: h */
    public static LatLonE6 m34322h(MVLatLon mVLatLon) {
        if (mVLatLon == null) {
            return null;
        }
        return new LatLonE6(mVLatLon.latitude, mVLatLon.longitude);
    }

    /* renamed from: i */
    public static LinkedText m34323i(MVLinkedText mVLinkedText) {
        return new LinkedText(mVLinkedText.format, C13720d.m34273c(mVLinkedText.links, (C13722f) null, new C4454r0(21)));
    }

    /* renamed from: j */
    public static LocationDescriptor m34324j(MVLocationDescriptor mVLocationDescriptor, MVLocationSourceType mVLocationSourceType) {
        LocationDescriptor.LocationType locationType;
        LocationDescriptor.SourceType sourceType;
        ServerId serverId;
        Image image;
        Image image2;
        LatLonE6 latLonE6;
        LatLonE6 latLonE62;
        LocationDescriptor.SourceType sourceType2;
        MVLocationDescriptor mVLocationDescriptor2 = mVLocationDescriptor;
        MVLocationSourceType mVLocationSourceType2 = mVLocationSourceType;
        MVLocationType mVLocationType = mVLocationDescriptor2.type;
        MVSiteSource mVSiteSource = mVLocationDescriptor2.source;
        switch (C13750a.f33841c[mVLocationType.ordinal()]) {
            case 1:
                locationType = LocationDescriptor.LocationType.CITY;
                break;
            case 2:
                locationType = LocationDescriptor.LocationType.STREET;
                break;
            case 3:
                if (mVSiteSource != null) {
                    int i = C13750a.f33842d[mVSiteSource.ordinal()];
                    if (i == 1) {
                        locationType = LocationDescriptor.LocationType.EVENT;
                        break;
                    } else if (i == 2) {
                        locationType = LocationDescriptor.LocationType.POI;
                        break;
                    } else {
                        throw new ApplicationBugException("Unknown location item site type: " + mVSiteSource);
                    }
                } else {
                    locationType = LocationDescriptor.LocationType.POI;
                    break;
                }
            case 4:
                locationType = LocationDescriptor.LocationType.STOP;
                break;
            case 5:
                locationType = LocationDescriptor.LocationType.BICYCLE_STOP;
                break;
            case 6:
            case 7:
                locationType = LocationDescriptor.LocationType.COORDINATE;
                break;
            case 8:
                locationType = LocationDescriptor.LocationType.CURRENT;
                break;
            default:
                throw new ApplicationBugException("Unknown location item type: " + mVLocationType);
        }
        LocationDescriptor.LocationType locationType2 = locationType;
        if (mVLocationSourceType2 == null) {
            sourceType = null;
        } else {
            int i2 = C13750a.f33844f[mVLocationSourceType.ordinal()];
            if (i2 == 1) {
                sourceType2 = LocationDescriptor.SourceType.LOCATION_SEARCH;
            } else if (i2 == 2) {
                sourceType2 = LocationDescriptor.SourceType.TAP_ON_MAP;
            } else if (i2 == 3) {
                sourceType2 = LocationDescriptor.SourceType.EXTERNAL;
            } else if (i2 == 4) {
                sourceType2 = LocationDescriptor.SourceType.GEOCODER;
            } else if (i2 == 5) {
                sourceType2 = LocationDescriptor.SourceType.USER_LOCATION;
            } else {
                throw new ApplicationBugException("Unknown source item type: " + mVLocationSourceType2);
            }
            sourceType = sourceType2;
        }
        LatLonE6 h = m34322h(mVLocationDescriptor2.latlon);
        if (mVLocationDescriptor.mo26322h()) {
            serverId = new ServerId(mVLocationDescriptor2.f25101id);
        } else {
            serverId = null;
        }
        String str = mVLocationDescriptor2.caption;
        String str2 = mVLocationDescriptor2.uid;
        if (mVLocationDescriptor.mo26321g()) {
            image = C16028g.m40829g(mVLocationDescriptor2.icon);
        } else {
            image = null;
        }
        if (mVLocationDescriptor.mo26326k()) {
            image2 = C16028g.m40829g(mVLocationDescriptor2.mapIcon);
        } else {
            image2 = null;
        }
        boolean z = mVLocationDescriptor2.inaccurateLatLon;
        if (z) {
            latLonE6 = null;
        } else {
            latLonE6 = h;
        }
        if (z) {
            latLonE62 = h;
        } else {
            latLonE62 = null;
        }
        return new LocationDescriptor(locationType2, sourceType, serverId, str2, str, (List<C20440a>) null, latLonE6, latLonE62, image, image2);
    }

    /* renamed from: k */
    public static MetroArea m34325k(MVMetroArea mVMetroArea) {
        List<String> list;
        ServerId serverId = new ServerId(mVMetroArea.f30479id);
        String str = mVMetroArea.name;
        if (mVMetroArea.mo35233h()) {
            list = mVMetroArea.keywords;
        } else {
            list = Collections.emptyList();
        }
        return new MetroArea(serverId, str, list);
    }

    /* renamed from: l */
    public static PriceInfo m34326l(MVPriceInfo mVPriceInfo) {
        CurrencyAmount currencyAmount;
        String str;
        CurrencyAmount d = m34318d(mVPriceInfo.price);
        if (mVPriceInfo.mo26350f()) {
            currencyAmount = m34318d(mVPriceInfo.fullPrice);
        } else {
            currencyAmount = d;
        }
        if (mVPriceInfo.mo26351g()) {
            str = mVPriceInfo.label;
        } else {
            str = null;
        }
        return new PriceInfo(d, currencyAmount, str);
    }

    /* renamed from: m */
    public static Color m34327m(int i) {
        return new Color(i | -16777216);
    }

    /* renamed from: n */
    public static StyledText m34328n(MVAccessory mVAccessory) {
        Image image;
        String str;
        String str2;
        try {
            if (mVAccessory.mo26070g()) {
                image = C16028g.m40829g(mVAccessory.accessoryIcon);
            } else {
                image = null;
            }
            if (mVAccessory.mo26071h()) {
                str = mVAccessory.accessoryText;
            } else {
                str = null;
            }
            ColorScheme b = m34316b(mVAccessory.color);
            if (mVAccessory.mo26069f()) {
                str2 = mVAccessory.accessabilityText;
            } else {
                str2 = null;
            }
            return new StyledText(image, b, str, str2);
        } catch (Exception e) {
            C16596f.m42113a().mo49364c(e);
            return null;
        }
    }

    /* renamed from: o */
    public static long m34329o(BigDecimal bigDecimal) {
        return bigDecimal.movePointRight(2).longValue();
    }

    /* renamed from: p */
    public static MVCurrencyAmount m34330p(CurrencyAmount currencyAmount) {
        long o = m34329o(currencyAmount.f23845c);
        String str = currencyAmount.f23844b;
        MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
        mVCurrencyAmount.balance = o;
        mVCurrencyAmount.mo26110j();
        mVCurrencyAmount.currencyId = 0;
        mVCurrencyAmount.mo26111k();
        mVCurrencyAmount.currencySymbol = "";
        mVCurrencyAmount.currencyCode = str;
        return mVCurrencyAmount;
    }

    /* renamed from: q */
    public static MVInputFieldValue m34331q(InputFieldValue inputFieldValue) {
        String str = inputFieldValue.f41837b;
        String str2 = inputFieldValue.f41838c;
        MVInputFieldValue mVInputFieldValue = new MVInputFieldValue();
        mVInputFieldValue.f27333id = str;
        mVInputFieldValue.value = str2;
        return mVInputFieldValue;
    }

    /* renamed from: r */
    public static MVLatLon m34332r(LatLonE6 latLonE6) {
        if (latLonE6 == null) {
            return null;
        }
        return new MVLatLon(latLonE6.f40980b, latLonE6.f40981c);
    }

    /* renamed from: s */
    public static MVLocale m34333s(LocaleInfo localeInfo) {
        if (localeInfo == null) {
            return null;
        }
        MVLocale mVLocale = new MVLocale();
        mVLocale.language = localeInfo.f23835b;
        mVLocale.country = localeInfo.f23836c;
        mVLocale.variant = localeInfo.f23837d;
        return mVLocale;
    }

    /* renamed from: t */
    public static MVGpsLocation m34334t(Location location) {
        LatLonE6 j = LatLonE6.m40177j(location);
        if (j == null) {
            return null;
        }
        MVGpsLocation mVGpsLocation = new MVGpsLocation(m34332r(j));
        mVGpsLocation.timestamp = location.getTime();
        mVGpsLocation.mo26192q();
        if (location.hasAccuracy()) {
            mVGpsLocation.accuracy = (double) location.getAccuracy();
            mVGpsLocation.mo26188l();
        }
        if (location.hasBearing()) {
            mVGpsLocation.bearing = (double) location.getBearing();
            mVGpsLocation.mo26190o();
        }
        if (location.hasSpeed()) {
            mVGpsLocation.speed = (double) location.getSpeed();
            mVGpsLocation.mo26191p();
        }
        if (location.hasAltitude()) {
            mVGpsLocation.altitude = location.getAltitude();
            mVGpsLocation.mo26189m();
        }
        return mVGpsLocation;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r5 != false) goto L_0x0051;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tranzmate.moovit.protocol.common.MVLocationDescriptor m34335u(com.moovit.transit.LocationDescriptor r7) {
        /*
            com.moovit.transit.LocationDescriptor$LocationType r0 = r7.f23647b
            com.tranzmate.moovit.protocol.common.MVLocationType r0 = m34337w(r0)
            com.moovit.transit.LocationDescriptor$LocationType r1 = r7.f23647b
            int[] r2 = c70.C13749c.C13750a.f33843e
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 3
            if (r1 == r2) goto L_0x001b
            r2 = 4
            if (r1 == r2) goto L_0x0018
            r1 = 0
            goto L_0x001d
        L_0x0018:
            com.tranzmate.moovit.protocol.common.MVSiteSource r1 = com.tranzmate.moovit.protocol.common.MVSiteSource.EVENT
            goto L_0x001d
        L_0x001b:
            com.tranzmate.moovit.protocol.common.MVSiteSource r1 = com.tranzmate.moovit.protocol.common.MVSiteSource.UNDEFINED
        L_0x001d:
            java.lang.String r2 = r7.mo24313f()
            com.moovit.commons.geo.LatLonE6 r3 = r7.mo24310d()
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r4 = new com.tranzmate.moovit.protocol.common.MVLocationDescriptor
            com.tranzmate.moovit.protocol.common.MVLatLon r3 = m34332r(r3)
            r4.<init>()
            r4.latlon = r3
            r4.type = r0
            com.moovit.commons.geo.LatLonE6 r3 = r7.f23654i
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x003e
            com.moovit.commons.geo.LatLonE6 r3 = r7.f23653h
            if (r3 != 0) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            r4.inaccurateLatLon = r3
            r4.mo26332r()
            if (r2 != 0) goto L_0x0051
            com.moovit.commons.geo.LatLonE6 r3 = r7.f23654i
            if (r3 == 0) goto L_0x004f
            com.moovit.commons.geo.LatLonE6 r3 = r7.f23653h
            if (r3 != 0) goto L_0x004f
            r5 = 1
        L_0x004f:
            if (r5 == 0) goto L_0x0053
        L_0x0051:
            r4.caption = r2
        L_0x0053:
            com.tranzmate.moovit.protocol.common.MVLocationType r2 = com.tranzmate.moovit.protocol.common.MVLocationType.LatLon
            if (r0 == r2) goto L_0x0062
            com.moovit.network.model.ServerId r0 = r7.f23649d
            if (r0 == 0) goto L_0x0062
            int r0 = r0.f15142b
            r4.f25101id = r0
            r4.mo26331q(r6)
        L_0x0062:
            java.lang.String r7 = r7.f23650e
            if (r7 == 0) goto L_0x0068
            r4.uid = r7
        L_0x0068:
            if (r1 == 0) goto L_0x006c
            r4.source = r1
        L_0x006c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c70.C13749c.m34335u(com.moovit.transit.LocationDescriptor):com.tranzmate.moovit.protocol.common.MVLocationDescriptor");
    }

    /* renamed from: v */
    public static MVLocationSourceType m34336v(LocationDescriptor.SourceType sourceType) {
        if (sourceType == null) {
            return null;
        }
        int i = C13750a.f33845g[sourceType.ordinal()];
        if (i == 1) {
            return MVLocationSourceType.LocationSearch;
        }
        if (i == 2) {
            return MVLocationSourceType.TapOnMap;
        }
        if (i == 3) {
            return MVLocationSourceType.ExternalRequest;
        }
        if (i == 4) {
            return MVLocationSourceType.Geocoder;
        }
        if (i == 5) {
            return MVLocationSourceType.UserLocation;
        }
        throw new ApplicationBugException("Unknown source item type: " + sourceType);
    }

    /* renamed from: w */
    public static MVLocationType m34337w(LocationDescriptor.LocationType locationType) {
        switch (C13750a.f33843e[locationType.ordinal()]) {
            case 1:
                return MVLocationType.City;
            case 2:
                return MVLocationType.Street;
            case 3:
            case 4:
                return MVLocationType.Site;
            case 5:
                return MVLocationType.Stop;
            case 6:
                return MVLocationType.BicycleStop;
            case 7:
                return MVLocationType.LatLon;
            case 8:
                return MVLocationType.UserLocation;
            default:
                throw new ApplicationBugException("Unknown location item type: " + locationType);
        }
    }

    /* renamed from: x */
    public static MVUserAddress m34338x(Address address) {
        String str = address.f24017b;
        String str2 = address.f24018c;
        String str3 = address.f24019d;
        String str4 = address.f24020e;
        String str5 = address.f24021f;
        String str6 = address.f24022g;
        MVUserAddress mVUserAddress = new MVUserAddress();
        mVUserAddress.streetAddress = str;
        mVUserAddress.city = str3;
        mVUserAddress.postalCode = str5;
        mVUserAddress.countryAlpha2Code = str6;
        if (str2 != null) {
            mVUserAddress.streetAddress2 = str2;
        }
        if (str4 != null) {
            mVUserAddress.stateCode = str4;
        }
        return mVUserAddress;
    }

    /* renamed from: y */
    public static MVClientResolution m34339y(Context context) {
        try {
            int integer = context.getResources().getInteger(C18163e.screen_density_bucket);
            if (integer == 160) {
                return MVClientResolution.Android_160;
            }
            if (integer == 240) {
                return MVClientResolution.Android_240;
            }
            if (integer == 320) {
                return MVClientResolution.Android_320;
            }
            if (integer == 480) {
                return MVClientResolution.Android_480;
            }
            if (integer == 640) {
                return MVClientResolution.Android_640;
            }
            throw new ApplicationBugException("Unsupported DPI bucket");
        } catch (Exception e) {
            C16596f.m42113a().mo49364c(e);
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (displayMetrics == null) {
                displayMetrics = Resources.getSystem().getDisplayMetrics();
            }
            int i = 0;
            List asList = Arrays.asList(new C20950l0[]{new C20950l0(0, 200), new C20950l0(200, 280), new C20950l0(280, 400), new C20950l0(400, 560), new C20950l0(560, Integer.MAX_VALUE)});
            int i2 = displayMetrics.densityDpi;
            int size = asList.size();
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (((C20950l0) asList.get(i)).mo53020a(Integer.valueOf(i2))) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == 0) {
                return MVClientResolution.Android_160;
            }
            if (i == 1) {
                return MVClientResolution.Android_240;
            }
            if (i == 2) {
                return MVClientResolution.Android_320;
            }
            if (i != 3) {
                return MVClientResolution.Android_640;
            }
            return MVClientResolution.Android_480;
        }
    }
}
