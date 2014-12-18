package com.example.recyclerviewsample;

/**
 * Created by Mahe on 16-12-2014.
 */
public class ItemData {

        private String title;
        private int imageUrl;

        public ItemData(String title,int imageUrl){

            this.title = title;
            this.imageUrl = imageUrl;
        }
        // getters & setters

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
