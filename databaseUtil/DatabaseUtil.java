package databaseUtil;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseUtil {
	//�f�[�^�x�[�X�̓o�^���𒲂ׂ郁�\�b�h
	public static int countDataNum(SQLiteDatabase db,String TABLE_NAME){
		
		String sql=" select count(*) from "+TABLE_NAME;
		Cursor cursor=db.rawQuery(sql, null);
		cursor.moveToLast();
		int count=cursor.getInt(0);
		return count;
		
	}

}
