package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.C24081e.C24083b;
import kotlin.reflect.jvm.internal.impl.protobuf.C24084f;
import kotlin.reflect.jvm.internal.impl.protobuf.C24090h;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import vg0.C25091a;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.e */
public final class C24081e<FieldDescriptorType extends C24083b<FieldDescriptorType>> {

    /* renamed from: d */
    public static final C24081e f61081d = new C24081e(0);

    /* renamed from: a */
    public final C24092i f61082a;

    /* renamed from: b */
    public boolean f61083b;

    /* renamed from: c */
    public boolean f61084c = false;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.e$a */
    public static /* synthetic */ class C24082a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f61085a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f61086b;

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
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f61086b = r0
                r1 = 1
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r2 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f61086b     // Catch:{ NoSuchFieldError -> 0x001d }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r3 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f61086b     // Catch:{ NoSuchFieldError -> 0x0028 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r4 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f61086b     // Catch:{ NoSuchFieldError -> 0x0033 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r5 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f61086b     // Catch:{ NoSuchFieldError -> 0x003e }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r6 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f61086b     // Catch:{ NoSuchFieldError -> 0x0049 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r7 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f61086b     // Catch:{ NoSuchFieldError -> 0x0054 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r8 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f61086b     // Catch:{ NoSuchFieldError -> 0x0060 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r9 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f61086b     // Catch:{ NoSuchFieldError -> 0x006c }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f61086b     // Catch:{ NoSuchFieldError -> 0x0078 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f61086b     // Catch:{ NoSuchFieldError -> 0x0084 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f61086b     // Catch:{ NoSuchFieldError -> 0x0090 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f61086b     // Catch:{ NoSuchFieldError -> 0x009c }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f61086b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f61086b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f61086b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f61086b     // Catch:{ NoSuchFieldError -> 0x00cc }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f61086b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType[] r9 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f61085a = r9
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f61085a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r9 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f61085a     // Catch:{ NoSuchFieldError -> 0x00fd }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f61085a     // Catch:{ NoSuchFieldError -> 0x0107 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f61085a     // Catch:{ NoSuchFieldError -> 0x0111 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f61085a     // Catch:{ NoSuchFieldError -> 0x011b }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f61085a     // Catch:{ NoSuchFieldError -> 0x0125 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f61085a     // Catch:{ NoSuchFieldError -> 0x012f }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f61085a     // Catch:{ NoSuchFieldError -> 0x0139 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C24081e.C24082a.<clinit>():void");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.e$b */
    public interface C24083b<T extends C24083b<T>> extends Comparable<T> {
        /* renamed from: B */
        WireFormat$JavaType mo60000B();

        /* renamed from: S0 */
        GeneratedMessageLite.C24066b mo60001S0(C24090h.C24091a aVar, C24090h hVar);

        int getNumber();

        boolean isPacked();

        /* renamed from: x */
        boolean mo60005x();

        /* renamed from: z */
        WireFormat$FieldType mo60006z();
    }

    public C24081e() {
        int i = C24093j.f61090g;
        this.f61082a = new C24092i(16);
    }

    /* renamed from: c */
    public static int m60099c(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        switch (C24082a.f61086b[wireFormat$FieldType.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                return 8;
            case 2:
                ((Float) obj).floatValue();
                return 4;
            case 3:
                return CodedOutputStream.m60031g(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m60031g(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m60027c(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                return 8;
            case 7:
                ((Integer) obj).intValue();
                return 4;
            case 8:
                ((Boolean) obj).booleanValue();
                return 1;
            case 9:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return CodedOutputStream.m60030f(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported.", e);
                }
            case 10:
                if (obj instanceof C25091a) {
                    C25091a aVar = (C25091a) obj;
                    return aVar.size() + CodedOutputStream.m60030f(aVar.size());
                }
                byte[] bArr = (byte[]) obj;
                return CodedOutputStream.m60030f(bArr.length) + bArr.length;
            case 11:
                return CodedOutputStream.m60030f(((Integer) obj).intValue());
            case 12:
                ((Integer) obj).intValue();
                return 4;
            case 13:
                ((Long) obj).longValue();
                return 8;
            case 14:
                int intValue = ((Integer) obj).intValue();
                return CodedOutputStream.m60030f((intValue >> 31) ^ (intValue << 1));
            case 15:
                long longValue = ((Long) obj).longValue();
                return CodedOutputStream.m60031g((longValue >> 63) ^ (longValue << 1));
            case 16:
                return ((C24090h) obj).getSerializedSize();
            case 17:
                if (!(obj instanceof C24087g)) {
                    return CodedOutputStream.m60029e((C24090h) obj);
                }
                C24087g gVar = (C24087g) obj;
                if (gVar.f63305a) {
                    int serializedSize = gVar.f63306b.getSerializedSize();
                    return CodedOutputStream.m60030f(serializedSize) + serializedSize;
                }
                throw null;
            case 18:
                if (obj instanceof C24084f.C24085a) {
                    return CodedOutputStream.m60027c(((C24084f.C24085a) obj).getNumber());
                }
                return CodedOutputStream.m60027c(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: d */
    public static int m60100d(C24083b<?> bVar, Object obj) {
        WireFormat$FieldType z = bVar.mo60006z();
        int number = bVar.getNumber();
        if (bVar.mo60005x()) {
            int i = 0;
            if (bVar.isPacked()) {
                for (Object c : (List) obj) {
                    i += m60099c(z, c);
                }
                return CodedOutputStream.m60030f(i) + CodedOutputStream.m60032h(number) + i;
            }
            for (Object next : (List) obj) {
                int h = CodedOutputStream.m60032h(number);
                if (z == WireFormat$FieldType.GROUP) {
                    h *= 2;
                }
                i += m60099c(z, next) + h;
            }
            return i;
        }
        int h2 = CodedOutputStream.m60032h(number);
        if (z == WireFormat$FieldType.GROUP) {
            h2 *= 2;
        }
        return m60099c(z, obj) + h2;
    }

    /* renamed from: f */
    public static boolean m60101f(Map.Entry entry) {
        C24083b bVar = (C24083b) entry.getKey();
        if (bVar.mo60000B() == WireFormat$JavaType.MESSAGE) {
            if (bVar.mo60005x()) {
                for (C24090h isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C24090h) {
                    if (!((C24090h) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof C24087g) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: i */
    public static Object m60102i(C24078c cVar, WireFormat$FieldType wireFormat$FieldType) throws IOException {
        boolean z = true;
        switch (C24082a.f61086b[wireFormat$FieldType.ordinal()]) {
            case 1:
                return Double.valueOf(Double.longBitsToDouble(cVar.mo60028j()));
            case 2:
                return Float.valueOf(Float.intBitsToFloat(cVar.mo60027i()));
            case 3:
                return Long.valueOf(cVar.mo60030l());
            case 4:
                return Long.valueOf(cVar.mo60030l());
            case 5:
                return Integer.valueOf(cVar.mo60029k());
            case 6:
                return Long.valueOf(cVar.mo60028j());
            case 7:
                return Integer.valueOf(cVar.mo60027i());
            case 8:
                if (cVar.mo60030l() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                int k = cVar.mo60029k();
                int i = cVar.f61069b;
                int i2 = cVar.f61071d;
                if (k <= i - i2 && k > 0) {
                    String str = new String(cVar.f61068a, i2, k, "UTF-8");
                    cVar.f61071d += k;
                    return str;
                } else if (k == 0) {
                    return "";
                } else {
                    return new String(cVar.mo60026h(k), "UTF-8");
                }
            case 10:
                return cVar.mo60023e();
            case 11:
                return Integer.valueOf(cVar.mo60029k());
            case 12:
                return Integer.valueOf(cVar.mo60027i());
            case 13:
                return Long.valueOf(cVar.mo60028j());
            case 14:
                int k2 = cVar.mo60029k();
                return Integer.valueOf((-(k2 & 1)) ^ (k2 >>> 1));
            case 15:
                long l = cVar.mo60030l();
                return Long.valueOf((-(l & 1)) ^ (l >>> 1));
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C24087g) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C24084f.C24085a) == false) goto L_0x0030;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m60103k(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.C24081e.C24082a.f61085a
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r2 = r2.getJavaType()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0042;
                case 2: goto L_0x003f;
                case 3: goto L_0x003c;
                case 4: goto L_0x0039;
                case 5: goto L_0x0036;
                case 6: goto L_0x0033;
                case 7: goto L_0x0027;
                case 8: goto L_0x001e;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0044
        L_0x0015:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C24090h
            if (r2 != 0) goto L_0x0031
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C24087g
            if (r2 == 0) goto L_0x0030
            goto L_0x0031
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0031
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C24084f.C24085a
            if (r2 == 0) goto L_0x0030
            goto L_0x0031
        L_0x0027:
            boolean r2 = r3 instanceof vg0.C25091a
            if (r2 != 0) goto L_0x0031
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            r1 = r0
            goto L_0x0044
        L_0x0033:
            boolean r1 = r3 instanceof java.lang.String
            goto L_0x0044
        L_0x0036:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L_0x0044
        L_0x0039:
            boolean r1 = r3 instanceof java.lang.Double
            goto L_0x0044
        L_0x003c:
            boolean r1 = r3 instanceof java.lang.Float
            goto L_0x0044
        L_0x003f:
            boolean r1 = r3 instanceof java.lang.Long
            goto L_0x0044
        L_0x0042:
            boolean r1 = r3 instanceof java.lang.Integer
        L_0x0044:
            if (r1 == 0) goto L_0x0047
            return
        L_0x0047:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C24081e.m60103k(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    /* renamed from: l */
    public static void m60104l(CodedOutputStream codedOutputStream, WireFormat$FieldType wireFormat$FieldType, int i, Object obj) throws IOException {
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            codedOutputStream.mo59987x(i, 3);
            ((C24090h) obj).mo59605a(codedOutputStream);
            codedOutputStream.mo59987x(i, 4);
            return;
        }
        codedOutputStream.mo59987x(i, wireFormat$FieldType.getWireType());
        m60105m(codedOutputStream, wireFormat$FieldType, obj);
    }

    /* renamed from: m */
    public static void m60105m(CodedOutputStream codedOutputStream, WireFormat$FieldType wireFormat$FieldType, Object obj) throws IOException {
        switch (C24082a.f61086b[wireFormat$FieldType.ordinal()]) {
            case 1:
                double doubleValue = ((Double) obj).doubleValue();
                codedOutputStream.getClass();
                codedOutputStream.mo59984u(Double.doubleToRawLongBits(doubleValue));
                return;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                codedOutputStream.getClass();
                codedOutputStream.mo59983t(Float.floatToRawIntBits(floatValue));
                return;
            case 3:
                codedOutputStream.mo59986w(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.mo59986w(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.mo59977n(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.mo59984u(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.mo59983t(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.mo59980q(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 9:
                codedOutputStream.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                codedOutputStream.mo59985v(bytes.length);
                codedOutputStream.mo59982s(bytes);
                return;
            case 10:
                if (obj instanceof C25091a) {
                    C25091a aVar = (C25091a) obj;
                    codedOutputStream.getClass();
                    codedOutputStream.mo59985v(aVar.size());
                    codedOutputStream.mo59981r(aVar);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                codedOutputStream.getClass();
                codedOutputStream.mo59985v(bArr.length);
                codedOutputStream.mo59982s(bArr);
                return;
            case 11:
                codedOutputStream.mo59985v(((Integer) obj).intValue());
                return;
            case 12:
                codedOutputStream.mo59983t(((Integer) obj).intValue());
                return;
            case 13:
                codedOutputStream.mo59984u(((Long) obj).longValue());
                return;
            case 14:
                int intValue = ((Integer) obj).intValue();
                codedOutputStream.mo59985v((intValue >> 31) ^ (intValue << 1));
                return;
            case 15:
                long longValue = ((Long) obj).longValue();
                codedOutputStream.mo59986w((longValue >> 63) ^ (longValue << 1));
                return;
            case 16:
                codedOutputStream.getClass();
                ((C24090h) obj).mo59605a(codedOutputStream);
                return;
            case 17:
                codedOutputStream.mo59979p((C24090h) obj);
                return;
            case 18:
                if (obj instanceof C24084f.C24085a) {
                    codedOutputStream.mo59977n(((C24084f.C24085a) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.mo59977n(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo60041a(GeneratedMessageLite.C24068d dVar, Object obj) {
        List list;
        if (dVar.f61060e) {
            m60103k(dVar.f61059d, obj);
            Object e = mo60044e(dVar);
            if (e == null) {
                list = new ArrayList();
                this.f61082a.mo60063e(dVar, list);
            } else {
                list = (List) e;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public final C24081e<FieldDescriptorType> clone() {
        C24081e<FieldDescriptorType> eVar = new C24081e<>();
        for (int i = 0; i < this.f61082a.f61092c.size(); i++) {
            Map.Entry entry = this.f61082a.f61092c.get(i);
            eVar.mo60047j((C24083b) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : this.f61082a.mo60059c()) {
            eVar.mo60047j((C24083b) entry2.getKey(), entry2.getValue());
        }
        eVar.f61084c = this.f61084c;
        return eVar;
    }

    /* renamed from: e */
    public final Object mo60044e(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f61082a.get(fielddescriptortype);
        if (obj instanceof C24087g) {
            return ((C24087g) obj).mo60048a();
        }
        return obj;
    }

    /* renamed from: g */
    public final void mo60045g() {
        Map<K, V> map;
        if (!this.f61083b) {
            C24092i iVar = this.f61082a;
            if (!iVar.f61094e) {
                for (int i = 0; i < iVar.f61092c.size(); i++) {
                    Map.Entry entry = iVar.f61092c.get(i);
                    if (((C24083b) entry.getKey()).mo60005x()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
                for (Map.Entry entry2 : iVar.mo60059c()) {
                    if (((C24083b) entry2.getKey()).mo60005x()) {
                        entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                    }
                }
            }
            if (!iVar.f61094e) {
                if (iVar.f61093d.isEmpty()) {
                    map = Collections.emptyMap();
                } else {
                    map = Collections.unmodifiableMap(iVar.f61093d);
                }
                iVar.f61093d = map;
                iVar.f61094e = true;
            }
            this.f61083b = true;
        }
    }

    /* renamed from: h */
    public final void mo60046h(Map.Entry<FieldDescriptorType, Object> entry) {
        C24083b bVar = (C24083b) entry.getKey();
        byte[] value = entry.getValue();
        if (value instanceof C24087g) {
            value = ((C24087g) value).mo60048a();
        }
        if (bVar.mo60005x()) {
            Object e = mo60044e(bVar);
            if (e == null) {
                e = new ArrayList();
            }
            for (Object next : (List) value) {
                List list = (List) e;
                if (next instanceof byte[]) {
                    byte[] bArr = (byte[]) next;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    next = bArr2;
                }
                list.add(next);
            }
            this.f61082a.mo60063e(bVar, e);
        } else if (bVar.mo60000B() == WireFormat$JavaType.MESSAGE) {
            Object e2 = mo60044e(bVar);
            if (e2 == null) {
                C24092i iVar = this.f61082a;
                if (value instanceof byte[]) {
                    byte[] bArr3 = (byte[]) value;
                    byte[] bArr4 = new byte[bArr3.length];
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    value = bArr4;
                }
                iVar.mo60063e(bVar, value);
                return;
            }
            this.f61082a.mo60063e(bVar, bVar.mo60001S0(((C24090h) e2).toBuilder(), (C24090h) value).build());
        } else {
            C24092i iVar2 = this.f61082a;
            if (value instanceof byte[]) {
                byte[] bArr5 = (byte[]) value;
                byte[] bArr6 = new byte[bArr5.length];
                System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                value = bArr6;
            }
            iVar2.mo60063e(bVar, value);
        }
    }

    /* renamed from: j */
    public final void mo60047j(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo60005x()) {
            m60103k(fielddescriptortype.mo60006z(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m60103k(fielddescriptortype.mo60006z(), it.next());
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C24087g) {
            this.f61084c = true;
        }
        this.f61082a.mo60063e(fielddescriptortype, obj);
    }

    public C24081e(int i) {
        int i2 = C24093j.f61090g;
        this.f61082a = new C24092i(0);
        mo60045g();
    }
}
