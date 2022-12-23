package p336z8;

import android.os.Bundle;
import com.facebook.share.model.CameraEffectArguments;
import java.util.HashMap;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C23826d;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: z8.a */
public final class C7493a {

    /* renamed from: a */
    public static final HashMap<Class<?>, C7497d> f22974a = C23826d.m58532W(new Pair(String.class, new C7494a()), new Pair(String[].class, new C7495b()), new Pair(JSONArray.class, new C7496c()));

    /* renamed from: z8.a$a */
    public static final class C7494a implements C7497d {
        /* renamed from: a */
        public final void mo23762a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            C24362h.m61211f(str, LinksConfiguration.KEY_KEY);
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: z8.a$b */
    public static final class C7495b implements C7497d {
        /* renamed from: a */
        public final void mo23762a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            C24362h.m61211f(str, LinksConfiguration.KEY_KEY);
            JSONArray jSONArray = new JSONArray();
            String[] strArr = (String[]) obj;
            int i = 0;
            int length = strArr.length;
            while (i < length) {
                String str2 = strArr[i];
                i++;
                jSONArray.put(str2);
            }
            jSONObject.put(str, jSONArray);
        }
    }

    /* renamed from: z8.a$c */
    public static final class C7496c implements C7497d {
        /* renamed from: a */
        public final void mo23762a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            C24362h.m61211f(str, LinksConfiguration.KEY_KEY);
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }
    }

    /* renamed from: z8.a$d */
    public interface C7497d {
        /* renamed from: a */
        void mo23762a(JSONObject jSONObject, String str, Object obj) throws JSONException;
    }

    /* renamed from: a */
    public static final JSONObject m17196a(CameraEffectArguments cameraEffectArguments) throws JSONException {
        Set<String> set;
        Object obj;
        if (cameraEffectArguments == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        Bundle bundle = cameraEffectArguments.f8903b;
        if (bundle == null) {
            set = null;
        } else {
            set = bundle.keySet();
        }
        if (set == null) {
            set = EmptySet.f60175b;
        }
        for (String str : set) {
            Bundle bundle2 = cameraEffectArguments.f8903b;
            if (bundle2 == null) {
                obj = null;
            } else {
                obj = bundle2.get(str);
            }
            if (obj != null) {
                C7497d dVar = f22974a.get(obj.getClass());
                if (dVar != null) {
                    dVar.mo23762a(jSONObject, str, obj);
                } else {
                    throw new IllegalArgumentException(C24362h.m61216k(obj.getClass(), "Unsupported type: "));
                }
            }
        }
        return jSONObject;
    }
}
