package com.udacity.test.database;

/**
 * Created by ramakant on 8/14/2015.
 */
public class DatabaseContract {

    public static final String DB_NAME = "reddit_database.db";

    public abstract class PostTable{
        public static final String TABLE_NAME= "post_table";

        public static final String TITLE = "titile";
        public static final String LINK = "link";
        public static final String IMAGELINK ="imageLink";

    }
}
