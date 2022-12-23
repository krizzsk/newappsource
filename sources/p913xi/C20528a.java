package p913xi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xi.a */
public abstract class C20528a<T> {

    /* renamed from: a */
    public final C20531d f51918a;

    /* renamed from: b */
    public final Class<T> f51919b;

    public C20528a(C20531d dVar, Class<T> cls) {
        this.f51918a = dVar;
        this.f51919b = cls;
    }

    /* renamed from: g */
    public static BigDecimal m48228g(String str, JSONObject jSONObject) throws JSONException {
        if (!jSONObject.isNull(str)) {
            return BigDecimal.valueOf(jSONObject.getDouble(str));
        }
        return null;
    }

    /* renamed from: h */
    public static Boolean m48229h(String str, JSONObject jSONObject) throws JSONException {
        if (!jSONObject.isNull(str)) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        return null;
    }

    /* renamed from: i */
    public static Date m48230i(String str, JSONObject jSONObject) throws JSONException {
        if (!jSONObject.isNull(str)) {
            return new Date(jSONObject.getLong(str));
        }
        return null;
    }

    /* renamed from: j */
    public static Double m48231j(String str, JSONObject jSONObject) throws JSONException {
        if (!jSONObject.isNull(str)) {
            return Double.valueOf(jSONObject.getDouble(str));
        }
        return null;
    }

    /* renamed from: k */
    public static Integer m48232k(String str, JSONObject jSONObject) throws JSONException {
        if (!jSONObject.isNull(str)) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        return null;
    }

    /* renamed from: n */
    public static Long m48233n(String str, JSONObject jSONObject) throws JSONException {
        if (!jSONObject.isNull(str)) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        return null;
    }

    /* renamed from: o */
    public static String m48234o(String str, JSONObject jSONObject) throws JSONException {
        if (!jSONObject.isNull(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    /* renamed from: p */
    public static boolean m48235p(Class cls) {
        if (String.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls) || Long.class.isAssignableFrom(cls) || Double.class.isAssignableFrom(cls) || Integer.class.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public static void m48236q(JSONObject jSONObject, String str, Date date) throws JSONException {
        if (date == null) {
            m48237t(jSONObject, str, (Object) null);
        } else {
            m48237t(jSONObject, str, Long.valueOf(date.getTime()));
        }
    }

    /* renamed from: t */
    public static void m48237t(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj == null) {
            jSONObject.put(str, JSONObject.NULL);
        } else {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: a */
    public T mo50643a(String str) throws JSONException {
        return mo40384d(new JSONObject(str));
    }

    /* renamed from: b */
    public String mo50644b(T t) throws JSONException {
        return mo40385f(t).toString();
    }

    /* renamed from: c */
    public final ArrayList mo52725c(JSONArray jSONArray, Class cls) throws JSONException {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.get(i).equals(JSONObject.NULL)) {
                obj = null;
            } else if (m48235p(cls)) {
                obj = this.f51918a.mo52734c(cls).mo40384d(jSONArray.getJSONObject(i));
            } else if (String.class.isAssignableFrom(cls)) {
                obj = jSONArray.getString(i);
            } else if (Boolean.class.isAssignableFrom(cls)) {
                obj = Boolean.valueOf(jSONArray.getBoolean(i));
            } else if (Long.class.isAssignableFrom(cls)) {
                obj = Long.valueOf(jSONArray.getLong(i));
            } else if (Double.class.isAssignableFrom(cls)) {
                obj = Double.valueOf(jSONArray.getDouble(i));
            } else if (Integer.class.isAssignableFrom(cls)) {
                obj = Integer.valueOf(jSONArray.getInt(i));
            } else {
                StringBuilder r = C25541a.m63887r("Failed parsing item at position ", i, " in this JSONArray:");
                r.append(jSONArray.toString());
                throw new JSONException(r.toString());
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: d */
    public abstract T mo40384d(JSONObject jSONObject) throws JSONException;

    /* renamed from: e */
    public final <ST> JSONArray mo52726e(List<ST> list) throws JSONException {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (ST next : list) {
            if (next == null) {
                jSONArray.put(JSONObject.NULL);
            } else if (m48235p(next.getClass())) {
                C20531d dVar = this.f51918a;
                dVar.getClass();
                jSONArray.put(dVar.mo52734c(next.getClass()).mo40385f(next));
            } else {
                jSONArray.put(next);
            }
        }
        return jSONArray;
    }

    /* renamed from: f */
    public abstract JSONObject mo40385f(T t) throws JSONException;

    /* renamed from: l */
    public final ArrayList mo52727l(JSONObject jSONObject, String str, Class cls) throws JSONException {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return mo52725c(jSONObject.getJSONArray(str), cls);
    }

    /* renamed from: m */
    public final <ST> ST mo52728m(JSONObject jSONObject, String str, Class<ST> cls) throws JSONException {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return this.f51918a.mo52734c(cls).mo40384d(jSONObject.getJSONObject(str));
    }

    /* renamed from: r */
    public final <ST> void mo52729r(JSONObject jSONObject, String str, List<ST> list) throws JSONException {
        m48237t(jSONObject, str, mo52726e(list));
    }

    /* renamed from: s */
    public final <ST> void mo52730s(JSONObject jSONObject, String str, ST st) throws JSONException {
        JSONObject jSONObject2;
        if (st == null) {
            jSONObject2 = null;
        } else {
            C20531d dVar = this.f51918a;
            dVar.getClass();
            jSONObject2 = dVar.mo52734c(st.getClass()).mo40385f(st);
        }
        m48237t(jSONObject, str, jSONObject2);
    }
}
