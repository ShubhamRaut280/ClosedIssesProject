package com.shubham.gitclosedissues.ApiRelated.jsonModel;

public class Reactions{
    public String url;
    public int total_count;
    public int plus1;
    public int minus1;
    public int laugh;
    public int hooray;
    public int confused;
    public int heart;
    public int rocket;
    public int eyes;

    public Reactions(String url, int total_count, int plus1, int minus1, int laugh, int hooray, int confused, int heart, int rocket, int eyes) {
        this.url = url;
        this.total_count = total_count;
        this.plus1 = plus1;
        this.minus1 = minus1;
        this.laugh = laugh;
        this.hooray = hooray;
        this.confused = confused;
        this.heart = heart;
        this.rocket = rocket;
        this.eyes = eyes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public int getPlus1() {
        return plus1;
    }

    public void setPlus1(int plus1) {
        this.plus1 = plus1;
    }

    public int getMinus1() {
        return minus1;
    }

    public void setMinus1(int minus1) {
        this.minus1 = minus1;
    }

    public int getLaugh() {
        return laugh;
    }

    public void setLaugh(int laugh) {
        this.laugh = laugh;
    }

    public int getHooray() {
        return hooray;
    }

    public void setHooray(int hooray) {
        this.hooray = hooray;
    }

    public int getConfused() {
        return confused;
    }

    public void setConfused(int confused) {
        this.confused = confused;
    }

    public int getHeart() {
        return heart;
    }

    public void setHeart(int heart) {
        this.heart = heart;
    }

    public int getRocket() {
        return rocket;
    }

    public void setRocket(int rocket) {
        this.rocket = rocket;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
}