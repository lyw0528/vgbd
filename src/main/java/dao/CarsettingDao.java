package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entity.CarSetting;
import util.DbUtil;

public class CarsettingDao {
    /**
     * 查询用户
     *
     * @param username 用户名
     * @return user对象
     */
    public CarSetting getCarSetting(String username) {
        return DbUtil.query(CarSetting.class, "SELECT * FROM carsetting WHERE username = ?", username);
    }
    public boolean saveCarSetting(CarSetting carSetting) {
        return DbUtil.save("insert into carsetting(" +
                        "username, " +
                        "userphone, " +
                        "begintime, " +
                        "householder, " +
                        "greenhouseno, " +
                        "greenhousearea, " +
                        "greenhouseaddress, " +
                        "province, " +
                        "city, " +
                        "county, " +
                        "village) values (?,?,?,?,?,?,?,?,?,?,?,?)",
                carSetting.getUsername(),
                carSetting.getUserphone(),
                carSetting.getBegintime(),
                carSetting.getHouseholder(),
                carSetting.getGreenhouseno(),
                carSetting.getGreenhousearea(),
                carSetting.getGreenhouseaddress(),
                carSetting.getProvince(),
                carSetting.getCity(),
                carSetting.getVillage());

    }
}
