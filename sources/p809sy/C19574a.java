package p809sy;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import c20.C13744a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.app.wondo.tickets.codes.C15648a;
import com.moovit.app.wondo.tickets.codes.WondoCodesActivity;
import com.moovit.app.wondo.tickets.model.WondoCode;
import com.moovit.image.model.Image;
import com.moovit.micromobility.ride.MicroMobilityRide;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import l30.C5597z;
import m30.C5681d;
import m30.C5682e;
import o00.C18676l;
import p054d0.C4303q;
import p589jq.C17910b;
import p644lx.C18284b;
import p900wt.C20415e;

/* renamed from: sy.a */
public final /* synthetic */ class C19574a implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ int f49753b;

    /* renamed from: c */
    public final /* synthetic */ Object f49754c;

    /* renamed from: d */
    public final /* synthetic */ Object f49755d;

    public /* synthetic */ C19574a(int i, Object obj, Object obj2) {
        this.f49753b = i;
        this.f49754c = obj;
        this.f49755d = obj2;
    }

    public final void onComplete(Task task) {
        MicroMobilityRide microMobilityRide;
        List list;
        Image image = null;
        switch (this.f49753b) {
            case 0:
                WondoCodesActivity wondoCodesActivity = (WondoCodesActivity) this.f49754c;
                Task task2 = (Task) this.f49755d;
                int i = WondoCodesActivity.f40679Z;
                wondoCodesActivity.getClass();
                if (!task.isSuccessful()) {
                    wondoCodesActivity.f40682Y.mo4627l0(wondoCodesActivity.f40681X);
                    return;
                }
                List list2 = (List) task2.getResult();
                if (C13717b.m34258e(list2)) {
                    wondoCodesActivity.f40682Y.mo4627l0(wondoCodesActivity.f40680U);
                    return;
                }
                ArrayList arrayList = new ArrayList(list2);
                ArrayList arrayList2 = new ArrayList(list2.size());
                C13723g.m34285f(arrayList, arrayList2, new C17910b(7));
                C18676l.C18678b bVar = new C18676l.C18678b(wondoCodesActivity.getString(R.string.wondo_codes_available_section), (List) null);
                if (C13717b.m34258e(arrayList)) {
                    bVar.add(new C15648a.C15650b(3, (WondoCode) null));
                    wondoCodesActivity.mo46673A2(false);
                } else {
                    C13720d.m34276f(arrayList, (C13722f) null, new C4303q(10), bVar);
                    wondoCodesActivity.mo46673A2(true);
                }
                C18676l.C18678b bVar2 = new C18676l.C18678b(wondoCodesActivity.getString(R.string.wondo_codes_expired_section), (List) null);
                C13720d.m34276f(arrayList2, (C13722f) null, new C20415e(5), bVar2);
                C15648a aVar = new C15648a(wondoCodesActivity);
                if (C13717b.m34258e(bVar2)) {
                    list = Collections.singletonList(bVar);
                } else {
                    list = Arrays.asList(new C18676l.C18678b[]{bVar, bVar2});
                }
                aVar.mo51055y(list);
                wondoCodesActivity.f40682Y.mo4627l0(aVar);
                return;
            default:
                C5682e eVar = (C5682e) this.f49754c;
                View view = (View) this.f49755d;
                String str = C5682e.f18466k;
                eVar.getClass();
                if (task.isSuccessful()) {
                    microMobilityRide = (MicroMobilityRide) task.getResult();
                } else {
                    microMobilityRide = null;
                }
                ImageView imageView = (ImageView) view.findViewById(C5597z.image);
                if (microMobilityRide != null) {
                    image = microMobilityRide.f14989g;
                }
                C13744a.m34300b(imageView, image);
                RatingBar ratingBar = (RatingBar) view.findViewById(C5597z.rating);
                eVar.f18468i = ratingBar;
                ratingBar.setOnRatingBarChangeListener(new C5681d(eVar));
                Button button = (Button) view.findViewById(C5597z.action);
                eVar.f18469j = button;
                button.setOnClickListener(new C18284b(eVar, 5));
                return;
        }
    }
}
