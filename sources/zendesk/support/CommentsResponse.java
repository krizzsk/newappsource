package zendesk.support;

import ge0.C23408a;
import java.util.List;

public class CommentsResponse extends ResponseWrapper {
    private List<CommentResponse> comments;
    private List<Organization> organizations;
    private List<User> users;

    public List<CommentResponse> getComments() {
        return C23408a.m57526a(this.comments);
    }

    public List<Organization> getOrganizations() {
        return C23408a.m57526a(this.organizations);
    }

    public List<User> getUsers() {
        return C23408a.m57526a(this.users);
    }
}
