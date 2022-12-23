package y20;

import android.os.Bundle;
import java.util.Map;
import p241s0.C6302b;
import p589jq.C17916h;
import z20.C20808b;

/* renamed from: y20.g */
public final class C20702g {
    /* renamed from: a */
    public static Bundle m48678a(C20808b bVar, C17916h hVar, C20701f fVar) throws Exception, Exception {
        Map<String, Object> map = bVar.f52527a;
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value != null && (hVar == null || hVar.mo19661o(str))) {
                String str2 = (String) fVar.convert(str);
                if (value instanceof Integer) {
                    bundle.putInt(str2, ((Number) value).intValue());
                } else if (value instanceof String) {
                    bundle.putString(str2, value.toString());
                } else if (value instanceof Double) {
                    bundle.putDouble(str2, ((Number) value).doubleValue());
                } else if (value instanceof Short) {
                    bundle.putShort(str2, ((Number) value).shortValue());
                } else if (value instanceof Float) {
                    bundle.putFloat(str2, ((Number) value).floatValue());
                } else if (value instanceof Long) {
                    bundle.putLong(str2, ((Number) value).longValue());
                } else if (value instanceof Boolean) {
                    bundle.putBoolean(str2, ((Boolean) value).booleanValue());
                } else {
                    StringBuilder k = C13555b.m33972k("Unsupported value: ");
                    k.append(value.getClass());
                    throw new IllegalStateException(k.toString());
                }
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public static C20701f m48679b(String... strArr) {
        if (strArr.length % 2 == 0) {
            C6302b bVar = new C6302b(strArr.length / 2);
            for (int i = 0; i < strArr.length; i += 2) {
                bVar.put(strArr[i], strArr[i + 1]);
            }
            return new C20701f(bVar, 0);
        }
        throw new IllegalStateException("Mapping converter must be pairs!");
    }
}
