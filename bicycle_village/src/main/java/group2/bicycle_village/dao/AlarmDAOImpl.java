package group2.bicycle_village.dao;

import group2.bicycle_village.common.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlarmDAOImpl implements AlarmDAO {
    @Override
    public int insertAlarm(long alarmSeq, String alarmContent, int seen, String linkURL, long userSeq) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        int result = 0;
        String sql = "insert into alarm (?,?,?,?,?)";
        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setLong(1, alarmSeq);
            ps.setString(2, alarmContent);
            ps.setInt(3, seen);
            ps.setString(4, linkURL);
            ps.setLong(5, userSeq);
            result = ps.executeUpdate();
        } finally {
            DbUtil.close(con, ps);
        }

        return result;
    }
}
