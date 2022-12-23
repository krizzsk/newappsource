package androidx.work;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p081f3.C4656h;

/* renamed from: androidx.work.b */
public final class C1388b {

    /* renamed from: b */
    public static final C1388b f5151b;

    /* renamed from: a */
    public HashMap f5152a;

    /* renamed from: androidx.work.b$a */
    public static final class C1389a {

        /* renamed from: a */
        public HashMap f5153a = new HashMap();

        /* renamed from: a */
        public final void mo5695a(HashMap hashMap) {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    this.f5153a.put(str, (Object) null);
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                        this.f5153a.put(str, value);
                    } else {
                        int i = 0;
                        if (cls == boolean[].class) {
                            HashMap hashMap2 = this.f5153a;
                            boolean[] zArr = (boolean[]) value;
                            C1388b bVar = C1388b.f5151b;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i < zArr.length) {
                                boolArr[i] = Boolean.valueOf(zArr[i]);
                                i++;
                            }
                            hashMap2.put(str, boolArr);
                        } else if (cls == byte[].class) {
                            HashMap hashMap3 = this.f5153a;
                            byte[] bArr = (byte[]) value;
                            C1388b bVar2 = C1388b.f5151b;
                            Byte[] bArr2 = new Byte[bArr.length];
                            while (i < bArr.length) {
                                bArr2[i] = Byte.valueOf(bArr[i]);
                                i++;
                            }
                            hashMap3.put(str, bArr2);
                        } else if (cls == int[].class) {
                            HashMap hashMap4 = this.f5153a;
                            int[] iArr = (int[]) value;
                            C1388b bVar3 = C1388b.f5151b;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i < iArr.length) {
                                numArr[i] = Integer.valueOf(iArr[i]);
                                i++;
                            }
                            hashMap4.put(str, numArr);
                        } else if (cls == long[].class) {
                            HashMap hashMap5 = this.f5153a;
                            long[] jArr = (long[]) value;
                            C1388b bVar4 = C1388b.f5151b;
                            Long[] lArr = new Long[jArr.length];
                            while (i < jArr.length) {
                                lArr[i] = Long.valueOf(jArr[i]);
                                i++;
                            }
                            hashMap5.put(str, lArr);
                        } else if (cls == float[].class) {
                            HashMap hashMap6 = this.f5153a;
                            float[] fArr = (float[]) value;
                            C1388b bVar5 = C1388b.f5151b;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i < fArr.length) {
                                fArr2[i] = Float.valueOf(fArr[i]);
                                i++;
                            }
                            hashMap6.put(str, fArr2);
                        } else if (cls == double[].class) {
                            HashMap hashMap7 = this.f5153a;
                            double[] dArr = (double[]) value;
                            C1388b bVar6 = C1388b.f5151b;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i < dArr.length) {
                                dArr2[i] = Double.valueOf(dArr[i]);
                                i++;
                            }
                            hashMap7.put(str, dArr2);
                        } else {
                            throw new IllegalArgumentException(String.format("Key %s has invalid type %s", new Object[]{str, cls}));
                        }
                    }
                }
            }
        }
    }

    static {
        C4656h.m11961e(JSONRecordAdapter.DATA_FIELD_KEY);
        C1388b bVar = new C1388b(new HashMap());
        m3716c(bVar);
        f5151b = bVar;
    }

    public C1388b() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|(7:3|4|5|6|(2:8|9)|10|11)|28|29|30|32) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0044 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037 A[SYNTHETIC, Splitter:B:18:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0041 A[SYNTHETIC, Splitter:B:26:0x0041] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.C1388b m3715a(byte[] r5) {
        /*
            int r0 = r5.length
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r0 > r1) goto L_0x004d
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r5)
            r5 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x003e, all -> 0x0034 }
            r2.<init>(r1)     // Catch:{ IOException | ClassNotFoundException -> 0x003e, all -> 0x0034 }
            int r5 = r2.readInt()     // Catch:{ IOException | ClassNotFoundException -> 0x0031, all -> 0x002d }
        L_0x0019:
            if (r5 <= 0) goto L_0x0029
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException | ClassNotFoundException -> 0x0031, all -> 0x002d }
            java.lang.Object r4 = r2.readObject()     // Catch:{ IOException | ClassNotFoundException -> 0x0031, all -> 0x002d }
            r0.put(r3, r4)     // Catch:{ IOException | ClassNotFoundException -> 0x0031, all -> 0x002d }
            int r5 = r5 + -1
            goto L_0x0019
        L_0x0029:
            r2.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0044
        L_0x002d:
            r5 = move-exception
            r0 = r5
            r5 = r2
            goto L_0x0035
        L_0x0031:
            r5 = r2
            goto L_0x003f
        L_0x0034:
            r0 = move-exception
        L_0x0035:
            if (r5 == 0) goto L_0x003a
            r5.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            r1.close()     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            throw r0
        L_0x003e:
        L_0x003f:
            if (r5 == 0) goto L_0x0044
            r5.close()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            r1.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            androidx.work.b r5 = new androidx.work.b
            r5.<init>((java.util.HashMap) r0)
            return r5
        L_0x004d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C1388b.m3715a(byte[]):androidx.work.b");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:19|(2:34|35)|36|37|38) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:21|20|23|24|(2:26|27)|28|29|30) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:3|4|(2:7|5)|8|9|10|11|13|(2:15|16)(2:17|18)) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006b, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0067 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0071 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064 A[SYNTHETIC, Splitter:B:26:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e A[SYNTHETIC, Splitter:B:34:0x006e] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m3716c(androidx.work.C1388b r4) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x005e }
            r2.<init>(r0)     // Catch:{ IOException -> 0x005e }
            java.util.HashMap r1 = r4.f5152a     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            int r1 = r1.size()     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            r2.writeInt(r1)     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            java.util.HashMap r4 = r4.f5152a     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
        L_0x001e:
            boolean r1 = r4.hasNext()     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            if (r1 == 0) goto L_0x003b
            java.lang.Object r1 = r4.next()     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            java.lang.Object r3 = r1.getKey()     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            r2.writeUTF(r3)     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            r2.writeObject(r1)     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            goto L_0x001e
        L_0x003b:
            r2.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            r0.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0043
        L_0x0042:
        L_0x0043:
            int r4 = r0.size()
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r4 > r1) goto L_0x0050
            byte[] r4 = r0.toByteArray()
            return r4
        L_0x0050:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r4.<init>(r0)
            throw r4
        L_0x0058:
            r4 = move-exception
            goto L_0x006c
        L_0x005a:
            r1 = r2
            goto L_0x005e
        L_0x005c:
            r4 = move-exception
            goto L_0x006b
        L_0x005e:
            byte[] r4 = r0.toByteArray()     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x0067
            r1.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            r0.close()     // Catch:{ IOException -> 0x006a }
        L_0x006a:
            return r4
        L_0x006b:
            r2 = r1
        L_0x006c:
            if (r2 == 0) goto L_0x0071
            r2.close()     // Catch:{ IOException -> 0x0071 }
        L_0x0071:
            r0.close()     // Catch:{ IOException -> 0x0074 }
        L_0x0074:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C1388b.m3716c(androidx.work.b):byte[]");
    }

    /* renamed from: b */
    public final String mo5691b(String str) {
        Object obj = this.f5152a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || C1388b.class != obj.getClass()) {
            return false;
        }
        C1388b bVar = (C1388b) obj;
        Set<String> keySet = this.f5152a.keySet();
        if (!keySet.equals(bVar.f5152a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.f5152a.get(str);
            Object obj3 = bVar.f5152a.get(str);
            if (obj2 == null || obj3 == null) {
                if (obj2 == obj3) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
            } else if (!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) {
                z = obj2.equals(obj3);
                continue;
            } else {
                z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f5152a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f5152a.isEmpty()) {
            for (String str : this.f5152a.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f5152a.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public C1388b(C1388b bVar) {
        this.f5152a = new HashMap(bVar.f5152a);
    }

    public C1388b(HashMap hashMap) {
        this.f5152a = new HashMap(hashMap);
    }
}
