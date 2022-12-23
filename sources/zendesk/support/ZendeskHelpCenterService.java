package zendesk.support;

import com.zendesk.logger.Logger;
import fe0.C23342b;
import fe0.C23345c;
import ge0.C23408a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p019b0.C1425b;
import zendesk.core.ZendeskLocaleConverter;

class ZendeskHelpCenterService {
    private static final String LOG_TAG = "ZendeskHelpCenterService";
    private static final int NUMBER_PER_PAGE = 1000;
    private final HelpCenterService helpCenterService;
    private final ZendeskLocaleConverter localeConverter;

    public ZendeskHelpCenterService(HelpCenterService helpCenterService2, ZendeskLocaleConverter zendeskLocaleConverter) {
        this.helpCenterService = helpCenterService2;
        this.localeConverter = zendeskLocaleConverter;
    }

    public void deleteVote(Long l, C23345c<Void> cVar) {
        if (l == null) {
            Logger.m57303b("The vote id was null, can not delete the vote", new Object[0]);
            if (cVar != null) {
                cVar.onError(new C1425b("The vote id was null, can not delete the vote"));
                return;
            }
            return;
        }
        this.helpCenterService.deleteVote(l).mo53585K0(new C23342b(cVar));
    }

    public void downvoteArticle(Long l, String str, C23345c<ArticleVoteResponse> cVar) {
        if (l == null) {
            Logger.m57303b("The article id was null, can not create down vote", new Object[0]);
            if (cVar != null) {
                cVar.onError(new C1425b("The article id was null, can not create down vote"));
                return;
            }
            return;
        }
        this.helpCenterService.downvoteArticle(l, str).mo53585K0(new C23342b(cVar));
    }

    public void getArticle(Long l, Locale locale, String str, C23345c<Article> cVar) {
        String helpCenterLocaleString = this.localeConverter.toHelpCenterLocaleString(locale);
        this.helpCenterService.getArticle(helpCenterLocaleString, l, str).mo53585K0(new C23342b(cVar, new C23342b.C23344b<ArticleResponse, Article>() {
            public Article extract(ArticleResponse articleResponse) {
                return ZendeskHelpCenterService.this.matchArticleWithUsers(articleResponse.getArticle(), C23408a.m57528c(articleResponse.getUsers()));
            }
        }));
    }

    public void getArticlesForSection(Long l, Locale locale, String str, String str2, C23345c<List<Article>> cVar) {
        this.helpCenterService.getArticles(this.localeConverter.toHelpCenterLocaleString(locale), l, str2, str, 1000).mo53585K0(new C23342b(cVar, new C23342b.C23344b<ArticlesListResponse, List<Article>>() {
            public List<Article> extract(ArticlesListResponse articlesListResponse) {
                return ZendeskHelpCenterService.this.matchArticlesWithUsers(articlesListResponse.getUsers(), articlesListResponse.getArticles());
            }
        }));
    }

    public void getAttachments(Locale locale, Long l, AttachmentType attachmentType, C23345c<List<HelpCenterAttachment>> cVar) {
        if (attachmentType == null) {
            Logger.m57303b("getAttachments() was called with null attachment type", new Object[0]);
            if (cVar != null) {
                cVar.onError(new C1425b("getAttachments() was called with null attachment type"));
                return;
            }
            return;
        }
        this.helpCenterService.getAttachments(this.localeConverter.toHelpCenterLocaleString(locale), l, attachmentType.getAttachmentType()).mo53585K0(new C23342b(cVar, new C23342b.C23344b<AttachmentResponse, List<HelpCenterAttachment>>() {
            public List<HelpCenterAttachment> extract(AttachmentResponse attachmentResponse) {
                return attachmentResponse.getArticleAttachments();
            }
        }));
    }

    public void getCategories(Locale locale, C23345c<List<Category>> cVar) {
        this.helpCenterService.getCategories(this.localeConverter.toHelpCenterLocaleString(locale)).mo53585K0(new C23342b(cVar, new C23342b.C23344b<CategoriesResponse, List<Category>>() {
            public List<Category> extract(CategoriesResponse categoriesResponse) {
                return categoriesResponse.getCategories();
            }
        }));
    }

    public void getCategoryById(Long l, Locale locale, C23345c<Category> cVar) {
        this.helpCenterService.getCategoryById(this.localeConverter.toHelpCenterLocaleString(locale), l).mo53585K0(new C23342b(cVar, new C23342b.C23344b<CategoryResponse, Category>() {
            public Category extract(CategoryResponse categoryResponse) {
                return categoryResponse.getCategory();
            }
        }));
    }

    public void getHelp(Locale locale, String str, String str2, String str3, int i, String str4, C23345c<HelpResponse> cVar) {
        Locale locale2 = locale;
        this.helpCenterService.getHelp(this.localeConverter.toHelpCenterLocaleString(locale), str, str2, str3, i, str4, 1000, SortBy.CREATED_AT.getApiValue(), SortOrder.DESCENDING.getApiValue()).mo53585K0(new C23342b(cVar));
    }

    public void getSectionById(Long l, Locale locale, C23345c<Section> cVar) {
        this.helpCenterService.getSectionById(this.localeConverter.toHelpCenterLocaleString(locale), l).mo53585K0(new C23342b(cVar, new C23342b.C23344b<SectionResponse, Section>() {
            public Section extract(SectionResponse sectionResponse) {
                return sectionResponse.getSection();
            }
        }));
    }

    public void getSectionsForCategory(Long l, Locale locale, C23345c<List<Section>> cVar) {
        this.helpCenterService.getSections(this.localeConverter.toHelpCenterLocaleString(locale), l, 1000).mo53585K0(new C23342b(cVar, new C23342b.C23344b<SectionsResponse, List<Section>>() {
            public List<Section> extract(SectionsResponse sectionsResponse) {
                return sectionsResponse.getSections();
            }
        }));
    }

    public void getSuggestedArticles(String str, Locale locale, String str2, Long l, Long l2, C23345c<SuggestedArticleResponse> cVar) {
        String helpCenterLocaleString = this.localeConverter.toHelpCenterLocaleString(locale);
        this.helpCenterService.getSuggestedArticles(str, helpCenterLocaleString, str2, l, l2).mo53585K0(new C23342b(cVar));
    }

    public void listArticles(String str, Locale locale, String str2, String str3, String str4, Integer num, Integer num2, C23345c<ArticlesListResponse> cVar) {
        Locale locale2 = locale;
        this.helpCenterService.listArticles(this.localeConverter.toHelpCenterLocaleString(locale), str, str2, str3, str4, num, num2).mo53585K0(new C23342b(cVar));
    }

    public Article matchArticleWithUsers(Article article, List<User> list) {
        if (article == null) {
            return new Article();
        }
        Iterator<User> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            User next = it.next();
            if (next.getId() != null && next.getId().equals(article.getAuthorId())) {
                article.setAuthor(next);
                break;
            }
        }
        return article;
    }

    public List<Article> matchArticlesWithUsers(List<User> list, List<Article> list2) {
        HashMap hashMap = new HashMap();
        for (User next : list) {
            hashMap.put(next.getId(), next);
        }
        ArrayList arrayList = new ArrayList();
        for (Article next2 : list2) {
            User user = (User) hashMap.get(next2.getAuthorId());
            if (user != null) {
                next2.setAuthor(user);
            }
            arrayList.add(next2);
        }
        return arrayList;
    }

    public void searchArticles(String str, Locale locale, String str2, String str3, String str4, String str5, Integer num, Integer num2, C23345c<ArticlesSearchResponse> cVar) {
        Locale locale2 = locale;
        this.helpCenterService.searchArticles(str, this.localeConverter.toHelpCenterLocaleString(locale), str2, str3, str4, str5, num, num2).mo53585K0(new C23342b(cVar));
    }

    public void submitRecordArticleView(Long l, Locale locale, RecordArticleViewRequest recordArticleViewRequest, C23345c<Void> cVar) {
        this.helpCenterService.submitRecordArticleView(l, this.localeConverter.toHelpCenterLocaleString(locale), recordArticleViewRequest).mo53585K0(new C23342b(cVar));
    }

    public void upvoteArticle(Long l, String str, C23345c<ArticleVoteResponse> cVar) {
        if (l == null) {
            Logger.m57303b("The article id was null, can not create up vote", new Object[0]);
            if (cVar != null) {
                cVar.onError(new C1425b("The article id was null, can not create up vote"));
                return;
            }
            return;
        }
        this.helpCenterService.upvoteArticle(l, str).mo53585K0(new C23342b(cVar));
    }
}
