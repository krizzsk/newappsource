package p328z0;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.p982v1.XmlPullParserException;

/* renamed from: z0.g */
public final class C7384g {

    /* renamed from: b */
    public static HashMap<String, Constructor<? extends C7379d>> f22647b;

    /* renamed from: a */
    public HashMap<Integer, ArrayList<C7379d>> f22648a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends C7379d>> hashMap = new HashMap<>();
        f22647b = hashMap;
        try {
            hashMap.put("KeyAttribute", C7380e.class.getConstructor(new Class[0]));
            f22647b.put("KeyPosition", C7385h.class.getConstructor(new Class[0]));
            f22647b.put("KeyCycle", C7382f.class.getConstructor(new Class[0]));
            f22647b.put("KeyTimeCycle", C7388j.class.getConstructor(new Class[0]));
            f22647b.put("KeyTrigger", C7390k.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException unused) {
        }
    }

    public C7384g() {
    }

    /* renamed from: a */
    public final void mo23609a(C7394n nVar) {
        boolean z;
        ArrayList arrayList = this.f22648a.get(Integer.valueOf(nVar.f22727c));
        if (arrayList != null) {
            nVar.f22747w.addAll(arrayList);
        }
        ArrayList arrayList2 = this.f22648a.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C7379d dVar = (C7379d) it.next();
                String str = ((ConstraintLayout.LayoutParams) nVar.f22726b.getLayoutParams()).f3029Y;
                String str2 = dVar.f22609c;
                if (str2 == null || str == null) {
                    z = false;
                } else {
                    z = str.matches(str2);
                }
                if (z) {
                    nVar.mo23619a(dVar);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo23610b(C7379d dVar) {
        if (!this.f22648a.containsKey(Integer.valueOf(dVar.f22608b))) {
            this.f22648a.put(Integer.valueOf(dVar.f22608b), new ArrayList());
        }
        ArrayList arrayList = this.f22648a.get(Integer.valueOf(dVar.f22608b));
        if (arrayList != null) {
            arrayList.add(dVar);
        }
    }

    public C7384g(Context context, XmlResourceParser xmlResourceParser) {
        HashMap<String, ConstraintAttribute> hashMap;
        HashMap<String, ConstraintAttribute> hashMap2;
        try {
            int eventType = xmlResourceParser.getEventType();
            C7379d dVar = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    if (f22647b.containsKey(name)) {
                        try {
                            Constructor constructor = f22647b.get(name);
                            if (constructor != null) {
                                C7379d dVar2 = (C7379d) constructor.newInstance(new Object[0]);
                                try {
                                    dVar2.mo23605e(context, Xml.asAttributeSet(xmlResourceParser));
                                    mo23610b(dVar2);
                                } catch (Exception unused) {
                                }
                                dVar = dVar2;
                            } else {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                            }
                        } catch (Exception unused2) {
                            continue;
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (!(dVar == null || (hashMap2 = dVar.f22610d) == null)) {
                            ConstraintAttribute.m2206d(context, xmlResourceParser, hashMap2);
                        }
                    } else if (!(!name.equalsIgnoreCase("CustomMethod") || dVar == null || (hashMap = dVar.f22610d) == null)) {
                        ConstraintAttribute.m2206d(context, xmlResourceParser, hashMap);
                    }
                } else if (eventType == 3) {
                    if ("KeyFrameSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
