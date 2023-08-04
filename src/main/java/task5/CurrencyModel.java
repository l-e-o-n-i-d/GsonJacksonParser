package task5;

import java.util.Date;

public class CurrencyModel {
    private String r030;
    private String txt;
    private String rate;
    private String cc;
    private Date exchangedate;

    public CurrencyModel(String r030, String txt, String rate, String cc, Date exchangedate) {
        this.r030 = r030;
        this.txt = txt;
        this.rate = rate;
        this.cc = cc;
        this.exchangedate = exchangedate;
    }

    public CurrencyModel() {
    }

    public String getR030() {
        return r030;
    }

    public void setR030(String r030) {
        this.r030 = r030;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public Date getExchangedate() {
        return exchangedate;
    }

    public void setExchangedate(Date exchangedate) {
        this.exchangedate = exchangedate;
    }


    @Override
    public String toString() {
        return "Currency{" +
                "r030='" + r030 + '\'' +
                ", txt='" + txt + '\'' +
                ", rate='" + rate + '\'' +
                ", cc='" + cc + '\'' +
                ", exchangedate=" + exchangedate +
                '}';
    }
}
