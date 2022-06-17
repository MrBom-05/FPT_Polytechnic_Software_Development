package MyJob;

import java.io.Serializable;

public class MyJob implements Serializable{
    private String nameJob;
    private String companysName;
    private int docter;
    private double income;

    public MyJob(String nameJob, String companysName, int docter, double income) {
        this.nameJob = nameJob;
        this.companysName = companysName;
        this.docter = docter;
        this.income = income;
    }

    public MyJob() {
    }

    public String getNameJob() {
        return nameJob;
    }

    public void setNameJob(String nameJob) {
        this.nameJob = nameJob;
    }

    public String getCompanysName() {
        return companysName;
    }

    public void setCompanysName(String companysName) {
        this.companysName = companysName;
    }

    public int getDocter() {
        return docter;
    }

    public void setDocter(int docter) {
        this.docter = docter;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
    
    public String getConclusion(double income){
        String Conclusion = null;
        income = getIncome();
        if(income >= 50){
            Conclusion = "Cần học tiếp";
        }
        else if(income >= 20){
            Conclusion = "Việc tốt";
        }
        else{
            Conclusion = "Chuyển ngành";
        }
        return Conclusion;
    }
}
