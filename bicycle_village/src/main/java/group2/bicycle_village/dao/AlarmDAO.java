package group2.bicycle_village.dao;

import group2.bicycle_village.common.dto.AlarmDTO;

import java.sql.SQLException;

public interface AlarmDAO {
    public int insertAlarm(String id, AlarmDTO alarm) throws SQLException;
}
