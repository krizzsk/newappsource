package zendesk.support;

import android.annotation.SuppressLint;
import com.zendesk.logger.Logger;
import fe0.C23341a;
import fe0.C23345c;
import ge0.C23408a;
import ge0.C23409b;
import ge0.C23410c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import p019b0.C1425b;

class ZendeskHelpCenterProvider implements HelpCenterProvider {
    private static final String EMPTY_JSON_BODY = "{}";
    private static final String LOG_TAG = "ZendeskHelpCenterProvider";
    /* access modifiers changed from: private */
    public final SupportBlipsProvider blipsProvider;
    /* access modifiers changed from: private */
    public final ZendeskHelpCenterService helpCenterService;
    /* access modifiers changed from: private */
    public final HelpCenterSessionCache helpCenterSessionCache;
    private final SupportSettingsProvider settingsProvider;
    /* access modifiers changed from: private */
    public final ZendeskTracker zendeskTracker;

    public ZendeskHelpCenterProvider(SupportSettingsProvider supportSettingsProvider, SupportBlipsProvider supportBlipsProvider, ZendeskHelpCenterService zendeskHelpCenterService, HelpCenterSessionCache helpCenterSessionCache2, ZendeskTracker zendeskTracker2) {
        this.settingsProvider = supportSettingsProvider;
        this.blipsProvider = supportBlipsProvider;
        this.helpCenterService = zendeskHelpCenterService;
        this.helpCenterSessionCache = helpCenterSessionCache2;
        this.zendeskTracker = zendeskTracker2;
    }

    /* access modifiers changed from: private */
    public boolean checkSettingsAndVotingEnabled(C23345c<?> cVar, SupportSdkSettings supportSdkSettings) {
        if (!sanityCheckHelpCenterSettings(cVar, supportSdkSettings)) {
            if (supportSdkSettings.isHelpCenterArticleVotingEnabled()) {
                return true;
            }
            Logger.m57303b("Help Center voting is disabled in your app's settings. Can not continue with the call", new Object[0]);
            if (cVar != null) {
                cVar.onError(new C1425b("Help Center voting is disabled in your app's settings. Can not continue with the call"));
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public List<HelpItem> convert(HelpResponse helpResponse) {
        if (helpResponse == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (CategoryItem next : helpResponse.getCategories()) {
            arrayList.add(next);
            for (SectionItem next2 : next.getSections()) {
                arrayList.add(next2);
                arrayList.addAll(next2.getChildren());
            }
        }
        return arrayList;
    }

    @SuppressLint({"UseSparseArrays"})
    public List<FlatArticle> asFlatArticleList(ArticlesResponse articlesResponse) {
        List list;
        if (articlesResponse == null) {
            return new ArrayList();
        }
        List<Category> categories = articlesResponse.getCategories();
        List<Section> sections = articlesResponse.getSections();
        List<Article> articles = articlesResponse.getArticles();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (C23408a.m57530e(articles)) {
            for (Category next : categories) {
                hashMap.put(next.getId(), next);
            }
            for (Section next2 : sections) {
                hashMap2.put(next2.getId(), next2);
            }
            for (Article next3 : articles) {
                Section section = (Section) hashMap2.get(next3.getSectionId());
                arrayList.add(new FlatArticle((Category) hashMap.get(section.getCategoryId()), section, next3));
            }
            list = arrayList;
        } else {
            Logger.m57302a("There are no articles contained in this account", new Object[0]);
            list = Collections.emptyList();
        }
        Collections.sort(list);
        return list;
    }

    @SuppressLint({"UseSparseArrays"})
    public List<SearchArticle> asSearchArticleList(ArticlesResponse articlesResponse) {
        Section section;
        ArrayList arrayList = new ArrayList();
        if (articlesResponse == null) {
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        List<Type> c = C23408a.m57528c(articlesResponse.getArticles());
        List<Type> c2 = C23408a.m57528c(articlesResponse.getSections());
        List<Type> c3 = C23408a.m57528c(articlesResponse.getCategories());
        List<Type> c4 = C23408a.m57528c(articlesResponse.getUsers());
        for (Type type : c2) {
            if (type.getId() != null) {
                hashMap.put(type.getId(), type);
            }
        }
        for (Type type2 : c3) {
            if (type2.getId() != null) {
                hashMap2.put(type2.getId(), type2);
            }
        }
        for (Type type3 : c4) {
            if (type3.getId() != null) {
                hashMap3.put(type3.getId(), type3);
            }
        }
        for (Type type4 : c) {
            Category category = null;
            if (type4.getSectionId() != null) {
                section = (Section) hashMap.get(type4.getSectionId());
            } else {
                Logger.m57306e("Unable to determine section as section id was null.", new Object[0]);
                section = null;
            }
            if (section == null || section.getCategoryId() == null) {
                Logger.m57306e("Unable to determine category as section was null.", new Object[0]);
            } else {
                category = (Category) hashMap2.get(section.getCategoryId());
            }
            if (type4.getAuthorId() != null) {
                type4.setAuthor((User) hashMap3.get(type4.getAuthorId()));
            } else {
                Logger.m57306e("Unable to determine author as author id was null.", new Object[0]);
            }
            arrayList.add(new SearchArticle(type4, section, category));
        }
        return arrayList;
    }

    public void deleteVote(final Long l, final C23345c<Void> cVar) {
        if (!sanityCheck(cVar, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (ZendeskHelpCenterProvider.this.checkSettingsAndVotingEnabled(cVar, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.deleteVote(l, new ZendeskCallbackSuccess<Void>(cVar) {
                            public void onSuccess(Void voidR) {
                                C23345c cVar = cVar;
                                if (cVar != null) {
                                    cVar.onSuccess(voidR);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void downvoteArticle(final Long l, final C23345c<ArticleVote> cVar) {
        if (!sanityCheck(cVar, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (ZendeskHelpCenterProvider.this.checkSettingsAndVotingEnabled(cVar, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.downvoteArticle(l, ZendeskHelpCenterProvider.EMPTY_JSON_BODY, new ZendeskCallbackSuccess<ArticleVoteResponse>(cVar) {
                            public void onSuccess(ArticleVoteResponse articleVoteResponse) {
                                C23345c cVar = cVar;
                                if (cVar != null) {
                                    cVar.onSuccess(articleVoteResponse.getVote());
                                }
                                ZendeskHelpCenterProvider.this.blipsProvider.articleVote(l, -1);
                            }
                        });
                    }
                }
            });
        }
    }

    public void getArticle(final Long l, final C23345c<Article> cVar) {
        if (!sanityCheck(cVar, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(cVar, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getArticle(l, ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings), "users", new ZendeskCallbackSuccess<Article>(cVar) {
                            public void onSuccess(Article article) {
                                ZendeskHelpCenterProvider.this.submitRecordArticleView(article, C23409b.m57531a(article.getLocale()), new C23345c<Void>() {
                                    public void onError(C23341a aVar) {
                                        Logger.m57303b("Error submitting Help Center reporting: [reason] %s [isNetworkError] %s [status] %d", aVar.mo2080b(), Boolean.valueOf(aVar.mo2079a()), Integer.valueOf(aVar.getStatus()));
                                    }

                                    public void onSuccess(Void voidR) {
                                    }
                                });
                                C23345c cVar = cVar;
                                if (cVar != null) {
                                    cVar.onSuccess(article);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void getArticles(Long l, C23345c<List<Article>> cVar) {
        getArticles(l, (String) null, cVar);
    }

    public void getAttachments(Long l, AttachmentType attachmentType, C23345c<List<HelpCenterAttachment>> cVar) {
        if (!sanityCheck(cVar, l, attachmentType)) {
            final C23345c<List<HelpCenterAttachment>> cVar2 = cVar;
            final Long l2 = l;
            final AttachmentType attachmentType2 = attachmentType;
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(cVar2, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getAttachments(ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings), l2, attachmentType2, cVar2);
                    }
                }
            });
        }
    }

    public void getCategories(final C23345c<List<Category>> cVar) {
        if (!sanityCheck(cVar, new Object[0])) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(cVar, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getCategories(ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings), cVar);
                    }
                }
            });
        }
    }

    public void getCategory(final Long l, final C23345c<Category> cVar) {
        if (!sanityCheck(cVar, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(cVar, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getCategoryById(l, ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings), cVar);
                    }
                }
            });
        }
    }

    public void getHelp(final HelpRequest helpRequest, final C23345c<List<HelpItem>> cVar) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(cVar, supportSdkSettings)) {
                    ZendeskHelpCenterProvider.this.helpCenterService.getHelp(ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings), helpRequest.getCategoryIds(), helpRequest.getSectionIds(), helpRequest.getIncludes(), helpRequest.getArticlesPerPageLimit(), C23410c.m57536d(helpRequest.getLabelNames()), new ZendeskCallbackSuccess<HelpResponse>(cVar) {
                        public void onSuccess(HelpResponse helpResponse) {
                            ZendeskHelpCenterProvider.this.zendeskTracker.helpCenterLoaded();
                            C253771 r0 = C253771.this;
                            C23345c cVar = cVar;
                            if (cVar != null) {
                                cVar.onSuccess(ZendeskHelpCenterProvider.this.convert(helpResponse));
                            }
                        }
                    });
                }
            }
        });
    }

    public Locale getLocale(SupportSdkSettings supportSdkSettings) {
        String str;
        Support support = Support.INSTANCE;
        if (support.getHelpCenterLocaleOverride() != null) {
            return support.getHelpCenterLocaleOverride();
        }
        if (supportSdkSettings != null) {
            str = supportSdkSettings.getHelpCenterLocale();
        } else {
            str = "";
        }
        if (C23410c.m57534b(str)) {
            return Locale.getDefault();
        }
        return C23409b.m57531a(str);
    }

    public void getSection(final Long l, final C23345c<Section> cVar) {
        if (!sanityCheck(cVar, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(cVar, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getSectionById(l, ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings), cVar);
                    }
                }
            });
        }
    }

    public void getSections(final Long l, final C23345c<List<Section>> cVar) {
        if (!sanityCheck(cVar, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(cVar, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getSectionsForCategory(l, ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings), cVar);
                    }
                }
            });
        }
    }

    public void getSuggestedArticles(final SuggestedArticleSearch suggestedArticleSearch, final C23345c<SuggestedArticleResponse> cVar) {
        if (!sanityCheck(cVar, suggestedArticleSearch)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    Locale locale;
                    String str;
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(cVar, supportSdkSettings)) {
                        if (suggestedArticleSearch.getLocale() == null) {
                            locale = ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings);
                        } else {
                            locale = suggestedArticleSearch.getLocale();
                        }
                        Locale locale2 = locale;
                        if (C23410c.m57534b(suggestedArticleSearch.getLabelNames())) {
                            str = null;
                        } else {
                            str = C23410c.m57536d(suggestedArticleSearch.getLabelNames());
                        }
                        ZendeskHelpCenterProvider.this.helpCenterService.getSuggestedArticles(suggestedArticleSearch.getQuery(), locale2, str, suggestedArticleSearch.getCategoryId(), suggestedArticleSearch.getSectionId(), cVar);
                    }
                }
            });
        }
    }

    public void listArticles(final ListArticleQuery listArticleQuery, final C23345c<List<SearchArticle>> cVar) {
        if (!sanityCheck(cVar, listArticleQuery)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    String str;
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(cVar, supportSdkSettings)) {
                        if (listArticleQuery.getInclude() == null) {
                            str = C23410c.m57536d("categories", "sections", "users");
                        } else {
                            str = listArticleQuery.getInclude();
                        }
                        ZendeskHelpCenterProvider.this.helpCenterService.listArticles(C23410c.m57536d(listArticleQuery.getLabelNames()), listArticleQuery.getLocale() == null ? ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings) : listArticleQuery.getLocale(), str, (listArticleQuery.getSortBy() == null ? SortBy.CREATED_AT : listArticleQuery.getSortBy()).getApiValue(), (listArticleQuery.getSortOrder() == null ? SortOrder.DESCENDING : listArticleQuery.getSortOrder()).getApiValue(), listArticleQuery.getPage(), listArticleQuery.getResultsPerPage(), new ZendeskCallbackSuccess<ArticlesListResponse>(cVar) {
                            public void onSuccess(ArticlesListResponse articlesListResponse) {
                                List<SearchArticle> asSearchArticleList = ZendeskHelpCenterProvider.this.asSearchArticleList(articlesListResponse);
                                C23345c cVar = cVar;
                                if (cVar != null) {
                                    cVar.onSuccess(asSearchArticleList);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void listArticlesFlat(final ListArticleQuery listArticleQuery, final C23345c<List<FlatArticle>> cVar) {
        if (!sanityCheck(cVar, listArticleQuery)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(cVar, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.listArticles(C23410c.m57536d(listArticleQuery.getLabelNames()), listArticleQuery.getLocale() == null ? ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings) : listArticleQuery.getLocale(), "categories,sections", (listArticleQuery.getSortBy() == null ? SortBy.CREATED_AT : listArticleQuery.getSortBy()).getApiValue(), (listArticleQuery.getSortOrder() == null ? SortOrder.DESCENDING : listArticleQuery.getSortOrder()).getApiValue(), listArticleQuery.getPage(), listArticleQuery.getResultsPerPage(), new ZendeskCallbackSuccess<ArticlesListResponse>(cVar) {
                            public void onSuccess(ArticlesListResponse articlesListResponse) {
                                List<FlatArticle> asFlatArticleList = ZendeskHelpCenterProvider.this.asFlatArticleList(articlesListResponse);
                                C23345c cVar = cVar;
                                if (cVar != null) {
                                    cVar.onSuccess(asFlatArticleList);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public boolean sanityCheck(C23345c<?> cVar, Object... objArr) {
        if (objArr != null) {
            boolean z = true;
            for (Object obj : objArr) {
                if (obj == null) {
                    z = false;
                }
            }
            if (!z) {
                Logger.m57303b("One or more provided parameters are null.", new Object[0]);
                if (cVar != null) {
                    cVar.onError(new C1425b("One or more provided parameters are null."));
                }
                return true;
            }
        }
        return false;
    }

    public boolean sanityCheckHelpCenterSettings(C23345c<?> cVar, SupportSdkSettings supportSdkSettings) {
        if (!supportSdkSettings.hasHelpCenterSettings()) {
            Logger.m57303b("Help Center settings are null. Can not continue with the call", new Object[0]);
            if (cVar != null) {
                cVar.onError(new C1425b("Help Center settings are null. Can not continue with the call"));
            }
            return true;
        } else if (supportSdkSettings.isHelpCenterEnabled()) {
            return false;
        } else {
            Logger.m57303b("Help Center is disabled in your app's settings. Can not continue with the call", new Object[0]);
            if (cVar != null) {
                cVar.onError(new C1425b("Help Center is disabled in your app's settings. Can not continue with the call"));
            }
            return true;
        }
    }

    public void searchArticles(final HelpCenterSearch helpCenterSearch, final C23345c<List<SearchArticle>> cVar) {
        if (!sanityCheck(cVar, helpCenterSearch)) {
            this.blipsProvider.helpCenterSearch(helpCenterSearch.getQuery());
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    String str;
                    String str2;
                    Locale locale;
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(cVar, supportSdkSettings)) {
                        if (C23410c.m57534b(helpCenterSearch.getInclude())) {
                            str = C23410c.m57536d("categories", "sections", "users");
                        } else {
                            str = C23410c.m57536d(helpCenterSearch.getInclude());
                        }
                        String str3 = str;
                        if (C23410c.m57534b(helpCenterSearch.getLabelNames())) {
                            str2 = null;
                        } else {
                            str2 = C23410c.m57536d(helpCenterSearch.getLabelNames());
                        }
                        String str4 = str2;
                        if (helpCenterSearch.getLocale() == null) {
                            locale = ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings);
                        } else {
                            locale = helpCenterSearch.getLocale();
                        }
                        ZendeskHelpCenterProvider.this.helpCenterService.searchArticles(helpCenterSearch.getQuery(), locale, str3, str4, helpCenterSearch.getCategoryIds(), helpCenterSearch.getSectionIds(), helpCenterSearch.getPage(), helpCenterSearch.getPerPage(), new ZendeskCallbackSuccess<ArticlesSearchResponse>(cVar) {
                            public void onSuccess(ArticlesSearchResponse articlesSearchResponse) {
                                ZendeskHelpCenterProvider.this.zendeskTracker.helpCenterSearched(helpCenterSearch.getQuery());
                                ZendeskHelpCenterProvider.this.helpCenterSessionCache.setLastSearch(helpCenterSearch.getQuery(), (articlesSearchResponse == null || !C23408a.m57530e(articlesSearchResponse.getArticles())) ? 0 : articlesSearchResponse.getArticles().size());
                                List<SearchArticle> asSearchArticleList = ZendeskHelpCenterProvider.this.asSearchArticleList(articlesSearchResponse);
                                C23345c cVar = cVar;
                                if (cVar != null) {
                                    cVar.onSuccess(asSearchArticleList);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void submitRecordArticleView(Article article, Locale locale, C23345c<Void> cVar) {
        if (!sanityCheck(cVar, article)) {
            this.zendeskTracker.helpCenterArticleViewed();
            this.blipsProvider.articleView(article);
            final C23345c<Void> cVar2 = cVar;
            final Article article2 = article;
            final Locale locale2 = locale;
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(cVar2, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.submitRecordArticleView(article2.getId(), locale2, new RecordArticleViewRequest(ZendeskHelpCenterProvider.this.helpCenterSessionCache.getLastSearch(), ZendeskHelpCenterProvider.this.helpCenterSessionCache.isUniqueSearchResultClick()), new ZendeskCallbackSuccess<Void>(cVar2) {
                            public void onSuccess(Void voidR) {
                                ZendeskHelpCenterProvider.this.helpCenterSessionCache.unsetUniqueSearchResultClick();
                                C23345c cVar = cVar2;
                                if (cVar != null) {
                                    cVar.onSuccess(voidR);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void upvoteArticle(final Long l, final C23345c<ArticleVote> cVar) {
        if (!sanityCheck(cVar, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (ZendeskHelpCenterProvider.this.checkSettingsAndVotingEnabled(cVar, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.upvoteArticle(l, ZendeskHelpCenterProvider.EMPTY_JSON_BODY, new ZendeskCallbackSuccess<ArticleVoteResponse>(cVar) {
                            public void onSuccess(ArticleVoteResponse articleVoteResponse) {
                                C23345c cVar = cVar;
                                if (cVar != null) {
                                    cVar.onSuccess(articleVoteResponse.getVote());
                                }
                                ZendeskHelpCenterProvider.this.blipsProvider.articleVote(l, 1);
                            }
                        });
                    }
                }
            });
        }
    }

    public void getArticles(Long l, String str, C23345c<List<Article>> cVar) {
        if (!sanityCheck(cVar, l)) {
            final C23345c<List<Article>> cVar2 = cVar;
            final Long l2 = l;
            final String str2 = str;
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(cVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(cVar2, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getArticlesForSection(l2, ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings), "users", str2, cVar2);
                    }
                }
            });
        }
    }
}
