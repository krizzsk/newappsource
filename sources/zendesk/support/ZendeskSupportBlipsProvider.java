package zendesk.support;

import ge0.C23409b;
import ge0.C23410c;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p001a0.C0016g;
import zendesk.core.BlipsGroup;
import zendesk.core.BlipsProvider;
import zendesk.core.PageView;
import zendesk.core.UserAction;

class ZendeskSupportBlipsProvider implements SupportBlipsProvider {
    private static final String BLIPS_FIELD_NAME_ARTICLE_ID = "articleId";
    private static final String BLIPS_FIELD_NAME_CODE = "code";
    private static final String BLIPS_FIELD_NAME_QUERY = "query";
    private static final String BLIPS_FIELD_NAME_REQUEST_ID = "requestId";
    private static final String BLIPS_FIELD_NAME_VOTE = "vote";
    private static final String BLIPS_FIELD_VALUE_CODE = "java";
    private static final String BLIPS_SUPPORT_ACTION_INIT = "init";
    private static final String BLIPS_SUPPORT_ACTION_REQUEST_CREATED = "requestCreated";
    private static final String BLIPS_SUPPORT_ACTION_REQUEST_LIST_VIEWED = "requestListViewed";
    private static final String BLIPS_SUPPORT_ACTION_REQUEST_UPDATED = "requestUpdated";
    private static final String BLIPS_SUPPORT_ACTION_REQUEST_VIEWED = "requestViewed";
    private static final String BLIPS_SUPPORT_ACTION_SEARCH = "search";
    private static final String BLIPS_SUPPORT_ACTION_VOTE = "articleVote";
    private static final String BLIPS_SUPPORT_CATEGORY = "SupportSDK";
    private static final String BLIPS_SUPPORT_CHANNEL = "support_sdk";
    private static final String BLIPS_SUPPORT_LABEL_HELP_CENTER = "helpCenterForm";
    private static final String BLIPS_SUPPORT_VERSION = "3.0.2";
    private BlipsProvider blipsProvider;
    private Locale locale;

    public ZendeskSupportBlipsProvider(BlipsProvider blipsProvider2, Locale locale2) {
        this.blipsProvider = blipsProvider2;
        this.locale = locale2;
    }

    private void sendUserAction(BlipsGroup blipsGroup, String str, String str2, Map<String, Object> map) {
        this.blipsProvider.sendBlip(new UserAction(BLIPS_SUPPORT_VERSION, BLIPS_SUPPORT_CHANNEL, BLIPS_SUPPORT_CATEGORY, str, str2, map), blipsGroup);
    }

    public void articleView(Article article) {
        if (article != null) {
            String htmlUrl = article.getHtmlUrl();
            String title = article.getTitle();
            boolean z = false;
            String[] strArr = {htmlUrl, title};
            HashMap hashMap = C23410c.f59193a;
            int i = 0;
            while (true) {
                if (i >= 2) {
                    z = true;
                    break;
                } else if (C23410c.m57534b(strArr[i])) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                this.blipsProvider.sendBlip(new PageView(BLIPS_SUPPORT_VERSION, BLIPS_SUPPORT_CHANNEL, htmlUrl, C23409b.m57532b(this.locale), title, C0016g.m37u(BLIPS_FIELD_NAME_CODE, BLIPS_FIELD_VALUE_CODE)), BlipsGroup.PATHFINDER);
            }
        }
    }

    public void articleVote(Long l, int i) {
        if (l != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(BLIPS_FIELD_NAME_ARTICLE_ID, l);
            hashMap.put(BLIPS_FIELD_NAME_VOTE, Integer.valueOf(i));
            sendUserAction(BlipsGroup.BEHAVIOURAL, BLIPS_SUPPORT_ACTION_VOTE, hashMap);
        }
    }

    public void helpCenterSearch(String str) {
        if (C23410c.m57533a(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("query", str);
            hashMap.put(BLIPS_FIELD_NAME_CODE, BLIPS_FIELD_VALUE_CODE);
            sendUserAction(BlipsGroup.PATHFINDER, BLIPS_SUPPORT_ACTION_SEARCH, BLIPS_SUPPORT_LABEL_HELP_CENTER, hashMap);
        }
    }

    public void requestCreated(String str) {
        if (!C23410c.m57534b(str)) {
            sendUserAction(BlipsGroup.BEHAVIOURAL, BLIPS_SUPPORT_ACTION_REQUEST_CREATED, C0016g.m37u(BLIPS_FIELD_NAME_REQUEST_ID, str));
        }
    }

    public void requestListViewed() {
        sendUserAction(BlipsGroup.BEHAVIOURAL, BLIPS_SUPPORT_ACTION_REQUEST_LIST_VIEWED);
    }

    public void requestUpdated(String str) {
        if (!C23410c.m57534b(str)) {
            sendUserAction(BlipsGroup.BEHAVIOURAL, BLIPS_SUPPORT_ACTION_REQUEST_UPDATED, C0016g.m37u(BLIPS_FIELD_NAME_REQUEST_ID, str));
        }
    }

    public void requestViewed(String str) {
        if (!C23410c.m57534b(str)) {
            sendUserAction(BlipsGroup.BEHAVIOURAL, BLIPS_SUPPORT_ACTION_REQUEST_VIEWED, C0016g.m37u(BLIPS_FIELD_NAME_REQUEST_ID, str));
        }
    }

    public void supportSdkInit() {
        sendUserAction(BlipsGroup.REQUIRED, BLIPS_SUPPORT_ACTION_INIT);
    }

    private void sendUserAction(BlipsGroup blipsGroup, String str, Map<String, Object> map) {
        sendUserAction(blipsGroup, str, (String) null, map);
    }

    private void sendUserAction(BlipsGroup blipsGroup, String str) {
        sendUserAction(blipsGroup, str, (String) null, (Map<String, Object>) null);
    }
}
