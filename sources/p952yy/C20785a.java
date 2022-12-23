package p952yy;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import com.moovit.database.DbEntityRef;
import com.moovit.transit.TransitPattern;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.Time;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p241s0.C6302b;
import p977zz.C20930c;
import p977zz.C20941h;

/* renamed from: yy.a */
public final class C20785a {
    /* renamed from: a */
    public static SpannableString m48769a(Context context, Time time) {
        Time.Status status = time.f23910k;
        if (Time.Status.UNKNOWN.equals(status)) {
            return null;
        }
        String string = context.getString(status.getTextResId());
        if (Time.Status.DELAY.equals(status)) {
            long j = time.f23901b;
            long j2 = time.f23902c;
            if (time.mo24633j() && j2 > j) {
                StringBuilder k = C13555b.m33972k(string);
                k.append(String.format(C20930c.m49020b(context), " (%1$s)", new Object[]{C7925b.m18024l(context, j2)}));
                string = k.toString();
            }
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(C20941h.m49043f(status.getColorAttrId(), context)), 0, string.length(), 33);
        return spannableString;
    }

    /* renamed from: b */
    public static SpannableString m48770b(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
        return spannableString;
    }

    /* renamed from: c */
    public static HashSet m48771c(Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Iterator<Time> it2 = ((C20787c) it.next()).f52458c.iterator();
            while (it2.hasNext()) {
                DbEntityRef<TransitPattern> dbEntityRef = it2.next().f23905f;
                if (dbEntityRef != null) {
                    hashSet.add(dbEntityRef.getServerId());
                }
            }
        }
        return hashSet;
    }

    /* renamed from: d */
    public static C6302b m48772d(List list) {
        C6302b bVar = new C6302b(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20787c cVar = (C20787c) it.next();
            bVar.put(cVar.f52456a, cVar);
        }
        return bVar;
    }
}
