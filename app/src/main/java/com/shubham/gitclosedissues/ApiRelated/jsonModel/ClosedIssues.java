package com.shubham.gitclosedissues.ApiRelated.jsonModel;

import java.util.ArrayList;
import java.util.Date;

public class ClosedIssues {
    public String url;
    public String repository_url;
    public String labels_url;
    public String comments_url;
    public String events_url;
    public String html_url;
    public int id;
    public String node_id;
    public int number;
    public String title;
    public User user;
    public ArrayList<Label> labels;
    public String state;
    public boolean locked;
    public Object assignee;
    public ArrayList<Object> assignees;
    public Object milestone;
    public int comments;
    public Date created_at;
    public Date updated_at;
    public Date closed_at;
    public String author_association;
    public Object active_lock_reason;
    public String body;
    public Reactions reactions;
    public String timeline_url;
    public Object performed_via_github_app;
    public Object state_reason;
    public boolean draft;
    public PullRequest pull_request;

    public ClosedIssues(String url, String repository_url, String labels_url, String comments_url, String events_url, String html_url, int id, String node_id, int number, String title, User user, ArrayList<Label> labels, String state, boolean locked, Object assignee, ArrayList<Object> assignees, Object milestone, int comments, Date created_at, Date updated_at, Date closed_at, String author_association, Object active_lock_reason, String body, Reactions reactions, String timeline_url, Object performed_via_github_app, Object state_reason, boolean draft, PullRequest pull_request) {
        this.url = url;
        this.repository_url = repository_url;
        this.labels_url = labels_url;
        this.comments_url = comments_url;
        this.events_url = events_url;
        this.html_url = html_url;
        this.id = id;
        this.node_id = node_id;
        this.number = number;
        this.title = title;
        this.user = user;
        this.labels = labels;
        this.state = state;
        this.locked = locked;
        this.assignee = assignee;
        this.assignees = assignees;
        this.milestone = milestone;
        this.comments = comments;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.closed_at = closed_at;
        this.author_association = author_association;
        this.active_lock_reason = active_lock_reason;
        this.body = body;
        this.reactions = reactions;
        this.timeline_url = timeline_url;
        this.performed_via_github_app = performed_via_github_app;
        this.state_reason = state_reason;
        this.draft = draft;
        this.pull_request = pull_request;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRepository_url() {
        return repository_url;
    }

    public void setRepository_url(String repository_url) {
        this.repository_url = repository_url;
    }

    public String getLabels_url() {
        return labels_url;
    }

    public void setLabels_url(String labels_url) {
        this.labels_url = labels_url;
    }

    public String getComments_url() {
        return comments_url;
    }

    public void setComments_url(String comments_url) {
        this.comments_url = comments_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Label> getLabels() {
        return labels;
    }

    public void setLabels(ArrayList<Label> labels) {
        this.labels = labels;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public Object getAssignee() {
        return assignee;
    }

    public void setAssignee(Object assignee) {
        this.assignee = assignee;
    }

    public ArrayList<Object> getAssignees() {
        return assignees;
    }

    public void setAssignees(ArrayList<Object> assignees) {
        this.assignees = assignees;
    }

    public Object getMilestone() {
        return milestone;
    }

    public void setMilestone(Object milestone) {
        this.milestone = milestone;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Date getClosed_at() {
        return closed_at;
    }

    public void setClosed_at(Date closed_at) {
        this.closed_at = closed_at;
    }

    public String getAuthor_association() {
        return author_association;
    }

    public void setAuthor_association(String author_association) {
        this.author_association = author_association;
    }

    public Object getActive_lock_reason() {
        return active_lock_reason;
    }

    public void setActive_lock_reason(Object active_lock_reason) {
        this.active_lock_reason = active_lock_reason;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Reactions getReactions() {
        return reactions;
    }

    public void setReactions(Reactions reactions) {
        this.reactions = reactions;
    }

    public String getTimeline_url() {
        return timeline_url;
    }

    public void setTimeline_url(String timeline_url) {
        this.timeline_url = timeline_url;
    }

    public Object getPerformed_via_github_app() {
        return performed_via_github_app;
    }

    public void setPerformed_via_github_app(Object performed_via_github_app) {
        this.performed_via_github_app = performed_via_github_app;
    }

    public Object getState_reason() {
        return state_reason;
    }

    public void setState_reason(Object state_reason) {
        this.state_reason = state_reason;
    }

    public boolean isDraft() {
        return draft;
    }

    public void setDraft(boolean draft) {
        this.draft = draft;
    }

    public PullRequest getPull_request() {
        return pull_request;
    }

    public void setPull_request(PullRequest pull_request) {
        this.pull_request = pull_request;
    }
}







