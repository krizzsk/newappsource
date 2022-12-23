package zendesk.support;

import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;
import zendesk.core.SessionStorage;

public final class StorageModule_ProvideArticleVoteStorageFactory implements C23588c<ArticleVoteStorage> {
    private final C25292a<SessionStorage> baseStorageProvider;
    private final StorageModule module;

    public StorageModule_ProvideArticleVoteStorageFactory(StorageModule storageModule, C25292a<SessionStorage> aVar) {
        this.module = storageModule;
        this.baseStorageProvider = aVar;
    }

    public static StorageModule_ProvideArticleVoteStorageFactory create(StorageModule storageModule, C25292a<SessionStorage> aVar) {
        return new StorageModule_ProvideArticleVoteStorageFactory(storageModule, aVar);
    }

    public static ArticleVoteStorage provideArticleVoteStorage(StorageModule storageModule, SessionStorage sessionStorage) {
        ArticleVoteStorage provideArticleVoteStorage = storageModule.provideArticleVoteStorage(sessionStorage);
        C13641g.m34117e(provideArticleVoteStorage);
        return provideArticleVoteStorage;
    }

    public ArticleVoteStorage get() {
        return provideArticleVoteStorage(this.module, this.baseStorageProvider.get());
    }
}
