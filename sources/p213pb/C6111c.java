package p213pb;

import ak0.C21006a;
import android.text.Layout;
import com.appboy.Constants;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.play.core.appupdate.C14226d;
import com.usebutton.sdk.internal.GroupedInventoryCardActivity;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.p982v1.XmlPullParser;
import org.xmlpull.p982v1.XmlPullParserException;
import p126ib.C5334b;
import p126ib.C5336d;
import p277ub.C6774a0;
import p277ub.C6776b0;

/* renamed from: pb.c */
public final class C6111c extends C5334b {

    /* renamed from: n */
    public static final Pattern f19408n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: o */
    public static final Pattern f19409o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: p */
    public static final Pattern f19410p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: q */
    public static final Pattern f19411q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: r */
    public static final Pattern f19412r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: s */
    public static final Pattern f19413s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: t */
    public static final Pattern f19414t = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: u */
    public static final C6113b f19415u = new C6113b(30.0f, 1, 1);

    /* renamed from: v */
    public static final C6112a f19416v = new C6112a(15);

    /* renamed from: m */
    public final C21006a f19417m;

    /* renamed from: pb.c$a */
    public static final class C6112a {

        /* renamed from: a */
        public final int f19418a;

        public C6112a(int i) {
            this.f19418a = i;
        }
    }

    /* renamed from: pb.c$b */
    public static final class C6113b {

        /* renamed from: a */
        public final float f19419a;

        /* renamed from: b */
        public final int f19420b;

        /* renamed from: c */
        public final int f19421c;

        public C6113b(float f, int i, int i2) {
            this.f19419a = f;
            this.f19420b = i;
            this.f19421c = i2;
        }
    }

    /* renamed from: pb.c$c */
    public static final class C6114c {

        /* renamed from: a */
        public final int f19422a;

        /* renamed from: b */
        public final int f19423b;

        public C6114c(int i, int i2) {
            this.f19422a = i;
            this.f19423b = i2;
        }
    }

    public C6111c() {
        try {
            C21006a a = C21006a.m49161a();
            this.f19417m = a;
            a.f52759c.put(XmlPullParser.FEATURE_PROCESS_NAMESPACES, new Boolean(true));
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: h */
    public static C6117f m14648h(C6117f fVar) {
        return fVar == null ? new C6117f() : fVar;
    }

    /* renamed from: i */
    public static boolean m14649i(String str) {
        if (str.equals("tt") || str.equals("head") || str.equals(GroupedInventoryCardActivity.EXTRA_BODY) || str.equals("div") || str.equals(Constants.APPBOY_PUSH_PRIORITY_KEY) || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information")) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static Layout.Alignment m14650j(String str) {
        String H0 = C14226d.m35341H0(str);
        H0.getClass();
        char c = 65535;
        switch (H0.hashCode()) {
            case -1364013995:
                if (H0.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case 100571:
                if (H0.equals("end")) {
                    c = 1;
                    break;
                }
                break;
            case 3317767:
                if (H0.equals("left")) {
                    c = 2;
                    break;
                }
                break;
            case 108511772:
                if (H0.equals("right")) {
                    c = 3;
                    break;
                }
                break;
            case 109757538:
                if (H0.equals("start")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    /* renamed from: k */
    public static C6112a m14651k(XmlPullParser xmlPullParser, C6112a aVar) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f19414t.matcher(attributeValue);
        if (!matcher.matches()) {
            if (attributeValue.length() != 0) {
                "Ignoring malformed cell resolution: ".concat(attributeValue);
            }
            return aVar;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new C6112a(parseInt2);
            }
            StringBuilder sb = new StringBuilder(47);
            sb.append("Invalid cell resolution ");
            sb.append(parseInt);
            sb.append(" ");
            sb.append(parseInt2);
            throw new SubtitleDecoderException(sb.toString());
        } catch (NumberFormatException unused) {
            if (attributeValue.length() != 0) {
                "Ignoring malformed cell resolution: ".concat(attributeValue);
            }
            return aVar;
        }
    }

    /* renamed from: l */
    public static void m14652l(String str, C6117f fVar) throws SubtitleDecoderException {
        Matcher matcher;
        int i = C6774a0.f20959a;
        String[] split = str.split("\\s+", -1);
        if (split.length == 1) {
            matcher = f19410p.matcher(str);
        } else if (split.length == 2) {
            matcher = f19410p.matcher(split[1]);
        } else {
            throw new SubtitleDecoderException(C13715c.m34242h(52, "Invalid number of entries for fontSize: ", split.length, "."));
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            group.hashCode();
            char c = 65535;
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    fVar.f19456j = 3;
                    break;
                case 1:
                    fVar.f19456j = 2;
                    break;
                case 2:
                    fVar.f19456j = 1;
                    break;
                default:
                    throw new SubtitleDecoderException(C25541a.m63875e(group.length() + 30, "Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            fVar.f19457k = Float.parseFloat(group2);
            return;
        }
        throw new SubtitleDecoderException(C25541a.m63875e(str.length() + 36, "Invalid expression for fontSize: '", str, "'."));
    }

    /* renamed from: m */
    public static C6113b m14653m(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        int i;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else {
            i = 30;
        }
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i2 = C6774a0.f20959a;
            String[] split = attributeValue2.split(" ", -1);
            if (split.length == 2) {
                f = ((float) Integer.parseInt(split[0])) / ((float) Integer.parseInt(split[1]));
            } else {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
        }
        C6113b bVar = f19415u;
        int i3 = bVar.f19420b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        int i4 = bVar.f19421c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i4 = Integer.parseInt(attributeValue4);
        }
        return new C6113b(((float) i) * f, i3, i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        r3 = p277ub.C6776b0.m15969b(r0, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d3 A[ADDED_TO_REGION] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m14654n(org.xmlpull.p982v1.XmlPullParser r19, java.util.HashMap r20, p213pb.C6111c.C6112a r21, p213pb.C6111c.C6114c r22, java.util.HashMap r23, java.util.HashMap r24) throws java.io.IOException, org.xmlpull.p982v1.XmlPullParserException {
        /*
            r0 = r19
            r1 = r20
            r2 = r22
        L_0x0006:
            r19.next()
            java.lang.String r3 = "style"
            boolean r4 = p277ub.C6776b0.m15971d(r0, r3)
            r5 = -1
            r6 = 0
            if (r4 == 0) goto L_0x0053
            java.lang.String r3 = p277ub.C6776b0.m15969b(r0, r3)
            pb.f r4 = new pb.f
            r4.<init>()
            pb.f r4 = m14656p(r0, r4)
            if (r3 == 0) goto L_0x0048
            java.lang.String r3 = r3.trim()
            boolean r7 = r3.isEmpty()
            if (r7 == 0) goto L_0x002f
            java.lang.String[] r3 = new java.lang.String[r6]
            goto L_0x0037
        L_0x002f:
            int r7 = p277ub.C6774a0.f20959a
            java.lang.String r7 = "\\s+"
            java.lang.String[] r3 = r3.split(r7, r5)
        L_0x0037:
            int r5 = r3.length
        L_0x0038:
            if (r6 >= r5) goto L_0x0048
            r7 = r3[r6]
            java.lang.Object r7 = r1.get(r7)
            pb.f r7 = (p213pb.C6117f) r7
            r4.mo22078a(r7)
            int r6 = r6 + 1
            goto L_0x0038
        L_0x0048:
            java.lang.String r3 = r4.f19458l
            if (r3 == 0) goto L_0x004f
            r1.put(r3, r4)
        L_0x004f:
            r6 = r23
            goto L_0x0256
        L_0x0053:
            java.lang.String r3 = "region"
            boolean r3 = p277ub.C6776b0.m15971d(r0, r3)
            java.lang.String r4 = "id"
            if (r3 == 0) goto L_0x0228
            java.lang.String r8 = p277ub.C6776b0.m15969b(r0, r4)
            if (r8 != 0) goto L_0x0065
            goto L_0x021d
        L_0x0065:
            java.lang.String r3 = "origin"
            java.lang.String r3 = p277ub.C6776b0.m15969b(r0, r3)
            if (r3 == 0) goto L_0x021d
            java.util.regex.Pattern r4 = f19412r
            java.util.regex.Matcher r7 = r4.matcher(r3)
            java.util.regex.Pattern r9 = f19413s
            java.util.regex.Matcher r10 = r9.matcher(r3)
            boolean r11 = r7.matches()
            java.lang.String r12 = "Ignoring region with malformed origin: "
            java.lang.String r13 = "Ignoring region with missing tts:extent: "
            r14 = 1120403456(0x42c80000, float:100.0)
            r15 = 2
            r5 = 1
            if (r11 == 0) goto L_0x00ac
            java.lang.String r10 = r7.group(r5)     // Catch:{ NumberFormatException -> 0x00a0 }
            r10.getClass()     // Catch:{ NumberFormatException -> 0x00a0 }
            float r10 = java.lang.Float.parseFloat(r10)     // Catch:{ NumberFormatException -> 0x00a0 }
            float r10 = r10 / r14
            java.lang.String r7 = r7.group(r15)     // Catch:{ NumberFormatException -> 0x00a0 }
            r7.getClass()     // Catch:{ NumberFormatException -> 0x00a0 }
            float r7 = java.lang.Float.parseFloat(r7)     // Catch:{ NumberFormatException -> 0x00a0 }
            float r7 = r7 / r14
            goto L_0x00e4
        L_0x00a0:
            int r4 = r3.length()
            if (r4 == 0) goto L_0x021d
            r12.concat(r3)
            goto L_0x021d
        L_0x00ac:
            boolean r7 = r10.matches()
            if (r7 == 0) goto L_0x0212
            if (r2 != 0) goto L_0x00bf
            int r4 = r3.length()
            if (r4 == 0) goto L_0x021d
            r13.concat(r3)
            goto L_0x021d
        L_0x00bf:
            java.lang.String r7 = r10.group(r5)     // Catch:{ NumberFormatException -> 0x0207 }
            r7.getClass()     // Catch:{ NumberFormatException -> 0x0207 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0207 }
            java.lang.String r10 = r10.group(r15)     // Catch:{ NumberFormatException -> 0x0207 }
            r10.getClass()     // Catch:{ NumberFormatException -> 0x0207 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x0207 }
            float r7 = (float) r7     // Catch:{ NumberFormatException -> 0x0207 }
            int r11 = r2.f19422a     // Catch:{ NumberFormatException -> 0x0207 }
            float r11 = (float) r11     // Catch:{ NumberFormatException -> 0x0207 }
            float r7 = r7 / r11
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x0207 }
            int r11 = r2.f19423b     // Catch:{ NumberFormatException -> 0x0207 }
            float r11 = (float) r11
            float r10 = r10 / r11
            r18 = r10
            r10 = r7
            r7 = r18
        L_0x00e4:
            java.lang.String r11 = "extent"
            java.lang.String r11 = p277ub.C6776b0.m15969b(r0, r11)
            if (r11 == 0) goto L_0x021d
            java.util.regex.Matcher r4 = r4.matcher(r11)
            java.util.regex.Matcher r9 = r9.matcher(r11)
            boolean r11 = r4.matches()
            java.lang.String r12 = "Ignoring region with malformed extent: "
            if (r11 == 0) goto L_0x0123
            java.lang.String r9 = r4.group(r5)     // Catch:{ NumberFormatException -> 0x0117 }
            r9.getClass()     // Catch:{ NumberFormatException -> 0x0117 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0117 }
            float r9 = r9 / r14
            java.lang.String r4 = r4.group(r15)     // Catch:{ NumberFormatException -> 0x0117 }
            r4.getClass()     // Catch:{ NumberFormatException -> 0x0117 }
            float r3 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x0117 }
            float r3 = r3 / r14
            r14 = r3
            r13 = r9
            goto L_0x0158
        L_0x0117:
            int r4 = r3.length()
            if (r4 == 0) goto L_0x021d
            r12.concat(r3)
            goto L_0x021d
        L_0x0123:
            boolean r4 = r9.matches()
            if (r4 == 0) goto L_0x01fb
            if (r2 != 0) goto L_0x0136
            int r4 = r3.length()
            if (r4 == 0) goto L_0x021d
            r13.concat(r3)
            goto L_0x021d
        L_0x0136:
            java.lang.String r4 = r9.group(r5)     // Catch:{ NumberFormatException -> 0x01f0 }
            r4.getClass()     // Catch:{ NumberFormatException -> 0x01f0 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x01f0 }
            java.lang.String r9 = r9.group(r15)     // Catch:{ NumberFormatException -> 0x01f0 }
            r9.getClass()     // Catch:{ NumberFormatException -> 0x01f0 }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x01f0 }
            float r4 = (float) r4     // Catch:{ NumberFormatException -> 0x01f0 }
            int r11 = r2.f19422a     // Catch:{ NumberFormatException -> 0x01f0 }
            float r11 = (float) r11     // Catch:{ NumberFormatException -> 0x01f0 }
            float r4 = r4 / r11
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x01f0 }
            int r3 = r2.f19423b     // Catch:{ NumberFormatException -> 0x01f0 }
            float r3 = (float) r3
            float r9 = r9 / r3
            r13 = r4
            r14 = r9
        L_0x0158:
            java.lang.String r3 = "displayAlign"
            java.lang.String r3 = p277ub.C6776b0.m15969b(r0, r3)
            if (r3 == 0) goto L_0x0183
            java.lang.String r3 = com.google.android.play.core.appupdate.C14226d.m35341H0(r3)
            r3.getClass()
            java.lang.String r4 = "center"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x017c
            java.lang.String r4 = "after"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0178
            goto L_0x0183
        L_0x0178:
            float r7 = r7 + r14
            r3 = r7
            r12 = 2
            goto L_0x0185
        L_0x017c:
            r3 = 1073741824(0x40000000, float:2.0)
            float r3 = r14 / r3
            float r3 = r3 + r7
            r12 = 1
            goto L_0x0185
        L_0x0183:
            r3 = r7
            r12 = 0
        L_0x0185:
            r4 = 1065353216(0x3f800000, float:1.0)
            r11 = r21
            int r7 = r11.f19418a
            float r7 = (float) r7
            float r4 = r4 / r7
            java.lang.String r7 = "writingMode"
            java.lang.String r7 = p277ub.C6776b0.m15969b(r0, r7)
            if (r7 == 0) goto L_0x01de
            java.lang.String r7 = com.google.android.play.core.appupdate.C14226d.m35341H0(r7)
            r7.getClass()
            int r9 = r7.hashCode()
            r6 = 3694(0xe6e, float:5.176E-42)
            if (r9 == r6) goto L_0x01c6
            r6 = 3553396(0x363874, float:4.979368E-39)
            if (r9 == r6) goto L_0x01bb
            r6 = 3553576(0x363928, float:4.97962E-39)
            if (r9 == r6) goto L_0x01b0
            goto L_0x01ce
        L_0x01b0:
            java.lang.String r6 = "tbrl"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L_0x01b9
            goto L_0x01ce
        L_0x01b9:
            r6 = 2
            goto L_0x01d1
        L_0x01bb:
            java.lang.String r6 = "tblr"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L_0x01c4
            goto L_0x01ce
        L_0x01c4:
            r6 = 1
            goto L_0x01d1
        L_0x01c6:
            java.lang.String r6 = "tb"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L_0x01d0
        L_0x01ce:
            r6 = -1
            goto L_0x01d1
        L_0x01d0:
            r6 = 0
        L_0x01d1:
            if (r6 == 0) goto L_0x01db
            if (r6 == r5) goto L_0x01db
            if (r6 == r15) goto L_0x01d8
            goto L_0x01de
        L_0x01d8:
            r17 = 1
            goto L_0x01e2
        L_0x01db:
            r17 = 2
            goto L_0x01e2
        L_0x01de:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r17 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x01e2:
            pb.e r5 = new pb.e
            r6 = 0
            r15 = 1
            r7 = r5
            r9 = r10
            r10 = r3
            r11 = r6
            r16 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x021e
        L_0x01f0:
            int r4 = r3.length()
            if (r4 == 0) goto L_0x021d
            r12.concat(r3)
            goto L_0x021d
        L_0x01fb:
            int r4 = r3.length()
            if (r4 == 0) goto L_0x021d
            java.lang.String r4 = "Ignoring region with unsupported extent: "
            r4.concat(r3)
            goto L_0x021d
        L_0x0207:
            int r4 = r3.length()
            if (r4 == 0) goto L_0x021d
            r12.concat(r3)
            goto L_0x021d
        L_0x0212:
            int r4 = r3.length()
            if (r4 == 0) goto L_0x021d
            java.lang.String r4 = "Ignoring region with unsupported origin: "
            r4.concat(r3)
        L_0x021d:
            r5 = 0
        L_0x021e:
            if (r5 == 0) goto L_0x004f
            java.lang.String r3 = r5.f19437a
            r6 = r23
            r6.put(r3, r5)
            goto L_0x0256
        L_0x0228:
            r6 = r23
            java.lang.String r3 = "metadata"
            boolean r5 = p277ub.C6776b0.m15971d(r0, r3)
            if (r5 == 0) goto L_0x0256
        L_0x0232:
            r19.next()
            java.lang.String r5 = "image"
            boolean r5 = p277ub.C6776b0.m15971d(r0, r5)
            if (r5 == 0) goto L_0x024d
            java.lang.String r5 = p277ub.C6776b0.m15969b(r0, r4)
            if (r5 == 0) goto L_0x024d
            java.lang.String r7 = r19.nextText()
            r8 = r24
            r8.put(r5, r7)
            goto L_0x024f
        L_0x024d:
            r8 = r24
        L_0x024f:
            boolean r5 = p277ub.C6776b0.m15970c(r0, r3)
            if (r5 == 0) goto L_0x0232
            goto L_0x0258
        L_0x0256:
            r8 = r24
        L_0x0258:
            java.lang.String r3 = "head"
            boolean r3 = p277ub.C6776b0.m15970c(r0, r3)
            if (r3 == 0) goto L_0x0006
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213pb.C6111c.m14654n(org.xmlpull.v1.XmlPullParser, java.util.HashMap, pb.c$a, pb.c$c, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p213pb.C6115d m14655o(org.xmlpull.p982v1.XmlPullParser r19, p213pb.C6115d r20, java.util.HashMap r21, p213pb.C6111c.C6113b r22) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
            r0 = r19
            r11 = r20
            r1 = r22
            int r2 = r19.getAttributeCount()
            r3 = 0
            pb.f r7 = m14656p(r0, r3)
            java.lang.String r8 = ""
            r10 = r3
            r9 = r8
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r10
            r3 = 0
        L_0x0024:
            if (r3 >= r2) goto L_0x00db
            java.lang.String r5 = r0.getAttributeName(r3)
            java.lang.String r6 = r0.getAttributeValue(r3)
            r5.getClass()
            int r18 = r5.hashCode()
            switch(r18) {
                case -934795532: goto L_0x0070;
                case 99841: goto L_0x0065;
                case 100571: goto L_0x005a;
                case 93616297: goto L_0x004f;
                case 109780401: goto L_0x0044;
                case 1292595405: goto L_0x0039;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x007b
        L_0x0039:
            java.lang.String r4 = "backgroundImage"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0042
            goto L_0x007b
        L_0x0042:
            r4 = 5
            goto L_0x007c
        L_0x0044:
            java.lang.String r4 = "style"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x004d
            goto L_0x007b
        L_0x004d:
            r4 = 4
            goto L_0x007c
        L_0x004f:
            java.lang.String r4 = "begin"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0058
            goto L_0x007b
        L_0x0058:
            r4 = 3
            goto L_0x007c
        L_0x005a:
            java.lang.String r4 = "end"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0063
            goto L_0x007b
        L_0x0063:
            r4 = 2
            goto L_0x007c
        L_0x0065:
            java.lang.String r4 = "dur"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x006e
            goto L_0x007b
        L_0x006e:
            r4 = 1
            goto L_0x007c
        L_0x0070:
            java.lang.String r4 = "region"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r4 = 0
            goto L_0x007c
        L_0x007b:
            r4 = -1
        L_0x007c:
            if (r4 == 0) goto L_0x00ce
            r5 = 1
            if (r4 == r5) goto L_0x00c5
            r5 = 2
            if (r4 == r5) goto L_0x00bf
            r5 = 3
            if (r4 == r5) goto L_0x00b9
            r5 = 4
            if (r4 == r5) goto L_0x009c
            r5 = 5
            if (r4 == r5) goto L_0x008e
            goto L_0x00cb
        L_0x008e:
            java.lang.String r4 = "#"
            boolean r4 = r6.startsWith(r4)
            if (r4 == 0) goto L_0x00cb
            r4 = 1
            java.lang.String r10 = r6.substring(r4)
            goto L_0x00cb
        L_0x009c:
            java.lang.String r4 = r6.trim()
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x00aa
            r5 = 0
            java.lang.String[] r4 = new java.lang.String[r5]
            goto L_0x00b4
        L_0x00aa:
            r5 = 0
            int r6 = p277ub.C6774a0.f20959a
            java.lang.String r6 = "\\s+"
            r5 = -1
            java.lang.String[] r4 = r4.split(r6, r5)
        L_0x00b4:
            int r5 = r4.length
            if (r5 <= 0) goto L_0x00cb
            r8 = r4
            goto L_0x00cb
        L_0x00b9:
            long r4 = m14657q(r6, r1)
            r12 = r4
            goto L_0x00cb
        L_0x00bf:
            long r4 = m14657q(r6, r1)
            r14 = r4
            goto L_0x00cb
        L_0x00c5:
            long r4 = m14657q(r6, r1)
            r16 = r4
        L_0x00cb:
            r4 = r21
            goto L_0x00d7
        L_0x00ce:
            r4 = r21
            boolean r5 = r4.containsKey(r6)
            if (r5 == 0) goto L_0x00d7
            r9 = r6
        L_0x00d7:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x00db:
            if (r11 == 0) goto L_0x00f3
            long r1 = r11.f19427d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00f8
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00ed
            long r12 = r12 + r1
        L_0x00ed:
            int r5 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00f8
            long r14 = r14 + r1
            goto L_0x00f8
        L_0x00f3:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00f8:
            int r1 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x010f
            int r1 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0105
            long r16 = r12 + r16
            r5 = r16
            goto L_0x0110
        L_0x0105:
            if (r11 == 0) goto L_0x010f
            long r1 = r11.f19428e
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x010f
            r5 = r1
            goto L_0x0110
        L_0x010f:
            r5 = r14
        L_0x0110:
            java.lang.String r1 = r19.getName()
            pb.d r14 = new pb.d
            r2 = 0
            r0 = r14
            r3 = r12
            r11 = r20
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p213pb.C6111c.m14655o(org.xmlpull.v1.XmlPullParser, pb.d, java.util.HashMap, pb.c$b):pb.d");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01ea, code lost:
        if (r5.equals("auto") != false) goto L_0x01ee;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01c2  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p213pb.C6117f m14656p(org.xmlpull.p982v1.XmlPullParser r16, p213pb.C6117f r17) {
        /*
            r1 = r16
            int r2 = r16.getAttributeCount()
            r3 = 0
            r0 = r17
            r4 = 0
        L_0x000a:
            if (r4 >= r2) goto L_0x048e
            java.lang.String r5 = r1.getAttributeValue(r4)
            java.lang.String r6 = r1.getAttributeName(r4)
            r6.getClass()
            int r7 = r6.hashCode()
            r8 = 5
            r9 = 4
            r11 = -1
            r12 = 2
            r13 = 1
            switch(r7) {
                case -1550943582: goto L_0x00d8;
                case -1224696685: goto L_0x00cd;
                case -1065511464: goto L_0x00c1;
                case -879295043: goto L_0x00b5;
                case -734428249: goto L_0x00aa;
                case 3355: goto L_0x009f;
                case 3511770: goto L_0x0094;
                case 94842723: goto L_0x0089;
                case 109403361: goto L_0x007b;
                case 110138194: goto L_0x006c;
                case 365601008: goto L_0x005e;
                case 921125321: goto L_0x004f;
                case 1115953443: goto L_0x0041;
                case 1287124693: goto L_0x0033;
                case 1754920356: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x00e3
        L_0x0025:
            java.lang.String r7 = "multiRowAlign"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x002f
            goto L_0x00e3
        L_0x002f:
            r6 = 14
            goto L_0x00e4
        L_0x0033:
            java.lang.String r7 = "backgroundColor"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x003d
            goto L_0x00e3
        L_0x003d:
            r6 = 13
            goto L_0x00e4
        L_0x0041:
            java.lang.String r7 = "rubyPosition"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x004b
            goto L_0x00e3
        L_0x004b:
            r6 = 12
            goto L_0x00e4
        L_0x004f:
            java.lang.String r7 = "textEmphasis"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x005a
            goto L_0x00e3
        L_0x005a:
            r6 = 11
            goto L_0x00e4
        L_0x005e:
            java.lang.String r7 = "fontSize"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0068
            goto L_0x00e3
        L_0x0068:
            r6 = 10
            goto L_0x00e4
        L_0x006c:
            java.lang.String r7 = "textCombine"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0077
            goto L_0x00e3
        L_0x0077:
            r6 = 9
            goto L_0x00e4
        L_0x007b:
            java.lang.String r7 = "shear"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0085
            goto L_0x00e3
        L_0x0085:
            r6 = 8
            goto L_0x00e4
        L_0x0089:
            java.lang.String r7 = "color"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0092
            goto L_0x00e3
        L_0x0092:
            r6 = 7
            goto L_0x00e4
        L_0x0094:
            java.lang.String r7 = "ruby"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x009d
            goto L_0x00e3
        L_0x009d:
            r6 = 6
            goto L_0x00e4
        L_0x009f:
            java.lang.String r7 = "id"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00a8
            goto L_0x00e3
        L_0x00a8:
            r6 = 5
            goto L_0x00e4
        L_0x00aa:
            java.lang.String r7 = "fontWeight"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00b3
            goto L_0x00e3
        L_0x00b3:
            r6 = 4
            goto L_0x00e4
        L_0x00b5:
            java.lang.String r7 = "textDecoration"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00bf
            goto L_0x00e3
        L_0x00bf:
            r6 = 3
            goto L_0x00e4
        L_0x00c1:
            java.lang.String r7 = "textAlign"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00cb
            goto L_0x00e3
        L_0x00cb:
            r6 = 2
            goto L_0x00e4
        L_0x00cd:
            java.lang.String r7 = "fontFamily"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00d6
            goto L_0x00e3
        L_0x00d6:
            r6 = 1
            goto L_0x00e4
        L_0x00d8:
            java.lang.String r7 = "fontStyle"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            r6 = 0
            goto L_0x00e4
        L_0x00e3:
            r6 = -1
        L_0x00e4:
            java.lang.String r7 = "after"
            java.lang.String r14 = "before"
            java.lang.String r15 = "none"
            switch(r6) {
                case 0: goto L_0x047e;
                case 1: goto L_0x0477;
                case 2: goto L_0x046c;
                case 3: goto L_0x040b;
                case 4: goto L_0x03fd;
                case 5: goto L_0x03e9;
                case 6: goto L_0x0368;
                case 7: goto L_0x0348;
                case 8: goto L_0x02ee;
                case 9: goto L_0x02c7;
                case 10: goto L_0x02ac;
                case 11: goto L_0x0140;
                case 12: goto L_0x011b;
                case 13: goto L_0x00fb;
                case 14: goto L_0x00ef;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            goto L_0x048a
        L_0x00ef:
            pb.f r0 = m14648h(r0)
            android.text.Layout$Alignment r5 = m14650j(r5)
            r0.f19462p = r5
            goto L_0x048a
        L_0x00fb:
            pb.f r0 = m14648h(r0)
            int r6 = p277ub.C6775b.m15967a(r5, r3)     // Catch:{ IllegalArgumentException -> 0x0109 }
            r0.f19450d = r6     // Catch:{ IllegalArgumentException -> 0x0109 }
            r0.f19451e = r13     // Catch:{ IllegalArgumentException -> 0x0109 }
            goto L_0x048a
        L_0x0109:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x048a
            java.lang.String r6 = "Failed parsing background value: "
            r6.concat(r5)
            goto L_0x048a
        L_0x011b:
            java.lang.String r5 = com.google.android.play.core.appupdate.C14226d.m35341H0(r5)
            r5.getClass()
            boolean r6 = r5.equals(r14)
            if (r6 != 0) goto L_0x0138
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x0130
            goto L_0x048a
        L_0x0130:
            pb.f r0 = m14648h(r0)
            r0.f19460n = r12
            goto L_0x048a
        L_0x0138:
            pb.f r0 = m14648h(r0)
            r0.f19460n = r13
            goto L_0x048a
        L_0x0140:
            pb.f r0 = m14648h(r0)
            java.util.regex.Pattern r6 = p213pb.C6110b.f19400d
            r6 = 0
            if (r5 != 0) goto L_0x014b
            goto L_0x02a8
        L_0x014b:
            java.lang.String r5 = r5.trim()
            java.lang.String r5 = com.google.android.play.core.appupdate.C14226d.m35341H0(r5)
            boolean r8 = r5.isEmpty()
            if (r8 == 0) goto L_0x015b
            goto L_0x02a8
        L_0x015b:
            java.util.regex.Pattern r6 = p213pb.C6110b.f19400d
            java.lang.String[] r5 = android.text.TextUtils.split(r5, r6)
            com.google.common.collect.ImmutableSet r5 = com.google.common.collect.ImmutableSet.m35758D(r5)
            com.google.common.collect.ImmutableSet<java.lang.String> r6 = p213pb.C6110b.f19404h
            com.google.common.collect.t0 r6 = com.google.common.collect.C14433u0.m35898b(r6, r5)
            java.lang.String r8 = "outside"
            com.google.common.collect.s0 r9 = new com.google.common.collect.s0
            r9.<init>(r6)
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L_0x017d
            java.lang.Object r6 = r9.next()
            goto L_0x017e
        L_0x017d:
            r6 = r8
        L_0x017e:
            java.lang.String r6 = (java.lang.String) r6
            int r9 = r6.hashCode()
            r10 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            if (r9 == r10) goto L_0x01a4
            r10 = -1106037339(0xffffffffbe1335a5, float:-0.14375933)
            if (r9 == r10) goto L_0x019c
            r8 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r9 == r8) goto L_0x0194
            goto L_0x01ac
        L_0x0194:
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x01ac
            r6 = 0
            goto L_0x01ad
        L_0x019c:
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x01ac
            r6 = 1
            goto L_0x01ad
        L_0x01a4:
            boolean r6 = r6.equals(r14)
            if (r6 == 0) goto L_0x01ac
            r6 = 2
            goto L_0x01ad
        L_0x01ac:
            r6 = -1
        L_0x01ad:
            if (r6 == 0) goto L_0x01b5
            if (r6 == r13) goto L_0x01b3
            r6 = 1
            goto L_0x01b6
        L_0x01b3:
            r6 = -2
            goto L_0x01b6
        L_0x01b5:
            r6 = 2
        L_0x01b6:
            com.google.common.collect.ImmutableSet<java.lang.String> r7 = p213pb.C6110b.f19401e
            com.google.common.collect.t0 r7 = com.google.common.collect.C14433u0.m35898b(r7, r5)
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L_0x01f8
            com.google.common.collect.s0 r5 = new com.google.common.collect.s0
            r5.<init>(r7)
            java.lang.Object r5 = r5.next()
            java.lang.String r5 = (java.lang.String) r5
            int r7 = r5.hashCode()
            r8 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r7 == r8) goto L_0x01e4
            r8 = 3387192(0x33af38, float:4.746467E-39)
            if (r7 == r8) goto L_0x01dc
            goto L_0x01ed
        L_0x01dc:
            boolean r5 = r5.equals(r15)
            if (r5 == 0) goto L_0x01ed
            r13 = 0
            goto L_0x01ee
        L_0x01e4:
            java.lang.String r7 = "auto"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x01ed
            goto L_0x01ee
        L_0x01ed:
            r13 = -1
        L_0x01ee:
            if (r13 == 0) goto L_0x01f1
            goto L_0x01f2
        L_0x01f1:
            r11 = 0
        L_0x01f2:
            pb.b r5 = new pb.b
            r5.<init>(r11, r3, r6)
            goto L_0x0215
        L_0x01f8:
            com.google.common.collect.ImmutableSet<java.lang.String> r7 = p213pb.C6110b.f19403g
            com.google.common.collect.t0 r7 = com.google.common.collect.C14433u0.m35898b(r7, r5)
            com.google.common.collect.ImmutableSet<java.lang.String> r8 = p213pb.C6110b.f19402f
            com.google.common.collect.t0 r5 = com.google.common.collect.C14433u0.m35898b(r8, r5)
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0218
            boolean r8 = r5.isEmpty()
            if (r8 == 0) goto L_0x0218
            pb.b r5 = new pb.b
            r5.<init>(r11, r3, r6)
        L_0x0215:
            r6 = r5
            goto L_0x02a8
        L_0x0218:
            java.lang.String r8 = "filled"
            com.google.common.collect.s0 r9 = new com.google.common.collect.s0
            r9.<init>(r7)
            boolean r7 = r9.hasNext()
            if (r7 == 0) goto L_0x022a
            java.lang.Object r7 = r9.next()
            goto L_0x022b
        L_0x022a:
            r7 = r8
        L_0x022b:
            java.lang.String r7 = (java.lang.String) r7
            int r9 = r7.hashCode()
            r10 = -1274499742(0xffffffffb408ad62, float:-1.2729063E-7)
            if (r9 == r10) goto L_0x0246
            r8 = 3417674(0x34264a, float:4.789181E-39)
            if (r9 == r8) goto L_0x023c
            goto L_0x024e
        L_0x023c:
            java.lang.String r8 = "open"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x024e
            r7 = 0
            goto L_0x024f
        L_0x0246:
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x024e
            r7 = 1
            goto L_0x024f
        L_0x024e:
            r7 = -1
        L_0x024f:
            if (r7 == 0) goto L_0x0253
            r7 = 1
            goto L_0x0254
        L_0x0253:
            r7 = 2
        L_0x0254:
            java.lang.String r8 = "circle"
            com.google.common.collect.s0 r9 = new com.google.common.collect.s0
            r9.<init>(r5)
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x0266
            java.lang.Object r5 = r9.next()
            goto L_0x0267
        L_0x0266:
            r5 = r8
        L_0x0267:
            java.lang.String r5 = (java.lang.String) r5
            int r9 = r5.hashCode()
            r10 = -1360216880(0xffffffffaeecbcd0, float:-1.0765577E-10)
            if (r9 == r10) goto L_0x0291
            r8 = -905816648(0xffffffffca0255b8, float:-2135406.0)
            if (r9 == r8) goto L_0x0287
            r8 = 99657(0x18549, float:1.39649E-40)
            if (r9 == r8) goto L_0x027d
            goto L_0x0298
        L_0x027d:
            java.lang.String r8 = "dot"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0298
            r11 = 0
            goto L_0x0298
        L_0x0287:
            java.lang.String r8 = "sesame"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0298
            r11 = 1
            goto L_0x0298
        L_0x0291:
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0298
            r11 = 2
        L_0x0298:
            if (r11 == 0) goto L_0x02a0
            if (r11 == r13) goto L_0x029e
            r10 = 1
            goto L_0x02a1
        L_0x029e:
            r10 = 3
            goto L_0x02a1
        L_0x02a0:
            r10 = 2
        L_0x02a1:
            pb.b r5 = new pb.b
            r5.<init>(r10, r7, r6)
            goto L_0x0215
        L_0x02a8:
            r0.f19464r = r6
            goto L_0x048a
        L_0x02ac:
            pb.f r0 = m14648h(r0)     // Catch:{ SubtitleDecoderException -> 0x02b5 }
            m14652l(r5, r0)     // Catch:{ SubtitleDecoderException -> 0x02b5 }
            goto L_0x048a
        L_0x02b5:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x048a
            java.lang.String r6 = "Failed parsing fontSize value: "
            r6.concat(r5)
            goto L_0x048a
        L_0x02c7:
            java.lang.String r5 = com.google.android.play.core.appupdate.C14226d.m35341H0(r5)
            r5.getClass()
            java.lang.String r6 = "all"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x02e6
            boolean r5 = r5.equals(r15)
            if (r5 != 0) goto L_0x02de
            goto L_0x048a
        L_0x02de:
            pb.f r0 = m14648h(r0)
            r0.f19463q = r3
            goto L_0x048a
        L_0x02e6:
            pb.f r0 = m14648h(r0)
            r0.f19463q = r13
            goto L_0x048a
        L_0x02ee:
            pb.f r6 = m14648h(r0)
            java.util.regex.Pattern r0 = f19411q
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r7 = r0.matches()
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r7 != 0) goto L_0x0311
            java.lang.String r0 = java.lang.String.valueOf(r5)
            int r5 = r0.length()
            if (r5 == 0) goto L_0x0343
            java.lang.String r5 = "Invalid value for shear: "
            r5.concat(r0)
            goto L_0x0343
        L_0x0311:
            java.lang.String r0 = r0.group(r13)     // Catch:{ NumberFormatException -> 0x0329 }
            r0.getClass()     // Catch:{ NumberFormatException -> 0x0329 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0329 }
            r7 = -1027080192(0xffffffffc2c80000, float:-100.0)
            float r0 = java.lang.Math.max(r7, r0)     // Catch:{ NumberFormatException -> 0x0329 }
            r7 = 1120403456(0x42c80000, float:100.0)
            float r8 = java.lang.Math.min(r7, r0)     // Catch:{ NumberFormatException -> 0x0329 }
            goto L_0x0343
        L_0x0329:
            r0 = move-exception
            java.lang.String r7 = "Failed to parse shear: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r9 = r5.length()
            if (r9 == 0) goto L_0x033b
            java.lang.String r5 = r7.concat(r5)
            goto L_0x0340
        L_0x033b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r7)
        L_0x0340:
            p277ub.C6776b0.m15968a(r5, r0)
        L_0x0343:
            r6.f19465s = r8
            r0 = r6
            goto L_0x048a
        L_0x0348:
            pb.f r0 = m14648h(r0)
            int r6 = p277ub.C6775b.m15967a(r5, r3)     // Catch:{ IllegalArgumentException -> 0x0356 }
            r0.f19448b = r6     // Catch:{ IllegalArgumentException -> 0x0356 }
            r0.f19449c = r13     // Catch:{ IllegalArgumentException -> 0x0356 }
            goto L_0x048a
        L_0x0356:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x048a
            java.lang.String r6 = "Failed parsing color value: "
            r6.concat(r5)
            goto L_0x048a
        L_0x0368:
            java.lang.String r5 = com.google.android.play.core.appupdate.C14226d.m35341H0(r5)
            r5.getClass()
            int r6 = r5.hashCode()
            switch(r6) {
                case -618561360: goto L_0x03b0;
                case -410956671: goto L_0x03a5;
                case -250518009: goto L_0x039a;
                case -136074796: goto L_0x038e;
                case 3016401: goto L_0x0383;
                case 3556653: goto L_0x0377;
                default: goto L_0x0376;
            }
        L_0x0376:
            goto L_0x03ba
        L_0x0377:
            java.lang.String r6 = "text"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0381
            goto L_0x03ba
        L_0x0381:
            r11 = 5
            goto L_0x03ba
        L_0x0383:
            java.lang.String r6 = "base"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x038c
            goto L_0x03ba
        L_0x038c:
            r11 = 4
            goto L_0x03ba
        L_0x038e:
            java.lang.String r6 = "textContainer"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0398
            goto L_0x03ba
        L_0x0398:
            r11 = 3
            goto L_0x03ba
        L_0x039a:
            java.lang.String r6 = "delimiter"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x03a3
            goto L_0x03ba
        L_0x03a3:
            r11 = 2
            goto L_0x03ba
        L_0x03a5:
            java.lang.String r6 = "container"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x03ae
            goto L_0x03ba
        L_0x03ae:
            r11 = 1
            goto L_0x03ba
        L_0x03b0:
            java.lang.String r6 = "baseContainer"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x03b9
            goto L_0x03ba
        L_0x03b9:
            r11 = 0
        L_0x03ba:
            if (r11 == 0) goto L_0x03e1
            if (r11 == r13) goto L_0x03d9
            if (r11 == r12) goto L_0x03d1
            r5 = 3
            if (r11 == r5) goto L_0x03c9
            if (r11 == r9) goto L_0x03e1
            if (r11 == r8) goto L_0x03c9
            goto L_0x048a
        L_0x03c9:
            pb.f r0 = m14648h(r0)
            r0.f19459m = r5
            goto L_0x048a
        L_0x03d1:
            pb.f r0 = m14648h(r0)
            r0.f19459m = r9
            goto L_0x048a
        L_0x03d9:
            pb.f r0 = m14648h(r0)
            r0.f19459m = r13
            goto L_0x048a
        L_0x03e1:
            pb.f r0 = m14648h(r0)
            r0.f19459m = r12
            goto L_0x048a
        L_0x03e9:
            java.lang.String r6 = r16.getName()
            java.lang.String r7 = "style"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x048a
            pb.f r0 = m14648h(r0)
            r0.f19458l = r5
            goto L_0x048a
        L_0x03fd:
            pb.f r0 = m14648h(r0)
            java.lang.String r6 = "bold"
            boolean r5 = r6.equalsIgnoreCase(r5)
            r0.f19454h = r5
            goto L_0x048a
        L_0x040b:
            java.lang.String r5 = com.google.android.play.core.appupdate.C14226d.m35341H0(r5)
            r5.getClass()
            int r6 = r5.hashCode()
            switch(r6) {
                case -1461280213: goto L_0x043c;
                case -1026963764: goto L_0x0430;
                case 913457136: goto L_0x0425;
                case 1679736913: goto L_0x041a;
                default: goto L_0x0419;
            }
        L_0x0419:
            goto L_0x0446
        L_0x041a:
            java.lang.String r6 = "linethrough"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0423
            goto L_0x0446
        L_0x0423:
            r11 = 3
            goto L_0x0446
        L_0x0425:
            java.lang.String r6 = "nolinethrough"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x042e
            goto L_0x0446
        L_0x042e:
            r11 = 2
            goto L_0x0446
        L_0x0430:
            java.lang.String r6 = "underline"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x043a
            goto L_0x0446
        L_0x043a:
            r11 = 1
            goto L_0x0446
        L_0x043c:
            java.lang.String r6 = "nounderline"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0445
            goto L_0x0446
        L_0x0445:
            r11 = 0
        L_0x0446:
            if (r11 == 0) goto L_0x0465
            if (r11 == r13) goto L_0x045e
            if (r11 == r12) goto L_0x0457
            r5 = 3
            if (r11 == r5) goto L_0x0450
            goto L_0x048a
        L_0x0450:
            pb.f r0 = m14648h(r0)
            r0.f19452f = r13
            goto L_0x048a
        L_0x0457:
            pb.f r0 = m14648h(r0)
            r0.f19452f = r3
            goto L_0x048a
        L_0x045e:
            pb.f r0 = m14648h(r0)
            r0.f19453g = r13
            goto L_0x048a
        L_0x0465:
            pb.f r0 = m14648h(r0)
            r0.f19453g = r3
            goto L_0x048a
        L_0x046c:
            pb.f r0 = m14648h(r0)
            android.text.Layout$Alignment r5 = m14650j(r5)
            r0.f19461o = r5
            goto L_0x048a
        L_0x0477:
            pb.f r0 = m14648h(r0)
            r0.f19447a = r5
            goto L_0x048a
        L_0x047e:
            pb.f r0 = m14648h(r0)
            java.lang.String r6 = "italic"
            boolean r5 = r6.equalsIgnoreCase(r5)
            r0.f19455i = r5
        L_0x048a:
            int r4 = r4 + 1
            goto L_0x000a
        L_0x048e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213pb.C6111c.m14656p(org.xmlpull.v1.XmlPullParser, pb.f):pb.f");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ad, code lost:
        if (r13.equals("ms") == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e4, code lost:
        r8 = r8 / r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f2, code lost:
        r8 = r8 * r13;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m14657q(java.lang.String r13, p213pb.C6111c.C6113b r14) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
            java.util.regex.Pattern r0 = f19408n
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L_0x007f
            java.lang.String r13 = r0.group(r7)
            r13.getClass()
            long r7 = java.lang.Long.parseLong(r13)
            r9 = 3600(0xe10, double:1.7786E-320)
            long r7 = r7 * r9
            double r7 = (double) r7
            java.lang.String r13 = r0.group(r6)
            r13.getClass()
            long r9 = java.lang.Long.parseLong(r13)
            r11 = 60
            long r9 = r9 * r11
            double r9 = (double) r9
            double r7 = r7 + r9
            java.lang.String r13 = r0.group(r5)
            r13.getClass()
            long r5 = java.lang.Long.parseLong(r13)
            double r5 = (double) r5
            double r7 = r7 + r5
            java.lang.String r13 = r0.group(r4)
            r4 = 0
            if (r13 == 0) goto L_0x0050
            double r9 = java.lang.Double.parseDouble(r13)
            goto L_0x0051
        L_0x0050:
            r9 = r4
        L_0x0051:
            double r7 = r7 + r9
            r13 = 5
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L_0x0063
            long r9 = java.lang.Long.parseLong(r13)
            float r13 = (float) r9
            float r1 = r14.f19419a
            float r13 = r13 / r1
            double r9 = (double) r13
            goto L_0x0064
        L_0x0063:
            r9 = r4
        L_0x0064:
            double r7 = r7 + r9
            r13 = 6
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L_0x007a
            long r0 = java.lang.Long.parseLong(r13)
            double r0 = (double) r0
            int r13 = r14.f19420b
            double r4 = (double) r13
            double r0 = r0 / r4
            float r13 = r14.f19419a
            double r13 = (double) r13
            double r4 = r0 / r13
        L_0x007a:
            double r7 = r7 + r4
            double r7 = r7 * r2
            long r13 = (long) r7
            return r13
        L_0x007f:
            java.util.regex.Pattern r0 = f19409o
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x00fd
            java.lang.String r13 = r0.group(r7)
            r13.getClass()
            double r8 = java.lang.Double.parseDouble(r13)
            java.lang.String r13 = r0.group(r6)
            r13.getClass()
            r0 = -1
            int r1 = r13.hashCode()
            switch(r1) {
                case 102: goto L_0x00d1;
                case 104: goto L_0x00c6;
                case 109: goto L_0x00bb;
                case 116: goto L_0x00b0;
                case 3494: goto L_0x00a7;
                default: goto L_0x00a5;
            }
        L_0x00a5:
            r4 = -1
            goto L_0x00db
        L_0x00a7:
            java.lang.String r1 = "ms"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00db
            goto L_0x00a5
        L_0x00b0:
            java.lang.String r1 = "t"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00b9
            goto L_0x00a5
        L_0x00b9:
            r4 = 3
            goto L_0x00db
        L_0x00bb:
            java.lang.String r1 = "m"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00c4
            goto L_0x00a5
        L_0x00c4:
            r4 = 2
            goto L_0x00db
        L_0x00c6:
            java.lang.String r1 = "h"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00cf
            goto L_0x00a5
        L_0x00cf:
            r4 = 1
            goto L_0x00db
        L_0x00d1:
            java.lang.String r1 = "f"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00da
            goto L_0x00a5
        L_0x00da:
            r4 = 0
        L_0x00db:
            switch(r4) {
                case 0: goto L_0x00f5;
                case 1: goto L_0x00ed;
                case 2: goto L_0x00ea;
                case 3: goto L_0x00e6;
                case 4: goto L_0x00df;
                default: goto L_0x00de;
            }
        L_0x00de:
            goto L_0x00f9
        L_0x00df:
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x00e4:
            double r8 = r8 / r13
            goto L_0x00f9
        L_0x00e6:
            int r13 = r14.f19421c
            double r13 = (double) r13
            goto L_0x00e4
        L_0x00ea:
            r13 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x00f2
        L_0x00ed:
            r13 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x00f2:
            double r8 = r8 * r13
            goto L_0x00f9
        L_0x00f5:
            float r13 = r14.f19419a
            double r13 = (double) r13
            goto L_0x00e4
        L_0x00f9:
            double r8 = r8 * r2
            long r13 = (long) r8
            return r13
        L_0x00fd:
            com.google.android.exoplayer2.text.SubtitleDecoderException r14 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r0 = "Malformed time expression: "
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r1 = r13.length()
            if (r1 == 0) goto L_0x0110
            java.lang.String r13 = r0.concat(r13)
            goto L_0x0115
        L_0x0110:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r0)
        L_0x0115:
            r14.<init>((java.lang.String) r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p213pb.C6111c.m14657q(java.lang.String, pb.c$b):long");
    }

    /* renamed from: r */
    public static C6114c m14658r(XmlPullParser xmlPullParser) {
        String b = C6776b0.m15969b(xmlPullParser, "extent");
        if (b == null) {
            return null;
        }
        Matcher matcher = f19413s.matcher(b);
        if (!matcher.matches()) {
            if (b.length() != 0) {
                "Ignoring non-pixel tts extent: ".concat(b);
            }
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new C6114c(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            if (b.length() != 0) {
                "Ignoring malformed tts extent: ".concat(b);
            }
            return null;
        }
    }

    /* renamed from: g */
    public final C5336d mo21119g(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        C6113b bVar;
        try {
            XmlPullParser b = this.f19417m.mo53086b();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new C6116e("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C6114c cVar = null;
            b.setInput(new ByteArrayInputStream(bArr, 0, i), (String) null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C6113b bVar2 = f19415u;
            C6112a aVar = f19416v;
            C6118g gVar = null;
            int i2 = 0;
            for (int eventType = b.getEventType(); eventType != 1; eventType = b.getEventType()) {
                C6115d dVar = (C6115d) arrayDeque.peek();
                if (i2 == 0) {
                    String name = b.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = m14653m(b);
                            aVar = m14651k(b, f19416v);
                            cVar = m14658r(b);
                        }
                        C6114c cVar2 = cVar;
                        C6113b bVar3 = bVar2;
                        C6112a aVar2 = aVar;
                        if (!m14649i(name)) {
                            String valueOf = String.valueOf(b.getName());
                            if (valueOf.length() != 0) {
                                "Ignoring unsupported tag: ".concat(valueOf);
                            }
                            i2++;
                            bVar = bVar3;
                        } else if ("head".equals(name)) {
                            bVar = bVar3;
                            m14654n(b, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                        } else {
                            bVar = bVar3;
                            try {
                                C6115d o = m14655o(b, dVar, hashMap2, bVar);
                                arrayDeque.push(o);
                                if (dVar != null) {
                                    if (dVar.f19436m == null) {
                                        dVar.f19436m = new ArrayList();
                                    }
                                    dVar.f19436m.add(o);
                                }
                            } catch (SubtitleDecoderException e) {
                                C6776b0.m15968a("Suppressing parser error", e);
                                i2++;
                            }
                        }
                        bVar2 = bVar;
                        cVar = cVar2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        dVar.getClass();
                        C6115d a = C6115d.m14660a(b.getText());
                        if (dVar.f19436m == null) {
                            dVar.f19436m = new ArrayList();
                        }
                        dVar.f19436m.add(a);
                    } else if (eventType == 3) {
                        if (b.getName().equals("tt")) {
                            C6115d dVar2 = (C6115d) arrayDeque.peek();
                            dVar2.getClass();
                            gVar = new C6118g(dVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                b.next();
            }
            if (gVar != null) {
                return gVar;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (XmlPullParserException e2) {
            throw new SubtitleDecoderException("Unable to decode source", e2);
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        }
    }
}
