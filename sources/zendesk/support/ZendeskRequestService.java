package zendesk.support;

import com.amazonaws.util.DateUtils;
import fe0.C23342b;
import fe0.C23345c;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p988j$.util.DesugarTimeZone;

class ZendeskRequestService {
    private static final String LOG_TAG = "ZendeskRequestService";
    private static final String ROLE_AGENT = "agent";
    private static final String ROLE_USER = "end_user";
    private static final String TICKET_FIELDS_INCLUDE = "ticket_fields";
    private final DateFormat iso8601;
    private final C23342b.C23344b<RequestResponse, Request> requestExtractor = new C23342b.C23344b<RequestResponse, Request>() {
        public Request extract(RequestResponse requestResponse) {
            return ZendeskRequestService.updateLastCommentingAgents(requestResponse.getRequest(), ZendeskRequestService.getAgentMap(requestResponse.getLastCommentingAgents()));
        }
    };
    private final RequestService requestService;
    private final C23342b.C23344b<RequestsResponse, List<Request>> requestsExtractor = new C23342b.C23344b<RequestsResponse, List<Request>>() {
        public List<Request> extract(RequestsResponse requestsResponse) {
            Map access$000 = ZendeskRequestService.getAgentMap(requestsResponse.getLastCommentingAgents());
            ArrayList arrayList = new ArrayList();
            for (Request access$100 : requestsResponse.getRequests()) {
                arrayList.add(ZendeskRequestService.updateLastCommentingAgents(access$100, access$000));
            }
            return arrayList;
        }
    };

    public ZendeskRequestService(RequestService requestService2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.ALTERNATE_ISO8601_DATE_PATTERN, Locale.US);
        this.iso8601 = simpleDateFormat;
        this.requestService = requestService2;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    /* access modifiers changed from: private */
    public static Map<Long, User> getAgentMap(List<User> list) {
        HashMap hashMap = new HashMap(list.size());
        for (User next : list) {
            hashMap.put(next.getId(), new User(next.getId(), next.getName(), next.getPhoto(), true, -1L, (List<String>) null, (Map<String, String>) null));
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static Request updateLastCommentingAgents(Request request, Map<Long, User> map) {
        ArrayList arrayList = new ArrayList(request.getLastCommentingAgentsIds().size());
        for (Long l : request.getLastCommentingAgentsIds()) {
            arrayList.add(map.get(l));
        }
        request.setLastCommentingAgents(arrayList);
        return request;
    }

    public void addComment(String str, EndUserComment endUserComment, C23345c<Request> cVar) {
        UpdateRequestWrapper updateRequestWrapper = new UpdateRequestWrapper();
        Request request = new Request();
        request.setComment(endUserComment);
        updateRequestWrapper.setRequest(request);
        this.requestService.addComment(str, updateRequestWrapper).mo53585K0(new C23342b(cVar, new C23342b.C23344b<RequestResponse, Request>() {
            public Request extract(RequestResponse requestResponse) {
                return requestResponse.getRequest();
            }
        }));
    }

    public void createRequest(String str, CreateRequest createRequest, C23345c<Request> cVar) {
        CreateRequestWrapper createRequestWrapper = new CreateRequestWrapper();
        createRequestWrapper.setRequest(createRequest);
        this.requestService.createRequest(str, createRequestWrapper).mo53585K0(new C23342b(cVar, new C23342b.C23344b<RequestResponse, Request>() {
            public Request extract(RequestResponse requestResponse) {
                return requestResponse.getRequest();
            }
        }));
    }

    public void getAllRequests(String str, String str2, C23345c<List<Request>> cVar) {
        this.requestService.getAllRequests(str, str2).mo53585K0(new C23342b(cVar, this.requestsExtractor));
    }

    public void getComments(String str, C23345c<CommentsResponse> cVar) {
        this.requestService.getComments(str).mo53585K0(new C23342b(cVar));
    }

    public void getCommentsSince(String str, Date date, boolean z, C23345c<CommentsResponse> cVar) {
        String str2;
        String format = this.iso8601.format(date);
        if (z) {
            str2 = ROLE_AGENT;
        } else {
            str2 = null;
        }
        this.requestService.getCommentsSince(str, format, str2).mo53585K0(new C23342b(cVar));
    }

    public void getRequest(String str, String str2, C23345c<Request> cVar) {
        this.requestService.getRequest(str, str2).mo53585K0(new C23342b(cVar, this.requestExtractor));
    }

    public void getTicketFormsById(String str, C23345c<RawTicketFormResponse> cVar) {
        this.requestService.getTicketFormsById(str, TICKET_FIELDS_INCLUDE).mo53585K0(new C23342b(cVar));
    }

    public void getAllRequests(String str, String str2, String str3, C23345c<List<Request>> cVar) {
        this.requestService.getManyRequests(str, str2, str3).mo53585K0(new C23342b(cVar, this.requestsExtractor));
    }
}
