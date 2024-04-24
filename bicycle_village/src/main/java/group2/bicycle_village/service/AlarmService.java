package group2.bicycle_village.service;

import group2.bicycle_village.common.dto.AlarmDTO;
import group2.bicycle_village.controller.RestController;

import java.sql.SQLException;

public interface AlarmService {
    int insertAlarm(String id, AlarmDTO alarm) throws SQLException;
}
