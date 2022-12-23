package p764rd;

import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p836ud.C19885a;
import p956ze.C20839b;

/* renamed from: rd.b */
public final class C19254b {

    /* renamed from: a */
    public final C20839b<C19885a> f48906a;

    /* renamed from: b */
    public final String f48907b = "frc";

    /* renamed from: c */
    public Integer f48908c = null;

    public C19254b(C20839b bVar) {
        this.f48906a = bVar;
    }

    /* renamed from: a */
    public final List<C19885a.C19887b> mo51677a() {
        return this.f48906a.get().mo52168c(this.f48907b);
    }

    /* renamed from: b */
    public final void mo51678b(ArrayList arrayList) throws AbtException {
        String str;
        String str2;
        if (this.f48906a.get() != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                String[] strArr = C19253a.f48898g;
                ArrayList arrayList3 = new ArrayList();
                String[] strArr2 = C19253a.f48898g;
                for (int i = 0; i < 5; i++) {
                    String str3 = strArr2[i];
                    if (!map.containsKey(str3)) {
                        arrayList3.add(str3);
                    }
                }
                if (arrayList3.isEmpty()) {
                    try {
                        Date parse = C19253a.f48899h.parse((String) map.get("experimentStartTime"));
                        long parseLong = Long.parseLong((String) map.get("triggerTimeoutMillis"));
                        long parseLong2 = Long.parseLong((String) map.get("timeToLiveMillis"));
                        String str4 = (String) map.get("experimentId");
                        String str5 = (String) map.get("variantId");
                        if (map.containsKey("triggerEvent")) {
                            str2 = (String) map.get("triggerEvent");
                        } else {
                            str2 = "";
                        }
                        arrayList2.add(new C19253a(str4, str5, str2, parse, parseLong, parseLong2));
                    } catch (ParseException e) {
                        throw new AbtException("Could not process experiment: parsing experiment start time failed.", e);
                    } catch (NumberFormatException e2) {
                        throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e2);
                    }
                } else {
                    throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", new Object[]{arrayList3}));
                }
            }
            if (!arrayList2.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    hashSet.add(((C19253a) it2.next()).f48900a);
                }
                List<C19885a.C19887b> a = mo51677a();
                HashSet hashSet2 = new HashSet();
                for (C19885a.C19887b bVar : a) {
                    hashSet2.add(bVar.f50499b);
                }
                ArrayList<C19885a.C19887b> arrayList4 = new ArrayList<>();
                for (C19885a.C19887b next : a) {
                    if (!hashSet.contains(next.f50499b)) {
                        arrayList4.add(next);
                    }
                }
                for (C19885a.C19887b bVar2 : arrayList4) {
                    this.f48906a.get().mo52167b(bVar2.f50499b);
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    C19253a aVar = (C19253a) it3.next();
                    if (!hashSet2.contains(aVar.f48900a)) {
                        arrayList5.add(aVar);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(mo51677a());
                if (this.f48908c == null) {
                    this.f48908c = Integer.valueOf(this.f48906a.get().mo52170e(this.f48907b));
                }
                int intValue = this.f48908c.intValue();
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    C19253a aVar2 = (C19253a) it4.next();
                    while (arrayDeque.size() >= intValue) {
                        this.f48906a.get().mo52167b(((C19885a.C19887b) arrayDeque.pollFirst()).f50499b);
                    }
                    String str6 = this.f48907b;
                    aVar2.getClass();
                    C19885a.C19887b bVar3 = new C19885a.C19887b();
                    bVar3.f50498a = str6;
                    bVar3.f50510m = aVar2.f48903d.getTime();
                    bVar3.f50499b = aVar2.f48900a;
                    bVar3.f50500c = aVar2.f48901b;
                    if (TextUtils.isEmpty(aVar2.f48902c)) {
                        str = null;
                    } else {
                        str = aVar2.f48902c;
                    }
                    bVar3.f50501d = str;
                    bVar3.f50502e = aVar2.f48904e;
                    bVar3.f50507j = aVar2.f48905f;
                    this.f48906a.get().mo52173h(bVar3);
                    arrayDeque.offer(bVar3);
                }
            } else if (this.f48906a.get() != null) {
                for (C19885a.C19887b bVar4 : mo51677a()) {
                    this.f48906a.get().mo52167b(bVar4.f50499b);
                }
            } else {
                throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
            }
        } else {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}
