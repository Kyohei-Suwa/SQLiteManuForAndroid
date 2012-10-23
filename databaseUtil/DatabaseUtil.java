package databaseUtil;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseUtil {
	//データベースの登録数を調べるメソッド
	public static int countDataNum(SQLiteDatabase db,String TABLE_NAME){
		
		String sql=" select count(*) from "+TABLE_NAME;
		Cursor cursor=db.rawQuery(sql, null);
		cursor.moveToLast();
		int count=cursor.getInt(0);
		return count;
		
	}

}
