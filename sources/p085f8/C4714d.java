package p085f8;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import mf0.C24362h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p262t8.C6606a;

/* renamed from: f8.d */
public final class C4714d {

    /* renamed from: a */
    public static final C4714d f16001a = new C4714d();

    /* renamed from: b */
    public static WeakReference<View> f16002b = new WeakReference<>((Object) null);

    /* renamed from: c */
    public static Method f16003c;

    /* renamed from: a */
    public static final ArrayList m12012a(View view) {
        Class<C4714d> cls = C4714d.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                int i = 0;
                if (childCount > 0) {
                    while (true) {
                        int i2 = i + 1;
                        arrayList.add(((ViewGroup) view).getChildAt(i));
                        if (i2 >= childCount) {
                            break;
                        }
                        i = i2;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0069, code lost:
        if (r8.isInstance(r3) != false) goto L_0x006b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0054 A[Catch:{ ClassNotFoundException -> 0x004b, all -> 0x0044, all -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0055 A[Catch:{ ClassNotFoundException -> 0x004b, all -> 0x0044, all -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0073 A[Catch:{ all -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0079 A[Catch:{ all -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0098 A[Catch:{ all -> 0x00ca }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m12013b(android.view.View r9) {
        /*
            java.lang.Class<f8.d> r0 = p085f8.C4714d.class
            boolean r1 = p262t8.C6606a.m15601b(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = "view"
            mf0.C24362h.m61211f(r9, r1)     // Catch:{ all -> 0x00ca }
            boolean r1 = r9 instanceof android.widget.ImageView     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x0016
            r1 = 2
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            boolean r3 = r9.isClickable()     // Catch:{ all -> 0x00ca }
            if (r3 == 0) goto L_0x001f
            r1 = r1 | 32
        L_0x001f:
            boolean r3 = p262t8.C6606a.m15601b(r0)     // Catch:{ all -> 0x00ca }
            r4 = 1
            if (r3 == 0) goto L_0x0027
            goto L_0x0070
        L_0x0027:
            android.view.ViewParent r3 = r9.getParent()     // Catch:{ all -> 0x0049 }
            boolean r5 = r3 instanceof android.widget.AdapterView     // Catch:{ all -> 0x0049 }
            if (r5 == 0) goto L_0x0030
            goto L_0x006b
        L_0x0030:
            f8.d r5 = f16001a     // Catch:{ all -> 0x0049 }
            java.lang.String r6 = "android.support.v4.view.NestedScrollingChild"
            r5.getClass()     // Catch:{ all -> 0x0049 }
            boolean r7 = p262t8.C6606a.m15601b(r5)     // Catch:{ all -> 0x0049 }
            r8 = 0
            if (r7 == 0) goto L_0x003f
            goto L_0x004b
        L_0x003f:
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x004b, all -> 0x0044 }
            goto L_0x004c
        L_0x0044:
            r6 = move-exception
            p262t8.C6606a.m15600a(r5, r6)     // Catch:{ all -> 0x0049 }
            goto L_0x004b
        L_0x0049:
            r3 = move-exception
            goto L_0x006d
        L_0x004b:
            r6 = r8
        L_0x004c:
            if (r6 == 0) goto L_0x0055
            boolean r6 = r6.isInstance(r3)     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x0055
            goto L_0x006b
        L_0x0055:
            boolean r6 = p262t8.C6606a.m15601b(r5)     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x005c
            goto L_0x0063
        L_0x005c:
            java.lang.Class<s1.o> r8 = p242s1.C6379o.class
            goto L_0x0063
        L_0x005f:
            r6 = move-exception
            p262t8.C6606a.m15600a(r5, r6)     // Catch:{ all -> 0x0049 }
        L_0x0063:
            if (r8 == 0) goto L_0x0070
            boolean r3 = r8.isInstance(r3)     // Catch:{ all -> 0x0049 }
            if (r3 == 0) goto L_0x0070
        L_0x006b:
            r3 = 1
            goto L_0x0071
        L_0x006d:
            p262t8.C6606a.m15600a(r0, r3)     // Catch:{ all -> 0x00ca }
        L_0x0070:
            r3 = 0
        L_0x0071:
            if (r3 == 0) goto L_0x0075
            r1 = r1 | 512(0x200, float:7.175E-43)
        L_0x0075:
            boolean r3 = r9 instanceof android.widget.TextView     // Catch:{ all -> 0x00ca }
            if (r3 == 0) goto L_0x0098
            r1 = r1 | 1024(0x400, float:1.435E-42)
            r1 = r1 | r4
            boolean r3 = r9 instanceof android.widget.Button     // Catch:{ all -> 0x00ca }
            if (r3 == 0) goto L_0x0091
            r1 = r1 | 4
            boolean r3 = r9 instanceof android.widget.Switch     // Catch:{ all -> 0x00ca }
            if (r3 == 0) goto L_0x0089
            r1 = r1 | 8192(0x2000, float:1.14794E-41)
            goto L_0x0091
        L_0x0089:
            boolean r3 = r9 instanceof android.widget.CheckBox     // Catch:{ all -> 0x00ca }
            if (r3 == 0) goto L_0x0091
            r3 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r3
        L_0x0091:
            boolean r9 = r9 instanceof android.widget.EditText     // Catch:{ all -> 0x00ca }
            if (r9 == 0) goto L_0x00c9
            r1 = r1 | 2048(0x800, float:2.87E-42)
            goto L_0x00c9
        L_0x0098:
            boolean r3 = r9 instanceof android.widget.Spinner     // Catch:{ all -> 0x00ca }
            if (r3 != 0) goto L_0x00c7
            boolean r3 = r9 instanceof android.widget.DatePicker     // Catch:{ all -> 0x00ca }
            if (r3 == 0) goto L_0x00a1
            goto L_0x00c7
        L_0x00a1:
            boolean r3 = r9 instanceof android.widget.RatingBar     // Catch:{ all -> 0x00ca }
            if (r3 == 0) goto L_0x00a9
            r9 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r9
            goto L_0x00c9
        L_0x00a9:
            boolean r3 = r9 instanceof android.widget.RadioGroup     // Catch:{ all -> 0x00ca }
            if (r3 == 0) goto L_0x00b0
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
            goto L_0x00c9
        L_0x00b0:
            boolean r3 = r9 instanceof android.view.ViewGroup     // Catch:{ all -> 0x00ca }
            if (r3 == 0) goto L_0x00c9
            f8.d r3 = f16001a     // Catch:{ all -> 0x00ca }
            java.lang.ref.WeakReference<android.view.View> r4 = f16002b     // Catch:{ all -> 0x00ca }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x00ca }
            android.view.View r4 = (android.view.View) r4     // Catch:{ all -> 0x00ca }
            boolean r9 = r3.mo20223l(r9, r4)     // Catch:{ all -> 0x00ca }
            if (r9 == 0) goto L_0x00c9
            r1 = r1 | 64
            goto L_0x00c9
        L_0x00c7:
            r1 = r1 | 4096(0x1000, float:5.74E-42)
        L_0x00c9:
            return r1
        L_0x00ca:
            r9 = move-exception
            p262t8.C6606a.m15600a(r0, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p085f8.C4714d.m12013b(android.view.View):int");
    }

    /* renamed from: c */
    public static final JSONObject m12014c(View view) {
        Class<C4714d> cls = C4714d.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            C24362h.m61211f(view, Promotion.ACTION_VIEW);
            if (C24362h.m61206a(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                f16002b = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                m12020m(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                ArrayList a = m12012a(view);
                int i = 0;
                int size = a.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = i + 1;
                        jSONArray.put(m12014c((View) a.get(i)));
                        if (i2 > size) {
                            break;
                        }
                        i = i2;
                    }
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: e */
    public static final View.OnClickListener m12015e(View view) {
        Field declaredField;
        Class<C4714d> cls = C4714d.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.view.View.OnTouchListener m12016f(android.view.View r5) {
        /*
            java.lang.Class<f8.d> r0 = p085f8.C4714d.class
            boolean r1 = p262t8.C6606a.m15601b(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = "android.view.View"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ NoSuchFieldException -> 0x0053, ClassNotFoundException -> 0x004e, IllegalAccessException -> 0x0049 }
            java.lang.String r3 = "mListenerInfo"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch:{ NoSuchFieldException -> 0x0053, ClassNotFoundException -> 0x004e, IllegalAccessException -> 0x0049 }
            r3 = 1
            if (r1 == 0) goto L_0x001c
            r1.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x0053, ClassNotFoundException -> 0x004e, IllegalAccessException -> 0x0049 }
        L_0x001c:
            java.lang.Object r5 = r1.get(r5)     // Catch:{ NoSuchFieldException -> 0x0053, ClassNotFoundException -> 0x004e, IllegalAccessException -> 0x0049 }
            if (r5 != 0) goto L_0x0023
            return r2
        L_0x0023:
            java.lang.String r1 = "android.view.View$ListenerInfo"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ NoSuchFieldException -> 0x0053, ClassNotFoundException -> 0x004e, IllegalAccessException -> 0x0049 }
            java.lang.String r4 = "mOnTouchListener"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch:{ NoSuchFieldException -> 0x0053, ClassNotFoundException -> 0x004e, IllegalAccessException -> 0x0049 }
            if (r1 == 0) goto L_0x0046
            r1.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x0053, ClassNotFoundException -> 0x004e, IllegalAccessException -> 0x0049 }
            java.lang.Object r5 = r1.get(r5)     // Catch:{ NoSuchFieldException -> 0x0053, ClassNotFoundException -> 0x004e, IllegalAccessException -> 0x0049 }
            if (r5 == 0) goto L_0x003e
            android.view.View$OnTouchListener r5 = (android.view.View.OnTouchListener) r5     // Catch:{ NoSuchFieldException -> 0x0053, ClassNotFoundException -> 0x004e, IllegalAccessException -> 0x0049 }
            r2 = r5
            goto L_0x0046
        L_0x003e:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch:{ NoSuchFieldException -> 0x0053, ClassNotFoundException -> 0x004e, IllegalAccessException -> 0x0049 }
            java.lang.String r1 = "null cannot be cast to non-null type android.view.View.OnTouchListener"
            r5.<init>(r1)     // Catch:{ NoSuchFieldException -> 0x0053, ClassNotFoundException -> 0x004e, IllegalAccessException -> 0x0049 }
            throw r5     // Catch:{ NoSuchFieldException -> 0x0053, ClassNotFoundException -> 0x004e, IllegalAccessException -> 0x0049 }
        L_0x0046:
            return r2
        L_0x0047:
            r5 = move-exception
            goto L_0x0058
        L_0x0049:
            com.facebook.internal.f0 r5 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x0047 }
            a8.o r5 = p009a8.C0115o.f331a     // Catch:{ all -> 0x0047 }
            goto L_0x0057
        L_0x004e:
            com.facebook.internal.f0 r5 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x0047 }
            a8.o r5 = p009a8.C0115o.f331a     // Catch:{ all -> 0x0047 }
            goto L_0x0057
        L_0x0053:
            com.facebook.internal.f0 r5 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x0047 }
            a8.o r5 = p009a8.C0115o.f331a     // Catch:{ all -> 0x0047 }
        L_0x0057:
            return r2
        L_0x0058:
            p262t8.C6606a.m15600a(r0, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p085f8.C4714d.m12016f(android.view.View):android.view.View$OnTouchListener");
    }

    /* renamed from: g */
    public static final String m12017g(View view) {
        CharSequence charSequence;
        Class<C4714d> cls = C4714d.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                charSequence = ((EditText) view).getHint();
            } else if (view instanceof TextView) {
                charSequence = ((TextView) view).getHint();
            } else {
                charSequence = null;
            }
            if (charSequence == null) {
                return "";
            }
            String obj = charSequence.toString();
            if (obj == null) {
                return "";
            }
            return obj;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: h */
    public static final ViewGroup m12018h(View view) {
        Class<C4714d> cls = C4714d.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: i */
    public static final String m12019i(View view) {
        Object obj;
        Object selectedItem;
        String str;
        Class<C4714d> cls = C4714d.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                obj = ((TextView) view).getText();
                if (view instanceof Switch) {
                    if (((Switch) view).isChecked()) {
                        str = DiskLruCache.VERSION_1;
                    } else {
                        str = "0";
                    }
                    obj = str;
                }
            } else {
                if (!(view instanceof Spinner)) {
                    int i = 0;
                    if (view instanceof DatePicker) {
                        obj = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((DatePicker) view).getYear()), Integer.valueOf(((DatePicker) view).getMonth()), Integer.valueOf(((DatePicker) view).getDayOfMonth())}, 3));
                        C24362h.m61210e(obj, "java.lang.String.format(format, *args)");
                    } else if (view instanceof TimePicker) {
                        Integer currentHour = ((TimePicker) view).getCurrentHour();
                        C24362h.m61210e(currentHour, "view.currentHour");
                        int intValue = currentHour.intValue();
                        Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                        C24362h.m61210e(currentMinute, "view.currentMinute");
                        obj = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(currentMinute.intValue())}, 2));
                        C24362h.m61210e(obj, "java.lang.String.format(format, *args)");
                    } else if (view instanceof RadioGroup) {
                        int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                        int childCount = ((RadioGroup) view).getChildCount();
                        if (childCount > 0) {
                            while (true) {
                                int i2 = i + 1;
                                View childAt = ((RadioGroup) view).getChildAt(i);
                                if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                    obj = ((RadioButton) childAt).getText();
                                    break;
                                } else if (i2 >= childCount) {
                                    break;
                                } else {
                                    i = i2;
                                }
                            }
                        }
                    } else if (view instanceof RatingBar) {
                        obj = String.valueOf(((RatingBar) view).getRating());
                    }
                } else if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    obj = selectedItem.toString();
                }
                obj = null;
            }
            if (obj == null) {
                return "";
            }
            String obj2 = obj.toString();
            if (obj2 == null) {
                return "";
            }
            return obj2;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r8 = com.facebook.internal.C2397f0.f8630a;
        r8 = p009a8.C0115o.f331a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x009d */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m12020m(android.view.View r8, org.json.JSONObject r9) {
        /*
            java.lang.Class<f8.d> r0 = p085f8.C4714d.class
            boolean r1 = p262t8.C6606a.m15601b(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "view"
            mf0.C24362h.m61211f(r8, r1)     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = m12019i(r8)     // Catch:{ JSONException -> 0x009d }
            java.lang.String r2 = m12017g(r8)     // Catch:{ JSONException -> 0x009d }
            java.lang.Object r3 = r8.getTag()     // Catch:{ JSONException -> 0x009d }
            java.lang.CharSequence r4 = r8.getContentDescription()     // Catch:{ JSONException -> 0x009d }
            java.lang.String r5 = "classname"
            java.lang.Class r6 = r8.getClass()     // Catch:{ JSONException -> 0x009d }
            java.lang.String r6 = r6.getCanonicalName()     // Catch:{ JSONException -> 0x009d }
            r9.put(r5, r6)     // Catch:{ JSONException -> 0x009d }
            java.lang.String r5 = "classtypebitmask"
            int r6 = m12013b(r8)     // Catch:{ JSONException -> 0x009d }
            r9.put(r5, r6)     // Catch:{ JSONException -> 0x009d }
            java.lang.String r5 = "id"
            int r6 = r8.getId()     // Catch:{ JSONException -> 0x009d }
            r9.put(r5, r6)     // Catch:{ JSONException -> 0x009d }
            boolean r5 = p085f8.C4712b.m12009b(r8)     // Catch:{ JSONException -> 0x009d }
            java.lang.String r6 = "text"
            java.lang.String r7 = ""
            if (r5 != 0) goto L_0x0055
            java.lang.String r1 = com.facebook.internal.C2397f0.m6305N(r1)     // Catch:{ JSONException -> 0x009d }
            java.lang.String r1 = com.facebook.internal.C2397f0.m6312f(r1)     // Catch:{ JSONException -> 0x009d }
            r9.put(r6, r1)     // Catch:{ JSONException -> 0x009d }
            goto L_0x005e
        L_0x0055:
            r9.put(r6, r7)     // Catch:{ JSONException -> 0x009d }
            java.lang.String r1 = "is_user_input"
            r5 = 1
            r9.put(r1, r5)     // Catch:{ JSONException -> 0x009d }
        L_0x005e:
            java.lang.String r1 = "hint"
            java.lang.String r2 = com.facebook.internal.C2397f0.m6305N(r2)     // Catch:{ JSONException -> 0x009d }
            java.lang.String r2 = com.facebook.internal.C2397f0.m6312f(r2)     // Catch:{ JSONException -> 0x009d }
            r9.put(r1, r2)     // Catch:{ JSONException -> 0x009d }
            if (r3 == 0) goto L_0x007e
            java.lang.String r1 = "tag"
            java.lang.String r2 = r3.toString()     // Catch:{ JSONException -> 0x009d }
            java.lang.String r2 = com.facebook.internal.C2397f0.m6305N(r2)     // Catch:{ JSONException -> 0x009d }
            java.lang.String r2 = com.facebook.internal.C2397f0.m6312f(r2)     // Catch:{ JSONException -> 0x009d }
            r9.put(r1, r2)     // Catch:{ JSONException -> 0x009d }
        L_0x007e:
            if (r4 == 0) goto L_0x0091
            java.lang.String r1 = "description"
            java.lang.String r2 = r4.toString()     // Catch:{ JSONException -> 0x009d }
            java.lang.String r2 = com.facebook.internal.C2397f0.m6305N(r2)     // Catch:{ JSONException -> 0x009d }
            java.lang.String r2 = com.facebook.internal.C2397f0.m6312f(r2)     // Catch:{ JSONException -> 0x009d }
            r9.put(r1, r2)     // Catch:{ JSONException -> 0x009d }
        L_0x0091:
            f8.d r1 = f16001a     // Catch:{ JSONException -> 0x009d }
            org.json.JSONObject r8 = r1.mo20220d(r8)     // Catch:{ JSONException -> 0x009d }
            java.lang.String r1 = "dimension"
            r9.put(r1, r8)     // Catch:{ JSONException -> 0x009d }
            goto L_0x00a1
        L_0x009d:
            com.facebook.internal.f0 r8 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x00a2 }
            a8.o r8 = p009a8.C0115o.f331a     // Catch:{ all -> 0x00a2 }
        L_0x00a1:
            return
        L_0x00a2:
            r8 = move-exception
            p262t8.C6606a.m15600a(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p085f8.C4714d.m12020m(android.view.View, org.json.JSONObject):void");
    }

    /* renamed from: d */
    public final JSONObject mo20220d(View view) {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x004e */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo20221j(android.view.View r5, float[] r6) {
        /*
            r4 = this;
            boolean r0 = p262t8.C6606a.m15601b(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            r4.mo20222k()     // Catch:{ all -> 0x0058 }
            java.lang.reflect.Method r0 = f16003c     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0057
            if (r5 != 0) goto L_0x0012
            goto L_0x0057
        L_0x0012:
            if (r0 == 0) goto L_0x0042
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x004e }
            r3 = 0
            r2[r3] = r6     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x004e }
            r6 = 1
            r2[r6] = r5     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x004e }
            java.lang.Object r5 = r0.invoke(r1, r2)     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x004e }
            java.lang.String r6 = "null cannot be cast to non-null type android.view.View"
            if (r5 == 0) goto L_0x003c
            android.view.View r5 = (android.view.View) r5     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x004e }
            int r0 = r5.getId()     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x004e }
            if (r0 <= 0) goto L_0x0057
            android.view.ViewParent r5 = r5.getParent()     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x004e }
            if (r5 == 0) goto L_0x0036
            android.view.View r5 = (android.view.View) r5     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x004e }
            return r5
        L_0x0036:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x004e }
            r5.<init>(r6)     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x004e }
            throw r5     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x004e }
        L_0x003c:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x004e }
            r5.<init>(r6)     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x004e }
            throw r5     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x004e }
        L_0x0042:
            java.lang.String r5 = "Required value was null."
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x004e }
            java.lang.String r5 = r5.toString()     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x004e }
            r6.<init>(r5)     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x004e }
            throw r6     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x004e }
        L_0x004e:
            com.facebook.internal.f0 r5 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x0058 }
            a8.o r5 = p009a8.C0115o.f331a     // Catch:{ all -> 0x0058 }
            goto L_0x0057
        L_0x0053:
            com.facebook.internal.f0 r5 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x0058 }
            a8.o r5 = p009a8.C0115o.f331a     // Catch:{ all -> 0x0058 }
        L_0x0057:
            return r1
        L_0x0058:
            r5 = move-exception
            p262t8.C6606a.m15600a(r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p085f8.C4714d.mo20221j(android.view.View, float[]):android.view.View");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0039 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20222k() {
        /*
            r5 = this;
            boolean r0 = p262t8.C6606a.m15601b(r5)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.reflect.Method r0 = f16003c     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x000c
            return
        L_0x000c:
            java.lang.String r0 = "com.facebook.react.uimanager.TouchTargetHelper"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x003e, NoSuchMethodException -> 0x0039 }
            java.lang.String r1 = "findTouchTargetView"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException -> 0x003e, NoSuchMethodException -> 0x0039 }
            r3 = 0
            java.lang.Class<float[]> r4 = float[].class
            r2[r3] = r4     // Catch:{ ClassNotFoundException -> 0x003e, NoSuchMethodException -> 0x0039 }
            java.lang.Class<android.view.ViewGroup> r3 = android.view.ViewGroup.class
            r4 = 1
            r2[r4] = r3     // Catch:{ ClassNotFoundException -> 0x003e, NoSuchMethodException -> 0x0039 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ ClassNotFoundException -> 0x003e, NoSuchMethodException -> 0x0039 }
            f16003c = r0     // Catch:{ ClassNotFoundException -> 0x003e, NoSuchMethodException -> 0x0039 }
            if (r0 == 0) goto L_0x002d
            r0.setAccessible(r4)     // Catch:{ ClassNotFoundException -> 0x003e, NoSuchMethodException -> 0x0039 }
            goto L_0x0042
        L_0x002d:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x003e, NoSuchMethodException -> 0x0039 }
            java.lang.String r0 = r0.toString()     // Catch:{ ClassNotFoundException -> 0x003e, NoSuchMethodException -> 0x0039 }
            r1.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x003e, NoSuchMethodException -> 0x0039 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x003e, NoSuchMethodException -> 0x0039 }
        L_0x0039:
            com.facebook.internal.f0 r0 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x0043 }
            a8.o r0 = p009a8.C0115o.f331a     // Catch:{ all -> 0x0043 }
            goto L_0x0042
        L_0x003e:
            com.facebook.internal.f0 r0 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x0043 }
            a8.o r0 = p009a8.C0115o.f331a     // Catch:{ all -> 0x0043 }
        L_0x0042:
            return
        L_0x0043:
            r0 = move-exception
            p262t8.C6606a.m15600a(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p085f8.C4714d.mo20222k():void");
    }

    /* renamed from: l */
    public final boolean mo20223l(View view, View view2) {
        if (C6606a.m15601b(this)) {
            return false;
        }
        try {
            C24362h.m61211f(view, Promotion.ACTION_VIEW);
            if (!C24362h.m61206a(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            float[] fArr = null;
            if (!C6606a.m15601b(this)) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                fArr = new float[]{(float) iArr[0], (float) iArr[1]};
            }
            View j = mo20221j(view2, fArr);
            if (j == null || j.getId() != view.getId()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return false;
        }
    }
}
