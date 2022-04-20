
package plan_nutririe;

import java.time.LocalDate;


public class Data { 

    private final int currentDay;
    private final int currentYear;
    private final int currentMonth;

    public Data(){
        LocalDate currentdate =LocalDate.now();  
        this.currentDay = currentdate.getDayOfMonth();
        //ziua
        this.currentYear = currentdate.getYear();
        //anul
        this.currentMonth = currentdate.getMonthValue();
        //luna 
    }
    public int getYear()
    {
        return this.currentYear;
    }
    public int getMonth()
    {
        return this.currentMonth;
    }
    
    public int getDay()
    {
        return this.currentDay;
    }
    
    
}
