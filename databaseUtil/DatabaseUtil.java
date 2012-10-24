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
	//(rawNum)�Ԗڂ̗�̃f�[�^��String�^�Ŏ��o�����\�b�h
	public static String[] getData(SQLiteDatabase db,String sql,String TABLE_NAME){
		
		
		Cursor cursor=db.rawQuery(sql, null);
		int dataNum=cursor.getCount();
		String[] strData=new String[dataNum];
		for(int i=0;i<dataNum;i++){
			strData[i]=cursor.getString(0);
			cursor.moveToNext();
		}
		return strData;
	}

}
