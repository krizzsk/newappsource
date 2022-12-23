package zendesk.support;

import com.zendesk.logger.Logger;
import ge0.C23410c;
import p334z6.C7489b;
import p334z6.C7490c;

class AnswersTracker implements ZendeskTracker {
    private static final String LOG_TAG = "AnswersTracker";

    public void helpCenterArticleViewed() {
        Logger.m57302a("helpCenterArticleViewed", new Object[0]);
        C7489b.f22969a.mo22172g(new C7490c("help-center-article-viewed"));
    }

    public void helpCenterLoaded() {
        Logger.m57302a("helpCenterLoaded", new Object[0]);
        C7489b.f22969a.mo22172g(new C7490c("help-center-fetched"));
    }

    public void helpCenterSearched(String str) {
        Logger.m57302a("helpCenterSearched", new Object[0]);
        C7490c cVar = new C7490c("help-center-search");
        if (C23410c.m57534b(str)) {
            str = "";
        }
        cVar.f22971b.put("search-term", str);
        C7489b.f22969a.mo22172g(cVar);
    }

    public void requestCreated() {
        Logger.m57302a("requestCreated", new Object[0]);
        C7489b.f22969a.mo22172g(new C7490c("request-created"));
    }

    public void requestUpdated() {
        Logger.m57302a("requestUpdated", new Object[0]);
        C7489b.f22969a.mo22172g(new C7490c("request-updated"));
    }
}
