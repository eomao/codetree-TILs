import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int y, m, d;

    static boolean yoonYear(int year){
        if(year%400 == 0){
            return true;
        }else if(year%100 == 0){
            return false;
        }else if(year%4 == 0){
            return true;
        }else{
            return false;
        }

    }

    static boolean exist(int year, int month, int day){
        if(yoonYear(year)){
            if(month >= 1&& month <= 12){
                if(month == 2){
                    if(day < 30){
                        return true;
                    }
                    return false;

                }else if(month%2 == 0){
                    if(month >= 8){
                        if(day < 32){
                            return true;
                        }else{
                            return false;
                        }
                    }else{
                        if(day < 31){
                            return true;
                        }else{
                            return false;
                        }
                    }
                }else{
                    if(month <= 8){
                        if(day < 32){
                            return true;
                        }else{
                            return false;
                        }
                    }else{
                        if(day < 31){
                            return true;
                        }else{
                            return false;
                        }
                    }
                }
            }
        }else{
            if(month >= 1&& month <= 12){
                if(month == 2){
                    if(day < 30){
                        return true;
                    }
                    return false;

                }else if(month%2 == 0){
                    if(month >= 8){
                        if(day < 32){
                            return true;
                        }else{
                            return false;
                        }
                    }else{
                        if(day < 31){
                            return true;
                        }else{
                            return false;
                        }
                    }
                }else{
                    if(month <= 8){
                        if(day < 32){
                            return true;
                        }else{
                            return false;
                        }
                    }else{
                        if(day < 31){
                            return true;
                        }else{
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    static String season(int year, int month, int day){
            if(exist(year, month, day)){
                if(month < 3|| month > 11){
                    return "Winter";
                }else if(month < 6){
                    return "Spring";
                }else if(month < 9){
                    return "Summer";
                }else{
                    return "Fall";
                }
            }
            return "-1";
    }

    public static void main(String[] args) {
        y = sc.nextInt();
        m = sc.nextInt();
        d = sc.nextInt();

        System.out.print(season(y, m, d));
        
    }
}