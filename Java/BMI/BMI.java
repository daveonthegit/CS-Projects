package BMI;

import java.text.DecimalFormat;

public class BMI {
    DecimalFormat numberFormat = new DecimalFormat("#.00");
    public double kg;
    public double m;
    public void BMI() {
        kg = 0;
        m = 0;
    }
    public void setKg(double nKg){
        kg = nKg;
    }
    public void setM(double nM) {
        m = nM;
    }
    public String Calculate(double kg, double m) {
        return numberFormat.format(kg/(m*m));
    }
    public String Imperial(double lbs, double in) {
        kg = (lbs*0.45359237);
        m = (in*.0254);
        return Calculate(kg,m);
    }
}
