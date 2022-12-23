package p601ke;

import android.util.JsonReader;
import com.appboy.support.AppboyFileUtils;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import p577je.C17724a;
import p577je.C17780b;
import p577je.C17782b0;
import p577je.C17789d;
import p577je.C17805o;
import p577je.C17811r;
import p837ue.C19895d;
import p837ue.C19896e;

/* renamed from: ke.a */
public final class C18028a {

    /* renamed from: a */
    public static final C19895d f46139a;

    /* renamed from: ke.a$a */
    public interface C18029a<T> {
        /* renamed from: f */
        T mo245f(JsonReader jsonReader) throws IOException;
    }

    static {
        C19896e eVar = new C19896e();
        C17724a.f45474a.configure(eVar);
        eVar.f50526d = true;
        f46139a = new C19895d(eVar);
    }

    /* renamed from: a */
    public static C17811r m44701a(JsonReader jsonReader) {
        C17811r.C17812a aVar = new C17811r.C17812a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals(AppboyFileUtils.FILE_SCHEME)) {
                        c = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    aVar.f45743d = Long.valueOf(jsonReader.nextLong());
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        aVar.f45741b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null symbol");
                    }
                case 2:
                    aVar.f45740a = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    aVar.f45742c = jsonReader.nextString();
                    break;
                case 4:
                    aVar.f45744e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.mo50377a();
    }

    /* renamed from: b */
    public static C17789d m44702b(JsonReader jsonReader) {
        String str;
        jsonReader.beginObject();
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals(LinksConfiguration.KEY_KEY)) {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else {
                str3 = jsonReader.nextString();
                if (str3 == null) {
                    throw new NullPointerException("Null value");
                }
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            str = " key";
        } else {
            str = "";
        }
        if (str3 == null) {
            str = C25541a.m63881k(str, " value");
        }
        if (str.isEmpty()) {
            return new C17789d(str2, str3);
        }
        throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str));
    }

    /* renamed from: c */
    public static <T> C17782b0<T> m44703c(JsonReader jsonReader, C18029a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.mo245f(jsonReader));
        }
        jsonReader.endArray();
        return new C17782b0<>(arrayList);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x027d  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p577je.C17798k m44704d(android.util.JsonReader r24) throws java.io.IOException {
        /*
            r0 = r24
            je.k$a r1 = new je.k$a
            r1.<init>()
            r24.beginObject()
        L_0x000a:
            boolean r2 = r24.hasNext()
            if (r2 == 0) goto L_0x04aa
            java.lang.String r2 = r24.nextName()
            r2.getClass()
            int r3 = r2.hashCode()
            java.lang.String r4 = "timestamp"
            r5 = 3
            r6 = 4
            r7 = 1
            r8 = 2
            switch(r3) {
                case -1335157162: goto L_0x004f;
                case 96801: goto L_0x0044;
                case 107332: goto L_0x0039;
                case 3575610: goto L_0x002e;
                case 55126294: goto L_0x0025;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x005a
        L_0x0025:
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x002c
            goto L_0x005a
        L_0x002c:
            r2 = 4
            goto L_0x005b
        L_0x002e:
            java.lang.String r3 = "type"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0037
            goto L_0x005a
        L_0x0037:
            r2 = 3
            goto L_0x005b
        L_0x0039:
            java.lang.String r3 = "log"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0042
            goto L_0x005a
        L_0x0042:
            r2 = 2
            goto L_0x005b
        L_0x0044:
            java.lang.String r3 = "app"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x004d
            goto L_0x005a
        L_0x004d:
            r2 = 1
            goto L_0x005b
        L_0x004f:
            java.lang.String r3 = "device"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r2 = 0
            goto L_0x005b
        L_0x005a:
            r2 = -1
        L_0x005b:
            r3 = 5
            if (r2 == 0) goto L_0x03e4
            java.lang.String r3 = "Missing required properties:"
            java.lang.String r9 = ""
            if (r2 == r7) goto L_0x00d6
            if (r2 == r8) goto L_0x008a
            if (r2 == r5) goto L_0x0079
            if (r2 == r6) goto L_0x006e
            r24.skipValue()
            goto L_0x000a
        L_0x006e:
            long r2 = r24.nextLong()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.f45685a = r2
            goto L_0x000a
        L_0x0079:
            java.lang.String r2 = r24.nextString()
            if (r2 == 0) goto L_0x0082
            r1.f45686b = r2
            goto L_0x000a
        L_0x0082:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null type"
            r0.<init>(r1)
            throw r0
        L_0x008a:
            r24.beginObject()
            r2 = 0
        L_0x008e:
            boolean r4 = r24.hasNext()
            if (r4 == 0) goto L_0x00b6
            java.lang.String r4 = r24.nextName()
            r4.getClass()
            java.lang.String r5 = "content"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00a7
            r24.skipValue()
            goto L_0x008e
        L_0x00a7:
            java.lang.String r2 = r24.nextString()
            if (r2 == 0) goto L_0x00ae
            goto L_0x008e
        L_0x00ae:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null content"
            r0.<init>(r1)
            throw r0
        L_0x00b6:
            r24.endObject()
            if (r2 != 0) goto L_0x00bd
            java.lang.String r9 = " content"
        L_0x00bd:
            boolean r4 = r9.isEmpty()
            if (r4 == 0) goto L_0x00cc
            je.t r3 = new je.t
            r3.<init>(r2)
            r1.f45689e = r3
            goto L_0x000a
        L_0x00cc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p379.C25541a.m63881k(r3, r9)
            r0.<init>(r1)
            throw r0
        L_0x00d6:
            r24.beginObject()
            r2 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
        L_0x00e2:
            boolean r10 = r24.hasNext()
            if (r10 == 0) goto L_0x03b7
            java.lang.String r10 = r24.nextName()
            r10.getClass()
            int r15 = r10.hashCode()
            switch(r15) {
                case -1332194002: goto L_0x0123;
                case -1090974952: goto L_0x0118;
                case -80231855: goto L_0x010d;
                case 555169704: goto L_0x0102;
                case 928737948: goto L_0x00f7;
                default: goto L_0x00f6;
            }
        L_0x00f6:
            goto L_0x012e
        L_0x00f7:
            java.lang.String r15 = "uiOrientation"
            boolean r10 = r10.equals(r15)
            if (r10 != 0) goto L_0x0100
            goto L_0x012e
        L_0x0100:
            r10 = 4
            goto L_0x012f
        L_0x0102:
            java.lang.String r15 = "customAttributes"
            boolean r10 = r10.equals(r15)
            if (r10 != 0) goto L_0x010b
            goto L_0x012e
        L_0x010b:
            r10 = 3
            goto L_0x012f
        L_0x010d:
            java.lang.String r15 = "internalKeys"
            boolean r10 = r10.equals(r15)
            if (r10 != 0) goto L_0x0116
            goto L_0x012e
        L_0x0116:
            r10 = 2
            goto L_0x012f
        L_0x0118:
            java.lang.String r15 = "execution"
            boolean r10 = r10.equals(r15)
            if (r10 != 0) goto L_0x0121
            goto L_0x012e
        L_0x0121:
            r10 = 1
            goto L_0x012f
        L_0x0123:
            java.lang.String r15 = "background"
            boolean r10 = r10.equals(r15)
            if (r10 != 0) goto L_0x012c
            goto L_0x012e
        L_0x012c:
            r10 = 0
            goto L_0x012f
        L_0x012e:
            r10 = -1
        L_0x012f:
            if (r10 == 0) goto L_0x03ac
            if (r10 == r7) goto L_0x0186
            if (r10 == r8) goto L_0x0166
            if (r10 == r5) goto L_0x0146
            if (r10 == r6) goto L_0x013d
            r24.skipValue()
            goto L_0x00e2
        L_0x013d:
            int r2 = r24.nextInt()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x00e2
        L_0x0146:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r24.beginArray()
        L_0x014e:
            boolean r12 = r24.hasNext()
            if (r12 == 0) goto L_0x015c
            je.d r12 = m44702b(r24)
            r10.add(r12)
            goto L_0x014e
        L_0x015c:
            r24.endArray()
            je.b0 r12 = new je.b0
            r12.<init>(r10)
            goto L_0x00e2
        L_0x0166:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r24.beginArray()
        L_0x016e:
            boolean r13 = r24.hasNext()
            if (r13 == 0) goto L_0x017c
            je.d r13 = m44702b(r24)
            r10.add(r13)
            goto L_0x016e
        L_0x017c:
            r24.endArray()
            je.b0 r13 = new je.b0
            r13.<init>(r10)
            goto L_0x00e2
        L_0x0186:
            r24.beginObject()
            r10 = 0
            r11 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = r10
            r20 = r11
            r21 = r15
            r22 = r16
            r23 = r17
        L_0x019a:
            boolean r10 = r24.hasNext()
            if (r10 == 0) goto L_0x0383
            java.lang.String r10 = r24.nextName()
            r10.getClass()
            int r11 = r10.hashCode()
            switch(r11) {
                case -1375141843: goto L_0x01db;
                case -1337936983: goto L_0x01d0;
                case -902467928: goto L_0x01c5;
                case 937615455: goto L_0x01ba;
                case 1481625679: goto L_0x01af;
                default: goto L_0x01ae;
            }
        L_0x01ae:
            goto L_0x01e6
        L_0x01af:
            java.lang.String r11 = "exception"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x01b8
            goto L_0x01e6
        L_0x01b8:
            r10 = 4
            goto L_0x01e7
        L_0x01ba:
            java.lang.String r11 = "binaries"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x01c3
            goto L_0x01e6
        L_0x01c3:
            r10 = 3
            goto L_0x01e7
        L_0x01c5:
            java.lang.String r11 = "signal"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x01ce
            goto L_0x01e6
        L_0x01ce:
            r10 = 2
            goto L_0x01e7
        L_0x01d0:
            java.lang.String r11 = "threads"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x01d9
            goto L_0x01e6
        L_0x01d9:
            r10 = 1
            goto L_0x01e7
        L_0x01db:
            java.lang.String r11 = "appExitInfo"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x01e4
            goto L_0x01e6
        L_0x01e4:
            r10 = 0
            goto L_0x01e7
        L_0x01e6:
            r10 = -1
        L_0x01e7:
            r11 = 7
            if (r10 == 0) goto L_0x029d
            if (r10 == r7) goto L_0x0291
            if (r10 == r8) goto L_0x0207
            if (r10 == r5) goto L_0x01fb
            if (r10 == r6) goto L_0x01f6
            r24.skipValue()
            goto L_0x019a
        L_0x01f6:
            je.o r20 = m44705e(r24)
            goto L_0x019a
        L_0x01fb:
            e0.r0 r10 = new e0.r0
            r11 = 8
            r10.<init>(r11)
            je.b0 r23 = m44703c(r0, r10)
            goto L_0x019a
        L_0x0207:
            je.p$a r10 = new je.p$a
            r10.<init>()
            r24.beginObject()
        L_0x020f:
            boolean r11 = r24.hasNext()
            if (r11 == 0) goto L_0x0289
            java.lang.String r11 = r24.nextName()
            r11.getClass()
            int r15 = r11.hashCode()
            r6 = -1147692044(0xffffffffbb979bf4, float:-0.0046267454)
            if (r15 == r6) goto L_0x0246
            r6 = 3059181(0x2eaded, float:4.286826E-39)
            if (r15 == r6) goto L_0x023b
            r6 = 3373707(0x337a8b, float:4.72757E-39)
            if (r15 == r6) goto L_0x0230
            goto L_0x024e
        L_0x0230:
            java.lang.String r6 = "name"
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto L_0x0239
            goto L_0x024e
        L_0x0239:
            r6 = 2
            goto L_0x0251
        L_0x023b:
            java.lang.String r6 = "code"
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto L_0x0244
            goto L_0x024e
        L_0x0244:
            r6 = 1
            goto L_0x0251
        L_0x0246:
            java.lang.String r6 = "address"
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto L_0x0250
        L_0x024e:
            r6 = -1
            goto L_0x0251
        L_0x0250:
            r6 = 0
        L_0x0251:
            if (r6 == 0) goto L_0x027d
            if (r6 == r7) goto L_0x026c
            if (r6 == r8) goto L_0x025b
            r24.skipValue()
            goto L_0x0287
        L_0x025b:
            java.lang.String r6 = r24.nextString()
            if (r6 == 0) goto L_0x0264
            r10.f45726a = r6
            goto L_0x0287
        L_0x0264:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null name"
            r0.<init>(r1)
            throw r0
        L_0x026c:
            java.lang.String r6 = r24.nextString()
            if (r6 == 0) goto L_0x0275
            r10.f45727b = r6
            goto L_0x0287
        L_0x0275:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null code"
            r0.<init>(r1)
            throw r0
        L_0x027d:
            long r17 = r24.nextLong()
            java.lang.Long r6 = java.lang.Long.valueOf(r17)
            r10.f45728c = r6
        L_0x0287:
            r6 = 4
            goto L_0x020f
        L_0x0289:
            r24.endObject()
            je.p r22 = r10.mo50369a()
            goto L_0x029a
        L_0x0291:
            e0.q0 r6 = new e0.q0
            r6.<init>(r11)
            je.b0 r19 = m44703c(r0, r6)
        L_0x029a:
            r6 = 4
            goto L_0x019a
        L_0x029d:
            je.c$a r6 = new je.c$a
            r6.<init>()
            r24.beginObject()
        L_0x02a5:
            boolean r10 = r24.hasNext()
            if (r10 == 0) goto L_0x037a
            java.lang.String r10 = r24.nextName()
            r10.getClass()
            int r11 = r10.hashCode()
            switch(r11) {
                case 110987: goto L_0x0306;
                case 111312: goto L_0x02fb;
                case 113234: goto L_0x02f0;
                case 55126294: goto L_0x02e7;
                case 202325402: goto L_0x02dc;
                case 722137681: goto L_0x02d1;
                case 723857505: goto L_0x02c6;
                case 2125650548: goto L_0x02bb;
                default: goto L_0x02b9;
            }
        L_0x02b9:
            goto L_0x0311
        L_0x02bb:
            java.lang.String r11 = "importance"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x02c4
            goto L_0x0311
        L_0x02c4:
            r10 = 7
            goto L_0x0312
        L_0x02c6:
            java.lang.String r11 = "traceFile"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x02cf
            goto L_0x0311
        L_0x02cf:
            r10 = 6
            goto L_0x0312
        L_0x02d1:
            java.lang.String r11 = "reasonCode"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x02da
            goto L_0x0311
        L_0x02da:
            r10 = 5
            goto L_0x0312
        L_0x02dc:
            java.lang.String r11 = "processName"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x02e5
            goto L_0x0311
        L_0x02e5:
            r10 = 4
            goto L_0x0312
        L_0x02e7:
            boolean r10 = r10.equals(r4)
            if (r10 != 0) goto L_0x02ee
            goto L_0x0311
        L_0x02ee:
            r10 = 3
            goto L_0x0312
        L_0x02f0:
            java.lang.String r11 = "rss"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x02f9
            goto L_0x0311
        L_0x02f9:
            r10 = 2
            goto L_0x0312
        L_0x02fb:
            java.lang.String r11 = "pss"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0304
            goto L_0x0311
        L_0x0304:
            r10 = 1
            goto L_0x0312
        L_0x0306:
            java.lang.String r11 = "pid"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x030f
            goto L_0x0311
        L_0x030f:
            r10 = 0
            goto L_0x0312
        L_0x0311:
            r10 = -1
        L_0x0312:
            switch(r10) {
                case 0: goto L_0x036e;
                case 1: goto L_0x0362;
                case 2: goto L_0x0356;
                case 3: goto L_0x034a;
                case 4: goto L_0x0338;
                case 5: goto L_0x032c;
                case 6: goto L_0x0324;
                case 7: goto L_0x0319;
                default: goto L_0x0315;
            }
        L_0x0315:
            r24.skipValue()
            goto L_0x02a5
        L_0x0319:
            int r10 = r24.nextInt()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6.f45622d = r10
            goto L_0x02a5
        L_0x0324:
            java.lang.String r10 = r24.nextString()
            r6.f45626h = r10
            goto L_0x02a5
        L_0x032c:
            int r10 = r24.nextInt()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6.f45621c = r10
            goto L_0x02a5
        L_0x0338:
            java.lang.String r10 = r24.nextString()
            if (r10 == 0) goto L_0x0342
            r6.f45620b = r10
            goto L_0x02a5
        L_0x0342:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null processName"
            r0.<init>(r1)
            throw r0
        L_0x034a:
            long r10 = r24.nextLong()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r6.f45625g = r10
            goto L_0x02a5
        L_0x0356:
            long r10 = r24.nextLong()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r6.f45624f = r10
            goto L_0x02a5
        L_0x0362:
            long r10 = r24.nextLong()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r6.f45623e = r10
            goto L_0x02a5
        L_0x036e:
            int r10 = r24.nextInt()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6.f45619a = r10
            goto L_0x02a5
        L_0x037a:
            r24.endObject()
            je.c r21 = r6.mo50302a()
            goto L_0x029a
        L_0x0383:
            r24.endObject()
            if (r22 != 0) goto L_0x038b
            java.lang.String r6 = " signal"
            goto L_0x038c
        L_0x038b:
            r6 = r9
        L_0x038c:
            if (r23 != 0) goto L_0x0394
            java.lang.String r10 = " binaries"
            java.lang.String r6 = p379.C25541a.m63881k(r6, r10)
        L_0x0394:
            boolean r10 = r6.isEmpty()
            if (r10 == 0) goto L_0x03a2
            je.m r11 = new je.m
            r18 = r11
            r18.<init>(r19, r20, r21, r22, r23)
            goto L_0x03b4
        L_0x03a2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p379.C25541a.m63881k(r3, r6)
            r0.<init>(r1)
            throw r0
        L_0x03ac:
            boolean r6 = r24.nextBoolean()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r6)
        L_0x03b4:
            r6 = 4
            goto L_0x00e2
        L_0x03b7:
            r24.endObject()
            if (r11 != 0) goto L_0x03be
            java.lang.String r9 = " execution"
        L_0x03be:
            if (r2 != 0) goto L_0x03c6
            java.lang.String r4 = " uiOrientation"
            java.lang.String r9 = p379.C25541a.m63881k(r9, r4)
        L_0x03c6:
            boolean r4 = r9.isEmpty()
            if (r4 == 0) goto L_0x03da
            je.l r3 = new je.l
            int r15 = r2.intValue()
            r10 = r3
            r10.<init>(r11, r12, r13, r14, r15)
            r1.f45687c = r3
            goto L_0x000a
        L_0x03da:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p379.C25541a.m63881k(r3, r9)
            r0.<init>(r1)
            throw r0
        L_0x03e4:
            je.s$a r2 = new je.s$a
            r2.<init>()
            r24.beginObject()
        L_0x03ec:
            boolean r4 = r24.hasNext()
            if (r4 == 0) goto L_0x049f
            java.lang.String r4 = r24.nextName()
            r4.getClass()
            int r6 = r4.hashCode()
            switch(r6) {
                case -1708606089: goto L_0x0438;
                case -1455558134: goto L_0x042d;
                case -1439500848: goto L_0x0422;
                case 279795450: goto L_0x0417;
                case 976541947: goto L_0x040c;
                case 1516795582: goto L_0x0401;
                default: goto L_0x0400;
            }
        L_0x0400:
            goto L_0x0443
        L_0x0401:
            java.lang.String r6 = "proximityOn"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x040a
            goto L_0x0443
        L_0x040a:
            r4 = 5
            goto L_0x0444
        L_0x040c:
            java.lang.String r6 = "ramUsed"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0415
            goto L_0x0443
        L_0x0415:
            r4 = 4
            goto L_0x0444
        L_0x0417:
            java.lang.String r6 = "diskUsed"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0420
            goto L_0x0443
        L_0x0420:
            r4 = 3
            goto L_0x0444
        L_0x0422:
            java.lang.String r6 = "orientation"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x042b
            goto L_0x0443
        L_0x042b:
            r4 = 2
            goto L_0x0444
        L_0x042d:
            java.lang.String r6 = "batteryVelocity"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0436
            goto L_0x0443
        L_0x0436:
            r4 = 1
            goto L_0x0444
        L_0x0438:
            java.lang.String r6 = "batteryLevel"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0441
            goto L_0x0443
        L_0x0441:
            r4 = 0
            goto L_0x0444
        L_0x0443:
            r4 = -1
        L_0x0444:
            if (r4 == 0) goto L_0x0492
            if (r4 == r7) goto L_0x0485
            if (r4 == r8) goto L_0x0478
            if (r4 == r5) goto L_0x046b
            r6 = 4
            if (r4 == r6) goto L_0x0460
            if (r4 == r3) goto L_0x0455
            r24.skipValue()
            goto L_0x03ec
        L_0x0455:
            boolean r4 = r24.nextBoolean()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2.f45753c = r4
            goto L_0x03ec
        L_0x0460:
            long r9 = r24.nextLong()
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r2.f45755e = r4
            goto L_0x03ec
        L_0x046b:
            r6 = 4
            long r9 = r24.nextLong()
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r2.f45756f = r4
            goto L_0x03ec
        L_0x0478:
            r6 = 4
            int r4 = r24.nextInt()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.f45754d = r4
            goto L_0x03ec
        L_0x0485:
            r6 = 4
            int r4 = r24.nextInt()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.f45752b = r4
            goto L_0x03ec
        L_0x0492:
            r6 = 4
            double r9 = r24.nextDouble()
            java.lang.Double r4 = java.lang.Double.valueOf(r9)
            r2.f45751a = r4
            goto L_0x03ec
        L_0x049f:
            r24.endObject()
            je.s r2 = r2.mo50381a()
            r1.f45688d = r2
            goto L_0x000a
        L_0x04aa:
            r24.endObject()
            je.k r0 = r1.mo50350a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p601ke.C18028a.m44704d(android.util.JsonReader):je.k");
    }

    /* renamed from: e */
    public static C17805o m44705e(JsonReader jsonReader) throws IOException {
        C17805o.C17806a aVar = new C17805o.C17806a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    ArrayList arrayList = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(m44701a(jsonReader));
                    }
                    jsonReader.endArray();
                    aVar.f45720c = new C17782b0<>(arrayList);
                    break;
                case 1:
                    aVar.f45719b = jsonReader.nextString();
                    break;
                case 2:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        aVar.f45718a = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null type");
                    }
                case 3:
                    aVar.f45721d = m44705e(jsonReader);
                    break;
                case 4:
                    aVar.f45722e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.mo50365a();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p577je.C17780b m44706f(android.util.JsonReader r24) throws java.io.IOException {
        /*
            java.nio.charset.Charset r0 = p577je.C17746a0.f45593a
            je.b$a r0 = new je.b$a
            r0.<init>()
            r24.beginObject()
        L_0x000a:
            boolean r1 = r24.hasNext()
            if (r1 == 0) goto L_0x054a
            java.lang.String r1 = r24.nextName()
            r1.getClass()
            int r2 = r1.hashCode()
            java.lang.String r3 = "displayVersion"
            java.lang.String r4 = "platform"
            java.lang.String r5 = "installationUuid"
            java.lang.String r6 = "buildVersion"
            r7 = 1
            switch(r2) {
                case -2118372775: goto L_0x006d;
                case -1962630338: goto L_0x0062;
                case -911706486: goto L_0x0059;
                case 344431858: goto L_0x004e;
                case 719853845: goto L_0x0045;
                case 1874684019: goto L_0x003c;
                case 1975623094: goto L_0x0033;
                case 1984987798: goto L_0x0028;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x0078
        L_0x0028:
            java.lang.String r2 = "session"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0031
            goto L_0x0078
        L_0x0031:
            r1 = 7
            goto L_0x0079
        L_0x0033:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x003a
            goto L_0x0078
        L_0x003a:
            r1 = 6
            goto L_0x0079
        L_0x003c:
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0043
            goto L_0x0078
        L_0x0043:
            r1 = 5
            goto L_0x0079
        L_0x0045:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x004c
            goto L_0x0078
        L_0x004c:
            r1 = 4
            goto L_0x0079
        L_0x004e:
            java.lang.String r2 = "gmpAppId"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0057
            goto L_0x0078
        L_0x0057:
            r1 = 3
            goto L_0x0079
        L_0x0059:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0060
            goto L_0x0078
        L_0x0060:
            r1 = 2
            goto L_0x0079
        L_0x0062:
            java.lang.String r2 = "sdkVersion"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x006b
            goto L_0x0078
        L_0x006b:
            r1 = 1
            goto L_0x0079
        L_0x006d:
            java.lang.String r2 = "ndkPayload"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r1 = 0
            goto L_0x0079
        L_0x0078:
            r1 = -1
        L_0x0079:
            java.lang.String r2 = "Null buildVersion"
            java.lang.String r8 = ""
            java.lang.String r9 = "Missing required properties:"
            switch(r1) {
                case 0: goto L_0x04ef;
                case 1: goto L_0x04dd;
                case 2: goto L_0x04cd;
                case 3: goto L_0x04bb;
                case 4: goto L_0x04a9;
                case 5: goto L_0x049d;
                case 6: goto L_0x048b;
                case 7: goto L_0x0088;
                default: goto L_0x0082;
            }
        L_0x0082:
            r3 = r24
            r24.skipValue()
            goto L_0x000a
        L_0x0088:
            je.g$a r1 = new je.g$a
            r1.<init>()
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r1.f45648e = r11
            r24.beginObject()
        L_0x0094:
            boolean r11 = r24.hasNext()
            if (r11 == 0) goto L_0x0480
            java.lang.String r11 = r24.nextName()
            r11.getClass()
            int r12 = r11.hashCode()
            java.lang.String r13 = "identifier"
            switch(r12) {
                case -2128794476: goto L_0x0121;
                case -1618432855: goto L_0x0118;
                case -1606742899: goto L_0x010d;
                case -1335157162: goto L_0x0102;
                case -1291329255: goto L_0x00f7;
                case 3556: goto L_0x00ec;
                case 96801: goto L_0x00e1;
                case 3599307: goto L_0x00d6;
                case 286956243: goto L_0x00c8;
                case 1025385094: goto L_0x00ba;
                case 2047016109: goto L_0x00ac;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            goto L_0x012c
        L_0x00ac:
            java.lang.String r12 = "generatorType"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x00b6
            goto L_0x012c
        L_0x00b6:
            r11 = 10
            goto L_0x012d
        L_0x00ba:
            java.lang.String r12 = "crashed"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x00c4
            goto L_0x012c
        L_0x00c4:
            r11 = 9
            goto L_0x012d
        L_0x00c8:
            java.lang.String r12 = "generator"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x00d2
            goto L_0x012c
        L_0x00d2:
            r11 = 8
            goto L_0x012d
        L_0x00d6:
            java.lang.String r12 = "user"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x00df
            goto L_0x012c
        L_0x00df:
            r11 = 7
            goto L_0x012d
        L_0x00e1:
            java.lang.String r12 = "app"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x00ea
            goto L_0x012c
        L_0x00ea:
            r11 = 6
            goto L_0x012d
        L_0x00ec:
            java.lang.String r12 = "os"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x00f5
            goto L_0x012c
        L_0x00f5:
            r11 = 5
            goto L_0x012d
        L_0x00f7:
            java.lang.String r12 = "events"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0100
            goto L_0x012c
        L_0x0100:
            r11 = 4
            goto L_0x012d
        L_0x0102:
            java.lang.String r12 = "device"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x010b
            goto L_0x012c
        L_0x010b:
            r11 = 3
            goto L_0x012d
        L_0x010d:
            java.lang.String r12 = "endedAt"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0116
            goto L_0x012c
        L_0x0116:
            r11 = 2
            goto L_0x012d
        L_0x0118:
            boolean r11 = r11.equals(r13)
            if (r11 != 0) goto L_0x011f
            goto L_0x012c
        L_0x011f:
            r11 = 1
            goto L_0x012d
        L_0x0121:
            java.lang.String r12 = "startedAt"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x012a
            goto L_0x012c
        L_0x012a:
            r11 = 0
            goto L_0x012d
        L_0x012c:
            r11 = -1
        L_0x012d:
            java.lang.String r12 = "version"
            java.lang.String r14 = "Null version"
            java.lang.String r15 = "Null identifier"
            java.lang.String r16 = " identifier"
            switch(r11) {
                case 0: goto L_0x0474;
                case 1: goto L_0x0460;
                case 2: goto L_0x0454;
                case 3: goto L_0x033e;
                case 4: goto L_0x031c;
                case 5: goto L_0x028b;
                case 6: goto L_0x01b1;
                case 7: goto L_0x0167;
                case 8: goto L_0x0155;
                case 9: goto L_0x0149;
                case 10: goto L_0x013d;
                default: goto L_0x0138;
            }
        L_0x0138:
            r24.skipValue()
            goto L_0x0094
        L_0x013d:
            int r11 = r24.nextInt()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r1.f45654k = r11
            goto L_0x0094
        L_0x0149:
            boolean r11 = r24.nextBoolean()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r1.f45648e = r11
            goto L_0x0094
        L_0x0155:
            java.lang.String r11 = r24.nextString()
            if (r11 == 0) goto L_0x015f
            r1.f45644a = r11
            goto L_0x0094
        L_0x015f:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null generator"
            r0.<init>(r1)
            throw r0
        L_0x0167:
            r24.beginObject()
            r11 = 0
        L_0x016b:
            boolean r12 = r24.hasNext()
            if (r12 == 0) goto L_0x018f
            java.lang.String r12 = r24.nextName()
            r12.getClass()
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x0182
            r24.skipValue()
            goto L_0x016b
        L_0x0182:
            java.lang.String r11 = r24.nextString()
            if (r11 == 0) goto L_0x0189
            goto L_0x016b
        L_0x0189:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r15)
            throw r0
        L_0x018f:
            r24.endObject()
            if (r11 != 0) goto L_0x0197
            r12 = r16
            goto L_0x0198
        L_0x0197:
            r12 = r8
        L_0x0198:
            boolean r13 = r12.isEmpty()
            if (r13 == 0) goto L_0x01a7
            je.v r12 = new je.v
            r12.<init>(r11)
            r1.f45650g = r12
            goto L_0x0094
        L_0x01a7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p379.C25541a.m63881k(r9, r12)
            r0.<init>(r1)
            throw r0
        L_0x01b1:
            r24.beginObject()
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
        L_0x01c0:
            boolean r11 = r24.hasNext()
            if (r11 == 0) goto L_0x0254
            java.lang.String r11 = r24.nextName()
            r11.getClass()
            int r23 = r11.hashCode()
            switch(r23) {
                case -1618432855: goto L_0x0206;
                case -519438642: goto L_0x01fb;
                case 213652010: goto L_0x01f0;
                case 351608024: goto L_0x01e7;
                case 719853845: goto L_0x01de;
                case 1975623094: goto L_0x01d5;
                default: goto L_0x01d4;
            }
        L_0x01d4:
            goto L_0x020f
        L_0x01d5:
            boolean r11 = r11.equals(r3)
            if (r11 != 0) goto L_0x01dc
            goto L_0x020f
        L_0x01dc:
            r11 = 5
            goto L_0x0210
        L_0x01de:
            boolean r11 = r11.equals(r5)
            if (r11 != 0) goto L_0x01e5
            goto L_0x020f
        L_0x01e5:
            r11 = 4
            goto L_0x0210
        L_0x01e7:
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x01ee
            goto L_0x020f
        L_0x01ee:
            r11 = 3
            goto L_0x0210
        L_0x01f0:
            java.lang.String r10 = "developmentPlatformVersion"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01f9
            goto L_0x020f
        L_0x01f9:
            r11 = 2
            goto L_0x0210
        L_0x01fb:
            java.lang.String r10 = "developmentPlatform"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0204
            goto L_0x020f
        L_0x0204:
            r11 = 1
            goto L_0x0210
        L_0x0206:
            boolean r10 = r11.equals(r13)
            if (r10 != 0) goto L_0x020d
            goto L_0x020f
        L_0x020d:
            r11 = 0
            goto L_0x0210
        L_0x020f:
            r11 = -1
        L_0x0210:
            if (r11 == 0) goto L_0x0246
            if (r11 == r7) goto L_0x0240
            r10 = 2
            if (r11 == r10) goto L_0x023b
            r10 = 3
            if (r11 == r10) goto L_0x022e
            r10 = 4
            if (r11 == r10) goto L_0x0229
            r10 = 5
            if (r11 == r10) goto L_0x0224
            r24.skipValue()
            goto L_0x01c0
        L_0x0224:
            java.lang.String r19 = r24.nextString()
            goto L_0x01c0
        L_0x0229:
            java.lang.String r20 = r24.nextString()
            goto L_0x01c0
        L_0x022e:
            java.lang.String r18 = r24.nextString()
            if (r18 == 0) goto L_0x0235
            goto L_0x01c0
        L_0x0235:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r14)
            throw r0
        L_0x023b:
            java.lang.String r22 = r24.nextString()
            goto L_0x01c0
        L_0x0240:
            java.lang.String r21 = r24.nextString()
            goto L_0x01c0
        L_0x0246:
            java.lang.String r17 = r24.nextString()
            if (r17 == 0) goto L_0x024e
            goto L_0x01c0
        L_0x024e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r15)
            throw r0
        L_0x0254:
            r24.endObject()
            if (r17 != 0) goto L_0x025c
            r10 = r16
            goto L_0x025d
        L_0x025c:
            r10 = r8
        L_0x025d:
            if (r18 != 0) goto L_0x0265
            java.lang.String r11 = " version"
            java.lang.String r10 = p379.C25541a.m63881k(r10, r11)
        L_0x0265:
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x0281
            je.h r10 = new je.h
            r11 = r10
            r12 = r17
            r13 = r18
            r14 = r19
            r15 = r20
            r16 = r21
            r17 = r22
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r1.f45649f = r10
            goto L_0x0094
        L_0x0281:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p379.C25541a.m63881k(r9, r10)
            r0.<init>(r1)
            throw r0
        L_0x028b:
            je.u$a r10 = new je.u$a
            r10.<init>()
            r24.beginObject()
        L_0x0293:
            boolean r11 = r24.hasNext()
            if (r11 == 0) goto L_0x0311
            java.lang.String r11 = r24.nextName()
            r11.getClass()
            int r13 = r11.hashCode()
            switch(r13) {
                case -911706486: goto L_0x02c5;
                case -293026577: goto L_0x02ba;
                case 351608024: goto L_0x02b1;
                case 1874684019: goto L_0x02a8;
                default: goto L_0x02a7;
            }
        L_0x02a7:
            goto L_0x02ce
        L_0x02a8:
            boolean r11 = r11.equals(r4)
            if (r11 != 0) goto L_0x02af
            goto L_0x02ce
        L_0x02af:
            r11 = 3
            goto L_0x02cf
        L_0x02b1:
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x02b8
            goto L_0x02ce
        L_0x02b8:
            r11 = 2
            goto L_0x02cf
        L_0x02ba:
            java.lang.String r13 = "jailbroken"
            boolean r11 = r11.equals(r13)
            if (r11 != 0) goto L_0x02c3
            goto L_0x02ce
        L_0x02c3:
            r11 = 1
            goto L_0x02cf
        L_0x02c5:
            boolean r11 = r11.equals(r6)
            if (r11 != 0) goto L_0x02cc
            goto L_0x02ce
        L_0x02cc:
            r11 = 0
            goto L_0x02cf
        L_0x02ce:
            r11 = -1
        L_0x02cf:
            if (r11 == 0) goto L_0x0302
            if (r11 == r7) goto L_0x02f7
            r13 = 2
            if (r11 == r13) goto L_0x02e8
            r13 = 3
            if (r11 == r13) goto L_0x02dd
            r24.skipValue()
            goto L_0x0293
        L_0x02dd:
            int r11 = r24.nextInt()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10.f45762a = r11
            goto L_0x0293
        L_0x02e8:
            java.lang.String r11 = r24.nextString()
            if (r11 == 0) goto L_0x02f1
            r10.f45763b = r11
            goto L_0x0293
        L_0x02f1:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r14)
            throw r0
        L_0x02f7:
            boolean r11 = r24.nextBoolean()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r10.f45765d = r11
            goto L_0x0293
        L_0x0302:
            java.lang.String r11 = r24.nextString()
            if (r11 == 0) goto L_0x030b
            r10.f45764c = r11
            goto L_0x0293
        L_0x030b:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
        L_0x0311:
            r24.endObject()
            je.u r10 = r10.mo50388a()
            r1.f45651h = r10
            goto L_0x0094
        L_0x031c:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r24.beginArray()
        L_0x0324:
            boolean r11 = r24.hasNext()
            if (r11 == 0) goto L_0x0332
            je.k r11 = m44704d(r24)
            r10.add(r11)
            goto L_0x0324
        L_0x0332:
            r24.endArray()
            je.b0 r11 = new je.b0
            r11.<init>(r10)
            r1.f45653j = r11
            goto L_0x0094
        L_0x033e:
            je.j$a r10 = new je.j$a
            r10.<init>()
            r24.beginObject()
        L_0x0346:
            boolean r11 = r24.hasNext()
            if (r11 == 0) goto L_0x0449
            java.lang.String r11 = r24.nextName()
            r11.getClass()
            int r12 = r11.hashCode()
            switch(r12) {
                case -1981332476: goto L_0x03b7;
                case -1969347631: goto L_0x03ac;
                case 112670: goto L_0x03a1;
                case 3002454: goto L_0x0396;
                case 81784169: goto L_0x038b;
                case 94848180: goto L_0x0380;
                case 104069929: goto L_0x0375;
                case 109757585: goto L_0x036a;
                case 2078953423: goto L_0x035c;
                default: goto L_0x035a;
            }
        L_0x035a:
            goto L_0x03c2
        L_0x035c:
            java.lang.String r12 = "modelClass"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0366
            goto L_0x03c2
        L_0x0366:
            r11 = 8
            goto L_0x03c3
        L_0x036a:
            java.lang.String r12 = "state"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0373
            goto L_0x03c2
        L_0x0373:
            r11 = 7
            goto L_0x03c3
        L_0x0375:
            java.lang.String r12 = "model"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x037e
            goto L_0x03c2
        L_0x037e:
            r11 = 6
            goto L_0x03c3
        L_0x0380:
            java.lang.String r12 = "cores"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0389
            goto L_0x03c2
        L_0x0389:
            r11 = 5
            goto L_0x03c3
        L_0x038b:
            java.lang.String r12 = "diskSpace"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0394
            goto L_0x03c2
        L_0x0394:
            r11 = 4
            goto L_0x03c3
        L_0x0396:
            java.lang.String r12 = "arch"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x039f
            goto L_0x03c2
        L_0x039f:
            r11 = 3
            goto L_0x03c3
        L_0x03a1:
            java.lang.String r12 = "ram"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x03aa
            goto L_0x03c2
        L_0x03aa:
            r11 = 2
            goto L_0x03c3
        L_0x03ac:
            java.lang.String r12 = "manufacturer"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x03b5
            goto L_0x03c2
        L_0x03b5:
            r11 = 1
            goto L_0x03c3
        L_0x03b7:
            java.lang.String r12 = "simulator"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x03c0
            goto L_0x03c2
        L_0x03c0:
            r11 = 0
            goto L_0x03c3
        L_0x03c2:
            r11 = -1
        L_0x03c3:
            switch(r11) {
                case 0: goto L_0x043d;
                case 1: goto L_0x042b;
                case 2: goto L_0x041f;
                case 3: goto L_0x0413;
                case 4: goto L_0x0407;
                case 5: goto L_0x03fb;
                case 6: goto L_0x03e9;
                case 7: goto L_0x03dd;
                case 8: goto L_0x03cb;
                default: goto L_0x03c6;
            }
        L_0x03c6:
            r24.skipValue()
            goto L_0x0346
        L_0x03cb:
            java.lang.String r11 = r24.nextString()
            if (r11 == 0) goto L_0x03d5
            r10.f45679i = r11
            goto L_0x0346
        L_0x03d5:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null modelClass"
            r0.<init>(r1)
            throw r0
        L_0x03dd:
            int r11 = r24.nextInt()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10.f45677g = r11
            goto L_0x0346
        L_0x03e9:
            java.lang.String r11 = r24.nextString()
            if (r11 == 0) goto L_0x03f3
            r10.f45672b = r11
            goto L_0x0346
        L_0x03f3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null model"
            r0.<init>(r1)
            throw r0
        L_0x03fb:
            int r11 = r24.nextInt()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10.f45673c = r11
            goto L_0x0346
        L_0x0407:
            long r11 = r24.nextLong()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10.f45675e = r11
            goto L_0x0346
        L_0x0413:
            int r11 = r24.nextInt()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10.f45671a = r11
            goto L_0x0346
        L_0x041f:
            long r11 = r24.nextLong()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10.f45674d = r11
            goto L_0x0346
        L_0x042b:
            java.lang.String r11 = r24.nextString()
            if (r11 == 0) goto L_0x0435
            r10.f45678h = r11
            goto L_0x0346
        L_0x0435:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null manufacturer"
            r0.<init>(r1)
            throw r0
        L_0x043d:
            boolean r11 = r24.nextBoolean()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r10.f45676f = r11
            goto L_0x0346
        L_0x0449:
            r24.endObject()
            je.j r10 = r10.mo50346a()
            r1.f45652i = r10
            goto L_0x0094
        L_0x0454:
            long r10 = r24.nextLong()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r1.f45647d = r10
            goto L_0x0094
        L_0x0460:
            java.lang.String r10 = r24.nextString()
            r11 = 2
            byte[] r10 = android.util.Base64.decode(r10, r11)
            java.lang.String r11 = new java.lang.String
            java.nio.charset.Charset r12 = p577je.C17746a0.f45593a
            r11.<init>(r10, r12)
            r1.f45645b = r11
            goto L_0x0094
        L_0x0474:
            long r10 = r24.nextLong()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r1.f45646c = r10
            goto L_0x0094
        L_0x0480:
            r24.endObject()
            je.g r1 = r1.mo50336a()
            r0.f45608g = r1
            goto L_0x000a
        L_0x048b:
            java.lang.String r1 = r24.nextString()
            if (r1 == 0) goto L_0x0495
            r0.f45607f = r1
            goto L_0x000a
        L_0x0495:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null displayVersion"
            r0.<init>(r1)
            throw r0
        L_0x049d:
            int r1 = r24.nextInt()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f45604c = r1
            goto L_0x000a
        L_0x04a9:
            java.lang.String r1 = r24.nextString()
            if (r1 == 0) goto L_0x04b3
            r0.f45605d = r1
            goto L_0x000a
        L_0x04b3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null installationUuid"
            r0.<init>(r1)
            throw r0
        L_0x04bb:
            java.lang.String r1 = r24.nextString()
            if (r1 == 0) goto L_0x04c5
            r0.f45603b = r1
            goto L_0x000a
        L_0x04c5:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null gmpAppId"
            r0.<init>(r1)
            throw r0
        L_0x04cd:
            java.lang.String r1 = r24.nextString()
            if (r1 == 0) goto L_0x04d7
            r0.f45606e = r1
            goto L_0x000a
        L_0x04d7:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
        L_0x04dd:
            java.lang.String r1 = r24.nextString()
            if (r1 == 0) goto L_0x04e7
            r0.f45602a = r1
            goto L_0x000a
        L_0x04e7:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null sdkVersion"
            r0.<init>(r1)
            throw r0
        L_0x04ef:
            r24.beginObject()
            r1 = 0
            r10 = 0
        L_0x04f4:
            boolean r2 = r24.hasNext()
            if (r2 == 0) goto L_0x0528
            java.lang.String r2 = r24.nextName()
            r2.getClass()
            java.lang.String r3 = "files"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x051a
            java.lang.String r3 = "orgId"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0515
            r24.skipValue()
            goto L_0x04f4
        L_0x0515:
            java.lang.String r1 = r24.nextString()
            goto L_0x04f4
        L_0x051a:
            s9.b r2 = new s9.b
            r3 = 8
            r2.<init>(r3)
            r3 = r24
            je.b0 r10 = m44703c(r3, r2)
            goto L_0x04f4
        L_0x0528:
            r3 = r24
            r24.endObject()
            if (r10 != 0) goto L_0x0531
            java.lang.String r8 = " files"
        L_0x0531:
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L_0x0540
            je.e r2 = new je.e
            r2.<init>(r10, r1)
            r0.f45609h = r2
            goto L_0x000a
        L_0x0540:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p379.C25541a.m63881k(r9, r8)
            r0.<init>(r1)
            throw r0
        L_0x054a:
            r3 = r24
            r24.endObject()
            je.b r0 = r0.mo50273a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p601ke.C18028a.m44706f(android.util.JsonReader):je.b");
    }

    /* renamed from: g */
    public static C17780b m44707g(String str) throws IOException {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            C17780b f = m44706f(jsonReader);
            jsonReader.close();
            return f;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
