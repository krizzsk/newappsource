package p910xf;

import androidx.viewpager.widget.PagerAdapter;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.view.FormatTextView;
import com.moovit.commons.view.pager.ViewPager;
import com.moovit.image.model.Image;
import com.moovit.map.C16281i;
import com.moovit.map.MapFragment;
import com.moovit.search.SearchLocationMapActivity;
import com.moovit.transit.LocationDescriptor;
import j20.C17707d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n00.C18492b;
import p229r1.C6233c;
import p572iw.C17662e;
import p824tp.C19740r;

/* renamed from: xf.f */
public final /* synthetic */ class C20477f implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ int f51842b;

    /* renamed from: c */
    public final /* synthetic */ Object f51843c;

    /* renamed from: d */
    public final /* synthetic */ Object f51844d;

    /* renamed from: e */
    public final /* synthetic */ Object f51845e;

    public /* synthetic */ C20477f(int i, Object obj, Object obj2, Object obj3) {
        this.f51842b = i;
        this.f51843c = obj;
        this.f51844d = obj2;
        this.f51845e = obj3;
    }

    public final void onComplete(Task task) {
        Integer num;
        LocationDescriptor locationDescriptor;
        switch (this.f51842b) {
            case 0:
                C20482k kVar = (C20482k) this.f51843c;
                Continuation continuation = (Continuation) this.f51844d;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f51845e;
                kVar.getClass();
                try {
                    Object then = continuation.then(kVar);
                    if (!taskCompletionSource.getTask().isComplete()) {
                        taskCompletionSource.setResult(then);
                        return;
                    }
                    return;
                } catch (RuntimeExecutionException e) {
                    if (e.getCause() instanceof Exception) {
                        taskCompletionSource.setException((Exception) e.getCause());
                        return;
                    } else {
                        taskCompletionSource.setException(e);
                        return;
                    }
                } catch (Exception e2) {
                    taskCompletionSource.setException(e2);
                    return;
                }
            default:
                SearchLocationMapActivity searchLocationMapActivity = (SearchLocationMapActivity) this.f51843c;
                List list = (List) this.f51844d;
                List list2 = (List) this.f51845e;
                searchLocationMapActivity.f23143l0.setVisibility(8);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < list2.size(); i++) {
                    Task task2 = (Task) list2.get(i);
                    if (!task2.isSuccessful()) {
                        locationDescriptor = (LocationDescriptor) list.get(i);
                    } else {
                        C17707d dVar = (C17707d) task2.getResult();
                        LocationDescriptor locationDescriptor2 = dVar.f45454e;
                        if (locationDescriptor2 != null) {
                            locationDescriptor = locationDescriptor2;
                        } else {
                            locationDescriptor = dVar.f45450a;
                        }
                    }
                    if (!arrayList.contains(locationDescriptor)) {
                        arrayList.add(locationDescriptor);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                LatLonE6 j = LatLonE6.m40177j(searchLocationMapActivity.mo44542u1());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LocationDescriptor locationDescriptor3 = (LocationDescriptor) it.next();
                    if (j == null) {
                        num = null;
                    } else {
                        num = Integer.valueOf((int) LatLonE6.m40174c(j, locationDescriptor3.mo24310d()));
                    }
                    arrayList2.add(new SearchLocationMapActivity.C7602b(locationDescriptor3, num));
                }
                searchLocationMapActivity.mo23900z2(arrayList2);
                MapFragment mapFragment = (MapFragment) searchLocationMapActivity.mo44529n1(C19740r.map_fragment);
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (i2 < arrayList2.size()) {
                        SearchLocationMapActivity.C7602b bVar = (SearchLocationMapActivity.C7602b) arrayList2.get(i2);
                        Image image = bVar.f23148b.f23655j;
                        if (i2 != 0) {
                            z = false;
                        }
                        Object o2 = mapFragment.mo48646o2(bVar, bVar, C16281i.m41505a(image, z));
                        if (i2 == 0) {
                            searchLocationMapActivity.f23140X = new C6233c<>(bVar, o2);
                        }
                        searchLocationMapActivity.f23141Y.put(bVar, o2);
                        i2++;
                    } else {
                        searchLocationMapActivity.f23145n0 = new SearchLocationMapActivity.C7603c(arrayList2);
                        ViewPager viewPager = (ViewPager) searchLocationMapActivity.findViewById(C19740r.places);
                        searchLocationMapActivity.f23142Z = viewPager;
                        viewPager.setAdapter(new C18492b((PagerAdapter) searchLocationMapActivity.f23145n0, viewPager));
                        searchLocationMapActivity.f23142Z.addOnPageChangeListener(searchLocationMapActivity.f23139U);
                        FormatTextView formatTextView = (FormatTextView) searchLocationMapActivity.findViewById(C19740r.slider_indicator);
                        searchLocationMapActivity.f23146o0 = formatTextView;
                        formatTextView.setArguments(1, Integer.valueOf(searchLocationMapActivity.f23145n0.getCount()));
                        searchLocationMapActivity.f23144m0.setEnabled(true);
                        searchLocationMapActivity.f23144m0.setOnClickListener(new C17662e(searchLocationMapActivity, 15));
                        return;
                    }
                }
        }
    }
}
