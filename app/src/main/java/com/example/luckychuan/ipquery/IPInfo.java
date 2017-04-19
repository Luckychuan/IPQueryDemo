package com.example.luckychuan.ipquery;

/**
 * Created by Luckychuan on 2017/4/19.
 */
public class IPInfo {

    private String code;
    private Data data;


    public class Data{
        private String country;
        private String area;
        private String region;
        private String city;
        private String isp;

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getIsp() {
            return isp;
        }

        public void setIsp(String isp) {
            this.isp = isp;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "country='" + country + '\'' +
                    ", area='" + area + '\'' +
                    ", region='" + region + '\'' +
                    ", city='" + city + '\'' +
                    ", isp='" + isp + '\'' +
                    '}';
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }
}
