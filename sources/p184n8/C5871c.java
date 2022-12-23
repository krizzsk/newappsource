package p184n8;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import com.appboy.models.MessageButton;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mf0.C24362h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p085f8.C4714d;
import p262t8.C6606a;
import p583jk.C17875h;

/* renamed from: n8.c */
public final class C5871c {

    /* renamed from: a */
    public static final C5871c f18867a = new C5871c();

    /* renamed from: b */
    public static final List<Class<? extends View>> f18868b = C17875h.m44281E(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    /* renamed from: a */
    public static final ArrayList m14318a(View view) {
        Class<C5871c> cls = C5871c.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            C24362h.m61211f(view, Promotion.ACTION_VIEW);
            ArrayList arrayList = new ArrayList();
            for (Class<? extends View> isInstance : f18868b) {
                if (isInstance.isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator it = C4714d.m12012a(view).iterator();
            while (it.hasNext()) {
                arrayList.addAll(m14318a((View) it.next()));
            }
            return arrayList;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: b */
    public static final JSONObject m14319b(View view, View view2) {
        Class<C5871c> cls = C5871c.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            C24362h.m61211f(view, Promotion.ACTION_VIEW);
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            m14321e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = C4714d.m12012a(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(m14319b((View) it.next(), view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: d */
    public static final String m14320d(View view) {
        boolean z;
        Class<C5871c> cls = C5871c.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            C24362h.m61211f(view, "hostView");
            String i = C4714d.m12019i(view);
            if (i.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return i;
            }
            String join = TextUtils.join(" ", f18867a.mo21746c(view));
            C24362h.m61210e(join, "join(\" \", childrenText)");
            return join;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: e */
    public static final void m14321e(View view, JSONObject jSONObject) {
        boolean z;
        Class<C5871c> cls = C5871c.class;
        if (!C6606a.m15601b(cls)) {
            try {
                C24362h.m61211f(view, Promotion.ACTION_VIEW);
                try {
                    String i = C4714d.m12019i(view);
                    String g = C4714d.m12017g(view);
                    jSONObject.put("classname", view.getClass().getSimpleName());
                    jSONObject.put("classtypebitmask", C4714d.m12013b(view));
                    boolean z2 = false;
                    if (i.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        jSONObject.put(MessageButton.TEXT, i);
                    }
                    if (g.length() > 0) {
                        z2 = true;
                    }
                    if (z2) {
                        jSONObject.put("hint", g);
                    }
                    if (view instanceof EditText) {
                        jSONObject.put("inputtype", ((EditText) view).getInputType());
                    }
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
        }
    }

    /* renamed from: c */
    public final ArrayList mo21746c(View view) {
        boolean z;
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = C4714d.m12012a(view).iterator();
            while (it.hasNext()) {
                View view2 = (View) it.next();
                String i = C4714d.m12019i(view2);
                if (i.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(i);
                }
                arrayList.addAll(mo21746c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }
}
