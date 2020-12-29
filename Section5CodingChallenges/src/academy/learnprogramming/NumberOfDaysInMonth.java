package academy.learnprogramming;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        if(year > 9999 || year < 1){
            return false;
        }
        if(year % 4 == 0 && year % 100 != 0){
            return true;
        }else if(year % 400 == 0){
            return true;
        }else{
            return false;
        }

    }
    public static int getDaysInMonth(int month, int year){
        if((month > 12 || month < 1) || (year < 1 || year > 9999)){
            return -1;
        }
        if(month == 2){
            if(isLeapYear(year)){
                return 29;
            }else{
                return 28;
            }
        }else{
            switch(month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 4: case 6: case 9: case 11:
                    return 30;
            }
        }
        return -1;
    }

}
