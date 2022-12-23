package com.moovit.search;

import android.app.Application;
import android.os.SystemClock;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0989a;
import androidx.lifecycle.C1043v;
import c00.C13720d;
import c00.C13722f;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.location.C16202a;
import com.moovit.search.C7604a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p041ca.C1831q;
import p172m9.C5720b;
import p241s0.C6302b;
import p241s0.C6307g;
import p394br.C13672m;
import p543hq.C17478e;
import p688nu.C18630b;
import p824tp.C19742t;
import p977zz.C20932c0;
import p977zz.C20944i0;
import z70.C13326d;
import z70.C13327e;
import z70.C13329g;
import z70.C13331h;
import z70.C13332i;
import z70.C13333j;

/* renamed from: com.moovit.search.b */
public final class C7606b extends C0989a {

    /* renamed from: p */
    public static final ScheduledExecutorService f23156p = Executors.newSingleThreadScheduledExecutor(C20932c0.m49025a("search_queue"));

    /* renamed from: q */
    public static final ThreadPoolExecutor f23157q = C5720b.m14033A(5, "search_providers");

    /* renamed from: c */
    public final ArrayList f23158c = new ArrayList(3);

    /* renamed from: d */
    public final HashSet f23159d = new HashSet(3);

    /* renamed from: e */
    public final ArrayList f23160e = new ArrayList(3);

    /* renamed from: f */
    public final HashSet f23161f = new HashSet(3);

    /* renamed from: g */
    public final ArrayList f23162g = new ArrayList(3);

    /* renamed from: h */
    public final HashSet f23163h = new HashSet(3);

    /* renamed from: i */
    public final C6302b f23164i = new C6302b();

    /* renamed from: j */
    public final C1043v<C7608b> f23165j = new C1043v<>();

    /* renamed from: k */
    public final C13327e f23166k;

    /* renamed from: l */
    public C13327e f23167l = null;

    /* renamed from: m */
    public String f23168m = "";

    /* renamed from: n */
    public final AtomicReference<UUID> f23169n = new AtomicReference<>();

    /* renamed from: o */
    public ScheduledFuture f23170o = null;

    /* renamed from: com.moovit.search.b$a */
    public class C7607a implements Runnable {

        /* renamed from: b */
        public final UUID f23171b;

        /* renamed from: c */
        public final String f23172c;

        /* renamed from: d */
        public final String f23173d;

        /* renamed from: e */
        public final LatLonE6 f23174e;

        public C7607a(UUID uuid, String str, String str2, LatLonE6 latLonE6) {
            this.f23171b = uuid;
            this.f23172c = str;
            this.f23173d = str2;
            this.f23174e = latLonE6;
        }

        public final void run() {
            boolean z;
            boolean z2;
            Task task;
            C7606b bVar = C7606b.this;
            UUID uuid = this.f23171b;
            String str = this.f23172c;
            String str2 = this.f23173d;
            LatLonE6 latLonE6 = this.f23174e;
            if (uuid.equals(bVar.f23169n.get())) {
                ArrayList<C7604a> b = bVar.mo23904b(str);
                if (!b.isEmpty()) {
                    if (str2.length() < 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    ArrayList arrayList = new ArrayList(b.size());
                    for (C7604a aVar : b) {
                        if (!z || !aVar.mo23777e()) {
                            ThreadPoolExecutor threadPoolExecutor = C7606b.f23157q;
                            C7604a.C7605a aVar2 = aVar.f23154c.get(aVar.mo23775a(str2, latLonE6));
                            if (aVar2 != null) {
                                task = Tasks.forResult(aVar2);
                            } else {
                                task = aVar.mo23776c(threadPoolExecutor, str2, latLonE6).addOnFailureListener((Executor) threadPoolExecutor, (OnFailureListener) new C13326d(aVar, str2, latLonE6)).onSuccessTask(threadPoolExecutor, new C1831q(2, aVar, str2, latLonE6));
                            }
                            arrayList.add(task.addOnCompleteListener((Executor) threadPoolExecutor, new C13331h(aVar, elapsedRealtime)));
                        }
                    }
                    if (b.size() != arrayList.size()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Task<Void> whenAll = Tasks.whenAll((Collection<? extends Task<?>>) arrayList);
                    ScheduledExecutorService scheduledExecutorService = C7606b.f23156p;
                    Task<TContinuationResult> onSuccessTask = whenAll.continueWith(scheduledExecutorService, new C13672m(1, bVar, arrayList)).onSuccessTask(scheduledExecutorService, new C13332i(bVar, str, str2, z2));
                    Executor executor = MoovitExecutors.MAIN_THREAD;
                    onSuccessTask.addOnSuccessListener(executor, (OnSuccessListener<? super TContinuationResult>) new C18630b(3, bVar, uuid)).addOnFailureListener(executor, (OnFailureListener) new C13333j(bVar, uuid, str, str2));
                }
            }
        }
    }

    public C7606b(Application application) {
        super(application);
        StyleSpan styleSpan = C13329g.f33089a;
        this.f23166k = new C13327e("empty_suggestions", (String) null, Collections.emptyList(), (C20944i0) null, View.inflate(application, C19742t.search_location_empty_suggestions_view, (ViewGroup) null));
    }

    /* renamed from: a */
    public static void m17383a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((C7604a) it.next()).f23154c.clear();
        }
    }

    /* renamed from: b */
    public final ArrayList mo23904b(String str) {
        str.getClass();
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1525319953:
                if (str.equals("suggestions")) {
                    c = 0;
                    break;
                }
                break;
            case -837947416:
                if (str.equals("autocomplete")) {
                    c = 1;
                    break;
                }
                break;
            case -415415205:
                if (str.equals("deep_search")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.f23158c;
            case 1:
                return this.f23160e;
            case 2:
                return this.f23162g;
            default:
                throw new IllegalStateException(C25541a.m63881k("Unknown search type: ", str));
        }
    }

    /* renamed from: c */
    public final void mo23905c(String str) {
        String str2;
        if (str != null) {
            C7604a aVar = (C7604a) this.f23164i.getOrDefault(str, null);
            if (aVar != null) {
                m17383a(Collections.singleton(aVar));
            } else {
                return;
            }
        } else {
            m17383a(this.f23158c);
            m17383a(this.f23160e);
        }
        if (this.f23168m.isEmpty()) {
            str2 = "suggestions";
        } else {
            str2 = "autocomplete";
        }
        mo23909g(0, str2);
    }

    /* renamed from: d */
    public final void mo23906d(UUID uuid, C7608b bVar) {
        C21100e.m49369v(1);
        if (uuid.equals(this.f23169n.get())) {
            String str = bVar.f23177b;
            bVar.f23178c.size();
            this.f23165j.setValue(bVar);
        }
    }

    /* renamed from: e */
    public final void mo23907e(C7604a<?> aVar) {
        String str = aVar.f23153b;
        this.f23160e.add(aVar);
        this.f23161f.add(str);
        this.f23164i.put(str, aVar);
    }

    /* renamed from: f */
    public final void mo23908f(C7604a<?> aVar) {
        String str = aVar.f23153b;
        this.f23158c.add(aVar);
        this.f23159d.add(str);
        this.f23164i.put(str, aVar);
    }

    /* renamed from: g */
    public final void mo23909g(int i, String str) {
        C21100e.m49369v(1);
        if (!mo23904b(str).isEmpty()) {
            UUID randomUUID = UUID.randomUUID();
            this.f23169n.set(randomUUID);
            String str2 = this.f23168m;
            LatLonE6 j = LatLonE6.m40177j(C16202a.get(this.f3907b).getPermissionAwareHighAccuracyFrequentUpdates().mo50014i());
            ScheduledFuture scheduledFuture = this.f23170o;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f23170o.cancel(false);
            }
            this.f23170o = null;
            this.f23170o = f23156p.schedule(new C7607a(randomUUID, str, str2, j), (long) i, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: h */
    public final void mo23910h(int i, CharSequence charSequence) {
        String str;
        String str2;
        if (charSequence != null) {
            str = charSequence.toString().trim();
        } else {
            str = "";
        }
        if (!this.f23168m.equalsIgnoreCase(str)) {
            this.f23168m = str;
            if (str.isEmpty()) {
                str2 = "suggestions";
            } else {
                str2 = "autocomplete";
            }
            mo23909g(i, str2);
        }
    }

    public final void onCleared() {
        super.onCleared();
        this.f23167l = null;
        this.f23169n.set((Object) null);
        ScheduledFuture scheduledFuture = this.f23170o;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f23170o.cancel(false);
        }
        this.f23170o = null;
        Iterator it = ((C6307g.C6312e) this.f23164i.values()).iterator();
        while (it.hasNext()) {
            ((C7604a) it.next()).mo23778f();
        }
        this.f23159d.clear();
        this.f23158c.clear();
        this.f23161f.clear();
        this.f23160e.clear();
        this.f23163h.clear();
        this.f23162g.clear();
        this.f23164i.clear();
    }

    /* renamed from: com.moovit.search.b$b */
    public static class C7608b {

        /* renamed from: a */
        public final String f23176a;

        /* renamed from: b */
        public final String f23177b;

        /* renamed from: c */
        public final List<C13327e> f23178c;

        /* renamed from: d */
        public final Map<AnalyticsAttributeKey, String> f23179d;

        /* renamed from: e */
        public final Set<String> f23180e;

        /* renamed from: f */
        public final Exception f23181f;

        public C7608b() {
            throw null;
        }

        public C7608b(String str, String str2, ArrayList arrayList) {
            this.f23176a = str;
            this.f23177b = str2;
            this.f23178c = Collections.unmodifiableList(arrayList);
            this.f23179d = Collections.unmodifiableMap(m17391a(str, arrayList));
            this.f23180e = Collections.unmodifiableSet(C13720d.m34277g(arrayList, (C13722f) null, new C17478e(18)));
            this.f23181f = null;
        }

        /* renamed from: a */
        public static C6302b m17391a(String str, List list) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C13327e eVar = (C13327e) it.next();
                if (sb.length() > 0) {
                    sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                }
                sb.append(eVar.f33086d);
                if (sb2.length() > 0) {
                    sb2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                }
                sb2.append(eVar.mo40089e());
            }
            C6302b bVar = new C6302b(3);
            bVar.put(AnalyticsAttributeKey.PUBLISHER, str);
            bVar.put(AnalyticsAttributeKey.PROVIDER, sb.toString());
            bVar.put(AnalyticsAttributeKey.STATUS, sb2.toString());
            return bVar;
        }

        public C7608b(String str, String str2, Exception exc) {
            this.f23176a = str;
            this.f23177b = str2;
            List<C13327e> emptyList = Collections.emptyList();
            this.f23178c = emptyList;
            this.f23179d = Collections.unmodifiableMap(m17391a(str, emptyList));
            this.f23180e = Collections.emptySet();
            C21100e.m49373x(exc, "error");
            this.f23181f = exc;
        }
    }
}
