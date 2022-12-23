package zendesk.support;

import ck0.C21226b;
import ek0.C23317a;
import ek0.C23322f;
import ek0.C23325i;
import ek0.C23331o;
import ek0.C23332p;
import ek0.C23335s;
import ek0.C23336t;

interface RequestService {
    @C23332p("/api/mobile/requests/{id}.json?include=last_comment")
    C21226b<RequestResponse> addComment(@C23335s("id") String str, @C23317a UpdateRequestWrapper updateRequestWrapper);

    @C23331o("/api/mobile/requests.json?include=last_comment")
    C21226b<RequestResponse> createRequest(@C23325i("Mobile-Sdk-Identity") String str, @C23317a CreateRequestWrapper createRequestWrapper);

    @C23322f("/api/mobile/requests.json?sort_by=updated_at&sort_order=desc")
    C21226b<RequestsResponse> getAllRequests(@C23336t("status") String str, @C23336t("include") String str2);

    @C23322f("/api/mobile/requests/{id}/comments.json?sort_order=desc")
    C21226b<CommentsResponse> getComments(@C23335s("id") String str);

    @C23322f("/api/mobile/requests/{id}/comments.json?sort_order=desc")
    C21226b<CommentsResponse> getCommentsSince(@C23335s("id") String str, @C23336t("since") String str2, @C23336t("role") String str3);

    @C23322f("/api/mobile/requests/show_many.json?sort_order=desc")
    C21226b<RequestsResponse> getManyRequests(@C23336t("tokens") String str, @C23336t("status") String str2, @C23336t("include") String str3);

    @C23322f("/api/mobile/requests/{id}.json")
    C21226b<RequestResponse> getRequest(@C23335s("id") String str, @C23336t("include") String str2);

    @C23322f("/api/v2/ticket_forms/show_many.json?active=true")
    C21226b<RawTicketFormResponse> getTicketFormsById(@C23336t("ids") String str, @C23336t("include") String str2);
}
