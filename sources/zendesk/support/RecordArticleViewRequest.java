package zendesk.support;

class RecordArticleViewRequest {
    private LastSearch lastSearch;
    private boolean uniqueSearchResultClick;

    public RecordArticleViewRequest(LastSearch lastSearch2, boolean z) {
        this.lastSearch = lastSearch2;
        this.uniqueSearchResultClick = z;
    }
}
