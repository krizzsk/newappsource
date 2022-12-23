package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;

public final class SupportModule_ProvidesArticleVoteStorageFactory implements C23588c<ArticleVoteStorage> {
    private final SupportModule module;

    public SupportModule_ProvidesArticleVoteStorageFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesArticleVoteStorageFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesArticleVoteStorageFactory(supportModule);
    }

    public static ArticleVoteStorage providesArticleVoteStorage(SupportModule supportModule) {
        ArticleVoteStorage providesArticleVoteStorage = supportModule.providesArticleVoteStorage();
        C13641g.m34117e(providesArticleVoteStorage);
        return providesArticleVoteStorage;
    }

    public ArticleVoteStorage get() {
        return providesArticleVoteStorage(this.module);
    }
}
