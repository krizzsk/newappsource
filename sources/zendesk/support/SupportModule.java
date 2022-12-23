package zendesk.support;

import hi0.C23566v;
import java.util.UUID;

public class SupportModule {
    private final ArticleVoteStorage articleVoteStorage;
    private final SupportBlipsProvider blipsProvider;
    private final HelpCenterProvider helpCenterProvider;

    /* renamed from: id */
    private final UUID f63728id = UUID.randomUUID();
    private final C23566v okHttpClient;
    private final RequestProvider requestProvider;
    private final SupportSettingsProvider settingsProvider;
    private final UploadProvider uploadProvider;
    private final ZendeskTracker zendeskTracker;

    public SupportModule(RequestProvider requestProvider2, UploadProvider uploadProvider2, HelpCenterProvider helpCenterProvider2, SupportSettingsProvider supportSettingsProvider, SupportBlipsProvider supportBlipsProvider, C23566v vVar, ZendeskTracker zendeskTracker2, ArticleVoteStorage articleVoteStorage2) {
        this.requestProvider = requestProvider2;
        this.uploadProvider = uploadProvider2;
        this.helpCenterProvider = helpCenterProvider2;
        this.settingsProvider = supportSettingsProvider;
        this.blipsProvider = supportBlipsProvider;
        this.okHttpClient = vVar;
        this.zendeskTracker = zendeskTracker2;
        this.articleVoteStorage = articleVoteStorage2;
    }

    public UUID getId() {
        return this.f63728id;
    }

    public ArticleVoteStorage providesArticleVoteStorage() {
        return this.articleVoteStorage;
    }

    public SupportBlipsProvider providesBlipsProvider() {
        return this.blipsProvider;
    }

    public HelpCenterProvider providesHelpCenterProvider() {
        return this.helpCenterProvider;
    }

    public C23566v providesOkHttpClient() {
        return this.okHttpClient;
    }

    public RequestProvider providesRequestProvider() {
        return this.requestProvider;
    }

    public SupportSettingsProvider providesSettingsProvider() {
        return this.settingsProvider;
    }

    public UploadProvider providesUploadProvider() {
        return this.uploadProvider;
    }

    public ZendeskTracker providesZendeskTracker() {
        return this.zendeskTracker;
    }
}
