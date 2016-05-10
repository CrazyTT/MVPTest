package com.chenliuliu.mvptest.bean;

import java.util.List;

/**
 * Created by liuliuchen on 16/5/9.
 */
public class InfoBean {


    /**
     * code : 1
     * count : 1
     * data : null
     * dataObject : [{"sensorList":[{"air":{"c6h6":"0","ch2o":"0","co2":"0","createTime":"1900-01-01 01:01:01","humidity":"0","name":"","pm25":"0","sensorId":"500004DF6A4A","shareContent":"","temperature":"0","voc":"0"},"alert":{"alertStatus":"","alertType":"","alertValue":"","creatTime":"","name":"","online":false,"sensorId":""},"createTime":"","ctrl":{},"gas":{},"isOnline":0,"localHardVersion":"00000003","localSoftVersion":"00000024","name":"","online":false,"remoteHardVersion":"","remoteSoftVersion":"","sensorId":"500004DF6A4A","sensors":{},"type":"","viewName":""}]}]
     * message : 查询数据成功
     * tableName : P2B
     */

    private String code;
    private int count;
    private Object data;
    private String message;
    private String tableName;
    private List<DataObjectEntity> dataObject;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<DataObjectEntity> getDataObject() {
        return dataObject;
    }

    public void setDataObject(List<DataObjectEntity> dataObject) {
        this.dataObject = dataObject;
    }

    public static class DataObjectEntity {
        /**
         * air : {"c6h6":"0","ch2o":"0","co2":"0","createTime":"1900-01-01 01:01:01","humidity":"0","name":"","pm25":"0","sensorId":"500004DF6A4A","shareContent":"","temperature":"0","voc":"0"}
         * alert : {"alertStatus":"","alertType":"","alertValue":"","creatTime":"","name":"","online":false,"sensorId":""}
         * createTime :
         * ctrl : {}
         * gas : {}
         * isOnline : 0
         * localHardVersion : 00000003
         * localSoftVersion : 00000024
         * name :
         * online : false
         * remoteHardVersion :
         * remoteSoftVersion :
         * sensorId : 500004DF6A4A
         * sensors : {}
         * type :
         * viewName :
         */

        private List<SensorListEntity> sensorList;

        public List<SensorListEntity> getSensorList() {
            return sensorList;
        }

        public void setSensorList(List<SensorListEntity> sensorList) {
            this.sensorList = sensorList;
        }

        public static class SensorListEntity {
            /**
             * c6h6 : 0
             * ch2o : 0
             * co2 : 0
             * createTime : 1900-01-01 01:01:01
             * humidity : 0
             * name :
             * pm25 : 0
             * sensorId : 500004DF6A4A
             * shareContent :
             * temperature : 0
             * voc : 0
             */

            private AirEntity air;
            /**
             * alertStatus :
             * alertType :
             * alertValue :
             * creatTime :
             * name :
             * online : false
             * sensorId :
             */

            private AlertEntity alert;
            private String createTime;
            private CtrlEntity ctrl;
            private GasEntity gas;
            private int isOnline;
            private String localHardVersion;
            private String localSoftVersion;
            private String name;
            private boolean online;
            private String remoteHardVersion;
            private String remoteSoftVersion;
            private String sensorId;
            private SensorsEntity sensors;
            private String type;
            private String viewName;

            public AirEntity getAir() {
                return air;
            }

            public void setAir(AirEntity air) {
                this.air = air;
            }

            public AlertEntity getAlert() {
                return alert;
            }

            public void setAlert(AlertEntity alert) {
                this.alert = alert;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public CtrlEntity getCtrl() {
                return ctrl;
            }

            public void setCtrl(CtrlEntity ctrl) {
                this.ctrl = ctrl;
            }

            public GasEntity getGas() {
                return gas;
            }

            public void setGas(GasEntity gas) {
                this.gas = gas;
            }

            public int getIsOnline() {
                return isOnline;
            }

            public void setIsOnline(int isOnline) {
                this.isOnline = isOnline;
            }

            public String getLocalHardVersion() {
                return localHardVersion;
            }

            public void setLocalHardVersion(String localHardVersion) {
                this.localHardVersion = localHardVersion;
            }

            public String getLocalSoftVersion() {
                return localSoftVersion;
            }

            public void setLocalSoftVersion(String localSoftVersion) {
                this.localSoftVersion = localSoftVersion;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public boolean isOnline() {
                return online;
            }

            public void setOnline(boolean online) {
                this.online = online;
            }

            public String getRemoteHardVersion() {
                return remoteHardVersion;
            }

            public void setRemoteHardVersion(String remoteHardVersion) {
                this.remoteHardVersion = remoteHardVersion;
            }

            public String getRemoteSoftVersion() {
                return remoteSoftVersion;
            }

            public void setRemoteSoftVersion(String remoteSoftVersion) {
                this.remoteSoftVersion = remoteSoftVersion;
            }

            public String getSensorId() {
                return sensorId;
            }

            public void setSensorId(String sensorId) {
                this.sensorId = sensorId;
            }

            public SensorsEntity getSensors() {
                return sensors;
            }

            public void setSensors(SensorsEntity sensors) {
                this.sensors = sensors;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getViewName() {
                return viewName;
            }

            public void setViewName(String viewName) {
                this.viewName = viewName;
            }

            public static class AirEntity {
                private String c6h6;
                private String ch2o;
                private String co2;
                private String createTime;
                private String humidity;
                private String name;
                private String pm25;
                private String sensorId;
                private String shareContent;
                private String temperature;
                private String voc;

                public String getC6h6() {
                    return c6h6;
                }

                public void setC6h6(String c6h6) {
                    this.c6h6 = c6h6;
                }

                public String getCh2o() {
                    return ch2o;
                }

                public void setCh2o(String ch2o) {
                    this.ch2o = ch2o;
                }

                public String getCo2() {
                    return co2;
                }

                public void setCo2(String co2) {
                    this.co2 = co2;
                }

                public String getCreateTime() {
                    return createTime;
                }

                public void setCreateTime(String createTime) {
                    this.createTime = createTime;
                }

                public String getHumidity() {
                    return humidity;
                }

                public void setHumidity(String humidity) {
                    this.humidity = humidity;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPm25() {
                    return pm25;
                }

                public void setPm25(String pm25) {
                    this.pm25 = pm25;
                }

                public String getSensorId() {
                    return sensorId;
                }

                public void setSensorId(String sensorId) {
                    this.sensorId = sensorId;
                }

                public String getShareContent() {
                    return shareContent;
                }

                public void setShareContent(String shareContent) {
                    this.shareContent = shareContent;
                }

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getVoc() {
                    return voc;
                }

                public void setVoc(String voc) {
                    this.voc = voc;
                }
            }

            public static class AlertEntity {
                private String alertStatus;
                private String alertType;
                private String alertValue;
                private String creatTime;
                private String name;
                private boolean online;
                private String sensorId;

                public String getAlertStatus() {
                    return alertStatus;
                }

                public void setAlertStatus(String alertStatus) {
                    this.alertStatus = alertStatus;
                }

                public String getAlertType() {
                    return alertType;
                }

                public void setAlertType(String alertType) {
                    this.alertType = alertType;
                }

                public String getAlertValue() {
                    return alertValue;
                }

                public void setAlertValue(String alertValue) {
                    this.alertValue = alertValue;
                }

                public String getCreatTime() {
                    return creatTime;
                }

                public void setCreatTime(String creatTime) {
                    this.creatTime = creatTime;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public boolean isOnline() {
                    return online;
                }

                public void setOnline(boolean online) {
                    this.online = online;
                }

                public String getSensorId() {
                    return sensorId;
                }

                public void setSensorId(String sensorId) {
                    this.sensorId = sensorId;
                }
            }

            public static class CtrlEntity {
            }

            public static class GasEntity {
            }

            public static class SensorsEntity {
            }
        }
    }
}
