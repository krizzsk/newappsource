package com.facebook.internal;

import kotlin.Metadata;

@Metadata(mo59059d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo59060d2 = {"Lcom/facebook/internal/GamingAction;", "", "rawValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "ContextChoose", "JoinTournament", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1}, mo59064xi = 48)
public enum GamingAction {
    ContextChoose("context_choose"),
    JoinTournament("join_tournament");
    
    private final String rawValue;

    private GamingAction(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
