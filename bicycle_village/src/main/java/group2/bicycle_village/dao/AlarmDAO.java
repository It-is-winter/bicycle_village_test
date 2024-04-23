package group2.bicycle_village.dao;

import java.sql.SQLException;

public interface AlarmDAO {
    public int insertAlarm(long alarmSeq, String alarmContent, int seen, String linkURL, long userSeq) throws SQLException;
}
