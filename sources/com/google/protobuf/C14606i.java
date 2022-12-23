package com.google.protobuf;

import com.google.protobuf.C14606i.C14608b;
import com.google.protobuf.C14610k;
import com.google.protobuf.C14616l;
import com.google.protobuf.C14629t;
import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.i */
public final class C14606i<T extends C14608b<T>> {

    /* renamed from: d */
    public static final C14606i f36852d = new C14606i(0);

    /* renamed from: a */
    public final C14587b0<T, Object> f36853a;

    /* renamed from: b */
    public boolean f36854b;

    /* renamed from: c */
    public boolean f36855c;

    /* renamed from: com.google.protobuf.i$a */
    public static /* synthetic */ class C14607a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36856a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f36857b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat$FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36857b = r0
                r1 = 1
                com.google.protobuf.WireFormat$FieldType r2 = com.google.protobuf.WireFormat$FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f36857b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r3 = com.google.protobuf.WireFormat$FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f36857b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r4 = com.google.protobuf.WireFormat$FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f36857b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r5 = com.google.protobuf.WireFormat$FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f36857b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r6 = com.google.protobuf.WireFormat$FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f36857b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r7 = com.google.protobuf.WireFormat$FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f36857b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r8 = com.google.protobuf.WireFormat$FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f36857b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r9 = com.google.protobuf.WireFormat$FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f36857b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat$FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f36857b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat$FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f36857b     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat$FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f36857b     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat$FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f36857b     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat$FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f36857b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat$FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f36857b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat$FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f36857b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat$FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f36857b     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat$FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f36857b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat$FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                com.google.protobuf.WireFormat$JavaType[] r9 = com.google.protobuf.WireFormat$JavaType.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f36856a = r9
                com.google.protobuf.WireFormat$JavaType r10 = com.google.protobuf.WireFormat$JavaType.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f36856a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                com.google.protobuf.WireFormat$JavaType r9 = com.google.protobuf.WireFormat$JavaType.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f36856a     // Catch:{ NoSuchFieldError -> 0x00fd }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat$JavaType.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f36856a     // Catch:{ NoSuchFieldError -> 0x0107 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat$JavaType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f36856a     // Catch:{ NoSuchFieldError -> 0x0111 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat$JavaType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f36856a     // Catch:{ NoSuchFieldError -> 0x011b }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat$JavaType.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f36856a     // Catch:{ NoSuchFieldError -> 0x0125 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat$JavaType.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f36856a     // Catch:{ NoSuchFieldError -> 0x012f }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat$JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f36856a     // Catch:{ NoSuchFieldError -> 0x0139 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat$JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C14606i.C14607a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.i$b */
    public interface C14608b<T extends C14608b<T>> extends Comparable<T> {
        /* renamed from: B */
        WireFormat$JavaType mo43957B();

        /* renamed from: K */
        GeneratedMessageLite.C14572a mo43958K(C14629t.C14630a aVar, C14629t tVar);

        void getNumber();

        void isPacked();

        /* renamed from: x */
        void mo43962x();

        /* renamed from: z */
        void mo43963z();
    }

    public C14606i() {
        int i = C14587b0.f36814i;
        this.f36853a = new C14585a0(16);
    }

    /* renamed from: b */
    public static int m36599b(WireFormat$FieldType wireFormat$FieldType, int i, Object obj) {
        int t = CodedOutputStream.m36448t(i);
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            t *= 2;
        }
        return m36600c(wireFormat$FieldType, obj) + t;
    }

    /* renamed from: c */
    public static int m36600c(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        switch (C14607a.f36857b[wireFormat$FieldType.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                Logger logger = CodedOutputStream.f36799b;
                return 8;
            case 2:
                ((Float) obj).floatValue();
                Logger logger2 = CodedOutputStream.f36799b;
                return 4;
            case 3:
                return CodedOutputStream.m36452x(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m36452x(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m36439k(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                Logger logger3 = CodedOutputStream.f36799b;
                return 8;
            case 7:
                ((Integer) obj).intValue();
                Logger logger4 = CodedOutputStream.f36799b;
                return 4;
            case 8:
                ((Boolean) obj).booleanValue();
                Logger logger5 = CodedOutputStream.f36799b;
                return 1;
            case 9:
                Logger logger6 = CodedOutputStream.f36799b;
                return ((C14629t) obj).getSerializedSize();
            case 10:
                if (obj instanceof C14616l) {
                    return CodedOutputStream.m36441m((C14616l) obj);
                }
                Logger logger7 = CodedOutputStream.f36799b;
                int serializedSize = ((C14629t) obj).getSerializedSize();
                return CodedOutputStream.m36450v(serializedSize) + serializedSize;
            case 11:
                if (!(obj instanceof ByteString)) {
                    return CodedOutputStream.m36447s((String) obj);
                }
                Logger logger8 = CodedOutputStream.f36799b;
                int size = ((ByteString) obj).size();
                return CodedOutputStream.m36450v(size) + size;
            case 12:
                if (obj instanceof ByteString) {
                    Logger logger9 = CodedOutputStream.f36799b;
                    int size2 = ((ByteString) obj).size();
                    return CodedOutputStream.m36450v(size2) + size2;
                }
                Logger logger10 = CodedOutputStream.f36799b;
                int length = ((byte[]) obj).length;
                return CodedOutputStream.m36450v(length) + length;
            case 13:
                return CodedOutputStream.m36450v(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger11 = CodedOutputStream.f36799b;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger12 = CodedOutputStream.f36799b;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return CodedOutputStream.m36450v((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return CodedOutputStream.m36452x((longValue >> 63) ^ (longValue << 1));
            case 18:
                if (obj instanceof C14610k.C14611a) {
                    return CodedOutputStream.m36439k(((C14610k.C14611a) obj).getNumber());
                }
                return CodedOutputStream.m36439k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: d */
    public static int m36601d(C14608b<?> bVar, Object obj) {
        bVar.mo43963z();
        bVar.getNumber();
        bVar.mo43962x();
        return m36599b((WireFormat$FieldType) null, 0, obj);
    }

    /* renamed from: f */
    public static int m36602f(Map.Entry entry) {
        C14608b bVar = (C14608b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.mo43957B() != WireFormat$JavaType.MESSAGE) {
            return m36601d(bVar, value);
        }
        bVar.mo43962x();
        bVar.isPacked();
        if (value instanceof C14616l) {
            ((C14608b) entry.getKey()).getNumber();
            return CodedOutputStream.m36441m((C14616l) value) + CodedOutputStream.m36448t(3) + CodedOutputStream.m36449u(2, 0) + (CodedOutputStream.m36448t(1) * 2);
        }
        ((C14608b) entry.getKey()).getNumber();
        int u = CodedOutputStream.m36449u(2, 0) + (CodedOutputStream.m36448t(1) * 2);
        int t = CodedOutputStream.m36448t(3);
        int serializedSize = ((C14629t) value).getSerializedSize();
        return CodedOutputStream.m36450v(serializedSize) + serializedSize + t + u;
    }

    /* renamed from: j */
    public static <T extends C14608b<T>> boolean m36603j(Map.Entry<T, Object> entry) {
        C14608b bVar = (C14608b) entry.getKey();
        if (bVar.mo43957B() == WireFormat$JavaType.MESSAGE) {
            bVar.mo43962x();
            Object value = entry.getValue();
            if (value instanceof C14629t) {
                if (!((C14629t) value).isInitialized()) {
                    return false;
                }
            } else if (value instanceof C14616l) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* renamed from: n */
    public static void m36604n(C14608b bVar, Object obj) {
        bVar.mo43963z();
        Charset charset = C14610k.f36861a;
        obj.getClass();
        int[] iArr = C14607a.f36856a;
        throw null;
    }

    /* renamed from: o */
    public static void m36605o(CodedOutputStream codedOutputStream, WireFormat$FieldType wireFormat$FieldType, int i, Object obj) throws IOException {
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            codedOutputStream.mo43923P(i, 3);
            ((C14629t) obj).mo43942a(codedOutputStream);
            codedOutputStream.mo43923P(i, 4);
            return;
        }
        codedOutputStream.mo43923P(i, wireFormat$FieldType.getWireType());
        switch (C14607a.f36857b[wireFormat$FieldType.ordinal()]) {
            case 1:
                codedOutputStream.mo43914G(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 2:
                codedOutputStream.mo43912E(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 3:
                codedOutputStream.mo43927T(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.mo43927T(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.mo43916I(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.mo43914G(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.mo43912E(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.mo43928y(((Boolean) obj).booleanValue() ? (byte) 1 : 0);
                return;
            case 9:
                ((C14629t) obj).mo43942a(codedOutputStream);
                return;
            case 10:
                codedOutputStream.mo43918K((C14629t) obj);
                return;
            case 11:
                if (obj instanceof ByteString) {
                    codedOutputStream.mo43910C((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.mo43922O((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof ByteString) {
                    codedOutputStream.mo43910C((ByteString) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                codedOutputStream.mo43908A(bArr.length, bArr);
                return;
            case 13:
                codedOutputStream.mo43925R(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.mo43912E(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.mo43914G(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                codedOutputStream.mo43925R((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                codedOutputStream.mo43927T((longValue >> 63) ^ (longValue << 1));
                return;
            case 18:
                if (obj instanceof C14610k.C14611a) {
                    codedOutputStream.mo43916I(((C14610k.C14611a) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.mo43916I(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: a */
    public final C14606i<T> clone() {
        C14606i<T> iVar = new C14606i<>();
        for (int i = 0; i < this.f36853a.mo43994d(); i++) {
            Map.Entry<T, Object> c = this.f36853a.mo43991c(i);
            iVar.mo44084m((C14608b) c.getKey(), c.getValue());
        }
        for (Map.Entry next : this.f36853a.mo43995e()) {
            iVar.mo44084m((C14608b) next.getKey(), next.getValue());
        }
        iVar.f36855c = this.f36855c;
        return iVar;
    }

    /* renamed from: e */
    public final Object mo44076e(T t) {
        Object obj = this.f36853a.get(t);
        if (obj instanceof C14616l) {
            return ((C14616l) obj).mo44103a((C14629t) null);
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14606i)) {
            return false;
        }
        return this.f36853a.equals(((C14606i) obj).f36853a);
    }

    /* renamed from: g */
    public final int mo44078g() {
        int i = 0;
        for (int i2 = 0; i2 < this.f36853a.mo43994d(); i2++) {
            Map.Entry<T, Object> c = this.f36853a.mo43991c(i2);
            i += m36601d((C14608b) c.getKey(), c.getValue());
        }
        for (Map.Entry next : this.f36853a.mo43995e()) {
            i += m36601d((C14608b) next.getKey(), next.getValue());
        }
        return i;
    }

    /* renamed from: h */
    public final boolean mo44079h() {
        return this.f36853a.isEmpty();
    }

    public final int hashCode() {
        return this.f36853a.hashCode();
    }

    /* renamed from: i */
    public final boolean mo44081i() {
        for (int i = 0; i < this.f36853a.mo43994d(); i++) {
            if (!m36603j(this.f36853a.mo43991c(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> j : this.f36853a.mo43995e()) {
            if (!m36603j(j)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public final Iterator<Map.Entry<T, Object>> mo44082k() {
        if (this.f36855c) {
            return new C14616l.C14618b(this.f36853a.entrySet().iterator());
        }
        return this.f36853a.entrySet().iterator();
    }

    /* renamed from: l */
    public final void mo44083l(Map.Entry<T, Object> entry) {
        C14608b bVar = (C14608b) entry.getKey();
        byte[] value = entry.getValue();
        if (value instanceof C14616l) {
            value = ((C14616l) value).mo44103a((C14629t) null);
        }
        bVar.mo43962x();
        if (bVar.mo43957B() == WireFormat$JavaType.MESSAGE) {
            Object e = mo44076e(bVar);
            if (e == null) {
                C14587b0<T, Object> b0Var = this.f36853a;
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    value = bArr2;
                }
                b0Var.put(bVar, value);
                return;
            }
            this.f36853a.put(bVar, bVar.mo43958K(((C14629t) e).toBuilder(), (C14629t) value).mo43954m());
            return;
        }
        C14587b0<T, Object> b0Var2 = this.f36853a;
        if (value instanceof byte[]) {
            byte[] bArr3 = (byte[]) value;
            byte[] bArr4 = new byte[bArr3.length];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            value = bArr4;
        }
        b0Var2.put(bVar, value);
    }

    /* renamed from: m */
    public final void mo44084m(T t, Object obj) {
        t.mo43962x();
        m36604n(t, obj);
        throw null;
    }

    public C14606i(int i) {
        int i2 = C14587b0.f36814i;
        C14585a0 a0Var = new C14585a0(0);
        this.f36853a = a0Var;
        if (!this.f36854b) {
            a0Var.mo43987g();
            this.f36854b = true;
        }
        if (!this.f36854b) {
            a0Var.mo43987g();
            this.f36854b = true;
        }
    }
}
