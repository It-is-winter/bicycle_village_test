package group2.bicycle_village.dao;

import group2.bicycle_village.common.dto.AlarmDTO;
import group2.bicycle_village.common.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlarmDAOImpl implements AlarmDAO {
    @Override
    public int insertAlarm(AlarmDTO alarm) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        int result = 0;
        String sql = "insert into alarm (alarm_seq.nextval,?,?,?) where user_seq = ?";
        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, alarm.getAlarmContent());
            ps.setInt(2, alarm.getIsSeen());
            ps.setString(3, alarm.getLinkURL());
            ps.setLong(4, alarm.getUserSeq());
            result = ps.executeUpdate();
        } finally {
            DbUtil.close(con, ps);
        }

        return result;
    }
}
