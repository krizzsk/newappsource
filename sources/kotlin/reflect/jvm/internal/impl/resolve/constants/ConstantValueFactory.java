package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C23816b;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import lh0.C24307v;
import mf0.C24362h;
import p583jk.C17875h;
import zg0.C25493b;
import zg0.C25494c;
import zg0.C25495d;
import zg0.C25496e;
import zg0.C25498g;
import zg0.C25499h;
import zg0.C25503k;
import zg0.C25504l;
import zg0.C25511p;
import zg0.C25512q;
import zg0.C25513r;
import zg0.C25514s;

public final class ConstantValueFactory {
    /* renamed from: a */
    public static C25493b m60272a(List list, PrimitiveType primitiveType) {
        List<Object> K0 = C23825c.m58499K0(list);
        ArrayList arrayList = new ArrayList();
        for (Object c : K0) {
            C25498g c2 = m60274c(c);
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        return new C25493b(arrayList, new ConstantValueFactory$createArrayValue$3(primitiveType));
    }

    /* renamed from: b */
    public static C25493b m60273b(List list, C24307v vVar) {
        C24362h.m61211f(list, "value");
        return new C25493b(list, new ConstantValueFactory$createArrayValue$1(vVar));
    }

    /* renamed from: c */
    public static C25498g m60274c(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        if (obj instanceof Byte) {
            return new C25495d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C25513r(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C25504l(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C25511p(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C25496e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new C25503k(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C25499h(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C25494c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new C25514s((String) obj);
        }
        if (obj instanceof byte[]) {
            return m60272a(C23816b.m58451g1((byte[]) obj), PrimitiveType.BYTE);
        }
        int i = 0;
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            C24362h.m61211f(sArr, "<this>");
            int length = sArr.length;
            if (length == 0) {
                arrayList7 = EmptyList.f60173b;
            } else if (length != 1) {
                ArrayList arrayList8 = new ArrayList(sArr.length);
                int length2 = sArr.length;
                while (i < length2) {
                    arrayList8.add(Short.valueOf(sArr[i]));
                    i++;
                }
                arrayList7 = arrayList8;
            } else {
                arrayList7 = C17875h.m44280D(Short.valueOf(sArr[0]));
            }
            return m60272a(arrayList7, PrimitiveType.SHORT);
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            C24362h.m61211f(iArr, "<this>");
            int length3 = iArr.length;
            if (length3 == 0) {
                arrayList6 = EmptyList.f60173b;
            } else if (length3 != 1) {
                ArrayList arrayList9 = new ArrayList(iArr.length);
                int length4 = iArr.length;
                while (i < length4) {
                    arrayList9.add(Integer.valueOf(iArr[i]));
                    i++;
                }
                arrayList6 = arrayList9;
            } else {
                arrayList6 = C17875h.m44280D(Integer.valueOf(iArr[0]));
            }
            return m60272a(arrayList6, PrimitiveType.INT);
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            C24362h.m61211f(jArr, "<this>");
            int length5 = jArr.length;
            if (length5 == 0) {
                arrayList5 = EmptyList.f60173b;
            } else if (length5 != 1) {
                ArrayList arrayList10 = new ArrayList(jArr.length);
                int length6 = jArr.length;
                while (i < length6) {
                    arrayList10.add(Long.valueOf(jArr[i]));
                    i++;
                }
                arrayList5 = arrayList10;
            } else {
                arrayList5 = C17875h.m44280D(Long.valueOf(jArr[0]));
            }
            return m60272a(arrayList5, PrimitiveType.LONG);
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            C24362h.m61211f(cArr, "<this>");
            int length7 = cArr.length;
            if (length7 == 0) {
                arrayList4 = EmptyList.f60173b;
            } else if (length7 != 1) {
                ArrayList arrayList11 = new ArrayList(cArr.length);
                int length8 = cArr.length;
                while (i < length8) {
                    arrayList11.add(Character.valueOf(cArr[i]));
                    i++;
                }
                arrayList4 = arrayList11;
            } else {
                arrayList4 = C17875h.m44280D(Character.valueOf(cArr[0]));
            }
            return m60272a(arrayList4, PrimitiveType.CHAR);
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            C24362h.m61211f(fArr, "<this>");
            int length9 = fArr.length;
            if (length9 == 0) {
                arrayList3 = EmptyList.f60173b;
            } else if (length9 != 1) {
                ArrayList arrayList12 = new ArrayList(fArr.length);
                int length10 = fArr.length;
                while (i < length10) {
                    arrayList12.add(Float.valueOf(fArr[i]));
                    i++;
                }
                arrayList3 = arrayList12;
            } else {
                arrayList3 = C17875h.m44280D(Float.valueOf(fArr[0]));
            }
            return m60272a(arrayList3, PrimitiveType.FLOAT);
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            C24362h.m61211f(dArr, "<this>");
            int length11 = dArr.length;
            if (length11 == 0) {
                arrayList2 = EmptyList.f60173b;
            } else if (length11 != 1) {
                ArrayList arrayList13 = new ArrayList(dArr.length);
                int length12 = dArr.length;
                while (i < length12) {
                    arrayList13.add(Double.valueOf(dArr[i]));
                    i++;
                }
                arrayList2 = arrayList13;
            } else {
                arrayList2 = C17875h.m44280D(Double.valueOf(dArr[0]));
            }
            return m60272a(arrayList2, PrimitiveType.DOUBLE);
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            C24362h.m61211f(zArr, "<this>");
            int length13 = zArr.length;
            if (length13 == 0) {
                arrayList = EmptyList.f60173b;
            } else if (length13 != 1) {
                ArrayList arrayList14 = new ArrayList(zArr.length);
                int length14 = zArr.length;
                while (i < length14) {
                    arrayList14.add(Boolean.valueOf(zArr[i]));
                    i++;
                }
                arrayList = arrayList14;
            } else {
                arrayList = C17875h.m44280D(Boolean.valueOf(zArr[0]));
            }
            return m60272a(arrayList, PrimitiveType.BOOLEAN);
        } else if (obj == null) {
            return new C25512q();
        } else {
            return null;
        }
    }
}
