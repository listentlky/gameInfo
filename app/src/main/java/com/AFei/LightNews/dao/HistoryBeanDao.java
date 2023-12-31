package com.AFei.LightNews.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.AFei.LightNews.model.HistoryBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "HISTORY_BEAN".
*/
public class HistoryBeanDao extends AbstractDao<HistoryBean, Long> {

    public static final String TABLENAME = "HISTORY_BEAN";

    /**
     * Properties of entity HistoryBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Uniquekey = new Property(1, String.class, "uniquekey", false, "UNIQUEKEY");
        public final static Property Title = new Property(2, String.class, "title", false, "TITLE");
        public final static Property Date = new Property(3, String.class, "date", false, "DATE");
        public final static Property Category = new Property(4, String.class, "category", false, "CATEGORY");
        public final static Property AuthorName = new Property(5, String.class, "authorName", false, "AUTHOR_NAME");
        public final static Property Url = new Property(6, String.class, "url", false, "URL");
        public final static Property ThumbnailPicS = new Property(7, String.class, "thumbnailPicS", false, "THUMBNAIL_PIC_S");
        public final static Property ThumbnailPicS02 = new Property(8, String.class, "thumbnailPicS02", false, "THUMBNAIL_PIC_S02");
        public final static Property ThumbnailPicS03 = new Property(9, String.class, "thumbnailPicS03", false, "THUMBNAIL_PIC_S03");
    }


    public HistoryBeanDao(DaoConfig config) {
        super(config);
    }
    
    public HistoryBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"HISTORY_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"UNIQUEKEY\" TEXT," + // 1: uniquekey
                "\"TITLE\" TEXT," + // 2: title
                "\"DATE\" TEXT," + // 3: date
                "\"CATEGORY\" TEXT," + // 4: category
                "\"AUTHOR_NAME\" TEXT," + // 5: authorName
                "\"URL\" TEXT," + // 6: url
                "\"THUMBNAIL_PIC_S\" TEXT," + // 7: thumbnailPicS
                "\"THUMBNAIL_PIC_S02\" TEXT," + // 8: thumbnailPicS02
                "\"THUMBNAIL_PIC_S03\" TEXT);"); // 9: thumbnailPicS03
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"HISTORY_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, HistoryBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String uniquekey = entity.getUniquekey();
        if (uniquekey != null) {
            stmt.bindString(2, uniquekey);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(4, date);
        }
 
        String category = entity.getCategory();
        if (category != null) {
            stmt.bindString(5, category);
        }
 
        String authorName = entity.getAuthorName();
        if (authorName != null) {
            stmt.bindString(6, authorName);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(7, url);
        }
 
        String thumbnailPicS = entity.getThumbnailPicS();
        if (thumbnailPicS != null) {
            stmt.bindString(8, thumbnailPicS);
        }
 
        String thumbnailPicS02 = entity.getThumbnailPicS02();
        if (thumbnailPicS02 != null) {
            stmt.bindString(9, thumbnailPicS02);
        }
 
        String thumbnailPicS03 = entity.getThumbnailPicS03();
        if (thumbnailPicS03 != null) {
            stmt.bindString(10, thumbnailPicS03);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, HistoryBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String uniquekey = entity.getUniquekey();
        if (uniquekey != null) {
            stmt.bindString(2, uniquekey);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(4, date);
        }
 
        String category = entity.getCategory();
        if (category != null) {
            stmt.bindString(5, category);
        }
 
        String authorName = entity.getAuthorName();
        if (authorName != null) {
            stmt.bindString(6, authorName);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(7, url);
        }
 
        String thumbnailPicS = entity.getThumbnailPicS();
        if (thumbnailPicS != null) {
            stmt.bindString(8, thumbnailPicS);
        }
 
        String thumbnailPicS02 = entity.getThumbnailPicS02();
        if (thumbnailPicS02 != null) {
            stmt.bindString(9, thumbnailPicS02);
        }
 
        String thumbnailPicS03 = entity.getThumbnailPicS03();
        if (thumbnailPicS03 != null) {
            stmt.bindString(10, thumbnailPicS03);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public HistoryBean readEntity(Cursor cursor, int offset) {
        HistoryBean entity = new HistoryBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // uniquekey
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // title
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // date
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // category
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // authorName
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // url
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // thumbnailPicS
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // thumbnailPicS02
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // thumbnailPicS03
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, HistoryBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUniquekey(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTitle(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setDate(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCategory(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setAuthorName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setUrl(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setThumbnailPicS(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setThumbnailPicS02(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setThumbnailPicS03(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(HistoryBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(HistoryBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(HistoryBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
