package zendesk.support;

import ge0.C23408a;
import java.util.List;

class ArticlesListResponse implements ArticlesResponse {
    private List<Article> articles;
    private List<Category> categories;
    private String nextPage;
    private String previousPage;
    private List<Section> sections;
    private List<User> users;

    public List<Article> getArticles() {
        return C23408a.m57526a(this.articles);
    }

    public List<Category> getCategories() {
        return C23408a.m57526a(this.categories);
    }

    public String getNextPage() {
        return this.nextPage;
    }

    public String getPreviousPage() {
        return this.previousPage;
    }

    public List<Section> getSections() {
        return C23408a.m57526a(this.sections);
    }

    public List<User> getUsers() {
        return C23408a.m57526a(this.users);
    }
}
