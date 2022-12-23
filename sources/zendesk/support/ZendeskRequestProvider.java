package zendesk.support;

import com.zendesk.logger.Logger;
import fe0.C23341a;
import fe0.C23345c;
import ge0.C23408a;
import ge0.C23410c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p019b0.C1425b;
import zendesk.core.AnonymousIdentity;
import zendesk.core.AuthenticationProvider;
import zendesk.core.AuthenticationType;
import zendesk.core.Identity;

final class ZendeskRequestProvider implements RequestProvider {
    private static final String ALL_REQUEST_STATUSES = "new,open,pending,hold,solved,closed";
    private static final String GET_REQUESTS_SIDE_LOAD = "public_updated_at,last_commenting_agents,last_comment,first_comment";
    private static final String LOG_TAG = "ZendeskRequestProvider";
    private static final int MAX_TICKET_FIELDS = 5;
    /* access modifiers changed from: private */
    public final AuthenticationProvider authenticationProvider;
    /* access modifiers changed from: private */
    public final SupportBlipsProvider blipsProvider;
    /* access modifiers changed from: private */
    public final SupportSdkMetadata metadata;
    /* access modifiers changed from: private */
    public final ZendeskRequestService requestService;
    /* access modifiers changed from: private */
    public final RequestSessionCache requestSessionCache;
    /* access modifiers changed from: private */
    public final RequestStorage requestStorage;
    private final SupportSettingsProvider settingsProvider;
    /* access modifiers changed from: private */
    public final ZendeskTracker zendeskTracker;

    public ZendeskRequestProvider(SupportSettingsProvider supportSettingsProvider, ZendeskRequestService zendeskRequestService, AuthenticationProvider authenticationProvider2, RequestStorage requestStorage2, RequestSessionCache requestSessionCache2, ZendeskTracker zendeskTracker2, SupportSdkMetadata supportSdkMetadata, SupportBlipsProvider supportBlipsProvider) {
        this.settingsProvider = supportSettingsProvider;
        this.requestService = zendeskRequestService;
        this.authenticationProvider = authenticationProvider2;
        this.requestStorage = requestStorage2;
        this.requestSessionCache = requestSessionCache2;
        this.zendeskTracker = zendeskTracker2;
        this.metadata = supportSdkMetadata;
        this.blipsProvider = supportBlipsProvider;
    }

    /* access modifiers changed from: private */
    public void addCommentInternal(final String str, EndUserComment endUserComment, final C23345c<Comment> cVar) {
        this.requestService.addComment(str, endUserComment, new ZendeskCallbackSuccess<Request>(cVar) {
            public void onSuccess(Request request) {
                ZendeskRequestProvider.this.zendeskTracker.requestUpdated();
                ZendeskRequestProvider.this.blipsProvider.requestUpdated(str);
                if (request.getId() == null || request.getCommentCount() == null) {
                    Logger.m57306e("The ID and / or comment count was missing. Cannot store comment totalUpdates.", new Object[0]);
                } else {
                    ZendeskRequestProvider.this.requestStorage.updateRequestData(Collections.singletonList(request));
                }
                C23345c cVar = cVar;
                if (cVar != null) {
                    cVar.onSuccess(request.getLastComment());
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void addServerTags(CreateRequest createRequest, SupportSdkSettings supportSdkSettings) {
        List[] listArr = {createRequest.getTags(), supportSdkSettings.getContactZendeskTags()};
        ArrayList arrayList = new ArrayList();
        Iterator it = new CopyOnWriteArrayList(listArr).iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            if (C23408a.m57530e(list)) {
                Iterator it2 = new CopyOnWriteArrayList(list).iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
            }
        }
        if (C23408a.m57530e(arrayList)) {
            Logger.m57302a("Adding tags to feedback...", new Object[0]);
            createRequest.setTags(arrayList);
        }
    }

    /* access modifiers changed from: private */
    public static void answerCallbackOnConversationsDisabled(C23345c cVar) {
        Logger.m57302a("Conversations disabled, this feature is not available on your plan or was disabled.", new Object[0]);
        if (cVar != null) {
            cVar.onError(new C1425b("Access Denied"));
        }
    }

    /* access modifiers changed from: private */
    public static boolean areConversationsEnabled(SupportSdkSettings supportSdkSettings) {
        if (supportSdkSettings == null) {
            return false;
        }
        return supportSdkSettings.isConversationsEnabled();
    }

    /* access modifiers changed from: private */
    public static RequestUpdates calcRequestUpdates(List<RequestData> list) {
        HashMap hashMap = new HashMap(list.size());
        for (RequestData next : list) {
            int unreadComments = next.unreadComments();
            if (unreadComments != 0) {
                hashMap.put(next.getId(), Integer.valueOf(unreadComments));
            }
        }
        return new RequestUpdates(hashMap);
    }

    /* access modifiers changed from: private */
    public static List<TicketForm> convertTicketFormResponse(List<RawTicketForm> list, List<RawTicketField> list2) {
        ArrayList arrayList = new ArrayList();
        Map<Long, TicketField> createTicketFieldMap = createTicketFieldMap(list2);
        for (RawTicketForm createTicketFormFromResponse : list) {
            arrayList.add(createTicketFormFromResponse(createTicketFormFromResponse, createTicketFieldMap));
        }
        return arrayList;
    }

    private static Map<Long, TicketField> createTicketFieldMap(List<RawTicketField> list) {
        HashMap hashMap = new HashMap(list.size());
        for (RawTicketField next : list) {
            hashMap.put(Long.valueOf(next.getId()), TicketField.create(next));
        }
        return hashMap;
    }

    private static TicketForm createTicketFormFromResponse(RawTicketForm rawTicketForm, Map<Long, TicketField> map) {
        ArrayList arrayList = new ArrayList();
        for (Long next : rawTicketForm.getTicketFieldIds()) {
            if (!(next == null || map.get(next) == null)) {
                arrayList.add(map.get(next));
            }
        }
        return RawTicketForm.create(rawTicketForm, arrayList);
    }

    /* access modifiers changed from: private */
    public void getAllRequestsInternal(String str, AuthenticationType authenticationType, final C23345c<List<Request>> cVar) {
        if (C23410c.m57534b(str)) {
            str = ALL_REQUEST_STATUSES;
        }
        C254163 r0 = new ZendeskCallbackSuccess<List<Request>>(cVar) {
            public void onSuccess(List<Request> list) {
                ZendeskRequestProvider.this.requestStorage.updateRequestData(list);
                C23345c cVar = cVar;
                if (cVar != null) {
                    cVar.onSuccess(list);
                }
            }
        };
        if (authenticationType == AuthenticationType.ANONYMOUS) {
            List<RequestData> requestData = this.requestStorage.getRequestData();
            ArrayList arrayList = new ArrayList(requestData.size());
            for (RequestData id : requestData) {
                arrayList.add(id.getId());
            }
            if (C23408a.m57529d(arrayList)) {
                Logger.m57306e("getAllRequestsInternal: There are no requests to fetch", new Object[0]);
                if (cVar != null) {
                    cVar.onSuccess(new ArrayList());
                    return;
                }
                return;
            }
            this.requestService.getAllRequests(C23410c.m57535c(arrayList), str, GET_REQUESTS_SIDE_LOAD, r0);
            return;
        }
        this.requestService.getAllRequests(str, GET_REQUESTS_SIDE_LOAD, r0);
    }

    /* access modifiers changed from: private */
    public void internalCreateRequest(CreateRequest createRequest, AuthenticationType authenticationType, Identity identity, final C23345c<Request> cVar) {
        C254152 r0 = new ZendeskCallbackSuccess<Request>(cVar) {
            public void onSuccess(Request request) {
                if (request.getId() == null) {
                    onError(new C1425b("The request was created, but the ID is unknown."));
                    return;
                }
                ZendeskRequestProvider.this.zendeskTracker.requestCreated();
                ZendeskRequestProvider.this.blipsProvider.requestCreated(request.getId());
                ZendeskRequestProvider.this.requestStorage.updateRequestData(Collections.singletonList(request));
                C23345c cVar = cVar;
                if (cVar != null) {
                    cVar.onSuccess(request);
                }
            }
        };
        if (authenticationType != AuthenticationType.ANONYMOUS || identity == null || !(identity instanceof AnonymousIdentity)) {
            this.requestService.createRequest((String) null, createRequest, r0);
            return;
        }
        this.requestService.createRequest(((AnonymousIdentity) identity).getSdkGuid(), createRequest, r0);
    }

    public void addComment(String str, EndUserComment endUserComment, C23345c<Comment> cVar) {
        final String str2 = str;
        final EndUserComment endUserComment2 = endUserComment;
        final C23345c<Comment> cVar2 = cVar;
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.addCommentInternal(str2, endUserComment2, cVar2);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(cVar2);
                }
            }
        });
    }

    public void createRequest(final CreateRequest createRequest, final C23345c<Request> cVar) {
        boolean z;
        if (createRequest == null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            Logger.m57303b("configuration is invalid: request null", new Object[0]);
            if (cVar != null) {
                cVar.onError(new C1425b("configuration is invalid: request null"));
                return;
            }
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                createRequest.setMetadata(ZendeskRequestProvider.this.metadata.getDeviceInfoAsMapForMetaData());
                ZendeskRequestProvider.this.addServerTags(createRequest, supportSdkSettings);
                ZendeskRequestProvider.this.internalCreateRequest(createRequest, supportSdkSettings.getAuthenticationType(), ZendeskRequestProvider.this.authenticationProvider.getIdentity(), cVar);
            }
        });
    }

    public void getAllRequests(C23345c<List<Request>> cVar) {
        getRequests((String) null, cVar);
    }

    public void getComments(final String str, final C23345c<CommentsResponse> cVar) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.requestService.getComments(str, cVar);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(cVar);
                }
            }
        });
    }

    public void getCommentsSince(String str, Date date, boolean z, C23345c<CommentsResponse> cVar) {
        final String str2 = str;
        final Date date2 = date;
        final boolean z2 = z;
        final C23345c<CommentsResponse> cVar2 = cVar;
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.requestService.getCommentsSince(str2, date2, z2, cVar2);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(cVar2);
                }
            }
        });
    }

    public void getRequest(final String str, final C23345c<Request> cVar) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.requestService.getRequest(str, ZendeskRequestProvider.GET_REQUESTS_SIDE_LOAD, cVar);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(cVar);
                }
            }
        });
    }

    public void getRequests(final String str, final C23345c<List<Request>> cVar) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.getAllRequestsInternal(str, supportSdkSettings.getAuthenticationType(), cVar);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(cVar);
                }
            }
        });
    }

    public void getTicketFormsById(List<Long> list, final C23345c<List<TicketForm>> cVar) {
        if (!C23408a.m57529d(list)) {
            final ArrayList arrayList = new ArrayList();
            if (list.size() > 5) {
                arrayList.addAll(list.subList(0, 5));
                Logger.m57302a("Maximum number of allowed ticket fields: %d.", 5);
            } else {
                arrayList.addAll(list);
            }
            if (!this.requestSessionCache.containsAllTicketForms(arrayList)) {
                this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
                    public void onSuccess(SupportSdkSettings supportSdkSettings) {
                        if (supportSdkSettings.isTicketFormSupportAvailable()) {
                            ZendeskRequestProvider.this.requestService.getTicketFormsById(C23410c.m57537e(arrayList), new ZendeskCallbackSuccess<RawTicketFormResponse>(cVar) {
                                public void onSuccess(RawTicketFormResponse rawTicketFormResponse) {
                                    List access$1200 = ZendeskRequestProvider.convertTicketFormResponse(rawTicketFormResponse.getTicketForms(), rawTicketFormResponse.getTicketFields());
                                    ZendeskRequestProvider.this.requestSessionCache.updateTicketFormCache(access$1200);
                                    C23345c cVar = cVar;
                                    if (cVar != null) {
                                        cVar.onSuccess(access$1200);
                                    }
                                }
                            });
                            return;
                        }
                        C23345c cVar = cVar;
                        if (cVar != null) {
                            cVar.onError(new C1425b("Ticket form support disabled."));
                        }
                    }
                });
            } else if (cVar != null) {
                cVar.onSuccess(this.requestSessionCache.getTicketFormsById(arrayList));
            }
        } else if (cVar != null) {
            cVar.onError(new C1425b("Ticket forms must at least contain 1 Id"));
        }
    }

    public void getUpdatesForDevice(final C23345c<RequestUpdates> cVar) {
        if (!this.requestStorage.isRequestDataExpired()) {
            cVar.onSuccess(calcRequestUpdates(this.requestStorage.getRequestData()));
        } else {
            this.settingsProvider.getSettings(new C23345c<SupportSdkSettings>() {
                public void onError(C23341a aVar) {
                    cVar.onError(aVar);
                }

                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!supportSdkSettings.isConversationsEnabled()) {
                        ZendeskRequestProvider.answerCallbackOnConversationsDisabled(cVar);
                    } else {
                        ZendeskRequestProvider.this.getAllRequestsInternal((String) null, supportSdkSettings.getAuthenticationType(), new ZendeskCallbackSuccess<List<Request>>(cVar) {
                            public void onSuccess(List<Request> list) {
                                cVar.onSuccess(ZendeskRequestProvider.calcRequestUpdates(ZendeskRequestProvider.this.requestStorage.getRequestData()));
                            }
                        });
                    }
                }
            });
        }
    }

    public void markRequestAsRead(String str, int i) {
        this.requestStorage.markRequestAsRead(str, i);
    }

    public void markRequestAsUnread(String str) {
        this.requestStorage.markRequestAsUnread(str);
    }
}
