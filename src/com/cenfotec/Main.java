package com.cenfotec;

import com.cenfotec.logica.Fecha;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        boolean exit = false;

        while(!exit){
            try {
                System.out.println(showMenu());
                System.out.println("Choose a option");
                String strOption = reader.readLine();
                int option = Integer.parseInt(strOption);
                exit = readOption(option);
            }
            catch (Exception ex){
                StringBuilder builder = new StringBuilder("An error has occurred");
                builder.append("\nMessage: " + ex.getMessage());
                ex.printStackTrace();
                System.out.println(builder.toString());
            }
        }
    }

    /**
     * Responsable de leer las opciones ingresadas por
     * el usuario.
     * @param option
     * @return
     */
    public static boolean readOption(int option) throws Exception {
        boolean exit = false;
        Fecha nDate = new Fecha();
        String str;
        int year;
        int month;
        int day;

        switch (option){
            case 1:
                System.out.println("Type a year");
                str = reader.readLine();
                year = Integer.parseInt(str);
                System.out.println("Type a month");
                str = reader.readLine();
                month = Integer.parseInt(str);
                System.out.println("Type a day");
                str = reader.readLine();
                day = Integer.parseInt(str);

                boolean isValidated = nDate.validate(year, month, day);

                if(isValidated){
                    System.out.println("The date is valid");
                }
                else {
                    System.out.println("The date is not valid");
                }
                break;
            case 2:
                System.out.println("Type a year");
                str = reader.readLine();
                year = Integer.parseInt(str);
                boolean isLeadYear = nDate.isLeapYear(year);

                if(isLeadYear){
                    System.out.println("The year " + year + " is leap.");
                }
                else{
                    System.out.println("The year " + year + " is not leap");
                }
            case 3:
                System.out.println("Type a year");
                str = reader.readLine();
                year = Integer.parseInt(str);
                System.out.println("Type a month");
                str = reader.readLine();
                month = Integer.parseInt(str);
                System.out.println("Type a day");
                str = reader.readLine();
                day = Integer.parseInt(str);

                System.out.println(nDate.nextDay(year, month, day));
                break;
            case 4:
                //week day
                break;
            default:
            case 5:
                exit = true;
                break;
        }

        return exit;
    }

    /**
     * Es resposable de mostrar las opciones del sistema.
     * @return
     */
    public static String showMenu(){
        StringBuilder builder = new StringBuilder();
        builder.append("1. Validate date \n2. Is Leap year\n3. Next day\n4. Week day\n5. Exit");
        return builder.toString();
    }
}