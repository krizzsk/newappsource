package zendesk.support;

import ge0.C23408a;
import java.util.List;

class RequestResponse {
    private List<User> lastCommentingAgents;
    private Request request;

    public List<User> getLastCommentingAgents() {
        return C23408a.m57526a(this.lastCommentingAgents);
    }

    public Request getRequest() {
        return this.request;
    }
}
