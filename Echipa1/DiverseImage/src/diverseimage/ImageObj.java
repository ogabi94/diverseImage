/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diverseimage;

/**
 *
 * @author Bibi
 */
import java.util.*;
import java.io.*;

public class ImageObj {

    private String date;
    private String description;
    private String id;
    private float latitude;
    private int license;
    private float longitude;
    private int nbComments;
    private int rank;
    private String[] tags;
    private String title;
    private String url;
    private String username;
    private int views;

    public ImageObj(String d, String desc, String identifier, float lat, int lic, float longit, int nrCom, int rnk, String[] rf, String name, String urlb, String user, int nrViews) {
        date = d;
        description = desc;
        id = identifier;
        latitude = lat;
        license = lic;
        longitude = longit;
        nbComments = nrCom;
        rank = rnk;
        tags = rf;
        title = name;
        url = urlb;
        username = user;
        views = nrViews;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String data) {
        date = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        description = desc;
    }

    public String getId() {
        return id;
    }

    public void setId(String identifier) {
        id = identifier;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float lat) {
        latitude = lat;
    }

    public int getLicense() {
        return license;
    }

    public void setLicense(int lic) {
        license = lic;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longit) {
        longitude = longit;
    }

    public int getnbComments() {
        return nbComments;
    }

    public void setnbComments(int nrCom) {
        nbComments = nrCom;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rnk) {
        rank = rnk;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] rf) {
        tags = rf;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        title = name;
    }

    public String getURL() {
        return url;
    }

    public void setURL(String urlb) {
        url = urlb;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String user) {
        username = user;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int nrViews) {
        views = nrViews;
    }
}
