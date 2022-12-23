package p926xv;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.moovit.app.MoovitAppApplication;
import com.moovit.app.servicealerts.LineServiceAlertDigestView;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.servicealerts.ServiceAlert;
import j80.C12786g;
import java.util.List;

/* renamed from: xv.a */
public final /* synthetic */ class C20620a implements Continuation {

    /* renamed from: b */
    public final /* synthetic */ List f52129b;

    /* renamed from: c */
    public final /* synthetic */ LineServiceAlertDigest f52130c;

    public /* synthetic */ C20620a(List list, LineServiceAlertDigest lineServiceAlertDigest) {
        this.f52129b = list;
        this.f52130c = lineServiceAlertDigest;
    }

    public final Object then(Task task) {
        List list = this.f52129b;
        LineServiceAlertDigest lineServiceAlertDigest = this.f52130c;
        int i = LineServiceAlertDigestView.f39539m;
        return new LineServiceAlertDigestView.C15303b(list, lineServiceAlertDigest, (C12786g) MoovitAppApplication.m37038x().f37321e.mo50695h("TWITTER_SERVICE_ALERTS_FEEDS", false), (ServiceAlert) task.getResult());
    }
}
