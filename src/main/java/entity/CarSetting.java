package entity;

import java.io.Serializable;

/**
 * (Carsetting)实体类
 *
 * @author lyw
 * @since 2020-12-11 11:32:50
 */
public class CarSetting {
    /**
     * 主键自增
     */
    private Integer id;
    /**
     * 智能车编号
     */
    private String carnumber;
    /**
     * 用户姓名
     */
    private String username;
    /**
     * 联系电话
     */
    private String userphone;
    /**
     * 使用开始时间（自动获取）
     */
    private String begintime;
    /**
     * 大棚户主
     */
    private String householder;
    /**
     * 大棚编号
     */
    private Integer greenhouseno;
    /**
     * 大棚面积
     */
    private Object greenhousearea;
    /**
     * 大棚地址
     */
    private String greenhouseaddress;
    /**
     * 省
     */
    private String province;
    /**
     * 市
     */
    private String city;
    /**
     * 县/区
     */
    private String county;
    /**
     * 村
     */
    private String village;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public String getHouseholder() {
        return householder;
    }

    public void setHouseholder(String householder) {
        this.householder = householder;
    }

    public Integer getGreenhouseno() {
        return greenhouseno;
    }

    public void setGreenhouseno(Integer greenhouseno) {
        this.greenhouseno = greenhouseno;
    }

    public Object getGreenhousearea() {
        return greenhousearea;
    }

    public void setGreenhousearea(Object greenhousearea) {
        this.greenhousearea = greenhousearea;
    }

    public String getGreenhouseaddress() {
        return greenhouseaddress;
    }

    public void setGreenhouseaddress(String greenhouseaddress) {
        this.greenhouseaddress = greenhouseaddress;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

}