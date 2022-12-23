package g20;

import a20.C13388b;
import android.content.Context;
import com.moovit.MoovitApplication;
import com.moovit.commons.utils.Color;
import com.moovit.commons.utils.UiUtils;
import com.moovit.transit.C7843b;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;

/* renamed from: g20.g */
public final class C17148g {

    /* renamed from: a */
    public static C17151c f44385a = new C17151c();

    /* renamed from: b */
    public static C17152d f44386b = new C17152d();

    /* renamed from: c */
    public static C17153e f44387c = new C17153e();

    /* renamed from: d */
    public static C17154f f44388d = new C17154f();

    /* renamed from: e */
    public static C17155g f44389e = new C17155g();

    /* renamed from: f */
    public static C17156h f44390f = new C17156h();

    /* renamed from: g */
    public static C17157i f44391g = new C17157i();

    /* renamed from: h */
    public static C17158j f44392h = new C17158j();

    /* renamed from: i */
    public static C17159k f44393i = new C17159k();

    /* renamed from: g20.g$a */
    public class C17149a extends C17142d<TransitLine, String> {
        /* renamed from: a */
        public final Object mo49725a(Context context, Object obj) {
            Color color;
            TransitLineGroup b = ((TransitLine) obj).mo24369b();
            int i = C7843b.f23777a;
            if (UiUtils.m40253l(context)) {
                color = b.f23703k;
            } else {
                color = b.f23702j;
            }
            if (color == null) {
                color = Color.f41004h;
            }
            return color.mo46956l();
        }

        public final String toString() {
            return "LineColor";
        }
    }

    /* renamed from: g20.g$b */
    public class C17150b extends C17142d<TransitLine, C13388b> {
        /* renamed from: a */
        public final Object mo49725a(Context context, Object obj) {
            return ((TransitLine) obj).mo24369b().f23704l;
        }

        public final String toString() {
            return "ImageRefs";
        }
    }

    /* renamed from: g20.g$c */
    public class C17151c extends C17142d<TransitLine, String> {
        /* renamed from: a */
        public final Object mo49725a(Context context, Object obj) {
            return ((TransitLine) obj).mo24369b().f23696d.get().f23674d.get().mo24433b(MoovitApplication.f37317k);
        }

        public final String toString() {
            return "TransitTypeName";
        }
    }

    /* renamed from: g20.g$d */
    public class C17152d extends C17142d<TransitLine, String> {
        /* renamed from: a */
        public final Object mo49725a(Context context, Object obj) {
            return ((TransitLine) obj).mo24369b().f23696d.get().f23673c;
        }

        public final String toString() {
            return "AgencyName";
        }
    }

    /* renamed from: g20.g$e */
    public class C17153e extends C17142d<TransitLine, String> {
        /* renamed from: a */
        public final Object mo49725a(Context context, Object obj) {
            return ((TransitLine) obj).mo24369b().f23698f;
        }

        public final String toString() {
            return "LinePrimaryCaption";
        }
    }

    /* renamed from: g20.g$f */
    public class C17154f extends C17142d<TransitLine, String> {
        /* renamed from: a */
        public final Object mo49725a(Context context, Object obj) {
            return ((TransitLine) obj).mo24369b().f23699g;
        }

        public final String toString() {
            return "LineSecondaryCaption";
        }
    }

    /* renamed from: g20.g$g */
    public class C17155g extends C17142d<TransitLine, String> {
        /* renamed from: a */
        public final Object mo49725a(Context context, Object obj) {
            return ((TransitLine) obj).mo24369b().f23697e;
        }

        /* renamed from: b */
        public final Object mo49727b(Context context, Object obj) {
            TransitLine transitLine = (TransitLine) obj;
            return String.format("%s, %s", new Object[]{transitLine.mo24369b().f23697e, transitLine.mo24369b().f23696d.get().f23673c});
        }

        public final String toString() {
            return "LineNumber";
        }
    }

    /* renamed from: g20.g$h */
    public class C17156h extends C17142d<TransitLine, String> {
        /* renamed from: a */
        public final Object mo49725a(Context context, Object obj) {
            return ((TransitLine) obj).f23688d;
        }

        public final String toString() {
            return "Origin";
        }
    }

    /* renamed from: g20.g$i */
    public class C17157i extends C17142d<TransitLine, String> {
        /* renamed from: a */
        public final Object mo49725a(Context context, Object obj) {
            return ((TransitLine) obj).f23689e;
        }

        public final String toString() {
            return "Destination";
        }
    }

    /* renamed from: g20.g$j */
    public class C17158j extends C17142d<TransitLine, String> {
        /* renamed from: a */
        public final Object mo49725a(Context context, Object obj) {
            return ((TransitLine) obj).f23690f;
        }

        public final String toString() {
            return "LongName";
        }
    }

    /* renamed from: g20.g$k */
    public class C17159k extends C17142d<TransitLine, String> {
        /* renamed from: a */
        public final Object mo49725a(Context context, Object obj) {
            return ((TransitLine) obj).f23691g;
        }

        public final String toString() {
            return "DirectionName";
        }
    }

    static {
        new C17149a();
        new C17150b();
    }
}
