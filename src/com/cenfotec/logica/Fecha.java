package com.cenfotec.logica;

public class Fecha {

    /**
     * Indica si un año es bisiesto.
     * @param year año a verificar
     * @return un boolean
     */
    public boolean isLeapYear(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    /**
     * Retorna el dia siguiente dada a la fecha ingresada.
     * @param year
     * @param month
     * @param day
     * @return
     */
    public String nextDay(int year, int month, int day){
        StringBuilder builder = new StringBuilder();
        day++;

        if(validate(year, month, day)){
            builder.append(year + "-" + month + "-" + day);
        }
        else{
            month++;
            day = 1;

            if(validate(year, month, day)){
                builder.append(year + "-" + month + "-" + day);
            }
            else{
                month = 1;
                year++;
                builder.append(year + "-" + month + "-" + day);
            }
        }

        return builder.toString();
    }

    /**
     * Dada una fecha válida, determina el día de la semana que le corresponde
     * @param year
     * @param month
     * @param day
     * @return el nombre del día de la semana
     */
    public String weekDay(int year, int month, int day){
        String weekDay = "";

        if(validate(year, month, day)){

            int dayNumber;

            if(month <= 2) {
                year--;
            }

            dayNumber = (day + (int)(2.6 * ((month - 2 + 12) % 12) - 0.2) + (5 * (year % 4) + 4 *(year % 100) + 6 * (year % 400))) % 7;

            switch (dayNumber) {
                case 0:
                    weekDay = "Domingo";
                    break;

                case 1:
                    weekDay = "Lunes";
                    break;

                case 2:
                    weekDay = "Martes";
                    break;

                case 3:
                    weekDay = "Miércoles";
                    break;

                case 4:
                    weekDay = "Jueves";
                    break;

                case 5:
                    weekDay = "Viernes";
                    break;

                case 6:
                    weekDay = "Sábado";
                    break;
            }

        } else {
            return "Fecha inválida";
        }

        return weekDay;
    }

    /**
     * Indica si la fecha recibida es valida: día menor o igual que 31, mes
     * menor o igual que 12, año mayor o igual que 1582, combinación
     * correcta de día y mes (febrero 28 ó 29 máximo, abril 30 máximo.)
     *
     * @param year
     * @param month
     * @param day
     * @return
     */
    public boolean validate(int year, int month, int day) {
        boolean isValidate = false;

        if (year >= 1582) {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                isValidate = day >= 1 && day <= 30;
            }

            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                isValidate = day >= 1 && day <= 31;
            }

            if (month == 2) {

                if (this.isLeapYear(year)) {
                    isValidate = day >= 1 && day <= 29;
                } else {
                    isValidate = day >= 1 && day <= 28;
                }

            }
        }

        return isValidate;
    }
}
