package com.shubham.gitclosedissues.ApiRelated.jsonModel;

public class PullRequest {
    public String url;
    public String html_url;
    public String diff_url;
    public String patch_url;
    public Object merged_at;

    public PullRequest(String url, String html_url, String diff_url, String patch_url, Object merged_at) {
        this.url = url;
        this.html_url = html_url;
        this.diff_url = diff_url;
        this.patch_url = patch_url;
        this.merged_at = merged_at;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getDiff_url() {
        return diff_url;
    }

    public void setDiff_url(String diff_url) {
        this.diff_url = diff_url;
    }

    public String getPatch_url() {
        return patch_url;
    }

    public void setPatch_url(String patch_url) {
        this.patch_url = patch_url;
    }

    public Object getMerged_at() {
        return merged_at;
    }

    public void setMerged_at(Object merged_at) {
        this.merged_at = merged_at;
    }
}
