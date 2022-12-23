package p690nw;

import com.moovit.app.surveys.recorder.events.SurveyEvent;
import java.util.LinkedList;

/* renamed from: nw.a */
public final class C18641a {

    /* renamed from: b */
    public static final C18641a f47503b = new C18641a();

    /* renamed from: a */
    public final LinkedList<SurveyEvent> f47504a = new LinkedList<>();

    /* renamed from: a */
    public final synchronized void mo51027a(SurveyEvent surveyEvent) {
        this.f47504a.addLast(surveyEvent);
        if (this.f47504a.size() > 10) {
            this.f47504a.removeFirst();
        }
    }
}
