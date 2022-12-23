package p488fj;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p771rk.C19282a;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: fj.a */
public final class C17027a extends C20528a<C19282a> {
    public C17027a(C20531d dVar) {
        super(dVar, C19282a.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList;
        ArrayList arrayList2;
        JSONObject jSONObject2 = jSONObject;
        Class<String> cls = String.class;
        int intValue = C20528a.m48232k("id", jSONObject2).intValue();
        String o = C20528a.m48234o("name", jSONObject2);
        boolean equals = Boolean.TRUE.equals(C20528a.m48229h("invert", jSONObject2));
        ArrayList l = mo52727l(jSONObject2, "lines", cls);
        ArrayList l2 = mo52727l(jSONObject2, "directions", cls);
        ArrayList l3 = mo52727l(jSONObject2, "stations", cls);
        ArrayList l4 = mo52727l(jSONObject2, "subBrands", cls);
        ArrayList l5 = mo52727l(jSONObject2, "dateRanges", cls);
        ArrayList l6 = mo52727l(jSONObject2, "daysOfWeek", cls);
        ArrayList l7 = mo52727l(jSONObject2, "timeRanges", cls);
        Class<Integer> cls2 = Integer.class;
        if (jSONObject2.isNull("fareBlocks")) {
            arrayList2 = null;
            arrayList = l7;
        } else {
            JSONArray jSONArray = jSONObject2.getJSONArray("fareBlocks");
            ArrayList arrayList3 = new ArrayList();
            arrayList = l7;
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList3.add(mo52725c(jSONArray.getJSONArray(i), cls2));
            }
            arrayList2 = arrayList3;
        }
        return new C19282a(intValue, o, equals, l, l2, l3, l4, l5, l6, arrayList, arrayList2);
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C19282a aVar = (C19282a) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "id", Integer.valueOf(aVar.f49010a));
        C20528a.m48237t(jSONObject, "name", aVar.f49011b);
        C20528a.m48237t(jSONObject, "invert", Boolean.valueOf(aVar.f49012c));
        mo52729r(jSONObject, "lines", aVar.f49013d);
        mo52729r(jSONObject, "directions", aVar.f49014e);
        mo52729r(jSONObject, "stations", aVar.f49015f);
        mo52729r(jSONObject, "subBrands", aVar.f49016g);
        mo52729r(jSONObject, "dateRanges", aVar.f49017h);
        mo52729r(jSONObject, "daysOfWeek", aVar.f49018i);
        mo52729r(jSONObject, "timeRanges", aVar.f49019j);
        List<List<Integer>> list = aVar.f49020k;
        if (list == null) {
            C20528a.m48237t(jSONObject, "fareBlocks", (Object) null);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < list.size(); i++) {
                jSONArray.put(mo52726e(list.get(i)));
            }
            C20528a.m48237t(jSONObject, "fareBlocks", jSONArray);
        }
        return jSONObject;
    }
}
