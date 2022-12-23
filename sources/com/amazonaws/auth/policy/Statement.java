package com.amazonaws.auth.policy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Statement {
    private List<Action> actions = new ArrayList();
    private List<Condition> conditions = new ArrayList();
    private Effect effect;

    /* renamed from: id */
    private String f6719id;
    private List<Principal> principals = new ArrayList();
    private List<Resource> resources;

    public enum Effect {
        Allow,
        Deny
    }

    public Statement(Effect effect2) {
        this.effect = effect2;
        this.f6719id = null;
    }

    public List<Action> getActions() {
        return this.actions;
    }

    public List<Condition> getConditions() {
        return this.conditions;
    }

    public Effect getEffect() {
        return this.effect;
    }

    public String getId() {
        return this.f6719id;
    }

    public List<Principal> getPrincipals() {
        return this.principals;
    }

    public List<Resource> getResources() {
        return this.resources;
    }

    public void setActions(Collection<Action> collection) {
        this.actions = new ArrayList(collection);
    }

    public void setConditions(List<Condition> list) {
        this.conditions = list;
    }

    public void setEffect(Effect effect2) {
        this.effect = effect2;
    }

    public void setId(String str) {
        this.f6719id = str;
    }

    public void setPrincipals(Collection<Principal> collection) {
        this.principals = new ArrayList(collection);
    }

    public void setResources(Collection<Resource> collection) {
        this.resources = new ArrayList(collection);
    }

    public Statement withActions(Action... actionArr) {
        setActions(Arrays.asList(actionArr));
        return this;
    }

    public Statement withConditions(Condition... conditionArr) {
        setConditions(Arrays.asList(conditionArr));
        return this;
    }

    public Statement withId(String str) {
        setId(str);
        return this;
    }

    public Statement withPrincipals(Principal... principalArr) {
        setPrincipals(principalArr);
        return this;
    }

    public Statement withResources(Resource... resourceArr) {
        setResources(Arrays.asList(resourceArr));
        return this;
    }

    public void setPrincipals(Principal... principalArr) {
        setPrincipals((Collection<Principal>) new ArrayList(Arrays.asList(principalArr)));
    }
}
