package zendesk.support;

import ge0.C23408a;
import java.util.List;

class RequestsResponse extends ResponseWrapper {
    private List<User> lastCommentingAgents;
    private List<Request> requests;

    public List<User> getLastCommentingAgents() {
        return C23408a.m57526a(this.lastCommentingAgents);
    }

    public List<Request> getRequests() {
        return C23408a.m57526a(this.requests);
    }
}
