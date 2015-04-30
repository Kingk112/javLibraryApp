package com.kekebox.hukewei.javlibraryapp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by hukewei on 28/04/15.
 */
public class JavUser {
    private String Email;
    private String HashedPassword;
    private String UserId;
    private boolean isLogin;
    private ArrayList<String> FavoriteActors = new ArrayList<>();
    private ArrayList<String> FavoriteVideos = new ArrayList<>();
    private ArrayList<String> WantedVideos = new ArrayList<>();
    private ArrayList<String> WatchedVideos = new ArrayList<>();
    private static JavUser currentUser;
    private ArrayList<VideoInfoItem> favoriteVideosItemList = new ArrayList<>();
    private ArrayList<String> favoriteVideosPendingIDs = new ArrayList<>();
    private ArrayList<VideoInfoItem> wantedVideosItemList = new ArrayList<>();
    private ArrayList<String> wantedVideosPendingIDs = new ArrayList<>();
    private ArrayList<String> loadedFavoriteVideos= new ArrayList<>();
    private ArrayList<String>  loadedWantedVideos= new ArrayList<>();
    private ArrayList<String> watchedVideosPendingIDs= new ArrayList<>();
    private ArrayList<String> loadedWatchedVideos= new ArrayList<>();
    private ArrayList<VideoInfoItem> watchedVideosItemList= new ArrayList<>();


    public static JavUser getCurrentUser() {
        if (currentUser == null) {
            currentUser = new JavUser();
        }
        return currentUser;

    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getHashedPassword() {
        return HashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        HashedPassword = hashedPassword;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean isLogin) {
        this.isLogin = isLogin;
    }

    public ArrayList<String> getFavoriteActors() {
        return FavoriteActors;
    }

    public void setFavoriteActors(ArrayList<String> favoriteActors) {
        FavoriteActors = favoriteActors;
    }

    public ArrayList<String> getFavoriteVideos() {
        return FavoriteVideos;
    }

    public void setFavoriteVideos(ArrayList<String> favoriteVideos) {
        FavoriteVideos = favoriteVideos;
    }

    public ArrayList<String> getWatchedVideos() {
        return WatchedVideos;
    }

    public void setWatchedVideos(ArrayList<String> watchedVideos) {
        WatchedVideos = watchedVideos;
    }


    public ArrayList<String> getWantedVideos() {
        return WantedVideos;
    }

    public void setWantedVideos(ArrayList<String> wantedVideos) {
        WantedVideos = wantedVideos;
    }

    public void Logout() {
        isLogin = false;
    }


    public ArrayList<VideoInfoItem> getFavoriteVideosItemList() {
        return favoriteVideosItemList;
    }

    public ArrayList<String> getFavoriteVideosPendingIDs() {
        return favoriteVideosPendingIDs;
    }

    public ArrayList<VideoInfoItem> getWantedVideosItemList() {
        return wantedVideosItemList;
    }

    public ArrayList<String> getWantedVideosPendingIDs() {
        return wantedVideosPendingIDs;
    }

    public ArrayList<String> getLoadedFavoriteVideos() {
        return loadedFavoriteVideos;
    }

    public ArrayList<String>  getLoadedWantedVideos() {
        return loadedWantedVideos;
    }

    public ArrayList<String> getWatchedVideosPendingIDs() {
        return watchedVideosPendingIDs;
    }

    public ArrayList<String> getLoadedWatchedVideos() {
        return loadedWatchedVideos;
    }

    public ArrayList<VideoInfoItem> getWatchedVideosItemList() {
        return watchedVideosItemList;
    }
}
