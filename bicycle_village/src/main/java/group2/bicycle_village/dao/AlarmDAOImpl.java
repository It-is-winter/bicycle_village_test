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
        String sql = "insert into alarm (?,?,?,?,?)";
        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setLong(1, alarm.getAlarmSeq());
            ps.setString(2, alarm.getAlarmContent());
            ps.setInt(3, alarm.getIsSeen());
            ps.setString(4, alarm.getLinkURL());
            ps.setLong(5, alarm.getUserSeq());
            result = ps.executeUpdate();
        } finally {
            DbUtil.close(con, ps);
        }

        return result;
    }
}
