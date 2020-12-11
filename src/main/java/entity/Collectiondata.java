package entity;

import java.io.Serializable;

/**
 * (Collectiondata)实体类
 *
 * @author lyw
 * @since 2020-12-11 11:32:59
 */
public class Collectiondata implements Serializable {
    private static final long serialVersionUID = 784530756567928496L;
    /**
     * 主键自增
     */
    private Integer id;
    /**
     * 智能车编号
     */
    private String carnumber;
    /**
     * 蔬菜品名
     */
    private String vegetablename;
    /**
     * 蔬菜品种
     */
    private String vegetablevar;
    /**
     * 产量1（优）
     */
    private Object vegetableyield1;
    /**
     * 产量2（良）
     */
    private Object vegetableyield2;
    /**
     * 产量3（中）
     */
    private Object vegetableyield3;
    /**
     * 纬度
     */
    private String gpsLatitude;
    /**
     * 经度
     */
    private String gpsLongitude;
    /**
     * 纬度类型
     */
    private String latitudetype;
    /**
     * 经度类型
     */
    private String longitudetype;
    /**
     * 采集时间
     */
    private String collecttime;
    /**
     * （0：关机、扫码：1）
     */
    private Integer carstatus;


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

    public String getVegetablename() {
        return vegetablename;
    }

    public void setVegetablename(String vegetablename) {
        this.vegetablename = vegetablename;
    }

    public String getVegetablevar() {
        return vegetablevar;
    }

    public void setVegetablevar(String vegetablevar) {
        this.vegetablevar = vegetablevar;
    }

    public Object getVegetableyield1() {
        return vegetableyield1;
    }

    public void setVegetableyield1(Object vegetableyield1) {
        this.vegetableyield1 = vegetableyield1;
    }

    public Object getVegetableyield2() {
        return vegetableyield2;
    }

    public void setVegetableyield2(Object vegetableyield2) {
        this.vegetableyield2 = vegetableyield2;
    }

    public Object getVegetableyield3() {
        return vegetableyield3;
    }

    public void setVegetableyield3(Object vegetableyield3) {
        this.vegetableyield3 = vegetableyield3;
    }

    public String getGpsLatitude() {
        return gpsLatitude;
    }

    public void setGpsLatitude(String gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }

    public String getGpsLongitude() {
        return gpsLongitude;
    }

    public void setGpsLongitude(String gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }

    public String getLatitudetype() {
        return latitudetype;
    }

    public void setLatitudetype(String latitudetype) {
        this.latitudetype = latitudetype;
    }

    public String getLongitudetype() {
        return longitudetype;
    }

    public void setLongitudetype(String longitudetype) {
        this.longitudetype = longitudetype;
    }

    public String getCollecttime() {
        return collecttime;
    }

    public void setCollecttime(String collecttime) {
        this.collecttime = collecttime;
    }

    public Integer getCarstatus() {
        return carstatus;
    }

    public void setCarstatus(Integer carstatus) {
        this.carstatus = carstatus;
    }

}