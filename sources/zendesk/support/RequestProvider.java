package zendesk.support;

import fe0.C23345c;
import java.util.Date;
import java.util.List;

public interface RequestProvider {
    void addComment(String str, EndUserComment endUserComment, C23345c<Comment> cVar);

    void createRequest(CreateRequest createRequest, C23345c<Request> cVar);

    void getAllRequests(C23345c<List<Request>> cVar);

    void getComments(String str, C23345c<CommentsResponse> cVar);

    void getCommentsSince(String str, Date date, boolean z, C23345c<CommentsResponse> cVar);

    void getRequest(String str, C23345c<Request> cVar);

    void getRequests(String str, C23345c<List<Request>> cVar);

    void getTicketFormsById(List<Long> list, C23345c<List<TicketForm>> cVar);

    void getUpdatesForDevice(C23345c<RequestUpdates> cVar);

    void markRequestAsRead(String str, int i);

    void markRequestAsUnread(String str);
}
