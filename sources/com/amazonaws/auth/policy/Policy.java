package com.amazonaws.auth.policy;

import com.amazonaws.auth.policy.internal.JsonPolicyReader;
import com.amazonaws.auth.policy.internal.JsonPolicyWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Policy {
    private static final String DEFAULT_POLICY_VERSION = "2012-10-17";

    /* renamed from: id */
    private String f6717id;
    private List<Statement> statements;
    private String version;

    public Policy() {
        this.version = DEFAULT_POLICY_VERSION;
        this.statements = new ArrayList();
    }

    private void assignUniqueStatementIds() {
        HashSet hashSet = new HashSet();
        for (Statement next : this.statements) {
            if (next.getId() != null) {
                hashSet.add(next.getId());
            }
        }
        int i = 0;
        for (Statement next2 : this.statements) {
            if (next2.getId() == null) {
                do {
                    i++;
                } while (hashSet.contains(Integer.toString(i)));
                next2.setId(Integer.toString(i));
            }
        }
    }

    public static Policy fromJson(String str) {
        return new JsonPolicyReader().createPolicyFromJsonString(str);
    }

    public String getId() {
        return this.f6717id;
    }

    public Collection<Statement> getStatements() {
        return this.statements;
    }

    public String getVersion() {
        return this.version;
    }

    public void setId(String str) {
        this.f6717id = str;
    }

    public void setStatements(Collection<Statement> collection) {
        this.statements = new ArrayList(collection);
        assignUniqueStatementIds();
    }

    public String toJson() {
        return new JsonPolicyWriter().writePolicyToString(this);
    }

    public Policy withId(String str) {
        setId(str);
        return this;
    }

    public Policy withStatements(Statement... statementArr) {
        setStatements(Arrays.asList(statementArr));
        return this;
    }

    public Policy(String str) {
        this.version = DEFAULT_POLICY_VERSION;
        this.statements = new ArrayList();
        this.f6717id = str;
    }

    public Policy(String str, Collection<Statement> collection) {
        this(str);
        setStatements(collection);
    }
}
